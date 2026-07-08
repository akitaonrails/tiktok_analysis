package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.other.LiveLikeAnimationDowngradeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveTapAnimationAlphaSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.LiveInnerDowngradeAdaptExp;
import com.bytedance.android.performanhtune.IPTFService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: X.0fGE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1120360fGE extends View implements InterfaceC1086450eNX {
    public static final int LLJ = (int) C497740JfY.LIZIZ(42.0f);
    public DataChannel LL;
    public final Paint LLILLJJLI;
    public final ConcurrentLinkedQueue<C1120420fGK> LLILLL;
    public final ConcurrentLinkedQueue<C1120380fGG> LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;

    @Override // X.InterfaceC1086450eNX
    public final void clear() {
        Iterator<C1120420fGK> it2 = this.LLILLL.iterator();
        while (it2.hasNext()) {
            it2.next().LJFF.cancel();
            it2.remove();
        }
        Iterator<C1120380fGG> it3 = this.LLILZ.iterator();
        while (it3.hasNext()) {
            it3.next().LIZLLL.cancel();
            it3.remove();
        }
        this.LL = null;
        if (LiveInnerDowngradeAdaptExp.INSTANCE.isLikeAnimDowngrade(this.LLIZLLLIL)) {
            ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).ph1(EnumC1101430elh.LIVE_LIKE_ANIM_TAP_DOWNGRADE);
        }
    }

    @Override // X.InterfaceC1086450eNX
    public final void LIZJ(boolean z) {
        IPTFService iPTFService;
        this.LLIZLLLIL = z;
        if (LiveInnerDowngradeAdaptExp.INSTANCE.isLikeAnimDowngrade(z) && (iPTFService = (IPTFService) C1161920gLG.LIZJ(IPTFService.class)) != null) {
            iPTFService.FA2(EnumC1101430elh.LIVE_LIKE_ANIM_TAP_DOWNGRADE, new InterfaceC482090IvP() { // from class: X.0ePt
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC482090IvP
                public final void LIZ(C0IS4 c0is4) {
                    if (((Number) c0is4.LIZ).intValue() != 0) {
                        this.LIZ.LLIZ = LiveLikeAnimationDowngradeSetting.INSTANCE.isRemoveTapLikeToHeadAnimator();
                    } else {
                        this.LIZ.LLIZ = false;
                    }
                }
            });
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        for (C1120420fGK c1120420fGK : this.LLILLL) {
            if (!c1120420fGK.LIZ.isRecycled()) {
                canvas.save();
                this.LLILLJJLI.setAlpha(c1120420fGK.LIZJ);
                float f = c1120420fGK.LIZLLL;
                if (f != 0.0f) {
                    canvas.rotate(f, c1120420fGK.LIZIZ.centerX(), c1120420fGK.LIZIZ.centerY());
                }
                canvas.drawBitmap(c1120420fGK.LIZ, (Rect) null, c1120420fGK.LIZIZ, this.LLILLJJLI);
                canvas.restore();
            }
        }
        for (C1120380fGG c1120380fGG : this.LLILZ) {
            if (!c1120380fGG.LIZ.isRecycled()) {
                this.LLILLJJLI.setAlpha(c1120380fGG.LIZIZ);
                canvas.drawBitmap(c1120380fGG.LIZ, (Rect) null, c1120380fGG.LIZJ, this.LLILLJJLI);
            }
        }
    }

    @Override // X.InterfaceC1086450eNX
    public void setDataChannel(DataChannel dataChannel) {
        this.LL = dataChannel;
    }

    public C1120360fGE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLJJLI = new Paint(1);
        this.LLILLL = new ConcurrentLinkedQueue<>();
        this.LLILZ = new ConcurrentLinkedQueue<>();
        this.LLILZIL = 255;
        LiveTapAnimationAlphaSetting liveTapAnimationAlphaSetting = LiveTapAnimationAlphaSetting.INSTANCE;
        float f = liveTapAnimationAlphaSetting.getValue().diggTapStartAlpha;
        if (0.0f <= f && f <= 1.0f) {
            this.LLILZIL = C814420VxA.LIZIZ(255 * f);
        }
        float f2 = liveTapAnimationAlphaSetting.getValue().diggTapEndAlpha;
        if (0.0f <= f2 && f2 <= 1.0f) {
            this.LLILZLL = C814420VxA.LIZIZ(255 * f2);
        }
    }

    @Override // X.InterfaceC1086450eNX
    public final void LIZ(PointF pointF, Bitmap bitmap) {
        C1120380fGG c1120380fGG = new C1120380fGG(this, bitmap, pointF);
        this.LLILZ.add(c1120380fGG);
        c1120380fGG.LIZLLL.start();
    }

    @Override // X.InterfaceC1086450eNX
    public final void LIZIZ(Bitmap bitmap, PointF pointF, PointF pointF2, boolean z) {
        C1120420fGK c1120420fGK = new C1120420fGK(this, bitmap, pointF, pointF2, z);
        this.LLILLL.add(c1120420fGK);
        c1120420fGK.LJFF.start();
    }
}
