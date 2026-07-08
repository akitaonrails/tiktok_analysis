package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cGL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1005110cGL {
    public static final EnumC1005110cGL EMPTY;
    public static final EnumC1005110cGL FAIL;
    public static final /* synthetic */ EnumC1005110cGL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1005110cGL SUCCESS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1005110cGL> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1005110cGL enumC1005110cGL = new EnumC1005110cGL("SUCCESS", 0, "success");
        SUCCESS = enumC1005110cGL;
        EnumC1005110cGL enumC1005110cGL2 = new EnumC1005110cGL("FAIL", 1, "fail");
        FAIL = enumC1005110cGL2;
        EnumC1005110cGL enumC1005110cGL3 = new EnumC1005110cGL("EMPTY", 2, "empty");
        EMPTY = enumC1005110cGL3;
        EnumC1005110cGL[] enumC1005110cGLArr = {enumC1005110cGL, enumC1005110cGL2, enumC1005110cGL3};
        LLILLJJLI = enumC1005110cGLArr;
        LLILLL = new C2254308sP(enumC1005110cGLArr);
    }

    public static EnumC1005110cGL[] values() {
        return (EnumC1005110cGL[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1005110cGL valueOf(String str) {
        return (EnumC1005110cGL) C08FF.LIZ(EnumC1005110cGL.class, str);
    }

    public EnumC1005110cGL(String str, int i, String str2) {
        this.LL = str2;
    }
}
