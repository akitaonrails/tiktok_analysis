package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01af, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.vision.record.history.handler.PhotoSearchHistoryRecordHandler$loadAsync$1", f = "PhotoSearchRecordHandler.kt", l = {137, 141}, m = "invokeSuspend")
public final class C360701af extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C09HI LLILLL;
    public final /* synthetic */ Function1<C09HH, Unit> LLILZ;
    public final /* synthetic */ Function1<Throwable, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C360701af(C09HI c09hi, Function1<? super C09HH, Unit> function1, Function1<? super Throwable, Unit> function12, InterfaceC1364105Vn<? super C360701af> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c09hi;
        this.LLILZ = function1;
        this.LLILZIL = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C360701af(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("PhotoSearchHistoryRecordHandler@d979.loadAsync$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PhotoSearchHistoryRecordHandler@d979.loadAsync$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c098200Yq = this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C09HI c09hi = this.LLILLL;
            try {
                C09HI.LIZ.getClass();
                ArrayList arrayListLIZIZ = C09HJ.LIZIZ();
                C09HJ.LIZJ(arrayListLIZIZ);
                c098200Yq = C09HD.LIZ(arrayListLIZIZ);
                c09hi.getClass();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Function1<C09HH, Unit> function1 = this.LLILZ;
            if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C360601ae c360601ae = new C360601ae(function1, (C09HH) c098200Yq, null);
                this.LL = c098200Yq;
                this.LLILLJJLI = 1;
                if (C23250099c.LJI(this, abstractC2238408pq, c360601ae) == objLJFF) {
                    C1C7U.LIZIZ("PhotoSearchHistoryRecordHandler@d979.loadAsync$1");
                    return objLJFF;
                }
            }
        }
        Function1<Throwable, Unit> function12 = this.LLILZIL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1DFH c1dfh2 = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
            C360501ad c360501ad = new C360501ad(thM5exceptionOrNullimpl, null, function12);
            this.LL = c098200Yq;
            this.LLILLJJLI = 2;
            if (C23250099c.LJI(this, abstractC2238408pq2, c360501ad) == objLJFF) {
                C1C7U.LIZIZ("PhotoSearchHistoryRecordHandler@d979.loadAsync$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PhotoSearchHistoryRecordHandler@d979.loadAsync$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
