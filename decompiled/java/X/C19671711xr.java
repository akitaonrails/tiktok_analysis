package X;

import android.graphics.PointF;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11xr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C19671711xr extends C2217421BqW implements Function1<PointF, Unit> {
    public C19671711xr(C19671511xp c19671511xp) {
        super(1, c19671511xp, C19671511xp.class, "onTouchChanged", "onTouchChanged(Landroid/graphics/PointF;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(PointF pointF) {
        ((C19671511xp) this.receiver).D5(pointF);
        return Unit.LIZ;
    }
}
