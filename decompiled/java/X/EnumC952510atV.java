package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0atV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC952510atV {
    public static final EnumC952510atV AUDIENCE_ROOM_ENTER_COHOST_WIDGET_LOAD;
    public static final EnumC952510atV AUDIENCE_ROOM_ENTER_FAIL;
    public static final EnumC952510atV AUDIENCE_ROOM_ENTER_LAYOUT_INIT;
    public static final EnumC952510atV AUDIENCE_ROOM_ENTER_RENDER;
    public static final EnumC952510atV AUDIENCE_ROOM_ENTER_ROOM_ENTER;
    public static final /* synthetic */ EnumC952510atV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public EnumC952510atV() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC952510atV> getEntries() {
        return LLILLL;
    }

    static {
        EnumC952510atV enumC952510atV = new EnumC952510atV("AUDIENCE_ROOM_ENTER_ROOM_ENTER", 0, "room_enter");
        AUDIENCE_ROOM_ENTER_ROOM_ENTER = enumC952510atV;
        EnumC952510atV enumC952510atV2 = new EnumC952510atV("AUDIENCE_ROOM_ENTER_COHOST_WIDGET_LOAD", 1, "cohost_widget_load");
        AUDIENCE_ROOM_ENTER_COHOST_WIDGET_LOAD = enumC952510atV2;
        EnumC952510atV enumC952510atV3 = new EnumC952510atV("AUDIENCE_ROOM_ENTER_LAYOUT_INIT", 2, "biz_layout_init");
        AUDIENCE_ROOM_ENTER_LAYOUT_INIT = enumC952510atV3;
        EnumC952510atV enumC952510atV4 = new EnumC952510atV("AUDIENCE_ROOM_ENTER_RENDER", 3, "layout_render");
        AUDIENCE_ROOM_ENTER_RENDER = enumC952510atV4;
        EnumC952510atV enumC952510atV5 = new EnumC952510atV("AUDIENCE_ROOM_ENTER_FAIL", 4, "fail");
        AUDIENCE_ROOM_ENTER_FAIL = enumC952510atV5;
        EnumC952510atV[] enumC952510atVArr = {enumC952510atV, enumC952510atV2, enumC952510atV3, enumC952510atV4, enumC952510atV5};
        LLILLJJLI = enumC952510atVArr;
        LLILLL = new C2254308sP(enumC952510atVArr);
    }

    public static EnumC952510atV[] values() {
        return (EnumC952510atV[]) LLILLJJLI.clone();
    }

    public final String getStageName() {
        return this.LL;
    }

    public static EnumC952510atV valueOf(String str) {
        return (EnumC952510atV) C08FF.LIZ(EnumC952510atV.class, str);
    }

    public EnumC952510atV(String str, int i, String str2) {
        this.LL = str2;
    }
}
