package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uBu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1694280uBu implements InterfaceC1694390uC5 {
    public final C1692220u8a LIZ;
    public final int LIZIZ;

    public final int hashCode() {
        return (this.LIZ.LLILLJJLI.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SetComposingTextCommand(text='");
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
        int i2 = -1;
        if (i != -1) {
            c1694290uBv.LJ(i, c1694290uBv.LJ, this.LIZ.LLILLJJLI);
            if (this.LIZ.LLILLJJLI.length() > 0) {
                c1694290uBv.LJFF(i, this.LIZ.LLILLJJLI.length() + i);
            }
        } else {
            int i3 = c1694290uBv.LIZIZ;
            c1694290uBv.LJ(i3, c1694290uBv.LIZJ, this.LIZ.LLILLJJLI);
            if (this.LIZ.LLILLJJLI.length() > 0) {
                c1694290uBv.LJFF(i3, this.LIZ.LLILLJJLI.length() + i3);
            }
        }
        int i4 = c1694290uBv.LIZIZ;
        int i5 = c1694290uBv.LIZJ;
        if (i4 == i5) {
            i2 = i5;
        }
        int i6 = this.LIZIZ;
        int i7 = i2 + i6;
        if (i6 > 0) {
            length = i7 - 1;
        } else {
            length = i7 - this.LIZ.LLILLJJLI.length();
        }
        int iLJ = C13LZ.LJ(length, 0, c1694290uBv.LIZLLL());
        c1694290uBv.LJI(iLJ, iLJ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1694280uBu)) {
            return false;
        }
        C1694280uBu c1694280uBu = (C1694280uBu) obj;
        if (Intrinsics.LJFF(this.LIZ.LLILLJJLI, c1694280uBu.LIZ.LLILLJJLI) && this.LIZIZ == c1694280uBu.LIZIZ) {
            return true;
        }
        return false;
    }

    public C1694280uBu(String str, int i) {
        this.LIZ = new C1692220u8a(str);
        this.LIZIZ = i;
    }
}
