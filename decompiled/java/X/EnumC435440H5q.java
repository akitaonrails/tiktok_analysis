package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0H5q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC435440H5q {
    public static final EnumC435440H5q FIVE_LINES;
    public static final /* synthetic */ EnumC435440H5q[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC435440H5q NO_LIMIT;
    public static final EnumC435440H5q THREE_LINES;
    public static final EnumC435440H5q TWO_LINES;
    public final int LL;

    public static InterfaceC2044707zh<EnumC435440H5q> getEntries() {
        return LLILLL;
    }

    static {
        EnumC435440H5q enumC435440H5q = new EnumC435440H5q("TWO_LINES", 0, 2);
        TWO_LINES = enumC435440H5q;
        EnumC435440H5q enumC435440H5q2 = new EnumC435440H5q("THREE_LINES", 1, 3);
        THREE_LINES = enumC435440H5q2;
        EnumC435440H5q enumC435440H5q3 = new EnumC435440H5q("FIVE_LINES", 2, 5);
        FIVE_LINES = enumC435440H5q3;
        EnumC435440H5q enumC435440H5q4 = new EnumC435440H5q("NO_LIMIT", 3, Integer.MAX_VALUE);
        NO_LIMIT = enumC435440H5q4;
        EnumC435440H5q[] enumC435440H5qArr = {enumC435440H5q, enumC435440H5q2, enumC435440H5q3, enumC435440H5q4};
        LLILLJJLI = enumC435440H5qArr;
        LLILLL = new C2254308sP(enumC435440H5qArr);
    }

    public static EnumC435440H5q[] values() {
        return (EnumC435440H5q[]) LLILLJJLI.clone();
    }

    public final int getLines() {
        return this.LL;
    }

    public static EnumC435440H5q valueOf(String str) {
        return (EnumC435440H5q) C08FF.LIZ(EnumC435440H5q.class, str);
    }

    public EnumC435440H5q(String str, int i, int i2) {
        this.LL = i2;
    }
}
