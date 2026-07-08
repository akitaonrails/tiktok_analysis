package X;

/* JADX INFO: renamed from: X.13Xv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC20027713Xv extends Exception {
    public final String LL;
    public final CharSequence LLILLJJLI;

    public CharSequence getErrorMessage() {
        return this.LLILLJJLI;
    }

    public String getType() {
        return this.LL;
    }

    public AbstractC20027713Xv(String str) {
        this(str, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC20027713Xv(String str, CharSequence charSequence) {
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
