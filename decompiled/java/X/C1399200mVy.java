package X;

import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem;
import com.ss.android.ugc.aweme.services.external.IAILiveService;
import com.ss.android.ugc.aweme.services.external.IAILiveServiceKt;

/* JADX INFO: renamed from: X.0mVy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1399200mVy {
    public static boolean LIZ(MusicDetail musicDetail) {
        IAILiveService aiLiveService;
        IAILiveService aiLiveService2;
        Music music;
        IAILiveService aiLiveService3 = IAILiveServiceKt.getAiLiveService();
        if (aiLiveService3 == null || !aiLiveService3.isPostAILiveEnable() || (((aiLiveService = IAILiveServiceKt.getAiLiveService()) != null && aiLiveService.forbidAnchor()) || (aiLiveService2 = IAILiveServiceKt.getAiLiveService()) == null || !aiLiveService2.enableMDPBanner())) {
            return false;
        }
        C1399380mWG c1399380mWG = MusicShootAssem.LLZ;
        if (musicDetail == null) {
            return false;
        }
        c1399380mWG.getClass();
        if (C1399380mWG.LIZ(musicDetail) == null && C630880Ooo.LIZ(musicDetail).getShootAction() == EnumC1850200yFO.DIRECT_TO_SHOOT && (music = musicDetail.music) != null && music.available()) {
            return true;
        }
        return false;
    }
}
