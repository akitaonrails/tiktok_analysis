package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;

/* JADX INFO: renamed from: X.0907, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0907 implements IFetchEffectChannelListener {
    public final /* synthetic */ IFetchEffectChannelListener LIZ;
    public final /* synthetic */ InterfaceC1635390sev LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ boolean LIZLLL = false;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        this.LIZIZ.LJJJJI(this.LIZJ, true, this.LIZLLL, this.LIZ);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        this.LIZ.onSuccess(effectChannelResponse);
    }

    public AnonymousClass0907(IFetchEffectChannelListener iFetchEffectChannelListener, InterfaceC1635390sev interfaceC1635390sev, String str) {
        this.LIZ = iFetchEffectChannelListener;
        this.LIZIZ = interfaceC1635390sev;
        this.LIZJ = str;
    }
}
