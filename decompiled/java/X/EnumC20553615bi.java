package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15bi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20553615bi {
    public static final EnumC20553615bi INIT_ERROR;
    public static final /* synthetic */ EnumC20553615bi[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20553615bi LOADING;
    public static final EnumC20553615bi LOAD_FAIL;
    public static final EnumC20553615bi SUCCESS;

    public static InterfaceC2044707zh<EnumC20553615bi> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20553615bi enumC20553615bi = new EnumC20553615bi("SUCCESS", 0);
        SUCCESS = enumC20553615bi;
        EnumC20553615bi enumC20553615bi2 = new EnumC20553615bi("LOADING", 1);
        LOADING = enumC20553615bi2;
        EnumC20553615bi enumC20553615bi3 = new EnumC20553615bi("LOAD_FAIL", 2);
        LOAD_FAIL = enumC20553615bi3;
        EnumC20553615bi enumC20553615bi4 = new EnumC20553615bi("INIT_ERROR", 3);
        INIT_ERROR = enumC20553615bi4;
        EnumC20553615bi[] enumC20553615biArr = {enumC20553615bi, enumC20553615bi2, enumC20553615bi3, enumC20553615bi4};
        LL = enumC20553615biArr;
        LLILLJJLI = new C2254308sP(enumC20553615biArr);
    }

    public static EnumC20553615bi[] values() {
        return (EnumC20553615bi[]) LL.clone();
    }

    public static EnumC20553615bi valueOf(String str) {
        return (EnumC20553615bi) C08FF.LIZ(EnumC20553615bi.class, str);
    }

    public EnumC20553615bi(String str, int i) {
    }
}
