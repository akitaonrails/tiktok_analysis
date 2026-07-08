package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NLj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC592410NLj {
    public static final EnumC592410NLj BOTTOM;
    public static final /* synthetic */ EnumC592410NLj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC592410NLj TOP;
    public static final EnumC592410NLj TOP_ICON;
    public static final EnumC592410NLj XTAB;

    public static InterfaceC2044707zh<EnumC592410NLj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC592410NLj enumC592410NLj = new EnumC592410NLj("TOP", 0);
        TOP = enumC592410NLj;
        EnumC592410NLj enumC592410NLj2 = new EnumC592410NLj("BOTTOM", 1);
        BOTTOM = enumC592410NLj2;
        EnumC592410NLj enumC592410NLj3 = new EnumC592410NLj("TOP_ICON", 2);
        TOP_ICON = enumC592410NLj3;
        EnumC592410NLj enumC592410NLj4 = new EnumC592410NLj("XTAB", 3);
        XTAB = enumC592410NLj4;
        EnumC592410NLj[] enumC592410NLjArr = {enumC592410NLj, enumC592410NLj2, enumC592410NLj3, enumC592410NLj4};
        LL = enumC592410NLjArr;
        LLILLJJLI = new C2254308sP(enumC592410NLjArr);
    }

    public static EnumC592410NLj[] values() {
        return (EnumC592410NLj[]) LL.clone();
    }

    public static EnumC592410NLj valueOf(String str) {
        return (EnumC592410NLj) C08FF.LIZ(EnumC592410NLj.class, str);
    }

    public EnumC592410NLj(String str, int i) {
    }
}
