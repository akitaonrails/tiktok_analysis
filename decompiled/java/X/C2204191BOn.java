package X;

/* JADX INFO: renamed from: X.1BOn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2204191BOn extends RuntimeException {
    public final int LL;

    public C2204191BOn() {
        this("");
    }

    public int getCode() {
        return this.LL;
    }

    public C2204191BOn(int i) {
        this(i, "");
    }

    public C2204191BOn(String str) {
        this(0, str);
    }

    public C2204191BOn(int i, String str) {
        super(str);
        this.LL = i;
    }
}
