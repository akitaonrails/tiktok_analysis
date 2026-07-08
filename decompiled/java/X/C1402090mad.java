package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.detail.panel.CreativeHubPanel;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;

/* JADX INFO: renamed from: X.0mad, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1402090mad implements IExternalService.ServiceLoadCallback {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onDismiss() {
        switch (this.$t) {
            case 0:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                break;
            case 1:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                break;
            case 2:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                break;
            case 3:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                break;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onFailed() {
        switch (this.$t) {
            case 0:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                break;
            case 1:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                break;
            case 2:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                break;
            case 3:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                break;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService asyncAVService, long j) {
        switch (this.$t) {
            case 0:
                onLoad$0(this, asyncAVService, j);
                break;
            case 1:
                onLoad$1(this, asyncAVService, j);
                break;
            case 2:
                onLoad$2(this, asyncAVService, j);
                break;
            case 3:
                onLoad$3(this, asyncAVService, j);
                break;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onOK() {
        switch (this.$t) {
            case 0:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                break;
            case 1:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                break;
            case 2:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                break;
            case 3:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                break;
        }
    }

    public C1402090mad(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onLoad$0(C1402090mad c1402090mad, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord(((C682310QpZ) c1402090mad.l0).itemView.getContext(), ((RecordConfig.Builder) c1402090mad.l1).build());
    }

    public static final void onLoad$1(C1402090mad c1402090mad, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord(((CreativeHubPanel) c1402090mad.l0).activity, ((RecordConfig.Builder) c1402090mad.l1).build());
    }

    public static final void onLoad$2(C1402090mad c1402090mad, AsyncAVService asyncAVService, long j) {
        FaceStickerBean.sCurPropSource = "general_search";
        asyncAVService.uiService().recordService().startRecord((Activity) c1402090mad.l0, ((RecordConfig.Builder) c1402090mad.l1).build());
    }

    public static final void onLoad$3(C1402090mad c1402090mad, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Context) c1402090mad.l0, ((RecordConfig.Builder) c1402090mad.l1).build());
    }
}
