package Y;

import X.AbstractC1434250nQV;
import X.C089E;
import X.C0CHQ;
import X.C0EYW;
import X.C0VSJ;
import X.C11NZ;
import X.C124G;
import X.C1398110mUD;
import X.C13LQ;
import X.C1431110nLR;
import X.C1432320nNO;
import X.C1432650nNv;
import X.C1432660nNw;
import X.C1432670nNx;
import X.C1432720nO2;
import X.C1432730nO3;
import X.C1434190nQP;
import X.C1435540nSa;
import X.C1435550nSb;
import X.C1435640nSk;
import X.C1435890nT9;
import X.C1436830nUf;
import X.C1439030nYD;
import X.C1439640nZC;
import X.C1440510nab;
import X.C1441260nbo;
import X.C1441840nck;
import X.C1444110ngP;
import X.C1444820nhY;
import X.C1450090nq3;
import X.C1450940nrQ;
import X.C1450990nrV;
import X.C1451040nra;
import X.C15438062q;
import X.C1638440sjq;
import X.C196925122x;
import X.C1C7U;
import X.C201955140j;
import X.C2188811AlT;
import X.C2224308nZ;
import X.C2354709Kn;
import X.C2471909mP;
import X.C2475009mu;
import X.C306350Bzd;
import X.C348100Dkm;
import X.C352130DrH;
import X.C533730KwV;
import X.C580130Mp9;
import X.C580650Mpz;
import X.C830690WiJ;
import X.C842150X1x;
import X.EnumC1412640mre;
import X.InterfaceC1452170ntP;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.vesdk.VEUtils;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes23.dex */
public class ACallableS427S0100000_22 implements Callable {
    public final int $t;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return call$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return call$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return call$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return call$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return call$13(this);
            case 14:
                return call$14(this);
            case 15:
                return call$15(this);
            case 16:
                return call$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return call$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return call$18(this);
            case 19:
                return call$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return call$20(this);
            case 21:
                return call$21(this);
            case 22:
                return call$22(this);
            case 23:
                return call$23(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS427S0100000_22 aCallableS427S0100000_22) {
        ((C1441840nck) aCallableS427S0100000_22.l0).LJIIIZ.destroy();
        return Boolean.TRUE;
    }

