package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.SmartReplySuggestedReplyViewModel;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05v4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.SmartReplySuggestedReplyViewModel$requestSuggestedReply$1$1$1", f = "SmartReplySuggestedReplyViewModel.kt", l = {310}, m = "invokeSuspend")
public final class C1506405v4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SmartReplySuggestedReplyViewModel LLILLJJLI;
    public final /* synthetic */ List<C869590Y9l> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1506405v4(SmartReplySuggestedReplyViewModel smartReplySuggestedReplyViewModel, List<? extends C869590Y9l> list, InterfaceC1364105Vn<? super C1506405v4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = smartReplySuggestedReplyViewModel;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1506405v4(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SmartReplySuggestedReplyViewModel@aef2.requestSuggestedReply$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1506505v5 c1506505v5 = new C1506505v5(this.LLILLJJLI, this.LLILLL, null);
                this.LL = 1;
                obj = C099A.LIZIZ(30000L, c1506505v5, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SmartReplySuggestedReplyViewModel@aef2.requestSuggestedReply$1$1$1");
                    return objLJFF;
                }
            }
            ((Boolean) obj).booleanValue();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SmartReplySuggestedReplyViewModel@aef2.requestSuggestedReply$1$1$1");
            return unit;
        } catch (C094W e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (CancellationException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Job cancelled: ");
            sbLIZ.append(e2.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
            throw e2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
