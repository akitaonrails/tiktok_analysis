package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ek1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC373110Ek1 {
    public static final EnumC373110Ek1 COMPARE;
    public static final /* synthetic */ EnumC373110Ek1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC373110Ek1 PLAY;
    public static final EnumC373110Ek1 REDO;
    public static final EnumC373110Ek1 RESET;
    public static final EnumC373110Ek1 SAVE;
    public static final EnumC373110Ek1 UNDO;
    public final String LL;

    public static InterfaceC2044707zh<EnumC373110Ek1> getEntries() {
        return LLILLL;
    }

    static {
        EnumC373110Ek1 enumC373110Ek1 = new EnumC373110Ek1("COMPARE", 0, "click_compare");
        COMPARE = enumC373110Ek1;
        EnumC373110Ek1 enumC373110Ek12 = new EnumC373110Ek1("UNDO", 1, "click_undo");
        UNDO = enumC373110Ek12;
        EnumC373110Ek1 enumC373110Ek13 = new EnumC373110Ek1("REDO", 2, "click_redo");
        REDO = enumC373110Ek13;
        EnumC373110Ek1 enumC373110Ek14 = new EnumC373110Ek1("PLAY", 3, "click_play");
        PLAY = enumC373110Ek14;
        EnumC373110Ek1 enumC373110Ek15 = new EnumC373110Ek1("RESET", 4, "click_reset");
        RESET = enumC373110Ek15;
        EnumC373110Ek1 enumC373110Ek16 = new EnumC373110Ek1("SAVE", 5, "click_save");
        SAVE = enumC373110Ek16;
        EnumC373110Ek1[] enumC373110Ek1Arr = {enumC373110Ek1, enumC373110Ek12, enumC373110Ek13, enumC373110Ek14, enumC373110Ek15, enumC373110Ek16};
        LLILLJJLI = enumC373110Ek1Arr;
        LLILLL = new C2254308sP(enumC373110Ek1Arr);
    }

    public static EnumC373110Ek1[] values() {
        return (EnumC373110Ek1[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC373110Ek1 valueOf(String str) {
        return (EnumC373110Ek1) C08FF.LIZ(EnumC373110Ek1.class, str);
    }

    public EnumC373110Ek1(String str, int i, String str2) {
        this.LL = str2;
    }
}
