package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0y9p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1846750y9p {
    public static final EnumC1846750y9p ACTIVE;
    public static final /* synthetic */ EnumC1846750y9p[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1846750y9p PASSIVE;
    public static final EnumC1846750y9p REPLACE;
    public static final EnumC1846750y9p UNKNOWN;

    public static InterfaceC2044707zh<EnumC1846750y9p> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1846750y9p enumC1846750y9p = new EnumC1846750y9p("UNKNOWN", 0);
        UNKNOWN = enumC1846750y9p;
        EnumC1846750y9p enumC1846750y9p2 = new EnumC1846750y9p("ACTIVE", 1);
        ACTIVE = enumC1846750y9p2;
        EnumC1846750y9p enumC1846750y9p3 = new EnumC1846750y9p("PASSIVE", 2);
        PASSIVE = enumC1846750y9p3;
        EnumC1846750y9p enumC1846750y9p4 = new EnumC1846750y9p("REPLACE", 3);
        REPLACE = enumC1846750y9p4;
        EnumC1846750y9p[] enumC1846750y9pArr = {enumC1846750y9p, enumC1846750y9p2, enumC1846750y9p3, enumC1846750y9p4};
        LL = enumC1846750y9pArr;
        LLILLJJLI = new C2254308sP(enumC1846750y9pArr);
    }

    public static EnumC1846750y9p[] values() {
        return (EnumC1846750y9p[]) LL.clone();
    }

    public static EnumC1846750y9p valueOf(String str) {
        return (EnumC1846750y9p) C08FF.LIZ(EnumC1846750y9p.class, str);
    }

    public EnumC1846750y9p(String str, int i) {
    }
}
