package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0K2e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C510980K2e extends C0K3V {
    public final View LL;
    public final ViewGroup LLILLJJLI;

    public C510980K2e(View view) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = (ViewGroup) view.findViewById(R.id.nlo);
    }

    @Override // X.C0K3V
    public final void I5(AbstractC511160K2w abstractC511160K2w, InterfaceC2753014t interfaceC2753014t) {
        int i = (int) (36 * this.LL.getContext().getResources().getDisplayMetrics().density);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        C1390410mHn c1390410mHn = new C1390410mHn(this.LL.getContext(), null, 6);
        C786410Ut5.V6(c1390410mHn, layoutParams);
        c1390410mHn.LIZJ();
        this.LLILLJJLI.addView(c1390410mHn, layoutParams);
    }
}
