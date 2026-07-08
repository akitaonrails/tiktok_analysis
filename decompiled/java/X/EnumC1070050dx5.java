package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dx5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1070050dx5 {
    public static final EnumC1070050dx5 FOLLOWING;
    public static final EnumC1070050dx5 FRIENDS;
    public static final /* synthetic */ EnumC1070050dx5[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1070050dx5 MAF;
    public static final EnumC1070050dx5 MORE_FRIENDS;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1070050dx5> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1070050dx5 enumC1070050dx5 = new EnumC1070050dx5("FRIENDS", 0, 2131838430, "friends");
        FRIENDS = enumC1070050dx5;
        EnumC1070050dx5 enumC1070050dx52 = new EnumC1070050dx5("FOLLOWING", 1, 2131838429, "following");
        FOLLOWING = enumC1070050dx52;
        EnumC1070050dx5 enumC1070050dx53 = new EnumC1070050dx5("MAF", 2, 2131838432, "maf");
        MAF = enumC1070050dx53;
        EnumC1070050dx5 enumC1070050dx54 = new EnumC1070050dx5("MORE_FRIENDS", 3, 2131838431, "find_more");
        MORE_FRIENDS = enumC1070050dx54;
        EnumC1070050dx5[] enumC1070050dx5Arr = {enumC1070050dx5, enumC1070050dx52, enumC1070050dx53, enumC1070050dx54};
        LLILLL = enumC1070050dx5Arr;
        LLILZ = new C2254308sP(enumC1070050dx5Arr);
    }

    public static EnumC1070050dx5[] values() {
        return (EnumC1070050dx5[]) LLILLL.clone();
    }

    public final int getTextRes() {
        return this.LL;
    }

    public final String getTrackName() {
        return this.LLILLJJLI;
    }

    public static EnumC1070050dx5 valueOf(String str) {
        return (EnumC1070050dx5) C08FF.LIZ(EnumC1070050dx5.class, str);
    }

    public EnumC1070050dx5(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
