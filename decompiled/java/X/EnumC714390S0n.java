package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0S0n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC714390S0n {
    public static final EnumC714390S0n ACTION_DOWN;
    public static final EnumC714390S0n ACTION_UP;
    public static final /* synthetic */ EnumC714390S0n[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC714390S0n PAGE_SCROLL;
    public static final EnumC714390S0n PAGE_SELECTED;
    public static final EnumC714390S0n PAGE_STATE_CHANGE;

    public static InterfaceC2044707zh<EnumC714390S0n> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC714390S0n enumC714390S0n = new EnumC714390S0n("PAGE_SELECTED", 0);
        PAGE_SELECTED = enumC714390S0n;
        EnumC714390S0n enumC714390S0n2 = new EnumC714390S0n("PAGE_SCROLL", 1);
        PAGE_SCROLL = enumC714390S0n2;
        EnumC714390S0n enumC714390S0n3 = new EnumC714390S0n("PAGE_STATE_CHANGE", 2);
        PAGE_STATE_CHANGE = enumC714390S0n3;
        EnumC714390S0n enumC714390S0n4 = new EnumC714390S0n("ACTION_UP", 3);
        ACTION_UP = enumC714390S0n4;
        EnumC714390S0n enumC714390S0n5 = new EnumC714390S0n("ACTION_DOWN", 4);
        ACTION_DOWN = enumC714390S0n5;
        EnumC714390S0n[] enumC714390S0nArr = {enumC714390S0n, enumC714390S0n2, enumC714390S0n3, enumC714390S0n4, enumC714390S0n5};
        LL = enumC714390S0nArr;
        LLILLJJLI = new C2254308sP(enumC714390S0nArr);
    }

    public static EnumC714390S0n[] values() {
        return (EnumC714390S0n[]) LL.clone();
    }

    public static EnumC714390S0n valueOf(String str) {
        return (EnumC714390S0n) C08FF.LIZ(EnumC714390S0n.class, str);
    }

    public EnumC714390S0n(String str, int i) {
    }
}
