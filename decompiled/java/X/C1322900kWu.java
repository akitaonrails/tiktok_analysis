package X;

import android.graphics.Bitmap;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.SurfaceView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0kWu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1322900kWu extends C09AY implements Function1<C838040WuA, Unit> {
    public final /* synthetic */ SurfaceView LL;
    public final /* synthetic */ Bitmap LLILLJJLI;
    public final /* synthetic */ PixelCopy.OnPixelCopyFinishedListener LLILLL;
    public final /* synthetic */ Handler LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1322900kWu(SurfaceView surfaceView, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler) {
        super(1);
        this.LL = surfaceView;
        this.LLILLJJLI = bitmap;
        this.LLILLL = onPixelCopyFinishedListener;
        this.LLILZ = handler;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C838040WuA c838040WuA) throws Throwable {
        C2204961BRm.LLILLJJLI(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, new C0WZX("dzBzEgAjS8/YVFkiQFyGdpIIcIGkM9tlnBcBz8J0Uat9SeALkBitrIQMAwPbFTuodqcJsubFQg==", null));
        return Unit.LIZ;
    }
}
