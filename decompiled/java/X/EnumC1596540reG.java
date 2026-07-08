package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0reG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1596540reG {
    public static final EnumC1596540reG FOLLOW_TAB;
    public static final EnumC1596540reG FRIENDS_TAB;
    public static final EnumC1596540reG FYP_TAB;
    public static final EnumC1596540reG GROUP_CHAT;
    public static final EnumC1596540reG GUIDE_CARD;
    public static final EnumC1596540reG INBOX_TAB;
    public static final /* synthetic */ EnumC1596540reG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1596540reG UNDEFINED;
    public final long LL;

    public static InterfaceC2044707zh<EnumC1596540reG> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1596540reG enumC1596540reG = new EnumC1596540reG("UNDEFINED", 0, 0L);
        UNDEFINED = enumC1596540reG;
        EnumC1596540reG enumC1596540reG2 = new EnumC1596540reG("INBOX_TAB", 1, 1L);
        INBOX_TAB = enumC1596540reG2;
        EnumC1596540reG enumC1596540reG3 = new EnumC1596540reG("FRIENDS_TAB", 2, 2L);
        FRIENDS_TAB = enumC1596540reG3;
        EnumC1596540reG enumC1596540reG4 = new EnumC1596540reG("FOLLOW_TAB", 3, 3L);
        FOLLOW_TAB = enumC1596540reG4;
        EnumC1596540reG enumC1596540reG5 = new EnumC1596540reG("GUIDE_CARD", 4, 4L);
        GUIDE_CARD = enumC1596540reG5;
        EnumC1596540reG enumC1596540reG6 = new EnumC1596540reG("FYP_TAB", 5, 5L);
        FYP_TAB = enumC1596540reG6;
        EnumC1596540reG enumC1596540reG7 = new EnumC1596540reG("GROUP_CHAT", 6, 7L);
        GROUP_CHAT = enumC1596540reG7;
        EnumC1596540reG[] enumC1596540reGArr = {enumC1596540reG, enumC1596540reG2, enumC1596540reG3, enumC1596540reG4, enumC1596540reG5, enumC1596540reG6, enumC1596540reG7};
        LLILLJJLI = enumC1596540reGArr;
        LLILLL = new C2254308sP(enumC1596540reGArr);
    }

    public static EnumC1596540reG[] values() {
        return (EnumC1596540reG[]) LLILLJJLI.clone();
    }

    public final long getValue() {
        return this.LL;
    }

    public static EnumC1596540reG valueOf(String str) {
        return (EnumC1596540reG) C08FF.LIZ(EnumC1596540reG.class, str);
    }

    public EnumC1596540reG(String str, int i, long j) {
        this.LL = j;
    }
}
