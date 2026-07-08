package X;

import Y.ARunnableS108S0100000_8;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0M1s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C561820M1s extends AbstractC562050M2p<C561950M2f> {
    public static final int LLILZIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
    public final C01GW LL;
    public C0M1M LLILLJJLI;
    public final ARunnableS108S0100000_8 LLILLL;
    public final ARunnableS108S0100000_8 LLILZ;

    public final void L5() {
        HandlerHook.viewRemoveCallbacks(this.itemView, this.LLILZ);
        HandlerHook.viewPostDelay(this.itemView, this.LLILZ, 100L);
    }

    public C561820M1s(View view) {
        super(view);
        this.LL = C452501pT.LIZIZ(new AwS552S0100000_8(view, 870));
        this.LLILLL = new ARunnableS108S0100000_8(this, 102);
        this.LLILZ = new ARunnableS108S0100000_8(this, 103);
    }

    @Override // X.AbstractC562050M2p
    public final void I5(C561950M2f c561950M2f, int i) {
        ViewGroup.MarginLayoutParams layoutParams;
        if (!(c561950M2f instanceof C0M1M)) {
            return;
        }
        this.LLILLJJLI = (C0M1M) c561950M2f;
        HandlerHook.viewRemoveCallbacks(this.itemView, this.LLILZ);
        ViewGroup.LayoutParams layoutParams2 = this.itemView.getLayoutParams();
        if (layoutParams2 instanceof RecyclerView.LayoutParams) {
            layoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null) {
            layoutParams = new RecyclerView.LayoutParams(-1, -2);
        }
        if (layoutParams.width != -1) {
            layoutParams.width = -1;
            C786410Ut5.W5(this.itemView, layoutParams);
        }
        HandlerHook.viewRemoveCallbacks(this.itemView, this.LLILLL);
        HandlerHook.viewPost(this.itemView, this.LLILLL);
    }
}
