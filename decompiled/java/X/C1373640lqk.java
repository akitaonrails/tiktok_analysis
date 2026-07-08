package X;

import Y.ACListenerS155S0100000_21;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import avg.f;
import com.zhiliaoapp.musically.R;
import mf.a;

/* JADX INFO: renamed from: X.0lqk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1373640lqk extends FrameLayout {
    public View LL;
    public final C0SZ3 LLILLJJLI;
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

    public C1373640lqk(Context context) {
        super(context);
        C786410Ut5.LJLLJ(getContext(), R.layout.b84, this);
        this.LLILLJJLI = (C0SZ3) findViewById(R.id.fnl);
        View.OnClickListener aCListenerS155S0100000_21 = new ACListenerS155S0100000_21(this, 134);
        a aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS155S0100000_21) : aCListenerS155S0100000_21);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    public final void setBoundaryFromXml(View view) {
        this.LL = view;
    }
}
