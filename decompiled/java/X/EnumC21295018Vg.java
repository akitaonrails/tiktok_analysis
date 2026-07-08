package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.18Vg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21295018Vg {
    public static final EnumC21295018Vg DETECT_CHANGED;
    public static final EnumC21295018Vg FOCUS_CHANGED;
    public static final /* synthetic */ EnumC21295018Vg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC21295018Vg UI_ACTION_ADDED_IMAGE;
    public static final EnumC21295018Vg UI_ACTION_OPEN_DEFAULT;
    public static final EnumC21295018Vg UI_ACTION_OUT_INPUT;
    public static final EnumC21295018Vg UI_ACTION_REIN;
    public static final EnumC21295018Vg UI_ACTION_SENT;

    public static InterfaceC2044707zh<EnumC21295018Vg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC21295018Vg enumC21295018Vg = new EnumC21295018Vg("FOCUS_CHANGED", 0);
        FOCUS_CHANGED = enumC21295018Vg;
        EnumC21295018Vg enumC21295018Vg2 = new EnumC21295018Vg("DETECT_CHANGED", 1);
        DETECT_CHANGED = enumC21295018Vg2;
        EnumC21295018Vg enumC21295018Vg3 = new EnumC21295018Vg("UI_ACTION_REIN", 2);
        UI_ACTION_REIN = enumC21295018Vg3;
        EnumC21295018Vg enumC21295018Vg4 = new EnumC21295018Vg("UI_ACTION_OUT_INPUT", 3);
        UI_ACTION_OUT_INPUT = enumC21295018Vg4;
        EnumC21295018Vg enumC21295018Vg5 = new EnumC21295018Vg("UI_ACTION_OPEN_DEFAULT", 4);
        UI_ACTION_OPEN_DEFAULT = enumC21295018Vg5;
        EnumC21295018Vg enumC21295018Vg6 = new EnumC21295018Vg("UI_ACTION_ADDED_IMAGE", 5);
        UI_ACTION_ADDED_IMAGE = enumC21295018Vg6;
        EnumC21295018Vg enumC21295018Vg7 = new EnumC21295018Vg("UI_ACTION_SENT", 6);
        UI_ACTION_SENT = enumC21295018Vg7;
        EnumC21295018Vg[] enumC21295018VgArr = {enumC21295018Vg, enumC21295018Vg2, enumC21295018Vg3, enumC21295018Vg4, enumC21295018Vg5, enumC21295018Vg6, enumC21295018Vg7};
        LL = enumC21295018VgArr;
        LLILLJJLI = new C2254308sP(enumC21295018VgArr);
    }

    public static EnumC21295018Vg[] values() {
        return (EnumC21295018Vg[]) LL.clone();
    }

    public static EnumC21295018Vg valueOf(String str) {
        return (EnumC21295018Vg) C08FF.LIZ(EnumC21295018Vg.class, str);
    }

    public EnumC21295018Vg(String str, int i) {
    }
}
