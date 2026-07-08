package X;

import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HhR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C447950HhR implements InterfaceC447930HhP {
    public final List<StickerItem> LIZ;
    public final C447990HhV LIZIZ;
    public final boolean LIZJ;
    public final C448000HhW LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C447950HhR)) {
            return false;
        }
        C447950HhR c447950HhR = (C447950HhR) obj;
        return Intrinsics.LJFF(this.LIZ, c447950HhR.LIZ) && Intrinsics.LJFF(this.LIZIZ, c447950HhR.LIZIZ) && this.LIZJ == c447950HhR.LIZJ && Intrinsics.LJFF(this.LIZLLL, c447950HhR.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DefaultAndReplyDataChanged(defaultStickers=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", replyState=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hasReplyCandidate=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", photoCommentState=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C447950HhR(List<StickerItem> list, C447990HhV c447990HhV, boolean z, C448000HhW c448000HhW) {
        this.LIZ = list;
        this.LIZIZ = c447990HhV;
        this.LIZJ = z;
        this.LIZLLL = c448000HhW;
    }
}
