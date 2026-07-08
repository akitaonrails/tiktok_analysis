package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZnN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C910270ZnN extends C910260ZnM {
    public final String LLILZLL;
    public final C909930Zmp LLIZ;
    public final C1622006Ws<C01GW<List<C18VI>>> LLIZLLLIL;
    public final boolean LLJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C910270ZnN)) {
            return false;
        }
        C910270ZnN c910270ZnN = (C910270ZnN) obj;
        return Intrinsics.LJFF(this.LLILZLL, c910270ZnN.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c910270ZnN.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c910270ZnN.LLIZLLLIL) && this.LLJ == c910270ZnN.LLJ;
    }

    public final int hashCode() {
        int iHashCode = this.LLILZLL.hashCode() * 31;
        C909930Zmp c909930Zmp = this.LLIZ;
        int iHashCode2 = (iHashCode + (c909930Zmp == null ? 0 : c909930Zmp.hashCode())) * 31;
        this.LLIZLLLIL.getClass();
        return (iHashCode2 * 31) + C786410Ut5.Z2(this.LLJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGenImagesItem(uuid=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", actions=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", isGenerating=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C910260ZnM
    public final C1622006Ws<C01GW<List<C18VI>>> LIZIZ() {
        return this.LLIZLLLIL;
    }

    @Override // X.C910260ZnM
    public final C909930Zmp LIZLLL() {
        return this.LLIZ;
    }

    @Override // X.C910260ZnM
    public final String LJI() {
        return this.LLILZLL;
    }

    @Override // X.C910260ZnM, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C910270ZnN) || !areItemTheSame(interfaceC1891350zJl) || this.LLJ != ((C910270ZnN) interfaceC1891350zJl).LLJ) {
            return false;
        }
        return true;
    }

    @Override // X.C910260ZnM, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C910270ZnN)) {
            return false;
        }
        return super.areItemTheSame(interfaceC1891350zJl);
    }

    public C910270ZnN(String str, C909930Zmp c909930Zmp, C1622006Ws<C01GW<List<C18VI>>> c1622006Ws, boolean z) {
        super(str, C18VH.START, null, 12);
        this.LLILZLL = str;
        this.LLIZ = c909930Zmp;
        this.LLIZLLLIL = c1622006Ws;
        this.LLJ = z;
    }
}
