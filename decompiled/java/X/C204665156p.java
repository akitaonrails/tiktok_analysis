package X;

import Y.ARunnableS7S1201000_31;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.156p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204665156p {
    public RecyclerView LIZIZ;
    public C20494715Hl LIZJ;
    public Function0<Boolean> LIZLLL;
    public boolean LIZ = true;
    public final C204666156q LJ = new InterfaceC21676519sR() { // from class: X.156q
        @Override // X.InterfaceC21676519sR
        public final void m3(View view) {
        }

        @Override // X.InterfaceC21676519sR
        public final void g5(View view) {
            int adapterPosition;
            RecyclerView recyclerView = this.LL.LIZIZ;
            if (recyclerView == null) {
                return;
            }
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
            Integer numValueOf = Integer.valueOf(childViewHolder.getBindingAdapterPosition());
            if (numValueOf.intValue() >= 0) {
                adapterPosition = numValueOf.intValue();
            } else {
                adapterPosition = childViewHolder.getAdapterPosition();
            }
            if (adapterPosition < 0) {
                return;
            }
            this.LL.LIZJ(childViewHolder, adapterPosition);
        }
    };

    public final void LIZ() {
        this.LIZ = false;
        RecyclerView recyclerView = this.LIZIZ;
        if (recyclerView != null) {
            recyclerView.removeOnChildAttachStateChangeListener(this.LJ);
        }
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
    }

    public final void LIZLLL() {
        RecyclerView recyclerView;
        C20494715Hl c20494715Hl;
        LinearLayoutManager linearLayoutManager;
        List<C20448614zs> data;
        int iMin;
        if (!this.LIZ) {
            return;
        }
        if (C204658156i.LIZIZ()) {
            LIZ();
            return;
        }
        Function0<Boolean> function0 = this.LIZLLL;
        if (function0 == null || !function0.invoke().booleanValue() || (recyclerView = this.LIZIZ) == null || (c20494715Hl = this.LIZJ) == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null || (data = c20494715Hl.getData()) == null || C086I.LIZIZ(data)) {
            return;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition < 0 || iFindLastVisibleItemPosition < 0 || iFindFirstVisibleItemPosition > (iMin = Math.min(iFindLastVisibleItemPosition, data.size() - 1))) {
            return;
        }
        while (true) {
            MusicModel musicModelLIZIZ = LIZIZ(iFindFirstVisibleItemPosition);
            if (musicModelLIZIZ != null && musicModelLIZIZ.isRealMusicItem().booleanValue() && C204658156i.LIZ(musicModelLIZIZ)) {
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
                if (viewHolderFindViewHolderForAdapterPosition instanceof C15IP) {
                    LIZJ(viewHolderFindViewHolderForAdapterPosition, iFindFirstVisibleItemPosition);
                    return;
                }
            }
            if (iFindFirstVisibleItemPosition == iMin) {
                return;
            } else {
                iFindFirstVisibleItemPosition++;
            }
        }
    }

    public final MusicModel LIZIZ(int i) {
        List<C20448614zs> data;
        C20448614zs c20448614zs;
        C20494715Hl c20494715Hl = this.LIZJ;
        if (c20494715Hl != null && (data = c20494715Hl.getData()) != null && (c20448614zs = (C20448614zs) C13LP.LJJJLZIJ(i, data)) != null) {
            return c20448614zs.LIZIZ;
        }
        return null;
    }

    public final void LIZJ(RecyclerView.ViewHolder viewHolder, int i) {
        MusicModel musicModelLIZIZ;
        if (!this.LIZ) {
            return;
        }
        C204658156i c204658156i = C204658156i.LIZ;
        if (C204658156i.LIZIZ()) {
            LIZ();
            return;
        }
        Function0<Boolean> function0 = this.LIZLLL;
        if (function0 == null || !function0.invoke().booleanValue() || !(viewHolder instanceof C15IP) || (musicModelLIZIZ = LIZIZ(i)) == null || !musicModelLIZIZ.isRealMusicItem().booleanValue() || !C204658156i.LIZ(musicModelLIZIZ) || !c204658156i.LIZLLL()) {
            return;
        }
        HandlerHook.viewPost(viewHolder.itemView, new ARunnableS7S1201000_31(this, i, musicModelLIZIZ.getMusicId(), viewHolder, 4));
    }
}
