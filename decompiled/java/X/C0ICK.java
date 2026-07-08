package X;

import com.ss.android.ugc.aweme.im.message.content.GifContent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ICK, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0ICK implements C0ICG {
    public final C462620ICe LL;
    public final C0IB0 LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ICK)) {
            return false;
        }
        C0ICK c0ick = (C0ICK) obj;
        return Intrinsics.LJFF(this.LL, c0ick.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0ick.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GifCardSendSkeletonLayoutPowerItem(backgroundConfig=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", skeletonLayoutData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0ICG
    public final GifContent getContent() {
        return C0ICI.LIZIZ(this);
    }

    @Override // X.C0ICG
    public final C462620ICe LIZJ() {
        return this.LL;
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
        return C0ICI.LIZ(this, interfaceC1891350zJl);
    }

    public C0ICK(C462620ICe c462620ICe, C0IB0 c0ib0) {
        this.LL = c462620ICe;
        this.LLILLJJLI = c0ib0;
    }
}
