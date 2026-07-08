package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.10xC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19412810xC extends FrameLayout implements InterfaceC1213420hgK {
    public final List<View> LL;
    public int LLILLJJLI;
    public int LLILLL;

    public C19412810xC() {
        throw null;
    }

    public final void LIZLLL() {
        C786410Ut5.F1(this, 0);
        setStatus(0);
    }

    public final void LIZJ() {
        int i = this.LLILLJJLI;
        if (i == -1) {
            return;
        }
        View viewLIZIZ = LIZIZ(i);
        if (viewLIZIZ != null) {
            C786410Ut5.LJLLLLLL(4, viewLIZIZ);
        }
        C786410Ut5.F1(this, 4);
        this.LLILLJJLI = -1;
    }

    @Override // X.InterfaceC1213420hgK
    public final void LIZ(int i) {
        LJ(i);
    }

    public final View LIZIZ(int i) {
        if (i >= 0 && i < ((ArrayList) this.LL).size()) {
            return (View) ListProtector.get(this.LL, i);
        }
        return null;
    }

    public final void LJ(int i) {
        if (i >= 0 && this.LLILLL != i) {
            this.LLILLL = i;
            View view = (View) ListProtector.get(this.LL, 0);
            if (view instanceof C1688850u39) {
                ((C1688850u39) view).LIZ(this.LLILLL);
            }
            KeyEvent.Callback callback = (View) ListProtector.get(this.LL, 1);
            if (callback instanceof InterfaceC1213420hgK) {
                ((InterfaceC1213420hgK) callback).LIZ(this.LLILLL);
            }
            View view2 = (View) ListProtector.get(this.LL, 2);
            if (view2 instanceof C1213380hgG) {
                ((C1213380hgG) view2).LIZ(this.LLILLL);
            }
            View view3 = (View) ListProtector.get(this.LL, 3);
            if (view3 instanceof C1213380hgG) {
                ((C1213380hgG) view3).LIZ(this.LLILLL);
            }
            View view4 = (View) ListProtector.get(this.LL, 4);
            if (view4 instanceof C1213380hgG) {
                ((C1213380hgG) view4).LIZ(this.LLILLL);
            }
        }
    }

    public void setBuilder(C19412710xB c19412710xB) {
        if (c19412710xB == null) {
            c19412710xB = C19412710xB.LIZ(getContext());
        }
        ((ArrayList) this.LL).clear();
        ((ArrayList) this.LL).add(c19412710xB.LIZIZ);
        ((ArrayList) this.LL).add(c19412710xB.LIZJ);
        ((ArrayList) this.LL).add(c19412710xB.LIZLLL);
        ((ArrayList) this.LL).add(null);
        ((ArrayList) this.LL).add(null);
        if (c19412710xB.LJ < 0) {
            C0CHQ.LIZ().getUiService().getClass();
            c19412710xB.LJ = 0;
        }
        LJ(c19412710xB.LJ);
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        for (int i = 0; i < ((ArrayList) this.LL).size(); i++) {
            View view = (View) ListProtector.get(this.LL, i);
            if (view != null) {
                C786410Ut5.LJLLLLLL(4, view);
                addView(view);
            }
        }
    }

    public void setStatus(int i) {
        View viewLIZIZ;
        int i2 = this.LLILLJJLI;
        if (i2 == i) {
            return;
        }
        if (i2 >= 0 && (viewLIZIZ = LIZIZ(i2)) != null) {
            C786410Ut5.LJLLLLLL(4, viewLIZIZ);
        }
        if (i >= 0) {
            C786410Ut5.F1(this, 0);
            View viewLIZIZ2 = LIZIZ(i);
            if (viewLIZIZ2 != null) {
                C786410Ut5.LJLLLLLL(0, viewLIZIZ2);
            }
        } else {
            C786410Ut5.F1(this, 4);
        }
        this.LLILLJJLI = i;
    }

    public C19412810xC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new ArrayList(5);
        this.LLILLJJLI = -1;
        this.LLILLL = -1;
    }
}
