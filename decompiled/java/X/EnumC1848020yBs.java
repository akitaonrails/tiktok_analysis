package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yBs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1848020yBs {
    public static final EnumC1848020yBs ELEMENT;
    public static final /* synthetic */ EnumC1848020yBs[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1848020yBs MODULE;
    public static final EnumC1848020yBs PAGE;
    public static final EnumC1848020yBs SUBPAGE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1848020yBs> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1848020yBs enumC1848020yBs = new EnumC1848020yBs("PAGE", 0, "page");
        PAGE = enumC1848020yBs;
        EnumC1848020yBs enumC1848020yBs2 = new EnumC1848020yBs("SUBPAGE", 1, "page");
        SUBPAGE = enumC1848020yBs2;
        EnumC1848020yBs enumC1848020yBs3 = new EnumC1848020yBs("MODULE", 2, "module");
        MODULE = enumC1848020yBs3;
        EnumC1848020yBs enumC1848020yBs4 = new EnumC1848020yBs("ELEMENT", 3, "element");
        ELEMENT = enumC1848020yBs4;
        EnumC1848020yBs[] enumC1848020yBsArr = {enumC1848020yBs, enumC1848020yBs2, enumC1848020yBs3, enumC1848020yBs4};
        LLILLJJLI = enumC1848020yBsArr;
        LLILLL = new C2254308sP(enumC1848020yBsArr);
    }

    public static EnumC1848020yBs[] values() {
        return (EnumC1848020yBs[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }

    public static EnumC1848020yBs valueOf(String str) {
        return (EnumC1848020yBs) C08FF.LIZ(EnumC1848020yBs.class, str);
    }

    public EnumC1848020yBs(String str, int i, String str2) {
        this.LL = str2;
    }
}
