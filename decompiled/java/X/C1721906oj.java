package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.analytics.IIMNewChatDetailAnalytics;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.search.ChatHistorySearchFeature;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseActionViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.06oj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1721906oj extends C09AY implements Function2<BaseActionViewModel<?>, Activity, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1721906oj(String str, String str2, String str3) {
        super(2);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(BaseActionViewModel<?> baseActionViewModel, Activity activity) {
        Map mapLIZIZ;
        Activity activity2 = activity;
        IIMNewChatDetailAnalytics iIMNewChatDetailAnalytics = (IIMNewChatDetailAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMNewChatDetailAnalytics.class);
        if (iIMNewChatDetailAnalytics != null) {
            String str = this.LLILLJJLI;
            String str2 = this.LL;
            String str3 = this.LLILLL;
            if (str.length() != 0 && (mapLIZIZ = iIMNewChatDetailAnalytics.LIZIZ(str2, str, str3)) != null) {
                iIMNewChatDetailAnalytics.LIZ("ttsocial_chat_search_btn_click", mapLIZIZ, C0I0B.LJFF.LIZIZ());
            }
        }
        String str4 = this.LL;
        String str5 = this.LLILLJJLI;
        String str6 = this.LLILLL;
        ChatHistorySearchFeature chatHistorySearchFeatureLIZ = ChatHistorySearchFeature.LIZ.LIZ();
        if (chatHistorySearchFeatureLIZ != null) {
            chatHistorySearchFeatureLIZ.LIZ(activity2, str5, str4, str6);
        }
        return Unit.LIZ;
    }
}
