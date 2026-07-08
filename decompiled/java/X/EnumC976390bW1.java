package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bW1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC976390bW1 {
    public static final C976430bW5 Companion;
    public static final EnumC976390bW1 DECLINE_BUTTON;
    public static final EnumC976390bW1 HOSTS_LIST_CHANGED;
    public static final /* synthetic */ EnumC976390bW1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC976390bW1 TIME_OUT;

    public static InterfaceC2044707zh<EnumC976390bW1> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC976390bW1 enumC976390bW1 = new EnumC976390bW1("DECLINE_BUTTON", 0);
        DECLINE_BUTTON = enumC976390bW1;
        EnumC976390bW1 enumC976390bW12 = new EnumC976390bW1("HOSTS_LIST_CHANGED", 1);
        HOSTS_LIST_CHANGED = enumC976390bW12;
        EnumC976390bW1 enumC976390bW13 = new EnumC976390bW1("TIME_OUT", 2);
        TIME_OUT = enumC976390bW13;
        EnumC976390bW1[] enumC976390bW1Arr = {enumC976390bW1, enumC976390bW12, enumC976390bW13};
        LL = enumC976390bW1Arr;
        LLILLJJLI = new C2254308sP(enumC976390bW1Arr);
        Companion = new C976430bW5();
    }

    public static EnumC976390bW1[] values() {
        return (EnumC976390bW1[]) LL.clone();
    }

    public static EnumC976390bW1 valueOf(String str) {
        return (EnumC976390bW1) C08FF.LIZ(EnumC976390bW1.class, str);
    }

    public EnumC976390bW1(String str, int i) {
    }
}
