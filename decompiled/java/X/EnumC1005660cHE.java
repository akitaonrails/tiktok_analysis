package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cHE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1005660cHE {
    public static final EnumC1005660cHE API;
    public static final EnumC1005660cHE CHECK;
    public static final EnumC1005660cHE CHECK_OBJECT;
    public static final EnumC1005660cHE CHECK_PATTERN;
    public static final EnumC1005660cHE GOOFY;
    public static final EnumC1005660cHE INIT;
    public static final EnumC1005660cHE JS_WORKER_ERROR;
    public static final /* synthetic */ EnumC1005660cHE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1005660cHE REQUEST_PARAM;
    public static final EnumC1005660cHE UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1005660cHE> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1005660cHE enumC1005660cHE = new EnumC1005660cHE("UNKNOWN", 0, 0);
        UNKNOWN = enumC1005660cHE;
        EnumC1005660cHE enumC1005660cHE2 = new EnumC1005660cHE("INIT", 1, 1);
        INIT = enumC1005660cHE2;
        EnumC1005660cHE enumC1005660cHE3 = new EnumC1005660cHE("CHECK", 2, 2);
        CHECK = enumC1005660cHE3;
        EnumC1005660cHE enumC1005660cHE4 = new EnumC1005660cHE("CHECK_OBJECT", 3, 3);
        CHECK_OBJECT = enumC1005660cHE4;
        EnumC1005660cHE enumC1005660cHE5 = new EnumC1005660cHE("CHECK_PATTERN", 4, 4);
        CHECK_PATTERN = enumC1005660cHE5;
        EnumC1005660cHE enumC1005660cHE6 = new EnumC1005660cHE("API", 5, 5);
        API = enumC1005660cHE6;
        EnumC1005660cHE enumC1005660cHE7 = new EnumC1005660cHE("GOOFY", 6, 6);
        GOOFY = enumC1005660cHE7;
        EnumC1005660cHE enumC1005660cHE8 = new EnumC1005660cHE("REQUEST_PARAM", 7, 7);
        REQUEST_PARAM = enumC1005660cHE8;
        EnumC1005660cHE enumC1005660cHE9 = new EnumC1005660cHE("JS_WORKER_ERROR", 8, 8);
        JS_WORKER_ERROR = enumC1005660cHE9;
        EnumC1005660cHE[] enumC1005660cHEArr = {enumC1005660cHE, enumC1005660cHE2, enumC1005660cHE3, enumC1005660cHE4, enumC1005660cHE5, enumC1005660cHE6, enumC1005660cHE7, enumC1005660cHE8, enumC1005660cHE9};
        LLILLJJLI = enumC1005660cHEArr;
        LLILLL = new C2254308sP(enumC1005660cHEArr);
    }

    public static EnumC1005660cHE[] values() {
        return (EnumC1005660cHE[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1005660cHE valueOf(String str) {
        return (EnumC1005660cHE) C08FF.LIZ(EnumC1005660cHE.class, str);
    }

    public EnumC1005660cHE(String str, int i, int i2) {
        this.LL = i2;
    }
}
