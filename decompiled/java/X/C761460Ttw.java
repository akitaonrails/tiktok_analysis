package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.effect.filter.data.ComposerFilterViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS10S0110100_12;

/* JADX INFO: renamed from: X.0Ttw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C761460Ttw implements ViewModelProvider.Factory {
    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0U3g] */
    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        if (cls.isAssignableFrom(ComposerFilterViewModel.class)) {
            return new ComposerFilterViewModel(new C0U4A(), new C0U5H() { // from class: X.0U3g
                public final C0U49 LIZJ = new C0U49();

                @Override // X.C0U3X
                public final List<C0U74<LiveEffect>> LJI(EffectChannelResponse effectChannelResponse) {
                    return this.LIZJ.LJI(effectChannelResponse);
                }

                @Override // X.C0U5H, X.C0U69
                public final List<C0U74<LiveEffect>> LJIIIZ(List<C0U74<LiveEffect>> list) {
                    Iterator<Object> it2 = new C1939607ik(list).iterator();
                    while (it2.hasNext()) {
                        for (final T t : ((C0U74) it2.next()).LIZIZ) {
                            if (!C0U5H.LJIILL(t)) {
                                final long jCurrentTimeMillis = System.currentTimeMillis();
                                LJIIL(t, new IEffectDownloadProgressListener() { // from class: X.0U3h
                                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
                                    public final void onProgress(Effect effect, int i, long j) {
                                    }

                                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                                    public final void onStart(Effect effect) {
                                    }

                                    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                                    public final void onSuccess(Effect effect) {
                                        C766060U3g c766060U3g = this.LIZ;
                                        long j = jCurrentTimeMillis;
                                        LiveEffect liveEffect = t;
                                        c766060U3g.getClass();
                                        C0IUQ.LIZ(new AwS10S0110100_12(j, liveEffect, true, 1));
                                    }

                                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                                    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                                        C766060U3g c766060U3g = this.LIZ;
                                        long j = jCurrentTimeMillis;
                                        LiveEffect liveEffect = t;
                                        c766060U3g.getClass();
                                        C0IUQ.LIZ(new AwS10S0110100_12(j, liveEffect, false, 1));
                                    }
                                }, false, false, false);
                            }
                        }
                    }
                    C0U74 c0u74 = (C0U74) C13LP.LJJJLL(list);
                    if (c0u74 != null) {
                        C761210TtX.LIZIZ(c0u74.LIZIZ);
                    }
                    return list;
                }
            });
        }
        throw new IllegalArgumentException("UnKnown class");
    }
}
