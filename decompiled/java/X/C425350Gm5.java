package X;

import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gm5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425350Gm5 implements InterfaceC340040DUs {
    public final LinearLayout LL;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public C425350Gm5(LinearLayout linearLayout) {
        this.LL = linearLayout;
    }

    public static C425350Gm5 LIZ(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.r6o;
        if (C1616006Uk.LIZ(R.id.r6o, view) != null) {
            i = R.id.r6p;
            if (C1616006Uk.LIZ(R.id.r6p, view) != null) {
                return new C425350Gm5(linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
