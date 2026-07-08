package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zmq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C909940Zmq extends C910260ZnM {
    public final String LLILZLL;
    public final C18VH LLIZ;
    public final C909930Zmp LLIZLLLIL;
    public final C1622006Ws<C01GW<List<C18VI>>> LLJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C909940Zmq)) {
            return false;
        }
        C909940Zmq c909940Zmq = (C909940Zmq) obj;
        return Intrinsics.LJFF(this.LLILZLL, c909940Zmq.LLILZLL) && this.LLIZ == c909940Zmq.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c909940Zmq.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c909940Zmq.LLJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LLILZLL.hashCode() * 31) + this.LLIZ.hashCode()) * 31;
        C909930Zmp c909930Zmp = this.LLIZLLLIL;
        int iHashCode2 = (iHashCode + (c909930Zmp == null ? 0 : c909930Zmp.hashCode())) * 31;
        this.LLJ.getClass();
        return iHashCode2;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextItem(uuid=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", actions=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C910260ZnM
    public final C1622006Ws<C01GW<List<C18VI>>> LIZIZ() {
        return this.LLJ;
    }

    @Override // X.C910260ZnM
    public final C909930Zmp LIZLLL() {
        return this.LLIZLLLIL;
    }

    @Override // X.C910260ZnM
    public final C18VH LJ() {
        return this.LLIZ;
    }

    @Override // X.C910260ZnM
    public final String LJI() {
        return this.LLILZLL;
    }

    public C909940Zmq(C1622006Ws c1622006Ws, C18VH c18vh, C909930Zmp c909930Zmp, String str) {
        super(str, c18vh, c1622006Ws, 8);
        this.LLILZLL = str;
        this.LLIZ = c18vh;
        this.LLIZLLLIL = c909930Zmp;
        this.LLJ = c1622006Ws;
    }
}
