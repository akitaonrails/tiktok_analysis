package X;

import Y.ACListenerS149S0100000_14;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import avg.f;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.zhiliaoapp.musically.R;
import mf.a;

/* JADX INFO: renamed from: X.0Z4O, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z4O extends FrameLayout {
    public final InterfaceC889560Yv4 LL;
    public final AbstractC891680YyU LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxSpinner LLILZ;

    public final InterfaceC889560Yv4 getBtnWrapper$awemenotice_api_release() {
        return this.LL;
    }

    public C0Z4O(Context context, InterfaceC889560Yv4 interfaceC889560Yv4, AbstractC891680YyU abstractC891680YyU) {
        int iIntValue;
        super(context);
        this.LL = interfaceC889560Yv4;
        this.LLILLJJLI = abstractC891680YyU;
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        addView(tuxTextView);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        C786410Ut5.R6(tuxTextView, layoutParams2);
        tuxTextView.setGravity(17);
        tuxTextView.setTuxFont(42);
        Integer numLIZJ = C1308910kAL.LIZJ(interfaceC889560Yv4.LIZLLL(), context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        tuxTextView.setTextColor(iIntValue);
        this.LLILLL = tuxTextView;
        TuxSpinner tuxSpinner = new TuxSpinner(context, null, 6, 0);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        layoutParams3.gravity = 17;
        C786410Ut5.X6(tuxSpinner, layoutParams3);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, context);
        tuxSpinner.LIZ(R.raw.icon_spinner_normal, numLIZJ2 != null ? numLIZJ2.intValue() : 0);
        addView(tuxSpinner);
        C786410Ut5.LLZILL(tuxSpinner, 8);
        this.LLILZ = tuxSpinner;
        View.OnClickListener aCListenerS149S0100000_14 = new ACListenerS149S0100000_14(this, 85);
        View.OnClickListener aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS149S0100000_14) : aCListenerS149S0100000_14);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }
}
