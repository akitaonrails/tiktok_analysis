package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YAr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC869910YAr {
    public static final EnumC869910YAr COLUMN_REGION_NAME;
    public static final /* synthetic */ EnumC869910YAr[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public final String LL = "region_name";
    public final String LLILLJJLI = "TEXT UNIQUE";

    public static InterfaceC2044707zh<EnumC869910YAr> getEntries() {
        return LLILZ;
    }

    static {
        EnumC869910YAr enumC869910YAr = new EnumC869910YAr();
        COLUMN_REGION_NAME = enumC869910YAr;
        EnumC869910YAr[] enumC869910YArArr = {enumC869910YAr};
        LLILLL = enumC869910YArArr;
        LLILZ = new C2254308sP(enumC869910YArArr);
    }

    public static EnumC869910YAr[] values() {
        return (EnumC869910YAr[]) LLILLL.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public final String getType() {
        return this.LLILLJJLI;
    }

    public static EnumC869910YAr valueOf(String str) {
        return (EnumC869910YAr) C08FF.LIZ(EnumC869910YAr.class, str);
    }
}
