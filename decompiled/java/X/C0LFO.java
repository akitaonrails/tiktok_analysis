package X;

import android.content.Context;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.ss.android.ugc.aweme.creative.model.CameraSlotModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.MusicInfo;
import com.ss.android.ugc.aweme.creative.model.TemplateData;
import com.ss.android.ugc.aweme.creative.model.UgcTemplateData;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.creative.model.template.VideoTemplateSlot;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.port.internal.IMediaCacheService;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.recordcontrol.f0;
import ge.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS23S0010000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LFO, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LFO extends i<InterfaceC531040KsA, C539910LFl, C0LFX, C539920LFm> implements InterfaceC531040KsA, C0F1U, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public static final int LLJZIJLIL;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final ShortVideoContext LLJJJ;
    public C0LFT LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC497601wk LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;
    public Boolean LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final Function0<C539910LFl> LLJLIL;
    public final Function0<C0LFX> LLJLILLLLZIIL;
    public final Function0<C539920LFm> LLJLL;
    public long LLJLLIL;
    public CreativeLoadingDialog LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0LFO.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0LFO.class, "reuseSurfaceApiComponent", "getReuseSurfaceApiComponent()Lcom/bytedance/uicomponent/ReuseSurfaceApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0LFO.class, "lighteningControlProgressApiComponent", "getLighteningControlProgressApiComponent()Lcom/ss/android/ugc/gamora/recorder/progress/LighteningControlProgressApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0LFO.class, "barApiComponent", "getBarApiComponent()Lcom/ss/android/ugc/gamora/recorder/control/DockBarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C0LFO.class, "slotBottomApi", "getSlotBottomApi()Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/ugctemplate/v2t/IVideoTemplateSlotBottomApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C0LFO.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C0LFO.class, "controlComponent", "getControlComponent()Lcom/ss/android/ugc/aweme/shortvideo/recordcontrol/TikTokRecordControlComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C0LFO.class, "vtFlowApi", "getVtFlowApi()Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/ugctemplate/v2t/VideoTemplateFlowApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C0LFO.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        c09r3.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9};
        LLJZIJLIL = 8;
    }

    private final void C5() {
        if (this.LLJJJIL == null && getDiContainer().LIZJ(C0LFT.class)) {
            whenReadyOrThrowInternal(getDiContainer(), C0LFT.class, new AwS587S0100000_8(this, 233));
        }
        if (this.LLJJJIL == null) {
            getDiContainer().LJIIJ(C0LFT.class);
        }
    }

    private final InterfaceC1648870t0f H4() {
        return (InterfaceC1648870t0f) this.LLJJIJI.getValue(this, LLJZ[3]);
    }

    private final InterfaceC1630630sXF P4() {
        return (InterfaceC1630630sXF) this.LLJJIII.getValue(this, LLJZ[2]);
    }

    private final InterfaceC1452360nti Z4() {
        return (InterfaceC1452360nti) this.LLJJI.getValue(this, LLJZ[1]);
    }

    private final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLJJL.getValue(this, LLJZ[8]);
    }

    private final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLJJIJIL.getValue(this, LLJZ[5]);
    }

    private final InterfaceC1638550sk1 gq() {
        return (InterfaceC1638550sk1) this.LLJJ.getValue(this, LLJZ[0]);
    }

    private final InterfaceC531050KsB n5() {
        return (InterfaceC531050KsB) this.LLJJJJLIIL.getValue(this, LLJZ[7]);
    }

    private final void showLoadingDialog() {
        CreativeLoadingDialog creativeLoadingDialog = this.LLJLLL;
        if (creativeLoadingDialog == null || !creativeLoadingDialog.isShowing()) {
            if (this.LLJLLL == null) {
                C19576911iZ c19576911iZ = C19576911iZ.LIZ;
                Context contextLJIIIZ = C1664590tQ1.LJIIIZ(this);
                CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
                creativeLoadingDialogBuilder.showProgress(false);
                creativeLoadingDialogBuilder.backCanCancel(false);
                this.LLJLLL = c19576911iZ.createLoadingDialog(contextLJIIIZ, 1022, creativeLoadingDialogBuilder);
            }
            CreativeLoadingDialog creativeLoadingDialog2 = this.LLJLLL;
            if (creativeLoadingDialog2 != null) {
                creativeLoadingDialog2.show();
            }
        }
    }

    public final f0 K4() {
        return (f0) this.LLJJJJ.getValue(this, LLJZ[6]);
    }

    @Override // X.InterfaceC531040KsA
    public void YS() {
        i3(AFwS239S0000000_8.get$arr$(113));
    }

    public final C539910LFl d5() {
        return (C539910LFl) this.LLJL.getValue();
    }

    public final C0LFR k5() {
        return (C0LFR) this.LLJJIJIIJIL.getValue(this, LLJZ[4]);
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        C201955140j.LIZJ(C1398350mUb.LIZIZ, "CameraNLEPlayerForTemplateComponent onResume");
        i3(AFwS239S0000000_8.get$arr$(112));
        super.onResume();
    }

    @Override // X.InterfaceC531040KsA
    public boolean r30() {
        Boolean bool = this.LLJJLIIIJLLLLLLLZ;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final void D5() {
        CreativeLoadingDialog creativeLoadingDialog;
        C0LFR c0lfrK5 = k5();
        if (c0lfrK5 != null) {
            c0lfrK5.Xf2(true);
        }
        CreativeLoadingDialog creativeLoadingDialog2 = this.LLJLLL;
        if (creativeLoadingDialog2 == null || !creativeLoadingDialog2.isShowing() || (creativeLoadingDialog = this.LLJLLL) == null) {
            return;
        }
        creativeLoadingDialog.dismiss();
    }

    @Override // X.InterfaceC531040KsA
    public boolean Fh() {
        return isShowing();
    }

    public final void Ll0() {
        InterfaceC1648570t0B recordControlApi = getRecordControlApi();
        if (recordControlApi != null) {
            recordControlApi.xP1(true, false, true);
        }
        C0LFR c0lfrK5 = k5();
        if (c0lfrK5 != null) {
            c0lfrK5.Fo0();
        }
        v5(false);
    }

    @Override // X.InterfaceC531040KsA
    public void VX() {
        if (isShowing()) {
            hide();
        }
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void hide() {
        D5();
        v5(true);
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        i3(AFwS239S0000000_8.get$arr$(111));
        C201955140j.LIZJ(C1398350mUb.LIZIZ, "CameraNLEPlayerForTemplateComponent onPause");
        super.onPause();
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        super.show();
        C201955140j.LIZJ(C1398350mUb.LIZIZ, "CameraNLEPlayerForTemplateComponent show");
        getCameraApiComponent().IU1().LIZLLL(EnumC545560LaU.UGC_TEMPLATE_RECORD_PREVIEW_VIDEO_SCENE, C1DPV.LIZIZ.LIZJ(C1DPX.CLOSE_CAMERA_UGC_PREVIEW_OPEN, EnumC1641610sox.PAGE_INVISIBLE));
    }

    @Override // ge.i
    public Function0<C539910LFl> E3() {
        return this.LLJLIL;
    }

    public final CreativeLoadingDialog O4() {
        return this.LLJLLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0LFX> o2() {
        return this.LLJLILLLLZIIL;
    }

    public final void t5() {
        hide();
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C539920LFm> w2() {
        return this.LLJLL;
    }

    private final void H5(boolean z) {
        InterfaceC1638550sk1 interfaceC1638550sk1Gq = gq();
        if (interfaceC1638550sk1Gq != null) {
            interfaceC1638550sk1Gq.JN0(z);
        }
        InterfaceC1630630sXF interfaceC1630630sXFP4 = P4();
        if (interfaceC1630630sXFP4 != null) {
            interfaceC1630630sXFP4.W9(z);
        }
        InterfaceC1648870t0f interfaceC1648870t0fH4 = H4();
        if (interfaceC1648870t0fH4 != null) {
            interfaceC1648870t0fH4.showDockBar(z);
        }
    }

    private final void v5(boolean z) {
        i3(AFwS239S0000000_8.get$arr$(110));
        super.hide();
        D5();
        C201955140j.LIZJ(C1398350mUb.LIZIZ, "CameraNLEPlayerForTemplateComponent hideScreenWithBottomUI");
        getCameraApiComponent().IU1().LIZIZ(EnumC545560LaU.UGC_TEMPLATE_RECORD_PREVIEW_VIDEO_SCENE, C1DPV.LIZIZ.LIZIZ(C1DPW.OPEN_CAMERA_CLOSE_UGC_PREVIEW, null), Boolean.FALSE);
        H5(true);
        n5().wK2(true, null);
        this.LLJJLIIIJLLLLLLLZ = null;
    }

    public final void E5(CreativeLoadingDialog creativeLoadingDialog) {
        this.LLJLLL = creativeLoadingDialog;
    }

    public final void M5(boolean z) {
        SurfaceView surfaceViewLJIJJLI;
        InterfaceC1452360nti interfaceC1452360ntiZ4 = Z4();
        if (interfaceC1452360ntiZ4 != null && (surfaceViewLJIJJLI = interfaceC1452360ntiZ4.LJIJJLI()) != null) {
            if (z) {
                C786410Ut5.LLIIII(surfaceViewLJIJJLI, 0);
            } else {
                C786410Ut5.LLIIII(surfaceViewLJIJJLI, 8);
            }
        }
    }

    public C0LFO(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1638550sk1.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1452360nti.class, null);
        this.LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1630630sXF.class, null);
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1648870t0f.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), C0LFR.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
        this.LLJJJ = (ShortVideoContext) getDiContainer().LJII(ShortVideoContext.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(getDiContainer(), f0.class, null);
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJJJJJIL = C2296808zG.LIZ(C2107308Nj.LIZ);
        this.LLJJJJLIIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC531050KsB.class, null);
        this.LLJJL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
        this.LLJL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 337));
        this.LLJLIL = new AwS552S0100000_8(this, 339);
        this.LLJLILLLLZIIL = AFwS194S0000000_8.get$arr$(172);
        this.LLJLL = new AwS552S0100000_8(this, 338);
    }

    private final Pair<Integer, Integer> T4(VideoTemplateSlot videoTemplateSlot, VideoTemplateSlot videoTemplateSlot2) {
        UgcTemplateData ugcTemplateData;
        double dLIZJ;
        double musicStart;
        double clipStart;
        double slotEndTTime;
        CreativeModel creativeModel;
        UgcTemplateData ugcTemplateData2;
        MusicInfo musicInfo;
        CreativeModel creativeModel2;
        if (videoTemplateSlot == null) {
            return null;
        }
        C536310L1p c536310L1p = C536310L1p.LIZ;
        ShortVideoContext shortVideoContext = this.LLJJJ;
        if (shortVideoContext != null && (creativeModel2 = shortVideoContext.creativeModel) != null) {
            ugcTemplateData = creativeModel2.ugcTemplateData;
        } else {
            ugcTemplateData = null;
        }
        String str = shortVideoContext.shootWay;
        c536310L1p.getClass();
        if (!C536310L1p.LJII(ugcTemplateData, str)) {
            if (videoTemplateSlot2 == null) {
                double dLIZJ2 = C531630Kt7.LIZJ(videoTemplateSlot);
                double d = LSPassThroughRecordSizeConfig.DEFAULT;
                return new Pair<>(Integer.valueOf((int) (dLIZJ2 * d)), Integer.valueOf((int) (videoTemplateSlot.getSlotEndTTime() * d)));
            }
            dLIZJ = C531630Kt7.LIZJ(videoTemplateSlot2);
            slotEndTTime = videoTemplateSlot2.getSlotEndTTime();
            clipStart = videoTemplateSlot2.getClipStart();
        } else {
            ShortVideoContext shortVideoContext2 = this.LLJJJ;
            dLIZJ = 0.0d;
            if (shortVideoContext2 != null && (creativeModel = shortVideoContext2.creativeModel) != null && (ugcTemplateData2 = creativeModel.ugcTemplateData) != null && (musicInfo = ugcTemplateData2.awemeMusicInfo) != null) {
                musicStart = musicInfo.getMusicStart();
            } else {
                musicStart = 0.0d;
            }
            clipStart = musicStart / ((double) LSPassThroughRecordSizeConfig.DEFAULT);
            slotEndTTime = videoTemplateSlot.getSlotEndTTime();
        }
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getMusicClipTime: videoSlotStartTime = ");
        sbLIZ.append(C531630Kt7.LIZJ(videoTemplateSlot));
        sbLIZ.append(", videoSlotEndTime = ");
        sbLIZ.append(videoTemplateSlot.getSlotEndTTime());
        sbLIZ.append(", musicSlotStartTime = ");
        sbLIZ.append(dLIZJ);
        sbLIZ.append(", musicSlotEndTime = ");
        sbLIZ.append(slotEndTTime);
        sbLIZ.append(", musicClipStart = ");
        sbLIZ.append(clipStart);
        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        double dAbs = Math.abs(C531630Kt7.LIZJ(videoTemplateSlot) - dLIZJ);
        double dAbs2 = Math.abs(videoTemplateSlot.getSlotEndTTime() - slotEndTTime);
        if ((C531630Kt7.LIZJ(videoTemplateSlot) < dLIZJ || videoTemplateSlot.getSlotEndTTime() > slotEndTTime) && ((C531630Kt7.LIZJ(videoTemplateSlot) < dLIZJ || dAbs2 > 9.999999747378752E-6d) && (dAbs > 9.999999747378752E-6d || (videoTemplateSlot.getSlotEndTTime() > slotEndTTime && dAbs2 > 9.999999747378752E-6d)))) {
            return null;
        }
        double dLIZJ3 = (C531630Kt7.LIZJ(videoTemplateSlot) - dLIZJ) + clipStart;
        double d2 = LSPassThroughRecordSizeConfig.DEFAULT;
        int i = (int) (dLIZJ3 * d2);
        return new Pair<>(Integer.valueOf(i), Integer.valueOf((int) (((double) i) + (videoTemplateSlot.getDuration() * d2))));
    }

    public final void F4(List<C539860LFg> list, NLEModel nLEModel) {
        NLENode nLENodeDeepClone;
        if (list != null && !list.isEmpty()) {
            showLoadingDialog();
            ArrayList arrayList = new ArrayList();
            for (C539860LFg c539860LFg : list) {
                String str = c539860LFg.LJII;
                if (str != null && str.length() != 0) {
                    arrayList.add(c539860LFg);
                }
            }
            if (!arrayList.isEmpty()) {
                C5();
                if (nLEModel != null) {
                    nLENodeDeepClone = nLEModel.deepClone(true);
                } else {
                    nLENodeDeepClone = null;
                }
                NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(nLENodeDeepClone);
                if (nLEModelDynamicCast != null) {
                    C23250099c.LIZLLL(this.LLJJJJJIL, null, null, new C0LFP(this, nLEModelDynamicCast, null), 3);
                    return;
                }
                return;
            }
            C539860LFg c539860LFg2 = (C539860LFg) C13LP.LJJJLL(list);
            if (c539860LFg2 == null) {
                return;
            }
            String str2 = c539860LFg2.LIZ;
            if (str2 == null) {
                str2 = "";
            }
            if (str2.length() == 0) {
                hide();
                return;
            }
            C0LFR c0lfrK5 = k5();
            if (c0lfrK5 != null) {
                c0lfrK5.P91(Boolean.valueOf(Intrinsics.LJFF(c539860LFg2.LJI, Boolean.TRUE)), str2);
            }
            hide();
            return;
        }
        hide();
    }

    @Override // X.InterfaceC531040KsA
    public void QW1(List<C539860LFg> list, boolean z) {
        int iVO1;
        SurfaceView surfaceViewLJIJJLI;
        FrameLayout.LayoutParams layoutParams;
        VideoTemplateSlot clipProcessMusicItem;
        CameraSlotModel cameraSlotModel;
        ArrayList<VideoTemplateSlot> templateSlots;
        VideoTemplateSlot videoTemplateSlot;
        Pair<Integer, Integer> pairT4;
        CameraSlotModel cameraSlotModel2;
        this.LLJJLIIIJLLLLLLLZ = Boolean.valueOf(z);
        show();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LLJLLIL < 500) {
            this.LLJLLIL = jCurrentTimeMillis;
            return;
        }
        n5().wK2(false, Boolean.TRUE);
        this.LLJLLIL = jCurrentTimeMillis;
        C0LFR c0lfrK5 = k5();
        if (c0lfrK5 != null) {
            iVO1 = c0lfrK5.VO1();
        } else {
            iVO1 = -1;
        }
        String str = null;
        if (iVO1 >= 0) {
            TemplateData templateData = this.LLJJJ.creativeModel.templateData;
            if (templateData != null && (cameraSlotModel2 = templateData.getCameraSlotModel()) != null) {
                clipProcessMusicItem = cameraSlotModel2.getClipProcessMusicItem();
            } else {
                clipProcessMusicItem = null;
            }
            TemplateData templateData2 = this.LLJJJ.creativeModel.templateData;
            if (templateData2 != null && (cameraSlotModel = templateData2.getCameraSlotModel()) != null && (templateSlots = cameraSlotModel.getTemplateSlots()) != null && (videoTemplateSlot = (VideoTemplateSlot) C13LP.LJJJLZIJ(iVO1, templateSlots)) != null && (pairT4 = T4(videoTemplateSlot, clipProcessMusicItem)) != null && pairT4.getFirst() != null && pairT4 != null && pairT4.getSecond() != null) {
                this.LLJJJ.cameraComponentModel.mMusicStart = pairT4.getFirst().intValue();
                this.LLJJJ.cameraComponentModel.musicEndTime = pairT4.getSecond().intValue();
            }
        }
        if (list.size() == 1) {
            IMediaCacheService iMediaCacheServiceLJIILL = C0CHQ.LIZ().LJIILL();
            C539860LFg c539860LFg = (C539860LFg) C13LP.LJJJLL(list);
            if (c539860LFg != null) {
                str = c539860LFg.LIZ;
            }
            iMediaCacheServiceLJIILL.updateMediaTypeCache(str);
        }
        i3(new AwS23S0010000_8(z, 10));
        i3(new AwS587S0100000_8(list, (List<MentionDataItem>) 234));
        H5(false);
        InterfaceC1452360nti interfaceC1452360ntiZ4 = Z4();
        if (interfaceC1452360ntiZ4 != null && (surfaceViewLJIJJLI = interfaceC1452360ntiZ4.LJIJJLI()) != null) {
            ViewGroup.LayoutParams layoutParams2 = surfaceViewLJIJJLI.getLayoutParams();
            if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                i3(new AwS587S0100000_8(layoutParams, 235));
            }
        }
    }
}
