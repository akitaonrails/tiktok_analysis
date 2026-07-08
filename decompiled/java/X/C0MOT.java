package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.common.MusicContent;
import com.ss.android.ugc.aweme.composer.model.CreationConfigModelCompat;
import com.ss.android.ugc.aweme.composer.model.LinkShareData;
import com.ss.android.ugc.aweme.composer.model.MusicComposerModel;
import com.ss.android.ugc.aweme.composer.model.MusicShareStoryInputData;
import com.ss.android.ugc.aweme.creative.compileconfig.CompileConfigResolution;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.ugc.aweme.creation.base.BasicModel;
import com.ss.ugc.aweme.creation.base.TrackModel;
import kotlin.text.u;
import lth.o;

/* JADX INFO: renamed from: X.0MOT, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MOT {
    public final CreationConfigModelCompat LIZ;

    public C0MOT(CreationConfigModelCompat creationConfigModelCompat) {
        this.LIZ = creationConfigModelCompat;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(android.content.Context r12, X.InterfaceC1364105Vn r13) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MOT.LIZ(android.content.Context, X.05Vn):java.lang.Object");
    }

    public final Intent LIZIZ(CreativeInfo creativeInfo, CanvasVideoData canvasVideoData, String str) {
        String shootWay;
        Integer numValueOf;
        C1402840mbq shareContext;
        MusicContent musicContent;
        TrackModel track;
        Intent intent = new Intent();
        C0MUK.LJIIIZ(intent, C0MUK.LJIIIIZZ());
        Workspace workspaceLIZ = C14D2.LIZ(creativeInfo);
        C0MUK.LIZIZ(intent).musicBuzModel.needAddRecent = true;
        intent.putExtra("creation_id", creativeInfo.getCreationId());
        BasicModel basic = this.LIZ.getBasic();
        if (basic != null && (track = basic.getTrack()) != null) {
            shootWay = track.getShootWay();
        } else {
            shootWay = null;
        }
        intent.putExtra("shoot_way", shootWay);
        C0MUK.LIZIZ(intent).canvasVideoData = canvasVideoData;
        CreativeModel creativeModelLIZIZ = C0MUK.LIZIZ(intent);
        MusicComposerModel music = this.LIZ.getMusic();
        if (music != null) {
            workspaceLIZ.MC(music.getMusicPath());
            LinkShareData linkShare = this.LIZ.getLinkShare();
            if (linkShare != null && (shareContext = linkShare.getShareContext()) != null && (musicContent = shareContext.mMusicContent) != null) {
                int startTime = musicContent.musicStartTime;
                if (startTime <= 0) {
                    startTime = music.getStartTime();
                }
                numValueOf = Integer.valueOf(startTime);
            } else {
                numValueOf = null;
            }
            intent.putExtra("music_start", numValueOf);
            intent.putExtra("extra_music_end", music.getEndTime());
            if (music.getMusicModel().getMusicWaveBean() != null) {
                intent.putExtra("music_wave_data", music.getMusicModel().getMusicWaveBean());
            }
            intent.putExtra("music_origin", "link_share");
            AVMusic aVMusicTransformMusicModel = o.LJI.transformMusicModel(music.getMusicModel());
            if (aVMusicTransformMusicModel != null) {
                C1452640nuA.LJI(aVMusicTransformMusicModel);
                MusicBeanUtilKt.updateAVMusic(creativeModelLIZIZ.musicBuzModel, aVMusicTransformMusicModel);
            }
            intent.putExtra("music_model", music.getMusicModel());
        }
        C0MUK.LIZIZ(intent).workspace = workspaceLIZ;
        intent.putExtra("workspace", workspaceLIZ);
        LinkShareData linkShare2 = this.LIZ.getLinkShare();
        if (linkShare2 != null) {
            intent.putExtra("extra_share_context", linkShare2.getShareContext());
        }
        CompileConfigResolution compileConfigResolution = new CompileConfigResolution(1080, 1920, null, null, 12, null);
        CompileConfigResolution compileConfigResolution2 = new CompileConfigResolution(compileConfigResolution.width, compileConfigResolution.height, null, null, 12, null);
        int i = compileConfigResolution2.width;
        int i2 = compileConfigResolution2.height;
        C577660MlA.LIZ.getClass();
        VideoFileInfo videoFileInfo = new VideoFileInfo(i, i2, C577660MlA.LIZ().defaultDuration, 30, 0, 0, 0, 0, 0.0f, 496, null);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0MPK.LIZ(creativeInfo));
        sbLIZ.append(C0MPK.LIZJ(".mp4"));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C570490MZb.LJI(new C0VSJ(strLIZIZ));
        C0MUK.LIZIZ(intent).editModel.editPreviewInfo = new C538330L9j(compileConfigResolution2.width, compileConfigResolution2.height, 12).LIZ(new EditVideoSegment(strLIZIZ, null, videoFileInfo));
        TextStickerData textStickerData = new TextStickerData(str, 0, 0, 0, null, null, 0, 0, 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -2, -1, -1, 4095, null);
        StickerItemModel stickerItemModel = new StickerItemModel();
        stickerItemModel.stickerId = "";
        stickerItemModel.type = LSPassThroughRecordSizeConfig.DEFAULT;
        stickerItemModel.layerWeight = 1000000;
        stickerItemModel.currentOffsetX = 0.5f;
        stickerItemModel.currentOffsetY = 0.5f;
        stickerItemModel.startTime = 0;
        stickerItemModel.endTime = -2;
        stickerItemModel.path = "";
        stickerItemModel.extra = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), textStickerData);
        stickerItemModel.isAttributionLink = true;
        InfoStickerModel infoStickerModel = new InfoStickerModel(C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228214Cy.INFO_STICKER, null, false, 12));
        infoStickerModel.addSticker(stickerItemModel);
        C0MUK.LIZIZ(intent).infoStickerModel = infoStickerModel;
        return intent;
    }

    public final Object LIZJ(final Context context, final MusicShareStoryInputData musicShareStoryInputData, final CreativeInfo creativeInfo, AnonymousClass0648 anonymousClass0648) {
        Uri uriFromFile;
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(anonymousClass0648));
        c2252611DEt.LJIJJ();
        String coverUri = musicShareStoryInputData.getCoverUri();
        if (coverUri != null) {
            if (!u.LJJIIJZLJL(coverUri, "content://", false) && !u.LJJIIJZLJL(coverUri, "file://", false)) {
                uriFromFile = Uri.fromFile(new C0VSJ(coverUri));
            } else {
                uriFromFile = UriProtector.parse(coverUri);
            }
            C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(uriFromFile);
            c1331670kl3LJI.LJJIJL(context);
            c1331670kl3LJI.LIZLLL(C13LE.LIZ(C0MOT.class).LJI());
            c1331670kl3LJI.LJJII(new AbstractC468201s0() { // from class: X.0MOQ
                /* JADX WARN: Removed duplicated region for block: B:25:0x00ce  */
                @Override // X.InterfaceC1331910klR
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(android.graphics.Bitmap r33) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 567
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0MOQ.LIZ(android.graphics.Bitmap):void");
                }

                @Override // X.InterfaceC1331910klR
                public final void onFailed(Throwable th) {
                    String message;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Loading image failed: ");
                    if (th != null) {
                        message = th.getMessage();
                    } else {
                        message = null;
                    }
                    sbLIZ.append(message);
                    C201955140j.LJFF("LinkShareParser", C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC20236714Gf<CanvasVideoData> interfaceC20236714Gf = c2252611DEt;
                    if (th == null) {
                        th = new RuntimeException("Loading shared image failed");
                    }
                    C098200Yq c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                    interfaceC20236714Gf.resumeWith(c098200Yq);
                }
            });
        } else {
            C098200Yq c098200Yq = new C098200Yq(new RuntimeException("Image path is not provided"));
            C189200o6.m2constructorimpl(c098200Yq);
            c2252611DEt.resumeWith(c098200Yq);
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(anonymousClass0648);
        }
        return objLJIJ;
    }
}
