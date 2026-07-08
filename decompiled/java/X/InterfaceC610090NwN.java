package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.FeedReachGetParams;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.FeedReachResponse;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.FeedReachUpdateParams;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0NwN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC610090NwN {
    public static final C610080NwM LIZ = C610080NwM.LIZ;

    @InterfaceC1501240pAY("api/v1/mall/feed/reach/update")
    Object LJIILLIIL(@C040I FeedReachUpdateParams feedReachUpdateParams, InterfaceC1364105Vn<? super C0X52<Response<Unit>>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("api/v1/mall/feed/reach/get")
    Object LJIIZILJ(@C040I FeedReachGetParams feedReachGetParams, InterfaceC1364105Vn<? super C0X52<Response<FeedReachResponse>>> interfaceC1364105Vn);
}
