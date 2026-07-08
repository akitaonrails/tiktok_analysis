package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DTn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC339730DTn {
    public static final EnumC339730DTn CREATE_BTN_WITH_AI;
    public static final /* synthetic */ EnumC339730DTn[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC339730DTn ONLY_CREATE_BTN;

    public static InterfaceC2044707zh<EnumC339730DTn> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC339730DTn enumC339730DTn = new EnumC339730DTn("ONLY_CREATE_BTN", 0);
        ONLY_CREATE_BTN = enumC339730DTn;
        EnumC339730DTn enumC339730DTn2 = new EnumC339730DTn("CREATE_BTN_WITH_AI", 1);
        CREATE_BTN_WITH_AI = enumC339730DTn2;
        EnumC339730DTn[] enumC339730DTnArr = {enumC339730DTn, enumC339730DTn2};
        LL = enumC339730DTnArr;
        LLILLJJLI = new C2254308sP(enumC339730DTnArr);
    }

    public static EnumC339730DTn[] values() {
        return (EnumC339730DTn[]) LL.clone();
    }

    public static EnumC339730DTn valueOf(String str) {
        return (EnumC339730DTn) C08FF.LIZ(EnumC339730DTn.class, str);
    }

    public EnumC339730DTn(String str, int i) {
    }
}
