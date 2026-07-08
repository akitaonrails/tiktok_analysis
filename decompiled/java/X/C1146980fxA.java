package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.data.TPClickableText;
import webcast.data.TouchPointBackground;

/* JADX INFO: renamed from: X.0fxA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1146980fxA implements InterfaceC1891350zJl {
    public final long LL;
    public final TouchPointBackground LLILLJJLI;
    public final TPClickableText LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1146980fxA)) {
            return false;
        }
        C1146980fxA c1146980fxA = (C1146980fxA) obj;
        return this.LL == c1146980fxA.LL && Intrinsics.LJFF(this.LLILLJJLI, c1146980fxA.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1146980fxA.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iY2 = C786410Ut5.Y2(this.LL) * 31;
        TouchPointBackground touchPointBackground = this.LLILLJJLI;
        int iHashCode = (iY2 + (touchPointBackground == null ? 0 : touchPointBackground.hashCode())) * 31;
        TPClickableText tPClickableText = this.LLILLL;
        return iHashCode + (tPClickableText != null ? tPClickableText.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SendGiftModel(giftId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", background=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", button=");
        sbLIZ.append(this.LLILLL);
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

    public C1146980fxA(long j, TouchPointBackground touchPointBackground, TPClickableText tPClickableText) {
        this.LL = j;
        this.LLILLJJLI = touchPointBackground;
        this.LLILLL = tPClickableText;
    }
}
