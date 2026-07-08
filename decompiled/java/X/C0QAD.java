package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.visualinspiration.vm.SearchVisualInspirationSharedVM;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS411S0200000_10;
import njp.a;

/* JADX INFO: renamed from: X.0QAD, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.visualinspiration.vm.SearchVisualInspirationSharedVM$onLoadMoreResult$1", f = "SearchVisualInspirationSharedVM.kt", l = {344}, m = "invokeSuspend")
public final class C0QAD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0QA6>, Object> {
    public int LL;
    public final /* synthetic */ SearchVisualInspirationSharedVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0QAD(SearchVisualInspirationSharedVM searchVisualInspirationSharedVM, InterfaceC1364105Vn<? super C0QAD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = searchVisualInspirationSharedVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0QAD(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SearchVisualInspirationSharedVM@f5c4.onLoadMoreResult$1");
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
                C1DFB c1dfb = C0PEM.LIZJ;
                C0QAB c0qab = new C0QAB(this.LLILLJJLI, null);
                this.LL = 1;
                obj = C23250099c.LJI(this, c1dfb, c0qab);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SearchVisualInspirationSharedVM@f5c4.onLoadMoreResult$1");
                    return objLJFF;
                }
            }
            C0QA6 c0qa6 = (C0QA6) obj;
            C1C7U.LIZIZ("SearchVisualInspirationSharedVM@f5c4.onLoadMoreResult$1");
            return c0qa6;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (!(e instanceof CancellationException)) {
                C0CNO.LIZLLL(0L, new AwS411S0200000_10(this.LLILLJJLI, e, 51));
            } else {
                C2286608xc.LJ(Log.d("VisualInspiration", "onLoadMoreResult CancellationException"));
            }
            this.LLILLJJLI.LLIZ = false;
            C0QA6 c0qa62 = new C0QA6(null, e);
            C1C7U.LIZIZ("SearchVisualInspirationSharedVM@f5c4.onLoadMoreResult$1");
            return c0qa62;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0QA6> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
