package X;

import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0hUd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1206170hUd implements InterfaceC340040DUs {
    public final C1091800eWA LL;
    public final TuxTextView LLILLJJLI;
    public final TuxTextView LLILLL;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public static C1206170hUd LIZ(View view) {
        int i = R.id.hxu;
        TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.hxu, view);
        if (tuxTextView != null) {
            i = R.id.hxv;
            TuxTextView tuxTextView2 = (TuxTextView) C1616006Uk.LIZ(R.id.hxv, view);
            if (tuxTextView2 != null) {
                return new C1206170hUd((C1091800eWA) view, tuxTextView, tuxTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public C1206170hUd(C1091800eWA c1091800eWA, TuxTextView tuxTextView, TuxTextView tuxTextView2) {
        this.LL = c1091800eWA;
        this.LLILLJJLI = tuxTextView;
        this.LLILLL = tuxTextView2;
    }
}
