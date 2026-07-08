package X;

import com.bytedance.android.live.effect.datastore.base.BaseEffectViewModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0U3j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C766090U3j implements IEffectDownloadProgressListener {
    public final /* synthetic */ Function1<Integer, Unit> LIZ;
    public final /* synthetic */ BaseEffectViewModel<Object> LIZIZ;
    public final /* synthetic */ Object LIZJ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        Function1<Integer, Unit> function1 = this.LIZ;
        if (function1 != null) {
            function1.invoke(-1);
        }
        this.LIZIZ.zQ2(-1, this.LIZJ);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        Function1<Integer, Unit> function1 = this.LIZ;
        if (function1 != null) {
            function1.invoke(-2);
        }
        this.LIZIZ.zQ2(-2, this.LIZJ);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
        Function1<Integer, Unit> function1 = this.LIZ;
        if (function1 != null) {
            function1.invoke(-3);
        }
        this.LIZIZ.zQ2(-3, this.LIZJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C766090U3j(Function1<? super Integer, Unit> function1, BaseEffectViewModel<Object> baseEffectViewModel, Object obj) {
        this.LIZ = function1;
        this.LIZIZ = baseEffectViewModel;
        this.LIZJ = obj;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
    public final void onProgress(Effect effect, int i, long j) {
        Function1<Integer, Unit> function1 = this.LIZ;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i));
        }
        this.LIZIZ.zQ2(i, this.LIZJ);
    }
}
