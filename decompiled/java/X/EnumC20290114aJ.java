package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14aJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC20290114aJ {
    public static final EnumC20290114aJ COMMENT;
    public static final EnumC20290114aJ COVER;
    public static final C20290514aN Companion;
    public static final EnumC20290114aJ DISLIKE;
    public static final EnumC20290114aJ DURATION;
    public static final EnumC20290114aJ FAVORITE;
    public static final EnumC20290114aJ FINISH;
    public static final EnumC20290114aJ FOLLOW;
    public static final EnumC20290114aJ HEAD;
    public static final EnumC20290114aJ LIKE;
    public static final /* synthetic */ EnumC20290114aJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20290114aJ MULTI_SKIP;
    public static final EnumC20290114aJ PROFILE;
    public static final EnumC20290114aJ SHARE;
    public static final EnumC20290114aJ SHARE_OUT;
    public static final EnumC20290114aJ SHOOT;
    public static final EnumC20290114aJ SKIP;
    public static final EnumC20290114aJ UNSET;
    public int LL;

    public static InterfaceC2044707zh<EnumC20290114aJ> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [X.14aN] */
    static {
        EnumC20290114aJ enumC20290114aJ = new EnumC20290114aJ("UNSET", 0, 0);
        UNSET = enumC20290114aJ;
        EnumC20290114aJ enumC20290114aJ2 = new EnumC20290114aJ("FINISH", 1, 1);
        FINISH = enumC20290114aJ2;
        EnumC20290114aJ enumC20290114aJ3 = new EnumC20290114aJ("SKIP", 2, 2);
        SKIP = enumC20290114aJ3;
        EnumC20290114aJ enumC20290114aJ4 = new EnumC20290114aJ("LIKE", 3, 3);
        LIKE = enumC20290114aJ4;
        EnumC20290114aJ enumC20290114aJ5 = new EnumC20290114aJ("FOLLOW", 4, 4);
        FOLLOW = enumC20290114aJ5;
        EnumC20290114aJ enumC20290114aJ6 = new EnumC20290114aJ("COVER", 5, 5);
        COVER = enumC20290114aJ6;
        EnumC20290114aJ enumC20290114aJ7 = new EnumC20290114aJ("HEAD", 6, 6);
        HEAD = enumC20290114aJ7;
        EnumC20290114aJ enumC20290114aJ8 = new EnumC20290114aJ("COMMENT", 7, 7);
        COMMENT = enumC20290114aJ8;
        EnumC20290114aJ enumC20290114aJ9 = new EnumC20290114aJ("DISLIKE", 8, 8);
        DISLIKE = enumC20290114aJ9;
        EnumC20290114aJ enumC20290114aJ10 = new EnumC20290114aJ("SHOOT", 9, 9);
        SHOOT = enumC20290114aJ10;
        EnumC20290114aJ enumC20290114aJ11 = new EnumC20290114aJ("SHARE", 10, 10);
        SHARE = enumC20290114aJ11;
        EnumC20290114aJ enumC20290114aJ12 = new EnumC20290114aJ("SHARE_OUT", 11, 11);
        SHARE_OUT = enumC20290114aJ12;
        EnumC20290114aJ enumC20290114aJ13 = new EnumC20290114aJ("FAVORITE", 12, 12);
        FAVORITE = enumC20290114aJ13;
        EnumC20290114aJ enumC20290114aJ14 = new EnumC20290114aJ("PROFILE", 13, 13);
        PROFILE = enumC20290114aJ14;
        EnumC20290114aJ enumC20290114aJ15 = new EnumC20290114aJ("DURATION", 14, 14);
        DURATION = enumC20290114aJ15;
        EnumC20290114aJ enumC20290114aJ16 = new EnumC20290114aJ("MULTI_SKIP", 15, 102);
        MULTI_SKIP = enumC20290114aJ16;
        EnumC20290114aJ[] enumC20290114aJArr = {enumC20290114aJ, enumC20290114aJ2, enumC20290114aJ3, enumC20290114aJ4, enumC20290114aJ5, enumC20290114aJ6, enumC20290114aJ7, enumC20290114aJ8, enumC20290114aJ9, enumC20290114aJ10, enumC20290114aJ11, enumC20290114aJ12, enumC20290114aJ13, enumC20290114aJ14, enumC20290114aJ15, enumC20290114aJ16};
        LLILLJJLI = enumC20290114aJArr;
        LLILLL = new C2254308sP(enumC20290114aJArr);
        Companion = new Object() { // from class: X.14aN
        };
    }

    public static EnumC20290114aJ[] values() {
        return (EnumC20290114aJ[]) LLILLJJLI.clone();
    }

    public final int getTYPE() {
        return this.LL;
    }

    public static EnumC20290114aJ valueOf(String str) {
        return (EnumC20290114aJ) C08FF.LIZ(EnumC20290114aJ.class, str);
    }

    public final void setTYPE(int i) {
        this.LL = i;
    }

    public EnumC20290114aJ(String str, int i, int i2) {
        this.LL = i2;
    }
}
