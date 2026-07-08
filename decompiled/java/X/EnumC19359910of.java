package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10of, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19359910of {
    public static final EnumC19359910of COMPLEXITY_DEFAULT;
    public static final EnumC19359910of COMPLEXITY_HIGH;
    public static final EnumC19359910of COMPLEXITY_LOW;
    public static final /* synthetic */ EnumC19359910of[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC19359910of> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19359910of enumC19359910of = new EnumC19359910of("COMPLEXITY_LOW", 0);
        COMPLEXITY_LOW = enumC19359910of;
        EnumC19359910of enumC19359910of2 = new EnumC19359910of("COMPLEXITY_DEFAULT", 1);
        COMPLEXITY_DEFAULT = enumC19359910of2;
        EnumC19359910of enumC19359910of3 = new EnumC19359910of("COMPLEXITY_HIGH", 2);
        COMPLEXITY_HIGH = enumC19359910of3;
        EnumC19359910of[] enumC19359910ofArr = {enumC19359910of, enumC19359910of2, enumC19359910of3};
        LL = enumC19359910ofArr;
        LLILLJJLI = new C2254308sP(enumC19359910ofArr);
    }

    public static EnumC19359910of[] values() {
        return (EnumC19359910of[]) LL.clone();
    }

    public static EnumC19359910of valueOf(String str) {
        return (EnumC19359910of) C08FF.LIZ(EnumC19359910of.class, str);
    }

    public EnumC19359910of(String str, int i) {
    }
}
