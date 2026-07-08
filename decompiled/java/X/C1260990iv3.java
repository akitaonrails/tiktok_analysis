package X;

import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iv3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1260990iv3 {
    public static final String LIZ(C1261860iwS c1261860iwS) {
        String str = "";
        if (C304890BxH.LIZIZ() && c1261860iwS.isRelatedRec()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            String uid = c1261860iwS.getUid();
            if (uid != null) {
                str = uid;
            }
            sbLIZ.append(str);
            sbLIZ.append("_recmore");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        String uid2 = c1261860iwS.getUid();
        if (uid2 == null) {
            return "";
        }
        return uid2;
    }

    public static final int LIZIZ(C1261860iwS c1261860iwS) {
        C1261000iv4 c1261000iv4;
        AbstractC1261010iv5 from = c1261860iwS.getFrom();
        if ((from instanceof C1261000iv4) && (c1261000iv4 = (C1261000iv4) from) != null) {
            return c1261000iv4.getIterateCnt();
        }
        return 0;
    }

    public static final boolean LIZJ(C1261860iwS c1261860iwS) {
        boolean zLJFF;
        C1261000iv4 c1261000iv4;
        MatchedFriendStruct matchedFriendStruct = c1261860iwS.getMatchedFriendStruct();
        if (matchedFriendStruct != null) {
            zLJFF = Intrinsics.LJFF(matchedFriendStruct.isNewMaF(), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        if (!zLJFF) {
            AbstractC1261010iv5 from = c1261860iwS.getFrom();
            if (!(from instanceof C1261000iv4) || (c1261000iv4 = (C1261000iv4) from) == null || !c1261000iv4.getFromNewMaf()) {
                return false;
            }
        }
        return true;
    }
}
