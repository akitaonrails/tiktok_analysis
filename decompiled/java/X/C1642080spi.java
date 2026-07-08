package X;

import Y.AObjectS241S0100000_8;
import Y.AObjectS246S0100000_25;
import Y.AObserverS212S0100000_8;
import Y.AObserverS227S0100000_25;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.h0;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadService;
import com.ss.android.ugc.aweme.shortvideo.FirstPhotoViewModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS704S0100000_25;

/* JADX INFO: renamed from: X.0spi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1642080spi extends C19A3 implements InterfaceC1166920gTK, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public final C1DRG LLJILLL;
    public final C385670FAf<Integer> LLJJ;
    public final C385670FAf<Integer> LLJJI;
    public final LiveData<String> LLJJIII;
    public final C385670FAf<Boolean> LLJJIJI;
    public final Function1<Boolean, Unit> LLJJIJIIJIL;
    public final Function0<Unit> LLJJIJIL;
    public final Function1<Boolean, Unit> LLJJJ;
    public final C1664750tQH LLJJJIL;
    public final C1664740tQG LLJJJJ;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 551));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 563));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 713));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 712));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 697));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 711));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 561));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(282));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1642080spi.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1642080spi.class, "changeCameraSpecApiComponent", "getChangeCameraSpecApiComponent()Lcom/ss/android/ugc/aweme/changemode/ChangeCameraSpecApiComponent;", 0);
        c09r3.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final int LLLLIIIILLL() {
        return ((Number) this.LLJJJJLIIL.getValue()).intValue();
    }

    public final ShortVideoContext LLLLIILL() {
        return (ShortVideoContext) this.LLJJJIL.getValue(this, LLJLLL[0]);
    }

    public final C1642110spl LLLLIL() {
        return (C1642110spl) this.LLJLIL.getValue();
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public final void LLLLILI(String str) {
        C201967140v c201967140v = C201967140v.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("image loading started: ");
        sbLIZ.append(str);
        C201955140j.LIZLLL(c201967140v, "OneSideRecordDockBarScene", C2188811AlT.LIZIZ(sbLIZ));
        C1324750kZt.LJ((C1322110kVd) this.LLJL.getValue(), UriProtector.parse(str), -1, -1, (AbstractC1291220jho) this.LLJLLIL.getValue(), Bitmap.Config.ARGB_8888, null, null);
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        C385670FAf<EnumC1448590nnd> c385670FAfDk;
        super.onActivityCreated(bundle);
        C786410Ut5.LJLZ(0, (ViewGroup) this.LLJJL.getValue());
        C1447470nlp.LIZIZ((View) this.LLJLILLLLZIIL.getValue(), C418440Gaw.LIZIZ(16));
        LLLLIL().setUploadSize(LLLLIIIILLL());
        LLLLIL().LIZIZ();
        LLLLIL().setRoundRectRadius(16);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LLLLIIIILLL())));
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LLLLIIIILLL())));
        c384050F3z.LJ = C1308910kAL.LIZJ(R.attr.a02, (Context) this.LLJLL.getValue());
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
        LLLLIL().setBgBorderDrawable(c384050F3z.LIZ((Context) this.LLJLL.getValue()));
        InterfaceC1646220swO interfaceC1646220swO = (InterfaceC1646220swO) this.LLJJJJ.getValue(this, LLJLLL[1]);
        if (interfaceC1646220swO != null && (c385670FAfDk = interfaceC1646220swO.dk()) != null) {
            c385670FAfDk.LIZ(this, new AObjectS246S0100000_25(this, 428));
        }
        ((FirstPhotoViewModel) C1659630tI1.LJIIIIZZ(this, null, null, 6).get(FirstPhotoViewModel.class)).LL.observe(this, new AObserverS227S0100000_25(this, 51));
        this.LLJJIJI.LIZ(this, new AObjectS241S0100000_8(this, 52));
        this.LLJJ.LIZ(this, new AObjectS241S0100000_8(this, 53));
        this.LLJJI.LIZ(this, new AObjectS246S0100000_25(this, 427));
        this.LLJJIII.observe(this, new AObserverS212S0100000_8(this, 68));
        if (TextUtils.equals(LLLLIILL().shootWay, "upload_anchor") || Intrinsics.LJFF(LLLLIILL().enterFrom, "homepage_explore")) {
            C524780Ki4.LIZ.start(OpenAlbumPanelPerformanceMonitor.INSTANCE, "onClick");
            this.LLJJJ.invoke(Boolean.FALSE);
            C1444870nhd c1444870nhd = C1444870nhd.LIZ;
            Activity activityRequireActivity = requireActivity();
            ShortVideoContext shortVideoContextLLLLIILL = LLLLIILL();
            C1DRG c1drg = this.LLJILLL;
            c1444870nhd.getClass();
            C1444870nhd.LIZIZ(activityRequireActivity, shortVideoContextLLLLIILL, c1drg, null, null);
        }
        C786410Ut5.I7(new AbS704S0100000_25(this, 1), (View) this.LLJLILLLLZIIL.getValue());
        C786410Ut5.I7(new AbS704S0100000_25(this, 2), LLLLIL());
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) ((ILayoutPreloadService) ServiceManager.get().getService(ILayoutPreloadService.class)).loadLayoutFiles("dockBar", getSceneContext(), layoutInflater, R.layout.i98, viewGroup, false);
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void subscribeEvent(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends C0LCS<? extends A>> interfaceC2217241BqE, C1765020w20<C11EC<C0LCS<A>>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZLLL(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }

    public C1642080spi(C1DRG c1drg, h0 h0Var, h0 h0Var2, MutableLiveData mutableLiveData, C385670FAf c385670FAf, C577260MkW c577260MkW, C577330Mkd c577330Mkd, C577310Mkb c577310Mkb) {
        this.LLJILLL = c1drg;
        this.LLJJ = h0Var;
        this.LLJJI = h0Var2;
        this.LLJJIII = mutableLiveData;
        this.LLJJIJI = c385670FAf;
        this.LLJJIJIIJIL = c577260MkW;
        this.LLJJIJIL = c577330Mkd;
        this.LLJJJ = c577310Mkb;
        this.LLJJJIL = C1664770tQJ.LIZ(c1drg, ShortVideoContext.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1646220swO.class, null);
    }
}
