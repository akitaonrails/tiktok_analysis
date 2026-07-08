package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0Qrg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C683620Qrg extends AbstractC654930PmV {
    public final String LLILLL;
    public final InterfaceC1620210sGR LLILZ;
    public final boolean LLILZIL;
    public View LLILZLL;
    public RecyclerView.ViewHolder LLIZ;
    public C0P6P LLIZLLLIL;

    @Override // X.AbstractC683510QrV, X.AbstractC438050HFr
    public final void onBindFooterViewHolder(RecyclerView.ViewHolder viewHolder) {
        if (this.LLILZLL != null && (viewHolder instanceof C683630Qrh)) {
            int i = this.mmLoadMoreState.LIZ;
            if (i != 0) {
                if (i != 1) {
                    C786410Ut5.LLLZLZ((C1749280vcc) viewHolder.itemView.findViewById(R.id.m1s), 8);
                    C786410Ut5.LJZ(8, (FrameLayout) viewHolder.itemView.findViewById(R.id.m1r));
                    viewHolder.itemView.invalidate();
                    C0P6P c0p6p = this.LLIZLLLIL;
                    if (c0p6p != null) {
                        c0p6p.LJJIFFI();
                        return;
                    }
                    return;
                }
                C1749280vcc c1749280vcc = (C1749280vcc) viewHolder.itemView.findViewById(R.id.m1s);
                C1722300uv6 c1722300uv6 = new C1722300uv6();
                C1893080zMY.LJ(c1722300uv6);
                c1749280vcc.setStatus(c1722300uv6);
                C786410Ut5.LLLZLZ((C1749280vcc) viewHolder.itemView.findViewById(R.id.m1s), 8);
                C786410Ut5.LJZ(0, (FrameLayout) viewHolder.itemView.findViewById(R.id.m1r));
                viewHolder.itemView.invalidate();
                return;
            }
            ((C1749280vcc) viewHolder.itemView.findViewById(R.id.m1s)).LJ();
            C786410Ut5.LLLZLZ((C1749280vcc) viewHolder.itemView.findViewById(R.id.m1s), 0);
            C786410Ut5.LJZ(8, (FrameLayout) viewHolder.itemView.findViewById(R.id.m1r));
            viewHolder.itemView.invalidate();
            return;
        }
        super.onBindFooterViewHolder(viewHolder);
    }

    @Override // X.AbstractC683510QrV, X.AbstractC438050HFr
    public final RecyclerView.ViewHolder onCreateFooterViewHolder(ViewGroup viewGroup) {
        View view = this.LLILZLL;
        if (view == null) {
            return super.onCreateFooterViewHolder(viewGroup);
        }
        RecyclerView.ViewHolder viewHolder = this.LLIZ;
        if (viewHolder == null) {
            final View viewTd = C786410Ut5.Td(C786410Ut5.ne(view.getContext()), R.layout.czw, null, false);
            ViewGroup viewGroup2 = (ViewGroup) viewTd.findViewById(R.id.m1r);
            if (viewGroup2 != null) {
                viewGroup2.addView(view);
            }
            C786410Ut5.W5(viewTd, new LinearLayout.LayoutParams(-1, -2));
            viewHolder = new RecyclerView.ViewHolder(viewTd) { // from class: X.0Qrh
            };
        }
        this.LLIZ = viewHolder;
        return viewHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC683590Qrd
    public final void setData(List<Aweme> list) {
        if (list == 0) {
            return;
        }
        this.mmItems = list;
        notifyDataSetChanged();
    }

    @Override // X.AbstractC683510QrV
    public final void setLoadMoreListener(C0P6P c0p6p) {
        super.setLoadMoreListener(c0p6p);
        this.LLIZLLLIL = c0p6p;
    }

    @Override // X.AbstractC683560Qra, X.AbstractC438050HFr
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (!(viewHolder instanceof C1620170sGN)) {
            return;
        }
        List<T> list = this.mmItems;
        Aweme aweme = null;
        if (list != 0 && i >= 0 && i < list.size()) {
            aweme = (Aweme) ListProtector.get(list, i);
        }
        C1620170sGN c1620170sGN = (C1620170sGN) viewHolder;
        c1620170sGN.P5(aweme);
        c1620170sGN.getClass();
    }

    @Override // X.AbstractC683560Qra, X.AbstractC438050HFr
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        int i2 = C1620170sGN.LLIZLLLIL;
        return new C1620170sGN(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.czu, viewGroup, false), this.LLILLL, this.LLILZ, this.LLILZIL);
    }

    public C683620Qrg(String str, InterfaceC1620210sGR interfaceC1620210sGR, boolean z) {
        this.LLILLL = str;
        this.LLILZ = interfaceC1620210sGR;
        this.LLILZIL = z;
    }
}
