package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0orE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1489260orE {
    public static final EnumC1489260orE ADJACENCY;
    public static final EnumC1489260orE DISTINCT_CHAR;
    public static final EnumC1489260orE LENGTH_BOOSTER;
    public static final /* synthetic */ EnumC1489260orE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1489260orE MINIMUM_LENGTH;
    public static final EnumC1489260orE VARIETY;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1489260orE> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1489260orE enumC1489260orE = new EnumC1489260orE("MINIMUM_LENGTH", 0, 1);
        MINIMUM_LENGTH = enumC1489260orE;
        EnumC1489260orE enumC1489260orE2 = new EnumC1489260orE("DISTINCT_CHAR", 1, 3);
        DISTINCT_CHAR = enumC1489260orE2;
        EnumC1489260orE enumC1489260orE3 = new EnumC1489260orE("ADJACENCY", 2, 4);
        ADJACENCY = enumC1489260orE3;
        EnumC1489260orE enumC1489260orE4 = new EnumC1489260orE("VARIETY", 3, 5);
        VARIETY = enumC1489260orE4;
        EnumC1489260orE enumC1489260orE5 = new EnumC1489260orE("LENGTH_BOOSTER", 4, 6);
        LENGTH_BOOSTER = enumC1489260orE5;
        EnumC1489260orE[] enumC1489260orEArr = {enumC1489260orE, enumC1489260orE2, enumC1489260orE3, enumC1489260orE4, enumC1489260orE5};
        LLILLJJLI = enumC1489260orEArr;
        LLILLL = new C2254308sP(enumC1489260orEArr);
    }

    public static EnumC1489260orE[] values() {
        return (EnumC1489260orE[]) LLILLJJLI.clone();
    }

    public final int getOrder() {
        return this.LL;
    }

    public static EnumC1489260orE valueOf(String str) {
        return (EnumC1489260orE) C08FF.LIZ(EnumC1489260orE.class, str);
    }

    public EnumC1489260orE(String str, int i, int i2) {
        this.LL = i2;
    }
}
