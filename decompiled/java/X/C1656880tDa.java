package X;

import Y.AObjectS246S0100000_25;
import Y.AObserverS227S0100000_25;
import Y.AfS194S0100000_25;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.shortvideo.DuetContext;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutState;
import com.ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutViewModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.vesdk.VETouchPointer;
import ge.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS33S0102000_25;
import kotlin.jvm.internal.AwS37S0001000_25;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS75S1000000_25;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;

/* JADX INFO: renamed from: X.0tDa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1656880tDa extends i<InterfaceC1651180t4O, C1657150tE1, C1657020tDo, C1657190tE5> implements InterfaceC1651180t4O, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFFI;
    public static final int LLLFZ;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final InterfaceC1651180t4O LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final C01GW LLJJIII;
    public final C560530Lyd<Boolean> LLJJIJI;
    public final C560530Lyd<ImageUrlModel> LLJJIJIIJIL;
    public final Function0<C1657020tDo> LLJJIJIL;
    public final C385670FAf<Effect> LLJJJ;
    public final Function0<C1657190tE5> LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public final InterfaceC1731706qJ LLJLIL;
    public final InterfaceC1731706qJ LLJLILLLLZIIL;
    public final InterfaceC1731706qJ LLJLL;
    public final C11NJ LLJLLIL;
    public final Stack<Integer> LLJLLL;
    public boolean LLJZ;
    public final C01GW LLJZIJLIL;
    public MutableLiveData<C1641640sp0<EffectChannelResponse>> LLL;
    public boolean LLLF;
    public float LLLFF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1656880tDa.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1656880tDa.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1656880tDa.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1656880tDa.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1656880tDa.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1656880tDa.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1656880tDa.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C1656880tDa.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C1656880tDa.class, "speedApiComponent", "getSpeedApiComponent()Lcom/ss/android/ugc/gamora/recorder/speed/SpeedApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(C1656880tDa.class, "recordLazyHelperApiComponent", "getRecordLazyHelperApiComponent()Lcom/ss/android/ugc/aweme/utils/RecordLazyHelperApiComponent;", 0);
        c09r3.getClass();
        LLLFFI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10};
        LLLFZ = 8;
    }

    private final ChangeDuetLayoutViewModel T4() {
        return (ChangeDuetLayoutViewModel) this.LLJJIII.getValue();
    }

    private final InterfaceC1648510t05 getGestureApiComponent() {
        return (InterfaceC1648510t05) this.LLJJL.getValue(this, LLLFFI[4]);
    }

    private final a getPlanCUIApiComponent() {
        return (a) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLLFFI[5]);
    }

    private final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLJJI.getValue(this, LLLFFI[0]);
    }

    private final q getStickerApiComponent() {
        return (q) this.LLJLIL.getValue(this, LLLFFI[7]);
    }

    private final InterfaceC1642740sqm n5() {
        return (InterfaceC1642740sqm) this.LLJLL.getValue(this, LLLFFI[9]);
    }

    private final InterfaceC1649530t1j t5() {
        return (InterfaceC1649530t1j) this.LLJLILLLLZIIL.getValue(this, LLLFFI[8]);
    }

    public final InterfaceC1635410sex Z4() {
        return (InterfaceC1635410sex) this.LLJZIJLIL.getValue();
    }

    public final C19EG getActivity() {
        return (C19EG) this.LLJJJJ.getValue(this, LLLFFI[1]);
    }

    public final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLJJJJJIL.getValue(this, LLLFFI[2]);
    }

    public final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLJJJJLIIL.getValue(this, LLLFFI[3]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLJL.getValue(this, LLLFFI[6]);
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void hide() {
        i3(AFwS266S0000000_25.get$arr$(125));
    }

    public final void C5() {
        super.show();
        i3(AFwS266S0000000_25.get$arr$(126));
    }

    public final void J6() {
        getCameraApiComponent().Cd(false, C1DPV.LIZIZ.LIZIZ(C1DPW.DUET_SWITCH_CAMERA, null), null);
    }

    @Override // X.InterfaceC1651180t4O
    public C385670FAf<Integer> Kd1() {
        return G2().LIZ(new C2217381BqS() { // from class: X.0tDd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1657020tDo) obj).LIZIZ);
            }
        });
    }

    public final void N5() {
        M5(Z4(), "duet-layout").observe(this, new AObserverS227S0100000_25(this, 11));
    }

    public final void R5() {
        getCameraApiComponent().St2().getEffectController().no(0.5f, 0.0f, 0, 0);
        getCameraApiComponent().St2().getEffectController().fo(0.5f, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    @Override // X.InterfaceC1651180t4O
    public void Uk0() {
        ChangeDuetLayoutViewModel changeDuetLayoutViewModelT4 = T4();
        getActivity();
        C0LCS<Integer> layoutDirection = ((ChangeDuetLayoutState) changeDuetLayoutViewModelT4.hR2()).getLayoutDirection();
        int i = (layoutDirection == null || layoutDirection.LIZ.intValue() != 1) ? 1 : 0;
        ChangeDuetLayoutViewModel changeDuetLayoutViewModelT42 = T4();
        changeDuetLayoutViewModelT42.getClass();
        changeDuetLayoutViewModelT42.setState(new AwS37S0001000_25(i, 0));
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        LiveEvent<Effect> liveEventO50;
        super.onCreate();
        getRecordAdapterApi().ve0(this);
        getCameraApiComponent().vB1().LIZ(this, new AObjectS246S0100000_25(this, 155));
        getRecordControlApi().cJ0().LIZ(this, new AObjectS246S0100000_25(this, 156));
        getRecordControlApi().Ia0().LIZ(this, new AObjectS246S0100000_25(this, 157));
        getRecordControlApi().yM2().LIZ(this, new AObjectS246S0100000_25(this, 158));
        this.LLJLLIL.LIZ(getStickerApiComponent().WJ0().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS194S0100000_25(this, 9), C09HN.LIZ));
        getRecordControlApi().kZ1(C579080MnS.class, new InterfaceC579700MoS() { // from class: X.0tDb
            @Override // X.InterfaceC579700MoS
            public final boolean LIZ(C0LZD c0lzd) {
                if (!this.LIZ.getShortVideoContext().isDuetGreenSrceen) {
                    return false;
                }
                Keva repo = Keva.getRepo("duet_keva_object");
                if (repo.getBoolean("duet_green_screen", true)) {
                    repo.storeBoolean("duet_green_screen", false);
                    C1656880tDa c1656880tDa = this.LIZ;
                    c1656880tDa.d6(new AwS569S0100000_25(c1656880tDa, 264));
                    return true;
                }
                if (this.LIZ.LLJZ || Intrinsics.LJFF("duet", c0lzd.LIZ)) {
                    return false;
                }
                Iterator<T> it2 = this.LIZ.LLJLLL.iterator();
                int iIntValue = 0;
                while (it2.hasNext()) {
                    iIntValue += ((Integer) it2.next()).intValue();
                }
                InterfaceC1651180t4O.LJJJJ.getClass();
                if (iIntValue >= C1651190t4P.LIZIZ) {
                    return false;
                }
                C1656880tDa c1656880tDa2 = this.LIZ;
                c1656880tDa2.d6(new AwS569S0100000_25(c1656880tDa2, 265));
                return true;
            }
        });
        getPlanCUIApiComponent().sK0().LIZ(this, new AObjectS246S0100000_25(this, 159));
        getPlanCUIApiComponent().RS().LIZ(this, new AObjectS246S0100000_25(this, 160));
        a planCUIApiComponent = getPlanCUIApiComponent();
        if (planCUIApiComponent != null && (liveEventO50 = planCUIApiComponent.O50()) != null) {
            liveEventO50.LIZ(this, new AObjectS246S0100000_25(this, 161));
        }
        getPlanCUIApiComponent().va().LIZ(this, new AObjectS246S0100000_25(this, 152));
        BaseJediViewModel.iR2(T4(), this, new C2217381BqS() { // from class: X.0tDW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ChangeDuetLayoutState) obj).getExitDuetMode();
            }
        }, new AwS604S0100000_25(this, 132));
        if (!C298060BmG.LIZ()) {
            t5().h9().LIZ(this, new AObjectS246S0100000_25(this, 154));
        } else if (getDiContainer().LIZJ(InterfaceC1649530t1j.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC1649530t1j.class, new AwS604S0100000_25(this, 131));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        getRecordAdapterApi().ve0(null);
        this.LLJLLIL.dispose();
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        super.show();
        i3(AFwS266S0000000_25.get$arr$(123));
    }

    public InterfaceC1651180t4O P4() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC1651180t4O
    public C385670FAf<Effect> Uw0() {
        return this.LLJJJ;
    }

    public C560530Lyd<Boolean> d5() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC1651180t4O
    public /* bridge */ /* synthetic */ LiveEvent ec() {
        return this.LLJJIJI;
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public C560530Lyd<ImageUrlModel> k5() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1657020tDo> o2() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC1651180t4O
    public /* bridge */ /* synthetic */ LiveEvent oH1() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1657190tE5> w2() {
        return this.LLJJJIL;
    }

    public final void x5() {
        super.hide();
    }

    private final void D5(EffectChannelResponse effectChannelResponse) {
        if (effectChannelResponse != null && !C0IKQ.LIZ(effectChannelResponse.getAllCategoryEffects())) {
            ArrayList arrayList = new ArrayList(effectChannelResponse.getAllCategoryEffects());
            if (arrayList.size() >= 2) {
                Object obj = ListProtector.get(arrayList, 0);
                ListProtector.set(arrayList, 0, ListProtector.get(arrayList, 1));
                ListProtector.set(arrayList, 1, obj);
            }
            i3(new AwS391S0200000_25(arrayList, (ArrayList<Effect>) this, (C1656880tDa) 55));
            S5(arrayList);
            return;
        }
        i3(AFwS266S0000000_25.get$arr$(121));
    }

    private final void H4(int i) {
        ChangeDuetLayoutViewModel changeDuetLayoutViewModelT4 = T4();
        changeDuetLayoutViewModelT4.getClass();
        changeDuetLayoutViewModelT4.setState(new AwS37S0001000_25(i, 0));
    }

    private final void S5(List<? extends Effect> list) {
        Effect next;
        if (!getShortVideoContext().mIsFromDraft) {
            return;
        }
        final DuetContext duetContext = getShortVideoContext().cameraComponentModel.duetContext;
        Iterator<? extends Effect> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(C542790LQn.LIZJ(next), duetContext.duetLayoutMode)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        final Effect effect = next;
        if (effect != null) {
            final int iIndexOf = list.indexOf(effect);
            if (iIndexOf < 0) {
                iIndexOf = 0;
            }
            if (Z4().LJIJJLI(effect)) {
                E5(effect, duetContext, iIndexOf);
            } else {
                Z4().LJIIL(effect, new IFetchEffectListener() { // from class: X.0tDc
                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                    public final void onStart(Effect effect2) {
                    }

                    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                    public final void onSuccess(Effect effect2) {
                        this.LIZ.E5(effect, duetContext, iIndexOf);
                    }

                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                    public final void onFail(Effect effect2, ExceptionResult exceptionResult) {
                        String strLIZJ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("effect download failed: ");
                        if (effect2 != null) {
                            strLIZJ = C542790LQn.LIZJ(effect2);
                        } else {
                            strLIZJ = null;
                        }
                        sbLIZ.append(strLIZJ);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                });
            }
        }
    }

    private final void U5(AbstractC21664519qV abstractC21664519qV) {
        InterfaceC1648510t05 gestureApiComponent = getGestureApiComponent();
        if (gestureApiComponent != null) {
            gestureApiComponent.xX0(abstractC21664519qV, 2);
        }
    }

    public final void F4(boolean z) {
        getCameraApiComponent().Zl0(new C1663770tOh(z, false, false));
    }

    public final void L6(boolean z) {
        if (!m6(this, z)) {
            x5();
        }
    }

    @Override // X.InterfaceC1651180t4O
    public void LJJ(boolean z) {
        if (z) {
            show();
        } else {
            hide();
        }
    }

    public final void O4(Effect effect) {
        ChangeDuetLayoutViewModel changeDuetLayoutViewModelT4 = T4();
        changeDuetLayoutViewModelT4.getClass();
        changeDuetLayoutViewModelT4.setState(new AwS604S0100000_25(effect, 123));
    }

    @Override // X.InterfaceC1651180t4O
    public void SA2(ImageUrlModel imageUrlModel) {
        this.LLJJIJIIJIL.LJIIJ(imageUrlModel);
    }

    @Override // X.InterfaceC1651180t4O
    public void bu(String str) {
        i3(new AwS75S1000000_25(str, 3));
    }

    public final void d6(Function0<Unit> function0) {
        C1397580mTM c1397580mTM = new C1397580mTM(getActivity());
        c1397580mTM.LIZ(2131832488);
        C985403tE.LIZ(c1397580mTM, new AwS604S0100000_25((Function0) function0, (Function0<C1092560eXO>) 130));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    @Override // X.InterfaceC1651180t4O
    public void kU(Effect effect) {
        i3(new AwS604S0100000_25(effect, 129));
    }

    @Override // X.InterfaceC1651180t4O
    public void og0(boolean z) {
        this.LLJJIJI.LJIIJ(Boolean.valueOf(z));
    }

    public final void v5(C1641640sp0<EffectChannelResponse> c1641640sp0) {
        EnumC1641550sor enumC1641550sor;
        if (c1641640sp0 != null && (enumC1641550sor = c1641640sp0.LIZIZ) != null) {
            int i = C1629030sUf.LIZ[enumC1641550sor.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        D5(c1641640sp0.LIZ);
                        return;
                    }
                    return;
                }
                i3(AFwS266S0000000_25.get$arr$(124));
                return;
            }
            i3(AFwS266S0000000_25.get$arr$(122));
        }
    }

    public C1656880tDa(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = this;
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647420syK.class, null);
        this.LLJJIII = C452501pT.LIZIZ(new AwS569S0100000_25(this, 261));
        this.LLJJIJI = new C560530Lyd<>();
        this.LLJJIJIIJIL = new C560530Lyd<>();
        this.LLJJIJIL = AFwS214S0000000_25.get$arr$(135);
        this.LLJJJ = new h0(null);
        this.LLJJJIL = new AwS569S0100000_25(this, 262);
        this.LLJJJJ = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
        this.LLJJL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1648510t05.class, null);
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZ(getDiContainer(), a.class, null);
        this.LLJL = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
        this.LLJLIL = C1664770tQJ.LIZ(getDiContainer(), q.class, null);
        this.LLJLILLLLZIIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1649530t1j.class, null);
        this.LLJLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1642740sqm.class, null);
        this.LLJLLIL = new C11NJ();
        this.LLJLLL = new Stack<>();
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 263));
        this.LLLF = true;
    }

    private final MutableLiveData<C1641640sp0<EffectChannelResponse>> M5(InterfaceC1635410sex interfaceC1635410sex, String str) {
        MutableLiveData<C1641640sp0<EffectChannelResponse>> mutableLiveData = this.LLL;
        if (mutableLiveData != null) {
            return mutableLiveData;
        }
        MutableLiveData<C1641640sp0<EffectChannelResponse>> mutableLiveData2 = new MutableLiveData<>();
        this.LLL = mutableLiveData2;
        mutableLiveData2.setValue(C1641640sp0.LIZIZ());
        interfaceC1635410sex.LJI(str, false, new C1698210uIF(this, 0));
        MutableLiveData<C1641640sp0<EffectChannelResponse>> mutableLiveData3 = this.LLL;
        if (mutableLiveData3 != null) {
            return mutableLiveData3;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final boolean m6(C1656880tDa c1656880tDa, boolean z) {
        boolean z2 = false;
        if (!z || ((!c1656880tDa.getShortVideoContext().LJI().isEmpty() && !c1656880tDa.getShortVideoContext().mIsFromDraft) || c1656880tDa.getShortVideoContext().LJJJJL() || c1656880tDa.getShortVideoContext().cameraComponentModel.isRetakeMode || c1656880tDa.getShortVideoContext().cameraComponentModel.isEditorProRecordMode)) {
            return false;
        }
        String str = c1656880tDa.getShortVideoContext().cameraComponentModel.duetContext.duetVideoPath;
        String str2 = c1656880tDa.getShortVideoContext().cameraComponentModel.duetContext.duetAudioPath;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            z2 = true;
        }
        if ((Intrinsics.LJFF(c1656880tDa.getShortVideoContext().shootWay, "duet") || z2) && c1656880tDa.getShortVideoContext().LJI().isEmpty()) {
            c1656880tDa.show();
        } else if ((!c1656880tDa.getShortVideoContext().LJI().isEmpty()) && c1656880tDa.getShortVideoContext().mIsFromDraft) {
            c1656880tDa.C5();
            return true;
        }
        return true;
    }

    public final void K6(float f, float f2) {
        int fullScreenHeight = ScreenUtils.getFullScreenHeight(getActivity());
        if (this.LLLF) {
            this.LLLFF = f2;
            getCameraApiComponent().St2().getEffectController().no(0.5f, (-f) / fullScreenHeight, 0, 0);
            this.LLLF = false;
        }
        float f3 = fullScreenHeight;
        getCameraApiComponent().St2().getEffectController().fo(0.5f, ((-f) + f2) / f3, 0.0f, (-(f2 - this.LLLFF)) / f3, 1.0f);
    }

    public final void E5(Effect effect, DuetContext duetContext, int i) {
        if (effect == null || duetContext == null) {
            return;
        }
        i3(new AwS37S0001000_25(i, 1));
        int i2 = duetContext.layoutDirection;
        if (i2 != 0) {
            H4(i2);
        }
    }

    public final void K4(Effect effect, int i, int i2, int i3) {
        if (((Number) G2().LIZ(new C2217381BqS() { // from class: X.0tDe
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1657020tDo) obj).LIZJ);
            }
        }).LIZJ()).intValue() != i3) {
            this.LLLF = true;
        }
        i3(new AwS33S0102000_25(i, i3, effect, 1));
        Uw0().LJFF(effect);
        if (i2 != 0) {
            if (i2 == 1) {
                final InterfaceC1645720sva effectController = getCameraApiComponent().St2().getEffectController();
                final ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) getCameraApiComponent().fF2().getLayoutParams());
                U5(new AbstractC21664519qV(effectController, marginLayoutParams) { // from class: X.0uHj
                    public final InterfaceC1645720sva LL;
                    public final ViewGroup.MarginLayoutParams LLILLJJLI;
                    public final int LLILLL;
                    public final int LLILZ;
                    public boolean LLILZIL;
                    public final PointF LLILZLL;
                    public float LLIZ;
                    public final PointF LLIZLLLIL;
                    public Pair<Float, Float> LLJ;

                    @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
                    public final boolean onDown(MotionEvent motionEvent) {
                        LJIILLIIL(motionEvent.getX(), motionEvent.getY());
                        InterfaceC1645720sva interfaceC1645720sva = this.LL;
                        PointF pointF = this.LLIZLLLIL;
                        interfaceC1645720sva.no(pointF.x / this.LLILLL, pointF.y / this.LLILZ, 0, 0);
                        this.LLILZIL = true;
                        return false;
                    }

                    @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
                    public final boolean onUp(MotionEvent motionEvent) {
                        LJIILLIIL(motionEvent.getX(), motionEvent.getY());
                        InterfaceC1645720sva interfaceC1645720sva = this.LL;
                        PointF pointF = this.LLIZLLLIL;
                        interfaceC1645720sva.no(pointF.x / this.LLILLL, pointF.y / this.LLILZ, 2, 1);
                        this.LLILZIL = false;
                        return false;
                    }

                    {
                        this.LL = effectController;
                        this.LLILLJJLI = marginLayoutParams;
                        Float fValueOf = Float.valueOf(-2.0f);
                        this.LLILZLL = new PointF(-2.0f, -2.0f);
                        this.LLIZLLLIL = new PointF();
                        this.LLJ = new Pair<>(fValueOf, fValueOf);
                        this.LLILLL = marginLayoutParams.width;
                        this.LLILZ = marginLayoutParams.height;
                    }

                    @Override // X.AbstractC21664519qV, X.InterfaceC21645719nT
                    public final void LJI(MotionEvent motionEvent, int[] iArr) {
                        if (motionEvent.getPointerCount() != 2) {
                            return;
                        }
                        LJIILLIIL(motionEvent.getX(1) + iArr[0], motionEvent.getY(1) + iArr[1]);
                        InterfaceC1645720sva interfaceC1645720sva = this.LL;
                        PointF pointF = this.LLIZLLLIL;
                        interfaceC1645720sva.no(pointF.x / this.LLILLL, pointF.y / this.LLILZ, 0, 0);
                        this.LLILZIL = true;
                        this.LLJ = new Pair<>(Float.valueOf(motionEvent.getX(1)), Float.valueOf(motionEvent.getY(1)));
                    }

                    @Override // X.AbstractC21664519qV, X.InterfaceC21645719nT
                    public final void LJIIIIZZ(MotionEvent motionEvent, int[] iArr) {
                        if (motionEvent.getPointerCount() != 2) {
                            return;
                        }
                        LJIILLIIL(motionEvent.getX(1) + iArr[0], motionEvent.getY(1) + iArr[1]);
                        InterfaceC1645720sva interfaceC1645720sva = this.LL;
                        PointF pointF = this.LLIZLLLIL;
                        interfaceC1645720sva.no(pointF.x / this.LLILLL, pointF.y / this.LLILZ, 2, 0);
                        this.LLILZIL = false;
                    }

                    @Override // X.AbstractC21664519qV, X.InterfaceC21645719nT
                    public final void LJIIJ(MotionEvent motionEvent, int[] iArr) {
                        if (motionEvent.getPointerCount() != 2) {
                            return;
                        }
                        if (this.LLILZIL) {
                            this.LLILZLL.x = ((Number) this.LLJ.first).floatValue() + iArr[0];
                            this.LLILZLL.y = ((Number) this.LLJ.second).floatValue() + iArr[1];
                            this.LLILZIL = false;
                        }
                        float x = (motionEvent.getX(1) + iArr[0]) - this.LLILZLL.x;
                        float y = (motionEvent.getY(1) + iArr[1]) - this.LLILZLL.y;
                        LJIILLIIL(motionEvent.getX(1) + iArr[0], motionEvent.getY(1) + iArr[1]);
                        InterfaceC1645720sva interfaceC1645720sva = this.LL;
                        PointF pointF = this.LLIZLLLIL;
                        float f = pointF.x;
                        int i4 = this.LLILLL;
                        float f2 = pointF.y;
                        int i5 = this.LLILZ;
                        interfaceC1645720sva.fo(f / i4, f2 / i5, x / i4, y / i5, 1.0f);
                        this.LLILZLL.x = motionEvent.getX(1) + iArr[0];
                        this.LLILZLL.y = motionEvent.getY(1) + iArr[1];
                        if (((Number) this.LLJ.first).floatValue() + iArr[0] != this.LLIZ) {
                            this.LLIZ = ((Number) this.LLJ.first).floatValue() + iArr[0];
                        }
                    }

                    @Override // X.AbstractC21664519qV
                    public final void LJIILL(VETouchPointer vETouchPointer, int i4) {
                        LJIILLIIL(vETouchPointer.getX(), vETouchPointer.getY());
                        vETouchPointer.setX(this.LLIZLLLIL.x / this.LLILLL);
                        vETouchPointer.setY(this.LLIZLLLIL.y / this.LLILZ);
                        this.LL.Ch(vETouchPointer, i4);
                    }

                    public final void LJIILLIIL(float f, float f2) {
                        this.LLIZLLLIL.set(f, f2);
                        this.LLIZLLLIL.offset(-this.LLILLJJLI.getMarginStart(), -this.LLILLJJLI.topMargin);
                    }

                    @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
                    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                        if (this.LLILZIL) {
                            this.LLILZLL.x = motionEvent.getX();
                            this.LLILZLL.y = motionEvent.getY();
                            this.LLILZIL = false;
                        }
                        float x = motionEvent2.getX() - this.LLILZLL.x;
                        float y = motionEvent2.getY() - this.LLILZLL.y;
                        LJIILLIIL(motionEvent2.getX(), motionEvent2.getY());
                        InterfaceC1645720sva interfaceC1645720sva = this.LL;
                        PointF pointF = this.LLIZLLLIL;
                        float f3 = pointF.x;
                        float f4 = this.LLILLL;
                        float f5 = pointF.y;
                        float f6 = this.LLILZ;
                        interfaceC1645720sva.fo(f3 / f4, f5 / f6, x / f4, y / f6, 1.0f);
                        this.LLILZLL.x = motionEvent2.getX();
                        this.LLILZLL.y = motionEvent2.getY();
                        if (motionEvent != null && motionEvent.getX() != this.LLIZ) {
                            this.LLIZ = motionEvent.getX();
                        }
                        return false;
                    }
                });
                return;
            }
            return;
        }
        U5(new C1637100shg());
    }
}
