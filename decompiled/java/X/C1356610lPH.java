package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: renamed from: X.0lPH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1356610lPH {
    public static final Locale LIZ;
    public static volatile SimpleDateFormat LIZIZ;
    public static final Object LIZJ;
    public static volatile SimpleDateFormat LIZLLL;
    public static final Object LJ;
    public static volatile SimpleDateFormat LJFF;
    public static final Object LJI;
    public static volatile SimpleDateFormat LJII;
    public static final Object LJIIIIZZ;

    static {
        Locale countryLocale = ((ISettingService) ServiceManager.get().getService(ISettingService.class)).getCountryLocale();
        LIZ = countryLocale;
        if (C1107804Uy.LIZ()) {
            LIZJ = new Object();
            LJ = new Object();
            LJI = new Object();
            LJIIIIZZ = new Object();
            return;
        }
        LIZIZ = new SimpleDateFormat("yyyy-MM-dd", countryLocale);
        LIZLLL = new SimpleDateFormat("MM-dd", countryLocale);
        LJFF = new SimpleDateFormat("M/d/yyyy", countryLocale);
        LJII = new SimpleDateFormat("M/d", countryLocale);
        new SimpleDateFormat("MM-dd", Locale.getDefault());
        new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
    }

    public static SimpleDateFormat LJIIIIZZ() {
        if (C1107804Uy.LIZ() && LIZIZ == null) {
            synchronized (LIZJ) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new SimpleDateFormat("yyyy-MM-dd", LIZ);
                        return LIZIZ;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public static SimpleDateFormat LJIIIZ() {
        if (C1107804Uy.LIZ() && LIZLLL == null) {
            synchronized (LJ) {
                try {
                    if (LIZLLL == null) {
                        LIZLLL = new SimpleDateFormat("MM-dd", LIZ);
                        return LIZLLL;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }

    public static SimpleDateFormat LJIIJ() {
        if (!C1107804Uy.LIZ()) {
            return LJII;
        }
        if (LJII == null) {
            synchronized (LJIIIIZZ) {
                try {
                    if (LJII == null) {
                        LJII = new SimpleDateFormat("M/d", LIZ);
                        return LJII;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJII;
    }

    public static String LIZIZ(long j) {
        SimpleDateFormat simpleDateFormat;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(6, 0);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        if (j >= calendar2.getTimeInMillis() + 86400000) {
            return LJIIJ().format(calendar.getTime());
        }
        if (C1107804Uy.LIZ() && LJFF == null) {
            synchronized (LJI) {
                try {
                    if (LJFF == null) {
                        LJFF = new SimpleDateFormat("M/d/yyyy", LIZ);
                        simpleDateFormat = LJFF;
                    } else {
                        simpleDateFormat = LJFF;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            simpleDateFormat = LJFF;
        }
        return simpleDateFormat.format(calendar.getTime());
    }

    public static String LIZ(long j, Context context) {
        if (j < 60000) {
            return context.getString(R.string.ktn);
        }
        if (j < 3600000) {
            return context.getString(2131850408, Long.valueOf(j / 60000));
        }
        if (j < 86400000) {
            return context.getString(2131850406, Long.valueOf(j / 3600000));
        }
        return context.getString(2131850404, Long.valueOf(j / 86400000));
    }

    public static String LIZJ(long j, Context context) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis() - j;
        if (timeInMillis < 60000) {
            long j2 = timeInMillis / 1000;
            Object[] objArr = new Object[1];
            if (j2 <= 0) {
                j2 = 1;
            }
            objArr[0] = Long.valueOf(j2);
            return context.getString(2131846489, objArr);
        }
        if (timeInMillis < 3600000) {
            return context.getString(2131850408, Long.valueOf(timeInMillis / 60000));
        }
        if (timeInMillis < 86400000) {
            return context.getString(2131850406, Long.valueOf(timeInMillis / 3600000));
        }
        if (timeInMillis < 604800000) {
            return context.getString(2131850404, Long.valueOf(timeInMillis / 86400000));
        }
        long j3 = timeInMillis - 604800000;
        if (j3 > 0 && j3 <= 86400000) {
            return context.getString(2131850411, 1);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(6, 0);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        if (j >= calendar2.getTimeInMillis() + 86400000) {
            return LJIIIZ().format(calendar.getTime());
        }
        return LJIIIIZZ().format(calendar.getTime());
    }

    public static String LIZLLL(long j, Context context) {
        String strLIZIZ;
        long timeInMillis = Calendar.getInstance().getTimeInMillis() - j;
        if (timeInMillis < 604800000) {
            strLIZIZ = LIZ(timeInMillis, context);
        } else {
            strLIZIZ = LIZIZ(j);
        }
        if (!TextUtils.isEmpty(strLIZIZ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" · ");
            sbLIZ.append(strLIZIZ);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return strLIZIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJ(long r13, android.content.Context r15) {
        /*
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            long r11 = r0.getTimeInMillis()
            long r11 = r11 - r13
            r9 = 86400000(0x5265c00, double:4.2687272E-316)
            int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            r1 = 1
            r7 = 0
            if (r8 < 0) goto L2a
            X.0mCo r6 = X.C1387310mCn.LIZJ()
            long r4 = r6.LIZ
            r0 = 6
            long r2 = X.C1387310mCn.LIZIZ(r0)
            long r4 = r4 - r2
            r6.LIZ = r4
            long r2 = r6.LIZIZ
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 > 0) goto L92
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 > 0) goto L92
        L2a:
            r4 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 >= 0) goto L4f
            r0 = 2131836271(0x7f113d6f, float:1.9305704E38)
            java.lang.String r2 = r15.getString(r0)
        L38:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L4e
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = " · "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
        L4e:
            return r2
        L4f:
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 >= 0) goto L67
            java.lang.Object[] r1 = new java.lang.Object[r1]
            long r11 = r11 / r4
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            r1[r7] = r0
            r0 = 2131850408(0x7f1174a8, float:1.9334377E38)
            java.lang.String r2 = r15.getString(r0, r1)
            goto L38
        L67:
            if (r8 >= 0) goto L7a
            java.lang.Object[] r1 = new java.lang.Object[r1]
            long r11 = r11 / r2
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            r1[r7] = r0
            r0 = 2131850406(0x7f1174a6, float:1.9334373E38)
            java.lang.String r2 = r15.getString(r0, r1)
            goto L38
        L7a:
            X.0mCo r0 = X.C1387310mCn.LIZJ()
            long r2 = r0.LIZIZ
            long r2 = r2 - r13
            java.lang.Object[] r1 = new java.lang.Object[r1]
            long r2 = r2 / r9
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1[r7] = r0
            r0 = 2131850404(0x7f1174a4, float:1.933437E38)
            java.lang.String r2 = r15.getString(r0, r1)
            goto L38
        L92:
            java.lang.String r2 = LIZIZ(r13)
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1356610lPH.LJ(long, android.content.Context):java.lang.String");
    }

    public static String LJFF(long j, Context context) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis() - j;
        if (timeInMillis < 604800000) {
            return LIZ(timeInMillis, context);
        }
        return LIZIZ(j);
    }

    public static String LJI(long j, Context context) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis() - j;
        if (timeInMillis <= 0) {
            return "";
        }
        if (timeInMillis < 60000) {
            long j2 = timeInMillis / 1000;
            Object[] objArr = new Object[1];
            if (j2 == 0) {
                j2 = 1;
            }
            objArr[0] = Long.valueOf(j2);
            return context.getString(2131850410, objArr);
        }
        if (timeInMillis < 3600000) {
            return context.getString(2131850409, Long.valueOf(timeInMillis / 60000));
        }
        if (timeInMillis < 86400000) {
            return context.getString(2131850407, Long.valueOf(timeInMillis / 3600000));
        }
        if (timeInMillis < 604800000) {
            return context.getString(2131850405, Long.valueOf(timeInMillis / 86400000));
        }
        long j3 = timeInMillis - 604800000;
        if (j3 > 0 && j3 <= 86400000) {
            return context.getString(2131850412, 1);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(6, 0);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        if (j >= calendar2.getTimeInMillis() + 86400000) {
            return LJIIIZ().format(calendar.getTime());
        }
        return LJIIIIZZ().format(calendar.getTime());
    }

    public static String LJII(long j, Context context) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis() - j;
        if (timeInMillis <= 0) {
            return "";
        }
        if (timeInMillis < 60000) {
            long j2 = timeInMillis / 1000;
            Object[] objArr = new Object[1];
            if (j2 == 0) {
                j2 = 1;
            }
            objArr[0] = Long.valueOf(j2);
            return context.getString(2131850410, objArr);
        }
        if (timeInMillis < 3600000) {
            return context.getString(2131850409, Long.valueOf(timeInMillis / 60000));
        }
        if (timeInMillis < 86400000) {
            return context.getString(2131850407, Long.valueOf(timeInMillis / 3600000));
        }
        if (timeInMillis < 604800000) {
            return context.getString(2131850405, Long.valueOf(timeInMillis / 86400000));
        }
        long j3 = timeInMillis - 604800000;
        if (j3 > 0 && j3 <= 86400000) {
            return context.getString(2131850412, 1);
        }
        if (C2215101Bmm.LJJ(j)) {
            return C2215181Bmu.LJIILJJIL.getValue().LIZIZ(j, Locale.getDefault());
        }
        return C2215181Bmu.LJIILL.getValue().LIZIZ(j, Locale.getDefault());
    }
}
