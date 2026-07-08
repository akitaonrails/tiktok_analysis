package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uWl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1707210uWl {
    public static final /* synthetic */ EnumC1707210uWl[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1707210uWl QUERY_BIND_RESULT;
    public static final EnumC1707210uWl QUERY_TRADE_RESULT;

    public static InterfaceC2044707zh<EnumC1707210uWl> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1707210uWl enumC1707210uWl = new EnumC1707210uWl("QUERY_TRADE_RESULT", 0);
        QUERY_TRADE_RESULT = enumC1707210uWl;
        EnumC1707210uWl enumC1707210uWl2 = new EnumC1707210uWl("QUERY_BIND_RESULT", 1);
        QUERY_BIND_RESULT = enumC1707210uWl2;
        EnumC1707210uWl[] enumC1707210uWlArr = {enumC1707210uWl, enumC1707210uWl2};
        LL = enumC1707210uWlArr;
        LLILLJJLI = new C2254308sP(enumC1707210uWlArr);
    }

    public static EnumC1707210uWl[] values() {
        return (EnumC1707210uWl[]) LL.clone();
    }

    public static EnumC1707210uWl valueOf(String str) {
        return (EnumC1707210uWl) C08FF.LIZ(EnumC1707210uWl.class, str);
    }

    public EnumC1707210uWl(String str, int i) {
    }
}
