package X;

/* JADX INFO: renamed from: X.13EK, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13EK implements CharSequence {
    public final char[] LL;
    public int LLILLJJLI;

    @Override // java.lang.CharSequence
    public final String toString() {
        int i = this.LLILLJJLI;
        char[] cArr = this.LL;
        int iMin = Math.min(i, i);
        C19973713Db c19973713Db = AbstractC19974313Dh.LL;
        int length = cArr.length;
        c19973713Db.getClass();
        C19973713Db.LIZ(0, iMin, length);
        return new String(cArr, 0, iMin);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return this.LLILLJJLI;
    }

    public C13EK(char[] cArr) {
        this.LL = cArr;
        this.LLILLJJLI = cArr.length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.LL[i];
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        char[] cArr = this.LL;
        int iMin = Math.min(i2, this.LLILLJJLI);
        C19973713Db c19973713Db = AbstractC19974313Dh.LL;
        int length = cArr.length;
        c19973713Db.getClass();
        C19973713Db.LIZ(i, iMin, length);
        return new String(cArr, i, iMin - i);
    }
}
