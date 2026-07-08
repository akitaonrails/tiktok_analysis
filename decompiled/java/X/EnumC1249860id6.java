package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0id6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1249860id6 {
    public static final EnumC1249860id6 ICON;
    public static final EnumC1249860id6 ICON_TEXT;
    public static final /* synthetic */ EnumC1249860id6[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1249860id6 SHEET;
    public static final EnumC1249860id6 TEXT;

    public static InterfaceC2044707zh<EnumC1249860id6> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1249860id6 enumC1249860id6 = new EnumC1249860id6("ICON_TEXT", 0);
        ICON_TEXT = enumC1249860id6;
        EnumC1249860id6 enumC1249860id62 = new EnumC1249860id6("TEXT", 1);
        TEXT = enumC1249860id62;
        EnumC1249860id6 enumC1249860id63 = new EnumC1249860id6("ICON", 2);
        ICON = enumC1249860id63;
        EnumC1249860id6 enumC1249860id64 = new EnumC1249860id6("SHEET", 3);
        SHEET = enumC1249860id64;
        EnumC1249860id6[] enumC1249860id6Arr = {enumC1249860id6, enumC1249860id62, enumC1249860id63, enumC1249860id64};
        LL = enumC1249860id6Arr;
        LLILLJJLI = new C2254308sP(enumC1249860id6Arr);
    }

    public static EnumC1249860id6[] values() {
        return (EnumC1249860id6[]) LL.clone();
    }

    public static EnumC1249860id6 valueOf(String str) {
        return (EnumC1249860id6) C08FF.LIZ(EnumC1249860id6.class, str);
    }

    public EnumC1249860id6(String str, int i) {
    }
}
