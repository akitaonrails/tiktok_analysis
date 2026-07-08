package X;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0JnM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C502580JnM extends C502700JnY {
    public final View LL;
    public final ViewGroup LLILLJJLI;

    public C502580JnM(View view) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = (ViewGroup) view.findViewById(R.id.nlo);
    }

    @Override // X.C502700JnY
    public final void I5(AbstractC503810JpL abstractC503810JpL, InterfaceC2753014t interfaceC2753014t) {
        this.LLILLJJLI.addView(new C16FZ(this.LL.getContext(), null));
    }
}
