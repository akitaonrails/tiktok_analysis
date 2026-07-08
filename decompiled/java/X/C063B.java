package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.063B, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.common.utils.TakoEnterUtil$enterNewAIBot$1$readyConversationTask$1", f = "TakoEnterUtil.kt", l = {882}, m = "invokeSuspend")
public final class C063B extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ TakoEnterParams LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C063B(TakoEnterParams takoEnterParams, InterfaceC1364105Vn<? super C063B> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoEnterParams;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C063B(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        C1C7U.LIZ("TakoEnterUtil@4341.enterNewAIBot$1$readyConversationTask$1");
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
                C063C c063c = new C063C(this.LLILLJJLI, null);
                this.LL = 1;
                obj = C099A.LIZIZ(60000L, c063c, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("TakoEnterUtil@4341.enterNewAIBot$1$readyConversationTask$1");
                    return objLJFF;
                }
            }
            zBooleanValue = ((Boolean) obj).booleanValue();
        } catch (C094W e) {
            TryCatchGuardChecker.doCheck(e);
            zBooleanValue = false;
        }
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        C1C7U.LIZIZ("TakoEnterUtil@4341.enterNewAIBot$1$readyConversationTask$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
