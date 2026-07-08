package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bm5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC986350bm5 {
    public static final EnumC986350bm5 CO_HOST_WITH_GUEST;
    public static final EnumC986350bm5 INVITING_OTHERS;
    public static final EnumC986350bm5 IN_QUICK_CO_HOST_PROCESS;
    public static final /* synthetic */ EnumC986350bm5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC986350bm5 NOT_TWO_ANCHOR_CO_HOSTING;

    public static InterfaceC2044707zh<EnumC986350bm5> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC986350bm5 enumC986350bm5 = new EnumC986350bm5("IN_QUICK_CO_HOST_PROCESS", 0);
        IN_QUICK_CO_HOST_PROCESS = enumC986350bm5;
        EnumC986350bm5 enumC986350bm52 = new EnumC986350bm5("INVITING_OTHERS", 1);
        INVITING_OTHERS = enumC986350bm52;
        EnumC986350bm5 enumC986350bm53 = new EnumC986350bm5("NOT_TWO_ANCHOR_CO_HOSTING", 2);
        NOT_TWO_ANCHOR_CO_HOSTING = enumC986350bm53;
        EnumC986350bm5 enumC986350bm54 = new EnumC986350bm5("CO_HOST_WITH_GUEST", 3);
        CO_HOST_WITH_GUEST = enumC986350bm54;
        EnumC986350bm5[] enumC986350bm5Arr = {enumC986350bm5, enumC986350bm52, enumC986350bm53, enumC986350bm54};
        LL = enumC986350bm5Arr;
        LLILLJJLI = new C2254308sP(enumC986350bm5Arr);
    }

    public static EnumC986350bm5[] values() {
        return (EnumC986350bm5[]) LL.clone();
    }

    public static EnumC986350bm5 valueOf(String str) {
        return (EnumC986350bm5) C08FF.LIZ(EnumC986350bm5.class, str);
    }

    public EnumC986350bm5(String str, int i) {
    }
}
