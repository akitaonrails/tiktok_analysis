package X;

import Y.ACListenerS141S0100000_6;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import avg.f;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import mf.a;

/* JADX INFO: renamed from: X.0HgN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C447290HgN extends LinearLayout {
    public final InterfaceC447300HgO LL;
    public String LLILLJJLI;
    public final TuxTextView LLILLL;
    public final C0HZQ LLILZ;

    public final String getDescText() {
        return this.LLILLJJLI;
    }

    public final InterfaceC447300HgO getListener() {
        return this.LL;
    }

    public final void setDescText(String str) {
        this.LLILLL.setText(str);
        this.LLILLJJLI = str;
    }

    public C447290HgN(C19GS c19gs, InterfaceC447300HgO interfaceC447300HgO) {
        super(c19gs);
        this.LL = interfaceC447300HgO;
        int iLIZJ = (int) C12ES.LIZJ(12.0f, c19gs);
        int iLIZJ2 = (int) C12ES.LIZJ(14.0f, c19gs);
        int iLIZJ3 = (int) C12ES.LIZJ(16.0f, c19gs);
        Drawable drawableLIZIZ = C800330VaR.LIZIZ(c19gs, R.drawable.bbu);
        this.LLILLJJLI = "";
        TuxTextView tuxTextView = new TuxTextView(c19gs, null, 6, 0);
        tuxTextView.setTuxFont(41);
        tuxTextView.setTextColor(C960203pA.LIZ(R.attr.a1h, c19gs));
        this.LLILLL = tuxTextView;
        C0HZQ c0hzq = new C0HZQ(c19gs, null, 6);
        c0hzq.setClickable(false);
        c0hzq.setSize(1);
        C786410Ut5.D7(c0hzq, new C0IDS(this, 1));
        this.LLILZ = c0hzq;
        setBackground(drawableLIZIZ);
        setOrientation(0);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        setPadding(iLIZJ3, iLIZJ2, iLIZJ3, iLIZJ2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMarginEnd(iLIZJ);
        layoutParams2.gravity = 8388627;
        layoutParams2.weight = 1.0f;
        addView(tuxTextView, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 8388629;
        addView(c0hzq, layoutParams3);
        View.OnClickListener aCListenerS141S0100000_6 = new ACListenerS141S0100000_6(this, 146);
        View.OnClickListener aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS141S0100000_6) : aCListenerS141S0100000_6);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }
}
