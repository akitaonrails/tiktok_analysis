package X;

import Y.ACListenerS145S0100000_10;
import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PX3, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PX3 extends FrameLayout {
    public final View LL;
    public View LLILLJJLI;
    public View LLILLL;
    public List<? extends View> LLILZ;
    public final Set<View> LLILZIL;
    public String LLILZLL;
    public Function1<? super View, Unit> LLIZ;

    public final void LIZ() {
        if (getVisibility() == 0) {
            int visibility = getVisibility();
            setVisibility(4);
            C1602160rnK.LIZIZ(visibility, 4, this);
        }
        if (!((HashSet) this.LLILZIL).isEmpty()) {
            Iterator it2 = ((HashSet) this.LLILZIL).iterator();
            while (it2.hasNext()) {
                C786410Ut5.LJLLLLLL(0, (View) it2.next());
            }
            ((HashSet) this.LLILZIL).clear();
        }
    }

    public final String getImprId() {
        return this.LLILZLL;
    }

    public final Function1<View, Unit> getOnCloseClickListener() {
        return this.LLIZ;
    }

    public final void setAlwaysShowingViews(List<? extends View> list) {
        if (list != null) {
            this.LLILZ = list;
        }
    }

    public final void setImprId(String str) {
        this.LLILZLL = str;
    }

    public final void setOnCloseClickListener(Function1<? super View, Unit> function1) {
        this.LLIZ = function1;
    }

    public C0PX3(Context context, AttributeSet attributeSet) {
        View viewTd;
        int iIntValue;
        super(context, attributeSet, 0);
        this.LLILZIL = new HashSet();
        this.LLILZLL = "";
        View view = new View(context);
        C786410Ut5.W5(view, new FrameLayout.LayoutParams(-1, -1));
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1_);
        view.setBackground(c384050F3z.LIZ(context));
        this.LL = view;
        addView(view);
        if (this.LLILLJJLI == null) {
            C645030PRt.LIZ.getClass();
            if (C645030PRt.LIZ().enableVideoLayoutPreInflate && Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
                C650520PfO.LIZ.getClass();
                viewTd = C650520PfO.LIZ(R.layout.f2x, this);
            } else {
                viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.f2x, this, false);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(viewTd.getLayoutParams());
            layoutParams.gravity = 80;
            C786410Ut5.W5(viewTd, layoutParams);
            Integer numValueOf = Integer.valueOf(C1913107eT.LIZLLL());
            if (numValueOf.intValue() > 0) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 4;
            }
            viewTd.setOutlineProvider(new C663220Pzs((int) C418040GaI.LIZ(iIntValue)));
            this.LLILLJJLI = viewTd;
            addView(viewTd);
            this.LLILLJJLI.findViewById(R.id.words_container);
            View viewFindViewById = this.LLILLJJLI.findViewById(R.id.cov);
            C786410Ut5.I7(new ACListenerS145S0100000_10(this, 117), viewFindViewById);
            this.LLILLL = viewFindViewById;
        }
    }
}
