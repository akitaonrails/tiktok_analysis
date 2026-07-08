package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.ss.android.ugc.aweme.ecommerce.search.utils.EcSearchKeyboardMonitor;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment;
import com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.ui.SearchFeedbackOptionalDetailFragment;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchLoadingAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R4E, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0R4E implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;

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
            case 5:
                onGlobalLayout$5(this);
                break;
            case 6:
                onGlobalLayout$6(this);
                break;
            case 7:
                onGlobalLayout$7(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(C0R4E c0r4e) {
        C688700Qzs c688700Qzs = (C688700Qzs) c0r4e.l0;
        TextView textView = c688700Qzs.LIZ;
        textView.setText(c688700Qzs.LIZ(textView.getText(), false));
        C786410Ut5.C3(((C688700Qzs) c0r4e.l0).LIZ.getViewTreeObserver(), c0r4e);
    }

    public static final void onGlobalLayout$1(C0R4E c0r4e) {
        C674570Qd5 c674570Qd5LIZ = C674580Qd6.LIZ(((EcSearchKeyboardMonitor) c0r4e.l0).LL);
        if (Intrinsics.LJFF(c674570Qd5LIZ, ((EcSearchKeyboardMonitor) c0r4e.l0).LLJ)) {
            return;
        }
        EcSearchKeyboardMonitor ecSearchKeyboardMonitor = (EcSearchKeyboardMonitor) c0r4e.l0;
        C674570Qd5 c674570Qd5 = ecSearchKeyboardMonitor.LLJ;
        ecSearchKeyboardMonitor.LLJ = c674570Qd5LIZ;
        if (c674570Qd5LIZ.LIZ) {
            ecSearchKeyboardMonitor.LIZIZ(c674570Qd5LIZ.LIZIZ, true);
        } else {
            ecSearchKeyboardMonitor.LIZIZ(0, false);
        }
        if (c674570Qd5LIZ.LIZ != c674570Qd5.LIZ) {
            ((EcSearchKeyboardMonitor) c0r4e.l0).LIZ(c674570Qd5LIZ);
        }
    }

    public static final void onGlobalLayout$2(C0R4E c0r4e) {
        if (((SearchFragment) c0r4e.l0).qS()) {
            SearchFragment searchFragment = (SearchFragment) c0r4e.l0;
            searchFragment.LLLLJI = false;
            C786410Ut5.C3(searchFragment.BS().getViewTreeObserver(), c0r4e);
            ((SearchFragment) c0r4e.l0).rT(System.currentTimeMillis(), ((SearchFragment) c0r4e.l0).LLJIJIL);
        }
    }

    public static final void onGlobalLayout$3(C0R4E c0r4e) {
        boolean z;
        int height;
        View view;
        View view2;
        SearchFeedbackOptionalDetailFragment searchFeedbackOptionalDetailFragment = (SearchFeedbackOptionalDetailFragment) c0r4e.l0;
        if (searchFeedbackOptionalDetailFragment.getContext() != null) {
            int iLIZ = C14KI.LIZ(searchFeedbackOptionalDetailFragment.getContext());
            Rect rect = new Rect();
            View view3 = searchFeedbackOptionalDetailFragment.LLILZIL;
            View view4 = null;
            if (view3 == null) {
                view3 = null;
            }
            view3.getWindowVisibleDisplayFrame(rect);
            Rect rect2 = new Rect();
            View view5 = searchFeedbackOptionalDetailFragment.LLILZIL;
            if (view5 == null) {
                view5 = null;
            }
            view5.getGlobalVisibleRect(rect2);
            int i = iLIZ - rect.bottom;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            int i2 = (int) (((double) iLIZ) * 0.73d);
            View view6 = searchFeedbackOptionalDetailFragment.LLILZIL;
            if (view6 == null) {
                view6 = null;
            }
            View view7 = (View) view6.getParent();
            if (view7 != null) {
                height = view7.getHeight();
            } else {
                height = 0;
            }
            View view8 = searchFeedbackOptionalDetailFragment.LLILZIL;
            if (view8 == null) {
                view8 = null;
            }
            searchFeedbackOptionalDetailFragment.LLJIJIL = height - view8.getLayoutParams().height;
            int i3 = height + i;
            if (i3 <= i2) {
                i2 = i3;
            }
            if (i != searchFeedbackOptionalDetailFragment.LLJILLL) {
                if (z) {
                    if (rect.bottom != rect2.bottom) {
                        View view9 = searchFeedbackOptionalDetailFragment.LLILZIL;
                        if (view9 == null) {
                            view2 = null;
                            view9 = null;
                        } else {
                            view2 = view9;
                        }
                        int paddingLeft = view9.getPaddingLeft();
                        View view10 = searchFeedbackOptionalDetailFragment.LLILZIL;
                        if (view10 == null) {
                            view10 = null;
                        }
                        int paddingTop = view10.getPaddingTop();
                        View view11 = searchFeedbackOptionalDetailFragment.LLILZIL;
                        if (view11 == null) {
                            view11 = null;
                        }
                        view2.setPadding(paddingLeft, paddingTop, view11.getPaddingRight(), i);
                        View view12 = searchFeedbackOptionalDetailFragment.LLILZIL;
                        if (view12 == null) {
                            view12 = null;
                        }
                        view12.getLayoutParams().height = i2 - searchFeedbackOptionalDetailFragment.LLJIJIL;
                    } else {
                        View view13 = searchFeedbackOptionalDetailFragment.LLILZIL;
                        if (view13 == null) {
                            view13 = null;
                        }
                        view13.getLayoutParams().height = (i2 - searchFeedbackOptionalDetailFragment.LLJIJIL) - i;
                    }
                    SearchFeedbackOptionalDetailFragment.OR((int) C418040GaI.LIZ(12), searchFeedbackOptionalDetailFragment.NR());
                    if (C284310BCj.LIZ()) {
                        C21578619ce c21578619ce = searchFeedbackOptionalDetailFragment.LLILZ;
                        if (c21578619ce != null) {
                            C426750GoL.LJIIIZ(c21578619ce, null, null, null, Integer.valueOf((int) C418040GaI.LIZ(84)), false, 23);
                        }
                    } else {
                        SearchFeedbackOptionalDetailFragment.OR((int) C418040GaI.LIZ(68), searchFeedbackOptionalDetailFragment.MR());
                    }
                } else {
                    View view14 = searchFeedbackOptionalDetailFragment.LLILZIL;
                    if (view14 == null) {
                        view14 = null;
                    }
                    view14.getLayoutParams().height = searchFeedbackOptionalDetailFragment.LLILZLL;
                    View view15 = searchFeedbackOptionalDetailFragment.LLILZIL;
                    if (view15 == null) {
                        view = null;
                        view15 = null;
                    } else {
                        view = view15;
                    }
                    int paddingLeft2 = view15.getPaddingLeft();
                    View view16 = searchFeedbackOptionalDetailFragment.LLILZIL;
                    if (view16 == null) {
                        view16 = null;
                    }
                    int paddingTop2 = view16.getPaddingTop();
                    View view17 = searchFeedbackOptionalDetailFragment.LLILZIL;
                    if (view17 == null) {
                        view17 = null;
                    }
                    view.setPadding(paddingLeft2, paddingTop2, view17.getPaddingRight(), 0);
                    SearchFeedbackOptionalDetailFragment.OR((int) C418040GaI.LIZ(46), searchFeedbackOptionalDetailFragment.NR());
                    if (C284310BCj.LIZ()) {
                        C21578619ce c21578619ce2 = searchFeedbackOptionalDetailFragment.LLILZ;
                        if (c21578619ce2 != null) {
                            C426750GoL.LJIIIZ(c21578619ce2, null, null, null, Integer.valueOf((int) C418040GaI.LIZ(121)), false, 23);
                        }
                    } else {
                        SearchFeedbackOptionalDetailFragment.OR((int) C418040GaI.LIZ(105), searchFeedbackOptionalDetailFragment.MR());
                    }
                }
                View view18 = searchFeedbackOptionalDetailFragment.LLILZIL;
                if (view18 != null) {
                    view4 = view18;
                }
                view4.requestLayout();
            }
            searchFeedbackOptionalDetailFragment.LLJILLL = i;
        }
    }

    public static final void onGlobalLayout$4(C0R4E c0r4e) {
        if (((View) ((SearchLoadingAssem) c0r4e.l0).LLJJL.getValue()).getHeight() == 0) {
            View view = (View) ((SearchLoadingAssem) c0r4e.l0).LLJJJJJIL.getValue();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
            view.setAlpha(1.0f);
            View view2 = (View) ((SearchLoadingAssem) c0r4e.l0).LLJJJJLIIL.getValue();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view2);
            view2.setAlpha(0.0f);
            return;
        }
        View view3 = (View) ((SearchLoadingAssem) c0r4e.l0).LLJJJJJIL.getValue();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view3);
        view3.setAlpha(0.0f);
        View view4 = (View) ((SearchLoadingAssem) c0r4e.l0).LLJJJJLIIL.getValue();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view4);
        view4.setAlpha(1.0f);
    }

    public static final void onGlobalLayout$5(C0R4E c0r4e) {
        ((SearchJediMixFeedFragment) c0r4e.l0).sV();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onGlobalLayout$6(C0R4E c0r4e) {
        SearchMixFeedList searchMixFeedList;
        List<SearchMixFeed> list;
        if (((Number) C272240Ali.LIZ.getValue()).intValue() == 0) {
            SearchJediMixFeedFragment searchJediMixFeedFragment = (SearchJediMixFeedFragment) c0r4e.l0;
            C0PN8 c0pn8 = searchJediMixFeedFragment.LLZ;
            if (c0pn8 != null && (searchMixFeedList = (SearchMixFeedList) c0pn8.getData()) != null && (list = searchMixFeedList.mItems) != null) {
                int i = 0;
                for (SearchMixFeed searchMixFeed : list) {
                    if (searchMixFeed.isReal && !searchMixFeed.alreadyLayout) {
                        break;
                    } else {
                        i++;
                    }
                }
                i = -1;
                searchJediMixFeedFragment.f398e0 = i;
            } else {
                i = -1;
                searchJediMixFeedFragment.f398e0 = i;
            }
        }
        C644060POa c644060POa = C644060POa.LIZ;
        SearchResultParam searchResultParam = ((SearchJediMixFeedFragment) c0r4e.l0).LLJIJIL;
        c644060POa.getClass();
        C0PO5 c0po5LJII = C644060POa.LJII(searchResultParam);
        c0po5LJII.getClass();
        C0PO5 c0po5 = C640870PBt.LIZ;
        if (!Intrinsics.LJFF(c0po5LJII, c0po5)) {
            c0po5LJII.LJLLLLLL++;
        }
        ((SearchJediMixFeedFragment) c0r4e.l0).dU();
        C0PO5 c0po5LJII2 = C644060POa.LJII(((SearchJediMixFeedFragment) c0r4e.l0).LLJIJIL);
        c0po5LJII2.getClass();
        if (!Intrinsics.LJFF(c0po5LJII2, c0po5)) {
            long jCurrentTimeMillis = c0po5LJII2.LJFF + (System.currentTimeMillis() - c0po5LJII2.LIZLLL);
            c0po5LJII2.LJFF = jCurrentTimeMillis;
            if (c0po5LJII2.LJJLIIIJILLIZJL && c0po5LJII2.LJJLIIIJJIZ < 0) {
                c0po5LJII2.LJJLIIIJJIZ = jCurrentTimeMillis;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onGlobalLayout$7(X.C0R4E r6) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0R4E.onGlobalLayout$7(X.0R4E):void");
    }

    public C0R4E(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
