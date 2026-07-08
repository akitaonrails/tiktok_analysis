package X;

import Y.AObjectS241S0100000_8;
import Y.AObjectS246S0100000_25;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.workflowbuilder.IWorkflowManager;
import com.ss.android.ugc.aweme.creative.model.AigcMetadataModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.aigc.IAigcStateHolder;
import com.ss.android.ugc.aweme.shortvideo.aigc.abtest.AIGCEffectPathRedesignExperiment;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS604S0100000_25;
import lnn.q;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0sM6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1623720sM6 extends AbstractC1622390sJx {
    public final ShortVideoContext LLILLJJLI;
    public final InterfaceC1648570t0B LLILLL;
    public final LifecycleOwner LLILZ;
    public final q LLILZIL;
    public final InterfaceC1645720sva LLILZLL;
    public final C560530Lyd<Unit> LLIZ;
    public final Function1<Boolean, Unit> LLIZLLLIL;
    public final Function1<InterfaceC1623780sMC, Unit> LLJ;
    public final Function0<Unit> LLJI;
    public final Function0<Unit> LLJIJIL;
    public final Function0<Unit> LLJILJIL;
    public final Function0<Unit> LLJILJILJ;
    public final Function0<Unit> LLJILLL;
    public final Function1<Boolean, Unit> LLJJ;
    public final Function1<Boolean, Unit> LLJJI;
    public final Function0<Unit> LLJJIII;
    public final Function0<Unit> LLJJIJI;
    public final Function0<Unit> LLJJIJIIJIL;
    public final Function0<Unit> LLJJIJIL;
    public final Function0<Unit> LLJJJ;
    public final Function0<Unit> LLJJJIL;
    public Effect LLJJJJ;
    public AObjectS241S0100000_8 LLJJJJJIL;
    public boolean LLJJL;
    public final long LLJLIL;
    public boolean LLJLILLLLZIIL;
    public long LLJLL;
    public final IWorkflowManager LLJLLIL;
    public final AObjectS246S0100000_25 LLJLLL;
    public final AObjectS246S0100000_25 LLJZ;
    public final C2252321DDq LLJJJJLIIL = C1BNE.LIZ(Boolean.FALSE);
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(302));
    public final C01GW LLJL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(303));

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
        if (!((Boolean) this.LLJJJJLIIL.getValue()).booleanValue()) {
            this.LLILLL.Vt0().LIZIZ(this.LLJJJJJIL);
        }
        this.LLILLJJLI.creativeModel.aigcMetadataModel.isAigcEffect = false;
        if (AIGCEffectPathRedesignExperiment.INSTANCE.isEnabled()) {
            AigcMetadataModel aigcMetadataModel = this.LLILLJJLI.creativeModel.aigcMetadataModel;
            aigcMetadataModel.isAIGCEffectRedesignEnabled = true;
            aigcMetadataModel.isAigcEffect = false;
            aigcMetadataModel.currentEffectSdkExtra = "";
            aigcMetadataModel.generationTriggerType = "";
            this.LLILLL.LH0().LIZIZ(this.LLJLLL);
            ((IAigcStateHolder) this.LLJL.getValue()).LIZIZ().LIZIZ(this.LLJZ);
        }
    }

    public final void LJJIIJ() {
        this.LLILLL.xP1(true, true, true);
        C1409940mnI.LJFF();
        ShortVideoContext shortVideoContext = this.LLILLJJLI;
        C1441190nbh c1441190nbhLIZIZ = shortVideoContext.cameraComponentModel.LIZIZ();
        shortVideoContext.LJJJLIIL(c1441190nbhLIZIZ.isEmpty() ? null : c1441190nbhLIZIZ.get(c1441190nbhLIZIZ.size() - 1));
        this.LLILLL.Ax(new C1644050sst("delete last fragment"));
        this.LLJJJJLIIL.setValue(Boolean.FALSE);
    }

    public final void LJJIIZ() {
        if (!this.LLILLL.isRecording().LIZJ().booleanValue()) {
            this.LLJIJIL.invoke();
            this.LLILLJJLI.shootMethod = "effect_generation";
        }
        this.LLILLL.Vt0().LIZIZ(this.LLJJJJJIL);
        AObjectS241S0100000_8 aObjectS241S0100000_8 = new AObjectS241S0100000_8(this, 84);
        this.LLJJJJJIL = aObjectS241S0100000_8;
        this.LLILLL.Vt0().LJII(this.LLILZ, Lifecycle.State.STARTED, aObjectS241S0100000_8);
        this.LLILLJJLI.creativeModel.recordEffectModel.enterMethodFromEffect = null;
        this.LLJJL = true;
        this.LLJJ.invoke(Boolean.FALSE);
    }

    public final void LJJIIZI() {
        Effect effect = this.LLJJJJ;
        if (effect != null) {
            C0LXN c0lxn = C0LXN.LIZ;
            ShortVideoContext shortVideoContext = this.LLILLJJLI;
            c0lxn.getClass();
            C0LXN.LJFF(C0LXN.LIZLLL(shortVideoContext, effect), System.currentTimeMillis() - this.LLJLL);
        }
    }

    public final void LJJIJ() {
        if (AIGCEffectPathRedesignExperiment.INSTANCE.isEnabled()) {
            this.LLJLL = System.currentTimeMillis();
            Effect effect = this.LLJJJJ;
            if (effect != null) {
                if (!C123100dR.LIZ(this.LLILLJJLI.creativeModel.aigcMetadataModel.generationTriggerType)) {
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0LXO(this, effect, null), 3);
                } else {
                    C0LXN c0lxn = C0LXN.LIZ;
                    ShortVideoContext shortVideoContext = this.LLILLJJLI;
                    c0lxn.getClass();
                    C0LXN.LJ("ai_task_create", C0LXN.LIZLLL(shortVideoContext, effect), C2097608Jq.LJ());
                }
            }
        }
    }

    public final void LJJIJIIJIL() {
        this.LLJJJJLIIL.setValue(Boolean.TRUE);
        this.LLJJL = false;
        if (!this.LLILLJJLI.isStoryOrPhotoTab || AIGCEffectPathRedesignExperiment.INSTANCE.isEnabled()) {
            LJJIJIIJI(new AwS426S0200000_25(this, LJJIIJZLJL(false), 96));
        }
        this.LLILLL.Ek2();
        Effect effect = this.LLJJJJ;
        if (effect != null) {
            C0LXN c0lxn = C0LXN.LIZ;
            ShortVideoContext shortVideoContext = this.LLILLJJLI;
            c0lxn.getClass();
            C0LXN.LJ("ai_task_cancel", C0LXN.LIZLLL(shortVideoContext, effect), C2097908Jt.LIZJ(new Pair("cancel_from", EnumC539260LCy.GENERATION_PAGE.getType())));
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", "cancelRecord");
                this.LLILZLL.sendEffectMsg(41, 0L, 0L, C786410Ut5.J3(jSONObject));
            } catch (C1633860scS e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Json exception ");
                sbLIZ.append(e);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        this.LLJI.invoke();
        this.LLJJIJIL.invoke();
    }

    public static final C1644050sst LJJIIJZLJL(boolean z) {
        Pair pair;
        if (z) {
            pair = new Pair("AIGC finish record", 4);
        } else {
            pair = new Pair("AIGC reset record", 0);
        }
        String str = (String) pair.getFirst();
        int iIntValue = ((Number) pair.getSecond()).intValue();
        C1644050sst c1644050sst = new C1644050sst(str);
        c1644050sst.LIZ = iIntValue;
        return c1644050sst;
    }

    @Override // X.AbstractC1622390sJx
    public final boolean LJJI(C1627370sRz c1627370sRz) {
        return C1449600npG.LJFF(c1627370sRz.LIZ);
    }

    public final void LJJIJIIJI(Function0<Unit> function0) {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.LLILZ);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C2187108hZ(function0, null), 2);
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIII(C1623370sLX c1623370sLX, C1627370sRz c1627370sRz) {
        C0TBD c0tbd = new C0TBD(null, false, 3);
        this.LLJJLIIIJLLLLLLLZ.getValue().getClass();
        C1623740sM8.LIZ(c0tbd);
        this.LLJJJJ = c1627370sRz.LIZ;
        AIGCEffectPathRedesignExperiment aIGCEffectPathRedesignExperiment = AIGCEffectPathRedesignExperiment.INSTANCE;
        if (aIGCEffectPathRedesignExperiment.isEnabled()) {
            AigcMetadataModel aigcMetadataModel = this.LLILLJJLI.creativeModel.aigcMetadataModel;
            aigcMetadataModel.isAIGCEffectRedesignEnabled = true;
            aigcMetadataModel.isAigcEffect = true;
            aigcMetadataModel.currentEffectSdkExtra = c1627370sRz.LIZ.getSdkExtra();
        }
        this.LLJJIJI.invoke();
        if (aIGCEffectPathRedesignExperiment.isEnabled()) {
            this.LLILLL.LH0().LIZIZ(this.LLJLLL);
            ((IAigcStateHolder) this.LLJL.getValue()).LIZIZ().LIZIZ(this.LLJZ);
            C560530Lyd<String> c560530LydLH0 = this.LLILLL.LH0();
            LifecycleOwner lifecycleOwner = this.LLILZ;
            Lifecycle.State state = Lifecycle.State.STARTED;
            c560530LydLH0.LJII(lifecycleOwner, state, this.LLJLLL);
            ((IAigcStateHolder) this.LLJL.getValue()).LIZIZ().LJII(this.LLILZ, state, this.LLJZ);
        }
    }

    public C1623720sM6(ShortVideoContext shortVideoContext, InterfaceC1648570t0B interfaceC1648570t0B, LifecycleOwner lifecycleOwner, q qVar, InterfaceC1645720sva interfaceC1645720sva, C560530Lyd c560530Lyd, AwS604S0100000_25 awS604S0100000_25, AwS587S0100000_8 awS587S0100000_8, AwS552S0100000_8 awS552S0100000_8, AwS569S0100000_25 awS569S0100000_25, AwS569S0100000_25 awS569S0100000_252, AwS569S0100000_25 awS569S0100000_253, AwS569S0100000_25 awS569S0100000_254, AwS604S0100000_25 awS604S0100000_252, AwS604S0100000_25 awS604S0100000_253, AwS569S0100000_25 awS569S0100000_255, AwS569S0100000_25 awS569S0100000_256, AwS569S0100000_25 awS569S0100000_257, C1623320sLS c1623320sLS, C1623330sLT c1623330sLT, C1623340sLU c1623340sLU) {
        IWorkflowManager iWorkflowManager;
        this.LLILLJJLI = shortVideoContext;
        this.LLILLL = interfaceC1648570t0B;
        this.LLILZ = lifecycleOwner;
        this.LLILZIL = qVar;
        this.LLILZLL = interfaceC1645720sva;
        this.LLIZ = c560530Lyd;
        this.LLIZLLLIL = awS604S0100000_25;
        this.LLJ = awS587S0100000_8;
        this.LLJI = awS552S0100000_8;
        this.LLJIJIL = awS569S0100000_25;
        this.LLJILJIL = awS569S0100000_252;
        this.LLJILJILJ = awS569S0100000_253;
        this.LLJILLL = awS569S0100000_254;
        this.LLJJ = awS604S0100000_252;
        this.LLJJI = awS604S0100000_253;
        this.LLJJIII = awS569S0100000_255;
        this.LLJJIJI = awS569S0100000_256;
        this.LLJJIJIIJIL = awS569S0100000_257;
        this.LLJJIJIL = c1623320sLS;
        this.LLJJJ = c1623330sLT;
        this.LLJJJIL = c1623340sLU;
        this.LLJLIL = shortVideoContext.cameraComponentModel.mMaxDuration;
        try {
            iWorkflowManager = (IWorkflowManager) PluggableExtentionKt.pluggableSpi$default(IWorkflowManager.class, false, false, false, 14, null);
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            iWorkflowManager = null;
        }
        this.LLJLLIL = iWorkflowManager;
        this.LLJLLL = new AObjectS246S0100000_25(this, 550);
        this.LLJZ = new AObjectS246S0100000_25(this, 551);
    }
}
