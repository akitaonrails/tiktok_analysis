package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.ailive.MixEditingMaterialModel;
import com.ss.android.ugc.aweme.creative.model.ailive.ProgressModel;
import com.ss.android.ugc.aweme.creative.model.ailive.UsageStatus;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0MCC, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MCC extends C0MCB {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public static final int LLJJIII;
    public final String LLJILJIL;
    public final C01GW LLJILJILJ;
    public long LLJILLL;
    public final InterfaceC1731706qJ LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0MCC.class, "mixEditingMaterialAiAliveApi", "getMixEditingMaterialAiAliveApi()Lcom/ss/android/ugc/gamora/editor/mixediting/ailive/MixEditingMaterialAiAliveApi;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIII = 8;
    }

    private final InterfaceC564930MDr W2() {
        return (InterfaceC564930MDr) this.LLJJ.getValue(this, LLJJI[0]);
    }

    private final int c3() {
        return ((Number) this.LLJILJILJ.getValue()).intValue();
    }

    @Override // X.C0MCB, X.InterfaceC558740Lvk
    public long getStartTime() {
        return this.LLJILLL;
    }

    @Override // X.C0MCB, X.InterfaceC558740Lvk
    public String getTag() {
        return this.LLJILJIL;
    }

    public C0MCC(C1DRG c1drg) {
        super(c1drg);
        this.LLJILJIL = "AILiveDataManagerWithMixEditing";
        this.LLJILJILJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(243));
        this.LLJILLL = -1L;
        this.LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC564930MDr.class, null);
    }

    public final void H2(AILivePhotoModel aILivePhotoModel) {
        MixEditingMaterialModel mixEditingMaterialModel;
        ProgressModel progressModelLIZIZ = aILivePhotoModel.LIZIZ();
        ProgressModel progressModel = aILivePhotoModel.lastStatus;
        if (progressModel != null) {
            mixEditingMaterialModel = progressModel.bindMixMaterial;
        } else {
            mixEditingMaterialModel = null;
        }
        progressModelLIZIZ.bindMixMaterial = mixEditingMaterialModel;
    }

    @Override // X.C0MCB, X.InterfaceC558740Lvk
    public void bm(long j) {
        this.LLJILLL = j;
    }

    @Override // X.C0MCB, X.InterfaceC558740Lvk
    public void Zq1(NLETrackSlot nLETrackSlot, CreativeModel creativeModel) {
        C558950Lw5.LIZ(getTag(), o2(), creativeModel);
        MixEditingMaterialModel mixEditingMaterialModel = creativeModel.aiLivePhotoModel.LIZIZ().bindMixMaterial;
        InterfaceC564930MDr interfaceC564930MDrW2 = W2();
        if (interfaceC564930MDrW2 != null) {
            interfaceC564930MDrW2.KM0(true, EnumC1998707sH.CLEAR_FOR_AI_ALIVE_CANCEL_OR_REAPPLY);
        }
        C559010LwB.LIZIZ(getTag(), "clear mixEditing");
        C558950Lw5.LIZ(getTag(), o2(), creativeModel);
        creativeModel.aiLivePhotoModel.LIZIZ().bindMixMaterial = mixEditingMaterialModel;
        super.Zq1(nLETrackSlot, creativeModel);
    }

    @Override // X.C0MCB, X.InterfaceC558740Lvk
    public void ec2(VideoPublishEditModel videoPublishEditModel, NLETrackSlot nLETrackSlot) {
        Zq1(nLETrackSlot, videoPublishEditModel.creativeModel);
        C0MCR c0mcr = C0MCR.LIZ;
        NLEEditor nLEEditorO2 = o2();
        c0mcr.getClass();
        C0MCR.LJIIIIZZ(nLEEditorO2, videoPublishEditModel);
        C559010LwB.LIZIZ(getTag(), "updateCancel");
        InterfaceC1419190n2D interfaceC1419190n2D = (InterfaceC1419190n2D) ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).MY1(InterfaceC1419190n2D.class);
        if (interfaceC1419190n2D != null) {
            interfaceC1419190n2D.UZ1();
        }
    }

    public final void T2(C0MCA c0mca, CreativeModel creativeModel, boolean z) {
        NLETrack mainTrack = o2().getModel().getMainTrack();
        if (mainTrack == null) {
            return;
        }
        C346810Dih.LIZ(mainTrack.getMeasuredEndTime(), o2());
        C0MCR c0mcr = C0MCR.LIZ;
        NLEEditor nLEEditorO2 = o2();
        CreativeModel creativeModel2 = getEditModel().creativeModel;
        c0mcr.getClass();
        C0MCR.LJIIJ(nLEEditorO2, creativeModel2);
        NLEEditor nLEEditorO22 = o2();
        VideoPublishEditModel editModel = getEditModel();
        NLETrack mainTrack2 = nLEEditorO22.getModel().getMainTrack();
        if (mainTrack2 != null) {
            editModel.setVideoLength(((int) mainTrack2.getMaxEnd()) / LSPassThroughRecordSizeConfig.DEFAULT);
        }
        C385050F7v.LJ(o2());
        if (c0mca != null) {
            c0mca.onSuccess();
        }
        Qy(true, null, getTag(), z);
        C558950Lw5.LIZ(getTag(), o2(), creativeModel);
    }

    @Override // X.C0MCB, X.InterfaceC558740Lvk
    public void k72(VideoPublishEditModel videoPublishEditModel, C0LSZ c0lsz, C0MCA c0mca) {
        UsageStatus usageStatus;
        boolean z;
        boolean z2;
        boolean z3;
        EnumC1998707sH enumC1998707sH;
        AILivePhotoModel aILivePhotoModel = videoPublishEditModel.getAILivePhotoModel();
        ProgressModel progressModel = aILivePhotoModel.lastStatus;
        if (progressModel != null) {
            usageStatus = progressModel.status;
        } else {
            usageStatus = null;
        }
        boolean z4 = false;
        if (usageStatus != UsageStatus.NOT_APPLY) {
            z = true;
        } else {
            z = false;
        }
        if (aILivePhotoModel.LJ() == UsageStatus.SUCCESS_CANCEL) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (aILivePhotoModel.lastStatus == null && !z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        videoPublishEditModel.creativeModel.aiLivePhotoModel.lastFailProgressModel = null;
        AILivePhotoModel aILivePhotoModel2 = videoPublishEditModel.getAILivePhotoModel();
        aILivePhotoModel2.progressModel = C545800Las.LIZ(aILivePhotoModel2, UsageStatus.SUCCESS_APPLY, c0lsz);
        if (z && videoPublishEditModel.getAILivePhotoModel().LIZIZ().bindMixMaterial == null) {
            H2(aILivePhotoModel);
        }
        videoPublishEditModel.getAILivePhotoModel().lastStatus = null;
        String tag = getTag();
        if (W2() != null && videoPublishEditModel.getAILivePhotoModel().LIZIZ().bindMixMaterial != null) {
            z4 = true;
        }
        ew1(tag, z4);
        C558950Lw5.LIZ(getTag(), o2(), videoPublishEditModel.creativeModel);
        InterfaceC564930MDr interfaceC564930MDrW2 = W2();
        if (interfaceC564930MDrW2 != null) {
            boolean z5 = !z2;
            if (z2) {
                enumC1998707sH = EnumC1998707sH.CLEAR_FOR_AI_ALIVE_CANCEL_OR_REAPPLY;
            } else {
                enumC1998707sH = EnumC1998707sH.CLEAR_FOR_AI_ALIVE;
            }
            interfaceC564930MDrW2.KM0(z5, enumC1998707sH);
        }
        C558950Lw5.LIZ(getTag(), o2(), videoPublishEditModel.creativeModel);
        i3(c0lsz, videoPublishEditModel.creativeModel, true, c0mca);
        if (z3) {
            C559010LwB.LIZIZ(getTag(), "isFirstApply");
            return;
        }
        if (z2) {
            C559010LwB.LIZIZ(getTag(), "isReApply");
            return;
        }
        if (z) {
            C559010LwB.LIZIZ(getTag(), "isRegenerate");
            return;
        }
        String tag2 = getTag();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unexpected scene, curState=");
        sbLIZ.append(videoPublishEditModel.getAILivePhotoModel().LIZIZ());
        sbLIZ.append(", lastSate=");
        sbLIZ.append(videoPublishEditModel.getAILivePhotoModel().lastStatus);
        C559010LwB.LIZ(tag2, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void q3(C0MCA c0mca, CreativeModel creativeModel, boolean z) {
        T2(c0mca, creativeModel, z);
    }

    private final boolean i3(C0LSZ c0lsz, CreativeModel creativeModel, boolean z, C0MCA c0mca) {
        NLETrackSlot nLETrackSlotLIZIZ = X1().LIZIZ(creativeModel, o2(), c0lsz);
        if (nLETrackSlotLIZIZ == null) {
            if (c0mca != null) {
                c0mca.onFail();
            }
            Qy(false, "updateNLEAndEditModelIfFinish fail, generateSlot is null", getTag(), false);
            return false;
        }
        NLETrackSlot nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(o2().getModel().getMainTrack().getSortedSlots());
        if (nLETrackSlot == null) {
            if (c0mca != null) {
                c0mca.onFail();
            }
            Qy(false, "updateNLEAndEditModelIfFinish fail, originSlot is null", getTag(), false);
            return false;
        }
        C0MCR.LIZ.getClass();
        C0MCR.LIZLLL(nLETrackSlot, nLETrackSlotLIZIZ);
        C0MCR.LIZ(creativeModel.aiLivePhotoModel.transitionModel, o2().getModel(), nLETrackSlot);
        C0MCR.LJI(o2(), nLETrackSlotLIZIZ, c3());
        C0MCR.LJII(o2(), getEditModel());
        String tag = getTag();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("video repeatTime=");
        sbLIZ.append(c3());
        sbLIZ.append(", mainTrack=");
        sbLIZ.append(o2().getModel().getMainTrack().getSlots().size());
        C559010LwB.LIZIZ(tag, C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1419190n2D interfaceC1419190n2D = (InterfaceC1419190n2D) ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).MY1(InterfaceC1419190n2D.class);
        if (interfaceC1419190n2D != null) {
            interfaceC1419190n2D.UZ1();
        }
        C558950Lw5.LIZ(getTag(), o2(), creativeModel);
        MixEditingMaterialModel mixEditingMaterialModel = creativeModel.aiLivePhotoModel.LIZIZ().bindMixMaterial;
        if (mixEditingMaterialModel == null) {
            q3(c0mca, creativeModel, false);
            C559010LwB.LIZ(getTag(), "materialModel null");
            return true;
        }
        w2(creativeModel, mixEditingMaterialModel, z, c0mca);
        return true;
    }

    public final void w2(final CreativeModel creativeModel, MixEditingMaterialModel mixEditingMaterialModel, boolean z, final C0MCA c0mca) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C554440Loo.LIZ.getClass();
        C543670LTx c543670LTx = new C543670LTx();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ai_alive_mix_editing_start, ");
        sbLIZ.append(c543670LTx.LJ());
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZIZ("ai_alive_mix_editing_start", c543670LTx.LJ());
        if (W2() == null) {
            q3(c0mca, creativeModel, false);
            C554440Loo.LIZ(jCurrentTimeMillis, "mixEditingMaterialAiAliveApi null", false);
            C559010LwB.LIZ(getTag(), "mixEditingMaterialAiAliveApi null");
            return;
        }
        String tag = getTag();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("applyMaterial start, materialModel=");
        sbLIZ2.append(mixEditingMaterialModel);
        C559010LwB.LIZIZ(tag, C2188811AlT.LIZIZ(sbLIZ2));
        InterfaceC564930MDr interfaceC564930MDrW2 = W2();
        if (interfaceC564930MDrW2 != null) {
            interfaceC564930MDrW2.qV0(mixEditingMaterialModel, new InterfaceC1414490mud() { // from class: X.0MCG
                @Override // X.InterfaceC1414490mud
                public final void onSuccess() {
                    C01TT.LIZLLL(new C0MCF(this.LIZ, jCurrentTimeMillis, creativeModel, c0mca));
                }

                @Override // X.InterfaceC1414490mud
                public final void LIZ(long j) {
                    C01TT.LIZLLL(new C0MCE(j, this.LIZ, jCurrentTimeMillis, creativeModel, c0mca));
                }

                @Override // X.InterfaceC1414490mud
                public final void LIZIZ(C1414510muf c1414510muf) {
                    C01TT.LIZLLL(new C0MCD(c1414510muf, this.LIZ, jCurrentTimeMillis, creativeModel, c0mca));
                }
            });
        }
    }
}
