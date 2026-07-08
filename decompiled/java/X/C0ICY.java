package X;

import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ICY, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0ICY implements C0ICT {
    public final C462620ICe LL;
    public final C0IB0 LLILLJJLI;
    public final C0ICW LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ICY)) {
            return false;
        }
        C0ICY c0icy = (C0ICY) obj;
        return Intrinsics.LJFF(this.LL, c0icy.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0icy.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0icy.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoreStickerCardSendSkeletonLayoutPowerItem(backgroundConfig=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", skeletonLayoutData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", storeStickerInfoState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0ICT
    public final StickerTemplate getContent() {
        return C0ICU.LIZIZ(this);
    }

    @Override // X.C0ICT
    public final C462620ICe LIZJ() {
        return this.LL;
    }

    @Override // X.C0ICT
    public final C0ICW LJJLL() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC461380I7k
    public final C0IB0 LLILII() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C461450I7r.LIZ(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C0ICU.LIZ(this, interfaceC1891350zJl);
    }

    public C0ICY(C462620ICe c462620ICe, C0IB0 c0ib0, C0ICW c0icw) {
        this.LL = c462620ICe;
        this.LLILLJJLI = c0ib0;
        this.LLILLL = c0icw;
    }
}
