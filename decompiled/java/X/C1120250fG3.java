package X;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.other.LiveBottomLikeViewAnimationOptSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveBottomRightLikeParamsSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLikeAnimationDowngradeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLikeBitmapOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.LiveInnerDowngradeAdaptExp;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveUltraLiteModeSetting;
import com.bytedance.android.performanhtune.IPTFService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS631S0100000_17;

/* JADX INFO: renamed from: X.0fG3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1120250fG3 extends C1091250eVH implements InterfaceC1086350eNN {
    public int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public float LLJILLL;
    public float LLJJ;
    public long LLJJI;
    public long LLJJIII;
    public final ArrayList<C1120260fG4> LLJJIJI;
    public final C1085650eMF<C1120290fG7> LLJJIJIIJIL;
    public final C1085650eMF<C1120290fG7> LLJJIJIL;
    public final C1120280fG6 LLJJJ;
    public final boolean LLJJJIL;
    public final boolean LLJJJJ;
    public final int LLJJJJJIL;
    public final boolean LLJJJJLIIL;
    public boolean LLJJL;
    public float LLJJLIIIJLLLLLLLZ;
    public final C1120220fG0 LLJL;
    public float LLJLIL;
    public float LLJLILLLLZIIL;
    public Function0<Unit> LLJLL;

    public final boolean LJI(float f) {
        return 0.0f <= f && f <= 1.0f;
    }

    private final float getDistanceRatio() {
        return this.LLJILLL * this.LLJLIL;
    }

    @Override // X.InterfaceC1086350eNN
    public final void clear() {
        IPTFService iPTFService;
        Iterator<C1120260fG4> it2 = this.LLJJIJI.iterator();
        while (it2.hasNext()) {
            C1120260fG4 next = it2.next();
            it2.remove();
            AnimatorSet animatorSet = next.LJI;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
        }
        if (this.LLJJJJ) {
            C1120280fG6 c1120280fG6 = this.LLJJJ;
            int length = c1120280fG6.LIZIZ.length;
            for (int i = 0; i < length; i++) {
                c1120280fG6.LIZIZ[i] = null;
            }
            c1120280fG6.LIZJ = 0;
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
            removeAllViews();
        }
        if (!LiveInnerDowngradeAdaptExp.INSTANCE.isLikeAnimDowngrade(this.LLJJL) || (iPTFService = (IPTFService) C1161920gLG.LIZJ(IPTFService.class)) == null) {
            return;
        }
        iPTFService.ph1(EnumC1101430elh.LIVE_LIKE_ANIM_BOTTOM_DOWNGRADE);
    }

    public final int getAppearAlphaEnd() {
        return LJFF(this.LLJIJIL);
    }

    public final int getAppearAlphaStart() {
        return LJFF(this.LLJI);
    }

    public final int getDisappearAlphaEnd() {
        return LJFF(this.LLJILJILJ);
    }

    public final int getDisappearAlphaStart() {
        return LJFF(this.LLJILJIL);
    }

    public final long getIconAlphaDurationOptimization() {
        return C814420VxA.LIZJ(this.LLJJIII * this.LLJLILLLLZIIL);
    }

    public final long getTotalDurationOptimization() {
        return C814420VxA.LIZJ(this.LLJJI * this.LLJLILLLLZIIL);
    }

    @Override // X.InterfaceC1086350eNN
    public float getOthersLikeAnimationDistanceRatio() {
        return getDistanceRatio();
    }

    @Override // X.InterfaceC1086350eNN
    public float getSelfLikeAnimationDistanceRatio() {
        return getDistanceRatio();
    }

    public final int LJFF(int i) {
        if (LJI(this.LLJL.LIZLLL)) {
            return C814420VxA.LIZIZ(255 * this.LLJL.LIZLLL);
        }
        return i;
    }

    public final void setDowngradeDistanceRatio(float f) {
        if (f == this.LLJLIL) {
            return;
        }
        this.LLJLIL = f;
        Function0<Unit> function0 = this.LLJLL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void setIconAlphaDurationOptimization(long j) {
        this.LLJJIII = j;
    }

    public final void setTotalDurationOptimization(long j) {
        this.LLJJI = j;
    }

    public C1120250fG3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        this.LLJIJIL = 255;
        this.LLJILJIL = 255;
        this.LLJILLL = 1.0f;
        this.LLJJ = 1.0f;
        this.LLJJI = 2000L;
        this.LLJJIII = 300L;
        this.LLJJIJI = new ArrayList<>();
        this.LLJJIJIIJIL = new C1085650eMF<>(7);
        this.LLJJIJIL = new C1085650eMF<>(7);
        this.LLJJJ = new C1120280fG6(LiveBottomLikeViewAnimationOptSetting.viewPoolSize());
        this.LLJJJIL = LiveBottomLikeViewAnimationOptSetting.useHw();
        this.LLJJJJ = LiveBottomLikeViewAnimationOptSetting.clearCacheWhenRoomSwitch();
        this.LLJJJJJIL = LiveBottomLikeViewAnimationOptSetting.getAddViewCountWhenInit();
        this.LLJJJJLIIL = LiveLikeBitmapOptSetting.INSTANCE.enableLikeBitmapOpt();
        this.LLJJLIIIJLLLLLLLZ = 1.0f;
        this.LLJL = new C1120220fG0();
        this.LLJLIL = 1.0f;
        this.LLJLILLLLZIIL = 1.0f;
    }

    @Override // X.InterfaceC1086350eNN
    public final void LIZJ(DataChannel dataChannel, Function0<Unit> function0) {
        IPTFService iPTFService;
        setEnableFixedSize(true);
        this.LLJJL = C500260Jjc.LJIIZILJ(dataChannel);
        this.LLJJLIIIJLLLLLLLZ = C480730ItD.LIZ();
        this.LLJLL = function0;
        LiveBottomRightLikeParamsSetting liveBottomRightLikeParamsSetting = LiveBottomRightLikeParamsSetting.INSTANCE;
        float appearAlphaStart = liveBottomRightLikeParamsSetting.getAppearAlphaStart();
        if (LJI(appearAlphaStart)) {
            this.LLJI = C814420VxA.LIZIZ(255 * appearAlphaStart);
        }
        float appearAlphaEnd = liveBottomRightLikeParamsSetting.getAppearAlphaEnd();
        if (LJI(appearAlphaEnd)) {
            this.LLJIJIL = C814420VxA.LIZIZ(255 * appearAlphaEnd);
        }
        float disappearAlphaStart = liveBottomRightLikeParamsSetting.getDisappearAlphaStart();
        if (LJI(disappearAlphaStart)) {
            this.LLJILJIL = C814420VxA.LIZIZ(255 * disappearAlphaStart);
        }
        float disappearAlphaEnd = liveBottomRightLikeParamsSetting.getDisappearAlphaEnd();
        if (LJI(disappearAlphaEnd)) {
            this.LLJILJILJ = C814420VxA.LIZIZ(255 * disappearAlphaEnd);
        }
        float distanceRatio = liveBottomRightLikeParamsSetting.getDistanceRatio();
        if (LJI(distanceRatio)) {
            this.LLJILLL = distanceRatio;
        }
        float timeRatio = liveBottomRightLikeParamsSetting.getTimeRatio();
        if (LJI(timeRatio)) {
            this.LLJJ = timeRatio;
        }
        this.LLJJI = C814420VxA.LIZJ(C1120240fG2.LLJJIJIL * this.LLJJ);
        this.LLJJIII = C814420VxA.LIZJ(C1120240fG2.LLJJJ * this.LLJJ);
        int i = this.LLJJJJJIL;
        if (i > 0 && this.LLJJJ.LIZJ == 0) {
            int i2 = 0;
            do {
                C1120280fG6 c1120280fG6 = this.LLJJJ;
                ImageView imageView = new ImageView(getContext());
                int i3 = C1120240fG2.LLJJIJI;
                addView(imageView, new ViewGroup.LayoutParams(i3, i3));
                c1120280fG6.LIZ(imageView);
                i2++;
            } while (i2 < i);
        }
        if (LiveInnerDowngradeAdaptExp.INSTANCE.isLikeAnimDowngrade(this.LLJJL) && (iPTFService = (IPTFService) C1161920gLG.LIZJ(IPTFService.class)) != null) {
            iPTFService.FA2(EnumC1101430elh.LIVE_LIKE_ANIM_BOTTOM_DOWNGRADE, new InterfaceC482090IvP() { // from class: X.0fFy
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC482090IvP
                public final void LIZ(C0IS4 c0is4) {
                    if (LiveUltraLiteModeSetting.INSTANCE.getValue().getEnable()) {
                        int iIntValue = ((Number) c0is4.LIZ).intValue();
                        if (iIntValue != 0) {
                            if (iIntValue != 1) {
                                if (iIntValue != 2) {
                                    if (iIntValue == 3) {
                                        C1120250fG3 c1120250fG3 = this.LIZ;
                                        C1120220fG0 c1120220fG0 = c1120250fG3.LLJL;
                                        c1120220fG0.LIZ = true;
                                        LiveLikeAnimationDowngradeSetting liveLikeAnimationDowngradeSetting = LiveLikeAnimationDowngradeSetting.INSTANCE;
                                        c1120220fG0.LIZJ = liveLikeAnimationDowngradeSetting.getLikeAnimatorDegradeFrameInterval(c1120250fG3.LLJJLIIIJLLLLLLLZ);
                                        c1120220fG0.LIZLLL = liveLikeAnimationDowngradeSetting.getFixedAlphaRatio();
                                        c1120220fG0.LJ = liveLikeAnimationDowngradeSetting.isRemoveBottomLikeAlphaAnimator();
                                        c1120220fG0.LIZIZ = true;
                                        this.LIZ.setDowngradeDistanceRatio(liveLikeAnimationDowngradeSetting.getDistanceRatio());
                                        this.LIZ.LLJLILLLLZIIL = liveLikeAnimationDowngradeSetting.getDurationRatio();
                                        return;
                                    }
                                    return;
                                }
                                C1120250fG3 c1120250fG32 = this.LIZ;
                                C1120220fG0 c1120220fG02 = c1120250fG32.LLJL;
                                c1120220fG02.LIZ = true;
                                LiveLikeAnimationDowngradeSetting liveLikeAnimationDowngradeSetting2 = LiveLikeAnimationDowngradeSetting.INSTANCE;
                                c1120220fG02.LIZJ = liveLikeAnimationDowngradeSetting2.getLikeAnimatorDegradeFrameInterval(c1120250fG32.LLJJLIIIJLLLLLLLZ);
                                c1120220fG02.LIZLLL = liveLikeAnimationDowngradeSetting2.getFixedAlphaRatio();
                                c1120220fG02.LJ = liveLikeAnimationDowngradeSetting2.isRemoveBottomLikeAlphaAnimator();
                                c1120220fG02.LIZIZ = true;
                                this.LIZ.setDowngradeDistanceRatio(liveLikeAnimationDowngradeSetting2.getDistanceRatio());
                                this.LIZ.LLJLILLLLZIIL = liveLikeAnimationDowngradeSetting2.getDurationRatio();
                                return;
                            }
                            C1120250fG3 c1120250fG33 = this.LIZ;
                            C1120220fG0 c1120220fG03 = c1120250fG33.LLJL;
                            c1120220fG03.LIZ = true;
                            LiveLikeAnimationDowngradeSetting liveLikeAnimationDowngradeSetting3 = LiveLikeAnimationDowngradeSetting.INSTANCE;
                            c1120220fG03.LIZJ = liveLikeAnimationDowngradeSetting3.getLikeAnimatorDegradeFrameInterval(c1120250fG33.LLJJLIIIJLLLLLLLZ);
                            c1120220fG03.LIZLLL = liveLikeAnimationDowngradeSetting3.getFixedAlphaRatio();
                            c1120220fG03.LJ = liveLikeAnimationDowngradeSetting3.isRemoveBottomLikeAlphaAnimator();
                            c1120220fG03.LIZIZ = false;
                            this.LIZ.setDowngradeDistanceRatio(liveLikeAnimationDowngradeSetting3.getDistanceRatio());
                            this.LIZ.LLJLILLLLZIIL = liveLikeAnimationDowngradeSetting3.getDurationRatio();
                            return;
                        }
                        C1120250fG3 c1120250fG34 = this.LIZ;
                        C1120220fG0 c1120220fG04 = c1120250fG34.LLJL;
                        c1120220fG04.LIZ = false;
                        c1120220fG04.LIZJ = 1;
                        c1120220fG04.LIZLLL = -1.0f;
                        c1120220fG04.LIZIZ = false;
                        c1120220fG04.LJ = false;
                        c1120250fG34.setDowngradeDistanceRatio(1.0f);
                        this.LIZ.LLJLILLLLZIIL = 1.0f;
                        return;
                    }
                    int iIntValue2 = ((Number) c0is4.LIZ).intValue();
                    if (iIntValue2 != 0) {
                        if (iIntValue2 != 1) {
                            if (iIntValue2 != 2) {
                                return;
                            }
                            C1120250fG3 c1120250fG35 = this.LIZ;
                            C1120220fG0 c1120220fG05 = c1120250fG35.LLJL;
                            c1120220fG05.LIZ = true;
                            LiveLikeAnimationDowngradeSetting liveLikeAnimationDowngradeSetting4 = LiveLikeAnimationDowngradeSetting.INSTANCE;
                            c1120220fG05.LIZJ = liveLikeAnimationDowngradeSetting4.getLikeAnimatorDegradeFrameInterval(c1120250fG35.LLJJLIIIJLLLLLLLZ);
                            c1120220fG05.LIZLLL = liveLikeAnimationDowngradeSetting4.getFixedAlphaRatio();
                            c1120220fG05.LJ = liveLikeAnimationDowngradeSetting4.isRemoveBottomLikeAlphaAnimator();
                            c1120220fG05.LIZIZ = liveLikeAnimationDowngradeSetting4.isRemoveBottomLikeAnimator();
                            this.LIZ.setDowngradeDistanceRatio(liveLikeAnimationDowngradeSetting4.getDistanceRatio());
                            this.LIZ.LLJLILLLLZIIL = liveLikeAnimationDowngradeSetting4.getDurationRatio();
                            return;
                        }
                        C1120250fG3 c1120250fG36 = this.LIZ;
                        C1120220fG0 c1120220fG06 = c1120250fG36.LLJL;
                        c1120220fG06.LIZ = true;
                        LiveLikeAnimationDowngradeSetting liveLikeAnimationDowngradeSetting5 = LiveLikeAnimationDowngradeSetting.INSTANCE;
                        c1120220fG06.LIZJ = liveLikeAnimationDowngradeSetting5.getLikeAnimatorDegradeFrameInterval(c1120250fG36.LLJJLIIIJLLLLLLLZ);
                        c1120220fG06.LIZLLL = liveLikeAnimationDowngradeSetting5.getFixedAlphaRatio();
                        c1120220fG06.LJ = liveLikeAnimationDowngradeSetting5.isRemoveBottomLikeAlphaAnimator();
                        c1120220fG06.LIZIZ = false;
                        this.LIZ.setDowngradeDistanceRatio(liveLikeAnimationDowngradeSetting5.getDistanceRatio());
                        this.LIZ.LLJLILLLLZIIL = liveLikeAnimationDowngradeSetting5.getDurationRatio();
                        return;
                    }
                    C1120250fG3 c1120250fG37 = this.LIZ;
                    C1120220fG0 c1120220fG07 = c1120250fG37.LLJL;
                    c1120220fG07.LIZ = false;
                    c1120220fG07.LIZJ = 1;
                    c1120220fG07.LIZLLL = -1.0f;
                    c1120220fG07.LIZIZ = false;
                    c1120220fG07.LJ = false;
                    c1120250fG37.setDowngradeDistanceRatio(1.0f);
                    this.LIZ.LLJLILLLLZIIL = 1.0f;
                }
            });
        }
        if (this.LLJJL) {
            C2252331DDr c2252331DDr = C775900Uc8.LIZ;
            C775900Uc8.LJI(EnumC776070UcP.LIKE_RATE_INTERVAL_INCREASE, new AwS631S0100000_17(this, 21));
        }
    }

    @Override // X.InterfaceC1086350eNN
    public final void LIZIZ(Bitmap bitmap, PointF pointF, PointF pointF2, PointF pointF3) {
        C1120220fG0 c1120220fG0 = this.LLJL;
        if (c1120220fG0.LIZIZ) {
            return;
        }
        this.LLJJIJI.add(new C1120260fG4(this, bitmap, pointF, pointF2, pointF3, c1120220fG0.LIZ));
    }
}
