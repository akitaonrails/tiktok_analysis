package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Dxd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC356070Dxd {
    public static final EnumC356070Dxd COMMIT;
    public static final EnumC356070Dxd DONE;
    public static final /* synthetic */ EnumC356070Dxd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC356070Dxd NONE;

    public static InterfaceC2044707zh<EnumC356070Dxd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC356070Dxd enumC356070Dxd = new EnumC356070Dxd("NONE", 0);
        NONE = enumC356070Dxd;
        EnumC356070Dxd enumC356070Dxd2 = new EnumC356070Dxd("COMMIT", 1);
        COMMIT = enumC356070Dxd2;
        EnumC356070Dxd enumC356070Dxd3 = new EnumC356070Dxd("DONE", 2);
        DONE = enumC356070Dxd3;
        EnumC356070Dxd[] enumC356070DxdArr = {enumC356070Dxd, enumC356070Dxd2, enumC356070Dxd3};
        LL = enumC356070DxdArr;
        LLILLJJLI = new C2254308sP(enumC356070DxdArr);
    }

    public static EnumC356070Dxd[] values() {
        return (EnumC356070Dxd[]) LL.clone();
    }

    public static EnumC356070Dxd valueOf(String str) {
        return (EnumC356070Dxd) C08FF.LIZ(EnumC356070Dxd.class, str);
    }

    public EnumC356070Dxd(String str, int i) {
    }
}
