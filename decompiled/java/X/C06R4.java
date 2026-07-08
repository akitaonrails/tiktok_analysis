package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06R4, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06R4 {
    public static final C06R4 CANCEL_GENERATION;
    public static final C06R4 CLICK_QUOTA_BUTTON;
    public static final C06R4 DELETE_SYSTEM_CONTENT;
    public static final C06R4 DELETE_USER_CONTENT;
    public static final /* synthetic */ C06R4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C06R4 RETRY_GENERATION;
    public final int LL;

    public static InterfaceC2044707zh<C06R4> getEntries() {
        return LLILLL;
    }

    static {
        C06R4 c06r4 = new C06R4("DELETE_USER_CONTENT", 0, 1);
        DELETE_USER_CONTENT = c06r4;
        C06R4 c06r42 = new C06R4("DELETE_SYSTEM_CONTENT", 1, 2);
        DELETE_SYSTEM_CONTENT = c06r42;
        C06R4 c06r43 = new C06R4("CANCEL_GENERATION", 2, 3);
        CANCEL_GENERATION = c06r43;
        C06R4 c06r44 = new C06R4("RETRY_GENERATION", 3, 4);
        RETRY_GENERATION = c06r44;
        C06R4 c06r45 = new C06R4("CLICK_QUOTA_BUTTON", 4, 5);
        CLICK_QUOTA_BUTTON = c06r45;
        C06R4[] c06r4Arr = {c06r4, c06r42, c06r43, c06r44, c06r45};
        LLILLJJLI = c06r4Arr;
        LLILLL = new C2254308sP(c06r4Arr);
    }

    public static C06R4[] values() {
        return (C06R4[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C06R4 valueOf(String str) {
        return (C06R4) C08FF.LIZ(C06R4.class, str);
    }

    public C06R4(String str, int i, int i2) {
        this.LL = i2;
    }
}
