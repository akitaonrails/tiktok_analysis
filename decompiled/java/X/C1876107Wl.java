package X;

import com.ss.android.ugc.aweme.giftcard.checkout.GiftCardNotifyShowItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Wl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1876107Wl implements InterfaceC1891350zJl {
    public final String LL;
    public final List<GiftCardNotifyShowItem> LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1876107Wl)) {
            return false;
        }
        C1876107Wl c1876107Wl = (C1876107Wl) obj;
        return Intrinsics.LJFF(this.LL, c1876107Wl.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1876107Wl.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SendHowItem(title=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", methods=");
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

    public C1876107Wl(String str, List<GiftCardNotifyShowItem> list) {
        this.LL = str;
        this.LLILLJJLI = list;
    }
}
