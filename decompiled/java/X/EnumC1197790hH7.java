package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hH7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1197790hH7 {
    public static final EnumC1197790hH7 BUTTON;
    public static final /* synthetic */ EnumC1197790hH7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final EnumC1197790hH7 f147X;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1197790hH7> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1197790hH7 enumC1197790hH7 = new EnumC1197790hH7("BUTTON", 0, "button");
        BUTTON = enumC1197790hH7;
        EnumC1197790hH7 enumC1197790hH72 = new EnumC1197790hH7("X", 1, "X");
        f147X = enumC1197790hH72;
        EnumC1197790hH7[] enumC1197790hH7Arr = {enumC1197790hH7, enumC1197790hH72};
        LLILLJJLI = enumC1197790hH7Arr;
        LLILLL = new C2254308sP(enumC1197790hH7Arr);
    }

    public static EnumC1197790hH7[] values() {
        return (EnumC1197790hH7[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1197790hH7 valueOf(String str) {
        return (EnumC1197790hH7) C08FF.LIZ(EnumC1197790hH7.class, str);
    }

    public EnumC1197790hH7(String str, int i, String str2) {
        this.LL = str2;
    }
}
