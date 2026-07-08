package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0zuO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1914060zuO extends FrameLayout {
    public final C1914070zuP LL;
    public String LLILLJJLI;

    public final String getSwitchId$pns_universal_popup_release() {
        String str = this.LLILLJJLI;
        if (str == null) {
            return null;
        }
        return str;
    }

    public C1914060zuO(Context context) {
        super(context, null, 0);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.i63, this, false);
        addView(viewTd);
        int i = R.id.wu2;
        TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.wu2, viewTd);
        if (tuxTextView != null) {
            i = R.id.wui;
            TuxTextView tuxTextView2 = (TuxTextView) C1616006Uk.LIZ(R.id.wui, viewTd);
            if (tuxTextView2 != null) {
                i = R.id.wva;
                C21411818qq c21411818qq = (C21411818qq) C1616006Uk.LIZ(R.id.wva, viewTd);
                if (c21411818qq != null) {
                    this.LL = new C1914070zuP((ConstraintLayout) viewTd, tuxTextView, tuxTextView2, c21411818qq);
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i)));
    }
}
