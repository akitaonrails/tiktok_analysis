package X;

import com.bytedance.pitaya.api.mutilinstance.HostSetupWatcher;
import com.bytedance.pitaya.api.mutilinstance.PreHostSetupWatcher;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Nvb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C609610Nvb extends C09AY implements Function0<String> {
    public static final /* synthetic */ int LL = 0;

    static {
        new C609610Nvb();
    }

    public C609610Nvb() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("needInitPitaya1st(exp: ");
        sbLIZ.append(C609730Nvn.LIZ().tryInitPitayaOnReceive);
        sbLIZ.append(", PreHostSetup: ");
        sbLIZ.append(PreHostSetupWatcher.INSTANCE.isPreHostSetup());
        sbLIZ.append(", HostSetup: ");
        sbLIZ.append(HostSetupWatcher.INSTANCE.isHostSetup());
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
