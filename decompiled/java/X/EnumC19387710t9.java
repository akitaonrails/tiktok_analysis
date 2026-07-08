package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10t9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19387710t9 {
    public static final EnumC19387710t9 DIALOG;
    public static final /* synthetic */ EnumC19387710t9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19387710t9 LOADING;
    public static final EnumC19387710t9 TOAST;
    public final int LL;

    public static InterfaceC2044707zh<EnumC19387710t9> getEntries() {
        return LLILLL;
    }

    static {
        EnumC19387710t9 enumC19387710t9 = new EnumC19387710t9("LOADING", 0, 1);
        LOADING = enumC19387710t9;
        EnumC19387710t9 enumC19387710t92 = new EnumC19387710t9("TOAST", 1, 2);
        TOAST = enumC19387710t92;
        EnumC19387710t9 enumC19387710t93 = new EnumC19387710t9("DIALOG", 2, 3);
        DIALOG = enumC19387710t93;
        EnumC19387710t9[] enumC19387710t9Arr = {enumC19387710t9, enumC19387710t92, enumC19387710t93};
        LLILLJJLI = enumC19387710t9Arr;
        LLILLL = new C2254308sP(enumC19387710t9Arr);
    }

    public static EnumC19387710t9[] values() {
        return (EnumC19387710t9[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC19387710t9 valueOf(String str) {
        return (EnumC19387710t9) C08FF.LIZ(EnumC19387710t9.class, str);
    }

    public EnumC19387710t9(String str, int i, int i2) {
        this.LL = i2;
    }
}
