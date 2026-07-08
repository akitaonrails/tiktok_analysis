package X;

import android.graphics.Rect;
import android.os.Build;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zX5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1899610zX5 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1899490zWt LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1899610zX5(C1899490zWt c1899490zWt) {
        super(0);
        this.LL = c1899490zWt;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (Build.VERSION.SDK_INT >= 29) {
            if (!this.LL.getStaticPendantIsFold() || !C0BIV.LIZ() || this.LL.getWidth() <= 0 || this.LL.getHeight() <= 0) {
                this.LL.setSystemGestureExclusionRects(C13BV.INSTANCE);
            } else {
                this.LL.setSystemGestureExclusionRects(Collections.singletonList(new Rect(0, 0, this.LL.getWidth(), this.LL.getHeight())));
            }
        }
        return Unit.LIZ;
    }
}
