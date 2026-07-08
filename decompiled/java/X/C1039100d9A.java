package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0d9A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1039100d9A implements InterfaceC1051330dSt {
    public final /* synthetic */ C1039050d95 LIZ;

    @Override // X.InterfaceC1051330dSt
    public final void LJIILIIL() {
    }

    @Override // X.InterfaceC1051330dSt
    public final void LJIJJLI() {
    }

    @Override // X.InterfaceC1051330dSt
    public final ViewGroup LJIJJ() {
        ViewGroup viewGroup;
        View view = this.LIZ.LLILLJJLI;
        if (view != null && (viewGroup = (ViewGroup) view.findViewById(R.id.y0b)) != null) {
            return viewGroup;
        }
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        final Context baseContext = C1161970gLL.LIZIZ().LIZJ().getBaseContext();
        return new ViewGroup(baseContext) { // from class: X.0d9F
            @Override // android.view.ViewGroup, android.view.View
            public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            }
        };
    }

    public C1039100d9A(C1039050d95 c1039050d95) {
        this.LIZ = c1039050d95;
    }

    @Override // X.InterfaceC1051330dSt
    public final View LJIILJJIL(Context context) {
        this.LIZ.LJLLLL(context);
        return this.LIZ.LLILLJJLI;
    }
}
