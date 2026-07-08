package X;

import Y.ACListenerS59S0101000_27;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import avg.f;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoStandardRatio;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import mf.a;

/* JADX INFO: renamed from: X.0y0D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1840790y0D extends LinearLayout {
    public final LinearLayout LL;
    public List<TakoStandardRatio> LLILLJJLI;
    public int LLILLL;
    public Function1<? super TakoStandardRatio, Unit> LLILZ;

    public final Function1<TakoStandardRatio, Unit> getOnRatioSelected() {
        return this.LLILZ;
    }

    public C1840790y0D(Context context) {
        super(context, null, 0);
        this.LLILLJJLI = C13BV.INSTANCE;
        this.LLILLL = -1;
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1d);
        Drawable drawableLIZ = c384050F3z.LIZ(context);
        C19659111vp c19659111vp = new C19659111vp();
        c19659111vp.LIZIZ(4);
        c19659111vp.LIZ = C418440Gaw.LIZIZ(12);
        linearLayout.setBackground(C426750GoL.LJIILIIL(drawableLIZ, c19659111vp.LIZ(context)));
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        linearLayout.setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
        this.LL = linearLayout;
        setClipChildren(false);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(240)), -2);
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        layoutParams2.setMargins(iLIZIZ2, iLIZIZ2, iLIZIZ2, iLIZIZ2);
        addView(linearLayout, layoutParams2);
    }

    public final void setOnRatioSelected(Function1<? super TakoStandardRatio, Unit> function1) {
        this.LLILZ = function1;
    }

    public final void LIZ(List<TakoStandardRatio> list, TakoStandardRatio takoStandardRatio) {
        boolean z;
        C786410Ut5.LJJJJJL(this.LL);
        this.LLILLJJLI = list;
        Iterator<TakoStandardRatio> it2 = list.iterator();
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                TakoStandardRatio next = it2.next();
                if (takoStandardRatio != null && next.stdSize == takoStandardRatio.stdSize) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        this.LLILLL = i;
        int i2 = 0;
        for (TakoStandardRatio takoStandardRatio2 : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                TakoStandardRatio takoStandardRatio3 = takoStandardRatio2;
                C03JO c03jo = new C03JO(getContext());
                c03jo.LL.setIconRes(C1854490yMJ.LIZLLL(takoStandardRatio3));
                c03jo.LLILLJJLI.setText(takoStandardRatio3.nameText);
                if (i2 == this.LLILLL) {
                    z = true;
                } else {
                    z = false;
                }
                c03jo.setItemSelected(z);
                View.OnClickListener aCListenerS59S0101000_27 = new ACListenerS59S0101000_27(this, i2, 1);
                if (C1848410yCV.LIZ) {
                    aCListenerS59S0101000_27 = new f(aCListenerS59S0101000_27);
                }
                a aVar = new a(aCListenerS59S0101000_27);
                if (C2213981Bky.LIZIZ.isOffline()) {
                    C2211941Bhg.LIZ.injectViewListener(c03jo);
                }
                c03jo.setOnClickListener(aVar);
                this.LL.addView(c03jo, new LinearLayout.LayoutParams(-1, -2));
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }
}
