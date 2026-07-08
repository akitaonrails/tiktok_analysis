package X;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.animation.AnimationSet;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.AVApi;
import com.ss.android.ugc.aweme.tools.extract.video.VideoFramesUploadService;
import com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadService;
import com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadTask;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oH6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1466860oH6 implements InterfaceC2385309Wh {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final Object then$7(C1466860oH6 c1466860oH6, C15O7 c15o7) {
        C1432660nNw.LJI((C1432660nNw) c1466860oH6.l0, (InterfaceC1432820nOC) c1466860oH6.l1, c15o7);
        return null;
    }

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            case 2:
                return then$2(this, c15o7);
            case 3:
                return then$3(this, c15o7);
            case 4:
                return then$4(this, c15o7);
            case 5:
                return then$5(this, c15o7);
            case 6:
                return then$6(this, c15o7);
            case 7:
                return then$7(this, c15o7);
            case 8:
                return then$8(this, c15o7);
            case BdTuring.TYPE_ECAF /* 9 */:
                return then$9(this, c15o7);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return then$10(this, c15o7);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return then$11(this, c15o7);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return then$12(this, c15o7);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return then$13(this, c15o7);
            case 14:
                return then$14(this, c15o7);
            case 15:
                return then$15(this, c15o7);
            case 16:
                return then$16(this, c15o7);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return then$17(this, c15o7);
            default:
                return null;
        }
    }

    public static final Object then$0(C1466860oH6 c1466860oH6, C15O7 c15o7) {
        C1C7U.LIZ("ImageEditItemScene@e4f8.generateImageByNLE$2");
        C1450990nrV c1450990nrV = (C1450990nrV) c1466860oH6.l0;
        c1450990nrV.LLLIIL.LJ = false;
        c1450990nrV.LLJJIJIIJIL.getEditImageInfo().setNeedCompileNle(false);
        ((Function0) c1466860oH6.l1).invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageEditItemScene@e4f8.generateImageByNLE$2");
        return unit;
    }

    public static final Object then$1(C1466860oH6 c1466860oH6, C15O7 c15o7) {
        C1C7U.LIZ("ImageEditItemScene@e4f8.generateImageByNLE$4");
        ((C1450990nrV) c1466860oH6.l0).LLLIIL.LJ = false;
        if (C297300Bl2.LIZ()) {
            ((C1450990nrV) c1466860oH6.l0).LLJJIJIIJIL.getEditImageInfo().setNeedCompileNle(false);
        }
        ((Function0) c1466860oH6.l1).invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageEditItemScene@e4f8.generateImageByNLE$4");
        return unit;
    }

    public static final Object then$10(C1466860oH6 c1466860oH6, C15O7 c15o7) {
        C1432650nNv c1432650nNv = (C1432650nNv) c1466860oH6.l0;
        InterfaceC1432820nOC interfaceC1432820nOC = (InterfaceC1432820nOC) c1466860oH6.l1;
        c1432650nNv.getClass();
        C1C7U.LIZ("PhotoMovieExtractor@2c2.start$2L");
        interfaceC1432820nOC.onFinish(c15o7.LJIILJJIL());
        C2265108u9.LIZJ();
        c1432650nNv.LJ();
        C1C7U.LIZIZ("PhotoMovieExtractor@2c2.start$2L");
        return null;
    }

    public static final Object then$11(C1466860oH6 c1466860oH6, C15O7 c15o7) {
        C1432670nNx c1432670nNx = (C1432670nNx) c1466860oH6.l0;
        InterfaceC1432820nOC interfaceC1432820nOC = (InterfaceC1432820nOC) c1466860oH6.l1;
        c1432670nNx.getClass();
        C1C7U.LIZ("UploadVideoExtractor@e959.start$2L");
        interfaceC1432820nOC.onFinish(c15o7.LJIILJJIL());
        C2265108u9.LIZJ();
        c1432670nNx.LJ();
        C1C7U.LIZIZ("UploadVideoExtractor@e959.start$2L");
        return null;
    }

    public static final Object then$12(C1466860oH6 c1466860oH6, C15O7 c15o7) {
        C1C7U.LIZ("StickerCompileManager@fc40.compileTextSticker$2");
        int canvasWidth = ((TextStickerData) c1466860oH6.l0).getCanvasWidth();
        int canvasHeight = ((TextStickerData) c1466860oH6.l0).getCanvasHeight();
        if (C287070BMz.LIZ() > 0 && Math.min(canvasWidth, canvasHeight) < C287070BMz.LIZ()) {
            int iLIZ = C287070BMz.LIZ();
            if (canvasWidth > canvasHeight) {
                canvasWidth = (canvasWidth * iLIZ) / canvasHeight;
                canvasHeight = iLIZ;
            } else {
                canvasHeight = (canvasHeight * iLIZ) / canvasWidth;
                canvasWidth = iLIZ;
            }
        }
        Bitmap bitmapLIZ = C1441060nbU.LIZ((Bitmap) c15o7.LJIIL(), canvasWidth, canvasHeight, ((TextStickerData) c1466860oH6.l0).getVideoWidth(), ((TextStickerData) c1466860oH6.l0).getVideoHeight());
        C0VSJ c0vsj = new C0VSJ(((StickerItemModel) c1466860oH6.l1).path);
        try {
            if (c0vsj.exists()) {
                if (c0vsj.isDirectory()) {
                    C2286708xd.LJIIZILJ(((StickerItemModel) c1466860oH6.l1).path);
                } else {
                    c0vsj.delete();
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C2286708xd.LJIIIIZZ(((StickerItemModel) c1466860oH6.l1).path, true);
        C201955140j.LJIIL("compile sticker " + C2475009mu.LJFF(100, Bitmap.CompressFormat.PNG, bitmapLIZ, new C0VSJ(((StickerItemModel) c1466860oH6.l1).path)) + ", " + ((StickerItemModel) c1466860oH6.l1).path + '}');
        C2475009mu.LJ((Bitmap) c15o7.LJIIL());
        C2475009mu.LJ(bitmapLIZ);
        C1432100nN2 c1432100nN2 = new C1432100nN2();
        C1C7U.LIZIZ("StickerCompileManager@fc40.compileTextSticker$2");
        return c1432100nN2;
    }

    public static final Object then$13(C1466860oH6 c1466860oH6, C15O7 c15o7) {
        int size;
        VideoPublishEditModel videoPublishEditModel;
        int i;
        List<FrameItem> allFrames;
        C1C7U.LIZ("OriginalFrameUploadWaveTask@95c7.startModeration$uploadTask$2");
        if (!c15o7.LJIILIIL() && !c15o7.LJIILL()) {
            C1436690nUR c1436690nUR = (C1436690nUR) c1466860oH6.l0;
            ExtractFramesModel extractFramesModel = (ExtractFramesModel) c1466860oH6.l1;
            c1436690nUR.getClass();
            boolean z = false;
            if (extractFramesModel != null && (allFrames = extractFramesModel.getAllFrames()) != null) {
                size = allFrames.size();
            } else {
                size = 0;
            }
            VideoPublishEditModel videoPublishEditModel2 = null;
            if (size <= 0) {
                VideoPublishEditModel videoPublishEditModel3 = c1436690nUR.LLIZ;
                if (videoPublishEditModel3 == null) {
                    videoPublishEditModel3 = null;
                }
                extractFramesModel = videoPublishEditModel3.getExtractFramesModel();
            }
            if (extractFramesModel != null) {
                VideoPublishEditModel videoPublishEditModel4 = c1436690nUR.LLIZ;
                if (videoPublishEditModel4 == null) {
                    videoPublishEditModel4 = null;
                }
                extractFramesModel.setStickerIds(videoPublishEditModel4.getStickerID());
                C1441400nc2 c1441400nc2 = new C1441400nc2();
                c1441400nc2.LJIILIIL = 3;
                VideoPublishEditModel videoPublishEditModel5 = c1436690nUR.LLIZ;
                if (videoPublishEditModel5 == null) {
                    videoPublishEditModel5 = null;
                }
                c1441400nc2.LIZIZ = C1428470nHB.LJIIJJI(videoPublishEditModel5);
                c1441400nc2.LJFF = extractFramesModel;
                VideoPublishEditModel videoPublishEditModel6 = c1436690nUR.LLIZ;
                if (videoPublishEditModel6 == null) {
                    videoPublishEditModel = null;
                } else {
                    videoPublishEditModel = videoPublishEditModel6;
                }
                c1441400nc2.LJIIIZ = videoPublishEditModel.creativeModel.draftInfoModel.isDraft;
                if (videoPublishEditModel6 == null) {
                    videoPublishEditModel6 = null;
                }
                String cameraIds = videoPublishEditModel6.getCameraIds();
                if (cameraIds != null && cameraIds.length() != 0) {
                    i = 0;
                } else {
                    i = 1;
                }
                c1441400nc2.LJIIJ = i ^ 1;
                VideoPublishEditModel videoPublishEditModel7 = c1436690nUR.LLIZ;
                if (videoPublishEditModel7 != null) {
                    videoPublishEditModel2 = videoPublishEditModel7;
                }
                if (videoPublishEditModel2.getRestoreType() == 2) {
                    z = true;
                }
                c1441400nc2.LJIIJJI = z;
                c1441400nc2.LJI = System.currentTimeMillis();
                C1441520ncE c1441520ncELIZ = c1441400nc2.LIZ();
                c1436690nUR.LLJIJIL = c1441520ncELIZ;
                C1C7U.LIZIZ("OriginalFrameUploadWaveTask@95c7.startModeration$uploadTask$2");
                return c1441520ncELIZ;
            }
            throw new C1436770nUZ(20006, "extract frames model is null", null);
        }
        throw new C1436770nUZ(20004, "", c15o7.LJIIJJI());
    }

    public static final Object then$14(C1466860oH6 c1466860oH6, C15O7 c15o7) {
        C15O7 c15o7LIZIZ;
        C1C7U.LIZ("OriginalFrameUploadWaveTask@95c7.startModeration$uploadTask$3");
        if (c15o7.LJIILL()) {
            c15o7LIZIZ = C15O7.LJIIIZ(c15o7.LJIIJJI());
        } else {
            VideoFramesUploadService videoFramesUploadService = (VideoFramesUploadService) c1466860oH6.l0;
            C1432620nNs c1432620nNs = (C1432620nNs) c1466860oH6.l1;
            C1441520ncE c1441520ncE = (C1441520ncE) c15o7.LJIIL();
            videoFramesUploadService.getClass();
            c15o7LIZIZ = VideoFramesUploadService.LIZIZ(c1432620nNs, c1441520ncE);
        }
        C1C7U.LIZIZ("OriginalFrameUploadWaveTask@95c7.startModeration$uploadTask$3");
        return c15o7LIZIZ;
    }

    public static final Object then$15(C1466860oH6 c1466860oH6, C15O7 c15o7) {
        C15O7<C1441520ncE> c15o7LIZJ;
        C1C7U.LIZ("OriginalFrameUploadWaveTask@95c7.startModeration$uploadTask$4");
        if (c15o7.LJIILL()) {
            c15o7LIZJ = C15O7.LJIIIZ(c15o7.LJIIJJI());
        } else if (new C0VSJ(((C1441520ncE) c15o7.LJIIL()).LJFF).exists()) {
            ((C1436690nUR) c1466860oH6.l0).LJIILJJIL(30);
            VideoFramesUploadService videoFramesUploadService = (VideoFramesUploadService) c1466860oH6.l1;
            C1441520ncE c1441520ncE = (C1441520ncE) c15o7.LJIIL();
            UploadAuthKeyConfig uploadAuthKeyConfig = ((C1436690nUR) c1466860oH6.l0).LLIZLLLIL;
            if (uploadAuthKeyConfig == null) {
                uploadAuthKeyConfig = null;
            }
            c15o7LIZJ = videoFramesUploadService.LIZJ(c1441520ncE, uploadAuthKeyConfig);
        } else {
            throw new C1436770nUZ(20005, "", null);
        }
        C1C7U.LIZIZ("OriginalFrameUploadWaveTask@95c7.startModeration$uploadTask$4");
        return c15o7LIZJ;
    }

    public static final Object then$16(C1466860oH6 c1466860oH6, C15O7 c15o7) {
        C1C7U.LIZ("StickPointDownloadHelper@e94d.getDefaultMusicAlg$2");
        if (c15o7 != null && ((Boolean) c15o7.LJIIL()).booleanValue()) {
            C1420820n4q c1420820n4q = (C1420820n4q) c1466860oH6.l0;
            if (c1420820n4q != null) {
                c1420820n4q.LIZLLL((AVMusic) c1466860oH6.l1, true);
            }
        } else {
            C1420820n4q c1420820n4q2 = (C1420820n4q) c1466860oH6.l0;
            if (c1420820n4q2 != null) {
                c1420820n4q2.LIZLLL((AVMusic) c1466860oH6.l1, false);
            }
        }
        C1C7U.LIZIZ("StickPointDownloadHelper@e94d.getDefaultMusicAlg$2");
        return null;
    }

    public static final Object then$17(C1466860oH6 c1466860oH6, C15O7 c15o7) {
        AVMusic aVMusicLIZ;
        C1C7U.LIZ("MvMusicManager@4ac0.getMusicDetail$2");
        if (((C1456590o0X) c1466860oH6.l0).LIZ != null) {
            boolean z = false;
            MusicObject musicObject = null;
            if (c15o7.LJIIL() != null) {
                MusicModel musicModelConvertToMusicModel = ((Music) c15o7.LJIIL()).convertToMusicModel();
                MusicBuzModel musicBuzModelLIZIZ = ((InterfaceC1455230nyL) c1466860oH6.l1).LIZIZ();
                if (musicBuzModelLIZIZ != null) {
                    musicObject = musicBuzModelLIZIZ.music;
                }
                if (musicObject == null) {
                    z = true;
                }
                if (musicModelConvertToMusicModel != null) {
                    musicModelConvertToMusicModel.setMvThemeMusic(true);
                    if (z && (aVMusicLIZ = new C15KP().apply(musicModelConvertToMusicModel)) != null) {
                        ((InterfaceC1455230nyL) c1466860oH6.l1).LIZ(aVMusicLIZ);
                    }
                }
                InterfaceC1455240nyM interfaceC1455240nyM = ((C1456590o0X) c1466860oH6.l0).LIZ;
                if (interfaceC1455240nyM != null) {
                    interfaceC1455240nyM.LIZ(musicModelConvertToMusicModel, z);
                }
            } else {
                InterfaceC1455240nyM interfaceC1455240nyM2 = ((C1456590o0X) c1466860oH6.l0).LIZ;
                if (interfaceC1455240nyM2 != null) {
                    interfaceC1455240nyM2.LIZ(null, false);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MvMusicManager@4ac0.getMusicDetail$2");
        return unit;
    }

    public static final Object then$2(C1466860oH6 c1466860oH6, C15O7 c15o7) {
        C1C7U.LIZ("PublishProgressView@ba68.showAutoUploadingTextAnim$2");
        TextView textView = ((C1447790nmL) c1466860oH6.l0).LLJI;
        if (textView == null) {
            textView = null;
        }
        textView.startAnimation((AnimationSet) c1466860oH6.l1);
        C1C7U.LIZIZ("PublishProgressView@ba68.showAutoUploadingTextAnim$2");
        return null;
    }

    public static final Object then$3(C1466860oH6 c1466860oH6, C15O7 c15o7) throws Exception {
        C15O7<BaseResponse> c15o7LIZ;
        C1C7U.LIZ("OriginalSoundUploadService@5e57.onHandleWork$2$uploadTask$1");
        if (!c15o7.LJIILL() && !c15o7.LJIILIIL()) {
            C1441540ncG c1441540ncG = (C1441540ncG) c1466860oH6.l0;
            C1441600ncM c1441600ncM = (C1441600ncM) c15o7.LJIIL();
            c1441540ncG.getClass();
            Iterator it2 = ((ArrayList) c1441600ncM.LIZ).iterator();
            while (it2.hasNext()) {
                c1441540ncG.LIZ((OriginalSoundUploadTask) it2.next());
            }
            OriginalSoundUploadService originalSoundUploadService = (OriginalSoundUploadService) c1466860oH6.l1;
            C1441600ncM c1441600ncM2 = (C1441600ncM) c15o7.LJIIL();
            originalSoundUploadService.getClass();
            InterfaceC1441560ncI interfaceC1441560ncI = (InterfaceC1441560ncI) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(((AVApi) ServiceManager.get().getService(AVApi.class)).LIZ()).create(InterfaceC1441560ncI.class);
            if (((ArrayList) c1441600ncM2.LIZ).size() > 1) {
                JSONArray jSONArray = new JSONArray();
                for (OriginalSoundUploadTask originalSoundUploadTask : (ArrayList) c1441600ncM2.LIZ) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("aweme_id", originalSoundUploadTask.awemeId);
                    jSONObject.put("audiotrack_uri", originalSoundUploadTask.audioVid);
                    jSONArray.put(jSONObject);
                }
                c15o7LIZ = interfaceC1441560ncI.LIZIZ(jSONArray);
                c15o7LIZ.LJIJJLI();
                for (OriginalSoundUploadTask originalSoundUploadTask2 : (ArrayList) c1441600ncM2.LIZ) {
                    if (!c15o7LIZ.LJIILJJIL()) {
                        OriginalSoundUploadService.LIZ(originalSoundUploadTask2, Log.getStackTraceString(c15o7LIZ.LJIIJJI()), -3003, 0);
                    } else if (c15o7LIZ.LJIIL().error_code != 0) {
                        OriginalSoundUploadService.LIZ(originalSoundUploadTask2, c15o7LIZ.LJIIL().toString(), -3003, 0);
                    } else {
                        OriginalSoundUploadService.LIZ(originalSoundUploadTask2, "", 0, 1);
                    }
                }
            } else {
                OriginalSoundUploadTask originalSoundUploadTask3 = (OriginalSoundUploadTask) ListProtector.get(c1441600ncM2.LIZ, 0);
                c15o7LIZ = interfaceC1441560ncI.LIZ(originalSoundUploadTask3.awemeId, originalSoundUploadTask3.audioVid);
                c15o7LIZ.LJIJJLI();
                if (!c15o7LIZ.LJIILJJIL()) {
                    OriginalSoundUploadService.LIZ(originalSoundUploadTask3, Log.getStackTraceString(c15o7LIZ.LJIIJJI()), -3003, 0);
                } else if (c15o7LIZ.LJIIL().error_code != 0) {
                    OriginalSoundUploadService.LIZ(originalSoundUploadTask3, c15o7LIZ.LJIIL().toString(), -3003, 0);
                } else {
                    OriginalSoundUploadService.LIZ(originalSoundUploadTask3, "", 0, 1);
                }
            }
            C1C7U.LIZIZ("OriginalSoundUploadService@5e57.onHandleWork$2$uploadTask$1");
            return c15o7LIZ;
        }
        throw c15o7.LJIIJJI();
    }

    public static final Object then$4(C1466860oH6 c1466860oH6, C15O7 c15o7) {
        C1C7U.LIZ("AdvancedEditExtractor@f943.start$2");
        ((InterfaceC1432820nOC) c1466860oH6.l0).onFinish(c15o7.LJIILJJIL());
        ((C1432770nO7) c1466860oH6.l1).getClass();
        C2265108u9.LIZJ();
        ((C1432770nO7) c1466860oH6.l1).LJ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdvancedEditExtractor@f943.start$2");
        return unit;
    }

    public static final Object then$5(C1466860oH6 c1466860oH6, C15O7 c15o7) {
        C1C7U.LIZ("AutoCutFrameExtractor@6d96.start$2");
        ((InterfaceC1432820nOC) c1466860oH6.l0).onFinish(c15o7.LJIILJJIL());
        ((C1429990nJd) c1466860oH6.l1).getClass();
        C2265108u9.LIZJ();
        ((C1429990nJd) c1466860oH6.l1).LJ();
        C1C7U.LIZIZ("AutoCutFrameExtractor@6d96.start$2");
        return null;
    }

    public static final Object then$6(C1466860oH6 c1466860oH6, C15O7 c15o7) {
        C1C7U.LIZ("BackgroundVideoExtractor@31a2.start$2");
        ((InterfaceC1432820nOC) c1466860oH6.l0).onFinish(c15o7.LJIILJJIL());
        ((C1432580nNo) c1466860oH6.l1).getClass();
        C2265108u9.LIZJ();
        ((C1432580nNo) c1466860oH6.l1).LJ();
        C1C7U.LIZIZ("BackgroundVideoExtractor@31a2.start$2");
        return null;
    }

    public static final Object then$8(C1466860oH6 c1466860oH6, C15O7 c15o7) {
        C1C7U.LIZ("DiyPropVideoExtractor@b29b.start$2");
        ((InterfaceC1432820nOC) c1466860oH6.l0).onFinish(c15o7.LJIILJJIL());
        ((C1432630nNt) c1466860oH6.l1).getClass();
        C2265108u9.LIZJ();
        ((C1432630nNt) c1466860oH6.l1).LJ();
        C1C7U.LIZIZ("DiyPropVideoExtractor@b29b.start$2");
        return null;
    }

    public static final Object then$9(C1466860oH6 c1466860oH6, C15O7 c15o7) {
        C1C7U.LIZ("NewMvMediaExtractor@4cf.start$2");
        ((InterfaceC1432820nOC) c1466860oH6.l0).onFinish(c15o7.LJIILJJIL());
        ((C1432720nO2) c1466860oH6.l1).getClass();
        C2265108u9.LIZJ();
        ((C1432720nO2) c1466860oH6.l1).LJ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NewMvMediaExtractor@4cf.start$2");
        return unit;
    }

    public C1466860oH6(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
