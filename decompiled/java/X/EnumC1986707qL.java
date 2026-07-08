package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1986707qL {
    public static final EnumC1986707qL AUDIO;
    public static final EnumC1986707qL IMAGE;
    public static final /* synthetic */ EnumC1986707qL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1986707qL RICH_MD_TEXT;
    public static final EnumC1986707qL RICH_TEXT;
    public static final EnumC1986707qL TEXT;
    public static final EnumC1986707qL VIDEO;
    public final Integer LL;

    public static InterfaceC2044707zh<EnumC1986707qL> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1986707qL enumC1986707qL = new EnumC1986707qL("TEXT", 0, 0);
        TEXT = enumC1986707qL;
        EnumC1986707qL enumC1986707qL2 = new EnumC1986707qL("IMAGE", 1, 1);
        IMAGE = enumC1986707qL2;
        EnumC1986707qL enumC1986707qL3 = new EnumC1986707qL("VIDEO", 2, 2);
        VIDEO = enumC1986707qL3;
        EnumC1986707qL enumC1986707qL4 = new EnumC1986707qL("AUDIO", 3, 3);
        AUDIO = enumC1986707qL4;
        EnumC1986707qL enumC1986707qL5 = new EnumC1986707qL("RICH_TEXT", 4, 4);
        RICH_TEXT = enumC1986707qL5;
        EnumC1986707qL enumC1986707qL6 = new EnumC1986707qL("RICH_MD_TEXT", 5, 5);
        RICH_MD_TEXT = enumC1986707qL6;
        EnumC1986707qL[] enumC1986707qLArr = {enumC1986707qL, enumC1986707qL2, enumC1986707qL3, enumC1986707qL4, enumC1986707qL5, enumC1986707qL6};
        LLILLJJLI = enumC1986707qLArr;
        LLILLL = new C2254308sP(enumC1986707qLArr);
    }

    public static EnumC1986707qL[] values() {
        return (EnumC1986707qL[]) LLILLJJLI.clone();
    }

    public final Integer getType() {
        return this.LL;
    }

    public static EnumC1986707qL valueOf(String str) {
        return (EnumC1986707qL) C08FF.LIZ(EnumC1986707qL.class, str);
    }

    public EnumC1986707qL(String str, int i, Integer num) {
        this.LL = num;
    }
}
