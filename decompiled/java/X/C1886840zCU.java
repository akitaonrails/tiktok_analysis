package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.broadcast.setting.LiveCenterNativePageRenew;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import tikcast.api.anchor_data.RealtimeLiveCenterDetailData;
import tikcast.api.anchor_data.RealtimeLiveCenterLiveJourneyInfo;
import webcast.data.LiveJourneyLevelInfo;
import webcast.data.LiveJourneySeasonInfo;
import webcast.data.LiveJourneyTaskRecordInfo;
import wh6.AbS707S0100000_28;

/* JADX INFO: renamed from: X.0zCU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1886840zCU extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final C1AHD LL;
    public final int LLILLJJLI;
    public final int LLILLL = 1;
    public final int LLILZ = 2;
    public final List<LiveJourneyTaskRecordInfo> LLILZIL = new ArrayList();
    public final Set<String> LLILZLL = new LinkedHashSet();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        if (((ArrayList) this.LLILZIL).isEmpty()) {
            return 1;
        }
        return ((ArrayList) this.LLILZIL).size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (((ArrayList) this.LLILZIL).isEmpty()) {
            return this.LLILZ;
        }
        return this.LLILLL;
    }

    public C1886840zCU(C1AHD c1ahd, int i) {
        this.LL = c1ahd;
        this.LLILLJJLI = i;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        long j;
        String str;
        RealtimeLiveCenterLiveJourneyInfo realtimeLiveCenterLiveJourneyInfo;
        LiveJourneySeasonInfo liveJourneySeasonInfo;
        String str2;
        RealtimeLiveCenterLiveJourneyInfo realtimeLiveCenterLiveJourneyInfo2;
        LiveJourneyLevelInfo liveJourneyLevelInfo;
        if (viewHolder instanceof C1886850zCV) {
            if (i >= ((ArrayList) this.LLILZIL).size()) {
                return;
            }
            LiveJourneyTaskRecordInfo liveJourneyTaskRecordInfo = (LiveJourneyTaskRecordInfo) ListProtector.get(this.LLILZIL, i);
            C1886850zCV c1886850zCV = (C1886850zCV) viewHolder;
            c1886850zCV.LLILLL.setBackground(C420940Gey.LIZ(C497740JfY.LIZIZ(20.0f), C497740JfY.LIZLLL(R.attr.ey_, c1886850zCV.itemView.getContext())));
            C16F5 c16f5 = c1886850zCV.LLILZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('+');
            sbLIZ.append(liveJourneyTaskRecordInfo.rewardNum);
            c16f5.setText(C2188811AlT.LIZIZ(sbLIZ));
            c1886850zCV.LLIZ.setText(liveJourneyTaskRecordInfo.title);
            if (LiveCenterNativePageRenew.INSTANCE.isEnable()) {
                c1886850zCV.LLIZ.setTextColor(C497740JfY.LIZLLL(R.attr.ezt, c1886850zCV.itemView.getContext()));
            }
            C16F5 c16f52 = c1886850zCV.LLILZLL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(liveJourneyTaskRecordInfo.currentNum);
            sbLIZ2.append('/');
            sbLIZ2.append(liveJourneyTaskRecordInfo.targetNum);
            c16f52.setText(C2188811AlT.LIZIZ(sbLIZ2));
            c1886850zCV.LLILZIL.setMax((int) liveJourneyTaskRecordInfo.targetNum);
            c1886850zCV.LLILZIL.setProgress((int) liveJourneyTaskRecordInfo.currentNum);
            C786410Ut5.I7(new AbS707S0100000_28(c1886850zCV, 8), c1886850zCV.itemView);
            if (!this.LLILZLL.contains(liveJourneyTaskRecordInfo.taskRecordId)) {
                C1AHD c1ahd = this.LL;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_center_livejourney_task_module");
                c474500IjALIZ.LJIJJLI(c1ahd.getDataChannel());
                RealtimeLiveCenterDetailData realtimeLiveCenterDetailDataLJIIJJI = c1ahd.LJIIJJI();
                if (realtimeLiveCenterDetailDataLJIIJJI != null && (realtimeLiveCenterLiveJourneyInfo2 = realtimeLiveCenterDetailDataLJIIJJI.liveJourneyInfo) != null && (liveJourneyLevelInfo = realtimeLiveCenterLiveJourneyInfo2.currentLevelInfo) != null) {
                    j = liveJourneyLevelInfo.level;
                } else {
                    j = 0;
                }
                c474500IjALIZ.LJJII(Long.valueOf(j), "anchor_level");
                c474500IjALIZ.LJJII("show", "action_type");
                c474500IjALIZ.LJJII(liveJourneyTaskRecordInfo.taskRecordId, "task_id");
                if (liveJourneyTaskRecordInfo.taskExpireTime > 0) {
                    str = "weekly_task";
                } else {
                    str = "achievement_task";
                }
                c474500IjALIZ.LJJII(str, "task_type");
                c474500IjALIZ.LJJII(Integer.valueOf(i + 1), "task_position");
                RealtimeLiveCenterDetailData realtimeLiveCenterDetailDataLJIIJJI2 = c1ahd.LJIIJJI();
                if (realtimeLiveCenterDetailDataLJIIJJI2 != null && (realtimeLiveCenterLiveJourneyInfo = realtimeLiveCenterDetailDataLJIIJJI2.liveJourneyInfo) != null && (liveJourneySeasonInfo = realtimeLiveCenterLiveJourneyInfo.seasonInfo) != null && (str2 = liveJourneySeasonInfo.seasonMetaId) != null) {
                    c474500IjALIZ.LJJII(str2, "season_id");
                }
                c474500IjALIZ.LIZ();
                this.LLILZLL.add(liveJourneyTaskRecordInfo.taskRecordId);
                return;
            }
            return;
        }
        if (viewHolder instanceof C1886860zCW) {
            C1886860zCW c1886860zCW = (C1886860zCW) viewHolder;
            C786410Ut5.I7(new AbS707S0100000_28(c1886860zCW, 7), c1886860zCW.itemView);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c1886860zCW;
        if (i == this.LLILLL) {
            c1886860zCW = new C1886850zCV(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.h1b, viewGroup, false), this.LL, this.LLILLJJLI);
            C1143680frq.LJI(c1886860zCW.itemView.findViewById(R.id.xec), C1143780fs0.LJIIJ("tiktok_live_broadcast_demand_2", "live_center_journey_gained_icon.png"), null, true);
            if (LiveCenterNativePageRenew.INSTANCE.isEnable()) {
                C500260Jjc.LJLJL((int) C497740JfY.LIZIZ(8.0f), c1886860zCW.itemView);
            }
        } else {
            C16F5 c16f5 = new C16F5(viewGroup.getContext(), null);
            C786410Ut5.y6(c16f5, new ViewGroup.LayoutParams(-1, -1));
            c16f5.setTextColor(C497740JfY.LIZLLL(R.attr.ezt, viewGroup.getContext()));
            c16f5.LJJJI(R.style.ri);
            c16f5.setPadding(0, (int) C497740JfY.LIZIZ(12.0f), 0, 0);
            c16f5.setGravity(16);
            c16f5.setText(C497740JfY.LJIJI(2131853265));
            c1886860zCW = new C1886860zCW(c16f5, this.LL, this.LLILLJJLI);
        }
        try {
            View view = c1886860zCW.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1886860zCW.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1886860zCW.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c1886860zCW.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1886860zCW.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1886860zCW.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c1886860zCW.getClass().getName();
        return c1886860zCW;
    }
}
