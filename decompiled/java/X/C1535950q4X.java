package X;

import com.ss.android.ugc.aweme.hybridkit.forest.SystemResourceSettings;
import kotlin.jvm.internal.AwS424S0200000_23;

/* JADX INFO: renamed from: X.0q4X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1535950q4X implements InterfaceC1531740pxk {
    public volatile EnumC1529850puh LIZ;
    public volatile EnumC1529850puh LIZIZ;
    public volatile EnumC1529850puh LIZJ;
    public volatile EnumC1529850puh LIZLLL;

    @Override // X.InterfaceC1531740pxk
    public final EnumC1529850puh LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1531740pxk
    public final EnumC1529850puh LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1531740pxk
    public final EnumC1529850puh getMemoryStatus() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1531740pxk
    public final EnumC1529850puh getNetworkStatus() {
        return this.LIZLLL;
    }

    public C1535950q4X(SystemResourceSettings.SystemResourceModel systemResourceModel) {
        EnumC1529850puh enumC1529850puh = EnumC1529850puh.NORMAL;
        this.LIZ = enumC1529850puh;
        this.LIZIZ = enumC1529850puh;
        this.LIZJ = enumC1529850puh;
        this.LIZLLL = enumC1529850puh;
        C1BCA.LIZLLL();
        C086F c086f = C086F.LIZ;
        AwS424S0200000_23 awS424S0200000_23 = new AwS424S0200000_23(systemResourceModel, this, 8);
        c086f.getClass();
        C086F.LJI(awS424S0200000_23);
    }
}
