package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.experiment.TabPreloadTimingConfig;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0rKr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1584510rKr {
    public static final boolean LIZ(View view) {
        if (!view.isAttachedToWindow()) {
            return false;
        }
        if (!view.getLocalVisibleRect(new Rect()) || view.getWidth() == 0 || r1.width() < view.getWidth() * 0.5f) {
            return false;
        }
        return true;
    }

    public static final void LIZIZ(View view, final C19EG c19eg, final String str) {
        TabPreloadTimingConfig tabPreloadTimingConfigLIZ;
        TabPreloadTimingConfig tabPreloadTimingConfigLIZ2;
        if (view == null || c19eg == null) {
            return;
        }
        if (Intrinsics.LJFF(str, "explore_top_tab")) {
            if (((Boolean) C282760B6k.LIZ.getValue()).booleanValue() && (tabPreloadTimingConfigLIZ2 = C1584540rKu.LIZ()) != null && tabPreloadTimingConfigLIZ2.topTabPreloadConfig != null) {
                return;
            }
        } else if (Intrinsics.LJFF(str, "explore_bottom_tab") && ((Boolean) C282750B6j.LIZ.getValue()).booleanValue() && (tabPreloadTimingConfigLIZ = C1584540rKu.LIZ()) != null && tabPreloadTimingConfigLIZ.bottomTabPreloadConfig != null) {
            return;
        }
        if (((Boolean) C0BKD.LIZ.getValue()).booleanValue()) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: X.0rKt
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) throws JSONException {
                    Integer numValueOf;
                    if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null && numValueOf.intValue() == 0) {
                        C1600620rkq.LIZ("legacy_touch", str, "touch", null, null, 24);
                        C15WT.LIZIZ.LJIIJ("touch", str);
                        return false;
                    }
                    return false;
                }
            });
            HomeViewPagerAbility homeViewPagerAbility = (HomeViewPagerAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19eg, null), HomeViewPagerAbility.class, null);
            if (homeViewPagerAbility != null) {
                homeViewPagerAbility.LLJJI(new InterfaceC469360Ias() { // from class: X.0rKs
                    @Override // X.InterfaceC469360Ias
                    public final void onPageScrollStateChanged(int i) {
                    }

                    @Override // X.InterfaceC469360Ias
                    public final void onPageSelected(int i) {
                    }

                    @Override // X.InterfaceC469360Ias
                    public final void onPageScrolled(int i, float f, int i2) throws JSONException {
                        HomeViewPagerAbility homeViewPagerAbility2 = (HomeViewPagerAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19eg, null), HomeViewPagerAbility.class, null);
                        if (homeViewPagerAbility2 != null && homeViewPagerAbility2.Vd(i, false) == 35) {
                            C1600620rkq.LIZ("legacy_slide", str, "slide", null, null, 24);
                            C15WT.LIZIZ.LJIIJ("slide", str);
                        }
                    }
                });
            }
        }
    }
}
