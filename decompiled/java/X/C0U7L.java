package X;

import Y.ACListenerS147S0100000_12;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAIBeautySetting;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0U7L, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U7L extends AbstractC21673619ry<C0U7P> {
    public final DataChannel LL;
    public final LiveSmallItemBeautyViewModel LLILLJJLI;
    public final C0U7M LLILLL = new C0U7Q() { // from class: X.0U7M
        @Override // X.C0U7Q
        public final void LIZ() {
            C0U7L c0u7l = this.LIZ;
            c0u7l.LLILLJJLI.HQ2(c0u7l.LL, "ban");
            this.LIZ.LLILLJJLI.BQ2(false, false);
            C0UF5.LJIIJ = null;
            C0UJY liveParamsListener = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getLiveParamsListener(this.LIZ.LL);
            if (liveParamsListener != null) {
                liveParamsListener.LJJII();
            }
        }

        @Override // X.C0U7Q
        public final void LIZIZ() {
            boolean zEQ2 = this.LIZ.LLILLJJLI.EQ2();
            C0U7L c0u7l = this.LIZ;
            c0u7l.LLILLJJLI.HQ2(c0u7l.LL, zEQ2 ? "refresh" : "optimize");
            this.LIZ.LLILLJJLI.BQ2(true, false);
        }
    };

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return 2;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0U7M] */
    public C0U7L(DataChannel dataChannel, LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel) {
        this.LL = dataChannel;
        this.LLILLJJLI = liveSmallItemBeautyViewModel;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        C0U7P c0u7p = (C0U7P) viewHolder;
        boolean zEQ2 = this.LLILLJJLI.EQ2();
        if (this.LLILLJJLI.LLILZLL == EnumC767070U7d.CANCELED) {
            z = true;
        } else {
            z = false;
        }
        c0u7p.I5(zEQ2, z);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c0u7o;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreateViewHolder: ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("AIBeauty", C2188811AlT.LIZIZ(sbLIZ));
        if (i == 0) {
            final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gep, viewGroup, false);
            final C0U7M c0u7m = this.LLILLL;
            c0u7o = new C0U7P(viewTd, c0u7m) { // from class: X.0U7N
                {
                    super(viewTd, c0u7m);
                    if (LiveAIBeautySetting.INSTANCE.enableDialogUpdate()) {
                        this.LLILZIL.setBackgroundResource(R.drawable.dm3);
                    } else {
                        this.LLILZIL.setBackgroundResource(R.drawable.dm2);
                    }
                    this.LLILLL.setIcon(C20736316Cj.LIZLLL(R.attr.cy2, viewTd.getContext()));
                    C786410Ut5.I7(new ACListenerS147S0100000_12(c0u7m, 413), viewTd);
                    this.LLILLJJLI.setText(C497740JfY.LJIJI(2131851213));
                }

                @Override // X.C0U7P
                public final void I5(boolean z, boolean z2) {
                    if (z2) {
                        if (!LiveAIBeautySetting.INSTANCE.enableDialogUpdate()) {
                            this.LLILLJJLI.setTextColor(C20736316Cj.LIZIZ(R.attr.eya, this.itemView.getContext()));
                        }
                        C500260Jjc.LLFFF(this.LLILZIL);
                    } else {
                        if (!LiveAIBeautySetting.INSTANCE.enableDialogUpdate()) {
                            this.LLILLJJLI.setTextColor(C20736316Cj.LIZIZ(R.attr.c9j, this.itemView.getContext()));
                        }
                        C500260Jjc.LJIILLIIL(this.LLILZIL);
                    }
                    if (!z && !z2) {
                        C786410Ut5.T4(this.itemView, 0.5f);
                    } else {
                        C786410Ut5.T4(this.itemView, 1.0f);
                    }
                    this.itemView.setClickable(z);
                }
            };
        } else {
            c0u7o = new C0U7O(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gep, viewGroup, false), this.LLILLL);
        }
        try {
            View view = c0u7o.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0u7o.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0u7o.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c0u7o.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0u7o.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0u7o.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c0u7o.getClass().getName();
        return c0u7o;
    }
}
