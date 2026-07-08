package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10ql, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19372910ql {
    public static final /* synthetic */ EnumC19372910ql[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19372910ql PRIVATE;
    public static final EnumC19372910ql PUBLIC;

    public static InterfaceC2044707zh<EnumC19372910ql> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19372910ql enumC19372910ql = new EnumC19372910ql("PUBLIC", 0);
        PUBLIC = enumC19372910ql;
        EnumC19372910ql enumC19372910ql2 = new EnumC19372910ql("PRIVATE", 1);
        PRIVATE = enumC19372910ql2;
        EnumC19372910ql[] enumC19372910qlArr = {enumC19372910ql, enumC19372910ql2};
        LL = enumC19372910qlArr;
        LLILLJJLI = new C2254308sP(enumC19372910qlArr);
    }

    public static EnumC19372910ql[] values() {
        return (EnumC19372910ql[]) LL.clone();
    }

    public static EnumC19372910ql valueOf(String str) {
        return (EnumC19372910ql) C08FF.LIZ(EnumC19372910ql.class, str);
    }

    public EnumC19372910ql(String str, int i) {
    }
}
