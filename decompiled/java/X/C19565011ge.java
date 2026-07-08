package X;

import Y.ACListenerS163S0100000_29;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: renamed from: X.11ge, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19565011ge extends AbstractC1664490tPr<C07WH, C19565211gg> {
    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        int i2;
        super.onViewCreated(view, bundle);
        boolean zLIZ = C357780E0y.LIZ();
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.title);
        int i3 = 8;
        if (tuxTextView != null) {
            if (zLIZ) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            C786410Ut5.LLLLZLL(tuxTextView, i2);
            tuxTextView.setText(view.getContext().getString(2131828372));
        }
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.e1v);
        if (frameLayout != null) {
            if (zLIZ) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LJZ(i, frameLayout);
            C786410Ut5.O7(frameLayout, new ACListenerS163S0100000_29(this, 155));
        }
        FrameLayout frameLayout2 = (FrameLayout) view.findViewById(R.id.pp_);
        if (frameLayout2 != null) {
            if (zLIZ) {
                i3 = 0;
            }
            C786410Ut5.LJZ(i3, frameLayout2);
            C0EG9.LIZ(frameLayout2, new AwS573S0100000_29(this, 731));
        }
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.e05);
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS163S0100000_29(this, 156));
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.11gf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C07WH) obj).LIZ);
            }
        }, Lifecycle.State.STARTED, new AwS598S0100000_19(view, 287));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setTheme(R.style.y0);
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c05, viewGroup, false);
    }
}
