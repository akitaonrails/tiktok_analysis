package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10pX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19365310pX {
    public static final EnumC19365310pX LL;
    public static final EnumC19365310pX LLILLJJLI;
    public static final EnumC19365310pX LLILLL;
    public static final /* synthetic */ EnumC19365310pX[] LLILZ;

    public static EnumC19365310pX valueOf(String str) {
        return (EnumC19365310pX) C08FF.LIZ(EnumC19365310pX.class, str);
    }

    public static EnumC19365310pX[] values() {
        return (EnumC19365310pX[]) LLILZ.clone();
    }

    static {
        EnumC19365310pX enumC19365310pX = new EnumC19365310pX("IsPlacedInLookahead", 0);
        LL = enumC19365310pX;
        EnumC19365310pX enumC19365310pX2 = new EnumC19365310pX("IsPlacedInApproach", 1);
        LLILLJJLI = enumC19365310pX2;
        EnumC19365310pX enumC19365310pX3 = new EnumC19365310pX("IsNotPlaced", 2);
        LLILLL = enumC19365310pX3;
        EnumC19365310pX[] enumC19365310pXArr = {enumC19365310pX, enumC19365310pX2, enumC19365310pX3};
        LLILZ = enumC19365310pXArr;
        new C2254308sP(enumC19365310pXArr);
    }

    public EnumC19365310pX(String str, int i) {
    }
}
