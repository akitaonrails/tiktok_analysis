package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList;
import java.util.List;

/* JADX INFO: renamed from: X.0sZG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1631880sZG implements IModFavoriteList {
    public final /* synthetic */ C09AJ<List<String>> LIZ;

    public C1631880sZG(C19482611Ke c19482611Ke) {
        this.LIZ = c19482611Ke;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList
    public final void onFail(ExceptionResult exceptionResult) {
        if (this.LIZ.isDisposed()) {
            return;
        }
        this.LIZ.onError(exceptionResult.getException());
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(List<String> list) {
        if (!this.LIZ.isDisposed()) {
            if (list != null) {
                C09AJ<List<String>> c09aj = this.LIZ;
                c09aj.onNext(list);
                c09aj.onComplete();
                return;
            }
            this.LIZ.onError(new IllegalArgumentException("modify favorite sticker failed"));
        }
    }
}
