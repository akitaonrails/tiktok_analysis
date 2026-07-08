package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0RTo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC696460RTo {
    public static final /* synthetic */ EnumC696460RTo[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC696460RTo MANAGE;
    public static final EnumC696460RTo TAB_BUTTON;
    public final String LL;

    public static InterfaceC2044707zh<EnumC696460RTo> getEntries() {
        return LLILLL;
    }

    static {
        EnumC696460RTo enumC696460RTo = new EnumC696460RTo("TAB_BUTTON", 0, "tab_button");
        TAB_BUTTON = enumC696460RTo;
        EnumC696460RTo enumC696460RTo2 = new EnumC696460RTo("MANAGE", 1, "manage");
        MANAGE = enumC696460RTo2;
        EnumC696460RTo[] enumC696460RToArr = {enumC696460RTo, enumC696460RTo2};
        LLILLJJLI = enumC696460RToArr;
        LLILLL = new C2254308sP(enumC696460RToArr);
    }

    public static EnumC696460RTo[] values() {
        return (EnumC696460RTo[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC696460RTo valueOf(String str) {
        return (EnumC696460RTo) C08FF.LIZ(EnumC696460RTo.class, str);
    }

    public EnumC696460RTo(String str, int i, String str2) {
        this.LL = str2;
    }
}
