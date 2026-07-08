package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0h8g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1192560h8g implements InterfaceC340040DUs {
    public final LinearLayout LL;
    public final FrameLayout LLILLJJLI;
    public final TuxTextView LLILLL;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public static C1192560h8g LIZ(View view) {
        int i = R.id.ccd;
        FrameLayout frameLayout = (FrameLayout) C1616006Uk.LIZ(R.id.ccd, view);
        if (frameLayout != null) {
            i = R.id.fw7;
            TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.fw7, view);
            if (tuxTextView != null) {
                return new C1192560h8g((LinearLayout) view, frameLayout, tuxTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public C1192560h8g(LinearLayout linearLayout, FrameLayout frameLayout, TuxTextView tuxTextView) {
        this.LL = linearLayout;
        this.LLILLJJLI = frameLayout;
        this.LLILLL = tuxTextView;
    }
}
