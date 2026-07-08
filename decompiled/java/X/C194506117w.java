package X;

import com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.util.List;

/* JADX INFO: renamed from: X.117w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194506117w implements InterfaceC19882712qn<Challenge, AVChallenge> {
    public static final /* synthetic */ int LL = 0;

    public static final AVChallenge LIZ(Challenge challenge) {
        boolean z;
        Music music;
        Music music2;
        List<Music> connectMusics;
        Music music3;
        Music music4;
        List<Music> connectMusics2;
        Music music5;
        AVChallenge aVChallenge = new AVChallenge();
        aVChallenge.cid = challenge.getCid();
        aVChallenge.challengeName = challenge.getChallengeName();
        aVChallenge.stickerId = challenge.getStickerId();
        aVChallenge.type = challenge.getType();
        aVChallenge.viewCount = challenge.getViewCount();
        aVChallenge.userCount = challenge.getUserCount();
        aVChallenge.isCommerce = challenge.isCommerce();
        if (challenge.isCommerce()) {
            z = true;
        } else {
            z = false;
        }
        String avMusicId = null;
        if (z) {
            ICommerceMediaService iCommerceMediaService = (ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class);
            List<Music> connectMusics3 = challenge.getConnectMusics();
            if (connectMusics3 != null) {
                music4 = (Music) C13LP.LJJJLL(connectMusics3);
            } else {
                music4 = null;
            }
            if (!iCommerceMediaService.LJII(music4) && ((connectMusics2 = challenge.getConnectMusics()) == null || (music5 = (Music) C13LP.LJJJLL(connectMusics2)) == null || (avMusicId = music5.getMid()) == null)) {
                avMusicId = challenge.getAvMusicId();
            }
        } else if (challenge.isStrongMusic()) {
            if (((ICommerceToolsMusicService) ServiceManager.get().getService(ICommerceToolsMusicService.class)).yi2()) {
                ICommerceMediaService iCommerceMediaService2 = (ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class);
                List<Music> connectMusics4 = challenge.getConnectMusics();
                if (connectMusics4 != null) {
                    music2 = (Music) C13LP.LJJJLL(connectMusics4);
                } else {
                    music2 = null;
                }
                if (!iCommerceMediaService2.LJII(music2) && ((connectMusics = challenge.getConnectMusics()) == null || (music3 = (Music) C13LP.LJJJLL(connectMusics)) == null || (avMusicId = music3.getMid()) == null)) {
                    avMusicId = challenge.getAvMusicId();
                }
            } else {
                List<Music> connectMusics5 = challenge.getConnectMusics();
                if (connectMusics5 == null || (music = (Music) C13LP.LJJJLL(connectMusics5)) == null || (avMusicId = music.getMid()) == null) {
                    avMusicId = challenge.getAvMusicId();
                }
            }
        }
        aVChallenge.musicId = avMusicId;
        aVChallenge.mvId = challenge.getMvId();
        aVChallenge.isStrongMusic = challenge.isStrongMusic() ? 1 : 0;
        aVChallenge.mStatus = Boolean.FALSE;
        return aVChallenge;
    }

    @Override // X.InterfaceC19882712qn
    public final /* bridge */ /* synthetic */ AVChallenge apply(Challenge challenge) {
        return LIZ(challenge);
    }
}
