package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.viewmodel.PcsCalendlyMeetingVm;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JPB, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JPB extends C09AY implements Function1<C0JPA, C0JPA> {
    public final /* synthetic */ Integer LL;
    public final /* synthetic */ PcsCalendlyMeetingVm LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JPB(Integer num, PcsCalendlyMeetingVm pcsCalendlyMeetingVm, Integer num2) {
        super(1);
        this.LL = num;
        this.LLILLJJLI = pcsCalendlyMeetingVm;
        this.LLILLL = num2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0JPA invoke(C0JPA c0jpa) {
        int iIntValue;
        int iIntValue2;
        C0JPA c0jpa2 = c0jpa;
        Integer num = this.LL;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = this.LLILLJJLI.getState().LLILLL;
        }
        Integer num2 = this.LLILLL;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = this.LLILLJJLI.getState().LLILZ;
        }
        return C0JPA.LIZ(c0jpa2, null, null, iIntValue, iIntValue2, 0, null, null, 243);
    }
}
