package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0HYY, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HYY extends C09AY implements Function0<IPrivateAccountService> {
    public C0HYY() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final IPrivateAccountService invoke() {
        return ComplianceServiceProvider.LJIJJLI();
    }
}
