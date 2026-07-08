package X;

import android.graphics.PointF;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCrop;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.edit.crop.CropData;
import com.ss.android.vesdk.VEEditor;
import java.util.List;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nqY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1450400nqY extends C12QQ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public static final int LLJL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public boolean LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1450400nqY.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1450400nqY.class, "editAutoSaveDraftApi", "getEditAutoSaveDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditAutoSaveDraftApi;", 0);
        c09r3.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJL = 8;
    }

    private final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLJJJJ.getValue(this, LLJJLIIIJLLLLLLLZ[0]);
    }

    private final InterfaceC559500Lwy N5() {
        return (InterfaceC559500Lwy) this.LLJJJJJIL.getValue(this, LLJJLIIIJLLLLLLLZ[1]);
    }

    private final C0E48 R5() {
        return (C0E48) this.LLJJJJLIIL.getValue();
    }

    @Override // X.C12QQ
    public void H4() {
        C1456140nzo.LIZIZ(JY0(), false, false, false, false, 12);
    }

    @Override // X.C12QQ
    public void K4() {
        super.K4();
        if (!C573570MeZ.LIZIZ(Z4()) || this.LLJJL) {
            C1456140nzo.LIZIZ(JY0(), true, false, false, false, 12);
        } else {
            JY0().rh0(false);
        }
    }

    private final void S5(C1450520nqk c1450520nqk) {
        NLESegmentVideo nLESegmentVideoDynamicCast;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        C0E55 player;
        NLETrackSlot nLETrackSlot = T2().LIZIZ;
        if (nLETrackSlot == null || (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment())) == null) {
            return;
        }
        List<PointF> list = c1450520nqk.LIZ;
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
        NLEEditor nLEEditorD5 = d5();
        if (nLEEditorD5 != null) {
            nLEEditorD5.commit();
        }
        NLEEditor nLEEditorD52 = d5();
        if (nLEEditorD52 != null) {
            nLEEditorD52.done();
        }
        C0E48 c0e48R5 = R5();
        if (c0e48R5 != null && (player = c0e48R5.getPlayer()) != null) {
            player.LJJIIZ(Integer.valueOf(VEEditor.SEEK_MODE.EDITOR_REFRESH_MODE_FOECE.getValue()));
        }
        nLETrackSlot.setExtra("crop_matrix", C1449620npI.LIZJ(c1450520nqk.LJ));
        int iOrdinal = C375130EnH.LIZ(c1450520nqk.LIZIZ).ordinal();
        nLETrackSlot.setExtra("ep_crop_mode", String.valueOf(iOrdinal));
        nLETrackSlot.setExtra("ep_crop_ratio", String.valueOf(c1450520nqk.LIZJ));
        nLETrackSlot.setExtra("crop_slider_rotation", String.valueOf(c1450520nqk.LIZLLL));
        nLETrackSlot.setExtra("crop_button_rotation", String.valueOf(c1450520nqk.LJFF));
        nLETrackSlot.setExtra("crop_is_photo_cropped", String.valueOf(c1450520nqk.LJIILJJIL));
        nLETrackSlot.setExtra("crop_mirror_x", String.valueOf(c1450520nqk.LJI));
        nLETrackSlot.setExtra("ep_crop_scale", String.valueOf(c1450520nqk.LJIIJJI));
        nLETrackSlot.setExtra("ep_crop_transX", String.valueOf(c1450520nqk.LJIIL));
        nLETrackSlot.setExtra("ep_crop_transY", String.valueOf(c1450520nqk.LJIILIIL));
        CanvasVideoData canvasVideoData = Z4().getCanvasVideoData();
        if (canvasVideoData != null) {
            canvasVideoData.setCropData(new CropData(nLEStyCrop.getXLeft(), nLEStyCrop.getYUpper(), nLEStyCrop.getXRightUpper(), nLEStyCrop.getYRightUpper(), nLEStyCrop.getXLeftLower(), nLEStyCrop.getYLeftLower(), nLEStyCrop.getXRight(), nLEStyCrop.getYLower(), c1450520nqk.LJIIJJI, c1450520nqk.LJIIL, c1450520nqk.LJIILIIL, 0.0f, c1450520nqk.LIZJ, iOrdinal, C1449620npI.LIZJ(c1450520nqk.LJ), c1450520nqk.LIZLLL, c1450520nqk.LJFF, c1450520nqk.LJIILJJIL, c1450520nqk.LJI));
        }
    }

    @Override // X.C12QQ
    public void t5(C1450520nqk c1450520nqk) {
        String strStore;
        S5(c1450520nqk);
        NLEEditor nLEEditorD5 = d5();
        if (nLEEditorD5 != null && (strStore = nLEEditorD5.store()) != null) {
            Z4().setNleData(strStore);
        }
        InterfaceC559500Lwy interfaceC559500LwyN5 = N5();
        if (interfaceC559500LwyN5 != null) {
            interfaceC559500LwyN5.Qk(false);
        }
        this.LLJJL = true;
        K4();
    }

    public C1450400nqY(C19A3 c19a3, C1DRG c1drg, boolean z) {
        super(c19a3, c1drg, z);
        this.LLJJJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC559500Lwy.class, null);
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS566S0100000_22(c1drg, 444));
    }
}
