package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0m2l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1381090m2l {
    public static final EnumC1381090m2l LL;
    public static final EnumC1381090m2l LLILLJJLI;
    public static final /* synthetic */ EnumC1381090m2l[] LLILLL;

    static {
        EnumC1381090m2l enumC1381090m2l = new EnumC1381090m2l("PANEL", 0);
        LL = enumC1381090m2l;
        EnumC1381090m2l enumC1381090m2l2 = new EnumC1381090m2l("EDIT", 1);
        EnumC1381090m2l enumC1381090m2l3 = new EnumC1381090m2l("ADD", 2);
        LLILLJJLI = enumC1381090m2l3;
        EnumC1381090m2l[] enumC1381090m2lArr = {enumC1381090m2l, enumC1381090m2l2, enumC1381090m2l3};
        LLILLL = enumC1381090m2lArr;
        new C2254308sP(enumC1381090m2lArr);
    }

    public static EnumC1381090m2l[] values() {
        return (EnumC1381090m2l[]) LLILLL.clone();
    }

    public static EnumC1381090m2l valueOf(String str) {
        return (EnumC1381090m2l) C08FF.LIZ(EnumC1381090m2l.class, str);
    }

    public EnumC1381090m2l(String str, int i) {
    }
}
