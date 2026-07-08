package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.amberalert.IAmberAlertService;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RzC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C713760RzC extends C09AY implements Function1<C0RF0, C0SZ8> {
    public C713760RzC() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0SZ8 invoke(C0RF0 c0rf0) {
        C0RF0 c0rf02 = c0rf0;
        IAmberAlertService iAmberAlertService = (IAmberAlertService) ComplianceServiceProvider.LJJII.getValue();
        if (iAmberAlertService.LIZIZ()) {
            return new C0T22((C0SZ8) iAmberAlertService.LIZJ(c0rf02.LIZ, c0rf02.LIZJ), c0rf02);
        }
        return new C0T22((C0SZ8) iAmberAlertService.LJFF(c0rf02.LIZ, c0rf02.LIZJ), c0rf02);
    }
}
