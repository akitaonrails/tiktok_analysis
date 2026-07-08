package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZnO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C910280ZnO extends C910260ZnM {
    public final String LLILZLL;
    public final String LLIZ;
    public final C1622006Ws<C01GW<List<C18VI>>> LLIZLLLIL;
    public final C909930Zmp LLJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C910280ZnO)) {
            return false;
        }
        C910280ZnO c910280ZnO = (C910280ZnO) obj;
        return Intrinsics.LJFF(this.LLILZLL, c910280ZnO.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c910280ZnO.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c910280ZnO.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c910280ZnO.LLJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LLILZLL.hashCode() * 31) + this.LLIZ.hashCode()) * 31;
        this.LLIZLLLIL.getClass();
        int i = iHashCode * 31;
        C909930Zmp c909930Zmp = this.LLJ;
        return i + (c909930Zmp != null ? c909930Zmp.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RegenerateItem(uuid=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", actions=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", message=");
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
        return this.LLJ;
    }

    @Override // X.C910260ZnM
    public final String LJI() {
        return this.LLILZLL;
    }

    @Override // X.C910260ZnM, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C910280ZnO) || !areItemTheSame(interfaceC1891350zJl) || !Intrinsics.LJFF(this.LLIZ, ((C910280ZnO) interfaceC1891350zJl).LLIZ)) {
            return false;
        }
        return true;
    }

    @Override // X.C910260ZnM, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C910280ZnO)) {
            return false;
        }
        return super.areItemTheSame(interfaceC1891350zJl);
    }

    public C910280ZnO(String str, String str2, C1622006Ws<C01GW<List<C18VI>>> c1622006Ws, C909930Zmp c909930Zmp) {
        super(str, C18VH.START, null, 12);
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = c1622006Ws;
        this.LLJ = c909930Zmp;
    }
}
