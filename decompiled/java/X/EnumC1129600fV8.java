package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fV8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1129600fV8 {
    public static final EnumC1129600fV8 EXTERNAL_UPDATE;
    public static final EnumC1129600fV8 INITIAL;
    public static final /* synthetic */ EnumC1129600fV8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1129600fV8 OPEN;
    public static final EnumC1129600fV8 REFRESH;
    public static final EnumC1129600fV8 RETRY;
    public static final EnumC1129600fV8 TAB_SWITCH;

    public static InterfaceC2044707zh<EnumC1129600fV8> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1129600fV8 enumC1129600fV8 = new EnumC1129600fV8("INITIAL", 0);
        INITIAL = enumC1129600fV8;
        EnumC1129600fV8 enumC1129600fV82 = new EnumC1129600fV8("OPEN", 1);
        OPEN = enumC1129600fV82;
        EnumC1129600fV8 enumC1129600fV83 = new EnumC1129600fV8("REFRESH", 2);
        REFRESH = enumC1129600fV83;
        EnumC1129600fV8 enumC1129600fV84 = new EnumC1129600fV8("RETRY", 3);
        RETRY = enumC1129600fV84;
        EnumC1129600fV8 enumC1129600fV85 = new EnumC1129600fV8("EXTERNAL_UPDATE", 4);
        EXTERNAL_UPDATE = enumC1129600fV85;
        EnumC1129600fV8 enumC1129600fV86 = new EnumC1129600fV8("TAB_SWITCH", 5);
        TAB_SWITCH = enumC1129600fV86;
        EnumC1129600fV8[] enumC1129600fV8Arr = {enumC1129600fV8, enumC1129600fV82, enumC1129600fV83, enumC1129600fV84, enumC1129600fV85, enumC1129600fV86};
        LL = enumC1129600fV8Arr;
        LLILLJJLI = new C2254308sP(enumC1129600fV8Arr);
    }

    public static EnumC1129600fV8[] values() {
        return (EnumC1129600fV8[]) LL.clone();
    }

    public static EnumC1129600fV8 valueOf(String str) {
        return (EnumC1129600fV8) C08FF.LIZ(EnumC1129600fV8.class, str);
    }

    public EnumC1129600fV8(String str, int i) {
    }
}
