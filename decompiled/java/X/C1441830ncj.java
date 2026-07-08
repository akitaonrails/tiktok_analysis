package X;

import Y.AObserverS184S0200000_22;
import Y.AObserverS225S0100000_22;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.view.SurfaceView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentMVResolution;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackMV;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import dmt.av.video.VEPreviewParams;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ncj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1441830ncj extends C1441840nck {
    public NLEModel LJIJI;
    public String LJIJJ;

    public final void LJI(List list) {
        String name;
        long endTime;
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(this.LJIIIZ);
        if (c348100DkmLIZIZ != null) {
            for (BaseStickerModel baseStickerModel : (ArrayList) list) {
                String compilePath = baseStickerModel.getCompilePath();
                if (C2354709Kn.LIZIZ(compilePath) && (name = new C0VSJ(compilePath).getName()) != null && name.length() != 0) {
                    C348450DlL c348450DlL = new C348450DlL(false, 15);
                    c348450DlL.LJIIL = compilePath;
                    c348450DlL.LJIILIIL = (baseStickerModel.getWidth() / baseStickerModel.getMediaWidth()) * baseStickerModel.getScale();
                    c348450DlL.LJIILJJIL = (baseStickerModel.getHeight() / baseStickerModel.getMediaHeight()) * baseStickerModel.getScale();
                    c348450DlL.LIZLLL = (long) baseStickerModel.getStartTime();
                    if (baseStickerModel.getEndTime() <= 0.0f) {
                        endTime = c348100DkmLIZIZ.LIZ.getModel().getMaxTargetEnd() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                    } else {
                        endTime = (long) baseStickerModel.getEndTime();
                    }
                    c348450DlL.LJ = endTime;
                    c348450DlL.LIZJ = baseStickerModel.getZIndex();
                    c348450DlL.LJIIJ = 1.0f;
                    c348450DlL.LJII = -baseStickerModel.getRotation();
                    c348450DlL.LJFF = (baseStickerModel.getTranslateX() / baseStickerModel.getMediaWidth()) + 0.5f;
                    c348450DlL.LJI = (baseStickerModel.getTranslateY() / baseStickerModel.getMediaHeight()) + 0.5f;
                    c348450DlL.LJIIIIZZ = baseStickerModel.getAlpha();
                    c348100DkmLIZIZ.LJIIIZ().LJJJJI(c348450DlL);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("NewEngine text compile file not exist: id=");
                    sbLIZ.append(baseStickerModel.getId());
                    sbLIZ.append(", path ");
                    sbLIZ.append(baseStickerModel.getCompilePath());
                    C2188811AlT.LIZIZ(sbLIZ);
                    C365090ETb.LIZIZ();
                }
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void LJIIIIZZ(NLEModel nLEModel) {
        Object c098200Yq;
        C1463670oBx c1463670oBx;
        C0E9H c0e9h;
        try {
            this.LJIJI = nLEModel;
            this.LJIILJJIL.LJIJ().jf();
            InterfaceC1452170ntP interfaceC1452170ntPLJIJ = this.LJIILJJIL.LJIJ();
            if ((interfaceC1452170ntPLJIJ instanceof C1463670oBx) && (c1463670oBx = (C1463670oBx) interfaceC1452170ntPLJIJ) != null && (c0e9h = c1463670oBx.LJ) != null) {
                c0e9h.trim(0L, 0L);
            }
            this.LJIILJJIL.LJJI(nLEModel, true);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C201955140j.LJI("updateNLEModel error", thM5exceptionOrNullimpl);
        }
    }

    public final void LJII(InfoStickerModel infoStickerModel, int i, int i2) {
        List<StickerItemModel> list;
        String strLIZIZ;
        String name;
        float canvasRatio;
        if (infoStickerModel != null && (list = infoStickerModel.stickers) != null && !list.isEmpty()) {
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(this.LJIIIZ);
            if (c348100DkmLIZIZ != null) {
                for (StickerItemModel stickerItemModel : infoStickerModel.stickers) {
                    if (stickerItemModel.isImageStickerLayer) {
                        if (C2354709Kn.LIZIZ(stickerItemModel.path)) {
                            strLIZIZ = stickerItemModel.path;
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(infoStickerModel.infoStickerDraftDir);
                            sbLIZ.append(File.separator);
                            String str = stickerItemModel.path;
                            if (str == null) {
                                str = "";
                            }
                            sbLIZ.append(new C0VSJ(str).getName());
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        }
                        if (C2354709Kn.LIZIZ(strLIZIZ) && (name = new C0VSJ(strLIZIZ).getName()) != null && name.length() != 0) {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeFile(strLIZIZ, options);
                            if (i != 0 && i2 != 0) {
                                canvasRatio = ((i * 1.0f) / i2) / ((options.outWidth * 1.0f) / options.outHeight);
                            } else {
                                canvasRatio = stickerItemModel.w * ((options.outHeight * 1.0f) / options.outWidth) * c348100DkmLIZIZ.LIZ.getModel().getCanvasRatio();
                            }
                            C348450DlL c348450DlL = new C348450DlL(false, 15);
                            c348450DlL.LJIIL = strLIZIZ;
                            c348450DlL.LJIILIIL = stickerItemModel.w;
                            c348450DlL.LJIILJJIL = canvasRatio;
                            c348450DlL.LJFF = stickerItemModel.currentOffsetX;
                            c348450DlL.LJI = stickerItemModel.currentOffsetY;
                            c348450DlL.LJIIJ = stickerItemModel.scale;
                            c348450DlL.LJII = stickerItemModel.rotateAngle;
                            c348450DlL.LIZLLL = stickerItemModel.startTime;
                            c348450DlL.LJ = stickerItemModel.endTime;
                            c348450DlL.LIZJ = stickerItemModel.layerWeight;
                            c348100DkmLIZIZ.LJIIIZ().LJJJJI(c348450DlL);
                        } else {
                            C365090ETb.LIZIZ();
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("infoSticker not exist ");
                            sbLIZ2.append(stickerItemModel);
                            C201955140j.LJI("addImageStickerLayerForCompiler error", new Exception(C2188811AlT.LIZIZ(sbLIZ2)));
                        }
                    }
                    if (stickerItemModel.isPin()) {
                        LJFF();
                    }
                }
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // X.C1441840nck
    public final void LIZ(Context context, final LifecycleOwner lifecycleOwner, SurfaceView surfaceView, final VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = context;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = surfaceView;
        this.LIZLLL.observe(this.LIZIZ, new Observer() { // from class: X.0Mfs
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                String str;
                MvCreateVideoData mvCreateVideoData;
                C1463670oBx c1463670oBx;
                C348100Dkm c348100DkmLIZLLL;
                NLEEditor nLEEditor;
                NLETrackMV nLETrackMVDynamicCast;
                NLETrack next;
                VecNLETrackSlotSPtr slots;
                NLETrackSlot nLETrackSlot;
                NLEEditor nLEEditor2;
                VEPreviewParams vEPreviewParams = (VEPreviewParams) obj;
                if (C298330Bmh.LIZ()) {
                    str = "av_video_editor_init";
                } else {
                    str = "av_video_edit";
                }
                C524780Ki4.LIZ.step(str, "VEEditor init start");
                C1447390nlh.LIZ(vEPreviewParams);
                final C1441830ncj c1441830ncj = this.LL;
                AbstractC1452680nuE abstractC1452680nuE = c1441830ncj.LJIILJJIL;
                abstractC1452680nuE.LJJ = new InterfaceC1452850nuV() { // from class: X.0Mft
                    @Override // X.InterfaceC1452850nuV
                    public final void LIZ() {
                        C1441830ncj c1441830ncj2 = c1441830ncj;
                        if (c1441830ncj2.LJIIJJI) {
                            return;
                        }
                        c1441830ncj2.LJIIJJI = true;
                        C201955140j.LIZ("receive prepare done event");
                        c1441830ncj.LJIIL.postValue(null);
                    }
                };
                int iLJJII = abstractC1452680nuE.LJJII(c1441830ncj.LIZ, vEPreviewParams, c1441830ncj.LIZJ, lifecycleOwner);
                if (C288500BSm.LIZ && videoPublishEditModel.isCurrentAutoCutMode()) {
                    this.LL.LJIILJJIL.LJJ().Df(1080, 1920, 4);
                } else {
                    AbstractC1452680nuE abstractC1452680nuE2 = this.LL.LJIILJJIL;
                    if (((abstractC1452680nuE2 instanceof C574320Mfm) || (abstractC1452680nuE2 instanceof C574330Mfn)) && (mvCreateVideoData = vEPreviewParams.mvCreateVideoData) != null) {
                        abstractC1452680nuE2.LJJ().Df(mvCreateVideoData.resDestWidth, mvCreateVideoData.resDestHeight, mvCreateVideoData.resFillMode);
                    }
                }
                C1441830ncj c1441830ncj2 = this.LL;
                NLEModel nLEModel = c1441830ncj2.LJIJI;
                boolean z = true;
                if (nLEModel != null) {
                    c1441830ncj2.LJIILJJIL.LJJI(nLEModel, true);
                } else if (!TextUtils.isEmpty(c1441830ncj2.LJIJJ)) {
                    C1441830ncj c1441830ncj3 = this.LL;
                    c1441830ncj3.LJIILJJIL.LJJIFFI(c1441830ncj3.LJIJJ, true);
                } else {
                    C1463670oBx c1463670oBxLIZLLL = C1449720npS.LIZLLL(videoPublishEditModel, null, 6);
                    this.LL.LJIILJJIL.LJJI(c1463670oBxLIZLLL.LIZLLL().LIZ.getModel(), true);
                    videoPublishEditModel.setNleData(c1463670oBxLIZLLL.LIZLLL().LIZ.store());
                }
                C1441830ncj c1441830ncj4 = this.LL;
                NLEModel nLEModelLIZ = C352130DrH.LIZ(c1441830ncj4.LJIILJJIL.LJJ());
                if (nLEModelLIZ != null) {
                    Iterator<NLETrack> it2 = nLEModelLIZ.getTracks().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            NLETrack nLETrack = next;
                            if (nLETrack.getEnable() && Intrinsics.LJFF(nLETrack.getExtra("StickerTrackName"), "attribution_link")) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    NLETrack nLETrack2 = next;
                    if (nLETrack2 != null && (slots = nLETrack2.getSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(slots)) != null) {
                        nLETrack2.removeSlot(nLETrackSlot);
                        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(c1441830ncj4.LJIILJJIL.LJJ());
                        if (c348100DkmLIZIZ != null && (nLEEditor2 = c348100DkmLIZIZ.LIZ) != null) {
                            nLEEditor2.commit();
                        }
                    }
                }
                C1441830ncj c1441830ncj5 = this.LL;
                c1441830ncj5.LJIIIZ = c1441830ncj5.LJIILJJIL.LJJ();
                C1441830ncj c1441830ncj6 = this.LL;
                if (c1441830ncj6.LJIILJJIL instanceof C574320Mfm) {
                    InterfaceC1452170ntP interfaceC1452170ntP = c1441830ncj6.LJIIIZ;
                    if ((interfaceC1452170ntP instanceof C1463670oBx) && (c1463670oBx = (C1463670oBx) interfaceC1452170ntP) != null && (c348100DkmLIZLLL = c1463670oBx.LIZLLL()) != null && (nLEEditor = c348100DkmLIZLLL.LIZ) != null && (nLETrackMVDynamicCast = NLETrackMV.dynamicCast((NLENode) nLEEditor.getModel().getMainTrack())) != null) {
                        nLETrackMVDynamicCast.setMVResolution(NLESegmentMVResolution.RES_CUSTOM.swigValue());
                        nLETrackMVDynamicCast.setCustomWidth(vEPreviewParams.mCanvasWidth);
                        nLETrackMVDynamicCast.setCustomHeight(vEPreviewParams.mCanvasHeight);
                        nLEEditor.commit();
                    }
                }
                C1441830ncj c1441830ncj7 = this.LL;
                AbstractC1452680nuE abstractC1452680nuE3 = c1441830ncj7.LJIILJJIL;
                c1441830ncj7.LJIIIIZZ = abstractC1452680nuE3.LJFF;
                if (c1441830ncj7.LJIILIIL && vEPreviewParams.recordData.isMultiEditRetake) {
                    z = false;
                }
                abstractC1452680nuE3.LJJIIJ(z);
                this.LL.LJIIJ.setValue(Integer.valueOf(iLJJII));
                this.LL.getClass();
                C524780Ki4.LIZ.step(str, "VEEditor init end");
                C201955140j.LIZ("VEEditor init end");
            }
        });
        MutableLiveData mutableLiveData = this.LJ;
        if (mutableLiveData != null) {
            mutableLiveData.observe(this.LIZIZ, new AObserverS225S0100000_22(this, 0));
        }
        MutableLiveData<InfoStickerModel> mutableLiveData2 = this.LJFF;
        if (mutableLiveData2 != null) {
            mutableLiveData2.observe(this.LIZIZ, new AObserverS225S0100000_22(this, 1));
        }
        MutableLiveData<InfoStickerModel> mutableLiveData3 = this.LJI;
        if (mutableLiveData3 != null) {
            mutableLiveData3.observe(this.LIZIZ, new AObserverS184S0200000_22(this, videoPublishEditModel, 0));
        }
        MutableLiveData<StickerNewEngineModel> mutableLiveData4 = this.LJII;
        if (mutableLiveData4 != null) {
            mutableLiveData4.observe(this.LIZIZ, new AObserverS184S0200000_22(this, videoPublishEditModel, 1));
        }
        super.LIZ(context, lifecycleOwner, surfaceView, videoPublishEditModel);
    }

    public C1441830ncj(int i, int i2, int i3, String str, boolean z) {
        super(str, i, i2, z, false, i3);
    }

    public C1441830ncj(String str, int i, int i2, boolean z, boolean z2, int i3) {
        super(str, i, i2, z, z2, i3);
    }
}
