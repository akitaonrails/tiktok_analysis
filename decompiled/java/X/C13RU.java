package X;

import com.ss.android.ugc.aweme.effectplatform.EffectPlatformCaching;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;

/* JADX INFO: renamed from: X.13RU, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13RU implements IFetchEffectChannelListener {
    public final IFetchEffectChannelListener LIZ;
    public final String LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        this.LIZ.onFail(exceptionResult);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        EffectPlatformCaching.LJIIZILJ().LJJ(this.LIZIZ);
        this.LIZ.onSuccess(effectChannelResponse);
    }

    public C13RU(IFetchEffectChannelListener iFetchEffectChannelListener, String str) {
        this.LIZ = iFetchEffectChannelListener;
        this.LIZIZ = str;
    }

    public static final C13RU LIZ(String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
        return new C13RU(iFetchEffectChannelListener, str);
    }
}
