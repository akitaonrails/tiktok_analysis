package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01hz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C406101hz implements IFetchEffectListener {
    public final /* synthetic */ Function1<Effect, Unit> LIZ;
    public final /* synthetic */ Function1<Exception, Unit> LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        this.LIZ.invoke(effect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C406101hz(Function1<? super Effect, Unit> function1, Function1<? super Exception, Unit> function12) {
        this.LIZ = function1;
        this.LIZIZ = function12;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
        this.LIZIZ.invoke(exceptionResult.getException());
    }
}