    public static final Object call$1(ACallableS427S0100000_22 aCallableS427S0100000_22) {
        INLEMediaSession iNLEMediaSession;
        INLEMediaRuntime mediaRuntimeApi;
        Bitmap currDisplayImage;
        C1C7U.LIZ("ImageEditItemScene@e4f8.generateImageByNLE$1");
        InterfaceC1452170ntP value = ((C1450990nrV) aCallableS427S0100000_22.l0).LLLLL().g().getValue();
        if (value != null) {
            InterfaceC1452170ntP interfaceC1452170ntP = value;
            C1450990nrV c1450990nrV = (C1450990nrV) aCallableS427S0100000_22.l0;
            C1450090nq3 c1450090nq3 = c1450990nrV.LLJJJ;
            if (c1450090nq3 != null) {
                String id = c1450990nrV.LLJJIJIIJIL.getId();
                if (id != null) {
                    NLEModel nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntP);
                    if (nLEModelLIZ != null) {
                        c1450090nq3.LJ(nLEModelLIZ, id);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP);
            if (c348100DkmLIZIZ != null && (iNLEMediaSession = c348100DkmLIZIZ.LIZIZ) != null && (mediaRuntimeApi = iNLEMediaSession.getMediaRuntimeApi()) != null && (currDisplayImage = mediaRuntimeApi.getCurrDisplayImage()) != null) {
                C1450990nrV c1450990nrV2 = (C1450990nrV) aCallableS427S0100000_22.l0;
                C1450940nrQ c1450940nrQ = c1450990nrV2.LLJLIL;
                if (c1450940nrQ == null) {
                    c1450940nrQ = null;
                }
                c1450940nrQ.LJII(currDisplayImage, c1450990nrV2.LLJJIJIL.getAutoEnhanceOn());
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ImageEditItemScene@e4f8.generateImageByNLE$1");
            return unit;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object call$10(ACallableS427S0100000_22 aCallableS427S0100000_22) {
        int[] iArr;
        char c;
        int[] iArrLJJLIIIJLLLLLLLZ;
        C1C7U.LIZ("NewMvMediaExtractor@4cf.start$1");
        if (!C580130Mp9.LIZ(((C1432720nO2) aCallableS427S0100000_22.l0).LIZLLL)) {
            ArrayList arrayList = new ArrayList();
            ArrayList<C1432730nO3> arrayList2 = new ArrayList();
            for (C1432730nO3 c1432730nO3 : ((C1432720nO2) aCallableS427S0100000_22.l0).LIZLLL) {
                if (C2471909mP.LJJIII(c1432730nO3.LIZ, true, 4)) {
                    arrayList.add(c1432730nO3);
                } else {
                    arrayList2.add(c1432730nO3);
                }
            }
            HashSet hashSet = new HashSet();
            Iterator it2 = arrayList.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                iArr = C2224308nZ.LIZ;
                if (!zHasNext) {
                    break;
                }
                Bitmap bitmapLIZ = C2475009mu.LIZ(((C1432730nO3) it2.next()).LIZ, iArr);
                if (bitmapLIZ != null) {
                    String strLIZJ = ((C1432720nO2) aCallableS427S0100000_22.l0).LIZIZ.LIZJ();
                    C2475009mu.LJFF(70, Bitmap.CompressFormat.JPEG, bitmapLIZ, new C0VSJ(strLIZJ));
                    hashSet.add(strLIZJ);
                }
            }
            String strLIZIZ = ((C1432720nO2) aCallableS427S0100000_22.l0).LIZIZ.LIZIZ;
            String str = File.separator;
            if (!u.LJIIZILJ(strLIZIZ, str, false)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(str);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            int i = 0;
            for (C1432730nO3 c1432730nO32 : arrayList2) {
                int i2 = i + 1;
                String str2 = c1432730nO32.LIZ;
                ((C1432720nO2) aCallableS427S0100000_22.l0).getClass();
                long j = c1432730nO32.LIZJ;
                if (j != 0) {
                    int i3 = (((int) j) / 500) + 1;
                    iArrLJJLIIIJLLLLLLLZ = new int[i3];
                    for (int i4 = 0; i4 < i3; i4++) {
                        iArrLJJLIIIJLLLLLLLZ[i4] = (int) (c1432730nO32.LIZIZ + ((long) (500 * i4)));
                    }
                    c = 0;
                } else {
                    c = 0;
                    iArrLJJLIIIJLLLLLLLZ = C13LQ.LJJLIIIJLLLLLLLZ(new Integer[0]);
                }
                int i5 = iArr[c];
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(i);
                sbLIZ2.append("extract_frame");
                int[] iArr2 = iArrLJJLIIIJLLLLLLLZ;
                VEUtils.saveVideoFrames(str2, iArr2, i5, -1, c, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2), 1);
                i = i2;
            }
            File[] fileArrListFiles = new C0VSJ(strLIZIZ).listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                C089E c089e = new C089E(fileArrListFiles);
                while (c089e.hasNext()) {
                    hashSet.add(((File) c089e.next()).getAbsolutePath());
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                arrayList3.add(it3.next());
            }
            ((C1432720nO2) aCallableS427S0100000_22.l0).LIZ.clearAllFrames();
            ExtractFramesModel extractFramesModel = ((C1432720nO2) aCallableS427S0100000_22.l0).LIZ;
            ArrayList<FrameItem> arrayList4 = new ArrayList<>(C15438062q.LJIJJ(arrayList3, 10));
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                arrayList4.add(new FrameItem((String) it4.next(), 1, -1, false, null, null));
            }
            ArrayList<FrameItem> arrayList5 = new ArrayList<>(C15438062q.LJIJJ(arrayList3, 10));
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                arrayList5.add(new FrameItem((String) it5.next(), 1, -1, false, null, null));
            }
            extractFramesModel.addFrameSegment(arrayList4, null, arrayList5);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NewMvMediaExtractor@4cf.start$1");
        return unit;
    }

    public static final Object call$11(ACallableS427S0100000_22 aCallableS427S0100000_22) {
        C1432650nNv c1432650nNv = (C1432650nNv) aCallableS427S0100000_22.l0;
        c1432650nNv.getClass();
        C1C7U.LIZ("PhotoMovieExtractor@2c2.start$1L");
        List<String> list = c1432650nNv.LIZLLL;
        if (list != null && !list.isEmpty()) {
            Iterator it2 = new HashSet(c1432650nNv.LIZLLL).iterator();
            while (it2.hasNext()) {
                Bitmap bitmapLIZ = C2475009mu.LIZ((String) it2.next(), C2224308nZ.LIZ);
                if (bitmapLIZ != null) {
                    String strLIZJ = c1432650nNv.LIZIZ.LIZJ();
                    C2475009mu.LJFF(70, Bitmap.CompressFormat.JPEG, bitmapLIZ, new C0VSJ(strLIZJ));
                    Function0<ExtractFramesModel> function0 = c1432650nNv.LJ.LIZIZ;
                    if (function0 != null && function0.invoke() != null) {
                        c1432650nNv.LJ.LIZIZ.invoke().addFrameAtLastSegment(new FrameItem(strLIZJ));
                    } else {
                        c1432650nNv.LIZ.addFrameAtLastSegment(new FrameItem(strLIZJ));
                    }
                }
            }
            C1C7U.LIZIZ("PhotoMovieExtractor@2c2.start$1L");
            return null;
        }
        C1C7U.LIZIZ("PhotoMovieExtractor@2c2.start$1L");
        return null;
    }

    public static final Object call$12(ACallableS427S0100000_22 aCallableS427S0100000_22) {
        boolean z;
        int[] iArr;
        BitmapFactory.Options options;
        C1432670nNx c1432670nNx = (C1432670nNx) aCallableS427S0100000_22.l0;
        c1432670nNx.getClass();
        C1C7U.LIZ("UploadVideoExtractor@e959.start$1L");
        List<EditVideoSegment> list = c1432670nNx.LJ;
        if (list != null && !list.isEmpty()) {
            String strLIZIZ = c1432670nNx.LIZIZ.LIZIZ;
            String str = File.separator;
            if (!strLIZIZ.endsWith(str)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(str);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            int i = 0;
            for (EditVideoSegment editVideoSegment : c1432670nNx.LJ) {
                String videoPath = editVideoSegment.getVideoPath();
                try {
                    options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(videoPath, options);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("upload video extractor", "is not image");
                }
                if (options.outWidth == -1) {
                    z = false;
                } else {
                    z = true;
                }
                int[] iArr2 = C2224308nZ.LIZ;
                if (z) {
                    Bitmap bitmapLIZ = C2475009mu.LIZ(editVideoSegment.getVideoPath(), iArr2);
                    if (bitmapLIZ != null) {
                        String strLIZJ = c1432670nNx.LIZIZ.LIZJ();
                        C2475009mu.LJFF(70, Bitmap.CompressFormat.JPEG, bitmapLIZ, new C0VSJ(strLIZJ));
                        c1432670nNx.LIZ.addFrameAtLastSegment(new FrameItem(strLIZJ));
                    }
                } else {
                    String videoPath2 = editVideoSegment.getVideoPath();
                    if (editVideoSegment.getVideoCutInfo() != null) {
                        VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
                        int end = (((int) (videoCutInfo.getEnd() - videoCutInfo.getStart())) / 500) + 1;
                        c1432670nNx.LIZLLL = end;
                        iArr = new int[end];
                        for (int i2 = 0; i2 < c1432670nNx.LIZLLL; i2++) {
                            iArr[i2] = (int) (videoCutInfo.getStart() + ((long) (500 * i2)));
                        }
                    } else {
                        int duration = ((int) (editVideoSegment.getVideoFileInfo().getDuration() / ((long) 500))) + 1;
                        c1432670nNx.LIZLLL = duration;
                        iArr = new int[duration];
                        for (int i3 = 0; i3 < c1432670nNx.LIZLLL; i3++) {
                            iArr[i3] = 500 * i3;
                        }
                    }
                    C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("split_extract_frame", "upload frame size: " + iArr.length);
                    int i4 = iArr2[0];
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(i);
                    sbLIZ2.append("extract_frame");
                    VEUtils.saveVideoFrames(videoPath2, iArr, i4, -1, false, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2), 1);
                    i++;
                }
            }
            File[] fileArrListFiles = new C0VSJ(strLIZIZ).listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                for (File file : fileArrListFiles) {
                    c1432670nNx.LIZ.addFrameAtLastSegment(new FrameItem(file.getAbsolutePath()));
                }
            }
            C1C7U.LIZIZ("UploadVideoExtractor@e959.start$1L");
            return null;
        }
        C1C7U.LIZIZ("UploadVideoExtractor@e959.start$1L");
        return null;
    }

    public static final Object call$13(ACallableS427S0100000_22 aCallableS427S0100000_22) {
        C1C7U.LIZ("VEImagePublishEditPresenter@984c.destroySingleImageResources$1$1");
        ((InterfaceC1452170ntP) aCallableS427S0100000_22.l0).destroy();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VEImagePublishEditPresenter@984c.destroySingleImageResources$1$1");
        return unit;
    }

    public static final Object call$14(ACallableS427S0100000_22 aCallableS427S0100000_22) {
        C1C7U.LIZ("StickerCompileManager@fc40.compileTextSticker$1");
        C196925122x c196925122x = new C196925122x(C0CHQ.LIZ, C1440510nab.LIZ, (TextStickerData) aCallableS427S0100000_22.l0, false, new C124G() { // from class: X.0nac
            @Override // X.C124G
            public final boolean LIZ() {
                return false;
            }
        }, Boolean.FALSE);
        int layoutWidth = (int) ((TextStickerData) aCallableS427S0100000_22.l0).getLayoutWidth();
        int layoutHeight = (int) ((TextStickerData) aCallableS427S0100000_22.l0).getLayoutHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(layoutWidth, layoutHeight, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setDensity(C0CHQ.LIZ.getResources().getDisplayMetrics().densityDpi);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        c196925122x.measure(View.MeasureSpec.makeMeasureSpec(layoutWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutHeight, 1073741824));
        c196925122x.layout(0, 0, layoutWidth, layoutHeight);
        C842150X1x.LIZIZ(canvas, c196925122x);
        C1C7U.LIZIZ("StickerCompileManager@fc40.compileTextSticker$1");
        return bitmapCreateBitmap;
    }

    public static final Object call$15(ACallableS427S0100000_22 aCallableS427S0100000_22) {
        C1C7U.LIZ("NLECloudCompiler@8772.destroy$1$1");
        ((InterfaceC1452170ntP) aCallableS427S0100000_22.l0).destroy();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NLECloudCompiler@8772.destroy$1$1");
        return unit;
    }

    public static final Object call$16(ACallableS427S0100000_22 aCallableS427S0100000_22) {
        C1C7U.LIZ("ImageSaveCameraHandler@c15a.handleImageSaveToCamera$1");
        C1431110nLR c1431110nLR = C1431110nLR.LIZ;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aCallableS427S0100000_22.l0;
        c1431110nLR.getClass();
        C1431110nLR.LIZ(videoPublishEditModel);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageSaveCameraHandler@c15a.handleImageSaveToCamera$1");
        return unit;
    }

    public static final Object call$17(ACallableS427S0100000_22 aCallableS427S0100000_22) {
        C1C7U.LIZ("DefaultTaskExternalDependencyFactory@7684.getEditorCreator$1$createImageEditor$presenter$task$1");
        C1432320nNO c1432320nNO = new C1432320nNO((VideoPublishEditModel) aCallableS427S0100000_22.l0);
        C1C7U.LIZIZ("DefaultTaskExternalDependencyFactory@7684.getEditorCreator$1$createImageEditor$presenter$task$1");
        return c1432320nNO;
    }

    public static final Object call$18(ACallableS427S0100000_22 aCallableS427S0100000_22) {
        Unit unit;
        C1C7U.LIZ("DMPhotoExtractionTask@3b9a.cleanUp$1");
        InterfaceC1452170ntP interfaceC1452170ntP = ((C1435890nT9) aCallableS427S0100000_22.l0).LLIZ;
        if (interfaceC1452170ntP != null) {
            interfaceC1452170ntP.destroy();
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("DMPhotoExtractionTask@3b9a.cleanUp$1");
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$19(Y.ACallableS427S0100000_22 r15) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS427S0100000_22.call$19(Y.ACallableS427S0100000_22):java.lang.Object");
    }

    public static final Object call$2(ACallableS427S0100000_22 aCallableS427S0100000_22) {
        C1C7U.LIZ("EditAdjustClipsLogicComponent@7a41.refreshMusicSync$2");
        boolean z = C1444820nhY.LIZ;
        C1444820nhY.LJII((AVMusic) aCallableS427S0100000_22.l0);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditAdjustClipsLogicComponent@7a41.refreshMusicSync$2");
        return unit;
    }

    public static final Object call$20(ACallableS427S0100000_22 aCallableS427S0100000_22) {
        C1C7U.LIZ("CompileTask@a3ca.destroyVE$1");
        C1435640nSk c1435640nSk = ((C1435540nSa) aCallableS427S0100000_22.l0).LLJJJIL;
        if (c1435640nSk.LIZIZ) {
            synchronized (c1435640nSk) {
                try {
                    InterfaceC1452170ntP interfaceC1452170ntP = c1435640nSk.LIZ;
                    if (interfaceC1452170ntP != null) {
                        interfaceC1452170ntP.destroy();
                    }
                    c1435640nSk.LIZ = null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            InterfaceC1452170ntP interfaceC1452170ntP2 = c1435640nSk.LIZ;
            if (interfaceC1452170ntP2 != null) {
                interfaceC1452170ntP2.destroy();
            }
            c1435640nSk.LIZ = null;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CompileTask@a3ca.destroyVE$1");
        return unit;
    }

    public static final Object call$21(ACallableS427S0100000_22 aCallableS427S0100000_22) {
        C1C7U.LIZ("UploadVideoTask@6f1f.cleanup$1");
        AbstractC1434250nQV abstractC1434250nQV = ((C1434190nQP) aCallableS427S0100000_22.l0).LLJJJ;
        if (abstractC1434250nQV == null) {
            abstractC1434250nQV = null;
        }
        abstractC1434250nQV.LIZJ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UploadVideoTask@6f1f.cleanup$1");
        return unit;
    }

    public static final Object call$22(ACallableS427S0100000_22 aCallableS427S0100000_22) {
        Unit unit;
        C1C7U.LIZ("DMVideoCompileTask@c7d8.destroyVE$1");
        InterfaceC1452170ntP interfaceC1452170ntP = ((C1435550nSb) aCallableS427S0100000_22.l0).LLJJI;
        if (interfaceC1452170ntP != null) {
            interfaceC1452170ntP.destroy();
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("DMVideoCompileTask@c7d8.destroyVE$1");
        return unit;
    }

    public static final Object call$23(ACallableS427S0100000_22 aCallableS427S0100000_22) {
        C1C7U.LIZ("DMVideoCompileTask@c7d8.setupEditorCallbacks$2$onCallback$2$1");
        ((InterfaceC1452170ntP) aCallableS427S0100000_22.l0).destroy();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DMVideoCompileTask@c7d8.setupEditorCallbacks$2$onCallback$2$1");
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$3(Y.ACallableS427S0100000_22 r8) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS427S0100000_22.call$3(Y.ACallableS427S0100000_22):java.lang.Object");
    }

    public static final Object call$4(ACallableS427S0100000_22 aCallableS427S0100000_22) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aCallableS427S0100000_22.l0;
        videoPublishContainerScene.getClass();
        C1C7U.LIZ("VideoPublishContainerScene@d2f3.buildPhotoModeTemplateZip$1L");
        VideoPublishEditModel videoPublishEditModel = videoPublishContainerScene.LLLLIILL;
        if (videoPublishEditModel.creativeModel.photoModeTemplateData.showOriginTemplateAnchor == null) {
            boolean zLIZLLL = C1451040nra.LIZLLL(videoPublishEditModel);
            videoPublishContainerScene.LLLLIILL.creativeModel.photoModeTemplateData.showOriginTemplateAnchor = Boolean.valueOf(zLIZLLL);
        }
        if (Boolean.TRUE.equals(videoPublishContainerScene.LLLLIILL.creativeModel.photoModeTemplateData.showOriginTemplateAnchor)) {
            AVUploadMiscInfoStruct aVUploadMiscInfoStruct = new AVUploadMiscInfoStruct();
            aVUploadMiscInfoStruct.mvThemeId = videoPublishContainerScene.LLLLIILL.creativeModel.photoModeTemplateData.templateId;
            aVUploadMiscInfoStruct.mvType = EnumC1412640mre.PHOTO_MODE_TEMPLATE.getValue();
            videoPublishContainerScene.LLLLIILL.setUploadMiscInfoStruct(aVUploadMiscInfoStruct);
        }
        if (C1451040nra.LIZJ(videoPublishContainerScene.LLLLIILL)) {
            videoPublishContainerScene.LLLLIILL.creativeModel.photoModeTemplateData.templateZipUrl = C0EYW.LIZ(videoPublishContainerScene.LLLLIILL);
        }
        C1C7U.LIZIZ("VideoPublishContainerScene@d2f3.buildPhotoModeTemplateZip$1L");
        return null;
    }

    public static final Object call$5(ACallableS427S0100000_22 aCallableS427S0100000_22) {
        C1C7U.LIZ("EditCapcutVcttsAnchorLogicComponent@b251.onCreate$1");
        if (((Boolean) C306350Bzd.LIZ.getValue()).booleanValue()) {
            ((C1441260nbo) aCallableS427S0100000_22.l0).O5();
            ((C1441260nbo) aCallableS427S0100000_22.l0).Hz();
        }
        if (TextUtils.isEmpty(((C1441260nbo) aCallableS427S0100000_22.l0).bb2().getShootEnterMethod()) && !Intrinsics.LJFF(C1398110mUD.LIZ, "draft_page")) {
            ((C1441260nbo) aCallableS427S0100000_22.l0).X1();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditCapcutVcttsAnchorLogicComponent@b251.onCreate$1");
        return unit;
    }

    public static final Object call$6(ACallableS427S0100000_22 aCallableS427S0100000_22) {
        C1C7U.LIZ("EditStickerCompileComponent@a7e2.compileStickersOnly$updateCCMetaDataAnchorTask$1");
        C580650Mpz.LIZ(((C1444110ngP) aCallableS427S0100000_22.l0).T2());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditStickerCompileComponent@a7e2.compileStickersOnly$updateCCMetaDataAnchorTask$1");
        return unit;
    }

    public static final Object call$7(ACallableS427S0100000_22 aCallableS427S0100000_22) {
        String strLIZJ;
        String strLIZJ2;
        ((C1439030nYD) aCallableS427S0100000_22.l0).getClass();
        C1C7U.LIZ("PublishServiceImpl@ed81.doGetRecoverDraftIfAny$1L");
        C0CHQ.LIZ().getPublishService().LJIIL();
        AwemeDraft awemeDraftLJFF = C1439030nYD.LJFF(C1436830nUf.LJIIJJI());
        C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishServiceImpl getRecoverDraftIfAny, story draft=");
        if (awemeDraftLJFF == null) {
            strLIZJ = null;
        } else {
            strLIZJ = awemeDraftLJFF.LIZJ();
        }
        sbLIZ.append(strLIZJ);
        C201955140j.LJIILJJIL(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ));
        if (awemeDraftLJFF == null) {
            awemeDraftLJFF = C1439030nYD.LJFF(C0CHQ.LIZ().getPublishService().LJIIL().LIZLLL());
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("PublishServiceImpl getRecoverDraftIfAny, final draft=");
        if (awemeDraftLJFF == null) {
            strLIZJ2 = null;
        } else {
            strLIZJ2 = awemeDraftLJFF.LIZJ();
        }
        sbLIZ2.append(strLIZJ2);
        C201955140j.LJIILJJIL(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ2));
        if (awemeDraftLJFF == null) {
            C1C7U.LIZIZ("PublishServiceImpl@ed81.doGetRecoverDraftIfAny$1L");
            return awemeDraftLJFF;
        }
        String str = awemeDraftLJFF.LJJJJIZL.filterLocalPath;
        if (TextUtils.isEmpty(str)) {
            C201955140j.LIZIZ("PublishServiceImpl", "getRecoverDraftIfAny: return, filter path is empty");
            C1C7U.LIZIZ("PublishServiceImpl@ed81.doGetRecoverDraftIfAny$1L");
            return awemeDraftLJFF;
        }
        if (new C0VSJ(str).exists()) {
            C201955140j.LIZIZ("PublishServiceImpl", "getRecoverDraftIfAny: return, filter exists");
            C1C7U.LIZIZ("PublishServiceImpl@ed81.doGetRecoverDraftIfAny$1L");
            return awemeDraftLJFF;
        }
        C11NZ<C1638440sjq> c11nzLIZ = C0CHQ.LIZ().LJJIL().LIZ().LIZ();
        C1439640nZC.LIZ.getClass();
        if (C1439640nZC.LIZLLL(awemeDraftLJFF)) {
            c11nzLIZ.LJ(new C1638440sjq(new ArrayList(), new ArrayList(), null));
        }
        C1C7U.LIZIZ("PublishServiceImpl@ed81.doGetRecoverDraftIfAny$1L");
        return awemeDraftLJFF;
    }

    public static final Object call$8(ACallableS427S0100000_22 aCallableS427S0100000_22) {
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aCallableS427S0100000_22.l0;
        C1C7U.LIZ("OriginFramesUploader@4db1.uploadFrames$1L");
        String extractFramesDir = videoPublishEditModel.getExtractFramesModel().getExtractFramesDir();
        C2354709Kn.LJIJJ(extractFramesDir);
        C2354709Kn.LJIJJLI(extractFramesDir);
        C1C7U.LIZIZ("OriginFramesUploader@4db1.uploadFrames$1L");
        return null;
    }

    public static final Object call$9(ACallableS427S0100000_22 aCallableS427S0100000_22) {
        int[] iArr;
        int[] iArr2;
        C1432660nNw c1432660nNw = (C1432660nNw) aCallableS427S0100000_22.l0;
        c1432660nNw.getClass();
        C1C7U.LIZ("CutSameVideoExtractor@34db.start$1L");
        if (C580130Mp9.LIZ(c1432660nNw.LJ)) {
            C1C7U.LIZIZ("CutSameVideoExtractor@34db.start$1L");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<EditVideoSegment> arrayList2 = new ArrayList();
        for (EditVideoSegment editVideoSegment : c1432660nNw.LJ) {
            C533730KwV c533730KwV = C533730KwV.LIZ;
            String videoPath = editVideoSegment.getVideoPath();
            c533730KwV.getClass();
            if (C533730KwV.LJIIJ(videoPath)) {
                arrayList.add(editVideoSegment);
            } else {
                arrayList2.add(editVideoSegment);
            }
        }
        HashSet<String> hashSet = new HashSet();
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            iArr = C2224308nZ.LIZ;
            if (!zHasNext) {
                break;
            }
            Bitmap bitmapLIZ = C2475009mu.LIZ(((EditVideoSegment) it2.next()).getVideoPath(), iArr);
            if (bitmapLIZ != null) {
                String strLIZJ = c1432660nNw.LIZIZ.LIZJ();
                C2475009mu.LJFF(70, Bitmap.CompressFormat.JPEG, bitmapLIZ, new C0VSJ(strLIZJ));
                hashSet.add(strLIZJ);
            }
        }
        String strLIZIZ = c1432660nNw.LIZIZ.LIZIZ;
        String str = File.separator;
        if (!strLIZIZ.endsWith(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        int i = 0;
        for (EditVideoSegment editVideoSegment2 : arrayList2) {
            String videoPath2 = editVideoSegment2.getVideoPath();
            videoPath2.toString();
            if (editVideoSegment2.getVideoCutInfo() != null) {
                VideoCutInfo videoCutInfo = editVideoSegment2.getVideoCutInfo();
                int end = ((((int) (videoCutInfo.getEnd() - videoCutInfo.getStart())) + 500) - 1) / 500;
                c1432660nNw.LIZLLL = end;
                iArr2 = new int[end];
                for (int i2 = 0; i2 < c1432660nNw.LIZLLL; i2++) {
                    iArr2[i2] = (int) (videoCutInfo.getStart() + ((long) (500 * i2)));
                }
            } else {
                long j = 500;
                int duration = (int) (((editVideoSegment2.getVideoFileInfo().getDuration() + j) - 1) / j);
                c1432660nNw.LIZLLL = duration;
                iArr2 = new int[duration];
                for (int i3 = 0; i3 < c1432660nNw.LIZLLL; i3++) {
                    iArr2[i3] = 500 * i3;
                }
            }
            int i4 = iArr[0];
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(i);
            sbLIZ2.append("extract_frame");
            VEUtils.saveVideoFrames(videoPath2, iArr2, i4, -1, false, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2), 1);
            i++;
        }
        File[] fileArrListFiles = new C0VSJ(strLIZIZ).listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            for (File file : fileArrListFiles) {
                hashSet.add(file.getAbsolutePath());
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            arrayList3.add(it3.next());
        }
        ArrayList<FrameItem> arrayList4 = new ArrayList<>();
        ArrayList<FrameItem> arrayList5 = new ArrayList<>();
        for (String str2 : hashSet) {
            arrayList4.add(new FrameItem(str2));
            arrayList5.add(new FrameItem(str2));
        }
        c1432660nNw.LIZ.clearAllFrames();
        c1432660nNw.LIZ.addFrameSegment(arrayList4, null, arrayList5);
        C1C7U.LIZIZ("CutSameVideoExtractor@34db.start$1L");
        return null;
    }

    public ACallableS427S0100000_22(VideoPublishEditModel videoPublishEditModel, int i) {
        this.$t = i;
        if (8 - i != 0) {
            this.l0 = videoPublishEditModel;
        } else {
            this.l0 = videoPublishEditModel;
        }
    }

    public ACallableS427S0100000_22(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
