package X;

/* JADX INFO: renamed from: X.14z0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20443214z0 extends AbstractC20027413Xs {
    public static final C20443314z1 Companion = new C20443314z1();
    public final String LLILLL;

    public static final AbstractC20027413Xs createFrom(String str, String str2) {
        Companion.getClass();
        return C20443314z1.LIZ(str, str2);
    }

    @Override // X.AbstractC20027413Xs
    public String getType() {
        return this.LLILLL;
    }

    public C20443214z0(String str) {
        this(str, null);
    }

    public C20443214z0(String str, CharSequence charSequence) {
        super(str, charSequence);
        this.LLILLL = str;
        if (getType().length() > 0) {
            return;
        }
        "type must not be empty".toString();
        throw new IllegalArgumentException("type must not be empty");
    }
}
