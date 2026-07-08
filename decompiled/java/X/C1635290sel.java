package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;

/* JADX INFO: renamed from: X.0sel, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1635290sel implements IFetchProviderEffect {
    public final /* synthetic */ InterfaceC2329309At<C1641660sp2<ProviderEffectModel>> LIZ;

    public C1635290sel(C11KT c11kt) {
        this.LIZ = c11kt;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect
    public final void onFail(ExceptionResult exceptionResult) {
        this.LIZ.tryOnError(C1635120seU.LJIIIZ(exceptionResult));
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(ProviderEffectModel providerEffectModel) {
        this.LIZ.onSuccess(C1641650sp1.LIZ(providerEffectModel));
    }
}
