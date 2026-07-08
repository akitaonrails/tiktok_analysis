package X;

import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ICx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C462810ICx implements C0ZR4 {
    public final C0IB0 LL;
    public final C462620ICe LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C462810ICx)) {
            return false;
        }
        C462810ICx c462810ICx = (C462810ICx) obj;
        return Intrinsics.LJFF(this.LL, c462810ICx.LL) && Intrinsics.LJFF(this.LLILLJJLI, c462810ICx.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AwemeCardAssemDataReceive(skeletonLayoutData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", backgroundConfig=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0ZR4
    public final AwemeCardTemplate getContent() {
        return C462830ICz.LIZIZ(this);
    }

    @Override // X.C0ZR4
    public final C462620ICe LIZJ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC461380I7k
    public final C0IB0 LLILII() {
        return this.LL;
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
        return C462830ICz.LIZ(this, interfaceC1891350zJl);
    }

    public C462810ICx(C462620ICe c462620ICe, C0IB0 c0ib0) {
        this.LL = c0ib0;
        this.LLILLJJLI = c462620ICe;
    }
}
