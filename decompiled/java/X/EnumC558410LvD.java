package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LvD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC558410LvD {
    public static final EnumC558410LvD ANCHOR;
    public static final EnumC558410LvD DISABLED;
    public static final EnumC558410LvD HOLLOW_VIEW;
    public static final /* synthetic */ EnumC558410LvD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC558410LvD WHITE_BUTTON;

    public static InterfaceC2044707zh<EnumC558410LvD> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC558410LvD enumC558410LvD = new EnumC558410LvD("DISABLED", 0);
        DISABLED = enumC558410LvD;
        EnumC558410LvD enumC558410LvD2 = new EnumC558410LvD("HOLLOW_VIEW", 1);
        HOLLOW_VIEW = enumC558410LvD2;
        EnumC558410LvD enumC558410LvD3 = new EnumC558410LvD("WHITE_BUTTON", 2);
        WHITE_BUTTON = enumC558410LvD3;
        EnumC558410LvD enumC558410LvD4 = new EnumC558410LvD("ANCHOR", 3);
        ANCHOR = enumC558410LvD4;
        EnumC558410LvD[] enumC558410LvDArr = {enumC558410LvD, enumC558410LvD2, enumC558410LvD3, enumC558410LvD4};
        LL = enumC558410LvDArr;
        LLILLJJLI = new C2254308sP(enumC558410LvDArr);
    }

    public static EnumC558410LvD[] values() {
        return (EnumC558410LvD[]) LL.clone();
    }

    public static EnumC558410LvD valueOf(String str) {
        return (EnumC558410LvD) C08FF.LIZ(EnumC558410LvD.class, str);
    }

    public EnumC558410LvD(String str, int i) {
    }
}
