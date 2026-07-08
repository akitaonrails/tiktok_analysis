package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.story.api.StoryApi;
import com.ss.android.ugc.aweme.story.feed.guidecard.component.panel.StoryGuideCardFilterPanelComponentA2;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.01B0, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01B0 extends C09AY implements Function2<C03H5, Pair<? extends Boolean, ? extends String>, Unit> {
    public final /* synthetic */ StoryGuideCardFilterPanelComponentA2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01B0(StoryGuideCardFilterPanelComponentA2 storyGuideCardFilterPanelComponentA2) {
        super(2);
        this.LL = storyGuideCardFilterPanelComponentA2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, Pair<? extends Boolean, ? extends String> pair) {
        ArrayList arrayList;
        Pair<? extends Boolean, ? extends String> pair2 = pair;
        boolean zBooleanValue = pair2.getFirst().booleanValue();
        String second = pair2.getSecond();
        if (zBooleanValue) {
            C287210BNn.LIZLLL.storeString("key_dislike_card_counter", "");
        } else {
            Keva keva = C287210BNn.LIZLLL;
            if (System.currentTimeMillis() - keva.getLong("key_dislike_time_stamp", 0L) >= ((Number) C287210BNn.LIZJ.getValue()).intValue() * 24 * 60 * 60 * LSPassThroughRecordSizeConfig.DEFAULT) {
                String string = keva.getString("key_dislike_card_counter", "");
                if (string != null && string.length() != 0) {
                    arrayList = new ArrayList(a0.LJJLIIIJILLIZJL(string, new String[]{","}, 0, 6));
                } else {
                    arrayList = new ArrayList();
                }
                if (!arrayList.contains(second)) {
                    arrayList.add(second);
                }
                if (arrayList.size() >= ((Number) C287210BNn.LIZIZ.getValue()).intValue()) {
                    keva.storeString("key_dislike_card_counter", "");
                    if (1 != 0) {
                        StoryGuideCardFilterPanelComponentA2 storyGuideCardFilterPanelComponentA2 = this.LL;
                        storyGuideCardFilterPanelComponentA2.getClass();
                        StoryApi.LIZIZ.reportGuideCardDislike().LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new C516201zk(storyGuideCardFilterPanelComponentA2, 287), new C09JN() { // from class: X.00PB
                            @Override // X.C09JN
                            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                                C1C7U.LIZ("StoryGuideCardFilterPanelComponentA2@d7ef.reportDislikeGuideCard$2");
                                C1C7U.LIZIZ("StoryGuideCardFilterPanelComponentA2@d7ef.reportDislikeGuideCard$2");
                            }
                        });
                    }
                } else {
                    keva.storeString("key_dislike_card_counter", C13LP.LJJLIIIJ(arrayList, null, null, null, 0, null, AnonymousClass0207.get$arr$(146), 31));
                }
            }
        }
        return Unit.LIZ;
    }
}
