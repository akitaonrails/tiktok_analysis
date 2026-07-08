package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0l7N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1345510l7N {
    public static final EnumC1345510l7N DISLIKE;
    public static final EnumC1345510l7N HATE;
    public static final EnumC1345510l7N LIKE;
    public static final /* synthetic */ EnumC1345510l7N[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1345510l7N UNHATE;

    public static InterfaceC2044707zh<EnumC1345510l7N> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1345510l7N enumC1345510l7N = new EnumC1345510l7N("LIKE", 0);
        LIKE = enumC1345510l7N;
        EnumC1345510l7N enumC1345510l7N2 = new EnumC1345510l7N("DISLIKE", 1);
        DISLIKE = enumC1345510l7N2;
        EnumC1345510l7N enumC1345510l7N3 = new EnumC1345510l7N("HATE", 2);
        HATE = enumC1345510l7N3;
        EnumC1345510l7N enumC1345510l7N4 = new EnumC1345510l7N("UNHATE", 3);
        UNHATE = enumC1345510l7N4;
        EnumC1345510l7N[] enumC1345510l7NArr = {enumC1345510l7N, enumC1345510l7N2, enumC1345510l7N3, enumC1345510l7N4};
        LL = enumC1345510l7NArr;
        LLILLJJLI = new C2254308sP(enumC1345510l7NArr);
    }

    public static EnumC1345510l7N[] values() {
        return (EnumC1345510l7N[]) LL.clone();
    }

    public static EnumC1345510l7N valueOf(String str) {
        return (EnumC1345510l7N) C08FF.LIZ(EnumC1345510l7N.class, str);
    }

    public EnumC1345510l7N(String str, int i) {
    }
}
