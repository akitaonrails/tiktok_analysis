package X;

import Y.ACallableS181S0300000_22;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS369S0200000_3;
import lnn.q;
import njp.a;
import x5h.d;

/* JADX INFO: renamed from: X.0Mmp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.photo.processor.OptimizeTakePhotoProcessor$onProcess$2$getStickerPhoto$1", f = "OptimizeTakePhotoProcessor.kt", l = {}, m = "invokeSuspend")
public final class C578690Mmp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ d LL;
    public final /* synthetic */ List<String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C578690Mmp(d dVar, List<String> list, InterfaceC1364105Vn<? super C578690Mmp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = dVar;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C578690Mmp(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws InterruptedException {
        List<String> listI82;
        C1C7U.LIZ("OptimizeTakePhotoProcessor@e73a.onProcess$2$getStickerPhoto$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1650230t2r interfaceC1650230t2rInvoke = this.LL.LIZJ.invoke();
        q qVarInvoke = this.LL.LIZIZ.invoke();
        List<String> list = this.LLILLJJLI;
        if (C578780Mmy.LIZ() && qVarInvoke != null && (listI82 = qVarInvoke.i82()) != null && !listI82.isEmpty()) {
            InterfaceC576950Mk1 interfaceC576950Mk1YP = interfaceC1650230t2rInvoke.yP();
            List<String> listI822 = qVarInvoke.i82();
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
        C1C7U.LIZIZ("OptimizeTakePhotoProcessor@e73a.onProcess$2$getStickerPhoto$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
