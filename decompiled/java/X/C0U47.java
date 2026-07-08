package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0U47, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U47 implements IEffectDownloadProgressListener {
    public final WeakReference<C0U45> LIZ;

    public C0U47(C0U45 c0u45) {
        this.LIZ = new WeakReference<>(c0u45);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        C0U45 c0u45 = this.LIZ.get();
        if (c0u45 != null) {
            c0u45.LIZJ(C0UEO.LIZLLL(effect));
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        String effect_id;
        Effect effect2 = effect;
        C770170UJb.LIZJ("LiveEffectDataProvider");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("download effect success, effect_id: ");
        if (effect2 != null) {
            effect_id = effect2.getEffect_id();
        } else {
            effect_id = null;
        }
        sbLIZ.append(effect_id);
        C2188811AlT.LIZIZ(sbLIZ);
        C770170UJb.LIZLLL = "";
        C766720U5u.LIZ.getClass();
        C766720U5u.LIZIZ(effect2);
        C0U45 c0u45 = this.LIZ.get();
        if (c0u45 != null) {
            c0u45.LIZ(C0UEO.LIZLLL(effect2));
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
        C0U45 c0u45 = this.LIZ.get();
        if (c0u45 != null) {
            c0u45.LJ(C0UEO.LIZLLL(effect), exceptionResult);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetch effect ");
        sbLIZ.append(effect);
        sbLIZ.append(" error: ");
        sbLIZ.append(exceptionResult);
        C20441214yg.LJ("LiveEffectDataProvider", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
    public final void onProgress(Effect effect, int i, long j) {
        C0U45 c0u45 = this.LIZ.get();
        if (c0u45 != null) {
            c0u45.LIZIZ(C0UEO.LIZLLL(effect), i, j);
        }
    }
}
