package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0NMP, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.dislike.filter.SearchDislikeFilterImpl$1", f = "ISearchDislikeFilter.kt", l = {67}, m = "invokeSuspend")
public final class C0NMP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C0NMP(InterfaceC1364105Vn<? super C0NMP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NMP(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchDislikeFilterImpl@ff9.<init>$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C095D c095dLIZIZ = C0NMN.LIZ().LIZIZ().LIZIZ();
                Object obj2 = new InterfaceC346701Wf() { // from class: X.0NMQ
                    @Override // X.InterfaceC346701Wf
                    public final Object emit(Object obj3, InterfaceC1364105Vn interfaceC1364105Vn) {
                        CopyOnWriteArraySet<String> copyOnWriteArraySet = C0NMR.LIZJ;
                        copyOnWriteArraySet.clear();
                        copyOnWriteArraySet.addAll((Collection) obj3);
                        return Unit.LIZ;
                    }
                };
                this.LL = 1;
                if (c095dLIZIZ.collect(obj2, this) == objLJFF) {
                    C1C7U.LIZIZ("SearchDislikeFilterImpl@ff9.<init>$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "SearchDislikeFilter");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchDislikeFilterImpl@ff9.<init>$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C0NMP(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
