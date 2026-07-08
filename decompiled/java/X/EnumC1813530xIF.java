package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0xIF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1813530xIF {
    public static final C1813450xI7 Companion;
    public static final EnumC1813530xIF FRIENDS;
    public static final /* synthetic */ EnumC1813530xIF[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC1813530xIF ONLY_ME;
    public static final EnumC1813530xIF PUBLIC;
    public final String LL;
    public final int LLILLJJLI;
    public final String LLILLL;

    public static InterfaceC2044707zh<EnumC1813530xIF> getEntries() {
        return LLILZIL;
    }

    static {
        EnumC1813530xIF enumC1813530xIF = new EnumC1813530xIF(0, 0, "PUBLIC", C497740JfY.LJIJI(2131829276), "auto_public_open");
        PUBLIC = enumC1813530xIF;
        EnumC1813530xIF enumC1813530xIF2 = new EnumC1813530xIF(1, 2, "FRIENDS", C497740JfY.LJIJI(2131829278), "auto_friends_open");
        FRIENDS = enumC1813530xIF2;
        EnumC1813530xIF enumC1813530xIF3 = new EnumC1813530xIF(2, 1, "ONLY_ME", C497740JfY.LJIJI(2131829280), "auto_onlyme_open");
        ONLY_ME = enumC1813530xIF3;
        EnumC1813530xIF[] enumC1813530xIFArr = {enumC1813530xIF, enumC1813530xIF2, enumC1813530xIF3};
        LLILZ = enumC1813530xIFArr;
        LLILZIL = new C2254308sP(enumC1813530xIFArr);
        Companion = new C1813450xI7();
    }

    public static EnumC1813530xIF[] values() {
        return (EnumC1813530xIF[]) LLILZ.clone();
    }

    public final String getLabel() {
        return this.LL;
    }

    public final String getLogName() {
        return this.LLILLL;
    }

    public final int getValue() {
        return this.LLILLJJLI;
    }

    public static EnumC1813530xIF valueOf(String str) {
        return (EnumC1813530xIF) C08FF.LIZ(EnumC1813530xIF.class, str);
    }

    public EnumC1813530xIF(int i, int i2, String str, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = i2;
        this.LLILLL = str3;
    }
}
