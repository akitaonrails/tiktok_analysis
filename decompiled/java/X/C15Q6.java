package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.ISDKService;
import com.ss.android.ugc.aweme.services.external.UIServiceCallback;
import com.ss.android.ugc.aweme.services.external.ui.DuetConfig;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.external.ui.StickerDownloadConfig;
import com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.GameDuetResource;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.AwS552S0100000_8;
import lth.o;

/* JADX INFO: renamed from: X.15Q6, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15Q6 implements ISDKService.SplitCallback {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ DuetConfig LIZJ;
    public final /* synthetic */ AbstractC20598115it LIZLLL;
    public final /* synthetic */ RecordConfig LJ;
    public final /* synthetic */ boolean LJFF;
    public final /* synthetic */ Context LJI;
    public final /* synthetic */ UIServiceCallback LJII;
    public final /* synthetic */ String LJIIIIZZ;

    @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
    public final boolean checkIsCanceled() {
        UIServiceCallback uIServiceCallback = this.LJII;
        if (uIServiceCallback != null) {
            return uIServiceCallback.checkIsCanceled();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
    public final void onFail() {
        UIServiceCallback uIServiceCallback = this.LJII;
        if (uIServiceCallback != null) {
            uIServiceCallback.preFail(-1);
        }
        C1406830miH.LIZ(this.LIZIZ, this.LIZ, false);
    }

    @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
    public final void onSuccess(int i, int i2) {
        boolean z;
        MusicWaveBean musicWaveBeanNk;
        C1406830miH.LIZ(this.LIZIZ, this.LIZ, true);
        DuetConfig duetConfig = this.LIZJ;
        this.LIZLLL.getClass();
        double d = 16;
        duetConfig.setDuetVideoWidth(((int) Math.round((((double) i) * 1.0d) / d)) * 16);
        DuetConfig duetConfig2 = this.LIZJ;
        this.LIZLLL.getClass();
        duetConfig2.setDuetVideoHeight(((int) Math.round((((double) i2) * 1.0d) / d)) * 16);
        AbstractC20598115it abstractC20598115it = this.LIZLLL;
        RecordConfig recordConfig = this.LJ;
        abstractC20598115it.getClass();
        final Intent intentLIZ = AbstractC20598115it.LIZ(recordConfig);
        AbstractC20598115it abstractC20598115it2 = this.LIZLLL;
        DuetConfig duetConfig3 = this.LIZJ;
        abstractC20598115it2.getClass();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("duet_hash_tag", duetConfig3.getDuetChallenge(), bundle);
        C786410Ut5.LJJJI("duet_video_path", duetConfig3.getMp4Path(), bundle);
        C786410Ut5.LJJJI("duet_audio_path", duetConfig3.getWavPath(), bundle);
        bundle.putInt("duet_video_width", duetConfig3.getDuetVideoWidth());
        C786410Ut5.LJJJI("video_id", duetConfig3.getOriginVideo(), bundle);
        bundle.putInt("origin_video_aigc_label_type", duetConfig3.getOriginVideoAIGCLabelType());
        C786410Ut5.LJJJI("duet_thumbnail_url", duetConfig3.getThumbnailUrl(), bundle);
        bundle.putInt("duet_video_height", duetConfig3.getDuetVideoHeight());
        bundle.putBoolean("duet_from_duet_button", duetConfig3.isFromDuetButton());
        C786410Ut5.LJJJI("duet_from", duetConfig3.getDuetFrom(), bundle);
        if (duetConfig3.getAuthor() == null) {
            C201955140j.LIZ("DuetUser -> RecordServiceBaseImpl -> addDuet -> duetConfig.author is null");
            C1AF0.LIZJ("RecordServiceBaseImpl -> addDuet -> duetConfig.author is null");
        }
        C786410Ut5.LJJIZ(bundle, "duet_author", duetConfig3.getAuthor());
        if (C300060BpU.LIZ() && URLUtil.isNetworkUrl(duetConfig3.getWavPath())) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (musicWaveBeanNk = C1403010mc7.LIZ.getMusicService().Nk(C15R6.LIZLLL(duetConfig3.getWavPath()))) != null) {
            C786410Ut5.LJJIZ(bundle, "music_wave_data", musicWaveBeanNk);
        }
        C786410Ut5.LJJIJL(bundle, "duet_layout_effect", duetConfig3.getDuetLayout());
        bundle.putFloat("duet_src_loudness", duetConfig3.getSrcLoudness());
        intentLIZ.putExtras(bundle);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startDuet: isStreamingPath: ");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(". width: ");
        sbLIZ.append(i);
        sbLIZ.append(". height: ");
        sbLIZ.append(i2);
        sbLIZ.append("  aweme=");
        sbLIZ.append(this.LIZJ.getWidth());
        sbLIZ.append(" x ");
        sbLIZ.append(this.LIZJ.getHeight());
        C201955140j.LIZIZ("VEVideoStream", C2188811AlT.LIZIZ(sbLIZ));
        if (!C1383720m70.LIZ().loadAigcInfoInRecord && !this.LJFF && ((Boolean) C275790ArR.LIZ.getValue()).booleanValue() && C275780ArQ.LIZJ()) {
            MediaModel mediaModel = new MediaModel((String) null);
            DuetConfig duetConfig4 = this.LIZJ;
            mediaModel.type = 4;
            mediaModel.relativePath = duetConfig4.getMp4Path();
            AIGCInfo aIGCInfo = (AIGCInfo) C23250099c.LJ(C23271099x.INSTANCE, new C064T(mediaModel, null));
            if (!(aIGCInfo instanceof Parcelable)) {
                aIGCInfo = null;
            }
            intentLIZ.putExtra("duet_aigc_info", (Parcelable) aIGCInfo);
        }
        if (this.LIZJ.getMStickerDownloadConfig() != null) {
            StickerDownloadConfig mStickerDownloadConfig = this.LIZJ.getMStickerDownloadConfig();
            if (mStickerDownloadConfig != null) {
                final AbstractC20598115it abstractC20598115it3 = this.LIZLLL;
                final Context context = this.LJI;
                final UIServiceCallback uIServiceCallback = this.LJII;
                final String str = this.LJIIIIZZ;
                final RecordConfig recordConfig2 = this.LJ;
                final DuetConfig duetConfig5 = this.LIZJ;
                IFetchEffectListener iFetchEffectListener = new IFetchEffectListener() { // from class: X.0MiZ
                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                    public final void onStart(Effect effect) {
                    }

                    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                    public final void onSuccess(Effect effect) {
                        final Effect effect2 = effect;
                        final UIServiceCallback uIServiceCallback2 = uIServiceCallback;
                        final String str2 = str;
                        final AbstractC20598115it abstractC20598115it4 = abstractC20598115it3;
                        final RecordConfig recordConfig3 = recordConfig2;
                        final Intent intent = intentLIZ;
                        final DuetConfig duetConfig6 = duetConfig5;
                        final Context context2 = context;
                        C15O7.LIZIZ(new Callable() { // from class: X.0MiY
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                long j;
                                C1C7U.LIZ("RecordServiceBaseImpl@d40c.startDuet$splitCallback$1$onSuccess$1$1$onSuccess$1");
                                UIServiceCallback uIServiceCallback3 = uIServiceCallback2;
                                if (uIServiceCallback3 != null) {
                                    uIServiceCallback3.preSuccess();
                                }
                                C1452640nuA.LJI(null);
                                if (!TextUtils.equals(str2, "challenge")) {
                                    abstractC20598115it4.LIZ.LJIIIZ();
                                }
                                MusicModel musicModel = recordConfig3.getMusicModel();
                                if (musicModel != null) {
                                    Intent intent2 = intent;
                                    C1452640nuA.LJI(o.LJI.transformMusicModel(musicModel));
                                    intent2.putExtra("extra_duet_music", musicModel);
                                }
                                Intent intent3 = intent;
                                AbstractC20598115it abstractC20598115it5 = abstractC20598115it4;
                                Effect effect3 = effect2;
                                int iIntValue = duetConfig6.getDuetGameScore().intValue();
                                abstractC20598115it5.getClass();
                                Bundle bundle2 = new Bundle();
                                GameDuetResource gameDuetResource = new GameDuetResource(iIntValue, effect3);
                                try {
                                    j = CastLongProtector.parseLong(effect3.getEffectId());
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    j = 0;
                                }
                                C786410Ut5.LJJIJL(bundle2, "duet_sticker_game", gameDuetResource);
                                bundle2.putLong("first_face_sticker", j);
                                intent3.putExtras(bundle2);
                                UIServiceCallback uIServiceCallback4 = uIServiceCallback2;
                                if (uIServiceCallback4 == null || !uIServiceCallback4.checkIsCanceled()) {
                                    VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(context2, intent);
                                    UIServiceCallback uIServiceCallback5 = uIServiceCallback2;
                                    if (uIServiceCallback5 != null) {
                                        uIServiceCallback5.postSuccess();
                                    }
                                }
                                Unit unit = Unit.LIZ;
                                C1C7U.LIZIZ("RecordServiceBaseImpl@d40c.startDuet$splitCallback$1$onSuccess$1$1$onSuccess$1");
                                return unit;
                            }
                        }, ExecutorC527170Klv.LLILLJJLI, null);
                    }

                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                        UIServiceCallback uIServiceCallback2 = uIServiceCallback;
                        if (uIServiceCallback2 != null) {
                            uIServiceCallback2.preFail(-2);
                        }
                        C2474509mp.LIZ(new RunnableC171800lI(new AwS552S0100000_8(context, 1015)));
                    }
                };
                abstractC20598115it3.getClass();
                AbstractC20598115it.LIZLLL(context, mStickerDownloadConfig, iFetchEffectListener);
                return;
            }
            return;
        }
        final UIServiceCallback uIServiceCallback2 = this.LJII;
        final RecordConfig recordConfig3 = this.LJ;
        final String str2 = this.LJIIIIZZ;
        final AbstractC20598115it abstractC20598115it4 = this.LIZLLL;
        final Context context2 = this.LJI;
        C15O7.LIZIZ(new Callable() { // from class: X.0MiX
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("RecordServiceBaseImpl@d40c.startDuet$splitCallback$1$onSuccess$2");
                UIServiceCallback uIServiceCallback3 = uIServiceCallback2;
                if (uIServiceCallback3 != null) {
                    uIServiceCallback3.preSuccess();
                }
                C1452640nuA.LJI(o.LJI.transformMusicModel(recordConfig3.getMusicModel()));
                MusicModel musicModel = recordConfig3.getMusicModel();
                if (musicModel != null) {
                    intentLIZ.putExtra("extra_duet_music", musicModel);
                }
                if (!TextUtils.equals(str2, "challenge")) {
                    abstractC20598115it4.LIZ.LJIIIZ();
                }
                UIServiceCallback uIServiceCallback4 = uIServiceCallback2;
                if (uIServiceCallback4 == null || !uIServiceCallback4.checkIsCanceled()) {
                    VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(context2, intentLIZ);
                    UIServiceCallback uIServiceCallback5 = uIServiceCallback2;
                    if (uIServiceCallback5 != null) {
                        uIServiceCallback5.postSuccess();
                    }
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("RecordServiceBaseImpl@d40c.startDuet$splitCallback$1$onSuccess$2");
                return unit;
            }
        }, ExecutorC527170Klv.LLILLJJLI, null);
    }

    public C15Q6(String str, long j, DuetConfig duetConfig, AbstractC20598115it abstractC20598115it, RecordConfig recordConfig, boolean z, Context context, UIServiceCallback uIServiceCallback, String str2) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = duetConfig;
        this.LIZLLL = abstractC20598115it;
        this.LJ = recordConfig;
        this.LJFF = z;
        this.LJI = context;
        this.LJII = uIServiceCallback;
        this.LJIIIIZZ = str2;
    }
}
