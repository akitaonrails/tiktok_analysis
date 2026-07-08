package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NeM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC598920NeM {
    public static final /* synthetic */ EnumC598920NeM[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC598920NeM REPEAT_REGISTER_SAME_ACTION;
    public static final EnumC598920NeM UNKNOWN_ERROR;
    public final Number LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC598920NeM> getEntries() {
        return LLILZ;
    }

    static {
        EnumC598920NeM enumC598920NeM = new EnumC598920NeM("UNKNOWN_ERROR", 0, 10000, "unknow error");
        UNKNOWN_ERROR = enumC598920NeM;
        EnumC598920NeM enumC598920NeM2 = new EnumC598920NeM("REPEAT_REGISTER_SAME_ACTION", 1, 10001, "repeat register same action");
        REPEAT_REGISTER_SAME_ACTION = enumC598920NeM2;
        EnumC598920NeM[] enumC598920NeMArr = {enumC598920NeM, enumC598920NeM2};
        LLILLL = enumC598920NeMArr;
        LLILZ = new C2254308sP(enumC598920NeMArr);
    }

    public static EnumC598920NeM[] values() {
        return (EnumC598920NeM[]) LLILLL.clone();
    }

    public final Number getCode() {
        return this.LL;
    }

    public final String getMessage() {
        return this.LLILLJJLI;
    }

    public static EnumC598920NeM valueOf(String str) {
        return (EnumC598920NeM) C08FF.LIZ(EnumC598920NeM.class, str);
    }

    public EnumC598920NeM(String str, int i, Number number, String str2) {
        this.LL = number;
        this.LLILLJJLI = str2;
    }
}
