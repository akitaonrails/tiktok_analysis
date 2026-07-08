package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.0sVR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1629510sVR implements IEffectDownloadProgressListener {
    public final /* synthetic */ IFetchEffectListener LIZ;

    public C1629510sVR(IFetchEffectListener iFetchEffectListener) {
        this.LIZ = iFetchEffectListener;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        IFetchEffectListener iFetchEffectListener = this.LIZ;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onStart(effect);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        IFetchEffectListener iFetchEffectListener = this.LIZ;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onSuccess(effect);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
        IFetchEffectListener iFetchEffectListener = this.LIZ;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onFail(effect, exceptionResult);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
    public final void onProgress(Effect effect, int i, long j) {
        IEffectDownloadProgressListener iEffectDownloadProgressListener;
        IFetchEffectListener iFetchEffectListener = this.LIZ;
        if ((iFetchEffectListener instanceof IEffectDownloadProgressListener) && (iEffectDownloadProgressListener = (IEffectDownloadProgressListener) iFetchEffectListener) != null) {
            iEffectDownloadProgressListener.onProgress(effect, i, j);
        }
    }
}
