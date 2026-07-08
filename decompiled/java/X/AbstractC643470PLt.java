package X;

import Y.AsS37S0100000_10;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0PLt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC643470PLt extends AbstractC739960T0w {
    public static int LLIZLLLIL;
    public final InterfaceC659300PtY LL;
    public final InterfaceC683650Qrj LLILLJJLI;
    public int LLILLL;
    public RecyclerView LLILZ;
    public C645140PSe LLILZIL;
    public C0PVB LLILZLL;
    public boolean LLIZ;

    public abstract C645140PSe LJJJJ();

    public abstract C0DXR LJJJJJ();

    @Override // X.AbstractC739960T0w
    public final boolean isRegisterEventBus() {
        return true;
    }

    public abstract RecyclerView.LayoutManager xj0();

    /* JADX WARN: Removed duplicated region for block: B:41:0x0087  */
    @X.C14EU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onVideoEvent(X.C737030Svd r12) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC643470PLt.onVideoEvent(X.0Svd):void");
    }

    public AbstractC643470PLt(InterfaceC659300PtY interfaceC659300PtY, InterfaceC683650Qrj interfaceC683650Qrj) {
        this.LL = interfaceC659300PtY;
        this.LLILLJJLI = interfaceC683650Qrj;
    }

    @Override // X.AbstractC739960T0w, X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public void onViewCreated(View view, Bundle bundle) {
        this.LLILZ = (RecyclerView) view.findViewById(R.id.msy);
        super.onViewCreated(view, bundle);
        this.LLILZ.setLayoutManager(xj0());
        this.LLILZ.addItemDecoration(LJJJJJ());
        this.LLILZ.setItemAnimator(new C423520Gj8());
        C645140PSe c645140PSeLJJJJ = LJJJJ();
        this.LLILZIL = c645140PSeLJJJJ;
        C0PVB c0pvb = new C0PVB(c645140PSeLJJJJ);
        this.LLILZLL = c0pvb;
        this.LLILZ.setAdapter(c0pvb);
        if (!C20595415iS.LIZIZ()) {
            this.LLILZ.addOnScrollListener(new C1260260its());
        }
        RecyclerView recyclerView = this.LLILZ;
        C683660Qrk.LIZ(recyclerView, this.LLILLJJLI, null, 2, false);
        this.LLILZ = recyclerView;
        recyclerView.addOnScrollListener(new AsS37S0100000_10(this, 20));
    }

    public void LJJJJJL(C737030Svd c737030Svd, int i, Aweme aweme, long j) {
        RecyclerView recyclerView;
        if (LLIZLLLIL == 0) {
            LLIZLLLIL = getContext().getResources().getDimensionPixelOffset(R.dimen.a3q);
        }
        if (i != -1 && (this.LLILZ.getLayoutManager() instanceof InterfaceC627000OiY)) {
            if (this.LLILZ.getLayoutManager() instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.LLILZ.getLayoutManager();
                if (this.LLILLL == 0 && (recyclerView = this.LLILZ) != null) {
                    this.LLILLL = recyclerView.getHeight();
                }
                staggeredGridLayoutManager.scrollToPositionWithOffset(i, (this.LLILLL - C341940Daq.LIZ(200.0d)) / 2);
            } else if (this.LLILZ.getLayoutManager() instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) this.LLILZ.getLayoutManager();
                int iFindFirstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = gridLayoutManager.findLastVisibleItemPosition();
                int i2 = gridLayoutManager.LLILLJJLI;
                if (((Number) C1109304Vn.LIZ.getValue()).intValue() == 1 && i2 > 1) {
                    if (i >= iFindFirstVisibleItemPosition && i <= (iFindFirstVisibleItemPosition + i2) - 1) {
                        return;
                    }
                } else if (i >= iFindFirstVisibleItemPosition && i <= iFindLastVisibleItemPosition) {
                    return;
                }
                ((InterfaceC627000OiY) this.LLILZ.getLayoutManager()).scrollToPositionWithOffset(i, 0);
            }
            this.LLIZ = true;
        }
    }
}
