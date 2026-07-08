package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;

/* JADX INFO: renamed from: X.16H3, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16H3 extends SimpleServiceLoadCallback {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onOK$0(C16H3 c16h3) {
    }

    public static final void onOK$1(C16H3 c16h3) {
    }

    public static final void onOK$2(C16H3 c16h3) {
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
            default:
                super.onLoad(asyncAVService, j);
                break;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback, com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onOK() {
        switch (this.$t) {
            case 0:
                onOK$0(this);
                break;
            case 1:
                onOK$1(this);
                break;
            case 2:
                onOK$2(this);
                break;
            default:
                super.onOK();
                break;
        }
    }

    public C16H3(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onLoad$0(C16H3 c16h3, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Context) c16h3.l0, ((RecordConfig.Builder) c16h3.l1).build());
    }

    public static final void onLoad$1(C16H3 c16h3, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Context) c16h3.l0, ((RecordConfig.Builder) c16h3.l1).build());
    }

    public static final void onLoad$2(C16H3 c16h3, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord(((C1251890igN) c16h3.l0).LLILZLL, ((RecordConfig.Builder) c16h3.l1).build());
    }
}
