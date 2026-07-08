package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IAVRouterIntentParse;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkListener;
import com.ss.android.ugc.aweme.watermark.WaterMarkServiceImpl;

/* JADX INFO: renamed from: X.12YU, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12YU implements IExternalService.ServiceLoadCallback {
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
            case 4:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                break;
            case 5:
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
                onFailed$1(this);
                break;
            case 2:
                onFailed$2(this);
                break;
            case 3:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                break;
            case 4:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                break;
            case 5:
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
            case 4:
                onLoad$4(this, asyncAVService, j);
                break;
            case 5:
                onLoad$5(this, asyncAVService, j);
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
            case 4:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                break;
            case 5:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                break;
        }
    }

    public static final void onFailed$1(C12YU c12yu) {
        WaterMarkListener waterMarkListener = ((WaterMarkBuilder) c12yu.l1).listener;
        if (waterMarkListener != null) {
            waterMarkListener.onError(-114);
        }
    }

    public static final void onFailed$2(C12YU c12yu) {
        WaterMarkListener waterMarkListener = ((WaterMarkBuilder) c12yu.l1).listener;
        if (waterMarkListener != null) {
            waterMarkListener.onError(-114);
        }
    }

    public C12YU(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onLoad$0(C12YU c12yu, AsyncAVService asyncAVService, long j) {
        IAVRouterIntentParse aVRouterIntentParse;
        IMainService iMainService = (IMainService) PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null);
        if (iMainService != null && (aVRouterIntentParse = iMainService.getAVRouterIntentParse()) != null) {
            aVRouterIntentParse.handlePublishVideoRouteUri((Activity) c12yu.l0, (Uri) c12yu.l1);
        }
    }

    public static final void onLoad$1(C12YU c12yu, AsyncAVService asyncAVService, long j) {
        ((WaterMarkServiceImpl) c12yu.l0).getClass();
        WaterMarkServiceImpl.LIZ().LIZJ((WaterMarkBuilder) c12yu.l1);
        ((WaterMarkServiceImpl) c12yu.l0).getClass();
        WaterMarkServiceImpl.LIZ().LIZ();
    }

    public static final void onLoad$2(C12YU c12yu, AsyncAVService asyncAVService, long j) {
        ((WaterMarkServiceImpl) c12yu.l0).getClass();
        WaterMarkServiceImpl.LIZ().waterMark((WaterMarkBuilder) c12yu.l1);
    }

    public static final void onLoad$3(C12YU c12yu, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Context) c12yu.l0, (RecordConfig) c12yu.l1);
    }

    public static final void onLoad$4(C12YU c12yu, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Context) c12yu.l0, (RecordConfig) c12yu.l1);
    }

    public static final void onLoad$5(C12YU c12yu, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Context) c12yu.l0, (RecordConfig) c12yu.l1);
    }
}
