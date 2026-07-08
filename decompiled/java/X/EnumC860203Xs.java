package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03Xs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC860203Xs {
    public static final /* synthetic */ EnumC860203Xs[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC860203Xs REFUNDABLE_SAMPLE_STATUS_NONE;
    public static final EnumC860203Xs REFUNDABLE_SAMPLE_STATUS_SELECTED;
    public static final EnumC860203Xs REFUNDABLE_SAMPLE_STATUS_UNSELECTED;
    public static final EnumC860203Xs REFUNDABLE_SAMPLE_STATUS_UNSELECTED_BY_LIMIT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC860203Xs> getEntries() {
        return LLILLL;
    }

    static {
        EnumC860203Xs enumC860203Xs = new EnumC860203Xs("REFUNDABLE_SAMPLE_STATUS_NONE", 0, 0);
        REFUNDABLE_SAMPLE_STATUS_NONE = enumC860203Xs;
        EnumC860203Xs enumC860203Xs2 = new EnumC860203Xs("REFUNDABLE_SAMPLE_STATUS_SELECTED", 1, 1);
        REFUNDABLE_SAMPLE_STATUS_SELECTED = enumC860203Xs2;
        EnumC860203Xs enumC860203Xs3 = new EnumC860203Xs("REFUNDABLE_SAMPLE_STATUS_UNSELECTED", 2, 2);
        REFUNDABLE_SAMPLE_STATUS_UNSELECTED = enumC860203Xs3;
        EnumC860203Xs enumC860203Xs4 = new EnumC860203Xs("REFUNDABLE_SAMPLE_STATUS_UNSELECTED_BY_LIMIT", 3, 3);
        REFUNDABLE_SAMPLE_STATUS_UNSELECTED_BY_LIMIT = enumC860203Xs4;
        EnumC860203Xs[] enumC860203XsArr = {enumC860203Xs, enumC860203Xs2, enumC860203Xs3, enumC860203Xs4};
        LLILLJJLI = enumC860203XsArr;
        LLILLL = new C2254308sP(enumC860203XsArr);
    }

    public static EnumC860203Xs[] values() {
        return (EnumC860203Xs[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC860203Xs valueOf(String str) {
        return (EnumC860203Xs) C08FF.LIZ(EnumC860203Xs.class, str);
    }

    public EnumC860203Xs(String str, int i, int i2) {
        this.LL = i2;
    }
}
