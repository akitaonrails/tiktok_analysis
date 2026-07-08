package com.bytedance.android.live.effect.datastore.base;

import X.AbstractC23140094w;
import X.AbstractC766100U3k;
import X.C01PN;
import X.C095G;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C09IR;
import X.C0U44;
import X.C0U45;
import X.C0U74;
import X.C1DEK;
import X.C2252331DDr;
import X.C23250099c;
import X.C23260099m;
import X.C766090U3j;
import X.InterfaceC396201gO;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BaseEffectViewModel<T> extends ViewModel {
    public final AbstractC766100U3k<T> LL;
    public final C1DEK LLILLJJLI = C095G.LIZ(Integer.MAX_VALUE, null, 6);
    public final C2252331DDr LLILLL = C09IR.LIZIZ(0, 10, null, 4);

    public final boolean yQ2(T t) {
        AbstractC766100U3k<T> abstractC766100U3k = this.LL;
        if (abstractC766100U3k != null) {
            return abstractC766100U3k.LJIILJJIL(t);
        }
        return false;
    }

    public BaseEffectViewModel(InterfaceC396201gO<C0U74<T>> interfaceC396201gO, AbstractC766100U3k<T> abstractC766100U3k) {
        this.LL = abstractC766100U3k;
    }

    public final Object xQ2(LiveEffect liveEffect, AbstractC23140094w abstractC23140094w) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(abstractC23140094w));
        AbstractC766100U3k<T> abstractC766100U3k = this.LL;
        if (abstractC766100U3k != null) {
            abstractC766100U3k.LJIIL(liveEffect, new IEffectDownloadProgressListener() { // from class: X.0FOH
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
                public final void onProgress(Effect effect, int i, long j) {
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onStart(Effect effect) {
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(Effect effect) {
                    InterfaceC1364105Vn<Boolean> interfaceC1364105Vn = c23260099m;
                    Boolean bool = Boolean.TRUE;
                    C189200o6.m2constructorimpl(bool);
                    interfaceC1364105Vn.resumeWith(bool);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                    InterfaceC1364105Vn<Boolean> interfaceC1364105Vn = c23260099m;
                    Boolean bool = Boolean.FALSE;
                    C189200o6.m2constructorimpl(bool);
                    interfaceC1364105Vn.resumeWith(bool);
                }
            }, false, false, false);
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(abstractC23140094w);
        }
        return objLIZ;
    }

    public final void zQ2(int i, Object obj) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C01PN(i, this, obj, null), 3);
    }

    public static void wQ2(BaseEffectViewModel baseEffectViewModel, Object obj, C0U45 c0u45) {
        AbstractC766100U3k<T> abstractC766100U3k = baseEffectViewModel.LL;
        if (abstractC766100U3k != null) {
            abstractC766100U3k.LJIIL(obj, new C0U44(c0u45, obj), false, false, false);
        }
    }

    public static void vQ2(BaseEffectViewModel baseEffectViewModel, Object obj, Function1 function1, int i) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        AbstractC766100U3k<T> abstractC766100U3k = baseEffectViewModel.LL;
        if (abstractC766100U3k != null) {
            abstractC766100U3k.LJIIL(obj, new C766090U3j(function1, baseEffectViewModel, obj), false, false, false);
        }
    }
}
