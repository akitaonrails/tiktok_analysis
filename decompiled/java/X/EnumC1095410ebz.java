package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ebz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1095410ebz {
    public static final EnumC1095410ebz BOTH;
    public static final /* synthetic */ EnumC1095410ebz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1095410ebz ONLY_FANS_CLUB;
    public static final EnumC1095410ebz ONLY_SUPER_FAN;

    public static InterfaceC2044707zh<EnumC1095410ebz> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1095410ebz enumC1095410ebz = new EnumC1095410ebz("ONLY_FANS_CLUB", 0);
        ONLY_FANS_CLUB = enumC1095410ebz;
        EnumC1095410ebz enumC1095410ebz2 = new EnumC1095410ebz("ONLY_SUPER_FAN", 1);
        ONLY_SUPER_FAN = enumC1095410ebz2;
        EnumC1095410ebz enumC1095410ebz3 = new EnumC1095410ebz("BOTH", 2);
        BOTH = enumC1095410ebz3;
        EnumC1095410ebz[] enumC1095410ebzArr = {enumC1095410ebz, enumC1095410ebz2, enumC1095410ebz3};
        LL = enumC1095410ebzArr;
        LLILLJJLI = new C2254308sP(enumC1095410ebzArr);
    }

    public static EnumC1095410ebz[] values() {
        return (EnumC1095410ebz[]) LL.clone();
    }

    public static EnumC1095410ebz valueOf(String str) {
        return (EnumC1095410ebz) C08FF.LIZ(EnumC1095410ebz.class, str);
    }

    public EnumC1095410ebz(String str, int i) {
    }
}
