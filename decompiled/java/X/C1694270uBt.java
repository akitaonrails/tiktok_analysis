package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uBt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1694270uBt implements InterfaceC1694390uC5 {
    public final C1692220u8a LIZ;
    public final int LIZIZ;

    public final int hashCode() {
        return (this.LIZ.LLILLJJLI.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommitTextCommand(text='");
        sbLIZ.append(this.LIZ.LLILLJJLI);
        sbLIZ.append("', newCursorPosition=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1694390uC5
    public final void LIZ(C1694290uBv c1694290uBv) {
        int length;
        int i = c1694290uBv.LIZLLL;
        if (i != -1) {
            c1694290uBv.LJ(i, c1694290uBv.LJ, this.LIZ.LLILLJJLI);
        } else {
            c1694290uBv.LJ(c1694290uBv.LIZIZ, c1694290uBv.LIZJ, this.LIZ.LLILLJJLI);
        }
        int i2 = c1694290uBv.LIZIZ;
        int i3 = c1694290uBv.LIZJ;
        if (i2 != i3) {
            i3 = -1;
        }
        int i4 = this.LIZIZ;
        int i5 = i3 + i4;
        if (i4 > 0) {
            length = i5 - 1;
        } else {
            length = i5 - this.LIZ.LLILLJJLI.length();
        }
        int iLJ = C13LZ.LJ(length, 0, c1694290uBv.LIZLLL());
        c1694290uBv.LJI(iLJ, iLJ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1694270uBt)) {
            return false;
        }
        C1694270uBt c1694270uBt = (C1694270uBt) obj;
        if (Intrinsics.LJFF(this.LIZ.LLILLJJLI, c1694270uBt.LIZ.LLILLJJLI) && this.LIZIZ == c1694270uBt.LIZIZ) {
            return true;
        }
        return false;
    }

    public C1694270uBt(String str, int i) {
        this(new C1692220u8a(str), i);
    }

    public C1694270uBt(C1692220u8a c1692220u8a, int i) {
        this.LIZ = c1692220u8a;
        this.LIZIZ = i;
    }
}
