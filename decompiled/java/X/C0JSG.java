package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0JSG, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JSG extends FrameLayout {
    public final String LL;
    public List<View> LLILLJJLI;
    public int LLILLL;

    public final void LIZ() {
        setStatus(0);
    }

    public final void LIZIZ() {
        setStatus(3);
    }

    public final void LIZJ() {
        setStatus(2);
    }

    public final List<View> getMStatusViews() {
        return this.LLILLJJLI;
    }

    private final void setStatus(int i) {
        View view;
        int i2 = this.LLILLL;
        if (i2 == i) {
            return;
        }
        if (i2 >= 0 && (view = (View) ListProtector.get(this.LLILLJJLI, i2)) != null) {
            C786410Ut5.LJLLLLLL(4, view);
        }
        if (ListProtector.get(this.LLILLJJLI, i) == null) {
            return;
        }
        View view2 = (View) ListProtector.get(this.LLILLJJLI, i);
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        this.LLILLL = i;
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setStatus    ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void setBuilder(C0JSI c0jsi) {
        if (c0jsi == null) {
            c0jsi = new C0JSI(getContext(), null);
        }
        this.LLILLJJLI.clear();
        this.LLILLJJLI.add(c0jsi.LIZIZ);
        this.LLILLJJLI.add(null);
        this.LLILLJJLI.add(c0jsi.LIZJ);
        this.LLILLJJLI.add(c0jsi.LIZLLL);
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        int size = this.LLILLJJLI.size();
        for (int i = 0; i < size; i++) {
            View view = (View) ListProtector.get(this.LLILLJJLI, i);
            if (view != null) {
                C786410Ut5.LJLLLLLL(4, view);
                if (view.getParent() != null) {
                    C786410Ut5.LJJJLZIJ(view, (ViewGroup) view.getParent());
                }
                addView(view);
            }
        }
    }

    public final void setMStatusViews(List<View> list) {
        this.LLILLJJLI = list;
    }

    public C0JSG(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = "DialogStatusView";
        this.LLILLJJLI = new ArrayList();
        this.LLILLL = -1;
    }
}
