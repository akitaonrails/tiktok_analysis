package X;

import android.view.SurfaceView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0nsk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1451760nsk extends C2217421BqW implements Function1<SurfaceView, Unit> {
    public C1451760nsk(C1451820nsq c1451820nsq) {
        super(1, c1451820nsq, C1451820nsq.class, "onSurfaceViewCreated", "onSurfaceViewCreated(Landroid/view/SurfaceView;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SurfaceView surfaceView) {
        ((C1451820nsq) this.receiver).N5(surfaceView);
        return Unit.LIZ;
    }
}
