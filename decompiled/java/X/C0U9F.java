package X;

import Y.ACListenerS116S0200000_12;
import Y.ACListenerS147S0100000_12;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0U9F, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U9F extends C0U9B {
    public final DataChannel LLJJJIL;
    public final C01GW LLJJJJ;

    public C0U9F(DataChannel dataChannel, StickerEffectViewModel stickerEffectViewModel) {
        super(dataChannel, stickerEffectViewModel);
        this.LLJJJIL = dataChannel;
        this.LLJJJJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(267));
    }

    @Override // X.C0U9B, X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c0u9g;
        if (i == C0U9E.NONE.getValue()) {
            c0u9g = new C0U9J(LLZLLIL(R.layout.gf2, viewGroup, this));
        } else if (i == C0U9E.MORE_V1.getValue()) {
            final View viewLLZLLIL = LLZLLIL(R.layout.gf0, viewGroup, this);
            c0u9g = new RecyclerView.ViewHolder(viewLLZLLIL) { // from class: X.0U9R
            };
        } else if (i == C0U9E.MORE_V2.getValue()) {
            final View viewLLZLLIL2 = LLZLLIL(R.layout.gf1, viewGroup, this);
            c0u9g = new RecyclerView.ViewHolder(viewLLZLLIL2) { // from class: X.0U9R
            };
        } else {
            c0u9g = new C0U9G(LLZLLIL(R.layout.gey, viewGroup, this));
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

    public static final View LLZLLIL(int i, ViewGroup viewGroup, C0U9F c0u9f) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), i, viewGroup, false);
        viewTd.getLayoutParams().width = ((Number) c0u9f.LLJJJJ.getValue()).intValue();
        return viewTd;
    }

    @Override // X.C0U9B, X.AbstractC761920Tug
    public final /* bridge */ /* synthetic */ void LLLLL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLLLL(viewHolder, (LiveEffect) obj, i);
    }

    @Override // X.C0U9B, X.AbstractC761920Tug
    public final /* bridge */ /* synthetic */ void LLLLLJIL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLLLLJIL(viewHolder, (LiveEffect) obj, i);
    }

    @Override // X.C0U9B, X.AbstractC761920Tug
    public final /* bridge */ /* synthetic */ void LLLLLL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLLLLL(viewHolder, (LiveEffect) obj, i);
    }

    @Override // X.C0U9B
    /* JADX INFO: renamed from: LLLLZI */
    public final void LLLLL(RecyclerView.ViewHolder viewHolder, LiveEffect liveEffect, int i) {
        C0U9J c0u9j;
        super.LLLLL(viewHolder, liveEffect, i);
        View view = null;
        if ((viewHolder instanceof C0U9J) && (c0u9j = (C0U9J) viewHolder) != null) {
            view = c0u9j.LL;
        }
        C500260Jjc.LLFFF(view);
    }

    @Override // X.C0U9B
    /* JADX INFO: renamed from: LLLLZIL */
    public final void LLLLLJIL(RecyclerView.ViewHolder viewHolder, LiveEffect liveEffect, int i) {
        C0U9J c0u9j;
        super.LLLLLJIL(viewHolder, liveEffect, i);
        View view = null;
        if ((viewHolder instanceof C0U9J) && (c0u9j = (C0U9J) viewHolder) != null) {
            view = c0u9j.LL;
        }
        C500260Jjc.LJIILLIIL(view);
    }

    @Override // X.C0U9B
    /* JADX INFO: renamed from: LLLLZLL */
    public final void LLLLLL(RecyclerView.ViewHolder viewHolder, LiveEffect liveEffect, int i) {
        if (viewHolder instanceof C0U9J) {
            C500260Jjc.LJLJLJ(((C0U9J) viewHolder).LL, C767250U7v.LJIIIIZZ(this.LLILZ));
            C786410Ut5.I7(new ACListenerS116S0200000_12(viewHolder, this, 57), viewHolder.itemView);
        } else if (viewHolder instanceof C0U9R) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 303), viewHolder.itemView);
        } else {
            super.LLLLLL(viewHolder, liveEffect, i);
        }
    }

    @Override // X.C0U9B
    public final void LLLZZ(LiveEffect liveEffect, boolean z, long j, long j2, Integer num, String str) {
        if (z && liveEffect != null) {
            C768430UCj c768430UCj = C768430UCj.LIZ;
            C768430UCj.LJ(liveEffect, j, true, C0UD4.LJ);
        }
        C0UC4 c0uc4 = C0UC4.LIZ;
        C0UC4.LJJ(this.LLJJJIL, liveEffect, z, j, j2, num, str, "props", null);
    }
}
