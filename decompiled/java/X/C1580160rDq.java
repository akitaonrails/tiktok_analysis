package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0rDq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final /* synthetic */ class C1580160rDq extends C2217421BqW implements Function1<View, Unit> {
    public C1580160rDq(C1581500rG0 c1581500rG0) {
        super(1, c1581500rG0, C1581500rG0.class, "onDelegateClick", "onDelegateClick(Landroid/view/View;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        C1580150rDp c1580150rDp = ((C1581500rG0) this.receiver).LL;
        if (c1580150rDp != null) {
            String tag = c1580150rDp.LIZ.getTag();
            if (tag == null) {
                tag = "";
            }
            C1571180qzM.LIZ(c1580150rDp.LIZIZ, tag);
        }
        return Unit.LIZ;
    }
}
