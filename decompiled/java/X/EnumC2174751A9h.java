package X;

import com.ss.android.ugc.feed.platform.ab.LowScreenOptimizeAB;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1A9h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC2174751A9h {
    public static final EnumC2174751A9h AREA_HEIGHT_AVATAR;
    public static final EnumC2174751A9h AREA_HEIGHT_AVATAR_SMALL;
    public static final EnumC2174751A9h AREA_HEIGHT_FOLLOW;
    public static final EnumC2174751A9h AREA_HEIGHT_FOLLOW_SMALL;
    public static final EnumC2174751A9h AREA_HEIGHT_MUSIC;
    public static final EnumC2174751A9h AREA_HEIGHT_MUSIC_SMALL;
    public static final EnumC2174751A9h AREA_HEIGHT_MY_PROFILE_MUSIC;
    public static final EnumC2174751A9h AREA_HEIGHT_MY_PROFILE_MUSIC_SMALL;
    public static final EnumC2174751A9h AREA_HEIGHT_MY_PROFILE_SHARE;
    public static final EnumC2174751A9h AREA_HEIGHT_MY_PROFILE_SHARE_SMALL;
    public static final EnumC2174751A9h AREA_HEIGHT_REGULAR;
    public static final EnumC2174751A9h AREA_HEIGHT_REGULAR_SMALL;
    public static final EnumC2174751A9h AREA_WIDTH;
    public static final EnumC2174751A9h AREA_WIDTH_AVATAR;
    public static final EnumC2174751A9h AREA_WIDTH_SMALL;
    public static final EnumC2174751A9h AVATAR_BOTTOM;
    public static final EnumC2174751A9h AVATAR_BOTTOM_SMALL;
    public static final EnumC2174751A9h AVATAR_TOP;
    public static final EnumC2174751A9h AVATAR_TOP_SMALL;
    public static final /* synthetic */ EnumC2174751A9h[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2174751A9h MUSIC_BOTTOM;
    public static final EnumC2174751A9h MUSIC_BOTTOM_SMALL;
    public static final EnumC2174751A9h MUSIC_TOP;
    public static final EnumC2174751A9h MUSIC_TOP_SMALL;
    public static final EnumC2174751A9h PROFILE_MUSIC_BOTTOM;
    public static final EnumC2174751A9h PROFILE_MUSIC_BOTTOM_SMALL;
    public static final EnumC2174751A9h PROFILE_MUSIC_TOP;
    public static final EnumC2174751A9h PROFILE_MUSIC_TOP_SMALL;
    public static final EnumC2174751A9h REGULAR_BOTTOM;
    public static final EnumC2174751A9h REGULAR_BOTTOM_SMALL;
    public static final EnumC2174751A9h REGULAR_TOP;
    public static final EnumC2174751A9h REGULAR_TOP_SMALL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2174751A9h> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2174751A9h enumC2174751A9h = new EnumC2174751A9h("AVATAR_BOTTOM", 0, "AVATAR_BOTTOM");
        AVATAR_BOTTOM = enumC2174751A9h;
        EnumC2174751A9h enumC2174751A9h2 = new EnumC2174751A9h("AVATAR_TOP", 1, "AVATAR_TOP");
        AVATAR_TOP = enumC2174751A9h2;
        EnumC2174751A9h enumC2174751A9h3 = new EnumC2174751A9h("REGULAR_BOTTOM", 2, "REGULAR_BOTTOM");
        REGULAR_BOTTOM = enumC2174751A9h3;
        EnumC2174751A9h enumC2174751A9h4 = new EnumC2174751A9h("REGULAR_TOP", 3, "REGULAR_TOP");
        REGULAR_TOP = enumC2174751A9h4;
        EnumC2174751A9h enumC2174751A9h5 = new EnumC2174751A9h("MUSIC_BOTTOM", 4, "MUSIC_BOTTOM");
        MUSIC_BOTTOM = enumC2174751A9h5;
        EnumC2174751A9h enumC2174751A9h6 = new EnumC2174751A9h("MUSIC_TOP", 5, "MUSIC_TOP");
        MUSIC_TOP = enumC2174751A9h6;
        EnumC2174751A9h enumC2174751A9h7 = new EnumC2174751A9h("AVATAR_BOTTOM_SMALL", 6, "AVATAR_BOTTOM_SMALL");
        AVATAR_BOTTOM_SMALL = enumC2174751A9h7;
        EnumC2174751A9h enumC2174751A9h8 = new EnumC2174751A9h("AVATAR_TOP_SMALL", 7, "AVATAR_TOP_SMALL");
        AVATAR_TOP_SMALL = enumC2174751A9h8;
        EnumC2174751A9h enumC2174751A9h9 = new EnumC2174751A9h("REGULAR_BOTTOM_SMALL", 8, "REGULAR_BOTTOM_SMALL");
        REGULAR_BOTTOM_SMALL = enumC2174751A9h9;
        EnumC2174751A9h enumC2174751A9h10 = new EnumC2174751A9h("REGULAR_TOP_SMALL", 9, "REGULAR_TOP_SMALL");
        REGULAR_TOP_SMALL = enumC2174751A9h10;
        EnumC2174751A9h enumC2174751A9h11 = new EnumC2174751A9h("MUSIC_BOTTOM_SMALL", 10, "MUSIC_BOTTOM_SMALL");
        MUSIC_BOTTOM_SMALL = enumC2174751A9h11;
        EnumC2174751A9h enumC2174751A9h12 = new EnumC2174751A9h("MUSIC_TOP_SMALL", 11, "LAST_TOP_SMALL");
        MUSIC_TOP_SMALL = enumC2174751A9h12;
        EnumC2174751A9h enumC2174751A9h13 = new EnumC2174751A9h("PROFILE_MUSIC_TOP", 12, "PROFILE_MUSIC_TOP");
        PROFILE_MUSIC_TOP = enumC2174751A9h13;
        EnumC2174751A9h enumC2174751A9h14 = new EnumC2174751A9h("PROFILE_MUSIC_TOP_SMALL", 13, "PROFILE_MUSIC_TOP_SMALL");
        PROFILE_MUSIC_TOP_SMALL = enumC2174751A9h14;
        EnumC2174751A9h enumC2174751A9h15 = new EnumC2174751A9h("PROFILE_MUSIC_BOTTOM", 14, "PROFILE_MUSIC_BOTTOM");
        PROFILE_MUSIC_BOTTOM = enumC2174751A9h15;
        EnumC2174751A9h enumC2174751A9h16 = new EnumC2174751A9h("PROFILE_MUSIC_BOTTOM_SMALL", 15, "PROFILE_MUSIC_BOTTOM_SMALL");
        PROFILE_MUSIC_BOTTOM_SMALL = enumC2174751A9h16;
        EnumC2174751A9h enumC2174751A9h17 = new EnumC2174751A9h("AREA_WIDTH", 16, "AREA_WIDTH");
        AREA_WIDTH = enumC2174751A9h17;
        EnumC2174751A9h enumC2174751A9h18 = new EnumC2174751A9h("AREA_WIDTH_AVATAR", 17, "AREA_WIDTH_AVATAR");
        AREA_WIDTH_AVATAR = enumC2174751A9h18;
        EnumC2174751A9h enumC2174751A9h19 = new EnumC2174751A9h("AREA_HEIGHT_REGULAR", 18, "AREA_HEIGHT_REGULAR");
        AREA_HEIGHT_REGULAR = enumC2174751A9h19;
        EnumC2174751A9h enumC2174751A9h20 = new EnumC2174751A9h("AREA_HEIGHT_AVATAR", 19, "AREA_HEIGHT_AVATAR");
        AREA_HEIGHT_AVATAR = enumC2174751A9h20;
        EnumC2174751A9h enumC2174751A9h21 = new EnumC2174751A9h("AREA_HEIGHT_FOLLOW", 20, "AREA_HEIGHT_FOLLOW");
        AREA_HEIGHT_FOLLOW = enumC2174751A9h21;
        EnumC2174751A9h enumC2174751A9h22 = new EnumC2174751A9h("AREA_WIDTH_SMALL", 21, "AREA_WIDTH_SMALL");
        AREA_WIDTH_SMALL = enumC2174751A9h22;
        EnumC2174751A9h enumC2174751A9h23 = new EnumC2174751A9h("AREA_HEIGHT_REGULAR_SMALL", 22, "AREA_HEIGHT_REGULAR_SMALL");
        AREA_HEIGHT_REGULAR_SMALL = enumC2174751A9h23;
        EnumC2174751A9h enumC2174751A9h24 = new EnumC2174751A9h("AREA_HEIGHT_AVATAR_SMALL", 23, "AREA_HEIGHT_AVATAR_SMALL");
        AREA_HEIGHT_AVATAR_SMALL = enumC2174751A9h24;
        EnumC2174751A9h enumC2174751A9h25 = new EnumC2174751A9h("AREA_HEIGHT_FOLLOW_SMALL", 24, "AREA_HEIGHT_FOLLOW_SMALL");
        AREA_HEIGHT_FOLLOW_SMALL = enumC2174751A9h25;
        EnumC2174751A9h enumC2174751A9h26 = new EnumC2174751A9h("AREA_HEIGHT_MY_PROFILE_SHARE", 25, "AREA_HEIGHT_MY_PROFILE_SHARE");
        AREA_HEIGHT_MY_PROFILE_SHARE = enumC2174751A9h26;
        EnumC2174751A9h enumC2174751A9h27 = new EnumC2174751A9h("AREA_HEIGHT_MY_PROFILE_SHARE_SMALL", 26, "AREA_HEIGHT_MY_PROFILE_SHARE_SMALL");
        AREA_HEIGHT_MY_PROFILE_SHARE_SMALL = enumC2174751A9h27;
        EnumC2174751A9h enumC2174751A9h28 = new EnumC2174751A9h("AREA_HEIGHT_MY_PROFILE_MUSIC", 27, "AREA_HEIGHT_MY_PROFILE_MUSIC");
        AREA_HEIGHT_MY_PROFILE_MUSIC = enumC2174751A9h28;
        EnumC2174751A9h enumC2174751A9h29 = new EnumC2174751A9h("AREA_HEIGHT_MY_PROFILE_MUSIC_SMALL", 28, "AREA_HEIGHT_MY_PROFILE_MUSIC_SMALL");
        AREA_HEIGHT_MY_PROFILE_MUSIC_SMALL = enumC2174751A9h29;
        EnumC2174751A9h enumC2174751A9h30 = new EnumC2174751A9h("AREA_HEIGHT_MUSIC", 29, "AREA_HEIGHT_MUSIC");
        AREA_HEIGHT_MUSIC = enumC2174751A9h30;
        EnumC2174751A9h enumC2174751A9h31 = new EnumC2174751A9h("AREA_HEIGHT_MUSIC_SMALL", 30, "AREA_HEIGHT_MUSIC_SMALL");
        AREA_HEIGHT_MUSIC_SMALL = enumC2174751A9h31;
        EnumC2174751A9h[] enumC2174751A9hArr = {enumC2174751A9h, enumC2174751A9h2, enumC2174751A9h3, enumC2174751A9h4, enumC2174751A9h5, enumC2174751A9h6, enumC2174751A9h7, enumC2174751A9h8, enumC2174751A9h9, enumC2174751A9h10, enumC2174751A9h11, enumC2174751A9h12, enumC2174751A9h13, enumC2174751A9h14, enumC2174751A9h15, enumC2174751A9h16, enumC2174751A9h17, enumC2174751A9h18, enumC2174751A9h19, enumC2174751A9h20, enumC2174751A9h21, enumC2174751A9h22, enumC2174751A9h23, enumC2174751A9h24, enumC2174751A9h25, enumC2174751A9h26, enumC2174751A9h27, enumC2174751A9h28, enumC2174751A9h29, enumC2174751A9h30, enumC2174751A9h31};
        LLILLJJLI = enumC2174751A9hArr;
        LLILLL = new C2254308sP(enumC2174751A9hArr);
    }

    public static EnumC2174751A9h[] values() {
        return (EnumC2174751A9h[]) LLILLJJLI.clone();
    }

    public final float get() {
        if (LowScreenOptimizeAB.LIZIZ() && C2174771A9j.LIZJ()) {
            Float f = (Float) ((LinkedHashMap) C2174771A9j.LIZIZ()).get(this.LL);
            if (f != null) {
                float fFloatValue = f.floatValue();
                if (fFloatValue != 0.0f) {
                    return fFloatValue;
                }
            }
        }
        Map<String, Float> map = C2174761A9i.LIZ;
        Float f2 = (Float) ((LinkedHashMap) C2174761A9i.LIZ()).get(this.LL);
        if (f2 != null) {
            return f2.floatValue();
        }
        return 0.0f;
    }

    public final String getKey() {
        return this.LL;
    }

    public static EnumC2174751A9h valueOf(String str) {
        return (EnumC2174751A9h) C08FF.LIZ(EnumC2174751A9h.class, str);
    }

    public final float getOrDefault(float f) {
        if (LowScreenOptimizeAB.LIZIZ() && C2174771A9j.LIZJ()) {
            Float f2 = (Float) ((LinkedHashMap) C2174771A9j.LIZIZ()).get(this.LL);
            if (!Intrinsics.LIZLLL(f2, 0.0f) && f2 != null) {
                return f2.floatValue();
            }
            return f;
        }
        Map<String, Float> map = C2174761A9i.LIZ;
        Float f3 = (Float) ((LinkedHashMap) C2174761A9i.LIZ()).get(this.LL);
        if (!Intrinsics.LIZLLL(f3, 0.0f) && f3 != null) {
            return f3.floatValue();
        }
        return f;
    }

    public EnumC2174751A9h(String str, int i, String str2) {
        this.LL = str2;
    }
}
