package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Collections;

/* JADX INFO: renamed from: X.0cEV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1003970cEV {
    public final View LIZ;
    public final View LIZIZ;
    public final TuxTextView LIZJ;
    public final SmartImageView LIZLLL;
    public final TuxTextView LJ;
    public final TuxTextView LJFF;

    public C1003970cEV(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.rb, viewGroup, false);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(C20467080b.LIZ(viewTd.getContext(), R.attr.a0o));
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(14));
        viewTd.setBackground(gradientDrawable);
        this.LIZ = viewTd;
        this.LIZIZ = viewTd.findViewById(R.id.ciy);
        TuxTextView tuxTextView = (TuxTextView) viewTd.findViewById(R.id.zb7);
        tuxTextView.setTextColor(C20467080b.LIZ(tuxTextView.getContext(), R.attr.a1h));
        this.LIZJ = tuxTextView;
        this.LIZLLL = (SmartImageView) viewTd.findViewById(R.id.lac);
        this.LJ = (TuxTextView) viewTd.findViewById(R.id.z9y);
        TuxTextView tuxTextView2 = (TuxTextView) viewTd.findViewById(R.id.d77);
        tuxTextView2.setTextColor(C20467080b.LIZ(tuxTextView2.getContext(), R.attr.a0p));
        LIZ(this, tuxTextView2, C20467080b.LIZ(tuxTextView2.getContext(), R.attr.a04));
        this.LJFF = tuxTextView2;
    }

    public final void LIZIZ(String str, String str2) {
        if (str != null && str.length() > 0) {
            SmartImageView smartImageView = this.LIZLLL;
            C786410Ut5.LJLLLLLL(0, smartImageView);
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(Collections.singletonList(str)));
            c1331670kl3LJIIJ.LJJIJL(smartImageView.getContext());
            c1331670kl3LJIIJ.LJJ = EnumC1338240kve.CENTER_INSIDE;
            c1331670kl3LJIIJ.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJIIJ);
            C339190DRl.LIZIZ(this.LIZJ);
            return;
        }
        C339190DRl.LIZIZ(this.LIZLLL);
        TuxTextView tuxTextView = this.LIZJ;
        C786410Ut5.LJLLLLLL(0, tuxTextView);
        tuxTextView.setText(str2);
    }

    public final void LIZJ(String str, String str2) {
        int i;
        boolean z = true;
        if ((str2 != null && str2.length() != 0) || !C123100dR.LIZ(str)) {
            z = false;
        }
        TuxTextView tuxTextView = this.LJ;
        if (!z) {
            if (str2 == null) {
                str = "";
            } else {
                str = str2;
            }
        }
        tuxTextView.setText(str);
        tuxTextView.setTuxFont(42);
        Context context = tuxTextView.getContext();
        if (z) {
            i = R.attr.a1k;
        } else {
            i = R.attr.a1h;
        }
        tuxTextView.setTextColor(C20467080b.LIZ(context, i));
    }

    public final void LIZLLL(String str, boolean z) {
        Object objValueOf;
        int iLIZ;
        TuxTextView tuxTextView = this.LJFF;
        C995130c0F.LIZLLL(tuxTextView, z);
        Object obj = null;
        if (str == null) {
            objValueOf = null;
        } else {
            try {
                objValueOf = Integer.valueOf(Color.parseColor(str));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                objValueOf = new C098200Yq(th);
                C189200o6.m2constructorimpl(objValueOf);
            }
        }
        C189200o6.m2constructorimpl(objValueOf);
        if (!C189200o6.m7isFailureimpl(objValueOf)) {
            obj = objValueOf;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            iLIZ = num.intValue();
        } else {
            iLIZ = C20467080b.LIZ(tuxTextView.getContext(), R.attr.a04);
        }
        LIZ(this, tuxTextView, iLIZ);
    }

    public static void LIZ(C1003970cEV c1003970cEV, TuxTextView tuxTextView, int i) {
        float fLIZIZ = C418440Gaw.LIZIZ(200);
        c1003970cEV.getClass();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(fLIZIZ);
        tuxTextView.setBackground(gradientDrawable);
    }
}
