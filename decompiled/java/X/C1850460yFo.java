package X;

import Y.ACListenerS129S0200000_27;
import android.app.Activity;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
import com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0yFo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1850460yFo extends C09AY implements Function1<FrameLayout, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ BaseTaskEventTimerPendantManager LLILLL;
    public final /* synthetic */ C259800zU<C1389910mGz> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1850460yFo(int i, String str, BaseTaskEventTimerPendantManager baseTaskEventTimerPendantManager, C259800zU<C1389910mGz> c259800zU) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = baseTaskEventTimerPendantManager;
        this.LLILZ = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FrameLayout frameLayout) {
        Activity activityLJIILL;
        FrameLayout frameLayout2 = frameLayout;
        int iIntValue = 0;
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
        if (abstractC1896090zRP != null && (activityLJIILL = abstractC1896090zRP.LJIILL()) != null) {
            TuxTextView tuxTextView = new TuxTextView(activityLJIILL, null, 6, 0);
            int i = this.LL;
            String str = this.LLILLJJLI;
            BaseTaskEventTimerPendantManager baseTaskEventTimerPendantManager = this.LLILLL;
            C259800zU<C1389910mGz> c259800zU = this.LLILZ;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, new ContextThemeWrapper(activityLJIILL, i));
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            }
            tuxTextView.setTextColor(iIntValue);
            tuxTextView.setText(str);
            tuxTextView.setTuxFont(42);
            C786410Ut5.h9(tuxTextView, new ACListenerS129S0200000_27(c259800zU, baseTaskEventTimerPendantManager, 28));
            frameLayout2.addView(tuxTextView);
        }
        return Unit.LIZ;
    }
}
