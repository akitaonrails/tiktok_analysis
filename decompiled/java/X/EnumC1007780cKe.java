package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cKe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1007780cKe {
    public static final EnumC1007780cKe ANCHOR_LAYOUT;
    public static final EnumC1007780cKe BOTTOM_LAYOUT;
    public static final EnumC1007780cKe EVENT_TRACKER;
    public static final /* synthetic */ EnumC1007780cKe[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1007780cKe RELATION_BTN_LAYOUT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1007780cKe> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1007780cKe enumC1007780cKe = new EnumC1007780cKe("BOTTOM_LAYOUT", 0, "bottom_layout");
        BOTTOM_LAYOUT = enumC1007780cKe;
        EnumC1007780cKe enumC1007780cKe2 = new EnumC1007780cKe("ANCHOR_LAYOUT", 1, "anchor_layout");
        ANCHOR_LAYOUT = enumC1007780cKe2;
        EnumC1007780cKe enumC1007780cKe3 = new EnumC1007780cKe("RELATION_BTN_LAYOUT", 2, "relation_btn_layout");
        RELATION_BTN_LAYOUT = enumC1007780cKe3;
        EnumC1007780cKe enumC1007780cKe4 = new EnumC1007780cKe("EVENT_TRACKER", 3, "event_tracker");
        EVENT_TRACKER = enumC1007780cKe4;
        EnumC1007780cKe[] enumC1007780cKeArr = {enumC1007780cKe, enumC1007780cKe2, enumC1007780cKe3, enumC1007780cKe4};
        LLILLJJLI = enumC1007780cKeArr;
        LLILLL = new C2254308sP(enumC1007780cKeArr);
    }

    public static EnumC1007780cKe[] values() {
        return (EnumC1007780cKe[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1007780cKe valueOf(String str) {
        return (EnumC1007780cKe) C08FF.LIZ(EnumC1007780cKe.class, str);
    }

    public EnumC1007780cKe(String str, int i, String str2) {
        this.LL = str2;
    }
}
