package X;

import android.view.SurfaceView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AKp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2177691AKp extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C2177681AKo LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2177691AKp(C2177681AKo c2177681AKo) {
        super(0);
        this.LL = c2177681AKo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        SurfaceView surfaceView = this.LL.LIZ;
        if (surfaceView != null) {
            C500260Jjc.LJJJLL(surfaceView);
        }
        return Unit.LIZ;
    }
}
