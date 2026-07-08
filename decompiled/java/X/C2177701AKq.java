package X;

import android.view.SurfaceView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AKq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2177701AKq extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C2177681AKo LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2177701AKq(C2177681AKo c2177681AKo, boolean z) {
        super(0);
        this.LL = c2177681AKo;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        SurfaceView surfaceView = this.LL.LIZ;
        if (surfaceView != null) {
            C500260Jjc.LJLJLJ(surfaceView, this.LLILLJJLI);
        }
        return Unit.LIZ;
    }
}
