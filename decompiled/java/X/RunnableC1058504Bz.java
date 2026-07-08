package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;

/* JADX INFO: renamed from: X.04Bz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC1058504Bz implements Runnable {
    public final RecyclerView LL;
    public final int LLILLJJLI;
    public boolean LLILLL;
    public final /* synthetic */ SeaPdpViewModel LLILZ;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SeaPdpViewModel$UpdateFloatShopTask@bfef.run");
        try {
            this.LLILZ.LS2(this.LLILLJJLI, this.LL, this.LLILLL);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SeaPdpViewModel$UpdateFloatShopTask@bfef.run");
    }

    public RunnableC1058504Bz(int i, RecyclerView recyclerView, SeaPdpViewModel seaPdpViewModel, boolean z) {
        this.LLILZ = seaPdpViewModel;
        this.LL = recyclerView;
        this.LLILLJJLI = i;
        this.LLILLL = z;
    }
}
