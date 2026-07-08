package X;

import com.ss.android.ugc.aweme.net.mutli.network.SpeedModeServiceImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0oxD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1492970oxD extends C09AY implements Function0<InterfaceC1471380oOO> {
    public final /* synthetic */ SpeedModeServiceImpl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1492970oxD(SpeedModeServiceImpl speedModeServiceImpl) {
        super(0);
        this.LL = speedModeServiceImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1471380oOO invoke() {
        final SpeedModeServiceImpl speedModeServiceImpl = this.LL;
        return new InterfaceC1471380oOO() { // from class: X.0oxC
            @Override // X.InterfaceC1471380oOO
            public final void LIZ(int i, int i2, int i3) {
                speedModeServiceImpl.LJI(i, i2, i3);
            }
        };
    }
}
