package X;

import Y.ACListenerS163S0100000_29;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.128M, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C128M extends AbstractC1664490tPr<C128Q, C128R> {
    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C0HZQ c0hzq = (C0HZQ) view.findViewById(R.id.dq2);
        if (c0hzq != null) {
            C786410Ut5.b9(c0hzq, new ACListenerS163S0100000_29(this, 2));
        }
        if (C293810BfP.LIZ()) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.nat);
            if (linearLayout != null) {
                C786410Ut5.R7(linearLayout, new ACListenerS163S0100000_29(this, 3));
            }
            View viewFindViewById = view.findViewById(R.id.nat);
            if (viewFindViewById != null) {
                ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
                    C786410Ut5.W5(viewFindViewById, layoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            View viewFindViewById2 = view.findViewById(R.id.nat);
            if (viewFindViewById2 != null) {
                C426750GoL.LJIIL(viewFindViewById2, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))), 21);
            }
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.128P
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C128Q) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(view, 10));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.128O
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C128Q) obj).LIZJ);
            }
        }, Lifecycle.State.STARTED, new AwS591S0100000_12(view, 35));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.128N
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C128Q) obj).LIZIZ);
            }
        }, Lifecycle.State.STARTED, new AwS591S0100000_12(view, 36));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fam, viewGroup, false);
        if (C293810BfP.LIZ()) {
            ((ViewGroup.MarginLayoutParams) viewTd.getLayoutParams()).height = -2;
        }
        View viewFindViewById = viewTd.findViewById(R.id.nat);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(99)));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a01);
        viewFindViewById.setBackground(c384050F3z.LIZ(new C1361400lX0(requireSceneContext(), R.style.xm)));
        return (ViewGroup) viewTd;
    }
}
