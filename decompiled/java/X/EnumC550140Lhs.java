package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Lhs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC550140Lhs {
    public static final /* synthetic */ EnumC550140Lhs[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC550140Lhs OTHERS;
    public static final EnumC550140Lhs SUBMIT_WORKFLOW_FAILED;
    public static final EnumC550140Lhs TNS_INTERCEPT;
    public static final EnumC550140Lhs UPLOAD_PHOTO_FAILED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC550140Lhs> getEntries() {
        return LLILLL;
    }

    static {
        EnumC550140Lhs enumC550140Lhs = new EnumC550140Lhs("OTHERS", 0, 0);
        OTHERS = enumC550140Lhs;
        EnumC550140Lhs enumC550140Lhs2 = new EnumC550140Lhs("TNS_INTERCEPT", 1, 1);
        TNS_INTERCEPT = enumC550140Lhs2;
        EnumC550140Lhs enumC550140Lhs3 = new EnumC550140Lhs("SUBMIT_WORKFLOW_FAILED", 2, 2);
        SUBMIT_WORKFLOW_FAILED = enumC550140Lhs3;
        EnumC550140Lhs enumC550140Lhs4 = new EnumC550140Lhs("UPLOAD_PHOTO_FAILED", 3, 3);
        UPLOAD_PHOTO_FAILED = enumC550140Lhs4;
        EnumC550140Lhs[] enumC550140LhsArr = {enumC550140Lhs, enumC550140Lhs2, enumC550140Lhs3, enumC550140Lhs4};
        LLILLJJLI = enumC550140LhsArr;
        LLILLL = new C2254308sP(enumC550140LhsArr);
    }

    public static EnumC550140Lhs[] values() {
        return (EnumC550140Lhs[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC550140Lhs valueOf(String str) {
        return (EnumC550140Lhs) C08FF.LIZ(EnumC550140Lhs.class, str);
    }

    public EnumC550140Lhs(String str, int i, int i2) {
        this.LL = i2;
    }
}
