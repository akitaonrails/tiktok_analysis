package X;

import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BatchUpdateMessage;
import defpackage.w2;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cgh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel$batchUpdateMessage$1", f = "MessageViewModel.kt", l = {3269}, m = "invokeSuspend")
public final class C320090Cgh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MessageViewModel LLILLJJLI;
    public final /* synthetic */ BatchUpdateMessage LLILLL;
    public final /* synthetic */ List<BatchUpdateMessage> LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ w2.a LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C320090Cgh(MessageViewModel messageViewModel, BatchUpdateMessage batchUpdateMessage, List<BatchUpdateMessage> list, boolean z, w2.a aVar, InterfaceC1364105Vn<? super C320090Cgh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = messageViewModel;
        this.LLILLL = batchUpdateMessage;
        this.LLILZ = list;
        this.LLILZIL = z;
        this.LLILZLL = aVar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C320090Cgh(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageViewModel@9229.batchUpdateMessage$1");
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
            C1863380yae c1863380yae = this.LLILLJJLI.LLJJJJ;
            if (c1863380yae != null) {
                BatchUpdateMessage batchUpdateMessage = this.LLILLL;
                List<BatchUpdateMessage> list = this.LLILZ;
                boolean z = this.LLILZIL;
                w2.a aVar = this.LLILZLL;
                this.LL = 1;
                Object objLJIILL = c1863380yae.LJIILL.LJIILL(C1863390yaf.LIZJ(batchUpdateMessage, c1863380yae, list, z, aVar), this);
                if (objLJIILL != C099R.LJFF()) {
                    objLJIILL = Unit.LIZ;
                }
                if (objLJIILL == objLJFF) {
                    C1C7U.LIZIZ("MessageViewModel@9229.batchUpdateMessage$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageViewModel@9229.batchUpdateMessage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
