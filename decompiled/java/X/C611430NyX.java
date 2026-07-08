package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NyX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.quickreply.AIQuickReplyManager$createInferenceTask$1$1", f = "AIQuickReplyManager.kt", l = {170}, m = "invokeSuspend")
public final class C611430NyX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C611430NyX(String str, List<String> list, InterfaceC1364105Vn<? super C611430NyX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C611430NyX(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIQuickReplyManager@476a.createInferenceTask$1$1");
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
            C611500Nye.LIZ.getClass();
            InterfaceC611450NyZ interfaceC611450NyZ = (InterfaceC611450NyZ) C611500Nye.LJI.getValue();
            if (interfaceC611450NyZ != null) {
                String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                String str = this.LLILLJJLI;
                C611470Nyb c611470Nyb = new C611470Nyb(System.currentTimeMillis(), curUserId, this.LLILLL, str);
                this.LL = 1;
                if (interfaceC611450NyZ.LIZJ(c611470Nyb, this) == objLJFF) {
                    C1C7U.LIZIZ("AIQuickReplyManager@476a.createInferenceTask$1$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIQuickReplyManager@476a.createInferenceTask$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
