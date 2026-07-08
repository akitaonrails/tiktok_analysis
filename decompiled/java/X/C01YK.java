package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.viewmodel.PcsCalendlyMeetingVm;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01YK, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.viewmodel.PcsCalendlyMeetingVm$fetchMeetingData$1", f = "PcsCalendlyMeetingVm.kt", l = {131}, m = "invokeSuspend")
public final class C01YK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PcsCalendlyMeetingVm LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01YK(PcsCalendlyMeetingVm pcsCalendlyMeetingVm, long j, String str, long j2, InterfaceC1364105Vn<? super C01YK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pcsCalendlyMeetingVm;
        this.LLILLL = j;
        this.LLILZ = str;
        this.LLILZIL = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01YK(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsCalendlyMeetingVm@2176.fetchMeetingData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            PcsCalendlyMeetingVm pcsCalendlyMeetingVm = this.LLILLJJLI;
            C01YH c01yh = pcsCalendlyMeetingVm.LLILZ;
            String strXQ2 = pcsCalendlyMeetingVm.xQ2();
            long j = this.LLILLL;
            String str = this.LLILZ;
            long j2 = this.LLILZIL;
            c01yh.getClass();
            InterfaceC346201Wa interfaceC346201WaLJIILJJIL = C09IC.LJIILJJIL(new C01YL(this.LLILLJJLI), new C2501109r7(new C01Y9(null), new C2325381G0q(new C095D(new C01YJ(c01yh, strXQ2, j, str, j2, null)), new C01YM(this.LLILLJJLI, null), 2), 0));
            final PcsCalendlyMeetingVm pcsCalendlyMeetingVm2 = this.LLILLJJLI;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.01YN
                /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
                @Override // X.InterfaceC346701Wf
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
                    /*
                        r5 = this;
                        com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.viewmodel.PcsCalendlyMeetingVm r1 = r1
                        X.00o6 r6 = (X.C189200o6) r6
                        java.lang.Object r4 = r6.m10unboximpl()
                        r1.getClass()
                        boolean r0 = X.C189200o6.m8isSuccessimpl(r4)
                        if (r0 == 0) goto L47
                        r2 = r4
                        kotlin.Pair r2 = (kotlin.Pair) r2
                        java.lang.Object r0 = r2.getSecond()
                        java.lang.Boolean r0 = (java.lang.Boolean) r0
                        boolean r3 = r0.booleanValue()
                        java.lang.Object r2 = r2.getFirst()
                        webcast.api.smb.SMBBookingEventResponse$ResponseData r2 = (webcast.api.smb.SMBBookingEventResponse.ResponseData) r2
                        X.0JPC r0 = new X.0JPC
                        r0.<init>(r2)
                        r1.setState(r0)
                        if (r3 != 0) goto L3c
                        if (r2 == 0) goto L34
                        java.lang.String r0 = r2.bookingEventUrl
                        if (r0 != 0) goto L39
                    L34:
                        X.1DzZ r0 = X.EnumC2273991DzZ.PARTIAL_LOADING
                        r1.CQ2(r0)
                    L39:
                        kotlin.Unit r0 = kotlin.Unit.LIZ
                        return r0
                    L3c:
                        if (r2 == 0) goto L5d
                        java.lang.String r0 = r2.bookingEventUrl
                        if (r0 == 0) goto L5d
                        X.1DzZ r0 = X.EnumC2273991DzZ.SMB_API_SUCCESS
                        r1.CQ2(r0)
                    L47:
                        java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r4)
                        if (r0 == 0) goto L39
                        java.lang.String r0 = r1.AQ2()
                        boolean r0 = X.C1533950q1J.LJ(r0)
                        if (r0 == 0) goto L73
                        X.1DzZ r0 = X.EnumC2273991DzZ.PARTIAL_FAILURE
                        r1.CQ2(r0)
                        goto L39
                    L5d:
                        java.lang.String r0 = r1.AQ2()
                        boolean r0 = X.C1533950q1J.LJ(r0)
                        if (r0 == 0) goto L6d
                        X.1DzZ r0 = X.EnumC2273991DzZ.PARTIAL_FAILURE
                        r1.CQ2(r0)
                        goto L47
                    L6d:
                        X.1DzZ r0 = X.EnumC2273991DzZ.FAILURE
                        r1.CQ2(r0)
                        goto L47
                    L73:
                        X.1DzZ r0 = X.EnumC2273991DzZ.FAILURE
                        r1.CQ2(r0)
                        goto L39
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C01YN.emit(java.lang.Object, X.05Vn):java.lang.Object");
                }
            };
            this.LL = 1;
            if (interfaceC346201WaLJIILJJIL.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("PcsCalendlyMeetingVm@2176.fetchMeetingData$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsCalendlyMeetingVm@2176.fetchMeetingData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
