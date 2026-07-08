package X;

import Y.ACListenerS155S0100000_21;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import avg.f;
import com.zhiliaoapp.musically.R;
import mf.a;

/* JADX INFO: renamed from: X.0lrC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1373920lrC extends LinearLayout {
    public View LL;
    public final C1373900lrA LLILLJJLI;
    public AbstractC736370SuZ LLILLL;
    public AbstractC736370SuZ LLILZ;

    public final View getBoundaryFromXml() {
        View view = this.LL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.f683ci3);
        this.LL = viewFindViewById;
        return viewFindViewById;
    }

    public C1373920lrC(Context context) {
        super(context);
        C786410Ut5.LJLLJ(getContext(), R.layout.b80, this);
        C1373900lrA c1373900lrA = (C1373900lrA) findViewById(R.id.fnl);
        this.LLILLJJLI = c1373900lrA;
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ol2);
        findViewById(R.id.zxx);
        View.OnClickListener aCListenerS155S0100000_21 = new ACListenerS155S0100000_21(this, 130);
        a aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS155S0100000_21) : aCListenerS155S0100000_21);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1373900lrA);
        }
        c1373900lrA.setOnClickListener(aVar);
        C786410Ut5.R7(linearLayout, new ACListenerS155S0100000_21(this, 131));
    }

    public final void setBoundaryFromXml(View view) {
        this.LL = view;
    }

    public final void LIZ(C1376720lvi c1376720lvi, boolean z, boolean z2) {
        this.LLILLL = c1376720lvi.LIZIZ;
        this.LLILZ = c1376720lvi.LIZJ;
        this.LLILLJJLI.LIZ(c1376720lvi.LIZ, true);
        if (z) {
            C786410Ut5.LJLLLLLL(4, getBoundaryFromXml());
        } else {
            C786410Ut5.LJLLLLLL(0, getBoundaryFromXml());
        }
        if (z2) {
            C426750GoL.LJIIL(this.LLILLJJLI, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 21);
        }
    }
}
