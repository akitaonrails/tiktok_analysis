package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.SmartReplySuggestedReplyViewModel;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.api.DMBotInteractOption;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.api.DMBotInteraction;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.api.IMSuggestedReplyApi;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.api.SuggestReplyResponse;
import com.ss.android.ugc.aweme.im.message.content.SuggestedReplyData;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05vL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.SmartReplySuggestedReplyViewModel$generateAndInsertSuggestedReply$2", f = "SmartReplySuggestedReplyViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1508105vL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends Boolean>>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SmartReplySuggestedReplyViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C0Y8T LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ IMAIBotInfo LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1508105vL(SmartReplySuggestedReplyViewModel smartReplySuggestedReplyViewModel, String str, String str2, C0Y8T c0y8t, long j, IMAIBotInfo iMAIBotInfo, String str3, String str4, InterfaceC1364105Vn<? super C1508105vL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = smartReplySuggestedReplyViewModel;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = c0y8t;
        this.LLILZLL = j;
        this.LLIZ = iMAIBotInfo;
        this.LLIZLLLIL = str3;
        this.LLJ = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1508105vL c1508105vL = new C1508105vL(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c1508105vL.LL = obj;
        return c1508105vL;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        C1736806r8 c1736806r8LIZIZ;
        List<DMBotInteractOption> list;
        Long lLJIILIIL;
        C1C7U.LIZ("SmartReplySuggestedReplyViewModel@aef2.generateAndInsertSuggestedReply$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        String string = UUID.randomUUID().toString();
        SmartReplySuggestedReplyViewModel smartReplySuggestedReplyViewModel = this.LLILLJJLI;
        String str = this.LLILLL;
        String str2 = this.LLILZ;
        C0Y8T c0y8t = this.LLILZIL;
        smartReplySuggestedReplyViewModel.getClass();
        SuggestedReplyData suggestedReplyData = new SuggestedReplyData(null, true, false);
        System.currentTimeMillis();
        C1507705vH c1507705vH = new C1507705vH(suggestedReplyData);
        C1684506ih c1684506ih = new C1684506ih();
        c1684506ih.LIZLLL(48);
        C0I0B c0i0b = C0I0B.LJFF;
        String curUserId = ((C1400340mXo) c0i0b.LIZ()).getCurUserId();
        if (curUserId != null && (lLJIILIIL = C2095008Iq.LJIILIIL(curUserId)) != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        c1684506ih.LIZLLL = Long.valueOf(jLongValue);
        c1684506ih.LIZJ = string;
        c1684506ih.LJFF = c1507705vH;
        C869590Y9l lastShowMessage = c0y8t.getLastShowMessage();
        if (lastShowMessage != null) {
            c1684506ih.LJ = lastShowMessage;
        }
        FakeMsgOperatorService fakeMsgOperatorService = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpi$default(FakeMsgOperatorService.class, false, false, false, 14, null);
        String uuid = null;
        if (fakeMsgOperatorService != null && (c1736806r8LIZIZ = fakeMsgOperatorService.LIZIZ(str, c1684506ih, str2, null, null)) != null) {
            this.LLILLJJLI.LLJIJIL = c1736806r8LIZIZ.LIZJ;
            C2296808zG.LJFF(interfaceC497601wk);
            IMSuggestedReplyApi.LIZ.getClass();
            SuggestReplyResponse suggestReplyResponseLIZLLL = ((IMSuggestedReplyApi) ((C1566106Bf) c0i0b.LIZLLL()).LIZIZ(IMSuggestedReplyApi.class)).getSuggestedReply(this.LLILZIL.getConversationShortId(), this.LLILZLL, this.LLIZ.id, C2286608xc.LJ(EnumC1508305vN.SUGGESTED_REPLY_SCENE_REPLY.getValue()), this.LLIZLLLIL, this.LLJ).LIZLLL();
            DMBotInteraction dMBotInteraction = suggestReplyResponseLIZLLL.interactions;
            if (dMBotInteraction != null && (list = dMBotInteraction.options) != null && !list.isEmpty()) {
                C23118094a.LJI(interfaceC497601wk.getCoroutineContext());
                SmartReplySuggestedReplyViewModel smartReplySuggestedReplyViewModel2 = this.LLILLJJLI;
                DMBotInteraction dMBotInteraction2 = suggestReplyResponseLIZLLL.interactions;
                String str3 = this.LLILLL;
                String str4 = this.LLILZ;
                C0Y8T c0y8t2 = this.LLILZIL;
                smartReplySuggestedReplyViewModel2.getClass();
                C1736806r8 c1736806r8AQ2 = SmartReplySuggestedReplyViewModel.AQ2(string, dMBotInteraction2, str3, str4, c0y8t2);
                C23118094a.LJI(interfaceC497601wk.getCoroutineContext());
                if (c1736806r8AQ2 == null) {
                    Pair pair = new Pair(false, true);
                    C1C7U.LIZIZ("SmartReplySuggestedReplyViewModel@aef2.generateAndInsertSuggestedReply$2");
                    return pair;
                }
                C1508405vO c1508405vO = this.LLILLJJLI.LLJJIJI;
                if (c1508405vO != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    c1508405vO.LIZJ = jCurrentTimeMillis;
                    c1508405vO.LIZLLL = jCurrentTimeMillis;
                    C1508705vR.LL.getClass();
                    C1508705vR.LJIIJ(c1508405vO);
                }
                this.LLILLJJLI.LLJJIJI = null;
                this.LLILLJJLI.LLJILJIL = true;
                this.LLILLJJLI.LLJIJIL = c1736806r8AQ2.LIZJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Suggested Reply Successful ");
                C869590Y9l c869590Y9l = this.LLILLJJLI.LLJIJIL;
                if (c869590Y9l != null) {
                    uuid = c869590Y9l.getUuid();
                }
                sbLIZ.append(uuid);
                C2188811AlT.LIZIZ(sbLIZ);
                Pair pair2 = new Pair(true, false);
                C1C7U.LIZIZ("SmartReplySuggestedReplyViewModel@aef2.generateAndInsertSuggestedReply$2");
                return pair2;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Api interactions invalid = ");
            sbLIZ2.append(suggestReplyResponseLIZLLL.interactions);
            C2188811AlT.LIZIZ(sbLIZ2);
            Pair pair3 = new Pair(false, true);
            C1C7U.LIZIZ("SmartReplySuggestedReplyViewModel@aef2.generateAndInsertSuggestedReply$2");
            return pair3;
        }
        Pair pair4 = new Pair(false, false);
        C1C7U.LIZIZ("SmartReplySuggestedReplyViewModel@aef2.generateAndInsertSuggestedReply$2");
        return pair4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends Boolean>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
