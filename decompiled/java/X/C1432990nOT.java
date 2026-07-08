package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS423S0200000_22;

/* JADX INFO: renamed from: X.0nOT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1432990nOT implements IFetchEffectChannelListener {
    public final /* synthetic */ Function1<List<? extends Effect>, Unit> LIZ;
    public final /* synthetic */ Function1<ExceptionResult, Unit> LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        C2219091BtD.LIZLLL().d("viki filter, EPFilterCacheDataFetcher.requestFromCache -> onFail");
        this.LIZIZ.invoke(exceptionResult);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        C2219091BtD.LIZLLL().d("viki filter, EPFilterCacheDataFetcher.requestFromCache -> onSuccess");
        new AwS423S0200000_22(effectChannelResponse, (EffectChannelResponse) this.LIZ, (Function1<? super List<? extends Effect>, Unit>) 0).invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1432990nOT(Function1<? super List<? extends Effect>, Unit> function1, Function1<? super ExceptionResult, Unit> function12) {
        this.LIZ = function1;
        this.LIZIZ = function12;
    }
}
