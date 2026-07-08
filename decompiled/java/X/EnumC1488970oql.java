package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0oql, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1488970oql {
    public static final EnumC1488970oql FAKE;
    public static final /* synthetic */ EnumC1488970oql[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1488970oql REAL;

    public static InterfaceC2044707zh<EnumC1488970oql> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1488970oql enumC1488970oql = new EnumC1488970oql("FAKE", 0);
        FAKE = enumC1488970oql;
        EnumC1488970oql enumC1488970oql2 = new EnumC1488970oql("REAL", 1);
        REAL = enumC1488970oql2;
        EnumC1488970oql[] enumC1488970oqlArr = {enumC1488970oql, enumC1488970oql2};
        LL = enumC1488970oqlArr;
        LLILLJJLI = new C2254308sP(enumC1488970oqlArr);
    }

    public static EnumC1488970oql[] values() {
        return (EnumC1488970oql[]) LL.clone();
    }

    public static EnumC1488970oql valueOf(String str) {
        return (EnumC1488970oql) C08FF.LIZ(EnumC1488970oql.class, str);
    }

    public EnumC1488970oql(String str, int i) {
    }
}
