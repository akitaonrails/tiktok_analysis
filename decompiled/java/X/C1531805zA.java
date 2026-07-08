package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05zA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.sea.feed.popcard.SeaEcLiveFeedCard$handleDelay$2$1", f = "SeaEcLiveFeedCard.kt", l = {544}, m = "invokeSuspend")
public final class C1531805zA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1531805zA(long j, long j2, long j3, InterfaceC1364105Vn<? super C1531805zA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = j3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1531805zA(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C2341109Fh c2341109Fh;
        C1C7U.LIZ("SeaEcLiveFeedCard@bf0f.handleDelay$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            try {
                if (i != 0) {
                    if (i == 1) {
                        C155000ia.LIZIZ(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C155000ia.LIZIZ(obj);
                    C2341109Fh.LIZ.getClass();
                    C2341109Fh.LJ("wait job start");
                    long j = this.LLILLJJLI - (this.LLILLL - this.LLILZ);
                    this.LL = 1;
                    if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                        C1C7U.LIZIZ("SeaEcLiveFeedCard@bf0f.handleDelay$2$1");
                        return objLJFF;
                    }
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
            C1C7U.LIZIZ("SeaEcLiveFeedCard@bf0f.handleDelay$2$1");
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
