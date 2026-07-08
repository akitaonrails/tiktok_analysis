package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import com.bytedance.android.livesdk.livesetting.other.LiveLikeAnimationDowngradeSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.LiveInnerDowngradeAdaptExp;
import com.bytedance.android.performanhtune.IPTFService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fG2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1120240fG2 extends C1091840eWE implements InterfaceC1086350eNN {
    public static final int LLJJIJI = (int) C497740JfY.LIZIZ(36.0f);
    public static final int LLJJIJIIJIL = (int) C497740JfY.LIZIZ(28.0f);
    public static final long LLJJIJIL = 2000;
    public static final long LLJJJ = 300;
    public final int LLILLL;
    public final int LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public long LLIZ;
    public long LLIZLLLIL;
    public boolean LLJ;
    public float LLJI;
    public final C1120230fG1 LLJIJIL;
    public Function0<Unit> LLJILJIL;
    public final Paint LLJILJILJ;
    public final Paint LLJILLL;
    public final ArrayList<C1120270fG5> LLJJ;
    public final C1085650eMF<C1120290fG7> LLJJI;
    public final C1085650eMF<C1120290fG7> LLJJIII;

    public final int getAppearAlphaStart() {
        return LIZ(0);
    }

    @Override // X.InterfaceC1086350eNN
    public final void clear() {
        IPTFService iPTFService;
        Iterator<C1120270fG5> it2 = this.LLJJ.iterator();
        while (it2.hasNext()) {
            C1120270fG5 next = it2.next();
            it2.remove();
            next.LJIIIZ.cancel();
        }
        if (!LiveInnerDowngradeAdaptExp.INSTANCE.isLikeAnimDowngrade(this.LLJ) || (iPTFService = (IPTFService) C1161920gLG.LIZJ(IPTFService.class)) == null) {
            return;
        }
        iPTFService.ph1(EnumC1101430elh.LIVE_LIKE_ANIM_BOTTOM_DOWNGRADE);
    }

    public final int getAppearAlphaEnd() {
        return LIZ(this.LLILLL);
    }

    public final int getDisAppearAlphaStart() {
        return LIZ(this.LLILZ);
    }

    public final long getIconAlphaDurationOptimization() {
        return C814420VxA.LIZJ(this.LLIZLLLIL * this.LLILZLL);
    }

    public final long getTotalDurationOptimization() {
        return C814420VxA.LIZJ(this.LLIZ * this.LLILZLL);
    }

    @Override // X.InterfaceC1086350eNN
    public float getOthersLikeAnimationDistanceRatio() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1086350eNN
    public float getSelfLikeAnimationDistanceRatio() {
        return this.LLILZIL;
    }

    public final int LIZ(int i) {
        float f = this.LLJIJIL.LIZLLL;
        if (0.0f <= f && f <= 1.0f) {
            return C814420VxA.LIZIZ(255 * f);
        }
        return i;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.LLJJ.size() <= 0) {
            return;
        }
        for (C1120270fG5 c1120270fG5 : this.LLJJ) {
            if (c1120270fG5.LIZLLL.width() > 0.0f) {
                this.LLJILJILJ.setAlpha(c1120270fG5.LJII);
                Bitmap bitmap = c1120270fG5.LIZ;
                if (bitmap != null && !bitmap.isRecycled()) {
                    canvas.drawBitmap(c1120270fG5.LIZ, (Rect) null, c1120270fG5.LIZLLL, this.LLJILJILJ);
                }
            }
            if (c1120270fG5.LJ.width() > 0.0f) {
                this.LLJILJILJ.setAlpha(c1120270fG5.LJIIIIZZ);
                if (!c1120270fG5.LIZIZ.isRecycled()) {
                    canvas.drawBitmap(c1120270fG5.LIZIZ, (Rect) null, c1120270fG5.LJ, this.LLJILJILJ);
                }
            }
        }
    }

    public final void setDistanceRatio(float f) {
        if (f == this.LLILZIL) {
            return;
        }
        this.LLILZIL = f;
        Function0<Unit> function0 = this.LLJILJIL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void setIconAlphaDurationOptimization(long j) {
        this.LLIZLLLIL = j;
    }

    public final void setTotalDurationOptimization(long j) {
        this.LLIZ = j;
    }

    public C1120240fG2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLL = 255;
        this.LLILZ = 255;
        this.LLILZIL = 1.0f;
        this.LLILZLL = 1.0f;
        this.LLIZ = LLJJIJIL;
        this.LLIZLLLIL = LLJJJ;
        this.LLJI = 1.0f;
        this.LLJIJIL = new C1120230fG1();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.LLJILJILJ = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.LLJILLL = paint2;
        this.LLJJ = new ArrayList<>();
        this.LLJJI = new C1085650eMF<>(7);
        this.LLJJIII = new C1085650eMF<>(7);
    }

    @Override // X.InterfaceC1086350eNN
    public final void LIZJ(DataChannel dataChannel, Function0<Unit> function0) {
        IPTFService iPTFService;
        this.LLJ = C500260Jjc.LJIIZILJ(dataChannel);
        this.LLJI = C480730ItD.LIZ();
        this.LLJILJIL = function0;
        if (LiveInnerDowngradeAdaptExp.INSTANCE.isLikeAnimDowngrade(this.LLJ) && (iPTFService = (IPTFService) C1161920gLG.LIZJ(IPTFService.class)) != null) {
            iPTFService.FA2(EnumC1101430elh.LIVE_LIKE_ANIM_BOTTOM_DOWNGRADE, new InterfaceC482090IvP() { // from class: X.0fFz
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC482090IvP
                public final void LIZ(C0IS4 c0is4) {
                    int iIntValue = ((Number) c0is4.LIZ).intValue();
                    if (iIntValue != 0) {
                        if (iIntValue != 1) {
                            if (iIntValue == 2) {
                                C1120240fG2 c1120240fG2 = this.LIZ;
                                C1120230fG1 c1120230fG1 = c1120240fG2.LLJIJIL;
                                c1120230fG1.LIZ = true;
                                LiveLikeAnimationDowngradeSetting liveLikeAnimationDowngradeSetting = LiveLikeAnimationDowngradeSetting.INSTANCE;
                                c1120230fG1.LIZJ = liveLikeAnimationDowngradeSetting.getLikeAnimatorDegradeFrameInterval(c1120240fG2.LLJI);
                                c1120230fG1.LIZLLL = liveLikeAnimationDowngradeSetting.getFixedAlphaRatio();
                                c1120230fG1.LJ = liveLikeAnimationDowngradeSetting.isRemoveBottomLikeAlphaAnimator();
                                c1120230fG1.LIZIZ = liveLikeAnimationDowngradeSetting.isRemoveBottomLikeAnimator();
                                this.LIZ.setDistanceRatio(liveLikeAnimationDowngradeSetting.getDistanceRatio());
                                this.LIZ.LLILZLL = liveLikeAnimationDowngradeSetting.getDurationRatio();
                                return;
                            }
                            return;
                        }
                        C1120240fG2 c1120240fG22 = this.LIZ;
                        C1120230fG1 c1120230fG12 = c1120240fG22.LLJIJIL;
                        c1120230fG12.LIZ = true;
                        LiveLikeAnimationDowngradeSetting liveLikeAnimationDowngradeSetting2 = LiveLikeAnimationDowngradeSetting.INSTANCE;
                        c1120230fG12.LIZJ = liveLikeAnimationDowngradeSetting2.getLikeAnimatorDegradeFrameInterval(c1120240fG22.LLJI);
                        c1120230fG12.LIZLLL = liveLikeAnimationDowngradeSetting2.getFixedAlphaRatio();
                        c1120230fG12.LJ = liveLikeAnimationDowngradeSetting2.isRemoveBottomLikeAlphaAnimator();
                        c1120230fG12.LIZIZ = false;
                        this.LIZ.setDistanceRatio(liveLikeAnimationDowngradeSetting2.getDistanceRatio());
                        this.LIZ.LLILZLL = liveLikeAnimationDowngradeSetting2.getDurationRatio();
                        return;
                    }
                    C1120240fG2 c1120240fG23 = this.LIZ;
                    C1120230fG1 c1120230fG13 = c1120240fG23.LLJIJIL;
                    c1120230fG13.LIZ = false;
                    c1120230fG13.LIZJ = 1;
                    c1120230fG13.LIZLLL = -1.0f;
                    c1120230fG13.LIZIZ = false;
                    c1120230fG13.LJ = false;
                    c1120240fG23.setDistanceRatio(1.0f);
                    this.LIZ.LLILZLL = 1.0f;
                }
            });
        }
    }

    @Override // X.InterfaceC1086350eNN
    public final void LIZIZ(Bitmap bitmap, PointF pointF, PointF pointF2, PointF pointF3) {
        C1120230fG1 c1120230fG1 = this.LLJIJIL;
        if (c1120230fG1.LIZIZ) {
            return;
        }
        this.LLJJ.add(new C1120270fG5(this, bitmap, pointF, pointF2, pointF3, c1120230fG1.LIZ));
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.LLJILLL.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, (getHeight() * 2) / 3, 0, -256, Shader.TileMode.CLAMP));
    }
}
