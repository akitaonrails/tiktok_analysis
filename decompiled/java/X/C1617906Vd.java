package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.06Vd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1617906Vd implements InterfaceC340040DUs {
    public final FrameLayout LL;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public C1617906Vd(FrameLayout frameLayout) {
        this.LL = frameLayout;
    }

    public static C1617906Vd LIZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.afi, viewGroup, false);
        viewGroup.addView(viewTd);
        if (C1616006Uk.LIZ(R.id.ltf, viewTd) != null) {
            return new C1617906Vd((FrameLayout) viewTd);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(R.id.ltf)));
    }
}
