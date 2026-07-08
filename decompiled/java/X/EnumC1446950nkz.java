package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0nkz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1446950nkz {
    public static final EnumC1446950nkz EXTERN_SHARE;
    public static final /* synthetic */ EnumC1446950nkz[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1446950nkz META_CONTAIN_AUTO_AIGC;
    public static final EnumC1446950nkz UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1446950nkz> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1446950nkz enumC1446950nkz = new EnumC1446950nkz("UNKNOWN", 0, "unknown");
        UNKNOWN = enumC1446950nkz;
        EnumC1446950nkz enumC1446950nkz2 = new EnumC1446950nkz("META_CONTAIN_AUTO_AIGC", 1, "meta_contain_auto_aigc");
        META_CONTAIN_AUTO_AIGC = enumC1446950nkz2;
        EnumC1446950nkz enumC1446950nkz3 = new EnumC1446950nkz("EXTERN_SHARE", 2, "extern_share");
        EXTERN_SHARE = enumC1446950nkz3;
        EnumC1446950nkz[] enumC1446950nkzArr = {enumC1446950nkz, enumC1446950nkz2, enumC1446950nkz3};
        LLILLJJLI = enumC1446950nkzArr;
        LLILLL = new C2254308sP(enumC1446950nkzArr);
    }

    public static EnumC1446950nkz[] values() {
        return (EnumC1446950nkz[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1446950nkz valueOf(String str) {
        return (EnumC1446950nkz) C08FF.LIZ(EnumC1446950nkz.class, str);
    }

    public EnumC1446950nkz(String str, int i, String str2) {
        this.LL = str2;
    }
}
