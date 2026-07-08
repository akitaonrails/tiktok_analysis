package X;

import Y.ARunnableS124S0100000_24;
import Y.ARunnableS93S0200000_24;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.controller.PlayerController;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.aweme.ml.api.IMLCommonService;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0rq6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1603880rq6 extends C360660ECa {
    public boolean LL;
    public int LLILLJJLI = -1;
    public final /* synthetic */ FullFeedFragmentPanel LLILLL;

    public C1603880rq6(FullFeedFragmentPanel fullFeedFragmentPanel) {
        this.LLILLL = fullFeedFragmentPanel;
    }

    public final void LIZ(int i) {
        Aweme awemeLJI;
        Fragment fragment;
        int i2;
        C1440005kM.LIZ(new C581630MrZ(10, 0));
        FullFeedFragmentPanel fullFeedFragmentPanel = this.LLILLL;
        Aweme item = fullFeedFragmentPanel.LLJL.getItem(fullFeedFragmentPanel.LLJJIJI.getCurrentItem());
        if (item != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPageSelected: ");
            sbLIZ.append(item.getAid());
            C797930VRv.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            String aid = item.getAid();
            this.LLILLL.getEventType();
            C0ND6.LIZIZ(aid);
        }
        FullFeedFragmentPanel fullFeedFragmentPanel2 = this.LLILLL;
        int i3 = this.LLILLJJLI;
        fullFeedFragmentPanel2.getClass();
        JSONObject jSONObject = null;
        if (C828040We2.LIZIZ() && (fragment = fullFeedFragmentPanel2.getFragment()) != null && (fragment.getParentFragment() instanceof InterfaceC1593630rZZ) && fragment.getParentFragment() != null && !C1017070cZd.LJJLIIIIJ(item) && (i2 = C828040We2.LIZ) < 6 && i > i3 && i2 <= 6) {
            C828040We2.LIZ = i2 + 1;
        }
        if (C1017070cZd.LJJLIIIIJ(item)) {
            C1440005kM.LIZ(new IEvent() { // from class: X.0raH
                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent post() {
                    C1440005kM.LIZ(this);
                    return this;
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent postSticky() {
                    C1440005kM.LIZIZ(this);
                    return this;
                }
            });
            C1389890mGx c1389890mGx = this.LLILLL.s;
            if (c1389890mGx != null) {
                c1389890mGx.LIZIZ();
            }
        }
        FullFeedFragmentPanel fullFeedFragmentPanel3 = this.LLILLL;
        fullFeedFragmentPanel3.m = Math.max(fullFeedFragmentPanel3.m, i);
        if (this.LLILLL.LLJILJILJ()) {
            if (this.LLILLJJLI == i + 1) {
                this.LLILLL.LJLIL();
                C0TJ5.LIZIZ.LIZIZ(i + 2, this.LLILLL.LJIIIIZZ());
            } else {
                IViewPagerComponentAbility iViewPagerComponentAbility = this.LLILLL.LLJJIJIIJIL;
                if (iViewPagerComponentAbility != null) {
                    iViewPagerComponentAbility.J41();
                }
                this.LLILLL.D();
                C0TJ5.LIZIZ.LIZIZ(i, this.LLILLL.LJIIIIZZ());
            }
        }
        if (!C0BAY.LIZ()) {
            IMLCommonService iMLCommonServiceInstance = MLCommonService.instance();
            String eventType = this.LLILLL.getEventType();
            VerticalViewPager verticalViewPager = this.LLILLL.LLJJIJI;
            if (verticalViewPager != null) {
                jSONObject = verticalViewPager.LLZZJLIL;
            }
            iMLCommonServiceInstance.onViewPagerSelected(item, eventType, i, jSONObject);
            Aweme awemeLJIIIIZZ = this.LLILLL.LJIIIIZZ();
            if (this.LLILLJJLI == i + 1) {
                awemeLJI = this.LLILLL.Rh(awemeLJIIIIZZ);
            } else {
                awemeLJI = this.LLILLL.LJI(awemeLJIIIIZZ);
            }
            C0S78.LIZIZ(new ARunnableS93S0200000_24(this, awemeLJI, 48), "EventHotAreaMonitor_mobFeedPageSelected", ((Boolean) C2279571EKl.LJI.getValue()).booleanValue());
        }
        this.LLILLJJLI = i;
        C0SZ8 c0sz8LJLIL = this.LLILLL.LJLIL();
        if (c0sz8LJLIL != null) {
            if (c0sz8LJLIL.getAwemeType() == 325) {
                ILoadMoreAbility iLoadMoreAbility = this.LLILLL.LLILZLL;
                if (iLoadMoreAbility != null) {
                    iLoadMoreAbility.g82(true);
                }
                this.LLILLL.hs();
                C486860J7k.LIZIZ((C19EG) this.LLILLL.activity).LLIZ.setValue(Boolean.FALSE);
                return;
            }
            if (c0sz8LJLIL.getAwemeType() == 326) {
                ILoadMoreAbility iLoadMoreAbility2 = this.LLILLL.LLILZLL;
                if (iLoadMoreAbility2 != null) {
                    iLoadMoreAbility2.g82(true);
                }
                C486860J7k.LIZIZ((C19EG) this.LLILLL.activity).LLIZ.setValue(Boolean.FALSE);
                return;
            }
            if (c0sz8LJLIL.getAwemeType() == 327) {
                ILoadMoreAbility iLoadMoreAbility3 = this.LLILLL.LLILZLL;
                if (iLoadMoreAbility3 != null) {
                    iLoadMoreAbility3.g82(true);
                }
                C486860J7k.LIZIZ((C19EG) this.LLILLL.activity).LLIZ.setValue(Boolean.FALSE);
                return;
            }
        }
        ILoadMoreAbility iLoadMoreAbility4 = this.LLILLL.LLILZLL;
        if (iLoadMoreAbility4 != null) {
            iLoadMoreAbility4.g82(false);
        }
        C486860J7k.LIZIZ((C19EG) this.LLILLL.activity).LLIZ.setValue(Boolean.TRUE);
    }

    /* JADX WARN: Type inference failed for: r0v43, types: [X.0CFJ] */
    @Override // X.C360660ECa, X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        final ARunnableS124S0100000_24 aRunnableS124S0100000_24;
        this.LLILLL.getClass();
        if (i == 1) {
            this.LL = false;
            String eventType = this.LLILLL.LLLLIIIILLL.getEventType();
            if (!C0CFK.LIZ) {
                C0CFK.LIZ = true;
                long jCurrentTimeMillis = 0;
                if (C0CFK.LJFF > 0) {
                    jCurrentTimeMillis = System.currentTimeMillis() - C0CFK.LJFF;
                }
                C0CFK.LJ = jCurrentTimeMillis;
                C0CFK.LJFF = System.currentTimeMillis();
                C0CFK.LIZIZ = new CountDownLatch(1);
                Iterator it2 = ((ArrayList) C0CFK.LJI).iterator();
                while (it2.hasNext()) {
                    ((Function1) it2.next()).invoke(eventType);
                }
            }
            if (C289600BWs.LIZ()) {
                C1BD3.LIZ = true;
                C1618030sCv c1618030sCv = C1618030sCv.LJFF;
                c1618030sCv.getClass();
                C1603920rqA c1603920rqA = new C1603920rqA();
                c1603920rqA.LIZ = true;
                c1618030sCv.LJJ(c1603920rqA);
            }
            if (((Boolean) C1603900rq8.LIZ.getValue()).booleanValue() && (aRunnableS124S0100000_24 = this.LLILLL.k) != null) {
                C0CFK.LIZLLL = new Runnable() { // from class: X.0CFJ
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("FeedScrollHelper@cace.ensureScrollEndTrigger$1");
                        try {
                            aRunnableS124S0100000_24.run();
                            C0CFK.LIZLLL = null;
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("FeedScrollHelper@cace.ensureScrollEndTrigger$1");
                    }
                };
                Handler handler = (Handler) C0CFK.LIZJ.getValue();
                C0CFJ c0cfj = C0CFK.LIZLLL;
                if (c0cfj != null) {
                    C786410Ut5.LJLIIL(3000L, handler, c0cfj);
                }
            }
        } else if (i == 2) {
            String eventType2 = this.LLILLL.LLLLIIIILLL.getEventType();
            if (C0CFK.LIZ) {
                Iterator it3 = ((ArrayList) C0CFK.LJII).iterator();
                while (it3.hasNext()) {
                    ((Function1) it3.next()).invoke(eventType2);
                }
            }
        } else if (i == 0) {
            this.LLILLL.J();
            this.LLILLL.v();
            if (this.LLILLL.k != null) {
                if (((Boolean) C1603900rq8.LIZ.getValue()).booleanValue()) {
                    ARunnableS124S0100000_24 aRunnableS124S0100000_242 = this.LLILLL.k;
                    if (aRunnableS124S0100000_242 != null) {
                        if (C0CFK.LIZLLL != null) {
                            aRunnableS124S0100000_242.run();
                            Handler handler2 = (Handler) C0CFK.LIZJ.getValue();
                            C0CFJ c0cfj2 = C0CFK.LIZLLL;
                            if (c0cfj2 != null) {
                                handler2.removeCallbacks(c0cfj2);
                                C0CFK.LIZLLL = null;
                            }
                        } else {
                            C0CFK.LIZLLL = null;
                        }
                    }
                } else {
                    this.LLILLL.k.run();
                }
            }
        }
        if (C20636086o.LIZ() && this.LLILLL.LLLLIIIILLL.getEventType() != null && "homepage_hot".equals(this.LLILLL.LLLLIIIILLL.getEventType())) {
            C1603930rqB c1603930rqBLIZ = C1603930rqB.LIZ();
            c1603930rqBLIZ.getClass();
            if (C20636086o.LIZ()) {
                if (i == 0) {
                    c1603930rqBLIZ.LIZJ(false);
                    c1603930rqBLIZ.LIZLLL(false);
                } else {
                    c1603930rqBLIZ.LIZLLL(true);
                    c1603930rqBLIZ.LIZJ(true);
                }
            }
        }
    }

    @Override // X.C360660ECa, X.InterfaceC469360Ias
    public final void onPageSelected(final int i) {
        if (C285650BHn.LIZ) {
            C0SPC.LIZ(this.LLILLL.LJLIL(), null);
            if (C0X35.LJIIL("optimize_first_feed_downgrade_pageseleted_part2_4240") && C089T.LIZJ && C089T.LIZ()) {
                if (C590900NFo.LIZ) {
                    C089T.LIZIZ = true;
                }
                PlayerController.LLJI(new InterfaceC582410Msp() { // from class: X.0rq7
                    @Override // X.InterfaceC582410Msp
                    public final void LJII() {
                        this.LIZIZ.LIZ(i);
                    }
                });
                PlayerController.LLLLZ();
                return;
            }
        }
        LIZ(i);
    }

    @Override // X.C360660ECa, X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        if (!this.LL) {
            this.LL = true;
        }
        C0P0T c0p0t = this.LLILLL.p;
        if (c0p0t != null && c0p0t.isShowing()) {
            this.LLILLL.p.dismiss();
            this.LLILLL.p = null;
        }
    }
}
