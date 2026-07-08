package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0H8a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C436060H8a implements InterfaceC340040DUs {
    public final ConstraintLayout LL;
    public final ViewOnAttachStateChangeListenerC20604515jv LLILLJJLI;
    public final ConstraintLayout LLILLL;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public static C436060H8a LIZ(View view) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) C1616006Uk.LIZ(R.id.avt, view);
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            return new C436060H8a(constraintLayout, viewOnAttachStateChangeListenerC20604515jv, constraintLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.avt)));
    }

    public C436060H8a(ConstraintLayout constraintLayout, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, ConstraintLayout constraintLayout2) {
        this.LL = constraintLayout;
        this.LLILLJJLI = viewOnAttachStateChangeListenerC20604515jv;
        this.LLILLL = constraintLayout2;
    }
}
