package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hh7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1213910hh7 extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ C2248671Czp LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1213910hh7(C2248671Czp c2248671Czp) {
        super(1);
        this.LL = c2248671Czp;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View view2 = view;
        if (view2 != null) {
            C2248671Czp c2248671Czp = this.LL;
            C1213920hh8 c1213920hh8 = c2248671Czp.LLIZ;
            if (c1213920hh8 != null) {
                c1213920hh8.setDuration(c2248671Czp.LLJJIJIIJIL);
            }
            if (this.LL.LJIILL()) {
                C426750GoL.LJIIIZ(view2, null, null, null, Integer.valueOf(this.LL.LJIJ()), false, 23);
            } else {
                C426750GoL.LJIIIZ(view2, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(148))), false, 23);
            }
        }
        return Unit.LIZ;
    }
}
