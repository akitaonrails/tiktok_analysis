package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;

/* JADX INFO: renamed from: X.12HB, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12HB implements IFetchEffectChannelListener {
    public final /* synthetic */ C12HN LIZ;
    public final /* synthetic */ C19729512Hd LIZIZ;
    public final /* synthetic */ C12H8 LIZJ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        String logId;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendRequest fetchBeautyComponentList onFailed. logId=");
        if (exceptionResult != null) {
            logId = exceptionResult.getLogId();
        } else {
            logId = null;
        }
        sbLIZ.append(logId);
        sbLIZ.append(", ");
        sbLIZ.append(exceptionResult);
        C19570511hX.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        ((InterfaceC1635390sev) this.LIZ.LJIILIIL.getValue()).LJIJI(this.LIZIZ.LIZ, new C19773612Yc(this, 3));
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C12H4(effectChannelResponse, this.LIZ, this.LIZIZ, this.LIZJ, null), 3);
    }

    public C12HB(C12HN c12hn, C19729512Hd c19729512Hd, C12IG c12ig) {
        this.LIZ = c12hn;
        this.LIZIZ = c19729512Hd;
        this.LIZJ = c12ig;
    }
}
