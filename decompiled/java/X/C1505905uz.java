package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.SmartReplySuggestedReplyViewModel;
import com.ss.android.ugc.aweme.inbox.service.IInboxService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05uz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.SmartReplySuggestedReplyViewModel$onSuggestReplyContentShow$1", f = "SmartReplySuggestedReplyViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1505905uz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SmartReplySuggestedReplyViewModel LL;
    public final /* synthetic */ C0Y8T LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1505905uz(SmartReplySuggestedReplyViewModel smartReplySuggestedReplyViewModel, C0Y8T c0y8t, InterfaceC1364105Vn<? super C1505905uz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = smartReplySuggestedReplyViewModel;
        this.LLILLJJLI = c0y8t;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1505905uz(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Long lLJFF;
        Long lLJFF2;
        String string;
        String mobValue;
        String uuid;
        C05RV c05rvLIZJ;
        C1C7U.LIZ("SmartReplySuggestedReplyViewModel@aef2.onSuggestReplyContentShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LL.LLJJI;
        C869590Y9l c869590Y9l = this.LL.LLJJ;
        if (c869590Y9l != null) {
            lLJFF = C2286608xc.LJFF(c869590Y9l.getMsgId());
        } else {
            lLJFF = null;
        }
        if (Intrinsics.LJFF(str, String.valueOf(lLJFF))) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SmartReplySuggestedReplyViewModel@aef2.onSuggestReplyContentShow$1");
            return unit;
        }
        SmartReplySuggestedReplyViewModel smartReplySuggestedReplyViewModel = this.LL;
        C869590Y9l c869590Y9l2 = smartReplySuggestedReplyViewModel.LLJJ;
        if (c869590Y9l2 != null) {
            lLJFF2 = C2286608xc.LJFF(c869590Y9l2.getMsgId());
        } else {
            lLJFF2 = null;
        }
        smartReplySuggestedReplyViewModel.LLJJI = String.valueOf(lLJFF2);
        Long lLJFF3 = C2286608xc.LJFF(C0YNP.LJII(this.LL.zQ2()));
        if (lLJFF3.longValue() > 0) {
            string = lLJFF3.toString();
        } else {
            string = null;
        }
        C1508705vR c1508705vR = C1508705vR.LL;
        IInboxService iInboxService = (IInboxService) PluggableExtentionKt.pluggableSpi$default(IInboxService.class, false, false, false, 14, null);
        if (iInboxService == null || (c05rvLIZJ = iInboxService.LIZJ()) == null || (mobValue = c05rvLIZJ.getMobValue()) == null) {
            mobValue = "";
        }
        C869590Y9l c869590Y9l3 = this.LL.LLJJ;
        if (c869590Y9l3 != null) {
            uuid = c869590Y9l3.getUuid();
        } else {
            uuid = null;
        }
        String strValueOf = String.valueOf(string);
        String str2 = (String) this.LL.LLJJIJIIJIL.getValue();
        C0Y8T c0y8t = this.LLILLJJLI;
        c1508705vR.getClass();
        C23250099c.LIZLLL(C1508705vR.LLILLJJLI, null, null, new C1498605to("chat", mobValue, uuid, strValueOf, c0y8t, str2, null), 3);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SmartReplySuggestedReplyViewModel@aef2.onSuggestReplyContentShow$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
