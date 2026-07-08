package X;

import android.app.Activity;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.service.MusicRecordService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.UUID;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0mOv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1394830mOv {
    public static final C1394830mOv LIZ = new C1394830mOv();

    public static void LIZ(C1394830mOv c1394830mOv, Activity activity, Fragment fragment, Aweme aweme, String str) {
        Music music;
        int videoLength;
        boolean z;
        boolean z2;
        String str2;
        c1394830mOv.getClass();
        if (aweme != null && (music = aweme.getMusic()) != null) {
            String stickerIDs = aweme.getStickerIDs();
            Video video = aweme.getVideo();
            if (video != null) {
                videoLength = video.getVideoLength();
            } else {
                videoLength = 0;
            }
            if (aweme.getMusicBeginTime() < aweme.getMusicEndTime() && aweme.getMusicBeginTime() >= 0) {
                music.setMusicBeginTime(aweme.getMusicBeginTime());
                music.setMusicEndTime(aweme.getMusicEndTime());
            }
            MusicRecordService musicRecordService = new MusicRecordService();
            boolean zDownloadEffectOrMusicAfterEnterCamera = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera();
            boolean zIsRecording = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().shortVideoConfig().isRecording();
            String string = UUID.randomUUID().toString();
            MusicModel musicModelConvertToMusicModel = music.convertToMusicModel();
            C15L7 c15l7 = new C15L7() { // from class: X.0mOw
                @Override // X.C15L7
                public final void LIZ() {
                }

                @Override // X.C15L7
                public final void LIZJ() {
                }

                @Override // X.C15L7
                public final void LIZLLL() {
                }

                @Override // X.C15L7
                public final /* synthetic */ boolean LJ() {
                    return false;
                }

                @Override // X.C15L7
                public final /* synthetic */ void LJFF(MusicModel musicModel, Effect effect) {
                }

                @Override // X.C15L7
                public final void LJI() {
                }
            };
            if (zDownloadEffectOrMusicAfterEnterCamera && (!zIsRecording || activity == null)) {
                z = true;
            } else {
                z = false;
            }
            Boolean bool = Boolean.FALSE;
            musicRecordService.startRecord(fragment, activity, musicModelConvertToMusicModel, stickerIDs, "", c15l7, videoLength, z, str, 2, "single_song", "single_song", string, bool, str, Boolean.TRUE, bool, null, null, null, C1212100heC.LIZIZ(aweme));
            if (music.getCollectStatus() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            C1458960o4M.LIZJ(z2);
            C1394830mOv c1394830mOv2 = LIZ;
            String aid = aweme.getAid();
            c1394830mOv2.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_method", "click_music_publish");
            c2344009Gk.LIZLLL(music.getId(), "music_id");
            c2344009Gk.LJIIIIZZ("creation_id", string);
            c2344009Gk.LJIIIIZZ("enter_from", str);
            c2344009Gk.LJIIIIZZ("shoot_way", "single_song");
            c2344009Gk.LJIIIIZZ("group_id", aid);
            if (TextUtils.isEmpty("")) {
                str2 = "";
            } else {
                str2 = ((String[]) a0.LJJLIIIJILLIZJL("", new String[]{","}, 0, 6).toArray(new String[0]))[0];
            }
            c2344009Gk.LJIIIIZZ("giphy_id", str2);
            c2344009Gk.LIZJ(C1458960o4M.LIZ(), "favorite_scene");
            C0Q1Q.LIZ(c2344009Gk, C1ER1.LIZIZ.fetchSearchParams(str, ""));
            c2344009Gk.LIZJ(C1443560nfW.LJIIIIZZ, "from_aigc_theme_status");
            ((IRecordMobService) ServiceManager.get().getService(IRecordMobService.class)).LIZ(c2344009Gk.LIZ);
        }
    }
}
