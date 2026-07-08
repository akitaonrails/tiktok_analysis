package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dA5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1039670dA5 {
    public static final EnumC1039670dA5 CONTAINER_INSTANCE;
    public static final EnumC1039670dA5 HYBRID_CONTAINER_RENDER;
    public static final /* synthetic */ EnumC1039670dA5[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1039670dA5 LOAD_FAILED;
    public static final EnumC1039670dA5 LOAD_FINISH;
    public static final EnumC1039670dA5 LOAD_START;
    public static final EnumC1039670dA5 LOAD_URL;
    public static final EnumC1039670dA5 PRELOAD_SUCCESS;
    public static final EnumC1039670dA5 PRELOAD_VIEW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1039670dA5> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1039670dA5 enumC1039670dA5 = new EnumC1039670dA5("LOAD_URL", 0, "load_url");
        LOAD_URL = enumC1039670dA5;
        EnumC1039670dA5 enumC1039670dA52 = new EnumC1039670dA5("LOAD_START", 1, "load_start");
        LOAD_START = enumC1039670dA52;
        EnumC1039670dA5 enumC1039670dA53 = new EnumC1039670dA5("LOAD_FAILED", 2, "load_failed");
        LOAD_FAILED = enumC1039670dA53;
        EnumC1039670dA5 enumC1039670dA54 = new EnumC1039670dA5("LOAD_FINISH", 3, "load_finish");
        LOAD_FINISH = enumC1039670dA54;
        EnumC1039670dA5 enumC1039670dA55 = new EnumC1039670dA5("PRELOAD_SUCCESS", 4, "preload_success");
        PRELOAD_SUCCESS = enumC1039670dA55;
        EnumC1039670dA5 enumC1039670dA56 = new EnumC1039670dA5("PRELOAD_VIEW", 5, "preload_view");
        PRELOAD_VIEW = enumC1039670dA56;
        EnumC1039670dA5 enumC1039670dA57 = new EnumC1039670dA5("HYBRID_CONTAINER_RENDER", 6, "hybrid_container_render");
        HYBRID_CONTAINER_RENDER = enumC1039670dA57;
        EnumC1039670dA5 enumC1039670dA58 = new EnumC1039670dA5("CONTAINER_INSTANCE", 7, "container_instance");
        CONTAINER_INSTANCE = enumC1039670dA58;
        EnumC1039670dA5[] enumC1039670dA5Arr = {enumC1039670dA5, enumC1039670dA52, enumC1039670dA53, enumC1039670dA54, enumC1039670dA55, enumC1039670dA56, enumC1039670dA57, enumC1039670dA58};
        LLILLJJLI = enumC1039670dA5Arr;
        LLILLL = new C2254308sP(enumC1039670dA5Arr);
    }

    public static EnumC1039670dA5[] values() {
        return (EnumC1039670dA5[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1039670dA5 valueOf(String str) {
        return (EnumC1039670dA5) C08FF.LIZ(EnumC1039670dA5.class, str);
    }

    public EnumC1039670dA5(String str, int i, String str2) {
        this.LL = str2;
    }
}
