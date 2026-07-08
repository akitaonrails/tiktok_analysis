package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0atw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC952780atw {
    public static final /* synthetic */ EnumC952780atw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC952780atw MASK;
    public static final EnumC952780atw PREVIEW_BOARD_DIALOG;
    public static final EnumC952780atw TEMPLATE_DIALOG;

    public static InterfaceC2044707zh<EnumC952780atw> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC952780atw enumC952780atw = new EnumC952780atw("MASK", 0);
        MASK = enumC952780atw;
        EnumC952780atw enumC952780atw2 = new EnumC952780atw("PREVIEW_BOARD_DIALOG", 1);
        PREVIEW_BOARD_DIALOG = enumC952780atw2;
        EnumC952780atw enumC952780atw3 = new EnumC952780atw("TEMPLATE_DIALOG", 2);
        TEMPLATE_DIALOG = enumC952780atw3;
        EnumC952780atw[] enumC952780atwArr = {enumC952780atw, enumC952780atw2, enumC952780atw3};
        LL = enumC952780atwArr;
        LLILLJJLI = new C2254308sP(enumC952780atwArr);
    }

    public static EnumC952780atw[] values() {
        return (EnumC952780atw[]) LL.clone();
    }

    public static EnumC952780atw valueOf(String str) {
        return (EnumC952780atw) C08FF.LIZ(EnumC952780atw.class, str);
    }

    public EnumC952780atw(String str, int i) {
    }
}
