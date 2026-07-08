package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Sut, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC736570Sut {
    public static final /* synthetic */ EnumC736570Sut[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC736570Sut MUTUAL_FOLLOW;
    public static final EnumC736570Sut REQUESTED;
    public static final EnumC736570Sut SINGLE_FOLLOW;
    public static final EnumC736570Sut SINGLE_FOLLOWED;
    public static final EnumC736570Sut UNFOLLOW;
    public final int LL;

    public static InterfaceC2044707zh<EnumC736570Sut> getEntries() {
        return LLILLL;
    }

    static {
        EnumC736570Sut enumC736570Sut = new EnumC736570Sut("UNFOLLOW", 0, 0);
        UNFOLLOW = enumC736570Sut;
        EnumC736570Sut enumC736570Sut2 = new EnumC736570Sut("SINGLE_FOLLOW", 1, 1);
        SINGLE_FOLLOW = enumC736570Sut2;
        EnumC736570Sut enumC736570Sut3 = new EnumC736570Sut("MUTUAL_FOLLOW", 2, 2);
        MUTUAL_FOLLOW = enumC736570Sut3;
        EnumC736570Sut enumC736570Sut4 = new EnumC736570Sut("SINGLE_FOLLOWED", 3, 3);
        SINGLE_FOLLOWED = enumC736570Sut4;
        EnumC736570Sut enumC736570Sut5 = new EnumC736570Sut("REQUESTED", 4, 4);
        REQUESTED = enumC736570Sut5;
        EnumC736570Sut[] enumC736570SutArr = {enumC736570Sut, enumC736570Sut2, enumC736570Sut3, enumC736570Sut4, enumC736570Sut5};
        LLILLJJLI = enumC736570SutArr;
        LLILLL = new C2254308sP(enumC736570SutArr);
    }

    public static EnumC736570Sut[] values() {
        return (EnumC736570Sut[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC736570Sut valueOf(String str) {
        return (EnumC736570Sut) C08FF.LIZ(EnumC736570Sut.class, str);
    }

    public EnumC736570Sut(String str, int i, int i2) {
        this.LL = i2;
    }
}
