package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.services.AgeGateSdkRegistrationFlow;
import com.ss.android.ugc.aweme.services.IAwemeAccountAppDiffService;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.10f3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19300310f3 implements InterfaceC19257010Vk {
    public final Bundle LIZ;
    public final AgeGateSdkRegistrationFlow LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    @Override // X.InterfaceC19257010Vk
    public final C10WS LIZ() {
        return IAwemeAccountAppDiffService.Companion.get().getAppDiffAgeGateFragment(this.LIZJ, new AwS572S0100000_28(this, 18));
    }

    @Override // X.InterfaceC19257010Vk
    public final Bundle data() {
        Bundle bundle = this.LIZ;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt("flow", this.LIZIZ.getFlow());
        bundle.putBoolean("isFtc", this.LIZLLL);
        bundle.putBoolean("fetchAgeRangeFromNativeStore", this.LJ);
        return bundle;
    }

    public C19300310f3(Bundle bundle, AgeGateSdkRegistrationFlow ageGateSdkRegistrationFlow, boolean z, boolean z2, boolean z3) {
        this.LIZ = bundle;
        this.LIZIZ = ageGateSdkRegistrationFlow;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
    }
}
