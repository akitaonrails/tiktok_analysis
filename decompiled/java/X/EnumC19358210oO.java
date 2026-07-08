package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10oO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19358210oO {
    public static final EnumC19358210oO CLICK_GO_TO_CHAT;
    public static final EnumC19358210oO CLICK_GO_TO_SEARCH;
    public static final EnumC19358210oO CLICK_ON_MESSAGE;
    public static final EnumC19358210oO CLICK_ON_SEARCH_BAR;
    public static final EnumC19358210oO CLICK_ON_SEND;
    public static final EnumC19358210oO CLICK_ON_UNDO;
    public static final /* synthetic */ EnumC19358210oO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC19358210oO> getEntries() {
        return LLILLL;
    }

    static {
        EnumC19358210oO enumC19358210oO = new EnumC19358210oO("CLICK_ON_SEND", 0, 0);
        CLICK_ON_SEND = enumC19358210oO;
        EnumC19358210oO enumC19358210oO2 = new EnumC19358210oO("CLICK_ON_UNDO", 1, 1);
        CLICK_ON_UNDO = enumC19358210oO2;
        EnumC19358210oO enumC19358210oO3 = new EnumC19358210oO("CLICK_ON_MESSAGE", 2, 2);
        CLICK_ON_MESSAGE = enumC19358210oO3;
        EnumC19358210oO enumC19358210oO4 = new EnumC19358210oO("CLICK_ON_SEARCH_BAR", 3, 3);
        CLICK_ON_SEARCH_BAR = enumC19358210oO4;
        EnumC19358210oO enumC19358210oO5 = new EnumC19358210oO("CLICK_GO_TO_CHAT", 4, 4);
        CLICK_GO_TO_CHAT = enumC19358210oO5;
        EnumC19358210oO enumC19358210oO6 = new EnumC19358210oO("CLICK_GO_TO_SEARCH", 5, 5);
        CLICK_GO_TO_SEARCH = enumC19358210oO6;
        EnumC19358210oO[] enumC19358210oOArr = {enumC19358210oO, enumC19358210oO2, enumC19358210oO3, enumC19358210oO4, enumC19358210oO5, enumC19358210oO6};
        LLILLJJLI = enumC19358210oOArr;
        LLILLL = new C2254308sP(enumC19358210oOArr);
    }

    public static EnumC19358210oO[] values() {
        return (EnumC19358210oO[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC19358210oO valueOf(String str) {
        return (EnumC19358210oO) C08FF.LIZ(EnumC19358210oO.class, str);
    }

    public EnumC19358210oO(String str, int i, int i2) {
        this.LL = i2;
    }
}
