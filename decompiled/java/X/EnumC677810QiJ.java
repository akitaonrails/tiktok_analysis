package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QiJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC677810QiJ {
    public static final /* synthetic */ EnumC677810QiJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC677810QiJ PAGE_STATE_CARE;
    public static final EnumC677810QiJ PAGE_STATE_NORMAL;
    public static final EnumC677810QiJ PAGE_STATE_NO_RESULT;
    public static final EnumC677810QiJ PAGE_STATE_PROHIBIT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC677810QiJ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC677810QiJ enumC677810QiJ = new EnumC677810QiJ("PAGE_STATE_NORMAL", 0, 0);
        PAGE_STATE_NORMAL = enumC677810QiJ;
        EnumC677810QiJ enumC677810QiJ2 = new EnumC677810QiJ("PAGE_STATE_NO_RESULT", 1, 1);
        PAGE_STATE_NO_RESULT = enumC677810QiJ2;
        EnumC677810QiJ enumC677810QiJ3 = new EnumC677810QiJ("PAGE_STATE_PROHIBIT", 2, 2);
        PAGE_STATE_PROHIBIT = enumC677810QiJ3;
        EnumC677810QiJ enumC677810QiJ4 = new EnumC677810QiJ("PAGE_STATE_CARE", 3, 3);
        PAGE_STATE_CARE = enumC677810QiJ4;
        EnumC677810QiJ[] enumC677810QiJArr = {enumC677810QiJ, enumC677810QiJ2, enumC677810QiJ3, enumC677810QiJ4};
        LLILLJJLI = enumC677810QiJArr;
        LLILLL = new C2254308sP(enumC677810QiJArr);
    }

    public static EnumC677810QiJ[] values() {
        return (EnumC677810QiJ[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC677810QiJ valueOf(String str) {
        return (EnumC677810QiJ) C08FF.LIZ(EnumC677810QiJ.class, str);
    }

    public EnumC677810QiJ(String str, int i, int i2) {
        this.LL = i2;
    }
}
