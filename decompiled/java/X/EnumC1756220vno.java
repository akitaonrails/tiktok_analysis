package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vno, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1756220vno {
    public static final EnumC1756220vno BLOCK;
    public static final /* synthetic */ EnumC1756220vno[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1756220vno NOT_EXIT;
    public static final EnumC1756220vno OTHER_ERROR;
    public static final EnumC1756220vno REGION_ERROR;
    public static final EnumC1756220vno REGION_UNAVAILABLE;
    public static final EnumC1756220vno UNDER_AGE_GATE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1756220vno> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1756220vno enumC1756220vno = new EnumC1756220vno("OTHER_ERROR", 0, "other_error");
        OTHER_ERROR = enumC1756220vno;
        EnumC1756220vno enumC1756220vno2 = new EnumC1756220vno("REGION_ERROR", 1, "region_error");
        REGION_ERROR = enumC1756220vno2;
        EnumC1756220vno enumC1756220vno3 = new EnumC1756220vno("NOT_EXIT", 2, "not_exit");
        NOT_EXIT = enumC1756220vno3;
        EnumC1756220vno enumC1756220vno4 = new EnumC1756220vno("REGION_UNAVAILABLE", 3, "region_unavailable");
        REGION_UNAVAILABLE = enumC1756220vno4;
        EnumC1756220vno enumC1756220vno5 = new EnumC1756220vno("BLOCK", 4, "block");
        BLOCK = enumC1756220vno5;
        EnumC1756220vno enumC1756220vno6 = new EnumC1756220vno("UNDER_AGE_GATE", 5, "under_age_gate");
        UNDER_AGE_GATE = enumC1756220vno6;
        EnumC1756220vno[] enumC1756220vnoArr = {enumC1756220vno, enumC1756220vno2, enumC1756220vno3, enumC1756220vno4, enumC1756220vno5, enumC1756220vno6};
        LLILLJJLI = enumC1756220vnoArr;
        LLILLL = new C2254308sP(enumC1756220vnoArr);
    }

    public static EnumC1756220vno[] values() {
        return (EnumC1756220vno[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1756220vno valueOf(String str) {
        return (EnumC1756220vno) C08FF.LIZ(EnumC1756220vno.class, str);
    }

    public EnumC1756220vno(String str, int i, String str2) {
        this.LL = str2;
    }
}
