package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.List;

/* JADX INFO: renamed from: X.0Mqd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C581050Mqd implements IFetchEffectChannelListener {
    public final int $t;
    public Object l0;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        switch (this.$t) {
            case 0:
                onFail$0(this, exceptionResult);
                break;
            case 1:
                onFail$1(this, exceptionResult);
                break;
            case 2:
                onFail$2(this, exceptionResult);
                break;
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, effectChannelResponse);
                break;
            case 1:
                onSuccess$1(this, effectChannelResponse);
                break;
            case 2:
                onSuccess$2(this, effectChannelResponse);
                break;
        }
    }

    public C581050Mqd(C573400MeI c573400MeI, int i) {
        this.$t = i;
        this.l0 = c573400MeI;
    }

    public static final void onFail$0(C581050Mqd c581050Mqd, ExceptionResult exceptionResult) {
        Exception runtimeException;
        if (exceptionResult == null || (runtimeException = exceptionResult.getException()) == null) {
            runtimeException = new RuntimeException("unknown error");
        }
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c581050Mqd.l0;
        C098200Yq c098200Yq = new C098200Yq(runtimeException);
        C189200o6.m2constructorimpl(c098200Yq);
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
        C189200o6.m2constructorimpl(c189200o6M1boximpl);
        interfaceC1364105Vn.resumeWith(c189200o6M1boximpl);
    }

    public static final void onFail$1(C581050Mqd c581050Mqd, ExceptionResult exceptionResult) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectListDownProcessor: failed = ");
        sbLIZ.append(exceptionResult.getMsg());
        C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        long jLIZ = ((C573400MeI) c581050Mqd.l0).LIZJ.LIZ();
        C573060Mdk c573060Mdk = ((C573400MeI) c581050Mqd.l0).LIZ.LIZ;
        if (c573060Mdk != null) {
            c573060Mdk.LIZ = (int) jLIZ;
            c573060Mdk.LJIIJ = exceptionResult.getMsg();
        }
        C573380MeG c573380MeG = ((C573400MeI) c581050Mqd.l0).LIZ;
        C573060Mdk c573060Mdk2 = c573380MeG.LIZ;
        if (c573060Mdk2 != null) {
            c573060Mdk2.LJIIIZ = 1;
        }
        InterfaceC573490MeR interfaceC573490MeR = c573380MeG.LIZJ;
        if (interfaceC573490MeR != null) {
            interfaceC573490MeR.onFailed();
        }
    }

    public static final void onFail$2(C581050Mqd c581050Mqd, ExceptionResult exceptionResult) {
        C573400MeI c573400MeI = (C573400MeI) c581050Mqd.l0;
        c573400MeI.LIZ.LJI.Dg(c573400MeI.LIZLLL, new C581050Mqd(c573400MeI, 1));
    }

    public static final void onSuccess$0(C581050Mqd c581050Mqd, Object obj) {
        List<Effect> all_category_effects;
        Effect effect;
        EffectChannelResponse effectChannelResponse = (EffectChannelResponse) obj;
        System.currentTimeMillis();
        if (effectChannelResponse != null && (all_category_effects = effectChannelResponse.getAll_category_effects()) != null && (effect = (Effect) C13LP.LJJJLL(all_category_effects)) != null) {
            C01GW c01gw = C536200L1e.LIZIZ;
            if (((InterfaceC1635410sex) c01gw.getValue()).LJIIIIZZ(effect)) {
                InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c581050Mqd.l0;
                C189200o6.m2constructorimpl(effect);
                C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(effect);
                C189200o6.m2constructorimpl(c189200o6M1boximpl);
                interfaceC1364105Vn.resumeWith(c189200o6M1boximpl);
                return;
            }
            ((InterfaceC1635390sev) c01gw.getValue()).LJIIL(effect, new C513301zH((InterfaceC1364105Vn) c581050Mqd.l0, 2));
            return;
        }
        InterfaceC1364105Vn interfaceC1364105Vn2 = (InterfaceC1364105Vn) c581050Mqd.l0;
        C189200o6.m2constructorimpl(null);
        C189200o6 c189200o6M1boximpl2 = C189200o6.m1boximpl(null);
        C189200o6.m2constructorimpl(c189200o6M1boximpl2);
        interfaceC1364105Vn2.resumeWith(c189200o6M1boximpl2);
    }

    public static final void onSuccess$1(C581050Mqd c581050Mqd, Object obj) {
        ((C573400MeI) c581050Mqd.l0).LIZIZ((EffectChannelResponse) obj);
    }

    public static final void onSuccess$2(C581050Mqd c581050Mqd, Object obj) {
        if (!((C573400MeI) c581050Mqd.l0).LIZIZ((EffectChannelResponse) obj)) {
            C573400MeI c573400MeI = (C573400MeI) c581050Mqd.l0;
            c573400MeI.LIZ.LJI.Dg(c573400MeI.LIZLLL, new C581050Mqd(c573400MeI, 1));
        }
    }

    public C581050Mqd(long j, C23260099m c23260099m, int i) {
        this.$t = i;
        this.l0 = c23260099m;
    }
}
