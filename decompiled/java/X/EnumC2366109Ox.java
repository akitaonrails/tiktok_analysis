package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.09Ox, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2366109Ox {
    public static final EnumC2366109Ox CURSOR_WINDOW_ALLOCATION;
    public static final EnumC2366109Ox DEAD_SYSTEM;
    public static final /* synthetic */ EnumC2366109Ox[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2366109Ox NONE;
    public static final EnumC2366109Ox OOM_FRESCO;
    public static final EnumC2366109Ox OOM_JAVA;
    public static final EnumC2366109Ox OOM_OTHERS;
    public static final EnumC2366109Ox TRANSACTION_TOO_LARGE;

    public static InterfaceC2044707zh<EnumC2366109Ox> getEntries() {
        return LLILLJJLI;
    }

    public static EnumC2366109Ox valueOf(String str) {
        return (EnumC2366109Ox) C08FF.LIZ(EnumC2366109Ox.class, str);
    }

    public static EnumC2366109Ox[] values() {
        return (EnumC2366109Ox[]) LL.clone();
    }

    static {
        EnumC2366109Ox enumC2366109Ox = new EnumC2366109Ox("NONE", 0);
        NONE = enumC2366109Ox;
        EnumC2366109Ox enumC2366109Ox2 = new EnumC2366109Ox("OOM_FRESCO", 1);
        OOM_FRESCO = enumC2366109Ox2;
        EnumC2366109Ox enumC2366109Ox3 = new EnumC2366109Ox("OOM_JAVA", 2);
        OOM_JAVA = enumC2366109Ox3;
        EnumC2366109Ox enumC2366109Ox4 = new EnumC2366109Ox("OOM_OTHERS", 3);
        OOM_OTHERS = enumC2366109Ox4;
        EnumC2366109Ox enumC2366109Ox5 = new EnumC2366109Ox("TRANSACTION_TOO_LARGE", 4);
        TRANSACTION_TOO_LARGE = enumC2366109Ox5;
        EnumC2366109Ox enumC2366109Ox6 = new EnumC2366109Ox("DEAD_SYSTEM", 5);
        DEAD_SYSTEM = enumC2366109Ox6;
        EnumC2366109Ox enumC2366109Ox7 = new EnumC2366109Ox("CURSOR_WINDOW_ALLOCATION", 6);
        CURSOR_WINDOW_ALLOCATION = enumC2366109Ox7;
        EnumC2366109Ox[] enumC2366109OxArr = {enumC2366109Ox, enumC2366109Ox2, enumC2366109Ox3, enumC2366109Ox4, enumC2366109Ox5, enumC2366109Ox6, enumC2366109Ox7};
        LL = enumC2366109OxArr;
        LLILLJJLI = new C2254308sP(enumC2366109OxArr);
    }

    public final boolean isOom() {
        int i = C09P2.LIZ[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }

    public EnumC2366109Ox(String str, int i) {
    }
}
