package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bxf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993530bxf {
    public static final EnumC993530bxf KEYBOARD_OPEN;
    public static final EnumC993530bxf LIST_READY;
    public static final /* synthetic */ EnumC993530bxf[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC993530bxf PANEL_EXPAND;
    public final int LL;
    public final EnumC993520bxe LLILLJJLI;

    public static InterfaceC2044707zh<EnumC993530bxf> getEntries() {
        return LLILZ;
    }

    static {
        EnumC993520bxe enumC993520bxe = EnumC993520bxe.PANEL_AND_LIST;
        EnumC993530bxf enumC993530bxf = new EnumC993530bxf("PANEL_EXPAND", 0, 0, enumC993520bxe);
        PANEL_EXPAND = enumC993530bxf;
        EnumC993530bxf enumC993530bxf2 = new EnumC993530bxf("LIST_READY", 1, 1, enumC993520bxe);
        LIST_READY = enumC993530bxf2;
        EnumC993530bxf enumC993530bxf3 = new EnumC993530bxf("KEYBOARD_OPEN", 2, 0, EnumC993520bxe.KEYBOARD);
        KEYBOARD_OPEN = enumC993530bxf3;
        EnumC993530bxf[] enumC993530bxfArr = {enumC993530bxf, enumC993530bxf2, enumC993530bxf3};
        LLILLL = enumC993530bxfArr;
        LLILZ = new C2254308sP(enumC993530bxfArr);
    }

    public static EnumC993530bxf[] values() {
        return (EnumC993530bxf[]) LLILLL.clone();
    }

    public final EnumC993520bxe getCompareGroup() {
        return this.LLILLJJLI;
    }

    public final int getScenePriority() {
        return this.LL;
    }

    public static EnumC993530bxf valueOf(String str) {
        return (EnumC993530bxf) C08FF.LIZ(EnumC993530bxf.class, str);
    }

    public EnumC993530bxf(String str, int i, int i2, EnumC993520bxe enumC993520bxe) {
        this.LL = i2;
        this.LLILLJJLI = enumC993520bxe;
    }
}
