package X;

/* JADX INFO: renamed from: X.1DcR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2259651DcR {
    public final int LIZ;
    public int LIZIZ;

    public final String toString() {
        C2259641DcQ c2259641DcQ = new C2259641DcQ(16);
        c2259641DcQ.LIZ('[');
        c2259641DcQ.LIZIZ(Integer.toString(0));
        c2259641DcQ.LIZ('>');
        c2259641DcQ.LIZIZ(Integer.toString(this.LIZIZ));
        c2259641DcQ.LIZ('>');
        c2259641DcQ.LIZIZ(Integer.toString(this.LIZ));
        c2259641DcQ.LIZ(']');
        return c2259641DcQ.toString();
    }

    public C2259651DcR(int i) {
        if (i >= 0) {
            this.LIZ = i;
            this.LIZIZ = 0;
            return;
        }
        throw new IndexOutOfBoundsException("Lower bound cannot be greater then upper bound");
    }

    public final void LIZ(int i) {
        if (i >= 0) {
            if (i <= this.LIZ) {
                this.LIZIZ = i;
                return;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IndexOutOfBoundsException();
    }
}
