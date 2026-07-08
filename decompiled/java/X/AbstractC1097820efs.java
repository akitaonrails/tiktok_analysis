package X;

import Y.AfS186S0100000_17;
import com.bytedance.android.live.livedecision.ILiveDecisionService;
import com.bytedance.android.live.notify.network.LiveNotifyApi;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import java.util.Map;
import tikcast.api.epiphron.DecisionRequest;

/* JADX INFO: renamed from: X.0efs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1097820efs<REQUEST, RESPONSE> extends C0J0L {
    public boolean LIZJ;
    public C11JF LIZLLL;

    @Override // X.InterfaceC1097710efh
    public final void LJ() {
        this.LIZ = null;
        C11JF c11jf = this.LIZLLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).CW(LJIIIZ());
    }

    public boolean LJI() {
        return true;
    }

    public abstract Map<String, String> LJIIIIZZ(REQUEST request);

    public abstract String LJIIIZ();

    public abstract TypeToken<RESPONSE> LJIIJ();

    public abstract REQUEST LJIIJJI(DataChannel dataChannel, C1092890eXv c1092890eXv);

    public void LJIIL(int i) {
    }

    public abstract void LJIILIIL(RESPONSE response);

    public final void LJII(DataChannel dataChannel) {
        this.LIZ = dataChannel;
        ILiveDecisionService iLiveDecisionService = (ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class);
        String strLJIIIZ = LJIIIZ();
        InterfaceC1092860eXs interfaceC1092860eXs = new InterfaceC1092860eXs(this) { // from class: X.0eft
            public final /* synthetic */ AbstractC1097820efs<REQUEST, RESPONSE> LIZ;

            @Override // X.InterfaceC1092860eXs
            public final void LIZ() {
            }

            @Override // X.InterfaceC1092860eXs
            public final void LIZIZ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
            }

            @Override // X.InterfaceC1092860eXs
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1092860eXs
            public final void LIZLLL(String str, C477840IoY c477840IoY) {
            }

            {
                this.LIZ = this;
            }

            @Override // X.InterfaceC1092860eXs
            public final void LJ(C1092890eXv c1092890eXv) {
                Object obj;
                AbstractC1097820efs<REQUEST, RESPONSE> abstractC1097820efs = this.LIZ;
                C0J0M c0j0m = c1092890eXv.LIZIZ;
                String str = null;
                if (c0j0m != null) {
                    obj = c0j0m.LIZIZ;
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str = (String) obj;
                }
                abstractC1097820efs.LJIILJJIL(str);
            }
        };
        C1092980eY4 c1092980eY4 = new C1092980eY4();
        c1092980eY4.LIZ = C0J0P.ROOM;
        c1092980eY4.LIZ(new C1092780eXk(new C1089010eRf()));
        iLiveDecisionService.fR1(interfaceC1092860eXs, c1092980eY4.LIZIZ(), null, strLJIIIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIILJJIL(String str) {
        if (str != null && str.length() != 0) {
            try {
                Object objFromJson = GsonProtectorUtils.fromJson(C19748512Ol.LIZIZ, str, LJIIJ().getType());
                if (objFromJson != null) {
                    LJIILIIL(objFromJson);
                    return;
                } else {
                    new IllegalArgumentException("data deserialize fail");
                    LJIIL(2);
                    return;
                }
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
                LJIIL(2);
                return;
            }
        }
        new Throwable();
        LJIIL(1);
    }

    public final void LJIILL(C1092890eXv c1092890eXv) {
        DataChannel dataChannel = this.LIZ;
        if (dataChannel == null) {
            return;
        }
        if (this.LIZJ && LJI()) {
            return;
        }
        this.LIZJ = true;
        REQUEST requestLJIIJJI = LJIIJJI(dataChannel, c1092890eXv);
        C480460Ism.LIZ().getClass();
        LiveNotifyApi liveNotifyApi = (LiveNotifyApi) C480460Ism.LIZLLL(LiveNotifyApi.class);
        DecisionRequest decisionRequest = new DecisionRequest();
        decisionRequest.scene = getStrategyName();
        decisionRequest.features.putAll(LJIIIIZZ(requestLJIIJJI));
        this.LIZLLL = (C11JF) liveNotifyApi.decision(decisionRequest).LJIILIIL(new C0UO0()).LJJLL(new AfS186S0100000_17(this, 182), new AfS186S0100000_17(this, 183));
    }
}
