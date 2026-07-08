package X;

import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.feed.skylight.CommonSkylightDataManager;
import com.bytedance.android.livesdk.livesetting.feed.TopLiveSkylightNearbyStyle;
import com.bytedance.android.livesdk.livesetting.skylight.LiveSkylightStyleSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import java.util.List;

/* JADX INFO: renamed from: X.0Ijj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C474850Ijj {
    public static InterfaceC476860Imy LIZIZ() {
        ILiveFeedApiService iLiveFeedApiService = (ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class);
        if (iLiveFeedApiService == null) {
            return null;
        }
        iLiveFeedApiService.zX1();
        return CommonSkylightDataManager.LIZ;
    }

    public static InterfaceC474860Ijk LIZJ() {
        ILiveFeedApiService iLiveFeedApiService = (ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class);
        if (iLiveFeedApiService == null) {
            return null;
        }
        iLiveFeedApiService.Js0();
        return C474870Ijl.LIZ;
    }

    public static float LIZLLL() {
        LiveSkylightStyleSetting liveSkylightStyleSetting = LiveSkylightStyleSetting.INSTANCE;
        float f = liveSkylightStyleSetting.enableStyleV2() ? 146.0f : 128.0f;
        return (liveSkylightStyleSetting.enableStyleV2() || !TopLiveSkylightNearbyStyle.INSTANCE.invoke().getShowLocation()) ? f : f + 14;
    }

    public static boolean LIZ(EnumC471790Ien enumC471790Ien) {
        BaseListResponse<FeedItem, FeedExtra> baseListResponseLJIIL;
        List<FeedItem> list;
        InterfaceC476860Imy interfaceC476860ImyLIZIZ = LIZIZ();
        if (interfaceC476860ImyLIZIZ != null && (baseListResponseLJIIL = interfaceC476860ImyLIZIZ.LJIIL(enumC471790Ien, Boolean.FALSE)) != null && (list = baseListResponseLJIIL.data) != null) {
            return !list.isEmpty();
        }
        return false;
    }
}
