package X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;

/* JADX INFO: renamed from: X.0NEU, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NEU {
    public static String LIZ;
    public static C0VSJ LIZJ;
    public static final Object LIZIZ = new Object();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C590510NEb());

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long LIZ() {
        /*
            X.01GW r0 = X.C279820Axw.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L14
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r0
        L14:
            java.lang.String r2 = "key_expire_time"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r2)
            if (r0 == 0) goto L3a
            X.0NDs r0 = X.C590420NDs.LIZ
            r0.getClass()
            com.bytedance.keva.Keva r0 = X.C590420NDs.LJI()
            r1 = 0
            int r0 = r0.getInt(r2, r1)
            if (r0 <= 0) goto L3a
            com.bytedance.keva.Keva r0 = X.C590420NDs.LJI()
            int r0 = r0.getInt(r2, r1)
        L34:
            long r2 = (long) r0
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            long r2 = r2 * r0
            return r2
        L3a:
            X.01GW r0 = X.C0NEU.LIZLLL
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NEU.LIZ():long");
    }

    public static C0VSJ LIZIZ() {
        C844470XAv.LIZ.getClass();
        if (C844470XAv.LIZ() == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZJ());
        String str = File.separator;
        sbLIZ.append(str);
        sbLIZ.append("feedCache");
        sbLIZ.append(str);
        sbLIZ.append("feed.pb");
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (c0vsj.exists()) {
            return c0vsj;
        }
        return null;
    }

    public static String LIZJ() {
        String string;
        C0VSJ c0vsj;
        if (((Boolean) C0A86.LIZ.getValue()).booleanValue() && !C07MO.LIZ()) {
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            try {
                int i = Build.VERSION.SDK_INT;
                if (26 <= i && i < 35) {
                    i = 1;
                }
                if (i == 0) {
                    return C786410Ut5.w2(contextLIZ).getAbsolutePath();
                }
                synchronized (LIZIZ) {
                    try {
                        if (LIZJ == null) {
                            LIZJ = new C0VSJ(contextLIZ.getApplicationInfo().dataDir, "cache");
                        }
                        c0vsj = LIZJ;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return (c0vsj == null || !c0vsj.exists()) ? C786410Ut5.w2(contextLIZ).getAbsolutePath() : c0vsj.getAbsolutePath();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return C786410Ut5.w2(contextLIZ).getAbsolutePath();
            }
        }
        if (!((Boolean) C0A84.LIZ.getValue()).booleanValue()) {
            if (C07MO.LIZ()) {
                C590420NDs.LIZ.getClass();
                Keva kevaLJI = C590420NDs.LJI();
                if ((kevaLJI != null ? kevaLJI.getInt("key_ready_new_cache_path", 0) : 0) == 1) {
                    return C0NFP.LJI();
                }
            }
            return C0NFP.LJII();
        }
        if (!TextUtils.isEmpty(LIZ)) {
            return LIZ;
        }
        try {
            C590420NDs.LIZ.getClass();
            string = C590420NDs.LJI().getString("key_cache_path", "");
            LIZ = string;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C844470XAv.LIZ.getClass();
            File fileW2 = C786410Ut5.w2(C844470XAv.LIZ());
            LIZ = fileW2 != null ? fileW2.getAbsolutePath() : null;
        }
        if (!TextUtils.isEmpty(string)) {
            return LIZ;
        }
        C844470XAv.LIZ.getClass();
        File fileW22 = C786410Ut5.w2(C844470XAv.LIZ());
        String absolutePath = fileW22 != null ? fileW22.getAbsolutePath() : null;
        LIZ = absolutePath;
        if (!TextUtils.isEmpty(absolutePath)) {
            C590420NDs.LJI().storeString("key_cache_path", String.valueOf(LIZ));
        }
        return LIZ;
    }
}
