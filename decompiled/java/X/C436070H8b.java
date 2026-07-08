package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0H8b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C436070H8b implements InterfaceC340040DUs {
    public final ConstraintLayout LL;
    public final C1749280vcc LLILLJJLI;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public static C436070H8b LIZ(View view) {
        C1749280vcc c1749280vcc = (C1749280vcc) C1616006Uk.LIZ(R.id.w28, view);
        if (c1749280vcc != null) {
            return new C436070H8b((ConstraintLayout) view, c1749280vcc);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.w28)));
    }

    public C436070H8b(ConstraintLayout constraintLayout, C1749280vcc c1749280vcc) {
        this.LL = constraintLayout;
        this.LLILLJJLI = c1749280vcc;
    }
}
