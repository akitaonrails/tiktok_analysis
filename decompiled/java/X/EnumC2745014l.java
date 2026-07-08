package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.014l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2745014l {
    public static final EnumC2745014l CLICK;
    public static final /* synthetic */ EnumC2745014l[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2745014l SHOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2745014l> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2745014l enumC2745014l = new EnumC2745014l("CLICK", 0, "click");
        CLICK = enumC2745014l;
        EnumC2745014l enumC2745014l2 = new EnumC2745014l("SHOW", 1, "show");
        SHOW = enumC2745014l2;
        EnumC2745014l[] enumC2745014lArr = {enumC2745014l, enumC2745014l2};
        LLILLJJLI = enumC2745014lArr;
        LLILLL = new C2254308sP(enumC2745014lArr);
    }

    public static EnumC2745014l[] values() {
        return (EnumC2745014l[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC2745014l valueOf(String str) {
        return (EnumC2745014l) C08FF.LIZ(EnumC2745014l.class, str);
    }

    public EnumC2745014l(String str, int i, String str2) {
        this.LL = str2;
    }
}
