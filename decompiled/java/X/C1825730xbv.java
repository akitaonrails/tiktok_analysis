package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.powerlist.cells.ServiceBioDMAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.viewmodel.PcsServiceBioVMV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xbv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1825730xbv extends C09AY implements Function2<View, String, Unit> {
    public final /* synthetic */ ServiceBioDMAssem LL;
    public final /* synthetic */ C1781720wSw LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1825730xbv(ServiceBioDMAssem serviceBioDMAssem, C1781720wSw c1781720wSw) {
        super(2);
        this.LL = serviceBioDMAssem;
        this.LLILLJJLI = c1781720wSw;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(View view, String str) {
        ServiceBioDMAssem serviceBioDMAssem = this.LL;
        ((PcsServiceBioVMV2) serviceBioDMAssem.LLJLLIL.getValue(serviceBioDMAssem, ServiceBioDMAssem.LLJZ[0])).xQ2(this.LLILLJJLI);
        return Unit.LIZ;
    }
}
