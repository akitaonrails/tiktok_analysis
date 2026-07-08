package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ftT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1144690ftT {
    public static final /* synthetic */ EnumC1144690ftT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1144690ftT UNKNOWN_ITEM_CARD_TYPE;
    public static final EnumC1144690ftT WRONG_BATTLE_ID;
    public static final EnumC1144690ftT WRONG_MATCH_STATE;
    public static final EnumC1144690ftT WRONG_MESSAGE_TIMING;

    public static InterfaceC2044707zh<EnumC1144690ftT> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1144690ftT enumC1144690ftT = new EnumC1144690ftT("WRONG_BATTLE_ID", 0);
        WRONG_BATTLE_ID = enumC1144690ftT;
        EnumC1144690ftT enumC1144690ftT2 = new EnumC1144690ftT("UNKNOWN_ITEM_CARD_TYPE", 1);
        UNKNOWN_ITEM_CARD_TYPE = enumC1144690ftT2;
        EnumC1144690ftT enumC1144690ftT3 = new EnumC1144690ftT("WRONG_MATCH_STATE", 2);
        WRONG_MATCH_STATE = enumC1144690ftT3;
        EnumC1144690ftT enumC1144690ftT4 = new EnumC1144690ftT("WRONG_MESSAGE_TIMING", 3);
        WRONG_MESSAGE_TIMING = enumC1144690ftT4;
        EnumC1144690ftT[] enumC1144690ftTArr = {enumC1144690ftT, enumC1144690ftT2, enumC1144690ftT3, enumC1144690ftT4};
        LL = enumC1144690ftTArr;
        LLILLJJLI = new C2254308sP(enumC1144690ftTArr);
    }

    public static EnumC1144690ftT[] values() {
        return (EnumC1144690ftT[]) LL.clone();
    }

    public static EnumC1144690ftT valueOf(String str) {
        return (EnumC1144690ftT) C08FF.LIZ(EnumC1144690ftT.class, str);
    }

    public EnumC1144690ftT(String str, int i) {
    }
}
