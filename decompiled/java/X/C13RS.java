package X;

import com.ss.android.ugc.aweme.effectplatform.EffectPlatformCaching;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;

/* JADX INFO: renamed from: X.13RS, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13RS implements IFetchCategoryEffectListener {
    public final IFetchCategoryEffectListener LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
    public final void onFail(ExceptionResult exceptionResult) {
        this.LIZ.onFail(exceptionResult);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(CategoryPageModel categoryPageModel) {
        String str = this.LIZJ;
        if (str != null && str.length() != 0) {
            EffectPlatformCaching.LJIIZILJ().LJJI(this.LIZIZ, this.LIZJ);
        } else {
            EffectPlatformCaching.LJIIZILJ().LJJ(this.LIZIZ);
        }
        this.LIZ.onSuccess(categoryPageModel);
    }

    public C13RS(IFetchCategoryEffectListener iFetchCategoryEffectListener, String str, String str2) {
        this.LIZ = iFetchCategoryEffectListener;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
