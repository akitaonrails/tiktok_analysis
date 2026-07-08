package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YsF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC887810YsF {
    public static final EnumC887810YsF CAMERA_ICON_SHOW;
    public static final EnumC887810YsF CHAT_SHOW;
    public static final /* synthetic */ EnumC887810YsF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC887810YsF TTSOCIAL_CHAT_CELL_SHOW;

    public static InterfaceC2044707zh<EnumC887810YsF> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC887810YsF enumC887810YsF = new EnumC887810YsF("CHAT_SHOW", 0);
        CHAT_SHOW = enumC887810YsF;
        EnumC887810YsF enumC887810YsF2 = new EnumC887810YsF("CAMERA_ICON_SHOW", 1);
        CAMERA_ICON_SHOW = enumC887810YsF2;
        EnumC887810YsF enumC887810YsF3 = new EnumC887810YsF("TTSOCIAL_CHAT_CELL_SHOW", 2);
        TTSOCIAL_CHAT_CELL_SHOW = enumC887810YsF3;
        EnumC887810YsF[] enumC887810YsFArr = {enumC887810YsF, enumC887810YsF2, enumC887810YsF3};
        LL = enumC887810YsFArr;
        LLILLJJLI = new C2254308sP(enumC887810YsFArr);
    }

    public static EnumC887810YsF[] values() {
        return (EnumC887810YsF[]) LL.clone();
    }

    public static EnumC887810YsF valueOf(String str) {
        return (EnumC887810YsF) C08FF.LIZ(EnumC887810YsF.class, str);
    }

    public EnumC887810YsF(String str, int i) {
    }
}
