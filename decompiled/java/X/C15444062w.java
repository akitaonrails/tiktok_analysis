package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* JADX INFO: renamed from: X.062w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15444062w {
    public static String LIZ() {
        try {
            C844470XAv.LIZ.getClass();
            AdvertisingIdClient.Info infoLIZIZ = C837870Wtt.LIZIZ(C844470XAv.LIZ());
            if (infoLIZIZ != null) {
                String strLLLLLIL = C2204961BRm.LLLLLIL(infoLIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnupb+tR5LcXjP8vk4QjMthFDVkN/Nv0WS3N3A==", null));
                if (strLLLLLIL != null) {
                    return strLLLLLIL;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        return "";
    }
}
