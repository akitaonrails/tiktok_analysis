package X;

import Y.ATListenerS450S0100000_17;
import Y.AfS135S0000000_12;
import Y.AfS186S0100000_17;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.FeedBanner;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0ehz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1099130ehz extends AbstractC468490IYt<FeedItem> {
    public final ViewPager LLILLL;
    public final C1100270ejp LLILZ;
    public C1099110ehx LLILZIL;
    public final RunnableC469800Iba LLILZLL;
    public final C1099120ehy LLIZ;
    public List<FeedBanner> LLIZLLLIL;
    public final String LLJ;
    public boolean LLJI;
    public final ViewGroup LLJIJIL;
    public final String LLJILJIL;

    @Override // X.AbstractC468490IYt
    public final boolean L5() {
        return true;
    }

    @Override // X.AbstractC468490IYt
    public final void onViewAttachedToWindow() {
        this.LL = true;
        this.LLJI = true;
        C1099120ehy c1099120ehy = this.LLIZ;
        if (c1099120ehy != null) {
            c1099120ehy.LLILZLL = true;
        }
        List<FeedBanner> list = this.LLIZLLLIL;
        R5(list != null && list.size() <= 1);
    }

    @Override // X.AbstractC468490IYt
    public final void onViewDetachedFromWindow() {
        this.LL = false;
        this.LLJI = false;
        C1099120ehy c1099120ehy = this.LLIZ;
        if (c1099120ehy != null) {
            c1099120ehy.LLILZLL = false;
        }
        stop();
    }

    public final void stop() {
        HandlerHook.viewRemoveCallbacks(this.LLILLL, this.LLILZLL);
        this.LLILLL.clearOnPageChangeListeners();
        C1099120ehy c1099120ehy = this.LLIZ;
        if (c1099120ehy != null) {
            c1099120ehy.LLILZ = false;
        }
    }

    public final void P5(List<FeedBanner> list) {
        int i;
        C1099120ehy c1099120ehy = this.LLIZ;
        if (c1099120ehy != null) {
            i = c1099120ehy.LLILZIL;
        } else {
            i = 0;
        }
        if (list != null && !list.isEmpty() && this.LLJI) {
            int size = i % list.size();
            FeedBanner feedBanner = (FeedBanner) ListProtector.get(list, size);
            HashMap map = new HashMap();
            C1097980eg8.LIZ(feedBanner, map, size);
            map.put("show_source", this.LLJ);
            map.put("banner_position", String.valueOf(size + 1));
            map.put("tab_type", this.LLJILJIL);
            map.put("landing_reason", C467800IWc.LJIJ.LJIIL);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("banner_show");
            c474500IjALIZ.LJJIIZI(map);
            c474500IjALIZ.LJIL();
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
                c474500IjALIZ.LIZ();
            } else {
                c474500IjALIZ.LJJIJL();
            }
        }
    }

    public final void R5(boolean z) {
        View view;
        ViewPager viewPager;
        if (this.LLJI && (view = this.itemView) != null && view.getVisibility() == 0) {
            String str = this.LLJILJIL;
            String str2 = C467800IWc.LJIJ.LJIIIIZZ;
            if ((!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) && !TextUtils.equals(str, str2)) {
                return;
            }
            if (z) {
                P5(this.LLIZLLLIL);
            }
            List<FeedBanner> list = this.LLIZLLLIL;
            if (list != null && list.size() > 1 && (viewPager = this.LLILLL) != null && this.LLILZ != null) {
                C1099120ehy c1099120ehy = this.LLIZ;
                if (c1099120ehy != null) {
                    c1099120ehy.LLILZ = true;
                }
                viewPager.clearOnPageChangeListeners();
                this.LLILLL.addOnPageChangeListener(this.LLIZ);
                this.LLILZ.setViewPager(this.LLILLL);
                ViewPager viewPager2 = this.LLILLL;
                RunnableC469800Iba runnableC469800Iba = this.LLILZLL;
                HandlerHook.viewRemoveCallbacks(viewPager2, runnableC469800Iba);
                HandlerHook.viewPostDelay(viewPager2, runnableC469800Iba, Mp4ScreenVideoLoadTimeout.CONTROL);
            }
        }
    }

    @Override // X.AbstractC468490IYt
    public final void I5(int i, Object obj) {
        List<FeedBanner> list;
        List<FeedBanner> list2;
        int measuredWidth;
        FeedItem feedItem = (FeedItem) obj;
        if (feedItem != null && (list = feedItem.banners) != null && (list2 = this.LLIZLLLIL) != list) {
            if (list2 != null && list2.size() == list.size()) {
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    FeedBanner feedBanner = (FeedBanner) ListProtector.get(list2, i2);
                    FeedBanner feedBanner2 = (FeedBanner) ListProtector.get(list, i2);
                    if ((feedBanner == null || feedBanner.LIZ(feedBanner2)) && (feedBanner2 == null || feedBanner2.LIZ(feedBanner))) {
                    }
                }
                return;
            }
            P5(list);
            HandlerHook.viewRemoveCallbacks(this.LLILLL, this.LLILZLL);
            this.LLIZLLLIL = list;
            this.LLILLL.setAdapter(null);
            if (!list.isEmpty()) {
                ViewGroup.LayoutParams layoutParams = this.LLILLL.getLayoutParams();
                Iterator<FeedBanner> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        FeedBanner next = it2.next();
                        if (next != null && next.width != 0) {
                            measuredWidth = (this.LLJIJIL.getMeasuredWidth() * next.height) / next.width;
                            break;
                        }
                    } else {
                        measuredWidth = 0;
                        break;
                    }
                }
                if (measuredWidth != layoutParams.height) {
                    layoutParams.height = measuredWidth;
                    C786410Ut5.q6(this.LLILLL, layoutParams);
                }
                if (this.LLILZIL == null) {
                    this.itemView.getContext();
                    this.LLILZIL = new C1099110ehx(C786410Ut5.ne(this.itemView.getContext()), this.LLJ);
                }
                C1099110ehx c1099110ehx = this.LLILZIL;
                List<FeedBanner> list3 = this.LLIZLLLIL;
                ((ArrayList) c1099110ehx.LLILZ).clear();
                if (list3 != null) {
                    ((ArrayList) c1099110ehx.LLILZ).addAll(list3);
                }
                c1099110ehx.notifyDataSetChanged();
                this.LLILLL.setAdapter(this.LLILZIL);
                if (this.LLIZLLLIL.size() > 1) {
                    ViewPager viewPager = this.LLILLL;
                    RunnableC469800Iba runnableC469800Iba = this.LLILZLL;
                    HandlerHook.viewRemoveCallbacks(viewPager, runnableC469800Iba);
                    HandlerHook.viewPostDelay(viewPager, runnableC469800Iba, Mp4ScreenVideoLoadTimeout.CONTROL);
                    this.LLILLL.clearOnPageChangeListeners();
                    this.LLILLL.addOnPageChangeListener(this.LLIZ);
                    C1099120ehy c1099120ehy = this.LLIZ;
                    if (c1099120ehy != null) {
                        c1099120ehy.LLILZ = true;
                    }
                    this.LLILZ.setViewPager(this.LLILLL);
                    C1100270ejp c1100270ejp = this.LLILZ;
                    int visibility = c1100270ejp.getVisibility();
                    c1100270ejp.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility, 0, c1100270ejp);
                    this.LLILZ.setCount(list.size());
                    this.LLILLL.setCurrentItem(this.LLIZLLLIL.size() * (Integer.MAX_VALUE / (this.LLIZLLLIL.size() * 2)));
                    return;
                }
                C1100270ejp c1100270ejp2 = this.LLILZ;
                int visibility2 = c1100270ejp2.getVisibility();
                c1100270ejp2.setVisibility(8);
                C1602160rnK.LIZIZ(visibility2, 8, c1100270ejp2);
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = this.LLILLL.getLayoutParams();
            layoutParams2.height = 0;
            C786410Ut5.q6(this.LLILLL, layoutParams2);
            this.LLILZIL = null;
            C1100270ejp c1100270ejp3 = this.LLILZ;
            int visibility3 = c1100270ejp3.getVisibility();
            c1100270ejp3.setVisibility(8);
            C1602160rnK.LIZIZ(visibility3, 8, c1100270ejp3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0Iba, java.lang.Runnable] */
    public C1099130ehz(View view, String str, C11RK<Object> c11rk, C11RK<Object> c11rk2, C11RK<Pair<Boolean, String>> c11rk3, ViewGroup viewGroup, String str2) {
        super(view);
        this.LLJILJIL = str2;
        this.LLJIJIL = viewGroup;
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        this.LLILLL = viewPager;
        C1100270ejp c1100270ejp = (C1100270ejp) view.findViewById(R.id.kl2);
        this.LLILZ = c1100270ejp;
        this.LLJ = str;
        ?? r0 = new Runnable(viewPager) { // from class: X.0Iba
            public final ViewPager LL;

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("DrawerBannerViewHolder$PageRunnable@edb8.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("DrawerBannerViewHolder$PageRunnable@edb8.run");
            }

            public final void LIZ() {
                if (C497740JfY.LJJ()) {
                    ViewPager viewPager2 = this.LL;
                    viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
                    return;
                }
                try {
                    Field declaredField = ViewPager.class.getDeclaredField("mFirstLayout");
                    declaredField.setAccessible(true);
                    declaredField.set(this.LL, Boolean.FALSE);
                    declaredField.setAccessible(false);
                    Class cls = Integer.TYPE;
                    Class cls2 = Boolean.TYPE;
                    Method declaredMethod = ViewPager.class.getDeclaredMethod("setCurrentItemInternal", cls, cls2, cls2, cls);
                    declaredMethod.setAccessible(true);
                    ViewPager viewPager3 = this.LL;
                    Boolean bool = Boolean.TRUE;
                    declaredMethod.invoke(viewPager3, Integer.valueOf(viewPager3.getCurrentItem() + 1), bool, bool, 1);
                    declaredMethod.setAccessible(false);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    ViewPager viewPager4 = this.LL;
                    viewPager4.setCurrentItem(viewPager4.getCurrentItem() + 1);
                }
            }

            {
                this.LL = viewPager;
            }
        };
        this.LLILZLL = r0;
        HandlerHook.viewRemoveCallbacks(viewPager, r0);
        C1099120ehy c1099120ehy = new C1099120ehy(viewPager, r0, str, str2);
        this.LLIZ = c1099120ehy;
        viewPager.setOnTouchListener(new ATListenerS450S0100000_17(this, 4));
        c1100270ejp.setViewPager(viewPager);
        ViewPager viewPager2 = c1100270ejp.LLJIJIL;
        if (viewPager2 != null) {
            viewPager2.addOnPageChangeListener(c1099120ehy);
        }
        c11rk3.LJJLL(new AfS186S0100000_17(this, 73), new AfS135S0000000_12(3));
        c11rk.LJJLL(new AfS186S0100000_17(this, 74), new AfS135S0000000_12(4));
        c11rk2.LJJLL(new AfS186S0100000_17(this, 75), new AfS135S0000000_12(5));
    }
}
