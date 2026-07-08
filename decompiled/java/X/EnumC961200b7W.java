package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0b7W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC961200b7W {
    public static final EnumC961200b7W LL;
    public static final EnumC961200b7W LLILLJJLI;
    public static final EnumC961200b7W LLILLL;
    public static final EnumC961200b7W LLILZ;
    public static final /* synthetic */ EnumC961200b7W[] LLILZIL;

    static {
        EnumC961200b7W enumC961200b7W = new EnumC961200b7W("TYPE_FRIEND_TITLE", 0, 0);
        LL = enumC961200b7W;
        EnumC961200b7W enumC961200b7W2 = new EnumC961200b7W("TYPE_MAY_KNOW_TITLE", 1, 1);
        LLILLJJLI = enumC961200b7W2;
        EnumC961200b7W enumC961200b7W3 = new EnumC961200b7W("TYPE_RECOMMEND_TITLE", 2, 2);
        LLILLL = enumC961200b7W3;
        EnumC961200b7W enumC961200b7W4 = new EnumC961200b7W("TYPE_VIEWER_SUGGESTION_TITLE", 3, 3);
        LLILZ = enumC961200b7W4;
        EnumC961200b7W[] enumC961200b7WArr = {enumC961200b7W, enumC961200b7W2, enumC961200b7W3, enumC961200b7W4};
        LLILZIL = enumC961200b7WArr;
        new C2254308sP(enumC961200b7WArr);
    }

    public static EnumC961200b7W[] values() {
        return (EnumC961200b7W[]) LLILZIL.clone();
    }

    public static EnumC961200b7W valueOf(String str) {
        return (EnumC961200b7W) C08FF.LIZ(EnumC961200b7W.class, str);
    }

    public EnumC961200b7W(String str, int i, int i2) {
    }
}
