package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.ss.android.ugc.aweme.aigc.aiplayground.IAIPlaygroundMobService;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGenerationType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIPlaygroundChipsModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0FOt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C389450FOt {
    public final LifecycleCoroutineScope LIZ;
    public final List<String> LIZIZ = C1697810uHb.LJIILJJIL("i2v", "t2v");
    public final InterfaceC1635410sex LIZJ = C1633850scR.LIZ(C0CHQ.LIZ, null);
    public final HashMap<String, ArrayList<AIPlaygroundChipsModel>> LIZLLL = new HashMap<>();

    public C389450FOt(LifecycleCoroutineScope lifecycleCoroutineScope) {
        this.LIZ = lifecycleCoroutineScope;
    }

    public static String LIZ(AIGenerationType aIGenerationType) {
        int i = C389430FOr.LIZ[aIGenerationType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "";
                }
                return "t2v";
            }
            return "i2v";
        }
        return "transition";
    }

    public static void LIZIZ(long j, String str, boolean z) {
        IAIPlaygroundMobService iAIPlaygroundMobServiceLIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        IAIPlaygroundMobService iAIPlaygroundMobServiceLIZ2 = C07OF.LIZ();
        if (iAIPlaygroundMobServiceLIZ2 != null && (iAIPlaygroundMobServiceLIZ = C07OF.LIZ()) != null) {
            iAIPlaygroundMobServiceLIZ.LJIIJ((int) (jCurrentTimeMillis - j), "success", str, iAIPlaygroundMobServiceLIZ2.LIZ(z));
        }
    }

    public static void LIZJ(long j, String str, boolean z, boolean z2) {
        String str2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        IAIPlaygroundMobService iAIPlaygroundMobServiceLIZ = C07OF.LIZ();
        if (iAIPlaygroundMobServiceLIZ == null) {
            return;
        }
        int i = (int) (jCurrentTimeMillis - j);
        if (z) {
            str2 = "success";
        } else {
            str2 = "fail";
        }
        iAIPlaygroundMobServiceLIZ.LJIIJJI(i, str2, str, iAIPlaygroundMobServiceLIZ.LIZ(z2));
    }
}
