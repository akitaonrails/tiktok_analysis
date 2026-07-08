package X;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aZU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C940100aZU extends C09AY implements Function0<Unit> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ C940030aZN LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C940100aZU(View view, C940030aZN c940030aZN, int i, int i2) {
        super(0);
        this.LL = view;
        this.LLILLJJLI = c940030aZN;
        this.LLILLL = i;
        this.LLILZ = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        View view = this.LL;
        if ((view instanceof InterfaceC463820IGu) && (view instanceof InterfaceC464060IHs)) {
            this.LLILLJJLI.LLJILJILJ = (InterfaceC464060IHs) view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C940030aZN c940030aZN = this.LLILLJJLI;
            c940030aZN.LLJILLL = layoutParams;
            c940030aZN.LLJJ = this.LLILLL;
            c940030aZN.LLJJI = this.LLILZ;
            C940490aa7 c940490aa7 = c940030aZN.LL;
            if (c940490aa7 != null && C933980aPc.LJIIIZ(c940490aa7.LJIILJJIL)) {
                View view2 = this.LL;
                if ((view2 instanceof View) && view2 != null) {
                    C786410Ut5.Jc(view2, C497740JfY.LJIIZILJ() + 1);
                }
            }
        }
        return Unit.LIZ;
    }
}
