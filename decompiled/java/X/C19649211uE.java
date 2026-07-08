package X;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS608S0100000_29;
import nv7.c0;

/* JADX INFO: renamed from: X.11uE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19649211uE extends AbstractC1664490tPr<C19649611uI, C19649311uF> {
    public ViewGroup LLJJJIL;
    public ViewPager LLJJJJ;
    public FrameLayout LLJJJJJIL;
    public View LLJJJJLIIL;
    public C19648811uA LLJJL;
    public final int LLJJLIIIJLLLLLLLZ;
    public final float LLJL;
    public int LLJLIL;
    public int LLJLILLLLZIIL;
    public final int LLJLL;

    public C19649211uE() {
        int screenWidth = ScreenUtils.getScreenWidth(C1BWL.LIZ());
        this.LLJJLIIIJLLLLLLLZ = screenWidth;
        this.LLJL = screenWidth / 0.5625f;
        this.LLJLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(207));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        C422020Ggi c422020Ggi;
        int count;
        PagerAdapter adapter;
        super.onActivityCreated(bundle);
        this.LLJLIL = LLLLIL().LIZJ.invoke().intValue();
        this.LLJLILLLLZIIL = LLLLIL().LIZLLL.invoke().intValue();
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.11uK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19649611uI) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 147));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.11uG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C19649611uI) obj).LIZLLL);
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 148));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.11uH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C19649611uI) obj).LIZJ);
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 149));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.11uJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19649611uI) obj).LJ;
            }
        }, new AwS608S0100000_29(this, 150));
        this.LLJJJJ = (ViewPager) requireViewById(R.id.view_pager_autocut_photo);
        this.LLJJJJJIL = (FrameLayout) requireViewById(R.id.view_pager_container);
        if (C1417210mz1.LIZIZ(LLLLILI().LIZ.LJFF)) {
            if (LLLLILI().LIZ.LJFF.creativeModel.photoModeAutoCutModel.isDifferentiatedLayout()) {
                int i = C1428150nGf.LIZ;
                C19649611uI c19649611uI = LLLLILI().LIZ;
                RectF rectFLIZJ = C1428150nGf.LIZJ();
                LLLLLJIL(this.LLJJLIIIJLLLLLLLZ, rectFLIZJ.height(), 0.0f, rectFLIZJ.top);
            } else {
                float f = this.LLJJLIIIJLLLLLLLZ;
                int fullScreenHeight = C1450870nrJ.LIZ;
                if (fullScreenHeight <= 0) {
                    C844470XAv.LIZ.getClass();
                    fullScreenHeight = (ScreenUtils.getFullScreenHeight(C844470XAv.LIZ()) - C0LEO.LIZIZ()) - ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(C844470XAv.LIZ());
                }
                LLLLLJIL(f, fullScreenHeight, 0.0f, 0.0f);
            }
        } else {
            float f2 = this.LLJLIL;
            float f3 = 0.5625f * f2;
            float f4 = (this.LLJJLIIIJLLLLLLLZ - f3) / 2;
            float f5 = this.LLJLILLLLZIIL;
            if (C444960Hcc.LIZIZ()) {
                f4 = -f4;
            }
            LLLLLJIL(f3, f2, f4, f5);
        }
        View viewRequireViewById = requireViewById(R.id.g3k);
        this.LLJJJJLIIL = viewRequireViewById;
        ViewGroup.LayoutParams layoutParams = null;
        if ((viewRequireViewById instanceof C422020Ggi) && (c422020Ggi = (C422020Ggi) viewRequireViewById) != null) {
            c422020Ggi.setLifecycleOwner(this);
            ViewPager viewPager = this.LLJJJJ;
            if (viewPager != null && (adapter = viewPager.getAdapter()) != null) {
                count = adapter.getCount();
            } else {
                count = 2;
            }
            c422020Ggi.setCount(count);
            c422020Ggi.setSelectedIndex(0);
        }
        if (!C1441980ncy.LIZ()) {
            int iN2 = this.LLJLILLLLZIIL - c0.LIZ.n2();
            float f6 = this.LLJLIL;
            View view = this.LLJJJJLIIL;
            if (view != null) {
                layoutParams = view.getLayoutParams();
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = marginLayoutParams.bottomMargin + iN2 + ((int) ((this.LLJL - f6) / 2));
            View view2 = this.LLJJJJLIIL;
            if (view2 != null) {
                C786410Ut5.W5(view2, marginLayoutParams);
                return;
            }
            return;
        }
        View view3 = this.LLJJJJLIIL;
        if (view3 != null) {
            layoutParams = view3.getLayoutParams();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams2.bottomMargin = this.LLJLL + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        View view4 = this.LLJJJJLIIL;
        if (view4 == null) {
            return;
        }
        C786410Ut5.W5(view4, marginLayoutParams2);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.LLJJJIL = viewGroup;
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.se, viewGroup, false);
    }

    public final void LLLLLJIL(float f, float f2, float f3, float f4) {
        ViewPager viewPager = this.LLJJJJ;
        if (viewPager != null) {
            ViewGroup.LayoutParams layoutParams = viewPager.getLayoutParams();
            layoutParams.width = (int) f;
            layoutParams.height = (int) f2;
            C786410Ut5.q6(viewPager, layoutParams);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewPager);
            viewPager.setTranslationX(f3);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewPager);
            viewPager.setTranslationY(f4);
        }
    }
}
