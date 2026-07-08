package X;

import Y.AObjectS246S0100000_25;
import Y.ARunnableS94S0200000_25;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.als.LiveEvent;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0t77, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1652870t77 extends AbstractC2255721DQs<InterfaceC1649500t1g> implements InterfaceC1649500t1g, InterfaceC1166920gTK, InterfaceC379610EuV {
    public static final C1652880t78 LLJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static final int LLJIJIL;
    public static final long LLJILJIL;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final C1652870t77 LLILLL = this;
    public final C560530Lyd<Boolean> LLILZ = new C560530Lyd<>();
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1621970sJH.class, null);

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0t78] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1652870t77.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1652870t77.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C2217381BqS(C1652870t77.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C2217381BqS(C1652870t77.class, "recordModeApi", "getRecordModeApi()Lcom/ss/android/ugc/aweme/shortvideo/ui/component/RecordModeApiComponent;", 0)};
        LLJ = new Object() { // from class: X.0t78
        };
        LLJIJIL = 8;
        LLJILJIL = C0CHQ.LIZ().LJJJJJ().getMaxDurationResolver().getMaxShootingDuration();
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

    private final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLILZLL.getValue(this, LLJI[1]);
    }

    private final InterfaceC1621970sJH getRecordModeApi() {
        return (InterfaceC1621970sJH) this.LLIZLLLIL.getValue(this, LLJI[3]);
    }

    @Override // X.InterfaceC1649500t1g
    public boolean Xq() {
        return C523910Kgf.LIZIZ(C1447800nmM.LIZ(this.LL), C15R3.class);
    }

    public final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLILZIL.getValue(this, LLJI[0]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLIZ.getValue(this, LLJI[2]);
    }

    public final void o2() {
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(getShortVideoContext().creativeModel.musicBuzModel);
        if (aVMusicExtractAVMusic != null) {
            if (aVMusicExtractAVMusic.getShootDuration() > (getShortVideoContext().cameraComponentModel.mCurrentDurationMode ? C1649860t2G.LJI : 15000L) || Math.abs(aVMusicExtractAVMusic.getShootDuration() - aVMusicExtractAVMusic.getDuration()) >= 1000) {
                Dw(true);
            } else {
                Dw(false);
            }
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        C385670FAf<Boolean> c385670FAfCP1;
        super.onCreate();
        if (getShortVideoContext().LJJLL()) {
            Dw(false);
        }
        getCameraApiComponent().Wt0().LIZ(this, new AObjectS246S0100000_25(this, 71));
        getRecordControlApi().xk1().LJ(this, new AObjectS246S0100000_25(this, 72));
        getRecordControlApi().zx2().LIZ(this, new AObjectS246S0100000_25(this, 73));
        InterfaceC1621970sJH recordModeApi = getRecordModeApi();
        if (recordModeApi != null && (c385670FAfCP1 = recordModeApi.CP1()) != null) {
            c385670FAfCP1.LIZ(this, new AObjectS246S0100000_25(this, 74));
        }
        getRecordControlApi().yM2().LIZ(this, new AObjectS246S0100000_25(this, 75));
    }

    @Override // X.InterfaceC1649500t1g
    public /* bridge */ /* synthetic */ LiveEvent Vr() {
        return this.LLILZ;
    }

    public C1652870t77 W1() {
        return this.LLILLL;
    }

    public C560530Lyd<Boolean> X1() {
        return this.LLILZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
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

    @Override // X.InterfaceC1649500t1g
    public void Dw(boolean z) {
        this.LLILZ.LJIIJ(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1649500t1g
    public void Vp(boolean z) {
        if (C1447800nmM.LIZ(this.LL) == null) {
            return;
        }
        final NavigationScene navigationSceneLIZIZ = C1447800nmM.LIZIZ(this.LL);
        if (z && !C523910Kgf.LIZIZ(navigationSceneLIZIZ, C15R3.class)) {
            navigationSceneLIZIZ.LLLLLLLLLL(new C15R3(new AwS604S0100000_25(this, 84)), null);
            final Class<C15R3> cls = C15R3.class;
            final AwS569S0100000_25 awS569S0100000_25 = new AwS569S0100000_25(this, 160);
            navigationSceneLIZIZ.registerChildSceneLifecycleCallbacks(new C0Y8U() { // from class: X.0t9d
                @Override // X.C0Y8U, X.C19AH
                public final void LJJJ(Scene scene) {
                    if (Intrinsics.LJFF(scene.getClass(), cls)) {
                        new SafeHandler(navigationSceneLIZIZ).post(new ARunnableS94S0200000_25(navigationSceneLIZIZ, this, 28));
                        awS569S0100000_25.invoke();
                    }
                }
            }, false);
            return;
        }
        if (!Xq()) {
            return;
        }
        navigationSceneLIZIZ.onBackPressed();
    }

    public final void Z1(int i) {
        Vp(false);
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) ViewModelProviders.of(C12WG.LJ(this.LL)).get(ShortVideoContextViewModel.class)).LL;
        C1650040t2Y c1650040t2Y = ((FTCVideoRecordNewActivity) this.LL.mActivity).LLJJJJLIIL;
        getCameraApiComponent().St2().vh(i, shortVideoContext.LJII(), -1L, -1, shortVideoContext.cameraComponentModel.mMusicPath, false);
        if (i != shortVideoContext.cameraComponentModel.mMusicStart) {
            getRecordControlApi().l72(shortVideoContext.cameraComponentModel.mCurrentDurationMode, true);
        }
        CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
        cameraComponentModel.mMusicStart = i;
        C1439190nYT.LJII(cameraComponentModel.mMusicPath, MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel), i);
        if (c1650040t2Y != null) {
            getRecordControlApi().ht1(new C531060KsC(shortVideoContext.cameraComponentModel.mMaxDuration));
            getCameraApiComponent().Zl0(new C1663770tOh(true, false, false));
        }
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I> S1 getState(VM1 vm1) {
        return (S1) C1170060gYO.LIZ(this, vm1);
    }

    public C1652870t77(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
    }

    @Override // X.C11E9
    public <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, Function1<? super PROP1, ? extends R> function1) {
        return (R) C1171740gb6.LJIIIIZZ(c11e5, function1);
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
