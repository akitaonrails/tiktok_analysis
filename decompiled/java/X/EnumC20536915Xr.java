package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15Xr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20536915Xr implements C15YM {
    public static final EnumC20536915Xr DIGITAL_WELLBEING_CHANGED;
    public static final EnumC20536915Xr FAMILY_PARING_CHANGED;
    public static final /* synthetic */ EnumC20536915Xr[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC20536915Xr USER_DETAIL_INFO_CHANGED;
    public final String LL;
    public final EnumC20106513ln LLILLJJLI;

    public static InterfaceC2044707zh<EnumC20536915Xr> getEntries() {
        return LLILZ;
    }

    static {
        EnumC20106513ln enumC20106513ln = EnumC20106513ln.BOOLEAN;
        EnumC20536915Xr enumC20536915Xr = new EnumC20536915Xr("FAMILY_PARING_CHANGED", 0, "family_paring_changed", enumC20106513ln);
        FAMILY_PARING_CHANGED = enumC20536915Xr;
        EnumC20536915Xr enumC20536915Xr2 = new EnumC20536915Xr("DIGITAL_WELLBEING_CHANGED", 1, "digit_wellbeing_changed", enumC20106513ln);
        DIGITAL_WELLBEING_CHANGED = enumC20536915Xr2;
        EnumC20536915Xr enumC20536915Xr3 = new EnumC20536915Xr("USER_DETAIL_INFO_CHANGED", 2, "user_detail_info_changed", enumC20106513ln);
        USER_DETAIL_INFO_CHANGED = enumC20536915Xr3;
        EnumC20536915Xr[] enumC20536915XrArr = {enumC20536915Xr, enumC20536915Xr2, enumC20536915Xr3};
        LLILLL = enumC20536915XrArr;
        LLILZ = new C2254308sP(enumC20536915XrArr);
    }

    public static EnumC20536915Xr[] values() {
        return (EnumC20536915Xr[]) LLILLL.clone();
    }

    @Override // X.C15YM
    public String getKey() {
        return this.LL;
    }

    @Override // X.C15YM
    public EnumC20106513ln getType() {
        return this.LLILLJJLI;
    }

    public static EnumC20536915Xr valueOf(String str) {
        return (EnumC20536915Xr) C08FF.LIZ(EnumC20536915Xr.class, str);
    }

    public EnumC20536915Xr(String str, int i, String str2, EnumC20106513ln enumC20106513ln) {
        this.LL = str2;
        this.LLILLJJLI = enumC20106513ln;
    }
}
