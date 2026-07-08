package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TJV, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TJV {
    public static final /* synthetic */ C0TJV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0TJV USER_BAN_ACCESSORY;
    public static final C0TJV USER_BAN_BUTTON;
    public static final C0TJV USER_BAN_CONTENT_LINK;
    public final String LL;

    public static InterfaceC2044707zh<C0TJV> getEntries() {
        return LLILLL;
    }

    static {
        C0TJV c0tjv = new C0TJV("USER_BAN_CONTENT_LINK", 0, "text_link");
        USER_BAN_CONTENT_LINK = c0tjv;
        C0TJV c0tjv2 = new C0TJV("USER_BAN_BUTTON", 1, "button");
        USER_BAN_BUTTON = c0tjv2;
        C0TJV c0tjv3 = new C0TJV("USER_BAN_ACCESSORY", 2, "accessory_link");
        USER_BAN_ACCESSORY = c0tjv3;
        C0TJV[] c0tjvArr = {c0tjv, c0tjv2, c0tjv3};
        LLILLJJLI = c0tjvArr;
        LLILLL = new C2254308sP(c0tjvArr);
    }

    public static C0TJV[] values() {
        return (C0TJV[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0TJV valueOf(String str) {
        return (C0TJV) C08FF.LIZ(C0TJV.class, str);
    }

    public C0TJV(String str, int i, String str2) {
        this.LL = str2;
    }
}
