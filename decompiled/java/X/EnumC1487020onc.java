package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0onc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1487020onc {
    public static final /* synthetic */ EnumC1487020onc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1487020onc NONE;
    public static final EnumC1487020onc PREPARE;
    public static final EnumC1487020onc STREAMDATA;
    public static final EnumC1487020onc URL;

    public static InterfaceC2044707zh<EnumC1487020onc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1487020onc enumC1487020onc = new EnumC1487020onc("NONE", 0);
        NONE = enumC1487020onc;
        EnumC1487020onc enumC1487020onc2 = new EnumC1487020onc("STREAMDATA", 1);
        STREAMDATA = enumC1487020onc2;
        EnumC1487020onc enumC1487020onc3 = new EnumC1487020onc("URL", 2);
        URL = enumC1487020onc3;
        EnumC1487020onc enumC1487020onc4 = new EnumC1487020onc("PREPARE", 3);
        PREPARE = enumC1487020onc4;
        EnumC1487020onc[] enumC1487020oncArr = {enumC1487020onc, enumC1487020onc2, enumC1487020onc3, enumC1487020onc4};
        LL = enumC1487020oncArr;
        LLILLJJLI = new C2254308sP(enumC1487020oncArr);
    }

    public static EnumC1487020onc[] values() {
        return (EnumC1487020onc[]) LL.clone();
    }

    public static EnumC1487020onc valueOf(String str) {
        return (EnumC1487020onc) C08FF.LIZ(EnumC1487020onc.class, str);
    }

    public EnumC1487020onc(String str, int i) {
    }
}
