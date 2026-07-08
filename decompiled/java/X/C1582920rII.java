package X;

import Y.AkS485S0100000_24;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.tablet.api.helper.feed.PersonalizedFeedTabConfig;
import com.ss.android.ugc.aweme.tablet.api.helper.feed.PersonalizedFeedTooltipConfig;
import com.ss.android.ugc.aweme.topicfeed.repo.TopicFeedApi;
import com.ss.android.ugc.aweme.topicfeed.utils.TopicFeedPreloadExpirySetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0rII, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1582920rII extends AbstractC1584410rKh {
    public final int LL;
    public View LLILLJJLI;
    public View LLILLL;
    public TextView LLILZ;
    public C0P0T LLILZIL;
    public FeedItemList LLILZLL;
    public final C01GW LLIZ;

    public final PersonalizedFeedTabConfig LJIIJ() {
        return C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLI().LLLL(this.LL);
    }

    public final Keva LJIIJJI() {
        return (Keva) this.LLIZ.getValue();
    }

    @Override // X.AbstractC1584410rKh
    public final void LIZLLL() {
        LJIIJ().enableRedDot = false;
        View view = this.LLILLL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLI().LJJIL(LJIIJ().topicFeedId);
        C0P0T c0p0t = this.LLILZIL;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0rIJ] */
    public C1582920rII(int i) {
        this.LL = i;
        ?? r2 = new InterfaceC1582950rIL() { // from class: X.0rIJ
            @Override // X.InterfaceC1583180rIi
            public final void LIZ() {
                Keva kevaLJIIJJI = this.LIZ.LJIIJJI();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("pad_personalized_preload_timestamp_topic_");
                sbLIZ.append(this.LIZ.LJIIJ().topicFeedId);
                if (System.currentTimeMillis() - kevaLJIIJJI.getLong(C2188811AlT.LIZIZ(sbLIZ), -1L) <= TopicFeedPreloadExpirySetting.INSTANCE.delayTimeMill()) {
                    Keva kevaLJIIJJI2 = this.LIZ.LJIIJJI();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("pad_personalized_preload_topic_");
                    sbLIZ2.append(this.LIZ.LJIIJ().topicFeedId);
                    String string = kevaLJIIJJI2.getString(C2188811AlT.LIZIZ(sbLIZ2), "");
                    if (string.length() > 0) {
                        C1582920rII c1582920rII = this.LIZ;
                        C1227904rF.LIZ.getClass();
                        c1582920rII.LLILZLL = (FeedItemList) C1227904rF.LIZIZ(string, FeedItemList.class);
                        Keva kevaLJIIJJI3 = this.LIZ.LJIIJJI();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("pad_personalized_preload_topic_");
                        sbLIZ3.append(this.LIZ.LJIIJ().topicFeedId);
                        kevaLJIIJJI3.erase(C2188811AlT.LIZIZ(sbLIZ3));
                        Keva kevaLJIIJJI4 = this.LIZ.LJIIJJI();
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("pad_personalized_preload_timestamp_topic_");
                        sbLIZ4.append(this.LIZ.LJIIJ().topicFeedId);
                        kevaLJIIJJI4.erase(C2188811AlT.LIZIZ(sbLIZ4));
                    }
                }
                if (this.LIZ.LLILZLL == null) {
                    String dataSource = C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLI().getDataSource();
                    C1582920rII c1582920rII2 = this.LIZ;
                    FeedItemList feedItemList = null;
                    if (dataSource != null) {
                        try {
                            ComposePbAndJson<C1620430sGn, FeedItemList> composePbAndJson = TopicFeedApi.LIZIZ.fetchTopicFeedList(dataSource, c1582920rII2.LJIIJ().topicFeedId, 6, 1, "").get();
                            C1582990rIP c1582990rIP = new C1582990rIP(0);
                            String str = C1605000rru.LIZ;
                            FeedItemList feedItemListLIZJ = composePbAndJson.LIZJ(new AkS485S0100000_24(c1582990rIP, 2));
                            Keva kevaLJIIJJI5 = this.LIZ.LJIIJJI();
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("pad_personalized_preload_topic_");
                            sbLIZ5.append(this.LIZ.LJIIJ().topicFeedId);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
                            C1227904rF.LIZ.getClass();
                            kevaLJIIJJI5.storeString(strLIZIZ, C1227904rF.LJI(feedItemListLIZJ));
                            Keva kevaLJIIJJI6 = this.LIZ.LJIIJJI();
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("pad_personalized_preload_timestamp_topic_");
                            sbLIZ6.append(this.LIZ.LJIIJ().topicFeedId);
                            kevaLJIIJJI6.storeLong(C2188811AlT.LIZIZ(sbLIZ6), System.currentTimeMillis());
                            feedItemList = feedItemListLIZJ;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    c1582920rII2.LLILZLL = feedItemList;
                }
            }

            @Override // X.InterfaceC1582950rIL
            public final FeedItemList getPreload() {
                return this.LIZ.LLILZLL;
            }
        };
        this.LLIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(557));
        C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLI().LLJJI(LJIIJ().topicFeedId, r2);
    }

    @Override // X.AbstractC1584410rKh
    public final void LJII(final View view, C1584440rKk c1584440rKk) {
        View viewFindViewById;
        int i;
        this.LLILLJJLI = view;
        TextView textView = null;
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.tv_tab_dot);
        } else {
            viewFindViewById = null;
        }
        this.LLILLL = viewFindViewById;
        View view2 = this.LLILLJJLI;
        if (view2 != null) {
            textView = (TextView) view2.findViewById(android.R.id.text1);
        }
        this.LLILZ = textView;
        View view3 = this.LLILLL;
        if (view3 != null) {
            if (LJIIJ().enableRedDot) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view3);
        }
        TextView textView2 = this.LLILZ;
        if (textView2 != null) {
            textView2.setText(LJIIJ().title);
        }
        C786410Ut5.x3(view.getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0rIK
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C0P0T c0p0tLIZIZ;
                PersonalizedFeedTooltipConfig personalizedFeedTooltipConfig = this.LL.LJIIJ().tooltip;
                if (personalizedFeedTooltipConfig != null) {
                    C1582920rII c1582920rII = this.LL;
                    View view4 = view;
                    C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
                    if (c19252910Tv.LIZLLL().LJIJI().LLI().LJIIJJI(c1582920rII.LL)) {
                        TextView textView3 = c1582920rII.LLILZ;
                        if (textView3 != null) {
                            C450720Hlu c450720Hlu = new C450720Hlu(view4.getContext());
                            C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
                            c1391600mJi.LIZIZ = textView3;
                            c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
                            c450720Hlu.LLILZ = personalizedFeedTooltipConfig.tooltipText;
                            c1391600mJi.LJII = 3000L;
                            c1391600mJi.LJIJJ = false;
                            c0p0tLIZIZ = c450720Hlu.LIZIZ();
                        } else {
                            c0p0tLIZIZ = null;
                        }
                        c1582920rII.LLILZIL = c0p0tLIZIZ;
                        if (c0p0tLIZIZ != null) {
                            c0p0tLIZIZ.show();
                        }
                        c19252910Tv.LIZLLL().LJIJI().LLI().LLLIIIL();
                    }
                }
                C786410Ut5.C3(view.getViewTreeObserver(), this);
            }
        });
    }
}
