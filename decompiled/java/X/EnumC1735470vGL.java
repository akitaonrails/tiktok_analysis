package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vGL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1735470vGL {
    public static final EnumC1735470vGL BLOCKED;
    public static final EnumC1735470vGL ERROR;
    public static final EnumC1735470vGL FAIL;
    public static final EnumC1735470vGL INIT;
    public static final /* synthetic */ EnumC1735470vGL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1735470vGL SKIP;
    public static final EnumC1735470vGL SUCCESS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1735470vGL> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1735470vGL enumC1735470vGL = new EnumC1735470vGL("SUCCESS", 0, "success");
        SUCCESS = enumC1735470vGL;
        EnumC1735470vGL enumC1735470vGL2 = new EnumC1735470vGL("FAIL", 1, "fail");
        FAIL = enumC1735470vGL2;
        EnumC1735470vGL enumC1735470vGL3 = new EnumC1735470vGL("BLOCKED", 2, "blocked");
        BLOCKED = enumC1735470vGL3;
        EnumC1735470vGL enumC1735470vGL4 = new EnumC1735470vGL("SKIP", 3, "skip");
        SKIP = enumC1735470vGL4;
        EnumC1735470vGL enumC1735470vGL5 = new EnumC1735470vGL("INIT", 4, "init");
        INIT = enumC1735470vGL5;
        EnumC1735470vGL enumC1735470vGL6 = new EnumC1735470vGL("ERROR", 5, "error");
        ERROR = enumC1735470vGL6;
        EnumC1735470vGL[] enumC1735470vGLArr = {enumC1735470vGL, enumC1735470vGL2, enumC1735470vGL3, enumC1735470vGL4, enumC1735470vGL5, enumC1735470vGL6};
        LLILLJJLI = enumC1735470vGLArr;
        LLILLL = new C2254308sP(enumC1735470vGLArr);
    }

    public static EnumC1735470vGL[] values() {
        return (EnumC1735470vGL[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1735470vGL valueOf(String str) {
        return (EnumC1735470vGL) C08FF.LIZ(EnumC1735470vGL.class, str);
    }

    public EnumC1735470vGL(String str, int i, String str2) {
        this.LL = str2;
    }
}
