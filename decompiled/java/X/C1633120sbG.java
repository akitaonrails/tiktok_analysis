package X;

import com.ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ISearchEffectListenerV2;
import com.ss.android.ugc.effectmanager.effect.model.SearchEffectResponseV2;
import kotlin.Pair;
import wuk.f;

/* JADX INFO: renamed from: X.0sbG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1633120sbG implements ISearchEffectListenerV2 {
    public final /* synthetic */ f LIZ;
    public final /* synthetic */ C1633110sbF LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.ISearchEffectListenerV2
    public final void onFail(ExceptionResult exceptionResult) {
        Exception statusCodeException;
        if (exceptionResult.getException() != null) {
            statusCodeException = exceptionResult.getException();
        } else {
            statusCodeException = new StatusCodeException(exceptionResult.getErrorCode(), "search stickers failed");
        }
        this.LIZ.LJIJJLI.onNext(new Pair<>(Integer.valueOf(this.LIZIZ.LJIIJ), new C23056091q(statusCodeException)));
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(SearchEffectResponseV2 searchEffectResponseV2) {
        this.LIZ.LJIJJLI.onNext(new Pair<>(Integer.valueOf(this.LIZIZ.LJIIJ), new C23061091v(searchEffectResponseV2)));
    }

    public C1633120sbG(f fVar, C1633110sbF c1633110sbF) {
        this.LIZ = fVar;
        this.LIZIZ = c1633110sbF;
    }
}
