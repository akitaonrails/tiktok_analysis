package X;

import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.interfaces.ITemplateApplyService;
import com.ss.android.ugc.aweme.interfaces.ITemplateResourceService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0Mf1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C573850Mf1 extends AbstractC2255721DQs<C0MIZ> implements InterfaceC379610EuV, C0MIZ {
    public static final C573900Mf6 LLJJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final int LLJJIJI;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final C573850Mf1 LLILLL = this;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1461350o8D.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC366390EYb.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC366660EZc.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455850nzL.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1413540mt6.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1454960nxu.class, null);
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(282));
    public DialogC1389620mGW LLJILJILJ = new DialogC1389620mGW(C1664590tQ1.LJIIIZ(this));
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(281));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 612));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C573850Mf1.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C573850Mf1.class, "editStickApi", "getEditStickApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0), new C2217381BqS(C573850Mf1.class, "editControlApi", "getEditControlApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/editcontrol/EditControlApi;", 0), new C2217381BqS(C573850Mf1.class, "editUgcTemplateApi", "getEditUgcTemplateApi()Lcom/ss/android/ugc/gamora/ugctemplate/EditUgcTemplateApi;", 0), new C2217381BqS(C573850Mf1.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0), new C2217381BqS(C573850Mf1.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0), new C2217381BqS(C573850Mf1.class, "lighteningMusicApi", "getLighteningMusicApi()Lcom/ss/android/ugc/gamora/editor/lightening/music/LighteningMusicApi;", 0), new C2217381BqS(C573850Mf1.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0)};
        LLJJI = new C573900Mf6();
        LLJJIJI = 8;
        C1446930nkx.LIZIZ("tiktok_ai_self", new C573890Mf5());
        C1446930nkx.LJI("tiktok_ai_self", AFwS239S0000000_8.get$arr$(196));
    }

    private final ITemplateResourceService B3() {
        return (ITemplateResourceService) this.LLJILJIL.getValue();
    }

    private final ITemplateApplyService v3() {
        return (ITemplateApplyService) this.LLJILLL.getValue();
    }

    public final InterfaceC1455850nzL H2() {
        return (InterfaceC1455850nzL) this.LLIZLLLIL.getValue(this, LLJJIII[4]);
    }

    public final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLJ.getValue(this, LLJJIII[5]);
    }

    public final InterfaceC366390EYb T2() {
        return (InterfaceC366390EYb) this.LLILZLL.getValue(this, LLJJIII[2]);
    }

    public final InterfaceC1461350o8D W2() {
        return (InterfaceC1461350o8D) this.LLILZIL.getValue(this, LLJJIII[1]);
    }

    public final InterfaceC366660EZc c3() {
        return (InterfaceC366660EZc) this.LLIZ.getValue(this, LLJJIII[3]);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILZ.getValue(this, LLJJIII[0]);
    }

    public final InterfaceC1413540mt6 i3() {
        return (InterfaceC1413540mt6) this.LLJI.getValue(this, LLJJIII[6]);
    }

    public final InterfaceC1454960nxu m3() {
        return (InterfaceC1454960nxu) this.LLJIJIL.getValue(this, LLJJIII[7]);
    }

    public final C0EWD q3() {
        return (C0EWD) this.LLJJ.getValue();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (C573910Mf7.LIZ(getEditModel())) {
            return;
        }
        X1(getEditModel().creativeModel.aiSelfModel.templateIds);
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C573850Mf1 w2() {
        return this.LLILLL;
    }

    private final C573920Mf8 G2(String str) {
        BinderC532620Kui binderC532620Kui = new BinderC532620Kui("Ashwin", str, 1);
        EnumC539100LCi enumC539100LCiLIZ = C0LBC.LIZ(1);
        C1429050nI7.LIZ.getClass();
        return new C573920Mf8(binderC532620Kui, enumC539100LCiLIZ, false, 2, C1429050nI7.LIZ());
    }

    private final void X1(List<String> list) {
        ArrayList arrayList;
        String str;
        NLEModel nLEModelLIZ;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots;
        String resourceFile;
        NLESegment mainSegment;
        NLEResourceNode resource;
        NLEResType resourceType;
        NLEResourceNode resource2;
        InterfaceC1452170ntP value = JY0().g().getValue();
        if (value != null && (nLEModelLIZ = C352130DrH.LIZ(value)) != null && (mainTrack = nLEModelLIZ.getMainTrack()) != null && (slots = mainTrack.getSlots()) != null) {
            ArrayList<NLETrackSlot> arrayList2 = new ArrayList();
            for (NLETrackSlot nLETrackSlot : slots) {
                NLESegment mainSegment2 = nLETrackSlot.getMainSegment();
                if (mainSegment2 != null && (resource2 = mainSegment2.getResource()) != null) {
                    resourceType = resource2.getResourceType();
                } else {
                    resourceType = null;
                }
                if (resourceType == NLEResType.IMAGE) {
                    arrayList2.add(nLETrackSlot);
                }
            }
            arrayList = new ArrayList();
            for (NLETrackSlot nLETrackSlot2 : arrayList2) {
                if (nLETrackSlot2 == null || (mainSegment = nLETrackSlot2.getMainSegment()) == null || (resource = mainSegment.getResource()) == null || (resourceFile = resource.getResourceFile()) == null) {
                    resourceFile = "";
                }
                arrayList.add(new C0E4S(resourceFile, NLEResType.IMAGE, 0L, 1.0f, 0L, 0L, "", null, 128));
            }
        } else {
            arrayList = null;
        }
        if (list != null && (str = (String) C13LP.LJJJLL(list)) != null) {
            W1(str, arrayList);
        }
    }

    @Override // X.C0MIZ
    public void EC2(List<String> list) {
        String str;
        if (list != null && (str = (String) C13LP.LJJJLL(list)) != null) {
            o2(str, null);
        }
    }

    public C573850Mf1(C1DRG c1drg, C19A3 c19a3) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
    }

    private final void W1(String str, List<C0E4S> list) {
        if (list != null) {
            C786410Ut5.J4(this.LLJILJILJ);
            o2(str, Z1(str, list));
        }
    }

    private final C0L7K Z1(final String str, final List<C0E4S> list) {
        return new C0L7K() { // from class: X.0Mf2
            @Override // X.C0L7K
            public final void LJ(String str2, String str3, boolean z) {
            }

            @Override // X.C0L7K
            public final void LJFF(C0L7F c0l7f, boolean z) {
            }

            @Override // X.C0L7K
            public final void onPreSuccess(NLETemplateModel nLETemplateModel) {
            }

            @Override // X.C0L7K
            public final void LIZLLL(C0L7B c0l7b, boolean z) {
                AVMusic aVMusic;
                NLETemplateModel nLETemplateModel;
                InterfaceC1452170ntP value;
                NLEModel nLEModelLIZ;
                VecNLETrackSPtr tracks;
                this.LIZ.LLJILJILJ.cancel();
                if (C566070MIb.LIZ() && C1428470nHB.LJJJJJL(this.LIZ.getEditModel().creativeModel) && (value = this.LIZ.JY0().g().getValue()) != null && (nLEModelLIZ = C352130DrH.LIZ(value)) != null && (tracks = nLEModelLIZ.getTracks()) != null) {
                    C573850Mf1 c573850Mf1 = this.LIZ;
                    for (NLETrack nLETrack : tracks) {
                        if (nLETrack.getTrackType() == NLETrackType.AUDIO && !C351220Dpo.LLLII(nLETrack)) {
                            nLEModelLIZ.removeTrack(nLETrack);
                            InterfaceC1454960nxu interfaceC1454960nxuM3 = c573850Mf1.m3();
                            if (interfaceC1454960nxuM3 != null) {
                                interfaceC1454960nxuM3.lr(true);
                            }
                        }
                    }
                }
                if (c0l7b != null) {
                    aVMusic = c0l7b.LJIIIIZZ;
                } else {
                    aVMusic = null;
                }
                C1452640nuA.LJII(aVMusic, false, this.LIZ.getEditModel().creativeModel.musicBuzModel);
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.LIZ);
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C573880Mf4(this.LIZ, c0l7b, null), 2);
                if (c0l7b != null && (nLETemplateModel = c0l7b.LIZ) != null) {
                    this.LIZ.E3(str, list, nLETemplateModel);
                }
            }

            @Override // X.C0L7K
            public final void LIZJ(int i, String str2, boolean z) {
                this.LIZ.LLJILJILJ.cancel();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("errCode is ");
                sbLIZ.append(i);
                sbLIZ.append(" with errorMsg ");
                sbLIZ.append(str2);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        };
    }

    private final void o2(String str, C0L7K c0l7k) {
        boolean z;
        C573920Mf8 c573920Mf8G2 = G2(str);
        ITemplateResourceService iTemplateResourceServiceB3 = B3();
        Context sceneContext = this.LLILLJJLI.getSceneContext();
        EnumC1412640mre enumC1412640mre = EnumC1412640mre.UGC_TEMPLATE;
        Boolean bool = Boolean.FALSE;
        C1418100n0S c1418100n0S = new C1418100n0S("", "", null);
        if (C566070MIb.LIZ() && C1428470nHB.LJJJJJL(getEditModel().creativeModel)) {
            z = true;
        } else {
            z = false;
        }
        iTemplateResourceServiceB3.LIZLLL(sceneContext, str, enumC1412640mre, null, null, null, bool, c573920Mf8G2, null, c1418100n0S, z, c0l7k);
    }

    @Override // X.C0MIZ
    public void za2(List<String> list, List<String> list2) {
        String str;
        if (list2 != null && (str = (String) C13LP.LJJJLL(list2)) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C0E4S(it2.next(), NLEResType.IMAGE, 0L, 1.0f, 0L, 0L, "", null, 128));
            }
            W1(str, arrayList);
        }
    }

    public final void E3(String str, List<C0E4S> list, NLETemplateModel nLETemplateModel) {
        NLEResourceNode resource;
        NLEResType resourceType;
        if (C294050Bfn.LIZ()) {
            VecNLETrackSPtr tracks = nLETemplateModel.getTracks();
            boolean z = false;
            if (tracks != null) {
                ArrayList arrayList = new ArrayList();
                for (NLETrack nLETrack : tracks) {
                    if (nLETrack.getTrackType() == NLETrackType.VIDEO) {
                        arrayList.add(nLETrack);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    NLESegment mainSegment = ((NLETrackSlot) obj).getMainSegment();
                    if (mainSegment != null) {
                        resource = mainSegment.getResource();
                    } else {
                        resource = null;
                    }
                    NLEResourceAV nLEResourceAVDynamicCast = NLEResourceAV.dynamicCast((NLENode) resource);
                    if (nLEResourceAVDynamicCast != null) {
                        resourceType = nLEResourceAVDynamicCast.getResourceType();
                    } else {
                        resourceType = null;
                    }
                    if (resourceType == NLEResType.VIDEO) {
                        arrayList3.add(obj);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    Iterator it3 = arrayList3.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) ((NLETrackSlot) it3.next()).getMainSegment());
                        if (nLESegmentVideoDynamicCast != null && nLESegmentVideoDynamicCast.getVolume() > 0.0f) {
                            z = true;
                            break;
                        }
                    }
                }
            }
            C0EYQ.LJII(nLETemplateModel, EnumC1412640mre.PUGC_TEMPLATE.getValue(), str, z);
        } else {
            C0EYQ.LJI(nLETemplateModel, EnumC1412640mre.PUGC_TEMPLATE.getValue(), str);
        }
        v3().LIZ(nLETemplateModel, list, C1412390mrF.LJIIJ, EnumC1412640mre.PUGC_TEMPLATE, this.LLILLJJLI.getSceneContext(), C0E4V.NONE, false, false, false);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C573870Mf3(this, nLETemplateModel, null), 2);
    }
}
