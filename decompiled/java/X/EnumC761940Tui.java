package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Tui, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC761940Tui {
    public static final EnumC761940Tui DIALOG_BIZ_FIRSTLY_EFFECT_PANEL;
    public static final EnumC761940Tui DIALOG_BIZ_OTHERS;
    public static final EnumC761940Tui DIALOG_BIZ_SECONDARY_EFFECT_PANEL;
    public static final /* synthetic */ EnumC761940Tui[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC761940Tui> getEntries() {
        return LLILLL;
    }

    static {
        EnumC761940Tui enumC761940Tui = new EnumC761940Tui("DIALOG_BIZ_FIRSTLY_EFFECT_PANEL", 0, "firstly_effect_panel");
        DIALOG_BIZ_FIRSTLY_EFFECT_PANEL = enumC761940Tui;
        EnumC761940Tui enumC761940Tui2 = new EnumC761940Tui("DIALOG_BIZ_SECONDARY_EFFECT_PANEL", 1, "secondary_effect_panel");
        DIALOG_BIZ_SECONDARY_EFFECT_PANEL = enumC761940Tui2;
        EnumC761940Tui enumC761940Tui3 = new EnumC761940Tui("DIALOG_BIZ_OTHERS", 2, "others");
        DIALOG_BIZ_OTHERS = enumC761940Tui3;
        EnumC761940Tui[] enumC761940TuiArr = {enumC761940Tui, enumC761940Tui2, enumC761940Tui3};
        LLILLJJLI = enumC761940TuiArr;
        LLILLL = new C2254308sP(enumC761940TuiArr);
    }

    public static EnumC761940Tui[] values() {
        return (EnumC761940Tui[]) LLILLJJLI.clone();
    }

    public final String getBizName() {
        return this.LL;
    }

    public static EnumC761940Tui valueOf(String str) {
        return (EnumC761940Tui) C08FF.LIZ(EnumC761940Tui.class, str);
    }

    public EnumC761940Tui(String str, int i, String str2) {
        this.LL = str2;
    }
}
