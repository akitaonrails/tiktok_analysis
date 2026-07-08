package X;

import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.SmartReplySuggestedReplyViewModel;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.protocol.IMSuggestedReplyMsgAssem;
import com.ss.android.ugc.aweme.inbox.service.IInboxService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05v1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.protocol.IMSuggestedReplyMsgAssem$generateTextView$3$1$1", f = "IMSuggestedReplyMsgProtocol.kt", l = {214}, m = "invokeSuspend")
public final class C1506105v1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IMSuggestedReplyMsgAssem LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ TuxTextView LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1506105v1(IMSuggestedReplyMsgAssem iMSuggestedReplyMsgAssem, int i, String str, TuxTextView tuxTextView, InterfaceC1364105Vn<? super C1506105v1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iMSuggestedReplyMsgAssem;
        this.LLILLL = i;
        this.LLILZ = str;
        this.LLILZIL = tuxTextView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1506105v1(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String string;
        String mobValue;
        String uuid;
        C05RV c05rvLIZJ;
        C1C7U.LIZ("IMSuggestedReplyMsgAssem@4d76.generateTextView$3$1$1");
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
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1506305v3 c1506305v3 = new C1506305v3(this.LLILLJJLI, this.LLILZIL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c1506305v3) == objLJFF) {
                C1C7U.LIZIZ("IMSuggestedReplyMsgAssem@4d76.generateTextView$3$1$1");
                return objLJFF;
            }
        }
        AssemVMLazy assemVMLazy = this.LLILLJJLI.LLJLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = IMSuggestedReplyMsgAssem.LLLF;
        SmartReplySuggestedReplyViewModel smartReplySuggestedReplyViewModel = (SmartReplySuggestedReplyViewModel) assemVMLazy.getValue();
        int i2 = this.LLILLL;
        String str = this.LLILZ;
        smartReplySuggestedReplyViewModel.LLJILJILJ = true;
        C054L.LIZ.getClass();
        InterfaceC1411705fn interfaceC1411705fn = (InterfaceC1411705fn) C054L.LIZIZ.getValue();
        if (interfaceC1411705fn != null) {
            interfaceC1411705fn.LIZJ("");
        }
        C0Y8T c0y8tYQ2 = smartReplySuggestedReplyViewModel.yQ2();
        if (c0y8tYQ2 != null) {
            Long lValueOf = Long.valueOf(C0YNP.LJII(smartReplySuggestedReplyViewModel.zQ2()));
            if (lValueOf.longValue() > 0) {
                string = lValueOf.toString();
            } else {
                string = null;
            }
            smartReplySuggestedReplyViewModel.LLILZ.put("is_ai_suggest_reply", "1");
            smartReplySuggestedReplyViewModel.LLILZ.put("is_ai_suggest_revised", CardStruct.IStatusCode.DEFAULT);
            smartReplySuggestedReplyViewModel.LLJJIII = str;
            C1508705vR c1508705vR = C1508705vR.LL;
            IInboxService iInboxService = (IInboxService) PluggableExtentionKt.pluggableSpi$default(IInboxService.class, false, false, false, 14, null);
            if (iInboxService == null || (c05rvLIZJ = iInboxService.LIZJ()) == null || (mobValue = c05rvLIZJ.getMobValue()) == null) {
                mobValue = "";
            }
            C869590Y9l c869590Y9l = smartReplySuggestedReplyViewModel.LLJJ;
            if (c869590Y9l != null) {
                uuid = c869590Y9l.getUuid();
            } else {
                uuid = null;
            }
            String strValueOf = String.valueOf(string);
            String strValueOf2 = String.valueOf(i2);
            String str2 = (String) smartReplySuggestedReplyViewModel.LLJJIJIIJIL.getValue();
            c1508705vR.getClass();
            C23250099c.LIZLLL(C1508705vR.LLILLJJLI, null, null, new C1498505tn("chat", mobValue, uuid, strValueOf, strValueOf2, c0y8tYQ2, str2, null), 3);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMSuggestedReplyMsgAssem@4d76.generateTextView$3$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
