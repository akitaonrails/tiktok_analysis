package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0VQv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC797670VQv {
    public static final EnumC797670VQv ASC;
    public static final EnumC797670VQv DESC;
    public static final /* synthetic */ EnumC797670VQv[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC797670VQv> getEntries() {
        return LLILLL;
    }

    static {
        EnumC797670VQv enumC797670VQv = new EnumC797670VQv("DESC", 0, 1);
        DESC = enumC797670VQv;
        EnumC797670VQv enumC797670VQv2 = new EnumC797670VQv("ASC", 1, 2);
        ASC = enumC797670VQv2;
        EnumC797670VQv[] enumC797670VQvArr = {enumC797670VQv, enumC797670VQv2};
        LLILLJJLI = enumC797670VQvArr;
        LLILLL = new C2254308sP(enumC797670VQvArr);
    }

    public static EnumC797670VQv[] values() {
        return (EnumC797670VQv[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC797670VQv valueOf(String str) {
        return (EnumC797670VQv) C08FF.LIZ(EnumC797670VQv.class, str);
    }

    public EnumC797670VQv(String str, int i, int i2) {
        this.LL = i2;
    }
}
