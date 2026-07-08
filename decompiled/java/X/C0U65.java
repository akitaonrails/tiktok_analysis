package X;

import Y.AfS181S0100000_12;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;

/* JADX INFO: renamed from: X.0U65, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U65<T> implements IFetchEffectChannelListener {
    public final String LIZ;
    public final C0U3X<T> LIZIZ;
    public final C0U69<T> LIZJ;
    public final C0U68<T> LIZLLL;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        C770170UJb.LIZJ("LiveEffectDataProvider");
        C770170UJb.LIZIZ("fetch from cache fail");
        C497740JfY.LJII();
        try {
            if (C036E.LIZ.LIZIZ()) {
                C770170UJb.LIZJ("LiveEffectDataProvider");
                C770170UJb.LIZIZ("try fetch from remote");
                C766720U5u.LIZ.getClass();
                EffectManager effectManagerLJIILL = C766720U5u.LJIILL();
                String str = this.LIZ;
                effectManagerLJIILL.fetchEffectList(str, false, (IFetchEffectChannelListener) new C0U67(str, this.LIZIZ, this.LIZJ, this.LIZLLL));
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C770170UJb.LIZJ("LiveEffectDataProvider");
        C770170UJb.LIZIZ("not network");
        C0U68<T> c0u68 = this.LIZLLL;
        if (c0u68 != null) {
            c0u68.onFail();
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        C770170UJb.LIZJ("LiveEffectDataProvider");
        C770170UJb.LIZIZ("fetch from cache success");
        C11NZ.LJIJJLI(new C786330Usx(this, effectChannelResponse, 3)).LJIILIIL(new C0UO0()).LJJLJLI(new AfS181S0100000_12(this, 233));
    }

    public C0U65(String str, C0U3X<T> c0u3x, C0U69<T> c0u69, C0U68<T> c0u68) {
        this.LIZ = str;
        this.LIZIZ = c0u3x;
        this.LIZJ = c0u69;
        this.LIZLLL = c0u68;
    }
}
