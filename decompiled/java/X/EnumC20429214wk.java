package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14wk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20429214wk {
    public static final EnumC20429214wk FAILED;
    public static final EnumC20429214wk INIT;
    public static final /* synthetic */ EnumC20429214wk[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20429214wk REQUESTING;
    public static final EnumC20429214wk SUCCESS;

    public static InterfaceC2044707zh<EnumC20429214wk> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20429214wk enumC20429214wk = new EnumC20429214wk("INIT", 0);
        INIT = enumC20429214wk;
        EnumC20429214wk enumC20429214wk2 = new EnumC20429214wk("REQUESTING", 1);
        REQUESTING = enumC20429214wk2;
        EnumC20429214wk enumC20429214wk3 = new EnumC20429214wk("SUCCESS", 2);
        SUCCESS = enumC20429214wk3;
        EnumC20429214wk enumC20429214wk4 = new EnumC20429214wk("FAILED", 3);
        FAILED = enumC20429214wk4;
        EnumC20429214wk[] enumC20429214wkArr = {enumC20429214wk, enumC20429214wk2, enumC20429214wk3, enumC20429214wk4};
        LL = enumC20429214wkArr;
        LLILLJJLI = new C2254308sP(enumC20429214wkArr);
    }

    public static EnumC20429214wk[] values() {
        return (EnumC20429214wk[]) LL.clone();
    }

    public static EnumC20429214wk valueOf(String str) {
        return (EnumC20429214wk) C08FF.LIZ(EnumC20429214wk.class, str);
    }

    public EnumC20429214wk(String str, int i) {
    }
}
