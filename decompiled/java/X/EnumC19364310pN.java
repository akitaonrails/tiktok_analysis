package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10pN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19364310pN {
    public static final EnumC19364310pN BASIC;
    public static final EnumC19364310pN DEBUG;
    public static final EnumC19364310pN DETAILED;
    public static final /* synthetic */ EnumC19364310pN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC19364310pN> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19364310pN enumC19364310pN = new EnumC19364310pN("BASIC", 0);
        BASIC = enumC19364310pN;
        EnumC19364310pN enumC19364310pN2 = new EnumC19364310pN("DETAILED", 1);
        DETAILED = enumC19364310pN2;
        EnumC19364310pN enumC19364310pN3 = new EnumC19364310pN("DEBUG", 2);
        DEBUG = enumC19364310pN3;
        EnumC19364310pN[] enumC19364310pNArr = {enumC19364310pN, enumC19364310pN2, enumC19364310pN3};
        LL = enumC19364310pNArr;
        LLILLJJLI = new C2254308sP(enumC19364310pNArr);
    }

    public static EnumC19364310pN[] values() {
        return (EnumC19364310pN[]) LL.clone();
    }

    public static EnumC19364310pN valueOf(String str) {
        return (EnumC19364310pN) C08FF.LIZ(EnumC19364310pN.class, str);
    }

    public EnumC19364310pN(String str, int i) {
    }
}
