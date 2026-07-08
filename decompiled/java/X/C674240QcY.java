package X;

import androidx.lifecycle.LiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.middle.ai.bean.AISuggestTopic;
import com.ss.android.ugc.aweme.ecommerce.search.middle.ai.bean.EcSearchMiddleAIRequestParams;
import com.ss.android.ugc.aweme.ecommerce.search.middle.ai.bean.EcSearchMiddleAIResponse;
import com.ss.android.ugc.aweme.ecommerce.search.middle.ai.bean.RecommendationResponse;
import com.ss.android.ugc.aweme.ecommerce.search.middle.ai.bean.TopicGroup;
import com.ss.android.ugc.aweme.ecommerce.search.middle.ai.vm.EcSearchMiddleAIViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QcY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.middle.ai.vm.EcSearchMiddleAIViewModel$fetchGuessData$1", f = "EcSearchMiddleAIViewModel.kt", l = {146}, m = "invokeSuspend")
public final class C674240QcY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C673920Qc2 LLILLJJLI;
    public final /* synthetic */ C674360Qck LLILLL;
    public final /* synthetic */ EcSearchMiddleAIViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C674240QcY(C673920Qc2 c673920Qc2, C674360Qck c674360Qck, EcSearchMiddleAIViewModel ecSearchMiddleAIViewModel, InterfaceC1364105Vn<? super C674240QcY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c673920Qc2;
        this.LLILLL = c674360Qck;
        this.LLILZ = ecSearchMiddleAIViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C674240QcY(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object c098200Yq;
        EcSearchMiddleAIResponse ecSearchMiddleAIResponse;
        boolean z2;
        int size;
        boolean z3;
        String str;
        String str2;
        TopicGroup topicGroup;
        AISuggestTopic aISuggestTopic;
        TopicGroup topicGroup2;
        AISuggestTopic aISuggestTopic2;
        TopicGroup topicGroup3;
        AISuggestTopic aISuggestTopic3;
        RecommendationResponse recommendationResponse;
        List<TopicGroup> list;
        C1C7U.LIZ("EcSearchMiddleAIViewModel@fba8.fetchGuessData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String str3 = null;
        boolean z4 = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            EcSearchMiddleAIRequestParams ecSearchMiddleAIRequestParams = new EcSearchMiddleAIRequestParams(null, 1);
            C674740QdM c674740QdM = C674740QdM.LIZ;
            this.LL = 1;
            obj = c674740QdM.LIZ(ecSearchMiddleAIRequestParams, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EcSearchMiddleAIViewModel@fba8.fetchGuessData$1");
                return objLJFF;
            }
        }
        String str4 = (String) obj;
        if (str4.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ecSearchMiddleAIResponse = null;
        } else {
            try {
                C1227904rF.LIZ.getClass();
                c098200Yq = (EcSearchMiddleAIResponse) C1227904rF.LIZIZ(str4, EcSearchMiddleAIResponse.class);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            ecSearchMiddleAIResponse = (EcSearchMiddleAIResponse) c098200Yq;
        }
        if (ecSearchMiddleAIResponse != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C673920Qc2 c673920Qc2 = this.LLILLJJLI;
        if (ecSearchMiddleAIResponse != null && (recommendationResponse = ecSearchMiddleAIResponse.suggestData) != null && (list = recommendationResponse.results) != null) {
            size = list.size();
        } else {
            size = 0;
        }
        c673920Qc2.LIZIZ(size, z2);
        c673920Qc2.LIZJ();
        C674360Qck c674360Qck = this.LLILLL;
        if (c674360Qck != null && c674360Qck.LIZJ) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            C673940Qc4.LJI(EnumC673970Qc7.AI_SEARCH, z2);
        }
        if (ecSearchMiddleAIResponse == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EcSearchMiddleAIViewModel@fba8.fetchGuessData$1");
            return unit;
        }
        if (C672250QYl.LIZJ().gsCacheEnable != 1) {
            z4 = false;
        }
        if (z4) {
            C674270Qcb c674270QcbVQ2 = this.LLILZ.vQ2();
            c674270QcbVQ2.LIZLLL = str4;
            C23250099c.LIZLLL(c674270QcbVQ2.LIZ, null, null, new C674250QcZ(c674270QcbVQ2, str4, null), 3);
        }
        ((LiveData) this.LLILZ.LLILLL.getValue()).postValue(new C674420Qcq(str4, this.LLILLJJLI));
        RecommendationResponse recommendationResponse2 = ecSearchMiddleAIResponse.boxData;
        if (recommendationResponse2 != null) {
            EcSearchMiddleAIViewModel ecSearchMiddleAIViewModel = this.LLILZ;
            String str5 = ecSearchMiddleAIResponse.imprId;
            List<TopicGroup> list2 = recommendationResponse2.results;
            if (list2 != null && (topicGroup3 = (TopicGroup) C13LP.LJJJLL(list2)) != null && (aISuggestTopic3 = topicGroup3.topic) != null) {
                str = aISuggestTopic3.title;
            } else {
                str = null;
            }
            List<TopicGroup> list3 = recommendationResponse2.results;
            if (list3 != null && (topicGroup2 = (TopicGroup) C13LP.LJJJLL(list3)) != null && (aISuggestTopic2 = topicGroup2.topic) != null) {
                str2 = aISuggestTopic2.source;
            } else {
                str2 = null;
            }
            List<TopicGroup> list4 = recommendationResponse2.results;
            if (list4 != null && (topicGroup = (TopicGroup) C13LP.LJJJLL(list4)) != null && (aISuggestTopic = topicGroup.topic) != null) {
                str3 = aISuggestTopic.suggestId;
            }
            ((LiveData) ecSearchMiddleAIViewModel.LL.getValue()).postValue(new C674380Qcm(str5, str, str2, str3, 36));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EcSearchMiddleAIViewModel@fba8.fetchGuessData$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
