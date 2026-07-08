package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS251S0300000_7;
import njp.a;

/* JADX INFO: renamed from: X.0J0f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.paging.MaterialPageKeyedDataSource$loadAfter$job$1", f = "MaterialPageKeyedDataSource.kt", l = {90}, m = "invokeSuspend")
public final class C484990J0f extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public AbstractC470790IdB LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C471830Ier<Integer> LLILZ;
    public final /* synthetic */ C484980J0e LLILZIL;
    public final /* synthetic */ AbstractC470790IdB<Integer, Object> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C484990J0f(C471830Ier<Integer> c471830Ier, C484980J0e c484980J0e, AbstractC470790IdB<Integer, Object> abstractC470790IdB, InterfaceC1364105Vn<? super C484990J0f> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c471830Ier;
        this.LLILZIL = c484980J0e;
        this.LLILZLL = abstractC470790IdB;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C484990J0f c484990J0f = new C484990J0f(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c484990J0f.LLILLL = obj;
        return c484990J0f;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C484980J0e c484980J0e;
        AbstractC470790IdB<Integer, Object> abstractC470790IdB;
        Integer numLJ;
        C1C7U.LIZ("MaterialPageKeyedDataSource@e4d1.loadAfter$job$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            if (i != 0) {
                if (i == 1) {
                    abstractC470790IdB = this.LL;
                    c484980J0e = (C484980J0e) this.LLILLL;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C471830Ier<Integer> c471830Ier = this.LLILZ;
                c484980J0e = this.LLILZIL;
                abstractC470790IdB = this.LLILZLL;
                Integer num = c471830Ier.LIZ;
                C565700MGq c565700MGq = c484980J0e.LJFF;
                int iIntValue = num.intValue();
                int i2 = c471830Ier.LIZIZ;
                this.LLILLL = c484980J0e;
                this.LL = abstractC470790IdB;
                this.LLILLJJLI = 1;
                obj = c565700MGq.LIZ(iIntValue, i2, 2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MaterialPageKeyedDataSource@e4d1.loadAfter$job$1");
                    return objLJFF;
                }
            }
            C485040J0k c485040J0k = (C485040J0k) obj;
            List<Object> listLJIILJJIL = c484980J0e.LJIILJJIL(c484980J0e.LJIIIIZZ.invoke(c485040J0k.LIZ));
            if (c485040J0k.LIZJ) {
                numLJ = C2286608xc.LJ((int) c485040J0k.LIZIZ);
            } else {
                numLJ = null;
            }
            abstractC470790IdB.LIZ(numLJ, listLJIILJJIL);
            c484980J0e.LJII.invoke(EnumC485010J0h.SUCCESS);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C484980J0e c484980J0e2 = this.LLILZIL;
        C471830Ier<Integer> c471830Ier2 = this.LLILZ;
        AbstractC470790IdB<Integer, Object> abstractC470790IdB2 = this.LLILZLL;
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c484980J0e2.LJII.invoke(EnumC485010J0h.FAILED);
            c484980J0e2.LJIIJJI = new AwS251S0300000_7(c484980J0e2, (C484980J0e) c471830Ier2, (C471830Ier<Integer>) abstractC470790IdB2, (AbstractC470790IdB<Integer, Object>) 18);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MaterialPageKeyedDataSource@e4d1.loadAfter$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
