package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;

/* JADX INFO: renamed from: X.0sZI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1631900sZI implements IFetchCategoryEffectListener {
    public final /* synthetic */ C09AJ<CategoryPageModel> LIZ;

    public C1631900sZI(C19482611Ke c19482611Ke) {
        this.LIZ = c19482611Ke;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
    public final void onFail(ExceptionResult exceptionResult) {
        if (this.LIZ.isDisposed()) {
            return;
        }
        this.LIZ.onError(exceptionResult.getException());
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(CategoryPageModel categoryPageModel) {
        CategoryPageModel categoryPageModel2 = categoryPageModel;
        if (!this.LIZ.isDisposed() && categoryPageModel2.getCategoryEffects() != null) {
            C09AJ<CategoryPageModel> c09aj = this.LIZ;
            c09aj.onNext(categoryPageModel2);
            c09aj.onComplete();
        }
    }
}
