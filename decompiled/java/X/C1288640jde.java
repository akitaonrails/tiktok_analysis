package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import com.lynx.animax.AnimaXPlayer;
import com.lynx.animax.ability.BaseAbility;
import com.lynx.animax.base.bridge.JavaOnlyMap;
import com.lynx.animax.composition.AnimaXComposition;
import com.lynx.animax.drawable.AnimaXSurfaceDrawable;
import com.lynx.animax.drawable.BitmapBuffer;
import com.lynx.animax.drawable.BitmapBufferGroup;
import com.lynx.animax.property.AnimaXKeyPath;
import com.lynx.animax.property.AnimaXValueParam;
import com.lynx.animax.ui.AnimaXContext;
import com.lynx.animax.util.AnimaXLog;
import com.lynx.animax.util.AnimaXMetricsCallback;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0jde, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1288640jde extends View implements InterfaceC1288690jdj, InterfaceC1288900je4 {
    public final BitmapBufferGroup LL;
    public final Paint LLILLJJLI;
    public AnimaXSurfaceDrawable LLILLL;
    public final AnimaXPlayer LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public BitmapBuffer LLIZ;

    @Override // X.InterfaceC1288690jdj
    public final /* synthetic */ void LJI(MotionEvent motionEvent) {
        C1288670jdh.LIZ(this, motionEvent);
    }

    @Override // X.InterfaceC1288130jcp
    public final void LIZ() {
        if (this.LLILLL == null && this.LLILZLL) {
            this.LLILZ.LLIZLLLIL = true;
            AnimaXLog.LIZIZ("AnimaXImageView", "The Surface has not been created yet; Creating a temporary one.");
            onSizeChanged(1, 1, 0, 0);
        }
    }

    public Bitmap getCurrentBitmap() {
        BitmapBuffer bitmapBuffer = this.LLIZ;
        if (bitmapBuffer != null) {
            return bitmapBuffer.getBitmap();
        }
        return null;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        if (this.LLILZLL) {
            return;
        }
        super.onAttachedToWindow();
        this.LLILZ.LJIIZILJ(true, EnumC1288660jdg.ATTACH);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (this.LLILZLL) {
            return;
        }
        super.onDetachedFromWindow();
        this.LLILZ.LJIIZILJ(false, EnumC1288660jdg.ATTACH);
    }

    @Override // X.InterfaceC1288650jdf
    public final void cancel() {
        getPlayer().cancel();
    }

    @Override // X.InterfaceC1288650jdf
    public AnimaXContext getAnimaXContext() {
        return getPlayer().getAnimaXContext();
    }

    @Override // X.InterfaceC1288650jdf
    public AnimaXComposition getComposition() {
        return getPlayer().getComposition();
    }

    @Override // X.InterfaceC1288650jdf
    public double getCurrentFrame() {
        return getPlayer().getCurrentFrame();
    }

    @Override // X.InterfaceC1288650jdf
    public double getDurationMs() {
        return getPlayer().getDurationMs();
    }

    @Override // X.InterfaceC1288650jdf
    public final boolean oi() {
        return getPlayer().oi();
    }

    @Override // X.InterfaceC1288650jdf
    public final void pause() {
        getPlayer().pause();
    }

    @Override // X.InterfaceC1288650jdf
    public final void play() {
        getPlayer().play();
    }

    @Override // X.InterfaceC1288690jdj
    public final void release() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("release: ");
        sbLIZ.append(this);
        AnimaXLog.LIZIZ("AnimaXImageView", C2188811AlT.LIZIZ(sbLIZ));
        BitmapBuffer bitmapBuffer = this.LLIZ;
        if (bitmapBuffer != null) {
            bitmapBuffer.LIZ();
        }
        this.LL.LIZ();
        this.LLILZ.LJIIL();
    }

    @Override // X.InterfaceC1288650jdf
    public final void resume() {
        getPlayer().resume();
    }

    @Override // X.InterfaceC1288650jdf
    public final void stop() {
        getPlayer().stop();
    }

    @Override // X.InterfaceC1288690jdj, X.InterfaceC1288900je4
    public InterfaceC1288650jdf getPlayer() {
        return this.LLILZ;
    }

    public C1288640jde(AnimaXPlayer animaXPlayer) {
        super(animaXPlayer.LLILLL.LIZIZ);
        this.LLILZIL = false;
        this.LLILZLL = false;
        this.LLILZ = animaXPlayer;
        this.LLILLJJLI = new Paint(6);
        animaXPlayer.LLIZ = true;
        this.LL = new BitmapBufferGroup(this);
        AnimaXContext animaXContext = animaXPlayer.LLILLL;
        if (animaXContext != null && animaXContext.getAbility() != null) {
            BaseAbility ability = animaXContext.getAbility();
            ability.getClass();
            ability.LIZIZ = new WeakReference<>(this);
            animaXContext.getAbility().LJFF = true;
            return;
        }
        AnimaXLog.LIZ("AnimaXImageView", "initView fail, missing AnimaXContext or Ability.");
    }

    @Override // X.InterfaceC1288650jdf
    public final void LIZLLL(InterfaceC1288110jcn interfaceC1288110jcn) {
        getPlayer().LIZLLL(interfaceC1288110jcn);
    }

    @Override // X.InterfaceC1288650jdf
    public final void LJ(int i) {
        getPlayer().LJ(0);
    }

    @Override // X.InterfaceC1288650jdf
    public final void LJFF(AnimaXMetricsCallback animaXMetricsCallback) {
        getPlayer().LJFF(animaXMetricsCallback);
    }

    @Override // X.InterfaceC1288650jdf
    public final void LJIIIIZZ(InterfaceC1288110jcn interfaceC1288110jcn) {
        getPlayer().LJIIIIZZ(interfaceC1288110jcn);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LLIZ == null) {
            this.LLIZ = this.LL.LIZJ(null);
        }
        BitmapBuffer bitmapBuffer = this.LLIZ;
        if (bitmapBuffer == null) {
            return;
        }
        if (bitmapBuffer.LIZJ.get() != EnumC1288850jdz.Ready) {
            this.LLIZ.LIZ();
            this.LLIZ = null;
            return;
        }
        Bitmap bitmap = this.LLIZ.getBitmap();
        if (bitmap != null && !bitmap.isRecycled()) {
            int iSave = canvas.save();
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.LLILLJJLI);
            canvas.restoreToCount(iSave);
            C786410Ut5.v2().postFrameCallback(new ChoreographerFrameCallbackC1339260kxI(this, 6));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLILZIL) {
            C1288670jdh.LIZ(this, motionEvent);
        }
        if (motionEvent != null) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        if (this.LLILZLL) {
            return;
        }
        this.LLILZ.LJIIZILJ(z, EnumC1288660jdg.AGGREGATED);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        boolean z;
        super.setAlpha(f);
        boolean z2 = true;
        if (getAlpha() > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (f <= 0.0f) {
            z2 = false;
        }
        if (z != z2) {
            this.LLILZ.LJIIZILJ(z2, EnumC1288660jdg.OPACITY);
        }
    }

    @Override // X.InterfaceC1288650jdf
    public void setAntiAliasing(boolean z) {
        getPlayer().setAntiAliasing(z);
    }

    @Override // X.InterfaceC1288650jdf
    public void setAutoPlay(boolean z) {
        getPlayer().setAutoPlay(z);
    }

    @Override // X.InterfaceC1288650jdf
    public void setAutoReverse(boolean z) {
        getPlayer().setAutoReverse(z);
    }

    @Override // X.InterfaceC1288650jdf
    public void setComposition(AnimaXComposition animaXComposition) {
        getPlayer().setComposition(animaXComposition);
    }

    @Override // X.InterfaceC1288650jdf
    public void setDynamicResource(boolean z) {
        getPlayer().setDynamicResource(z);
    }

    @Override // X.InterfaceC1288650jdf
    public void setEnableAudio(boolean z) {
        getPlayer().setEnableAudio(z);
    }

    @Override // X.InterfaceC1288690jdj
    public void setEnableTapLayerEvent(boolean z) {
        this.LLILZIL = z;
    }

    @Override // X.InterfaceC1288650jdf
    public void setEndFrame(int i) {
        getPlayer().setEndFrame(i);
    }

    @Override // X.InterfaceC1288650jdf
    public void setFpsEventInterval(long j) {
        getPlayer().setFpsEventInterval(j);
    }

    @Override // X.InterfaceC1288690jdj
    public void setIgnoreAttachStatus(boolean z) {
        this.LLILZLL = z;
    }

    @Override // X.InterfaceC1288650jdf
    public void setImageFolder(String str) {
        if (str != null && !str.isEmpty()) {
            getPlayer().setImageFolder(str);
        }
    }

    @Override // X.InterfaceC1288650jdf
    public void setJson(String str) {
        getPlayer().setJson(str);
    }

    @Override // X.InterfaceC1288650jdf
    public void setKeepLastFrame(boolean z) {
        getPlayer().setKeepLastFrame(z);
    }

    @Override // X.InterfaceC1288650jdf
    public void setLoop(boolean z) {
        getPlayer().setLoop(z);
    }

    @Override // X.InterfaceC1288650jdf
    public void setLoopCount(int i) {
        getPlayer().setLoopCount(i);
    }

    @Override // X.InterfaceC1288650jdf
    public void setMaxFrameRate(double d) {
        getPlayer().setMaxFrameRate(d);
    }

    @Override // X.InterfaceC1288650jdf
    public void setMuted(boolean z) {
        getPlayer().setMuted(z);
    }

    @Override // X.InterfaceC1288650jdf
    public void setObjectFit(EnumC1311910kFB enumC1311910kFB) {
        getPlayer().setObjectFit(enumC1311910kFB);
    }

    @Override // X.InterfaceC1288650jdf
    public void setObjectPosition(EnumC1297350jrh enumC1297350jrh) {
        getPlayer().setObjectPosition(enumC1297350jrh);
    }

    @Override // X.InterfaceC1288650jdf
    public void setProgress(float f) {
        getPlayer().setProgress(f);
    }

    @Override // X.InterfaceC1288650jdf
    public void setSpeed(float f) {
        getPlayer().setSpeed(f);
    }

    @Override // X.InterfaceC1288650jdf
    public void setSrc(String str) {
        getPlayer().setSrc(str);
    }

    @Override // X.InterfaceC1288650jdf
    public void setSrcPolyfill(JavaOnlyMap javaOnlyMap) {
        getPlayer().setSrcPolyfill(javaOnlyMap);
    }

    @Override // X.InterfaceC1288650jdf
    public void setStartFrame(int i) {
        getPlayer().setStartFrame(i);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        AnimaXPlayer animaXPlayer = this.LLILZ;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        animaXPlayer.LJIIZILJ(z, EnumC1288660jdg.VISIBLE);
    }

    @Override // X.InterfaceC1288650jdf
    public final void LIZJ(int[] iArr, boolean z) {
        getPlayer().LIZJ(iArr, z);
    }

    @Override // X.InterfaceC1288650jdf
    public final void LJII(float f, float f2) {
        getPlayer().LJII(f, f2);
    }

    @Override // X.InterfaceC1288650jdf
    public final void LJIIJ(int i, int i2) {
        getPlayer().LJIIJ(i, i2);
    }

    @Override // X.InterfaceC1288650jdf
    public final void LIZIZ(EnumC1288440jdK enumC1288440jdK, String str, AnimaXValueParam animaXValueParam) {
        getPlayer().LIZIZ(enumC1288440jdK, str, animaXValueParam);
    }

    @Override // X.InterfaceC1288650jdf
    public final void LJIIIZ(EnumC1288880je2 enumC1288880je2, AnimaXKeyPath animaXKeyPath, AnimaXValueParam animaXValueParam) {
        getPlayer().LJIIIZ(enumC1288880je2, animaXKeyPath, animaXValueParam);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        boolean z;
        super.onSizeChanged(i, i2, i3, i4);
        AnimaXPlayer animaXPlayer = this.LLILZ;
        if (i > 0 && i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        animaXPlayer.LJIIZILJ(z, EnumC1288660jdg.SIZE);
        if (i > 0 && i2 > 0) {
            BitmapBuffer bitmapBuffer = this.LLIZ;
            if (bitmapBuffer != null) {
                bitmapBuffer.LIZ();
                this.LLIZ = null;
            }
            AnimaXSurfaceDrawable animaXSurfaceDrawable = this.LLILLL;
            if (animaXSurfaceDrawable == null) {
                AnimaXSurfaceDrawable animaXSurfaceDrawable2 = new AnimaXSurfaceDrawable(null, null, this.LL, i, i2);
                this.LLILLL = animaXSurfaceDrawable2;
                this.LLILZ.LJI(animaXSurfaceDrawable2);
                return;
            } else {
                if (animaXSurfaceDrawable.LIZ(i, i2)) {
                    this.LLILZ.LJIILLIIL(this.LLILLL);
                    return;
                }
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Skip invalid size: ");
        sbLIZ.append(i);
        sbLIZ.append(" / ");
        sbLIZ.append(i2);
        AnimaXLog.LIZIZ("AnimaXImageView", C2188811AlT.LIZIZ(sbLIZ));
    }
}
