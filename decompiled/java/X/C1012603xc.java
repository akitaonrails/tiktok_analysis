package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.03xc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1012603xc implements InterfaceC1761370vw7 {
    public final List<String> LL;
    public View LLILLJJLI;
    public TuxTextView LLILLL;

    @Override // X.InterfaceC1761370vw7
    public final void LJFF() {
        ViewGroup viewGroup;
        View view = this.LLILLJJLI;
        ViewParent parent = view != null ? view.getParent() : null;
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
            return;
        }
        C786410Ut5.LJJJLZIJ(this.LLILLJJLI, viewGroup);
    }

    public C1012603xc(List<String> list) {
        this.LL = list;
    }

    @Override // X.InterfaceC1761370vw7
    public final void onPageSelected(int i) {
        TuxTextView tuxTextView;
        String str = (String) C13LP.LJJJLZIJ(i, this.LL);
        if (str != null && (tuxTextView = this.LLILLL) != null) {
            tuxTextView.setText(str);
        }
    }

    @Override // X.InterfaceC1761370vw7
    public final void onShow(int i) {
        View view = this.LLILLJJLI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    @Override // X.InterfaceC1761370vw7
    public final void setAlpha(float f) {
        View view = this.LLILLJJLI;
        if (view != null) {
            C786410Ut5.T4(view, f);
        }
    }

    @Override // X.InterfaceC1761370vw7
    public final void LJII(FrameLayout frameLayout, InterfaceC1763860w08 interfaceC1763860w08) {
        TuxTextView tuxTextView = null;
        View viewSd = C786410Ut5.Sd(R.layout.anh, C786410Ut5.ne(frameLayout.getContext()), null);
        this.LLILLJJLI = viewSd;
        if (viewSd != null) {
            tuxTextView = (TuxTextView) viewSd.findViewById(R.id.rsg);
        }
        this.LLILLL = tuxTextView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25));
        frameLayout.addView(this.LLILLJJLI, layoutParams);
    }
}
