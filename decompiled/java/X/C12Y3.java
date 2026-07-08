package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.search.pages.result.musicsearch.core.viewmodel.SearchMusicPlayerLifecycleObserver;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* JADX INFO: renamed from: X.12Y3, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12Y3 extends SimpleServiceLoadCallback {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final void onLoad$0(C12Y3 c12y3, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Activity) c12y3.l0, ((RecordConfig.Builder) c12y3.l1).build(), (MusicModel) c12y3.l2, false);
    }

    public static final void onLoad$1(C12Y3 c12y3, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Activity) c12y3.l0, (RecordConfig) c12y3.l1, (MusicModel) c12y3.l2, true);
    }

    public static final void onLoad$2(C12Y3 c12y3, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord(((SearchMusicPlayerLifecycleObserver) c12y3.l2).LL, (RecordConfig) c12y3.l0, (MusicModel) c12y3.l1, false);
    }

    public C12Y3(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
