package X;

import Y.ACListenerS161S0100000_27;
import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.rank.impl.list.controller.RankListController;
import com.bytedance.android.live.rank.impl.list.controller.RankPageController;
import com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankPageViewModel;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util.IIMMediaGridPerformanceAnalytics;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.DetailMediaGridContentAssem;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import org.json.JSONObject;
import webcast.api.ranklist.LynxRankView;

/* JADX INFO: renamed from: X.0ycs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class ViewTreeObserverOnPreDrawListenerC1864760ycs implements ViewTreeObserver.OnPreDrawListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.$t) {
            case 0:
                return onPreDraw$0(this);
            case 1:
                return onPreDraw$1(this);
            case 2:
                return onPreDraw$2(this);
            case 3:
                return onPreDraw$3(this);
            case 4:
                return onPreDraw$4(this);
            default:
                return false;
        }
    }

    public static final boolean onPreDraw$0(ViewTreeObserverOnPreDrawListenerC1864760ycs viewTreeObserverOnPreDrawListenerC1864760ycs) {
        String str;
        ViewTreeObserver viewTreeObserver;
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        long jLongValue4;
        long jLongValue5;
        long jLongValue6;
        long jLongValue7;
        ViewTreeObserver viewTreeObserver2;
        long jLongValue8;
        long jLongValue9;
        long jLongValue10;
        long jLongValue11;
        long jLongValue12;
        long jLongValue13;
        long jLongValue14;
        RankPageViewModel rankPageViewModelLJIIL;
        MutableLiveData<LynxRankView> mutableLiveData;
        LynxRankView value;
        RankListFragment rankListFragment = (RankListFragment) viewTreeObserverOnPreDrawListenerC1864760ycs.l0;
        RankListController rankListController = rankListFragment.LLILZIL;
        if (rankListController != null && rankListController.LJIIIZ().LLILLJJLI != null) {
            RankTypeV2 rankTypeV2 = rankListFragment.LLILLL.LIZIZ;
            EnumC1811400xEo enumC1811400xEo = rankListFragment.RR().LJIIL().LLILLL;
            RankTypeV2 rankTypeV22 = rankListController.LIZ().LLILZIL;
            RankPageController rankPageControllerRR = rankListFragment.RR();
            if (rankPageControllerRR != null && (rankPageViewModelLJIIL = rankPageControllerRR.LJIIL()) != null && (mutableLiveData = rankPageViewModelLJIIL.LLJILJIL) != null && (value = mutableLiveData.getValue()) != null) {
                str = value.lynxSchema;
            } else {
                str = null;
            }
            long jLongValue15 = 0;
            String str2 = "room_entrance_click";
            if (!rankListController.LJIIIZ().LLJILJIL) {
                List<RankTabInfo> list = rankListController.LIZ().LL;
                HashMap<Pair<Integer, Integer>, Long> map = C1810210xCt.LJI;
                if (!map.containsKey(new Pair(Integer.valueOf(rankTypeV2.type), Integer.valueOf(rankTypeV2.rankPhase)))) {
                    map.put(new Pair<>(Integer.valueOf(rankTypeV2.type), Integer.valueOf(rankTypeV2.rankPhase)), Long.valueOf(System.currentTimeMillis()));
                    C1810210xCt.LJIIIIZZ.put(new Pair<>(Integer.valueOf(rankTypeV2.type), Integer.valueOf(rankTypeV2.rankPhase)), Integer.valueOf(EnumC1779460wPI.SUCCESS.getType()));
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    C0K04.LJFF("current_entity_rank_type", rankTypeV2.rankName, jSONObject);
                    C0K04.LJFF("current_entrance_rank_type", rankTypeV22.rankName, jSONObject);
                    C0K04.LIZLLL(enumC1811400xEo.getType(), "group_type", jSONObject);
                    if (rankTypeV2.type == C1810210xCt.LIZJ && rankTypeV2.rankPhase == C1810210xCt.LIZLLL) {
                        str2 = C1810210xCt.LJIIIZ;
                    }
                    C0K04.LJFF("source", str2, jSONObject);
                    C1810210xCt.LIZ(jSONObject3, rankTypeV2.type, rankTypeV2.rankPhase, list);
                    C0K04.LJFF("event_name", "event_draw", jSONObject);
                    Long l = map.get(new Pair(Integer.valueOf(rankTypeV2.type), Integer.valueOf(rankTypeV2.rankPhase)));
                    if (l != null) {
                        jLongValue8 = l.longValue();
                    } else {
                        jLongValue8 = 0;
                    }
                    HashMap<Pair<Integer, Integer>, Long> map2 = C1810210xCt.LJ;
                    Long l2 = map2.get(new Pair(Integer.valueOf(rankTypeV2.type), Integer.valueOf(rankTypeV2.rankPhase)));
                    if (l2 != null) {
                        jLongValue9 = l2.longValue();
                    } else {
                        jLongValue9 = 0;
                    }
                    C0K04.LJ("event_duration", jLongValue8 - jLongValue9, jSONObject2);
                    Long l3 = map.get(new Pair(Integer.valueOf(rankTypeV2.type), Integer.valueOf(rankTypeV2.rankPhase)));
                    if (l3 != null) {
                        jLongValue10 = l3.longValue();
                    } else {
                        jLongValue10 = 0;
                    }
                    Long l4 = map2.get(new Pair(Integer.valueOf(rankTypeV2.type), Integer.valueOf(rankTypeV2.rankPhase)));
                    if (l4 != null) {
                        jLongValue11 = l4.longValue();
                    } else {
                        jLongValue11 = 0;
                    }
                    C0K04.LJ("event_duration", jLongValue10 - jLongValue11, jSONObject3);
                    Long l5 = map.get(new Pair(Integer.valueOf(rankTypeV2.type), Integer.valueOf(rankTypeV2.rankPhase)));
                    if (l5 != null) {
                        jLongValue12 = l5.longValue();
                    } else {
                        jLongValue12 = 0;
                    }
                    HashMap<Pair<Integer, Integer>, Long> map3 = C1810210xCt.LIZIZ;
                    Long l6 = map3.get(new Pair(Integer.valueOf(rankTypeV2.type), Integer.valueOf(rankTypeV2.rankPhase)));
                    if (l6 != null) {
                        jLongValue13 = l6.longValue();
                    } else {
                        jLongValue13 = 0;
                    }
                    C0K04.LJ("event_duration_all", jLongValue12 - jLongValue13, jSONObject2);
                    Long l7 = map.get(new Pair(Integer.valueOf(rankTypeV2.type), Integer.valueOf(rankTypeV2.rankPhase)));
                    if (l7 != null) {
                        jLongValue14 = l7.longValue();
                    } else {
                        jLongValue14 = 0;
                    }
                    Long l8 = map3.get(new Pair(Integer.valueOf(rankTypeV2.type), Integer.valueOf(rankTypeV2.rankPhase)));
                    if (l8 != null) {
                        jLongValue15 = l8.longValue();
                    }
                    C0K04.LJ("event_duration_all", jLongValue14 - jLongValue15, jSONObject3);
                    if (!TextUtils.isEmpty(str)) {
                        C0K04.LJFF("event_lynx_url", str, jSONObject3);
                        C0K04.LIZLLL(1, "has_lynx_cell", jSONObject);
                    } else {
                        C0K04.LIZLLL(0, "has_lynx_cell", jSONObject);
                    }
                    C0K04.LJII("extra", jSONObject4, jSONObject3);
                    C1CC2.LJ("ttlive_ranklist_entity_show", jSONObject, jSONObject2, jSONObject4);
                }
                RunnableC781530UlD runnableC781530UlD = rankListFragment.LLJJJ;
                if (runnableC781530UlD != null && (viewTreeObserver2 = runnableC781530UlD.getViewTreeObserver()) != null) {
                    viewTreeObserver2.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1864760ycs);
                    C2187701Ajg.LIZIZ(viewTreeObserver2, viewTreeObserverOnPreDrawListenerC1864760ycs, ViewTreeObserver.OnPreDrawListener.class);
                    return true;
                }
                return true;
            }
            List<RankTabInfo> list2 = rankListController.LIZ().LL;
            HashMap<Pair<Integer, Integer>, Long> map4 = C1810210xCt.LJII;
            if (!map4.containsKey(new Pair(Integer.valueOf(rankTypeV2.type), Integer.valueOf(rankTypeV2.rankPhase)))) {
                HashMap<Pair<Integer, Integer>, Long> map5 = C1810210xCt.LIZIZ;
                if (map5.containsKey(new Pair(Integer.valueOf(rankTypeV2.type), Integer.valueOf(rankTypeV2.rankPhase)))) {
                    map4.put(new Pair<>(Integer.valueOf(rankTypeV2.type), Integer.valueOf(rankTypeV2.rankPhase)), Long.valueOf(System.currentTimeMillis()));
                    C1810210xCt.LJI.put(new Pair<>(Integer.valueOf(rankTypeV2.type), Integer.valueOf(rankTypeV2.rankPhase)), Long.valueOf(System.currentTimeMillis()));
                    C1810210xCt.LJIIIIZZ.put(new Pair<>(Integer.valueOf(rankTypeV2.type), Integer.valueOf(rankTypeV2.rankPhase)), Integer.valueOf(EnumC1779460wPI.SUCCESS.getType()));
                    JSONObject jSONObject5 = new JSONObject();
                    JSONObject jSONObject6 = new JSONObject();
                    JSONObject jSONObject7 = new JSONObject();
                    JSONObject jSONObject8 = new JSONObject();
                    C0K04.LJFF("current_entity_rank_type", rankTypeV2.rankName, jSONObject5);
                    C0K04.LJFF("current_entrance_rank_type", rankTypeV22.rankName, jSONObject5);
                    C0K04.LIZLLL(enumC1811400xEo.getType(), "group_type", jSONObject5);
                    C0K04.LJFF("event_name", "event_cache_draw", jSONObject5);
                    if (rankTypeV2.type == C1810210xCt.LIZJ && rankTypeV2.rankPhase == C1810210xCt.LIZLLL) {
                        str2 = C1810210xCt.LJIIIZ;
                    }
                    C0K04.LJFF("source", str2, jSONObject5);
                    C1810210xCt.LIZ(jSONObject7, rankTypeV2.type, rankTypeV2.rankPhase, list2);
                    Long l9 = map4.get(new Pair(Integer.valueOf(rankTypeV2.type), Integer.valueOf(rankTypeV2.rankPhase)));
                    if (l9 != null) {
                        jLongValue = l9.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    Long l10 = map5.get(new Pair(Integer.valueOf(rankTypeV2.type), Integer.valueOf(rankTypeV2.rankPhase)));
                    if (l10 != null) {
                        jLongValue2 = l10.longValue();
                    } else {
                        jLongValue2 = 0;
                    }
                    C0K04.LJ("event_duration", jLongValue - jLongValue2, jSONObject6);
                    Long l11 = map4.get(new Pair(Integer.valueOf(rankTypeV2.type), Integer.valueOf(rankTypeV2.rankPhase)));
                    if (l11 != null) {
                        jLongValue3 = l11.longValue();
                    } else {
                        jLongValue3 = 0;
                    }
                    Long l12 = map5.get(new Pair(Integer.valueOf(rankTypeV2.type), Integer.valueOf(rankTypeV2.rankPhase)));
                    if (l12 != null) {
                        jLongValue4 = l12.longValue();
                    } else {
                        jLongValue4 = 0;
                    }
                    C0K04.LJ("event_duration", jLongValue3 - jLongValue4, jSONObject7);
                    Long l13 = map4.get(new Pair(Integer.valueOf(rankTypeV2.type), Integer.valueOf(rankTypeV2.rankPhase)));
                    if (l13 != null) {
                        jLongValue5 = l13.longValue();
                    } else {
                        jLongValue5 = 0;
                    }
                    Long l14 = map5.get(new Pair(Integer.valueOf(rankTypeV2.type), Integer.valueOf(rankTypeV2.rankPhase)));
                    if (l14 != null) {
                        jLongValue6 = l14.longValue();
                    } else {
                        jLongValue6 = 0;
                    }
                    C0K04.LJ("event_duration_all", jLongValue5 - jLongValue6, jSONObject6);
                    Long l15 = map4.get(new Pair(Integer.valueOf(rankTypeV2.type), Integer.valueOf(rankTypeV2.rankPhase)));
                    if (l15 != null) {
                        jLongValue7 = l15.longValue();
                    } else {
                        jLongValue7 = 0;
                    }
                    Long l16 = map5.get(new Pair(Integer.valueOf(rankTypeV2.type), Integer.valueOf(rankTypeV2.rankPhase)));
                    if (l16 != null) {
                        jLongValue15 = l16.longValue();
                    }
                    C0K04.LJ("event_duration_all", jLongValue7 - jLongValue15, jSONObject7);
                    if (!TextUtils.isEmpty(str)) {
                        C0K04.LJFF("event_lynx_url", str, jSONObject7);
                        C0K04.LIZLLL(1, "has_lynx_cell", jSONObject5);
                    } else {
                        C0K04.LIZLLL(0, "has_lynx_cell", jSONObject5);
                    }
                    C0K04.LJII("extra", jSONObject8, jSONObject7);
                    C1CC2.LJ("ttlive_ranklist_entity_show", jSONObject5, jSONObject6, jSONObject8);
                }
            }
            RunnableC781530UlD runnableC781530UlD2 = rankListFragment.LLJJJ;
            if (runnableC781530UlD2 == null || (viewTreeObserver = runnableC781530UlD2.getViewTreeObserver()) == null) {
                return true;
            }
            viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1864760ycs);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnPreDrawListenerC1864760ycs, ViewTreeObserver.OnPreDrawListener.class);
            return true;
        }
        return true;
    }

    public static final boolean onPreDraw$1(ViewTreeObserverOnPreDrawListenerC1864760ycs viewTreeObserverOnPreDrawListenerC1864760ycs) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        DetailMediaGridContentAssem detailMediaGridContentAssem = (DetailMediaGridContentAssem) viewTreeObserverOnPreDrawListenerC1864760ycs.l0;
        if (!detailMediaGridContentAssem.ip().EQ2() && (C13LP.LJJJLZIJ(0, detailMediaGridContentAssem.kp().getListItems()) instanceof C345480DgY) && (viewHolderFindViewHolderForAdapterPosition = detailMediaGridContentAssem.kp().findViewHolderForAdapterPosition(0)) != null) {
            View view = viewHolderFindViewHolderForAdapterPosition.itemView;
            C786410Ut5.ed(view, 0.0f);
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            if (iArr[1] + (view.getHeight() / 2) < view.getResources().getDisplayMetrics().heightPixels / 2) {
                C786410Ut5.ed(view, r0 - r1);
            }
        }
        return true;
    }

    public static final boolean onPreDraw$2(ViewTreeObserverOnPreDrawListenerC1864760ycs viewTreeObserverOnPreDrawListenerC1864760ycs) {
        String strXQ2;
        DetailMediaGridContentAssem detailMediaGridContentAssem = (DetailMediaGridContentAssem) viewTreeObserverOnPreDrawListenerC1864760ycs.l0;
        if (detailMediaGridContentAssem.LLJJLIIIJLLLLLLLZ && !detailMediaGridContentAssem.LLJL && detailMediaGridContentAssem.getContentView().isAttachedToWindow() && detailMediaGridContentAssem.getContentView().getGlobalVisibleRect(new Rect()) && (strXQ2 = detailMediaGridContentAssem.ip().xQ2()) != null) {
            IIMMediaGridPerformanceAnalytics iIMMediaGridPerformanceAnalytics = detailMediaGridContentAssem.LLJJJJJIL;
            if (iIMMediaGridPerformanceAnalytics != null) {
                iIMMediaGridPerformanceAnalytics.LIZLLL(strXQ2, detailMediaGridContentAssem.hp());
            }
            IIMMediaGridPerformanceAnalytics iIMMediaGridPerformanceAnalytics2 = detailMediaGridContentAssem.LLJJJJJIL;
            if (iIMMediaGridPerformanceAnalytics2 != null && iIMMediaGridPerformanceAnalytics2.LJFF(strXQ2, detailMediaGridContentAssem.hp(), detailMediaGridContentAssem.ip().FQ2())) {
                detailMediaGridContentAssem.LLJL = true;
                C786410Ut5.D3(detailMediaGridContentAssem.getContentView().getViewTreeObserver(), detailMediaGridContentAssem.LLJLILLLLZIIL);
            }
        }
        return true;
    }

    public static final boolean onPreDraw$3(ViewTreeObserverOnPreDrawListenerC1864760ycs viewTreeObserverOnPreDrawListenerC1864760ycs) {
        boolean z;
        boolean z2;
        C786410Ut5.D3(((C1805270x4v) viewTreeObserverOnPreDrawListenerC1864760ycs.l0).LIZJ.getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC1864760ycs);
        Layout layout = ((C1805270x4v) viewTreeObserverOnPreDrawListenerC1864760ycs.l0).LIZJ.getLayout();
        C1805270x4v c1805270x4v = (C1805270x4v) viewTreeObserverOnPreDrawListenerC1864760ycs.l0;
        if (layout != null && layout.getEllipsisCount(layout.getLineCount() - 1) > 0) {
            z = true;
        } else {
            z = false;
        }
        c1805270x4v.LJII = z;
        Layout layout2 = ((C1805270x4v) viewTreeObserverOnPreDrawListenerC1864760ycs.l0).LIZLLL.getLayout();
        C1805270x4v c1805270x4v2 = (C1805270x4v) viewTreeObserverOnPreDrawListenerC1864760ycs.l0;
        if (layout2 != null && layout2.getEllipsisCount(layout2.getLineCount() - 1) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        c1805270x4v2.LJIIIIZZ = z2;
        C1805270x4v c1805270x4v3 = (C1805270x4v) viewTreeObserverOnPreDrawListenerC1864760ycs.l0;
        if (!c1805270x4v3.LJII && !c1805270x4v3.LJIIIIZZ) {
            C786410Ut5.LJZI(8, c1805270x4v3.LJI);
            return true;
        }
        c1805270x4v3.LJIIIZ = false;
        C786410Ut5.LJZI(0, c1805270x4v3.LJI);
        ((C1805270x4v) viewTreeObserverOnPreDrawListenerC1864760ycs.l0).LJI.setImageResource(R.drawable.er3);
        C635860Owq.LIZ.LIZJ(5, ((C1805270x4v) viewTreeObserverOnPreDrawListenerC1864760ycs.l0).LJI);
        C1805270x4v c1805270x4v4 = (C1805270x4v) viewTreeObserverOnPreDrawListenerC1864760ycs.l0;
        C786410Ut5.Q7(c1805270x4v4.LJI, new ACListenerS161S0100000_27(c1805270x4v4, 135));
        return true;
    }

    public static final boolean onPreDraw$4(ViewTreeObserverOnPreDrawListenerC1864760ycs viewTreeObserverOnPreDrawListenerC1864760ycs) {
        Context context = ((C1854240yLu) viewTreeObserverOnPreDrawListenerC1864760ycs.l0).LIZ.getContext();
        int fullScreenHeight = (ScreenUtils.getFullScreenHeight(context) - ScreenUtils.getScreenHeight(context)) - ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(context);
        if (C1854240yLu.LJIIIIZZ == 0) {
            C1854240yLu.LJIIIIZZ = fullScreenHeight;
        }
        ((C1854240yLu) viewTreeObserverOnPreDrawListenerC1864760ycs.l0).LIZIZ();
        C786410Ut5.D3(((C1854240yLu) viewTreeObserverOnPreDrawListenerC1864760ycs.l0).LIZ.getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC1864760ycs);
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC1864760ycs(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
