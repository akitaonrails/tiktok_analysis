package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Tn9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC757250Tn9 {
    public static final EnumC757250Tn9 CLOSE;
    public static final EnumC757250Tn9 COUNT;
    public static final EnumC757250Tn9 LEARN_MORE;
    public static final /* synthetic */ EnumC757250Tn9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC757250Tn9 PIN;
    public static final EnumC757250Tn9 REMOVE_CARD;
    public static final EnumC757250Tn9 UNPIN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC757250Tn9> getEntries() {
        return LLILLL;
    }

    static {
        EnumC757250Tn9 enumC757250Tn9 = new EnumC757250Tn9("CLOSE", 0, "close");
        CLOSE = enumC757250Tn9;
        EnumC757250Tn9 enumC757250Tn92 = new EnumC757250Tn9("PIN", 1, "pin_card");
        PIN = enumC757250Tn92;
        EnumC757250Tn9 enumC757250Tn93 = new EnumC757250Tn9("UNPIN", 2, "unpin_card");
        UNPIN = enumC757250Tn93;
        EnumC757250Tn9 enumC757250Tn94 = new EnumC757250Tn9("COUNT", 3, "active_list_count");
        COUNT = enumC757250Tn94;
        EnumC757250Tn9 enumC757250Tn95 = new EnumC757250Tn9("LEARN_MORE", 4, "learn_more");
        LEARN_MORE = enumC757250Tn95;
        EnumC757250Tn9 enumC757250Tn96 = new EnumC757250Tn9("REMOVE_CARD", 5, "remove_card");
        REMOVE_CARD = enumC757250Tn96;
        EnumC757250Tn9[] enumC757250Tn9Arr = {enumC757250Tn9, enumC757250Tn92, enumC757250Tn93, enumC757250Tn94, enumC757250Tn95, enumC757250Tn96};
        LLILLJJLI = enumC757250Tn9Arr;
        LLILLL = new C2254308sP(enumC757250Tn9Arr);
    }

    public static EnumC757250Tn9[] values() {
        return (EnumC757250Tn9[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC757250Tn9 valueOf(String str) {
        return (EnumC757250Tn9) C08FF.LIZ(EnumC757250Tn9.class, str);
    }

    public EnumC757250Tn9(String str, int i, String str2) {
        this.LL = str2;
    }
}
