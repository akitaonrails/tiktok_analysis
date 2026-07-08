package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: X.0hPj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1203130hPj extends FrameLayout {
    public final C1203120hPi LL;
    public int LLILLJJLI;
    public final RecyclerView LLILLL;

    public final RecyclerView getRecyclerView() {
        return this.LLILLL;
    }

    public final void setChips(Iterable<? extends InterfaceC1203220hPs> iterable) {
        C1203120hPi c1203120hPi = this.LL;
        c1203120hPi.getClass();
        c1203120hPi.LLILLJJLI = C13LP.LLIIIJ(iterable);
        c1203120hPi.LLILLL = new LinkedHashSet();
        c1203120hPi.notifyDataSetChanged();
    }

    public final void setFont(int i) {
        this.LL.LLJ = Integer.valueOf(i);
    }

    public final void setHorizontalMargin(int i) {
        this.LLILLJJLI = i;
        C1203120hPi c1203120hPi = this.LL;
        c1203120hPi.notifyItemChanged(0);
        c1203120hPi.notifyItemChanged(C1697810uHb.LJIIJ(c1203120hPi.LLILLJJLI));
    }

    public final void setOnReselectedListener(InterfaceC1195450hDL interfaceC1195450hDL) {
        this.LL.LLILZIL = interfaceC1195450hDL;
    }

    public final void setOnSelectedChangeListener(InterfaceC1203170hPn interfaceC1203170hPn) {
        this.LL.LLILZ = interfaceC1203170hPn;
    }

    public final void setSelectionStyle(InterfaceC1203260hPw interfaceC1203260hPw) {
        C1203120hPi c1203120hPi = this.LL;
        c1203120hPi.LLIZLLLIL = interfaceC1203260hPw;
        if ((interfaceC1203260hPw instanceof C1582480rHa) && c1203120hPi.LLILLL.size() > 1) {
            c1203120hPi.LLLII(((Number) C13LP.LJJZZIII(c1203120hPi.LLILLL)).intValue(), true, new AbstractC1203190hPp() { // from class: X.0hPo
            });
        }
        c1203120hPi.notifyItemRangeChanged(0, c1203120hPi.LLILLJJLI.size());
    }

    public final void setVariant(EnumC1166860gTE enumC1166860gTE) {
        C1203120hPi c1203120hPi = this.LL;
        c1203120hPi.LLILZLL = enumC1166860gTE;
        c1203120hPi.notifyItemRangeChanged(0, c1203120hPi.LLILLJJLI.size());
    }

    public final void setWidthRule(InterfaceC1170390gYv interfaceC1170390gYv) {
        C1203120hPi c1203120hPi = this.LL;
        c1203120hPi.LLIZ = interfaceC1170390gYv;
        c1203120hPi.notifyItemRangeChanged(0, c1203120hPi.LLILLJJLI.size());
    }

    public C1203130hPj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C1203120hPi c1203120hPi = new C1203120hPi(context);
        this.LL = c1203120hPi;
        this.LLILLJJLI = 8;
        RecyclerView recyclerView = new RecyclerView(context);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(c1203120hPi);
        recyclerView.setItemAnimator(null);
        recyclerView.addItemDecoration(new C1151500g4S(this, 1));
        this.LLILLL = recyclerView;
        addView(recyclerView, new FrameLayout.LayoutParams(-1, -2));
    }

    public final void LIZ(int i, boolean z, AbstractC1203190hPp abstractC1203190hPp) {
        C1203120hPi c1203120hPi = this.LL;
        if (i >= 0 && i < c1203120hPi.LLILLJJLI.size()) {
            InterfaceC1203260hPw interfaceC1203260hPw = c1203120hPi.LLIZLLLIL;
            if (interfaceC1203260hPw instanceof C1582480rHa) {
                c1203120hPi.LLLII(i, z, abstractC1203190hPp);
                return;
            } else {
                if (interfaceC1203260hPw instanceof C1582500rHc) {
                    c1203120hPi.LLLI(i, z, abstractC1203190hPp);
                    return;
                }
                throw new C1954807lC();
            }
        }
        c1203120hPi.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No chip at position ");
        sbLIZ.append(i);
        sbLIZ.append('.');
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
