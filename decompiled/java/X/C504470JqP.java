package X;

import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.assem.arch.core.UIAssem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import webcast.api.sub.HomePageInfo;
import webcast.api.sub.HomePageResponse;

/* JADX INFO: renamed from: X.0JqP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C504470JqP extends C09AY implements Function2<UIAssem, C291001Au<? extends HomePageResponse.ResponseData>, Unit> {
    public final /* synthetic */ C16FV LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C504470JqP(C16FV c16fv) {
        super(2);
        this.LL = c16fv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(UIAssem uIAssem, C291001Au<? extends HomePageResponse.ResponseData> c291001Au) {
        HomePageResponse.ResponseData responseData;
        List<SpacePost> list;
        C291001Au<? extends HomePageResponse.ResponseData> c291001Au2 = c291001Au;
        if (c291001Au2 != null && (responseData = (HomePageResponse.ResponseData) c291001Au2.LIZ) != null) {
            C16FV c16fv = this.LL;
            HomePageInfo homePageInfo = responseData.pageInfo;
            if (homePageInfo != null && (list = homePageInfo.postList) != null && !list.isEmpty()) {
                int i = 0;
                for (SpacePost spacePost : list) {
                    if (spacePost.postType != EnumC503090JoB.SUB_VIDEO.getValue() && spacePost.postStatus == 1 && (i = i + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
                if (i > 0) {
                    C786410Ut5.LLJJJJJIL(c16fv, 0);
                }
            }
        }
        return Unit.LIZ;
    }
}
