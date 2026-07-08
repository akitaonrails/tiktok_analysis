package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0R21, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R21 {
    public static final /* synthetic */ C0R21[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0R21 MALL_NEW_USER;
    public static final C0R21 NEW_USER;
    public static final C0R21 OLD_USER;
    public static final C0R21 UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<C0R21> getEntries() {
        return LLILLL;
    }

    static {
        C0R21 c0r21 = new C0R21("NEW_USER", 0, "new_user");
        NEW_USER = c0r21;
        C0R21 c0r212 = new C0R21("OLD_USER", 1, "old_user");
        OLD_USER = c0r212;
        C0R21 c0r213 = new C0R21("MALL_NEW_USER", 2, "mall_new_user");
        MALL_NEW_USER = c0r213;
        C0R21 c0r214 = new C0R21("UNKNOWN", 3, "unknown");
        UNKNOWN = c0r214;
        C0R21[] c0r21Arr = {c0r21, c0r212, c0r213, c0r214};
        LLILLJJLI = c0r21Arr;
        LLILLL = new C2254308sP(c0r21Arr);
    }

    public static C0R21[] values() {
        return (C0R21[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0R21 valueOf(String str) {
        return (C0R21) C08FF.LIZ(C0R21.class, str);
    }

    public C0R21(String str, int i, String str2) {
        this.LL = str2;
    }
}
