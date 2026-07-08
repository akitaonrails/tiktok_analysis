package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06Mw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1596406Mw {
    public static final EnumC1596406Mw CAN_BE_OVERRIDDEN;
    public static final EnumC1596406Mw CAN_OVERRIDE_OTHERS;
    public static final /* synthetic */ EnumC1596406Mw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1596406Mw NONE;

    public static InterfaceC2044707zh<EnumC1596406Mw> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1596406Mw enumC1596406Mw = new EnumC1596406Mw("CAN_OVERRIDE_OTHERS", 0);
        CAN_OVERRIDE_OTHERS = enumC1596406Mw;
        EnumC1596406Mw enumC1596406Mw2 = new EnumC1596406Mw("CAN_BE_OVERRIDDEN", 1);
        CAN_BE_OVERRIDDEN = enumC1596406Mw2;
        EnumC1596406Mw enumC1596406Mw3 = new EnumC1596406Mw("NONE", 2);
        NONE = enumC1596406Mw3;
        EnumC1596406Mw[] enumC1596406MwArr = {enumC1596406Mw, enumC1596406Mw2, enumC1596406Mw3};
        LL = enumC1596406MwArr;
        LLILLJJLI = new C2254308sP(enumC1596406MwArr);
    }

    public static EnumC1596406Mw[] values() {
        return (EnumC1596406Mw[]) LL.clone();
    }

    public static EnumC1596406Mw valueOf(String str) {
        return (EnumC1596406Mw) C08FF.LIZ(EnumC1596406Mw.class, str);
    }

    public EnumC1596406Mw(String str, int i) {
    }
}
