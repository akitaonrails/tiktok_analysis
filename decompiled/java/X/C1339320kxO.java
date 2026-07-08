package X;

import com.bytedance.ies.xelement.banner.LynxSwiperView;
import com.bytedance.ies.xelement.viewpager.LynxViewPager;
import com.bytedance.ies.xelement.viewpager.viewpager.LynxViewPagerNG;
import com.lynx.xelement.viewpager.viewpager.LynxUIViewPager;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kxO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1339320kxO implements InterfaceC469360Ias {
    public final int $t;
    public Object l0;

    public static final void onPageScrollStateChanged$0(C1339320kxO c1339320kxO, int i) {
    }

    public static final void onPageSelected$1(C1339320kxO c1339320kxO, int i) {
    }

    public static final void onPageSelected$2(C1339320kxO c1339320kxO, int i) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        switch (this.$t) {
            case 0:
                onPageScrollStateChanged$0(this, i);
                break;
            case 1:
                onPageScrollStateChanged$1(this, i);
                break;
            case 2:
                onPageScrollStateChanged$2(this, i);
                break;
            case 3:
                onPageScrollStateChanged$3(this, i);
                break;
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        switch (this.$t) {
            case 0:
                onPageScrolled$0(this, i, f, i2);
                break;
            case 1:
                onPageScrolled$1(this, i, f, i2);
                break;
            case 2:
                onPageScrolled$2(this, i, f, i2);
                break;
            case 3:
                onPageScrolled$3(this, i, f, i2);
                break;
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        switch (this.$t) {
            case 0:
                onPageSelected$0(this, i);
                break;
            case 1:
                onPageSelected$1(this, i);
                break;
            case 2:
                onPageSelected$2(this, i);
                break;
            case 3:
                onPageSelected$3(this, i);
                break;
        }
    }

    public C1339320kxO(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onPageScrollStateChanged$1(C1339320kxO c1339320kxO, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    LynxViewPagerNG lynxViewPagerNG = (LynxViewPagerNG) c1339320kxO.l0;
                    if (lynxViewPagerNG.LLJILJILJ) {
                        lynxViewPagerNG.LJJIJ().setAllowHorizontalGesture(false);
                    }
                    LynxViewPagerNG lynxViewPagerNG2 = (LynxViewPagerNG) c1339320kxO.l0;
                    if (lynxViewPagerNG2.mEnableScrollMonitor) {
                        lynxViewPagerNG2.mContext.LLJJIJI.LJIIJJI(new C1318050kP5(lynxViewPagerNG2.mView, lynxViewPagerNG2.getTagName(), ((LynxViewPagerNG) c1339320kxO.l0).mScrollMonitorTag));
                        return;
                    }
                    return;
                }
                return;
            }
            LynxViewPagerNG lynxViewPagerNG3 = (LynxViewPagerNG) c1339320kxO.l0;
            lynxViewPagerNG3.LLJI = true;
            lynxViewPagerNG3.LLJJI = true;
            if (!lynxViewPagerNG3.mEnableScrollMonitor) {
                return;
            }
            lynxViewPagerNG3.mContext.LLJJIJI.LJJII(new C1318050kP5(lynxViewPagerNG3.mView, lynxViewPagerNG3.getTagName(), ((LynxViewPagerNG) c1339320kxO.l0).mScrollMonitorTag));
            return;
        }
        LynxViewPagerNG lynxViewPagerNG4 = (LynxViewPagerNG) c1339320kxO.l0;
        if (lynxViewPagerNG4.LLJILJILJ) {
            lynxViewPagerNG4.LJJIJ().setAllowHorizontalGesture(true);
        }
        LynxViewPagerNG lynxViewPagerNG5 = (LynxViewPagerNG) c1339320kxO.l0;
        if (lynxViewPagerNG5.mEnableScrollMonitor) {
            lynxViewPagerNG5.mContext.LLJJIJI.LJJIII(new C1318050kP5(lynxViewPagerNG5.mView, lynxViewPagerNG5.getTagName(), ((LynxViewPagerNG) c1339320kxO.l0).mScrollMonitorTag));
        }
        LynxViewPagerNG lynxViewPagerNG6 = (LynxViewPagerNG) c1339320kxO.l0;
        if (lynxViewPagerNG6.LL && lynxViewPagerNG6.LLJILLL != lynxViewPagerNG6.LJJIJ().getMViewPager().getCurrentItem()) {
            LynxViewPagerNG lynxViewPagerNG7 = (LynxViewPagerNG) c1339320kxO.l0;
            lynxViewPagerNG7.LLJILLL = lynxViewPagerNG7.LJJIJ().getMViewPager().getCurrentItem();
            LynxViewPagerNG lynxViewPagerNG8 = (LynxViewPagerNG) c1339320kxO.l0;
            lynxViewPagerNG8.sendTabChangeEvent("", lynxViewPagerNG8.LLJILLL, "");
        }
        ((LynxViewPagerNG) c1339320kxO.l0).LLJI = false;
    }

    public static final void onPageScrollStateChanged$2(C1339320kxO c1339320kxO, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    LynxUIViewPager lynxUIViewPager = (LynxUIViewPager) c1339320kxO.l0;
                    if (lynxUIViewPager.mSinglePageTouch) {
                        lynxUIViewPager.getMPager().setAllowHorizontalGesture(false);
                    }
                    LynxUIViewPager lynxUIViewPager2 = (LynxUIViewPager) c1339320kxO.l0;
                    if (lynxUIViewPager2.mEnableScrollMonitor) {
                        lynxUIViewPager2.mContext.LLJJIJI.LJIIJJI(new C1318050kP5(lynxUIViewPager2.mView, lynxUIViewPager2.getTagName(), ((LynxUIViewPager) c1339320kxO.l0).mScrollMonitorTag));
                        return;
                    }
                    return;
                }
                return;
            }
            LynxUIViewPager lynxUIViewPager3 = (LynxUIViewPager) c1339320kxO.l0;
            lynxUIViewPager3.mDragged = true;
            lynxUIViewPager3.mDraggingDetectedByDraggingAndActionUp = true;
            if (!lynxUIViewPager3.mEnableScrollMonitor) {
                return;
            }
            lynxUIViewPager3.mContext.LLJJIJI.LJJII(new C1318050kP5(lynxUIViewPager3.mView, lynxUIViewPager3.getTagName(), ((LynxUIViewPager) c1339320kxO.l0).mScrollMonitorTag));
            return;
        }
        LynxUIViewPager lynxUIViewPager4 = (LynxUIViewPager) c1339320kxO.l0;
        if (lynxUIViewPager4.mSinglePageTouch) {
            lynxUIViewPager4.getMPager().setAllowHorizontalGesture(true);
        }
        LynxUIViewPager lynxUIViewPager5 = (LynxUIViewPager) c1339320kxO.l0;
        if (lynxUIViewPager5.mEnableScrollMonitor) {
            lynxUIViewPager5.mContext.LLJJIJI.LJJIII(new C1318050kP5(lynxUIViewPager5.mView, lynxUIViewPager5.getTagName(), ((LynxUIViewPager) c1339320kxO.l0).mScrollMonitorTag));
        }
        LynxUIViewPager lynxUIViewPager6 = (LynxUIViewPager) c1339320kxO.l0;
        if (lynxUIViewPager6.mEnableChangeEvent && lynxUIViewPager6.mIndexSelectedWhileIdle != lynxUIViewPager6.getMPager().getMViewPager().getCurrentItem()) {
            LynxUIViewPager lynxUIViewPager7 = (LynxUIViewPager) c1339320kxO.l0;
            lynxUIViewPager7.mIndexSelectedWhileIdle = lynxUIViewPager7.getMPager().getMViewPager().getCurrentItem();
            LynxUIViewPager lynxUIViewPager8 = (LynxUIViewPager) c1339320kxO.l0;
            lynxUIViewPager8.sendTabChangeEvent("", lynxUIViewPager8.mIndexSelectedWhileIdle, "");
        }
        ((LynxUIViewPager) c1339320kxO.l0).mDragged = false;
    }

    public static final void onPageScrollStateChanged$3(C1339320kxO c1339320kxO, int i) {
        if (i != 0) {
            ((LynxSwiperView) c1339320kxO.l0).recognizeGesturere();
        }
        LynxSwiperView lynxSwiperView = (LynxSwiperView) c1339320kxO.l0;
        if (lynxSwiperView.LLILLL && i == 1) {
            C1298720jtu c1298720jtu = lynxSwiperView.mContext.LLIZ;
            C1289960jfm c1289960jfm = new C1289960jfm(lynxSwiperView.getSign(), "scrollstart");
            c1289960jfm.LIZIZ(Integer.valueOf(((LynxSwiperView) c1339320kxO.l0).LLILZIL), "current");
            c1298720jtu.LIZIZ(c1289960jfm);
        }
        LynxSwiperView lynxSwiperView2 = (LynxSwiperView) c1339320kxO.l0;
        if (lynxSwiperView2.LLILZ && i == 0) {
            C1298720jtu c1298720jtu2 = lynxSwiperView2.mContext.LLIZ;
            C1289960jfm c1289960jfm2 = new C1289960jfm(lynxSwiperView2.getSign(), "scrollend");
            c1289960jfm2.LIZIZ(Integer.valueOf(((LynxSwiperView) c1339320kxO.l0).LLILZIL), "current");
            c1298720jtu2.LIZIZ(c1289960jfm2);
        }
    }

    public static final void onPageSelected$0(C1339320kxO c1339320kxO, int i) {
        LynxViewPager lynxViewPager = (LynxViewPager) c1339320kxO.l0;
        if (lynxViewPager.LL && lynxViewPager.LJJIJ().getMTabLayout() == null) {
            ((LynxViewPager) c1339320kxO.l0).sendTabChangeEvent("", i, "slide");
        }
    }

    public static final void onPageSelected$3(C1339320kxO c1339320kxO, int i) {
        LynxSwiperView lynxSwiperView = (LynxSwiperView) c1339320kxO.l0;
        lynxSwiperView.LLILZIL = i;
        if (lynxSwiperView.LL) {
            C1298720jtu c1298720jtu = lynxSwiperView.mContext.LLIZ;
            C1289960jfm c1289960jfm = new C1289960jfm(lynxSwiperView.getSign(), "change");
            c1289960jfm.LIZIZ(Integer.valueOf(i), "current");
            c1298720jtu.LIZIZ(c1289960jfm);
        }
    }

    public static final void onPageScrolled$0(C1339320kxO c1339320kxO, int i, float f, int i2) {
        if (((LynxViewPager) c1339320kxO.l0).LLILLJJLI) {
            String strJ4 = C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(i + f)}, 1));
            if (Intrinsics.LJFF(strJ4, ((LynxViewPager) c1339320kxO.l0).LLILZLL)) {
                return;
            }
            LynxViewPager lynxViewPager = (LynxViewPager) c1339320kxO.l0;
            lynxViewPager.LLILZLL = strJ4;
            C1298720jtu c1298720jtu = lynxViewPager.mContext.LLIZ;
            C1289960jfm c1289960jfm = new C1289960jfm(lynxViewPager.getSign(), "offsetchange");
            c1289960jfm.LIZIZ(strJ4, "offset");
            c1298720jtu.LIZIZ(c1289960jfm);
        }
    }

    public static final void onPageScrolled$1(C1339320kxO c1339320kxO, int i, float f, int i2) {
        LynxViewPagerNG lynxViewPagerNG = (LynxViewPagerNG) c1339320kxO.l0;
        if (lynxViewPagerNG.LLJILJIL && lynxViewPagerNG.LLJIJIL != f) {
            lynxViewPagerNG.recognizeGesturere();
            lynxViewPagerNG.LLJIJIL = f;
        }
        if (((LynxViewPagerNG) c1339320kxO.l0).LLILLJJLI) {
            String strK4 = C786410Ut5.k4(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(i + f)}, 1));
            if (Intrinsics.LJFF(strK4, ((LynxViewPagerNG) c1339320kxO.l0).LLILZLL)) {
                return;
            }
            LynxViewPagerNG lynxViewPagerNG2 = (LynxViewPagerNG) c1339320kxO.l0;
            lynxViewPagerNG2.LLILZLL = strK4;
            C1298720jtu c1298720jtu = lynxViewPagerNG2.mContext.LLIZ;
            C1289960jfm c1289960jfm = new C1289960jfm(lynxViewPagerNG2.getSign(), "offsetchange");
            c1289960jfm.LIZIZ(strK4, "offset");
            c1298720jtu.LIZIZ(c1289960jfm);
        }
    }

    public static final void onPageScrolled$2(C1339320kxO c1339320kxO, int i, float f, int i2) {
        ((LynxUIViewPager) c1339320kxO.l0).recognizeGestureWhenScroll(f);
        if (((LynxUIViewPager) c1339320kxO.l0).mEnableOffsetChangeEvent) {
            String strK4 = C786410Ut5.k4(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(i + f)}, 1));
            if (Intrinsics.LJFF(strK4, ((LynxUIViewPager) c1339320kxO.l0).mCurrentOffset)) {
                return;
            }
            ((LynxUIViewPager) c1339320kxO.l0).setMCurrentOffset(strK4);
            ((LynxUIViewPager) c1339320kxO.l0).sendOffsetChangeEvent(strK4);
        }
    }

    public static final void onPageScrolled$3(C1339320kxO c1339320kxO, int i, float f, int i2) {
        LynxSwiperView lynxSwiperView = (LynxSwiperView) c1339320kxO.l0;
        if (lynxSwiperView.LLILLJJLI) {
            C1298720jtu c1298720jtu = lynxSwiperView.mContext.LLIZ;
            C1289960jfm c1289960jfm = new C1289960jfm(lynxSwiperView.getSign(), "transition");
            c1289960jfm.LIZIZ(Integer.valueOf(i), "current");
            c1289960jfm.LIZIZ(Float.valueOf(f), "positionOffset");
            c1289960jfm.LIZIZ(Float.valueOf(C1311130kDv.LIZJ(i2)), "dx");
            c1298720jtu.LIZIZ(c1289960jfm);
        }
    }
}
