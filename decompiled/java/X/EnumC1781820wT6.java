package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wT6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1781820wT6 {
    public static final EnumC1781820wT6 ALL;
    public static final EnumC1781820wT6 CHAT_ROOM;
    public static final EnumC1781820wT6 INBOX_TAB;
    public static final /* synthetic */ EnumC1781820wT6[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1781820wT6> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1781820wT6 enumC1781820wT6 = new EnumC1781820wT6("ALL", 0, 0);
        ALL = enumC1781820wT6;
        EnumC1781820wT6 enumC1781820wT62 = new EnumC1781820wT6("CHAT_ROOM", 1, 1);
        CHAT_ROOM = enumC1781820wT62;
        EnumC1781820wT6 enumC1781820wT63 = new EnumC1781820wT6("INBOX_TAB", 2, 2);
        INBOX_TAB = enumC1781820wT63;
        EnumC1781820wT6[] enumC1781820wT6Arr = {enumC1781820wT6, enumC1781820wT62, enumC1781820wT63};
        LLILLJJLI = enumC1781820wT6Arr;
        LLILLL = new C2254308sP(enumC1781820wT6Arr);
    }

    public static EnumC1781820wT6[] values() {
        return (EnumC1781820wT6[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1781820wT6 valueOf(String str) {
        return (EnumC1781820wT6) C08FF.LIZ(EnumC1781820wT6.class, str);
    }

    public EnumC1781820wT6(String str, int i, int i2) {
        this.LL = i2;
    }
}
