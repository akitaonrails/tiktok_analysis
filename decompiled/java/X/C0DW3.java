package X;

import Y.ARunnableS104S0100000_4;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0DW3, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DW3 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, TextView textView, CharSequence charSequence, TextView textView2, boolean z, InterfaceC1631630sYr interfaceC1631630sYr) {
        if (textView != null && textView2 != null) {
            textView.setText(str);
            if (charSequence != null && charSequence.length() != 0) {
                textView2.setText(charSequence);
                C786410Ut5.LLIL(textView2, 0);
                textView2.measure(0, 0);
                textView.measure(0, 0);
                C0DW2 c0dw2 = new C0DW2(z, textView2, textView.getMeasuredWidth(), textView2.getMeasuredWidth(), textView, interfaceC1631630sYr);
                if (z) {
                    HandlerHook.viewPost(textView2, new ARunnableS104S0100000_4((Object) c0dw2, 79));
                    return;
                } else {
                    c0dw2.invoke();
                    return;
                }
            }
            textView.measure(0, 0);
            int measuredWidth = textView.getMeasuredWidth();
            if (interfaceC1631630sYr == null) {
                return;
            }
            interfaceC1631630sYr.invoke(Integer.valueOf(measuredWidth), 0, Integer.valueOf(measuredWidth), 0);
        }
    }
}
