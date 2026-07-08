package X;

import android.text.Layout;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.01Df, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC297301Df implements Runnable {
    public final /* synthetic */ View LL;
    public final /* synthetic */ TuxTextView LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    public RunnableC297301Df(View view, TuxTextView tuxTextView, String str) {
        this.LL = view;
        this.LLILLJJLI = tuxTextView;
        this.LLILLL = str;
    }

    public final void LIZ() {
        Layout layout = this.LLILLJJLI.getLayout();
        if (layout == null || layout.getLineCount() != 2 || layout.getEllipsisCount(1) <= 0) {
            return;
        }
        int lineEnd = (layout.getLineEnd(1) - layout.getEllipsisCount(1)) - 1;
        int length = this.LLILLL.length();
        if (lineEnd > length) {
            lineEnd = length;
        }
        String strSubstring = this.LLILLL.substring(0, lineEnd);
        TuxTextView tuxTextView = this.LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strSubstring);
        sbLIZ.append("...");
        tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("UIExtKt@3471.setUpName$$inlined$doOnPreDraw$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UIExtKt@3471.setUpName$$inlined$doOnPreDraw$1");
    }
}
