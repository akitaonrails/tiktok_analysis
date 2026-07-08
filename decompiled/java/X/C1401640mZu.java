package X;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0mZu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1401640mZu implements InterfaceC1401600mZq {
    public final Context LIZ;
    public final LayoutInflater LIZIZ;
    public final int LIZJ;
    public View LIZLLL;

    @Override // X.InterfaceC1401600mZq
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1401600mZq
    public final InterfaceC19369110q9 LIZ(ViewGroup viewGroup) {
        return new C19420310yP(this.LIZ, viewGroup, false);
    }

    @Override // X.InterfaceC1401600mZq
    public final void LIZJ(RelativeLayout relativeLayout) {
        TuxIconView tuxIconView;
        TextView textView;
        View viewTd = C786410Ut5.Td(this.LIZIZ, R.layout.d36, relativeLayout, false);
        this.LIZLLL = viewTd;
        if (viewTd != null && (textView = (TextView) viewTd.findViewById(R.id.vze)) != null) {
            textView.setText(this.LIZ.getString(this.LIZJ));
        }
        LJ(this.LIZLLL);
        View view = this.LIZLLL;
        if (C302080Bsk.LIZ() && view != null && (tuxIconView = (TuxIconView) view.findViewById(R.id.vzf)) != null) {
            tuxIconView.setIconRes(R.raw.icon_camera_fill);
            tuxIconView.setTintColorRes(R.attr.ee);
        }
        relativeLayout.addView(this.LIZLLL);
    }

    @Override // X.InterfaceC1401600mZq
    public final void LIZLLL(RelativeLayout relativeLayout) {
        View view = this.LIZLLL;
        if (view != null) {
            C786410Ut5.LJJLIIIJ(relativeLayout, view);
        }
    }

    public final void LJ(View view) {
        View viewFindViewById;
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.vz7);
        } else {
            viewFindViewById = null;
        }
        int iLIZ = C960203pA.LIZ(R.attr.a04, this.LIZ);
        C417040GWw c417040GWw = new C417040GWw(C12ES.LIZJ(4.0f, this.LIZ), BlurMaskFilter.Blur.NORMAL, C12ES.LIZJ(2.0f, this.LIZ), C960203pA.LIZ(R.attr.oz, this.LIZ));
        if (viewFindViewById != null) {
            viewFindViewById.setBackground(new C417030GWv(iLIZ, c417040GWw));
        }
    }

    public C1401640mZu(Context context, LayoutInflater layoutInflater, int i) {
        this.LIZ = context;
        this.LIZIZ = layoutInflater;
        this.LIZJ = i;
    }
}
