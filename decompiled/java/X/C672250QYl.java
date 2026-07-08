package X;

import com.ss.android.ugc.aweme.ab.EcSearchMiddleAIConfigModel;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0QYl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C672250QYl {
    public static final EcSearchMiddleAIConfigModel LIZ = new EcSearchMiddleAIConfigModel(0, 0, 0, 0, -1, 0, 0.05f, 0.5f, 0.1f);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(42));

    public static EcSearchMiddleAIConfigModel LIZJ() {
        return (EcSearchMiddleAIConfigModel) LIZIZ.getValue();
    }

    public static boolean LIZLLL() {
        return LIZJ().voiceInputEnable == 1;
    }

    public static boolean LIZIZ(C0QER c0qer) {
        ECSearchEntranceData ecSearchEntranceData;
        if (c0qer != null && C650500PfM.LIZJ(c0qer) && (ecSearchEntranceData = c0qer.getEcSearchEntranceData()) != null && !ecSearchEntranceData.getBooleanStrategy("disable_ai_search") && LIZJ().enableFloatEntrance == 1) {
            return true;
        }
        return false;
    }

    public static boolean LIZ(C0QER c0qer, boolean z) {
        ECSearchEntranceData ecSearchEntranceData;
        if (c0qer == null || !C650500PfM.LIZJ(c0qer) || (ecSearchEntranceData = c0qer.getEcSearchEntranceData()) == null || ecSearchEntranceData.getBooleanStrategy("disable_ai_search") || LIZJ().enable != 1) {
            return false;
        }
        if (z && LIZJ().simpleTabEnable != 1) {
            return false;
        }
        return true;
    }
}
