package X;

/* JADX INFO: renamed from: X.1AiI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2186841AiI implements Comparable<C2186841AiI> {
    public final int LL;
    public final int LLILLJJLI;

    public final int hashCode() {
        return (this.LL * 31) + this.LLILLJJLI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append("x");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C2186841AiI LIZJ(C2186841AiI c2186841AiI) {
        int i = this.LL;
        int i2 = c2186841AiI.LLILLJJLI;
        int i3 = i * i2;
        int i4 = c2186841AiI.LL;
        int i5 = this.LLILLJJLI;
        if (i3 <= i4 * i5) {
            return new C2186841AiI(i4, (i5 * i4) / i);
        }
        return new C2186841AiI((i * i2) / i5, i2);
    }

    public final C2186841AiI LJFF(C2186841AiI c2186841AiI) {
        int i = this.LL;
        int i2 = c2186841AiI.LLILLJJLI;
        int i3 = i * i2;
        int i4 = c2186841AiI.LL;
        int i5 = this.LLILLJJLI;
        if (i3 >= i4 * i5) {
            return new C2186841AiI(i4, (i5 * i4) / i);
        }
        return new C2186841AiI((i * i2) / i5, i2);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C2186841AiI c2186841AiI) {
        C2186841AiI c2186841AiI2 = c2186841AiI;
        int i = this.LLILLJJLI * this.LL;
        int i2 = c2186841AiI2.LLILLJJLI * c2186841AiI2.LL;
        if (i2 < i) {
            return 1;
        }
        if (i2 > i) {
            return -1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2186841AiI.class != obj.getClass()) {
            return false;
        }
        C2186841AiI c2186841AiI = (C2186841AiI) obj;
        if (this.LL == c2186841AiI.LL && this.LLILLJJLI == c2186841AiI.LLILLJJLI) {
            return true;
        }
        return false;
    }

    public C2186841AiI(int i, int i2) {
        this.LL = i;
        this.LLILLJJLI = i2;
    }
}
