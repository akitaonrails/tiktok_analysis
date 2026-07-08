package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0be4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC981380be4 {
    public static final EnumC981380be4 CANCEL_BUTTON;
    public static final C981390be5 Companion;
    public static final EnumC981380be4 HOSTS_LIST_CHANGED;
    public static final /* synthetic */ EnumC981380be4[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC981380be4 MIC_ROOM_START;
    public static final EnumC981380be4 TIME_OUT;

    public static InterfaceC2044707zh<EnumC981380be4> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC981380be4 enumC981380be4 = new EnumC981380be4("CANCEL_BUTTON", 0);
        CANCEL_BUTTON = enumC981380be4;
        EnumC981380be4 enumC981380be42 = new EnumC981380be4("HOSTS_LIST_CHANGED", 1);
        HOSTS_LIST_CHANGED = enumC981380be42;
        EnumC981380be4 enumC981380be43 = new EnumC981380be4("MIC_ROOM_START", 2);
        MIC_ROOM_START = enumC981380be43;
        EnumC981380be4 enumC981380be44 = new EnumC981380be4("TIME_OUT", 3);
        TIME_OUT = enumC981380be44;
        EnumC981380be4[] enumC981380be4Arr = {enumC981380be4, enumC981380be42, enumC981380be43, enumC981380be44};
        LL = enumC981380be4Arr;
        LLILLJJLI = new C2254308sP(enumC981380be4Arr);
        Companion = new C981390be5();
    }

    public static EnumC981380be4[] values() {
        return (EnumC981380be4[]) LL.clone();
    }

    public static EnumC981380be4 valueOf(String str) {
        return (EnumC981380be4) C08FF.LIZ(EnumC981380be4.class, str);
    }

    public EnumC981380be4(String str, int i) {
    }
}
