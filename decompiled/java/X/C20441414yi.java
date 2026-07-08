package X;

/* JADX INFO: renamed from: X.14yi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20441414yi extends AbstractC20027713Xv {
    public final String LLILLL;

    @Override // X.AbstractC20027713Xv
    public String getType() {
        return this.LLILLL;
    }

    public C20441414yi(String str) {
        this(str, null);
    }

    public C20441414yi(String str, CharSequence charSequence) {
        super(str, charSequence);
        this.LLILLL = str;
        if (getType().length() > 0) {
            return;
        }
        "type must not be empty".toString();
        throw new IllegalArgumentException("type must not be empty");
    }
}
