package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Je4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC496820Je4 {
    public static final /* synthetic */ EnumC496820Je4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC496820Je4 REQUEST_FROM_SCENE_GIFT_PANEL;
    public static final EnumC496820Je4 REQUEST_FROM_SCENE_LIVING_ROOM;
    public static final EnumC496820Je4 REQUEST_FROM_SCENE_PERSONAL_CARD;
    public static final EnumC496820Je4 REQUEST_FROM_SCENE_UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC496820Je4> getEntries() {
        return LLILLL;
    }

    static {
        EnumC496820Je4 enumC496820Je4 = new EnumC496820Je4("REQUEST_FROM_SCENE_UNKNOWN", 0, 0);
        REQUEST_FROM_SCENE_UNKNOWN = enumC496820Je4;
        EnumC496820Je4 enumC496820Je42 = new EnumC496820Je4("REQUEST_FROM_SCENE_PERSONAL_CARD", 1, 1);
        REQUEST_FROM_SCENE_PERSONAL_CARD = enumC496820Je42;
        EnumC496820Je4 enumC496820Je43 = new EnumC496820Je4("REQUEST_FROM_SCENE_LIVING_ROOM", 2, 2);
        REQUEST_FROM_SCENE_LIVING_ROOM = enumC496820Je43;
        EnumC496820Je4 enumC496820Je44 = new EnumC496820Je4("REQUEST_FROM_SCENE_GIFT_PANEL", 3, 3);
        REQUEST_FROM_SCENE_GIFT_PANEL = enumC496820Je44;
        EnumC496820Je4[] enumC496820Je4Arr = {enumC496820Je4, enumC496820Je42, enumC496820Je43, enumC496820Je44};
        LLILLJJLI = enumC496820Je4Arr;
        LLILLL = new C2254308sP(enumC496820Je4Arr);
    }

    public static EnumC496820Je4[] values() {
        return (EnumC496820Je4[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC496820Je4 valueOf(String str) {
        return (EnumC496820Je4) C08FF.LIZ(EnumC496820Je4.class, str);
    }

    public EnumC496820Je4(String str, int i, int i2) {
        this.LL = i2;
    }
}
