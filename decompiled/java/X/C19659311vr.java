package X;

import Y.ARunnableS33S1100000_29;
import Y.ARunnableS34S0201000_29;
import Y.ARunnableS40S0101000_29;
import Y.ARunnableS98S0200000_29;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.OnThisDayData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IToolsVQEvaluationService;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.11vr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19659311vr extends Scene implements InterfaceC1166920gTK, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public final C1DRG LLJI;
    public final InterfaceC196906122e LLJIJIL;
    public final int LLJILJIL;
    public final C0FVR LLJILJILJ;
    public final AnonymousClass1240 LLJILLL;
    public final TTSVoiceModel LLJJ;
    public final Function0<Unit> LLJJI;
    public final C560530Lyd<Unit> LLJJIII;
    public InterfaceC1461390o8H LLJJIJI;
    public C124T LLJJIJIIJIL;
    public C121O LLJJIJIL;
    public boolean LLJJJ;
    public final C1664750tQH LLJJJJ;
    public InterfaceC1452170ntP LLJJJJJIL;
    public C122P LLJJL;
    public final C01GW LLJJJIL = C1449630npJ.LIZ(this, InterfaceC1455860nzM.class);
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 24));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19659311vr.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    public final InterfaceC1455860nzM LLLII() {
        return (InterfaceC1455860nzM) this.LLJJJIL.getValue();
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLJJJJ.getValue(this, LLJJLIIIJLLLLLLLZ[0]);
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        C0FW6 c0fw6LJIIIZ;
        C122P c122p = this.LLJJL;
        if (c122p == null) {
            c122p = null;
        }
        c122p.LJIJI();
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLJJJJJIL;
        if (interfaceC1452170ntP != null) {
            C2388309Xl.LIZ.getClass();
            String str = C2388309Xl.LIZIZ;
            if (str != null) {
                C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP);
                if (c348100DkmLIZIZ != null && (c0fw6LJIIIZ = c348100DkmLIZIZ.LJIIIZ()) != null) {
                    c0fw6LJIIIZ.LJIILJJIL(str);
                }
                interfaceC1452170ntP.jg();
            }
        }
        super.onDestroyView();
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        C122P c122p = this.LLJJL;
        if (c122p == null) {
            c122p = null;
        }
        c122p.LJIJJ();
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        C122P c122p = this.LLJJL;
        if (c122p == null) {
            c122p = null;
        }
        C121O c121o = c122p.LLILZLL;
        if (c121o != null) {
            c121o.hide();
        }
        SafeHandler safeHandlerLJIIJJI = c122p.LJIIJJI();
        ARunnableS34S0201000_29 aRunnableS34S0201000_29 = c122p.LLL;
        if (aRunnableS34S0201000_29 == null) {
            aRunnableS34S0201000_29 = null;
        }
        safeHandlerLJIIJJI.post(aRunnableS34S0201000_29);
        if (c122p.LLLIL) {
            return;
        }
        InterfaceC196906122e interfaceC196906122e = c122p.LLIZLLLIL;
        if (interfaceC196906122e == null || interfaceC196906122e.LJLIIL()) {
            c122p.LJJ(null);
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        String strLIZIZ;
        super.onActivityCreated(bundle);
        C122P c122p = this.LLJJL;
        if (c122p == null) {
            c122p = null;
        }
        c122p.LJIIZILJ();
        IToolsVQEvaluationService iToolsVQEvaluationService = (IToolsVQEvaluationService) ServiceManager.get().getService(IToolsVQEvaluationService.class);
        if (iToolsVQEvaluationService != null) {
            C12WG.LIZJ(this, new ARunnableS98S0200000_29(iToolsVQEvaluationService, this, 7));
        }
        if (getEditModel().creativeModel.changeAvatarModel.isFromChangeAvatar && ((getEditModel().creativeModel.changeAvatarModel.isFromSocialAvatar && !getEditModel().hasTextSticker()) || ((!getEditModel().creativeModel.draftInfoModel.isDraft || getEditModel().isFromCrash()) && getEditModel().creativeModel.changeAvatarModel.firstEnterEdit))) {
            getEditModel().hasTextSticker();
            if (getEditModel().creativeModel.changeAvatarModel.isFromSocialAvatar) {
                strLIZIZ = C20642515q3.LJI(2131827094);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((char) 10024);
                sbLIZ.append(C20642515q3.LJI(2131845022));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            C12WG.LIZJ(this, new ARunnableS33S1100000_29(this, strLIZIZ, 0));
            if (C297450BlH.LIZ()) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2389309Xv(this, null), 3);
            }
        }
        OnThisDayData onThisDayData = getEditModel().creativeModel.onThisDayData;
        if (onThisDayData.isFromOnThisDay() && onThisDayData.getVersion() < 1 && !C1428470nHB.LJJZZI(getEditModel()) && !getEditModel().creativeModel.onThisDayData.getLoadedSticker()) {
            C12WG.LIZLLL(this, new ARunnableS40S0101000_29(this, 0, 2), 300L);
        }
        C560530Lyd<Unit> c560530Lyd = this.LLJJIII;
        if (c560530Lyd != null) {
            c560530Lyd.LJIIJ(Unit.LIZ);
        }
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C122P c122p;
        FrameLayout frameLayout = (FrameLayout) viewGroup;
        C122P c122p2 = null;
        if (C1428470nHB.LLIIIJ(getEditModel())) {
            C19EG c19eg = (C19EG) this.mActivity;
            InterfaceC1461390o8H interfaceC1461390o8H = this.LLJJIJI;
            if (interfaceC1461390o8H == null) {
                interfaceC1461390o8H = null;
            }
            InterfaceC1455860nzM interfaceC1455860nzMLLLII = LLLII();
            InterfaceC1453510nvZ interfaceC1453510nvZ = (InterfaceC1453510nvZ) this.LLJI.LJIIL(null, InterfaceC1453510nvZ.class);
            C124T c124t = this.LLJJIJIIJIL;
            if (c124t == null) {
                c124t = null;
            }
            c124t.setSafeAreaHeight(LLLII().VF0());
            C121O c121o = this.LLJJIJIL;
            if (c121o == null) {
                c121o = null;
            }
            c122p = new C19673011y4(c19eg, interfaceC1461390o8H, interfaceC1455860nzMLLLII, frameLayout, c124t, c121o, LLLII().g(), this.LLJIJIL, this.LLJILJIL, interfaceC1453510nvZ, this.LLJJJ, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJI);
            c122p2 = null;
        } else {
            C19EG c19eg2 = (C19EG) this.mActivity;
            InterfaceC1461390o8H interfaceC1461390o8H2 = this.LLJJIJI;
            if (interfaceC1461390o8H2 == null) {
                interfaceC1461390o8H2 = null;
            }
            InterfaceC1455860nzM interfaceC1455860nzMLLLII2 = LLLII();
            InterfaceC1453510nvZ interfaceC1453510nvZ2 = (InterfaceC1453510nvZ) this.LLJI.LJIIL(null, InterfaceC1453510nvZ.class);
            C124T c124t2 = this.LLJJIJIIJIL;
            if (c124t2 == null) {
                c124t2 = null;
            }
            C121O c121o2 = this.LLJJIJIL;
            if (c121o2 == null) {
                c121o2 = null;
            }
            c122p = new C122P(c19eg2, interfaceC1461390o8H2, interfaceC1455860nzMLLLII2, frameLayout, c124t2, c121o2, LLLII().g(), this.LLJIJIL, this.LLJILJIL, interfaceC1453510nvZ2, this.LLJJJ, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJI, 512);
        }
        this.LLJJL = c122p;
        c122p.LLJJJ = (String) this.LLJJJJLIIL.getValue();
        C122P c122p3 = this.LLJJL;
        if (c122p3 == null) {
            c122p3 = c122p2;
        }
        c122p3.LJIJ();
        return new View(requireSceneContext());
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
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

    public C19659311vr(C1DRG c1drg, InterfaceC196906122e interfaceC196906122e, int i, C0FVR c0fvr, AnonymousClass1240 anonymousClass1240, TTSVoiceModel tTSVoiceModel, Function0 function0, C560530Lyd c560530Lyd) {
        this.LLJI = c1drg;
        this.LLJIJIL = interfaceC196906122e;
        this.LLJILJIL = i;
        this.LLJILJILJ = c0fvr;
        this.LLJILLL = anonymousClass1240;
        this.LLJJ = tTSVoiceModel;
        this.LLJJI = function0;
        this.LLJJIII = c560530Lyd;
        this.LLJJJJ = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
    }
}
