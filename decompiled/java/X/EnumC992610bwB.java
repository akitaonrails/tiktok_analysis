package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992610bwB {
    public static final /* synthetic */ EnumC992610bwB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC992610bwB MULTI_TEMPLATE;
    public static final EnumC992610bwB SINGLE_TEMPLATE_1_LINE;
    public static final EnumC992610bwB SINGLE_TEMPLATE_2_LINE;
    public static final EnumC992610bwB SINGLE_TEMPLATE_NO_SUBTITLE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC992610bwB> getEntries() {
        return LLILLL;
    }

    static {
        EnumC992610bwB enumC992610bwB = new EnumC992610bwB("SINGLE_TEMPLATE_NO_SUBTITLE", 0, 360);
        SINGLE_TEMPLATE_NO_SUBTITLE = enumC992610bwB;
        EnumC992610bwB enumC992610bwB2 = new EnumC992610bwB("SINGLE_TEMPLATE_1_LINE", 1, 384);
        SINGLE_TEMPLATE_1_LINE = enumC992610bwB2;
        EnumC992610bwB enumC992610bwB3 = new EnumC992610bwB("SINGLE_TEMPLATE_2_LINE", 2, 404);
        SINGLE_TEMPLATE_2_LINE = enumC992610bwB3;
        EnumC992610bwB enumC992610bwB4 = new EnumC992610bwB("MULTI_TEMPLATE", 3, 410);
        MULTI_TEMPLATE = enumC992610bwB4;
        EnumC992610bwB[] enumC992610bwBArr = {enumC992610bwB, enumC992610bwB2, enumC992610bwB3, enumC992610bwB4};
        LLILLJJLI = enumC992610bwBArr;
        LLILLL = new C2254308sP(enumC992610bwBArr);
    }

    public static EnumC992610bwB[] values() {
        return (EnumC992610bwB[]) LLILLJJLI.clone();
    }

    public final int getHeight() {
        return this.LL;
    }

    public static EnumC992610bwB valueOf(String str) {
        return (EnumC992610bwB) C08FF.LIZ(EnumC992610bwB.class, str);
    }

    public EnumC992610bwB(String str, int i, int i2) {
        this.LL = i2;
    }
}
