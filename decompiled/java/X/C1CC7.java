package X;

import android.os.SystemClock;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.1CC7, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CC7 extends C1CC8 {
    public final List<C1CCD> LIZLLL = new ArrayList();
    public final Map<String, EffectChannelResponse> LJ = new HashMap();
    public final Map<String, LiveEffect> LJFF = new HashMap();

    @Override // X.InterfaceC769780UHo
    public final void onDestroy() {
        ((ArrayList) this.LIZIZ).clear();
        ((ArrayList) this.LIZLLL).clear();
        ((HashMap) this.LJ).clear();
        ((HashMap) this.LJFF).clear();
    }

    public C1CC7() {
        new HashMap();
        new HashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.1CC9, com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener] */
    @Override // X.InterfaceC769780UHo
    public final void LIZJ(final String str, final C1CCD c1ccd) {
        final C1CC6 c1cc6;
        if (((HashMap) this.LJ).containsKey(str)) {
            for (C1CCD c1ccd2 : (ArrayList) this.LIZLLL) {
                if (c1ccd2 != null) {
                    c1ccd2.uv((EffectChannelResponse) ((HashMap) this.LJ).get(str));
                }
            }
            if (c1ccd != null) {
                c1ccd.uv((EffectChannelResponse) ((HashMap) this.LJ).get(str));
                return;
            }
            return;
        }
        if (this.LIZ == null) {
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        if (C0UD4.LIZ.equals(str)) {
            c1cc6 = new C1CC4();
        } else if (C0UD4.LIZIZ.equals(str)) {
            c1cc6 = new C1CC5();
        } else {
            c1cc6 = new C1CC6();
        }
        final ?? r2 = new IFetchEffectChannelListener() { // from class: X.1CC9
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult exceptionResult) {
                if (atomicBoolean.get()) {
                    c1cc6.LJIILJJIL(exceptionResult.getErrorCode(), exceptionResult.getMsg());
                }
                for (C1CCD c1ccd3 : (ArrayList) this.LJ.LIZLLL) {
                    if (c1ccd3 != null) {
                        c1ccd3.NP();
                    }
                }
                C1CCD c1ccd4 = c1ccd;
                if (c1ccd4 != null) {
                    c1ccd4.NP();
                }
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                if (effectChannelResponse2 != null) {
                    if (C0IKQ.LIZ(effectChannelResponse2.getCategoryResponseList()) && C0IKQ.LIZ(effectChannelResponse2.getAllCategoryEffects())) {
                        return;
                    }
                    ((HashMap) this.LJ.LJ).put(str, effectChannelResponse2);
                    if (atomicBoolean.get()) {
                        c1cc6.LJIILL();
                    }
                    for (C1CCD c1ccd3 : (ArrayList) this.LJ.LIZLLL) {
                        if (c1ccd3 != null) {
                            c1ccd3.uv((EffectChannelResponse) ((HashMap) this.LJ.LJ).get(str));
                        }
                    }
                    C1CCD c1ccd4 = c1ccd;
                    if (c1ccd4 == null) {
                        return;
                    }
                    c1ccd4.uv((EffectChannelResponse) ((HashMap) this.LJ.LJ).get(str));
                }
            }
        };
        c1cc6.LIZ = SystemClock.uptimeMillis();
        C497740JfY.LJII();
        try {
            if (C036E.LIZ.LIZIZ()) {
                this.LIZ.checkedEffectListUpdate(str, new ICheckChannelListener() { // from class: X.1CCB
                    @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                    public final void checkChannelFailed(ExceptionResult exceptionResult) {
                        this.LIZLLL.LIZLLL(atomicBoolean, str, r2, true);
                    }

                    @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                    public final void checkChannelSuccess(boolean z) {
                        this.LIZLLL.LIZLLL(atomicBoolean, str, r2, z);
                    }
                });
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZLLL(atomicBoolean, str, r2, false);
    }

    public final void LIZLLL(AtomicBoolean atomicBoolean, String str, IFetchEffectChannelListener iFetchEffectChannelListener, boolean z) {
        atomicBoolean.set(z);
        if (z) {
            this.LIZ.fetchEffectList(str, false, iFetchEffectChannelListener);
        } else {
            atomicBoolean.set(false);
            this.LIZ.fetchEffectListFromCache(str, iFetchEffectChannelListener);
        }
    }
}
