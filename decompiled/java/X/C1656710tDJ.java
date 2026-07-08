package X;

import Y.AObjectS246S0100000_25;
import Y.AfS194S0100000_25;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.DuetContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutState;
import com.ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutViewModel;
import com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.abtest.EnableHCInDuetExperiment;
import duk.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS604S0100000_25;
import lnn.q;
import mn3.e0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0tDJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1656710tDJ extends AbstractC2255721DQs<C05YF> implements C05YF, InterfaceC379610EuV {
    public static final C1656850tDX LLJJIJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public static final int LLJJIJIL;
    public static final String LLJJJ = "switchButton";
    public final C1DRG LL;
    public boolean LLJ;
    public Effect LLJI;
    public int LLJIJIL;
    public final C05YF LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647420syK.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), e0.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), q.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public String LLJILJIL = "";
    public final C11NJ LLJILJILJ = new C11NJ();
    public final InterfaceC1441305kZ<Boolean> LLJILLL = new AObjectS246S0100000_25(this, 151);
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 260));
    public final C1656750tDN LLJJI = new InterfaceC1638740skK() { // from class: X.0tDN
        @Override // X.InterfaceC1638740skK
        public final boolean LIZ() {
            C1656710tDJ c1656710tDJ = this.LIZ;
            if (!c1656710tDJ.w2(c1656710tDJ.LLJI)) {
                return false;
            }
            C19EG activity = this.LIZ.getActivity();
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131832487);
            creativeToastBuilder.isTuxToastLegacy(true);
            C1390380mHk.LIZ(activity, 3074, creativeToastBuilder);
            return true;
        }
    };
    public boolean LLJJIII = true;

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0tDX] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1656710tDJ.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1656710tDJ.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0), new C2217381BqS(C1656710tDJ.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C2217381BqS(C1656710tDJ.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new C2217381BqS(C1656710tDJ.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C2217381BqS(C1656710tDJ.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0)};
        LLJJIJI = new Object() { // from class: X.0tDX
        };
        LLJJIJIL = 8;
    }

    private final void H2() {
        q3((BaseJediViewModel) Z1().LIZ(ChangeDuetLayoutViewModel.class), this, new C2217381BqS() { // from class: X.0tDS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ChangeDuetLayoutState) obj).getExitDuetMode();
            }
        }, new C1765020w20(), new AwS604S0100000_25(this, 125));
    }

    private final void W2() {
        q3((BaseJediViewModel) Z1().LIZ(ChangeDuetLayoutViewModel.class), this, new C2217381BqS() { // from class: X.0tDQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ChangeDuetLayoutState) obj).getEffect();
            }
        }, new C1765020w20(), new AwS604S0100000_25(this, 126));
        q3((BaseJediViewModel) Z1().LIZ(ChangeDuetLayoutViewModel.class), this, new C2217381BqS() { // from class: X.0tDU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ChangeDuetLayoutState) obj).getLayoutDirection();
            }
        }, new C1765020w20(), new AwS604S0100000_25(this, 127));
    }

    private final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLILZIL.getValue(this, LLJJIJIIJIL[2]);
    }

    public final void W1() {
        if (this.LLJ) {
            return;
        }
        getCameraApiComponent().St2().setDuetSupportChangeLayout(true);
        this.LLJ = true;
    }

    public final C1659660tI4 Z1() {
        return (C1659660tI4) this.LLJJ.getValue();
    }

    public final C19EG getActivity() {
        return (C19EG) this.LLIZLLLIL.getValue(this, LLJJIJIIJIL[5]);
    }

    public final e0 getCameraApiComponent() {
        return (e0) this.LLILZ.getValue(this, LLJJIJIIJIL[1]);
    }

    public final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLILLL.getValue(this, LLJJIJIIJIL[0]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLIZ.getValue(this, LLJJIJIIJIL[4]);
    }

    public final q getStickerApiComponent() {
        return (q) this.LLILZLL.getValue(this, LLJJIJIIJIL[3]);
    }

    private final void T2() {
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        p pVarLJJJJIZL;
        q stickerApiComponent = getStickerApiComponent();
        if (stickerApiComponent == null || (interfaceC1624480sNKC0 = stickerApiComponent.C0()) == null || (pVarLJJJJIZL = interfaceC1624480sNKC0.LJJJJIZL()) == null) {
            return;
        }
        this.LLJILJILJ.LIZ(pVarLJJJJIZL.LIZJ().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS194S0100000_25(this, 8), new C09JN() { // from class: X.0sJV
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("RecordDuetLayoutCoreComponent@51d.observeWhitelistSceneChange$2");
                C1C7U.LIZIZ("RecordDuetLayoutCoreComponent@51d.observeWhitelistSceneChange$2");
            }
        }));
    }

    private final Effect X1() {
        Effect effect = getShortVideoContext().cameraComponentModel.duetContext.defaultDuetLayout;
        return effect == null ? C1656740tDM.LIZ() : effect;
    }

    private final void X90() {
        getCameraApiComponent().yj1().LIZ(this, this.LLJILLL);
    }

    private final boolean o2() {
        return C1656740tDM.LIZJ() || this.LLJI != null;
    }

    public final void B3() {
        if (o2()) {
            JediViewModel jediViewModelLIZ = Z1().LIZ(ChangeDuetLayoutViewModel.class);
            Effect effectX1 = this.LLJI;
            if (effectX1 == null) {
                effectX1 = X1();
            }
            jediViewModelLIZ.getClass();
            jediViewModelLIZ.setState(new AwS604S0100000_25(effectX1, 123));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        W2();
        if (EnableHCInDuetExperiment.isDuetInFWHC(getShortVideoContext())) {
            T2();
        }
        H2();
        X90();
        getRecordControlApi().ht1(new C531060KsC(getShortVideoContext().cameraComponentModel.mMaxDuration));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLJILJILJ.dispose();
        getCameraApiComponent().yj1().LIZIZ(this.LLJILLL);
    }

    @Override // X.AbstractC2255721DQs
    public C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.0tDN] */
    public C1656710tDJ(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final void G2(String str) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", getShortVideoContext().getCreationId());
        c0lab.LJ("shoot_way", getShortVideoContext().shootWay);
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LJ("shoot_at", str);
        C20684815ws.LJIILLIIL("switch_duet_layout", c0lab.LIZ);
    }

    public final void c3(int i) {
        Effect effectLIZIZ = C1624010sMZ.LIZIZ(getStickerApiComponent());
        if (effectLIZIZ != null) {
            p pVarLJJJJIZL = getStickerApiComponent().C0().LJJJJIZL();
            if (pVarLJJJJIZL != null && pVarLJJJJIZL.LJ(effectLIZIZ, Integer.valueOf(i))) {
                return;
            }
            C19EG activity = getActivity();
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131832487);
            creativeToastBuilder.isTuxToastLegacy(true);
            C1390380mHk.LIZ(activity, 3074, creativeToastBuilder);
            C1624010sMZ.LJII(getStickerApiComponent(), null);
        }
    }

    public final boolean w2(Effect effect) {
        boolean zOptBoolean = false;
        if (effect != null) {
            try {
                C1446130njf.LIZ.getClass();
                JSONObject jSONObjectLJIIIZ = C1446130njf.LJIIIZ(effect);
                if (jSONObjectLJIIIZ == null) {
                    jSONObjectLJIIIZ = new JSONObject();
                }
                zOptBoolean = jSONObjectLJIIIZ.optBoolean("effect_exclusive", false);
                C1651190t4P c1651190t4P = InterfaceC1651180t4O.LJJJJ;
                int iOptInt = jSONObjectLJIIIZ.optInt("appearance_duration", LivePreCreateNextRoomPlayer.ENABLE);
                c1651190t4P.getClass();
                C1651190t4P.LIZIZ = iOptInt;
                return zOptBoolean;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return zOptBoolean;
    }

    public final void i3(Effect effect, int i) {
        if (!getCameraApiComponent().pw0().mDurings.isEmpty()) {
            return;
        }
        DuetContext duetContext = getShortVideoContext().cameraComponentModel.duetContext;
        DuetLayoutBean duetLayoutBeanLIZIZ = C542790LQn.LIZIZ(effect);
        String str = "";
        if (duetLayoutBeanLIZIZ != null && duetLayoutBeanLIZIZ.safetyStatus.size() > i) {
            str = (String) ListProtector.get(duetLayoutBeanLIZIZ.safetyStatus, i);
        }
        duetContext.duetLayout = str;
        duetContext.duetLayoutMode = C542790LQn.LIZJ(effect);
        duetContext.layoutDirection = i;
    }

    private final <S extends C004I, A> void q3(BaseJediViewModel<S> baseJediViewModel, LifecycleOwner lifecycleOwner, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function1<? super A, Unit> function1) {
        C11NJ c11nj = this.LLJILJILJ;
        baseJediViewModel.getClass();
        c11nj.LIZ(baseJediViewModel.jR2(lifecycleOwner, interfaceC2217241BqE, c1765020w20, new AwS587S0100000_8(function1, 636)));
    }
}
