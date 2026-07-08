package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07px, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1984307px {
    public static final C1984407py Companion;
    public static final /* synthetic */ EnumC1984307px[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1984307px NONE_TTM;
    public static final EnumC1984307px TTM;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1984307px> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.07py] */
    static {
        EnumC1984307px enumC1984307px = new EnumC1984307px("NONE_TTM", 0, 1);
        NONE_TTM = enumC1984307px;
        EnumC1984307px enumC1984307px2 = new EnumC1984307px("TTM", 1, 2);
        TTM = enumC1984307px2;
        EnumC1984307px[] enumC1984307pxArr = {enumC1984307px, enumC1984307px2};
        LLILLJJLI = enumC1984307pxArr;
        LLILLL = new C2254308sP(enumC1984307pxArr);
        Companion = new Object() { // from class: X.07py
        };
    }

    public static EnumC1984307px[] values() {
        return (EnumC1984307px[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1984307px valueOf(String str) {
        return (EnumC1984307px) C08FF.LIZ(EnumC1984307px.class, str);
    }

    public EnumC1984307px(String str, int i, int i2) {
        this.LL = i2;
    }
}
