package X;

import Y.AsS38S0200000_31;
import android.app.Activity;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.explore.assem.ExploreFeedCell;
import com.ss.android.ugc.aweme.explore.assem.ExploreTopicGeneralFeedListComponent;
import com.ss.android.ugc.aweme.explore.monitor.lcp.ExploreLCPTracker;
import com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackButtonAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: X.16HO, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16HO implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
            case 2:
                onGlobalLayout$2(this);
                break;
            case 3:
                onGlobalLayout$3(this);
                break;
            case 4:
                onGlobalLayout$4(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(C16HO c16ho) {
        Rect rect = new Rect();
        View view = ((C167I) c16ho.l0).LIZ;
        if (view != null) {
            view.getWindowVisibleDisplayFrame(rect);
        }
        int iHeight = rect.height();
        ((C167I) c16ho.l0).getClass();
        if (((C167I) c16ho.l0).LIZIZ == 0) {
            int statusBarHeight = ScreenUtils.getStatusBarHeight((Activity) c16ho.l1);
            View view2 = ((C167I) c16ho.l0).LIZ;
            if (view2 != null && Integer.valueOf(view2.getMeasuredHeight()) != null) {
                C167I c167i = (C167I) c16ho.l0;
                c167i.LIZIZ = c167i.LIZ.getMeasuredHeight() - statusBarHeight;
            } else {
                ((C167I) c16ho.l0).LIZIZ = iHeight;
            }
        }
        C167I c167i2 = (C167I) c16ho.l0;
        int i = c167i2.LIZIZ;
        if (i == iHeight) {
            return;
        }
        C167L c167l = c167i2.LIZJ;
        if (c167l != null) {
            int i2 = i - iHeight;
            int i3 = c167i2.LIZLLL;
            if (i2 > i3) {
                c167l.LJJIIJ(i - iHeight);
            } else if (i > iHeight) {
                c167l.LLLL(i - iHeight);
            } else if (iHeight - i > i3) {
                c167l.LJZI(iHeight - i);
            } else if (i < iHeight) {
                c167l.LLLL(i - iHeight);
            }
        }
        ((C167I) c16ho.l0).LIZIZ = iHeight;
    }

    public static final void onGlobalLayout$1(C16HO c16ho) {
        if (((View) c16ho.l0).getVisibility() == 0 && ((C20656115sF) c16ho.l1).LLILZLL.getState() != EnumC20657015sO.SHOWED) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(((C20656115sF) c16ho.l1).LLILLJJLI);
            sbLIZ.append(" change state from ");
            sbLIZ.append(((C20656115sF) c16ho.l1).LLILZLL.getState().name());
            sbLIZ.append(" to SHOWED");
            C20651915rZ.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            ((C20656115sF) c16ho.l1).LLILZLL.getStateWrapper().LIZJ();
            return;
        }
        if (((View) c16ho.l0).getVisibility() == 0 || ((C20656115sF) c16ho.l1).LLILZLL.getState() != EnumC20657015sO.SHOWED) {
            return;
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(((C20656115sF) c16ho.l1).LLILLJJLI);
        sbLIZ2.append(" change state from ");
        sbLIZ2.append(((C20656115sF) c16ho.l1).LLILZLL.getState().name());
        sbLIZ2.append(" to DISMISSED");
        C20651915rZ.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
        ((C20656115sF) c16ho.l1).LLILZLL.getStateWrapper().LIZ();
        C786410Ut5.C3(((View) c16ho.l0).getViewTreeObserver(), c16ho);
    }

    public static final void onGlobalLayout$2(C16HO c16ho) {
        int iIntValue;
        PowerCell powerCell;
        C20526015Tm c20526015Tm;
        Aweme aweme;
        String aid;
        RecyclerView recyclerView = (RecyclerView) c16ho.l0;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            boolean z = true;
            if (staggeredGridLayoutManager != null) {
                int iLJJIII = staggeredGridLayoutManager.LJJIII();
                int[] iArr = new int[iLJJIII];
                staggeredGridLayoutManager.LJIJ(iArr);
                int[] iArr2 = new int[iLJJIII];
                staggeredGridLayoutManager.LJIJJ(iArr2);
                Integer numLJJJJLL = C13LQ.LJJJJLL(iArr);
                int iIntValue2 = -1;
                if (numLJJJJLL != null) {
                    iIntValue = numLJJJJLL.intValue();
                } else {
                    iIntValue = -1;
                }
                Integer numLJJJJJL = C13LQ.LJJJJJL(iArr2);
                if (numLJJJJJL != null) {
                    iIntValue2 = numLJJJJJL.intValue();
                }
                if (iIntValue >= 0 && iIntValue2 >= iIntValue) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    if (iIntValue <= iIntValue2) {
                        while (true) {
                            RecyclerView.ViewHolder viewHolderFindViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(iIntValue);
                            if ((viewHolderFindViewHolderForLayoutPosition instanceof ExploreFeedCell) && (powerCell = (PowerCell) viewHolderFindViewHolderForLayoutPosition) != null && (c20526015Tm = (C20526015Tm) powerCell.getItem()) != null && (aweme = c20526015Tm.LL) != null && (aid = aweme.getAid()) != null && aid.length() != 0) {
                                linkedHashSet.add(aid);
                            }
                            if (iIntValue == iIntValue2) {
                                break;
                            } else {
                                iIntValue++;
                            }
                        }
                    }
                    if (!linkedHashSet.isEmpty()) {
                        boolean zSnapshotVisibleFirstScreen$explore_release = ExploreLCPTracker.INSTANCE.snapshotVisibleFirstScreen$explore_release((Long) c16ho.l1, linkedHashSet);
                        if (C15TM.LIZ() && !linkedHashSet.isEmpty()) {
                            synchronized (C2043407zU.LIZJ) {
                                try {
                                    if (C2043407zU.LIZLLL && !C2043407zU.LJ && !C2043407zU.LJFF) {
                                        HashSet<String> hashSet = C2043407zU.LJI;
                                        hashSet.retainAll(linkedHashSet);
                                        C2043407zU.LJFF = true;
                                        if (hashSet.isEmpty()) {
                                            C2043407zU.LJ = true;
                                        } else {
                                            z = false;
                                        }
                                        if (z) {
                                            C2043407zU.LIZIZ();
                                        }
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }
                        C2153908cD c2153908cD = C2153908cD.LIZ;
                        if (!zSnapshotVisibleFirstScreen$explore_release) {
                            ViewTreeObserver viewTreeObserver = ((RecyclerView) c16ho.l0).getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnGlobalLayoutListener(c16ho);
                                C2187701Ajg.LIZIZ(viewTreeObserver, c16ho, ViewTreeObserver.OnGlobalLayoutListener.class);
                            }
                        }
                    }
                }
            }
        }
    }

    public static final void onGlobalLayout$3(C16HO c16ho) {
        Long l;
        if (((View) c16ho.l0).getHeight() <= 0) {
            return;
        }
        ((ExploreTopicGeneralFeedListComponent) c16ho.l1).mp((View) c16ho.l0);
        ExploreTopicGeneralFeedListComponent exploreTopicGeneralFeedListComponent = (ExploreTopicGeneralFeedListComponent) c16ho.l1;
        exploreTopicGeneralFeedListComponent.LLJJLIIIJLLLLLLLZ = exploreTopicGeneralFeedListComponent.Zo();
        View view = (View) c16ho.l0;
        ExploreTopicGeneralFeedListComponent exploreTopicGeneralFeedListComponent2 = (ExploreTopicGeneralFeedListComponent) c16ho.l1;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = exploreTopicGeneralFeedListComponent2.LLJJLIIIJLLLLLLLZ + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            C786410Ut5.W5(view, marginLayoutParams);
            ((ExploreTopicGeneralFeedListComponent) c16ho.l1).LLJJJJLIIL = ((View) c16ho.l0).getHeight() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            C2153908cD c2153908cD = C2153908cD.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[Banner] onGlobalLayout tabId=");
            C15V2 c15v2Ja = ((ExploreTopicGeneralFeedListComponent) c16ho.l1).ja();
            if (c15v2Ja != null) {
                l = c15v2Ja.LIZIZ;
            } else {
                l = null;
            }
            sbLIZ.append(l);
            sbLIZ.append(" bannerH=");
            sbLIZ.append(((View) c16ho.l0).getHeight());
            sbLIZ.append(" appBarCoverage=");
            sbLIZ.append(((ExploreTopicGeneralFeedListComponent) c16ho.l1).LLJJLIIIJLLLLLLLZ);
            sbLIZ.append(" bannerTotalHeight=");
            sbLIZ.append(((ExploreTopicGeneralFeedListComponent) c16ho.l1).LLJJJJLIIL);
            sbLIZ.append(" paddingTop=");
            ExploreTopicGeneralFeedListComponent exploreTopicGeneralFeedListComponent3 = (ExploreTopicGeneralFeedListComponent) c16ho.l1;
            sbLIZ.append(exploreTopicGeneralFeedListComponent3.LLJJLIIIJLLLLLLLZ + exploreTopicGeneralFeedListComponent3.LLJJJJLIIL + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2153908cD.getClass();
            C2153908cD.LIZJ(3, strLIZIZ, "ExploreTopicGeneralFeedListComponent");
            ExploreTopicGeneralFeedListComponent exploreTopicGeneralFeedListComponent4 = (ExploreTopicGeneralFeedListComponent) c16ho.l1;
            if (exploreTopicGeneralFeedListComponent4.LLJJJJLIIL > 0) {
                C20522315Sb c20522315Sb = exploreTopicGeneralFeedListComponent4.LLJIJIL;
                if (c20522315Sb != null) {
                    ViewGroup.LayoutParams layoutParams2 = c20522315Sb.getLayoutParams();
                    if (layoutParams2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams2.topMargin = 0;
                        C786410Ut5.W5(c20522315Sb, marginLayoutParams2);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                }
                C1086520eNe c1086520eNeGo = ((ExploreTopicGeneralFeedListComponent) c16ho.l1).Go();
                ExploreTopicGeneralFeedListComponent exploreTopicGeneralFeedListComponent5 = (ExploreTopicGeneralFeedListComponent) c16ho.l1;
                c1086520eNeGo.setPaddingRelative(c1086520eNeGo.getPaddingStart(), exploreTopicGeneralFeedListComponent5.LLJJLIIIJLLLLLLLZ + exploreTopicGeneralFeedListComponent5.LLJJJJLIIL + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), c1086520eNeGo.getPaddingEnd(), c1086520eNeGo.getPaddingBottom());
                C20522315Sb c20522315Sb2 = ((ExploreTopicGeneralFeedListComponent) c16ho.l1).LLJIJIL;
                if (c20522315Sb2 != null) {
                    c20522315Sb2.setOverScrollMode(EnumC19356710o9.ONLY_TOP);
                }
                ExploreTopicGeneralFeedListComponent exploreTopicGeneralFeedListComponent6 = (ExploreTopicGeneralFeedListComponent) c16ho.l1;
                View view2 = exploreTopicGeneralFeedListComponent6.LLJJJ;
                if (view2 != null) {
                    view2.setClipBounds(new Rect(0, exploreTopicGeneralFeedListComponent6.LLJJLIIIJLLLLLLLZ, view2.getWidth(), view2.getHeight()));
                }
                ((ExploreTopicGeneralFeedListComponent) c16ho.l1).Bp(0);
                ExploreTopicGeneralFeedListComponent exploreTopicGeneralFeedListComponent7 = (ExploreTopicGeneralFeedListComponent) c16ho.l1;
                View view3 = (View) c16ho.l0;
                AsS38S0200000_31 asS38S0200000_31 = exploreTopicGeneralFeedListComponent7.LLJJL;
                if (asS38S0200000_31 != null) {
                    exploreTopicGeneralFeedListComponent7.Go().removeOnScrollListener(asS38S0200000_31);
                }
                exploreTopicGeneralFeedListComponent7.LLJJL = null;
                exploreTopicGeneralFeedListComponent7.LLJJJJJIL = 0;
                C786410Ut5.ed(view3, 0.0f);
                AsS38S0200000_31 asS38S0200000_312 = new AsS38S0200000_31(view3, exploreTopicGeneralFeedListComponent7, 1);
                exploreTopicGeneralFeedListComponent7.LLJJL = asS38S0200000_312;
                exploreTopicGeneralFeedListComponent7.Go().addOnScrollListener(asS38S0200000_312);
                C20522315Sb c20522315Sb3 = ((ExploreTopicGeneralFeedListComponent) c16ho.l1).LLJIJIL;
                if (c20522315Sb3 != null) {
                    c20522315Sb3.setBallOffset(r0.LLJJLIIIJLLLLLLLZ + r0.LLJJJJLIIL);
                }
                C20522315Sb c20522315Sb4 = ((ExploreTopicGeneralFeedListComponent) c16ho.l1).LLJIJIL;
                if (c20522315Sb4 != null) {
                    c20522315Sb4.setBallPullThreshold(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final void onGlobalLayout$4(C16HO c16ho) {
        String string;
        TextPaint paint;
        Integer numValueOf;
        CharSequence text;
        ViewTreeObserver viewTreeObserver;
        C197039127h c197039127h = ((EarlyFeedbackButtonAssem) c16ho.l0).LLJZ;
        if (c197039127h != null && (viewTreeObserver = c197039127h.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(c16ho);
            C2187701Ajg.LIZIZ(viewTreeObserver, c16ho, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        EarlyFeedbackButtonAssem earlyFeedbackButtonAssem = (EarlyFeedbackButtonAssem) c16ho.l0;
        C197039127h c197039127h2 = earlyFeedbackButtonAssem.LLJLLL;
        if (c197039127h2 != null) {
            C197039127h c197039127h3 = (C197039127h) c16ho.l1;
            if (c197039127h2.getTextSize() > c197039127h3.getTextSize()) {
                C197039127h c197039127h4 = earlyFeedbackButtonAssem.LLJLLL;
                if (c197039127h4 != null) {
                    c197039127h4.LJJJJLI(false);
                }
                C197039127h c197039127h5 = earlyFeedbackButtonAssem.LLJLLL;
                if (c197039127h5 != null) {
                    c197039127h5.setTextSize(C11VU.LJII(r2, c197039127h3.getContext()));
                }
            }
        }
        C197039127h c197039127h6 = ((EarlyFeedbackButtonAssem) c16ho.l0).LLJZ;
        if (c197039127h6 != null && (text = c197039127h6.getText()) != null) {
            string = text.toString();
        } else {
            string = null;
        }
        C197039127h c197039127h7 = ((EarlyFeedbackButtonAssem) c16ho.l0).LLJZ;
        if (c197039127h7 != null && (paint = c197039127h7.getPaint()) != null && (numValueOf = Integer.valueOf((int) paint.measureText(string))) != null) {
            EarlyFeedbackButtonAssem earlyFeedbackButtonAssem2 = (EarlyFeedbackButtonAssem) c16ho.l0;
            C197039127h c197039127h8 = (C197039127h) c16ho.l1;
            numValueOf.intValue();
            if (earlyFeedbackButtonAssem2.LLLFFI < numValueOf.intValue() + 30) {
                c197039127h8.setButtonStartIcon(null);
                C197039127h c197039127h9 = earlyFeedbackButtonAssem2.LLJLLL;
                if (c197039127h9 != null) {
                    c197039127h9.setButtonStartIcon(null);
                }
            }
        }
        ((C197039127h) c16ho.l1).requestLayout();
        C197039127h c197039127h10 = ((EarlyFeedbackButtonAssem) c16ho.l0).LLJLLL;
        if (c197039127h10 != null) {
            c197039127h10.requestLayout();
        }
    }

    public C16HO(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
