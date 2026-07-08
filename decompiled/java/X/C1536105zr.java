package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.ai.impl.bot.api.BotFeedbackReason;
import com.ss.android.ugc.aweme.im.ai.impl.bot.api.BotFeedbackRequest;
import com.ss.android.ugc.aweme.im.ai.impl.bot.api.FeedbackActionEnum;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.api.IMSmartReplyFeedbackAPI;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.FeedbackPanelConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05zr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.creator.CreatorPanelViewModel$onSubmit$1$1", f = "CreatorPanelViewModel.kt", l = {58}, m = "invokeSuspend")
public final class C1536105zr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FeedbackPanelConfig LLILLJJLI;
    public final /* synthetic */ C060A LLILLL;
    public final /* synthetic */ View LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1536105zr(FeedbackPanelConfig feedbackPanelConfig, C060A c060a, View view, InterfaceC1364105Vn<? super C1536105zr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = feedbackPanelConfig;
        this.LLILLL = c060a;
        this.LLILZ = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1536105zr(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        Integer numLJ;
        C1C7U.LIZ("CreatorPanelViewModel@f33a.onSubmit$1$1");
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
            Integer numLJ2 = C2286608xc.LJ(FeedbackActionEnum.FEEDBACK_ACTION_ENUM_DISLIKE.getValue());
            Long lLJIILIIL = C2095008Iq.LJIILIIL(this.LLILLJJLI.msgId);
            if (lLJIILIIL != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = 0;
            }
            Long lLJFF = C2286608xc.LJFF(jLongValue);
            Set<BotFeedbackReason> set = this.LLILLL.LLILLJJLI;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = set.iterator();
            while (it2.hasNext()) {
                Long l = ((BotFeedbackReason) it2.next()).reasonId;
                if (l != null && (numLJ = C2286608xc.LJ((int) l.longValue())) != null) {
                    arrayList.add(numLJ);
                }
            }
            BotFeedbackRequest botFeedbackRequest = new BotFeedbackRequest(numLJ2, lLJFF, C13LP.LLIIII(arrayList), null, false);
            IMSmartReplyFeedbackAPI.LIZ.getClass();
            C1535705zn.LIZ().feedback(botFeedbackRequest).LIZLLL();
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C436901mx c436901mx = new C436901mx(this.LLILZ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c436901mx) == objLJFF) {
                C1C7U.LIZIZ("CreatorPanelViewModel@f33a.onSubmit$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreatorPanelViewModel@f33a.onSubmit$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
