package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0Gqw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C428360Gqw implements InterfaceC428370Gqx {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Gqv] */
    @Override // X.InterfaceC428370Gqx
    public final C428350Gqv LIZ() {
        return new InterfaceC428400Gr0() { // from class: X.0Gqv
            public WeakReference<View> LIZ;

            @Override // X.InterfaceC428400Gr0
            public final void LJJJJL() {
                View view;
                View view2;
                C1295960jpS c1295960jpS;
                View view3;
                C1706630uVp.LIZ("AME-editor", "-- loadingview stopLoading");
                WeakReference<View> weakReference = this.LIZ;
                if (weakReference != null && (view3 = weakReference.get()) != null) {
                    view3.setClickable(false);
                }
                WeakReference<View> weakReference2 = this.LIZ;
                if (weakReference2 != null && (view2 = weakReference2.get()) != null && (c1295960jpS = (C1295960jpS) view2.findViewById(R.id.du9)) != null) {
                    c1295960jpS.cancelAnimation();
                }
                WeakReference<View> weakReference3 = this.LIZ;
                if (weakReference3 == null || (view = weakReference3.get()) == null) {
                    return;
                }
                C786410Ut5.LJLLLLLL(8, view);
            }

            @Override // X.InterfaceC428400Gr0
            public final void LJLJLJ() {
                View view;
                C1706630uVp.LIZ("AME-editor", "-- loadingview startLoading");
                WeakReference<View> weakReference = this.LIZ;
                if (weakReference == null || (view = weakReference.get()) == null) {
                    return;
                }
                C0H0N.LJIILJJIL(view);
                C1295960jpS c1295960jpS = (C1295960jpS) view.findViewById(R.id.du9);
                if (c1295960jpS == null || c1295960jpS.isAnimating()) {
                    return;
                }
                c1295960jpS.playAnimation();
            }

            @Override // X.InterfaceC428400Gr0
            public final void LIZIZ(String str) {
                TextView textView;
                View view;
                WeakReference<View> weakReference = this.LIZ;
                if (weakReference != null && (view = weakReference.get()) != null) {
                    textView = (TextView) view.findViewById(R.id.du7);
                } else {
                    textView = null;
                }
                if (str.length() == 0) {
                    if (textView != null) {
                        C786410Ut5.LLIL(textView, 8);
                    }
                } else {
                    if (textView == null) {
                        return;
                    }
                    C786410Ut5.LLIL(textView, 0);
                    textView.setText(str);
                }
            }

            @Override // X.InterfaceC428400Gr0
            public final View LIZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                View viewTd = C786410Ut5.Td(layoutInflater, R.layout.afd, viewGroup, false);
                viewGroup.addView(viewTd);
                this.LIZ = new WeakReference<>(viewTd);
                LJJJJL();
                return viewTd;
            }
        };
    }
}
