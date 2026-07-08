package X;

/* JADX INFO: renamed from: X.14yj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20441514yj extends AbstractC20027713Xv {
    public static final C20441614yk Companion = new C20441614yk();
    public final String LLILLL;

    public static final AbstractC20027713Xv createFrom(String str, String str2) {
        Companion.getClass();
        return C20441614yk.LIZ(str, str2);
    }

    @Override // X.AbstractC20027713Xv
    public String getType() {
        return this.LLILLL;
    }

    public C20441514yj(String str) {
        this(str, null);
    }

    public C20441514yj(String str, CharSequence charSequence) {
        super(str, charSequence);
        this.LLILLL = str;
        if (getType().length() > 0) {
            return;
        }
        "type must not be empty".toString();
        throw new IllegalArgumentException("type must not be empty");
    }
}
