package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.search.gift.SearchGameGiftCard;
import com.bytedance.android.livesdk.game.model.BriefBenefitInfo;
import com.bytedance.android.livesdk.game.model.BriefGiftInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z1E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1879860z1E extends C09AY implements Function2<Boolean, Throwable, Unit> {
    public final /* synthetic */ SearchGameGiftCard.GiftCell LL;
    public final /* synthetic */ C1879880z1G LLILLJJLI;
    public final /* synthetic */ View LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1879860z1E(View view, SearchGameGiftCard.GiftCell giftCell, C1879880z1G c1879880z1G) {
        super(2);
        this.LL = giftCell;
        this.LLILLJJLI = c1879880z1G;
        this.LLILLL = view;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Throwable th) throws Throwable {
        String str;
        Object c098200Yq;
        Object c098200Yq2;
        if (bool.booleanValue()) {
            SearchGameGiftCard.GiftCell giftCell = this.LL;
            C1879880z1G c1879880z1G = this.LLILLJJLI;
            Context context = this.LLILLL.getContext();
            giftCell.getClass();
            InterfaceC1881340z3c interfaceC1881340z3c = c1879880z1G.LLILLL;
            BriefBenefitInfo briefBenefitInfo = c1879880z1G.LL;
            int i = briefBenefitInfo.taskType;
            BriefGiftInfo briefGiftInfo = briefBenefitInfo.briefGiftInfo;
            String str2 = "";
            if (briefGiftInfo == null || (str = briefGiftInfo.idStr) == null) {
                str = "";
            }
            C1879890z1H.LIZ(interfaceC1881340z3c, "benefits", null, C2097608Jq.LJIIIIZZ(new Pair("benefits_type", C1879890z1H.LJ(i)), new Pair("benefit_id", str), new Pair("activity_id", briefBenefitInfo.activityIdStr), new Pair("benefit_task_id", briefBenefitInfo.campaignTaskId)), null);
            c1879880z1G.LLILLL.getEventCenter().LIZIZ(null, "didClickSearchGameGiftItem");
            BriefBenefitInfo briefBenefitInfo2 = c1879880z1G.LL;
            int i2 = briefBenefitInfo2.detailJumpLinkType;
            if (i2 != 1) {
                if (i2 == 2) {
                    if (briefBenefitInfo2.detailJumpLink.length() == 0) {
                        C20441214yg.LJ("SearchGameGiftCard", "openGameDetail, detailJumpLink is empty");
                    } else {
                        C0KYM c0kymLIZ = C513270KAz.LIZ(c1879880z1G.LL.detailJumpLink);
                        String strLIZIZ = c0kymLIZ.LIZIZ("log_extra");
                        if (strLIZIZ != null) {
                            str2 = strLIZIZ;
                        }
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry<String, Object> entry : C1882380z5I.LIZ(C1882380z5I.LIZLLL(c1879880z1G.LLILLL)).entrySet()) {
                            jSONObject.put(entry.getKey(), entry.getValue());
                        }
                        try {
                            c098200Yq2 = new JSONObject(str2);
                            C189200o6.m2constructorimpl(c098200Yq2);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            c098200Yq2 = new C098200Yq(th2);
                            C189200o6.m2constructorimpl(c098200Yq2);
                        }
                        if (C189200o6.m8isSuccessimpl(c098200Yq2)) {
                            JSONObject jSONObject2 = (JSONObject) c098200Yq2;
                            Iterator<String> itKeys = jSONObject2.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                jSONObject.put(next, jSONObject2.get(next));
                            }
                        }
                        c0kymLIZ.LJII("log_extra", C786410Ut5.J3(jSONObject));
                        C1884390z8X c1884390z8XV01 = ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).V01();
                        if (c1884390z8XV01 != null) {
                            c1884390z8XV01.LIZ(context, c0kymLIZ.LIZ().toString(), C2097608Jq.LJ());
                        }
                    }
                }
            } else if (briefBenefitInfo2.detailJumpLink.length() == 0) {
                C20441214yg.LJ("SearchGameGiftCard", "openRewardDetail, detailJumpLink is empty");
            } else {
                C760370TsB c760370TsBLIZ = C0KYL.LIZ(c1879880z1G.LL.detailJumpLink);
                String strLIZIZ2 = c760370TsBLIZ.LIZIZ("tea_params");
                if (strLIZIZ2 != null) {
                    str2 = strLIZIZ2;
                }
                try {
                    c098200Yq = new JSONObject(str2);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    c098200Yq = new C098200Yq(th3);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    c098200Yq = new JSONObject();
                }
                JSONObject jSONObject3 = (JSONObject) c098200Yq;
                for (Map.Entry entry2 : ((LinkedHashMap) C476770Imp.LJFF(C1882380z5I.LIZ(C1882380z5I.LIZLLL(c1879880z1G.LLILLL)))).entrySet()) {
                    if (!jSONObject3.has((String) entry2.getKey())) {
                        jSONObject3.put((String) entry2.getKey(), entry2.getValue());
                    }
                }
                c760370TsBLIZ.LJJIFFI("tea_params", C786410Ut5.J3(jSONObject3));
                C1879750z13.LIZ(c1879880z1G.LLILLL, c760370TsBLIZ, new C782620Umy());
            }
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("click check login failed, error: ");
            sbLIZ.append(th);
            C20441214yg.LIZIZ("SearchGameGiftCard", C2188811AlT.LIZIZ(sbLIZ));
        }
        return Unit.LIZ;
    }
}
