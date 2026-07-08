package X;

/* JADX INFO: renamed from: X.13aW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20036613aW implements CharSequence {
    public final CharSequence LL;
    public final int LLILLJJLI;
    public final int LLILLL;

    public final int hashCode() {
        int i = this.LLILLL - this.LLILLJJLI;
        int iCharAt = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iCharAt = (iCharAt * 31) + charAt(i2);
        }
        return iCharAt;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.LLILLL - this.LLILLJJLI;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.LL.subSequence(this.LLILLJJLI, this.LLILLL).toString();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i >= 0) {
            int i2 = this.LLILLL;
            int i3 = this.LLILLJJLI;
            if (i < i2 - i3) {
                return this.LL.charAt(i3 + i);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Index ");
        sbLIZ.append(i);
        sbLIZ.append(" out of bounds for length ");
        sbLIZ.append(this.LLILLL - this.LLILLJJLI);
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CharSequence)) {
            return false;
        }
        CharSequence charSequence = (CharSequence) obj;
        if (this.LLILLL - this.LLILLJJLI != charSequence.length()) {
            return false;
        }
        int i = this.LLILLL - this.LLILLJJLI;
        for (int i2 = 0; i2 < i; i2++) {
            if (charAt(i2) != charSequence.charAt(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i >= 0) {
            int i3 = this.LLILLL;
            int i4 = this.LLILLJJLI;
            if (i2 <= i3 - i4 && i <= i2) {
                return new C20036613aW(i + i4, i4 + i2, this.LL);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Invalid subSequence indices: startIndex=");
        sbLIZ.append(i);
        sbLIZ.append(", endIndex=");
        sbLIZ.append(i2);
        sbLIZ.append(", length=");
        sbLIZ.append(this.LLILLL - this.LLILLJJLI);
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public C20036613aW(int i, int i2, CharSequence charSequence) {
        this.LL = charSequence;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        if (i >= 0 && i2 <= charSequence.length() && i <= i2) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Invalid start/end indices: start=");
        sbLIZ.append(i);
        sbLIZ.append(", end=");
        sbLIZ.append(i2);
        sbLIZ.append(", base.length=");
        sbLIZ.append(charSequence.length());
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
