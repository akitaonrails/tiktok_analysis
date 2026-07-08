package X;

import com.ss.android.ugc.aweme.net.mutli.network.SpeedModeServiceImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0oxQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1493100oxQ extends C09AY implements Function0<InterfaceC1493130oxT> {
    public final /* synthetic */ SpeedModeServiceImpl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1493100oxQ(SpeedModeServiceImpl speedModeServiceImpl) {
        super(0);
        this.LL = speedModeServiceImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1493130oxT invoke() {
        final SpeedModeServiceImpl speedModeServiceImpl = this.LL;
        return new InterfaceC1493130oxT() { // from class: X.0oxR
            @Override // X.InterfaceC1493130oxT
            public final void LIZ(int i, int i2) {
                speedModeServiceImpl.LJI(0, i, i2);
            }
        };
    }
}
