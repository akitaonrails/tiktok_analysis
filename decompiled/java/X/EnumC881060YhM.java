package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YhM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC881060YhM {
    public static final EnumC881060YhM INFERENCE;
    public static final /* synthetic */ EnumC881060YhM[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC881060YhM OBSERVER_ENV;
    public static final EnumC881060YhM PRE_DOWNLOAD;
    public static final EnumC881060YhM RELEASE;
    public final EnumC881070YhN LL;
    public final EnumC881070YhN LLILLJJLI;

    public static InterfaceC2044707zh<EnumC881060YhM> getEntries() {
        return LLILZ;
    }

    static {
        EnumC881060YhM enumC881060YhM = new EnumC881060YhM("PRE_DOWNLOAD", 0, EnumC881070YhN.PRE_DOWNLOAD_SUCCESS, EnumC881070YhN.PRE_DOWNLOAD_ERROR);
        PRE_DOWNLOAD = enumC881060YhM;
        EnumC881060YhM enumC881060YhM2 = new EnumC881060YhM("INFERENCE", 1, EnumC881070YhN.INFERENCE_SUCCESS, EnumC881070YhN.INFERENCE_ERROR);
        INFERENCE = enumC881060YhM2;
        EnumC881060YhM enumC881060YhM3 = new EnumC881060YhM("OBSERVER_ENV", 2, EnumC881070YhN.OBSERVER_ENV_SUCCESS, EnumC881070YhN.OBSERVER_ENV_ERROR);
        OBSERVER_ENV = enumC881060YhM3;
        EnumC881070YhN enumC881070YhN = EnumC881070YhN.RELEASE_END;
        EnumC881060YhM enumC881060YhM4 = new EnumC881060YhM("RELEASE", 3, enumC881070YhN, enumC881070YhN);
        RELEASE = enumC881060YhM4;
        EnumC881060YhM[] enumC881060YhMArr = {enumC881060YhM, enumC881060YhM2, enumC881060YhM3, enumC881060YhM4};
        LLILLL = enumC881060YhMArr;
        LLILZ = new C2254308sP(enumC881060YhMArr);
    }

    public static EnumC881060YhM[] values() {
        return (EnumC881060YhM[]) LLILLL.clone();
    }

    public final EnumC881070YhN getErrorResult() {
        return this.LLILLJJLI;
    }

    public final EnumC881070YhN getSuccessResult() {
        return this.LL;
    }

    public static EnumC881060YhM valueOf(String str) {
        return (EnumC881060YhM) C08FF.LIZ(EnumC881060YhM.class, str);
    }

    public EnumC881060YhM(String str, int i, EnumC881070YhN enumC881070YhN, EnumC881070YhN enumC881070YhN2) {
        this.LL = enumC881070YhN;
        this.LLILLJJLI = enumC881070YhN2;
    }
}
