package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.external.IInfoService;
import com.ss.android.ugc.aweme.services.external.TemplateScene;
import com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.ss.android.ugc.aweme.services.sticker.StickerUtilsServiceImpl;
import com.ss.android.ugc.aweme.services.video.VideoExposureData;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import lth.o;

/* JADX INFO: renamed from: X.1Drh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2269111Drh extends C09AY implements Function0<C1442050nd5> {
    public C2269111Drh() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0nd5] */
    @Override // kotlin.jvm.functions.Function0
    public final C1442050nd5 invoke() {
        return new IInfoService() { // from class: X.0nd5
            public final C01GW LIZ = C452501pT.LIZIZ(new C1442060nd6());

            @Override // com.ss.android.ugc.aweme.services.external.IInfoService
            public final boolean isNleLoaded() {
                return C293320Bec.LIZIZ || C0CHQ.LIZ().LJFF().LJI();
            }

            @Override // com.ss.android.ugc.aweme.services.external.IInfoService
            public final IStickerUtilsService stickerInfo() {
                return (StickerUtilsServiceImpl) this.LIZ.getValue();
            }

            @Override // com.ss.android.ugc.aweme.services.external.IInfoService
            public final String getExtractMusicAudioDir() {
                return C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIILIIL(EnumC20227914Cv.LOCAL_EXTRACT_MUSIC, "audio");
            }

            @Override // com.ss.android.ugc.aweme.services.external.IInfoService
            public final String getExtractMusicThumbDir() {
                return C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIILIIL(EnumC20227914Cv.LOCAL_EXTRACT_MUSIC, "thumb");
            }

            @Override // com.ss.android.ugc.aweme.services.external.IInfoService
            public final void loadNLELib() {
                C0CHQ.LIZ().LJFF().loadNLELib();
            }

            @Override // com.ss.android.ugc.aweme.services.external.IInfoService
            public final VideoExposureData convertToExposureData(Object obj) {
                if (obj instanceof VideoPublishEditModel) {
                    return VideoPublishEditModel.asExposureData(obj);
                }
                return null;
            }

            @Override // com.ss.android.ugc.aweme.services.external.IInfoService
            public final long getDurationSinceAppForeground(String str) {
                long jCurrentTimeMillis = System.currentTimeMillis() - C1442090nd9.LIZIZ;
                C1442090nd9.LIZJ = jCurrentTimeMillis;
                C1442090nd9.LIZ = str;
                return jCurrentTimeMillis;
            }

            @Override // com.ss.android.ugc.aweme.services.external.IInfoService
            public final List<MediaModel> getMediaLoaderImages(Context context) {
                return C2400609au.LIZIZ(context, false, -1, 0, null, true, true, false, -1);
            }

            @Override // com.ss.android.ugc.aweme.services.external.IInfoService
            public final boolean isTrimmedEnable(MusicModel musicModel) {
                AVMusic aVMusicLIZ;
                if (!C579130MnX.LIZ() || (aVMusicLIZ = new C15KP().LIZ(musicModel)) == null || !aVMusicLIZ.isNeedReuse()) {
                    return false;
                }
                return true;
            }

            @Override // com.ss.android.ugc.aweme.services.external.IInfoService
            public final void preloadTemplateLib(List<? extends Aweme> list) {
                C0CHQ.LIZ().LJFF().preloadTemplateLib(list);
            }

            @Override // com.ss.android.ugc.aweme.services.external.IInfoService
            public final C1402840mbq shareContextInfo(BaseShortVideoContext baseShortVideoContext) {
                String mainBusinessData;
                C1429890nJT c1429890nJT;
                C1402840mbq shareContext = null;
                if ((baseShortVideoContext instanceof VideoPublishEditModel) && (mainBusinessData = VideoPublishEditModel.asExposureData(baseShortVideoContext).getMainBusinessData()) != null && (c1429890nJT = (C1429890nJT) GsonProtectorUtils.fromJson(o.LJIJ.getRetrofitFactoryGson(), mainBusinessData, C1429890nJT.class)) != null && (shareContext = c1429890nJT.getShareContext()) != null) {
                    shareContext.mIsFromDraft = baseShortVideoContext.mIsFromDraft;
                }
                return shareContext;
            }

            @Override // com.ss.android.ugc.aweme.services.external.IInfoService
            public final void startDownloadEffectAlog(Effect effect, long j) {
                C1442070nd7.LIZIZ(effect, j);
            }

            @Override // com.ss.android.ugc.aweme.services.external.IInfoService
            public final boolean canSupportAnchorFeatureBits(TemplateScene templateScene, ArrayList<Long> arrayList, ArrayList<Integer> arrayList2, boolean z) {
                return C0CHQ.LIZ().LJFF().LIZJ(templateScene, arrayList, arrayList2, z);
            }

            @Override // com.ss.android.ugc.aweme.services.external.IInfoService
            public final List<Integer> getUnSupportAnchorFeatureBitList(TemplateScene templateScene, ArrayList<Long> arrayList, ArrayList<Integer> arrayList2, boolean z) {
                return C0CHQ.LIZ().LJFF().LJ(templateScene, arrayList, arrayList2, z);
            }

            @Override // com.ss.android.ugc.aweme.services.external.IInfoService
            public final Pair<Integer, Integer> getUnSupportAnchorFeatureBits(TemplateScene templateScene, ArrayList<Long> arrayList, ArrayList<Integer> arrayList2, boolean z) {
                return C0CHQ.LIZ().LJFF().LIZ(templateScene, arrayList, arrayList2, z);
            }

            @Override // com.ss.android.ugc.aweme.services.external.IInfoService
            public final void endDownloadEffectAlog(Effect effect, long j, long j2, int i, ExceptionResult exceptionResult) {
                C1442070nd7.LIZ(effect, j, j2, i, exceptionResult);
            }
        };
    }
}
