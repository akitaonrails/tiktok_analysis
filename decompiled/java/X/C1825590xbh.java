package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.powerlist.cells.ServiceBioCourseSectionAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.viewmodel.PcsServiceBioVMV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xbh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1825590xbh extends C09AY implements Function2<View, String, Unit> {
    public final /* synthetic */ ServiceBioCourseSectionAssem LL;
    public final /* synthetic */ C1781880wTC LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1825590xbh(ServiceBioCourseSectionAssem serviceBioCourseSectionAssem, C1781880wTC c1781880wTC) {
        super(2);
        this.LL = serviceBioCourseSectionAssem;
        this.LLILLJJLI = c1781880wTC;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(View view, String str) {
        ServiceBioCourseSectionAssem serviceBioCourseSectionAssem = this.LL;
        ((PcsServiceBioVMV2) serviceBioCourseSectionAssem.LLJLILLLLZIIL.getValue(serviceBioCourseSectionAssem, ServiceBioCourseSectionAssem.LLJLLIL[0])).xQ2(this.LLILLJJLI);
        return Unit.LIZ;
    }
}
