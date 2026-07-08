package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Hur, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC456270Hur {
    public static final EnumC456270Hur AVATAR;
    public static final EnumC456270Hur EMOJI;
    public static final /* synthetic */ EnumC456270Hur[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public final String LL;
    public final int LLILLJJLI;

    public static InterfaceC2044707zh<EnumC456270Hur> getEntries() {
        return LLILZ;
    }

    static {
        EnumC456270Hur enumC456270Hur = new EnumC456270Hur("EMOJI", 0, "emoji", 1);
        EMOJI = enumC456270Hur;
        EnumC456270Hur enumC456270Hur2 = new EnumC456270Hur("AVATAR", 1, "avatar", 2);
        AVATAR = enumC456270Hur2;
        EnumC456270Hur[] enumC456270HurArr = {enumC456270Hur, enumC456270Hur2};
        LLILLL = enumC456270HurArr;
        LLILZ = new C2254308sP(enumC456270HurArr);
    }

    public static EnumC456270Hur[] values() {
        return (EnumC456270Hur[]) LLILLL.clone();
    }

    public final int getEtNumber() {
        return this.LLILLJJLI;
    }

    public final String getEtString() {
        return this.LL;
    }

    public static EnumC456270Hur valueOf(String str) {
        return (EnumC456270Hur) C08FF.LIZ(EnumC456270Hur.class, str);
    }

    public EnumC456270Hur(String str, int i, String str2, int i2) {
        this.LL = str2;
        this.LLILLJJLI = i2;
    }
}
