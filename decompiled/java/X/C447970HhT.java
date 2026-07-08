package X;

import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HhT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C447970HhT {
    public final C448010HhX LIZ;
    public final List<StickerItem> LIZIZ;
    public final C448000HhW LIZJ;
    public final C448000HhW LIZLLL;
    public final boolean LJ;
    public final C447990HhV LJFF;
    public final C447990HhV LJI;
    public final boolean LJII;

    public C447970HhT() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C447970HhT)) {
            return false;
        }
        C447970HhT c447970HhT = (C447970HhT) obj;
        return Intrinsics.LJFF(this.LIZ, c447970HhT.LIZ) && Intrinsics.LJFF(this.LIZIZ, c447970HhT.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c447970HhT.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c447970HhT.LIZLLL) && this.LJ == c447970HhT.LJ && Intrinsics.LJFF(this.LJFF, c447970HhT.LJFF) && Intrinsics.LJFF(this.LJI, c447970HhT.LJI) && this.LJII == c447970HhT.LJII;
    }

    public final int hashCode() {
        C448010HhX c448010HhX = this.LIZ;
        return ((((((((((((((c448010HhX == null ? 0 : c448010HhX.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + C786410Ut5.Z2(this.LJII);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VisibilityDataState(typingRecommendation=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", defaultStickers=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", photoCommentState=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", cachedPhotoCommentState=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", hasPhotoCommentCandidate=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", replyState=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", cachedReplyState=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", hasReplyCandidate=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C447970HhT(int i) {
        this(null, C13BV.INSTANCE, new C448000HhW(null, false, 15), new C448000HhW(null, false, 15), false, new C447990HhV(0), new C447990HhV(0), false);
    }

    public C447970HhT(C448010HhX c448010HhX, List<StickerItem> list, C448000HhW c448000HhW, C448000HhW c448000HhW2, boolean z, C447990HhV c447990HhV, C447990HhV c447990HhV2, boolean z2) {
        this.LIZ = c448010HhX;
        this.LIZIZ = list;
        this.LIZJ = c448000HhW;
        this.LIZLLL = c448000HhW2;
        this.LJ = z;
        this.LJFF = c447990HhV;
        this.LJI = c447990HhV2;
        this.LJII = z2;
    }

    public static C447970HhT LIZ(C447970HhT c447970HhT, C448010HhX c448010HhX, List list, C448000HhW c448000HhW, C448000HhW c448000HhW2, boolean z, C447990HhV c447990HhV, C447990HhV c447990HhV2, boolean z2, int i) {
        boolean z3 = z2;
        C447990HhV c447990HhV3 = c447990HhV2;
        C447990HhV c447990HhV4 = c447990HhV;
        boolean z4 = z;
        C448000HhW c448000HhW3 = c448000HhW2;
        C448000HhW c448000HhW4 = c448000HhW;
        List list2 = list;
        C448010HhX c448010HhX2 = c448010HhX;
        if ((i & 1) != 0) {
            c448010HhX2 = c447970HhT.LIZ;
        }
        if ((i & 2) != 0) {
            list2 = c447970HhT.LIZIZ;
        }
        if ((i & 4) != 0) {
            c448000HhW4 = c447970HhT.LIZJ;
        }
        if ((i & 8) != 0) {
            c448000HhW3 = c447970HhT.LIZLLL;
        }
        if ((i & 16) != 0) {
            z4 = c447970HhT.LJ;
        }
        if ((i & 32) != 0) {
            c447990HhV4 = c447970HhT.LJFF;
        }
        if ((i & 64) != 0) {
            c447990HhV3 = c447970HhT.LJI;
        }
        if ((i & 128) != 0) {
            z3 = c447970HhT.LJII;
        }
        c447970HhT.getClass();
        return new C447970HhT(c448010HhX2, list2, c448000HhW4, c448000HhW3, z4, c447990HhV4, c447990HhV3, z3);
    }
}
