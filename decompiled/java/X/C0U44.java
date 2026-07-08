package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.0U44, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U44 implements IEffectDownloadProgressListener {
    public final /* synthetic */ C0U45 LIZ;
    public final /* synthetic */ Object LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        LiveEffect liveEffect;
        C0U45 c0u45 = this.LIZ;
        Object obj = this.LIZIZ;
        if (obj instanceof LiveEffect) {
            liveEffect = (LiveEffect) obj;
        } else {
            liveEffect = null;
        }
        c0u45.LIZJ(liveEffect);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        LiveEffect liveEffect;
        C0U45 c0u45 = this.LIZ;
        Object obj = this.LIZIZ;
        if (obj instanceof LiveEffect) {
            liveEffect = (LiveEffect) obj;
        } else {
            liveEffect = null;
        }
        c0u45.LIZ(liveEffect);
    }

    public C0U44(C0U45 c0u45, Object obj) {
        this.LIZ = c0u45;
        this.LIZIZ = obj;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
        LiveEffect liveEffect;
        C0U45 c0u45 = this.LIZ;
        Object obj = this.LIZIZ;
        if (obj instanceof LiveEffect) {
            liveEffect = (LiveEffect) obj;
        } else {
            liveEffect = null;
        }
        c0u45.LJ(liveEffect, exceptionResult);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
    public final void onProgress(Effect effect, int i, long j) {
        LiveEffect liveEffect;
        C0U45 c0u45 = this.LIZ;
        Object obj = this.LIZIZ;
        if (obj instanceof LiveEffect) {
            liveEffect = (LiveEffect) obj;
        } else {
            liveEffect = null;
        }
        c0u45.LIZIZ(liveEffect, i, j);
    }
}
