package X;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* JADX INFO: renamed from: X.19WI, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19WI extends ListView implements InterfaceC21548019Uo, InterfaceC21549819Vg, AdapterView.OnItemClickListener {
    public static final int[] LLILLJJLI = {R.attr.background, R.attr.divider};
    public C19V6 LL;

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // X.InterfaceC21548019Uo
    public final boolean LIZ(C21548219Uq c21548219Uq) {
        return this.LL.LJIILLIIL(c21548219Uq, null, 0);
    }

    @Override // X.InterfaceC21549819Vg
    public final void LIZIZ(C19V6 c19v6) {
        this.LL = c19v6;
    }

    public C19WI(Context context, AttributeSet attributeSet) {
        AdapterView.OnItemClickListener c1847850yBb;
        super(context, attributeSet);
        if (C1848410yCV.LIZ) {
            c1847850yBb = new C1847850yBb(this);
        } else {
            c1847850yBb = this;
        }
        setOnItemClickListener(c1847850yBb);
        C21411918qr c21411918qrLJIILIIL = C21411918qr.LJIILIIL(context, attributeSet, LLILLJJLI, R.attr.listViewStyle, 0);
        if (c21411918qrLJIILIIL.LJIIJJI(0)) {
            setBackgroundDrawable(c21411918qrLJIILIIL.LJ(0));
        }
        if (c21411918qrLJIILIIL.LJIIJJI(1)) {
            setDivider(c21411918qrLJIILIIL.LJ(1));
        }
        c21411918qrLJIILIIL.LJIILJJIL();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        LIZ((C21548219Uq) getAdapter().getItem(i));
    }
}
