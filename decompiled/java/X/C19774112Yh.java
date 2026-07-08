package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.Iterator;

/* JADX INFO: renamed from: X.12Yh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19774112Yh implements InterfaceC300801Eo {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC300801Eo
    public final void subscribe(InterfaceC2329309At<Boolean> interfaceC2329309At) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC2329309At);
                break;
            case 1:
                subscribe$1(this, interfaceC2329309At);
                break;
        }
    }

    public C19774112Yh(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void subscribe$0(C19774112Yh c19774112Yh, InterfaceC2329309At interfaceC2329309At) {
        final AnimatorSet animatorSet = (AnimatorSet) c19774112Yh.l0;
        final C11KT c11kt = (C11KT) interfaceC2329309At;
        animatorSet.addListener(new C464420IJc() { // from class: X.11Uj
            @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                if (!c11kt.isDisposed()) {
                    c11kt.onSuccess(Boolean.FALSE);
                }
                animatorSet.removeAllListeners();
            }

            @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (!c11kt.isDisposed()) {
                    c11kt.onSuccess(Boolean.TRUE);
                }
                animatorSet.removeAllListeners();
            }
        });
        ((AnimatorSet) c19774112Yh.l0).start();
    }

    public static final void subscribe$1(C19774112Yh c19774112Yh, InterfaceC2329309At interfaceC2329309At) {
        final C196986125g c196986125g = (C196986125g) c19774112Yh.l0;
        final C11KT c11kt = (C11KT) interfaceC2329309At;
        c196986125g.LJ.LJJJJI("textfont", false, true, new IFetchEffectChannelListener() { // from class: X.125h
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult exceptionResult) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("prefetch fail err: ");
                sbLIZ.append(exceptionResult.getMsg());
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
                c11kt.onError(exceptionResult.getException());
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                Iterator<Effect> it2 = effectChannelResponse.getAllCategoryEffects().iterator();
                while (it2.hasNext()) {
                    c196986125g.LJII(it2.next());
                }
                c11kt.onSuccess(c196986125g.LJ());
            }
        });
    }
}
