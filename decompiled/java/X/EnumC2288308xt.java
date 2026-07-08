package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08xt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2288308xt {
    public static final /* synthetic */ EnumC2288308xt[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2288308xt NATURE_STICKER;
    public static final EnumC2288308xt RECOMMEND_EFFECT;
    public static final EnumC2288308xt RECOMMEND_HASHTAG;
    public static final EnumC2288308xt RECOMMEND_MUSIC;
    public static final EnumC2288308xt RECOMMEND_STICKER;

    public static InterfaceC2044707zh<EnumC2288308xt> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2288308xt enumC2288308xt = new EnumC2288308xt("RECOMMEND_EFFECT", 0);
        RECOMMEND_EFFECT = enumC2288308xt;
        EnumC2288308xt enumC2288308xt2 = new EnumC2288308xt("RECOMMEND_STICKER", 1);
        RECOMMEND_STICKER = enumC2288308xt2;
        EnumC2288308xt enumC2288308xt3 = new EnumC2288308xt("RECOMMEND_HASHTAG", 2);
        RECOMMEND_HASHTAG = enumC2288308xt3;
        EnumC2288308xt enumC2288308xt4 = new EnumC2288308xt("RECOMMEND_MUSIC", 3);
        RECOMMEND_MUSIC = enumC2288308xt4;
        EnumC2288308xt enumC2288308xt5 = new EnumC2288308xt("NATURE_STICKER", 4);
        NATURE_STICKER = enumC2288308xt5;
        EnumC2288308xt[] enumC2288308xtArr = {enumC2288308xt, enumC2288308xt2, enumC2288308xt3, enumC2288308xt4, enumC2288308xt5};
        LL = enumC2288308xtArr;
        LLILLJJLI = new C2254308sP(enumC2288308xtArr);
    }

    public static EnumC2288308xt[] values() {
        return (EnumC2288308xt[]) LL.clone();
    }

    public static EnumC2288308xt valueOf(String str) {
        return (EnumC2288308xt) C08FF.LIZ(EnumC2288308xt.class, str);
    }

    public EnumC2288308xt(String str, int i) {
    }
}
