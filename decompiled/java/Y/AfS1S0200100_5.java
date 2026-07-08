package Y;

import X.C098200Yq;
import X.C09JN;
import X.C0FS9;
import X.C123100dR;
import X.C13LP;
import X.C15438062q;
import X.C189200o6;
import X.C1C7U;
import X.C2097608Jq;
import X.C2188811AlT;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.sticker.AddYoursStickerTopicRepo;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes6.dex */
public class AfS1S0200100_5 implements C09JN {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS1S0200100_5 afS1S0200100_5, Object obj) {
        List<AddYoursStickerTopicRepoApi.AddYoursSuggestTopic> list;
        int i;
        C1C7U.LIZ("AddYoursStickerTopicRepo@822c.requestTopicsForAYEditPage$1");
        AddYoursStickerTopicRepo.Response response = (AddYoursStickerTopicRepo.Response) obj;
        AddYoursStickerTopicRepo addYoursStickerTopicRepo = (AddYoursStickerTopicRepo) afS1S0200100_5.l0;
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() - afS1S0200100_5.j2);
        String strValueOf = String.valueOf(response.statusCode);
        String str = response.statusMsg;
        addYoursStickerTopicRepo.getClass();
        AddYoursStickerTopicRepo.LIZJ(iCurrentTimeMillis, strValueOf, str, "request_add_yours_topic_suggest_info");
        Integer num = response.statusCode;
        if (num != null && num.intValue() == 0 && (list = response.topics) != null) {
            ArrayList<AddYoursStickerTopicRepoApi.AddYoursSuggestTopic> arrayList = new ArrayList();
            for (AddYoursStickerTopicRepoApi.AddYoursSuggestTopic addYoursSuggestTopic : list) {
                if (C123100dR.LIZ(addYoursSuggestTopic.text)) {
                    arrayList.add(addYoursSuggestTopic);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            for (AddYoursStickerTopicRepoApi.AddYoursSuggestTopic addYoursSuggestTopic2 : arrayList) {
                Integer num2 = addYoursSuggestTopic2.type;
                if (num2 != null && num2.intValue() == 2) {
                    i = 1;
                } else {
                    i = 0;
                }
                arrayList2.add(addYoursSuggestTopic2.copy(addYoursSuggestTopic2.topicId, addYoursSuggestTopic2.text, Integer.valueOf(i), addYoursSuggestTopic2.avatars, addYoursSuggestTopic2.videoCount));
            }
            if (!arrayList2.isEmpty()) {
                ((AddYoursStickerTopicRepo) afS1S0200100_5.l0).LIZIZ = C2097608Jq.LJIIIIZZ(new Pair(C0FS9.HOT, C13LP.LL(arrayList2, arrayList2.size() / 3)), new Pair(C0FS9.RECOMMEND, C13LP.LJLLILLLL(arrayList2, new IntRange((arrayList2.size() / 3) + 1, arrayList2.size() - 1))));
                ((Function1) afS1S0200100_5.l1).invoke(((AddYoursStickerTopicRepo) afS1S0200100_5.l0).LIZIZ);
            }
        }
        C1C7U.LIZIZ("AddYoursStickerTopicRepo@822c.requestTopicsForAYEditPage$1");
    }

    public static final void accept$1(AfS1S0200100_5 afS1S0200100_5, Object obj) {
        C1C7U.LIZ("AddYoursStickerTopicRepo@822c.requestRecommendTopics$2$1");
        AddYoursStickerTopicRepo.AddYoursAutoSuggestResponse addYoursAutoSuggestResponse = (AddYoursStickerTopicRepo.AddYoursAutoSuggestResponse) obj;
        AddYoursStickerTopicRepo addYoursStickerTopicRepo = (AddYoursStickerTopicRepo) afS1S0200100_5.l0;
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() - afS1S0200100_5.j2);
        String strValueOf = String.valueOf(addYoursAutoSuggestResponse.statusCode);
        String str = addYoursAutoSuggestResponse.statusMsg;
        addYoursStickerTopicRepo.getClass();
        AddYoursStickerTopicRepo.LIZJ(iCurrentTimeMillis, strValueOf, str, "request_publish_suggest_add_yours");
        Integer num = addYoursAutoSuggestResponse.statusCode;
        if (num != null && num.intValue() == 0 && (!addYoursAutoSuggestResponse.topics.isEmpty())) {
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS1S0200100_5.l1;
            AddYoursStickerTopicRepoApi.RecommendTopicsResult recommendTopicsResult = new AddYoursStickerTopicRepoApi.RecommendTopicsResult(addYoursAutoSuggestResponse.inputText, addYoursAutoSuggestResponse.topics);
            C189200o6.m2constructorimpl(recommendTopicsResult);
            C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(recommendTopicsResult);
            C189200o6.m2constructorimpl(c189200o6M1boximpl);
            interfaceC1364105Vn.resumeWith(c189200o6M1boximpl);
        } else {
            InterfaceC1364105Vn interfaceC1364105Vn2 = (InterfaceC1364105Vn) afS1S0200100_5.l1;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("auto suggest request fail: statusCode = ");
            sbLIZ.append(addYoursAutoSuggestResponse.statusCode);
            sbLIZ.append(", msg = ");
            sbLIZ.append(addYoursAutoSuggestResponse.statusMsg);
            C098200Yq c098200Yq = new C098200Yq(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)));
            C189200o6.m2constructorimpl(c098200Yq);
            interfaceC1364105Vn2.resumeWith(c098200Yq);
        }
        C1C7U.LIZIZ("AddYoursStickerTopicRepo@822c.requestRecommendTopics$2$1");
    }

    public static final void accept$2(AfS1S0200100_5 afS1S0200100_5, Object obj) {
        C1C7U.LIZ("AddYoursStickerTopicRepo@822c.requestTopicsForTextEditPage$4");
        AddYoursStickerTopicRepo addYoursStickerTopicRepo = (AddYoursStickerTopicRepo) afS1S0200100_5.l0;
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() - afS1S0200100_5.j2);
        String message = ((Throwable) obj).getMessage();
        if (message == null) {
            message = "";
        }
        addYoursStickerTopicRepo.getClass();
        AddYoursStickerTopicRepo.LIZJ(iCurrentTimeMillis, "1", message, "request_suggest_add_yours_text_page_info");
        ((Function0) afS1S0200100_5.l1).invoke();
        C1C7U.LIZIZ("AddYoursStickerTopicRepo@822c.requestTopicsForTextEditPage$4");
    }

    public static final void accept$3(AfS1S0200100_5 afS1S0200100_5, Object obj) {
        C1C7U.LIZ("AddYoursStickerTopicRepo@822c.requestTopicsForTextEditPageWithEmptyText$3");
        AddYoursStickerTopicRepo addYoursStickerTopicRepo = (AddYoursStickerTopicRepo) afS1S0200100_5.l0;
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() - afS1S0200100_5.j2);
        String message = ((Throwable) obj).getMessage();
        if (message == null) {
            message = "";
        }
        addYoursStickerTopicRepo.getClass();
        AddYoursStickerTopicRepo.LIZJ(iCurrentTimeMillis, "1", message, "request_suggest_add_yours_text_page_info");
        ((Function0) afS1S0200100_5.l1).invoke();
        C1C7U.LIZIZ("AddYoursStickerTopicRepo@822c.requestTopicsForTextEditPageWithEmptyText$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0007: IPUT (r5 I:java.lang.Object), (r0 I:Y.AfS1S0200100_5) (LINE:67108871) Y.AfS1S0200100_5.l1 java.lang.Object, block:B:2:0x0000 */
    public AfS1S0200100_5(Object obj, AddYoursStickerTopicRepo addYoursStickerTopicRepo, long j, Function0<Unit> function0) {
        Object obj2;
        this.$t = function0;
        this.l0 = obj;
        this.j2 = addYoursStickerTopicRepo;
        this.l1 = obj2;
    }
}
