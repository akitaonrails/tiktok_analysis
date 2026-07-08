package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntranceWidgetContainer;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Z3R, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C0Z3R extends C2217421BqW implements Function1<FilterTabType, Unit> {
    public C0Z3R(Object obj) {
        super(1, obj, InboxEntranceWidgetContainer.class, "dismissTabGuideBannerPod", "dismissTabGuideBannerPod(Lcom/ss/android/ugc/aweme/inbox/filter/FilterTabType;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(FilterTabType filterTabType) {
        InboxEntranceWidgetContainer inboxEntranceWidgetContainer = (InboxEntranceWidgetContainer) this.receiver;
        ((Map) inboxEntranceWidgetContainer.LLJJIJIIJIL.getValue()).put(filterTabType, new Pair(Boolean.FALSE, null));
        inboxEntranceWidgetContainer.Co(C1889360zGY.LIZ);
        Keva keva = inboxEntranceWidgetContainer.LLJJIJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tab_guide_banner_closed:");
        sbLIZ.append(filterTabType);
        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
        return Unit.LIZ;
    }
}
