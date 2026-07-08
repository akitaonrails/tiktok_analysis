package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DQe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C338860DQe extends C09AY implements Function0<Unit> {
    public final /* synthetic */ TextView LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ TextView LLILZLL;
    public final /* synthetic */ InterfaceC1631630sYr<Integer, Integer, Integer, Integer, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C338860DQe(TextView textView, int i, View view, int i2, int i3, TextView textView2, InterfaceC1631630sYr<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> interfaceC1631630sYr) {
        super(0);
        this.LL = textView;
        this.LLILLJJLI = i;
        this.LLILLL = view;
        this.LLILZ = i2;
        this.LLILZIL = i3;
        this.LLILZLL = textView2;
        this.LLIZ = interfaceC1631630sYr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int width = ((View) this.LL.getParent()).getWidth() - this.LLILLJJLI;
        ViewGroup.LayoutParams layoutParams = this.LLILLL.getLayoutParams();
        int marginStart = width - (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
        ViewGroup.LayoutParams layoutParams2 = this.LLILLL.getLayoutParams();
        int marginEnd = marginStart - (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0);
        int i = this.LLILZ;
        int iMin = this.LLILZIL;
        if (iMin + i > marginEnd && marginEnd > 0) {
            int i2 = marginEnd / 2;
            TextView textView = (iMin > i2 || i2 >= i) ? this.LLILZLL : this.LL;
            iMin = Math.min(Intrinsics.LJFF(textView, this.LL) ? this.LLILZIL : this.LLILZ, i2);
            ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
            layoutParams3.width = iMin;
            C786410Ut5.W5(textView, layoutParams3);
            TextView textView2 = Intrinsics.LJFF(textView, this.LL) ? this.LLILZLL : this.LL;
            int i3 = marginEnd - iMin;
            ViewGroup.LayoutParams layoutParams4 = textView2.getLayoutParams();
            layoutParams4.width = i3;
            C786410Ut5.W5(textView2, layoutParams4);
            if (Intrinsics.LJFF(textView, this.LLILZLL)) {
                i = iMin;
                iMin = i3;
            } else {
                i = i3;
            }
        }
        InterfaceC1631630sYr<Integer, Integer, Integer, Integer, Unit> interfaceC1631630sYr = this.LLIZ;
        if (interfaceC1631630sYr == null) {
            return null;
        }
        interfaceC1631630sYr.invoke(Integer.valueOf(this.LLILZ), Integer.valueOf(this.LLILZIL), Integer.valueOf(i), Integer.valueOf(iMin));
        return Unit.LIZ;
    }
}
