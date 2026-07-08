package X;

import com.ss.android.ugc.feed.platform.ab.LowScreenRightInteractHotpotAndSpacing;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS224S0000000_33;

/* JADX INFO: renamed from: X.1A9j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2174771A9j {
    public static final Map<String, Float> LIZ = new LinkedHashMap();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(493));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(553));

    public static LowScreenRightInteractHotpotAndSpacing LIZ() {
        return (LowScreenRightInteractHotpotAndSpacing) LIZIZ.getValue();
    }

    public static Map LIZIZ() {
        Map<String, Float> map = LIZ;
        if (map.isEmpty()) {
            map.put(EnumC2174751A9h.AVATAR_BOTTOM_SMALL.getKey(), Float.valueOf(LIZ().avatarBottomSmall));
            map.put(EnumC2174751A9h.AVATAR_TOP_SMALL.getKey(), Float.valueOf(LIZ().avatarTopSmall));
            map.put(EnumC2174751A9h.REGULAR_BOTTOM_SMALL.getKey(), Float.valueOf(LIZ().regularBottomSmall));
            map.put(EnumC2174751A9h.REGULAR_TOP_SMALL.getKey(), Float.valueOf(LIZ().regularTopSmall));
            map.put(EnumC2174751A9h.MUSIC_BOTTOM_SMALL.getKey(), Float.valueOf(LIZ().musicBottomSmall));
            map.put(EnumC2174751A9h.MUSIC_TOP_SMALL.getKey(), Float.valueOf(LIZ().musicTopSmall));
            map.put(EnumC2174751A9h.AREA_WIDTH_SMALL.getKey(), Float.valueOf(LIZ().areaWidthSmall));
            map.put(EnumC2174751A9h.AREA_HEIGHT_REGULAR_SMALL.getKey(), Float.valueOf(LIZ().areaHeightRegularSmall));
            map.put(EnumC2174751A9h.AREA_HEIGHT_AVATAR_SMALL.getKey(), Float.valueOf(LIZ().areaHeightAvatarSmall));
            map.put(EnumC2174751A9h.AREA_HEIGHT_FOLLOW_SMALL.getKey(), Float.valueOf(LIZ().areaHeightFollowSmall));
            map.put(EnumC2174751A9h.AREA_HEIGHT_MY_PROFILE_SHARE_SMALL.getKey(), Float.valueOf(LIZ().areaHeightMyProfileShareSmall));
            map.put(EnumC2174751A9h.AREA_HEIGHT_MY_PROFILE_MUSIC_SMALL.getKey(), Float.valueOf(LIZ().areaHeightMyProfileMusicSmall));
            map.put(EnumC2174751A9h.AREA_HEIGHT_MUSIC_SMALL.getKey(), Float.valueOf(LIZ().areaHeightMusicSmall));
            map.put(EnumC2174751A9h.PROFILE_MUSIC_TOP_SMALL.getKey(), Float.valueOf(LIZ().profileMusicTopSmall));
            map.put(EnumC2174751A9h.PROFILE_MUSIC_BOTTOM_SMALL.getKey(), Float.valueOf(LIZ().profileMusicBottomSmall));
        }
        return map;
    }

    public static boolean LIZJ() {
        return ((Boolean) LIZJ.getValue()).booleanValue();
    }
}
