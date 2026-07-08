package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cqB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1027330cqB {
    public static final EnumC1027330cqB APP2APP;
    public static final EnumC1027330cqB CALENDAR;
    public static final EnumC1027330cqB CLIPBOARD;
    public static final /* synthetic */ EnumC1027330cqB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1027330cqB NETWORK;
    public static final EnumC1027330cqB SENSOR;
    public static final EnumC1027330cqB SMS;
    public static final EnumC1027330cqB WEBJUMP;

    public static InterfaceC2044707zh<EnumC1027330cqB> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1027330cqB enumC1027330cqB = new EnumC1027330cqB("NETWORK", 0);
        NETWORK = enumC1027330cqB;
        EnumC1027330cqB enumC1027330cqB2 = new EnumC1027330cqB("WEBJUMP", 1);
        WEBJUMP = enumC1027330cqB2;
        EnumC1027330cqB enumC1027330cqB3 = new EnumC1027330cqB("APP2APP", 2);
        APP2APP = enumC1027330cqB3;
        EnumC1027330cqB enumC1027330cqB4 = new EnumC1027330cqB("CALENDAR", 3);
        CALENDAR = enumC1027330cqB4;
        EnumC1027330cqB enumC1027330cqB5 = new EnumC1027330cqB("CLIPBOARD", 4);
        CLIPBOARD = enumC1027330cqB5;
        EnumC1027330cqB enumC1027330cqB6 = new EnumC1027330cqB("SENSOR", 5);
        SENSOR = enumC1027330cqB6;
        EnumC1027330cqB enumC1027330cqB7 = new EnumC1027330cqB("SMS", 6);
        SMS = enumC1027330cqB7;
        EnumC1027330cqB[] enumC1027330cqBArr = {enumC1027330cqB, enumC1027330cqB2, enumC1027330cqB3, enumC1027330cqB4, enumC1027330cqB5, enumC1027330cqB6, enumC1027330cqB7};
        LL = enumC1027330cqBArr;
        LLILLJJLI = new C2254308sP(enumC1027330cqBArr);
    }

    public static EnumC1027330cqB[] values() {
        return (EnumC1027330cqB[]) LL.clone();
    }

    public static EnumC1027330cqB valueOf(String str) {
        return (EnumC1027330cqB) C08FF.LIZ(EnumC1027330cqB.class, str);
    }

    public EnumC1027330cqB(String str, int i) {
    }
}
