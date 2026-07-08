package X;

import Y.ACListenerS130S0200000_28;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.broadcast.setting.LiveCenterNativePageRenew;
import com.bytedance.android.livesdk.dataChannel.LiveCenterNativeShowEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import tikcast.api.anchor_data.RealtimeLiveCenterDetailData;
import tikcast.api.anchor_data.RealtimeLiveCenterLiveJourneyInfo;
import webcast.data.AnchorGrowRewardInfo;
import webcast.data.AnchorLiveJourneyGuideInfo;
import webcast.data.LiveJourneyLevelInfo;
import webcast.data.LiveJourneyRewardInfo;
import webcast.data.LiveJourneyTaskRecordInfo;
import wh6.AbS512S0200000_27;
import wh6.AbS707S0100000_28;

/* JADX INFO: renamed from: X.0zFf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1888810zFf extends C1AHE {
    public final View LLILLJJLI;
    public boolean LLILLL;
    public final ACListenerS130S0200000_28 LLILZ;
    public final C01GW LLILZIL;
    public final ConstraintLayout LLILZLL;
    public final ConstraintLayout LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public int LLJJIJI;
    public final int LLJJIJIIJIL;

    public final C1888820zFg R5() {
        return (C1888820zFg) this.LLJJI.getValue();
    }

    public final C212362188q S5() {
        return (C212362188q) this.LLJ.getValue();
    }

    @Override // X.C1AHE
    public final void P5(int i) {
        AnchorLiveJourneyGuideInfo anchorLiveJourneyGuideInfo;
        RealtimeLiveCenterLiveJourneyInfo realtimeLiveCenterLiveJourneyInfo;
        int i2;
        RealtimeLiveCenterLiveJourneyInfo realtimeLiveCenterLiveJourneyInfo2;
        RealtimeLiveCenterDetailData realtimeLiveCenterDetailDataLJIIJJI = this.LL.LJIIJJI();
        if (realtimeLiveCenterDetailDataLJIIJJI != null && (realtimeLiveCenterLiveJourneyInfo2 = realtimeLiveCenterDetailDataLJIIJJI.liveJourneyInfo) != null) {
            anchorLiveJourneyGuideInfo = realtimeLiveCenterLiveJourneyInfo2.guideInfo;
        } else {
            anchorLiveJourneyGuideInfo = null;
        }
        if (anchorLiveJourneyGuideInfo != null) {
            C500260Jjc.LJIILIIL(this.LLIZ);
            C500260Jjc.LLFFF(this.LLILZLL);
            C1143680frq.LJI(this.LLILLJJLI.findViewById(R.id.jcm), C1143780fs0.LJIIJ("tiktok_live_broadcast_demand_2", "live_journey_rewards_bg.png"), null, true);
            C1143680frq.LJI(this.LLILLJJLI.findViewById(R.id.jcl), anchorLiveJourneyGuideInfo.guideIcon, null, true);
            TextView textView = (TextView) this.LLILLJJLI.findViewById(R.id.jdx);
            if (textView != null) {
                textView.setText(anchorLiveJourneyGuideInfo.guideTitle);
            }
            TextView textView2 = (TextView) this.LLILLJJLI.findViewById(R.id.jdm);
            if (textView2 != null) {
                textView2.setText(anchorLiveJourneyGuideInfo.guideText);
                return;
            }
            return;
        }
        C500260Jjc.LJIILIIL(this.LLILZLL);
        C500260Jjc.LLFFF(this.LLIZ);
        if (!this.LLJILLL) {
            this.LLJILLL = true;
            S5().setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            S5().setAdapter(R5());
            S5().setOnTouchListener(new View.OnTouchListener() { // from class: X.0y2G
                public float LL;
                public float LLILLJJLI;

                /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
                @Override // android.view.View.OnTouchListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
                    /*
                        r8 = this;
                        r2 = 0
                        if (r9 != 0) goto L4
                        return r2
                    L4:
                        if (r10 != 0) goto L7
                        return r2
                    L7:
                        int r1 = r10.getAction()
                        r5 = 1
                        if (r1 == 0) goto L53
                        if (r1 == r5) goto L43
                        r0 = 2
                        if (r1 == r0) goto L17
                        r0 = 3
                        if (r1 == r0) goto L43
                    L16:
                        return r2
                    L17:
                        float r1 = r10.getX()
                        float r3 = r10.getY()
                        float r0 = r8.LL
                        float r1 = r1 - r0
                        float r0 = r8.LLILLJJLI
                        float r3 = r3 - r0
                        double r0 = (double) r1
                        double r6 = java.lang.Math.abs(r0)
                        double r0 = (double) r3
                        double r3 = java.lang.Math.abs(r0)
                        int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                        if (r0 <= 0) goto L16
                        X.0zFf r0 = r8.LLILLL
                        android.view.View r1 = r0.LLILLJJLI
                        boolean r0 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
                        if (r0 == 0) goto L16
                        android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                        if (r1 == 0) goto L16
                        r1.requestDisallowInterceptTouchEvent(r5)
                        return r2
                    L43:
                        X.0zFf r0 = r8.LLILLL
                        android.view.View r1 = r0.LLILLJJLI
                        boolean r0 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
                        if (r0 == 0) goto L16
                        android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                        if (r1 == 0) goto L16
                        r1.requestDisallowInterceptTouchEvent(r2)
                        return r2
                    L53:
                        float r0 = r10.getX()
                        r8.LL = r0
                        float r0 = r10.getY()
                        r8.LLILLJJLI = r0
                        X.0zFf r0 = r8.LLILLL
                        android.view.View r1 = r0.LLILLJJLI
                        boolean r0 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
                        if (r0 == 0) goto L16
                        android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                        if (r1 == 0) goto L16
                        r1.requestDisallowInterceptTouchEvent(r5)
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC1842060y2G.onTouch(android.view.View, android.view.MotionEvent):boolean");
                }
            });
            ((RecyclerView) this.LLJIJIL.getValue()).setLayoutManager(new LinearLayoutManager(getContext()));
            ((RecyclerView) this.LLJIJIL.getValue()).setAdapter((AbstractC21673619ry) this.LLJJIII.getValue());
        }
        this.LLJJIJI = i;
        if (realtimeLiveCenterDetailDataLJIIJJI == null || (realtimeLiveCenterLiveJourneyInfo = realtimeLiveCenterDetailDataLJIIJJI.liveJourneyInfo) == null) {
            return;
        }
        LiveJourneyLevelInfo liveJourneyLevelInfo = realtimeLiveCenterLiveJourneyInfo.currentLevelInfo;
        if (liveJourneyLevelInfo != null) {
            long j = liveJourneyLevelInfo.level;
            if (j < 0) {
                j = 0;
            }
            ((TextView) this.LLJILJIL.getValue()).setText(C786410Ut5.j4(C497740JfY.LJIJI(2131853270), Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1)));
            if (liveJourneyLevelInfo.isFinalLevel && liveJourneyLevelInfo.needExp == liveJourneyLevelInfo.currentExp) {
                Iterator it2 = ((List) this.LLJILJILJ.getValue()).iterator();
                while (it2.hasNext()) {
                    C786410Ut5.LLJJJJJIL((C16FV) it2.next(), 8);
                }
            } else {
                long j2 = liveJourneyLevelInfo.needExp;
                if (j2 > 0 && (i2 = (int) (((liveJourneyLevelInfo.currentExp / j2) * 100.0f) / 25)) != this.LLJJIJIIJIL) {
                    String strLJIIJ = C1143780fs0.LJIIJ("tiktok_live_broadcast_demand_2", "live_center_journey_default_icon.png");
                    String strLJIIJ2 = C1143780fs0.LJIIJ("tiktok_live_broadcast_demand_2", "live_center_journey_gained_icon.png");
                    int i3 = 0;
                    for (Object obj : (List) this.LLJILJILJ.getValue()) {
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            C16FV c16fv = (C16FV) obj;
                            C786410Ut5.LLJJJJJIL(c16fv, 0);
                            if (i3 < i2) {
                                C1143680frq.LJI(c16fv, strLJIIJ2, null, true);
                            } else {
                                C1143680frq.LJIIJ(c16fv, Collections.singletonList(strLJIIJ), ImageView.ScaleType.FIT_XY, null, true, null, 32);
                            }
                            i3 = i4;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
            }
        }
        List<LiveJourneyTaskRecordInfo> list = realtimeLiveCenterLiveJourneyInfo.showTaskList;
        if (list.size() < 3) {
            C1886840zCU c1886840zCU = (C1886840zCU) this.LLJJIII.getValue();
            ((ArrayList) c1886840zCU.LLILZIL).clear();
            ((ArrayList) c1886840zCU.LLILZIL).addAll(list);
        } else {
            C1886840zCU c1886840zCU2 = (C1886840zCU) this.LLJJIII.getValue();
            List listLL = C13LP.LL(list, 3);
            ((ArrayList) c1886840zCU2.LLILZIL).clear();
            ((ArrayList) c1886840zCU2.LLILZIL).addAll(listLL);
        }
        ((AbstractC21673619ry) this.LLJJIII.getValue()).notifyDataSetChanged();
        if (!realtimeLiveCenterLiveJourneyInfo.canClaimLevelList.isEmpty()) {
            T5(realtimeLiveCenterLiveJourneyInfo.canClaimLevelList);
        } else {
            T5(new ArrayList());
        }
    }

    public final void T5(List<LiveJourneyLevelInfo> list) {
        String str;
        int i;
        AnchorGrowRewardInfo anchorGrowRewardInfo;
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                C212362188q c212362188qS5 = S5();
                int visibility = c212362188qS5.getVisibility();
                c212362188qS5.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c212362188qS5);
                C786410Ut5.LJLLLLLL(0, (View) this.LLJI.getValue());
                C786410Ut5.LLJJJJ((C16F5) this.LLILZIL.getValue(), 0);
                C786410Ut5.LLJJJJ((C16F5) this.LLIZLLLIL.getValue(), 0);
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                for (LiveJourneyLevelInfo liveJourneyLevelInfo : list) {
                    LiveJourneyRewardInfo liveJourneyRewardInfo = liveJourneyLevelInfo.rewardInfo;
                    if (liveJourneyRewardInfo != null && (anchorGrowRewardInfo = liveJourneyRewardInfo.rewardInfo) != null) {
                        i = (int) anchorGrowRewardInfo.num;
                    } else {
                        i = 0;
                    }
                    i2 += i;
                    arrayList.add(Integer.valueOf((int) liveJourneyLevelInfo.level));
                }
                ((TextView) this.LLILZIL.getValue()).setText(C497740JfY.LJIJJ(2131853268, Integer.valueOf(i2)));
                C786410Ut5.I7(new AbS512S0200000_27(this, (List) arrayList, 3), (View) this.LLIZLLLIL.getValue());
            } else {
                C212362188q c212362188qS52 = S5();
                int visibility2 = c212362188qS52.getVisibility();
                c212362188qS52.setVisibility(0);
                C1602160rnK.LIZIZ(visibility2, 0, c212362188qS52);
                C786410Ut5.LJLLLLLL(0, (View) this.LLJI.getValue());
                C786410Ut5.LLJJJJ((C16F5) this.LLILZIL.getValue(), 8);
                C786410Ut5.LLJJJJ((C16F5) this.LLIZLLLIL.getValue(), 8);
            }
        } else {
            C212362188q c212362188qS53 = S5();
            int visibility3 = c212362188qS53.getVisibility();
            c212362188qS53.setVisibility(8);
            C1602160rnK.LIZIZ(visibility3, 8, c212362188qS53);
            C786410Ut5.LJLLLLLL(8, (View) this.LLJI.getValue());
            C786410Ut5.LLJJJJ((C16F5) this.LLILZIL.getValue(), 8);
            C786410Ut5.LLJJJJ((C16F5) this.LLIZLLLIL.getValue(), 8);
        }
        C1888820zFg c1888820zFgR5 = R5();
        ((ArrayList) c1888820zFgR5.LLILZIL).clear();
        ((ArrayList) c1888820zFgR5.LLILZIL).addAll(list);
        C1888820zFg c1888820zFgR52 = R5();
        if (R5().getItemCount() > 0) {
            str = "have_rewards";
        } else {
            str = "inprogress";
        }
        c1888820zFgR52.LLILZLL = str;
        R5().notifyDataSetChanged();
    }

    public C1888810zFf(View view, C1AHD c1ahd) {
        View viewFindViewById;
        super(view, c1ahd);
        this.LLILLJJLI = view;
        this.LLILZ = new ACListenerS130S0200000_28(this, c1ahd, 45);
        this.LLILZIL = C292401Bi.LIZ(new AwS572S0100000_28(this, 778));
        this.LLILZLL = (ConstraintLayout) view.findViewById(R.id.jcs);
        this.LLIZ = (ConstraintLayout) view.findViewById(R.id.m0g);
        this.LLIZLLLIL = C292401Bi.LIZ(new AwS572S0100000_28(this, 773));
        this.LLJ = C292401Bi.LIZ(new AwS572S0100000_28(this, 777));
        this.LLJI = C292401Bi.LIZ(new AwS572S0100000_28(this, 776));
        this.LLJIJIL = C292401Bi.LIZ(new AwS572S0100000_28(this, 779));
        this.LLJILJIL = C292401Bi.LIZ(new AwS572S0100000_28(this, 775));
        this.LLJILJILJ = C292401Bi.LIZ(new AwS572S0100000_28(this, 774));
        this.LLJJI = C292401Bi.LIZ(new AwS429S0200000_28(this, c1ahd, 117));
        this.LLJJIII = C292401Bi.LIZ(new AwS429S0200000_28(this, c1ahd, 118));
        this.LLJJIJI = -1;
        C786410Ut5.I7(new AbS707S0100000_28(this, 6, 42), view);
        DataChannel dataChannel = c1ahd.getDataChannel();
        if (dataChannel != null) {
            dataChannel.BQ2(null, LiveCenterNativeShowEvent.class, new AwS607S0100000_28(this, 233));
        }
        N5();
        if (LiveCenterNativePageRenew.INSTANCE.isEnable() && (viewFindViewById = view.findViewById(R.id.mv6)) != null) {
            C500260Jjc.LJLJL((int) C497740JfY.LIZIZ(10.0f), viewFindViewById);
            C500260Jjc.LJJLJ((int) C497740JfY.LIZIZ(4.0f), viewFindViewById);
        }
        this.LLJJIJIIJIL = -1;
    }
}
