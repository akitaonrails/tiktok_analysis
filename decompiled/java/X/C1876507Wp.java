package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Wp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1876507Wp implements InterfaceC1891350zJl {
    public final InterfaceC444050Hb9 LL;

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1876507Wp) && Intrinsics.LJFF(this.LL, ((C1876507Wp) obj).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SystemSmallEmojiPageItem(emojiType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return this.LL.LIZJ();
    }

    public C1876507Wp(InterfaceC444050Hb9 interfaceC444050Hb9) {
        this.LL = interfaceC444050Hb9;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1876507Wp c1876507Wp;
        InterfaceC444050Hb9 interfaceC444050Hb9;
        if (interfaceC1891350zJl instanceof C1876507Wp) {
            c1876507Wp = (C1876507Wp) interfaceC1891350zJl;
        } else {
            c1876507Wp = null;
        }
        if (c1876507Wp == null || (interfaceC444050Hb9 = c1876507Wp.LL) == null || this.LL.LIZJ() != interfaceC444050Hb9.LIZJ()) {
            return false;
        }
        return true;
    }
}
