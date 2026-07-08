package X;

import com.ss.android.ugc.aweme.aikit.api.create.MentionService;
import com.ss.android.ugc.aweme.creative.model.mention.MentionData;
import com.ss.android.ugc.aweme.creative.model.mention.MentionResponse;
import com.ss.android.ugc.aweme.creative.model.mention.NetworkMentionDataItem;
import com.ss.android.ugc.aweme.creative.model.mention.RecommendMentionAndPrompt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LgL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.creation.component.AITheaterCameoControlComponent$tryPrefetchRecommendCameo$1", f = "AITheaterCameoControlComponent.kt", l = {240}, m = "invokeSuspend")
public final class C549190LgL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C549180LgK LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C549190LgL(C549180LgK c549180LgK, InterfaceC1364105Vn<? super C549190LgL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c549180LgK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C549190LgL(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        MentionData mentionData;
        List<NetworkMentionDataItem> list;
        C1C7U.LIZ("AITheaterCameoControlComponent@4a33.tryPrefetchRecommendCameo$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            MentionResponse mentionResponse = (MentionResponse) C549240LgQ.LIZ.getValue();
            String str = null;
            if (mentionResponse != null && (mentionData = mentionResponse.data) != null && (list = mentionData.mentionData) != null && !list.isEmpty()) {
                MentionData mentionData2 = mentionResponse.data;
                if (mentionData2 != null) {
                    str = mentionData2.prompt;
                }
                if (C123100dR.LIZ(str)) {
                    this.LLILLJJLI.LLILZLL.postValue(this.LLILLJJLI.W1(mentionResponse));
                }
            }
            C546890Lcd.LIZ.getClass();
            MentionService mentionServiceLIZJ = C546890Lcd.LIZJ();
            this.LL = 1;
            obj = mentionServiceLIZJ.LJIIIIZZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AITheaterCameoControlComponent@4a33.tryPrefetchRecommendCameo$1");
                return objLJFF;
            }
        }
        RecommendMentionAndPrompt recommendMentionAndPromptW1 = this.LLILLJJLI.W1((MentionResponse) obj);
        if (recommendMentionAndPromptW1 != null) {
            this.LLILLJJLI.LLILZLL.postValue(recommendMentionAndPromptW1);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AITheaterCameoControlComponent@4a33.tryPrefetchRecommendCameo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
