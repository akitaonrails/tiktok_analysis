package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0z7i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1883880z7i extends C09AY implements Function0<C1091270eVJ> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1883880z7i(Context context) {
        super(0);
        this.LL = context;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0eVJ] */
    @Override // kotlin.jvm.functions.Function0
    public final C1091270eVJ invoke() {
        final Context context = this.LL;
        return new FrameLayout(context) { // from class: X.0eVJ
            @Override // android.widget.FrameLayout, android.view.View
            public final void onMeasure(int i, int i2) {
                View childAt = getChildAt(0);
                if (childAt != null) {
                    measureChildWithMargins(childAt, i, 0, i2, 0);
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                } else {
                    super.onMeasure(i, i2);
                }
            }
        };
    }
}
