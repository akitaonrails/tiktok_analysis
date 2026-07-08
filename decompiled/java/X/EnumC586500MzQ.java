package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MzQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC586500MzQ {
    public static final /* synthetic */ EnumC586500MzQ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC586500MzQ NONE;
    public static final EnumC586500MzQ STYLE1;
    public static final EnumC586500MzQ STYLE2;
    public final int LL;

    public static InterfaceC2044707zh<EnumC586500MzQ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC586500MzQ enumC586500MzQ = new EnumC586500MzQ("NONE", 0, 0);
        NONE = enumC586500MzQ;
        EnumC586500MzQ enumC586500MzQ2 = new EnumC586500MzQ("STYLE1", 1, 1);
        STYLE1 = enumC586500MzQ2;
        EnumC586500MzQ enumC586500MzQ3 = new EnumC586500MzQ("STYLE2", 2, 2);
        STYLE2 = enumC586500MzQ3;
        EnumC586500MzQ[] enumC586500MzQArr = {enumC586500MzQ, enumC586500MzQ2, enumC586500MzQ3};
        LLILLJJLI = enumC586500MzQArr;
        LLILLL = new C2254308sP(enumC586500MzQArr);
    }

    public static EnumC586500MzQ[] values() {
        return (EnumC586500MzQ[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC586500MzQ valueOf(String str) {
        return (EnumC586500MzQ) C08FF.LIZ(EnumC586500MzQ.class, str);
    }

    public EnumC586500MzQ(String str, int i, int i2) {
        this.LL = i2;
    }
}
