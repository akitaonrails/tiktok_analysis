package X;

import android.os.SystemClock;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uQ1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.VoucherCountdownService$startCountdownJob$1", f = "VoucherCountdownService.kt", l = {51}, m = "invokeSuspend")
public final class C1703030uQ1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1703050uQ3 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1703030uQ1(C1703050uQ3 c1703050uQ3, InterfaceC1364105Vn<? super C1703030uQ1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1703050uQ3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1703030uQ1(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jElapsedRealtime;
        long j;
        C1C7U.LIZ("VoucherCountdownService@d6ad.startCountdownJob$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C155000ia.LIZIZ(obj);
        do {
            C1703050uQ3 c1703050uQ3 = this.LLILLJJLI;
            if (c1703050uQ3.LIZIZ > 0) {
                if (c1703050uQ3.LIZJ) {
                    jElapsedRealtime = System.currentTimeMillis();
                } else {
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                }
                c1703050uQ3.LIZLLL = jElapsedRealtime;
                this.LLILLJJLI.LIZ();
                C1703050uQ3 c1703050uQ32 = this.LLILLJJLI;
                j = c1703050uQ32.LIZIZ;
                long j2 = c1703050uQ32.LJII;
                if (j > j2) {
                    j = j2;
                }
                this.LL = 1;
            } else {
                ((ArrayList) c1703050uQ3.LJI).clear();
                AnonymousClass0956 anonymousClass0956 = c1703050uQ3.LJIIIIZZ;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                C1703050uQ3.LJIIJ.remove(c1703050uQ3.LIZ);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("VoucherCountdownService@d6ad.startCountdownJob$1");
                return unit;
            }
        } while (AnonymousClass0958.LIZIZ(j, this) != objLJFF);
        C1C7U.LIZIZ("VoucherCountdownService@d6ad.startCountdownJob$1");
        return objLJFF;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
