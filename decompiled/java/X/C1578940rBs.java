package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: X.0rBs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1578940rBs extends FrameLayout {
    public final C1578960rBu LL;
    public int LLILLJJLI;
    public final RecyclerView LLILLL;

    public final RecyclerView getRecyclerView() {
        return this.LLILLL;
    }

    public final void setChips(Iterable<? extends InterfaceC1203250hPv> iterable) {
        C1578960rBu c1578960rBu = this.LL;
        c1578960rBu.getClass();
        c1578960rBu.LLILLJJLI = C13LP.LLIIIJ(iterable);
        c1578960rBu.LLILLL = new LinkedHashSet();
        c1578960rBu.notifyDataSetChanged();
    }

    public final void setFont(int i) {
        this.LL.LLJ = Integer.valueOf(i);
    }

    public final void setHorizontalMargin(int i) {
        this.LLILLJJLI = i;
        C1578960rBu c1578960rBu = this.LL;
        c1578960rBu.notifyItemChanged(0);
        c1578960rBu.notifyItemChanged(C1697810uHb.LJIIJ(c1578960rBu.LLILLJJLI));
    }

    public final void setOnReselectedListener(InterfaceC1578620rBM interfaceC1578620rBM) {
        this.LL.LLILZIL = interfaceC1578620rBM;
    }

    public final void setOnSelectedChangeListener(InterfaceC1573860r3g interfaceC1573860r3g) {
        this.LL.LLILZ = interfaceC1573860r3g;
    }

    public final void setSelectionStyle(InterfaceC1579050rC3 interfaceC1579050rC3) {
        int iIntValue;
        C1578960rBu c1578960rBu = this.LL;
        c1578960rBu.LLIZLLLIL = interfaceC1579050rC3;
        if ((interfaceC1579050rC3 instanceof C1582470rHZ) && c1578960rBu.LLILLL.size() > 1) {
            Integer num = (Integer) C13LP.LJJLL(c1578960rBu.LLILLL);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            c1578960rBu.LLLII(iIntValue, new AbstractC1573810r3b() { // from class: X.0r3d
            });
        }
        c1578960rBu.notifyItemRangeChanged(0, c1578960rBu.LLILLJJLI.size());
    }

    public final void setVariant(EnumC1579060rC4 enumC1579060rC4) {
        C1578960rBu c1578960rBu = this.LL;
        c1578960rBu.LLILZLL = enumC1579060rC4;
        c1578960rBu.notifyItemRangeChanged(0, c1578960rBu.LLILLJJLI.size());
    }

    public final void setWidthRule(InterfaceC1579040rC2 interfaceC1579040rC2) {
        C1578960rBu c1578960rBu = this.LL;
        c1578960rBu.LLIZ = interfaceC1579040rC2;
        c1578960rBu.notifyItemRangeChanged(0, c1578960rBu.LLILLJJLI.size());
    }

    public C1578940rBs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C1578960rBu c1578960rBu = new C1578960rBu(context);
        this.LL = c1578960rBu;
        this.LLILLJJLI = 8;
        RecyclerView recyclerView = new RecyclerView(context);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(c1578960rBu);
        recyclerView.setItemAnimator(null);
        recyclerView.addItemDecoration(new C1620660sHA(this, 1));
        this.LLILLL = recyclerView;
        addView(recyclerView, new FrameLayout.LayoutParams(-1, -2));
    }

    public static void LIZ(C1578940rBs c1578940rBs, int i) {
        C1573800r3a c1573800r3a = C1573800r3a.LIZ;
        C1578960rBu c1578960rBu = c1578940rBs.LL;
        if (i >= 0 && i < c1578960rBu.LLILLJJLI.size()) {
            InterfaceC1579050rC3 interfaceC1579050rC3 = c1578960rBu.LLIZLLLIL;
            if (interfaceC1579050rC3 instanceof C1582470rHZ) {
                c1578960rBu.LLLII(i, c1573800r3a);
                return;
            } else {
                if (interfaceC1579050rC3 instanceof C1582490rHb) {
                    c1578960rBu.LLLI(i, true, c1573800r3a);
                    return;
                }
                throw new C1954807lC();
            }
        }
        c1578960rBu.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No chip at position ");
        sbLIZ.append(i);
        sbLIZ.append('.');
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
