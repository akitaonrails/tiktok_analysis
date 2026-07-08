package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Wo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1876407Wo implements InterfaceC1891350zJl {
    public final InterfaceC444050Hb9 LL;

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1876407Wo) && Intrinsics.LJFF(this.LL, ((C1876407Wo) obj).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BasicFavouriteStickerPageItem(emojiType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1876407Wo(InterfaceC444050Hb9 interfaceC444050Hb9) {
        this.LL = interfaceC444050Hb9;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C1876407Wo;
    }
}
