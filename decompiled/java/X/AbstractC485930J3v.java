package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0J3v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC485930J3v<T, VH extends RecyclerView.ViewHolder> extends C0J8P<T, VH> {
    public final int LIZIZ;
    public final Boolean LIZJ;

    @Override // X.C0J8P
    public void LIZJ(VH vh, T t) {
    }

    public abstract VH LJIIIIZZ(View view, ViewGroup viewGroup);

    @Override // X.C0J8P
    public void LJII(VH vh) {
        vh.itemView.setTag(R.id.en4, null);
    }

    public AbstractC485930J3v(int i, Boolean bool) {
        this.LIZIZ = i;
        this.LIZJ = bool;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final VH LJIIJ(android.view.LayoutInflater r5, android.view.ViewGroup r6) {
        /*
            r4 = this;
            java.lang.Class r1 = r4.getClass()
            X.0J3q r3 = X.C485880J3q.LIZ
            r3.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.Class<?>, X.0J3u> r0 = X.C485880J3q.LIZLLL
            java.lang.Object r0 = r0.get(r1)
            X.0J3u r0 = (X.C485920J3u) r0
            if (r0 == 0) goto L5e
            int r2 = r0.LIZ
            boolean r1 = r0.LIZIZ
            boolean r0 = r0.LIZJ
            if (r0 == 0) goto L35
            com.bytedance.android.livesdk.livesetting.performance.LiveRecyclerviewPerformanceOptSwitchSetting r0 = com.bytedance.android.livesdk.livesetting.performance.LiveRecyclerviewPerformanceOptSwitchSetting.INSTANCE
            boolean r0 = r0.enableViewHolderLayoutPreload()
            if (r0 == 0) goto L35
            android.view.View r0 = r3.LIZLLL(r2, r1)
            if (r0 == 0) goto L3e
            if (r1 == 0) goto L30
            if (r6 == 0) goto L30
            r6.addView(r0)
        L30:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r4.LJIIIIZZ(r0, r6)
            return r0
        L35:
            X.0J44 r0 = X.C485880J3q.LJ
            if (r0 == 0) goto L48
            android.view.View r0 = X.C485880J3q.LIZ(r0, r2, r6, r1)
            goto L46
        L3e:
            X.0J44 r0 = X.C485880J3q.LJ
            if (r0 == 0) goto L48
            android.view.View r0 = X.C485880J3q.LIZ(r0, r2, r6, r1)
        L46:
            if (r0 != 0) goto L30
        L48:
            if (r6 == 0) goto L50
            android.view.View r0 = X.C500260Jjc.LJIILL(r2, r6, r1)
            if (r0 != 0) goto L30
        L50:
            android.content.Context r0 = X.C497740JfY.LJII()
            android.view.LayoutInflater r0 = X.C786410Ut5.ne(r0)
            android.view.View r0 = X.C786410Ut5.Td(r0, r2, r6, r1)
            if (r0 != 0) goto L30
        L5e:
            int r1 = r4.LIZIZ
            java.lang.Boolean r0 = r4.LIZJ
            boolean r0 = r0.booleanValue()
            android.view.View r0 = r3.LIZJ(r1, r6, r0)
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC485930J3v.LJIIJ(android.view.LayoutInflater, android.view.ViewGroup):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }

    @Override // X.C0J8P
    public void LIZLLL(VH vh, T t, List<Object> list) {
        LIZJ(vh, t);
    }
}
