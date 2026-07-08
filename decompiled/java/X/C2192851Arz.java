package X;

/* JADX INFO: renamed from: X.1Arz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2192851Arz {
    public final CharSequence LIZ;
    public int LIZIZ;
    public int LIZJ = -1;

    public final boolean LIZ() {
        return this.LIZ.length() > 0 && this.LIZJ < this.LIZ.length() - 1;
    }

    public final C2192841Ary LIZIZ() throws Exception {
        if (!LIZ()) {
            throw new Exception(this) { // from class: X.1As1
            };
        }
        int i = this.LIZJ;
        if (i >= this.LIZIZ) {
            if (this.LIZ.charAt(i + 1) != '-') {
                throw new Exception(this) { // from class: X.1As1
                };
            }
            if (this.LIZJ + 2 == this.LIZ.length()) {
                throw new Exception(this) { // from class: X.1As1
                };
            }
            this.LIZIZ = this.LIZJ + 2;
        }
        this.LIZJ = this.LIZIZ;
        while (this.LIZJ < this.LIZ.length() && this.LIZ.charAt(this.LIZJ) != '-') {
            this.LIZJ++;
        }
        int i2 = this.LIZJ;
        int i3 = this.LIZIZ;
        if (i2 <= i3) {
            throw new Exception(this) { // from class: X.1As1
            };
        }
        int i4 = i2 - 1;
        this.LIZJ = i4;
        return new C2192841Ary(this.LIZ, i3, i4);
    }

    public C2192851Arz(CharSequence charSequence) {
        this.LIZ = charSequence;
    }
}
