package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14aI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC20290014aI {
    public static final EnumC20290014aI COMMENT;
    public static final EnumC20290014aI COVER;
    public static final EnumC20290014aI DEFAULT;
    public static final EnumC20290014aI DISLIKE;
    public static final EnumC20290014aI FAVORITE;
    public static final EnumC20290014aI FINISH;
    public static final EnumC20290014aI FOLLOW;
    public static final EnumC20290014aI HEAD;
    public static final EnumC20290014aI LIKE;
    public static final /* synthetic */ EnumC20290014aI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20290014aI SHAREIN;
    public static final EnumC20290014aI SHAREOUT;
    public static final EnumC20290014aI SHOOT;
    public static final EnumC20290014aI SKIP;
    public final int LL;

    public static InterfaceC2044707zh<EnumC20290014aI> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20290014aI enumC20290014aI = new EnumC20290014aI(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC20290014aI;
        EnumC20290014aI enumC20290014aI2 = new EnumC20290014aI("FINISH", 1, 1);
        FINISH = enumC20290014aI2;
        EnumC20290014aI enumC20290014aI3 = new EnumC20290014aI("SKIP", 2, 2);
        SKIP = enumC20290014aI3;
        EnumC20290014aI enumC20290014aI4 = new EnumC20290014aI("LIKE", 3, 3);
        LIKE = enumC20290014aI4;
        EnumC20290014aI enumC20290014aI5 = new EnumC20290014aI("FOLLOW", 4, 4);
        FOLLOW = enumC20290014aI5;
        EnumC20290014aI enumC20290014aI6 = new EnumC20290014aI("COVER", 5, 5);
        COVER = enumC20290014aI6;
        EnumC20290014aI enumC20290014aI7 = new EnumC20290014aI("HEAD", 6, 6);
        HEAD = enumC20290014aI7;
        EnumC20290014aI enumC20290014aI8 = new EnumC20290014aI("COMMENT", 7, 7);
        COMMENT = enumC20290014aI8;
        EnumC20290014aI enumC20290014aI9 = new EnumC20290014aI("DISLIKE", 8, 8);
        DISLIKE = enumC20290014aI9;
        EnumC20290014aI enumC20290014aI10 = new EnumC20290014aI("SHOOT", 9, 9);
        SHOOT = enumC20290014aI10;
        EnumC20290014aI enumC20290014aI11 = new EnumC20290014aI("SHAREIN", 10, 10);
        SHAREIN = enumC20290014aI11;
        EnumC20290014aI enumC20290014aI12 = new EnumC20290014aI("SHAREOUT", 11, 11);
        SHAREOUT = enumC20290014aI12;
        EnumC20290014aI enumC20290014aI13 = new EnumC20290014aI("FAVORITE", 12, 12);
        FAVORITE = enumC20290014aI13;
        EnumC20290014aI[] enumC20290014aIArr = {enumC20290014aI, enumC20290014aI2, enumC20290014aI3, enumC20290014aI4, enumC20290014aI5, enumC20290014aI6, enumC20290014aI7, enumC20290014aI8, enumC20290014aI9, enumC20290014aI10, enumC20290014aI11, enumC20290014aI12, enumC20290014aI13};
        LLILLJJLI = enumC20290014aIArr;
        LLILLL = new C2254308sP(enumC20290014aIArr);
    }

    public static EnumC20290014aI[] values() {
        return (EnumC20290014aI[]) LLILLJJLI.clone();
    }

    public final int getId() {
        return this.LL;
    }

    public static EnumC20290014aI valueOf(String str) {
        return (EnumC20290014aI) C08FF.LIZ(EnumC20290014aI.class, str);
    }

    public EnumC20290014aI(String str, int i, int i2) {
        this.LL = i2;
    }
}
