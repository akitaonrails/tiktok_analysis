package X;

import com.zhiliaoapp.musically.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.19bB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC21569519bB {
    public static final EnumC21569519bB LIVE_COHOST_LIST_AVATAR;
    public static final EnumC21569519bB LIVE_INBOX_LIVING_ICON_NEW;
    public static final EnumC21569519bB LIVE_MULTI_GUEST_TOP_LIVE;
    public static final EnumC21569519bB LIVE_PREVIEW_LIVING_ICON_NEW;
    public static final EnumC21569519bB LIVE_PREVIEW_LIVING_ICON_OLD;
    public static final EnumC21569519bB LIVE_TOPLIVE_PAGE_AVATAR;
    public static final EnumC21569519bB LIVE_TOPLIVE_SKY_LIVING_ICON_NEW;
    public static final /* synthetic */ EnumC21569519bB[] LLIZ;
    public static final /* synthetic */ C2254308sP LLIZLLLIL;
    public final float LL;
    public final float LLILLJJLI;
    public final float LLILLL;
    public final float LLILZ;
    public final float LLILZIL;
    public final int LLILZLL;

    public static InterfaceC2044707zh<EnumC21569519bB> getEntries() {
        return LLIZLLLIL;
    }

    static {
        EnumC21569519bB enumC21569519bB = new EnumC21569519bB(0.125f, 0.06818182f, 0.12f, 0.04f, 0.04f, 0, -1, "LIVE_PREVIEW_LIVING_ICON_OLD");
        LIVE_PREVIEW_LIVING_ICON_OLD = enumC21569519bB;
        EnumC21569519bB enumC21569519bB2 = new EnumC21569519bB(0.160625f, 0.027083332f, 0.125f, 0.125f, 0.14583333f, 1, -1, "LIVE_PREVIEW_LIVING_ICON_NEW");
        LIVE_PREVIEW_LIVING_ICON_NEW = enumC21569519bB2;
        EnumC21569519bB enumC21569519bB3 = new EnumC21569519bB(0.09125f, 0.025f, 0.275f, 0.325f, 0.325f, 2, -1, "LIVE_INBOX_LIVING_ICON_NEW");
        LIVE_INBOX_LIVING_ICON_NEW = enumC21569519bB3;
        EnumC21569519bB enumC21569519bB4 = new EnumC21569519bB(0.089999996f, 0.025f, 0.3f, 0.325f, 0.325f, 3, -1, "LIVE_TOPLIVE_SKY_LIVING_ICON_NEW");
        LIVE_TOPLIVE_SKY_LIVING_ICON_NEW = enumC21569519bB4;
        EnumC21569519bB enumC21569519bB5 = new EnumC21569519bB(0.09125f, 0.025f, 0.275f, 0.325f, 0.325f, 4, -1, "LIVE_TOPLIVE_PAGE_AVATAR");
        LIVE_TOPLIVE_PAGE_AVATAR = enumC21569519bB5;
        EnumC21569519bB enumC21569519bB6 = new EnumC21569519bB(0.09125f, 0.025f, 0.275f, 0.325f, 0.325f, 5, -1, "LIVE_COHOST_LIST_AVATAR");
        LIVE_COHOST_LIST_AVATAR = enumC21569519bB6;
        EnumC21569519bB enumC21569519bB7 = new EnumC21569519bB(0.160625f, 0.027083332f, 0.125f, 0.125f, 0.14583333f, 6, C20642515q3.LIZIZ(R.attr.nj), "LIVE_MULTI_GUEST_TOP_LIVE");
        LIVE_MULTI_GUEST_TOP_LIVE = enumC21569519bB7;
        EnumC21569519bB[] enumC21569519bBArr = {enumC21569519bB, enumC21569519bB2, enumC21569519bB3, enumC21569519bB4, enumC21569519bB5, enumC21569519bB6, enumC21569519bB7};
        LLIZ = enumC21569519bBArr;
        LLIZLLLIL = new C2254308sP(enumC21569519bBArr);
    }

    public static EnumC21569519bB[] values() {
        return (EnumC21569519bB[]) LLIZ.clone();
    }

    public final int getBarColor() {
        return this.LLILZLL;
    }

    public final float getBarRadiusRatio() {
        return this.LLILLJJLI;
    }

    public final float getBarWidthRatio() {
        return this.LL;
    }

    public final float getBottomSpaceRatio() {
        return this.LLILZIL;
    }

    public final float getHorizontalSpaceRatio() {
        return this.LLILLL;
    }

    public final float getTopSpaceRatio() {
        return this.LLILZ;
    }

    public static EnumC21569519bB valueOf(String str) {
        return (EnumC21569519bB) C08FF.LIZ(EnumC21569519bB.class, str);
    }

    public EnumC21569519bB(float f, float f2, float f3, float f4, float f5, int i, int i2, String str) {
        this.LL = f;
        this.LLILLJJLI = f2;
        this.LLILLL = f3;
        this.LLILZ = f4;
        this.LLILZIL = f5;
        this.LLILZLL = i2;
    }
}
