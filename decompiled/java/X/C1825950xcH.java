package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.powerlist.cells.ServiceBioFormAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.viewmodel.PcsServiceBioVMV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xcH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1825950xcH extends C09AY implements Function2<View, String, Unit> {
    public final /* synthetic */ ServiceBioFormAssem LL;
    public final /* synthetic */ C1781730wSx LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1825950xcH(ServiceBioFormAssem serviceBioFormAssem, C1781730wSx c1781730wSx) {
        super(2);
        this.LL = serviceBioFormAssem;
        this.LLILLJJLI = c1781730wSx;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(View view, String str) {
        ServiceBioFormAssem serviceBioFormAssem = this.LL;
        ((PcsServiceBioVMV2) serviceBioFormAssem.LLJL.getValue(serviceBioFormAssem, ServiceBioFormAssem.LLJLL[0])).xQ2(this.LLILLJJLI);
        return Unit.LIZ;
    }
}
