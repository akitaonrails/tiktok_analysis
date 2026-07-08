package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Dxr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC356210Dxr {
    public static final /* synthetic */ EnumC356210Dxr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC356210Dxr NONE;
    public static final EnumC356210Dxr RELOAD_ALL;
    public static final EnumC356210Dxr RELOAD_SLOT;
    public static final EnumC356210Dxr RESET_NLE;
    public static final EnumC356210Dxr UPDATE_SLOT;

    public static InterfaceC2044707zh<EnumC356210Dxr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC356210Dxr enumC356210Dxr = new EnumC356210Dxr("RELOAD_ALL", 0);
        RELOAD_ALL = enumC356210Dxr;
        EnumC356210Dxr enumC356210Dxr2 = new EnumC356210Dxr("RELOAD_SLOT", 1);
        RELOAD_SLOT = enumC356210Dxr2;
        EnumC356210Dxr enumC356210Dxr3 = new EnumC356210Dxr("UPDATE_SLOT", 2);
        UPDATE_SLOT = enumC356210Dxr3;
        EnumC356210Dxr enumC356210Dxr4 = new EnumC356210Dxr("NONE", 3);
        NONE = enumC356210Dxr4;
        EnumC356210Dxr enumC356210Dxr5 = new EnumC356210Dxr("RESET_NLE", 4);
        RESET_NLE = enumC356210Dxr5;
        EnumC356210Dxr[] enumC356210DxrArr = {enumC356210Dxr, enumC356210Dxr2, enumC356210Dxr3, enumC356210Dxr4, enumC356210Dxr5};
        LL = enumC356210DxrArr;
        LLILLJJLI = new C2254308sP(enumC356210DxrArr);
    }

    public static EnumC356210Dxr[] values() {
        return (EnumC356210Dxr[]) LL.clone();
    }

    public static EnumC356210Dxr valueOf(String str) {
        return (EnumC356210Dxr) C08FF.LIZ(EnumC356210Dxr.class, str);
    }

    public EnumC356210Dxr(String str, int i) {
    }
}
