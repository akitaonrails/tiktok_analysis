package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.SurfaceView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.INLEListenerKeyframe;
import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEMediaSettings;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.KeyframeType;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorListener;
import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEMediaConfig;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.PairIntInt;
import com.bytedance.ies.nleeditor.NLE;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0DzR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C357190DzR extends AbstractC2255721DQs<InterfaceC357200DzS> implements InterfaceC357200DzS, InterfaceC379610EuV {
    public final C1DRG LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public NLEMediaConfig LLILZ;
    public INLEMediaSession LLILZIL;
    public InterfaceC350420DoW LLILZLL;
    public long LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public String LLJILLL;
    public SurfaceView LLJJIII;
    public InterfaceC353240Dt4 LLJJJJJIL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final MutableLiveData<C357250DzX> LLJI = new MutableLiveData<>();
    public Set<NLEEditorListener> LLJJ = new LinkedHashSet();
    public Set<NLEEditorListener> LLJJI = new LinkedHashSet();
    public InterfaceC350970DpP LLJJIJI = new InterfaceC350970DpP() { // from class: X.0DpN
        public final Map<String, MutableLiveData<Object>> LIZ = new LinkedHashMap();

        @Override // X.InterfaceC350970DpP
        public final <T> MutableLiveData<T> LIZ(String str) {
            if (!this.LIZ.containsKey(str)) {
                this.LIZ.put(str, new MutableLiveData<>());
            }
            Object obj = ((LinkedHashMap) this.LIZ).get(str);
            if (obj instanceof MutableLiveData) {
                return (MutableLiveData) obj;
            }
            return null;
        }

        @Override // X.InterfaceC350970DpP
        public final <T> T LIZJ(String str, T t) {
            T value;
            System.currentTimeMillis();
            if (this.LIZ.containsKey(str)) {
                try {
                    MutableLiveData mutableLiveData = (MutableLiveData) ((LinkedHashMap) this.LIZ).get(str);
                    T t2 = null;
                    if (mutableLiveData != null) {
                        value = mutableLiveData.getValue();
                    } else {
                        value = null;
                    }
                    if (value != null) {
                        t2 = value;
                    }
                    if (t2 == null) {
                        return t;
                    }
                    return t2;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getProperty::key=");
                    sbLIZ.append(str);
                    sbLIZ.append(", error cause = ");
                    sbLIZ.append(e.getMessage());
                    C355090Dw3.LIZLLL("LiveDataEnvProperties", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            return t;
        }

        @Override // X.InterfaceC350970DpP
        public final void LIZIZ(Object obj, String str, boolean z) {
            System.currentTimeMillis();
            if (!C805320ViU.LIZ()) {
                z = true;
            }
            if (!this.LIZ.containsKey(str)) {
                MutableLiveData<Object> mutableLiveData = new MutableLiveData<>();
                this.LIZ.put(str, mutableLiveData);
                if (z) {
                    mutableLiveData.postValue(obj);
                    return;
                } else {
                    mutableLiveData.setValue(obj);
                    return;
                }
            }
            LiveData liveData = (LiveData) ((LinkedHashMap) this.LIZ).get(str);
            if (z) {
                if (liveData == null) {
                    return;
                }
                liveData.postValue(obj);
            } else {
                if (liveData == null) {
                    return;
                }
                liveData.setValue(obj);
            }
        }
    };
    public C0E55 LLJJIJIIJIL = new C0FD1(this);
    public InterfaceC351350Dq1 LLJJIJIL = new C354880Dvi(this);
    public final InterfaceC372810EjX LLJJJ = new InterfaceC372810EjX(this) { // from class: X.0DzV
        public final C0E48 LIZ;

        @Override // X.InterfaceC372810EjX
        public final int getPageMode() {
            INLEMediaSettings mediaSettingApi;
            INLEMediaSession iNLEMediaSessionF1 = this.LIZ.f1();
            if (iNLEMediaSessionF1 == null || (mediaSettingApi = iNLEMediaSessionF1.getMediaSettingApi()) == null) {
                return -1;
            }
            return mediaSettingApi.getPageMode();
        }

        {
            this.LIZ = this;
        }

        @Override // X.InterfaceC372810EjX
        public final void setPageMode(int i) {
            INLEMediaSettings mediaSettingApi;
            INLEMediaSession iNLEMediaSessionF1 = this.LIZ.f1();
            if (iNLEMediaSessionF1 != null && (mediaSettingApi = iNLEMediaSessionF1.getMediaSettingApi()) != null) {
                mediaSettingApi.setPageMode(i);
            }
        }
    };
    public InterfaceC356930Dz1 LLJJJIL = new InterfaceC356930Dz1(this) { // from class: X.0Dz0
        public final C0E48 LIZ;

        {
            this.LIZ = this;
            new C356910Dyz(this);
        }
    };
    public InterfaceC358840E5a LLJJJJ = new C357160DzO(this);
    public InterfaceC351610DqR LLJJJJLIIL = new C350370DoR(this);
    public final C01GW LLJJL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(365));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1310));

    public InterfaceC357200DzS W1() {
        return this;
    }

    private final void X1() {
        C350870DpF.LJIIIZ(this, "_is_editor_pro_context_init_finish", Boolean.TRUE);
    }

    @Override // X.InterfaceC357200DzS
    public void Aq() {
        S7().LIZIZ(Boolean.FALSE, "ve_first_frame_rendered", true);
    }

    @Override // X.InterfaceC357200DzS
    public HandlerThread J71() {
        return (HandlerThread) this.LLJJL.getValue();
    }

    @Override // X.InterfaceC357200DzS, X.C0E48
    public List<NLEEditorListener> pq() {
        return C13LP.LLIIII(this.LLJJ);
    }

    @Override // X.InterfaceC357200DzS, X.C0E48
    public Handler wm() {
        return (Handler) this.LLJL.getValue();
    }

    private final void H2() {
        INLEPlayer playerApi;
        INLEMediaSession iNLEMediaSessionF1 = f1();
        if (iNLEMediaSessionF1 == null || (playerApi = iNLEMediaSessionF1.getPlayerApi()) == null) {
            return;
        }
        playerApi.addKeyframeListener(new INLEListenerKeyframe() { // from class: X.0DzT
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerKeyframe
            public final void onKeyFrameProcess(String str, long j, String str2, KeyframeType keyframeType) {
                NLETrack nLETrackPt;
                INLEPlayer playerApi2;
                NLETrackSlot nLETrackSlotLLLLLLIL = this.LIZ.LLLLLLIL();
                if (nLETrackSlotLLLLLLIL == null || (nLETrackPt = this.LIZ.Pt()) == null) {
                    return;
                }
                long jLIZLLL = C352310DrZ.LIZLLL(C350870DpF.LJ(this.LIZ));
                if (jLIZLLL >= nLETrackSlotLLLLLLIL.getStartTime() && jLIZLLL <= nLETrackSlotLLLLLLIL.getEndTime()) {
                    this.LIZ.og().LJIILIIL(jLIZLLL);
                    INLEMediaSession iNLEMediaSessionF12 = this.LIZ.f1();
                    if (iNLEMediaSessionF12 != null && (playerApi2 = iNLEMediaSessionF12.getPlayerApi()) != null) {
                        playerApi2.refreshAllKeyframeInfo(str, j, str2, nLETrackPt, nLETrackSlotLLLLLLIL, keyframeType);
                    }
                    this.LIZ.LLJI.postValue((C357250DzX) new Object() { // from class: X.0DzX
                    });
                }
            }
        });
    }

    @Override // X.InterfaceC357200DzS, X.C0E48
    public NLETrackSlot LLLLLLIL() {
        C351080Dpa c351080Dpa;
        Object objLIZJ = S7().LIZJ("selected_nle_track_slot", null);
        if (!(objLIZJ instanceof C351080Dpa) || (c351080Dpa = (C351080Dpa) objLIZJ) == null) {
            return null;
        }
        return c351080Dpa.LIZ;
    }

    @Override // X.InterfaceC357200DzS, X.C0E48
    public NLETrack Pt() {
        C351100Dpc c351100Dpc;
        Object objLIZJ = S7().LIZJ("selected_nle_track", null);
        if (!(objLIZJ instanceof C351100Dpc) || (c351100Dpc = (C351100Dpc) objLIZJ) == null) {
            return null;
        }
        return c351100Dpc.LIZ;
    }

    @Override // X.InterfaceC357200DzS, X.C0E48
    public NLETrack Rn() {
        if (LLFII().LLZ().getMainTrack() != null) {
            return LLFII().LLZ().getMainTrack();
        }
        NLETrack nLETrack = new NLETrack();
        nLETrack.setMainTrack(true);
        LLFII().LLZ().addTrack(nLETrack);
        return nLETrack;
    }

    @Override // X.InterfaceC357200DzS, X.C0E48
    public boolean We() {
        return f1() != null;
    }

    @Override // X.InterfaceC357200DzS, X.C0E48
    public Pair<Integer, Integer> getCanvasSize() {
        INLEMediaRuntime mediaRuntimeApi;
        PairIntInt canvasSize;
        INLEMediaSession iNLEMediaSessionF1 = f1();
        if (iNLEMediaSessionF1 == null || (mediaRuntimeApi = iNLEMediaSessionF1.getMediaRuntimeApi()) == null || (canvasSize = mediaRuntimeApi.getCanvasSize()) == null) {
            return null;
        }
        return new Pair<>(Integer.valueOf(canvasSize.getFirst()), Integer.valueOf(canvasSize.getSecond()));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        INLEPlayer playerApi;
        super.onDestroy();
        getPlayer().onDestroy();
        this.LLJJ.clear();
        this.LLJILLL = null;
        C91(false);
        if (((Boolean) C257160A5y.LIZ.getValue()).booleanValue()) {
            C13SS.LIZ.getClass();
            C13SS.LIZ("MEMORY_LEAK", "EditorContextComponent onDestroy, remove key frame listener");
            INLEMediaSession iNLEMediaSessionF1 = f1();
            if (iNLEMediaSessionF1 == null || (playerApi = iNLEMediaSessionF1.getPlayerApi()) == null) {
                return;
            }
            playerApi.addKeyframeListener(new INLEListenerKeyframe() { // from class: X.0DzU
                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerKeyframe
                public final void onKeyFrameProcess(String str, long j, String str2, KeyframeType keyframeType) {
                    C13SS.LIZ.getClass();
                    C13SS.LIZ("MEMORY_LEAK", "EmptyINLEListenerKeyframe.onKeyFrameProcess");
                }
            });
        }
    }

    @Override // X.InterfaceC357200DzS, X.C0E48
    public InterfaceC358840E5a Bo() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC357200DzS
    public long EW() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC357200DzS, X.C0E48
    public InterfaceC353240Dt4 Ie() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC357200DzS, X.C0E48
    public SurfaceView LJIJJLI() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC357200DzS, X.C0E48
    public InterfaceC351350Dq1 LLFII() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC357200DzS, X.C0E48
    public boolean Ls() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC357200DzS
    public InterfaceC356930Dz1 P01() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC357200DzS, X.C0E48
    public InterfaceC350970DpP S7() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC357200DzS, X.C0E48
    public boolean a5() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC357200DzS, X.C0E48
    public InterfaceC350420DoW bs() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC357200DzS, X.C0E48
    public INLEMediaSession f1() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC357200DzS, X.C0E48
    public InterfaceC372810EjX getConfig() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC357200DzS, X.C0E48
    public C0E55 getPlayer() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC357200DzS, X.C0E48
    public boolean jg() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC357200DzS, X.C0E48
    public NLEMediaConfig jl() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC357200DzS, X.C0E48
    public LiveData<C357250DzX> la() {
        return this.LLJI;
    }

    @Override // X.InterfaceC357200DzS, X.C0E48
    public InterfaceC351610DqR og() {
        return this.LLJJJJLIIL;
    }

    @Override // X.InterfaceC357200DzS, X.C0E48
    public boolean sg() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC357200DzS, X.C0E48
    public boolean yh() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public C357190DzR(C1DRG c1drg) {
        this.LL = c1drg;
        NLE.loadNLELibrary$default(NLE.INSTANCE, false, C293550Bez.LIZ(), false, 5, null);
    }

    @Override // X.InterfaceC357200DzS, X.C0E48
    public void Bq(long[] jArr) {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        NLETrack nLETrackPt = Pt();
        if (nLETrackPt != null && (nLETrackSlotLLLLLLIL = LLLLLLIL()) != null) {
            int i = C349360Dmo.LIZJ;
            C350670Dov.LIZIZ(nLETrackPt, nLETrackSlotLLLLLLIL, jArr);
        }
    }

    @Override // X.InterfaceC357200DzS
    public void C91(boolean z) {
        this.LLILLJJLI = z;
    }

    @Override // X.InterfaceC357200DzS
    public void CF2(boolean z) {
        this.LLIZLLLIL = z;
    }

    @Override // X.InterfaceC357200DzS, X.C0E48
    public boolean Ej(NLEEditorListener nLEEditorListener) {
        if (this.LLJJ.contains(nLEEditorListener)) {
            LLFII().LJI().removeConsumer(nLEEditorListener);
            this.LLJJ.remove(nLEEditorListener);
            return true;
        }
        return false;
    }

    public final void G2(boolean z) {
        this.LLJILJIL = z;
    }

    @Override // X.InterfaceC357200DzS
    public void H60(InterfaceC351610DqR interfaceC351610DqR) {
        this.LLJJJJLIIL = interfaceC351610DqR;
    }

    @Override // X.InterfaceC357200DzS, X.C0E48
    public NLETrack Iu(NLEModel nLEModel) {
        if (nLEModel != null) {
            if (nLEModel.getMainTrack() == null) {
                NLETrack nLETrack = new NLETrack();
                nLETrack.setMainTrack(true);
                nLEModel.addTrack(nLETrack);
                return nLETrack;
            }
            return nLEModel.getMainTrack();
        }
        return Rn();
    }

    @Override // X.InterfaceC357200DzS
    public void Ny2(InterfaceC350970DpP interfaceC350970DpP) {
        this.LLJJIJI = interfaceC350970DpP;
    }

    public void T2(INLEMediaSession iNLEMediaSession) {
        this.LLILZIL = iNLEMediaSession;
    }

    public void W2(C0E55 c0e55) {
        this.LLJJIJIIJIL = c0e55;
    }

    @Override // X.InterfaceC357200DzS
    public void Yw0(NLEMediaConfig nLEMediaConfig) {
        this.LLILZ = nLEMediaConfig;
    }

    @Override // X.InterfaceC357200DzS, X.C0E48
    public void bl(InterfaceC350420DoW interfaceC350420DoW) {
        this.LLILZLL = interfaceC350420DoW;
    }

    @Override // X.InterfaceC357200DzS, X.C0E48
    public void bp(long j) {
        this.LLIZ = j;
    }

    @Override // X.InterfaceC357200DzS, X.C0E48
    public boolean fj(NLEEditorListener nLEEditorListener) {
        if (!Ls()) {
            this.LLJJI.add(nLEEditorListener);
            return false;
        }
        if (this.LLJJ.contains(nLEEditorListener)) {
            return false;
        }
        this.LLJJ.add(nLEEditorListener);
        LLFII().LJI().addConsumer(nLEEditorListener);
        return true;
    }

    @Override // X.InterfaceC357200DzS
    public void hi2(InterfaceC351350Dq1 interfaceC351350Dq1) {
        this.LLJJIJIL = interfaceC351350Dq1;
    }

    @Override // X.InterfaceC357200DzS
    public void ic2(boolean z) {
        this.LLJJLIIIJLLLLLLLZ = z;
    }

    @Override // X.InterfaceC357200DzS
    public void in0(InterfaceC358840E5a interfaceC358840E5a) {
        this.LLJJJJ = interfaceC358840E5a;
    }

    @Override // X.InterfaceC357200DzS
    public void lL1(boolean z) {
        this.LLILLL = z;
    }

    @Override // X.InterfaceC357200DzS, X.C0E48
    public void ok(boolean z) {
        this.LLJILJILJ = z;
    }

    @Override // X.InterfaceC357200DzS, X.C0E48
    public void onVisibilityChanged(boolean z) {
        getPlayer().onVisibilityChanged(z);
    }

    @Override // X.InterfaceC357200DzS, X.C0E48
    public void ve(InterfaceC353240Dt4 interfaceC353240Dt4) {
        this.LLJJJJJIL = interfaceC353240Dt4;
    }

    public void w2(InterfaceC356930Dz1 interfaceC356930Dz1) {
        this.LLJJJIL = interfaceC356930Dz1;
    }

    public final void o2(boolean z, boolean z2) {
        this.LLJIJIL = z;
        this.LLJ = z2;
    }

    @Override // X.InterfaceC357200DzS, X.C0E48
    public void setCanvasSize(int i, int i2) {
        INLEMediaRuntime mediaRuntimeApi;
        INLEMediaSession iNLEMediaSessionF1 = f1();
        if (iNLEMediaSessionF1 != null && (mediaRuntimeApi = iNLEMediaSessionF1.getMediaRuntimeApi()) != null) {
            mediaRuntimeApi.setCanvasSize(i, i2);
        }
    }

    private final void Z1(InterfaceC357240DzW interfaceC357240DzW, NLEError nLEError, String str) {
        if (interfaceC357240DzW != null) {
            if (nLEError.swigValue() == NLEError.SUCCESS.swigValue()) {
                this.LLJILLL = str;
                interfaceC357240DzW.onSuccess();
            } else {
                nLEError.swigValue();
                nLEError.name();
                interfaceC357240DzW.LIZJ();
            }
        }
    }

    @Override // X.InterfaceC357200DzS
    public void LE1(String str, boolean z, InterfaceC357240DzW interfaceC357240DzW) {
        INLEMediaSession iNLEMediaSessionF1;
        if (!z && (iNLEMediaSessionF1 = f1()) != null) {
            iNLEMediaSessionF1.updateNLEEditor(LLFII().LJI());
        }
        if (TextUtils.equals(str, this.LLJILLL)) {
            return;
        }
        Z1(interfaceC357240DzW, LLFII().LJI().restore(str), str);
    }

    @Override // X.InterfaceC357200DzS, X.C0E48
    public void M6(NLEEditor nLEEditor, String str, SurfaceView surfaceView, INLEMediaSession iNLEMediaSession, NLEModel nLEModel) {
        INLEPlayer playerApi;
        if (nLEEditor != null) {
            LLFII().LJJLIIIIJ(nLEEditor);
            ic2(true);
        }
        if (!Ls()) {
            this.LLJJIII = surfaceView;
            CF2(!C2281551ESb.LIZIZ.LJIIIZ());
            this.LLILZIL = iNLEMediaSession;
            C0E55 player = getPlayer();
            INLEMediaSession iNLEMediaSessionF1 = f1();
            if (iNLEMediaSessionF1 != null) {
                playerApi = iNLEMediaSessionF1.getPlayerApi();
            } else {
                playerApi = null;
            }
            player.LJIILLIIL(playerApi);
            C91(true);
            X1();
            if (C351230Dpp.LIZIZ()) {
                H2();
            }
        }
        Iterator it2 = C13LP.LLIIII(this.LLJJI).iterator();
        while (it2.hasNext()) {
            fj((NLEEditorListener) it2.next());
        }
        this.LLJJI.clear();
        INLEMediaSession iNLEMediaSessionF12 = f1();
        if (iNLEMediaSessionF12 != null) {
            iNLEMediaSessionF12.updateNLEEditor(LLFII().LJI());
        }
        if (!TextUtils.equals(str, this.LLJILLL)) {
            if (nLEModel != null) {
                LLFII().LJI().setModel(NLEModel.dynamicCast(nLEModel.deepClone()));
            } else {
                LLFII().LJI().restore(str);
            }
            this.LLJILLL = str;
        }
    }
}
