package X;

import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCCreationModel;
import java.util.List;

/* JADX INFO: renamed from: X.0LcL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C546710LcL {
    public static final Source LIZ(AIGCCreationModel aIGCCreationModel) {
        if (aIGCCreationModel == null) {
            return Source.AI_THEATER;
        }
        Source sourceLIZ = C542730LQh.LIZ(aIGCCreationModel.SN().getSource());
        if (sourceLIZ == null) {
            return Source.AI_THEATER;
        }
        return sourceLIZ;
    }

    public static final boolean LIZIZ(AIGCCreationModel aIGCCreationModel, List<String> list) {
        String str = (String) C13LP.LJJJLL(aIGCCreationModel.ZG().getResults());
        if (!C546670LcH.LIZJ(aIGCCreationModel.ZG()) || str == null) {
            return false;
        }
        if (!list.contains(str)) {
            if (list.isEmpty()) {
                return false;
            }
            for (String str2 : list) {
                C2471909mP c2471909mP = C2471909mP.LIZ;
                C0VSJ c0vsjLJJIJLIJ = c2471909mP.LJJIJLIJ(str2);
                C0VSJ c0vsjLJJIJLIJ2 = c2471909mP.LJJIJLIJ(str);
                if (c0vsjLJJIJLIJ == null || c0vsjLJJIJLIJ2 == null || c0vsjLJJIJLIJ.length() != c0vsjLJJIJLIJ2.length()) {
                }
            }
            return false;
        }
        return true;
    }
}
