package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bvj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992330bvj {
    public static final EnumC992330bvj ASR_ENGINE_FAILED;
    public static final EnumC992330bvj ASR_ENGINE_FAILED_UNKNOWN;
    public static final EnumC992330bvj ASR_ENGINE_INIT_ERROR;
    public static final EnumC992330bvj ASR_ENGINE_PARAM_ERROR;
    public static final EnumC992330bvj ASR_PARSE_FAILED;
    public static final EnumC992330bvj ASR_RESULT_EMPTY;
    public static final EnumC992330bvj ASR_SUCCESS;
    public static final /* synthetic */ EnumC992330bvj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC992330bvj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992330bvj enumC992330bvj = new EnumC992330bvj("ASR_SUCCESS", 0);
        ASR_SUCCESS = enumC992330bvj;
        EnumC992330bvj enumC992330bvj2 = new EnumC992330bvj("ASR_ENGINE_PARAM_ERROR", 1);
        ASR_ENGINE_PARAM_ERROR = enumC992330bvj2;
        EnumC992330bvj enumC992330bvj3 = new EnumC992330bvj("ASR_ENGINE_INIT_ERROR", 2);
        ASR_ENGINE_INIT_ERROR = enumC992330bvj3;
        EnumC992330bvj enumC992330bvj4 = new EnumC992330bvj("ASR_ENGINE_FAILED", 3);
        ASR_ENGINE_FAILED = enumC992330bvj4;
        EnumC992330bvj enumC992330bvj5 = new EnumC992330bvj("ASR_ENGINE_FAILED_UNKNOWN", 4);
        ASR_ENGINE_FAILED_UNKNOWN = enumC992330bvj5;
        EnumC992330bvj enumC992330bvj6 = new EnumC992330bvj("ASR_RESULT_EMPTY", 5);
        ASR_RESULT_EMPTY = enumC992330bvj6;
        EnumC992330bvj enumC992330bvj7 = new EnumC992330bvj("ASR_PARSE_FAILED", 6);
        ASR_PARSE_FAILED = enumC992330bvj7;
        EnumC992330bvj[] enumC992330bvjArr = {enumC992330bvj, enumC992330bvj2, enumC992330bvj3, enumC992330bvj4, enumC992330bvj5, enumC992330bvj6, enumC992330bvj7};
        LL = enumC992330bvjArr;
        LLILLJJLI = new C2254308sP(enumC992330bvjArr);
    }

    public static EnumC992330bvj[] values() {
        return (EnumC992330bvj[]) LL.clone();
    }

    public static EnumC992330bvj valueOf(String str) {
        return (EnumC992330bvj) C08FF.LIZ(EnumC992330bvj.class, str);
    }

    public EnumC992330bvj(String str, int i) {
    }
}
