package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lbD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1364010lbD {
    public static final EnumC1364010lbD AFTER_SEND;
    public static final /* synthetic */ EnumC1364010lbD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1364010lbD NONE;
    public static final EnumC1364010lbD SELECTED;
    public static final EnumC1364010lbD SHOW_ACTIVE;
    public static final EnumC1364010lbD UNSELECTED;

    public static InterfaceC2044707zh<EnumC1364010lbD> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1364010lbD enumC1364010lbD = new EnumC1364010lbD("NONE", 0);
        NONE = enumC1364010lbD;
        EnumC1364010lbD enumC1364010lbD2 = new EnumC1364010lbD("SELECTED", 1);
        SELECTED = enumC1364010lbD2;
        EnumC1364010lbD enumC1364010lbD3 = new EnumC1364010lbD("SHOW_ACTIVE", 2);
        SHOW_ACTIVE = enumC1364010lbD3;
        EnumC1364010lbD enumC1364010lbD4 = new EnumC1364010lbD("UNSELECTED", 3);
        UNSELECTED = enumC1364010lbD4;
        EnumC1364010lbD enumC1364010lbD5 = new EnumC1364010lbD("AFTER_SEND", 4);
        AFTER_SEND = enumC1364010lbD5;
        EnumC1364010lbD[] enumC1364010lbDArr = {enumC1364010lbD, enumC1364010lbD2, enumC1364010lbD3, enumC1364010lbD4, enumC1364010lbD5};
        LL = enumC1364010lbDArr;
        LLILLJJLI = new C2254308sP(enumC1364010lbDArr);
    }

    public static EnumC1364010lbD[] values() {
        return (EnumC1364010lbD[]) LL.clone();
    }

    public static EnumC1364010lbD valueOf(String str) {
        return (EnumC1364010lbD) C08FF.LIZ(EnumC1364010lbD.class, str);
    }

    public EnumC1364010lbD(String str, int i) {
    }
}
