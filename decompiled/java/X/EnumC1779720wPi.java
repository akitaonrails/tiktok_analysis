package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wPi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779720wPi {
    public static final EnumC1779720wPi AUTO_APPLY_BOARD_AFTER_EDIT;
    public static final EnumC1779720wPi AUTO_APPLY_LAST_USED_BOARD;
    public static final /* synthetic */ EnumC1779720wPi[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1779720wPi USER_APPLY_BOARD;
    public static final EnumC1779720wPi USER_CANCEL_BOARD;
    public static final EnumC1779720wPi USER_REPLACE_BOARD;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1779720wPi> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1779720wPi enumC1779720wPi = new EnumC1779720wPi("USER_APPLY_BOARD", 0, 0);
        USER_APPLY_BOARD = enumC1779720wPi;
        EnumC1779720wPi enumC1779720wPi2 = new EnumC1779720wPi("USER_REPLACE_BOARD", 1, 1);
        USER_REPLACE_BOARD = enumC1779720wPi2;
        EnumC1779720wPi enumC1779720wPi3 = new EnumC1779720wPi("USER_CANCEL_BOARD", 2, 2);
        USER_CANCEL_BOARD = enumC1779720wPi3;
        EnumC1779720wPi enumC1779720wPi4 = new EnumC1779720wPi("AUTO_APPLY_LAST_USED_BOARD", 3, 3);
        AUTO_APPLY_LAST_USED_BOARD = enumC1779720wPi4;
        EnumC1779720wPi enumC1779720wPi5 = new EnumC1779720wPi("AUTO_APPLY_BOARD_AFTER_EDIT", 4, 4);
        AUTO_APPLY_BOARD_AFTER_EDIT = enumC1779720wPi5;
        EnumC1779720wPi[] enumC1779720wPiArr = {enumC1779720wPi, enumC1779720wPi2, enumC1779720wPi3, enumC1779720wPi4, enumC1779720wPi5};
        LLILLJJLI = enumC1779720wPiArr;
        LLILLL = new C2254308sP(enumC1779720wPiArr);
    }

    public static EnumC1779720wPi[] values() {
        return (EnumC1779720wPi[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1779720wPi valueOf(String str) {
        return (EnumC1779720wPi) C08FF.LIZ(EnumC1779720wPi.class, str);
    }

    public EnumC1779720wPi(String str, int i, int i2) {
        this.LL = i2;
    }
}
