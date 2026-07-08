package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0fEz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1119590fEz extends C1119660fF6 {
    public boolean LJJIIJ;

    @Override // X.C1119660fF6
    public final boolean LIZLLL() {
        return this.LJJIIJ;
    }

    public C1119590fEz(C785220UrA c785220UrA) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        super(c785220UrA);
        if (this.LIZ != null && this.LJIILIIL != null && !TextUtils.isEmpty(this.LJIILJJIL)) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LIZ), R.layout.h5r, null, false);
            LiveIconView liveIconView = (LiveIconView) viewTd.findViewById(R.id.jxe);
            TextView textView = (TextView) viewTd.findViewById(R.id.text);
            LiveIconView liveIconView2 = (LiveIconView) viewTd.findViewById(R.id.b8t);
            if (this.LJIILIIL.LIZ() == EnumC1119730fFD.ATTR) {
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                liveIconView.setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
                ViewGroup.LayoutParams layoutParams = liveIconView.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = null;
                }
                if (marginLayoutParams != null) {
                    marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-4)));
                }
                ViewGroup.LayoutParams layoutParams2 = liveIconView.getLayoutParams();
                if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    marginLayoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-4)));
                }
            }
            this.LJIILIIL.LIZIZ(new C1119650fF5(this, liveIconView));
            textView.setText(this.LJIILJJIL);
            if (this.LJJI) {
                C786410Ut5.LLJJIJIL(liveIconView2, 0);
                if (this.LJ == null) {
                    C011Z.LIZ.getClass();
                }
            }
            if (this.LJJII) {
                textView.setTextColor(C20736316Cj.LIZIZ(R.attr.ezq, C1834150xpV.LJIIIIZZ(this.LIZ)));
                liveIconView2.setIconTint(C20736316Cj.LIZIZ(R.attr.ezq, C1834150xpV.LJIIIIZZ(this.LIZ)));
            }
            this.LIZJ = viewTd;
        }
    }
}
