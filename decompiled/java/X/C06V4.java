package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.06V4, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06V4 implements InterfaceC340040DUs {
    public final FrameLayout LL;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public C06V4(FrameLayout frameLayout) {
        this.LL = frameLayout;
    }

    public static C06V4 LIZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fec, viewGroup, false);
        if (C1616006Uk.LIZ(R.id.tv_tips, viewTd) != null) {
            return new C06V4((FrameLayout) viewTd);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(R.id.tv_tips)));
    }
}
