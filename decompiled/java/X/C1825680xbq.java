package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.powerlist.cells.ServiceBioCalendarSectionAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.viewmodel.PcsServiceBioVMV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xbq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1825680xbq extends C09AY implements Function2<View, String, Unit> {
    public final /* synthetic */ ServiceBioCalendarSectionAssem LL;
    public final /* synthetic */ C1781850wT9 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1825680xbq(ServiceBioCalendarSectionAssem serviceBioCalendarSectionAssem, C1781850wT9 c1781850wT9) {
        super(2);
        this.LL = serviceBioCalendarSectionAssem;
        this.LLILLJJLI = c1781850wT9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(View view, String str) {
        ServiceBioCalendarSectionAssem serviceBioCalendarSectionAssem = this.LL;
        ((PcsServiceBioVMV2) serviceBioCalendarSectionAssem.LLJLILLLLZIIL.getValue(serviceBioCalendarSectionAssem, ServiceBioCalendarSectionAssem.LLJLLIL[0])).xQ2(this.LLILLJJLI);
        return Unit.LIZ;
    }
}
