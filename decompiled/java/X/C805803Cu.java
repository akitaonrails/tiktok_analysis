package X;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03Cu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C805803Cu extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ float LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C805803Cu(float f) {
        super(1);
        this.LL = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view2 = view;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            float f = this.LL;
            boolean z = layoutParams instanceof ViewGroup.MarginLayoutParams;
            if (z) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.setMarginStart((int) f);
                }
                if (z) {
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (marginLayoutParams3 != null) {
                        marginLayoutParams3.setMarginEnd((int) f);
                    }
                    if (z && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                    }
                }
            }
        } else {
            layoutParams = null;
        }
        C786410Ut5.W5(view2, layoutParams);
        return Unit.LIZ;
    }
}
