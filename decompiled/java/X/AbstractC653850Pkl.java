package X;

import Y.ACListenerS145S0100000_10;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.zhiliaoapp.musically.R;
import u4.q0;

/* JADX INFO: renamed from: X.0Pkl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC653850Pkl<T> {
    public final Context LL;
    public final View LLILLJJLI;
    public TextView LLILLL;
    public ViewGroup LLILZ;
    public View LLILZIL;
    public TuxTextView LLILZLL;
    public RadiusLayout LLIZ;
    public SmartImageView LLIZLLLIL;
    public TuxTextView LLJ;
    public C430890Gv1 LLJI;
    public LinearLayout LLJIJIL;
    public C653660PkS LLJILJIL;
    public View LLJILJILJ;
    public View LLJILLL;
    public final InterfaceC653880Pko LLJJ;

    public final void LIZ(boolean z) {
        if (z) {
            View view = this.LLJILJILJ;
            if (view != null) {
                C786410Ut5.I7(new ACListenerS145S0100000_10((AbstractC653850Pkl) this, 71), view);
            }
            C786410Ut5.LJLZ(0, this.LLILZ);
            return;
        }
        View view2 = this.LLJILJILJ;
        if (view2 != null) {
            C786410Ut5.I7(null, view2);
        }
        C786410Ut5.LJLZ(8, this.LLILZ);
    }

    public AbstractC653850Pkl(View view, Context context, C653860Pkm c653860Pkm) {
        View view2;
        this.LLILLJJLI = view;
        this.LL = context;
        this.LLJJ = c653860Pkm;
        this.LLILLL = (TextView) view.findViewById(R.id.uca);
        this.LLJIJIL = (LinearLayout) view.findViewById(R.id.uc9);
        this.LLILZ = (ViewGroup) view.findViewById(R.id.ucc);
        this.LLILZIL = view.findViewById(R.id.uft);
        this.LLILZLL = (TuxTextView) view.findViewById(R.id.ufv);
        this.LLIZ = (RadiusLayout) view.findViewById(R.id.ufx);
        this.LLIZLLLIL = (SmartImageView) view.findViewById(R.id.ufw);
        this.LLJ = (TuxTextView) view.findViewById(R.id.ufz);
        this.LLJI = (C430890Gv1) view.findViewById(R.id.ufy);
        int iLJFF = C1913107eT.LJFF();
        if (iLJFF > 0) {
            double d = iLJFF;
            C1591860rWi.LJFF(C11VU.LIZJ(d, context), this.LLILLL);
            C0HXV.LIZIZ(C11VU.LIZJ(d, context), this.LLILZ);
        }
        C786410Ut5.K7(this.LLILZ, new ACListenerS145S0100000_10((AbstractC653850Pkl) this, 31));
        View viewFindViewById = view.findViewById(R.id.ohi);
        this.LLJILJILJ = viewFindViewById;
        if (viewFindViewById != null) {
            final String strLJI = C20642515q3.LJI(2131847251);
            q0.LJIJ(this.LLJILJILJ, new C20094213jo() { // from class: X.0Pzr
                @Override // X.C20094213jo
                public final void onInitializeAccessibilityNodeInfo(View view3, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfo(view3, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.addAction(new C20092413jW(16, strLJI));
                    accessibilityNodeInfoCompat.setHeading(true);
                }
            });
        }
        this.LLJILLL = view.findViewById(R.id.jhz);
        if (C650240Pew.LIZ() && (view2 = this.LLJILLL) != null) {
            C648880Pck.LIZIZ(view2);
            ViewGroup.LayoutParams layoutParams = this.LLJILLL.getLayoutParams();
            C650240Pew.LIZ.getClass();
            layoutParams.height = C650240Pew.LIZJ;
            C786410Ut5.W5(this.LLJILLL, layoutParams);
        }
        C427690Gpr.LJI(this.LLILZ, null);
    }
}
