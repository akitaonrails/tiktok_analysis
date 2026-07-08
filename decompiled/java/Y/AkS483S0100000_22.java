package Y;

import X.AbstractC1412880ms2;
import X.C1168404he;
import X.C13LP;
import X.C1412800mru;
import X.C1413060msK;
import X.C1416470mxp;
import X.C1428470nHB;
import X.C1441050nbT;
import X.C1447650nm7;
import X.C1449860npg;
import X.C1449870nph;
import X.C1455250nyN;
import X.C1455260nyO;
import X.C204607154j;
import X.C389120FNm;
import X.InterfaceC1414530muh;
import X.InterfaceC1487280oo2;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.tts.oecverify.BdTuring;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public class AkS483S0100000_22 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ Object apply$0(AkS483S0100000_22 akS483S0100000_22, Object obj) {
        return ((Function1) akS483S0100000_22.l0).invoke(obj);
    }

    public static final /* synthetic */ Object apply$6(AkS483S0100000_22 akS483S0100000_22, Object obj) {
        return ((Function1) akS483S0100000_22.l0).invoke(obj);
    }

    @Override // X.InterfaceC1487280oo2
    public final /* synthetic */ Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            case 5:
                return apply$5(this, obj);
            case 6:
                return apply$6(this, obj);
            case 7:
                return apply$7(this, obj);
            case 8:
                return apply$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return apply$9(this, obj);
            default:
                return null;
        }
    }

    public AkS483S0100000_22(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object apply$1(AkS483S0100000_22 akS483S0100000_22, Object obj) {
        EffectTextModel effectTextModel;
        Bitmap bitmapJ;
        Bitmap bitmapCreateBitmap = (Bitmap) obj;
        C1455260nyO c1455260nyO = (C1455260nyO) akS483S0100000_22.l0;
        int width = bitmapCreateBitmap.getWidth();
        int height = bitmapCreateBitmap.getHeight();
        if (width != 0) {
            VideoPublishEditModel videoPublishEditModel = c1455260nyO.LLLFZ;
            VideoPublishEditModel videoPublishEditModel2 = null;
            if (videoPublishEditModel == null) {
                videoPublishEditModel = null;
            }
            if (videoPublishEditModel.videoWidth() != 0) {
                VideoPublishEditModel videoPublishEditModel3 = c1455260nyO.LLLFZ;
                if (videoPublishEditModel3 == null) {
                    videoPublishEditModel3 = null;
                }
                int iVideoHeight = videoPublishEditModel3.videoHeight() * width;
                VideoPublishEditModel videoPublishEditModel4 = c1455260nyO.LLLFZ;
                if (videoPublishEditModel4 == null) {
                    videoPublishEditModel4 = null;
                }
                int iVideoWidth = iVideoHeight / videoPublishEditModel4.videoWidth();
                int height2 = (int) ((bitmapCreateBitmap.getHeight() - iVideoWidth) / 2.0f);
                if (height2 + iVideoWidth <= height) {
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, height2, width, iVideoWidth);
                    VideoPublishEditModel videoPublishEditModel5 = c1455260nyO.LLLFZ;
                    if (videoPublishEditModel5 == null) {
                        videoPublishEditModel5 = null;
                    }
                    CoverPublishModel coverPublishModel = videoPublishEditModel5.getCoverPublishModel();
                    if (coverPublishModel != null && (effectTextModel = coverPublishModel.getEffectTextModel()) != null) {
                        VideoPublishEditModel videoPublishEditModel6 = c1455260nyO.LLLFZ;
                        if (videoPublishEditModel6 != null) {
                            videoPublishEditModel2 = videoPublishEditModel6;
                        }
                        if (C1428470nHB.LLIIIJ(videoPublishEditModel2)) {
                            bitmapJ = c1455260nyO.j(bitmapCreateBitmap);
                        } else {
                            bitmapJ = bitmapCreateBitmap;
                        }
                        Bitmap bitmapMergeCoverText = effectTextModel.mergeCoverText(bitmapJ);
                        if (bitmapMergeCoverText != null) {
                            return bitmapMergeCoverText;
                        }
                    }
                }
            }
        }
        return bitmapCreateBitmap;
    }

    public static final Object apply$2(AkS483S0100000_22 akS483S0100000_22, Object obj) {
        EffectTextModel effectTextModel;
        Bitmap bitmapMergeCoverText;
        Bitmap bitmap = (Bitmap) obj;
        VideoPublishEditModel videoPublishEditModel = ((C1455260nyO) akS483S0100000_22.l0).LLLFZ;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        CoverPublishModel coverPublishModel = videoPublishEditModel.getCoverPublishModel();
        if (coverPublishModel != null && (effectTextModel = coverPublishModel.getEffectTextModel()) != null && (bitmapMergeCoverText = effectTextModel.mergeCoverText(bitmap)) != null) {
            return bitmapMergeCoverText;
        }
        return bitmap;
    }

    public static final Object apply$3(AkS483S0100000_22 akS483S0100000_22, Object obj) {
        return new C1168404he((List) akS483S0100000_22.l0);
    }

    public static final Object apply$4(AkS483S0100000_22 akS483S0100000_22, Object obj) {
        EffectTextModel effectTextModel;
        Bitmap bitmapLLLZIIL;
        Bitmap bitmapCreateBitmap = (Bitmap) obj;
        C1455250nyN c1455250nyN = (C1455250nyN) akS483S0100000_22.l0;
        int width = bitmapCreateBitmap.getWidth();
        int height = bitmapCreateBitmap.getHeight();
        if (width != 0 && c1455250nyN.getEditModel().videoWidth() != 0) {
            int iVideoHeight = (c1455250nyN.getEditModel().videoHeight() * width) / c1455250nyN.getEditModel().videoWidth();
            int height2 = (int) ((bitmapCreateBitmap.getHeight() - iVideoHeight) / 2.0f);
            if (height2 + iVideoHeight <= height) {
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, height2, width, iVideoHeight);
                CoverPublishModel coverPublishModel = c1455250nyN.getEditModel().getCoverPublishModel();
                if (coverPublishModel != null && (effectTextModel = coverPublishModel.getEffectTextModel()) != null) {
                    if (C1428470nHB.LLIIIJ(c1455250nyN.getEditModel())) {
                        bitmapLLLZIIL = c1455250nyN.LLLZIIL(bitmapCreateBitmap);
                    } else {
                        bitmapLLLZIIL = bitmapCreateBitmap;
                    }
                    Bitmap bitmapMergeCoverText = effectTextModel.mergeCoverText(bitmapLLLZIIL);
                    if (bitmapMergeCoverText != null) {
                        return bitmapMergeCoverText;
                    }
                }
            }
        }
        return bitmapCreateBitmap;
    }

    public static final Object apply$5(AkS483S0100000_22 akS483S0100000_22, Object obj) {
        EffectTextModel effectTextModel;
        Bitmap bitmapMergeCoverText;
        Bitmap bitmap = (Bitmap) obj;
        CoverPublishModel coverPublishModel = ((C1455250nyN) akS483S0100000_22.l0).getEditModel().getCoverPublishModel();
        if (coverPublishModel != null && (effectTextModel = coverPublishModel.getEffectTextModel()) != null && (bitmapMergeCoverText = effectTextModel.mergeCoverText(bitmap)) != null) {
            return bitmapMergeCoverText;
        }
        return bitmap;
    }

    public static final Object apply$7(AkS483S0100000_22 akS483S0100000_22, Object obj) {
        return ((C1449860npg) akS483S0100000_22.l0).LJIIIIZZ((C1441050nbT) obj);
    }

    public static final Object apply$8(AkS483S0100000_22 akS483S0100000_22, Object obj) {
        return ((C1449870nph) akS483S0100000_22.l0).LJIIIZ((C1447650nm7) obj);
    }

    public static final Object apply$9(AkS483S0100000_22 akS483S0100000_22, Object obj) {
        List<C1412800mru> listNx2;
        C1412800mru c1412800mru;
        C1413060msK c1413060msK;
        List<? extends MusicModel> list = ((C204607154j) obj).LIZ;
        if (list != null) {
            AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(((C1416470mxp) akS483S0100000_22.l0).LLILZLL.invoke().creativeModel.musicBuzModel);
            if (aVMusicExtractAVMusic == null) {
                InterfaceC1414530muh interfaceC1414530muhInvoke = ((C1416470mxp) akS483S0100000_22.l0).LLILZIL.invoke();
                if (interfaceC1414530muhInvoke != null && (listNx2 = interfaceC1414530muhInvoke.nx2()) != null && (c1412800mru = (C1412800mru) C13LP.LJJJLZIJ(1, listNx2)) != null && c1412800mru.LIZ == MixEditingMaterialType.SOUND_SYNC) {
                    AbstractC1412880ms2 abstractC1412880ms2 = c1412800mru.LJ;
                    if (!(abstractC1412880ms2 instanceof C1413060msK) || (c1413060msK = (C1413060msK) abstractC1412880ms2) == null || (aVMusicExtractAVMusic = c1413060msK.LIZIZ) == null) {
                        return list;
                    }
                } else {
                    return list;
                }
            }
            MusicModel musicModelLIZ = C389120FNm.LIZ(aVMusicExtractAVMusic);
            if (musicModelLIZ != null) {
                return C13LP.LJLIL(list, Collections.singletonList(musicModelLIZ));
            }
            return list;
        }
        throw new RuntimeException("get music list failed");
    }
}
