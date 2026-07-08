package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a4S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC920860a4S {
    public static final EnumC920860a4S BAD;
    public static final EnumC920860a4S GOOD;
    public static final /* synthetic */ EnumC920860a4S[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC920860a4S UNKNOWN;
    public static final EnumC920860a4S VERY_BAD;

    public static InterfaceC2044707zh<EnumC920860a4S> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC920860a4S enumC920860a4S = new EnumC920860a4S("GOOD", 0);
        GOOD = enumC920860a4S;
        EnumC920860a4S enumC920860a4S2 = new EnumC920860a4S("BAD", 1);
        BAD = enumC920860a4S2;
        EnumC920860a4S enumC920860a4S3 = new EnumC920860a4S("VERY_BAD", 2);
        VERY_BAD = enumC920860a4S3;
        EnumC920860a4S enumC920860a4S4 = new EnumC920860a4S("UNKNOWN", 3);
        UNKNOWN = enumC920860a4S4;
        EnumC920860a4S[] enumC920860a4SArr = {enumC920860a4S, enumC920860a4S2, enumC920860a4S3, enumC920860a4S4};
        LL = enumC920860a4SArr;
        LLILLJJLI = new C2254308sP(enumC920860a4SArr);
    }

    public static EnumC920860a4S[] values() {
        return (EnumC920860a4S[]) LL.clone();
    }

    public static EnumC920860a4S valueOf(String str) {
        return (EnumC920860a4S) C08FF.LIZ(EnumC920860a4S.class, str);
    }

    public EnumC920860a4S(String str, int i) {
    }
}
