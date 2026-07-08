package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00zQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC259400zQ {
    public static final EnumC259400zQ LL;
    public static final EnumC259400zQ LLILLJJLI;
    public static final EnumC259400zQ LLILLL;
    public static final EnumC259400zQ LLILZ;
    public static final /* synthetic */ EnumC259400zQ[] LLILZIL;

    static {
        EnumC259400zQ enumC259400zQ = new EnumC259400zQ("ONGOING", 0);
        LL = enumC259400zQ;
        EnumC259400zQ enumC259400zQ2 = new EnumC259400zQ("STOPBETTING", 1);
        LLILLJJLI = enumC259400zQ2;
        EnumC259400zQ enumC259400zQ3 = new EnumC259400zQ("RESOLVED", 2);
        LLILLL = enumC259400zQ3;
        EnumC259400zQ enumC259400zQ4 = new EnumC259400zQ("OTHER", 3);
        LLILZ = enumC259400zQ4;
        EnumC259400zQ[] enumC259400zQArr = {enumC259400zQ, enumC259400zQ2, enumC259400zQ3, enumC259400zQ4};
        LLILZIL = enumC259400zQArr;
        new C2254308sP(enumC259400zQArr);
    }

    public static EnumC259400zQ[] values() {
        return (EnumC259400zQ[]) LLILZIL.clone();
    }

    public static EnumC259400zQ valueOf(String str) {
        return (EnumC259400zQ) C08FF.LIZ(EnumC259400zQ.class, str);
    }

    public EnumC259400zQ(String str, int i) {
    }
}
