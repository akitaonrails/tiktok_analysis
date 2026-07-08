package X;

import android.os.SystemClock;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.1CC8, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public abstract class C1CC8 implements InterfaceC769780UHo {
    public final EffectManager LIZ = ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).LLJILJILJ();
    public final List<C1CCC> LIZIZ = new ArrayList();
    public final List<String> LIZJ = new ArrayList();

    @Override // X.InterfaceC769780UHo
    public final boolean LIZ(LiveEffect liveEffect) {
        C766720U5u c766720U5u = C766720U5u.LIZ;
        Effect effectLIZIZ = C0UEO.LIZIZ(liveEffect);
        c766720U5u.getClass();
        return C766720U5u.LJIIZILJ(effectLIZIZ);
    }

    @Override // X.InterfaceC769780UHo
    public final void LIZIZ(final String str, LiveEffect liveEffect, final C1CCC c1ccc) {
        final C1CC6 c1cc6;
        if (LIZ(liveEffect)) {
            return;
        }
        if (C0UD4.LIZ.equals(str)) {
            c1cc6 = new C1CC4();
        } else if (C0UD4.LIZIZ.equals(str)) {
            c1cc6 = new C1CC5();
        } else {
            c1cc6 = new C1CC6();
        }
        c1cc6.LIZIZ = SystemClock.uptimeMillis();
        this.LIZ.fetchEffect(C0UEO.LIZIZ(liveEffect), new IEffectDownloadProgressListener() { // from class: X.1CCA
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onStart(Effect effect) {
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(Effect effect) {
                Effect effect2 = effect;
                LiveEffect liveEffectLIZLLL = C0UEO.LIZLLL(effect2);
                liveEffectLIZLLL.LJLILLLLZI(false);
                liveEffectLIZLLL.LJJLIL(true);
                c1cc6.LJIILIIL();
                ((ArrayList) this.LIZLLL.LIZJ).add(effect2.getUnzipPath());
                Iterator it2 = ((ArrayList) this.LIZLLL.LIZIZ).iterator();
                while (it2.hasNext()) {
                    ((C1CCC) it2.next()).LIZLLL(liveEffectLIZLLL, str);
                }
                C1CCC c1ccc2 = c1ccc;
                if (c1ccc2 != null) {
                    c1ccc2.LIZLLL(liveEffectLIZLLL, str);
                }
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                this.LIZLLL.LIZ.deleteEffect(effect);
                LiveEffect liveEffectLIZLLL = C0UEO.LIZLLL(effect);
                liveEffectLIZLLL.LJLILLLLZI(false);
                c1cc6.LJIIL(exceptionResult.getErrorCode(), exceptionResult.getMsg());
                Iterator it2 = ((ArrayList) this.LIZLLL.LIZIZ).iterator();
                while (it2.hasNext()) {
                    ((C1CCC) it2.next()).LIZJ(liveEffectLIZLLL, str);
                }
                C1CCC c1ccc2 = c1ccc;
                if (c1ccc2 != null) {
                    c1ccc2.LIZJ(liveEffectLIZLLL, str);
                }
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
            public final void onProgress(Effect effect, int i, long j) {
                LiveEffect liveEffectLIZLLL = C0UEO.LIZLLL(effect);
                Iterator it2 = ((ArrayList) this.LIZLLL.LIZIZ).iterator();
                while (it2.hasNext()) {
                    ((C1CCC) it2.next()).LIZIZ(liveEffectLIZLLL);
                }
                C1CCC c1ccc2 = c1ccc;
                if (c1ccc2 != null) {
                    c1ccc2.LIZIZ(liveEffectLIZLLL);
                }
            }
        });
        liveEffect.LJLILLLLZI(true);
        Iterator it2 = ((ArrayList) this.LIZIZ).iterator();
        while (it2.hasNext()) {
            ((C1CCC) it2.next()).LIZ();
        }
        if (c1ccc != null) {
            c1ccc.LIZ();
        }
    }
}
