package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.data.TPClickableText;
import webcast.data.TouchPointBackground;

/* JADX INFO: renamed from: X.01th, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C478701th implements InterfaceC1891350zJl {
    public final TouchPointBackground LL;
    public final TPClickableText LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C478701th)) {
            return false;
        }
        C478701th c478701th = (C478701th) obj;
        return Intrinsics.LJFF(this.LL, c478701th.LL) && Intrinsics.LJFF(this.LLILLJJLI, c478701th.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        TouchPointBackground touchPointBackground = this.LL;
        int iHashCode = (touchPointBackground == null ? 0 : touchPointBackground.hashCode()) * 31;
        TPClickableText tPClickableText = this.LLILLJJLI;
        return iHashCode + (tPClickableText != null ? tPClickableText.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NormalTextModel(background=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C478701th(TouchPointBackground touchPointBackground, TPClickableText tPClickableText) {
        this.LL = touchPointBackground;
        this.LLILLJJLI = tPClickableText;
    }
}
