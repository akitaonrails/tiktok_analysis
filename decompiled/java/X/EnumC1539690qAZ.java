package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qAZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1539690qAZ {
    public static final EnumC1539690qAZ BUNDLE_CHECK_FAILED;
    public static final EnumC1539690qAZ BUNDLE_CHECK_SUCCESS;
    public static final EnumC1539690qAZ DEBUG_BEGIN_FETCH_RESOURCE;
    public static final EnumC1539690qAZ DEBUG_LOAD_CDN_CONTENT;
    public static final EnumC1539690qAZ DEBUG_RESOURCE_NULL;
    public static final EnumC1539690qAZ DEBUG_RESOURCE_SERVICE_NULL;
    public static final EnumC1539690qAZ DEBUG_SSR_BUNDLE_NULL;
    public static final EnumC1539690qAZ DOWNGRADED;
    public static final EnumC1539690qAZ FETCH_RESPONSE_FAILED;
    public static final EnumC1539690qAZ FETCH_RESPONSE_SUCCESS;
    public static final EnumC1539690qAZ GECKO_BUNDLE_EXIST;
    public static final EnumC1539690qAZ HYDRATION_FAILED;
    public static final EnumC1539690qAZ HYDRATION_SUCCESS;
    public static final /* synthetic */ EnumC1539690qAZ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1539690qAZ NOT_RENDER;
    public static final EnumC1539690qAZ RENDER_FIRST_SCREEN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1539690qAZ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1539690qAZ enumC1539690qAZ = new EnumC1539690qAZ("NOT_RENDER", 0, 0);
        NOT_RENDER = enumC1539690qAZ;
        EnumC1539690qAZ enumC1539690qAZ2 = new EnumC1539690qAZ("RENDER_FIRST_SCREEN", 1, 1);
        RENDER_FIRST_SCREEN = enumC1539690qAZ2;
        EnumC1539690qAZ enumC1539690qAZ3 = new EnumC1539690qAZ("HYDRATION_SUCCESS", 2, 2);
        HYDRATION_SUCCESS = enumC1539690qAZ3;
        EnumC1539690qAZ enumC1539690qAZ4 = new EnumC1539690qAZ("DOWNGRADED", 3, -1);
        DOWNGRADED = enumC1539690qAZ4;
        EnumC1539690qAZ enumC1539690qAZ5 = new EnumC1539690qAZ("HYDRATION_FAILED", 4, -2);
        HYDRATION_FAILED = enumC1539690qAZ5;
        EnumC1539690qAZ enumC1539690qAZ6 = new EnumC1539690qAZ("DEBUG_SSR_BUNDLE_NULL", 5, -1001);
        DEBUG_SSR_BUNDLE_NULL = enumC1539690qAZ6;
        EnumC1539690qAZ enumC1539690qAZ7 = new EnumC1539690qAZ("DEBUG_LOAD_CDN_CONTENT", 6, -1002);
        DEBUG_LOAD_CDN_CONTENT = enumC1539690qAZ7;
        EnumC1539690qAZ enumC1539690qAZ8 = new EnumC1539690qAZ("DEBUG_RESOURCE_NULL", 7, -1003);
        DEBUG_RESOURCE_NULL = enumC1539690qAZ8;
        EnumC1539690qAZ enumC1539690qAZ9 = new EnumC1539690qAZ("DEBUG_BEGIN_FETCH_RESOURCE", 8, -1004);
        DEBUG_BEGIN_FETCH_RESOURCE = enumC1539690qAZ9;
        EnumC1539690qAZ enumC1539690qAZ10 = new EnumC1539690qAZ("FETCH_RESPONSE_SUCCESS", 9, -1005);
        FETCH_RESPONSE_SUCCESS = enumC1539690qAZ10;
        EnumC1539690qAZ enumC1539690qAZ11 = new EnumC1539690qAZ("BUNDLE_CHECK_SUCCESS", 10, -1006);
        BUNDLE_CHECK_SUCCESS = enumC1539690qAZ11;
        EnumC1539690qAZ enumC1539690qAZ12 = new EnumC1539690qAZ("BUNDLE_CHECK_FAILED", 11, -1008);
        BUNDLE_CHECK_FAILED = enumC1539690qAZ12;
        EnumC1539690qAZ enumC1539690qAZ13 = new EnumC1539690qAZ("GECKO_BUNDLE_EXIST", 12, -1008);
        GECKO_BUNDLE_EXIST = enumC1539690qAZ13;
        EnumC1539690qAZ enumC1539690qAZ14 = new EnumC1539690qAZ("FETCH_RESPONSE_FAILED", 13, -1009);
        FETCH_RESPONSE_FAILED = enumC1539690qAZ14;
        EnumC1539690qAZ enumC1539690qAZ15 = new EnumC1539690qAZ("DEBUG_RESOURCE_SERVICE_NULL", 14, -1010);
        DEBUG_RESOURCE_SERVICE_NULL = enumC1539690qAZ15;
        EnumC1539690qAZ[] enumC1539690qAZArr = {enumC1539690qAZ, enumC1539690qAZ2, enumC1539690qAZ3, enumC1539690qAZ4, enumC1539690qAZ5, enumC1539690qAZ6, enumC1539690qAZ7, enumC1539690qAZ8, enumC1539690qAZ9, enumC1539690qAZ10, enumC1539690qAZ11, enumC1539690qAZ12, enumC1539690qAZ13, enumC1539690qAZ14, enumC1539690qAZ15};
        LLILLJJLI = enumC1539690qAZArr;
        LLILLL = new C2254308sP(enumC1539690qAZArr);
    }

    public static EnumC1539690qAZ[] values() {
        return (EnumC1539690qAZ[]) LLILLJJLI.clone();
    }

    public final int getRenderState() {
        return this.LL;
    }

    public static EnumC1539690qAZ valueOf(String str) {
        return (EnumC1539690qAZ) C08FF.LIZ(EnumC1539690qAZ.class, str);
    }

    public EnumC1539690qAZ(String str, int i, int i2) {
        this.LL = i2;
    }
}
