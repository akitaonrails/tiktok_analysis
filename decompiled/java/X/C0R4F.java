package X;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.search.result.skin.GeneralVerticalSkinAssem;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.ui.ECSearchSuggestAssem;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.ui.EcSearchSuggestAssemNew;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.background.ui.SearchTop1BackgroundAssem;
import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchContainerFragment;
import com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.ISearchSevenSplitScreenRootFragmentAbility;
import com.ss.android.ugc.aweme.search.pages.sevensplitscreen.assem.SearchSevenSplitScreenBehaviorAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS25S0001000_10;
import kotlin.jvm.internal.AwS9S0002000_10;

/* JADX INFO: renamed from: X.0R4F, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0R4F implements ViewTreeObserver.OnGlobalLayoutListener {
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
            case 5:
                onGlobalLayout$5(this);
                break;
            case 6:
                onGlobalLayout$6(this);
                break;
            case 7:
                onGlobalLayout$7(this);
                break;
            case 8:
                onGlobalLayout$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onGlobalLayout$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onGlobalLayout$10(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(C0R4F c0r4f) {
        if (((View) c0r4f.l0).isLaidOut()) {
            C786410Ut5.C3(((View) c0r4f.l0).getViewTreeObserver(), c0r4f);
            int[] iArr = new int[2];
            ((View) c0r4f.l0).getLocationOnScreen(iArr);
            ((GeneralVerticalSkinAssem) c0r4f.l1).So().setState(new AwS25S0001000_10(iArr[1], 3));
        }
    }

    public static final void onGlobalLayout$1(C0R4F c0r4f) {
        if (((View) c0r4f.l0).getWidth() > 0) {
            C786410Ut5.C3(((View) c0r4f.l0).getViewTreeObserver(), c0r4f);
            ((Function1) c0r4f.l1).invoke(Integer.valueOf(((View) c0r4f.l0).getWidth()));
        }
    }

    public static final void onGlobalLayout$10(C0R4F c0r4f) {
        ISearchSevenSplitScreenRootFragmentAbility iSearchSevenSplitScreenRootFragmentAbility;
        ((SearchSevenSplitScreenBehaviorAssem) c0r4f.l0).Jo();
        Fragment fragmentLJI = C724240Sb0.LJI((SearchSevenSplitScreenBehaviorAssem) c0r4f.l0);
        if (fragmentLJI != null && (iSearchSevenSplitScreenRootFragmentAbility = (ISearchSevenSplitScreenRootFragmentAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), ISearchSevenSplitScreenRootFragmentAbility.class, null)) != null) {
            iSearchSevenSplitScreenRootFragmentAbility.v0();
        }
        ViewTreeObserver viewTreeObserver = ((View) c0r4f.l1).getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(c0r4f);
            C2187701Ajg.LIZIZ(viewTreeObserver, c0r4f, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    public static final void onGlobalLayout$2(C0R4F c0r4f) {
        Function0<Boolean> function0;
        C0PC5 c0pc5Lo;
        Function0<Integer> function02;
        Function1<? super C0PC6, Integer> function1;
        C661360Pws c661360Pws;
        Function0<Rect> function03;
        Rect rectInvoke;
        Function1<? super C0PC6, Integer> function12;
        C0PC5 c0pc5Lo2 = ((SearchTop1BackgroundAssem) c0r4f.l0).Lo();
        boolean z = true;
        if (c0pc5Lo2 != null && (function0 = c0pc5Lo2.LLILLJJLI) != null && function0.invoke().booleanValue() && (c0pc5Lo = ((SearchTop1BackgroundAssem) c0r4f.l0).Lo()) != null && (function02 = c0pc5Lo.LLILLL) != null) {
            int iIntValue = function02.invoke().intValue();
            C0PC5 c0pc5Lo3 = ((SearchTop1BackgroundAssem) c0r4f.l0).Lo();
            if (c0pc5Lo3 != null && (function1 = c0pc5Lo3.LLILZ) != null) {
                ((SearchTop1BackgroundAssem) c0r4f.l0).Ho().setState(new AwS9S0002000_10(iIntValue, function1.invoke(((SearchTop1BackgroundAssem) c0r4f.l0).Jo()).intValue(), 1));
                C0PC5 c0pc5Lo4 = ((SearchTop1BackgroundAssem) c0r4f.l0).Lo();
                if (c0pc5Lo4 != null && (function12 = c0pc5Lo4.LLIZ) != null) {
                    Integer numValueOf = Integer.valueOf(function12.invoke(((SearchTop1BackgroundAssem) c0r4f.l0).Jo()).intValue());
                    if (numValueOf.intValue() >= 0) {
                        ((SearchTop1BackgroundAssem) c0r4f.l0).LLJJJJLIIL = numValueOf.intValue();
                    }
                }
                C0PC5 c0pc5Lo5 = ((SearchTop1BackgroundAssem) c0r4f.l0).Lo();
                if (c0pc5Lo5 != null && (function03 = c0pc5Lo5.LLILZLL) != null && (rectInvoke = function03.invoke()) != null) {
                    SearchTop1BackgroundAssem searchTop1BackgroundAssem = (SearchTop1BackgroundAssem) c0r4f.l0;
                    int i = rectInvoke.top;
                    int i2 = rectInvoke.bottom;
                    C661360Pws c661360Pws2 = searchTop1BackgroundAssem.LLJJIJIIJIL;
                    if (c661360Pws2 != null) {
                        c661360Pws2.LLJJ = i;
                        c661360Pws2.LLJJI = i2;
                        c661360Pws2.invalidateSelf();
                    }
                    SearchTop1BackgroundAssem.LLJZ.getClass();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("dividerTop = ");
                    sbLIZ.append(rectInvoke.top);
                    sbLIZ.append(", dividerBottom = ");
                    sbLIZ.append(rectInvoke.bottom);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
                int iComputeVerticalScrollOffset = ((RecyclerView) c0r4f.l1).computeVerticalScrollOffset();
                SearchTop1BackgroundAssem searchTop1BackgroundAssem2 = (SearchTop1BackgroundAssem) c0r4f.l0;
                if (iComputeVerticalScrollOffset < searchTop1BackgroundAssem2.LLJJJJLIIL && (c661360Pws = searchTop1BackgroundAssem2.LLJJIJIIJIL) != null) {
                    int i3 = -iComputeVerticalScrollOffset;
                    float f = -c661360Pws.LLJILJIL;
                    int i4 = c661360Pws.LLJILJILJ;
                    if (f <= i4 || (-i3) <= i4) {
                        c661360Pws.LLJILJIL = i3 * 1.0f;
                        c661360Pws.invalidateSelf();
                    }
                }
                SearchTop1BackgroundAssem searchTop1BackgroundAssem3 = (SearchTop1BackgroundAssem) c0r4f.l0;
                if (((RecyclerView) c0r4f.l1).computeVerticalScrollOffset() >= ((SearchTop1BackgroundAssem) c0r4f.l0).LLJJJJLIIL) {
                    z = false;
                }
                searchTop1BackgroundAssem3.Np2(z);
            }
        }
    }

    public static final void onGlobalLayout$3(C0R4F c0r4f) {
        Layout layout = ((C688640Qzm) c0r4f.l0).getLayout();
        if (layout != null) {
            C688640Qzm c688640Qzm = (C688640Qzm) c0r4f.l0;
            TextView.BufferType bufferType = (TextView.BufferType) c0r4f.l1;
            C786410Ut5.C3(c688640Qzm.getViewTreeObserver(), c0r4f);
            c688640Qzm.LJJJJLL(layout, bufferType);
        }
    }

    public static final void onGlobalLayout$4(C0R4F c0r4f) {
        SearchContainerFragment searchContainerFragment = (SearchContainerFragment) c0r4f.l0;
        ViewTreeObserver.OnGlobalLayoutListener[] onGlobalLayoutListenerArr = (ViewTreeObserver.OnGlobalLayoutListener[]) c0r4f.l1;
        C649950PeT c649950PeT = searchContainerFragment.LLILZIL;
        if (c649950PeT != null) {
            C786410Ut5.C3(c649950PeT.getViewTreeObserver(), onGlobalLayoutListenerArr[0]);
        }
        if (!C1823307Cd.LIZ()) {
            searchContainerFragment.gS(Boolean.TRUE);
        }
        searchContainerFragment.LLJJJJ.CQ2();
        searchContainerFragment.LLJJJJ.DQ2(searchContainerFragment.LL);
    }

    public static final void onGlobalLayout$5(C0R4F c0r4f) {
        Layout layout = ((TextView) c0r4f.l0).getLayout();
        if (layout != null) {
            C786410Ut5.C3(((TextView) c0r4f.l0).getViewTreeObserver(), c0r4f);
            if (((InterfaceC20236714Gf) c0r4f.l1).isActive()) {
                ((InterfaceC20236714Gf) c0r4f.l1).LJJIFFI(null, Integer.valueOf(layout.getLineCount()));
            }
        }
    }

    public static final void onGlobalLayout$6(C0R4F c0r4f) {
        Layout layout = ((TextView) c0r4f.l0).getLayout();
        if (layout != null) {
            C786410Ut5.C3(((TextView) c0r4f.l0).getViewTreeObserver(), c0r4f);
            ((Function1) c0r4f.l1).invoke(layout);
        }
    }

    public static final void onGlobalLayout$7(C0R4F c0r4f) {
        if (((View) c0r4f.l0).getGlobalVisibleRect(new Rect())) {
            ((Function1) c0r4f.l1).invoke((View) c0r4f.l0);
            C786410Ut5.C3(((View) c0r4f.l0).getViewTreeObserver(), c0r4f);
        }
    }

    public static final void onGlobalLayout$8(C0R4F c0r4f) {
        int width;
        ViewTreeObserver viewTreeObserver;
        long jLongValue;
        RecyclerView recyclerView = ((EcSearchSuggestAssemNew) c0r4f.l0).LLL;
        int height = 0;
        if (recyclerView != null) {
            width = recyclerView.getWidth();
        } else {
            width = 0;
        }
        RecyclerView recyclerView2 = ((EcSearchSuggestAssemNew) c0r4f.l0).LLL;
        if (recyclerView2 != null) {
            height = recyclerView2.getHeight();
        }
        if (width > 0 && height > 0) {
            EcSearchSuggestAssemNew ecSearchSuggestAssemNew = (EcSearchSuggestAssemNew) c0r4f.l0;
            int size = ((List) c0r4f.l1).size();
            C0QWI c0qwi = ecSearchSuggestAssemNew.LLJJIJIIJIL;
            if (c0qwi != null) {
                boolean z = !ecSearchSuggestAssemNew.LLJLL;
                boolean zKF2 = ecSearchSuggestAssemNew.KF2();
                Integer numValueOf = Integer.valueOf(size);
                long jCurrentTimeMillis = System.currentTimeMillis();
                C673320Qb4.LIZ.getClass();
                Long lLIZLLL = C673320Qb4.LIZLLL();
                if (lLIZLLL != null) {
                    jLongValue = lLIZLLL.longValue();
                } else {
                    jLongValue = ecSearchSuggestAssemNew.LLJJL;
                }
                c0qwi.LJ("history", "native_history_render", true, z, zKF2, numValueOf, Long.valueOf(jCurrentTimeMillis - jLongValue), false, false, null);
            }
        }
        RecyclerView recyclerView3 = ((EcSearchSuggestAssemNew) c0r4f.l0).LLL;
        if (recyclerView3 != null && (viewTreeObserver = recyclerView3.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(c0r4f);
            C2187701Ajg.LIZIZ(viewTreeObserver, c0r4f, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    public static final void onGlobalLayout$9(C0R4F c0r4f) {
        int width;
        ViewTreeObserver viewTreeObserver;
        long jLongValue;
        RecyclerView recyclerViewLp = ((ECSearchSuggestAssem) c0r4f.l0).lp();
        int height = 0;
        if (recyclerViewLp != null) {
            width = recyclerViewLp.getWidth();
        } else {
            width = 0;
        }
        RecyclerView recyclerViewLp2 = ((ECSearchSuggestAssem) c0r4f.l0).lp();
        if (recyclerViewLp2 != null) {
            height = recyclerViewLp2.getHeight();
        }
        if (width > 0 && height > 0) {
            ECSearchSuggestAssem eCSearchSuggestAssem = (ECSearchSuggestAssem) c0r4f.l0;
            int size = ((List) c0r4f.l1).size();
            C0QWI c0qwi = eCSearchSuggestAssem.LLJJJJJIL;
            if (c0qwi != null) {
                boolean z = !eCSearchSuggestAssem.tp().LL;
                boolean zKF2 = eCSearchSuggestAssem.KF2();
                Integer numValueOf = Integer.valueOf(size);
                long jCurrentTimeMillis = System.currentTimeMillis();
                C673320Qb4.LIZ.getClass();
                Long lLIZLLL = C673320Qb4.LIZLLL();
                if (lLIZLLL != null) {
                    jLongValue = lLIZLLL.longValue();
                } else {
                    jLongValue = eCSearchSuggestAssem.LLJJL;
                }
                c0qwi.LJ("history", "native_history_render", true, z, zKF2, numValueOf, Long.valueOf(jCurrentTimeMillis - jLongValue), false, false, null);
            }
        }
        RecyclerView recyclerViewLp3 = ((ECSearchSuggestAssem) c0r4f.l0).lp();
        if (recyclerViewLp3 != null && (viewTreeObserver = recyclerViewLp3.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(c0r4f);
            C2187701Ajg.LIZIZ(viewTreeObserver, c0r4f, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    public C0R4F(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
