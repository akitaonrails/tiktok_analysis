package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0O6w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC614120O6w {
    public static final /* synthetic */ EnumC614120O6w[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC614120O6w Mutation;
    public static final EnumC614120O6w Optimistic;
    public static final EnumC614120O6w Query;
    public static final EnumC614120O6w Rollback;

    public static InterfaceC2044707zh<EnumC614120O6w> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC614120O6w enumC614120O6w = new EnumC614120O6w("Query", 0);
        Query = enumC614120O6w;
        EnumC614120O6w enumC614120O6w2 = new EnumC614120O6w("Optimistic", 1);
        Optimistic = enumC614120O6w2;
        EnumC614120O6w enumC614120O6w3 = new EnumC614120O6w("Mutation", 2);
        Mutation = enumC614120O6w3;
        EnumC614120O6w enumC614120O6w4 = new EnumC614120O6w("Rollback", 3);
        Rollback = enumC614120O6w4;
        EnumC614120O6w[] enumC614120O6wArr = {enumC614120O6w, enumC614120O6w2, enumC614120O6w3, enumC614120O6w4};
        LL = enumC614120O6wArr;
        LLILLJJLI = new C2254308sP(enumC614120O6wArr);
    }

    public static EnumC614120O6w[] values() {
        return (EnumC614120O6w[]) LL.clone();
    }

    public static EnumC614120O6w valueOf(String str) {
        return (EnumC614120O6w) C08FF.LIZ(EnumC614120O6w.class, str);
    }

    public EnumC614120O6w(String str, int i) {
    }
}
