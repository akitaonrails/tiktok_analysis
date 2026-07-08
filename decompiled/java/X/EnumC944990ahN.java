package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ahN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC944990ahN {
    public static final EnumC944990ahN AVAILABLE;
    public static final /* synthetic */ EnumC944990ahN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC944990ahN UNAVAILABLE_GROUP_DEFAULT;
    public static final EnumC944990ahN UNAVAILABLE_GROUP_OPT;

    public static InterfaceC2044707zh<EnumC944990ahN> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC944990ahN enumC944990ahN = new EnumC944990ahN("AVAILABLE", 0);
        AVAILABLE = enumC944990ahN;
        EnumC944990ahN enumC944990ahN2 = new EnumC944990ahN("UNAVAILABLE_GROUP_DEFAULT", 1);
        UNAVAILABLE_GROUP_DEFAULT = enumC944990ahN2;
        EnumC944990ahN enumC944990ahN3 = new EnumC944990ahN("UNAVAILABLE_GROUP_OPT", 2);
        UNAVAILABLE_GROUP_OPT = enumC944990ahN3;
        EnumC944990ahN[] enumC944990ahNArr = {enumC944990ahN, enumC944990ahN2, enumC944990ahN3};
        LL = enumC944990ahNArr;
        LLILLJJLI = new C2254308sP(enumC944990ahNArr);
    }

    public static EnumC944990ahN[] values() {
        return (EnumC944990ahN[]) LL.clone();
    }

    public static EnumC944990ahN valueOf(String str) {
        return (EnumC944990ahN) C08FF.LIZ(EnumC944990ahN.class, str);
    }

    public EnumC944990ahN(String str, int i) {
    }
}
