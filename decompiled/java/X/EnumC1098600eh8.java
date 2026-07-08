package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eh8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1098600eh8 {
    public static final EnumC1098600eh8 COLLAPSE;
    public static final EnumC1098600eh8 COLLAPSING;
    public static final EnumC1098600eh8 EXPAND;
    public static final EnumC1098600eh8 EXPANDING;
    public static final /* synthetic */ EnumC1098600eh8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1098600eh8> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1098600eh8 enumC1098600eh8 = new EnumC1098600eh8("EXPAND", 0);
        EXPAND = enumC1098600eh8;
        EnumC1098600eh8 enumC1098600eh82 = new EnumC1098600eh8("COLLAPSE", 1);
        COLLAPSE = enumC1098600eh82;
        EnumC1098600eh8 enumC1098600eh83 = new EnumC1098600eh8("EXPANDING", 2);
        EXPANDING = enumC1098600eh83;
        EnumC1098600eh8 enumC1098600eh84 = new EnumC1098600eh8("COLLAPSING", 3);
        COLLAPSING = enumC1098600eh84;
        EnumC1098600eh8[] enumC1098600eh8Arr = {enumC1098600eh8, enumC1098600eh82, enumC1098600eh83, enumC1098600eh84};
        LL = enumC1098600eh8Arr;
        LLILLJJLI = new C2254308sP(enumC1098600eh8Arr);
    }

    public static EnumC1098600eh8[] values() {
        return (EnumC1098600eh8[]) LL.clone();
    }

    public static EnumC1098600eh8 valueOf(String str) {
        return (EnumC1098600eh8) C08FF.LIZ(EnumC1098600eh8.class, str);
    }

    public EnumC1098600eh8(String str, int i) {
    }
}
