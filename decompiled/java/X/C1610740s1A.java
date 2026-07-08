package X;

import Y.ALAdapterS19S0100000_24;
import Y.ALAdapterS3S0101000_24;
import Y.AUListenerS272S0100000_24;
import Y.AfS5S0300100_24;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ab.LiveEntranceAnimCurveConfig;
import com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s1A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1610740s1A implements InterfaceC1608890ryB {
    public final boolean LIZ;
    public boolean LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;
    public final C1610770s1D LJ;
    public final EnumC1610470s0j LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public Aweme LJIIJJI;
    public User LJIIL;
    public C09JN<C1610420s0e> LJIILIIL;
    public AnimatorSet LJIILJJIL;
    public ValueAnimator LJIILL;
    public ValueAnimator LJIILLIIL;
    public ValueAnimator LJIIZILJ;
    public boolean LJIJ;
    public final C01GW LJIJI;
    public final C01GW LJIJJ;
    public final AUListenerS272S0100000_24 LJIJJLI;
    public final AUListenerS272S0100000_24 LJIL;
    public final AUListenerS272S0100000_24 LJJ;
    public final AUListenerS272S0100000_24 LJJI;
    public final AUListenerS272S0100000_24 LJJIFFI;
    public final ViewOnAttachStateChangeListenerC1620720sHG LJJII;

    @Override // X.InterfaceC1608890ryB
    public final void LJI() {
        this.LJIIIIZZ = true;
    }

    @Override // X.InterfaceC1608890ryB
    public void LJIIIZ() {
        LIZJ(0);
        LIZ();
    }

    @Override // X.InterfaceC1608890ryB
    public final void Ir() {
        AnimatorSet animatorSet = this.LJIILJJIL;
        if (animatorSet != null && animatorSet.isRunning()) {
            animatorSet.pause();
        }
        if (((Boolean) C293690BfD.LIZ.getValue()).booleanValue()) {
            ValueAnimator valueAnimator = this.LJIILL;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.pause();
            }
            ValueAnimator valueAnimator2 = this.LJIILLIIL;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                valueAnimator2.pause();
            }
            ValueAnimator valueAnimator3 = this.LJIIZILJ;
            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                return;
            }
            valueAnimator3.pause();
        }
    }

    @Override // X.InterfaceC1608890ryB
    public final void LIZ() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        User user;
        boolean zLJIIJJI = LJIIJJI(this.LJIIL);
        this.LIZIZ = zLJIIJJI;
        if (!zLJIIJJI) {
            LJIIIIZZ();
            C09JN<C1610420s0e> c09jn = this.LJIILIIL;
            if (c09jn == null || (user = this.LJIIL) == null) {
                return;
            }
            try {
                String uid = user.getUid();
                c09jn.accept(new C1610420s0e(uid != null ? CastLongProtector.parseLong(uid) : 0L, 0L));
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJII(e);
                return;
            }
        }
        if (this.LJI) {
            C09JN<C1610420s0e> c09jn2 = this.LJIILIIL;
            if (c09jn2 != null) {
                LJIIL(this.LJIIL, c09jn2, "tiktok_video_head");
                return;
            }
            return;
        }
        if (this.LJIIIIZZ || ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().p3() || C1511220pQe.LIZIZ.LIZ()) {
            return;
        }
        if (this.LJIILLIIL == null) {
            this.LJIILLIIL = LIZIZ(this.LJIIIZ);
            switch (C1610460s0i.LIZ[this.LJFF.ordinal()]) {
                case 1:
                    ValueAnimator valueAnimator3 = this.LJIILLIIL;
                    if (valueAnimator3 != null) {
                        valueAnimator3.addUpdateListener(this.LJJ);
                    }
                    break;
                case 2:
                    ValueAnimator valueAnimator4 = this.LJIILLIIL;
                    if (valueAnimator4 != null) {
                        valueAnimator4.addUpdateListener(this.LJJIFFI);
                    }
                    break;
                case 3:
                    ValueAnimator valueAnimator5 = this.LJIILLIIL;
                    if (valueAnimator5 != null) {
                        valueAnimator5.addUpdateListener(this.LJIJJLI);
                    }
                    break;
                case 4:
                case 5:
                    ValueAnimator valueAnimator6 = this.LJIILLIIL;
                    if (valueAnimator6 != null) {
                        valueAnimator6.setInterpolator(C1619980sG4.LIZLLL());
                    }
                    ValueAnimator valueAnimator7 = this.LJIILLIIL;
                    if (valueAnimator7 != null) {
                        valueAnimator7.addUpdateListener((ValueAnimator.AnimatorUpdateListener) this.LJIJJ.getValue());
                    }
                    if (this.LJIIZILJ == null) {
                        ValueAnimator valueAnimatorLIZIZ = LIZIZ(this.LJIIIZ);
                        this.LJIIZILJ = valueAnimatorLIZIZ;
                        valueAnimatorLIZIZ.setInterpolator(C1619980sG4.LJIILIIL());
                        ValueAnimator valueAnimator8 = this.LJIIZILJ;
                        if (valueAnimator8 != null) {
                            valueAnimator8.addUpdateListener((ValueAnimator.AnimatorUpdateListener) this.LJIJI.getValue());
                        }
                    }
                    break;
                case 6:
                    ValueAnimator valueAnimator9 = this.LJIILLIIL;
                    if (valueAnimator9 != null) {
                        valueAnimator9.setInterpolator(C1619980sG4.LIZLLL());
                    }
                    ValueAnimator valueAnimator10 = this.LJIILLIIL;
                    if (valueAnimator10 != null) {
                        valueAnimator10.addUpdateListener((ValueAnimator.AnimatorUpdateListener) this.LJIJJ.getValue());
                    }
                    break;
                default:
                    throw new C1954807lC();
            }
        }
        EnumC1610470s0j enumC1610470s0j = this.LJFF;
        int[] iArr = C1610460s0i.LIZ;
        int i = iArr[enumC1610470s0j.ordinal()];
        if ((i == 1 || i == 2 || i == 3) && ((LiveEntranceAnimCurveConfig) C1610780s1E.LIZIZ.getValue()).modifySingleAvatarNormalAnim && (valueAnimator = this.LJIILLIIL) != null) {
            valueAnimator.setInterpolator(C1619980sG4.LIZLLL());
        }
        if (this.LJIILL == null) {
            ValueAnimator valueAnimatorLIZIZ2 = LIZIZ(this.LJIIIZ);
            this.LJIILL = valueAnimatorLIZIZ2;
            valueAnimatorLIZIZ2.setDuration(this.LJIIIZ);
            int i2 = iArr[this.LJFF.ordinal()];
            if (i2 == 1) {
                ValueAnimator valueAnimator11 = this.LJIILLIIL;
                if (valueAnimator11 != null) {
                    valueAnimator11.addUpdateListener(this.LJJI);
                }
            } else if ((i2 == 2 || i2 == 3) && (valueAnimator2 = this.LJIILLIIL) != null) {
                valueAnimator2.addUpdateListener(this.LJIL);
            }
            ValueAnimator valueAnimator12 = this.LJIILL;
            if (valueAnimator12 != null) {
                valueAnimator12.addListener(new ALAdapterS3S0101000_24(this, 1));
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            AnimatorSet animatorSet = this.LJIILJJIL;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.LJIILJJIL = null;
        }
        if (this.LJIILJJIL == null) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.LJIILJJIL = animatorSet2;
            animatorSet2.setDuration(this.LJIIIZ);
            AnimatorSet animatorSet3 = this.LJIILJJIL;
            if (animatorSet3 != null) {
                animatorSet3.addListener(new ALAdapterS19S0100000_24(this, 5));
            }
        }
        ValueAnimator valueAnimator13 = this.LJIIZILJ;
        if (valueAnimator13 != null) {
            AnimatorSet animatorSet4 = this.LJIILJJIL;
            if (animatorSet4 != null) {
                animatorSet4.playTogether(this.LJIILLIIL, valueAnimator13);
            }
        } else {
            AnimatorSet animatorSet5 = this.LJIILJJIL;
            if (animatorSet5 != null) {
                animatorSet5.play(this.LJIILLIIL);
            }
        }
        this.LJI = true;
        AnimatorSet animatorSet6 = this.LJIILJJIL;
        if (animatorSet6 != null) {
            animatorSet6.start();
        }
        C09JN<C1610420s0e> c09jn3 = this.LJIILIIL;
        if (c09jn3 != null) {
            LJIIL(this.LJIIL, c09jn3, "tiktok_video_head");
        }
    }

    @Override // X.InterfaceC1608890ryB
    public final void LJ() {
        View view = this.LIZJ;
        if (view != null) {
            C786410Ut5.Ob(view, 1.0f);
            C786410Ut5.pc(view, 1.0f);
        }
        C1610770s1D c1610770s1D = this.LJ;
        if (c1610770s1D != null) {
            c1610770s1D.setSizeScale(1.0f);
            c1610770s1D.setStrokeWide(0.0f);
        }
    }

    @Override // X.InterfaceC1608890ryB
    public final void LJIIIIZZ() {
        LIZJ(8);
        LJIIJ();
    }

    @Override // X.InterfaceC1608890ryB
    public final void LJIIJ() {
        AnimatorSet animatorSet = this.LJIILJJIL;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.LJI = false;
            this.LJII = false;
        }
    }

    @Override // X.InterfaceC1608890ryB
    public final void xs() {
        ValueAnimator valueAnimator;
        AnimatorSet animatorSet = this.LJIILJJIL;
        if (animatorSet != null && animatorSet.isPaused()) {
            animatorSet.resume();
        }
        if (((Boolean) C293690BfD.LIZ.getValue()).booleanValue()) {
            if (this.LJIJ && (valueAnimator = this.LJIILL) != null) {
                if (!valueAnimator.isStarted()) {
                    valueAnimator.start();
                }
                if (valueAnimator.isPaused()) {
                    valueAnimator.resume();
                }
            }
            ValueAnimator valueAnimator2 = this.LJIILLIIL;
            if (valueAnimator2 != null) {
                if (!valueAnimator2.isStarted()) {
                    valueAnimator2.start();
                }
                if (valueAnimator2.isPaused()) {
                    valueAnimator2.resume();
                }
            }
            ValueAnimator valueAnimator3 = this.LJIIZILJ;
            if (valueAnimator3 != null) {
                if (!valueAnimator3.isStarted()) {
                    valueAnimator3.start();
                }
                if (valueAnimator3.isPaused()) {
                    valueAnimator3.resume();
                }
            }
        }
    }

    public C1610740s1A() {
        this.LIZ = true;
        this.LJFF = EnumC1610470s0j.NORMAL;
        this.LJIIIZ = 800;
        this.LJIIJ = 640;
        this.LJIJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1858));
        this.LJIJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1857));
        this.LJIJJLI = new AUListenerS272S0100000_24(this, 13);
        this.LJIL = new AUListenerS272S0100000_24(this, 14);
        this.LJJ = new AUListenerS272S0100000_24(this, 15);
        this.LJJI = new AUListenerS272S0100000_24(this, 16);
        this.LJJIFFI = new AUListenerS272S0100000_24(this, 12);
        this.LJJII = new ViewOnAttachStateChangeListenerC1620720sHG(this, 6);
    }

    @Override // X.InterfaceC1608890ryB
    public final void LJII() {
        LJIIJ();
        AnimatorSet animatorSet = this.LJIILJJIL;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        View view = this.LIZJ;
        if (view != null) {
            view.removeOnAttachStateChangeListener(this.LJJII);
        }
        View view2 = this.LIZJ;
        if (view2 != null) {
            C786410Ut5.Ob(view2, 1.0f);
            C786410Ut5.pc(view2, 1.0f);
        }
    }

    @Override // X.InterfaceC1608890ryB
    public final boolean LIZLLL() {
        return this.LJI;
    }

    public static ValueAnimator LIZIZ(int i) {
        ValueAnimator c1610820s1I;
        if (C0BKZ.LIZ() == -1) {
            c1610820s1I = new C1611030s1d();
            c1610820s1I.setIntValues(Arrays.copyOf(new int[]{0, i}, 2));
        } else {
            c1610820s1I = new C1610820s1I();
            c1610820s1I.setIntValues(Arrays.copyOf(new int[]{0, i}, 2));
        }
        c1610820s1I.setRepeatCount(-1);
        c1610820s1I.setRepeatMode(1);
        return c1610820s1I;
    }

    public final void LIZJ(int i) {
        View view;
        View view2;
        if (i == 0) {
            C1610770s1D c1610770s1D = this.LJ;
            if (c1610770s1D != null) {
                C786410Ut5.Y(c1610770s1D, 0);
            }
            View view3 = this.LIZJ;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(0, view3);
            }
            if (!Intrinsics.LJFF(this.LIZJ, this.LIZLLL) && (view2 = this.LIZLLL) != null) {
                C786410Ut5.LJLLLLLL(8, view2);
                return;
            }
            return;
        }
        C1610770s1D c1610770s1D2 = this.LJ;
        if (c1610770s1D2 != null) {
            C786410Ut5.Y(c1610770s1D2, 8);
        }
        if (!Intrinsics.LJFF(this.LIZJ, this.LIZLLL) && (view = this.LIZJ) != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view4 = this.LIZLLL;
        if (view4 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, view4);
    }

    public boolean LJIIJJI(User user) {
        if (!C1260740iue.LIZ()) {
            return false;
        }
        if (user == null) {
            return this.LIZIZ;
        }
        Aweme aweme = this.LJIIJJI;
        if (aweme != null && ((ICommerceCommonService) ServiceManager.get().getService(ICommerceCommonService.class)).LJFF(aweme)) {
            return true;
        }
        if (!user.isLive()) {
            return false;
        }
        if ((user.isSecret() && !C10EU.LJIIL(user)) || !user.isLive() || !C1492170ovv.LIZ() || user.isBlock()) {
            return false;
        }
        return true;
    }

    public final void LJIIL(User user, C09JN<C1610420s0e> c09jn, String str) {
        if (this.LIZ && user != null && !TextUtils.isEmpty(user.getUid())) {
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).j3().LIZLLL(user, new AfS5S0300100_24(CastLongProtector.parseLong(user.getUid()), this, user, c09jn, 1), "tiktok_video_head");
        }
    }

    public C1610740s1A(EnumC1610470s0j enumC1610470s0j, View view, View view2, C1610770s1D c1610770s1D) {
        this.LIZ = true;
        this.LJFF = EnumC1610470s0j.NORMAL;
        this.LJIIIZ = 800;
        this.LJIIJ = 640;
        this.LJIJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1858));
        this.LJIJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1857));
        this.LJIJJLI = new AUListenerS272S0100000_24(this, 13);
        this.LJIL = new AUListenerS272S0100000_24(this, 14);
        this.LJJ = new AUListenerS272S0100000_24(this, 15);
        this.LJJI = new AUListenerS272S0100000_24(this, 16);
        this.LJJIFFI = new AUListenerS272S0100000_24(this, 12);
        ViewOnAttachStateChangeListenerC1620720sHG viewOnAttachStateChangeListenerC1620720sHG = new ViewOnAttachStateChangeListenerC1620720sHG(this, 6);
        this.LJJII = viewOnAttachStateChangeListenerC1620720sHG;
        this.LIZJ = view;
        this.LIZLLL = view2;
        this.LJ = c1610770s1D;
        boolean z = C1260740iue.LIZ();
        this.LIZIZ = z;
        if (c1610770s1D != null) {
            C786410Ut5.Y(c1610770s1D, z ? 0 : 8);
        }
        if (view != null) {
            view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1620720sHG);
        }
        this.LJFF = enumC1610470s0j;
        if (enumC1610470s0j == EnumC1610470s0j.SKYLIGHT) {
            this.LJIIIZ = 2000;
            this.LJIIJ = 1750;
        } else {
            if (enumC1610470s0j != EnumC1610470s0j.STRONG && enumC1610470s0j != EnumC1610470s0j.MEDIUM) {
                return;
            }
            this.LJIIIZ = LSPassThroughRecordSizeConfig.DEFAULT;
        }
    }

    public C1610740s1A(boolean z, View view, View view2, C1610770s1D c1610770s1D) {
        this.LIZ = true;
        this.LJFF = EnumC1610470s0j.NORMAL;
        this.LJIIIZ = 800;
        this.LJIIJ = 640;
        this.LJIJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1858));
        this.LJIJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1857));
        this.LJIJJLI = new AUListenerS272S0100000_24(this, 13);
        this.LJIL = new AUListenerS272S0100000_24(this, 14);
        this.LJJ = new AUListenerS272S0100000_24(this, 15);
        this.LJJI = new AUListenerS272S0100000_24(this, 16);
        this.LJJIFFI = new AUListenerS272S0100000_24(this, 12);
        ViewOnAttachStateChangeListenerC1620720sHG viewOnAttachStateChangeListenerC1620720sHG = new ViewOnAttachStateChangeListenerC1620720sHG(this, 6);
        this.LJJII = viewOnAttachStateChangeListenerC1620720sHG;
        this.LIZJ = view;
        this.LIZLLL = view2;
        this.LJ = c1610770s1D;
        boolean z2 = z && C1260740iue.LIZ();
        this.LIZIZ = z2;
        if (c1610770s1D != null) {
            C786410Ut5.Y(c1610770s1D, z2 ? 0 : 8);
        }
        if (view != null) {
            view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1620720sHG);
        }
    }

    @Override // X.InterfaceC1608890ryB
    public final void LJFF(User user, Class<Object> cls, C09JN<C1610420s0e> c09jn, Aweme aweme, Function1<? super Boolean, Unit> function1) {
        this.LJIIJJI = aweme;
        this.LJIIL = user;
        this.LJIILIIL = c09jn;
        this.LIZIZ = LJIIJJI(user);
        View view = this.LIZJ;
        if (view != null) {
            view.removeOnAttachStateChangeListener(this.LJJII);
        }
        View view2 = this.LIZJ;
        if (view2 != null) {
            view2.addOnAttachStateChangeListener(this.LJJII);
        }
        if (this.LIZIZ) {
            LJIIIZ();
        } else {
            LJIIIIZZ();
        }
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(this.LIZIZ));
        }
    }

    public C1610740s1A(boolean z, C1610670s13 c1610670s13, View view, C1610770s1D c1610770s1D, EnumC1610470s0j enumC1610470s0j, boolean z2) {
        this.LIZ = true;
        this.LJFF = EnumC1610470s0j.NORMAL;
        this.LJIIIZ = 800;
        this.LJIIJ = 640;
        this.LJIJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1858));
        this.LJIJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1857));
        this.LJIJJLI = new AUListenerS272S0100000_24(this, 13);
        this.LJIL = new AUListenerS272S0100000_24(this, 14);
        this.LJJ = new AUListenerS272S0100000_24(this, 15);
        this.LJJI = new AUListenerS272S0100000_24(this, 16);
        this.LJJIFFI = new AUListenerS272S0100000_24(this, 12);
        ViewOnAttachStateChangeListenerC1620720sHG viewOnAttachStateChangeListenerC1620720sHG = new ViewOnAttachStateChangeListenerC1620720sHG(this, 6);
        this.LJJII = viewOnAttachStateChangeListenerC1620720sHG;
        this.LIZJ = c1610670s13;
        this.LIZLLL = view;
        this.LJ = c1610770s1D;
        this.LIZIZ = z && C1260740iue.LIZ();
        this.LJFF = enumC1610470s0j;
        if (c1610670s13 != null) {
            c1610670s13.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1620720sHG);
        }
        if (enumC1610470s0j == EnumC1610470s0j.STRONG || enumC1610470s0j == EnumC1610470s0j.MEDIUM) {
            this.LJIIIZ = LSPassThroughRecordSizeConfig.DEFAULT;
        }
        this.LIZ = z2;
    }
}
