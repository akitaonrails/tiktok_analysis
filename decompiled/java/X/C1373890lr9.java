package X;

import Y.ACListenerS155S0100000_21;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import avg.f;
import com.zhiliaoapp.musically.R;
import mf.a;

/* JADX INFO: renamed from: X.0lr9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1373890lr9 extends FrameLayout {
    public View LL;
    public final C1373900lrA LLILLJJLI;
    public AbstractC1376810lvr LLILLL;

    public final View getBoundaryFromXml() {
        View view = this.LL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.f683ci3);
        this.LL = viewFindViewById;
        return viewFindViewById;
    }

    public C1373890lr9(Context context) {
        super(context);
        C786410Ut5.LJLLJ(getContext(), R.layout.b83, this);
        this.LLILLJJLI = (C1373900lrA) findViewById(R.id.fnl);
        View.OnClickListener aCListenerS155S0100000_21 = new ACListenerS155S0100000_21(this, 133);
        a aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS155S0100000_21) : aCListenerS155S0100000_21);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    public final void setBoundaryFromXml(View view) {
        this.LL = view;
    }

    public final void LIZ(C1373910lrB c1373910lrB, boolean z, boolean z2) {
        this.LLILLL = c1373910lrB.LIZIZ;
        this.LLILLJJLI.LIZ(c1373910lrB.LIZ, c1373910lrB.LIZJ);
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
