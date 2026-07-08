package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.viewmodel.PcsServicePlusOptinVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.api.sub.SMBOptInQualificationResponse;

/* JADX INFO: renamed from: X.0xYd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1823690xYd extends C09AY implements Function1<SMBOptInQualificationResponse.ResponseData, Unit> {
    public final /* synthetic */ PcsServicePlusOptinVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1823690xYd(PcsServicePlusOptinVM pcsServicePlusOptinVM) {
        super(1);
        this.LL = pcsServicePlusOptinVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SMBOptInQualificationResponse.ResponseData responseData) {
        PcsServicePlusOptinVM pcsServicePlusOptinVM = this.LL;
        pcsServicePlusOptinVM.getClass();
        pcsServicePlusOptinVM.setState(new C1823700xYe(responseData));
        return Unit.LIZ;
    }
}
