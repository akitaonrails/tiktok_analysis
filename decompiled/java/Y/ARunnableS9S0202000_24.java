package Y;

import X.C098200Yq;
import X.C1206204nk;
import X.C1598660rhg;
import X.C1599050riJ;
import X.C1599060riK;
import X.C189200o6;
import X.C1C7U;
import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageSeekAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import java.util.List;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public class ARunnableS9S0202000_24 implements Runnable {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        LifecycleOwner lifecycleOwner;
        Object c098200Yq;
        Object c098200Yq2;
        if (((View) this.l0).isAttachedToWindow()) {
            ViewParent parent = ((View) this.l0).getParent();
            RecyclerView recyclerView = (RecyclerView) this.l1;
            if (parent == recyclerView) {
                Object context = recyclerView.getContext();
                if (!(context instanceof LifecycleOwner) || (lifecycleOwner = (LifecycleOwner) context) == null) {
                    return;
                }
                try {
                    C1598660rhg.LIZ.getClass();
                    c098200Yq = C1598660rhg.LJII(lifecycleOwner);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                SkylightListViewModel skylightListViewModel = (SkylightListViewModel) c098200Yq;
                if (skylightListViewModel == null || C1599060riK.LIZIZ.LIZIZ.LIZIZ() || skylightListViewModel.LJJIIJZLJL() || skylightListViewModel.GQ2()) {
                    return;
                }
                if (!C1206204nk.LIZ()) {
                    try {
                        c098200Yq2 = Boolean.valueOf(skylightListViewModel.FQ2().pageToken() != null);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        c098200Yq2 = new C098200Yq(th2);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    }
                    Boolean bool = (Boolean) (C189200o6.m7isFailureimpl(c098200Yq2) ? null : c098200Yq2);
                    if (bool == null || !bool.booleanValue()) {
                        return;
                    }
                } else if (skylightListViewModel.LLJJJJLIIL.length() <= 0) {
                    return;
                }
                C1599060riK.LIZ.LIZ(skylightListViewModel, lifecycleOwner, "display-based trigger load more: curInvisibleCount=" + this.i2 + ", maxInvisibleCount=" + this.i3, new AwS568S0100000_24(skylightListViewModel, 1854));
            }
        }
    }

    public static final void run$0(ARunnableS9S0202000_24 aRunnableS9S0202000_24) {
        boolean zLIZ;
        C1C7U.LIZ("MainPageSeekAssem@7efc.onViewCreated$1$1$2");
        try {
            MainPageSeekAssem mainPageSeekAssem = (MainPageSeekAssem) aRunnableS9S0202000_24.l0;
            List list = (List) aRunnableS9S0202000_24.l1;
            int i = aRunnableS9S0202000_24.i2;
            int i2 = aRunnableS9S0202000_24.i3;
            mainPageSeekAssem.getClass();
            MainPageSeekAssem.Ho(i, i2, list);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MainPageSeekAssem@7efc.onViewCreated$1$1$2");
    }

    public static final void run$1(ARunnableS9S0202000_24 aRunnableS9S0202000_24) {
        boolean zLIZ;
        C1C7U.LIZ("InboxSkylightLoadMoreOnBindTrigger@4380.onChildViewAttachedToWindow$1");
        try {
            aRunnableS9S0202000_24.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InboxSkylightLoadMoreOnBindTrigger@4380.onChildViewAttachedToWindow$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS9S0202000_24(MainPageSeekAssem mainPageSeekAssem, MainPageSeekAssem mainPageSeekAssem2, List<View> list, int i, int i2) {
        this.$t = i2;
        this.l0 = mainPageSeekAssem;
        this.l1 = mainPageSeekAssem2;
        this.i2 = list;
        this.i3 = i;
    }

    public ARunnableS9S0202000_24(View view, RecyclerView recyclerView, C1599050riJ c1599050riJ, int i, int i2, int i3) {
        this.$t = i3;
        this.l0 = view;
        this.l1 = recyclerView;
        this.i2 = i;
        this.i3 = i2;
    }
}
