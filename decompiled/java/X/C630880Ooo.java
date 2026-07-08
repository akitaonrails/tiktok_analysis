package X;

import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import java.util.List;

/* JADX INFO: renamed from: X.0Ooo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C630880Ooo {
    public static final EnumC1850160yFK LIZ(MusicDetail musicDetail) {
        List<Music> list;
        if (musicDetail == null) {
            return EnumC1850160yFK.NOTHING;
        }
        if (!((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LIZJ(musicDetail.music)) {
            return EnumC1850160yFK.NOTHING;
        }
        int i = musicDetail.aiRecommendShowType;
        if (i == 1) {
            return EnumC1850160yFK.NEW_AI_RECOMMENDED_MUSIC_SHEET_MUSIC_VIEW;
        }
        if (i == 2) {
            return EnumC1850160yFK.NEW_AI_RECOMMENDED_MUSIC_SHEET_MV_VIEW;
        }
        if (musicDetail.showRecommendMusic && (list = musicDetail.recommendMusicList) != null && !list.isEmpty()) {
            return EnumC1850160yFK.AI_RECOMMEND_MUSIC_CARD_LIST_VIEW;
        }
        return EnumC1850160yFK.ONLY_COMMERCIAL_MUSIC_TEXT_VIEW;
    }
}
