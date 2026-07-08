package X;

import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.topicfeed.ui.tab.PersonalizedTopicTabProtocol0;
import com.ss.android.ugc.aweme.topicfeed.ui.tab.PersonalizedTopicTabProtocol1;
import com.ss.android.ugc.aweme.topicfeed.ui.tab.TopicFashionTabProtocol;
import com.ss.android.ugc.aweme.topicfeed.ui.tab.TopicFoodTabProtocol;
import com.ss.android.ugc.aweme.topicfeed.ui.tab.TopicGamingTabProtocol;
import com.ss.android.ugc.aweme.topicfeed.ui.tab.TopicSportsTabProtocol;
import com.ss.android.ugc.aweme.topicfeed.ui.tab.TopicTabProtocol0;
import com.ss.android.ugc.aweme.topicfeed.ui.tab.TopicTabProtocol1;
import com.ss.android.ugc.aweme.topicfeed.ui.tab.TopicTabProtocol2;
import com.ss.android.ugc.aweme.topicfeed.ui.tab.TopicTabProtocol3;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qZD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1554970qZD extends C09AY implements Function0<Map<EnumC1584360rKc, ? extends TopTabProtocol>> {
    public C1554970qZD() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<EnumC1584360rKc, ? extends TopTabProtocol> invoke() {
        C13DA c13da = new C13DA();
        c13da.put(EnumC1584360rKc.TOPIC0, new TopicTabProtocol0());
        c13da.put(EnumC1584360rKc.TOPIC1, new TopicTabProtocol1());
        c13da.put(EnumC1584360rKc.TOPIC2, new TopicTabProtocol2());
        c13da.put(EnumC1584360rKc.TOPIC3, new TopicTabProtocol3());
        c13da.put(EnumC1584360rKc.TOPIC_GAMING, new TopicGamingTabProtocol());
        c13da.put(EnumC1584360rKc.TOPIC_SPORTS, new TopicSportsTabProtocol());
        c13da.put(EnumC1584360rKc.TOPIC_FASHION, new TopicFashionTabProtocol());
        c13da.put(EnumC1584360rKc.TOPIC_FOOD, new TopicFoodTabProtocol());
        c13da.put(EnumC1584360rKc.PERSONALIZED_TOPIC_0, new PersonalizedTopicTabProtocol0());
        c13da.put(EnumC1584360rKc.PERSONALIZED_TOPIC_1, new PersonalizedTopicTabProtocol1());
        return c13da.build();
    }
}
