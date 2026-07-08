package X;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.gift.GiftPanelOptimiseMetrics;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.LinkedList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS418S0200000_17;

/* JADX INFO: renamed from: X.0fR1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1127050fR1 extends C1126990fQv {
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;

    @Override // X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // X.AbstractC21673619ry
    public final boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        return super.onFailedToRecycleView(viewHolder);
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
    }

    public final void LLLJIL(RunnableC781530UlD runnableC781530UlD, int i) {
        AbstractC21673719rz itemAnimator;
        if (runnableC781530UlD != null && (itemAnimator = runnableC781530UlD.getItemAnimator()) != null) {
            itemAnimator.LJIIL();
        }
        notifyItemChanged(i);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        AbstractC1126560fQE abstractC1126560fQELLLI;
        InterfaceC1127040fR0 interfaceC1127040fR0;
        ViewGroup.LayoutParams layoutParams;
        int iIntValue;
        int i2;
        if (C1128590fTV.LJIIL) {
            C1128590fTV.LJIIL = false;
            C1128590fTV.LJIILIIL = SystemClock.uptimeMillis();
        }
        if (GiftPanelOptimiseMetrics.INSTANCE.isOptimised()) {
            abstractC1126560fQELLLI = LLLI(i, viewGroup);
        } else {
            Pair pair = new Pair(LLLI(i, viewGroup), Long.valueOf(SystemClock.uptimeMillis() - SystemClock.uptimeMillis()));
            abstractC1126560fQELLLI = (AbstractC1126560fQE) pair.getFirst();
            long jLongValue = ((Number) pair.getSecond()).longValue();
            String strR5 = abstractC1126560fQELLLI.R5();
            if (TextUtils.isEmpty("gift_view_holder_create_time") || (interfaceC1127040fR0 = C1127020fQy.LIZ) == null || interfaceC1127040fR0.LIZIZ(0.1f)) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_view_holder_create_time");
                c474500IjALIZ.LJJII(Long.valueOf(jLongValue), "time");
                c474500IjALIZ.LJJII(strR5, "type");
                c474500IjALIZ.LIZ();
            }
        }
        int iIntValue2 = -1;
        if (i != 16 && i != 18) {
            if (!C497750JfZ.LIZIZ()) {
                if (i == 13) {
                    i2 = 2;
                } else if (C01AW.LIZ(Integer.valueOf(i))) {
                    i2 = 4;
                } else {
                    i2 = 1;
                }
                iIntValue2 = ((Number) this.LLJILJIL.getValue()).intValue() * i2;
            }
            if (C01AW.LIZ(Integer.valueOf(i))) {
                iIntValue = abstractC1126560fQELLLI.itemView.getLayoutParams().height;
            } else {
                iIntValue = ((Number) this.LLJI.getValue()).intValue();
            }
            layoutParams = new ViewGroup.LayoutParams(iIntValue2, iIntValue);
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        if (abstractC1126560fQELLLI.itemView.getContext() != null) {
            C786410Ut5.W5(abstractC1126560fQELLLI.itemView, layoutParams);
        }
        try {
            View view = abstractC1126560fQELLLI.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        abstractC1126560fQELLLI.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (abstractC1126560fQELLLI.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(abstractC1126560fQELLLI.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) abstractC1126560fQELLLI.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(abstractC1126560fQELLLI.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = abstractC1126560fQELLLI.getClass().getName();
        return abstractC1126560fQELLLI;
    }

    public C1127050fR1(LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList, DataChannel dataChannel, Context context) {
        super(linkedList, dataChannel);
        this.LLJ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(127));
        this.LLJI = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(125));
        this.LLJIJIL = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(126));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS418S0200000_17(context, this, 44));
    }

    public final void LLLJ(int i, Object obj, RunnableC781530UlD runnableC781530UlD) {
        AbstractC21673719rz itemAnimator;
        if (runnableC781530UlD != null && (itemAnimator = runnableC781530UlD.getItemAnimator()) != null) {
            itemAnimator.LJIIL();
        }
        notifyItemChanged(i, obj);
    }
}
