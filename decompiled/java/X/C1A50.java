package X;

import android.graphics.Rect;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1A50, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A50 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C2177681AKo LL;
    public final /* synthetic */ Rect LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1A50(C2177681AKo c2177681AKo, Rect rect) {
        super(0);
        this.LL = c2177681AKo;
        this.LLILLJJLI = rect;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        SurfaceView surfaceView = this.LL.LIZ;
        if (surfaceView != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.LLILLJJLI.width(), this.LLILLJJLI.height());
            Rect rect = this.LLILLJJLI;
            layoutParams.leftMargin = rect.left;
            layoutParams.topMargin = rect.top;
            surfaceView.setTag(R.id.ysv, layoutParams);
            C786410Ut5.U5(surfaceView, layoutParams);
        }
        return Unit.LIZ;
    }
}
