package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0w1p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1764910w1p {
    public static final EnumC1764910w1p IMAGE;
    public static final /* synthetic */ EnumC1764910w1p[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1764910w1p VIDEO;

    public static InterfaceC2044707zh<EnumC1764910w1p> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1764910w1p enumC1764910w1p = new EnumC1764910w1p("VIDEO", 0);
        VIDEO = enumC1764910w1p;
        EnumC1764910w1p enumC1764910w1p2 = new EnumC1764910w1p("IMAGE", 1);
        IMAGE = enumC1764910w1p2;
        EnumC1764910w1p[] enumC1764910w1pArr = {enumC1764910w1p, enumC1764910w1p2};
        LL = enumC1764910w1pArr;
        LLILLJJLI = new C2254308sP(enumC1764910w1pArr);
    }

    public static EnumC1764910w1p[] values() {
        return (EnumC1764910w1p[]) LL.clone();
    }

    public static EnumC1764910w1p valueOf(String str) {
        return (EnumC1764910w1p) C08FF.LIZ(EnumC1764910w1p.class, str);
    }

    public EnumC1764910w1p(String str, int i) {
    }
}
