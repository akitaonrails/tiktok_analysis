package X;

import com.ss.android.ugc.aweme.feed.model.ExposedCommentInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RZV, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RZV implements InterfaceC0148002o {
    public final C291001Au<EnumC708390RqX> LL;
    public final ExposedCommentInfo LLILLJJLI;

    public C0RZV() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0RZV)) {
            return false;
        }
        C0RZV c0rzv = (C0RZV) obj;
        return Intrinsics.LJFF(this.LL, c0rzv.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0rzv.LLILLJJLI);
    }

    public final int hashCode() {
        C291001Au<EnumC708390RqX> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        ExposedCommentInfo exposedCommentInfo = this.LLILLJJLI;
        return iHashCode + (exposedCommentInfo != null ? exposedCommentInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExposedCommentVMState(showExposedComment=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", exposedComment=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0RZV(C291001Au<? extends EnumC708390RqX> c291001Au, ExposedCommentInfo exposedCommentInfo) {
        this.LL = c291001Au;
        this.LLILLJJLI = exposedCommentInfo;
    }
}
