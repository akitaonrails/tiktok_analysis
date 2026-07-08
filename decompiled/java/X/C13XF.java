package X;

/* JADX INFO: renamed from: X.13XF, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13XF {
    public final CharSequence LIZ;
    public final CharSequence LIZIZ;
    public final String LIZJ;

    public C13XF(CharSequence charSequence, CharSequence charSequence2, String str) {
        this.LIZ = charSequence;
        this.LIZIZ = charSequence2;
        this.LIZJ = str;
        if (((String) charSequence).length() > 0) {
            return;
        }
        "userId should not be empty".toString();
        throw new IllegalArgumentException("userId should not be empty");
    }
}
