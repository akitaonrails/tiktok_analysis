package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I67, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I67 implements InterfaceC1587906Jp {
    public final C0I6V LL;
    public final boolean LLILLJJLI;

    public C0I67() {
        this((C0I68) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0I67)) {
            return false;
        }
        C0I67 c0i67 = (C0I67) obj;
        return Intrinsics.LJFF(this.LL, c0i67.LL) && this.LLILLJJLI == c0i67.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryReactionUIState(reaction=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isAnimate=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0I67(C0I68 c0i68, int i) {
        this((C0I6V) ((i & 1) != 0 ? C0I68.LIZ : c0i68), false);
    }

    public C0I67(C0I6V c0i6v, boolean z) {
        this.LL = c0i6v;
        this.LLILLJJLI = z;
    }
}
