package X;

import Y.ACallableS248S0200000_20;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.edit.TTStoryUploadModel;
import com.ss.android.ugc.aweme.services.story.IStoryGroupScheduleService;
import com.ss.android.ugc.aweme.services.story.IStoryPublishService;
import com.ss.android.ugc.aweme.services.story.SimplePublishModel;
import com.ss.android.ugc.aweme.services.story.StoryCoverExtractConfig;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import com.ss.android.vesdk.VEUtils;
import java.nio.ByteBuffer;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS423S0200000_22;

/* JADX INFO: renamed from: X.1Drr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2269211Drr extends C09AY implements Function0<C1441130nbb> {
    public C2269211Drr() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0nbb] */
    @Override // kotlin.jvm.functions.Function0
    public final C1441130nbb invoke() {
        return new IStoryPublishService() { // from class: X.0nbb
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(183));
            public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(184));

            @Override // com.ss.android.ugc.aweme.services.story.IStoryPublishService
            public final IStoryGroupScheduleService getGroupScheduleService() {
                return (C1433160nOk) this.LIZIZ.getValue();
            }

            @Override // com.ss.android.ugc.aweme.services.story.IStoryPublishService
            public final boolean checkHavePermission(Context context) {
                C563820M9k c563820M9k = C563820M9k.LIZ;
                Intent intent = new Intent();
                c563820M9k.getClass();
                return C1660680tJi.LIZ().LJII(context, intent);
            }

            @Override // com.ss.android.ugc.aweme.services.story.IStoryPublishService
            public final String getCoverPath(SimplePublishModel simplePublishModel) {
                for (String str : simplePublishModel.coverPathList) {
                    if (C2286708xd.LIZJ(str)) {
                        return str;
                    }
                }
                return null;
            }

            @Override // com.ss.android.ugc.aweme.services.story.IStoryPublishService
            public final String resolveCoverPathFallback(SimplePublishModel simplePublishModel) {
                BaseShortVideoContext baseShortVideoContext;
                VideoPublishEditModel videoPublishEditModel;
                if (!C1206004ni.LIZ(32)) {
                    return null;
                }
                PublishModel publishModel = simplePublishModel.publishModel;
                if (publishModel != null) {
                    baseShortVideoContext = publishModel.editModel;
                } else {
                    baseShortVideoContext = null;
                }
                if (!(baseShortVideoContext instanceof VideoPublishEditModel) || (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) == null) {
                    return null;
                }
                C1403010mc7.LIZ.LIZIZ().LIZ(videoPublishEditModel);
                return getCoverPath(simplePublishModel);
            }

            @Override // com.ss.android.ugc.aweme.services.story.IStoryPublishService
            public final void updatePreviewCoverPath(String str, String str2) {
                C1618440sDa.LIZIZ.LJJIFFI().updatePreviewCoverPath(str, str2);
            }

            @Override // com.ss.android.ugc.aweme.services.story.IStoryPublishService
            public final void getCover(SimplePublishModel simplePublishModel, StoryCoverExtractConfig storyCoverExtractConfig, final Function1<? super Bitmap, Unit> function1) {
                VideoPublishEditModel videoPublishEditModel;
                boolean z;
                Uri uriFromFile;
                String scheme;
                String str = (String) C13LP.LJJJLL(simplePublishModel.coverPathList);
                C201950140e c201950140e = C201950140e.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getCover: creationId = ");
                sbLIZ.append(simplePublishModel.creationId);
                sbLIZ.append(", coverPath = ");
                sbLIZ.append(str);
                C201955140j.LIZLLL(c201950140e, "StoryPublishService", C2188811AlT.LIZIZ(sbLIZ));
                BaseShortVideoContext baseShortVideoContext = null;
                if (C123100dR.LIZ(str) && C2286708xd.LIZJ(str)) {
                    C23250099c.LIZLLL((InterfaceC497601wk) this.LIZ.getValue(), null, null, new C06Q3(str, function1, null), 3);
                    return;
                }
                PublishModel publishModel = simplePublishModel.publishModel;
                if (publishModel != null) {
                    baseShortVideoContext = publishModel.editModel;
                }
                if ((baseShortVideoContext instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) != null) {
                    TTStoryUploadModel ttStoryUploadModel = videoPublishEditModel.getTtStoryUploadModel();
                    if (ttStoryUploadModel != null && ttStoryUploadModel.getContentType() == 2) {
                        z = true;
                    } else {
                        z = false;
                        if (videoPublishEditModel == null) {
                            return;
                        }
                    }
                    EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
                    if (previewInfo != null) {
                        if (z) {
                            UrlModel urlModel = new UrlModel();
                            String videoPath = ((EditVideoSegment) ListProtector.get(previewInfo.getVideoList(), 0)).getVideoPath();
                            try {
                                uriFromFile = UriProtector.parse(videoPath);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            if (uriFromFile == null || (scheme = uriFromFile.getScheme()) == null || scheme.length() == 0) {
                                uriFromFile = Uri.fromFile(new C0VSJ(videoPath));
                            }
                            urlModel.setUrlList(Collections.singletonList(uriFromFile.toString()));
                            C1324840ka2.LJIJ(urlModel, storyCoverExtractConfig.width, storyCoverExtractConfig.height, new InterfaceC447230HgH() { // from class: X.0nbc
                                @Override // X.InterfaceC447230HgH
                                public final void accept(Object obj) {
                                    C01TT.LIZLLL(new AwS423S0200000_22((Bitmap) obj, function1, 41));
                                }
                            });
                            return;
                        }
                        VEUtils.getVideoFrames(((EditVideoSegment) ListProtector.get(previewInfo.getVideoList(), 0)).getVideoPath(), new int[]{storyCoverExtractConfig.timestamp}, -1, storyCoverExtractConfig.height, false, new InterfaceC1286300jZs() { // from class: X.0jyv
                            @Override // X.InterfaceC1286300jZs
                            public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
                                if (byteBuffer == null) {
                                    function1.invoke(null);
                                    return false;
                                }
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                                bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
                                C15O7.LIZIZ(new ACallableS248S0200000_20(bitmapCreateBitmap, function1, 0), C15O7.LJIIIIZZ, null);
                                return false;
                            }
                        });
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.services.story.IStoryPublishService
            public final void retryPublish(C19EG c19eg, SimplePublishModel simplePublishModel, PublishFailureReason publishFailureReason, Function1<? super Boolean, Unit> function1) {
                C23250099c.LIZLLL((InterfaceC497601wk) this.LIZ.getValue(), null, null, new C569260MUi(c19eg, simplePublishModel, this, publishFailureReason, function1, null), 3);
            }
        };
    }
}
