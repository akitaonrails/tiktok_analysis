package X;

import Y.AObjectS246S0100000_25;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.als.LiveEvent;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.shortvideo.d4;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0t5G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1651720t5G extends AbstractC1651330t4d implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFF;
    public static final int LLLFFI;
    public final C19A3 LLILLJJLI;
    public final C1DRG LLILLL;
    public final int LLILZ;
    public final List<C1650980t44> LLILZIL;
    public final List<C1650980t44> LLILZLL;
    public final InterfaceC1651800t5O LLIZ;
    public final C1650980t44 LLIZLLLIL;
    public final Function0<Unit> LLJ;
    public final InterfaceC1651490t4t LLJI = new InterfaceC1651490t4t() { // from class: X.0t4u
        @Override // X.InterfaceC1651490t4t
        public final C05YD<List<C1651520t4w>> LIZLLL() {
            throw new RuntimeException("ToolbarDataManager.toolbarListFlow is not accessible in old arch");
        }

        @Override // X.InterfaceC1651490t4t
        public final void LJFF() {
            throw new RuntimeException("ToolbarDataManager.dispatchOnCreate is not accessible in old arch");
        }

        @Override // X.InterfaceC1651490t4t
        public final void LIZ(Function1<? super InterfaceC577590Ml3, Unit> function1) {
            throw new RuntimeException("ToolbarDataManager.transaction is not accessible in old arch");
        }

        @Override // X.InterfaceC1651490t4t
        public final <T> C385670FAf<T> LIZIZ(InterfaceC1651540t4y<T> interfaceC1651540t4y) {
            throw new RuntimeException("ToolbarDataManager.getGlobalLiveState is not accessible in old arch");
        }

        @Override // X.InterfaceC1651490t4t
        public final <STATE extends C1ETD, TYPE extends InterfaceC1651320t4c<? extends STATE>> STATE LIZJ(TYPE type) {
            throw new RuntimeException("ToolbarDataManager.getState is not accessible in old arch");
        }

        @Override // X.InterfaceC1651490t4t
        public final <STATE extends C1ETD, TYPE extends InterfaceC1651320t4c<? extends STATE>> void LJ(TYPE type, Function1<? super STATE, ? extends STATE> function1) {
            throw new RuntimeException("ToolbarDataManager.update is not accessible in old arch");
        }

        @Override // X.InterfaceC1651490t4t
        public final <T> void LJI(InterfaceC1651540t4y<T> interfaceC1651540t4y, T t) {
            throw new RuntimeException("ToolbarDataManager.setGlobalLiveState is not accessible in old arch");
        }
    };
    public final a LLJIJIL = (a) getDiContainer().LJII(a.class, null);
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZ(getDiContainer(), C1645600svO.class, null);
    public final InterfaceC1731706qJ LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), l0.class, null);
    public final InterfaceC1650230t2r LLJILLL = (InterfaceC1650230t2r) getDiContainer().LJII(InterfaceC1650230t2r.class, null);
    public final ShortVideoContext LLJJ = (ShortVideoContext) getDiContainer().LJII(ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), ln3.a.class, null);
    public final InterfaceC1731706qJ LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1649530t1j.class, null);
    public final InterfaceC1731706qJ LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647420syK.class, null);
    public final InterfaceC1731706qJ LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1652190t61.class, null);
    public final InterfaceC1731706qJ LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), C1650260t2u.class, null);
    public final InterfaceC1731706qJ LLJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1638550sk1.class, null);
    public final InterfaceC1731706qJ LLJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), C1645380sv2.class, "lazyBeautyFilter");
    public final InterfaceC1731706qJ LLJJJJ = C1664770tQJ.LIZIZ(getDiContainer(), List.class, "toolbar_view_pool");
    public final C19EG LLJJJJJIL = (C19EG) getDiContainer().LJII(C19EG.class, null);
    public final InterfaceC1731706qJ LLJJJJLIIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648020szI.class, null);
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 668));
    public EnumC1651870t5V LLJJLIIIJLLLLLLLZ = EnumC1651870t5V.RECORD_VIDEO;
    public final InterfaceC1651080t4E LLJL = this;
    public final C560530Lyd<Unit> LLJLIL = new C560530Lyd<>();
    public final C560530Lyd<Pair<Boolean, Boolean>> LLJLILLLLZIIL = new C560530Lyd<>();
    public boolean LLJLL = true;
    public final C01GW LLJLLIL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(326));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 670));
    public boolean LLJZ = true;
    public final Function0<Unit> LLJZIJLIL = new AwS569S0100000_25(this, 671);
    public final Function0<Boolean> LLL = new AwS569S0100000_25(this, 669);
    public final InterfaceC346201Wa<C375830EoP<InterfaceC1651320t4c<?>>> LLLF = C09IR.LIZIZ(0, 0, null, 7);

    @Override // X.InterfaceC1651080t4E
    public void bW1(boolean z) {
    }

    @Override // X.InterfaceC1651080t4E
    public void o30(InterfaceC1657650tEp interfaceC1657650tEp) {
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1651720t5G.class, "recordModeLogicComponent", "getRecordModeLogicComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/component/RecordModeLogicComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1651720t5G.class, "recordStickerLogicComponent", "getRecordStickerLogicComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/RecordStickerLogicComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1651720t5G.class, "beautyApi", "getBeautyApi()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1651720t5G.class, "speedApiComponent", "getSpeedApiComponent()Lcom/ss/android/ugc/gamora/recorder/speed/SpeedApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1651720t5G.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1651720t5G.class, "recordPermissionApi", "getRecordPermissionApi()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1651720t5G.class, "recordGestureLogicComponent", "getRecordGestureLogicComponent()Lcom/bytedance/creativex/recorder/gesture/RecordGestureLogicComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C1651720t5G.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C1651720t5G.class, "lazyBeautyFilterLogic", "getLazyBeautyFilterLogic()Lcom/ss/android/ugc/aweme/property/BeautyFilterConfig;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(C1651720t5G.class, "toolbarViewPool", "getToolbarViewPool()Ljava/util/List;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS11 = new C2217381BqS(C1651720t5G.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        c09r3.getClass();
        LLLFF = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217381BqS11};
        LLLFFI = 8;
    }

    private final boolean E3() {
        Iterator<C1650980t44> it2 = this.LLILZIL.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next(), XI0().LIZIZ())) {
                return false;
            }
        }
        return true;
    }

    private final C1657710tEv H2() {
        return (C1657710tEv) this.LLJLLL.getValue();
    }

    private final InterfaceC1648020szI Op() {
        return (InterfaceC1648020szI) this.LLJJJJLIIL.getValue(this, LLLFF[10]);
    }

    private final C1650260t2u T2() {
        return (C1650260t2u) this.LLJJIJIL.getValue(this, LLLFF[6]);
    }

    private final C1645600svO W2() {
        return (C1645600svO) this.LLJILJIL.getValue(this, LLLFF[0]);
    }

    private final C1651820t5Q Z1() {
        return (C1651820t5Q) this.LLJJL.getValue();
    }

    private final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLJJIJI.getValue(this, LLLFF[4]);
    }

    private final InterfaceC1638550sk1 gq() {
        return (InterfaceC1638550sk1) this.LLJJJ.getValue(this, LLLFF[7]);
    }

    @Override // X.InterfaceC1651080t4E
    public void Bw1() {
        this.LLJLIL.LJIIJ(Unit.LIZ);
    }

    public final C1645380sv2 G2() {
        return (C1645380sv2) this.LLJJJIL.getValue(this, LLLFF[8]);
    }

    public final void W1() {
        boolean z;
        C1650980t44 c1650980t44LIZLLL;
        C1650980t44 c1650980t44LIZLLL2;
        C1650980t44 c1650980t44LIZLLL3;
        ShortVideoContext shortVideoContext = this.LLJJ;
        if (shortVideoContext.isDuetMode || shortVideoContext.LJJLL() || d4.LJJIJ(this.LLJJ) || (c1650980t44LIZLLL3 = XI0().LIZLLL()) == null) {
            z = false;
        } else {
            XI0().LJFF(c1650980t44LIZLLL3, false);
            z = true;
        }
        ShortVideoContext shortVideoContext2 = this.LLJJ;
        if (shortVideoContext2.isDuetMode && shortVideoContext2.LJJLL() && (c1650980t44LIZLLL2 = XI0().LIZLLL()) != null) {
            XI0().LJII(c1650980t44LIZLLL2, false);
            z = true;
        }
        if (C1651120t4I.LIZ() && !C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO") && this.LLJJ.creativeModel.initialModel.recordPageOptionalConfig == null && (c1650980t44LIZLLL = XI0().LIZLLL()) != null) {
            XI0().LJII(c1650980t44LIZLLL, false);
        } else if (!z) {
            return;
        }
        wP();
    }

    public final void X1() {
        C1650980t44 c1650980t44LIZIZ;
        if (C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO") || !C1651120t4I.LIZ() || (c1650980t44LIZIZ = XI0().LIZIZ()) == null) {
            return;
        }
        XI0().LJFF(c1650980t44LIZIZ, true);
    }

    public final InterfaceC1652190t61 c3() {
        return (InterfaceC1652190t61) this.LLJJIJIIJIL.getValue(this, LLLFF[5]);
    }

    public final l0 getRecordStickerLogicComponent() {
        return (l0) this.LLJILJILJ.getValue(this, LLLFF[1]);
    }

    public final InterfaceC1649530t1j i3() {
        return (InterfaceC1649530t1j) this.LLJJIII.getValue(this, LLLFF[3]);
    }

    public final List<View> q3() {
        return (List) this.LLJJJJ.getValue(this, LLLFF[9]);
    }

    public final C560530Lyd<Boolean> v3() {
        return (C560530Lyd) this.LLJLLIL.getValue();
    }

    public final ln3.a w2() {
        return (ln3.a) this.LLJJI.getValue(this, LLLFF[2]);
    }

    private final boolean B3() {
        Iterator<C1650980t44> it2 = XI0().getItems().iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next(), XI0().LIZLLL())) {
                return false;
            }
        }
        return true;
    }

    private final void registerObservers() {
        LiveEvent<AbstractC1652010t5j> liveEventXR0;
        C385670FAf<String> c385670FAfJP0;
        C385670FAf<C375830EoP<Boolean>> c385670FAfBx1;
        getDiContainer();
        if (C343070Dcf.LIZIZ()) {
            if (this.LLJIJIL.US().LIZJ().floatValue() < 1.0f) {
                View view = m3().LJI().mView;
                if (view != null) {
                    view.setLayerType(2, null);
                }
                this.LLJIJIL.Z40().LIZ(this, new AObjectS246S0100000_25(this, 614));
            }
            this.LLJIJIL.US().LIZ(this, new AObjectS246S0100000_25(this, 615));
        }
        m3().yv(this.LLJZIJLIL, this.LLL);
        this.LLJIJIL.sK0().LIZ(this, new AObjectS246S0100000_25(this, 616));
        this.LLJIJIL.RS().LIZ(this, new AObjectS246S0100000_25(this, 617));
        this.LLJIJIL.Cg1().LIZ(this, new AObjectS246S0100000_25(this, 618));
        if (C1622090sJT.LIZ(G2())) {
            whenReady(this, ln3.a.class, new AwS604S0100000_25(this, 403));
        } else {
            ln3.a aVarW2 = w2();
            if (aVarW2 != null && (liveEventXR0 = aVarW2.XR0()) != null) {
                liveEventXR0.LIZ(this, new AObjectS246S0100000_25(this, 619));
            }
        }
        this.LLJIJIL.YQ0().LIZ(this, new AObjectS246S0100000_25(this, 620));
        C1DRG diContainer = getDiContainer();
        if (C343070Dcf.LIZ()) {
            ((C0ETY) diContainer.LJII(C0ETY.class, null)).Sd(InterfaceC1628590sTx.class, new AwS604S0100000_25(this, 401));
        } else {
            C05YF c05yf = (C05YF) diContainer.LJIIL(null, InterfaceC1628590sTx.class);
            if (c05yf != null) {
                InterfaceC1628590sTx interfaceC1628590sTx = (InterfaceC1628590sTx) c05yf;
                interfaceC1628590sTx.Wv().LIZ(this, C1651950t5d.LL);
                interfaceC1628590sTx.Vk().LIZ(this, C1651960t5e.LL);
            }
        }
        InterfaceC1652190t61 interfaceC1652190t61C3 = c3();
        if (interfaceC1652190t61C3 != null && (c385670FAfBx1 = interfaceC1652190t61C3.bx1()) != null) {
            c385670FAfBx1.LIZ(this, new AObjectS246S0100000_25(this, 610));
        }
        C1DRG diContainer2 = getDiContainer();
        if (C343070Dcf.LIZ()) {
            ((C0ETY) diContainer2.LJII(C0ETY.class, null)).Sd(InterfaceC1650930t3z.class, new AwS604S0100000_25(this, 402));
        } else {
            C05YF c05yf2 = (C05YF) diContainer2.LJIIL(null, InterfaceC1650930t3z.class);
            if (c05yf2 != null) {
                ((InterfaceC1650930t3z) c05yf2).x60().LIZ(this, new AObjectS246S0100000_25(this, 611));
            }
        }
        W2().LLIZ.LIZ(this, new AObjectS246S0100000_25(this, 612));
        W2().CP1().LIZ(this, new AObjectS246S0100000_25(this, 613));
        C1650260t2u c1650260t2uT2 = T2();
        if (c1650260t2uT2 != null) {
            c1650260t2uT2.AL1(new AbstractC21664519qV() { // from class: X.0t5a
                @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
                public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                    if (motionEvent != null && motionEvent.getAction() == 0) {
                        this.LL.m3().j5();
                    }
                    return false;
                }
            }, 19, 50);
        }
        InterfaceC1638550sk1 interfaceC1638550sk1Gq = gq();
        if (interfaceC1638550sk1Gq == null || (c385670FAfJP0 = interfaceC1638550sk1Gq.jP0()) == null) {
            return;
        }
        c385670FAfJP0.LIZ(this, new InterfaceC1441305kZ() { // from class: X.0t4h
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                if (obj != null) {
                    C13LQ.LJIILLIIL(obj, new String[]{EnumC1647570syZ.RECORD_NOW.getTag(), EnumC1647570syZ.RECORD_LIGHTENING_TEXT.getTag()});
                }
            }
        });
    }

    @Override // X.InterfaceC1651080t4E
    public void Ee2() {
        Scene sceneLJI = m3().LJI();
        if (sceneLJI.isVisible()) {
            this.LLILLJJLI.hide(sceneLJI);
        }
    }

    public final void H3() {
        m3().Av();
    }

    @Override // X.InterfaceC1651080t4E
    public boolean Nq() {
        return m3().Nq();
    }

    @Override // X.InterfaceC1651080t4E
    public boolean c51() {
        return C375780EoK.LIZ(H2().mView);
    }

    public final InterfaceC1651760t5K m3() {
        return H2();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        getRecordAdapterApi().Sy2(this);
        Function0<Unit> function0 = this.LLJ;
        if (function0 != null) {
            function0.invoke();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ToolbarLogicComponent before add scene ");
        sbLIZ.append(this.LLILLJJLI.mState);
        sbLIZ.append(' ');
        sbLIZ.append(m3().LJI().mState);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI.add(this.LLILZ, m3().LJI(), "ToolbarScene");
        XI0().LJIIIIZZ(this.LLILZIL, true);
        registerObservers();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ToolbarLogicComponent after add scene ");
        sbLIZ2.append(this.LLILLJJLI.mState);
        sbLIZ2.append(' ');
        sbLIZ2.append(m3().LJI().mState);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        C1650980t44 c1650980t44LIZLLL;
        C1650980t44 c1650980t44LIZIZ;
        super.onResume();
        if (C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO") && C1651120t4I.LIZ() && (c1650980t44LIZLLL = XI0().LIZLLL()) != null && c1650980t44LIZLLL.LLJ) {
            if (!B3()) {
                if (d4.LJJIJ(this.LLJJ)) {
                    this.LLJILLL.w61(new C1648160szW((this.LLJJ.cameraComponentModel.mDurings.size() > 0 || this.LLJJ.cameraComponentModel.isMuted) ? 2 : 1));
                } else {
                    InterfaceC1651800t5O interfaceC1651800t5OXI0 = XI0();
                    C1650980t44 c1650980t44LIZLLL2 = XI0().LIZLLL();
                    if (c1650980t44LIZLLL2 == null) {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    interfaceC1651800t5OXI0.LJFF(c1650980t44LIZLLL2, true);
                    C19719512Dh.LIZ(this.LLILZIL).remove(XI0().LIZLLL());
                    C19719512Dh.LIZ(this.LLILZLL).remove(XI0().LIZLLL());
                }
            }
            if (E3() && d4.LJJIJIIJI(this.LLJJ) && (c1650980t44LIZIZ = XI0().LIZIZ()) != null) {
                this.LLILZIL.add(c1650980t44LIZIZ);
                if (this.LLJJLIIIJLLLLLLLZ == EnumC1651870t5V.RECORD_VIDEO) {
                    XI0().LJIIIIZZ(this.LLILZIL, true);
                }
            }
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onStart() {
        super.onStart();
        if (this.LLJLL) {
            this.LLJLL = false;
            if (this.LLJJ.LJJLL()) {
                C560530Lyd<Pair<Boolean, Boolean>> c560530Lyd = this.LLJLILLLLZIIL;
                Boolean bool = Boolean.FALSE;
                c560530Lyd.LJIIJ(new Pair<>(bool, bool));
            }
        }
    }

    @Override // X.InterfaceC1651080t4E
    public void vv() {
        m3().vv();
    }

    @Override // X.InterfaceC1651080t4E
    public void wP() {
        XI0().notifyDataSetChanged();
    }

    @Override // X.InterfaceC1651080t4E
    public InterfaceC1651490t4t KY1() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1651080t4E
    public LiveEvent<Unit> LLLLLZL() {
        return this.LLJLIL;
    }

    @Override // X.InterfaceC1651080t4E
    public boolean Oe0() {
        return this.LLJZ;
    }

    @Override // X.InterfaceC1651080t4E
    public InterfaceC1651800t5O XI0() {
        return this.LLIZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    public InterfaceC1651080t4E o2() {
        return this.LLJL;
    }

    @Override // X.InterfaceC1651080t4E
    public InterfaceC346201Wa<C375830EoP<InterfaceC1651320t4c<?>>> oc0() {
        return this.LLLF;
    }

    @Override // X.InterfaceC1651080t4E
    public void A2(int i) {
        m3().A2(i);
    }

    @Override // X.InterfaceC1651080t4E
    public void Et(boolean z) {
        C1650980t44 next;
        if (z) {
            Keva repo = KevaImpl.getRepo("repo_tool_bar", 0);
            boolean zLJJJLIIL = C0CHQ.LIZ().LJJIIZI().LJJJLIIL(false);
            if (!repo.getBoolean("key_ai_caption_guide_had_show", false) && !zLJJJLIIL) {
                Z1().LIZIZ();
                repo.storeBoolean("key_ai_caption_guide_had_show", true);
            }
        } else {
            Z1().LIZ();
        }
        Iterator<C1650980t44> it2 = XI0().getItems().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LL == 21) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1650980t44 c1650980t44 = next;
        if (c1650980t44 != null && c1650980t44.LLJ == (!z)) {
            c1650980t44.LLJ = z;
            XI0().LIZ(c1650980t44, true);
        }
    }

    @Override // X.InterfaceC1651080t4E
    public void Fs2(boolean z) {
        if (z) {
            EnumC1651870t5V enumC1651870t5V = EnumC1651870t5V.RECORD_PHOTO;
            this.LLJJLIIIJLLLLLLLZ = enumC1651870t5V;
            m3().Bv(enumC1651870t5V);
            XI0().LJIIIIZZ(this.LLILZLL, true);
            return;
        }
        EnumC1651870t5V enumC1651870t5V2 = EnumC1651870t5V.RECORD_VIDEO;
        this.LLJJLIIIJLLLLLLLZ = enumC1651870t5V2;
        m3().Bv(enumC1651870t5V2);
        XI0().LJIIIIZZ(this.LLILZIL, true);
    }

    @Override // X.InterfaceC1651080t4E
    public C1654400t9a Zu0(EnumC1651770t5L enumC1651770t5L) {
        return m3().Cv(enumC1651770t5L);
    }

    @Override // X.InterfaceC1651080t4E
    public View ch0(EnumC1651770t5L enumC1651770t5L) {
        return m3().wv(enumC1651770t5L);
    }

    @Override // X.InterfaceC1651080t4E
    public C1650980t44 ss(int i) {
        return m3().xv(i);
    }

    public C1651720t5G(C19A3 c19a3, C1DRG c1drg, int i, List<C1650980t44> list, List<C1650980t44> list2, InterfaceC1651800t5O interfaceC1651800t5O, C1650980t44 c1650980t44, Function0<Unit> function0) {
        this.LLILLJJLI = c19a3;
        this.LLILLL = c1drg;
        this.LLILZ = i;
        this.LLILZIL = list;
        this.LLILZLL = list2;
        this.LLIZ = interfaceC1651800t5O;
        this.LLIZLLLIL = c1650980t44;
        this.LLJ = function0;
    }
}
