package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SgG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC727500SgG {
    public static final /* synthetic */ EnumC727500SgG[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC727500SgG META_DATA_NOT_EXIST;
    public final int LL = 1;
    public final String LLILLJJLI = "meta_data_not_exist";

    public static InterfaceC2044707zh<EnumC727500SgG> getEntries() {
        return LLILZ;
    }

    static {
        EnumC727500SgG enumC727500SgG = new EnumC727500SgG();
        META_DATA_NOT_EXIST = enumC727500SgG;
        EnumC727500SgG[] enumC727500SgGArr = {enumC727500SgG};
        LLILLL = enumC727500SgGArr;
        LLILZ = new C2254308sP(enumC727500SgGArr);
    }

    public static EnumC727500SgG[] values() {
        return (EnumC727500SgG[]) LLILLL.clone();
    }

    public final int getId() {
        return this.LL;
    }

    public final String getMessage() {
        return this.LLILLJJLI;
    }

    public static EnumC727500SgG valueOf(String str) {
        return (EnumC727500SgG) C08FF.LIZ(EnumC727500SgG.class, str);
    }
}
