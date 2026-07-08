package X;

/* JADX INFO: renamed from: X.01YG, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.model.PcsCalendlyMeetingRepository", f = "PcsCalendlyMeetingRepository.kt", l = {84}, m = "fetchMeetingDataServer-yxL6bBk")
public final class C01YG extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C01YH LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01YG(C01YH c01yh, InterfaceC1364105Vn<? super C01YG> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c01yh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsCalendlyMeetingRepository@3104.fetchMeetingDataServer$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(0L, 0L, null, null, this);
        if (objLIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("PcsCalendlyMeetingRepository@3104.fetchMeetingDataServer$1");
            return objLIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZ);
        C1C7U.LIZIZ("PcsCalendlyMeetingRepository@3104.fetchMeetingDataServer$1");
        return c189200o6M1boximpl;
    }
}
