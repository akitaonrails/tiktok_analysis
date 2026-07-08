package X;

import Y.AkS482S0100000_21;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.upvote.api.UpvoteApi;
import com.ss.android.ugc.aweme.upvote.experiment.RepostPublicInteractExp;
import com.ss.android.ugc.aweme.upvote.model.UpvoteBatchPublishResponse;
import com.ss.android.ugc.aweme.upvote.model.UpvoteDeleteResponse;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Te7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C751650Te7 extends C09AY implements Function0<InterfaceC736910SvR<InterfaceC1359200lTS>> {
    public C751650Te7() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC736910SvR<InterfaceC1359200lTS> invoke() {
        return new InterfaceC736910SvR<InterfaceC1359200lTS>() { // from class: X.0TnT
            public final C1358990lT7 LL = new InterfaceC1359200lTS() { // from class: X.0lT7
                public static String LJLZ() {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("enable_self_repost", C08JS.LIZLLL(Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_self_repost", true))));
                    linkedHashMap.put("tt_repost_add_text", C08JS.LIZLLL(Integer.valueOf(((Number) C263730AVf.LIZ.getValue()).intValue())));
                    linkedHashMap.put("repost_panel_show_count", C08JS.LIZLLL(Integer.valueOf(((Number) C1359060lTE.LIZ.getValue()).intValue())));
                    linkedHashMap.put("repost_with_sa", C08JS.LIZLLL(Integer.valueOf(C1359030lTB.LIZIZ() ? 1 : 0)));
                    RepostPublicInteractExp.LIZ.getClass();
                    linkedHashMap.put("tt_repost_with_note", C08JS.LIZLLL(Integer.valueOf(RepostPublicInteractExp.LIZ() ? 1 : 0)));
                    linkedHashMap.put("repost_stagger_panel", C263720AVe.LIZ() ? "1" : CardStruct.IStatusCode.DEFAULT);
                    return C08JS.LIZLLL(linkedHashMap);
                }

                @Override // X.InterfaceC1359200lTS
                public final AbstractC19484711Kz<UpvoteBatchPublishResponse> r(List<String> list) {
                    return UpvoteApi.LIZIZ.publishUpvoteBatch(C08JS.LIZLLL(list), LJLZ());
                }

                @Override // X.InterfaceC1359200lTS
                public final AbstractC19484711Kz<UpvoteDeleteResponse> deleteUpvote(String str, Integer num, String str2) {
                    return UpvoteApi.LIZIZ.deleteUpvote(str, num, str2);
                }

                @Override // X.InterfaceC1359200lTS
                public final C19482011Jy a0(String str, String str2, List list, List list2, Long l, Integer num, String str3, String str4, Boolean bool) {
                    String str5 = str4;
                    if (list == null) {
                        list = C13BV.INSTANCE;
                    }
                    String strLIZLLL = C08JS.LIZLLL(list);
                    if (list2 == null) {
                        list2 = C13BV.INSTANCE;
                    }
                    String strLIZLLL2 = C08JS.LIZLLL(list2);
                    if (str5 != null && u.LJJIIJZLJL(str5, "fake_", false)) {
                        str5 = null;
                    }
                    return UpvoteApi.LIZIZ.publishUpvote(str, str2, null, strLIZLLL, strLIZLLL2, LJLZ(), l, num, str3, str5, bool).LJIL(new AkS482S0100000_21(this, 4));
                }
            };

            @Override // X.InterfaceC736910SvR
            public final void release() {
            }

            @Override // X.InterfaceC736910SvR
            public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
                return this.LL;
            }
        };
    }
}
