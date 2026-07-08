package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0eOf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1087150eOf extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1908530zlT LL;
    public final /* synthetic */ ArrayList<ValueAnimator> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1087150eOf(C1908530zlT c1908530zlT, ArrayList<ValueAnimator> arrayList) {
        super(0);
        this.LL = c1908530zlT;
        this.LLILLJJLI = arrayList;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        LinearLayout linearLayout = this.LL.LLILZ;
        if (linearLayout != null) {
            int childCount = linearLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = linearLayout.getChildAt(i);
                if (childAt != null) {
                    C786410Ut5.T4(childAt, 0.0f);
                    C786410Ut5.Jc(childAt, -((int) C497740JfY.LIZIZ(20.0f)));
                }
            }
            if (linearLayout.getChildCount() > 0) {
                C500260Jjc.LLFFF(linearLayout);
            }
        }
        ValueAnimator valueAnimator = (ValueAnimator) C13LP.LJJJLZIJ(0, this.LLILLJJLI);
        if (valueAnimator != null) {
            valueAnimator.start();
        }
        return Unit.LIZ;
    }
}
