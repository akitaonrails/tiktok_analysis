package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RtB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C710030RtB implements InterfaceC0148002o {
    public final C291001Au<Pair<EnumC708390RqX, Comment>> LL;

    public C710030RtB() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C710030RtB) && Intrinsics.LJFF(this.LL, ((C710030RtB) obj).LL);
    }

    public final int hashCode() {
        C291001Au<Pair<EnumC708390RqX, Comment>> c291001Au = this.LL;
        if (c291001Au == null) {
            return 0;
        }
        return c291001Au.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FypExposedCommentVMState(showExposedComment=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C710030RtB(C291001Au<? extends Pair<? extends EnumC708390RqX, ? extends Comment>> c291001Au) {
        this.LL = c291001Au;
    }
}
