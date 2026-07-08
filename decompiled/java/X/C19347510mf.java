package X;

import android.view.View;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10mf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19347510mf extends C09AY implements Function0<Unit> {
    public final /* synthetic */ TextView LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C19578211im LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19347510mf(TextView textView, int i, int i2, C19578211im c19578211im) {
        super(0);
        this.LL = textView;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = c19578211im;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        TextView textView;
        C430400GuE.LIZ(this.LL, this.LLILLJJLI);
        if (this.LLILLL == 3 && (textView = this.LLILZ.LLIZLLLIL) != null && textView.getVisibility() == 0) {
            C430400GuE.LIZ(textView, this.LLILLJJLI);
        }
        Object parent = this.LL.getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            while (view != null && view != this.LLILZ) {
                view.requestLayout();
                Object parent2 = view.getParent();
                if (!(parent2 instanceof View)) {
                    break;
                }
                view = (View) parent2;
            }
        }
        this.LLILZ.requestLayout();
        return Unit.LIZ;
    }
}
