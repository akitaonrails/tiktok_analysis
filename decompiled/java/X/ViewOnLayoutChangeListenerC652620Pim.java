package X;

import Y.ARunnableS17S0201000_10;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0Pim, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class ViewOnLayoutChangeListenerC652620Pim implements View.OnLayoutChangeListener {
    public final /* synthetic */ int LL;
    public final /* synthetic */ C652600Pik LLILLJJLI;
    public final /* synthetic */ InterfaceC648120PbW LLILLL;

    public ViewOnLayoutChangeListenerC652620Pim(int i, InterfaceC648120PbW interfaceC648120PbW, C652600Pik c652600Pik) {
        this.LL = i;
        this.LLILLJJLI = c652600Pik;
        this.LLILLL = interfaceC648120PbW;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Boolean boolValueOf;
        view.removeOnLayoutChangeListener(this);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("after scroll to inside on layout: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", ");
        RecyclerView recyclerView = this.LLILLJJLI.LIZLLL;
        Boolean boolValueOf2 = null;
        if (recyclerView != null) {
            boolValueOf = Boolean.valueOf(recyclerView.isLayoutRequested());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(':');
        RecyclerView recyclerView2 = this.LLILLJJLI.LIZLLL;
        if (recyclerView2 != null) {
            boolValueOf2 = Boolean.valueOf(recyclerView2.isInLayout());
        }
        sbLIZ.append(boolValueOf2);
        C2188811AlT.LIZIZ(sbLIZ);
        C652600Pik c652600Pik = this.LLILLJJLI;
        RecyclerView recyclerView3 = c652600Pik.LIZLLL;
        if (recyclerView3 != null) {
            HandlerHook.viewPost(recyclerView3, new ARunnableS17S0201000_10(this.LL, c652600Pik, this.LLILLL, 11));
        }
    }
}
