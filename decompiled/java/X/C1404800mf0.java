package X;

import android.os.StatFs;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0mf0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1404800mf0 {
    public static C1404650mel LIZ;

    public static float LIZ() throws Throwable {
        long jLLFFF;
        String str = C1449640npK.LIZ;
        try {
            jLLFFF = C2204961BRm.LLFFF(new StatFs(C1449640npK.LIZ), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhr8rKm5grAP792IujUzLI+OY=", null));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            jLLFFF = 0;
        }
        float f = jLLFFF;
        float f2 = 1024L;
        return (f / f2) / f2;
    }

    public static final void LIZIZ(String str) {
        if (str == null) {
            return;
        }
        C1404650mel c1404650mel = new C1404650mel(str, EnumC2007207te.Draft);
        LIZ = c1404650mel;
        c1404650mel.LIZJ = LIZ();
    }
}
