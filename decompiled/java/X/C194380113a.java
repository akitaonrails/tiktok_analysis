package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import java.util.Map;

/* JADX INFO: renamed from: X.113a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194380113a implements IFetchPanelInfoListener {
    public final /* synthetic */ C113Z LIZ;
    public final /* synthetic */ Map<String, String> LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
    public final void onFail(ExceptionResult exceptionResult) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downloadPanelList Error: ");
        if (exceptionResult != null) {
            numValueOf = Integer.valueOf(exceptionResult.getErrorCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C201955140j.LIZIZ("EditEffectPanelView", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ.C0(null, this.LIZIZ);
        Activity activity = this.LIZ.LLILLJJLI.mActivity;
        if (activity != null) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131848736);
            C1390380mHk.LIZ(activity, 6001, creativeToastBuilder);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(PanelInfoModel panelInfoModel) {
        this.LIZ.LLJJJ = false;
        C201955140j.LIZIZ("EditEffectPanelView", "DownloadPanelList Success");
        this.LIZ.C0(new C194387113h(panelInfoModel, null), this.LIZIZ);
    }

    public C194380113a(C113Z c113z, Map<String, String> map) {
        this.LIZ = c113z;
        this.LIZIZ = map;
    }
}
