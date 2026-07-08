package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15NG, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15NG {
    public static final C15NG BLOCK_RELATION;
    public static final C15NG BLOCK_SELF_REMOVAL;
    public static final /* synthetic */ C15NG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C15NG PASS;
    public static final C15NG PRIVACY_SETTING;
    public final int LL;

    public static InterfaceC2044707zh<C15NG> getEntries() {
        return LLILLL;
    }

    static {
        C15NG c15ng = new C15NG("PASS", 0, 0);
        PASS = c15ng;
        C15NG c15ng2 = new C15NG("PRIVACY_SETTING", 1, 1);
        PRIVACY_SETTING = c15ng2;
        C15NG c15ng3 = new C15NG("BLOCK_RELATION", 2, 2);
        BLOCK_RELATION = c15ng3;
        C15NG c15ng4 = new C15NG("BLOCK_SELF_REMOVAL", 3, 3);
        BLOCK_SELF_REMOVAL = c15ng4;
        C15NG[] c15ngArr = {c15ng, c15ng2, c15ng3, c15ng4};
        LLILLJJLI = c15ngArr;
        LLILLL = new C2254308sP(c15ngArr);
    }

    public static C15NG[] values() {
        return (C15NG[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C15NG valueOf(String str) {
        return (C15NG) C08FF.LIZ(C15NG.class, str);
    }

    public C15NG(String str, int i, int i2) {
        this.LL = i2;
    }
}
