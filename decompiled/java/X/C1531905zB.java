package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05zB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.EcLiveProductCard$showCardIfNeeded$1$4$3$1", f = "EcLiveProductCard.kt", l = {303}, m = "invokeSuspend")
public final class C1531905zB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ C212206182q LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1531905zB(long j, long j2, long j3, C212206182q c212206182q, InterfaceC1364105Vn<? super C1531905zB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = j3;
        this.LLILZIL = c212206182q;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1531905zB(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C2341109Fh c2341109Fh;
        C1C7U.LIZ("EcLiveProductCard@521a.showCardIfNeeded$1$4$3$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(obj);
                } else {
                    C155000ia.LIZIZ(obj);
                    C2341109Fh.LIZ.getClass();
                    C2341109Fh.LJ("wait job start");
                    long j = this.LLILLJJLI - (this.LLILLL - this.LLILZ);
                    this.LL = 1;
                    if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                        C1C7U.LIZIZ("EcLiveProductCard@521a.showCardIfNeeded$1$4$3$1");
                        return objLJFF;
                    }
                }
                C212206182q c212206182q = this.LLILZIL;
                if (c212206182q.LLJJIJIL > 2 && ((Boolean) c212206182q.LLJI.getValue()).booleanValue()) {
                    this.LLILZIL.LJIIJJI();
                }
                c2341109Fh = C2341109Fh.LIZ;
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                c2341109Fh = C2341109Fh.LIZ;
                c2341109Fh.getClass();
                C2341109Fh.LJ("wait job cancelled");
            }
            c2341109Fh.getClass();
            C2341109Fh.LJ("wait job finished");
            C1C7U.LIZIZ("EcLiveProductCard@521a.showCardIfNeeded$1$4$3$1");
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LJ("wait job finished");
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
