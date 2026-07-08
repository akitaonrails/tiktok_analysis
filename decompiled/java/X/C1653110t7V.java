package X;

import Y.AObjectS246S0100000_25;
import Y.AObjectS306S0200000_25;
import Y.ARunnableS58S0300000_25;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.als.h0;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0t7V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1653110t7V extends AbstractC2255721DQs<InterfaceC1647280sy6> implements InterfaceC1166920gTK, InterfaceC1647280sy6, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public static final int LLJJIJIL;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final List<InterfaceC1653190t7d> LLILLL;
    public final InterfaceC1647280sy6 LLILZ = this;
    public final a LLILZIL;
    public final InterfaceC1731706qJ LLILZLL;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public a6n.a LLJI;
    public final h0<C1647390syH> LLJIJIL;
    public final C560530Lyd<String> LLJILJIL;
    public final C385670FAf<C1647390syH> LLJILJILJ;
    public final C1653170t7b LLJILLL;
    public final C560530Lyd<Boolean> LLJJ;
    public final C1167000gTS LLJJI;
    public boolean LLJJIII;
    public final C01GW LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1653110t7V.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1653110t7V.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1653110t7V.class, "recordModeApi", "getRecordModeApi()Lcom/ss/android/ugc/aweme/shortvideo/ui/component/RecordModeApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1653110t7V.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
        LLJJIJIL = 8;
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public InterfaceC960503pD getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    private final C1649460t1c Z1() {
        return (C1649460t1c) this.LLJJIJI.getValue();
    }

    private final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLIZ.getValue(this, LLJJIJIIJIL[1]);
    }

    private final InterfaceC1621970sJH getRecordModeApi() {
        return (InterfaceC1621970sJH) this.LLIZLLLIL.getValue(this, LLJJIJIIJIL[2]);
    }

    @Override // X.InterfaceC1647280sy6
    public int bottomTabSize() {
        return ((ArrayList) this.LLJILLL.LIZLLL).size();
    }

    @Override // X.InterfaceC1647280sy6
    public String defaultBottomTab() {
        List<C1653090t7T> list = this.LLJILLL.LIZLLL;
        if (C086I.LIZIZ(list)) {
            return null;
        }
        Iterator<C1653090t7T> it2 = list.iterator();
        while (it2.hasNext()) {
            C1653330t7r c1653330t7r = it2.next().LIZ;
            if (c1653330t7r.LIZLLL) {
                return c1653330t7r.LIZIZ;
            }
        }
        return null;
    }

    public final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLILZLL.getValue(this, LLJJIJIIJIL[0]);
    }

    @Override // X.InterfaceC1647280sy6
    public String getCurrentBottomTag() {
        return this.LLJILLL.LJI();
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLJ.getValue(this, LLJJIJIIJIL[3]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        C385670FAf<Boolean> c385670FAfCP1;
        super.onCreate();
        InterfaceC1650230t2r cameraApiComponent = getCameraApiComponent();
        Cert cert = C1655520tBO.LIZ;
        cameraApiComponent.PR(C1655520tBO.LIZ, false);
        a6n.a aVar = (a6n.a) this.LL.getScope().LJ("record_env_context");
        this.LLJI = aVar;
        this.LLJILLL.LJIIIZ(aVar, this.LLILLL, this.LLJIJIL, this.LLJILJIL);
        List<C1653090t7T> list = this.LLJILLL.LIZLLL;
        Iterator<C1653090t7T> it2 = list.iterator();
        while (it2.hasNext()) {
            AbstractC1653180t7c abstractC1653180t7c = it2.next().LIZIZ;
            if (abstractC1653180t7c != null) {
                C1658150tFd.LIZ(this.LL, R.id.sz5, abstractC1653180t7c, abstractC1653180t7c.getTag());
            }
        }
        this.LL.add(R.id.sz5, this.LLJJI, "FTCRecordBottomTabScene");
        init(this.LL, list);
        setDefaultSelectedTab(this.LL, list);
        getBottomTabIndexChangeEvent().LIZ(this, new AObjectS246S0100000_25(this, 46));
        getRecordControlApi().xk1().LJ(this, new AObjectS246S0100000_25(this, 47));
        getRecordControlApi().cJ0().LIZ(this, new AObjectS246S0100000_25(this, 48));
        getRecordControlApi().xM2().LIZ(this, new AObjectS246S0100000_25(this, 49));
        getRecordControlApi().zx2().LIZ(this, new AObjectS246S0100000_25(this, 50));
        InterfaceC1621970sJH recordModeApi = getRecordModeApi();
        if (recordModeApi != null && (c385670FAfCP1 = recordModeApi.CP1()) != null) {
            c385670FAfCP1.LIZ(this, new AObjectS246S0100000_25(this, 51));
        }
        getCameraApiComponent().bu2().LIZ(this, new AObjectS246S0100000_25(this, 52));
        getCameraApiComponent().Dm2().LIZ(this, new AObjectS246S0100000_25(this, 45));
        getCameraApiComponent().PB(new C1441530ncF());
    }

    public InterfaceC1647280sy6 X1() {
        return this.LLILZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1647280sy6
    public C385670FAf<C1647390syH> getBottomTabIndexChangeEvent() {
        return this.LLJILJILJ;
    }

    public final List<InterfaceC1653190t7d> getBottoms() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public final C19A3 getParentScene() {
        return this.LL;
    }

    @Override // X.C11DL
    public /* bridge */ /* synthetic */ InterfaceC874803bO getReceiver() {
        getReceiver();
        return this;
    }

    @Override // X.InterfaceC1647280sy6
    public void Be0(String str) {
        this.LLJILLL.LJIILIIL(str, true, 0, false);
    }

    @Override // X.InterfaceC1647280sy6
    public void configSwitchDuration(C1648150szV c1648150szV) {
        Z1().onEvent(c1648150szV);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I> S1 getState(VM1 vm1) {
        return (S1) C1170060gYO.LIZ(this, vm1);
    }

    public final void o2(C1647390syH c1647390syH) {
        String str = "";
        for (C1653090t7T c1653090t7T : (ArrayList) this.LLJILLL.LIZLLL) {
            if (TextUtils.equals((CharSequence) c1647390syH.LIZIZ, c1653090t7T.LIZ.LIZIZ)) {
                str = c1653090t7T.LIZ.LIZJ;
            }
        }
        if (TextUtils.equals(str, "")) {
            return;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", getShortVideoContext().getCreationId());
        c0lab.LJ("shoot_way", getShortVideoContext().shootWay);
        c0lab.LIZ(getShortVideoContext().draftId, "draft_id");
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LJ("to_status", str);
        C20684815ws.LJIILLIIL("change_record_mode", c0lab.LIZ);
    }

    @Override // X.InterfaceC1647280sy6
    public void showBottomTab(boolean z) {
        this.LLJJ.LJIIJ(Boolean.valueOf(z));
    }

    private final void init(C19A3 c19a3, List<C1653090t7T> list) {
        C1653090t7T next;
        Iterator<C1653090t7T> it2 = list.iterator();
        while (it2.hasNext()) {
            observeBottomTabVisibility(c19a3, it2.next());
        }
        this.LLJJ.LIZ(c19a3, new AObjectS246S0100000_25(c19a3, 44));
        Iterator<C1653090t7T> it3 = list.iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                if (next.LIZ.LIZLLL) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1653090t7T c1653090t7T = next;
        if (c1653090t7T != null) {
            changeToDefaultTab(this, c19a3, c1653090t7T, true);
        }
    }

    private final void observeBottomTabVisibility(C19A3 c19a3, C1653090t7T c1653090t7T) {
        c1653090t7T.LIZJ.observe(c19a3, new AObjectS306S0200000_25((Object) c1653090t7T, (Object) c19a3, (InterfaceC1648570t0B) 3));
    }

    private final void setDefaultSelectedTab(C19A3 c19a3, List<C1653090t7T> list) {
        C1653090t7T next;
        if (this.LLJJIII) {
            return;
        }
        this.LLJJIII = true;
        Iterator<C1653090t7T> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZ.LIZLLL) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1653090t7T c1653090t7T = next;
        if (c1653090t7T != null) {
            changeToDefaultTab(this, c19a3, c1653090t7T, false);
            this.LLJILLL.LJIILJJIL(c1653090t7T);
        }
    }

    @Override // X.C11E9
    public <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, Function1<? super PROP1, ? extends R> function1) {
        return (R) C1171740gb6.LJIIIIZZ(c11e5, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1653110t7V(C19A3 c19a3, C1DRG c1drg, List<? extends InterfaceC1653190t7d> list) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
        this.LLILLL = list;
        a aVar = (a) getDiContainer().LJII(a.class, null);
        this.LLILZIL = aVar;
        this.LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1621970sJH.class, null);
        this.LLJ = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
        h0<C1647390syH> h0Var = new h0<>(new C1647390syH(null, "RecordShoot15s", 0, false, false, false, null, false, false, 496));
        this.LLJIJIL = h0Var;
        this.LLJILJIL = new C560530Lyd<>();
        this.LLJILJILJ = h0Var;
        C1653170t7b c1653170t7b = new C1653170t7b(getCameraApiComponent(), LifecycleOwnerKt.getLifecycleScope(c19a3));
        this.LLJILLL = c1653170t7b;
        this.LLJJ = new C560530Lyd<>();
        this.LLJJI = new C1167000gTS(getShortVideoContext(), c1653170t7b, aVar.va());
        this.LLJJIJI = C452501pT.LIZ(EnumC452301pR.NONE, new AwS569S0100000_25(this, 155));
    }

    @Override // X.InterfaceC1647280sy6
    public void I81(int i, InterfaceC1653190t7d interfaceC1653190t7d, int i2) {
        a6n.a aVar;
        C19A3 c19a3 = this.LL;
        Iterator<C1653090t7T> it2 = this.LLJILLL.LIZLLL.iterator();
        while (true) {
            aVar = null;
            if (!it2.hasNext()) {
                break;
            }
            C1653090t7T next = it2.next();
            String str = next.LIZ.LIZIZ;
            a6n.a aVar2 = this.LLJI;
            if (aVar2 == null) {
                aVar2 = null;
            }
            if (Intrinsics.LJFF(str, interfaceC1653190t7d.createBottomTabItem(aVar2).LIZIZ)) {
                if (next != null) {
                    return;
                }
            }
        }
        C1653170t7b c1653170t7b = this.LLJILLL;
        a6n.a aVar3 = this.LLJI;
        if (aVar3 != null) {
            aVar = aVar3;
        }
        C1653090t7T c1653090t7TLIZ = c1653170t7b.LIZ(aVar, i, interfaceC1653190t7d);
        observeBottomTabVisibility(c19a3, c1653090t7TLIZ);
        AbstractC1653180t7c abstractC1653180t7c = c1653090t7TLIZ.LIZIZ;
        if (abstractC1653180t7c != null) {
            C1658150tFd.LIZ(c19a3, R.id.sz6, abstractC1653180t7c, abstractC1653180t7c.getTag());
        }
        if (c1653090t7TLIZ.LIZ.LIZLLL) {
            C12WG.LIZLLL(c19a3, new ARunnableS58S0300000_25(this, c19a3, c1653090t7TLIZ, 1), 500L);
        }
    }

    @Override // X.C11E9
    public <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, R> R withState(VM1 vm1, VM2 vm2, Function2<? super S1, ? super S2, ? extends R> function2) {
        return (R) C1171740gb6.LIZLLL(vm1, vm2, function2);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, Function2<? super PROP1, ? super PROP2, ? extends R> function2) {
        return (R) C1171740gb6.LJII(c11e5, c11e52, function2);
    }

    public static final void changeToDefaultTab(C1653110t7V c1653110t7V, C19A3 c19a3, C1653090t7T c1653090t7T, boolean z) {
        C1167000gTS c1167000gTS = (C1167000gTS) c19a3.findSceneByTag("FTCRecordBottomTabScene");
        String str = c1653090t7T.LIZ.LIZIZ;
        TabHost tabHost = c1167000gTS.LLJILJILJ;
        TabHost tabHost2 = null;
        if (tabHost == null) {
            tabHost = null;
        }
        int tabCount = tabHost.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            TabHost tabHost3 = c1167000gTS.LLJILJILJ;
            if (tabHost3 == null) {
                tabHost3 = null;
            }
            if (Intrinsics.LJFF(str, tabHost3.LIZ(i))) {
                if (i >= 0) {
                    TabHost tabHost4 = c1167000gTS.LLJILJILJ;
                    if (tabHost4 != null) {
                        tabHost2 = tabHost4;
                    }
                    tabHost2.LJFF(z, i, 0, false, true);
                    return;
                }
                return;
            }
        }
    }

    @Override // X.InterfaceC1166920gTK
    public <S extends C004I, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public <S extends C004I, A> void subscribeEvent(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends C0LCS<? extends A>> interfaceC2217241BqE, C1765020w20<C11EC<C0LCS<A>>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZLLL(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, VM3 extends JediViewModel<S3>, S3 extends C004I, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, InterfaceC1631620sYq<? super S1, ? super S2, ? super S3, ? extends R> interfaceC1631620sYq) {
        return (R) C1171740gb6.LIZJ(vm1, vm2, vm3, interfaceC1631620sYq);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, M3 extends C11E5<S3, PROP3>, PROP3 extends C004I, S3 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, C11E5<S3, PROP3> c11e53, InterfaceC1631620sYq<? super PROP1, ? super PROP2, ? super PROP3, ? extends R> interfaceC1631620sYq) {
        return (R) C1171740gb6.LJI(c11e5, c11e52, c11e53, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, VM3 extends JediViewModel<S3>, S3 extends C004I, VM4 extends JediViewModel<S4>, S4 extends C004I, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, InterfaceC1631630sYr<? super S1, ? super S2, ? super S3, ? super S4, ? extends R> interfaceC1631630sYr) {
        return (R) C1171740gb6.LIZIZ(vm1, vm2, vm3, vm4, interfaceC1631630sYr);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, M3 extends C11E5<S3, PROP3>, PROP3 extends C004I, S3 extends C004I, M4 extends C11E5<S4, PROP4>, PROP4 extends C004I, S4 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, C11E5<S3, PROP3> c11e53, C11E5<S4, PROP4> c11e54, InterfaceC1631630sYr<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? extends R> interfaceC1631630sYr) {
        return (R) C1171740gb6.LJFF(c11e5, c11e52, c11e53, c11e54, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, VM3 extends JediViewModel<S3>, S3 extends C004I, VM4 extends JediViewModel<S4>, S4 extends C004I, VM5 extends JediViewModel<S5>, S5 extends C004I, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, VM5 vm5, InterfaceC1685420txc<? super S1, ? super S2, ? super S3, ? super S4, ? super S5, ? extends R> interfaceC1685420txc) {
        return (R) C1171740gb6.LIZ(vm1, vm2, vm3, vm4, vm5, interfaceC1685420txc);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, M3 extends C11E5<S3, PROP3>, PROP3 extends C004I, S3 extends C004I, M4 extends C11E5<S4, PROP4>, PROP4 extends C004I, S4 extends C004I, M5 extends C11E5<S5, PROP5>, PROP5 extends C004I, S5 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, C11E5<S3, PROP3> c11e53, C11E5<S4, PROP4> c11e54, C11E5<S5, PROP5> c11e55, InterfaceC1685420txc<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? super PROP5, ? extends R> interfaceC1685420txc) {
        return (R) C1171740gb6.LJ(c11e5, c11e52, c11e53, c11e54, c11e55, interfaceC1685420txc);
    }

    @Override // X.C11E9
    public <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }

    public <S extends C004I, A, B, C, D, E> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1765020w20<C11EE<A, B, C, D, E>> c1765020w20, InterfaceC1685430txd<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C11EA.LIZJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1765020w20, interfaceC1685430txd);
    }
}
