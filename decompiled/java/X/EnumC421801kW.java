package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.01kW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC421801kW {
    public static final EnumC421801kW BOTTOM_BUTTON;
    public static final /* synthetic */ EnumC421801kW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC421801kW OTHER;

    public static InterfaceC2044707zh<EnumC421801kW> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC421801kW enumC421801kW = new EnumC421801kW("OTHER", 0);
        OTHER = enumC421801kW;
        EnumC421801kW enumC421801kW2 = new EnumC421801kW("BOTTOM_BUTTON", 1);
        BOTTOM_BUTTON = enumC421801kW2;
        EnumC421801kW[] enumC421801kWArr = {enumC421801kW, enumC421801kW2};
        LL = enumC421801kWArr;
        LLILLJJLI = new C2254308sP(enumC421801kWArr);
    }

    public static EnumC421801kW[] values() {
        return (EnumC421801kW[]) LL.clone();
    }

    public static EnumC421801kW valueOf(String str) {
        return (EnumC421801kW) C08FF.LIZ(EnumC421801kW.class, str);
    }

    public EnumC421801kW(String str, int i) {
    }
}
