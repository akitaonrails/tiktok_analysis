package X;

import Y.AObjectS246S0100000_25;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.LiveEvent;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS674S0100000_25;
import lnn.q;

/* JADX INFO: renamed from: X.0t74, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1652840t74 extends AbstractC2255721DQs<InterfaceC1652770t6x> implements InterfaceC1652770t6x, InterfaceC1166920gTK, InterfaceC379610EuV {
    public static final C1652860t76 LLJJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final long LLJJIJI;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final InterfaceC1652470t6T LLJILJILJ;
    public final C1652840t74 LLILLL = this;
    public final C560530Lyd<Unit> LLILZ = new C560530Lyd<>();
    public final C560530Lyd<Unit> LLILZIL = new C560530Lyd<>();
    public final C560530Lyd<Boolean> LLILZLL = new C560530Lyd<>();
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1621970sJH.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), q.class, null);
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1628590sTx.class, null);
    public final C15KT LLJILLL = new C15KT(new AwS569S0100000_25(this, 585), new AwS674S0100000_25(this, 25));
    public final InterfaceC1737690vJv LLJJ = new C1698360uIU(this, 4);

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0t76] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1652840t74.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1652840t74.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C2217381BqS(C1652840t74.class, "recordModeApi", "getRecordModeApi()Lcom/ss/android/ugc/aweme/shortvideo/ui/component/RecordModeApiComponent;", 0), new C2217381BqS(C1652840t74.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C2217381BqS(C1652840t74.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new C2217381BqS(C1652840t74.class, "chooseMusicApiComponent", "getChooseMusicApiComponent()Lcom/ss/android/ugc/gamora/recorder/choosemusic/ChooseMusicApiComponent;", 0)};
        LLJJI = new Object() { // from class: X.0t76
        };
        LLJJIJI = C0CHQ.LIZ().LJJJJJ().getMaxDurationResolver().getMaxShootingDuration();
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

    public final void onBackPressed() {
        W1(true);
        InterfaceC1652470t6T interfaceC1652470t6T = this.LLJILJILJ;
        if (interfaceC1652470t6T != null) {
            interfaceC1652470t6T.zh0(0, false);
        }
        i3();
    }

    private final boolean H2() {
        Boolean boolLJIILJJIL;
        IMusicService iMusicService = (IMusicService) PluggableExtentionKt.pluggableSpi$default(IMusicService.class, false, false, false, 14, null);
        if (iMusicService == null || (boolLJIILJJIL = iMusicService.LJIILJJIL()) == null) {
            return true;
        }
        return boolLJIILJJIL.booleanValue();
    }

    private final void c3() {
        C1453500nvY c1453500nvY = C1453500nvY.LIZ;
        String creationId = getShortVideoContext().getCreationId();
        String strLIZJ = C1429680nJ8.LIZJ(getShortVideoContext().creativeModel.musicBuzModel);
        c1453500nvY.getClass();
        C1453500nvY.LIZ("video_shoot_page", creationId, strLIZJ, "trim_click_done");
    }

    private final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLIZ.getValue(this, LLJJIII[0]);
    }

    private final InterfaceC1621970sJH getRecordModeApi() {
        return (InterfaceC1621970sJH) this.LLJ.getValue(this, LLJJIII[2]);
    }

    private final q getStickerApiComponent() {
        return (q) this.LLJIJIL.getValue(this, LLJJIII[4]);
    }

    private final void i3() {
        C1447800nmM.LIZIZ(this.LL).LLLLLLLZIL(this.LLJJ);
    }

    private final void m3() {
        IMusicService iMusicService = (IMusicService) PluggableExtentionKt.pluggableSpi$default(IMusicService.class, false, false, false, 14, null);
        if (iMusicService != null) {
            iMusicService.LJJI();
        }
    }

    @Override // X.InterfaceC1652770t6x
    public boolean Xq() {
        return C523910Kgf.LIZIZ(C1447800nmM.LIZ(this.LL), C15KT.class);
    }

    public final InterfaceC1628590sTx Z1() {
        return (InterfaceC1628590sTx) this.LLJILJIL.getValue(this, LLJJIII[5]);
    }

    public final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLIZLLLIL.getValue(this, LLJJIII[1]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLJI.getValue(this, LLJJIII[3]);
    }

    public void T2() {
        getRecordControlApi().ht1(new C531060KsC(getShortVideoContext().cameraComponentModel.mMaxDuration));
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        C385670FAf<Boolean> c385670FAfCP1;
        super.onCreate();
        if (getShortVideoContext().LJJLL()) {
            Dw(false);
        }
        getCameraApiComponent().Wt0().LIZ(this, new AObjectS246S0100000_25(this, 463));
        getRecordControlApi().xk1().LJ(this, new AObjectS246S0100000_25(this, 464));
        getRecordControlApi().zx2().LIZ(this, new AObjectS246S0100000_25(this, 465));
        InterfaceC1621970sJH recordModeApi = getRecordModeApi();
        if (recordModeApi != null && (c385670FAfCP1 = recordModeApi.CP1()) != null) {
            c385670FAfCP1.LIZ(this, new AObjectS246S0100000_25(this, 466));
        }
        getRecordControlApi().yM2().LIZ(this, new AObjectS246S0100000_25(this, 467));
    }

    public final void q3() {
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(getShortVideoContext().creativeModel.musicBuzModel);
        if (aVMusicExtractAVMusic != null) {
            TA0(getShortVideoContext().cameraComponentModel.mCurrentDurationMode ? C1649860t2G.LJI : 15000L, aVMusicExtractAVMusic);
        } else {
            Dw(false);
        }
    }

    public C560530Lyd<Boolean> G2() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1652770t6x
    public /* bridge */ /* synthetic */ LiveEvent Lt0() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1652770t6x
    public /* bridge */ /* synthetic */ LiveEvent Vr() {
        return this.LLILZLL;
    }

    public C1652840t74 X1() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1652770t6x
    public /* bridge */ /* synthetic */ LiveEvent dk1() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
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

    public C560530Lyd<Unit> o2() {
        return this.LLILZIL;
    }

    public C560530Lyd<Unit> w2() {
        return this.LLILZ;
    }

    private final void W1(boolean z) {
        Effect effectLLILIL;
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        q stickerApiComponent = getStickerApiComponent();
        if (stickerApiComponent != null && (interfaceC1624480sNKC0 = stickerApiComponent.C0()) != null) {
            effectLLILIL = interfaceC1624480sNKC0.LLILIL();
        } else {
            effectLLILIL = null;
        }
        if (C1624200sMs.LJIILIIL(effectLLILIL)) {
            if (z) {
                getCameraApiComponent().St2().t1();
            } else {
                getCameraApiComponent().St2().LJLL();
            }
        }
    }

    @Override // X.InterfaceC1652770t6x
    public void Dw(boolean z) {
        this.LLILZLL.LJIIJ(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1652770t6x
    public void LLLIIII(List<Integer> list) {
        this.LLJILLL.LLJJJIL = list;
    }

    @Override // X.InterfaceC1652770t6x
    public void Vp(boolean z) {
        if (C1447800nmM.LIZ(this.LL) == null) {
            return;
        }
        NavigationScene navigationSceneLIZIZ = C1447800nmM.LIZIZ(this.LL);
        if (z && !C523910Kgf.LIZIZ(navigationSceneLIZIZ, C15KT.class)) {
            InterfaceC1652470t6T interfaceC1652470t6T = this.LLJILJILJ;
            if (interfaceC1652470t6T != null) {
                interfaceC1652470t6T.zh0(0, true);
            }
            InterfaceC1652470t6T interfaceC1652470t6T2 = this.LLJILJILJ;
            if (interfaceC1652470t6T2 != null) {
                interfaceC1652470t6T2.rZ0(null, false);
            }
            W1(false);
            navigationSceneLIZIZ.LLLLLLLLLL(this.LLJILLL, null);
            navigationSceneLIZIZ.LLLIILIL(this, this.LLJJ);
            return;
        }
        if (!Xq()) {
            return;
        }
        navigationSceneLIZIZ.remove(this.LLJILLL);
        i3();
        if (C12DO.LIZ()) {
            return;
        }
        if (C0BWI.LIZ() && !H2()) {
            c3();
            InterfaceC1628590sTx interfaceC1628590sTxZ1 = Z1();
            if (interfaceC1628590sTxZ1 != null) {
                interfaceC1628590sTxZ1.U1();
            }
            m3();
            return;
        }
        InterfaceC1628590sTx interfaceC1628590sTxZ12 = Z1();
        if (interfaceC1628590sTxZ12 == null) {
            return;
        }
        interfaceC1628590sTxZ12.nc1(false);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I> S1 getState(VM1 vm1) {
        return (S1) C1170060gYO.LIZ(this, vm1);
    }

    public C1652840t74(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
        this.LLJILJILJ = (InterfaceC1652470t6T) c1drg.LJIIL(null, InterfaceC1652470t6T.class);
    }

    @Override // X.InterfaceC1652770t6x
    public void TA0(long j, AVMusic aVMusic) {
        long localMusicDuration;
        int i = aVMusic.musicType;
        if (i == 1) {
            if (aVMusic.getShootDuration() <= j && Math.abs(aVMusic.getShootDuration() - aVMusic.getDuration()) < 1000) {
                Dw(false);
                return;
            } else {
                Dw(true);
                return;
            }
        }
        if (i != 0) {
            return;
        }
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(getShortVideoContext().creativeModel.musicBuzModel);
        if (aVMusicExtractAVMusic != null) {
            localMusicDuration = aVMusicExtractAVMusic.getLocalMusicDuration();
        } else {
            localMusicDuration = 0;
        }
        if (localMusicDuration > j) {
            Dw(true);
        } else {
            Dw(false);
        }
    }

    @Override // X.InterfaceC1652770t6x
    public void Uj2(int i, int i2) {
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) C1659630tI1.LJIIIIZZ(this.LL, null, null, 6).get(ShortVideoContextViewModel.class)).LL;
        if (C1452420nto.LIZ()) {
            InterfaceC2254081DKk interfaceC2254081DKkSt2 = getCameraApiComponent().St2();
            String str = shortVideoContext.cameraComponentModel.mMusicPath;
            long jLJII = shortVideoContext.LJII();
            MusicBuzModel musicBuzModel = shortVideoContext.creativeModel.musicBuzModel;
            interfaceC2254081DKkSt2.vh(i, jLJII, i2, musicBuzModel.musicMaxLoopDuration, str, musicBuzModel.shouldMusicLoop);
        } else {
            getCameraApiComponent().St2().vh(i, shortVideoContext.LJII(), -1L, -1, shortVideoContext.cameraComponentModel.mMusicPath, false);
        }
        if (i != shortVideoContext.cameraComponentModel.mMusicStart) {
            getRecordControlApi().l72(shortVideoContext.cameraComponentModel.mCurrentDurationMode, true);
        }
        shortVideoContext.cameraComponentModel.mMusicStart = i;
        MusicBuzModel musicBuzModel2 = shortVideoContext.creativeModel.musicBuzModel;
        musicBuzModel2.musicStartFromCut = i;
        musicBuzModel2.musicEditFrom = "shoot_normal";
        musicBuzModel2.musicStart = i;
        if (C1452420nto.LIZ()) {
            musicBuzModel2.musicEndFromCut = i2;
            musicBuzModel2.musicEnd = i2;
        }
        if (C1458070o2v.LJFF()) {
            if (C1458070o2v.LJ(shortVideoContext.creativeModel.musicBuzModel)) {
                getCameraApiComponent().pw0().isLoopSwitchOnByMusic = true;
            } else {
                getCameraApiComponent().pw0().isLoopSwitchOnByMusic = false;
            }
        }
    }

    @Override // X.C11E9
    public <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, Function1<? super PROP1, ? extends R> function1) {
        return (R) C1171740gb6.LJIIIIZZ(c11e5, function1);
    }

    public final void W2(int i, int i2, boolean z) {
        Vp(false);
        Uj2(i, i2);
        C1439190nYT.LJII(getShortVideoContext().cameraComponentModel.mMusicPath, MusicBeanUtilKt.extractAVMusic(getShortVideoContext().creativeModel.musicBuzModel), i);
        InterfaceC1652470t6T interfaceC1652470t6T = this.LLJILJILJ;
        if (interfaceC1652470t6T != null) {
            interfaceC1652470t6T.zh0(0, false);
        }
        T2();
        if (z) {
            this.LLILZ.LJIIJ(Unit.LIZ);
        } else {
            this.LLILZIL.LJIIJ(Unit.LIZ);
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
