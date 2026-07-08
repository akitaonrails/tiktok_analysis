package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0tMx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1662690tMx {
    public static final /* synthetic */ EnumC1662690tMx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1662690tMx NOT_SHOW_REQUIRE_BUTTON_AND_TEXT;
    public static final EnumC1662690tMx ONLY_REQUIRE_CAMERA_PERMISSION_STATE;
    public static final EnumC1662690tMx ONLY_REQUIRE_MIC_PERMISSION_STATE;
    public static final EnumC1662690tMx REQUIRE_CAMERA_AND_MIC_FOR_LIVE_TAB_STATE;
    public static final EnumC1662690tMx REQUIRE_CAMERA_AND_MIC_PERMISSION_STATE;
    public static final EnumC1662690tMx REQUIRE_CAMERA_AND_MIC_PERMISSION_STATE_FIRST_TIME;
    public static final EnumC1662690tMx REQUIRE_CAMERA_FOR_LIVE_TAB_STATE;
    public static final EnumC1662690tMx REQUIRE_CAMERA_PERMISSION_STATE;
    public static final EnumC1662690tMx REQUIRE_MIC_FOR_LIVE_TAB_STATE;
    public static final EnumC1662690tMx REQUIRE_MIC_PERMISSION_STATE;

    public static InterfaceC2044707zh<EnumC1662690tMx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1662690tMx enumC1662690tMx = new EnumC1662690tMx("REQUIRE_CAMERA_AND_MIC_PERMISSION_STATE", 0);
        REQUIRE_CAMERA_AND_MIC_PERMISSION_STATE = enumC1662690tMx;
        EnumC1662690tMx enumC1662690tMx2 = new EnumC1662690tMx("REQUIRE_CAMERA_AND_MIC_PERMISSION_STATE_FIRST_TIME", 1);
        REQUIRE_CAMERA_AND_MIC_PERMISSION_STATE_FIRST_TIME = enumC1662690tMx2;
        EnumC1662690tMx enumC1662690tMx3 = new EnumC1662690tMx("REQUIRE_CAMERA_PERMISSION_STATE", 2);
        REQUIRE_CAMERA_PERMISSION_STATE = enumC1662690tMx3;
        EnumC1662690tMx enumC1662690tMx4 = new EnumC1662690tMx("ONLY_REQUIRE_CAMERA_PERMISSION_STATE", 3);
        ONLY_REQUIRE_CAMERA_PERMISSION_STATE = enumC1662690tMx4;
        EnumC1662690tMx enumC1662690tMx5 = new EnumC1662690tMx("REQUIRE_MIC_PERMISSION_STATE", 4);
        REQUIRE_MIC_PERMISSION_STATE = enumC1662690tMx5;
        EnumC1662690tMx enumC1662690tMx6 = new EnumC1662690tMx("ONLY_REQUIRE_MIC_PERMISSION_STATE", 5);
        ONLY_REQUIRE_MIC_PERMISSION_STATE = enumC1662690tMx6;
        EnumC1662690tMx enumC1662690tMx7 = new EnumC1662690tMx("NOT_SHOW_REQUIRE_BUTTON_AND_TEXT", 6);
        NOT_SHOW_REQUIRE_BUTTON_AND_TEXT = enumC1662690tMx7;
        EnumC1662690tMx enumC1662690tMx8 = new EnumC1662690tMx("REQUIRE_CAMERA_FOR_LIVE_TAB_STATE", 7);
        REQUIRE_CAMERA_FOR_LIVE_TAB_STATE = enumC1662690tMx8;
        EnumC1662690tMx enumC1662690tMx9 = new EnumC1662690tMx("REQUIRE_MIC_FOR_LIVE_TAB_STATE", 8);
        REQUIRE_MIC_FOR_LIVE_TAB_STATE = enumC1662690tMx9;
        EnumC1662690tMx enumC1662690tMx10 = new EnumC1662690tMx("REQUIRE_CAMERA_AND_MIC_FOR_LIVE_TAB_STATE", 9);
        REQUIRE_CAMERA_AND_MIC_FOR_LIVE_TAB_STATE = enumC1662690tMx10;
        EnumC1662690tMx[] enumC1662690tMxArr = {enumC1662690tMx, enumC1662690tMx2, enumC1662690tMx3, enumC1662690tMx4, enumC1662690tMx5, enumC1662690tMx6, enumC1662690tMx7, enumC1662690tMx8, enumC1662690tMx9, enumC1662690tMx10};
        LL = enumC1662690tMxArr;
        LLILLJJLI = new C2254308sP(enumC1662690tMxArr);
    }

    public static EnumC1662690tMx[] values() {
        return (EnumC1662690tMx[]) LL.clone();
    }

    public static EnumC1662690tMx valueOf(String str) {
        return (EnumC1662690tMx) C08FF.LIZ(EnumC1662690tMx.class, str);
    }

    public EnumC1662690tMx(String str, int i) {
    }
}
