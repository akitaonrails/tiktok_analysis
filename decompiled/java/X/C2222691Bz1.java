package X;

import android.content.Context;
import android.content.res.Resources;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.1Bz1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2222691Bz1 {
    public static volatile List<String> LIZJ;
    public static final C2222691Bz1 LIZ = new C2222691Bz1();
    public static volatile String LIZIZ = "";
    public static final List<String> LIZLLL = C1697810uHb.LJIILJJIL("JP", "HK", "ID", "MO", "TW", "KR", "VN", "TH", "PH", "MY", "SG", "KH", "LA", "MM", "CN");

    static {
        SettingsManager.LIZLLL().LJIIIZ(new InterfaceC304970BxP() { // from class: X.1Bz2
            @Override // X.InterfaceC304970BxP
            public final void LIZ() {
                C2222691Bz1.LIZ.getClass();
                C2222691Bz1.LJIILIIL();
            }
        });
        HashSet hashSet = new HashSet();
        hashSet.add("EG");
        hashSet.add("SD");
        hashSet.add("DZ");
        hashSet.add("MA");
        hashSet.add("IQ");
        hashSet.add("SA");
        hashSet.add("YE");
        hashSet.add("SY");
        hashSet.add("TD");
        hashSet.add("TN");
        hashSet.add("SO");
        hashSet.add("LY");
        hashSet.add("JO");
        hashSet.add("ER");
        hashSet.add("AE");
        hashSet.add("LB");
        hashSet.add("MR");
        hashSet.add("KW");
        hashSet.add("OM");
        hashSet.add("QA");
        hashSet.add("DJ");
        hashSet.add("BH");
        hashSet.add("KM");
    }

    public static final String LIZ() {
        String str = C20250114Lj.LJ;
        if (!TextUtils.isEmpty(str)) {
            return str.toUpperCase(Locale.ROOT);
        }
        if (!TextUtils.isEmpty(LIZIZ)) {
            return LIZIZ;
        }
        LIZ.getClass();
        LJIILIIL();
        return LIZIZ;
    }

    public static final String LIZJ() {
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
        if (i18nServiceApi != null && (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) != null) {
            C844470XAv.LIZ.getClass();
            String strLJII = i18nManagerServiceApiLIZ.LJII(C844470XAv.LIZ());
            if (strLJII != null && strLJII.length() != 0) {
                return strLJII;
            }
        }
        return LJFF();
    }

    public static final String LJ() {
        String strLJIIIIZZ;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        String str = C20250114Lj.LIZIZ;
        if (!TextUtils.isEmpty(str)) {
            return str.toUpperCase(Locale.ROOT);
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) C786410Ut5.H2(contextLIZ, "phone");
            AtomicBoolean atomicBoolean = C794320VDy.LIZ;
            strLJIIIIZZ = C1300840jxK.LJIIIIZZ(telephonyManager);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strLJIIIIZZ = "";
        }
        return !TextUtils.isEmpty(strLJIIIIZZ) ? strLJIIIIZZ.toUpperCase(Locale.ROOT) : strLJIIIIZZ;
    }

    public static final String LJFF() {
        String str = C20250114Lj.LIZJ;
        if (!TextUtils.isEmpty(str)) {
            return str.toUpperCase(Locale.ROOT);
        }
        LruCache<Integer, String> lruCache = C0SRQ.LIZ;
        return C837920Wty.LIZIZ(Resources.getSystem().getConfiguration().locale);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a6 A[Catch: all -> 0x00bf, TryCatch #0 {all -> 0x00bf, blocks: (B:11:0x0022, B:13:0x0026, B:15:0x0030, B:17:0x004c, B:19:0x006d, B:20:0x0075, B:22:0x007b, B:24:0x0087, B:25:0x0091, B:27:0x00a6, B:28:0x00ac, B:29:0x00af, B:31:0x00b3), top: B:38:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJIIIIZZ() {
        /*
            X.1Bz1 r0 = X.C2222691Bz1.LIZ
            r0.getClass()
            java.util.List<java.lang.String> r0 = X.C2222691Bz1.LIZJ
            r1 = 1
            if (r0 == 0) goto L1f
            java.util.List<java.lang.String> r0 = X.C2222691Bz1.LIZJ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r0 < r1) goto L1f
            java.util.List<java.lang.String> r1 = X.C2222691Bz1.LIZJ
        L16:
            java.lang.String r0 = LIZ()
            boolean r0 = r1.contains(r0)
            return r0
        L1f:
            java.lang.Class<X.1Bz1> r4 = X.C2222691Bz1.class
            monitor-enter(r4)
            java.util.List<java.lang.String> r0 = X.C2222691Bz1.LIZJ     // Catch: java.lang.Throwable -> Lbf
            if (r0 == 0) goto L30
            java.util.List<java.lang.String> r0 = X.C2222691Bz1.LIZJ     // Catch: java.lang.Throwable -> Lbf
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> Lbf
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lbf
            if (r0 > 0) goto Lba
        L30:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lbf
            r0.<init>()     // Catch: java.lang.Throwable -> Lbf
            X.C2222691Bz1.LIZJ = r0     // Catch: java.lang.Throwable -> Lbf
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r1 = "tt_regions"
            java.lang.String r0 = ""
            r2.getClass()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r0 = com.bytedance.ies.abmock.SettingsManager.LJI(r1, r0)     // Catch: java.lang.Throwable -> Lbf
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lbf
            if (r0 != 0) goto Laf
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r1 = "tt_regions"
            java.lang.String r0 = ""
            r2.getClass()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r2 = com.bytedance.ies.abmock.SettingsManager.LJI(r1, r0)     // Catch: java.lang.Throwable -> Lbf
            kotlin.text.Regex r1 = new kotlin.text.Regex     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r0 = ","
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lbf
            r3 = 0
            java.util.List r2 = r1.split(r2, r3)     // Catch: java.lang.Throwable -> Lbf
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lbf
            if (r0 != 0) goto Lac
            int r0 = r2.size()     // Catch: java.lang.Throwable -> Lbf
            java.util.ListIterator r1 = r2.listIterator(r0)     // Catch: java.lang.Throwable -> Lbf
        L75:
            boolean r0 = r1.hasPrevious()     // Catch: java.lang.Throwable -> Lbf
            if (r0 == 0) goto Lac
            java.lang.Object r0 = r1.previous()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> Lbf
            int r0 = r0.length()     // Catch: java.lang.Throwable -> Lbf
            if (r0 == 0) goto L75
            int r0 = r1.nextIndex()     // Catch: java.lang.Throwable -> Lbf
            int r0 = r0 + 1
            java.util.List r1 = X.C13LP.LL(r2, r0)     // Catch: java.lang.Throwable -> Lbf
        L91:
            java.lang.String[] r0 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object[] r1 = r1.toArray(r0)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch: java.lang.Throwable -> Lbf
            int r0 = r1.length     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)     // Catch: java.lang.Throwable -> Lbf
            java.util.List r1 = X.C1697810uHb.LJIIJJI(r0)     // Catch: java.lang.Throwable -> Lbf
            java.util.List<java.lang.String> r0 = X.C2222691Bz1.LIZJ     // Catch: java.lang.Throwable -> Lbf
            if (r0 == 0) goto Lba
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> Lbf
            r0.addAll(r1)     // Catch: java.lang.Throwable -> Lbf
            goto Lba
        Lac:
            X.13BV r1 = X.C13BV.INSTANCE     // Catch: java.lang.Throwable -> Lbf
            goto L91
        Laf:
            java.util.List<java.lang.String> r1 = X.C2222691Bz1.LIZJ     // Catch: java.lang.Throwable -> Lbf
            if (r1 == 0) goto Lba
            java.util.List<java.lang.String> r0 = X.C2222691Bz1.LIZLLL     // Catch: java.lang.Throwable -> Lbf
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> Lbf
            r1.addAll(r0)     // Catch: java.lang.Throwable -> Lbf
        Lba:
            monitor-exit(r4)
            java.util.List<java.lang.String> r1 = X.C2222691Bz1.LIZJ
            goto L16
        Lbf:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lbf
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2222691Bz1.LJIIIIZZ():boolean");
    }

    public static final boolean LJIIIZ() {
        LruCache<Integer, String> lruCache = C0SRQ.LIZ;
        C837920Wty.LIZIZ(Locale.JAPAN);
        return u.LJIJI(C837920Wty.LIZIZ(Locale.JAPAN), LIZIZ(), true);
    }

    public static final boolean LJIIJ() {
        LruCache<Integer, String> lruCache = C0SRQ.LIZ;
        C837920Wty.LIZIZ(Locale.KOREA);
        return u.LJIJI(C837920Wty.LIZIZ(Locale.KOREA), LIZIZ(), true);
    }

    public static boolean LJIIJJI() {
        LruCache<Integer, String> lruCache = C0SRQ.LIZ;
        C837920Wty.LIZIZ(Locale.UK);
        return u.LJIJI(C837920Wty.LIZIZ(Locale.UK), LJ(), true) || u.LJIJI(C837920Wty.LIZIZ(Locale.UK), LIZIZ(), true);
    }

    public static boolean LJIIL() {
        LruCache<Integer, String> lruCache = C0SRQ.LIZ;
        Locale locale = Locale.US;
        C837920Wty.LIZIZ(locale);
        return u.LJIJI(C837920Wty.LIZIZ(locale), LJ(), true) || u.LJIJI(C837920Wty.LIZIZ(locale), LIZIZ(), true);
    }

    public static void LJIILIIL() {
        synchronized (C2222691Bz1.class) {
            try {
                if (TextUtils.isEmpty(LIZIZ)) {
                    SettingsManager.LIZLLL().getClass();
                    LIZIZ = SettingsManager.LJI("priority_region", "");
                }
                if (TextUtils.isEmpty(LIZIZ)) {
                    LIZ.getClass();
                    LIZIZ = LIZLLL();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static final String LIZIZ() {
        String strLJ = LJ();
        if (TextUtils.isEmpty(strLJ)) {
            strLJ = LJFF();
            if (TextUtils.isEmpty(strLJ)) {
                strLJ = LIZJ();
            }
        }
        if (TextUtils.isEmpty(strLJ)) {
            strLJ = "";
        }
        return strLJ.toUpperCase(Locale.ROOT);
    }

    public static String LIZLLL() {
        String strLJ = LJ();
        if (TextUtils.isEmpty(strLJ)) {
            C844470XAv.LIZ.getClass();
            String networkOperatorCode = NetworkUtils.getNetworkOperatorCode(C844470XAv.LIZ());
            String str = C20250114Lj.LIZLLL;
            if (!TextUtils.isEmpty(str)) {
                networkOperatorCode = str;
            }
            try {
                if (!TextUtils.isEmpty(networkOperatorCode) && !Intrinsics.LJFF(networkOperatorCode, "unkown") && networkOperatorCode.length() >= 3) {
                    strLJ = String.valueOf(C2280571EOh.LIZ.get(Integer.valueOf(CastIntegerProtector.parseInt(networkOperatorCode.substring(0, 3)))));
                }
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (TextUtils.isEmpty(strLJ)) {
                strLJ = LJFF();
                if (TextUtils.isEmpty(strLJ)) {
                    strLJ = LIZJ();
                }
            }
        }
        if (TextUtils.isEmpty(strLJ)) {
            strLJ = "";
        }
        return strLJ.toUpperCase(Locale.ROOT);
    }

    public static boolean LJI(Context context) {
        String strT2;
        I18nServiceApi i18nServiceApi;
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        if (context == null || (i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null)) == null || (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) == null || (strT2 = i18nManagerServiceApiLIZ.LJIJJ(context)) == null) {
            strT2 = "";
        }
        if (TextUtils.isEmpty(strT2)) {
            strT2 = C786410Ut5.t2(Locale.getDefault());
        }
        return Intrinsics.LJFF("ar", strT2);
    }

    public static boolean LJII(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return C1697810uHb.LJIILJJIL("AT", "BE", "BG", "HR", "CY", "CZ", "EE", "FI", "FR", "DE", "GR", "HU", "IE", "IT", "LV", "LT", "LU", "MT", "NL", "PL", "PT", "RO", "SK", "SI", "ES", "SE", "GB").contains(str.toUpperCase(Locale.ROOT));
    }
}
