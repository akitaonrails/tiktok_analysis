package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0l2R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1342450l2R {
    public static final EnumC1342450l2R CREATOR_SORT;
    public static final EnumC1342450l2R DEFAULT_SORT;
    public static final /* synthetic */ EnumC1342450l2R[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1342450l2R MEDIA_SORT;
    public static final EnumC1342450l2R TIME_SORT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1342450l2R> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1342450l2R enumC1342450l2R = new EnumC1342450l2R("DEFAULT_SORT", 0, 0);
        DEFAULT_SORT = enumC1342450l2R;
        EnumC1342450l2R enumC1342450l2R2 = new EnumC1342450l2R("TIME_SORT", 1, 1);
        TIME_SORT = enumC1342450l2R2;
        EnumC1342450l2R enumC1342450l2R3 = new EnumC1342450l2R("MEDIA_SORT", 2, 2);
        MEDIA_SORT = enumC1342450l2R3;
        EnumC1342450l2R enumC1342450l2R4 = new EnumC1342450l2R("CREATOR_SORT", 3, 3);
        CREATOR_SORT = enumC1342450l2R4;
        EnumC1342450l2R[] enumC1342450l2RArr = {enumC1342450l2R, enumC1342450l2R2, enumC1342450l2R3, enumC1342450l2R4};
        LLILLJJLI = enumC1342450l2RArr;
        LLILLL = new C2254308sP(enumC1342450l2RArr);
    }

    public static EnumC1342450l2R[] values() {
        return (EnumC1342450l2R[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1342450l2R valueOf(String str) {
        return (EnumC1342450l2R) C08FF.LIZ(EnumC1342450l2R.class, str);
    }

    public EnumC1342450l2R(String str, int i, int i2) {
        this.LL = i2;
    }
}
