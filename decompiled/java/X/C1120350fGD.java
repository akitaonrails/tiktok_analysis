package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.other.LiveLikeAnimationDowngradeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveTapLikeViewAnimationOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveTapAnimationAlphaSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.LiveInnerDowngradeAdaptExp;
import com.bytedance.android.performanhtune.IPTFService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: X.0fGD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1120350fGD extends FrameLayout implements InterfaceC1086450eNX {
    public static final int LLJILJIL = (int) C497740JfY.LIZIZ(42.0f);
    public DataChannel LL;
    public final ConcurrentLinkedQueue<C1120390fGH> LLILLJJLI;
    public final ConcurrentLinkedQueue<C1120370fGF> LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final C1120280fG6 LLILZLL;
    public final boolean LLIZ;
    public final boolean LLIZLLLIL;
    public final int LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // X.InterfaceC1086450eNX
    public final void clear() {
        Iterator<C1120390fGH> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ.cancel();
            it2.remove();
        }
        Iterator<C1120370fGF> it3 = this.LLILLL.iterator();
        while (it3.hasNext()) {
            it3.next().LIZIZ.cancel();
            it3.remove();
        }
        this.LL = null;
        if (this.LLIZLLLIL) {
            C1120280fG6 c1120280fG6 = this.LLILZLL;
            int length = c1120280fG6.LIZIZ.length;
            for (int i = 0; i < length; i++) {
                c1120280fG6.LIZIZ[i] = null;
            }
            c1120280fG6.LIZJ = 0;
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
            removeAllViews();
        }
        if (LiveInnerDowngradeAdaptExp.INSTANCE.isLikeAnimDowngrade(this.LLJIJIL)) {
            ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).ph1(EnumC1101430elh.LIVE_LIKE_ANIM_TAP_DOWNGRADE);
        }
    }

    @Override // X.InterfaceC1086450eNX
    public final void LIZJ(boolean z) {
        IPTFService iPTFService;
        this.LLJIJIL = z;
        int i = this.LLJ;
        if (i > 0 && this.LLILZLL.LIZJ == 0) {
            int i2 = 0;
            do {
                C1120280fG6 c1120280fG6 = this.LLILZLL;
                ImageView imageView = new ImageView(getContext());
                int i3 = LLJILJIL;
                addView(imageView, new ViewGroup.LayoutParams(i3, i3));
                imageView.layout(0, 0, i3, i3);
                c1120280fG6.LIZ(imageView);
                i2++;
            } while (i2 < i);
        }
        if (LiveInnerDowngradeAdaptExp.INSTANCE.isLikeAnimDowngrade(z) && (iPTFService = (IPTFService) C1161920gLG.LIZJ(IPTFService.class)) != null) {
            iPTFService.FA2(EnumC1101430elh.LIVE_LIKE_ANIM_TAP_DOWNGRADE, new InterfaceC482090IvP() { // from class: X.0eQF
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC482090IvP
                public final void LIZ(C0IS4 c0is4) {
                    if (((Number) c0is4.LIZ).intValue() != 0) {
                        this.LIZ.LLJI = LiveLikeAnimationDowngradeSetting.INSTANCE.isRemoveTapLikeToHeadAnimator();
                    } else {
                        this.LIZ.LLJI = false;
                    }
                }
            });
        }
    }

    @Override // X.InterfaceC1086450eNX
    public void setDataChannel(DataChannel dataChannel) {
        this.LL = dataChannel;
    }

    public C1120350fGD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLJJLI = new ConcurrentLinkedQueue<>();
        this.LLILLL = new ConcurrentLinkedQueue<>();
        this.LLILZ = 255;
        this.LLILZLL = new C1120280fG6(LiveTapLikeViewAnimationOptSetting.viewPoolSize());
        this.LLIZ = LiveTapLikeViewAnimationOptSetting.useHw();
        this.LLIZLLLIL = LiveTapLikeViewAnimationOptSetting.clearCacheWhenRoomSwitch();
        this.LLJ = LiveTapLikeViewAnimationOptSetting.getAddViewCountWhenInit();
        LiveTapAnimationAlphaSetting liveTapAnimationAlphaSetting = LiveTapAnimationAlphaSetting.INSTANCE;
        float f = liveTapAnimationAlphaSetting.getValue().diggTapStartAlpha;
        if (0.0f <= f && f <= 1.0f) {
            this.LLILZ = C814420VxA.LIZIZ(255 * f);
        }
        float f2 = liveTapAnimationAlphaSetting.getValue().diggTapEndAlpha;
        if (0.0f <= f2 && f2 <= 1.0f) {
            this.LLILZIL = C814420VxA.LIZIZ(255 * f2);
        }
    }

    @Override // X.InterfaceC1086450eNX
    public final void LIZ(PointF pointF, Bitmap bitmap) {
        C1120370fGF c1120370fGF = new C1120370fGF(this, bitmap, pointF);
        this.LLILLL.add(c1120370fGF);
        c1120370fGF.LIZIZ.start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // X.InterfaceC1086450eNX
    public final void LIZIZ(Bitmap bitmap, PointF pointF, PointF pointF2, boolean z) {
        C1120390fGH c1120390fGH = new C1120390fGH(this, bitmap, pointF, pointF2, z);
        this.LLILLJJLI.add(c1120390fGH);
        c1120390fGH.LIZJ.start();
    }
}
