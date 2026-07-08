package X;

import Y.ACListenerS140S0100000_5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.scene.Scene;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Euv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C379870Euv extends Scene {
    public final int LLJI;
    public final Function0<Unit> LLJIJIL;

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
    }

    public C379870Euv(int i, AwS549S0100000_5 awS549S0100000_5) {
        this.LLJI = i;
        this.LLJIJIL = awS549S0100000_5;
        disableSceneRestore();
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        TuxIconView tuxIconView;
        TextView textView;
        int iIntValue;
        Integer numLIZJ;
        super.onViewCreated(view, bundle);
        View view2 = this.mView;
        if (view2 != null && (textView = (TextView) view2.findViewById(R.id.gus)) != null) {
            textView.setText(textView.getContext().getString(2131820555));
            Context context = textView.getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.za, context)) != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = -16777216;
            }
            textView.setShadowLayer(2.0f, 0.0f, 2.0f, iIntValue);
        }
        View view3 = this.mView;
        if (view3 != null && (tuxIconView = (TuxIconView) view3.findViewById(R.id.gur)) != null) {
            Context context2 = tuxIconView.getContext();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C0EGK.LIZ(20);
            c419910GdJ.LIZJ = C0EGK.LIZ(20);
            c419910GdJ.LIZ = R.raw.icon_x_mark_small;
            c419910GdJ.LJ = Integer.valueOf(R.attr.eg);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context2);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C0EGK.LIZ(28);
            c384050F3z.LJI = C0EGK.LIZ(28);
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.e4);
            c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
            tuxIconView.setImageDrawable(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context2)));
            C786410Ut5.a9(tuxIconView, new ACListenerS140S0100000_5(this, 123));
        }
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewSd = C786410Ut5.Sd(R.layout.bz7, layoutInflater, null);
        ViewGroup.LayoutParams layoutParams = viewSd.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = C390810FTz.LIZIZ(viewGroup.getContext()).y;
        }
        View viewFindViewById = viewSd.findViewById(R.id.ap6);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        C426750GoL.LJIIIZ(viewSd.findViewById(R.id.ap7), null, null, null, Integer.valueOf(this.LLJI), false, 23);
        return viewSd;
    }
}
