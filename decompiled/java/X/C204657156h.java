package X;

import Y.ARunnableS7S1201000_31;
import Y.AsS56S0100000_31;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.156h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204657156h {
    public boolean LIZIZ;
    public RecyclerView LIZJ;
    public C129G LIZLLL;
    public Function0<Boolean> LJ;
    public boolean LIZ = true;
    public boolean LJFF = true;
    public final AsS56S0100000_31 LJI = new AsS56S0100000_31(this, 13);
    public final C204659156j LJII = new InterfaceC21676519sR() { // from class: X.156j
        @Override // X.InterfaceC21676519sR
        public final void m3(View view) {
        }

        @Override // X.InterfaceC21676519sR
        public final void g5(View view) {
            boolean z;
            int adapterPosition;
            AnonymousClass1298 anonymousClass1298;
            RecyclerView recyclerView = this.LL.LIZJ;
            if (recyclerView == null) {
                return;
            }
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
            Integer numValueOf = Integer.valueOf(childViewHolder.getBindingAdapterPosition());
            if (numValueOf.intValue() >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                adapterPosition = numValueOf.intValue();
            } else {
                adapterPosition = childViewHolder.getAdapterPosition();
            }
            if (adapterPosition < 0) {
                return;
            }
            if (this.LL.LIZIZ) {
                if ((childViewHolder instanceof AnonymousClass1298) && (anonymousClass1298 = (AnonymousClass1298) childViewHolder) != null) {
                    anonymousClass1298.S5(false);
                    anonymousClass1298.V5(false);
                }
                this.LL.LJI();
                return;
            }
            this.LL.LJFF(childViewHolder, adapterPosition);
        }
    };

    public final void LIZJ() {
        this.LIZ = false;
        RecyclerView recyclerView = this.LIZJ;
        if (recyclerView != null) {
            recyclerView.removeOnChildAttachStateChangeListener(this.LJII);
        }
        RecyclerView recyclerView2 = this.LIZJ;
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(this.LJI);
        }
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x00d1 A[PHI: r2 r11
      0x00d1: PHI (r2v7 int) = (r2v6 int), (r2v6 int), (r2v6 int), (r2v6 int), (r2v9 int), (r2v9 int) binds: [B:33:0x0060, B:35:0x0064, B:37:0x006a, B:39:0x0070, B:60:0x00a1, B:61:0x00a3] A[DONT_GENERATE, DONT_INLINE]
      0x00d1: PHI (r11v4 int) = (r11v3 int), (r11v3 int), (r11v3 int), (r11v3 int), (r11v6 int), (r11v6 int) binds: [B:33:0x0060, B:35:0x0064, B:37:0x006a, B:39:0x0070, B:60:0x00a1, B:61:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00d6 A[PHI: r2 r11
      0x00d6: PHI (r2v3 int) = (r2v2 int), (r2v8 int), (r2v8 int) binds: [B:30:0x0057, B:62:0x00a5, B:63:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x00d6: PHI (r11v1 int) = (r11v0 int), (r11v5 int), (r11v5 int) binds: [B:30:0x0057, B:62:0x00a5, B:63:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI() {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204657156h.LJI():void");
    }

    public final void LJII() {
        RecyclerView recyclerView;
        C129G c129g;
        LinearLayoutManager linearLayoutManager;
        List<MusicModel> data;
        int iMin;
        AnonymousClass1298 anonymousClass1298;
        MusicModel musicModelLIZLLL;
        if (!this.LIZ) {
            return;
        }
        if (C204658156i.LIZIZ()) {
            LIZJ();
            return;
        }
        Function0<Boolean> function0 = this.LJ;
        if (function0 == null || !function0.invoke().booleanValue() || (recyclerView = this.LIZJ) == null || (c129g = this.LIZLLL) == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null || (data = c129g.getData()) == null || data.isEmpty()) {
            return;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition < 0 || iFindLastVisibleItemPosition < 0 || iFindFirstVisibleItemPosition > (iMin = Math.min(iFindLastVisibleItemPosition, data.size() - 1))) {
            return;
        }
        while (true) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
            if ((viewHolderFindViewHolderForAdapterPosition instanceof AnonymousClass1298) && (anonymousClass1298 = (AnonymousClass1298) viewHolderFindViewHolderForAdapterPosition) != null && anonymousClass1298.L5() && (musicModelLIZLLL = LIZLLL(iFindFirstVisibleItemPosition)) != null && (!(musicModelLIZLLL instanceof C129P)) && !LJ(musicModelLIZLLL) && C204658156i.LIZ(musicModelLIZLLL)) {
                LJFF(anonymousClass1298, iFindFirstVisibleItemPosition);
                return;
            } else if (iFindFirstVisibleItemPosition == iMin) {
                return;
            } else {
                iFindFirstVisibleItemPosition++;
            }
        }
    }

    public final MusicModel LIZLLL(int i) {
        List<MusicModel> data;
        C129G c129g = this.LIZLLL;
        if (c129g != null && (data = c129g.getData()) != null) {
            return (MusicModel) C13LP.LJJJLZIJ(i, data);
        }
        return null;
    }

    public final boolean LJ(MusicModel musicModel) {
        C129G c129g = this.LIZLLL;
        if (c129g == null || !c129g.LLLI(musicModel)) {
            return false;
        }
        return true;
    }

    public final void LIZIZ(LinearLayoutManager linearLayoutManager, RecyclerView recyclerView) {
        List<MusicModel> data;
        int iMin;
        AnonymousClass1298 anonymousClass1298;
        C129G c129g = this.LIZLLL;
        if (c129g == null || (data = c129g.getData()) == null) {
            return;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition < 0 || iFindLastVisibleItemPosition < 0 || iFindFirstVisibleItemPosition > (iMin = Math.min(iFindLastVisibleItemPosition, data.size() - 1))) {
            return;
        }
        while (true) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
            if ((viewHolderFindViewHolderForAdapterPosition instanceof AnonymousClass1298) && (anonymousClass1298 = (AnonymousClass1298) viewHolderFindViewHolderForAdapterPosition) != null) {
                anonymousClass1298.S5(false);
                anonymousClass1298.V5(false);
            }
            if (iFindFirstVisibleItemPosition != iMin) {
                iFindFirstVisibleItemPosition++;
            } else {
                return;
            }
        }
    }

    public final void LJFF(RecyclerView.ViewHolder viewHolder, int i) {
        AnonymousClass1298 anonymousClass1298;
        MusicModel musicModelLIZLLL;
        if (!this.LIZ) {
            return;
        }
        if (this.LIZIZ) {
            LJI();
            return;
        }
        C204658156i c204658156i = C204658156i.LIZ;
        if (C204658156i.LIZIZ()) {
            LIZJ();
            return;
        }
        Function0<Boolean> function0 = this.LJ;
        if (function0 == null || !function0.invoke().booleanValue() || !(viewHolder instanceof AnonymousClass1298) || (anonymousClass1298 = (AnonymousClass1298) viewHolder) == null || !anonymousClass1298.L5() || (musicModelLIZLLL = LIZLLL(i)) == null || !(true ^ (musicModelLIZLLL instanceof C129P)) || LJ(musicModelLIZLLL) || !C204658156i.LIZ(musicModelLIZLLL) || !c204658156i.LIZLLL()) {
            return;
        }
        HandlerHook.viewPost(anonymousClass1298.itemView, new ARunnableS7S1201000_31(this, i, musicModelLIZLLL.getMusicId(), anonymousClass1298, 1));
    }

    public final void LIZ(RecyclerView recyclerView, C129G c129g, Function0<Boolean> function0, boolean z) {
        if (!this.LIZ) {
            return;
        }
        RecyclerView recyclerView2 = this.LIZJ;
        if (recyclerView2 != null) {
            recyclerView2.removeOnChildAttachStateChangeListener(this.LJII);
        }
        RecyclerView recyclerView3 = this.LIZJ;
        if (recyclerView3 != null) {
            recyclerView3.removeOnScrollListener(this.LJI);
        }
        this.LIZJ = recyclerView;
        this.LIZLLL = c129g;
        this.LJ = function0;
        this.LIZIZ = z;
        recyclerView.addOnChildAttachStateChangeListener(this.LJII);
        if (z) {
            recyclerView.addOnScrollListener(this.LJI);
            LJI();
        } else {
            LJII();
        }
    }
}
