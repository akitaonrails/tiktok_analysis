package X;

import android.view.SurfaceView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AKr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2177711AKr extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C2177681AKo LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2177711AKr(C2177681AKo c2177681AKo, boolean z) {
        super(0);
        this.LL = c2177681AKo;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        SurfaceView surfaceView = this.LL.LIZ;
        if (surfaceView != null) {
            surfaceView.setZOrderMediaOverlay(this.LLILLJJLI);
        }
        return Unit.LIZ;
    }
}
