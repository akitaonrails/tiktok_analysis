package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MzP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC586490MzP {
    public static final /* synthetic */ EnumC586490MzP[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC586490MzP NONE;
    public static final EnumC586490MzP Style1;
    public static final EnumC586490MzP Style2;
    public final int LL;

    public static InterfaceC2044707zh<EnumC586490MzP> getEntries() {
        return LLILLL;
    }

    static {
        EnumC586490MzP enumC586490MzP = new EnumC586490MzP("NONE", 0, 0);
        NONE = enumC586490MzP;
        EnumC586490MzP enumC586490MzP2 = new EnumC586490MzP("Style1", 1, 1);
        Style1 = enumC586490MzP2;
        EnumC586490MzP enumC586490MzP3 = new EnumC586490MzP("Style2", 2, 2);
        Style2 = enumC586490MzP3;
        EnumC586490MzP[] enumC586490MzPArr = {enumC586490MzP, enumC586490MzP2, enumC586490MzP3};
        LLILLJJLI = enumC586490MzPArr;
        LLILLL = new C2254308sP(enumC586490MzPArr);
    }

    public static EnumC586490MzP[] values() {
        return (EnumC586490MzP[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC586490MzP valueOf(String str) {
        return (EnumC586490MzP) C08FF.LIZ(EnumC586490MzP.class, str);
    }

    public EnumC586490MzP(String str, int i, int i2) {
        this.LL = i2;
    }
}
