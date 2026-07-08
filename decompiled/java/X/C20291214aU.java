package X;

import android.content.Context;
import android.util.LruCache;
import androidx.fragment.app.Fragment;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.controller.I18nPlayerController;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurveyConfig;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.feed.platform.panel.live.FeedLiveScrollConfigComponent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS274S0000000_30;

/* JADX INFO: renamed from: X.14aU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20291214aU implements InterfaceC764760TzG {
    public final /* synthetic */ BaseListFragmentPanel LIZ;

    public final void LIZIZ() {
        if (this.LIZ.LLLILZJ) {
            return;
        }
        C740400T2o.LIZ = true;
        C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new C0T0Z(true));
        C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new RunnableC739120Sz0());
        this.LIZ.LLLILZJ = true;
    }

    public C20291214aU(BaseListFragmentPanel baseListFragmentPanel) {
        this.LIZ = baseListFragmentPanel;
    }

    public final boolean LIZJ(boolean z) {
        if (!this.LIZ.LLJILJILJ() || !C1017070cZd.LLIZLLLIL(this.LIZ.LJIIIIZZ()) || C1017070cZd.LJJJ(this.LIZ.LJIIIIZZ()) == null || C1017070cZd.LJJJ(this.LIZ.LJIIIIZZ()).getSwipeUpType() != 5 || !(this.LIZ.getContext() instanceof C19EG) || !C1074300e3w.LIZ((C19EG) this.LIZ.getContext()).wQ2()) {
            return false;
        }
        if (!z) {
            return true;
        }
        if (C1074300e3w.LIZ((C19EG) this.LIZ.getContext()).LLILLL.getValue() == null || C1074300e3w.LIZ((C19EG) this.LIZ.getContext()).LLILLL.getValue().floatValue() < C12ES.LIZJ(54.0f, this.LIZ.getContext())) {
            return false;
        }
        return true;
    }

    public final int LIZLLL(int i, int i2, int i3) {
        InterfaceC689860R4e interfaceC689860R4eK9;
        C0SZ8 c0sz8LJLIL = this.LIZ.LJLIL();
        if (c0sz8LJLIL != null && (interfaceC689860R4eK9 = c0sz8LJLIL.K9()) != null && interfaceC689860R4eK9.LJLILLLLZI() != null && interfaceC689860R4eK9.LJLILLLLZI().LJJJJI(i, i2, i3)) {
            this.LIZ.LLIL(true);
            return i2;
        }
        return i;
    }

    public final int LJ(int i, int i2, int i3, int i4) {
        long jLJLJJI;
        String str;
        FeedSurvey feedSurvey;
        Aweme awemeLJIIIIZZ = this.LIZ.LJIIIIZZ();
        if (awemeLJIIIIZZ == null) {
            return i;
        }
        if (this.LIZ.LLJILJILJ()) {
            C20291514aX c20291514aX = C20291514aX.LIZ;
            String aid = awemeLJIIIIZZ.getAid();
            if (aid != null) {
                HashSet<String> hashSet = C20291514aX.LJ;
                if (!hashSet.contains(aid)) {
                    C20291514aX.LIZ.getClass();
                    hashSet.add(aid);
                    C20291514aX.LIZLLL++;
                    C20291414aW c20291414aW = C20291414aW.LIZ;
                    int i5 = C20291514aX.LIZLLL;
                    c20291414aW.getClass();
                    Iterator<C20292814ak> it2 = C20291414aW.LIZLLL.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (it2.next().LIZLLL == i5) {
                                C14ZY.LIZ("tracker_try_show_feedback_survey");
                                if (!C20292414ag.LIZIZ(awemeLJIIIIZZ)) {
                                    C14ZY.LIZ("tracker_empty_survey_info");
                                }
                            }
                        } else {
                            C20291414aW c20291414aW2 = C20291414aW.LIZ;
                            int i6 = C20291514aX.LIZLLL;
                            c20291414aW2.getClass();
                            Iterator<C20292814ak> it3 = C20291414aW.LIZLLL.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                if (it3.next().LJ == i6) {
                                    ArrayList<C20292814ak> arrayList = C20291414aW.LIZLLL;
                                    if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
                                        C14ZY.LIZ("tracker_miss_show_feedback_survey");
                                    } else {
                                        for (C20292814ak c20292814ak : arrayList) {
                                            C20291314aV c20291314aV = C20291314aV.LIZ;
                                            FeedSurveyConfig feedSurveyConfig = c20292814ak.LIZJ;
                                            if (feedSurveyConfig == null || (feedSurvey = feedSurveyConfig.fixedSurvey) == null || (str = feedSurvey.surveyKey) == null) {
                                                str = "";
                                            }
                                            c20291314aV.getClass();
                                            if (!(!C20291314aV.LJIIIZ(str))) {
                                                break;
                                            }
                                        }
                                        C14ZY.LIZ("tracker_miss_show_feedback_survey");
                                    }
                                }
                            }
                        }
                    }
                    C20291514aX.LIZ.getClass();
                    Keva keva = C20291514aX.LIZJ;
                    keva.storeInt("key_day_aweme_count", C20291514aX.LIZLLL);
                    keva.storeLong("key_last_day_time", System.currentTimeMillis());
                }
            }
            int i7 = C1867270ygv.LIZ;
            String aid2 = awemeLJIIIIZZ.getAid();
            if (aid2 != null) {
                LruCache<String, Boolean> lruCache = C1867270ygv.LIZIZ;
                if (lruCache.get(aid2) == null) {
                    lruCache.put(aid2, Boolean.TRUE);
                    C1867270ygv.LIZ++;
                }
            }
        }
        C0SZ8 c0sz8LJLIL = this.LIZ.LJLIL();
        if (C300680BqU.LIZ()) {
            if (!C14ZO.LIZ(awemeLJIIIIZZ, C14ZQ.PAGER_SWIPE, this.LIZ.getEventType())) {
                return i;
            }
        } else {
            C14Z4.LIZ(awemeLJIIIIZZ);
            if (AwemeSaaSExtKt.isLive(awemeLJIIIIZZ) && c0sz8LJLIL != null) {
                if (C14Z7.LIZ(awemeLJIIIIZZ) || !C14Z7.LIZJ(awemeLJIIIIZZ, true) || !C14Z7.LJI(this.LIZ.getContext(), c0sz8LJLIL) || !c0sz8LJLIL.LL() || c0sz8LJLIL.LLIILZL()) {
                    return i;
                }
                C20286914Zn.LIZIZ.LJIIJ("[tryShowSurvey] when user swipe live card, show single choice survey", awemeLJIIIIZZ);
                return i2;
            }
            if (AwemeExtKt.isPhotoMode(awemeLJIIIIZZ) && c0sz8LJLIL != null) {
                if (this.LIZ.LLJILJILJ() && !C14Z7.LIZ(awemeLJIIIIZZ) && C14Z7.LIZJ(awemeLJIIIIZZ, true)) {
                    C14Z7 c14z7 = C14Z7.LIZ;
                    if ((C14ZW.LIZLLL(awemeLJIIIIZZ) != C14Z5.GREY_CARD.getType() || !c0sz8LJLIL.LLIIZ()) && C14Z7.LJI(this.LIZ.getContext(), c0sz8LJLIL)) {
                        C20286914Zn.LIZIZ.LJIIJ("[tryShowSurvey] when user swipe photo card, show single choice survey", awemeLJIIIIZZ);
                        return i2;
                    }
                }
                return i;
            }
            if ((!C14Z4.LJFF(awemeLJIIIIZZ) || c0sz8LJLIL == null || !c0sz8LJLIL.LLIIZ()) && this.LIZ.LLJILJILJ()) {
                this.LIZ.LLLLLLZ = C0T1R.LJ(awemeLJIIIIZZ);
                boolean zLLJJJJ = this.LIZ.LLJJJJ(true);
                BaseListFragmentPanel baseListFragmentPanel = this.LIZ;
                baseListFragmentPanel.LLLLLLLZIL = baseListFragmentPanel.LLLLLLZ;
                if (zLLJJJJ) {
                }
            }
            return i;
        }
        String str2 = C1012040cRW.LIZIZ().LIZIZ;
        I18nPlayerController i18nPlayerController = this.LIZ.LLLLIILL;
        if (i18nPlayerController != null) {
            jLJLJJI = i18nPlayerController.LJLJJI(str2);
        } else {
            jLJLJJI = 0;
        }
        if ((System.currentTimeMillis() - jLJLJJI) / 1000 > 1.0f) {
            try {
                if (C14Z4.LJFF(awemeLJIIIIZZ)) {
                    C20286914Zn.LIZIZ.LJIIJ("[tryShowSurvey] when user swipe, show grey card survey", awemeLJIIIIZZ);
                    if (c0sz8LJLIL != null && !c0sz8LJLIL.LLIIZ()) {
                        c0sz8LJLIL.ev();
                        return i2;
                    }
                } else if (C14Z4.LIZLLL(awemeLJIIIIZZ)) {
                    Fragment fragment = this.LIZ.getFragment();
                    Context context = this.LIZ.getContext();
                    BaseListFragmentPanel baseListFragmentPanel2 = this.LIZ;
                    if (C20286614Zk.LJIIIIZZ(awemeLJIIIIZZ, fragment, context, baseListFragmentPanel2.LLJJIJI, i, i3, i4, baseListFragmentPanel2.LLLLIILL.LJLJJI(str2))) {
                        C20286914Zn.LIZIZ.LJIIJ("[tryShowSurvey] when user swipe, show dialog survey", awemeLJIIIIZZ);
                        return i2;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return i;
    }

    public final void LIZ(float f, float f2, float f3, float f4, float f5, int i, int i2, int i3) {
        Aweme awemeLJIIIIZZ = this.LIZ.LJIIIIZZ();
        if (awemeLJIIIIZZ != null && AwemeSaaSExtKt.isLive(awemeLJIIIIZZ)) {
            String str = FeedLiveScrollConfigComponent.LLJJ;
            Context context = this.LIZ.getContext();
            double dAbs = Math.abs(f4 - f3);
            double dAbs2 = Math.abs(f5 - f2);
            if (C0OHO.LIZ().openDebugTool) {
                String str2 = "angle：" + (((double) 90) - Math.toDegrees(Math.atan2(dAbs, dAbs2))) + " \n pageOffset: " + f + " \ndeltaY: " + dAbs + " deltaX: " + dAbs2 + " \nVelocity: " + i3 + " \nnextPage: " + i + " ,curPage: " + i2 + " \nexpConfig: \n   live_exp_fling_distance: " + ((Number) C0OHO.LIZIZ.getValue()).intValue() + " \n  live_exp_minimum_velocity: " + ((Number) C0OHO.LJ.getValue()).intValue() + " \n  live_exp_added_page_offset: " + C0OHO.LIZ().liveExpAddedPageOffset + " \n  live_touchSlop: " + ((Number) C0OHO.LIZJ.getValue()).intValue() + " \n  live_long_press_time: " + C0OHO.LIZ().liveLongPressTime + " \n live_long_press_distance: " + ((Number) C0OHO.LIZLLL.getValue()).intValue() + " \n";
                C1397580mTM c1397580mTM = new C1397580mTM(context);
                c1397580mTM.LJI("scroll info");
                c1397580mTM.LIZIZ(str2);
                C985403tE.LIZ(c1397580mTM, AFwS274S0000000_30.get$arr$(233));
                new C1397510mTF(c1397580mTM).LIZLLL();
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0NM4(context, awemeLJIIIIZZ, i3, f2, f3, f4, f5, null), 3);
        }
    }
}
