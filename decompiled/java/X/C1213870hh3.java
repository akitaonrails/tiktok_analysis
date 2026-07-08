package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS88S0100000_19;

/* JADX INFO: renamed from: X.0hh3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1213870hh3 extends FrameLayout {
    public final ViewGroup LL;
    public final View LLILLJJLI;
    public final View LLILLL;
    public final View LLILZ;
    public final TuxIconView LLILZIL;
    public final TuxIconView LLILZLL;
    public final TuxTextView LLIZ;

    public final void LIZ(Context context) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        View view = this.LLILLJJLI;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.zr, context);
        view.setBackground(c384050F3z.LIZ(context));
        TuxIconView tuxIconView = this.LLILZLL;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
        int iIntValue5 = -16777216;
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16777216;
        }
        tuxIconView.setTintColor(iIntValue);
        TuxIconView tuxIconView2 = this.LLILZIL;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, context);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = -16777216;
        }
        tuxIconView2.setTintColor(iIntValue2);
        TuxTextView tuxTextView = this.LLIZ;
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1h, context);
        if (numLIZJ3 != null) {
            iIntValue3 = numLIZJ3.intValue();
        } else {
            iIntValue3 = -16777216;
        }
        tuxTextView.setTextColor(iIntValue3);
        View view2 = this.LLILZ;
        Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a03, context);
        if (numLIZJ4 != null) {
            iIntValue4 = numLIZJ4.intValue();
        } else {
            iIntValue4 = -16777216;
        }
        view2.setBackgroundColor(iIntValue4);
        View view3 = this.LLILLL;
        Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.a03, context);
        if (numLIZJ5 != null) {
            iIntValue5 = numLIZJ5.intValue();
        }
        view3.setBackgroundColor(iIntValue5);
    }

    public C1213870hh3(Context context, InterfaceC1213880hh4 interfaceC1213880hh4) {
        super(context);
        ViewGroup viewGroup = (ViewGroup) C786410Ut5.Td(C786410Ut5.ne(context), R.layout.c36, this, true);
        this.LL = viewGroup;
        this.LLILLJJLI = viewGroup.findViewById(R.id.gvk);
        this.LLILLL = viewGroup.findViewById(R.id.cqa);
        this.LLILZ = viewGroup.findViewById(R.id.co1);
        TuxIconView tuxIconView = (TuxIconView) viewGroup.findViewById(R.id.co0);
        C786410Ut5.I7(new AkS88S0100000_19(interfaceC1213880hh4, 12), tuxIconView);
        this.LLILZIL = tuxIconView;
        TuxIconView tuxIconView2 = (TuxIconView) viewGroup.findViewById(R.id.cq_);
        C786410Ut5.I7(new AkS88S0100000_19(interfaceC1213880hh4, 13), tuxIconView2);
        this.LLILZLL = tuxIconView2;
        TuxTextView tuxTextView = (TuxTextView) viewGroup.findViewById(R.id.cs2);
        C786410Ut5.I7(new AkS88S0100000_19(interfaceC1213880hh4, 14), tuxTextView);
        this.LLIZ = tuxTextView;
    }
}
