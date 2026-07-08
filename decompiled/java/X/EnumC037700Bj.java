package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Bj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC037700Bj {
    public static final EnumC037700Bj CONNECTING;
    public static final C037800Bk Companion;
    public static final EnumC037700Bj IDLE;
    public static final EnumC037700Bj INITIALIZING;
    public static final /* synthetic */ EnumC037700Bj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC037700Bj ON_GOING;
    public static final EnumC037700Bj RINGING;
    public static final EnumC037700Bj TERMINATED;

    public static InterfaceC2044707zh<EnumC037700Bj> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.00Bk] */
    static {
        EnumC037700Bj enumC037700Bj = new EnumC037700Bj("IDLE", 0);
        IDLE = enumC037700Bj;
        EnumC037700Bj enumC037700Bj2 = new EnumC037700Bj("INITIALIZING", 1);
        INITIALIZING = enumC037700Bj2;
        EnumC037700Bj enumC037700Bj3 = new EnumC037700Bj("RINGING", 2);
        RINGING = enumC037700Bj3;
        EnumC037700Bj enumC037700Bj4 = new EnumC037700Bj("CONNECTING", 3);
        CONNECTING = enumC037700Bj4;
        EnumC037700Bj enumC037700Bj5 = new EnumC037700Bj("ON_GOING", 4);
        ON_GOING = enumC037700Bj5;
        EnumC037700Bj enumC037700Bj6 = new EnumC037700Bj("TERMINATED", 5);
        TERMINATED = enumC037700Bj6;
        EnumC037700Bj[] enumC037700BjArr = {enumC037700Bj, enumC037700Bj2, enumC037700Bj3, enumC037700Bj4, enumC037700Bj5, enumC037700Bj6};
        LL = enumC037700BjArr;
        LLILLJJLI = new C2254308sP(enumC037700BjArr);
        Companion = new Object() { // from class: X.00Bk
        };
    }

    public static EnumC037700Bj[] values() {
        return (EnumC037700Bj[]) LL.clone();
    }

    public final boolean isTerminal() {
        return this == TERMINATED;
    }

    public static EnumC037700Bj valueOf(String str) {
        return (EnumC037700Bj) C08FF.LIZ(EnumC037700Bj.class, str);
    }

    public EnumC037700Bj(String str, int i) {
    }
}
