package X;

import Y.AfS193S0100000_24;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hox.Hox;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.push.api.IMPushApi;
import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0roH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1602750roH implements InterfaceC1571160qzK {
    public final C19EG LIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public int LJII;
    public boolean LJIIIIZZ;
    public final C01GW LJIIIZ;
    public final C01GW LJIIJ;
    public final Map<String, InterfaceC1602790roL> LIZIZ = new LinkedHashMap();
    public final C01GW LJFF = C452501pT.LIZIZ(new C1570690qyZ(this));
    public final Object LJI = new Object();

    public final boolean LJFF() {
        C19EG c19eg = this.LIZ;
        return c19eg != null && Hox.LLJILJIL.LIZ(c19eg).LQ2("HOME") && LJI() && Yu() && !this.LIZJ;
    }

    public static boolean LJI() {
        return (C305150Bxh.LIZ() && (C1585030rLh.LJIILL() || !C1585030rLh.LJIJ("NOTIFICATION"))) || C1585030rLh.LJIILLIIL();
    }

    @Override // X.InterfaceC1571160qzK
    public final void LIZIZ() {
        if (LJFF() && !this.LIZIZ.isEmpty()) {
            for (Map.Entry entry : ((LinkedHashMap) this.LIZIZ).entrySet()) {
                if (((InterfaceC1602790roL) entry.getValue()).LJIIIIZZ()) {
                    LJII((InterfaceC1602790roL) entry.getValue());
                }
            }
        }
    }

    @Override // X.InterfaceC1571160qzK
    public final boolean Yu() {
        C19EG c19eg;
        Aweme awemeLJIIIIZZ;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF != null && !((AbstractC848400XPy) iAccountUserServiceLJFF).isLogin()) {
            return false;
        }
        IMPushApi.LIZ.getClass();
        boolean zLJIIJJI = C817570W5j.LIZ().LIZLLL().LJIIJJI();
        if (C1908480zlO.LIZIZ.LJIIIZ(false) || zLJIIJJI || this.LJIIIIZZ) {
            return false;
        }
        MainBusinessAbility mainBusinessAbility = (MainBusinessAbility) this.LJFF.getValue();
        return (mainBusinessAbility == null || (awemeLJIIIIZZ = mainBusinessAbility.LJIIIIZZ()) == null || !awemeLJIIIIZZ.isAd()) && (c19eg = this.LIZ) != null && C486860J7k.LIZIZ(c19eg).FQ2("page_feed") && !((IPipFeedService) this.LJIIJ.getValue()).md() && this.LJII == 0 && !this.LJ;
    }

    public C1602750roH(C19EG c19eg) {
        this.LIZ = c19eg;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C1570680qyY(this));
        this.LJIIIZ = c01gwLIZIZ;
        this.LJIIJ = C452501pT.LIZIZ(new C1602760roI());
        C0T2Y c0t2y = new C0T2Y() { // from class: X.0roJ
            @Override // X.C0T2Y
            public final void Y3(Aweme aweme) {
                if (aweme == null) {
                    return;
                }
                this.LL.LJ = aweme.isAd();
            }
        };
        InterfaceC1583770rJf interfaceC1583770rJf = new InterfaceC1583770rJf() { // from class: X.0roK
            @Override // X.InterfaceC1583770rJf
            public final void A4(String str, String str2) throws JSONException {
                AnimatorSet animatorSet;
                AnimatorSet animatorSet2;
                View view;
                View contentView;
                View view2;
                View view3;
                View contentView2;
                C1602750roH c1602750roH = this.LL;
                C19EG c19eg2 = c1602750roH.LIZ;
                if (c19eg2 != null) {
                    Object parent = null;
                    if ((Intrinsics.LJFF(str, "HOME") || Intrinsics.LJFF("HOME", Hox.LLJILJIL.LIZ(c19eg2).HQ2(str))) && !Intrinsics.LJFF(str2, "HOME") && !Intrinsics.LJFF("HOME", Hox.LLJILJIL.LIZ(c19eg2).HQ2(str2))) {
                        if (((C1585030rLh.LJIILL() || C1585030rLh.LJIILLIIL()) && Intrinsics.LJFF(str2, "USER")) || (!C1585030rLh.LJIJ("NOTIFICATION") && Intrinsics.LJFF(str2, "NOTIFICATION"))) {
                            C1602840roQ c1602840roQ = C1602820roO.LIZ;
                            AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c1602750roH, 38);
                            C1602840roQ c1602840roQ2 = C1602820roO.LIZ;
                            if (c1602840roQ2 != null) {
                                c1602840roQ2.dismiss();
                            }
                            awS568S0100000_24.invoke();
                            return;
                        }
                        if (!c1602750roH.LIZLLL) {
                            return;
                        }
                        C1602840roQ c1602840roQ3 = C1602820roO.LIZ;
                        if (c1602840roQ3 != null && (contentView = c1602840roQ3.getContentView()) != null) {
                            parent = contentView.getParent();
                        }
                        if ((parent instanceof View) && (view = (View) parent) != null) {
                            C786410Ut5.LJLLLLLL(8, view);
                        }
                        C1602840roQ c1602840roQ4 = C1602820roO.LIZ;
                        if (!(c1602840roQ4 instanceof C1602840roQ) || c1602840roQ4 == null || (animatorSet = c1602840roQ4.LLJJIII) == null || !animatorSet.isRunning() || (animatorSet2 = c1602840roQ4.LLJJIII) == null) {
                            return;
                        }
                        animatorSet2.pause();
                        return;
                    }
                    if (Intrinsics.LJFF(str, "HOME")) {
                        return;
                    }
                    C446900Hfk c446900Hfk = Hox.LLJILJIL;
                    if (Intrinsics.LJFF("HOME", c446900Hfk.LIZ(c19eg2).HQ2(str))) {
                        return;
                    }
                    if ((!Intrinsics.LJFF(str2, "HOME") && !Intrinsics.LJFF("HOME", c446900Hfk.LIZ(c19eg2).HQ2(str2))) || !c1602750roH.LIZLLL) {
                        return;
                    }
                    C1602840roQ c1602840roQ5 = C1602820roO.LIZ;
                    if (c1602840roQ5 != null && (contentView2 = c1602840roQ5.getContentView()) != null) {
                        parent = contentView2.getParent();
                    }
                    if ((parent instanceof View) && (view3 = (View) parent) != null) {
                        C786410Ut5.LJLLLLLL(0, view3);
                    }
                    C1602840roQ c1602840roQ6 = C1602820roO.LIZ;
                    if (!(c1602840roQ6 instanceof C1602840roQ) || c1602840roQ6 == null || (view2 = c1602840roQ6.LLIZ) == null) {
                        return;
                    }
                    HandlerHook.viewPost(view2, new Runnable() { // from class: X.0roM
                        public static void LIZ() {
                            List<Animator> childAnimations;
                            ValueAnimator valueAnimator;
                            ValueAnimator valueAnimator2;
                            C1602840roQ c1602840roQ7 = C1602820roO.LIZ;
                            if (!(c1602840roQ7 instanceof C1602840roQ) || c1602840roQ7 == null) {
                                return;
                            }
                            AnimatorSet animatorSet3 = c1602840roQ7.LLJJIII;
                            if (animatorSet3 == null || !animatorSet3.isPaused()) {
                                c1602840roQ7.dismiss();
                                return;
                            }
                            AnimatorSet animatorSet4 = c1602840roQ7.LLJJIII;
                            if (animatorSet4 != null) {
                                animatorSet4.resume();
                            }
                            AnimatorSet animatorSet5 = c1602840roQ7.LLJJIII;
                            if (animatorSet5 == null || (childAnimations = animatorSet5.getChildAnimations()) == null) {
                                childAnimations = C13BV.INSTANCE;
                            }
                            Iterator it2 = childAnimations.iterator();
                            long duration = 0;
                            long duration2 = 0;
                            while (it2.hasNext()) {
                                duration2 += ((Animator) it2.next()).getDuration();
                            }
                            if (c1602840roQ7.LLJJIJIIJIL > duration2) {
                                c1602840roQ7.LLJJIJIIJIL = duration2;
                            }
                            for (Animator animator : childAnimations) {
                                long duration3 = animator.getDuration() + duration;
                                long j = c1602840roQ7.LLJJIJIIJIL;
                                if (duration3 <= j) {
                                    if ((animator instanceof ValueAnimator) && (valueAnimator2 = (ValueAnimator) animator) != null) {
                                        valueAnimator2.setCurrentPlayTime(((ValueAnimator) animator).getDuration());
                                    }
                                } else if ((animator instanceof ValueAnimator) && (valueAnimator = (ValueAnimator) animator) != null) {
                                    valueAnimator.setCurrentPlayTime(j - duration);
                                }
                                duration += animator.getDuration();
                            }
                            AnimatorSet animatorSet6 = c1602840roQ7.LLJJIII;
                            if (animatorSet6 != null) {
                                animatorSet6.start();
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("CustomPopwindowUtil@d6e1.continueAnimation$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("CustomPopwindowUtil@d6e1.continueAnimation$1");
                        }
                    });
                }
            }
        };
        if (LJI()) {
            if (c19eg != null) {
                C740740T3w.LIZIZ(c19eg, c19eg, c0t2y);
            }
            C2214201BlK.LIZLLL().LJJLJLI(new AfS193S0100000_24(this, 3));
            if (c19eg != null) {
                Hox.LLJILJIL.LIZ(c19eg).vQ2(interfaceC1583770rJf);
            }
            HomePageViewPagerAbility homePageViewPagerAbility = (HomePageViewPagerAbility) c01gwLIZIZ.getValue();
            if (homePageViewPagerAbility != null) {
                homePageViewPagerAbility.Jk1(new C1620930sHb(this, 1));
            }
        }
    }

    @Override // X.InterfaceC1571160qzK
    public final InterfaceC1602790roL LIZ(String str) {
        if (!LJI() || str.length() == 0) {
            return null;
        }
        return (InterfaceC1602790roL) ((LinkedHashMap) this.LIZIZ).get(str);
    }

    @Override // X.InterfaceC1571160qzK
    public final void LIZJ(boolean z) throws JSONException {
        this.LJIIIIZZ = z;
        if (z) {
            C1602840roQ c1602840roQ = C1602820roO.LIZ;
            AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 40);
            C1602840roQ c1602840roQ2 = C1602820roO.LIZ;
            if (c1602840roQ2 != null) {
                c1602840roQ2.dismiss();
            }
            awS568S0100000_24.invoke();
        }
    }

    @Override // X.InterfaceC1571160qzK
    public final boolean LJ(InterfaceC1602790roL interfaceC1602790roL) {
        if (!LJFF()) {
            return false;
        }
        LJII(interfaceC1602790roL);
        return true;
    }

    public final void LJII(InterfaceC1602790roL interfaceC1602790roL) {
        synchronized (this.LJI) {
            try {
                this.LIZJ = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LIZLLL = true;
        PopupManager.LJIJI(new C1602810roN(this.LIZ, interfaceC1602790roL.LJ(), interfaceC1602790roL, new AwS568S0100000_24(this, 39)), true);
    }

    @Override // X.InterfaceC1571160qzK
    public final void LIZLLL(String str, InterfaceC1602790roL interfaceC1602790roL) {
        if (LJI() && str.length() != 0 && !this.LIZIZ.containsKey(str)) {
            this.LIZIZ.put(str, interfaceC1602790roL);
        }
    }
}
