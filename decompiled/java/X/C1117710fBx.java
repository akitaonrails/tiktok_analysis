package X;

import Y.AAListenerS269S0200000_17;
import Y.AAListenerS328S0100000_17;
import Y.ALAdapterS13S0100000_17;
import Y.ALAdapterS3S0100000_6;
import Y.ALAdapterS4S0100000_7;
import Y.ARunnableS0S0204000_1;
import Y.ARunnableS12S1100000_7;
import Y.ARunnableS28S0101000_17;
import Y.AUListenerS216S0200000_6;
import Y.AUListenerS256S0100000_6;
import Y.AUListenerS257S0100000_7;
import Y.AUListenerS266S0100000_17;
import Y.AfS186S0100000_17;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService;
import com.bytedance.android.livesdk.livesetting.level.UserLevelBadgeShowEnableSetting;
import com.bytedance.android.livesdk.revenue.level.api.service.IUserLevelBackService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;
import wh6.AbS698S0100000_17;

/* JADX INFO: renamed from: X.0fBx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1117710fBx extends ConstraintLayout implements C0T8B {
    public final ImageView LL;
    public final C16F5 LLILLJJLI;
    public final C1117870fCD LLILLL;
    public final C16F5 LLILZ;
    public long LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public final C16F5 LLIZLLLIL;
    public final C16F5 LLJ;
    public final C16F5 LLJI;
    public EnumC429620Gsy LLJIJIL;
    public final long LLJILJIL;
    public final long LLJILJILJ;
    public final ConstraintLayout LLJILLL;
    public final FrameLayout LLJJ;
    public final C0KVZ LLJJI;
    public final C1126540fQC LLJJIII;
    public final C417610GZb LLJJIJI;
    public final ImageView LLJJIJIIJIL;
    public final ImageView LLJJIJIL;
    public final ImageView LLJJJ;
    public final C16FV LLJJJIL;
    public final ConcurrentLinkedQueue<C1094360eaI> LLJJJJ;
    public C11JF LLJJJJJIL;
    public C11JF LLJJJJLIIL;
    public final BPEAHandler LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public DataChannel LLJLLIL;
    public boolean LLJLLL;
    public BadgeStruct LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public RunnableC1117740fC0 LLLF;

    @Override // X.C0T8B
    public final boolean h() {
        return true;
    }

    public final void j0() {
        this.LLJLL = false;
        if (!this.LLJLILLLLZIIL) {
            C786410Ut5.LLJJJJ(this.LLILLJJLI, 0);
        }
        C786410Ut5.LLJJJJ(this.LLJ, 8);
        C786410Ut5.LLJJJJ(this.LLIZLLLIL, 8);
        if (this.LLJIJIL == EnumC429620Gsy.SLEEPING) {
            C786410Ut5.LJZI(0, this.LLJJJ);
            e0();
        }
        this.LLILLL.LIZIZ(0L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.LLJZ = null;
        super.onDetachedFromWindow();
    }

    public final void e0() {
        if (C500260Jjc.LJJJJIZL(this.LLILLJJLI)) {
            C786410Ut5.x3(this.LLILLJJLI.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1151700g4m(this, 4));
        } else if (C500260Jjc.LJJJJIZL(this.LLJI)) {
            C786410Ut5.x3(this.LLJI.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1151700g4m(this, 5));
        }
    }

    public final void i0() {
        if (this.LLJJJJ.size() == 0 || this.LLJJLIIIJLLLLLLLZ) {
            return;
        }
        B0(this.LLJJJJ.poll());
    }

    public final void l0() {
        try {
            C1094490eaV c1094490eaVDX = ((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).DX();
            String str = c1094490eaVDX.LJI;
            EnumC1094480eaU enumC1094480eaU = c1094490eaVDX.LIZ;
            if ((enumC1094480eaU != EnumC1094480eaU.INACTIVE && enumC1094480eaU != EnumC1094480eaU.UNQUALIFIED) || this.LLL || Intrinsics.LJFF(InterfaceC1106030et7.B8.LIZ(), str)) {
                return;
            }
            CharSequence text = this.LLILLJJLI.getText();
            ViewGroup.LayoutParams layoutParams = this.LLJJJ.getLayoutParams();
            int marginStart = layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0;
            this.LLILLJJLI.setText(C497740JfY.LJIJI(2131852609));
            this.LLL = true;
            if (this.LLJIJIL == EnumC429620Gsy.SLEEPING) {
                e0();
            }
            this.LLLF = new RunnableC1117740fC0(this, str, text, marginStart);
            HandlerHook.viewPostDelay(this.LLILLJJLI, this.LLLF, Mp4ScreenVideoLoadTimeout.CONTROL);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1CC2.LIZ("Gameplay hint exception", e);
        }
    }

    public final void z0() {
        if (UserLevelBadgeShowEnableSetting.INSTANCE.getValue()) {
            C786410Ut5.LLJZ(this.LLJJI, 0);
        } else {
            C786410Ut5.LLJZ(this.LLJJI, 8);
        }
    }

    public final DataChannel getDatachannel() {
        return this.LLJLLIL;
    }

    public final Handler getHandler1() {
        return this.LLJJL;
    }

    public final boolean getUpdateBadgeViewOpt() {
        return this.LLJZIJLIL;
    }

    public final boolean getUserLevelBack() {
        return this.LLJLLL;
    }

    public static void C0(C1117710fBx c1117710fBx) {
        C786410Ut5.LJZI(0, c1117710fBx.LLJJIJIIJIL);
        C1117810fC7.LIZ = true;
        C786410Ut5.V4(c1117710fBx.LLJJIJIIJIL, 0.0f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(c1117710fBx.LLJJIJIIJIL, (Property<ImageView, Float>) ViewGroup.ALPHA, 0.0f, 1.0f).setDuration(200L);
        duration.addListener(new ALAdapterS13S0100000_17(c1117710fBx, 75));
        duration.setStartDelay(4600L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration);
        animatorSet.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void u0(boolean r15) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1117710fBx.u0(boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51, types: [T] */
    /* JADX WARN: Type inference failed for: r1v89 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    public final void B0(final C1094360eaI c1094360eaI) {
        int i;
        final int i2;
        C1117870fCD c1117870fCD;
        C1117870fCD c1117870fCD2;
        ?? EG2;
        List urls;
        ?? r1;
        List urls2;
        int i3;
        final C118300cf c118300cf = new C118300cf();
        C1094360eaI c1094360eaIHP = ((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).HP();
        if (c1094360eaIHP != null) {
            i = c1094360eaIHP.LJIIJJI;
        } else {
            i = 0;
        }
        c118300cf.element = i;
        C1094360eaI c1094360eaIHP2 = ((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).HP();
        if (c1094360eaIHP2 != null) {
            i2 = c1094360eaIHP2.LIZ;
        } else {
            i2 = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("from: ");
        sbLIZ.append(c118300cf.element);
        sbLIZ.append(", to: ");
        sbLIZ.append(i2);
        C20441214yg.LIZIZ("UserLevelPanel", C2188811AlT.LIZIZ(sbLIZ));
        F0(c1094360eaI, false);
        this.LLILLJJLI.setHorizontalFadingEdgeEnabled(true);
        this.LLILLJJLI.setWillNotDraw(false);
        C1118060fCW.LIZ(this.LLILLJJLI);
        IUserLevelService iUserLevelService = (IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class);
        if (c118300cf.element == i2 || ((ArrayList) this.LLJJI.getBadgeManager().LJ).size() == 0 || this.LLJLLL) {
            if (this.LLJZ != null && !this.LLJJI.LLJILJILJ) {
                this.LLJZ = null;
                s0(true);
            }
            E0(iUserLevelService.HP());
        }
        boolean zTj1 = iUserLevelService.Tj1(c118300cf.element);
        if (!this.LLJJLIIIJLLLLLLLZ && c1094360eaI != null && this.LLJIJIL != EnumC429620Gsy.NEVER_SEND_GIFT) {
            boolean zJ22 = ((IStarCommentService) C1161920gLG.LIZJ(IStarCommentService.class)).J22();
            int iVC2 = ((IStarCommentService) C1161920gLG.LIZJ(IStarCommentService.class)).VC2();
            if (c118300cf.element == 0) {
                if (!C1130100fVw.LIZ.LJIJJLI && !zJ22) {
                    C1094360eaI c1094360eaIHP3 = iUserLevelService.HP();
                    if (c1094360eaIHP3 != null) {
                        i3 = c1094360eaIHP3.LIZ;
                    } else {
                        i3 = 0;
                    }
                    c118300cf.element = i3;
                } else {
                    C1128970fU7 c1128970fU7 = C1130100fVw.LIZ;
                    if (c1128970fU7.LJIJJLI || zJ22) {
                        int i4 = c1128970fU7.LJIL;
                        if (i4 > iVC2) {
                            iVC2 = i4;
                        }
                        c118300cf.element = iVC2;
                    }
                }
            }
            this.LLJJLIIIJLLLLLLLZ = true;
            if (c118300cf.element < i2 && this.LLJIJIL == EnumC429620Gsy.NORMAL) {
                this.LLJL = true;
                ((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).s01();
                C1117810fC7.LIZIZ = true;
                C1094360eaI c1094360eaIHP4 = iUserLevelService.HP();
                if (c1094360eaIHP4 != null) {
                    IUserLevelService iUserLevelService2 = (IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class);
                    if (iUserLevelService2 != null) {
                        EG2 = iUserLevelService2.eG2();
                    } else {
                        EG2 = 0;
                    }
                    int i5 = c118300cf.element;
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_user_level_config_exist");
                    c474500IjALIZ.LJIL();
                    c474500IjALIZ.LJJII(Integer.valueOf((int) EG2), "is_exist");
                    c474500IjALIZ.LJJII("gift_panel_upgrade", Scene.SCENE_SERVICE);
                    c474500IjALIZ.LJJII(Integer.valueOf(i5), "from_grade");
                    c474500IjALIZ.LJJII(Integer.valueOf(i2), "to_grade");
                    c474500IjALIZ.LIZ();
                    IUserLevelBackService iUserLevelBackService = (IUserLevelBackService) C1161920gLG.LIZJ(IUserLevelBackService.class);
                    if (iUserLevelBackService != null && iUserLevelBackService.vz(i2, "gift_pannel_avator_privilege")) {
                        if (!zTj1) {
                            String strLIZIZ = c1094360eaIHP4.LJIIJ;
                            if (strLIZIZ != null) {
                                if (!a0.LJJIIZI(strLIZIZ, "#", false)) {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append('#');
                                    sbLIZ2.append(strLIZIZ);
                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                }
                                if (!Intrinsics.LJFF(strLIZIZ, "#")) {
                                    final int color = ColorProtector.parseColor(strLIZIZ);
                                    final int color2 = getResources().getColor(R.color.bd);
                                    final C817403Hg c817403Hg = new C817403Hg();
                                    C786410Ut5.LJLIIL(200L, this.LLJJL, new Runnable() { // from class: X.0GlR
                                        public final /* synthetic */ long LLILZIL = 200;

                                        public final void LIZ() {
                                            float f = c817403Hg.element;
                                            float f2 = 20;
                                            if (f >= f2) {
                                                this.getHandler1().removeCallbacks(this);
                                                return;
                                            }
                                            C1117710fBx c1117710fBx = this;
                                            float f3 = f / f2;
                                            int i6 = color2;
                                            int i7 = color;
                                            c1117710fBx.getClass();
                                            float f4 = ((i6 >> 24) & 255) / 255.0f;
                                            float fPow = (float) Math.pow(((i6 >> 16) & 255) / 255.0f, 2.2d);
                                            float fPow2 = (float) Math.pow(((i6 >> 8) & 255) / 255.0f, 2.2d);
                                            float fPow3 = (float) Math.pow((i6 & 255) / 255.0f, 2.2d);
                                            float fPow4 = (float) Math.pow(((i7 >> 16) & 255) / 255.0f, 2.2d);
                                            float fPow5 = fPow2 + ((((float) Math.pow(((i7 >> 8) & 255) / 255.0f, 2.2d)) - fPow2) * f3);
                                            float fPow6 = fPow3 + (f3 * (((float) Math.pow((i7 & 255) / 255.0f, 2.2d)) - fPow3));
                                            this.LLJJIJI.setBorderColor((Math.round(((float) Math.pow(fPow + ((fPow4 - fPow) * f3), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round((f4 + (((((i7 >> 24) & 255) / 255.0f) - f4) * f3)) * 255.0f) << 24) | (Math.round(((float) Math.pow(fPow5, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(fPow6, 0.45454545454545453d)) * 255.0f));
                                            c817403Hg.element++;
                                            C786410Ut5.LJLIIL(this.LLILZIL / ((long) 20), this.getHandler1(), this);
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean zLIZ;
                                            C1C7U.LIZ("UserLevelPanel@7018.borderAnimation$runnable$1");
                                            try {
                                                LIZ();
                                            } finally {
                                                if (!zLIZ) {
                                                }
                                            }
                                            C1C7U.LIZIZ("UserLevelPanel@7018.borderAnimation$runnable$1");
                                        }
                                    });
                                    final int color3 = getResources().getColor(R.color.bd);
                                    final C817403Hg c817403Hg2 = new C817403Hg();
                                    C786410Ut5.LJLIIL(4400L, this.LLJJL, new Runnable() { // from class: X.0GlR
                                        public final /* synthetic */ long LLILZIL = 200;

                                        public final void LIZ() {
                                            float f = c817403Hg2.element;
                                            float f2 = 20;
                                            if (f >= f2) {
                                                this.getHandler1().removeCallbacks(this);
                                                return;
                                            }
                                            C1117710fBx c1117710fBx = this;
                                            float f3 = f / f2;
                                            int i6 = color;
                                            int i7 = color3;
                                            c1117710fBx.getClass();
                                            float f4 = ((i6 >> 24) & 255) / 255.0f;
                                            float fPow = (float) Math.pow(((i6 >> 16) & 255) / 255.0f, 2.2d);
                                            float fPow2 = (float) Math.pow(((i6 >> 8) & 255) / 255.0f, 2.2d);
                                            float fPow3 = (float) Math.pow((i6 & 255) / 255.0f, 2.2d);
                                            float fPow4 = (float) Math.pow(((i7 >> 16) & 255) / 255.0f, 2.2d);
                                            float fPow5 = fPow2 + ((((float) Math.pow(((i7 >> 8) & 255) / 255.0f, 2.2d)) - fPow2) * f3);
                                            float fPow6 = fPow3 + (f3 * (((float) Math.pow((i7 & 255) / 255.0f, 2.2d)) - fPow3));
                                            this.LLJJIJI.setBorderColor((Math.round(((float) Math.pow(fPow + ((fPow4 - fPow) * f3), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round((f4 + (((((i7 >> 24) & 255) / 255.0f) - f4) * f3)) * 255.0f) << 24) | (Math.round(((float) Math.pow(fPow5, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(fPow6, 0.45454545454545453d)) * 255.0f));
                                            c817403Hg2.element++;
                                            C786410Ut5.LJLIIL(this.LLILZIL / ((long) 20), this.getHandler1(), this);
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean zLIZ;
                                            C1C7U.LIZ("UserLevelPanel@7018.borderAnimation$runnable$1");
                                            try {
                                                LIZ();
                                            } finally {
                                                if (!zLIZ) {
                                                }
                                            }
                                            C1C7U.LIZIZ("UserLevelPanel@7018.borderAnimation$runnable$1");
                                        }
                                    });
                                }
                            }
                            UserLevelBadgeShowEnableSetting userLevelBadgeShowEnableSetting = UserLevelBadgeShowEnableSetting.INSTANCE;
                            if (userLevelBadgeShowEnableSetting.getValue()) {
                                C20441214yg.LIZIZ("UserLevelPanel", "Weep animation");
                                C786410Ut5.LJZI(0, this.LLJJIJIL);
                                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat((int) C497740JfY.LIZIZ(-20.0f), (int) C497740JfY.LIZIZ(20.0f));
                                valueAnimatorOfFloat.setDuration(1000L);
                                valueAnimatorOfFloat.setInterpolator(new InterpolatorC1088720eRC(0.93d, 0.0d, 0.85d, 1.0d));
                                valueAnimatorOfFloat.addUpdateListener(new AUListenerS216S0200000_6(this.LLJJIJIL.getLayoutParams(), this, 15));
                                valueAnimatorOfFloat.addListener(new ALAdapterS3S0100000_6(this, 45));
                                valueAnimatorOfFloat.setStartDelay(400L);
                                valueAnimatorOfFloat.start();
                            }
                            String strValueOf = String.valueOf(c1094360eaIHP4.LIZ);
                            if (!userLevelBadgeShowEnableSetting.getValue()) {
                                C786410Ut5.LLJZ(this.LLJJI, 8);
                            } else {
                                C786410Ut5.LLJZ(this.LLJJI, 0);
                                C786410Ut5.LJLIIL(1240L, this.LLJJL, new ARunnableS12S1100000_7(this, strValueOf, 11));
                            }
                            C786410Ut5.LJLIIL(400L, this.LLJJL, new ARunnableS28S0101000_17(c1094360eaIHP4.LIZ, this, 9));
                            C0(this);
                        } else {
                            C417610GZb c417610GZb = this.LLJJIJI;
                            int visibility = c417610GZb.getVisibility();
                            c417610GZb.setVisibility(0);
                            C1602160rnK.LIZIZ(visibility, 0, c417610GZb);
                            C417610GZb c417610GZb2 = this.LLJJIJI;
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c417610GZb2);
                            c417610GZb2.setAlpha(1.0f);
                            UserLevelBadgeShowEnableSetting userLevelBadgeShowEnableSetting2 = UserLevelBadgeShowEnableSetting.INSTANCE;
                            if (userLevelBadgeShowEnableSetting2.getValue()) {
                                C786410Ut5.LLJZ(this.LLJJI, 0);
                                C0KVZ c0kvz = this.LLJJI;
                                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0kvz);
                                c0kvz.setAlpha(1.0f);
                            } else {
                                C786410Ut5.LLJZ(this.LLJJI, 8);
                            }
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(255.0f, 0.0f);
                            valueAnimatorOfFloat2.setDuration(200L);
                            valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                            valueAnimatorOfFloat2.addUpdateListener(new AUListenerS266S0100000_17(this, 89));
                            valueAnimatorOfFloat2.addListener(new ALAdapterS13S0100000_17(this, 73));
                            valueAnimatorOfFloat2.start();
                            E0(c1094360eaIHP4);
                            C786410Ut5.LJLIIL(400L, this.LLJJL, new ARunnableS28S0101000_17(c1094360eaIHP4.LIZ, this, 9));
                            C786410Ut5.LLJJJJJIL(this.LLJJJIL, 0);
                            C786410Ut5.l5(this.LLJJJIL, 1.0f);
                            C786410Ut5.bc(this.LLJJJIL, 0.0f);
                            C16FV c16fv = this.LLJJJIL;
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c16fv);
                            c16fv.setScaleY(0.0f);
                            final C259800zU c259800zU = new C259800zU();
                            ImageModel imageModel = c1094360eaIHP4.LJ;
                            if (imageModel != null && (urls = imageModel.getUrls()) != null && urls.size() >= 1) {
                                ImageModel imageModel2 = c1094360eaIHP4.LJ;
                                if (imageModel2 != null && (urls2 = imageModel2.getUrls()) != null) {
                                    r1 = ListProtector.get(urls2, 0);
                                } else {
                                    r1 = 0;
                                }
                                c259800zU.element = r1;
                            }
                            C1121700fIO.LIZ(c1094360eaIHP4.LJ, new InterfaceC1121710fIP() { // from class: X.0fC1
                                @Override // X.InterfaceC1121710fIP
                                public final void onFail() {
                                    C505401y0.LIZJ(c259800zU.element, false);
                                }

                                @Override // X.InterfaceC1121710fIP
                                public final void LIZIZ(Bitmap bitmap) {
                                    this.LIZ.LLJJJIL.setImageBitmap(bitmap);
                                    C505401y0.LIZJ(c259800zU.element, true);
                                }
                            });
                            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            valueAnimatorOfFloat3.setInterpolator(C0GY9.LIZIZ(0.33f, 0.0f, 0.67f, 1.0f));
                            valueAnimatorOfFloat3.setStartDelay(200L);
                            valueAnimatorOfFloat3.setDuration(200L);
                            valueAnimatorOfFloat3.addUpdateListener(new AUListenerS266S0100000_17(this, 90));
                            valueAnimatorOfFloat3.addListener(new ALAdapterS13S0100000_17(this, 74));
                            valueAnimatorOfFloat3.start();
                            C786410Ut5.LLJJJJJIL(this.LLJJJIL, 0);
                            C786410Ut5.l5(this.LLJJJIL, 1.0f);
                            ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(255.0f, 0.0f);
                            valueAnimatorOfFloat4.setDuration(300L);
                            valueAnimatorOfFloat4.setStartDelay(4100L);
                            valueAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
                            valueAnimatorOfFloat4.addUpdateListener(new AUListenerS266S0100000_17(this, 88));
                            valueAnimatorOfFloat4.addListener(new ALAdapterS13S0100000_17(this, 72));
                            valueAnimatorOfFloat4.start();
                            if (!userLevelBadgeShowEnableSetting2.getValue()) {
                                C786410Ut5.LLJZ(this.LLJJI, 8);
                            } else {
                                C786410Ut5.LLJZ(this.LLJJI, 0);
                                C0KVZ c0kvz2 = this.LLJJI;
                                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0kvz2);
                                c0kvz2.setAlpha(0.0f);
                                ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(0.0f, 255.0f);
                                valueAnimatorOfFloat5.setDuration(200L);
                                valueAnimatorOfFloat5.setStartDelay(4600L);
                                valueAnimatorOfFloat5.setInterpolator(new LinearInterpolator());
                                valueAnimatorOfFloat5.addUpdateListener(new AUListenerS257S0100000_7(this, 29));
                                valueAnimatorOfFloat5.addListener(new ALAdapterS4S0100000_7(this, 21));
                                valueAnimatorOfFloat5.start();
                            }
                            C417610GZb c417610GZb3 = this.LLJJIJI;
                            int visibility2 = c417610GZb3.getVisibility();
                            c417610GZb3.setVisibility(0);
                            C1602160rnK.LIZIZ(visibility2, 0, c417610GZb3);
                            C417610GZb c417610GZb4 = this.LLJJIJI;
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c417610GZb4);
                            c417610GZb4.setAlpha(0.0f);
                            ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(0.0f, 255.0f);
                            valueAnimatorOfFloat6.setDuration(300L);
                            valueAnimatorOfFloat6.setStartDelay(4100L);
                            valueAnimatorOfFloat6.setInterpolator(new LinearInterpolator());
                            valueAnimatorOfFloat6.addUpdateListener(new AUListenerS256S0100000_6(this, 102));
                            valueAnimatorOfFloat6.addListener(new ALAdapterS3S0100000_6(this, 46));
                            valueAnimatorOfFloat6.start();
                            C0(this);
                        }
                        IUserLevelBackService iUserLevelBackService2 = (IUserLevelBackService) C1161920gLG.LIZJ(IUserLevelBackService.class);
                        if (iUserLevelBackService2 != null) {
                            iUserLevelBackService2.Nn0(i2, "gift_pannel_avator_privilege");
                        }
                    }
                }
                float f = this.LLILZLL;
                InterfaceC1117910fCH interfaceC1117910fCH = new InterfaceC1117910fCH() { // from class: X.0fBz
                    @Override // X.InterfaceC1117910fCH
                    public final void LIZ() {
                        C786410Ut5.LLLIIIIL(this.LLILLL, 8);
                        C786410Ut5.LL(8, this.LLJILLL);
                        C786410Ut5.LLJJJJ(this.LLILZ, 0);
                        this.LLILZ.setText(C786410Ut5.k4(Locale.US, C497740JfY.LJIJI(2131840944), Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1)));
                        final C1117710fBx c1117710fBx = this;
                        final C118300cf c118300cf2 = c118300cf;
                        final int i6 = i2;
                        final C1094360eaI c1094360eaI2 = c1094360eaI;
                        InterfaceC1117800fC6 interfaceC1117800fC6 = new InterfaceC1117800fC6() { // from class: X.0fBy
                            @Override // X.InterfaceC1117800fC6
                            public final void LIZIZ() {
                            }

                            @Override // X.InterfaceC1117800fC6
                            public final void LIZ() {
                                long id;
                                c1117710fBx.getClass();
                                C1117710fBx.u0(true);
                                C1117960fCM c1117960fCM = C1117960fCM.LIZ;
                                int i7 = c118300cf2.element;
                                int i8 = i6;
                                c1117960fCM.getClass();
                                Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                                long id2 = 0;
                                if (room != null) {
                                    id = room.getId();
                                    if (room.getOwner() != null) {
                                        id2 = room.getOwner().getId();
                                    }
                                } else {
                                    id = 0;
                                }
                                long currentUserId = UserService.getInstance().user().getCurrentUserId();
                                IUserLevelService iUserLevelService3 = (IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class);
                                String str = (iUserLevelService3 == null || !iUserLevelService3.Tj1(i7)) ? "small" : "big";
                                if (i7 <= 0) {
                                    str = "new";
                                }
                                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_user_level_progress_level_up");
                                c474500IjALIZ2.LJIL();
                                c474500IjALIZ2.LJJII(Long.valueOf(id), "room_id");
                                c474500IjALIZ2.LJJII(Long.valueOf(id2), "anchor_id");
                                c474500IjALIZ2.LJJII(Long.valueOf(currentUserId), "user_id");
                                c474500IjALIZ2.LJJII(str, "level_up_type");
                                c474500IjALIZ2.LJJII(Integer.valueOf(i8), "user_level");
                                c474500IjALIZ2.LJJII(((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).XS1(), "trigger_payment");
                                c474500IjALIZ2.LIZ();
                                C786410Ut5.LLLIIIIL(c1117710fBx.LLILLL, 0);
                                C786410Ut5.LLJJJJ(c1117710fBx.LLILZ, 8);
                                C786410Ut5.LL(0, c1117710fBx.LLJILLL);
                                c1117710fBx.setMaxProgress(c1094360eaI2);
                                ((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).s01();
                                C1094360eaI c1094360eaI3 = c1094360eaI2;
                                long j = c1094360eaI3.LIZIZ - c1094360eaI3.LJI;
                                if (i6 != ((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).vF1()) {
                                    final C1117710fBx c1117710fBx2 = c1117710fBx;
                                    float f2 = j;
                                    InterfaceC1117910fCH interfaceC1117910fCH2 = new InterfaceC1117910fCH() { // from class: X.0fC2
                                        @Override // X.InterfaceC1117910fCH
                                        public final void LIZ() {
                                            c1117710fBx2.setUpdateProgressBar(false);
                                            c1117710fBx2.setPlayingBarAnimation(false);
                                            c1117710fBx2.i0();
                                        }
                                    };
                                    c1117710fBx2.LLIZ = f2;
                                    c1117710fBx2.LLILLL.LIZ(0.0f, f2, interfaceC1117910fCH2);
                                    return;
                                }
                                c1117710fBx.LLILLJJLI.setText(C497740JfY.LJIJI(2131840943));
                                C1117710fBx c1117710fBx3 = c1117710fBx;
                                c1117710fBx3.LLIZ = c1117710fBx3.LLILZLL;
                                C1117870fCD c1117870fCD3 = c1117710fBx3.LLILLL;
                                c1117870fCD3.LLILZLL = c1117870fCD3.LLILZIL;
                                c1117870fCD3.invalidate();
                                ((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).s01();
                                c1117710fBx.setUpdateProgressBar(false);
                                c1117710fBx.setPlayingBarAnimation(false);
                                c1117710fBx.i0();
                            }
                        };
                        c1117710fBx.getClass();
                        int i7 = C497740JfY.LJJ() ? 1 : -1;
                        AnimatorSet animatorSet = new AnimatorSet();
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        float f2 = i7;
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1117710fBx.LLILZ, (Property<C16F5, Float>) ViewGroup.TRANSLATION_X, ((int) C497740JfY.LIZIZ(45.0f)) * f2, 0.0f);
                        objectAnimatorOfFloat.setDuration(c1117710fBx.LLJILJIL);
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c1117710fBx.LLILZ, (Property<C16F5, Float>) ViewGroup.ALPHA, 0.0f, 1.0f);
                        objectAnimatorOfFloat2.setDuration(c1117710fBx.LLJILJIL);
                        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(c1117710fBx.LLILZ, (Property<C16F5, Float>) ViewGroup.TRANSLATION_X, 0.0f, ((int) C497740JfY.LIZIZ(45.0f)) * f2);
                        objectAnimatorOfFloat3.setDuration(c1117710fBx.LLJILJIL);
                        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(c1117710fBx.LLILZ, (Property<C16F5, Float>) ViewGroup.ALPHA, 1.0f, 0.0f);
                        objectAnimatorOfFloat4.setDuration(c1117710fBx.LLJILJIL);
                        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(c1117710fBx.LLILZ, (Property<C16F5, Float>) ViewGroup.ALPHA, 1.0f, 1.0f);
                        objectAnimatorOfFloat5.setDuration(c1117710fBx.LLJILJILJ);
                        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).before(objectAnimatorOfFloat5);
                        animatorSet2.play(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4);
                        animatorSet.addListener(new AAListenerS269S0200000_17(interfaceC1117800fC6, animatorSet2, 1));
                        animatorSet2.addListener(new AAListenerS328S0100000_17(interfaceC1117800fC6, 9));
                        animatorSet.start();
                    }
                };
                this.LLIZ = f;
                if (this.LLJLLL && (c1117870fCD2 = this.LLILLL) != null) {
                    c1117870fCD2.setLevelProgress(f);
                }
                C1117870fCD c1117870fCD3 = this.LLILLL;
                c1117870fCD3.LIZ(c1117870fCD3.LLILZLL, f, interfaceC1117910fCH);
            } else {
                setMaxProgress(c1094360eaI);
                long j = c1094360eaI.LJIIIIZZ / ((long) 86400);
                Long lValueOf = Long.valueOf(j);
                Long lLIZIZ = InterfaceC1094160eZy.r1.LIZIZ();
                long jLIZ = C158B.LIZ();
                if (lValueOf != null && lValueOf.longValue() <= 2 && lValueOf.longValue() != 0 && jLIZ - lLIZIZ.longValue() >= 86400000 && !C500260Jjc.LJJJJIZL(this.LLJI) && !this.LLJLILLLLZIIL && !this.LLJLL) {
                    C786410Ut5.LLJJJJ(this.LLJI, 0);
                    int i6 = (int) j;
                    this.LLJI.setText(C786410Ut5.k4(Locale.US, C497740JfY.LJIIJJI(2131755503, i6), Arrays.copyOf(new Object[]{Integer.valueOf(i6)}, 1)));
                    if (!C500260Jjc.LJJJJIZL(this.LLJ)) {
                        C786410Ut5.LJZI(0, this.LLJJJ);
                        e0();
                    }
                    this.LLJLILLLLZIIL = true;
                    C786410Ut5.LLJJJJ(this.LLILLJJLI, 8);
                    this.LLJJJJLIIL = (C11JF) C11NZ.LJLJJLL(Mp4ScreenVideoLoadTimeout.CONTROL, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS186S0100000_17(this, 40));
                }
                if (i2 == ((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).vF1()) {
                    if (this.LLJIJIL == EnumC429620Gsy.NORMAL) {
                        this.LLILLJJLI.setText(C497740JfY.LJIJI(2131840943));
                    }
                    float f2 = this.LLILZLL;
                    InterfaceC1117910fCH interfaceC1117910fCH2 = new InterfaceC1117910fCH() { // from class: X.0fC4
                        @Override // X.InterfaceC1117910fCH
                        public final void LIZ() {
                            this.LIZ.setUpdateProgressBar(false);
                            this.LIZ.i0();
                        }
                    };
                    this.LLIZ = f2;
                    this.LLILLL.LIZ(f2, f2, interfaceC1117910fCH2);
                } else {
                    float f3 = c1094360eaI.LIZIZ - c1094360eaI.LJI;
                    InterfaceC1117910fCH interfaceC1117910fCH3 = new InterfaceC1117910fCH() { // from class: X.0fC5
                        @Override // X.InterfaceC1117910fCH
                        public final void LIZ() {
                            this.LIZ.setUpdateProgressBar(false);
                            this.LIZ.i0();
                        }
                    };
                    this.LLIZ = f3;
                    if (this.LLJLLL && (c1117870fCD = this.LLILLL) != null) {
                        c1117870fCD.setLevelProgress(f3);
                    }
                    C1117870fCD c1117870fCD4 = this.LLILLL;
                    c1117870fCD4.LIZ(c1117870fCD4.LLILZLL, f3, interfaceC1117910fCH3);
                }
            }
            this.LLJLLL = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E0(X.C1094360eaI r15) {
        /*
            r14 = this;
            com.bytedance.android.live.base.model.user.BadgeStruct r0 = r14.LLJZ
            r13 = 1
            r7 = 0
            r5 = 0
            if (r0 == 0) goto L23
            X.0KVZ r0 = r14.LLJJI
            int r1 = r0.getVisibility()
            r0 = 8
            if (r1 == r0) goto L23
            com.bytedance.android.live.base.model.user.BadgeStruct r1 = r14.LLJZ
            if (r15 == 0) goto L21
            com.bytedance.android.live.base.model.user.BadgeStruct r0 = r15.LIZJ
        L17:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L23
            r14.z0()
            return
        L21:
            r0 = r5
            goto L17
        L23:
            com.bytedance.android.live.base.model.user.BadgeStruct r0 = r14.LLJZ
            if (r15 == 0) goto L74
            com.bytedance.android.live.base.model.user.BadgeStruct r6 = r15.LIZJ
        L29:
            if (r0 == 0) goto L72
            com.bytedance.android.live.base.model.user.CombineBadgeStruct r1 = r0.combineBadgeStruct
            if (r1 == 0) goto L70
            java.lang.String r4 = r1.str
        L31:
            if (r6 == 0) goto L6e
            com.bytedance.android.live.base.model.user.CombineBadgeStruct r0 = r6.combineBadgeStruct
            if (r0 == 0) goto L6e
            java.lang.String r3 = r0.str
        L39:
            if (r1 == 0) goto L6c
            com.bytedance.android.live.base.model.ImageModel r0 = r1.icon
            if (r0 == 0) goto L6c
            java.lang.String r2 = r0.getUri()
        L43:
            if (r6 == 0) goto L6a
            com.bytedance.android.live.base.model.user.CombineBadgeStruct r0 = r6.combineBadgeStruct
            if (r0 == 0) goto L6a
            com.bytedance.android.live.base.model.ImageModel r0 = r0.icon
            if (r0 == 0) goto L6a
            java.lang.String r1 = r0.getUri()
        L51:
            boolean r0 = android.text.TextUtils.equals(r4, r3)
            if (r0 == 0) goto L72
            boolean r0 = android.text.TextUtils.equals(r2, r1)
            if (r0 == 0) goto L72
            r0 = 1
        L5e:
            if (r15 == 0) goto L62
            com.bytedance.android.live.base.model.user.BadgeStruct r5 = r15.LIZJ
        L62:
            r14.LLJZ = r5
            if (r0 == 0) goto L76
            r14.z0()
            return
        L6a:
            r1 = r5
            goto L51
        L6c:
            r2 = r5
            goto L43
        L6e:
            r3 = r5
            goto L39
        L70:
            r4 = r5
            goto L31
        L72:
            r0 = 0
            goto L5e
        L74:
            r6 = r5
            goto L29
        L76:
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r0 = r0.user()
            X.1DgM r0 = r0.getCurrentUser()
            if (r0 == 0) goto L90
            com.bytedance.android.live.base.model.ImageModel r1 = r0.getAvatarThumb()
            X.0fC3 r0 = new X.0fC3
            r0.<init>()
            X.C1121700fIO.LIZ(r1, r0)
        L90:
            if (r15 == 0) goto Lc7
            com.bytedance.android.live.base.model.user.BadgeStruct r1 = r15.LIZJ
            if (r1 == 0) goto Lc7
            r14.LLJZ = r1
            r0 = 5
            r1.badgeDisplayType = r0
            com.bytedance.android.live.base.model.user.BadgeStruct[] r0 = new com.bytedance.android.live.base.model.user.BadgeStruct[r13]
            r0[r7] = r1
            java.util.List r8 = X.C1697810uHb.LJIILJJIL(r0)
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r0 = r0.user()
            X.1DgM r9 = r0.getCurrentUser()
            if (r9 == 0) goto Lc7
            r14.z0()
            r14.s0(r7)
            X.0KVZ r6 = r14.LLJJI
            com.bytedance.android.live.base.model.user.User r9 = (com.bytedance.android.live.base.model.user.User) r9
            r10 = 6
            kotlin.jvm.internal.AwS561S0100000_17 r11 = new kotlin.jvm.internal.AwS561S0100000_17
            r0 = 169(0xa9, float:2.37E-43)
            r11.<init>(r14, r0)
            r12 = 0
            r6.LJ(r7, r8, r9, r10, r11, r12, r13)
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1117710fBx.E0(X.0eaI):void");
    }

    public final void n0(boolean z) {
        int iLIZIZ = -1;
        if (z) {
            if (!C1125810fP1.LIZJ()) {
                iLIZIZ = (int) C497740JfY.LIZIZ(190.0f);
            }
            ViewGroup.LayoutParams layoutParams = this.LLILLJJLI.getLayoutParams();
            layoutParams.width = iLIZIZ;
            C786410Ut5.y6(this.LLILLJJLI, layoutParams);
            ViewGroup.LayoutParams layoutParams2 = this.LLJI.getLayoutParams();
            layoutParams2.width = iLIZIZ;
            C786410Ut5.y6(this.LLJI, layoutParams2);
            return;
        }
        C786410Ut5.LJZI(0, this.LL);
        ViewGroup.LayoutParams layoutParams3 = this.LLILLJJLI.getLayoutParams();
        layoutParams3.width = -1;
        C786410Ut5.y6(this.LLILLJJLI, layoutParams3);
        ViewGroup.LayoutParams layoutParams4 = this.LLJI.getLayoutParams();
        layoutParams4.width = (int) C497740JfY.LIZIZ(230.0f);
        C786410Ut5.y6(this.LLJI, layoutParams4);
        C1117830fC9.LIZ(0, this);
        requestLayout();
    }

    public final void p0(long j) {
        l0();
        if (!this.LLL) {
            C786410Ut5.LLJJJJ(this.LLILLJJLI, 8);
            C786410Ut5.LLJJJJ(this.LLJ, 0);
            int i = (int) j;
            this.LLJ.setText(h0(j, u.LJJIFFI(u.LJJIFFI(C786410Ut5.k4(Locale.getDefault(), C497740JfY.LJIIJJI(2131755853, i), Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)), e3.e, e3.f, false), e3.f, "", false), "+%s"));
            C786410Ut5.LJZI(8, this.LLJJJ);
            C786410Ut5.LLJJJJ(this.LLJI, 4);
            if (this.LLILZIL + this.LLIZ >= this.LLILZLL) {
                int iM40 = ((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).m40(j);
                C786410Ut5.LLJJJJ(this.LLIZLLLIL, 0);
                this.LLIZLLLIL.setText(h0(j, u.LJJIFFI(u.LJJIFFI(C786410Ut5.k4(Locale.getDefault(), C497740JfY.LJIIJJI(2131755854, i), Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(iM40)}, 2)), e3.e, e3.f, false), e3.f, "", false), "+%s"));
                C786410Ut5.LLJJJJ(this.LLJ, 8);
            } else {
                C786410Ut5.LLJJJJ(this.LLIZLLLIL, 8);
            }
            C11JF c11jf = this.LLJJJJJIL;
            if (c11jf != null) {
                c11jf.dispose();
            }
            this.LLJLL = true;
            this.LLJJJJJIL = (C11JF) C11NZ.LJLJJLL(Mp4ScreenVideoLoadTimeout.CONTROL, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS186S0100000_17(this, 39));
        }
    }

    public final void s0(boolean z) {
        C0KVZ c0kvz;
        C0KVZ c0kvz2 = this.LLJJI;
        if (c0kvz2 != null) {
            c0kvz2.LIZLLL();
        }
        if (z && (c0kvz = this.LLJJI) != null) {
            C786410Ut5.LLJZ(c0kvz, 8);
        }
    }

    public final void setDatachannel(DataChannel dataChannel) {
        this.LLJLLIL = dataChannel;
    }

    public final void setMaxProgress(C1094360eaI c1094360eaI) {
        Float fValueOf;
        if (c1094360eaI != null && (fValueOf = Float.valueOf(c1094360eaI.LJII - c1094360eaI.LJI)) != null && !Intrinsics.LIZLLL(fValueOf, 0.0f)) {
            this.LLILZLL = fValueOf.floatValue();
            this.LLILLL.setMaxProgress(fValueOf.floatValue());
        }
    }

    public final void setPlayingBarAnimation(boolean z) {
        this.LLJL = z;
    }

    public final void setUpdateBadgeViewOpt(boolean z) {
        this.LLJZIJLIL = z;
    }

    public final void setUpdateProgressBar(boolean z) {
        this.LLJJLIIIJLLLLLLLZ = z;
    }

    public final void setUserLevelBack(boolean z) {
        this.LLJLLL = z;
    }

    public C1117710fBx(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void F0(C1094360eaI c1094360eaI, boolean z) {
        boolean z2;
        boolean z3;
        if (!this.LLL) {
            if (c1094360eaI != null && c1094360eaI.LJFF == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                this.LLJIJIL = EnumC429620Gsy.SLEEPING;
                if (!C500260Jjc.LJJJJIZL(this.LLJ) && !C500260Jjc.LJJJJIZL(this.LLIZLLLIL)) {
                    C786410Ut5.LJZI(0, this.LLJJJ);
                    e0();
                }
                C786410Ut5.LLLIIIIL(this.LLILLL, 0);
                this.LLILLL.setLevelProgressColor(-7829368);
                this.LLILLJJLI.setText(C497740JfY.LJIJI(2131840946));
                ConstraintLayout constraintLayout = this.LLJILLL;
                C1117830fC9.LJFF((int) C497740JfY.LIZIZ(12.0f), constraintLayout);
                constraintLayout.requestLayout();
            } else {
                if (c1094360eaI != null && c1094360eaI.LIZIZ == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3 && c1094360eaI != null) {
                    this.LLJIJIL = EnumC429620Gsy.NORMAL;
                    if (!C500260Jjc.LJJJJIZL(this.LLJI)) {
                        C786410Ut5.LJZI(8, this.LLJJJ);
                    }
                    if (!this.LLJJLIIIJLLLLLLLZ) {
                        C786410Ut5.LLLIIIIL(this.LLILLL, 0);
                    }
                    this.LLILLL.setLevelProgressColor(null);
                    long j = c1094360eaI.LJII - c1094360eaI.LIZIZ;
                    if (c1094360eaI.LIZ == ((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).vF1()) {
                        this.LLILLJJLI.setText(C497740JfY.LJIJI(2131840943));
                    } else {
                        int i = (int) j;
                        this.LLILLJJLI.setText(h0(j, C786410Ut5.k4(Locale.getDefault(), C497740JfY.LJIIJJI(2131755502, i), Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)), "%s"));
                    }
                    ConstraintLayout constraintLayout2 = this.LLJILLL;
                    C1117830fC9.LJFF((int) C497740JfY.LIZIZ(12.0f), constraintLayout2);
                    constraintLayout2.requestLayout();
                } else {
                    this.LLJIJIL = EnumC429620Gsy.NEVER_SEND_GIFT;
                    C786410Ut5.LJZI(8, this.LLJJJ);
                    C786410Ut5.LLLIIIIL(this.LLILLL, 8);
                    this.LLILLJJLI.setText(C497740JfY.LJIJI(2131840945));
                    ConstraintLayout constraintLayout3 = this.LLJILLL;
                    C1117830fC9.LJFF((int) C497740JfY.LIZIZ(15.0f), constraintLayout3);
                    constraintLayout3.requestLayout();
                }
            }
            if (!z) {
                l0();
            }
        }
    }

    public C1117710fBx(Context context, AttributeSet attributeSet, int i) {
        int iIntValue;
        int iIntValue2;
        View view;
        super(context, attributeSet, i);
        this.LLJIJIL = EnumC429620Gsy.NEVER_SEND_GIFT;
        this.LLJILJIL = 200L;
        this.LLJILJILJ = 4400L;
        this.LLJJJJ = new ConcurrentLinkedQueue<>();
        this.LLJJL = new BPEAHandler(Looper.getMainLooper());
        this.LLJZIJLIL = true;
        ViewGroup.inflate(context, R.layout.hzk, this);
        this.LL = (ImageView) findViewById(R.id.user_level_detail);
        C16F5 c16f5 = (C16F5) findViewById(R.id.p4i);
        this.LLILLJJLI = c16f5;
        this.LLILLL = (C1117870fCD) findViewById(R.id.user_level_bar);
        this.LLIZLLLIL = (C16F5) findViewById(R.id.upgrade_text);
        this.LLJ = (C16F5) findViewById(R.id.izp);
        this.LLILZ = (C16F5) findViewById(R.id.upgrade_animation_text);
        this.LLJILLL = (ConstraintLayout) findViewById(R.id.user_level_description);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.bpr);
        this.LLJJ = frameLayout;
        C0KVZ c0kvz = (C0KVZ) findViewById(R.id.iyv);
        this.LLJJI = c0kvz;
        ViewGroup.LayoutParams layoutParams = c0kvz.getLayoutParams();
        layoutParams.width = (int) C497740JfY.LIZIZ(33.0f);
        C0KVZ c0kvz2 = this.LLJJI;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0kvz2);
        c0kvz2.setLayoutParams(layoutParams);
        this.LLJJIII = (C1126540fQC) findViewById(R.id.v54);
        C417610GZb c417610GZb = (C417610GZb) findViewById(R.id.user_avatar_iv);
        this.LLJJIJI = c417610GZb;
        ImageView imageView = (ImageView) findViewById(R.id.mma);
        this.LLJJIJIIJIL = imageView;
        this.LLJJIJIL = (ImageView) findViewById(R.id.ws4);
        ImageView imageView2 = (ImageView) findViewById(R.id.vjc);
        this.LLJJJ = imageView2;
        this.LLJJJIL = (C16FV) findViewById(R.id.bpn);
        this.LLJI = (C16F5) findViewById(R.id.will_sleep_text);
        C1094360eaI c1094360eaIHP = ((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).HP();
        if (C1117810fC7.LIZ) {
            C786410Ut5.LJZI(0, imageView);
        }
        setMaxProgress(c1094360eaIHP);
        C786410Ut5.I7(new AbS698S0100000_17(this, 7), this);
        int iLIZ = C439101nJ.LIZ(15);
        int iLIZ2 = C439101nJ.LIZ(15);
        int iLIZ3 = C439101nJ.LIZ(15);
        int iLIZ4 = C439101nJ.LIZ(15);
        if (imageView2 != null) {
            Object parent = imageView2.getParent();
            if ((parent instanceof View) && (view = (View) parent) != null) {
                HandlerHook.viewPost(view, new ARunnableS0S0204000_1(iLIZ, iLIZ2, iLIZ3, iLIZ4, imageView2, view, 4));
            }
        }
        C786410Ut5.I7(new AbS698S0100000_17(this, 8), imageView2);
        F0(c1094360eaIHP, true);
        if (C1125810fP1.LIZJ()) {
            C500260Jjc.LJLJLLL((int) C1117830fC9.LIZJ(28), c417610GZb);
            C500260Jjc.LJJZ((int) C1117830fC9.LIZJ(28), c417610GZb);
            Integer numLIZ = C1135270feH.LIZ(R.attr.ey9, context);
            if (numLIZ != null) {
                iIntValue = numLIZ.intValue();
            } else {
                iIntValue = 822083583;
            }
            c417610GZb.setBorderColor(iIntValue);
            C500260Jjc.LJJLJ((int) C1117830fC9.LIZJ(2), c417610GZb);
            C500260Jjc.LJJLJ((int) C1117830fC9.LIZJ(34), frameLayout);
            if (c16f5 != null) {
                Integer numLIZ2 = C1135270feH.LIZ(R.attr.ezq, context);
                if (numLIZ2 != null) {
                    iIntValue2 = numLIZ2.intValue();
                } else {
                    iIntValue2 = -592138;
                }
                c16f5.setTextColor(iIntValue2);
                c16f5.setTypeface(C1119920fFW.LIZJ(c16f5.getTextSize(), 500, c16f5.getContext()));
            }
        }
    }

    public final SpannableStringBuilder h0(long j, String str, String str2) {
        int iIntValue;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        String strLJJIFFI = u.LJJIFFI(str2, "%s", String.valueOf(j), false);
        int iLJJJ = a0.LJJJ(spannableStringBuilder.toString(), strLJJIFFI, 0, false, 6);
        if (iLJJJ < 0) {
            iLJJJ = 0;
        }
        int length = strLJJIFFI.length() + iLJJJ;
        int length2 = spannableStringBuilder.length();
        if (length > length2) {
            length = length2;
        }
        C1119920fFW.LJ(getContext(), spannableStringBuilder, iLJJJ, length, 33, 9, 500);
        if (C1125810fP1.LIZJ()) {
            Integer numLIZ = C1135270feH.LIZ(R.attr.ezt, getContext());
            if (numLIZ != null) {
                iIntValue = numLIZ.intValue();
            } else {
                iIntValue = -1711276033;
            }
            if (iLJJJ > 0) {
                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(iIntValue), 0, iLJJJ, 33);
            }
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(iIntValue), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }
}
