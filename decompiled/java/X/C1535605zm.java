package X;

import Y.AfS171S0100000_2;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.ai.impl.bot.api.BotFeedbackCancelRequest;
import com.ss.android.ugc.aweme.im.ai.impl.bot.api.BotFeedbackRequest;
import com.ss.android.ugc.aweme.im.ai.impl.bot.api.FeedbackActionEnum;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.api.IMSmartReplyFeedbackAPI;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05zm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.FeedbackPanelOpenHelper$notifyMsgLikeFeedback$1", f = "FeedbackPanelOpenHelper.kt", l = {}, m = "invokeSuspend")
public final class C1535605zm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C869590Y9l LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1535605zm(C869590Y9l c869590Y9l, String str, InterfaceC1364105Vn<? super C1535605zm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c869590Y9l;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1535605zm(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("FeedbackPanelOpenHelper@f331.notifyMsgLikeFeedback$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C15393060x c15393060x = C15393060x.LIZ;
            Pair pair = new Pair(Boolean.valueOf(C15393060x.LIZJ(this.LL)), Boolean.valueOf(C15393060x.LIZIZ(this.LL)));
            if (((Boolean) pair.getFirst()).booleanValue()) {
                str = "click_positive_reverse";
            } else {
                str = "click_positive";
            }
            if (!Intrinsics.LJFF(this.LLILLJJLI, "long_press")) {
                C1508705vR c1508705vR = C1508705vR.LL;
                C869590Y9l c869590Y9l = this.LL;
                String mobValue = C19212010Ec.LIZJ.LIZJ().getMobValue();
                c1508705vR.getClass();
                C23250099c.LIZLLL(C1508705vR.LLILLJJLI, null, null, new C1503705ud(c869590Y9l, mobValue, str, null), 3);
            }
            if (Intrinsics.LJFF(pair, new Pair(true, false))) {
                BotFeedbackCancelRequest botFeedbackCancelRequest = new BotFeedbackCancelRequest(C2286608xc.LJFF(this.LL.getMsgId()), C2286608xc.LJ(FeedbackActionEnum.FEEDBACK_ACTION_ENUM_LIKE.getValue()));
                IMSmartReplyFeedbackAPI.LIZ.getClass();
                C1535705zn.LIZ().feedbackCancel(botFeedbackCancelRequest).LJJLJLI(new AfS171S0100000_2(this.LL, 55));
            } else if (Intrinsics.LJFF(pair, new Pair(false, true))) {
                BotFeedbackRequest botFeedbackRequest = new BotFeedbackRequest(C2286608xc.LJ(FeedbackActionEnum.FEEDBACK_ACTION_ENUM_LIKE.getValue()), C2286608xc.LJFF(this.LL.getMsgId()), null, null, null);
                IMSmartReplyFeedbackAPI.LIZ.getClass();
                C1535705zn.LIZ().feedback(botFeedbackRequest).LJJLJLI(new AfS171S0100000_2(this.LL, 56));
            } else if (Intrinsics.LJFF(pair, new Pair(false, false))) {
                BotFeedbackRequest botFeedbackRequest2 = new BotFeedbackRequest(C2286608xc.LJ(FeedbackActionEnum.FEEDBACK_ACTION_ENUM_LIKE.getValue()), C2286608xc.LJFF(this.LL.getMsgId()), null, null, null);
                IMSmartReplyFeedbackAPI.LIZ.getClass();
                C1535705zn.LIZ().feedback(botFeedbackRequest2).LJJLJLI(new AfS171S0100000_2(this.LL, 57));
            } else {
                Intrinsics.LJFF(pair, new Pair(true, true));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedbackPanelOpenHelper@f331.notifyMsgLikeFeedback$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
