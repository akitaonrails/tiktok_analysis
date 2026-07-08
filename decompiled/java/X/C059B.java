package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.059B, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C059B {
    public static final C059B BACK_FROM_FOLLOW_LIST;
    public static final C059B BACK_FROM_PROFILE_PAGE;
    public static final C059B FOLLOW_STATUS_CHANGE;
    public static final /* synthetic */ C059B[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final C059B SERVER_TRIGGER;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<C059B> getEntries() {
        return LLILZ;
    }

    static {
        C059B c059b = new C059B("SERVER_TRIGGER", 0, -1, "server_trigger");
        SERVER_TRIGGER = c059b;
        C059B c059b2 = new C059B("FOLLOW_STATUS_CHANGE", 1, 0, "follow_status_change");
        FOLLOW_STATUS_CHANGE = c059b2;
        C059B c059b3 = new C059B("BACK_FROM_FOLLOW_LIST", 2, 2, "back_from_follow_list");
        BACK_FROM_FOLLOW_LIST = c059b3;
        C059B c059b4 = new C059B("BACK_FROM_PROFILE_PAGE", 3, 1, "back_from_profile_page");
        BACK_FROM_PROFILE_PAGE = c059b4;
        C059B[] c059bArr = {c059b, c059b2, c059b3, c059b4};
        LLILLL = c059bArr;
        LLILZ = new C2254308sP(c059bArr);
    }

    public static C059B[] values() {
        return (C059B[]) LLILLL.clone();
    }

    public final String getEventField() {
        return this.LLILLJJLI;
    }

    public final int getValue() {
        return this.LL;
    }

    public static C059B valueOf(String str) {
        return (C059B) C08FF.LIZ(C059B.class, str);
    }

    public C059B(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
