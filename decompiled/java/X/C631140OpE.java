package X;

import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.service.IProfileMusicTabService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OpE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C631140OpE {
    public static final C631140OpE LIZ = new C631140OpE();

    public static EnumC631120OpC LIZ(VideoItemParams videoItemParams) {
        String str;
        C2189821An6 c2189821An6;
        String playlistPreviousPage = null;
        if (videoItemParams != null) {
            str = videoItemParams.mEventType;
            BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
            if (baseFeedPageParams != null && (c2189821An6 = baseFeedPageParams.param) != null) {
                playlistPreviousPage = c2189821An6.getPlaylistPreviousPage();
            }
        } else {
            str = null;
        }
        return LIZIZ(str, playlistPreviousPage);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.music.model.SearchInflowParam LIZJ(com.ss.android.ugc.aweme.feed.model.VideoItemParams r6) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C631140OpE.LIZJ(com.ss.android.ugc.aweme.feed.model.VideoItemParams):com.ss.android.ugc.aweme.music.model.SearchInflowParam");
    }

    public static EnumC631120OpC LIZIZ(String str, String str2) {
        if (C652090Phv.LJ(str, str2)) {
            return EnumC631120OpC.FEED_SEARCH;
        }
        if (Intrinsics.LJFF(str, "chat")) {
            return EnumC631120OpC.FEED_DIRECT_MESSAGE;
        }
        if (C0R93.LIZLLL(str)) {
            return EnumC631120OpC.FEED_FYP;
        }
        if (Intrinsics.LJFF(str, "homepage_follow")) {
            return EnumC631120OpC.FEED_FOLLOWING;
        }
        if (C13LP.LJJJJ(str, C13LQ.LJLIIL(new String[]{"personal_homepage", "others_homepage"}))) {
            return EnumC631120OpC.FEED_PROFILE;
        }
        if (C13LP.LJJJJ(str, (Iterable) C292680Bda.LIZ.getValue())) {
            return EnumC631120OpC.FEED_INNER;
        }
        IProfileMusicTabService iProfileMusicTabService = (IProfileMusicTabService) PluggableExtentionKt.pluggableSpi$default(IProfileMusicTabService.class, false, false, false, 14, null);
        if (iProfileMusicTabService != null && iProfileMusicTabService.LJJIII(str)) {
            return EnumC631120OpC.FEED_PROFILE_SPOTLIGHT;
        }
        return EnumC631120OpC.OTHER;
    }
}
