package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.List;

/* JADX INFO: renamed from: X.13RL, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13RL implements IFetchEffectChannelListener {
    public final /* synthetic */ IFetchEffectChannelListener LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ C13RJ LIZLLL;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        this.LIZLLL.LJI(this.LIZIZ, this.LIZJ, C13RU.LIZ(this.LIZIZ, this.LIZ));
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        final EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
        if (effectChannelResponse2.getAllCategoryEffects().size() == 0) {
            this.LIZLLL.LJI(this.LIZIZ, this.LIZJ, C13RU.LIZ(this.LIZIZ, this.LIZ));
        } else if (this.LIZJ) {
            this.LIZLLL.LIZJ(effectChannelResponse2.getAllCategoryEffects(), new IFetchEffectListListener() { // from class: X.13RO
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
                public final void onFail(ExceptionResult exceptionResult) {
                    C13RL c13rl = this.LIZIZ;
                    C13RU c13ruLIZ = C13RU.LIZ(c13rl.LIZIZ, c13rl.LIZ);
                    C13RL c13rl2 = this.LIZIZ;
                    c13rl2.LIZLLL.LJI(c13rl2.LIZIZ, true, c13ruLIZ);
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(List<Effect> list) {
                    this.LIZIZ.LIZ.onSuccess(effectChannelResponse2);
                }
            });
        } else {
            this.LIZ.onSuccess(effectChannelResponse2);
        }
    }

    public C13RL(C13RJ c13rj, IFetchEffectChannelListener iFetchEffectChannelListener, String str, boolean z) {
        this.LIZLLL = c13rj;
        this.LIZ = iFetchEffectChannelListener;
        this.LIZIZ = str;
        this.LIZJ = z;
    }
}
