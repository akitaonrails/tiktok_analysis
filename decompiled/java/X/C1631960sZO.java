package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.0sZO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1631960sZO implements IEffectDownloadProgressListener {
    public final /* synthetic */ C11PR<C1661140tKS> LIZ;
    public final /* synthetic */ C09AJ<C1661050tKJ> LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        this.LIZ.onNext(new C1661140tKS(-101, -102, effect, 0L, null, 24));
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        C1631990sZR.LIZIZ(this.LIZ, this.LIZIZ, effect, false);
    }

    public C1631960sZO(C11PR<C1661140tKS> c11pr, C09AJ<C1661050tKJ> c09aj) {
        this.LIZ = c11pr;
        this.LIZIZ = c09aj;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
        C1631990sZR.LIZ(this.LIZ, this.LIZIZ, effect, exceptionResult, 16);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
    public final void onProgress(Effect effect, int i, long j) {
        this.LIZ.onNext(new C1661140tKS(-101, i, effect, j, null, 16));
    }
}
