package X;

import Y.AfS171S0100000_2;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.ai.impl.bot.api.BotFeedbackCancelRequest;
import com.ss.android.ugc.aweme.im.ai.impl.bot.api.BotFeedbackRequest;
import com.ss.android.ugc.aweme.im.ai.impl.bot.api.FeedbackActionEnum;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.api.IMSmartReplyFeedbackAPI;
import java.util.Collections;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05zu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.FeedbackPanelOpenHelper$notifyMsgDislikeFeedback$1", f = "FeedbackPanelOpenHelper.kt", l = {290, 306, 359, 375}, m = "invokeSuspend")
public final class C1536405zu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C869590Y9l LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1536405zu(C869590Y9l c869590Y9l, String str, Context context, InterfaceC1364105Vn<? super C1536405zu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c869590Y9l;
        this.LLILLL = str;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1536405zu(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        AnonymousClass0604 anonymousClass0604;
        AnonymousClass0604 anonymousClass06042;
        C1C7U.LIZ("FeedbackPanelOpenHelper@f331.notifyMsgDislikeFeedback$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1 && i != 2 && i != 3 && i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C15393060x c15393060x = C15393060x.LIZ;
                Pair pair = new Pair(Boolean.valueOf(C15393060x.LIZJ(this.LLILLJJLI)), Boolean.valueOf(C15393060x.LIZIZ(this.LLILLJJLI)));
                if (((Boolean) pair.getSecond()).booleanValue()) {
                    str = "click_negative_reverse";
                } else {
                    str = "click_negative";
                }
                if (!Intrinsics.LJFF(this.LLILLL, "long_press")) {
                    C1508705vR c1508705vR = C1508705vR.LL;
                    C869590Y9l c869590Y9l = this.LLILLJJLI;
                    String mobValue = C19212010Ec.LIZJ.LIZJ().getMobValue();
                    c1508705vR.getClass();
                    C23250099c.LIZLLL(C1508705vR.LLILLJJLI, null, null, new C1503705ud(c869590Y9l, mobValue, str, null), 3);
                }
                if (Intrinsics.LJFF(pair, new Pair(true, false))) {
                    BotFeedbackRequest botFeedbackRequest = new BotFeedbackRequest(C2286608xc.LJ(FeedbackActionEnum.FEEDBACK_ACTION_ENUM_DISLIKE.getValue()), C2286608xc.LJFF(this.LLILLJJLI.getMsgId()), null, null, null);
                    IMSmartReplyFeedbackAPI.LIZ.getClass();
                    C1535705zn.LIZ().feedback(botFeedbackRequest).LJJLJLI(new AfS171S0100000_2(this.LLILLJJLI, 52));
                    if (C1208404o6.LIZIZ) {
                        if (C0ZDX.LJJJJIZL(this.LLILLJJLI)) {
                            anonymousClass06042 = AnonymousClass0604.CREATOR;
                        } else {
                            anonymousClass06042 = AnonymousClass0604.USER;
                        }
                        C1DFH c1dfh = C0PEM.LIZ;
                        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                        C1536705zx c1536705zx = new C1536705zx(anonymousClass06042, this.LLILLJJLI, this.LLILLL, null);
                        this.LL = 1;
                        if (C23250099c.LJI(this, abstractC2238408pq, c1536705zx) == objLJFF) {
                            C1C7U.LIZIZ("FeedbackPanelOpenHelper@f331.notifyMsgDislikeFeedback$1");
                            return objLJFF;
                        }
                    } else {
                        C2244621CtI c2244621CtI = new C2244621CtI();
                        C2244721CtS c2244721CtS = new C2244721CtS();
                        c2244721CtS.LJII = C2286608xc.LJFF(this.LLILLJJLI.getMsgId());
                        c2244621CtI.LJI = c2244721CtS.build();
                        C15390060u.LL.LJIILJJIL(EnumC1705606m6.INTERACTION_TYPE_FEEDBACK, null, Collections.singletonList(c2244621CtI.build()));
                        C1DFH c1dfh2 = C0PEM.LIZ;
                        AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
                        C1536505zv c1536505zv = new C1536505zv(this.LLILZ, null);
                        this.LL = 2;
                        if (C23250099c.LJI(this, abstractC2238408pq2, c1536505zv) == objLJFF) {
                            C1C7U.LIZIZ("FeedbackPanelOpenHelper@f331.notifyMsgDislikeFeedback$1");
                            return objLJFF;
                        }
                    }
                } else if (Intrinsics.LJFF(pair, new Pair(false, true))) {
                    BotFeedbackCancelRequest botFeedbackCancelRequest = new BotFeedbackCancelRequest(C2286608xc.LJFF(this.LLILLJJLI.getMsgId()), C2286608xc.LJ(FeedbackActionEnum.FEEDBACK_ACTION_ENUM_DISLIKE.getValue()));
                    IMSmartReplyFeedbackAPI.LIZ.getClass();
                    C1535705zn.LIZ().feedbackCancel(botFeedbackCancelRequest).LJJLJLI(new AfS171S0100000_2(this.LLILLJJLI, 53));
                } else if (Intrinsics.LJFF(pair, new Pair(false, false))) {
                    BotFeedbackRequest botFeedbackRequest2 = new BotFeedbackRequest(C2286608xc.LJ(FeedbackActionEnum.FEEDBACK_ACTION_ENUM_DISLIKE.getValue()), C2286608xc.LJFF(this.LLILLJJLI.getMsgId()), null, null, null);
                    IMSmartReplyFeedbackAPI.LIZ.getClass();
                    C1535705zn.LIZ().feedback(botFeedbackRequest2).LJJLJLI(new AfS171S0100000_2(this.LLILLJJLI, 54));
                    if (C1208404o6.LIZIZ) {
                        if (C0ZDX.LJJJJIZL(this.LLILLJJLI)) {
                            anonymousClass0604 = AnonymousClass0604.CREATOR;
                        } else {
                            anonymousClass0604 = AnonymousClass0604.USER;
                        }
                        C1DFH c1dfh3 = C0PEM.LIZ;
                        AbstractC2238408pq abstractC2238408pq3 = C2107308Nj.LIZ;
                        C1536805zy c1536805zy = new C1536805zy(anonymousClass0604, this.LLILLJJLI, this.LLILLL, null);
                        this.LL = 3;
                        if (C23250099c.LJI(this, abstractC2238408pq3, c1536805zy) == objLJFF) {
                            C1C7U.LIZIZ("FeedbackPanelOpenHelper@f331.notifyMsgDislikeFeedback$1");
                            return objLJFF;
                        }
                    } else {
                        C2244621CtI c2244621CtI2 = new C2244621CtI();
                        C2244721CtS c2244721CtS2 = new C2244721CtS();
                        c2244721CtS2.LJII = C2286608xc.LJFF(this.LLILLJJLI.getMsgId());
                        c2244621CtI2.LJI = c2244721CtS2.build();
                        C15390060u.LL.LJIILJJIL(EnumC1705606m6.INTERACTION_TYPE_FEEDBACK, null, Collections.singletonList(c2244621CtI2.build()));
                        C1DFH c1dfh4 = C0PEM.LIZ;
                        AbstractC2238408pq abstractC2238408pq4 = C2107308Nj.LIZ;
                        C1536605zw c1536605zw = new C1536605zw(this.LLILZ, null);
                        this.LL = 4;
                        if (C23250099c.LJI(this, abstractC2238408pq4, c1536605zw) == objLJFF) {
                            C1C7U.LIZIZ("FeedbackPanelOpenHelper@f331.notifyMsgDislikeFeedback$1");
                            return objLJFF;
                        }
                    }
                } else {
                    Intrinsics.LJFF(pair, new Pair(true, true));
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedbackPanelOpenHelper@f331.notifyMsgDislikeFeedback$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
