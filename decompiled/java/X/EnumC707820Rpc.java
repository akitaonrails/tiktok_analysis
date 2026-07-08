package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Rpc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC707820Rpc {
    public static final EnumC707820Rpc CONTAINER;
    public static final EnumC707820Rpc GLOBAL;
    public static final /* synthetic */ EnumC707820Rpc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC707820Rpc STANDARD_CONTAINER;

    public static InterfaceC2044707zh<EnumC707820Rpc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC707820Rpc enumC707820Rpc = new EnumC707820Rpc("GLOBAL", 0);
        GLOBAL = enumC707820Rpc;
        EnumC707820Rpc enumC707820Rpc2 = new EnumC707820Rpc("CONTAINER", 1);
        CONTAINER = enumC707820Rpc2;
        EnumC707820Rpc enumC707820Rpc3 = new EnumC707820Rpc("STANDARD_CONTAINER", 2);
        STANDARD_CONTAINER = enumC707820Rpc3;
        EnumC707820Rpc[] enumC707820RpcArr = {enumC707820Rpc, enumC707820Rpc2, enumC707820Rpc3};
        LL = enumC707820RpcArr;
        LLILLJJLI = new C2254308sP(enumC707820RpcArr);
    }

    public static EnumC707820Rpc[] values() {
        return (EnumC707820Rpc[]) LL.clone();
    }

    public static EnumC707820Rpc valueOf(String str) {
        return (EnumC707820Rpc) C08FF.LIZ(EnumC707820Rpc.class, str);
    }

    public EnumC707820Rpc(String str, int i) {
    }
}
