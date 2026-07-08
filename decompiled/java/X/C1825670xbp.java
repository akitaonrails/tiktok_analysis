package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.powerlist.cells.ServiceBioCalendarAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.viewmodel.PcsServiceBioVMV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xbp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1825670xbp extends C09AY implements Function2<View, String, Unit> {
    public final /* synthetic */ ServiceBioCalendarAssem LL;
    public final /* synthetic */ C1781850wT9 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1825670xbp(ServiceBioCalendarAssem serviceBioCalendarAssem, C1781850wT9 c1781850wT9) {
        super(2);
        this.LL = serviceBioCalendarAssem;
        this.LLILLJJLI = c1781850wT9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(View view, String str) {
        ServiceBioCalendarAssem serviceBioCalendarAssem = this.LL;
        ((PcsServiceBioVMV2) serviceBioCalendarAssem.LLJL.getValue(serviceBioCalendarAssem, ServiceBioCalendarAssem.LLJLLL[0])).xQ2(this.LLILLJJLI);
        return Unit.LIZ;
    }
}
