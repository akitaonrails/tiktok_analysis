package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008B, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C008B {
    public static final C008B CODE_BLOCK;
    public static final /* synthetic */ C008B[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C008B TABLE_BLOCK;

    public static InterfaceC2044707zh<C008B> getEntries() {
        return LLILLJJLI;
    }

    static {
        C008B c008b = new C008B("CODE_BLOCK", 0);
        CODE_BLOCK = c008b;
        C008B c008b2 = new C008B("TABLE_BLOCK", 1);
        TABLE_BLOCK = c008b2;
        C008B[] c008bArr = {c008b, c008b2};
        LL = c008bArr;
        LLILLJJLI = new C2254308sP(c008bArr);
    }

    public static C008B[] values() {
        return (C008B[]) LL.clone();
    }

    public static C008B valueOf(String str) {
        return (C008B) C08FF.LIZ(C008B.class, str);
    }

    public C008B(String str, int i) {
    }
}
