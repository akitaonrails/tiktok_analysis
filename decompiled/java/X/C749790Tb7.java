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

/* JADX INFO: renamed from: X.0Tb7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C749790Tb7 extends FrameLayout {
    public final String LL;
    public final List<View> LLILLJJLI;
    public int LLILLL;

    public final void LIZIZ() {
        setStatus(1);
    }

    public final void LIZJ() {
        setStatus(2);
    }

    public final void LIZLLL() {
        setStatus(0);
    }

    public final void LIZ() {
        int i = this.LLILLL;
        if (i == -1) {
            return;
        }
        C786410Ut5.LJLLLLLL(4, (View) ListProtector.get(this.LLILLJJLI, i));
        this.LLILLL = -1;
    }

    private void setStatus(int i) {
        int i2 = this.LLILLL;
        if (i2 == i) {
            return;
        }
        if (i2 >= 0) {
            C786410Ut5.LJLLLLLL(4, (View) ListProtector.get(this.LLILLJJLI, i2));
        }
        if (ListProtector.get(this.LLILLJJLI, i) == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, (View) ListProtector.get(this.LLILLJJLI, i));
        this.LLILLL = i;
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setStatus    ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    public void setBuilder(C749800Tb8 c749800Tb8) {
        if (c749800Tb8 == null) {
            c749800Tb8 = C749800Tb8.LIZ(getContext());
        }
        ((ArrayList) this.LLILLJJLI).clear();
        ((ArrayList) this.LLILLJJLI).add(c749800Tb8.LIZIZ);
        ((ArrayList) this.LLILLJJLI).add(c749800Tb8.LIZJ);
        ((ArrayList) this.LLILLJJLI).add(c749800Tb8.LIZLLL);
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        for (int i = 0; i < ((ArrayList) this.LLILLJJLI).size(); i++) {
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

    public C749790Tb7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = "LoadingStatusView";
        this.LLILLJJLI = new ArrayList(3);
        this.LLILLL = -1;
        setBuilder(null);
    }
}
