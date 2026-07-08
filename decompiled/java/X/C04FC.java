package X;

import Y.ARunnableS101S0100000_1;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04FC, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04FC extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C04FA LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04FC(int i, C04FA c04fa, boolean z) {
        super(0);
        this.LL = c04fa;
        this.LLILLJJLI = i;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C04FA c04fa = this.LL;
        if (c04fa.LLJILLL != this.LLILLJJLI) {
            RecyclerView specListFromXml = c04fa.getSpecListFromXml();
            final C04FA c04fa2 = this.LL;
            final boolean z = this.LLILLL;
            final int i = this.LLILLJJLI;
            HandlerHook.viewPost(specListFromXml, new Runnable() { // from class: X.04FB
                public final void LIZ() {
                    LinearLayoutManager linearLayoutManager;
                    C04FA c04fa3 = c04fa2;
                    if (c04fa3.LLJJJ == -1 || !(c04fa3.getSpecListFromXml().getLayoutManager() instanceof GridLayoutManager)) {
                        if (z) {
                            c04fa2.l0();
                            return;
                        } else {
                            c04fa2.getSpecListFromXml().scrollToPosition(i);
                            return;
                        }
                    }
                    RecyclerView.LayoutManager layoutManager = c04fa2.getSpecListFromXml().getLayoutManager();
                    if (!(layoutManager instanceof GridLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
                        return;
                    }
                    C04FA c04fa4 = c04fa2;
                    linearLayoutManager.scrollToPositionWithOffset(c04fa4.LLJJJ, c04fa4.LLJJJIL);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("HorizontalScrollingSpecLayout@73a6.select$1$1$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("HorizontalScrollingSpecLayout@73a6.select$1$1$1");
                }
            });
            HandlerHook.viewPost(this.LL.getSpecListFromXml(), new ARunnableS101S0100000_1((Object) this.LL, 55));
            C04FA c04fa3 = this.LL;
            c04fa3.LLJILLL = c04fa3.LLJILJILJ;
        }
        return Unit.LIZ;
    }
}
