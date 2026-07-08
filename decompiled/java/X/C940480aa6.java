package X;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aa6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C940480aa6 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ C940470aa5 LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C940480aa6(View view, C940470aa5 c940470aa5, int i, int i2) {
        super(0);
        this.LL = view;
        this.LLILLJJLI = c940470aa5;
        this.LLILLL = i;
        this.LLILZ = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        View view;
        View view2 = this.LL;
        if ((view2 instanceof InterfaceC463820IGu) && (view2 instanceof InterfaceC464060IHs)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("textureView ");
            sbLIZ.append(this.LL);
            sbLIZ.append(' ');
            sbLIZ.append(this.LLILLL);
            sbLIZ.append(' ');
            sbLIZ.append(this.LLILZ);
            C940470aa5.LJFF(C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC937900aVw interfaceC937900aVw = this.LLILLJJLI.LLIZ;
            if (interfaceC937900aVw != null) {
                interfaceC937900aVw.LJLJL(this.LL);
            }
            C940470aa5 c940470aa5 = this.LLILLJJLI;
            View view3 = this.LL;
            c940470aa5.LLJ = (InterfaceC464060IHs) view3;
            ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
            C940470aa5 c940470aa52 = this.LLILLJJLI;
            c940470aa52.LLJI = layoutParams;
            c940470aa52.LLJJIII = this.LLILZ;
            c940470aa52.LLJJIJI = this.LLILLL;
            C940490aa7 c940490aa7 = c940470aa52.LLILZLL;
            if (c940490aa7 != null && C933980aPc.LJIIIZ(c940490aa7.LJIILJJIL)) {
                Object obj = this.LLILLJJLI.LLJ;
                if ((obj instanceof View) && (view = (View) obj) != null) {
                    C786410Ut5.Jc(view, C497740JfY.LJIIZILJ() + 1);
                }
            }
        }
        return Unit.LIZ;
    }
}
