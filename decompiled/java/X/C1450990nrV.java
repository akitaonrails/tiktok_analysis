package X;

import Y.ACListenerS156S0100000_22;
import Y.ACallableS250S0200000_22;
import Y.ACallableS427S0100000_22;
import Y.AObserverS207S0100000_3;
import Y.AObserverS225S0100000_22;
import Y.ARunnableS122S0100000_22;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.LiveData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.createx.editor.gesture.GestureInteractItem;
import com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.cutsame.util.Size;
import com.bytedance.ies.nle.editor_jni.INLEListenerSurfaceStatus;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEPlayerPreviewMode;
import com.bytedance.ies.nle.editor_jni.NLESegmentInfoSticker;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.scene.Scene;
import com.bytedance.scene.group.UserVisibleHintGroupScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAdjustInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSurfaceData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageTransformParams;
import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SingleAdjustInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.StoryMultiImageParams;
import com.ss.android.ugc.aweme.creative.model.edit.crop.CropData;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS101S0210000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nrV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1450990nrV extends UserVisibleHintGroupScene implements InterfaceC379610EuV, InterfaceC1451400nsA {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLLLLLLL;
    public final SingleImageData LLJJIJIIJIL;
    public final ImageAlbumData LLJJIJIL;
    public final C1450090nq3 LLJJJ;
    public final Function0<Unit> LLJJJIL;
    public final CreativeInfo LLJJJJ;
    public final CreativeModel LLJJJJJIL;
    public final C1DRG LLJJJJLIIL;
    public C1452060ntE LLJJL;
    public C1450220nqG LLJJLIIIJLLLLLLLZ;
    public ImageView LLJL;
    public C1450940nrQ LLJLIL;
    public C1836880xtu LLJLILLLLZIIL;
    public ImageView LLJLL;
    public FrameLayout LLJLLIL;
    public ViewGroup LLJLLL;
    public SurfaceView LLJZ;
    public boolean LLJZIJLIL;
    public View LLL;
    public C0FVY LLLF;
    public int LLLFF;
    public int LLLFFI;
    public boolean LLLFZ;
    public final boolean LLLI = true;
    public boolean LLLII;
    public final C1451230nrt LLLIIII;
    public ImageTransformParams LLLIIIIL;
    public final C1451330ns3 LLLIIIL;
    public final C1450610nqt LLLIIL;
    public C19740512Lj LLLIILIL;
    public final C1664750tQH LLLIL;
    public final C1664740tQG LLLILZ;
    public final C1664750tQH LLLILZJ;
    public final C1664750tQH LLLILZLLLI;
    public final C01GW LLLIZZ;
    public final C1664740tQG LLLJ;
    public final C1664740tQG LLLJIL;
    public final C1664740tQG LLLJL;
    public final C1664740tQG LLLL;
    public final C1664740tQG LLLLII;
    public C1460760o7G LLLLIIIILLL;
    public final C01GW LLLLIIL;
    public final C01GW LLLLIILL;
    public C1DRG LLLLIILLL;
    public final C01GW LLLLIL;
    public final C01GW LLLLILI;
    public final C1664740tQG LLLLJ;
    public int LLLLJI;
    public boolean LLLLL;
    public boolean LLLLLIL;
    public boolean LLLLLILLIL;
    public boolean LLLLLJIL;
    public Function0<Unit> LLLLLJLJLL;
    public final C054G LLLLLL;
    public AwS566S0100000_22 LLLLLLIL;
    public boolean LLLLLLJ;
    public final C1451060nrc LLLLLLL;
    public final C1446230njp LLLLLLLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1450990nrV.class, "editFilterApi", "getEditFilterApi()Lcom/ss/android/ugc/gamora/editor/filter/core/EditFilterApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1450990nrV.class, "editSecondPageState", "getEditSecondPageState()Lcom/ss/android/ugc/gamora/editor/EditSecondPageState;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1450990nrV.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1450990nrV.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/image/preview/ImageEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1450990nrV.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1450990nrV.class, "photoLivePhotoApi", "getPhotoLivePhotoApi()Lcom/ss/android/ugc/aweme/image/livephoto/PhotoLivePhotoApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1450990nrV.class, "photoLivePlayApi", "getPhotoLivePlayApi()Lcom/ss/android/ugc/aweme/image/livephoto/PhotoLivePlayApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C1450990nrV.class, "borderLineView", "getBorderLineView()Lcom/ss/android/ugc/aweme/editSticker/interact/view/IBorderLineView;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C1450990nrV.class, "photoTemplateApi", "getPhotoTemplateApi()Lcom/ss/android/ugc/aweme/image/phototemplate/PhotoTemplateApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(C1450990nrV.class, "imageEditThumbnailApi", "getImageEditThumbnailApi()Lcom/ss/android/ugc/aweme/image/thumbnail/ImageEditThumbnailApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS11 = new C2217381BqS(C1450990nrV.class, "storyUIApi", "getStoryUIApi()Lcom/ss/android/ugc/aweme/social/creation/api/ImageEditStoryUIApi;", 0);
        c09r3.getClass();
        LLLLLLLLLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217381BqS11};
    }

    public final SurfaceView LJIJJLI() {
        SurfaceView surfaceView = this.LLJZ;
        if (surfaceView != null) {
            return surfaceView;
        }
        return null;
    }

    @Override // X.InterfaceC1451400nsA
    public final void LJJJI() {
        if (this.LLJJIJIIJIL.getFilterInfo().getNeedRender()) {
            C1450610nqt c1450610nqt = this.LLLIIL;
            if (c1450610nqt.LIZ.getFilterInfo().getFilterId().length() == 0) {
                c1450610nqt.LIZLLL = null;
            }
            C1450940nrQ c1450940nrQ = this.LLJLIL;
            if (c1450940nrQ == null) {
                c1450940nrQ = null;
            }
            if (c1450940nrQ.LIZIZ.getFilterInfo().getNeedRender() && c1450940nrQ.LIZ.getVisibility() == 0) {
                c1450940nrQ.LIZ(null, null);
            }
            LLLZIL();
        }
    }

    public final void LLLLIILL() {
        if (this.LLJJIJIIJIL.getSrcImageInfo().getWidth() <= 0 || this.LLJJIJIIJIL.getSrcImageInfo().getHeight() <= 0) {
            return;
        }
        LLLZLL();
        LLLZIL();
    }

    public final InterfaceC1451050nrb LLLLL() {
        return (InterfaceC1451050nrb) this.LLLILZLLLI.getValue(this, LLLLLLLLLL[3]);
    }

    public final InterfaceC1464960oE2 LLLLLIL() {
        return (InterfaceC1464960oE2) this.LLLLILI.getValue();
    }

    public final C1836880xtu LLLLLJIL() {
        C1836880xtu c1836880xtu = this.LLJLILLLLZIIL;
        if (c1836880xtu != null) {
            return c1836880xtu;
        }
        return null;
    }

    public final Size LLLLLL() {
        Pair pairLJIIIIZZ = C1450870nrJ.LJIIIIZZ(this.LLJJIJIL.getSurfaceData().getSurfaceViewWidth(), this.LLJJIJIL.getSurfaceData().getSurfaceViewHeight());
        return new Size(((Number) pairLJIIIIZZ.getFirst()).intValue(), ((Number) pairLJIIIIZZ.getSecond()).intValue());
    }

    public final C1462080o9O LLLLLLIL() {
        return (C1462080o9O) this.LLLLIIL.getValue();
    }

    public final InterfaceC1451100nrg LLLLLLJ() {
        return (InterfaceC1451100nrg) this.LLLLJ.getValue(this, LLLLLLLLLL[10]);
    }

    public final void LLLLLLLLLL() {
        List<SingleImageData> imageList;
        NLEModel model;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot;
        VecNLETrackSPtr tracks;
        if (getEditModel().creativeModel.photoModeTemplateData.isTemplateFromAnchor && !getEditModel().creativeModel.photoModeTemplateData.isInit) {
            ImageAlbumData imageAlbumData = getEditModel().getImageAlbumData();
            boolean z = true;
            if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
                int i = 0;
                for (SingleImageData singleImageData : imageList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                    SingleImageData singleImageData2 = singleImageData;
                    if (singleImageData2.getFilterInfo().getFilterId().length() > 0) {
                        singleImageData2.getFilterInfo().setNeedRender(z);
                    }
                    for (StickerItemModel stickerItemModel : singleImageData2.getStickerInfo().getStickers()) {
                        if (stickerItemModel.isNormalTextSticker()) {
                            try {
                                TextStickerData textStickerData = (TextStickerData) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), stickerItemModel.extra, TextStickerData.class);
                                if (textStickerData != null && (textStickerData.getVideoWidth() == 0 || textStickerData.getVideoHeight() == 0)) {
                                    textStickerData.setLayoutWidth(C1450870nrJ.LIZIZ);
                                    textStickerData.setLayoutHeight(C1450870nrJ.LIZ);
                                    textStickerData.setVideoWidth(C1450870nrJ.LIZIZ);
                                    textStickerData.setVideoHeight(C1450870nrJ.LIZ);
                                    textStickerData.setX(textStickerData.getX() * textStickerData.getVideoWidth());
                                    textStickerData.setY(C1451030nrZ.LIZ(textStickerData, singleImageData2.getImageRatio(), new ImageSurfaceData(C1450870nrJ.LIZIZ, C1450870nrJ.LIZ, 0, 4, null)));
                                    textStickerData.setEditCenterPoint(new Point(C1450870nrJ.LIZIZ / 2, C1450870nrJ.LIZ / 2));
                                    textStickerData.setTextWrapList(Collections.singletonList(C123P.LIZJ(C123P.LJIILJJIL(textStickerData, requireSceneContext()))));
                                    stickerItemModel.extra = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), textStickerData);
                                }
                            } catch (s e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        } else if (stickerItemModel.isNormalInfoSticker()) {
                            stickerItemModel.currentOffsetY = C1451030nrZ.LIZIZ(stickerItemModel.currentOffsetY, singleImageData2.getImageRatio(), new ImageSurfaceData(C1450870nrJ.LIZIZ, C1450870nrJ.LIZ, 0, 4, null));
                            singleImageData2.getFilterInfo().setNeedRender(z);
                        }
                    }
                    if (i == this.LLLLJI && singleImageData2.getFilterInfo().getNeedRender()) {
                        singleImageData2.getFilterInfo().setNeedRender(false);
                        this.LLLIIL.LJ = z;
                    }
                    C1450090nq3 c1450090nq3 = this.LLJJJ;
                    if (c1450090nq3 != null) {
                        String id = singleImageData2.getId();
                        if (id == null) {
                            id = "";
                        }
                        String strLIZ = c1450090nq3.LIZ(id);
                        if (strLIZ != null) {
                            NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
                            nLEEditorLIZ.restore(strLIZ);
                            NLEModel model2 = nLEEditorLIZ.getModel();
                            if (model2 != null && (tracks = model2.getTracks()) != null) {
                                ArrayList arrayList = new ArrayList();
                                for (NLETrack nLETrack : tracks) {
                                    if (nLETrack.getTrackType() == NLETrackType.STICKER) {
                                        arrayList.add(nLETrack);
                                    }
                                }
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    NLETrackSlot nLETrackSlot2 = (NLETrackSlot) C13LP.LJJJLZIJ(0, ((NLETrack) it2.next()).getSlots());
                                    if (nLETrackSlot2 != null && NLESegmentInfoSticker.dynamicCast((NLENode) nLETrackSlot2.getMainSegment()) != null) {
                                        nLETrackSlot2.setTransformY(C363400EMo.LIZIZ(C1451030nrZ.LIZIZ(C363400EMo.LIZLLL(nLETrackSlot2.getTransformY()), singleImageData2.getImageRatio(), new ImageSurfaceData(C1450870nrJ.LIZIZ, C1450870nrJ.LIZ, 0, 4, null))));
                                    }
                                }
                            }
                            if (singleImageData2.getEditImageInfo().getRatioMode() != -1 && (model = nLEEditorLIZ.getModel()) != null && (mainTrack = model.getMainTrack()) != null && (slots = mainTrack.getSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, slots)) != null) {
                                new C1449920npm(singleImageData2, LLLLLL()).LIZ(nLETrackSlot);
                            }
                            nLEEditorLIZ.commit();
                            nLEEditorLIZ.done();
                            C1450090nq3 c1450090nq32 = this.LLJJJ;
                            String id2 = singleImageData2.getId();
                            c1450090nq32.LIZLLL(id2 != null ? id2 : "", nLEEditorLIZ.store());
                        }
                    }
                    i = i2;
                    z = true;
                }
            }
            InterfaceC1451400nsA item = LLLLL().getItem(this.LLLLJI - 1);
            if (item != null) {
                item.LJJJI();
            }
            InterfaceC1451400nsA item2 = LLLLL().getItem(this.LLLLJI + 1);
            if (item2 != null) {
                item2.LJJJI();
            }
            getEditModel().creativeModel.photoModeTemplateData.isInit = true;
        }
    }

    public final void LLLLLLLZIL() {
        C1450090nq3 c1450090nq3 = this.LLJJJ;
        if (c1450090nq3 != null) {
            AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22(this, 176);
            if (c1450090nq3.LIZJ) {
                c1450090nq3.LIZLLL = awS566S0100000_22;
            } else {
                awS566S0100000_22.invoke();
            }
        }
    }

    public final void LLLLLZL() {
        ((InterfaceC1450920nrO) this.LLLIZZ.getValue()).SX1(this);
        C1664740tQG c1664740tQG = this.LLLJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLLLLLLL;
        InterfaceC1450260nqK interfaceC1450260nqK = (InterfaceC1450260nqK) c1664740tQG.getValue(this, interfaceC2217461BqaArr[5]);
        if (interfaceC1450260nqK != null) {
            interfaceC1450260nqK.Uy2(this.LLJJIJIIJIL);
        }
        InterfaceC1452920nuc interfaceC1452920nuc = (InterfaceC1452920nuc) this.LLLJL.getValue(this, interfaceC2217461BqaArr[6]);
        if (interfaceC1452920nuc != null) {
            interfaceC1452920nuc.BX1(this.LLJJIJIL.getImageList());
        }
        C0FVY c0fvy = (C0FVY) this.LLLLIL.getValue();
        if (c0fvy != null) {
            c0fvy.LLLLZLL(true);
        }
        C1451630nsX c1451630nsX = (C1451630nsX) this.LLLILZ.getValue(this, interfaceC2217461BqaArr[1]);
        if (c1451630nsX != null) {
            new AwS601S0100000_22(this, 120).invoke(c1451630nsX.LIZ.LIZ);
        }
        LLLLZLLLI();
        float imageRatio = this.LLJJIJIIJIL.getSrcImageInfo().getImageRatio();
        C1450870nrJ.LJIIIIZZ = imageRatio;
        C1450870nrJ.LJIIIZ = C1450870nrJ.LJIIJ(imageRatio) ? C1450870nrJ.LIZJ : C1450870nrJ.LJIIIIZZ;
        InterfaceC1455610nyx interfaceC1455610nyx = (InterfaceC1455610nyx) this.LLLJ.getValue(this, interfaceC2217461BqaArr[4]);
        if (interfaceC1455610nyx != null) {
            SingleImageData singleImageData = this.LLJJIJIIJIL;
            interfaceC1455610nyx.Uh1(16, singleImageData.getCollageInfo() == null && !singleImageData.isAICover());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLLLZIL() {
        C1450090nq3 c1450090nq3;
        String strZf;
        InterfaceC1461660o8i interfaceC1461660o8i;
        Activity activity = this.mActivity;
        if (activity != null) {
            boolean z = true;
            if (!activity.isDestroyed()) {
                C1DRG c1drgLJIIIZ = C1664600tQ2.LJIIIZ(LLLLLLIL());
                List list = null;
                Object[] objArr = 0;
                if (c1drgLJIIIZ != null && (interfaceC1461660o8i = (InterfaceC1461660o8i) c1drgLJIIIZ.LJIIL(null, InterfaceC1461660o8i.class)) != null) {
                    C19719612Di.LJJIIJ(this.LLLIIII.LIZ, AFwS261S0000000_22.get$arr$(294), true);
                    if (!C1416310mxZ.LJJLIIIJJIZ(getEditModel())) {
                        C1451230nrt c1451230nrt = this.LLLIIII;
                        List<TextStickerData> listEt0 = interfaceC1461660o8i.Et0();
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listEt0, 10));
                        int i = 0;
                        for (TextStickerData textStickerData : listEt0) {
                            int i2 = i + 1;
                            if (i < 0) {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                            TextStickerData textStickerData2 = textStickerData;
                            Point pointLLFZ = interfaceC1461660o8i.LLFZ();
                            if (pointLLFZ.x != 0 && pointLLFZ.y != 0) {
                                textStickerData2.setEditCenterPoint(pointLLFZ);
                            }
                            arrayList.add(C0F7Y.LIZ(textStickerData2, i));
                            i = i2;
                        }
                        c1451230nrt.LIZ.addAll(arrayList);
                    }
                }
                C1450610nqt c1450610nqt = this.LLLIIL;
                SingleImageData singleImageData = c1450610nqt.LIZ;
                C1451230nrt c1451230nrt2 = c1450610nqt.LIZIZ;
                c1451230nrt2.getClass();
                singleImageData.setStickerInfo(new ImageStickerInfo(new ArrayList(c1451230nrt2.LIZ), list, 2, objArr == true ? 1 : 0));
                EditImageInfo editImageInfo = this.LLJJIJIIJIL.getEditImageInfo();
                if (!this.LLLIIL.LJ) {
                    C1450940nrQ c1450940nrQ = this.LLJLIL;
                    if (c1450940nrQ == null) {
                        c1450940nrQ = null;
                    }
                    if (c1450940nrQ.LJIIIZ == null && this.LLJJIJIL.getAutoEnhanceOn() == this.LLJJIJIIJIL.getEditImageInfo().isLocalImageWithEnhance() && !this.LLJJIJIIJIL.getFilterInfo().getNeedRender()) {
                        z = false;
                    }
                }
                editImageInfo.setNeedCompileLocalImage(z);
                if (!this.LLLLLJIL || (c1450090nq3 = this.LLJJJ) == null) {
                    return;
                }
                String id = this.LLJJIJIIJIL.getId();
                String str = "";
                if (id == null) {
                    id = "";
                }
                InterfaceC1452170ntP value = LLLLL().g().getValue();
                if (value != null && (strZf = value.Zf()) != null) {
                    str = strZf;
                }
                c1450090nq3.LIZLLL(id, str);
            }
        }
    }

    public final void LLLZLL() {
        if (this.LLJJIJIIJIL.getEditImageInfo().getRatio() <= 0.0f) {
            C2488709p7 c2488709p7 = C2488709p7.LIZ;
            int width = this.LLJJIJIIJIL.getSrcImageInfo().getWidth();
            int height = this.LLJJIJIIJIL.getSrcImageInfo().getHeight();
            int iLIZIZ = C1450870nrJ.LIZIZ();
            int iLIZIZ2 = C1450870nrJ.LIZIZ();
            c2488709p7.getClass();
            Pair pairLJ = C2488709p7.LJ(width, height, iLIZIZ, iLIZIZ2);
            this.LLJJIJIIJIL.getSrcImageInfo().setWidth(((Number) pairLJ.getFirst()).intValue());
            this.LLJJIJIIJIL.getSrcImageInfo().setHeight(((Number) pairLJ.getSecond()).intValue());
            this.LLJJIJIIJIL.getEditImageInfo().setRatio(C2488709p7.LIZLLL(this.LLLFF / this.LLLFFI, this.LLJJIJIIJIL.getSrcImageInfo().getImageRatio()));
            if (C1450870nrJ.LJIIJ(this.LLJJIJIIJIL.getSrcImageInfo().getImageRatio())) {
                this.LLJJIJIIJIL.getEditImageInfo().setFullScreen(true);
            }
        }
        this.LLJJIJIIJIL.getEditImageInfo().isFullScreen();
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLLILZJ.getValue(this, LLLLLLLLLL[2]);
    }

    public final void LLLLILI() {
        InterfaceC1451100nrg interfaceC1451100nrgLLLLLLJ = LLLLLLJ();
        if (interfaceC1451100nrgLLLLLLJ != null) {
            ImageView imageView = this.LLJL;
            if (imageView == null) {
                imageView = null;
            }
            interfaceC1451100nrgLLLLLLJ.pG0(imageView, this.LLJJIJIIJIL.getEditImageInfo().getStoryMultiImageParams());
        }
    }

    public final C348100Dkm LLLLLJLJLL() {
        LiveData<InterfaceC1452170ntP> liveDataG;
        InterfaceC1452170ntP value;
        InterfaceC1451050nrb interfaceC1451050nrbLLLLL = LLLLL();
        if (interfaceC1451050nrbLLLLL == null || (liveDataG = interfaceC1451050nrbLLLLL.g()) == null || (value = liveDataG.getValue()) == null) {
            return null;
        }
        return C352130DrH.LIZIZ(value);
    }

    public final void LLLLLLZ() {
        if (C297700Blg.LIZ()) {
            int surfaceViewWidth = this.LLJJIJIL.getSurfaceData().getSurfaceViewWidth() != 0 ? this.LLJJIJIL.getSurfaceData().getSurfaceViewWidth() : C1450870nrJ.LIZIZ;
            int surfaceViewHeight = this.LLJJIJIL.getSurfaceData().getSurfaceViewWidth() != 0 ? this.LLJJIJIL.getSurfaceData().getSurfaceViewHeight() : C1450870nrJ.LIZ;
            Pair pair = new Pair(Integer.valueOf(surfaceViewWidth), Integer.valueOf(surfaceViewHeight));
            int iIntValue = ((Number) pair.getFirst()).intValue();
            int iIntValue2 = ((Number) pair.getSecond()).intValue();
            int i = this.LLLLJI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("nle_canvas: position=");
            sbLIZ.append(i);
            sbLIZ.append(", surface=");
            sbLIZ.append(surfaceViewWidth);
            sbLIZ.append('x');
            sbLIZ.append(surfaceViewHeight);
            sbLIZ.append(", canvas=");
            sbLIZ.append(iIntValue);
            sbLIZ.append('x');
            sbLIZ.append(iIntValue2);
            sbLIZ.append(", ab_enabled=");
            sbLIZ.append(true);
            C1450070nq1.LIZIZ("ImageEdit#CompileResolution", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LLLLZ() {
        INLEMediaSession iNLEMediaSession;
        INLEPlayer playerApi;
        final InterfaceC1452170ntP value = LLLLL().g().getValue();
        if (value != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("realLoadNLE: position=");
            sbLIZ.append(this.LLLLJI);
            sbLIZ.append(" isSurfaceReady=");
            sbLIZ.append(this.LLLLLLJ);
            C1450070nq1.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(value);
            if (c348100DkmLIZIZ != null && (iNLEMediaSession = c348100DkmLIZIZ.LIZIZ) != null && (playerApi = iNLEMediaSession.getPlayerApi()) != null) {
                playerApi.setSurfaceStatusListener(new INLEListenerSurfaceStatus() { // from class: X.0nrh
                    @Override // com.bytedance.ies.nle.editor_jni.INLEListenerSurfaceStatus
                    public final void onSurfaceCreatedDone() {
                        INLEMediaSession iNLEMediaSession2;
                        INLEPlayer playerApi2;
                        this.LIZ.LLLLLLJ = true;
                        C1450070nq1.LIZ("surface created");
                        if (this.LIZ.LLLLLLIL != null) {
                            C1450070nq1.LIZ("surface created itemSelectedCallback run");
                            AwS566S0100000_22 awS566S0100000_22 = this.LIZ.LLLLLLIL;
                            if (awS566S0100000_22 != null) {
                                awS566S0100000_22.invoke();
                            }
                            this.LIZ.LLLLLLIL = null;
                        }
                        C348100Dkm c348100DkmLIZIZ2 = C352130DrH.LIZIZ(value);
                        if (c348100DkmLIZIZ2 != null && (iNLEMediaSession2 = c348100DkmLIZIZ2.LIZIZ) != null && (playerApi2 = iNLEMediaSession2.getPlayerApi()) != null) {
                            playerApi2.setSurfaceStatusListener(null);
                        }
                        C1450990nrV c1450990nrV = this.LIZ;
                        if (c1450990nrV.LLLLJI == c1450990nrV.LLLLL().h7()) {
                            c1450990nrV.LLLLL().rO("end surfaceReady");
                        }
                    }
                });
            }
            value.updateSurfaceView(LJIJJLI());
            LLLLJ(true);
            if (this.LLLLLLJ) {
                LLLZI();
            } else {
                this.LLLLLLIL = new AwS566S0100000_22(this, 167);
            }
        }
    }

    public final void LLLLZLLIL() {
        InterfaceC1452170ntP value = LLLLL().g().getValue();
        if (value != null) {
            C346820Dii.LIZ(value, false);
        }
    }

    public final void LLLLZLLLI() {
        InterfaceC1452170ntP value = LLLLL().g().getValue();
        if (value != null) {
            C346820Dii.LIZ(value, true);
        }
    }

    public final void LLLZI() {
        Float canvasRatio;
        final InterfaceC1452170ntP value = LLLLL().g().getValue();
        if (value != null) {
            if (C295670BiP.LIZ()) {
                LLLLLLZ();
                C1450220nqG c1450220nqG = this.LLJJLIIIJLLLLLLLZ;
                if (c1450220nqG != null) {
                    c1450220nqG.Hd0(new C1451180nro(this), true);
                    return;
                }
                return;
            }
            int videoLength = C0EM4.LIZ() ? getEditModel().getVideoLength() : -1;
            if (C568750MSj.LIZIZ(getEditModel()) && videoLength == 0) {
                videoLength = -1;
            }
            PhotoTemplateInfo photoTemplateInfo = this.LLJJIJIIJIL.getPhotoTemplateInfo();
            if (photoTemplateInfo != null && (canvasRatio = photoTemplateInfo.getCanvasRatio()) != null) {
                float fFloatValue = canvasRatio.floatValue();
                float f = C1450870nrJ.LIZJ;
                if (f != fFloatValue) {
                    float f2 = f / fFloatValue;
                    for (StickerItemModel stickerItemModel : this.LLJJIJIIJIL.getStickerInfo().getStickers()) {
                        stickerItemModel.currentOffsetY = C363400EMo.LIZLLL(C363400EMo.LIZIZ(stickerItemModel.currentOffsetY) * f2);
                    }
                    PhotoTemplateInfo photoTemplateInfo2 = this.LLJJIJIIJIL.getPhotoTemplateInfo();
                    if (photoTemplateInfo2 != null) {
                        photoTemplateInfo2.setCanvasRatio(null);
                    }
                }
            }
            Size sizeLLLLLL = LLLLLL();
            LLLLLLZ();
            C1450090nq3 c1450090nq3 = this.LLJJJ;
            if (c1450090nq3 == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            String id = this.LLJJIJIIJIL.getId();
            if (id == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            C1450090nq3 c1450090nq32 = this.LLJJJ;
            String id2 = this.LLJJIJIIJIL.getId();
            if (id2 == null) {
                id2 = "";
            }
            NLEModel nLEModelLIZIZ = c1450090nq3.LIZIZ(id, c1450090nq32.LIZ(id2), this.LLJJIJIIJIL, sizeLLLLLL, getEditModel().creativeModel.imageEditModel.enterFromPhotoTemplateApplied, videoLength);
            value.yc(nLEModelLIZIZ);
            C1449990npt c1449990npt = C1449990npt.LIZ;
            C1463670oBx c1463670oBx = (C1463670oBx) value;
            SingleImageData singleImageData = this.LLJJIJIIJIL;
            c1449990npt.getClass();
            C1449990npt.LJI(c1463670oBx, nLEModelLIZIZ, singleImageData);
            c1463670oBx.LIZLLL().LIZIZ.getMediaRuntimeApi().setPreviewFillMode(NLEPlayerPreviewMode.FILL);
            c1463670oBx.LIZLLL().LIZIZ.getPlayerApi().prepare();
            c1463670oBx.LIZLLL().LIZIZ.getPlayerApi().play();
            if (C0BVX.LIZ() && this.LLJJIJIIJIL.isCameraPhotoFirstTimeShowInEditPage()) {
                return;
            }
            c1463670oBx.bg(0, new InterfaceC1464140oCi() { // from class: X.0nrl
                @Override // X.InterfaceC1464140oCi
                public final int onGetImageData(byte[] bArr, int i, int i2, int i3, float f3) {
                    C1450990nrV c1450990nrV = this.LIZ;
                    INLEPlayer playerApi = ((C1463670oBx) value).LIZLLL().LIZIZ.getPlayerApi();
                    c1450990nrV.getClass();
                    C01TT.LIZLLL(new AwS101S0210000_22(c1450990nrV, true, playerApi, 2));
                    return 0;
                }
            });
        }
    }

    public final void LLLZIL() {
        LLLLLJIL().LL = -1;
        LLLLLJIL().setEditRect(LLLLLILLIL(this.LLJJIJIIJIL.getEditImageInfo().getRatio()));
        InterfaceC1451100nrg interfaceC1451100nrgLLLLLLJ = LLLLLLJ();
        if (interfaceC1451100nrgLLLLLLJ != null) {
            interfaceC1451100nrgLLLLLLJ.tl2(LLLLLJIL(), this.LLJJIJIIJIL.getEditImageInfo().getStoryMultiImageParams(), new AwS601S0100000_22(this, 121));
        }
        if (LLLLLJIL().getVisibility() == 0) {
            LLLLLJIL().invalidate();
            return;
        }
        C1836880xtu c1836880xtuLLLLLJIL = LLLLLJIL();
        int visibility = c1836880xtuLLLLLJIL.getVisibility();
        c1836880xtuLLLLLJIL.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c1836880xtuLLLLLJIL);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        ViewGroup viewGroup;
        INLEMediaSession iNLEMediaSession;
        INLEPlayer playerApi;
        super.onDestroyView();
        C1451330ns3 c1451330ns3 = this.LLLIIIL;
        C348100Dkm c348100DkmLLLLLJLJLL = LLLLLJLJLL();
        C1451130nrj c1451130nrj = c1451330ns3.LIZ;
        if (c1451130nrj != null) {
            if (c348100DkmLLLLLJLJLL != null && (iNLEMediaSession = c348100DkmLLLLLJLJLL.LIZIZ) != null && (playerApi = iNLEMediaSession.getPlayerApi()) != null) {
                playerApi.removePlayerInfoListener(c1451130nrj);
            }
            if (Intrinsics.LJFF(c1451130nrj, c1451330ns3.LIZ)) {
                c1451330ns3.LIZ = null;
            }
        }
        InterfaceC1464960oE2 interfaceC1464960oE2LLLLLIL = LLLLLIL();
        if (interfaceC1464960oE2LLLLLIL != null) {
            interfaceC1464960oE2LLLLLIL.Dm1(this.LLLLJI);
        }
        Activity activity = this.mActivity;
        boolean z = (activity == null || activity.isFinishing()) ? false : true;
        C1450940nrQ c1450940nrQ = this.LLJLIL;
        if (c1450940nrQ == null) {
            c1450940nrQ = null;
        }
        c1450940nrQ.LIZIZ(z);
        ViewParent parent = LJIJJLI().getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(LJIJJLI(), viewGroup);
        }
        this.LLLLLJLJLL = null;
        C2296808zG.LIZJ(this.LLLLLL, null);
    }

    @Override // com.bytedance.scene.Scene
    public final void onStop() {
        Map<String, SingleAdjustInfo> adjustMap;
        super.onStop();
        ImageAdjustInfo adjustInfo = this.LLJJIJIIJIL.getAdjustInfo();
        if (adjustInfo == null || (adjustMap = adjustInfo.getAdjustMap()) == null || adjustMap.get("adjust_item_enhance") == null) {
            return;
        }
        LLLLJI(AFwS210S0000000_22.get$arr$(89));
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJJJJLIIL;
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene
    public final void LLLLIIIILLL(boolean z) {
        super.LLLLIIIILLL(z);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setUserVisibleHint=");
        sbLIZ.append(z);
        sbLIZ.append(" position=");
        sbLIZ.append(this.LLLLJI);
        sbLIZ.append(" initialized=");
        sbLIZ.append(this.LLLFZ);
        sbLIZ.append(" canLoadByImageView=");
        sbLIZ.append(this.LLLI);
        sbLIZ.append(" nleReady=");
        sbLIZ.append(this.LLLLLJIL);
        C1450070nq1.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLLFZ && this.LLLI) {
            if (z) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("setUserVisibleHint: onCurrentItemSelected and loadByVE position=");
                sbLIZ2.append(this.LLLLJI);
                C1450070nq1.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                LLLLLZL();
                LLLLLLLZIL();
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("setUserVisibleHint: showTopImage(false) and recycleVEAndLoadLocalImage position=");
            sbLIZ3.append(this.LLLLJI);
            C1450070nq1.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
            LLLZIIL(false, null);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("recycleNLEAndLoadLocalImage: start position=");
            sbLIZ4.append(this.LLLLJI);
            sbLIZ4.append(" nleReady=");
            sbLIZ4.append(this.LLLLLJIL);
            sbLIZ4.append(" hasChanged=");
            sbLIZ4.append(this.LLLIIL.LJ);
            sbLIZ4.append(" needCompileNle=");
            sbLIZ4.append(this.LLJJIJIIJIL.getEditImageInfo().getNeedCompileNle());
            C1450070nq1.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
            boolean z2 = this.LLLLLJIL;
            this.LLLLLJIL = false;
            AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22(this, 183);
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("image_edit_live_photo_placeholder_frame_fix", true) && !z2) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("recycleNLEAndLoadLocalImage: skip capture, nleReady was false position=");
                sbLIZ5.append(this.LLLLJI);
                C1450070nq1.LIZ(C2188811AlT.LIZIZ(sbLIZ5));
                awS566S0100000_22.invoke();
                return;
            }
            LLLLJI(new AwS566S0100000_22(awS566S0100000_22, 182));
        }
    }

    public final void LLLLJ(boolean z) {
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeSurfaceViewVisible: visible=");
        sbLIZ.append(z);
        sbLIZ.append(" position=");
        sbLIZ.append(this.LLLLJI);
        sbLIZ.append(" surfaceViewShouldBeVisible=");
        sbLIZ.append(this.LLJZIJLIL);
        C1450070nq1.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        SurfaceView surfaceViewLJIJJLI = LJIJJLI();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLIIII(surfaceViewLJIJJLI, i);
        this.LLJZIJLIL = z;
        if (LJIJJLI().getVisibility() == 8) {
            C1450070nq1.LIZ("change surface surface is gone");
            this.LLLLLLJ = false;
        }
    }

    public final void LLLLJI(Function0<Unit> function0) {
        if (!this.LLLIIL.LJ && !this.LLJJIJIIJIL.getEditImageInfo().getNeedCompileNle()) {
            function0.invoke();
            return;
        }
        if (C297300Bl2.LIZ()) {
            Rect editRect = LLLLLJIL().getEditRect();
            C1450090nq3 c1450090nq3 = this.LLJJJ;
            if (c1450090nq3 != null) {
                c1450090nq3.LIZJ = true;
            }
            C15O7.LIZJ(new ACallableS250S0200000_22(this, editRect, 1)).LJIIZILJ(new C1466860oH6(function0, this, 1), C15O7.LJIIIIZZ);
            return;
        }
        C1450090nq3 c1450090nq32 = this.LLJJJ;
        if (c1450090nq32 != null) {
            c1450090nq32.LIZJ = true;
        }
        C15O7.LIZJ(new ACallableS427S0100000_22(this, 1)).LJIIZILJ(new C1466860oH6(function0, this, 0), C15O7.LJIIIIZZ);
    }

    public final Rect LLLLLILLIL(float f) {
        Pair pair;
        InterfaceC1451100nrg interfaceC1451100nrgLLLLLLJ = LLLLLLJ();
        if (interfaceC1451100nrgLLLLLLJ != null) {
            f = interfaceC1451100nrgLLLLLLJ.E50(f, this.LLJJIJIIJIL.getEditImageInfo().getStoryMultiImageParams());
        }
        if (!C1441960ncw.LIZ()) {
            C2488709p7 c2488709p7 = C2488709p7.LIZ;
            int i = this.LLLFF;
            c2488709p7.getClass();
            int iLJFF = C2488709p7.LJFF(i / this.LLLFFI, f, i);
            return new Rect(0, iLJFF, this.LLLFF, this.LLLFFI - iLJFF);
        }
        C2488709p7 c2488709p72 = C2488709p7.LIZ;
        float f2 = this.LLLFF / this.LLLFFI;
        c2488709p72.getClass();
        if (f > f2) {
            pair = new Pair(0, Integer.valueOf((int) Math.ceil((r5 * ((1.0f / f2) - (1.0f / f))) / 2.0f)));
        } else if (f < f2) {
            pair = new Pair(Integer.valueOf((int) Math.ceil((r1 * (f2 - f)) / 2.0f)), 0);
        } else {
            pair = new Pair(0, 0);
        }
        return new Rect(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue(), this.LLLFF - ((Number) pair.getFirst()).intValue(), this.LLLFFI - ((Number) pair.getSecond()).intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0206  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLLLLLL(X.InterfaceC1364105Vn<? super kotlin.Unit> r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1450990nrV.LLLLLLL(X.05Vn):java.lang.Object");
    }

    public final void LLLLLLLLL(boolean z) {
        if (z) {
            ViewGroup viewGroup = this.LLJLLL;
            if (viewGroup != null) {
                C786410Ut5.LJLLLLLL(8, viewGroup);
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = this.LLJLLL;
        if (viewGroup2 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, viewGroup2);
    }

    public final void LLLLLZ(C346940Diu c346940Diu) {
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        LiveData<InterfaceC1452170ntP> liveDataG;
        InterfaceC1452170ntP value;
        float fFloatValue4;
        float fFloatValue5;
        Float f = c346940Diu.LIZJ;
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        Float f2 = c346940Diu.LIZLLL;
        float fFloatValue6 = 0.0f;
        if (f2 != null) {
            fFloatValue2 = f2.floatValue();
        } else {
            fFloatValue2 = 0.0f;
        }
        Float f3 = c346940Diu.LJ;
        if (f3 != null) {
            fFloatValue3 = f3.floatValue();
        } else {
            fFloatValue3 = 0.0f;
        }
        this.LLLIIIIL = new ImageTransformParams(fFloatValue, fFloatValue2, fFloatValue3, 0.0f, false, false);
        InterfaceC1451050nrb interfaceC1451050nrbLLLLL = LLLLL();
        if (interfaceC1451050nrbLLLLL != null && (liveDataG = interfaceC1451050nrbLLLLL.g()) != null && (value = liveDataG.getValue()) != null) {
            Float f4 = c346940Diu.LJFF;
            if (f4 != null) {
                fFloatValue4 = f4.floatValue();
            } else {
                fFloatValue4 = 0.0f;
            }
            float f5 = fFloatValue4 * 360;
            float f6 = C1450870nrJ.LIZIZ;
            Float f7 = c346940Diu.LIZLLL;
            if (f7 != null) {
                fFloatValue5 = f7.floatValue();
            } else {
                fFloatValue5 = 0.0f;
            }
            int i = (int) (f6 * fFloatValue5);
            float f8 = C1450870nrJ.LIZ;
            Float f9 = c346940Diu.LJ;
            if (f9 != null) {
                fFloatValue6 = f9.floatValue();
            }
            value.setDisplayState(fFloatValue, fFloatValue, f5, i, (int) (f8 * (-fFloatValue6)));
        }
    }

    public final void LLLLZLL(FilterBean filterBean) {
        if (this.LLJJ && LLLLL().aN1()) {
            ((InterfaceC1453430nvR) this.LLLIL.getValue(this, LLLLLLLLLL[0])).Aw(filterBean, false, true, C545820Lau.LIZIZ(this));
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        int iLIZIZ;
        C0FVY c0fvy;
        View viewAK1;
        boolean z;
        ImageView.ScaleType scaleType;
        C1836880xtu c1836880xtu;
        C1450220nqG c1450220nqG;
        super.onActivityCreated(bundle);
        this.LLJLLL = (ViewGroup) requireViewById(R.id.gpu);
        if (C293350Bef.LIZ()) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        } else {
            iLIZIZ = 0;
        }
        this.LLLIILIL = new C19740512Lj(requireSceneContext(), iLIZIZ, this.LLJLLL);
        C1654320t9S.LIZIZ(this, AFwS261S0000000_22.get$arr$(73));
        C1664590tQ1.LIZLLL(this, "ImageEditItemScene", false, new AwS601S0100000_22(this, 122), 2);
        C1664600tQ2.LIZ(this, "ImageEditItemScene", new AwS601S0100000_22(this, 124));
        C1DRG c1drgLJIIIZ = C1664600tQ2.LJIIIZ(this);
        this.LLLLIILLL = c1drgLJIIIZ;
        Float fWM2 = null;
        if (c1drgLJIIIZ != null) {
            c0fvy = (C0FVY) c1drgLJIIIZ.LJIIL(null, C0FVY.class);
        } else {
            c0fvy = null;
        }
        this.LLLF = c0fvy;
        C1642810sqt.LIZ(C1664600tQ2.LJ(this), "image_edit_item");
        C19740512Lj c19740512Lj = this.LLLIILIL;
        if (c19740512Lj == null) {
            c19740512Lj = null;
        }
        c19740512Lj.LIZIZ(new GestureInteractItem(0, (GestureLayout$OnGestureListener) this.LLJJJJLIIL.LJII(C1455080ny6.class, null)));
        InterfaceC1464960oE2 interfaceC1464960oE2LLLLLIL = LLLLLIL();
        if (interfaceC1464960oE2LLLLLIL != null) {
            int i = this.LLLLJI;
            C19740512Lj c19740512Lj2 = this.LLLIILIL;
            if (c19740512Lj2 == null) {
                c19740512Lj2 = null;
            }
            interfaceC1464960oE2LLLLLIL.B71(i, c19740512Lj2);
        }
        if (C306630C0f.LIZ()) {
            requireActivity();
            C1451440nsE c1451440nsE = new C1451440nsE(this, this.LLJJJJLIIL);
            C19740512Lj c19740512Lj3 = this.LLLIILIL;
            if (c19740512Lj3 == null) {
                c19740512Lj3 = null;
            }
            c19740512Lj3.LIZIZ(new GestureInteractItem(0, c1451440nsE));
        }
        if (C295670BiP.LIZ() && (c1450220nqG = this.LLJJLIIIJLLLLLLLZ) != null) {
            c1450220nqG.Zw1();
        }
        ImageView imageView = (ImageView) requireViewById(R.id.lnt);
        this.LLJL = imageView;
        if (imageView == null) {
            imageView = null;
        }
        C786410Ut5.Q7(imageView, new ACListenerS156S0100000_22(this, 9));
        this.LLJLL = (ImageView) findViewById(R.id.lyc);
        this.LLJLILLLLZIIL = (C1836880xtu) requireViewById(R.id.gqd);
        InterfaceC1451100nrg interfaceC1451100nrgLLLLLLJ = LLLLLLJ();
        if (interfaceC1451100nrgLLLLLLJ != null) {
            viewAK1 = interfaceC1451100nrgLLLLLLJ.AK1(requireSceneContext());
        } else {
            viewAK1 = null;
        }
        if ((viewAK1 instanceof C1836880xtu) && (c1836880xtu = (C1836880xtu) viewAK1) != null) {
            ViewGroup viewGroup = (ViewGroup) LLLLLJIL().getParent();
            int iIndexOfChild = viewGroup.indexOfChild(LLLLLJIL());
            ViewGroup.LayoutParams layoutParams = LLLLLJIL().getLayoutParams();
            C786410Ut5.LJJLIL(iIndexOfChild, viewGroup);
            c1836880xtu.setId(LLLLLJIL().getId());
            viewGroup.addView(c1836880xtu, iIndexOfChild, layoutParams);
            this.LLJLILLLLZIIL = c1836880xtu;
        }
        InterfaceC1451100nrg interfaceC1451100nrgLLLLLLJ2 = LLLLLLJ();
        if (interfaceC1451100nrgLLLLLLJ2 != null) {
            int iSG2 = interfaceC1451100nrgLLLLLLJ2.sG2();
            C1836880xtu c1836880xtuLLLLLJIL = LLLLLJIL();
            int visibility = c1836880xtuLLLLLJIL.getVisibility();
            c1836880xtuLLLLLJIL.setVisibility(iSG2);
            C1602160rnK.LIZIZ(visibility, iSG2, c1836880xtuLLLLLJIL);
        }
        this.LLJLLIL = (FrameLayout) requireViewById(R.id.wq9);
        this.LLJZ = (SurfaceView) requireViewById(R.id.wpz);
        this.LLL = requireViewById(R.id.kd1);
        ImageView imageView2 = this.LLJL;
        if (imageView2 == null) {
            imageView2 = null;
        }
        this.LLJLIL = new C1450940nrQ(imageView2, this.LLJJIJIIJIL, this.LLJJIJIL, this.LLLLJI, requireSceneContext(), this.LLJJJJ, this.LLJJJJJIL, getEditModel(), LLLLLLJ());
        if (getEditModel().isFromRestoreRecover() && this.LLJJIJIIJIL.getFilterInfo().getFilterId().length() > 0) {
            this.LLLLLILLIL = true;
        }
        InterfaceC1451100nrg interfaceC1451100nrgLLLLLLJ3 = LLLLLLJ();
        if (interfaceC1451100nrgLLLLLLJ3 != null) {
            SurfaceView surfaceViewLJIJJLI = LJIJJLI();
            ImageView imageView3 = this.LLJL;
            if (imageView3 == null) {
                imageView3 = null;
            }
            interfaceC1451100nrgLLLLLLJ3.UO1(surfaceViewLJIJJLI, imageView3, LLLLLJIL());
        }
        int i2 = C1450870nrJ.LIZ;
        if (i2 > 0) {
            this.LLLFFI = i2;
            this.LLLFF = C1450870nrJ.LIZIZ;
            LLLLIILL();
            LLLLILI();
        } else {
            InterfaceC1451100nrg interfaceC1451100nrgLLLLLLJ4 = LLLLLLJ();
            if (interfaceC1451100nrgLLLLLLJ4 != null && interfaceC1451100nrgLLLLLLJ4.c61()) {
                View view = this.LLL;
                if (view == null) {
                    view = null;
                }
                C786410Ut5.y3(view.getViewTreeObserver(), new ViewTreeObserverOnPreDrawListenerC1466700oGq(this, 1));
            } else {
                View view2 = this.LLL;
                if (view2 == null) {
                    view2 = null;
                }
                HandlerHook.viewPost(view2, new ARunnableS122S0100000_22(this, 22));
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init position= ");
        sbLIZ.append(this.LLLLJI);
        C1450070nq1.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLLI) {
            if (this.LLJJ) {
                if ((((C0APV.LIZ() && this.LLJJ) || (!C0APV.LIZ() && this.LLLLJI == 0)) && ((C0APV.LIZ() || getEditModel().creativeModel.imageEditModel.enterFromPhotoTemplateApplied || C573570MeZ.LIZJ(getEditModel())) && ((C0APV.LIZ() || this.LLJJIJIIJIL.getEditImageInfo().getCanvasTransformParams() == null) && !getEditModel().creativeModel.imageEditModel.isAutoCropTo3v4))) || LLLLL().ic0()) {
                    C1450940nrQ c1450940nrQ = this.LLJLIL;
                    if (c1450940nrQ == null) {
                        c1450940nrQ = null;
                    }
                    if (c1450940nrQ.LIZIZ.getEditImageInfo().getNeedCompileNle()) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("optimizeFirstFrame: needCompileNle=true position=");
                        sbLIZ2.append(c1450940nrQ.LIZLLL);
                        sbLIZ2.append(", route via show() to recompile");
                        c1450940nrQ.LJFF("ImageViewManager", C2188811AlT.LIZIZ(sbLIZ2));
                        c1450940nrQ.LJIIL(null);
                    } else {
                        StoryMultiImageParams storyMultiImageParams = c1450940nrQ.LIZIZ.getEditImageInfo().getStoryMultiImageParams();
                        InterfaceC1451100nrg interfaceC1451100nrg = c1450940nrQ.LJIIIIZZ;
                        if (interfaceC1451100nrg != null) {
                            fWM2 = interfaceC1451100nrg.wM2(storyMultiImageParams);
                        }
                        boolean zLJIIJJI = c1450940nrQ.LJIIJJI(c1450940nrQ.LIZIZ.getImageRatio());
                        if (fWM2 != null) {
                            InterfaceC1451100nrg interfaceC1451100nrg2 = c1450940nrQ.LJIIIIZZ;
                            if (interfaceC1451100nrg2 != null) {
                                interfaceC1451100nrg2.N60(c1450940nrQ.LIZ, storyMultiImageParams);
                            }
                            c1450940nrQ.LJ();
                        } else {
                            CropData cropData = c1450940nrQ.LIZIZ.getEditImageInfo().getCropData();
                            if (cropData != null && cropData.isPhotoCropped()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            float ratio = c1450940nrQ.LIZIZ.getEditImageInfo().getRatio();
                            if (storyMultiImageParams != null && storyMultiImageParams.getBgColorStart() != null && storyMultiImageParams.getCropScale() == null && z) {
                                InterfaceC1451100nrg interfaceC1451100nrg3 = c1450940nrQ.LJIIIIZZ;
                                if (interfaceC1451100nrg3 != null) {
                                    interfaceC1451100nrg3.oG1(c1450940nrQ.LIZ);
                                }
                                c1450940nrQ.LIZ.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            } else if (C0C64.LJIILLIIL().LJIIIZ(31744, "tools_creation_photo_edit_placeholder_scale_align_fix", true, true) && z && Math.abs(ratio - 0.5625f) < 1.0E-4f) {
                                c1450940nrQ.LIZ.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            } else {
                                ImageView imageView4 = c1450940nrQ.LIZ;
                                if (!zLJIIJJI && !c1450940nrQ.LIZIZ.getEditImageInfo().isFullScreen()) {
                                    scaleType = ImageView.ScaleType.FIT_CENTER;
                                } else {
                                    scaleType = ImageView.ScaleType.CENTER_CROP;
                                }
                                imageView4.setScaleType(scaleType);
                            }
                            c1450940nrQ.LJ();
                        }
                    }
                    if (LLLLL().ic0()) {
                        LLLLL().mz(false);
                    }
                }
                LLLLLLLZIL();
                LLLLLZL();
            } else {
                C1450940nrQ c1450940nrQ2 = this.LLJLIL;
                if (c1450940nrQ2 == null) {
                    c1450940nrQ2 = null;
                }
                c1450940nrQ2.LJIIL(null);
            }
        } else {
            LLLLLLLZIL();
        }
        this.LLLIIII.LIZ.addAll(this.LLJJIJIIJIL.getStickerInfo().getStickers());
        C12WG.LIZJ(this, new ARunnableS122S0100000_22(this, 21));
        if (!this.LLLII) {
            LLLLL().gJ().observe(this, new AObserverS225S0100000_22(this, 29));
        }
        if (C0BMM.LIZ() && this.LLJJIJIIJIL.isCameraPhoto()) {
            LLLLL().JS().observe(this, new AObserverS207S0100000_3(this, 2));
        }
        this.LLLFZ = true;
    }

    public final void LLLLIL(FilterBean filterBean, boolean z) {
        filterBean.setCompareKey(this.LLJJIJIIJIL.getFilterInfo().getCompareKey());
        if (this.LLJJIJIIJIL.getFilterInfo().isComposer()) {
            C1450610nqt c1450610nqt = this.LLLIIL;
            c1450610nqt.LIZIZ(this.LLJJIJIIJIL.getFilterInfo().getFilterIntensityRatio(), filterBean, true);
            if (c1450610nqt.LIZLLL != null) {
                c1450610nqt.LIZLLL = null;
            }
            c1450610nqt.LIZLLL = filterBean;
            c1450610nqt.LIZJ = true;
        } else {
            C1450610nqt c1450610nqt2 = this.LLLIIL;
            c1450610nqt2.LIZIZ(this.LLJJIJIIJIL.getFilterInfo().getFilterIntensityRatio(), filterBean, false);
            if (c1450610nqt2.LIZLLL != null) {
                c1450610nqt2.LIZLLL = null;
            }
            c1450610nqt2.LIZLLL = filterBean;
        }
        LLLLZLL(filterBean);
        if (this.LLLLLILLIL) {
            this.LLLIIL.LJ = true;
            this.LLLLLILLIL = false;
        }
    }

    public final void LLLLLLZZ(float f, String str) {
        InterfaceC348530DlT interfaceC348530DlTLJ;
        C348240Dl0 c348240Dl0 = new C348240Dl0(C1451990nt7.LIZIZ("adjust_item_enhance"));
        c348240Dl0.LJFF(str, "adjust_item_enhance");
        String str2 = C1451990nt7.LIZ.get("adjust_item_enhance");
        if (str2 == null) {
            str2 = "";
        }
        c348240Dl0.LJ(Float.valueOf(f), str, str2);
        C348100Dkm c348100DkmLLLLLJLJLL = LLLLLJLJLL();
        if (c348100DkmLLLLLJLJLL != null && (interfaceC348530DlTLJ = c348100DkmLLLLLJLJLL.LJ()) != null) {
            interfaceC348530DlTLJ.LJIJ(c348240Dl0, true, false);
        }
    }

    public final void LLLZIIL(boolean z, Bitmap bitmap) {
        BitmapDrawable bitmapDrawable;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showTopImage, show=");
        sbLIZ.append(z);
        C1454250nwl.LIZ("ImageEditItemScene", C2188811AlT.LIZIZ(sbLIZ));
        ImageView imageView = this.LLJLL;
        if (imageView == null) {
            return;
        }
        if (z) {
            if (bitmap != null) {
                if (bitmap.isRecycled()) {
                    return;
                }
                Drawable drawable = imageView.getDrawable();
                Bitmap bitmap2 = null;
                if ((drawable instanceof BitmapDrawable) && (bitmapDrawable = (BitmapDrawable) drawable) != null) {
                    bitmap2 = bitmapDrawable.getBitmap();
                }
                imageView.setImageBitmap(bitmap);
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmap2);
                }
            }
            C786410Ut5.LJLLLLLL(0, imageView);
            return;
        }
        C786410Ut5.LJLLLLLL(8, imageView);
    }

    public static void LLLZ(C1450990nrV c1450990nrV, float f, float f2) {
        View viewZO1;
        View viewCk;
        View viewXw;
        ArrayList<View> arrayList = new ArrayList();
        C0FVY c0fvy = c1450990nrV.LLLF;
        if (c0fvy != null && (viewXw = c0fvy.xw()) != null) {
            arrayList.add(viewXw);
        }
        C0FVY c0fvy2 = c1450990nrV.LLLF;
        if (c0fvy2 != null && (viewCk = c0fvy2.Ck()) != null) {
            viewCk.setBackgroundColor(0);
            arrayList.add(viewCk);
        }
        C0FVY c0fvy3 = c1450990nrV.LLLF;
        if (c0fvy3 != null && (viewZO1 = c0fvy3.ZO1()) != null) {
            arrayList.add(viewZO1);
        }
        arrayList.add(c1450990nrV.requireViewById(R.id.gpu));
        arrayList.add(c1450990nrV.requireViewById(R.id.l1y));
        for (View view : arrayList) {
            C786410Ut5.Ob(view, f);
            C786410Ut5.pc(view, f);
            C786410Ut5.ed(view, -f2);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zBooleanValue = ((Boolean) C283460B9c.LIZ.getValue()).booleanValue();
        ViewGroup viewGroup2 = (ViewGroup) ((ILayoutPreloadServiceForEditPage) ServiceManager.get().getService(ILayoutPreloadServiceForEditPage.class)).loadLayoutFiles("scene_image_edit_item", getSceneContext(), layoutInflater, R.layout.eqa, viewGroup, false);
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        int i = this.LLLLJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("item_onCreateView: position=");
        sbLIZ.append(i);
        sbLIZ.append(", duration=");
        sbLIZ.append(jElapsedRealtime2);
        sbLIZ.append("ms, ab_enabled=");
        sbLIZ.append(zBooleanValue);
        C1450070nq1.LIZIZ("ImageEdit#CompileResolution", C2188811AlT.LIZIZ(sbLIZ));
        return viewGroup2;
    }

    /* JADX WARN: Type inference failed for: r0v39, types: [X.0nrc] */
    /* JADX WARN: Type inference failed for: r0v40, types: [X.0njp] */
    public C1450990nrV(SingleImageData singleImageData, ImageAlbumData imageAlbumData, C1450090nq3 c1450090nq3, Function0<Unit> function0, CreativeInfo creativeInfo, CreativeModel creativeModel, C1DRG c1drg) {
        this.LLJJIJIIJIL = singleImageData;
        this.LLJJIJIL = imageAlbumData;
        this.LLJJJ = c1450090nq3;
        this.LLJJJIL = function0;
        this.LLJJJJ = creativeInfo;
        this.LLJJJJJIL = creativeModel;
        this.LLJJJJLIIL = c1drg;
        C1451230nrt c1451230nrt = new C1451230nrt();
        this.LLLIIII = c1451230nrt;
        new ImageTransformParams(1.0f, 0.0f, 0.0f, 0.0f, false, false);
        this.LLLIIIIL = new ImageTransformParams(1.0f, 0.0f, 0.0f, 0.0f, false, false);
        this.LLLIIIL = new C1451330ns3();
        this.LLLIIL = new C1450610nqt(singleImageData, c1451230nrt);
        this.LLLIL = C1664770tQJ.LIZ(c1drg, InterfaceC1453430nvR.class, null);
        this.LLLILZ = C1664770tQJ.LIZIZ(c1drg, C1451630nsX.class, null);
        this.LLLILZJ = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLLILZLLLI = C1664770tQJ.LIZ(c1drg, InterfaceC1451050nrb.class, null);
        this.LLLIZZ = C1449630npJ.LIZ(this, InterfaceC1450920nrO.class);
        this.LLLJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1460000o62.class, null);
        this.LLLJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1450260nqK.class, null);
        this.LLLJL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1452920nuc.class, null);
        C1664770tQJ.LIZIZ(c1drg, InterfaceC1453510nvZ.class, null);
        this.LLLL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1451320ns2.class, null);
        this.LLLLII = C1664770tQJ.LIZIZ(c1drg, InterfaceC1441090nbX.class, null);
        this.LLLLIIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 168));
        this.LLLLIILL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 166));
        this.LLLLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 164));
        this.LLLLILI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 165));
        this.LLLLJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1451100nrg.class, null);
        this.LLLLJI = -1;
        this.LLLLLL = C2296808zG.LIZ(C0PEM.LIZJ);
        this.LLLLLLL = new InterfaceC1462140o9U() { // from class: X.0nrc
            @Override // X.InterfaceC1462140o9U
            public final C364440EQo LIZIZ() {
                return null;
            }

            @Override // X.InterfaceC1462140o9U
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC1462140o9U
            public final C385670FAf<InterfaceC1460000o62> LJ() {
                return null;
            }

            @Override // X.InterfaceC1462140o9U
            public final void LJFF() {
            }

            @Override // X.InterfaceC1462140o9U
            public final Scene LJIIIIZZ() {
                return null;
            }

            @Override // X.InterfaceC1462140o9U
            public final LiveData<Integer> LIZ() {
                C1450990nrV c1450990nrV = this.LIZ;
                InterfaceC1455610nyx interfaceC1455610nyx = (InterfaceC1455610nyx) c1450990nrV.LLLJ.getValue(c1450990nrV, C1450990nrV.LLLLLLLLLL[4]);
                if (interfaceC1455610nyx != null) {
                    return interfaceC1455610nyx.ww();
                }
                return null;
            }

            @Override // X.InterfaceC1462140o9U
            public final InterfaceC19672111xv LIZJ() {
                return this.LIZ.LLLLLLLLL;
            }

            @Override // X.InterfaceC1462140o9U
            public final void LJII() {
                C1450990nrV c1450990nrV = this.LIZ;
                InterfaceC1455610nyx interfaceC1455610nyx = (InterfaceC1455610nyx) c1450990nrV.LLLJ.getValue(c1450990nrV, C1450990nrV.LLLLLLLLLL[4]);
                if (interfaceC1455610nyx != null) {
                    interfaceC1455610nyx.Ws(1);
                }
            }

            @Override // X.InterfaceC1462140o9U
            public final AbstractC1664510tPt LJI(C1DRG c1drg2, C1462090o9P c1462090o9P) {
                return new C1460260o6S(c1462090o9P, c1drg2);
            }
        };
        this.LLLLLLLLL = new InterfaceC19672111xv() { // from class: X.0njp
            @Override // X.InterfaceC19672111xv
            public final void LIZIZ() {
                ((InterfaceC1450920nrO) this.LIZ.LLLIZZ.getValue()).T22(false, null);
            }

            @Override // X.InterfaceC19672111xv
            public final View LIZJ() {
                return ((InterfaceC1450920nrO) this.LIZ.LLLIZZ.getValue()).wd1();
            }

            @Override // X.InterfaceC19672111xv
            public final Rect LIZLLL() {
                return ((InterfaceC1450920nrO) this.LIZ.LLLIZZ.getValue()).wf2().getEditRect();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC19672111xv
            public final Bitmap LIZ(VideoPublishEditModel videoPublishEditModel) {
                SingleImageData singleImageDataOR1 = ((InterfaceC1450920nrO) this.LIZ.LLLIZZ.getValue()).OR1();
                ImageAlbumData imageAlbumData2 = videoPublishEditModel.getImageAlbumData();
                if (imageAlbumData2 != null) {
                    return new RunnableC1432010nMt(singleImageDataOR1, imageAlbumData2, videoPublishEditModel.creativeModel, (String) null, new C1432030nMv(null, C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), videoPublishEditModel.getCreativeInfo(), EnumC20228214Cy.VE_PREVIEW_WORKSPACE, null, false, 12), videoPublishEditModel.creativeModel.imageEditModel.map, 18), (Function1) (0 == true ? 1 : 0), (InterfaceC1631620sYq) (0 == true ? 1 : 0), 232).LIZLLL(0, 0);
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        };
    }
}
