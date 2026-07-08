package X;

import android.view.SurfaceView;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AKn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2177671AKn extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C2177681AKo LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ ViewGroup LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2177671AKn(C2177681AKo c2177681AKo, boolean z, boolean z2, ViewGroup viewGroup, int i) {
        super(0);
        this.LL = c2177681AKo;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = viewGroup;
        this.LLILZIL = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        SurfaceView surfaceView = this.LL.LIZ;
        if (surfaceView != null) {
            C500260Jjc.LJLJLJ(surfaceView, this.LLILLJJLI);
            C500260Jjc.LJJJLL(surfaceView);
            surfaceView.setZOrderMediaOverlay(this.LLILLL);
            ViewGroup viewGroup = this.LLILZ;
            if (viewGroup != null) {
                viewGroup.addView(surfaceView, this.LLILZIL);
            }
        }
        return Unit.LIZ;
    }
}
