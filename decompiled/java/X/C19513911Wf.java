package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.11Wf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19513911Wf {
    public static ArrayList LIZ(MusicDetail musicDetail) {
        List<ExternalMusicInfo> externalMusicInfos;
        ArrayList arrayList = new ArrayList();
        Music music = musicDetail.music;
        if (music != null && music.getExternalMusicInfos() != null) {
            Music music2 = musicDetail.music;
            if (music2 != null) {
                externalMusicInfos = music2.getExternalMusicInfos();
            } else {
                externalMusicInfos = null;
            }
            if (C086I.LIZIZ(externalMusicInfos)) {
                return arrayList;
            }
            for (ExternalMusicInfo externalMusicInfo : externalMusicInfos) {
                if (!TextUtils.isEmpty(externalMusicInfo.getJumpUrl()) && !TextUtils.isEmpty(externalMusicInfo.getPartnerName())) {
                    Music music3 = musicDetail.music;
                    if (music3 != null) {
                        music3.isPgc();
                    }
                    if (!C086I.LIZIZ(((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJJZ(externalMusicInfo.getPartnerName()))) {
                        arrayList.add(externalMusicInfo);
                    }
                }
            }
        }
        return arrayList;
    }
}
