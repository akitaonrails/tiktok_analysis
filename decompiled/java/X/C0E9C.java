package X;

import Y.AObjectS240S0100000_5;
import Y.AObserverS170S0200000_5;
import Y.AObserverS209S0100000_5;
import Y.ARunnableS105S0100000_5;
import android.os.Handler;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEMediaSettings;
import com.bytedance.ies.nle.editor_jni.NLEBranchListener;
import com.bytedance.ies.nle.editor_jni.NLEEditorListener;
import com.bytedance.scene.Scene;
import com.ss.ugc.android.editor.track.PlayPositionState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E9C, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E9C extends AbstractC381020Ewm<InterfaceC359950E9h> implements InterfaceC359950E9h, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public static final int LLJLLIL;
    public final Scene LLILLL;
    public final C1DRG LLILZ;
    public final InterfaceC359950E9h LLILZIL;
    public final MutableLiveData<Boolean> LLILZLL;
    public final MutableLiveData<Boolean> LLIZ;
    public final C560530Lyd<Unit> LLIZLLLIL;
    public final C560530Lyd<Unit> LLJ;
    public final C560530Lyd<Unit> LLJI;
    public final C560530Lyd<Unit> LLJIJIL;
    public final C560530Lyd<Unit> LLJILJIL;
    public final C560530Lyd<Unit> LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public final C1407160mio LLJLIL;
    public C0E9D LLJLILLLLZIIL;

    @Override // X.InterfaceC359950E9h
    public void dl2() {
        this.LLJILLL = true;
        if (this.LLJJ) {
            e4();
        }
        this.LLJJLIIIJLLLLLLLZ = false;
    }

    public final void o4() {
        this.LLJJIII = true;
        if (this.LLJILLL) {
            this.LLJIJIL.LJIIJ(Unit.LIZ);
        }
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0E9C.class, "controlBar", "getControlBar()Lcom/ss/ugc/android/editor/components/base/api/ConsoleBarApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0E9C.class, "bottomBarApi", "getBottomBarApi()Lcom/ss/android/ugc/gamora/editorpro/framework/bottombar/ui/BottomBarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0E9C.class, "epLegacyApi", "getEpLegacyApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EPSceneLegacyApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0E9C.class, "memeAudioCaptionApiComponent", "getMemeAudioCaptionApiComponent()Lcom/ss/android/ugc/aweme/aicaption/MemeAudioCaptionApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C0E9C.class, "memeAudioComponent", "getMemeAudioComponent()Lcom/ss/android/ugc/gamora/editor/audioservice/service/memeaudio/MemeAudioApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C0E9C.class, "epLoaderApi", "getEpLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C0E9C.class, "magicDataApi", "getMagicDataApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/magic/logic/MagicDataApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C0E9C.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        c09r3.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8};
        LLJLLIL = 8;
    }

    private final C0EY2 H2() {
        return (C0EY2) this.LLJJJJ.getValue(this, LLJLL[5]);
    }

    private final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLJL.getValue(this, LLJLL[7]);
    }

    private final C0E0G T2() {
        return (C0E0G) this.LLJJJJLIIL.getValue(this, LLJLL[6]);
    }

    private final Handler W2() {
        return (Handler) this.LLJJJJJIL.getValue();
    }

    private final InterfaceC19530111b1 c3() {
        return (InterfaceC19530111b1) this.LLJJJ.getValue(this, LLJLL[3]);
    }

    private final InterfaceC1457820o2W i3() {
        return (InterfaceC1457820o2W) this.LLJJJIL.getValue(this, LLJLL[4]);
    }

    private final C0EGY o2() {
        return (C0EGY) this.LLJJIJIIJIL.getValue(this, LLJLL[1]);
    }

    public final C0EC7 G2() {
        return (C0EC7) this.LLJJIJIL.getValue(this, LLJLL[2]);
    }

    @Override // X.InterfaceC359950E9h
    public boolean gv0() {
        return Intrinsics.LJFF(this.LLILZLL.getValue(), Boolean.TRUE) && this.LLJ.LJI() != null;
    }

    public final InterfaceC360800ECo w2() {
        return (InterfaceC360800ECo) this.LLJJIJI.getValue(this, LLJLL[0]);
    }

    private final void X1() {
        MutableLiveData mutableLiveDataLIZ;
        C0E48 c0e48W1 = W1();
        if (c0e48W1 == null || (mutableLiveDataLIZ = c0e48W1.S7().LIZ("selected_track_slot_event")) == null) {
            return;
        }
        mutableLiveDataLIZ.observe(this, new AObserverS209S0100000_5(this, 109));
    }

    @Override // X.InterfaceC359950E9h
    public void Aq() {
        C1463670oBx c1463670oBx;
        W2().removeCallbacksAndMessages(null);
        this.LLJILJIL.LJIIJ(Unit.LIZ);
        this.LLJJ = false;
        this.LLJILLL = false;
        this.LLJJI = false;
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null) {
            c0e48W1.Ej(this.LLJLIL);
        }
        this.LLJJLIIIJLLLLLLLZ = false;
        C0E48 c0e48W12 = W1();
        if (c0e48W12 == null || !c0e48W12.yh()) {
            return;
        }
        InterfaceC1452170ntP value = JY0().g().getValue();
        if (!(value instanceof C1463670oBx) || (c1463670oBx = (C1463670oBx) value) == null) {
            return;
        }
        H4(c1463670oBx);
        c1463670oBx.LJIJJ = false;
    }

    public final void F4() {
        LiveData<C0EHI> liveDataZu2;
        C0EHI value;
        C0E55 player;
        C0E0G c0e0gT2;
        C0EY2 c0ey2H2 = H2();
        if (c0ey2H2 == null || (liveDataZu2 = c0ey2H2.zu2()) == null || (value = liveDataZu2.getValue()) == null) {
            return;
        }
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enterfrom: ");
        sbLIZ.append(value.LJ.getPerformanceEnterFrom());
        C201955140j.LIZLLL(c563650M8t, "reloadDataSourceForRestore", C2188811AlT.LIZIZ(sbLIZ));
        if (value.LJ.getPerformanceEnterFrom() == C0ELK.FROM_FEED_RESTORE || value.LJ.getPerformanceEnterFrom() == C0ELK.FROM_RESTORE || (((c0e0gT2 = T2()) != null && c0e0gT2.g61()) || value.LJ.getChangeBanMusicMode() == C0ELL.FROM_ADD_MUSIC)) {
            C0E48 c0e48W1 = W1();
            if (c0e48W1 != null && (player = c0e48W1.getPlayer()) != null) {
                player.LJIILIIL();
            }
            C0E0G c0e0gT22 = T2();
            if (c0e0gT22 != null) {
                c0e0gT22.WS0(false);
            }
        }
    }

    @Override // X.InterfaceC359950E9h
    public void Iq2() {
        InterfaceC19530111b1 interfaceC19530111b1C3;
        LiveData<C0EHI> liveDataZu2;
        C0EY2 c0ey2H2 = H2();
        if (c0ey2H2 != null && (liveDataZu2 = c0ey2H2.zu2()) != null) {
            liveDataZu2.observe(this, new AObserverS170S0200000_5(liveDataZu2, new AObserverS209S0100000_5(this, 113), 41));
        }
        InterfaceC1457820o2W interfaceC1457820o2WI3 = i3();
        if (interfaceC1457820o2WI3 == null || !interfaceC1457820o2WI3.Ye2() || (interfaceC19530111b1C3 = c3()) == null) {
            return;
        }
        interfaceC19530111b1C3.aL2();
    }

    public final void e4() {
        LiveData<Unit> liveDataTl0;
        ArrayList<C0E9K> arrayList;
        C1463670oBx c1463670oBx;
        C0EY2 c0ey2H2 = H2();
        if (c0ey2H2 == null || (liveDataTl0 = c0ey2H2.Tl0()) == null || liveDataTl0.getValue() == null) {
            return;
        }
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null && c0e48W1.yh()) {
            InterfaceC1452170ntP value = JY0().g().getValue();
            if ((value instanceof C1463670oBx) && (c1463670oBx = (C1463670oBx) value) != null) {
                c1463670oBx.LJIJJ = true;
                K4(c1463670oBx);
            }
        }
        Boolean value2 = this.LLILZLL.getValue();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(value2, bool)) {
            this.LLJ.LJIIJ(Unit.LIZ);
        } else {
            this.LLILZLL.setValue(bool);
            X1();
        }
        C0E5X c0e5x = C0E5X.LIZ;
        Object objLJJLIIIJL = C13LP.LJJLIIIJL(C0E5X.LIZLLL);
        if (objLJJLIIIJL != null) {
            ConcurrentHashMap<String, ArrayList<C0E9K>> concurrentHashMap = C0E5X.LIZIZ;
            if (concurrentHashMap.containsKey(objLJJLIIIJL) && (arrayList = concurrentHashMap.get(objLJJLIIIJL)) != null) {
                arrayList.size();
                Iterator<C0E9K> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().onShow();
                }
            }
        }
        C0E48 c0e48W12 = W1();
        if (c0e48W12 != null) {
            c0e48W12.onVisibilityChanged(true);
        }
        C786410Ut5.LJJZZIII(W2(), new ARunnableS105S0100000_5(this, 75));
        if (this.LLJJIII) {
            o4();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        LiveData<Unit> liveDataTl0;
        LiveData<C0EHI> liveDataZu2;
        super.onCreate();
        C0EY2 c0ey2H2 = H2();
        if (c0ey2H2 != null && (liveDataZu2 = c0ey2H2.zu2()) != null) {
            liveDataZu2.observe(this, new AObserverS209S0100000_5(this, 110));
        }
        C0EY2 c0ey2H22 = H2();
        if (c0ey2H22 != null && (liveDataTl0 = c0ey2H22.Tl0()) != null) {
            liveDataTl0.observe(this, new AObserverS209S0100000_5(this, 111));
        }
        this.LLJI.LIZ(this, new AObjectS240S0100000_5(this, 145));
        o2().zb0().observe(this, new AObserverS209S0100000_5(this, 112));
    }

    public final void z4() {
        C358780E4u c358780E4uXJ2;
        C0E55 player;
        INLEMediaSettings mediaSettingApi;
        C358780E4u c358780E4uXJ22;
        C0EC7 c0ec7G2 = G2();
        if (c0ec7G2 != null && (c358780E4uXJ22 = c0ec7G2.xJ2()) != null) {
            c358780E4uXJ22.LJIILIIL();
        }
        C0E48 c0e48W1 = W1();
        if (c0e48W1 == null) {
            return;
        }
        INLEMediaSession iNLEMediaSessionF1 = c0e48W1.f1();
        if (iNLEMediaSessionF1 != null && (mediaSettingApi = iNLEMediaSessionF1.getMediaSettingApi()) != null) {
            mediaSettingApi.setLoopPlay(true);
        }
        c0e48W1.getPlayer().LJIILL(false);
        C0EC7 c0ec7G22 = G2();
        if (c0ec7G22 != null && (c358780E4uXJ2 = c0ec7G22.xJ2()) != null) {
            C0E48 c0e48LIZLLL = c358780E4uXJ2.LIZLLL();
            long jJh = (c0e48LIZLLL == null || (player = c0e48LIZLLL.getPlayer()) == null) ? 0L : player.Jh();
            C0E56 c0e56 = c358780E4uXJ2.LLJJ;
            c0e56.LIZLLL.cancel();
            c0e56.LJFF = jJh;
            c0e56.LJI = jJh;
            c358780E4uXJ2.LJI().zv(new PlayPositionState(C351220Dpo.LLLLLLJ(jJh), false, false), false);
        }
        c0e48W1.getPlayer().LLIL(false);
        c0e48W1.getPlayer().onVisibilityChanged(true);
    }

    @Override // X.InterfaceC359950E9h
    public /* bridge */ /* synthetic */ LiveEvent AU() {
        return this.LLIZLLLIL;
    }

    public C560530Lyd<Unit> B3() {
        return this.LLJ;
    }

    @Override // X.InterfaceC359950E9h
    public /* bridge */ /* synthetic */ LiveEvent Dx0() {
        return this.LLJILJIL;
    }

    public C560530Lyd<Unit> E3() {
        return this.LLJILJILJ;
    }

    public MutableLiveData<Boolean> H3() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC359950E9h
    public /* bridge */ /* synthetic */ LiveEvent Hy() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC359950E9h
    public /* bridge */ /* synthetic */ LiveEvent JI() {
        return this.LLJ;
    }

    @Override // X.InterfaceC359950E9h
    public /* bridge */ /* synthetic */ LiveEvent K50() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC359950E9h
    public /* bridge */ /* synthetic */ LiveData N71() {
        return this.LLIZ;
    }

    public MutableLiveData<Boolean> O3() {
        return this.LLILZLL;
    }

    public C560530Lyd<Unit> Q3() {
        return this.LLJI;
    }

    @Override // X.InterfaceC359950E9h
    public /* bridge */ /* synthetic */ LiveData QO0() {
        return this.LLILZLL;
    }

    public InterfaceC359950E9h Z1() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC359950E9h
    public boolean gn1() {
        return this.LLJJI;
    }

    public C560530Lyd<Unit> m3() {
        return this.LLJIJIL;
    }

    public C560530Lyd<Unit> q3() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC359950E9h
    public /* bridge */ /* synthetic */ LiveEvent uQ2() {
        return this.LLJI;
    }

    public C560530Lyd<Unit> v3() {
        return this.LLIZLLLIL;
    }

    private final void H4(C1463670oBx c1463670oBx) {
        C0E9E c0e9e;
        c1463670oBx.LJIL = null;
        C0E9D c0e9d = this.LLJLILLLLZIIL;
        if (c0e9d != null && (c0e9e = c0e9d.LIZ) != null) {
            C0E9H c0e9h = c1463670oBx.LJ;
            for (NLEEditorListener nLEEditorListener : c0e9e.LIZ) {
                if (nLEEditorListener != null) {
                    c0e9h.addConsumer(nLEEditorListener);
                }
            }
            NLEEditorListener nLEEditorListener2 = c0e9e.LIZIZ;
            if (nLEEditorListener2 != null) {
                c0e9h.setListener(nLEEditorListener2);
            }
            NLEBranchListener nLEBranchListener = c0e9e.LIZJ;
            if (nLEBranchListener != null) {
                c0e9h.setBranchListener(nLEBranchListener);
            }
        }
        this.LLJLILLLLZIIL = null;
    }

    private final void K4(C1463670oBx c1463670oBx) {
        List<NLEEditorListener> listPq;
        if (this.LLJLILLLLZIIL != null) {
            return;
        }
        C0E9E c0e9e = c1463670oBx.LJIJJLI;
        ArrayList<NLEEditorListener> arrayList = new ArrayList(c0e9e.LIZ);
        C0E9E c0e9e2 = new C0E9E(arrayList, c0e9e.LIZIZ, c0e9e.LIZJ);
        C0E48 c0e48W1 = W1();
        if (c0e48W1 == null || (listPq = c0e48W1.pq()) == null) {
            listPq = C13BV.INSTANCE;
        }
        arrayList.removeAll(listPq);
        for (NLEEditorListener nLEEditorListener : arrayList) {
            if (nLEEditorListener != null) {
                c1463670oBx.LJ.removeConsumer(nLEEditorListener);
            }
        }
        c0e9e2.LIZIZ = null;
        c0e9e2.LIZJ = null;
        C0E9D c0e9d = new C0E9D(c0e9e2, new AwS584S0100000_5(this, 788));
        c1463670oBx.LJIL = c0e9d;
        this.LLJLILLLLZIIL = c0e9d;
    }

    public C0E9C(Scene scene, C1DRG c1drg) {
        super(c1drg);
        this.LLILLL = scene;
        this.LLILZ = c1drg;
        this.LLILZIL = this;
        this.LLILZLL = new MutableLiveData<>();
        this.LLIZ = new MutableLiveData<>();
        this.LLIZLLLIL = new C560530Lyd<>();
        this.LLJ = new C560530Lyd<>();
        this.LLJI = new C560530Lyd<>();
        this.LLJIJIL = new C560530Lyd<>();
        this.LLJILJIL = new C560530Lyd<>();
        this.LLJILJILJ = new C560530Lyd<>();
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC360800ECo.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), C0EGY.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), C0EC7.class, null);
        this.LLJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC19530111b1.class, null);
        this.LLJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1457820o2W.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(getDiContainer(), C0EY2.class, null);
        this.LLJJJJJIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(275));
        this.LLJJJJLIIL = C1664770tQJ.LIZIZ(getDiContainer(), C0E0G.class, null);
        this.LLJJL = true;
        this.LLJL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);
        this.LLJLIL = new C1407160mio(new AwS549S0100000_5(this, 939));
    }
}
