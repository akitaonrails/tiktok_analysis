package X;

import Y.ARunnableS113S0100000_13;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.TypedArray;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.animax.AnimaXPlayer;
import com.lynx.animax.ability.BaseAbility;
import com.lynx.animax.base.bridge.JavaOnlyMap;
import com.lynx.animax.composition.AnimaXComposition;
import com.lynx.animax.drawable.AnimaXSurfaceDrawable;
import com.lynx.animax.drawable.FirstFrameAwareSurfaceTexture;
import com.lynx.animax.property.AnimaXKeyPath;
import com.lynx.animax.property.AnimaXValueParam;
import com.lynx.animax.ui.AnimaXContext;
import com.lynx.animax.util.AnimaXLog;
import com.lynx.animax.util.AnimaXMetricsCallback;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0jdd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class TextureViewSurfaceTextureListenerC1288630jdd extends TextureView implements TextureView.SurfaceTextureListener, InterfaceC1283820jVs, InterfaceC1288690jdj, InterfaceC1288900je4 {
    public Surface LL;
    public boolean LLILLJJLI;
    public AnimaXSurfaceDrawable LLILLL;
    public boolean LLILZ;
    public C854540Xfg LLILZIL;
    public boolean LLILZLL;
    public float LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public int LLJI;
    public final AnimaXPlayer LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public FirstFrameAwareSurfaceTexture mSurfaceTexture;

    @Override // X.InterfaceC1288690jdj
    public final /* synthetic */ void LJI(MotionEvent motionEvent) {
        C1288670jdh.LIZ(this, motionEvent);
    }

    @Override // X.InterfaceC1283820jVs
    public final void LJIIJJI() {
        setNeedAlphaWorkaround(false);
    }

    @Override // X.InterfaceC1288130jcp
    public final void LIZ() {
        if (this.LLILLL == null && this.LLILZ) {
            this.LLJIJIL.LLIZLLLIL = true;
            AnimaXLog.LIZIZ("AnimaXView", "The Surface has not been created yet; Creating a temporary one.");
            onSurfaceTextureAvailable(null, 1, 1);
        }
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        String str = C1285850jZ9.LIZ;
        int i = Build.VERSION.SDK_INT;
        if (i >= 24 && i <= 29 && !this.LLILZLL) {
            if (this.LLILZIL == null) {
                this.LLILZIL = new C854540Xfg(this, 10);
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            try {
                C786410Ut5.LJIJJ(getContext(), this.LLILZIL, intentFilter);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                AnimaXLog.LIZ("AnimaXView", e.getMessage());
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("register BoardCastReceiver: ");
                sbLIZ.append(this.LLILZIL);
                AnimaXLog.LIZ("AnimaXView", C2188811AlT.LIZIZ(sbLIZ));
            }
            this.LLILZLL = true;
        }
        if (this.LLILZ) {
            return;
        }
        super.onAttachedToWindow();
        this.LLJIJIL.LJIIZILJ(true, EnumC1288660jdg.ATTACH);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        String str = C1285850jZ9.LIZ;
        int i = Build.VERSION.SDK_INT;
        if (i >= 24 && i <= 29 && this.LLILZLL) {
            this.LLILZLL = false;
            try {
                C786410Ut5.LJJIFFI(getContext(), this.LLILZIL);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                AnimaXLog.LIZ("AnimaXView", e.getMessage());
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unregister BoardCastReceiver: ");
                sbLIZ.append(this.LLILZIL);
                AnimaXLog.LIZ("AnimaXView", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        if (this.LLILZ) {
            return;
        }
        super.onDetachedFromWindow();
        this.LLJIJIL.LJIIZILJ(false, EnumC1288660jdg.ATTACH);
    }

    @Override // X.InterfaceC1288690jdj
    public final void release() {
        if (this.LLILLJJLI) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("release: ");
        sbLIZ.append(this);
        AnimaXLog.LIZIZ("AnimaXView", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI = true;
        this.LLJIJIL.LJIIL();
    }

    public final void LJIILL() {
        boolean z;
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        FirstFrameAwareSurfaceTexture firstFrameAwareSurfaceTexture = this.mSurfaceTexture;
        if (firstFrameAwareSurfaceTexture == null || firstFrameAwareSurfaceTexture.equals(surfaceTexture)) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && this.mSurfaceTexture.isReleased()) {
            AnimaXLog.LIZ("AnimaXView", "Failed to updateSurfaceTexture, texture is released.");
            return;
        }
        if (surfaceTexture != null) {
            AnimaXLog.LIZIZ("AnimaXView", "Init TextureView but it has already another st.");
        }
        setSurfaceTexture(this.mSurfaceTexture);
        FirstFrameAwareSurfaceTexture firstFrameAwareSurfaceTexture2 = this.mSurfaceTexture;
        firstFrameAwareSurfaceTexture2.getClass();
        if (i >= 36) {
            String str = C1285850jZ9.LIZ;
            synchronized (C1285850jZ9.class) {
                if (C1285850jZ9.LJII) {
                    z = C1285850jZ9.LJIIIIZZ;
                } else {
                    try {
                        Class.forName("miui.os.Build");
                        C1285850jZ9.LJIIIIZZ = true;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    C1285850jZ9.LJII = true;
                    z = C1285850jZ9.LJIIIIZZ;
                }
            }
            if (z) {
                try {
                    Field declaredField = SurfaceTexture.class.getDeclaredField("mTextureViewStub");
                    declaredField.setAccessible(true);
                    FirstFrameAwareSurfaceTexture.LIZIZ(declaredField.get(firstFrameAwareSurfaceTexture2));
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("clearMiuiStubCallbackIfNeeded fail: ");
                    sbLIZ.append(th2.getMessage());
                    AnimaXLog.LIZ("AnimaXFirstFrameAwareSurfaceTexture", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
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
        return this.LLJIJIL;
    }

    public TextureViewSurfaceTextureListenerC1288630jdd(Context context) {
        super(context);
        this.LLIZ = 1.0f;
        this.LLJIJIL = new AnimaXPlayer(new AnimaXContext(new C1288620jdc(context, new BaseAbility() { // from class: X.0jdn
        })));
        LJIILIIL(null);
    }

    private void setNeedAlphaWorkaround(boolean z) {
        String str = C1285850jZ9.LIZ;
        if (Build.VERSION.SDK_INT <= 28) {
            this.LLIZLLLIL = z;
            if (z) {
                super.setAlpha(0.0f);
            } else {
                super.setAlpha(this.LLIZ);
            }
        }
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

    public final void LJIILIIL(AttributeSet attributeSet) {
        AnimaXContext animaXContext = this.LLJIJIL.LLILLL;
        if (animaXContext != null && animaXContext.getAbility() != null) {
            BaseAbility ability = animaXContext.getAbility();
            ability.getClass();
            ability.LIZIZ = new WeakReference<>(this);
            this.LLJILJILJ = C1285850jZ9.LIZJ(C1285850jZ9.LIZ(ability, "ANIMAX_UPDATE_TEXTURE_WHEN_VISIBLE"));
            try {
                LJIIL(animaXContext.LIZIZ, attributeSet);
            } catch (NullPointerException e) {
                TryCatchGuardChecker.doCheck(e);
                AnimaXLog.LIZ("AnimaXView", "initAttributes fail, context's theme is null.");
            }
            setOpaque(false);
            setNeedAlphaWorkaround(true);
            setSurfaceTextureListener(this);
            this.mSurfaceTexture = new FirstFrameAwareSurfaceTexture();
            this.LL = new Surface(this.mSurfaceTexture);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("create Surface: ");
            sbLIZ.append(this.LL);
            AnimaXLog.LIZIZ("AnimaXView", C2188811AlT.LIZIZ(sbLIZ));
            this.mSurfaceTexture.LJIIIZ(this.LL);
            this.mSurfaceTexture.detachFromGLContext();
            this.mSurfaceTexture.LJI(this);
            FirstFrameAwareSurfaceTexture firstFrameAwareSurfaceTexture = this.mSurfaceTexture;
            firstFrameAwareSurfaceTexture.getClass();
            firstFrameAwareSurfaceTexture.LLILLL = new WeakReference<>(this);
            LJIILL();
            return;
        }
        AnimaXLog.LIZ("AnimaXView", "initView fail, missing AnimaXContext or Ability.");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSurfaceTextureDestroyed: ");
        sbLIZ.append(surfaceTexture);
        sbLIZ.append(", mHasDestroyed: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", this: ");
        sbLIZ.append(this);
        AnimaXLog.LIZIZ("AnimaXView", C2188811AlT.LIZIZ(sbLIZ));
        if (C1285850jZ9.LIZJ && !this.LLILLJJLI) {
            AnimaXLog.LIZIZ("AnimaXView", "needTextureDestroyWorkaround, try to postAtFrontOnUI.");
            this.LLJI = getVisibility();
            this.LLJ = true;
            C786410Ut5.b(this, 4);
            ARunnableS113S0100000_13 aRunnableS113S0100000_13 = new ARunnableS113S0100000_13(this, 76);
            Handler handlerLIZ = C787470Uun.LIZ();
            Message messageObtain = Message.obtain(handlerLIZ, aRunnableS113S0100000_13);
            messageObtain.setAsynchronous(true);
            C786410Ut5.LJLJJLL(handlerLIZ, messageObtain);
            return false;
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        BaseAbility ability = this.LLJIJIL.LLILLL.getAbility();
        if (ability.LJI != null) {
            Iterator it2 = ((CopyOnWriteArrayList) ability.LIZ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1288110jcn) it2.next()).LIZIZ(ability.LJI);
            }
            ability.LJI = null;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLJILJIL) {
            C1288670jdh.LIZ(this, motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        if (this.LLILZ) {
            return;
        }
        this.LLJIJIL.LJIIZILJ(z, EnumC1288660jdg.AGGREGATED);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.LLJILJILJ && getVisibility() == 0 && i == 0) {
            LJIILL();
        }
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        boolean z;
        float alpha = getAlpha();
        this.LLIZ = f;
        if (!this.LLIZLLLIL) {
            super.setAlpha(f);
        }
        boolean z2 = true;
        if (alpha > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (f <= 0.0f) {
            z2 = false;
        }
        if (z != z2) {
            this.LLJIJIL.LJIIZILJ(z2, EnumC1288660jdg.OPACITY);
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

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        try {
            super.setBackground(drawable);
        } catch (UnsupportedOperationException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setBackground fail, message: ");
            sbLIZ.append(e.getMessage());
            AnimaXLog.LIZ("AnimaXView", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        try {
            super.setBackgroundDrawable(drawable);
        } catch (UnsupportedOperationException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setBackgroundDrawable fail, message: ");
            sbLIZ.append(e.getMessage());
            AnimaXLog.LIZ("AnimaXView", C2188811AlT.LIZIZ(sbLIZ));
        }
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
        this.LLJILJIL = z;
    }

    @Override // X.InterfaceC1288650jdf
    public void setEndFrame(int i) {
        getPlayer().setEndFrame(i);
    }

    @Override // android.view.TextureView, android.view.View
    public void setForeground(Drawable drawable) {
        try {
            super.setForeground(drawable);
        } catch (UnsupportedOperationException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setForeground fail, message: ");
            sbLIZ.append(e.getMessage());
            AnimaXLog.LIZ("AnimaXView", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.InterfaceC1288650jdf
    public void setFpsEventInterval(long j) {
        getPlayer().setFpsEventInterval(j);
    }

    @Override // X.InterfaceC1288690jdj
    public void setIgnoreAttachStatus(boolean z) {
        this.LLILZ = z;
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
        if (this.LLJ) {
            this.LLJI = i;
            if (i == 0) {
                AnimaXLog.LIZIZ("AnimaXView", "Force visiblity to INVISIBLE due to workaround.");
                i = 4;
            }
        }
        super.setVisibility(i);
        AnimaXPlayer animaXPlayer = this.LLJIJIL;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        animaXPlayer.LJIIZILJ(z, EnumC1288660jdg.VISIBLE);
    }

    public TextureViewSurfaceTextureListenerC1288630jdd(AnimaXPlayer animaXPlayer) {
        super(animaXPlayer.LLILLL.LIZIZ);
        this.LLILLJJLI = false;
        this.LLILZ = false;
        this.LLIZ = 1.0f;
        this.LLJ = false;
        this.LLJI = 0;
        this.LLJILJIL = false;
        this.LLJILJILJ = false;
        this.LLJIJIL = animaXPlayer;
        LJIILIIL(null);
    }

    public TextureViewSurfaceTextureListenerC1288630jdd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLIZ = 1.0f;
        this.LLJIJIL = new AnimaXPlayer(new AnimaXContext(new C1288620jdc(context, new BaseAbility() { // from class: X.0jdn
        })));
        LJIILIIL(attributeSet);
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

    public final void LJIIL(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (context.getTheme() == null) {
            AnimaXLog.LIZ("AnimaXView", "initAttributes fail, context's theme is null.");
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AnimaXView);
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.AnimaXView_animax_animationUrl);
        if (strXd != null) {
            this.LLJIJIL.setSrc(strXd);
        }
        this.LLJIJIL.setAutoPlay(typedArrayObtainStyledAttributes.getBoolean(R$styleable.AnimaXView_animax_autoPlay, true));
        this.LLJIJIL.setLoop(typedArrayObtainStyledAttributes.getBoolean(R$styleable.AnimaXView_animax_loop, false));
        String strXd2 = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.AnimaXView_animax_objectFit);
        if (strXd2 != null) {
            this.LLJIJIL.setObjectFit(C1311900kFA.LIZ(strXd2));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void LJIILJJIL(int i, int i2) {
        boolean z;
        AnimaXPlayer animaXPlayer = this.LLJIJIL;
        if (i > 0 && i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        animaXPlayer.LJIIZILJ(z, EnumC1288660jdg.SIZE);
        if (i > 0 && i2 > 0) {
            AnimaXSurfaceDrawable animaXSurfaceDrawable = this.LLILLL;
            if (animaXSurfaceDrawable == null) {
                FirstFrameAwareSurfaceTexture firstFrameAwareSurfaceTexture = this.mSurfaceTexture;
                AnimaXSurfaceDrawable animaXSurfaceDrawable2 = new AnimaXSurfaceDrawable(firstFrameAwareSurfaceTexture.LIZLLL(), firstFrameAwareSurfaceTexture, null, i, i2);
                this.LLILLL = animaXSurfaceDrawable2;
                this.LLJIJIL.LJI(animaXSurfaceDrawable2);
                return;
            }
            if (animaXSurfaceDrawable.LIZ(i, i2)) {
                this.LLJIJIL.LJIILLIIL(this.LLILLL);
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Skip invalid size: ");
        sbLIZ.append(i);
        sbLIZ.append(" / ");
        sbLIZ.append(i2);
        AnimaXLog.LIZIZ("AnimaXView", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // android.view.TextureView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.LLJILJILJ && view == this && i == 0) {
            LJIILL();
        }
    }

    @Override // X.InterfaceC1288650jdf
    public final void LIZIZ(EnumC1288440jdK enumC1288440jdK, String str, AnimaXValueParam animaXValueParam) {
        getPlayer().LIZIZ(enumC1288440jdK, str, animaXValueParam);
    }

    @Override // X.InterfaceC1288650jdf
    public final void LJIIIZ(EnumC1288880je2 enumC1288880je2, AnimaXKeyPath animaXKeyPath, AnimaXValueParam animaXValueParam) {
        getPlayer().LJIIIZ(enumC1288880je2, animaXKeyPath, animaXValueParam);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSurfaceTextureAvailable: ");
        sbLIZ.append(surfaceTexture);
        sbLIZ.append(", width: ");
        sbLIZ.append(i);
        sbLIZ.append(", height: ");
        sbLIZ.append(i2);
        sbLIZ.append(", this: ");
        sbLIZ.append(this);
        AnimaXLog.LIZIZ("AnimaXView", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLILLJJLI) {
            AnimaXLog.LIZIZ("AnimaXView", "onSurfaceTextureAvailable failed as view is destroyed.");
        } else {
            LJIILL();
            LJIILJJIL(i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSurfaceTextureSizeChanged: ");
        sbLIZ.append(surfaceTexture);
        sbLIZ.append(", width: ");
        sbLIZ.append(i);
        sbLIZ.append(", height: ");
        sbLIZ.append(i2);
        sbLIZ.append(", this: ");
        sbLIZ.append(this);
        AnimaXLog.LIZIZ("AnimaXView", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLILLJJLI) {
            AnimaXLog.LIZIZ("AnimaXView", "onSurfaceTextureSizeChanged failed as view is destroyed.");
        } else {
            LJIILJJIL(i, i2);
        }
    }

    @Override // android.view.TextureView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        try {
            super.onSizeChanged(i, i2, i3, i4);
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            AnimaXLog.LIZ("AnimaXView", "onSizeChanged before added to view tree, may produce npe on some devices");
        }
    }
}
