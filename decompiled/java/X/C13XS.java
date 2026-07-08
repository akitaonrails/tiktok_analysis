package X;

/* JADX INFO: renamed from: X.13XS, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C13XS extends Exception {
    public final String LL;
    public final CharSequence LLILLJJLI;

    public CharSequence getErrorMessage() {
        return this.LLILLJJLI;
    }

    public String getType() {
        return this.LL;
    }

    public C13XS(String str) {
        this(str, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C13XS(String str, CharSequence charSequence) {
        String string;
        if (charSequence != null) {
            string = charSequence.toString();
        } else {
            string = null;
        }
        super(string);
        this.LL = str;
        this.LLILLJJLI = charSequence;
    }
}
