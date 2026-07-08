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

/* JADX INFO: renamed from: X.0ma3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1401730ma3 implements InterfaceC1401600mZq {
    public final Context LIZ;
    public final LayoutInflater LIZIZ;
    public View LIZJ;
    public C19419410yG LIZLLL;
    public C19419410yG LJ;

    @Override // X.InterfaceC1401600mZq
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1401600mZq
    public final InterfaceC19369110q9 LIZ(final ViewGroup viewGroup) {
        return new InterfaceC19369110q9(viewGroup) { // from class: X.0ma4
            public final ViewGroup LIZ;

            @Override // X.InterfaceC19369110q9
            public final void LIZ() {
            }

            @Override // X.InterfaceC19369110q9
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC19369110q9
            public final void LIZJ() {
            }

            @Override // X.InterfaceC19369110q9
            public final void onPageSelected() {
            }

            @Override // X.InterfaceC19369110q9
            public final void start() {
            }

            @Override // X.InterfaceC19369110q9
            public final void stop() {
            }

            {
                this.LIZ = viewGroup;
            }
        };
    }

    @Override // X.InterfaceC1401600mZq
    public final void LIZJ(RelativeLayout relativeLayout) {
        TextView textView;
        View viewFindViewById;
        TuxIconView tuxIconView;
        TextView textView2;
        View viewTd = C786410Ut5.Td(this.LIZIZ, R.layout.d37, relativeLayout, false);
        this.LIZJ = viewTd;
        View viewFindViewById2 = null;
        if (viewTd != null) {
            textView = (TextView) viewTd.findViewById(R.id.kz2);
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setText(this.LIZ.getString(2131822400));
        }
        View view = this.LIZJ;
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.kzu);
        } else {
            viewFindViewById = null;
        }
        int iLIZ = C960203pA.LIZ(R.attr.ee, this.LIZ);
        C417040GWw c417040GWw = new C417040GWw(C12ES.LIZJ(4.0f, this.LIZ), BlurMaskFilter.Blur.NORMAL, C12ES.LIZJ(2.0f, this.LIZ), C960203pA.LIZ(R.attr.oz, this.LIZ));
        if (viewFindViewById != null) {
            viewFindViewById.setBackground(new C417030GWv(iLIZ, c417040GWw));
        }
        View view2 = this.LIZJ;
        if (view2 != null && (textView2 = (TextView) view2.findViewById(R.id.vze)) != null) {
            textView2.setText(this.LIZ.getString(2131822400));
        }
        View view3 = this.LIZJ;
        if (view3 != null) {
            viewFindViewById2 = view3.findViewById(R.id.szt);
        }
        int iLIZ2 = C960203pA.LIZ(R.attr.a04, this.LIZ);
        C417040GWw c417040GWw2 = new C417040GWw(C12ES.LIZJ(4.0f, this.LIZ), BlurMaskFilter.Blur.NORMAL, C12ES.LIZJ(2.0f, this.LIZ), C960203pA.LIZ(R.attr.oz, this.LIZ));
        if (viewFindViewById2 != null) {
            viewFindViewById2.setBackground(new C417030GWv(iLIZ2, c417040GWw2));
        }
        View view4 = this.LIZJ;
        if (C302080Bsk.LIZ() && view4 != null && (tuxIconView = (TuxIconView) view4.findViewById(R.id.vzf)) != null) {
            tuxIconView.setIconRes(R.raw.icon_camera_fill);
            tuxIconView.setTintColorRes(R.attr.ee);
        }
        relativeLayout.addView(this.LIZJ);
    }

    @Override // X.InterfaceC1401600mZq
    public final void LIZLLL(RelativeLayout relativeLayout) {
        View view = this.LIZJ;
        if (view != null) {
            C786410Ut5.LJJLIIIJ(relativeLayout, view);
        }
    }

    public C1401730ma3(Context context, LayoutInflater layoutInflater) {
        this.LIZ = context;
        this.LIZIZ = layoutInflater;
    }
}
