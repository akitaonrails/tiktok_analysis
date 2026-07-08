package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Da9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC341510Da9 {
    public static final EnumC341510Da9 BOTTOM_TOAST;
    public static final /* synthetic */ EnumC341510Da9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC341510Da9 TOP_TOAST;
    public final String LL;

    public static InterfaceC2044707zh<EnumC341510Da9> getEntries() {
        return LLILLL;
    }

    static {
        EnumC341510Da9 enumC341510Da9 = new EnumC341510Da9("TOP_TOAST", 0, "top_toast");
        TOP_TOAST = enumC341510Da9;
        EnumC341510Da9 enumC341510Da92 = new EnumC341510Da9("BOTTOM_TOAST", 1, "bottom_toast");
        BOTTOM_TOAST = enumC341510Da92;
        EnumC341510Da9[] enumC341510Da9Arr = {enumC341510Da9, enumC341510Da92};
        LLILLJJLI = enumC341510Da9Arr;
        LLILLL = new C2254308sP(enumC341510Da9Arr);
    }

    public static EnumC341510Da9[] values() {
        return (EnumC341510Da9[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC341510Da9 valueOf(String str) {
        return (EnumC341510Da9) C08FF.LIZ(EnumC341510Da9.class, str);
    }

    public EnumC341510Da9(String str, int i, String str2) {
        this.LL = str2;
    }
}
