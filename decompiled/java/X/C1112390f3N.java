package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.chatroom.ui.SmoothLinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0f3N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1112390f3N {
    public final C781550UlF LIZ;
    public boolean LIZIZ = true;
    public AbstractC1111600f26 LIZJ;
    public SmoothLinearLayoutManager LIZLLL;

    public final boolean LIZ() {
        C781550UlF c781550UlF = this.LIZ;
        if (c781550UlF != null) {
            return c781550UlF.canScrollVertically(1);
        }
        return false;
    }

    public final void LIZJ() {
        C781550UlF c781550UlF = this.LIZ;
        if (c781550UlF != null) {
            c781550UlF.LLJIJIL = false;
        }
    }

    public final int LIZLLL() {
        SmoothLinearLayoutManager smoothLinearLayoutManager = this.LIZLLL;
        if (smoothLinearLayoutManager != null) {
            return smoothLinearLayoutManager.findFirstCompletelyVisibleItemPosition();
        }
        return 0;
    }

    public final int LJ() {
        SmoothLinearLayoutManager smoothLinearLayoutManager = this.LIZLLL;
        if (smoothLinearLayoutManager != null) {
            return smoothLinearLayoutManager.findFirstVisibleItemPosition();
        }
        return 0;
    }

    public final int LJFF() {
        SmoothLinearLayoutManager smoothLinearLayoutManager = this.LIZLLL;
        if (smoothLinearLayoutManager != null) {
            return smoothLinearLayoutManager.findLastVisibleItemPosition();
        }
        return 0;
    }

    public C1112390f3N(C781550UlF c781550UlF) {
        this.LIZ = c781550UlF;
    }

    public final void LIZIZ(Function0<Unit> function0) {
        if (this.LIZIZ) {
            function0.invoke();
        }
    }

    public final RecyclerView.ViewHolder LJI(int i) {
        C781550UlF c781550UlF = this.LIZ;
        if (c781550UlF != null) {
            return c781550UlF.findViewHolderForAdapterPosition(i);
        }
        return null;
    }

    public final void LJII(AbstractC21673719rz abstractC21673719rz) {
        C781550UlF c781550UlF = this.LIZ;
        if (c781550UlF != null) {
            c781550UlF.setItemAnimator(abstractC21673719rz);
        }
    }
}
