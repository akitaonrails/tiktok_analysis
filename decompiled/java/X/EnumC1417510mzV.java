package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mzV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1417510mzV {
    public static final EnumC1417510mzV CANCEL;
    public static final EnumC1417510mzV FAIL;
    public static final /* synthetic */ EnumC1417510mzV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1417510mzV NONE;
    public static final EnumC1417510mzV PRELOADING;
    public static final EnumC1417510mzV SUCCESS;

    public static InterfaceC2044707zh<EnumC1417510mzV> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1417510mzV enumC1417510mzV = new EnumC1417510mzV("NONE", 0);
        NONE = enumC1417510mzV;
        EnumC1417510mzV enumC1417510mzV2 = new EnumC1417510mzV("PRELOADING", 1);
        PRELOADING = enumC1417510mzV2;
        EnumC1417510mzV enumC1417510mzV3 = new EnumC1417510mzV("SUCCESS", 2);
        SUCCESS = enumC1417510mzV3;
        EnumC1417510mzV enumC1417510mzV4 = new EnumC1417510mzV("FAIL", 3);
        FAIL = enumC1417510mzV4;
        EnumC1417510mzV enumC1417510mzV5 = new EnumC1417510mzV("CANCEL", 4);
        CANCEL = enumC1417510mzV5;
        EnumC1417510mzV[] enumC1417510mzVArr = {enumC1417510mzV, enumC1417510mzV2, enumC1417510mzV3, enumC1417510mzV4, enumC1417510mzV5};
        LL = enumC1417510mzVArr;
        LLILLJJLI = new C2254308sP(enumC1417510mzVArr);
    }

    public static EnumC1417510mzV[] values() {
        return (EnumC1417510mzV[]) LL.clone();
    }

    public static EnumC1417510mzV valueOf(String str) {
        return (EnumC1417510mzV) C08FF.LIZ(EnumC1417510mzV.class, str);
    }

    public EnumC1417510mzV(String str, int i) {
    }
}
