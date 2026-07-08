package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0331009p {
    public static final EnumC0331009p FREE_CREATE;
    public static final /* synthetic */ EnumC0331009p[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC0331009p REFINE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC0331009p> getEntries() {
        return LLILLL;
    }

    static {
        EnumC0331009p enumC0331009p = new EnumC0331009p("FREE_CREATE", 0, 0);
        FREE_CREATE = enumC0331009p;
        EnumC0331009p enumC0331009p2 = new EnumC0331009p("REFINE", 1, 1);
        REFINE = enumC0331009p2;
        EnumC0331009p[] enumC0331009pArr = {enumC0331009p, enumC0331009p2};
        LLILLJJLI = enumC0331009pArr;
        LLILLL = new C2254308sP(enumC0331009pArr);
    }

    public static EnumC0331009p[] values() {
        return (EnumC0331009p[]) LLILLJJLI.clone();
    }

    public final int getTypeValue() {
        return this.LL;
    }

    public static EnumC0331009p valueOf(String str) {
        return (EnumC0331009p) C08FF.LIZ(EnumC0331009p.class, str);
    }

    public EnumC0331009p(String str, int i, int i2) {
        this.LL = i2;
    }
}
