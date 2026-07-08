package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gnn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1179610gnn {
    public static final /* synthetic */ EnumC1179610gnn[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1179610gnn TYPE_DYNAMIC_MAP;
    public static final EnumC1179610gnn TYPE_NONE;
    public static final EnumC1179610gnn TYPE_STATIC_MAP;

    public static InterfaceC2044707zh<EnumC1179610gnn> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1179610gnn enumC1179610gnn = new EnumC1179610gnn("TYPE_NONE", 0);
        TYPE_NONE = enumC1179610gnn;
        EnumC1179610gnn enumC1179610gnn2 = new EnumC1179610gnn("TYPE_DYNAMIC_MAP", 1);
        TYPE_DYNAMIC_MAP = enumC1179610gnn2;
        EnumC1179610gnn enumC1179610gnn3 = new EnumC1179610gnn("TYPE_STATIC_MAP", 2);
        TYPE_STATIC_MAP = enumC1179610gnn3;
        EnumC1179610gnn[] enumC1179610gnnArr = {enumC1179610gnn, enumC1179610gnn2, enumC1179610gnn3};
        LL = enumC1179610gnnArr;
        LLILLJJLI = new C2254308sP(enumC1179610gnnArr);
    }

    public static EnumC1179610gnn[] values() {
        return (EnumC1179610gnn[]) LL.clone();
    }

    public static EnumC1179610gnn valueOf(String str) {
        return (EnumC1179610gnn) C08FF.LIZ(EnumC1179610gnn.class, str);
    }

    public EnumC1179610gnn(String str, int i) {
    }
}
