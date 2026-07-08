package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0l1J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1341750l1J {
    public static final /* synthetic */ EnumC1341750l1J[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1341750l1J NO_LIMIT;
    public static final EnumC1341750l1J ONE_DAY;
    public static final EnumC1341750l1J SEVEN_DAYS;
    public static final EnumC1341750l1J THREE_DAYS;
    public final int LL;
    public final int LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1341750l1J> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1341750l1J enumC1341750l1J = new EnumC1341750l1J("ONE_DAY", 0, 2131829080, 86400);
        ONE_DAY = enumC1341750l1J;
        EnumC1341750l1J enumC1341750l1J2 = new EnumC1341750l1J("THREE_DAYS", 1, 2131829081, 259200);
        THREE_DAYS = enumC1341750l1J2;
        EnumC1341750l1J enumC1341750l1J3 = new EnumC1341750l1J("SEVEN_DAYS", 2, 2131829082, 604800);
        SEVEN_DAYS = enumC1341750l1J3;
        EnumC1341750l1J enumC1341750l1J4 = new EnumC1341750l1J("NO_LIMIT", 3, 2131829088, 0);
        NO_LIMIT = enumC1341750l1J4;
        EnumC1341750l1J[] enumC1341750l1JArr = {enumC1341750l1J, enumC1341750l1J2, enumC1341750l1J3, enumC1341750l1J4};
        LLILLL = enumC1341750l1JArr;
        LLILZ = new C2254308sP(enumC1341750l1JArr);
    }

    public static EnumC1341750l1J[] values() {
        return (EnumC1341750l1J[]) LLILLL.clone();
    }

    public final int getExpireSeconds() {
        return this.LLILLJJLI;
    }

    public final int getLabelRes() {
        return this.LL;
    }

    public static EnumC1341750l1J valueOf(String str) {
        return (EnumC1341750l1J) C08FF.LIZ(EnumC1341750l1J.class, str);
    }

    public EnumC1341750l1J(String str, int i, int i2, int i3) {
        this.LL = i2;
        this.LLILLJJLI = i3;
    }
}
