package X;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESeekFlag;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCrop;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.edit.crop.CropData;
import ge.i;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS136S1100000_22;
import kotlin.jvm.internal.AwS15S0002000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0nsS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1451580nsS extends i<InterfaceC1451890nsx, C21665419qe, C21665519qf, C1451730nsh> implements InterfaceC1451890nsx, InterfaceC379610EuV, InterfaceC362610EJn {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public static final int LLJL;
    public final C1DRG LLJILJILJ;
    public boolean LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final C01GW LLJJJIL;
    public Bitmap LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;

    public final void H4() {
        this.LLJILLL = false;
        P4().x7(true, false, true, true);
        InterfaceC1450620nqu interfaceC1450620nquV5 = v5();
        if (interfaceC1450620nquV5 != null) {
            interfaceC1450620nquV5.H50(true);
        }
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1451580nsS.class, "editProFileConfigManger", "getEditProFileConfigManger()Lcom/ss/android/ugc/aweme/comment/image/brush/editor/EditProFileConfigManger;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1451580nsS.class, "stickerTextComponent", "getStickerTextComponent()Lcom/ss/android/ugc/aweme/comment/image/textsticker/CommentImageEditStickerTextApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1451580nsS.class, "editSecondPageState", "getEditSecondPageState()Lcom/ss/android/ugc/aweme/comment/image/EditSecondPageState;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1451580nsS.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/comment/image/preview/CommentImageEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1451580nsS.class, "bottomBarApi", "getBottomBarApi()Lcom/ss/android/ugc/aweme/comment/image/bottombar/CommentImageEditBottomBarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1451580nsS.class, "topBarApi", "getTopBarApi()Lcom/ss/android/ugc/aweme/comment/image/topbar/CommentImageEditTopBarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1451580nsS.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C1451580nsS.class, "avListenableActivityRegistry", "getAvListenableActivityRegistry()Lcom/ss/android/ugc/tools/view/activity/AVListenableActivityRegistry;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C1451580nsS.class, "model", "getModel()Lcom/ss/android/ugc/aweme/comment/image/model/ImageEditModel;", 0);
        c09r3.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9};
        LLJL = 8;
    }

    private final InterfaceC524950KiL K4() {
        return (InterfaceC524950KiL) this.LLJJJJJIL.getValue(this, LLJJLIIIJLLLLLLLZ[7]);
    }

    private final InterfaceC1451690nsd O4() {
        return (InterfaceC1451690nsd) this.LLJJIJIIJIL.getValue(this, LLJJLIIIJLLLLLLLZ[4]);
    }

    private final C19571411hg T4() {
        return (C19571411hg) this.LLJJ.getValue(this, LLJJLIIIJLLLLLLLZ[0]);
    }

    private final C1451620nsW Z4() {
        return (C1451620nsW) this.LLJJIII.getValue(this, LLJJLIIIJLLLLLLLZ[2]);
    }

    private final C0E48 d5() {
        return (C0E48) this.LLJJJJLIIL.getValue();
    }

    private final InterfaceC1450620nqu v5() {
        return (InterfaceC1450620nqu) this.LLJJI.getValue(this, LLJJLIIIJLLLLLLLZ[1]);
    }

    private final InterfaceC1451640nsY x5() {
        return (InterfaceC1451640nsY) this.LLJJIJIL.getValue(this, LLJJLIIIJLLLLLLLZ[5]);
    }

    public final InterfaceC1451590nsT P4() {
        return (InterfaceC1451590nsT) this.LLJJIJI.getValue(this, LLJJLIIIJLLLLLLLZ[3]);
    }

    public final InterfaceC1461390o8H k5() {
        return (InterfaceC1461390o8H) this.LLJJJ.getValue(this, LLJJLIIIJLLLLLLLZ[6]);
    }

    public final C1450600nqs n5() {
        return (C1450600nqs) this.LLJJL.getValue(this, LLJJLIIIJLLLLLLLZ[8]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C21665519qf> o2() {
        return new AwS566S0100000_22(this, 48);
    }

    public final NLEEditor t5() {
        return (NLEEditor) this.LLJJJIL.getValue();
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1451730nsh> w2() {
        return new AwS566S0100000_22(this, 51);
    }

    private final boolean F4() {
        if (!n5().isOnlyCrop()) {
            if (!(!n5().editList.isEmpty())) {
                return false;
            }
            Set<String> set = n5().editList;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it2 = set.iterator();
                while (it2.hasNext()) {
                    if (!TextUtils.equals((String) it2.next(), "crop")) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final void C5() {
        O4().show();
        x5().show();
    }

    public final void S5() {
        NLEModel model;
        NLEModel model2;
        Integer numLJ;
        NLEEditor nLEEditorT5 = t5();
        int iIntValue = (nLEEditorT5 == null || (model2 = nLEEditorT5.getModel()) == null || (numLJ = C348350DlB.LJ(model2)) == null) ? 0 : numLJ.intValue();
        float f = iIntValue;
        NLEEditor nLEEditorT52 = t5();
        N5(iIntValue, (int) (f / ((nLEEditorT52 == null || (model = nLEEditorT52.getModel()) == null) ? 1.0f : model.getCanvasRatio())));
        NLETrackSlot nLETrackSlotU5 = U5();
        if (nLETrackSlotU5 != null) {
            R5(nLETrackSlotU5);
        }
    }

    public NLETrackSlot U5() {
        NLEModel model;
        NLETrack mainTrack;
        NLEEditor nLEEditorT5 = t5();
        NLETrackSlot slotByIndex = (nLEEditorT5 == null || (model = nLEEditorT5.getModel()) == null || (mainTrack = model.getMainTrack()) == null) ? null : mainTrack.getSlotByIndex(0);
        M5(slotByIndex);
        return slotByIndex;
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        K4().kF(this);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        Bitmap bitmap = this.LLJJJJ;
        if (bitmap != null) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        this.LLJJJJ = null;
        K4().b8(this);
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        P4().x7(false, false, false, false);
        InterfaceC1450620nqu interfaceC1450620nquV5 = v5();
        if (interfaceC1450620nquV5 != null) {
            interfaceC1450620nquV5.H50(false);
        }
        this.LLJILLL = true;
        super.show();
        S5();
        i3(new AwS601S0100000_22(this, 44));
        O4().hide();
        x5().hide();
        C1451620nsW c1451620nsWZ4 = Z4();
        if (c1451620nsWZ4 != null) {
            c1451620nsWZ4.LIZ.LIZLLL(new AwS601S0100000_22(AFwS261S0000000_22.get$arr$(37), 661), true);
        }
    }

    @Override // X.InterfaceC1451890nsx
    public Bitmap Ir2() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // ge.i, X.InterfaceC386130FBz
    public boolean isShowing() {
        return this.LLJILLL;
    }

    private final void R5(NLETrackSlot nLETrackSlot) {
        if (C276180As4.LIZ()) {
            E5(C387020FFk.LIZ(nLETrackSlot, n5()), n5().currentPath);
        } else {
            E5(C387020FFk.LIZ(nLETrackSlot, n5()), null);
        }
    }

    private final void d6(C1451600nsU c1451600nsU) {
        NLESegmentVideo nLESegmentVideoDynamicCast;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        NLETrackSlot nLETrackSlot = T2().LIZ;
        if (nLETrackSlot == null || (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment())) == null) {
            return;
        }
        List<PointF> list = c1451600nsU.LIZ;
        NLEStyCrop nLEStyCrop = new NLEStyCrop();
        PointF pointF = (PointF) C13LP.LJJJLZIJ(0, list);
        float f8 = 0.0f;
        if (pointF != null) {
            f = pointF.x;
        } else {
            f = 0.0f;
        }
        nLEStyCrop.setXLeft(f);
        PointF pointF2 = (PointF) C13LP.LJJJLZIJ(0, list);
        if (pointF2 != null) {
            f2 = pointF2.y;
        } else {
            f2 = 0.0f;
        }
        nLEStyCrop.setYUpper(f2);
        PointF pointF3 = (PointF) C13LP.LJJJLZIJ(1, list);
        if (pointF3 != null) {
            f3 = pointF3.x;
        } else {
            f3 = 0.0f;
        }
        nLEStyCrop.setXRightUpper(f3);
        PointF pointF4 = (PointF) C13LP.LJJJLZIJ(1, list);
        if (pointF4 != null) {
            f4 = pointF4.y;
        } else {
            f4 = 0.0f;
        }
        nLEStyCrop.setYRightUpper(f4);
        PointF pointF5 = (PointF) C13LP.LJJJLZIJ(2, list);
        if (pointF5 != null) {
            f5 = pointF5.x;
        } else {
            f5 = 0.0f;
        }
        nLEStyCrop.setXLeftLower(f5);
        PointF pointF6 = (PointF) C13LP.LJJJLZIJ(2, list);
        if (pointF6 != null) {
            f6 = pointF6.y;
        } else {
            f6 = 0.0f;
        }
        nLEStyCrop.setYLeftLower(f6);
        PointF pointF7 = (PointF) C13LP.LJJJLZIJ(3, list);
        if (pointF7 != null) {
            f7 = pointF7.x;
        } else {
            f7 = 0.0f;
        }
        nLEStyCrop.setXRight(f7);
        PointF pointF8 = (PointF) C13LP.LJJJLZIJ(3, list);
        if (pointF8 != null) {
            f8 = pointF8.y;
        }
        nLEStyCrop.setYLower(f8);
        nLESegmentVideoDynamicCast.setIsWithEffect(true);
        nLESegmentVideoDynamicCast.setCrop(nLEStyCrop);
        NLEEditor nLEEditorT5 = t5();
        if (nLEEditorT5 != null) {
            nLEEditorT5.commit();
        }
        NLEEditor nLEEditorT52 = t5();
        if (nLEEditorT52 != null) {
            nLEEditorT52.done();
        }
        InterfaceC1452170ntP value = P4().g().getValue();
        if (value != null) {
            value.refreshCurrentFrame();
        }
        nLETrackSlot.setExtra("crop_matrix", C1449620npI.LIZJ(c1451600nsU.LJ));
        int iOrdinal = C375130EnH.LIZ(c1451600nsU.LIZIZ).ordinal();
        nLETrackSlot.setExtra("ep_crop_mode", String.valueOf(iOrdinal));
        nLETrackSlot.setExtra("ep_crop_ratio", String.valueOf(c1451600nsU.LIZJ));
        nLETrackSlot.setExtra("crop_slider_rotation", String.valueOf(c1451600nsU.LIZLLL));
        nLETrackSlot.setExtra("crop_button_rotation", String.valueOf(c1451600nsU.LJFF));
        nLETrackSlot.setExtra("crop_is_photo_cropped", String.valueOf(c1451600nsU.LJIIJ));
        nLETrackSlot.setExtra("crop_mirror_x", String.valueOf(c1451600nsU.LJI));
        nLETrackSlot.setExtra("ep_crop_scale", String.valueOf(c1451600nsU.LJII));
        nLETrackSlot.setExtra("ep_crop_transX", String.valueOf(c1451600nsU.LJIIIIZZ));
        nLETrackSlot.setExtra("ep_crop_transY", String.valueOf(c1451600nsU.LJIIIZ));
        CanvasVideoData canvasVideoData = n5().videoPublishEditModel.getCanvasVideoData();
        if (canvasVideoData != null) {
            canvasVideoData.setCropData(new CropData(nLEStyCrop.getXLeft(), nLEStyCrop.getYUpper(), nLEStyCrop.getXRightUpper(), nLEStyCrop.getYRightUpper(), nLEStyCrop.getXLeftLower(), nLEStyCrop.getYLeftLower(), nLEStyCrop.getXRight(), nLEStyCrop.getYLower(), c1451600nsU.LJII, c1451600nsU.LJIIIIZZ, c1451600nsU.LJIIIZ, 0.0f, c1451600nsU.LIZJ, iOrdinal, C1449620npI.LIZJ(c1451600nsU.LJ), c1451600nsU.LIZLLL, c1451600nsU.LJFF, c1451600nsU.LJIIJ, c1451600nsU.LJI));
        }
    }

    public final void M5(NLETrackSlot nLETrackSlot) {
        i3(new AwS601S0100000_22(nLETrackSlot, 43));
    }

    public C1451580nsS(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), C19571411hg.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1450620nqu.class, null);
        this.LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), C1451620nsW.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1451590nsT.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1451690nsd.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1451640nsY.class, null);
        this.LLJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1461390o8H.class, null);
        this.LLJJJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 50));
        this.LLJJJJJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC524950KiL.class, null);
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 49));
        this.LLJJL = C1664770tQJ.LIZ(getDiContainer(), C1450600nqs.class, null);
    }

    private final void N5(int i, int i2) {
        i3(new AwS15S0002000_22(i, i2, 0));
    }

    public final void D5(C1451600nsU c1451600nsU, Bitmap bitmap) throws Throwable {
        String absolutePath;
        C1463670oBx c1463670oBxGc;
        C348100Dkm c348100DkmLIZLLL;
        INLEMediaSession iNLEMediaSession;
        INLEPlayer playerApi;
        File file;
        if (C276180As4.LIZ()) {
            P4().hA(bitmap);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            C19571411hg c19571411hgT4 = T4();
            if (c19571411hgT4 != null && (file = (File) c19571411hgT4.LJ.getValue()) != null) {
                absolutePath = file.getAbsolutePath();
            } else {
                absolutePath = null;
            }
            sbLIZ.append(absolutePath);
            sbLIZ.append(System.currentTimeMillis());
            sbLIZ.append(".png");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (bitmap != null) {
                C2477909nN.LJI(bitmap, strLIZIZ, Bitmap.CompressFormat.PNG, 0, 4);
            }
            n5().setCurrentPath(strLIZIZ);
            NLETrackSlot nLETrackSlot = T2().LIZ;
            if (nLETrackSlot != null) {
                NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
                NLEResourceAV nLEResourceAV = new NLEResourceAV();
                nLEResourceAV.setResourceFile(strLIZIZ);
                nLESegmentVideo.setAVFile(nLEResourceAV);
                nLETrackSlot.setMainSegment(nLESegmentVideo);
            }
            NLEEditor nLEEditorT5 = t5();
            if (nLEEditorT5 != null) {
                nLEEditorT5.commit();
            }
            NLEEditor nLEEditorT52 = t5();
            if (nLEEditorT52 != null) {
                nLEEditorT52.done();
            }
            C1463670oBx c1463670oBxGc2 = P4().gc();
            if (c1463670oBxGc2 != null) {
                c1463670oBxGc2.refreshCurrentFrame();
            }
            InterfaceC1451590nsT interfaceC1451590nsTP4 = P4();
            if (interfaceC1451590nsTP4 != null && (c1463670oBxGc = interfaceC1451590nsTP4.gc()) != null && (c348100DkmLIZLLL = c1463670oBxGc.LIZLLL()) != null && (iNLEMediaSession = c348100DkmLIZLLL.LIZIZ) != null && (playerApi = iNLEMediaSession.getPlayerApi()) != null) {
                playerApi.seekTime(0L, NLESeekFlag.EDITOR_SEEK_FLAG_LastSeek);
            }
        } else {
            d6(c1451600nsU);
        }
        H4();
        if (c1451600nsU.LJIIJJI) {
            C1451610nsV.LIZ(n5(), "crop");
        } else {
            C1450600nqs c1450600nqsN5 = n5();
            c1450600nqsN5.editList.remove("crop");
            c1450600nqsN5.sessionEditList.remove("crop");
        }
        if (F4()) {
            Bitmap bitmap2 = this.LLJJJJ;
            if (bitmap2 != null) {
                bitmap2.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap2);
            }
            this.LLJJJJ = bitmap;
        }
    }

    public final void E5(C21665719qh c21665719qh, String str) {
        i3(new AwS136S1100000_22(c21665719qh, str, 0));
    }

    @Override // X.InterfaceC362610EJn
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && this.LLJILLL) {
            i3(AFwS261S0000000_22.get$arr$(36));
            return true;
        }
        return false;
    }
}
