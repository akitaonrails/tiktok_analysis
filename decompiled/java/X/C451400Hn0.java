package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hn0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C451400Hn0 implements InterfaceC0148002o {
    public final C291001Au<String> LL;
    public final C291001Au<Boolean> LLILLJJLI;

    public C451400Hn0() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C451400Hn0)) {
            return false;
        }
        C451400Hn0 c451400Hn0 = (C451400Hn0) obj;
        return Intrinsics.LJFF(this.LL, c451400Hn0.LL) && Intrinsics.LJFF(this.LLILLJJLI, c451400Hn0.LLILLJJLI);
    }

    public final int hashCode() {
        C291001Au<String> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<Boolean> c291001Au2 = this.LLILLJJLI;
        return iHashCode + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SmallEmojiPageVMState(inputEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", emojiPanelOpenEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C451400Hn0(C291001Au<String> c291001Au, C291001Au<Boolean> c291001Au2) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
    }
}
