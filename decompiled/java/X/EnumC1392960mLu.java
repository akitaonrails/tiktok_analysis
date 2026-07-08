package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mLu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1392960mLu {
    public static final EnumC1392960mLu ALL;
    public static final EnumC1392960mLu LIVES;
    public static final /* synthetic */ EnumC1392960mLu[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1392960mLu POSTS;
    public static final EnumC1392960mLu STORIES;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1392960mLu> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1392960mLu enumC1392960mLu = new EnumC1392960mLu("STORIES", 0, "1");
        STORIES = enumC1392960mLu;
        EnumC1392960mLu enumC1392960mLu2 = new EnumC1392960mLu("POSTS", 1, "2");
        POSTS = enumC1392960mLu2;
        EnumC1392960mLu enumC1392960mLu3 = new EnumC1392960mLu("LIVES", 2, "3");
        LIVES = enumC1392960mLu3;
        EnumC1392960mLu enumC1392960mLu4 = new EnumC1392960mLu("ALL", 3, null);
        ALL = enumC1392960mLu4;
        EnumC1392960mLu[] enumC1392960mLuArr = {enumC1392960mLu, enumC1392960mLu2, enumC1392960mLu3, enumC1392960mLu4};
        LLILLJJLI = enumC1392960mLuArr;
        LLILLL = new C2254308sP(enumC1392960mLuArr);
    }

    public static EnumC1392960mLu[] values() {
        return (EnumC1392960mLu[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1392960mLu valueOf(String str) {
        return (EnumC1392960mLu) C08FF.LIZ(EnumC1392960mLu.class, str);
    }

    public EnumC1392960mLu(String str, int i, String str2) {
        this.LL = str2;
    }
}
