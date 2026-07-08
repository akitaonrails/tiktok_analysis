package X;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DW2, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DW2 extends C09AY implements Function0<Integer> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ TextView LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ TextView LLILZIL;
    public final /* synthetic */ InterfaceC1631630sYr<Integer, Integer, Integer, Integer, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0DW2(boolean z, TextView textView, int i, int i2, TextView textView2, InterfaceC1631630sYr<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> interfaceC1631630sYr) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = textView;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = textView2;
        this.LLILZLL = interfaceC1631630sYr;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Integer invoke() {
        int i;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!this.LL) {
            ((View) this.LLILLJJLI.getParent()).measure(0, 0);
        }
        int measuredWidth = ((View) this.LLILLJJLI.getParent()).getMeasuredWidth() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13));
        int iMin = this.LLILLL;
        int i2 = this.LLILZ;
        if (i2 + iMin > measuredWidth) {
            int i3 = measuredWidth / 2;
            TextView textView = (i2 > i3 || i3 >= iMin) ? this.LLILZIL : this.LLILLJJLI;
            iMin = Math.min(Intrinsics.LJFF(textView, this.LLILLJJLI) ? this.LLILZ : this.LLILLL, i3);
            if (this.LL && iMin >= 0) {
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                layoutParams.width = iMin;
                C786410Ut5.g6(textView, layoutParams);
            }
            TextView textView2 = Intrinsics.LJFF(textView, this.LLILLJJLI) ? this.LLILZIL : this.LLILLJJLI;
            if (this.LL && (i = measuredWidth - iMin) >= 0) {
                ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
                layoutParams2.width = i;
                C786410Ut5.g6(textView2, layoutParams2);
            }
            if (Intrinsics.LJFF(textView, this.LLILZIL)) {
                i2 = measuredWidth - iMin;
            } else {
                i2 = iMin;
                iMin = measuredWidth - iMin;
            }
        }
        InterfaceC1631630sYr<Integer, Integer, Integer, Integer, Unit> interfaceC1631630sYr = this.LLILZLL;
        if (interfaceC1631630sYr != null) {
            interfaceC1631630sYr.invoke(Integer.valueOf(this.LLILLL), Integer.valueOf(this.LLILZ), Integer.valueOf(iMin), Integer.valueOf(i2));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("calculate anchor text size cost time = ");
        sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
        return Integer.valueOf(Log.d("AnchorSubTextLayout", C2188811AlT.LIZIZ(sbLIZ)));
    }
}
