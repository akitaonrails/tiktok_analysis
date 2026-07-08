package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wU7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1782450wU7 {
    public static final C1782460wU8 Companion;
    public static final EnumC1782450wU7 INAPP;
    public static final /* synthetic */ EnumC1782450wU7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1782450wU7 SUBSCRIPTION;
    public static final EnumC1782450wU7 UNKNOWN;
    public static final EnumC1782450wU7 WEB_INAPP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1782450wU7> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1782450wU7 enumC1782450wU7 = new EnumC1782450wU7("INAPP", 0, "inapp");
        INAPP = enumC1782450wU7;
        EnumC1782450wU7 enumC1782450wU72 = new EnumC1782450wU7("SUBSCRIPTION", 1, "subs");
        SUBSCRIPTION = enumC1782450wU72;
        EnumC1782450wU7 enumC1782450wU73 = new EnumC1782450wU7("WEB_INAPP", 2, "web_consumable");
        WEB_INAPP = enumC1782450wU73;
        EnumC1782450wU7 enumC1782450wU74 = new EnumC1782450wU7("UNKNOWN", 3, "");
        UNKNOWN = enumC1782450wU74;
        EnumC1782450wU7[] enumC1782450wU7Arr = {enumC1782450wU7, enumC1782450wU72, enumC1782450wU73, enumC1782450wU74};
        LLILLJJLI = enumC1782450wU7Arr;
        LLILLL = new C2254308sP(enumC1782450wU7Arr);
        Companion = new C1782460wU8();
    }

    public static EnumC1782450wU7[] values() {
        return (EnumC1782450wU7[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1782450wU7 valueOf(String str) {
        return (EnumC1782450wU7) C08FF.LIZ(EnumC1782450wU7.class, str);
    }

    public EnumC1782450wU7(String str, int i, String str2) {
        this.LL = str2;
    }
}
