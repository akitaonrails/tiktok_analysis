package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mCO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1387060mCO {
    public static final EnumC1387060mCO FRIENDS;
    public static final /* synthetic */ EnumC1387060mCO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1387060mCO MESSAGE;
    public static final EnumC1387060mCO MESSAGE_AFTER_NUDGE;
    public static final EnumC1387060mCO MESSAGE_ICE_BREAKING;
    public static final EnumC1387060mCO MESSAGE_NUDGE;

    public static InterfaceC2044707zh<EnumC1387060mCO> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1387060mCO enumC1387060mCO = new EnumC1387060mCO("FRIENDS", 0);
        FRIENDS = enumC1387060mCO;
        EnumC1387060mCO enumC1387060mCO2 = new EnumC1387060mCO("MESSAGE", 1);
        MESSAGE = enumC1387060mCO2;
        EnumC1387060mCO enumC1387060mCO3 = new EnumC1387060mCO("MESSAGE_ICE_BREAKING", 2);
        MESSAGE_ICE_BREAKING = enumC1387060mCO3;
        EnumC1387060mCO enumC1387060mCO4 = new EnumC1387060mCO("MESSAGE_NUDGE", 3);
        MESSAGE_NUDGE = enumC1387060mCO4;
        EnumC1387060mCO enumC1387060mCO5 = new EnumC1387060mCO("MESSAGE_AFTER_NUDGE", 4);
        MESSAGE_AFTER_NUDGE = enumC1387060mCO5;
        EnumC1387060mCO[] enumC1387060mCOArr = {enumC1387060mCO, enumC1387060mCO2, enumC1387060mCO3, enumC1387060mCO4, enumC1387060mCO5};
        LL = enumC1387060mCOArr;
        LLILLJJLI = new C2254308sP(enumC1387060mCOArr);
    }

    public static EnumC1387060mCO[] values() {
        return (EnumC1387060mCO[]) LL.clone();
    }

    public static EnumC1387060mCO valueOf(String str) {
        return (EnumC1387060mCO) C08FF.LIZ(EnumC1387060mCO.class, str);
    }

    public EnumC1387060mCO(String str, int i) {
    }
}
