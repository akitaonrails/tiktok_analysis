package X;

/* JADX INFO: renamed from: X.13pJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20128313pJ extends Exception {
    public C20128313pJ() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20128313pJ(String str) {
        super(str);
        C0W3J.LJFF("Detail message must not be empty", str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20128313pJ(String str, Throwable th) {
        super(str, th);
        C0W3J.LJFF("Detail message must not be empty", str);
    }
}
