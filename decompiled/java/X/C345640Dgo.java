package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Dgo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C345640Dgo extends LinearLayout {
    public final List<C345670Dgr> LL;

    private final LinearLayout.LayoutParams getLayoutParameters() {
        return new LinearLayout.LayoutParams(-1, -2);
    }

    public final List<C345670Dgr> getProgressItems() {
        return this.LL;
    }

    public final void setProgressData(List<C345670Dgr> list) {
        C345670Dgr c345670Dgr;
        Drawable drawable;
        Drawable drawable2;
        ((ArrayList) this.LL).clear();
        ((ArrayList) this.LL).addAll(list);
        boolean z = false;
        for (C345670Dgr c345670Dgr2 : this.LL) {
            if (c345670Dgr2.LIZJ == EnumC345660Dgq.STATUS_UN_STARTED && !z) {
                c345670Dgr2.LIZJ = EnumC345660Dgq.STATUS_NEXT;
                z = true;
            }
        }
        for (C345670Dgr c345670Dgr3 : (ArrayList) this.LL) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.f892cxo, this, false);
            TuxIconView tuxIconView = (TuxIconView) viewTd.findViewById(R.id.s9t);
            TextView textView = (TextView) viewTd.findViewById(R.id.s_0);
            TextView textView2 = (TextView) viewTd.findViewById(R.id.s96);
            int i = C345650Dgp.LIZ[c345670Dgr3.LIZJ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        tuxIconView.setBackground(getContext().getDrawable(R.drawable.cx8));
                    } else {
                        tuxIconView.setBackground(getContext().getDrawable(R.drawable.cx9));
                    }
                } else {
                    tuxIconView.setBackground(getContext().getDrawable(R.drawable.cx8));
                }
            } else {
                tuxIconView.setBackground(getContext().getDrawable(R.drawable.cx5));
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                c419910GdJ.LIZ = R.raw.icon_tick_tiny_fill;
                c419910GdJ.LIZLLL = -1;
                tuxIconView.setTuxIcon(c419910GdJ);
            }
            textView.setText(c345670Dgr3.LIZ);
            textView2.setText(c345670Dgr3.LIZIZ);
            addView(viewTd, getLayoutParameters());
        }
        if (!((ArrayList) this.LL).isEmpty()) {
            int size = ((ArrayList) this.LL).size();
            for (int i2 = 0; i2 < size; i2++) {
                C345670Dgr c345670Dgr4 = (C345670Dgr) ListProtector.get(this.LL, i2);
                if (i2 == ((ArrayList) this.LL).size() - 1) {
                    c345670Dgr = null;
                } else {
                    c345670Dgr = (C345670Dgr) ListProtector.get(this.LL, i2 + 1);
                }
                View childAt = getChildAt(i2);
                View viewFindViewById = childAt.findViewById(R.id.yas);
                View viewFindViewById2 = childAt.findViewById(R.id.ce6);
                if (i2 > 0) {
                    C786410Ut5.LJLLLLLL(0, viewFindViewById);
                    if (c345670Dgr4.LIZJ == EnumC345660Dgq.STATUS_UN_STARTED) {
                        drawable2 = getContext().getDrawable(R.drawable.cx7);
                    } else {
                        drawable2 = getContext().getDrawable(R.drawable.cx6);
                    }
                    viewFindViewById.setBackground(drawable2);
                } else {
                    C786410Ut5.LJLLLLLL(4, viewFindViewById);
                }
                if (i2 < ((ArrayList) this.LL).size() - 1 && c345670Dgr != null) {
                    C786410Ut5.LJLLLLLL(0, viewFindViewById2);
                    if (c345670Dgr.LIZJ == EnumC345660Dgq.STATUS_UN_STARTED) {
                        drawable = getContext().getDrawable(R.drawable.cx7);
                    } else {
                        drawable = getContext().getDrawable(R.drawable.cx6);
                    }
                    viewFindViewById2.setBackground(drawable);
                } else {
                    C786410Ut5.LJLLLLLL(4, viewFindViewById2);
                }
            }
        }
    }

    public C345640Dgo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = new ArrayList();
        setOrientation(1);
    }
}
