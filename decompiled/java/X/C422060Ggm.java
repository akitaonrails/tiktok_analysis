package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ggm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C422060Ggm extends C0DXR {
    public final boolean LL;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final int LLILLJJLI = R.attr.bx;
    public final int LLILLL = R.attr.a1h;
    public final int LLILZ = 62;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1625));
    public final Rect LLJ = new Rect();
    public final Rect LLJI = new Rect();

    public C422060Ggm(C1361400lX0 c1361400lX0, boolean z) {
        this.LL = z;
        this.LLILZIL = C452501pT.LIZIZ(new AwS407S0200000_6(c1361400lX0, this, 132));
        this.LLILZLL = C452501pT.LIZIZ(new AwS407S0200000_6(c1361400lX0, this, 130));
        this.LLIZ = C452501pT.LIZIZ(new AwS407S0200000_6(c1361400lX0, this, 131));
    }

    @Override // X.C0DXR
    public final void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        InterfaceC1891350zJl item;
        C1074770e4h c1074770e4h;
        PowerCell powerCell;
        Iterator<View> it2 = new C09RD(recyclerView).iterator();
        while (true) {
            C09RE c09re = (C09RE) it2;
            if (c09re.hasNext()) {
                View view = (View) c09re.next();
                RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
                String str = null;
                if ((childViewHolder instanceof PowerCell) && (powerCell = (PowerCell) childViewHolder) != null) {
                    item = powerCell.getItem();
                } else {
                    item = null;
                }
                if ((item instanceof C1074770e4h) && (c1074770e4h = (C1074770e4h) item) != null) {
                    str = c1074770e4h.LL;
                }
                if (Intrinsics.LJFF(view.getTag(-100), Boolean.TRUE) && str != null) {
                    this.LLJ.set(recyclerView.getPaddingLeft(), view.getTop() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), recyclerView.getWidth() - recyclerView.getPaddingRight(), view.getBottom());
                    canvas.drawRect(this.LLJ, (Paint) this.LLILZLL.getValue());
                    canvas.drawText(str, ((Number) this.LLILZIL.getValue()).floatValue(), this.LLJ.top + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) + ((Number) this.LLIZLLLIL.getValue()).floatValue(), (Paint) this.LLIZ.getValue());
                }
            } else {
                return;
            }
        }
    }

    @Override // X.C0DXR
    public final void LIZLLL(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        LinearLayoutManager linearLayoutManager;
        RecyclerView.ViewHolder viewHolderFindViewHolderForLayoutPosition;
        C1074770e4h c1074770e4h;
        PowerCell powerCell;
        if (!this.LL) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        InterfaceC1891350zJl item = null;
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null && (viewHolderFindViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(linearLayoutManager.findFirstVisibleItemPosition())) != null) {
            if ((viewHolderFindViewHolderForLayoutPosition instanceof PowerCell) && (powerCell = (PowerCell) viewHolderFindViewHolderForLayoutPosition) != null) {
                item = powerCell.getItem();
            }
            if ((item instanceof C1074770e4h) && (c1074770e4h = (C1074770e4h) item) != null) {
                String str = c1074770e4h.LL;
                this.LLJI.set(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getRight() - recyclerView.getPaddingRight(), recyclerView.getPaddingTop() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
                canvas.drawRect(this.LLJI, (Paint) this.LLILZLL.getValue());
                canvas.drawText(str, ((Number) this.LLILZIL.getValue()).floatValue(), recyclerView.getPaddingTop() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) + ((Number) this.LLIZLLLIL.getValue()).floatValue(), (Paint) this.LLIZ.getValue());
            }
        }
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        InterfaceC1891350zJl interfaceC1891350zJl;
        String str;
        InterfaceC1891350zJl interfaceC1891350zJl2;
        C1074770e4h c1074770e4h;
        C1074770e4h c1074770e4h2;
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        List<InterfaceC1891350zJl> listItems = ((ViewOnAttachStateChangeListenerC20604515jv) recyclerView).getListItems();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        String str2 = null;
        if (listItems != null) {
            interfaceC1891350zJl = (InterfaceC1891350zJl) C13LP.LJJJLZIJ(childAdapterPosition, listItems);
        } else {
            interfaceC1891350zJl = null;
        }
        if ((interfaceC1891350zJl instanceof C1074770e4h) && (c1074770e4h2 = (C1074770e4h) interfaceC1891350zJl) != null) {
            str = c1074770e4h2.LL;
        } else {
            str = null;
        }
        if (listItems != null) {
            interfaceC1891350zJl2 = (InterfaceC1891350zJl) C13LP.LJJJLZIJ(childAdapterPosition - 1, listItems);
        } else {
            interfaceC1891350zJl2 = null;
        }
        if ((interfaceC1891350zJl2 instanceof C1074770e4h) && (c1074770e4h = (C1074770e4h) interfaceC1891350zJl2) != null) {
            str2 = c1074770e4h.LL;
        }
        if (!Intrinsics.LJFF(str, str2)) {
            rect.top = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            view.setTag(-100, Boolean.TRUE);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("set tag to: ");
            sbLIZ.append(interfaceC1891350zJl);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        rect.top = 0;
        view.setTag(-100, Boolean.FALSE);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("cancel tag to: ");
        sbLIZ2.append(interfaceC1891350zJl);
        C2188811AlT.LIZIZ(sbLIZ2);
    }
}
