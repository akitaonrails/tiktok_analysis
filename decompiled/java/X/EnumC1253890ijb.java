package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ijb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1253890ijb {
    public static final EnumC1253890ijb BUBBLE_DOT;
    public static final EnumC1253890ijb GRAY_DOT;
    public static final EnumC1253890ijb GRAY_NUMBER_DOT;
    public static final /* synthetic */ EnumC1253890ijb[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1253890ijb NORMAL;
    public static final EnumC1253890ijb NUMBER;
    public static final EnumC1253890ijb SPECIAL;
    public static final EnumC1253890ijb SPECIAL_NUMBER;
    public static final EnumC1253890ijb TEXT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1253890ijb> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1253890ijb enumC1253890ijb = new EnumC1253890ijb("NORMAL", 0, "reddot");
        NORMAL = enumC1253890ijb;
        EnumC1253890ijb enumC1253890ijb2 = new EnumC1253890ijb("TEXT", 1, "text_reddot");
        TEXT = enumC1253890ijb2;
        EnumC1253890ijb enumC1253890ijb3 = new EnumC1253890ijb("NUMBER", 2, "number_reddot");
        NUMBER = enumC1253890ijb3;
        EnumC1253890ijb enumC1253890ijb4 = new EnumC1253890ijb("SPECIAL", 3, "special_reddot");
        SPECIAL = enumC1253890ijb4;
        EnumC1253890ijb enumC1253890ijb5 = new EnumC1253890ijb("SPECIAL_NUMBER", 4, "special_number_reddot");
        SPECIAL_NUMBER = enumC1253890ijb5;
        EnumC1253890ijb enumC1253890ijb6 = new EnumC1253890ijb("GRAY_DOT", 5, "graydot");
        GRAY_DOT = enumC1253890ijb6;
        EnumC1253890ijb enumC1253890ijb7 = new EnumC1253890ijb("GRAY_NUMBER_DOT", 6, "number_graydot");
        GRAY_NUMBER_DOT = enumC1253890ijb7;
        EnumC1253890ijb enumC1253890ijb8 = new EnumC1253890ijb("BUBBLE_DOT", 7, "bubble_reddot");
        BUBBLE_DOT = enumC1253890ijb8;
        EnumC1253890ijb[] enumC1253890ijbArr = {enumC1253890ijb, enumC1253890ijb2, enumC1253890ijb3, enumC1253890ijb4, enumC1253890ijb5, enumC1253890ijb6, enumC1253890ijb7, enumC1253890ijb8};
        LLILLJJLI = enumC1253890ijbArr;
        LLILLL = new C2254308sP(enumC1253890ijbArr);
    }

    public static EnumC1253890ijb[] values() {
        return (EnumC1253890ijb[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1253890ijb valueOf(String str) {
        return (EnumC1253890ijb) C08FF.LIZ(EnumC1253890ijb.class, str);
    }

    public EnumC1253890ijb(String str, int i, String str2) {
        this.LL = str2;
    }
}
