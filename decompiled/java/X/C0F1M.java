package X;

import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLERenderProxySegment;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.PairIntInt;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.api.ITemplateService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.vesdk.VEUtils;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0F1M, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F1M extends AbstractC2255721DQs<InterfaceC559090LwJ> implements InterfaceC559090LwJ, C0F1U, InterfaceC379610EuV {
    public static final C0F1R LLILZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public static final int LLILZLL;
    public final C1DRG LL;
    public final InterfaceC559090LwJ LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0F1R] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0F1M.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZ = new Object() { // from class: X.0F1R
        };
        LLILZLL = 8;
    }

    public final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLILLL.getValue(this, LLILZIL[0]);
    }

    public InterfaceC559090LwJ W1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C0F1M(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final Pair<Float, Float> X1(NLETrackSlot nLETrackSlot) {
        NLESegment mainSegment;
        NLEResourceAV aVFile;
        NLEResourceAV aVFile2;
        NLETrackSlot renderProxy = nLETrackSlot.getRenderProxy();
        if (renderProxy != null) {
            mainSegment = renderProxy.getMainSegment();
        } else {
            mainSegment = null;
        }
        NLERenderProxySegment nLERenderProxySegmentDynamicCast = NLERenderProxySegment.dynamicCast(mainSegment);
        if (nLERenderProxySegmentDynamicCast != null && (aVFile2 = nLERenderProxySegmentDynamicCast.getAVFile()) != null) {
            long width = aVFile2.getWidth();
            if (nLERenderProxySegmentDynamicCast.getAVFile() != null) {
                return new Pair<>(Float.valueOf(width), Float.valueOf(r0.getHeight()));
            }
        }
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentVideoDynamicCast == null || (aVFile = nLESegmentVideoDynamicCast.getAVFile()) == null) {
            return null;
        }
        long width2 = aVFile.getWidth();
        if (nLESegmentVideoDynamicCast.getAVFile() == null) {
            return null;
        }
        return new Pair<>(Float.valueOf(width2), Float.valueOf(r0.getHeight()));
    }

    @Override // X.InterfaceC559090LwJ
    public Object Dg0(C0FQS c0fqs, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        PairIntInt canvasSize;
        C348100Dkm c348100DkmLIZIZ;
        INLEMediaSession iNLEMediaSession;
        INLEPlayer playerApi;
        C348100Dkm c348100DkmLIZIZ2;
        INLEMediaSession iNLEMediaSession2;
        INLEMediaRuntime mediaRuntimeApi;
        int iLIZJ;
        int iLIZIZ;
        C348100Dkm c348100DkmLIZIZ3;
        NLEEditor nLEEditor;
        C348100Dkm c348100DkmLIZIZ4;
        NLEEditor nLEEditor2;
        C348100Dkm c348100DkmLIZIZ5;
        INLEMediaSession iNLEMediaSession3;
        INLEMediaRuntime mediaRuntimeApi2;
        C348100Dkm c348100DkmLIZIZ6;
        INLEMediaSession iNLEMediaSession4;
        INLEMediaRuntime mediaRuntimeApi3;
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        VEEditorAutoStartStopArbiter value = JY0().b10().getValue();
        if (value != null) {
            value.LIZJ(true, true, true);
        }
        VEEditorAutoStartStopArbiter value2 = JY0().b10().getValue();
        if (value2 != null) {
            value2.LIZIZ();
        }
        InterfaceC1452170ntP value3 = JY0().g().getValue();
        if (value3 != null && (c348100DkmLIZIZ6 = C352130DrH.LIZIZ(value3)) != null && (iNLEMediaSession4 = c348100DkmLIZIZ6.LIZIZ) != null && (mediaRuntimeApi3 = iNLEMediaSession4.getMediaRuntimeApi()) != null) {
            mediaRuntimeApi3.setPreviewOffScreen(true);
        }
        InterfaceC1452170ntP value4 = JY0().g().getValue();
        C0FQT c0fqtLJFF = null;
        if (value4 != null && (c348100DkmLIZIZ5 = C352130DrH.LIZIZ(value4)) != null && (iNLEMediaSession3 = c348100DkmLIZIZ5.LIZIZ) != null && (mediaRuntimeApi2 = iNLEMediaSession3.getMediaRuntimeApi()) != null) {
            canvasSize = mediaRuntimeApi2.getCanvasSize();
        } else {
            canvasSize = null;
        }
        InterfaceC1452170ntP value5 = JY0().g().getValue();
        if (value5 != null && (c348100DkmLIZIZ4 = C352130DrH.LIZIZ(value5)) != null && (nLEEditor2 = c348100DkmLIZIZ4.LIZ) != null) {
            nLEEditor2.setModel(c0fqs.LJIIJJI);
        }
        InterfaceC1452170ntP value6 = JY0().g().getValue();
        if (value6 != null && (c348100DkmLIZIZ3 = C352130DrH.LIZIZ(value6)) != null && (nLEEditor = c348100DkmLIZIZ3.LIZ) != null) {
            Boolean.valueOf(nLEEditor.commit());
        }
        InterfaceC1452170ntP value7 = JY0().g().getValue();
        if (value7 != null && (c348100DkmLIZIZ2 = C352130DrH.LIZIZ(value7)) != null && (iNLEMediaSession2 = c348100DkmLIZIZ2.LIZIZ) != null && (mediaRuntimeApi = iNLEMediaSession2.getMediaRuntimeApi()) != null) {
            if (canvasSize != null) {
                iLIZJ = canvasSize.getFirst();
                iLIZIZ = canvasSize.getSecond();
            } else {
                iLIZJ = C0FUC.LIZJ();
                iLIZIZ = C0FUC.LIZIZ();
            }
            mediaRuntimeApi.setCanvasSize(iLIZJ, iLIZIZ);
        }
        InterfaceC1452170ntP value8 = JY0().g().getValue();
        if (value8 != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value8)) != null && (iNLEMediaSession = c348100DkmLIZIZ.LIZIZ) != null && (playerApi = iNLEMediaSession.getPlayerApi()) != null) {
            C2286608xc.LJ(playerApi.prepare());
        }
        ITemplateService iTemplateService = (ITemplateService) PluggableExtentionKt.pluggableSpi$default(ITemplateService.class, false, false, false, 14, null);
        if (iTemplateService != null) {
            c0fqtLJFF = iTemplateService.LJFF(c0fqs, new AwS584S0100000_5(c2252611DEt, 796), new AwS584S0100000_5(c2252611DEt, 797), AFwS234S0000000_5.get$arr$(390));
        }
        c2252611DEt.LJJII(new AwS584S0100000_5(c0fqtLJFF, 795));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    @Override // X.InterfaceC559090LwJ
    public void Nv2(NLEModel nLEModel, C0FQS c0fqs) {
        NLETrackSlot nLETrackSlotLJL;
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (NLETrackType.VIDEO == nLETrack.getTrackType()) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
        }
        ArrayList<NLETrackSlot> arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((NLETrackSlot) obj).getAIMatting() != null) {
                arrayList3.add(obj);
            }
        }
        for (NLETrackSlot nLETrackSlot : arrayList3) {
            NLETemplateModel nLETemplateModel = c0fqs.LJIIJ;
            if (nLETemplateModel != null && (nLETrackSlotLJL = C351220Dpo.LJL(nLETemplateModel, nLETrackSlot.getUUID())) != null) {
                nLETrackSlot.setAIMatting(nLETrackSlotLJL.getAIMatting());
            }
        }
    }

    @Override // X.InterfaceC559090LwJ
    public NLETrackSlot I20(NLETrackSlot nLETrackSlot, VEUtils.VEVideoFileInfo vEVideoFileInfo, String str) {
        NLENode nLENodeDeepClone;
        NLEResourceAV aVFile;
        NLETrackSlot nLETrackSlot2 = new NLETrackSlot();
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        NLERenderProxySegment nLERenderProxySegment = new NLERenderProxySegment();
        if (nLESegmentVideoDynamicCast != null && (aVFile = nLESegmentVideoDynamicCast.getAVFile()) != null) {
            nLENodeDeepClone = aVFile.deepClone();
        } else {
            nLENodeDeepClone = null;
        }
        NLEResourceAV nLEResourceAVDynamicCast = NLEResourceAV.dynamicCast(nLENodeDeepClone);
        if (nLEResourceAVDynamicCast != null) {
            nLERenderProxySegment.setAVFile(nLEResourceAVDynamicCast);
        }
        NLEResourceAV aVFile2 = nLERenderProxySegment.getAVFile();
        if (aVFile2 != null) {
            aVFile2.setResourceFile(str);
        }
        NLEResourceAV aVFile3 = nLERenderProxySegment.getAVFile();
        if (aVFile3 != null) {
            aVFile3.setWidth(vEVideoFileInfo.width);
        }
        NLEResourceAV aVFile4 = nLERenderProxySegment.getAVFile();
        if (aVFile4 != null) {
            aVFile4.setHeight(vEVideoFileInfo.height);
        }
        nLETrackSlot2.setMainSegment(nLERenderProxySegment);
        nLETrackSlot2.setExtra("ep_replaced_i2i_magic_by_render_proxy", "true");
        nLETrackSlot2.setExtra("is_from_ep_magic", "true");
        nLETrackSlot.setExtra("ep_replaced_i2i_magic_by_render_proxy", "true");
        String extra = nLETrackSlot.getExtra("ep_magic_resource_id");
        if (extra != null && extra.length() != 0) {
            nLETrackSlot2.setExtra("ep_magic_resource_id", extra);
        }
        return nLETrackSlot2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e9  */
    @Override // X.InterfaceC559090LwJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object KM1(X.C0F1S r13, com.bytedance.ies.nle.editor_jni.NLETrackSlot r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0F1M.KM1(X.0F1S, com.bytedance.ies.nle.editor_jni.NLETrackSlot, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0152  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00f4 -> B:12:0x0036). Please report as a decompilation issue!!! */
    @Override // X.InterfaceC559090LwJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Vk0(com.bytedance.ies.nle.editor_jni.NLEModel r14, X.C0FQS r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0F1M.Vk0(com.bytedance.ies.nle.editor_jni.NLEModel, X.0FQS, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC559090LwJ
    public NLEModel qq2(NLEModel nLEModel, boolean z, C0FQS c0fqs) {
        VecNLETrackSlotSPtr slots;
        NLENode nLENode;
        NLEModel nLEModel2 = new NLEModel();
        NLETrack nLETrack = null;
        if (!z) {
            VecNLETrackSPtr tracks = nLEModel.getTracks();
            ArrayList arrayList = new ArrayList();
            Iterator<NLETrack> it2 = tracks.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(it2.next().getSlots(), arrayList);
            }
            ArrayList<NLETrackSlot> arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                NLETrackSlot nLETrackSlot = (NLETrackSlot) obj;
                if (NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment()) != null && (C351220Dpo.LJLLL(nLETrackSlot) == NLEResType.IMAGE || C351220Dpo.LJLLL(nLETrackSlot) == NLEResType.VIDEO)) {
                    if (!nLETrackSlot.getFeatureList().contains("UGC_ASYNC_I2V")) {
                        C354260Dui.LIZ.getClass();
                        if (C354260Dui.LJFF(nLETrackSlot) != null) {
                            arrayList2.add(obj);
                        }
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            for (NLETrackSlot nLETrackSlot2 : arrayList2) {
                C354260Dui.LIZ.getClass();
                NLEVideoEffect nLEVideoEffectLJFF = C354260Dui.LJFF(nLETrackSlot2);
                if (nLEVideoEffectLJFF != null) {
                    ((ArrayList) c0fqs.LJIILLIIL).add(nLETrackSlot2.getExtra("ep_magic_resource_id"));
                    nLETrackSlot2.removeVideoEffect(nLEVideoEffectLJFF);
                    c0fqs.LJIL.add(new C381340ExI(nLETrackSlot2, nLEVideoEffectLJFF));
                }
            }
        }
        Iterator<NLETrack> it3 = nLEModel.getTracks().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            NLETrack next = it3.next();
            if (next.getMainTrack()) {
                nLETrack = next;
                break;
            }
        }
        NLETrack nLETrack2 = nLETrack;
        if (nLETrack2 != null && (slots = nLETrack2.getSlots()) != null && (nLENode = (NLENode) C13LP.LJJJLL(slots)) != null) {
            NLETrack nLETrack3 = new NLETrack();
            nLETrack3.setLayer(0);
            nLETrack3.setExtra("track_type", "video");
            nLETrack3.setMainTrack(true);
            nLETrack3.setExtraTrackType(NLETrackType.VIDEO);
            nLETrack3.setExtra("track_layer", String.valueOf(nLETrack3.getLayer()));
            NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLENode.deepClone(true));
            if (nLETrackSlotDynamicCast != null) {
                nLETrack3.addSlot(nLETrackSlotDynamicCast);
            }
            nLEModel2.addTrack(nLETrack3);
        }
        return nLEModel2;
    }
}
