package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.VoucherCountdown;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uQ2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.VoucherCountdownService$startCountdownByVoucherCountdown$1", f = "VoucherCountdownService.kt", l = {}, m = "invokeSuspend")
public final class C1703040uQ2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1703050uQ3 LL;
    public final /* synthetic */ VoucherCountdown LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1703040uQ2(C1703050uQ3 c1703050uQ3, VoucherCountdown voucherCountdown, InterfaceC1364105Vn<? super C1703040uQ2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1703050uQ3;
        this.LLILLJJLI = voucherCountdown;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1703040uQ2(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VoucherCountdownService@d6ad.startCountdownByVoucherCountdown$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1703050uQ3 c1703050uQ3 = this.LL;
        VoucherCountdown voucherCountdown = this.LLILLJJLI;
        long j = voucherCountdown.startTime;
        long j2 = voucherCountdown.endTime;
        AnonymousClass0956 anonymousClass0956 = c1703050uQ3.LJIIIIZZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        if (j != 0 && j2 != 0) {
            c1703050uQ3.LJII = 1000L;
            long j3 = LSPassThroughRecordSizeConfig.DEFAULT;
            c1703050uQ3.LJ = j * j3;
            c1703050uQ3.LJFF = j2 * j3;
            c1703050uQ3.LIZLLL = System.currentTimeMillis();
            c1703050uQ3.LIZ();
            c1703050uQ3.LJIIIIZZ = C23250099c.LIZLLL(c1703050uQ3.LJIIIZ, null, null, new C1703030uQ1(c1703050uQ3, null), 3);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VoucherCountdownService@d6ad.startCountdownByVoucherCountdown$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
