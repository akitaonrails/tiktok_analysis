package X;

import Y.ACallableS181S0300000_22;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS369S0200000_3;
import lnn.q;
import mn3.e0;
import njp.a;

/* JADX INFO: renamed from: X.0Mmq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.record.shooting.PhotoProcessor$enterEditPageAfterImageCapture$getStickerPhoto$1", f = "PhotoProcessor.kt", l = {}, m = "invokeSuspend")
public final class C578700Mmq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C578810Mn1 LL;
    public final /* synthetic */ List<String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C578700Mmq(C578810Mn1 c578810Mn1, List<String> list, InterfaceC1364105Vn<? super C578700Mmq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c578810Mn1;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C578700Mmq(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws InterruptedException {
        List<String> listI82;
        C1C7U.LIZ("PhotoProcessor@9c21.enterEditPageAfterImageCapture$getStickerPhoto$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        e0 e0VarLIZLLL = this.LL.LIZLLL();
        q qVarLJI = this.LL.LJI();
        List<String> list = this.LLILLJJLI;
        if (C578780Mmy.LIZ() && qVarLJI != null && (listI82 = qVarLJI.i82()) != null && !listI82.isEmpty()) {
            InterfaceC576950Mk1 interfaceC576950Mk1YP = e0VarLIZLLL.yP();
            List<String> listI822 = qVarLJI.i82();
            if (listI822 != null) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                AwS369S0200000_3 awS369S0200000_3 = new AwS369S0200000_3((List) list, (List<String>) countDownLatch, (CountDownLatch) 18);
                C1656090tCJ c1656090tCJ = (C1656090tCJ) interfaceC576950Mk1YP;
                c1656090tCJ.getClass();
                C15O7.LIZJ(new ACallableS181S0300000_22(c1656090tCJ, listI822, awS369S0200000_3, 0));
                countDownLatch.await(2L, TimeUnit.SECONDS);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PhotoProcessor@9c21.enterEditPageAfterImageCapture$getStickerPhoto$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
