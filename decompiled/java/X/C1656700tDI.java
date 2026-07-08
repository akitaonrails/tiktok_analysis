package X;

import Y.AObjectS246S0100000_25;
import Y.AfS194S0100000_25;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.DuetContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutState;
import com.ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutViewModel;
import com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.abtest.EnableHCInDuetExperiment;
import duk.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS604S0100000_25;
import lnn.q;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0tDI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1656700tDI implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final C19EG LL;
    public final InterfaceC2254081DKk LLILLJJLI;
    public final q LLILLL;
    public final InterfaceC2177841ALe LLILZ;
    public final InterfaceC1656870tDZ LLILZIL;
    public final C1DRG LLILZLL;
    public final LifecycleOwner LLIZ;
    public final C1664750tQH LLIZLLLIL;
    public boolean LLJ;
    public Effect LLJI;
    public int LLJIJIL;
    public final InterfaceC1650230t2r LLJILJIL;
    public String LLJILJILJ = "";
    public final C11NJ LLJILLL;
    public final C1664750tQH LLJJ;
    public final AObjectS246S0100000_25 LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C1656760tDO LLJJIJIIJIL;
    public boolean LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1656700tDI.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1656700tDI.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILZLL;
    }

    public static final boolean LIZ(Effect effect) {
        boolean z = false;
        if (effect != null) {
            try {
                C1446130njf.LIZ.getClass();
                JSONObject jSONObjectLJIIIZ = C1446130njf.LJIIIZ(effect);
                if (jSONObjectLJIIIZ == null) {
                    jSONObjectLJIIIZ = new JSONObject();
                }
                if (jSONObjectLJIIIZ.optBoolean("effect_exclusive", false)) {
                    z = true;
                }
                C1651190t4P c1651190t4P = InterfaceC1651180t4O.LJJJJ;
                int iOptInt = jSONObjectLJIIIZ.optInt("appearance_duration", LivePreCreateNextRoomPlayer.ENABLE);
                c1651190t4P.getClass();
                C1651190t4P.LIZIZ = iOptInt;
                return z;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return z;
    }

    public final void LIZIZ(int i) {
        Effect effectLLILIL;
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        p pVarLJJJJIZL;
        q qVar = this.LLILLL;
        if (qVar != null && (effectLLILIL = qVar.C0().LLILIL()) != null) {
            q qVar2 = this.LLILLL;
            if (qVar2 != null && (interfaceC1624480sNKC0 = qVar2.C0()) != null && (pVarLJJJJIZL = interfaceC1624480sNKC0.LJJJJIZL()) != null && pVarLJJJJIZL.LJ(effectLLILIL, Integer.valueOf(i))) {
                return;
            }
            C19EG c19eg = this.LL;
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131832487);
            creativeToastBuilder.isTuxToastLegacy(true);
            C1390380mHk.LIZ(c19eg, 3074, creativeToastBuilder);
            q qVar3 = this.LLILLL;
            if (qVar3 == null) {
                return;
            }
            C1624010sMZ.LJII(qVar3, null);
        }
    }

    public final void LIZJ(Effect effect, int i) {
        if (((InterfaceC1650190t2n) this.LLILZLL.LJII(InterfaceC1650230t2r.class, null)).pw0().mDurings.size() == 0) {
            DuetContext duetContext = ((ShortVideoContextViewModel) ((ViewModelProvider) this.LLJJIII.getValue()).get(ShortVideoContextViewModel.class)).LL.cameraComponentModel.duetContext;
            DuetLayoutBean duetLayoutBeanLIZIZ = C542790LQn.LIZIZ(effect);
            String str = "";
            if (duetLayoutBeanLIZIZ != null && duetLayoutBeanLIZIZ.safetyStatus.size() > i) {
                str = (String) ListProtector.get(duetLayoutBeanLIZIZ.safetyStatus, i);
            }
            duetContext.duetLayout = str;
            duetContext.duetLayoutMode = C542790LQn.LIZJ(effect);
            duetContext.layoutDirection = i;
        }
    }

    public static void LIZLLL(C1656700tDI c1656700tDI, BaseJediViewModel baseJediViewModel, LifecycleOwner lifecycleOwner, C2217381BqS c2217381BqS, Function1 function1) {
        C1765020w20 c1765020w20 = new C1765020w20();
        C11NJ c11nj = c1656700tDI.LLJILLL;
        baseJediViewModel.getClass();
        c11nj.LIZ(baseJediViewModel.jR2(lifecycleOwner, c2217381BqS, c1765020w20, new AwS587S0100000_8(function1, 636)));
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0tDO] */
    public C1656700tDI(C19EG c19eg, InterfaceC2254081DKk interfaceC2254081DKk, q qVar, InterfaceC2177841ALe interfaceC2177841ALe, C1656770tDP c1656770tDP, C1DRG c1drg, LifecycleOwner lifecycleOwner) {
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        p pVarLJJJJIZL;
        this.LL = c19eg;
        this.LLILLJJLI = interfaceC2254081DKk;
        this.LLILLL = qVar;
        this.LLILZ = interfaceC2177841ALe;
        this.LLILZIL = c1656770tDP;
        this.LLILZLL = c1drg;
        this.LLIZ = lifecycleOwner;
        this.LLIZLLLIL = C1664770tQJ.LIZ(c1drg, InterfaceC1647420syK.class, null);
        this.LLJILJIL = (InterfaceC1650230t2r) c1drg.LJII(InterfaceC1650230t2r.class, null);
        C11NJ c11nj = new C11NJ();
        this.LLJILLL = c11nj;
        C1664750tQH c1664750tQHLIZ = C1664770tQJ.LIZ(c1drg, ShortVideoContext.class, null);
        this.LLJJ = c1664750tQHLIZ;
        this.LLJJI = new AObjectS246S0100000_25(this, 162);
        this.LLJJIII = C452501pT.LIZIZ(new AwS569S0100000_25(this, 259));
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 269));
        this.LLJJIJI = c01gwLIZIZ;
        this.LLJJIJIIJIL = new InterfaceC1638740skK() { // from class: X.0tDO
            @Override // X.InterfaceC1638740skK
            public final boolean LIZ() {
                if (!C1656700tDI.LIZ(this.LIZ.LLJI)) {
                    return false;
                }
                C19EG c19eg2 = this.LIZ.LL;
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131832487);
                creativeToastBuilder.isTuxToastLegacy(true);
                C1390380mHk.LIZ(c19eg2, 3074, creativeToastBuilder);
                return true;
            }
        };
        LIZLLL(this, (BaseJediViewModel) ((C1659660tI4) c01gwLIZIZ.getValue()).LIZ(ChangeDuetLayoutViewModel.class), lifecycleOwner, new C2217381BqS() { // from class: X.0tDR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ChangeDuetLayoutState) obj).getEffect();
            }
        }, new AwS604S0100000_25(this, 122));
        LIZLLL(this, (BaseJediViewModel) ((C1659660tI4) c01gwLIZIZ.getValue()).LIZ(ChangeDuetLayoutViewModel.class), lifecycleOwner, new C2217381BqS() { // from class: X.0tDV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ChangeDuetLayoutState) obj).getLayoutDirection();
            }
        }, new AwS604S0100000_25(this, 124));
        if (EnableHCInDuetExperiment.isDuetInFWHC((ShortVideoContext) c1664750tQHLIZ.getValue(this, LLJJJ[1])) && qVar != null && (interfaceC1624480sNKC0 = qVar.C0()) != null && (pVarLJJJJIZL = interfaceC1624480sNKC0.LJJJJIZL()) != null) {
            c11nj.LIZ(pVarLJJJJIZL.LIZJ().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS194S0100000_25(this, 10), new C09JN() { // from class: X.00QP
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("DuetLayoutModule@aecb.observeWhitelistSceneChange$2");
                    C1C7U.LIZIZ("DuetLayoutModule@aecb.observeWhitelistSceneChange$2");
                }
            }));
        }
        LIZLLL(this, (BaseJediViewModel) ((C1659660tI4) c01gwLIZIZ.getValue()).LIZ(ChangeDuetLayoutViewModel.class), lifecycleOwner, new C2217381BqS() { // from class: X.0tDT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ChangeDuetLayoutState) obj).getExitDuetMode();
            }
        }, new AwS604S0100000_25(this, 147));
        this.LLJJIJIL = true;
    }
}
