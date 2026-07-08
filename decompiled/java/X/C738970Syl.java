package X;

import com.ss.android.ugc.aweme.feed.IFeedMonitorService;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Syl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C738970Syl implements InterfaceC849390XTt {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ void LIZIZ$1(C738970Syl c738970Syl) {
    }

    public static final /* synthetic */ void LIZIZ$2(C738970Syl c738970Syl) {
    }

    @Override // X.InterfaceC849390XTt
    public final void LIZ() {
        switch (this.$t) {
            case 0:
                LIZ$0(this);
                break;
            case 1:
                LIZ$1(this);
                break;
            case 2:
                LIZ$2(this);
                break;
        }
    }

    @Override // X.InterfaceC849390XTt
    public final void LIZIZ() {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this);
                break;
            case 1:
                LIZIZ$1(this);
                break;
            case 2:
                LIZIZ$2(this);
                break;
        }
    }

    public static final void LIZ$0(C738970Syl c738970Syl) {
        ((VideoFavoriteVM) c738970Syl.l0).zQ2("click_fav_button");
    }

    public static final void LIZ$1(C738970Syl c738970Syl) {
        ((C734700Srs) c738970Syl.l0).LJIIJJI();
    }

    public static final void LIZ$2(C738970Syl c738970Syl) {
        ((Function0) c738970Syl.l0).invoke();
    }

    public static final void LIZIZ$0(C738970Syl c738970Syl) {
        String str;
        IFeedMonitorService iFeedMonitorService = (IFeedMonitorService) ServiceManager.get().getService(IFeedMonitorService.class);
        VideoItemParams item = ((VideoFavoriteVM) c738970Syl.l0).getItem();
        if (item == null || (str = item.mEventType) == null) {
            str = "";
        }
        iFeedMonitorService.LIZIZ("collect", str, "noLogin", false);
    }

    public C738970Syl(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
