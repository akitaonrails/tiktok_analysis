package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EsQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC378320EsQ {
    public static final EnumC378320EsQ HIDE;
    public static final /* synthetic */ EnumC378320EsQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC378320EsQ NONE;
    public static final EnumC378320EsQ SHOW;
    public static final EnumC378320EsQ SHOW_WITH_ANIMATION;

    public static InterfaceC2044707zh<EnumC378320EsQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC378320EsQ enumC378320EsQ = new EnumC378320EsQ("NONE", 0);
        NONE = enumC378320EsQ;
        EnumC378320EsQ enumC378320EsQ2 = new EnumC378320EsQ("HIDE", 1);
        HIDE = enumC378320EsQ2;
        EnumC378320EsQ enumC378320EsQ3 = new EnumC378320EsQ("SHOW", 2);
        SHOW = enumC378320EsQ3;
        EnumC378320EsQ enumC378320EsQ4 = new EnumC378320EsQ("SHOW_WITH_ANIMATION", 3);
        SHOW_WITH_ANIMATION = enumC378320EsQ4;
        EnumC378320EsQ[] enumC378320EsQArr = {enumC378320EsQ, enumC378320EsQ2, enumC378320EsQ3, enumC378320EsQ4};
        LL = enumC378320EsQArr;
        LLILLJJLI = new C2254308sP(enumC378320EsQArr);
    }

    public static EnumC378320EsQ[] values() {
        return (EnumC378320EsQ[]) LL.clone();
    }

    public static EnumC378320EsQ valueOf(String str) {
        return (EnumC378320EsQ) C08FF.LIZ(EnumC378320EsQ.class, str);
    }

    public EnumC378320EsQ(String str, int i) {
    }
}
