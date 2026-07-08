package X;

import com.bytedance.keva.Keva;
import java.util.Set;

/* JADX INFO: renamed from: X.0M2S, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M2S {
    public static final C0M2S LIZ = new C0M2S();
    public static final Set<String> LIZIZ = C13LQ.LJLIIL(new String[]{"clickSaveFromPublish", "clickPopupFromRecord"});

    public static Keva LIZIZ() {
        return C05J9.LIZ();
    }

    public static void LIZ(String str) {
        if (!LIZIZ().contains(str)) {
            LIZIZ().storeLong(str, 0L);
            return;
        }
        long j = LIZIZ().getLong(str, 0L);
        if (j > 0) {
            LIZIZ().storeLong(str, j - 1);
        }
    }
}
