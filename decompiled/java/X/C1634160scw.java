package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0scw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1634160scw implements IDownloadProviderEffectProgressListener {
    public final long LIZ = System.currentTimeMillis();
    public final /* synthetic */ InterfaceC1632620saS<ProviderEffect, Object, Object> LIZIZ;
    public final /* synthetic */ ProviderEffect LIZJ;
    public final /* synthetic */ AbstractC1634150scv<Object, Object> LIZLLL;

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(ProviderEffect providerEffect) {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZ;
        InterfaceC1632620saS<ProviderEffect, Object, Object> interfaceC1632620saS = this.LIZIZ;
        ProviderEffect providerEffect2 = this.LIZJ;
        getClass();
        getClass();
        interfaceC1632620saS.LIZ(providerEffect2, null, Unit.LIZ, jCurrentTimeMillis);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectListener
    public final void onFail(ProviderEffect providerEffect, ExceptionResult exceptionResult) {
        Exception exception;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZ;
        InterfaceC1632620saS<ProviderEffect, Object, Object> interfaceC1632620saS = this.LIZIZ;
        ProviderEffect providerEffect2 = this.LIZJ;
        getClass();
        if (exceptionResult != null) {
            exception = exceptionResult.getException();
        } else {
            exception = null;
        }
        getClass();
        interfaceC1632620saS.LIZIZ(providerEffect2, exception, Unit.LIZ, jCurrentTimeMillis);
    }

    public C1634160scw(C1632770sah c1632770sah, ProviderEffect providerEffect, AbstractC1634150scv abstractC1634150scv) {
        this.LIZIZ = c1632770sah;
        this.LIZJ = providerEffect;
        this.LIZLLL = abstractC1634150scv;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectProgressListener
    public final void onProgress(ProviderEffect providerEffect, int i, long j) {
        this.LIZIZ.LIZJ(i, this.LIZJ);
    }
}
