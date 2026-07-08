package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.powerlist.cells.ServiceBioSingleSkuActionAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.viewmodel.PcsServiceBioVMV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xbi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1825600xbi extends C09AY implements Function2<View, String, Unit> {
    public final /* synthetic */ ServiceBioSingleSkuActionAssem LL;
    public final /* synthetic */ C1781870wTB LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1825600xbi(ServiceBioSingleSkuActionAssem serviceBioSingleSkuActionAssem, C1781870wTB c1781870wTB) {
        super(2);
        this.LL = serviceBioSingleSkuActionAssem;
        this.LLILLJJLI = c1781870wTB;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(View view, String str) {
        ServiceBioSingleSkuActionAssem serviceBioSingleSkuActionAssem = this.LL;
        ((PcsServiceBioVMV2) serviceBioSingleSkuActionAssem.LLJL.getValue(serviceBioSingleSkuActionAssem, ServiceBioSingleSkuActionAssem.LLJZIJLIL[0])).xQ2(this.LLILLJJLI);
        return Unit.LIZ;
    }
}
