package X;

import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Xp0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.eventtrack.ToolsFluencyEventReport$start$2", f = "ToolsFluencyEventReport.kt", l = {76}, m = "invokeSuspend")
public final class C860320Xp0 extends C09AX implements Function2<Unit, InterfaceC1364105Vn<? super Unit>, Object> {
    public C860330Xp1 LL;
    public Object LLILLJJLI;
    public int LLILLL;

    public C860320Xp0(InterfaceC1364105Vn<? super C860320Xp0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C860320Xp0(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws InterruptedException {
        C860330Xp1 c860330Xp1;
        CountDownLatch countDownLatch;
        C1C7U.LIZ("ToolsFluencyEventReport@cfeb.start$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                countDownLatch = (CountDownLatch) this.LLILLJJLI;
                c860330Xp1 = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c860330Xp1 = C860340Xp2.LIZ;
            countDownLatch = new CountDownLatch(2);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C860310Xoz c860310Xoz = new C860310Xoz(c860330Xp1, countDownLatch, null);
            this.LL = c860330Xp1;
            this.LLILLJJLI = countDownLatch;
            this.LLILLL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c860310Xoz) == objLJFF) {
                C1C7U.LIZIZ("ToolsFluencyEventReport@cfeb.start$2");
                return objLJFF;
            }
        }
        countDownLatch.await();
        C860470XpF.LJI(c860330Xp1, null, EnumC860460XpE.PAGE);
        C860330Xp1 c860330Xp12 = C860340Xp2.LIZ;
        c860330Xp12.LJJIFFI = null;
        c860330Xp12.LJJII = null;
        c860330Xp12.LJJIII = null;
        c860330Xp12.LJJIIJ = null;
        c860330Xp12.LJJIIJZLJL = null;
        c860330Xp12.LJJIIZ = null;
        c860330Xp12.LJJIJIIJI = null;
        c860330Xp12.LJJIJIIJIL = null;
        c860330Xp12.LJJIJIL = null;
        c860330Xp12.LJJIJL = null;
        c860330Xp12.LJJIJLIJ = null;
        c860330Xp12.LJJIJ = null;
        c860330Xp12.LJJIIZI = null;
        c860330Xp12.LJJIL = null;
        c860330Xp12.LJJIZ = null;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ToolsFluencyEventReport@cfeb.start$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C860320Xp0(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
