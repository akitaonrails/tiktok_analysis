package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0H7D, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H7D implements InterfaceC340040DUs {
    public final ConstraintLayout LL;
    public final TuxTextView LLILLJJLI;
    public final ViewOnAttachStateChangeListenerC20604515jv LLILLL;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public static C0H7D LIZ(View view) {
        int i = R.id.ccc;
        TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.ccc, view);
        if (tuxTextView != null) {
            i = R.id.cfp;
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) C1616006Uk.LIZ(R.id.cfp, view);
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                return new C0H7D((ConstraintLayout) view, tuxTextView, viewOnAttachStateChangeListenerC20604515jv);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public C0H7D(ConstraintLayout constraintLayout, TuxTextView tuxTextView, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        this.LL = constraintLayout;
        this.LLILLJJLI = tuxTextView;
        this.LLILLL = viewOnAttachStateChangeListenerC20604515jv;
    }
}
