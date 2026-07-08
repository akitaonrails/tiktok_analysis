package X;

import com.ss.android.ugc.aweme.explore.data.ExploreTopBannerData;
import com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15TS, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15TS extends C09AY implements Function1<ExploreTopicAwemeListResponse, Unit> {
    public final /* synthetic */ C15TU LL;
    public final /* synthetic */ C15TT LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ EnumC1841880y1y LLILZLL;
    public final /* synthetic */ Function1<ExploreTopicAwemeListResponse, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15TS(C15TU c15tu, C15TT c15tt, boolean z, String str, long j, EnumC1841880y1y enumC1841880y1y, Function1<? super ExploreTopicAwemeListResponse, Unit> function1) {
        super(1);
        this.LL = c15tu;
        this.LLILLJJLI = c15tt;
        this.LLILLL = z;
        this.LLILZ = str;
        this.LLILZIL = j;
        this.LLILZLL = enumC1841880y1y;
        this.LLIZ = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ExploreTopicAwemeListResponse exploreTopicAwemeListResponse) {
        ExploreTopBannerData exploreTopBannerData;
        List<Aweme> list;
        ExploreTopicAwemeListResponse exploreTopicAwemeListResponse2 = exploreTopicAwemeListResponse;
        if (exploreTopicAwemeListResponse2.LLILLJJLI) {
            this.LL.getClass();
            C15TU.LIZ(exploreTopicAwemeListResponse2);
            C2153908cD c2153908cD = C2153908cD.LIZ;
            this.LLILLJJLI.LL = exploreTopicAwemeListResponse2;
            if (this.LLILLL) {
                C15TU c15tu = this.LL;
                String str = this.LLILZ;
                long j = this.LLILZIL;
                EnumC1841880y1y enumC1841880y1y = this.LLILZLL;
                c15tu.getClass();
                if (C288840BTu.LIZ() || Intrinsics.LJFF(str, "topic_popup_page")) {
                    C15T8.LL.getClass();
                    C15T8.LIZIZ(j, exploreTopicAwemeListResponse2, enumC1841880y1y);
                }
            }
        } else {
            this.LL.getClass();
            C15TU.LIZ(exploreTopicAwemeListResponse2);
            C2153908cD c2153908cD2 = C2153908cD.LIZ;
            ExploreTopicAwemeListResponse exploreTopicAwemeListResponse3 = new ExploreTopicAwemeListResponse();
            C15TT c15tt = this.LLILLJJLI;
            ArrayList arrayList = new ArrayList();
            ExploreTopicAwemeListResponse exploreTopicAwemeListResponse4 = c15tt.LL;
            if (exploreTopicAwemeListResponse4 != null && (list = exploreTopicAwemeListResponse4.items) != null) {
                arrayList.addAll(list);
            }
            List<Aweme> list2 = exploreTopicAwemeListResponse2.items;
            if (list2 != null) {
                arrayList.addAll(list2);
            }
            exploreTopicAwemeListResponse3.items = arrayList;
            exploreTopicAwemeListResponse3.hasMore = exploreTopicAwemeListResponse2.hasMore;
            exploreTopicAwemeListResponse3.setRequestId(exploreTopicAwemeListResponse2.getRequestId());
            exploreTopicAwemeListResponse3.logPb = exploreTopicAwemeListResponse2.logPb;
            ExploreTopicAwemeListResponse exploreTopicAwemeListResponse5 = c15tt.LL;
            if (exploreTopicAwemeListResponse5 == null || (exploreTopBannerData = exploreTopicAwemeListResponse5.topBanner) == null) {
                exploreTopBannerData = exploreTopicAwemeListResponse2.topBanner;
            }
            exploreTopicAwemeListResponse3.topBanner = exploreTopBannerData;
            if (this.LLILLL) {
                C15TU c15tu2 = this.LL;
                String str2 = this.LLILZ;
                long j2 = this.LLILZIL;
                EnumC1841880y1y enumC1841880y1y2 = this.LLILZLL;
                c15tu2.getClass();
                if (C288840BTu.LIZ() || Intrinsics.LJFF(str2, "topic_popup_page")) {
                    C15T8.LL.getClass();
                    C15T8.LIZIZ(j2, exploreTopicAwemeListResponse3, enumC1841880y1y2);
                }
            }
            Function1<ExploreTopicAwemeListResponse, Unit> function1 = this.LLIZ;
            if (function1 != null) {
                function1.invoke(exploreTopicAwemeListResponse3);
            }
        }
        return Unit.LIZ;
    }
}
