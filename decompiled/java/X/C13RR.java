package X;

import com.ss.android.ugc.aweme.effectplatform.EffectPlatformCaching;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;

/* JADX INFO: renamed from: X.13RR, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13RR implements IFetchPanelInfoListener {
    public final IFetchPanelInfoListener LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
    public final void onFail(ExceptionResult exceptionResult) {
        this.LIZ.onFail(exceptionResult);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(PanelInfoModel panelInfoModel) {
        String str = this.LIZJ;
        if (str != null && str.length() != 0) {
            EffectPlatformCaching.LJIIZILJ().LJJI(this.LIZIZ, this.LIZJ);
        } else {
            EffectPlatformCaching.LJIIZILJ().LJJ(this.LIZIZ);
        }
        this.LIZ.onSuccess(panelInfoModel);
    }

    public C13RR(IFetchPanelInfoListener iFetchPanelInfoListener, String str, String str2) {
        this.LIZ = iFetchPanelInfoListener;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
