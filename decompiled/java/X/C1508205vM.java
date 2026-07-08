package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.SmartReplySuggestedReplyViewModel;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.api.DMBotInteractOption;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.api.DMBotInteraction;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.api.IMSuggestedReplyApi;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.api.SuggestReplyResponse;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05vM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.SmartReplySuggestedReplyViewModel$requestSuggestedReply$3", f = "SmartReplySuggestedReplyViewModel.kt", l = {449, 457}, m = "invokeSuspend")
public final class C1508205vM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends Boolean>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SmartReplySuggestedReplyViewModel LLILLL;
    public final /* synthetic */ C869590Y9l LLILZ;
    public final /* synthetic */ C0Y8T LLILZIL;
    public final /* synthetic */ IMAIBotInfo LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1508205vM(SmartReplySuggestedReplyViewModel smartReplySuggestedReplyViewModel, C869590Y9l c869590Y9l, C0Y8T c0y8t, IMAIBotInfo iMAIBotInfo, InterfaceC1364105Vn<? super C1508205vM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = smartReplySuggestedReplyViewModel;
        this.LLILZ = c869590Y9l;
        this.LLILZIL = c0y8t;
        this.LLILZLL = iMAIBotInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1508205vM c1508205vM = new C1508205vM(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1508205vM.LLILLJJLI = obj;
        return c1508205vM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C457780HxI c457780HxI;
        SessionInfo sessionInfo;
        String uuid;
        boolean z;
        Object objLJI = obj;
        C1C7U.LIZ("SmartReplySuggestedReplyViewModel@aef2.requestSuggestedReply$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Object pair = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(objLJI);
                    c098200Yq = (Pair) objLJI;
                } else {
                    C155000ia.LIZIZ(objLJI);
                    c098200Yq = (Pair) objLJI;
                }
            } else {
                C155000ia.LIZIZ(objLJI);
                InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                this.LLILLL.LLJJIJI = new C1508405vO(System.currentTimeMillis());
                C2296808zG.LJFF(interfaceC497601wk);
                SmartReplySuggestedReplyViewModel smartReplySuggestedReplyViewModel = this.LLILLL;
                C869590Y9l c869590Y9l = this.LLILZ;
                C0Y8T c0y8t = this.LLILZIL;
                IMAIBotInfo iMAIBotInfo = this.LLILZLL;
                String strZQ2 = smartReplySuggestedReplyViewModel.zQ2();
                if (strZQ2 != null && (c457780HxI = (C457780HxI) smartReplySuggestedReplyViewModel.LLILZIL.getValue()) != null && (sessionInfo = c457780HxI.LL) != null && (uuid = sessionInfo.getUuid()) != null && c869590Y9l != null) {
                    long msgId = c869590Y9l.getMsgId();
                    IMSuggestedReplyApi.LIZ.getClass();
                    SuggestReplyResponse suggestReplyResponseLIZLLL = ((IMSuggestedReplyApi) ((C1566106Bf) C0I0B.LJFF.LIZLLL()).LIZIZ(IMSuggestedReplyApi.class)).getSuggestedReply(c0y8t.getConversationShortId(), msgId, iMAIBotInfo.id, C2286608xc.LJ(EnumC1508305vN.SUGGESTED_REPLY_SCENE_INTENT.getValue()), "", "").LIZLLL();
                    C1508405vO c1508405vO = smartReplySuggestedReplyViewModel.LLJJIJI;
                    if (c1508405vO != null) {
                        c1508405vO.LIZIZ = System.currentTimeMillis();
                    }
                    C23118094a.LJI(interfaceC497601wk.getCoroutineContext());
                    DMBotInteraction dMBotInteraction = suggestReplyResponseLIZLLL.interactions;
                    if (dMBotInteraction != null) {
                        List<DMBotInteractOption> list = dMBotInteraction.options;
                        if (list != null && !list.isEmpty()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (!z) {
                            this.LLILLJJLI = interfaceC497601wk;
                            this.LL = 1;
                            objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C1507905vJ(smartReplySuggestedReplyViewModel, dMBotInteraction, strZQ2, uuid, c0y8t, null));
                            if (objLJI == objLJFF) {
                                C1C7U.LIZIZ("SmartReplySuggestedReplyViewModel@aef2.requestSuggestedReply$3");
                                return objLJFF;
                            }
                            c098200Yq = (Pair) objLJI;
                        }
                    }
                    if (Intrinsics.LJFF(suggestReplyResponseLIZLLL.intentMatched, true)) {
                        String str = suggestReplyResponseLIZLLL.topicInfo;
                        String str2 = "";
                        if (str == null) {
                            str = "";
                        }
                        String str3 = suggestReplyResponseLIZLLL.rewrittenQuery;
                        if (str3 != null) {
                            str2 = str3;
                        }
                        this.LLILLJJLI = interfaceC497601wk;
                        this.LL = 2;
                        objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C1508105vL(smartReplySuggestedReplyViewModel, strZQ2, uuid, c0y8t, msgId, iMAIBotInfo, str, str2, null));
                        if (objLJI == objLJFF) {
                            C1C7U.LIZIZ("SmartReplySuggestedReplyViewModel@aef2.requestSuggestedReply$3");
                            return objLJFF;
                        }
                        c098200Yq = (Pair) objLJI;
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("request failure due to intentMatched = ");
                        sbLIZ.append(suggestReplyResponseLIZLLL.intentMatched);
                        C2188811AlT.LIZIZ(sbLIZ);
                        C1508405vO c1508405vO2 = smartReplySuggestedReplyViewModel.LLJJIJI;
                        if (c1508405vO2 != null) {
                            c1508405vO2.LIZLLL = System.currentTimeMillis();
                            c1508405vO2.LJ = "intent_error";
                            C1508705vR.LL.getClass();
                            C1508705vR.LJIIJ(c1508405vO2);
                        }
                        smartReplySuggestedReplyViewModel.LLJJIJI = null;
                        c098200Yq = new Pair(false, false);
                    }
                } else {
                    c098200Yq = new Pair(false, false);
                }
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            pair = c098200Yq;
        }
        if (pair == null) {
            pair = new Pair(false, false);
        }
        C1C7U.LIZIZ("SmartReplySuggestedReplyViewModel@aef2.requestSuggestedReply$3");
        return pair;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends Boolean>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
