package X;

import android.text.Layout;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0H2n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C434630H2n {
    public static String LIZIZ(TuxTextView tuxTextView) {
        Layout layout;
        int lineVisibleEnd;
        CharSequence text = tuxTextView.getText();
        if (text != null) {
            int i = 0;
            if (text.length() > 0 && (layout = tuxTextView.getLayout()) != null) {
                StringBuilder sb = new StringBuilder();
                int lineCount = layout.getLineCount();
                while (i < lineCount) {
                    int lineStart = layout.getLineStart(i);
                    int i2 = i + 1;
                    if (i2 == layout.getLineCount()) {
                        lineVisibleEnd = layout.getLineVisibleEnd(i) - layout.getEllipsisCount(i);
                    } else {
                        lineVisibleEnd = layout.getLineVisibleEnd(i);
                    }
                    sb.append(text.subSequence(lineStart, lineVisibleEnd));
                    i = i2;
                }
                return sb.toString();
            }
            return "";
        }
        return "";
    }

    public static final Object LIZ(View view, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        C786410Ut5.x3(view.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC462880IDe(view, c23260099m, 9));
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }
}
