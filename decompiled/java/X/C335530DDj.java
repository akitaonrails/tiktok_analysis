package X;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DDj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C335530DDj implements InterfaceC340040DUs {
    public final LinearLayout LL;
    public final LinearLayout LLILLJJLI;
    public final C20512315Of LLILLL;
    public final TuxTextView LLILZ;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public static C335530DDj LIZ(View view) {
        int i = R.id.naf;
        LinearLayout linearLayout = (LinearLayout) C1616006Uk.LIZ(R.id.naf, view);
        if (linearLayout != null) {
            i = R.id.tuf;
            C20512315Of c20512315Of = (C20512315Of) C1616006Uk.LIZ(R.id.tuf, view);
            if (c20512315Of != null) {
                i = R.id.z7s;
                TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.z7s, view);
                if (tuxTextView != null) {
                    return new C335530DDj((LinearLayout) view, linearLayout, c20512315Of, tuxTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public C335530DDj(LinearLayout linearLayout, LinearLayout linearLayout2, C20512315Of c20512315Of, TuxTextView tuxTextView) {
        this.LL = linearLayout;
        this.LLILLJJLI = linearLayout2;
        this.LLILLL = c20512315Of;
        this.LLILZ = tuxTextView;
    }
}
