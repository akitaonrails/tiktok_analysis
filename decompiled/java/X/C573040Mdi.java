package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.mediaselector.IPreDownloadMusic;
import com.ss.android.ugc.aweme.mvtheme.MVTransitionParam;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.services.upload.IPhotoPreDownloadMusic;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.templatecore.templatedata.MvThemeData;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lth.o;

/* JADX INFO: renamed from: X.0Mdi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C573040Mdi extends C09AY implements InterfaceC1685420txc<MvThemeData, MusicModel, String, Boolean, Boolean, Unit> {
    public final /* synthetic */ C573020Mdg LL;
    public final /* synthetic */ C573110Mdp LLILLJJLI;
    public final /* synthetic */ ShortVideoContext LLILLL;
    public final /* synthetic */ IPhotoPreDownloadMusic LLILZ = null;
    public final /* synthetic */ List<String> LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C573040Mdi(C573020Mdg c573020Mdg, C573110Mdp c573110Mdp, ShortVideoContext shortVideoContext, List list, String str) {
        super(5);
        this.LL = c573020Mdg;
        this.LLILLJJLI = c573110Mdp;
        this.LLILLL = shortVideoContext;
        this.LLILZIL = list;
        this.LLILZLL = str;
    }

    @Override // X.InterfaceC1685420txc
    public final Unit invoke(MvThemeData mvThemeData, MusicModel musicModel, String str, Boolean bool, Boolean bool2) {
        boolean z;
        boolean z2;
        Pair<Boolean, Double> pair;
        C1402840mbq c1402840mbq;
        int musicStartFromCut;
        HashMap<String, Integer> map;
        Integer num;
        MvThemeData mvThemeData2 = mvThemeData;
        MusicModel musicModel2 = musicModel;
        String str2 = str;
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        Pair pair2 = new Pair(musicModel2, str2);
        MusicModel musicModel3 = (MusicModel) pair2.getFirst();
        String str3 = (String) pair2.getSecond();
        C573020Mdg c573020Mdg = this.LL;
        c573020Mdg.LJI = musicModel2;
        c573020Mdg.LJII = str2;
        c573020Mdg.LJIILIIL = zBooleanValue;
        boolean zLIZJ = C2286708xd.LIZJ(str3);
        int i = 0;
        if (this.LLILLJJLI.LIZ != 0 && ((musicModel3 != null && musicModel3.getId() == Long.MIN_VALUE) || !zLIZJ)) {
            z = true;
        } else {
            z = false;
        }
        if (C301560Bru.LIZ() && Intrinsics.LJFF(this.LLILLL.creativeModel.onThisDayData.getDisableAutoSelectMusicInEditing(), Boolean.TRUE)) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str4 = "";
        if (musicModel3 != null && str3 != null && !z && (((c1402840mbq = this.LLILLL.shareContext) == null || (map = c1402840mbq.mExtraShareOptions) == null || (num = map.get("tiktok_videokit_disable_music_selection")) == null || num.intValue() != 1) && !z2)) {
            IPreDownloadMusic iPreDownloadMusicLIZ = C569270MUj.LIZ(this.LL.LIZ, null, false);
            if (!zBooleanValue2 && iPreDownloadMusicLIZ != null) {
                iPreDownloadMusicLIZ.setIsChangeMusicDownloadSuccess(true, musicModel3, str3);
            }
            IPhotoPreDownloadMusic iPhotoPreDownloadMusic = this.LLILZ;
            if (iPhotoPreDownloadMusic != null) {
                iPhotoPreDownloadMusic.firstMusicDownloadSuccess(musicModel3, str3);
            }
            ShortVideoContext shortVideoContext = this.LLILLL;
            if (shortVideoContext.cameraComponentModel.mWorkspace == null) {
                shortVideoContext.cameraComponentModel.mWorkspace = C14D2.LIZ(shortVideoContext.creativeInfo);
            }
            Workspace workspace = this.LLILLL.cameraComponentModel.mWorkspace;
            if (workspace != null) {
                workspace.MC(str3);
            }
            ShortVideoContext shortVideoContext2 = this.LLILLL;
            shortVideoContext2.cameraComponentModel.mMusicPath = str3;
            boolean z3 = !zBooleanValue;
            shortVideoContext2.mIsPhotoMvModeMusic = z3;
            int duration = musicModel3.getDuration();
            if (duration > 0) {
                this.LLILLL.LJJLIIIJ(duration);
            }
            ShortVideoContext shortVideoContext3 = this.LLILLL;
            if (C536570L2p.LIZ()) {
                musicStartFromCut = musicModel3.getMusicStartFromCut();
            } else {
                musicStartFromCut = 0;
            }
            shortVideoContext3.cameraComponentModel.mMusicStart = musicStartFromCut;
            if (C1399580mWa.LIZ()) {
                this.LLILLL.cameraComponentModel.musicEndTime = musicModel3.getMusicEndTime();
            }
            MusicBuzModel musicBuzModel = this.LLILLL.creativeModel.musicBuzModel;
            musicBuzModel.musicStartFromCut = 0;
            musicBuzModel.musicEditFrom = "";
            C1452640nuA.LJII(o.LJI.transformMusicModel(musicModel3), z3, this.LLILLL.creativeModel.musicBuzModel);
            if (!C0C64.LJIILLIIL().LJIIIZ(31744, "skip_use_cache_and_clear_opt_in_photo_mv", true, true)) {
                C533510Kw9 c533510Kw9 = C533510Kw9.LIZ;
                Long lValueOf = Long.valueOf(musicModel3.getId());
                C19EG c19eg = this.LL.LIZ;
                c533510Kw9.getClass();
                C533510Kw9.LJII(lValueOf, c19eg);
            }
        }
        String strLIZJ = mvThemeData2.LIZJ();
        MvCreateVideoData mvCreateVideoData = new MvCreateVideoData();
        Iterator<String> it2 = this.LLILZIL.iterator();
        while (it2.hasNext()) {
            mvCreateVideoData.selectMediaList.add(it2.next());
        }
        mvCreateVideoData.isMVRes1080p = C573200Mdy.LIZ();
        if (C296010Bix.LIZ() || C295930Bip.LIZ()) {
            Effect effect = mvThemeData2.effect;
            if (effect != null) {
                pair = C385400F9e.LIZ(effect);
            } else {
                pair = new Pair<>(Boolean.FALSE, Double.valueOf(0.5d));
            }
            boolean zBooleanValue3 = pair.getFirst().booleanValue();
            double dDoubleValue = pair.getSecond().doubleValue();
            if (strLIZJ != null) {
                str4 = strLIZJ;
            }
            mvCreateVideoData.mvTransitionParam = new MVTransitionParam(str4, Long.valueOf((long) (dDoubleValue * ((double) 1000000))), Boolean.valueOf(zBooleanValue3), mvThemeData2.effect.getEffectId());
        }
        C564000MAc.LIZJ("PhotoModule: mvMediaData.isMVRes1080p = " + C573200Mdy.LIZ() + " transitionParam = " + mvCreateVideoData.mvTransitionParam);
        C573020Mdg c573020Mdg2 = this.LL;
        c573020Mdg2.LJ = mvThemeData2;
        c573020Mdg2.LJFF = this.LLILLL.LJ();
        if (!C580130Mp9.LIZ(mvCreateVideoData.selectMediaList) && !TextUtils.isEmpty(strLIZJ)) {
            this.LL.LJII(mvCreateVideoData, this.LLILZLL);
        }
        this.LL.getClass();
        if (str3 == null || musicModel3 == null) {
            i = 2;
        }
        C573020Mdg.LJ(i, this.LL.LJIILJJIL, this.LLILZIL.size());
        return Unit.LIZ;
    }
}
