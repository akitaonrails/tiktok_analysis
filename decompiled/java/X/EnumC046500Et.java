package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Et, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC046500Et {
    public static final EnumC046500Et BULLETIN_CARD_POSITION_MIDDLE;
    public static final EnumC046500Et BULLETIN_CARD_POSITION_NORMAL;
    public static final /* synthetic */ EnumC046500Et[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC046500Et UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC046500Et> getEntries() {
        return LLILLL;
    }

    static {
        EnumC046500Et enumC046500Et = new EnumC046500Et("UNKNOWN", 0, 0);
        UNKNOWN = enumC046500Et;
        EnumC046500Et enumC046500Et2 = new EnumC046500Et("BULLETIN_CARD_POSITION_NORMAL", 1, 1);
        BULLETIN_CARD_POSITION_NORMAL = enumC046500Et2;
        EnumC046500Et enumC046500Et3 = new EnumC046500Et("BULLETIN_CARD_POSITION_MIDDLE", 2, 2);
        BULLETIN_CARD_POSITION_MIDDLE = enumC046500Et3;
        EnumC046500Et[] enumC046500EtArr = {enumC046500Et, enumC046500Et2, enumC046500Et3};
        LLILLJJLI = enumC046500EtArr;
        LLILLL = new C2254308sP(enumC046500EtArr);
    }

    public static EnumC046500Et[] values() {
        return (EnumC046500Et[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC046500Et valueOf(String str) {
        return (EnumC046500Et) C08FF.LIZ(EnumC046500Et.class, str);
    }

    public EnumC046500Et(String str, int i, int i2) {
        this.LL = i2;
    }
}
