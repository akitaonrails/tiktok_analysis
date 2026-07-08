package X;

import Y.ARunnableS108S0100000_8;
import android.os.Looper;
import androidx.lifecycle.LiveData;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLERenderProxySegment;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.api.ITemplateService;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEEditor;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import ge.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS116S0101000_8;
import kotlin.jvm.internal.AwS23S0001000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0LwC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C559020LwC extends i<InterfaceC1417440mzO, C559150LwP, C559140LwO, C1170504hz> implements InterfaceC1417440mzO, InterfaceC379610EuV {
    public static final C559170LwR LLJLLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public static final int LLJZIJLIL;
    public final C1DRG LLJILJILJ;
    public final InterfaceC1841670y1d LLJILLL;
    public final InterfaceC497601wk LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public C09AE LLJJJIL;
    public final C559160LwQ LLJJJJ;
    public boolean LLJJJJJIL;
    public final Map<String, C559060LwG> LLJJJJLIIL;
    public final InterfaceC332260D0u<Map<String, C559050LwF>> LLJJL;
    public final C05YD<Map<String, C559050LwF>> LLJJLIIIJLLLLLLLZ;
    public final Map<String, C09AE> LLJL;
    public final Map<String, C2191608iI> LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final Function0<C559140LwO> LLJLL;
    public final Function0<C1170504hz> LLJLLIL;

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0LwR] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C559020LwC.class, "magicProcessApi", "getMagicProcessApi()Lcom/ss/android/ugc/gamora/ugctemplate/TemplateMagicProcessApi;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C559020LwC.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0), new C2217381BqS(C559020LwC.class, "editAutoCutApi", "getEditAutoCutApi()Lcom/ss/android/ugc/aweme/shortvideo/autocut/EditAutoCutApi;", 0), new C2217381BqS(C559020LwC.class, "veAutoPlayInterceptorApi", "getVeAutoPlayInterceptorApi()Lcom/ss/android/ugc/gamora/editor/VEAutoPlayInterceptorApi;", 0), new C2217381BqS(C559020LwC.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C2217381BqS(C559020LwC.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0)};
        LLJLLL = new Object() { // from class: X.0LwR
        };
        LLJZIJLIL = 8;
    }

    private final void W6() {
        InterfaceC332260D0u<Map<String, C559050LwF>> interfaceC332260D0u = this.LLJJL;
        Map<String, C559060LwG> map = this.LLJJJJLIIL;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
        Iterator<T> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            linkedHashMap.put(entry.getKey(), ((C559060LwG) entry.getValue()).LIZLLL);
        }
        interfaceC332260D0u.setValue(linkedHashMap);
    }

    private final InterfaceC1417050myl d5() {
        return (InterfaceC1417050myl) this.LLJJIJI.getValue(this, LLJZ[2]);
    }

    private final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLJJIJIL.getValue(this, LLJZ[4]);
    }

    private final ITemplateService n5() {
        return (ITemplateService) this.LLJLILLLLZIIL.getValue();
    }

    private final InterfaceC372160EiU t5() {
        return (InterfaceC372160EiU) this.LLJJIJIIJIL.getValue(this, LLJZ[3]);
    }

    @Override // X.InterfaceC1417440mzO
    public void I22() {
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ;
        C09AE c09ae = this.LLJJJIL;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        this.LLJJJIL = null;
        for (C559060LwG c559060LwG : this.LLJJJJLIIL.values()) {
            if (c559060LwG.LIZLLL.LIZLLL && (iCreationAsyncTaskManagerLIZ = C09BV.LIZ()) != null) {
                iCreationAsyncTaskManagerLIZ.LJJIL(c559060LwG.LIZJ);
            }
        }
        this.LLJJJJLIIL.clear();
        Iterator<T> it2 = this.LLJL.values().iterator();
        while (it2.hasNext()) {
            ((C09AE) it2.next()).LIZIZ(null);
        }
        this.LLJL.clear();
        Iterator<T> it3 = this.LLJLIL.values().iterator();
        while (it3.hasNext()) {
            ((C2191608iI) it3.next()).LIZIZ();
        }
        this.LLJLIL.clear();
        hide();
        W6();
    }

    public final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLJJIII.getValue(this, LLJZ[1]);
    }

    public final void R5() {
        if (this.LLJJJJJIL) {
            return;
        }
        InterfaceC372160EiU interfaceC372160EiUT5 = t5();
        if (interfaceC372160EiUT5 != null) {
            interfaceC372160EiUT5.FS1(this.LLJJJJ);
        }
        this.LLJJJJJIL = true;
    }

    @Override // X.InterfaceC1417440mzO
    public boolean bF() {
        Collection<C559060LwG> collectionValues = this.LLJJJJLIIL.values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator<T> it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                C559050LwF c559050LwF = ((C559060LwG) it2.next()).LIZLLL;
                if (c559050LwF.LJ && c559050LwF.LIZJ == EnumC558870Lvx.RUNNING) {
                    return true;
                }
            }
        }
        return false;
    }

    public final C19EG getActivity() {
        return (C19EG) this.LLJJJ.getValue(this, LLJZ[5]);
    }

    public final InterfaceC559090LwJ k5() {
        return (InterfaceC559090LwJ) this.LLJJI.getValue(this, LLJZ[0]);
    }

    @Override // X.InterfaceC1417440mzO
    public boolean ol0() {
        Collection<C559060LwG> collectionValues = this.LLJJJJLIIL.values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator<T> it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                C559050LwF c559050LwF = ((C559060LwG) it2.next()).LIZLLL;
                if (c559050LwF.LIZLLL && c559050LwF.LIZIZ == EnumC558870Lvx.RUNNING) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void pausePlay() {
        LiveData<VEEditorAutoStartStopArbiter> liveDataB10;
        VEEditorAutoStartStopArbiter value;
        InterfaceC1446740nke interfaceC1446740nkeJY0 = JY0();
        if (interfaceC1446740nkeJY0 == null || (liveDataB10 = interfaceC1446740nkeJY0.b10()) == null || (value = liveDataB10.getValue()) == null) {
            return;
        }
        value.LIZIZ();
    }

    @Override // X.InterfaceC1417440mzO
    public C559140LwO Et2() {
        return T2();
    }

    public final void S6() {
        if (isShowing() || !this.LLJJJJJIL) {
            return;
        }
        InterfaceC372160EiU interfaceC372160EiUT5 = t5();
        if (interfaceC372160EiUT5 != null) {
            interfaceC372160EiUT5.cg1(this.LLJJJJ);
        }
        this.LLJJJJJIL = false;
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        I22();
        this.LLJILLL.LIZIZ(null);
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        InterfaceC1446740nke interfaceC1446740nkeJY0;
        LiveData<InterfaceC1452170ntP> liveDataG;
        InterfaceC1452170ntP value;
        C348100Dkm c348100DkmLIZIZ;
        INLEMediaSession iNLEMediaSession;
        INLEPlayer playerApi;
        LiveData<InterfaceC1452170ntP> liveDataG2;
        InterfaceC1452170ntP value2;
        LiveData<InterfaceC1452170ntP> liveDataG3;
        InterfaceC1452170ntP value3;
        C348100Dkm c348100DkmLIZIZ2;
        INLEMediaSession iNLEMediaSession2;
        INLEMediaRuntime mediaRuntimeApi;
        C559050LwF c559050LwF;
        super.onResume();
        C559060LwG c559060LwG = this.LLJJJJLIIL.get(T2().LIZ);
        VEEditor.VEState state = null;
        if (((c559060LwG == null || (c559050LwF = c559060LwG.LIZLLL) == null) ? null : c559050LwF.LIZJ) == EnumC558870Lvx.RUNNING) {
            InterfaceC1446740nke interfaceC1446740nkeJY02 = JY0();
            if (interfaceC1446740nkeJY02 != null && (liveDataG3 = interfaceC1446740nkeJY02.g()) != null && (value3 = liveDataG3.getValue()) != null && (c348100DkmLIZIZ2 = C352130DrH.LIZIZ(value3)) != null && (iNLEMediaSession2 = c348100DkmLIZIZ2.LIZIZ) != null && (mediaRuntimeApi = iNLEMediaSession2.getMediaRuntimeApi()) != null) {
                mediaRuntimeApi.setPreviewOffScreen(false);
            }
            C786410Ut5.LJLIIL(10L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS108S0100000_8(this, 13));
            return;
        }
        InterfaceC1446740nke interfaceC1446740nkeJY03 = JY0();
        if (interfaceC1446740nkeJY03 != null && (liveDataG2 = interfaceC1446740nkeJY03.g()) != null && (value2 = liveDataG2.getValue()) != null) {
            state = value2.getState();
        }
        if (state != VEEditor.VEState.PAUSED || (interfaceC1446740nkeJY0 = JY0()) == null || (liveDataG = interfaceC1446740nkeJY0.g()) == null || (value = liveDataG.getValue()) == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) == null || (iNLEMediaSession = c348100DkmLIZIZ.LIZIZ) == null || (playerApi = iNLEMediaSession.getPlayerApi()) == null) {
            return;
        }
        playerApi.seekTime(playerApi.getCurrentPosition());
    }

    @Override // X.InterfaceC1417440mzO
    public C05YD<Map<String, C559050LwF>> HR0() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC1417440mzO
    public void LJIIL() {
        hide();
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C559140LwO> o2() {
        return this.LLJLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1170504hz> w2() {
        return this.LLJLLIL;
    }

    private final C0FQS K4(C559060LwG c559060LwG) {
        C0FQS c0fqs = new C0FQS();
        c0fqs.LJ = c559060LwG.LIZLLL.LIZ;
        c0fqs.LJIIJ = NLETemplateModel.createFromDraft(c559060LwG.LIZ);
        c0fqs.LJIIIIZZ = "autocut";
        c0fqs.LIZIZ = new C0F1S(c559060LwG.LIZJ);
        return c0fqs;
    }

    private final String M5(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preload-");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    private final void N6(String str) {
        String strM5 = M5(str);
        if (this.LLJLIL.get(strM5) != null) {
            return;
        }
        C2191608iI c2191608iI = new C2191608iI(3000L, this.LLJJ);
        this.LLJLIL.put(strM5, c2191608iI);
        c2191608iI.LIZJ();
        C23250099c.LIZLLL(this.LLJJ, null, null, new C558900Lw0(c2191608iI, this, str, null), 3);
    }

    private final C0FQS O4(C559060LwG c559060LwG) {
        String str;
        NLEEditor nLEEditor;
        INLEMediaSession iNLEMediaSession;
        LiveData<InterfaceC1452170ntP> liveDataG;
        InterfaceC1452170ntP value;
        C348100Dkm c348100DkmLIZIZ;
        INLEMediaSession iNLEMediaSession2;
        LiveData<InterfaceC1452170ntP> liveDataG2;
        InterfaceC1452170ntP value2;
        C348100Dkm c348100DkmLIZIZ2;
        LiveData<InterfaceC1452170ntP> liveDataG3;
        InterfaceC1452170ntP value3;
        C348100Dkm c348100DkmLIZIZ3;
        AutoCutThemeData autoCutThemeData = c559060LwG.LIZIZ;
        C0FQS c0fqs = new C0FQS();
        c0fqs.LJ = autoCutThemeData.templateId;
        c0fqs.LJII = Integer.valueOf(autoCutThemeData.templateType);
        c0fqs.LIZJ = getEditModel().mShootWay;
        c0fqs.LIZIZ = new C0F1S(c559060LwG.LIZJ);
        C1412390mrF c1412390mrFLIZ = C1412380mrE.LIZ(getEditModel());
        INLEPlayer playerApi = null;
        if (c1412390mrFLIZ != null) {
            str = c1412390mrFLIZ.LIZ;
        } else {
            str = null;
        }
        c0fqs.LJIIL = str;
        c0fqs.LJIIIIZZ = "autocut";
        C381410ExP c381410ExP = new C381410ExP();
        InterfaceC1446740nke interfaceC1446740nkeJY0 = JY0();
        if (interfaceC1446740nkeJY0 != null && (liveDataG3 = interfaceC1446740nkeJY0.g()) != null && (value3 = liveDataG3.getValue()) != null && (c348100DkmLIZIZ3 = C352130DrH.LIZIZ(value3)) != null) {
            nLEEditor = c348100DkmLIZIZ3.LIZ;
        } else {
            nLEEditor = null;
        }
        c381410ExP.LIZIZ = nLEEditor;
        InterfaceC1446740nke interfaceC1446740nkeJY02 = JY0();
        if (interfaceC1446740nkeJY02 != null && (liveDataG2 = interfaceC1446740nkeJY02.g()) != null && (value2 = liveDataG2.getValue()) != null && (c348100DkmLIZIZ2 = C352130DrH.LIZIZ(value2)) != null) {
            iNLEMediaSession = c348100DkmLIZIZ2.LIZIZ;
        } else {
            iNLEMediaSession = null;
        }
        c381410ExP.LIZ = iNLEMediaSession;
        InterfaceC1446740nke interfaceC1446740nkeJY03 = JY0();
        if (interfaceC1446740nkeJY03 != null && (liveDataG = interfaceC1446740nkeJY03.g()) != null && (value = liveDataG.getValue()) != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null && (iNLEMediaSession2 = c348100DkmLIZIZ.LIZIZ) != null) {
            playerApi = iNLEMediaSession2.getPlayerApi();
        }
        c381410ExP.LIZJ = playerApi;
        c0fqs.LJIJ = c381410ExP;
        return c0fqs;
    }

    private final void P4(String str) {
        C559060LwG c559060LwG = this.LLJJJJLIIL.get(str);
        if (c559060LwG == null) {
            return;
        }
        if (c559060LwG.LIZLLL.LIZIZ == EnumC558870Lvx.COMPLETED) {
            C09AE c09ae = this.LLJL.get(str);
            if (c09ae != null) {
                c09ae.LIZIZ(null);
            }
            this.LLJL.remove(str);
        }
        if (c559060LwG.LIZLLL.LIZJ()) {
            C2191608iI c2191608iI = this.LLJLIL.get(str);
            if (c2191608iI != null) {
                AnonymousClass0956 anonymousClass0956 = c2191608iI.LJ;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                c2191608iI.LJ = null;
                c2191608iI.LJII = false;
                c2191608iI.LIZJ.setValue(100);
            }
            C558860Lvw c558860Lvw = c559060LwG.LJIILL;
            c558860Lvw.getClass();
            ArrayList arrayList = new ArrayList();
            if (c558860Lvw.LIZIZ > 0) {
                long j = c558860Lvw.LIZ;
                if (j > 0) {
                    arrayList.add(new Pair(Long.valueOf(j), Long.valueOf(c558860Lvw.LIZ + c558860Lvw.LIZIZ)));
                }
            }
            arrayList.addAll(c558860Lvw.LIZLLL);
            if (!arrayList.isEmpty()) {
                List listLJLLLL = C13LP.LJLLLL(new C512401z8(12), arrayList);
                ArrayList<Pair> arrayList2 = new ArrayList();
                Pair pair = (Pair) ListProtector.get(listLJLLLL, 0);
                int size = listLJLLLL.size();
                for (int i = 1; i < size; i++) {
                    Pair pair2 = (Pair) ListProtector.get(listLJLLLL, i);
                    if (((Number) pair2.getFirst()).longValue() <= ((Number) pair.getSecond()).longValue()) {
                        pair = new Pair(pair.getFirst(), Long.valueOf(Math.max(((Number) pair.getSecond()).longValue(), ((Number) pair2.getSecond()).longValue())));
                    } else {
                        arrayList2.add(pair);
                        pair = pair2;
                    }
                }
                arrayList2.add(pair);
                long jLongValue = 0;
                for (Pair pair3 : arrayList2) {
                    jLongValue += ((Number) pair3.getSecond()).longValue() - ((Number) pair3.getFirst()).longValue();
                }
                if (jLongValue > 0) {
                    C0233005v c0233005v = new C0233005v(str, jLongValue);
                    Function1<? super C0233005v, Unit> function1 = c559060LwG.LJIILIIL;
                    if (function1 != null) {
                        function1.invoke(c0233005v);
                    }
                    c559060LwG.LJIILIIL = null;
                }
            }
            Function1<? super String, Unit> function12 = c559060LwG.LJIIIZ;
            if (function12 != null) {
                function12.invoke(str);
            }
            c559060LwG.LJIIIZ = null;
            return;
        }
        if (c559060LwG.LIZLLL.LIZIZ()) {
            C2191608iI c2191608iI2 = this.LLJLIL.get(str);
            if (c2191608iI2 != null) {
                c2191608iI2.LIZIZ();
            }
            this.LLJLIL.remove(str);
            Function2<? super String, ? super String, Unit> function2 = c559060LwG.LJIIJ;
            if (function2 != null) {
                function2.invoke(str, c559060LwG.LJIIJJI);
            }
            c559060LwG.LJIIJ = null;
        }
    }

    private final void P6(String str) {
        String strM5 = M5(str);
        C2191608iI c2191608iI = this.LLJLIL.get(strM5);
        if (c2191608iI != null) {
            c2191608iI.LIZIZ();
        }
        this.LLJLIL.remove(strM5);
        i3(AFwS239S0000000_8.get$arr$(65));
    }

    private final void d6(NLETrackSlot nLETrackSlot) {
        NLEResourceNode resource;
        String resourceFile;
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentVideoDynamicCast == null || (resource = nLESegmentVideoDynamicCast.getResource()) == null) {
            return;
        }
        String extra = nLETrackSlot.getExtra("autocut_ai_origin_resource_file");
        if ((extra == null || extra.length() == 0) && (resourceFile = resource.getResourceFile()) != null) {
            nLETrackSlot.setExtra("autocut_ai_origin_resource_file", resourceFile);
            NLEResType resourceType = resource.getResourceType();
            if (resourceType != null) {
                nLETrackSlot.setExtra("autocut_ai_origin_resource_type", String.valueOf(resourceType.swigValue()));
            }
            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("saveOriginResourceToSlot: slotId=");
            sbLIZ.append(nLETrackSlot.getUUID());
            sbLIZ.append(", originalPath=");
            sbLIZ.append(resourceFile);
            C201955140j.LJIILL(c1398350mUb, "TemplateAutoCutAIComponent", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    private final void d7(C559060LwG c559060LwG) {
        EnumC559120LwM enumC559120LwM;
        if (!Intrinsics.LJFF(c559060LwG.LIZLLL.LIZ, T2().LIZ)) {
            return;
        }
        C559050LwF c559050LwF = c559060LwG.LIZLLL;
        int i = ((c559050LwF.LJFF * 80) / 100) + 20;
        if (c559050LwF.LIZIZ()) {
            enumC559120LwM = EnumC559120LwM.RETRY;
        } else {
            enumC559120LwM = EnumC559120LwM.LOADING;
        }
        i3(new AwS116S0101000_8(enumC559120LwM, i, 3));
    }

    @Override // X.InterfaceC1417440mzO
    public C558860Lvw AO2(String str) {
        C559060LwG c559060LwG = this.LLJJJJLIIL.get(str);
        if (c559060LwG != null) {
            return c559060LwG.LJIILL;
        }
        return null;
    }

    public final void H5(String str) {
        C559060LwG c559060LwG = this.LLJJJJLIIL.get(str);
        if (c559060LwG == null) {
            return;
        }
        W6();
        d7(c559060LwG);
        P4(str);
    }

    public final long N5(C559060LwG c559060LwG) {
        long j = c559060LwG.LJIILL.LIZJ;
        if (j <= 0) {
            return 0L;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = jCurrentTimeMillis - j;
        C558860Lvw c558860Lvw = c559060LwG.LJIILL;
        c558860Lvw.getClass();
        ((ArrayList) c558860Lvw.LIZLLL).add(new Pair(Long.valueOf(j), Long.valueOf(jCurrentTimeMillis)));
        c559060LwG.LJIILL.LIZJ = 0L;
        return j2;
    }

    @Override // X.InterfaceC1417440mzO
    public boolean QH(String str) {
        C559060LwG c559060LwG = this.LLJJJJLIIL.get(str);
        if (c559060LwG == null) {
            return false;
        }
        return c559060LwG.LIZLLL.LIZJ();
    }

    @Override // X.InterfaceC1417440mzO
    public void Qp2(String str) {
        AnonymousClass0956 anonymousClass0956;
        S6();
        C559060LwG c559060LwG = this.LLJJJJLIIL.get(str);
        if (c559060LwG != null && c559060LwG.LIZLLL.LIZJ == EnumC558870Lvx.RUNNING) {
            C2191608iI c2191608iI = this.LLJLIL.get(str);
            if (c2191608iI != null && (anonymousClass0956 = c2191608iI.LJ) != null && anonymousClass0956.isActive() && !c2191608iI.LJII) {
                c2191608iI.LJII = true;
                c2191608iI.LJI = System.currentTimeMillis() - c2191608iI.LJFF;
                AnonymousClass0956 anonymousClass09562 = c2191608iI.LJ;
                if (anonymousClass09562 != null) {
                    anonymousClass09562.LIZIZ(null);
                }
                c2191608iI.LJ = null;
            }
            C09AE c09ae = this.LLJJJIL;
            if (c09ae != null) {
                c09ae.LIZIZ(null);
            }
            this.LLJJJIL = null;
            C5(c559060LwG, EnumC559100LwK.PAUSE, N5(c559060LwG));
            c559060LwG.LIZLLL = C559050LwF.LIZ(c559060LwG.LIZLLL, null, EnumC558870Lvx.PAUSED, 0, 59);
            S5(c559060LwG);
            H5(str);
        }
    }

    public final void S5(C559060LwG c559060LwG) {
        LiveData<InterfaceC1452170ntP> liveDataG;
        InterfaceC1452170ntP value;
        C348100Dkm c348100DkmLIZIZ;
        INLEMediaSession iNLEMediaSession;
        INLEMediaRuntime mediaRuntimeApi;
        LiveData<VEEditorAutoStartStopArbiter> liveDataB10;
        VEEditorAutoStartStopArbiter value2;
        LiveData<InterfaceC1452170ntP> liveDataG2;
        InterfaceC1452170ntP value3;
        C348100Dkm c348100DkmLIZIZ2;
        NLEEditor nLEEditor;
        LiveData<InterfaceC1452170ntP> liveDataG3;
        InterfaceC1452170ntP value4;
        C348100Dkm c348100DkmLIZIZ3;
        NLEEditor nLEEditor2;
        NLEModel nLEModel = c559060LwG.LJIIIIZZ;
        if (nLEModel != null) {
            InterfaceC1446740nke interfaceC1446740nkeJY0 = JY0();
            if (interfaceC1446740nkeJY0 != null && (liveDataG3 = interfaceC1446740nkeJY0.g()) != null && (value4 = liveDataG3.getValue()) != null && (c348100DkmLIZIZ3 = C352130DrH.LIZIZ(value4)) != null && (nLEEditor2 = c348100DkmLIZIZ3.LIZ) != null) {
                nLEEditor2.setModel(nLEModel);
            }
            InterfaceC1446740nke interfaceC1446740nkeJY02 = JY0();
            if (interfaceC1446740nkeJY02 != null && (liveDataG2 = interfaceC1446740nkeJY02.g()) != null && (value3 = liveDataG2.getValue()) != null && (c348100DkmLIZIZ2 = C352130DrH.LIZIZ(value3)) != null && (nLEEditor = c348100DkmLIZIZ2.LIZ) != null) {
                nLEEditor.commit();
            }
            InterfaceC1446740nke interfaceC1446740nkeJY03 = JY0();
            if (interfaceC1446740nkeJY03 != null && (liveDataB10 = interfaceC1446740nkeJY03.b10()) != null && (value2 = liveDataB10.getValue()) != null) {
                value2.LIZJ(false, true, true);
            }
            InterfaceC1446740nke interfaceC1446740nkeJY04 = JY0();
            if (interfaceC1446740nkeJY04 != null && (liveDataG = interfaceC1446740nkeJY04.g()) != null && (value = liveDataG.getValue()) != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null && (iNLEMediaSession = c348100DkmLIZIZ.LIZIZ) != null && (mediaRuntimeApi = iNLEMediaSession.getMediaRuntimeApi()) != null) {
                mediaRuntimeApi.setPreviewOffScreen(false);
            }
        }
    }

    public final void T4(C0FQS c0fqs) {
        NLEResourceAV aVFile;
        String resourceFile;
        Iterator<C381340ExI> it2 = c0fqs.LJIL.iterator();
        while (it2.hasNext()) {
            NLETrackSlot renderProxy = it2.next().LIZ.getRenderProxy();
            NLESegment mainSegment = null;
            if (renderProxy != null) {
                mainSegment = renderProxy.getMainSegment();
            }
            NLERenderProxySegment nLERenderProxySegmentDynamicCast = NLERenderProxySegment.dynamicCast(mainSegment);
            if (nLERenderProxySegmentDynamicCast != null && (aVFile = nLERenderProxySegmentDynamicCast.getAVFile()) != null && (resourceFile = aVFile.getResourceFile()) != null && (!a0.LJJJIL(resourceFile))) {
                getEditModel().creativeModel.autoCutModel.i2iResourcePaths.add(resourceFile);
            }
        }
    }

    public final void U5(String str) {
        InterfaceC1417050myl interfaceC1417050mylD5 = d5();
        if (interfaceC1417050mylD5 != null) {
            interfaceC1417050mylD5.Pl2(str);
        }
    }

    @Override // X.InterfaceC1417440mzO
    public C559050LwF pQ2(String str) {
        C559060LwG c559060LwG = this.LLJJJJLIIL.get(str);
        if (c559060LwG != null) {
            return c559060LwG.LIZLLL;
        }
        return null;
    }

    public final boolean x5(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        if (tracks == null) {
            return false;
        }
        ArrayList<NLENode> arrayList = new ArrayList();
        Iterator<NLETrack> it2 = tracks.iterator();
        while (it2.hasNext()) {
            Iterable slots = it2.next().getSlots();
            if (slots == null) {
                slots = C13BV.INSTANCE;
            }
            C19719612Di.LJJI(slots, arrayList);
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (NLENode nLENode : arrayList) {
            if (nLENode.getFeatureList().contains("UGC_ASYNC_I2V") && nLENode.getFeatureList().contains("TEMPLATE_MATTING")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.0LwQ] */
    public C559020LwC(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        this.LLJILLL = c23119094bLIZ;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJJ = C2296808zG.LIZ(C2107308Nj.LIZ.plus(c23119094bLIZ));
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC559090LwJ.class, null);
        this.LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1446740nke.class, null);
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1417050myl.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC372160EiU.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJJ = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJJJJ = new InterfaceC1462000o9G() { // from class: X.0LwQ
            @Override // X.InterfaceC1462000o9G
            public final boolean LJL(boolean z) {
                return false;
            }

            @Override // X.InterfaceC1462000o9G
            public final boolean LLIIIJ() {
                return false;
            }

            @Override // X.InterfaceC1462000o9G
            public final boolean b0() {
                return true;
            }

            @Override // X.InterfaceC1462000o9G
            public final boolean x0() {
                return true;
            }
        };
        this.LLJJJJLIIL = new LinkedHashMap();
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C2097608Jq.LJ());
        this.LLJJL = c2252321DDqLIZ;
        this.LLJJLIIIJLLLLLLLZ = C09IC.LIZIZ(c2252321DDqLIZ);
        this.LLJL = new LinkedHashMap();
        this.LLJLIL = new LinkedHashMap();
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(128));
        this.LLJLL = AFwS194S0000000_8.get$arr$(127);
        this.LLJLLIL = new AwS552S0100000_8(this, 173);
    }

    private final void D5(String str, C559060LwG c559060LwG) {
        this.LLJL.put(str, C23250099c.LIZLLL(this.LLJJ, null, null, new C558850Lvv(c559060LwG, this, str, null), 3));
    }

    private final void E5(String str, C2191608iI c2191608iI) {
        C23250099c.LIZLLL(this.LLJJ, null, null, new C558890Lvz(c2191608iI, this, str, null), 3);
    }

    private final void J6(String str, C559060LwG c559060LwG) {
        c559060LwG.LJIILL.LIZ = System.currentTimeMillis();
        R5();
        c559060LwG.LIZLLL = C559050LwF.LIZ(c559060LwG.LIZLLL, EnumC558870Lvx.RUNNING, null, 0, 61);
        if (this.LLJL.containsKey(str)) {
            c559060LwG.LJIILJJIL = null;
            ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = C09BV.LIZ();
            if (iCreationAsyncTaskManagerLIZ != null) {
                iCreationAsyncTaskManagerLIZ.LJJJIL(c559060LwG.LIZJ);
                return;
            }
            return;
        }
        C0FQS c0fqsK4 = K4(c559060LwG);
        c559060LwG.LJ = c0fqsK4;
        ITemplateService iTemplateServiceN5 = n5();
        if (iTemplateServiceN5 != null) {
            iTemplateServiceN5.LJ(c0fqsK4);
        }
        D5(str, c559060LwG);
    }

    private final void K6(String str, boolean z) {
        long j;
        C2191608iI c2191608iI = this.LLJLIL.get(str);
        if (c2191608iI != null) {
            if (c2191608iI.LJII) {
                c2191608iI.LJII = false;
                c2191608iI.LJFF = System.currentTimeMillis() - c2191608iI.LJI;
                c2191608iI.LJ = C23250099c.LIZLLL(c2191608iI.LIZIZ, null, null, new C2191408iG(c2191608iI, null), 3);
                return;
            }
            return;
        }
        if (z) {
            j = 180000;
        } else {
            j = 20000;
        }
        C2191608iI c2191608iI2 = new C2191608iI(j, this.LLJJ);
        this.LLJLIL.put(str, c2191608iI2);
        c2191608iI2.LIZJ();
        E5(str, c2191608iI2);
    }

    private final void L6(String str, C559060LwG c559060LwG) {
        NLEModel nLEModelQq2;
        NLEModel model;
        LiveData<InterfaceC1452170ntP> liveDataG;
        InterfaceC1452170ntP value;
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        NLEModel nLEModel = c559060LwG.LIZ;
        NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(nLEModel.deepClone());
        C0FQS c0fqsO4 = c559060LwG.LJFF;
        if (c0fqsO4 == null) {
            c0fqsO4 = O4(c559060LwG);
            c559060LwG.LJFF = c0fqsO4;
        }
        ((ArrayList) c0fqsO4.LJIILLIIL).clear();
        c0fqsO4.LJIL.clear();
        c0fqsO4.LJIIJ = NLETemplateModel.createFromDraft(nLEModel);
        InterfaceC559090LwJ interfaceC559090LwJK5 = k5();
        if (interfaceC559090LwJK5 != null) {
            nLEModelQq2 = interfaceC559090LwJK5.qq2(nLEModelDynamicCast, false, c0fqsO4);
        } else {
            nLEModelQq2 = null;
        }
        c0fqsO4.LJIIJJI = nLEModelQq2;
        InterfaceC1446740nke interfaceC1446740nkeJY0 = JY0();
        if (interfaceC1446740nkeJY0 != null && (liveDataG = interfaceC1446740nkeJY0.g()) != null && (value = liveDataG.getValue()) != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null && (nLEEditor = c348100DkmLIZIZ.LIZ) != null) {
            model = nLEEditor.getModel();
        } else {
            model = null;
        }
        c559060LwG.LJIIIIZZ = model;
        c559060LwG.LJIILL.LIZJ = System.currentTimeMillis();
        c559060LwG.LIZLLL = C559050LwF.LIZ(c559060LwG.LIZLLL, null, EnumC558870Lvx.RUNNING, 0, 59);
        this.LLJJJIL = C23250099c.LIZLLL(this.LLJJ, null, null, new C559030LwD(this, c559060LwG, c0fqsO4, str, nLEModel, null), 3);
    }

    private final C559060LwG Z4(AutoCutThemeData autoCutThemeData, NLEModel nLEModel) {
        boolean z;
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        boolean z2 = true;
        if (tracks != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<NLETrack> it2 = tracks.iterator();
            while (it2.hasNext()) {
                Iterable slots = it2.next().getSlots();
                if (slots == null) {
                    slots = C13BV.INSTANCE;
                }
                C19719612Di.LJJI(slots, arrayList);
            }
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (C377880Eri.LJIIL((NLETrackSlot) it3.next())) {
                        z = true;
                        break;
                    }
                }
                z = false;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        VecNLETrackSPtr tracks2 = nLEModel.getTracks();
        if (tracks2 != null) {
            ArrayList<NLETrackSlot> arrayList2 = new ArrayList();
            Iterator<NLETrack> it4 = tracks2.iterator();
            while (it4.hasNext()) {
                Iterable slots2 = it4.next().getSlots();
                if (slots2 == null) {
                    slots2 = C13BV.INSTANCE;
                }
                C19719612Di.LJJI(slots2, arrayList2);
            }
            if (!arrayList2.isEmpty()) {
                for (NLETrackSlot nLETrackSlot : arrayList2) {
                    if (C348520DlS.LJFF(nLETrackSlot) && !nLETrackSlot.getFeatureList().contains("UGC_ASYNC_I2V")) {
                        break;
                    }
                }
                z2 = false;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        String str = autoCutThemeData.templateId;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(autoCutThemeData.templateId);
        sbLIZ.append('-');
        sbLIZ.append(getEditModel().getCreationId());
        return new C559060LwG(str, z, z2, nLEModel, autoCutThemeData, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void F4(C559060LwG c559060LwG, List<C0LSZ> list) {
        NLETemplateModel nLETemplateModel;
        NLETrackSlot nLETrackSlotLJL;
        C0FQS c0fqs = c559060LwG.LJ;
        if (c0fqs != null && (nLETemplateModel = c0fqs.LJIIJ) != null) {
            NLEModel nLEModel = c559060LwG.LIZ;
            ArrayList<C0LSZ> arrayList = new ArrayList();
            for (C0LSZ c0lsz : list) {
                if (Intrinsics.LJFF(c0lsz.LJ, "FINISHED")) {
                    arrayList.add(c0lsz);
                }
            }
            for (C0LSZ c0lsz2 : arrayList) {
                NLETrackSlot nLETrackSlotLJIIJ = C352250DrT.LJIIJ(nLETemplateModel, c0lsz2.LIZ);
                if (nLETrackSlotLJIIJ != null && (nLETrackSlotLJL = C351220Dpo.LJL(nLEModel, nLETrackSlotLJIIJ.getUUID())) != null) {
                    C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("applyI2IResultToNLEModel: templateId=");
                    sbLIZ.append(c559060LwG.LIZLLL.LIZ);
                    sbLIZ.append(", slotId=");
                    sbLIZ.append(nLETrackSlotLJIIJ.getUUID());
                    sbLIZ.append(", param=");
                    sbLIZ.append(c0lsz2.LJIILIIL);
                    C201955140j.LJIILL(c1398350mUb, "TemplateAutoCutAIComponent", C2188811AlT.LIZIZ(sbLIZ));
                    d6(nLETrackSlotLJL);
                    C352250DrT.LIZLLL(nLETrackSlotLJL, c0lsz2.LJIILIIL);
                    String str = c0lsz2.LJIILIIL;
                    if ((!a0.LJJJIL(str)) && str != null) {
                        getEditModel().creativeModel.autoCutModel.i2iResourcePaths.add(str);
                    }
                    nLETrackSlotLJIIJ.removeExtraWithKey("creation_async_task_id");
                }
            }
        }
    }

    public final Object H4(C0FQS c0fqs, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        ITemplateService iTemplateServiceN5 = n5();
        if (iTemplateServiceN5 == null) {
            return false;
        }
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        iTemplateServiceN5.LJIILL(c0fqs, new AwS587S0100000_8(c2252611DEt, 106), new AwS587S0100000_8(c2252611DEt, 107), AFwS239S0000000_8.get$arr$(63));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public final void T6(String str, int i) {
        if (!Intrinsics.LJFF(str, T2().LIZ)) {
            return;
        }
        i3(new AwS23S0001000_8(i, 5));
    }

    @Override // X.InterfaceC1417440mzO
    public void bn0(AutoCutThemeData autoCutThemeData, NLEModel nLEModel) {
        boolean z;
        EnumC558870Lvx enumC558870Lvx;
        EnumC558870Lvx enumC558870Lvx2;
        String str = autoCutThemeData.templateId;
        if (this.LLJJJJLIIL.containsKey(str)) {
            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TemplateAutoCutAIComponent#restoreCompletedTaskGroup: taskGroup already exists for ");
            sbLIZ.append(str);
            C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        boolean z2 = true;
        if (tracks != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<NLETrack> it2 = tracks.iterator();
            while (it2.hasNext()) {
                Iterable slots = it2.next().getSlots();
                if (slots == null) {
                    slots = C13BV.INSTANCE;
                }
                C19719612Di.LJJI(slots, arrayList);
            }
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (C377880Eri.LJIIL((NLETrackSlot) it3.next())) {
                        z = true;
                        break;
                    }
                }
                z = false;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        VecNLETrackSPtr tracks2 = nLEModel.getTracks();
        if (tracks2 != null) {
            ArrayList<NLETrackSlot> arrayList2 = new ArrayList();
            Iterator<NLETrack> it4 = tracks2.iterator();
            while (it4.hasNext()) {
                Iterable slots2 = it4.next().getSlots();
                if (slots2 == null) {
                    slots2 = C13BV.INSTANCE;
                }
                C19719612Di.LJJI(slots2, arrayList2);
            }
            if (!arrayList2.isEmpty()) {
                for (NLETrackSlot nLETrackSlot : arrayList2) {
                    if (C348520DlS.LJFF(nLETrackSlot) && !nLETrackSlot.getFeatureList().contains("UGC_ASYNC_I2V")) {
                        break;
                    }
                }
                z2 = false;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("TemplateAutoCutAIComponent#restoreCompletedTaskGroup: no AI tasks for ");
            sbLIZ2.append(str);
            C201955140j.LJIILJJIL(c1398350mUb2, C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(str);
        sbLIZ3.append('-');
        sbLIZ3.append(getEditModel().getCreationId());
        C559060LwG c559060LwG = new C559060LwG(str, z, z2, nLEModel, autoCutThemeData, C2188811AlT.LIZIZ(sbLIZ3));
        C559050LwF c559050LwF = c559060LwG.LIZLLL;
        if (z) {
            enumC558870Lvx = EnumC558870Lvx.COMPLETED;
        } else {
            enumC558870Lvx = EnumC558870Lvx.IDLE;
        }
        if (z2) {
            enumC558870Lvx2 = EnumC558870Lvx.COMPLETED;
        } else {
            enumC558870Lvx2 = EnumC558870Lvx.IDLE;
        }
        c559060LwG.LIZLLL = C559050LwF.LIZ(c559050LwF, enumC558870Lvx, enumC558870Lvx2, 0, 57);
        c559060LwG.LJI = z2;
        c559060LwG.LJII = z2;
        this.LLJJJJLIIL.put(str, c559060LwG);
        W6();
        C1398350mUb c1398350mUb3 = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("TemplateAutoCutAIComponent#restoreCompletedTaskGroup: restored taskGroup for ");
        sbLIZ4.append(str);
        sbLIZ4.append(", hasAICreateI2I=");
        sbLIZ4.append(z);
        sbLIZ4.append(" hasMagicI2I=");
        sbLIZ4.append(z2);
        C201955140j.LJIILJJIL(c1398350mUb3, C2188811AlT.LIZIZ(sbLIZ4));
    }

    @Override // X.InterfaceC1417440mzO
    public void jL0(String str, boolean z) {
        Integer num;
        show();
        N6(str);
        C559060LwG c559060LwG = this.LLJJJJLIIL.get(str);
        if (c559060LwG != null) {
            num = c559060LwG.LJIILJJIL;
        } else {
            num = null;
        }
        i3(new C559070LwH(str, c559060LwG, z, num));
    }

    public final void v5(String str, C559060LwG c559060LwG) {
        C5(c559060LwG, EnumC559100LwK.FAIL, N5(c559060LwG));
        S5(c559060LwG);
        c559060LwG.LIZLLL = C559050LwF.LIZ(c559060LwG.LIZLLL, null, EnumC558870Lvx.FAILED, 0, 59);
        H5(str);
    }

    public final void C5(C559060LwG c559060LwG, EnumC559100LwK enumC559100LwK, long j) {
        C559080LwI c559080LwI = new C559080LwI(c559060LwG.LIZLLL.LIZ, enumC559100LwK, j);
        Function1<? super C559080LwI, Unit> function1 = c559060LwG.LJIIL;
        if (function1 != null) {
            function1.invoke(c559080LwI);
        }
    }

    public final void m6(C559060LwG c559060LwG, int i, int i2, int i3, String str) {
        String str2;
        AutoCutThemeData autoCutThemeData = c559060LwG.LIZIZ;
        long j = c559060LwG.LJIILL.LIZIZ;
        String str3 = getEditModel().mShootWay;
        String creationId = getEditModel().getCreationId();
        int i4 = autoCutThemeData.templateType;
        String str4 = autoCutThemeData.templateId;
        C0FQS c0fqs = c559060LwG.LJ;
        if (c0fqs != null) {
            str2 = c0fqs.LJIIIIZZ;
        } else {
            str2 = null;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(i2, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZIZ(j, "duration");
        c0lab.LJ("shoot_way", str3);
        c0lab.LJ("creation_id", creationId);
        c0lab.LIZ(i4, "template_type");
        c0lab.LJ("template_id", str4);
        c0lab.LJ("consume_scene", str2);
        c0lab.LIZ(i, "count");
        c0lab.LIZ(i3, "error_code");
        c0lab.LJ("error_msg", str);
        C20684815ws.LJIILLIIL("aicreate_consume", c0lab.LIZ);
    }

    @Override // X.InterfaceC1417440mzO
    public void HO1(AutoCutThemeData autoCutThemeData, NLEModel nLEModel, Function1<? super String, Unit> function1, Function2<? super String, ? super String, Unit> function2, Function1<? super C559080LwI, Unit> function12, Function1<? super C0233005v, Unit> function13) {
        boolean z;
        String str = autoCutThemeData.templateId;
        P6(str);
        pausePlay();
        C559060LwG c559060LwGZ4 = this.LLJJJJLIIL.get(str);
        if (c559060LwGZ4 != null) {
            c559060LwGZ4.LJIIIZ = function1;
            c559060LwGZ4.LJIIJ = function2;
            c559060LwGZ4.LJIIL = function12;
            c559060LwGZ4.LJIILIIL = function13;
            c559060LwGZ4.LJIIJJI = null;
            EnumC558870Lvx enumC558870Lvx = c559060LwGZ4.LIZLLL.LIZJ;
            if (enumC558870Lvx == EnumC558870Lvx.PAUSED || enumC558870Lvx == EnumC558870Lvx.FAILED) {
                L6(str, c559060LwGZ4);
            }
            if (c559060LwGZ4.LIZLLL.LIZIZ == EnumC558870Lvx.FAILED) {
                J6(str, c559060LwGZ4);
            }
            EnumC558870Lvx enumC558870Lvx2 = c559060LwGZ4.LIZLLL.LIZIZ;
            EnumC558870Lvx enumC558870Lvx3 = EnumC558870Lvx.RUNNING;
            if (enumC558870Lvx2 == enumC558870Lvx3) {
                R5();
            }
            if (c559060LwGZ4.LIZLLL.LIZIZ == enumC558870Lvx3) {
                z = true;
            } else {
                z = false;
            }
            K6(str, z);
        } else {
            c559060LwGZ4 = Z4(autoCutThemeData, nLEModel);
            c559060LwGZ4.LJIIIZ = function1;
            c559060LwGZ4.LJIIJ = function2;
            c559060LwGZ4.LJIIL = function12;
            c559060LwGZ4.LJIILIIL = function13;
            C558860Lvw c558860Lvw = c559060LwGZ4.LJIILL;
            System.currentTimeMillis();
            c558860Lvw.getClass();
            this.LLJJJJLIIL.put(str, c559060LwGZ4);
            C559050LwF c559050LwF = c559060LwGZ4.LIZLLL;
            boolean z2 = c559050LwF.LIZLLL;
            if (z2 || c559050LwF.LJ) {
                K6(str, z2);
            }
            if (c559060LwGZ4.LIZLLL.LIZLLL) {
                J6(str, c559060LwGZ4);
            }
            if (c559060LwGZ4.LIZLLL.LJ) {
                L6(str, c559060LwGZ4);
            }
        }
        H5(str);
        C559050LwF c559050LwF2 = c559060LwGZ4.LIZLLL;
        if (!c559050LwF2.LIZLLL && !c559050LwF2.LJ) {
            Function1<? super String, Unit> function14 = c559060LwGZ4.LJIIIZ;
            if (function14 != null) {
                function14.invoke(str);
            }
            c559060LwGZ4.LJIIIZ = null;
            hide();
        }
    }
}
