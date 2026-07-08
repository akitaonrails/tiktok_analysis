package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.favorites.experiment.CollaborativeCollectionConfig;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: renamed from: X.0gb7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1171750gb7 {
    public static final CollaborativeCollectionConfig LIZ = new CollaborativeCollectionConfig(0, 0, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 0, 0, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(704));

    public static boolean LIZ() {
        CollaborativeCollectionConfig collaborativeCollectionConfigLIZJ;
        return (!((Boolean) LIZIZ.getValue()).booleanValue() || (collaborativeCollectionConfigLIZJ = LIZJ()) == null || collaborativeCollectionConfigLIZJ.isOffline) ? false : true;
    }

    public static CollaborativeCollectionConfig LIZJ() {
        return (CollaborativeCollectionConfig) C0C64.LJIILLIIL().LJJII(CollaborativeCollectionConfig.class, LIZ, "collaborative_collection_config", true);
    }

    public static boolean LIZIZ(boolean z) {
        CollaborativeCollectionConfig collaborativeCollectionConfigLIZJ;
        if (!((Boolean) LIZIZ.getValue()).booleanValue() || (collaborativeCollectionConfigLIZJ = LIZJ()) == null || collaborativeCollectionConfigLIZJ.isOffline || z) {
            return false;
        }
        return true;
    }
}
