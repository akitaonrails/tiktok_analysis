package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0U9T, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U9T extends C0U9B {
    public final boolean LLJJJIL;
    public final Function1<LiveEffect, Unit> LLJJJJ;

    @Override // X.C0U9B, X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i >= 0 && i < ((ArrayList) this.LL).size()) {
            return ((LiveEffect) ListProtector.get(this.LL, i)).LJLIL().getValue();
        }
        if (((ArrayList) this.LL).size() > 1) {
            return ((LiveEffect) ListProtector.get(this.LL, 1)).LJLIL().getValue();
        }
        return C0U9E.NORMAL.getValue();
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        if (recyclerView.getLayoutManager() != null && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            final AbstractC214823195h abstractC214823195h = gridLayoutManager.LLIZ;
            gridLayoutManager.LJIJI(new AbstractC214823195h() { // from class: X.0U9U
                @Override // X.AbstractC214823195h
                public final int LJFF(int i) {
                    int itemViewType = this.LJ.getItemViewType(i);
                    if (itemViewType != C0U9E.TRENDING_TIP.getValue() && itemViewType != C0U9E.NO_RESULT_TIP.getValue()) {
                        return abstractC214823195h.LJFF(i);
                    }
                    return gridLayoutManager.LLILLJJLI;
                }
            });
        }
    }

    @Override // X.C0U9B
    public final void LLZ(LiveEffect liveEffect, boolean z) {
        if (this.LLJJJIL) {
            return;
        }
        super.LLZ(liveEffect, z);
    }

    @Override // X.C0U9B, X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c0u9g;
        if (i == C0U9E.TRENDING_TIP.getValue()) {
            C01GW c01gw = C485950J3x.LIZ;
            final View viewLIZIZ = C485950J3x.LIZIZ(viewGroup.getContext(), R.layout.gfb, viewGroup, false);
            c0u9g = new RecyclerView.ViewHolder(viewLIZIZ) { // from class: X.0U9W
                {
                    super(viewLIZIZ);
                    viewLIZIZ.findViewById(R.id.ykq);
                }
            };
        } else if (i == C0U9E.NO_RESULT_TIP.getValue()) {
            C01GW c01gw2 = C485950J3x.LIZ;
            final View viewLIZIZ2 = C485950J3x.LIZIZ(viewGroup.getContext(), R.layout.gf_, viewGroup, false);
            c0u9g = new RecyclerView.ViewHolder(viewLIZIZ2) { // from class: X.0U9V
                {
                    super(viewLIZIZ2);
                    viewLIZIZ2.findViewById(R.id.pad);
                }
            };
        } else if (i == C0U9E.SEARCH_OP2.getValue()) {
            C01GW c01gw3 = C485950J3x.LIZ;
            final View viewLIZIZ3 = C485950J3x.LIZIZ(viewGroup.getContext(), R.layout.gf9, viewGroup, false);
            c0u9g = new C0U9G(viewLIZIZ3) { // from class: X.0U9S
                {
                    super(viewLIZIZ3);
                    viewLIZIZ3.findViewById(R.id.w6h);
                    viewLIZIZ3.findViewById(R.id.use_times);
                }
            };
        } else {
            C01GW c01gw4 = C485950J3x.LIZ;
            c0u9g = new C0U9G(C485950J3x.LIZIZ(viewGroup.getContext(), R.layout.gey, viewGroup, false));
        }
        try {
            View view = c0u9g.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0u9g.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0u9g.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c0u9g.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0u9g.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0u9g.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c0u9g.getClass().getName();
        return c0u9g;
    }

    @Override // X.C0U9B
    public final boolean LLLLZLLIL(LiveEffect liveEffect, RecyclerView.ViewHolder viewHolder, boolean z) {
        Function1<LiveEffect, Unit> function1;
        boolean zLLLLZLLIL = super.LLLLZLLIL(liveEffect, viewHolder, true);
        if (this.LLJJJIL && (function1 = this.LLJJJJ) != null) {
            if (!zLLLLZLLIL) {
                liveEffect = null;
            }
            function1.invoke(liveEffect);
        }
        return zLLLLZLLIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0U9T(boolean z, DataChannel dataChannel, StickerEffectViewModel stickerEffectViewModel, Function1<? super LiveEffect, Unit> function1) {
        super(dataChannel, stickerEffectViewModel);
        this.LLJJJIL = z;
        this.LLJJJJ = function1;
    }
}
