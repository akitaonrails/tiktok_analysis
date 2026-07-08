package X;

import android.media.AudioManager;
import com.ss.android.ugc.aweme.IAccountUserService;

/* JADX INFO: renamed from: X.0cl6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1024180cl6 {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C1024200cl8());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1024190cl7());
    public static final AudioManager LIZJ;

    static {
        C844470XAv.LIZ.getClass();
        Object objH2 = C786410Ut5.H2(C844470XAv.LIZ(), "audio");
        LIZJ = objH2 instanceof AudioManager ? (AudioManager) objH2 : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float LIZ() {
        /*
            android.media.AudioManager r1 = X.C1024180cl6.LIZJ     // Catch: java.lang.Exception -> Lc
            if (r1 == 0) goto L13
            r0 = 3
            int r1 = r1.getStreamVolume(r0)     // Catch: java.lang.Exception -> Lc
            if (r1 <= 0) goto L13
            goto L15
        Lc:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C1AF0.LJ(r0)
        L13:
            r1 = 0
            goto L30
        L15:
            X.01GW r2 = X.C1024180cl6.LIZIZ
            java.lang.Object r0 = r2.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 <= 0) goto L13
            float r1 = (float) r1
            java.lang.Object r0 = r2.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            float r0 = (float) r0
            float r1 = r1 / r0
        L30:
            r0 = 1000(0x3e8, float:1.401E-42)
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (int) r1
            float r1 = (float) r0
            r0 = 981668463(0x3a83126f, float:0.001)
            float r1 = r1 * r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1024180cl6.LIZ():float");
    }

    public static final String LIZIZ() {
        return ((IAccountUserService) LIZ.getValue()).getCurUserId();
    }
}
