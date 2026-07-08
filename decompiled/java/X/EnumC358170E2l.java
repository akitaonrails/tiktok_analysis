package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0E2l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC358170E2l {
    public static final EnumC358170E2l ADJUST;
    public static final EnumC358170E2l ANIM;
    public static final EnumC358170E2l BEAUTY;
    public static final EnumC358170E2l FILTER;
    public static final /* synthetic */ EnumC358170E2l[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC358170E2l NONE;

    public static InterfaceC2044707zh<EnumC358170E2l> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC358170E2l enumC358170E2l = new EnumC358170E2l("NONE", 0);
        NONE = enumC358170E2l;
        EnumC358170E2l enumC358170E2l2 = new EnumC358170E2l("BEAUTY", 1);
        BEAUTY = enumC358170E2l2;
        EnumC358170E2l enumC358170E2l3 = new EnumC358170E2l("FILTER", 2);
        FILTER = enumC358170E2l3;
        EnumC358170E2l enumC358170E2l4 = new EnumC358170E2l("ADJUST", 3);
        ADJUST = enumC358170E2l4;
        EnumC358170E2l enumC358170E2l5 = new EnumC358170E2l("ANIM", 4);
        ANIM = enumC358170E2l5;
        EnumC358170E2l[] enumC358170E2lArr = {enumC358170E2l, enumC358170E2l2, enumC358170E2l3, enumC358170E2l4, enumC358170E2l5};
        LL = enumC358170E2lArr;
        LLILLJJLI = new C2254308sP(enumC358170E2lArr);
    }

    public static EnumC358170E2l[] values() {
        return (EnumC358170E2l[]) LL.clone();
    }

    public static EnumC358170E2l valueOf(String str) {
        return (EnumC358170E2l) C08FF.LIZ(EnumC358170E2l.class, str);
    }

    public EnumC358170E2l(String str, int i) {
    }
}
