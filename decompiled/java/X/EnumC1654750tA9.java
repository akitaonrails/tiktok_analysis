package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0tA9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1654750tA9 {
    public static final /* synthetic */ EnumC1654750tA9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1654750tA9 TAB_AI;
    public static final EnumC1654750tA9 TAB_COLLECT;
    public static final EnumC1654750tA9 TAB_HOT;
    public static final EnumC1654750tA9 TAB_RECENT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1654750tA9> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1654750tA9 enumC1654750tA9 = new EnumC1654750tA9("TAB_AI", 0, "recommend");
        TAB_AI = enumC1654750tA9;
        EnumC1654750tA9 enumC1654750tA92 = new EnumC1654750tA9("TAB_COLLECT", 1, "favorite");
        TAB_COLLECT = enumC1654750tA92;
        EnumC1654750tA9 enumC1654750tA93 = new EnumC1654750tA9("TAB_RECENT", 2, "recent");
        TAB_RECENT = enumC1654750tA93;
        EnumC1654750tA9 enumC1654750tA94 = new EnumC1654750tA9("TAB_HOT", 3, "hot");
        TAB_HOT = enumC1654750tA94;
        EnumC1654750tA9[] enumC1654750tA9Arr = {enumC1654750tA9, enumC1654750tA92, enumC1654750tA93, enumC1654750tA94};
        LLILLJJLI = enumC1654750tA9Arr;
        LLILLL = new C2254308sP(enumC1654750tA9Arr);
    }

    public static EnumC1654750tA9[] values() {
        return (EnumC1654750tA9[]) LLILLJJLI.clone();
    }

    public final String getStringValue() {
        return this.LL;
    }

    public static EnumC1654750tA9 valueOf(String str) {
        return (EnumC1654750tA9) C08FF.LIZ(EnumC1654750tA9.class, str);
    }

    public EnumC1654750tA9(String str, int i, String str2) {
        this.LL = str2;
    }
}
