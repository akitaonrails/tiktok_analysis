package X;

import Y.ALAdapterS3S0100000_6;
import Y.AfS175S0100000_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: renamed from: X.0ryi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1609220ryi extends C1295960jpS implements InterfaceC1609330ryt {
    public C1608120rww LL;
    public EnumC1607270rvZ LLILLJJLI;
    public final C01GW LLILLL;
    public AvatarComponentView LLILZ;
    public float LLILZIL;
    public final C01GW LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public C11JF LLJ;
    public AwS603S0100000_24 LLJI;
    public ValueAnimator LLJIJIL;
    public float LLJILJIL;
    public float LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public float LLJJI;
    public int LLJJIII;
    public boolean LLJJIJI;

    private final RectF getRingRecF() {
        return (RectF) this.LLILZLL.getValue();
    }

    public final Paint getPaint() {
        return (Paint) this.LLILLL.getValue();
    }

    @Override // X.C1295960jpS
    public final void cancelAnimation() {
        super.cancelAnimation();
        this.LLJJIJI = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cancelAnimation();
        C20597815iq.LIZ(this);
    }

    public final float getAnimateProgress() {
        return this.LLJILJILJ;
    }

    public final EnumC1607270rvZ getBusinessTag() {
        return this.LLILLJJLI;
    }

    public final boolean getCanDrawRing() {
        return this.LLJJIJI;
    }

    public final C1608120rww getUiData() {
        return this.LL;
    }

    private final void setRingStrokeWidthPx(float f) {
        if (this.LLILZIL != f) {
            this.LLILZIL = f;
            LJ(getWidth());
        }
    }

    public final void LJ(int i) {
        if (i <= 0) {
            return;
        }
        if (this.LLJJ == i && this.LLJJI == this.LLILZIL) {
            return;
        }
        this.LLJJ = i;
        float f = this.LLILZIL;
        this.LLJJI = f;
        float f2 = f / 2.0f;
        float f3 = i - (f / 2.0f);
        RectF ringRecF = getRingRecF();
        ringRecF.left = f2;
        ringRecF.top = f2;
        ringRecF.right = f3;
        ringRecF.bottom = f3;
    }

    public final void LJFF(Canvas canvas) {
        Function2<C1608740rxw, Context, Shader> function2;
        Function2<C1608740rxw, Context, Shader> function22;
        super.onDraw(canvas);
        if (this.LLILLJJLI == null || !this.LLJJIJI) {
            return;
        }
        C1608740rxw c1608740rxwLIZ = C1609280ryo.LIZ(this.LLILZ);
        int i = this.LLJJIII;
        int i2 = c1608740rxwLIZ.LIZIZ;
        if (i != i2) {
            this.LLJJIII = i2;
            LJIIIIZZ(c1608740rxwLIZ);
        }
        getPaint().setStrokeWidth(this.LLILZIL);
        LJ(getWidth());
        Shader shaderInvoke = null;
        if (this.LLIZ && this.LLJ != null) {
            Paint paint = getPaint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setShader(null);
            paint.setColor(this.LLJILLL);
            canvas.drawArc(getRingRecF(), 0.0f, 360.0f, false, getPaint());
            Paint paint2 = getPaint();
            paint2.setStyle(Paint.Style.STROKE);
            C1608120rww c1608120rww = this.LL;
            if (c1608120rww != null && (function22 = c1608120rww.LIZJ) != null) {
                shaderInvoke = function22.invoke(c1608740rxwLIZ, getContext());
            }
            paint2.setShader(shaderInvoke);
            C1608120rww c1608120rww2 = this.LL;
            if (c1608120rww2 != null) {
                LJII(c1608120rww2, new AwS603S0100000_24(paint2, 604));
            }
            canvas.drawArc(getRingRecF(), -90.0f, this.LLJILJIL * 360.0f, false, getPaint());
            return;
        }
        C1608120rww c1608120rww3 = this.LL;
        if (c1608120rww3 != null) {
            LJII(c1608120rww3, new AwS603S0100000_24(this, 603));
        }
        Paint paint3 = getPaint();
        C1608120rww c1608120rww4 = this.LL;
        if (c1608120rww4 != null && (function2 = c1608120rww4.LIZJ) != null) {
            shaderInvoke = function2.invoke(c1608740rxwLIZ, getContext());
        }
        paint3.setShader(shaderInvoke);
        canvas.drawArc(getRingRecF(), -90.0f, 360.0f, false, getPaint());
    }

    public final void LJI(EnumC1256840ioM enumC1256840ioM) {
        int i = C1256880ioQ.LIZ[enumC1256840ioM.ordinal()];
        if (i != 1) {
            if (i == 2 && this.LLIZLLLIL) {
                this.LLIZLLLIL = false;
                C11JF c11jf = this.LLJ;
                if (c11jf != null) {
                    c11jf.dispose();
                }
                this.LLJ = null;
                this.LLJI = null;
                return;
            }
            return;
        }
        if (!this.LLIZ || this.LLIZLLLIL) {
            return;
        }
        this.LLIZLLLIL = true;
        C11JF c11jf2 = this.LLJ;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        this.LLJ = null;
        this.LLJI = null;
        setAnimateProgress(0.0f);
        this.LLJ = (C11JF) C11NZ.LJIJJLI(new C1620950sHd(this, 1)).LJIL(300L, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS175S0100000_6(this, 18), new C09JN() { // from class: X.0GdN
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("AvatarRingView@35dc.controlAnimation$2");
                C1C7U.LIZIZ("AvatarRingView@35dc.controlAnimation$2");
            }
        });
        invalidate();
    }

    public final void LJIIIIZZ(C1608740rxw c1608740rxw) {
        double dFloatValue;
        Function1<C1608740rxw, Float> function1;
        C1608120rww c1608120rww = this.LL;
        if (c1608120rww != null && (function1 = c1608120rww.LJ) != null) {
            dFloatValue = function1.invoke(c1608740rxw).floatValue();
        } else {
            dFloatValue = 0.0d;
        }
        setRingStrokeWidthPx((float) Math.floor(dFloatValue));
    }

    @Override // X.C1295960jpS, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            LJFF(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setAnimateProgress(float f) {
        this.LLJILJILJ = f;
        if (f < this.LLJILJIL) {
            ValueAnimator valueAnimator = this.LLJIJIL;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = this.LLJIJIL;
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllUpdateListeners();
            }
            ValueAnimator valueAnimator3 = this.LLJIJIL;
            if (valueAnimator3 != null) {
                valueAnimator3.removeAllListeners();
            }
            float f2 = this.LLJILJILJ;
            if (f2 == 0.0f) {
                this.LLJILJIL = f2;
                invalidate();
                return;
            }
            return;
        }
        AwS603S0100000_24 awS603S0100000_24 = this.LLJI;
        if (awS603S0100000_24 != null) {
            awS603S0100000_24.invoke(Float.valueOf(f));
        }
    }

    public final void setCanDrawRing(boolean z) {
        this.LLJJIJI = z;
    }

    @Override // X.InterfaceC1609330ryt
    public void setContainerView(AvatarComponentView avatarComponentView) {
        this.LLILZ = avatarComponentView;
        C1608740rxw c1608740rxwLIZ = C1609280ryo.LIZ(avatarComponentView);
        this.LLJJIII = c1608740rxwLIZ.LIZIZ;
        LJIIIIZZ(c1608740rxwLIZ);
    }

    @Override // X.InterfaceC1609330ryt
    public void setUIConfig(C1609000ryM c1609000ryM) {
        C1608120rww c1608120rww;
        this.LLILLJJLI = c1609000ryM.LIZ;
        InterfaceC1609020ryO interfaceC1609020ryOLIZ = c1609000ryM.LIZJ.LIZ().LIZ();
        if (interfaceC1609020ryOLIZ instanceof C1608120rww) {
            c1608120rww = (C1608120rww) interfaceC1609020ryOLIZ;
        } else {
            c1608120rww = null;
        }
        this.LL = c1608120rww;
    }

    public final void LJII(C1608120rww c1608120rww, Function1<? super Integer, Unit> function1) {
        int iIntValue;
        Context context;
        Integer numLIZJ;
        Integer num = c1608120rww.LIZ;
        if (num != null) {
            function1.invoke(num);
            return;
        }
        Integer num2 = c1608120rww.LIZIZ;
        if (num2 == null) {
            return;
        }
        int iIntValue2 = num2.intValue();
        AvatarComponentView avatarComponentView = this.LLILZ;
        if (avatarComponentView != null && (context = avatarComponentView.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(iIntValue2, context)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        function1.invoke(Integer.valueOf(iIntValue));
    }

    public C1609220ryi(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(533));
        this.LLILZLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(534));
        this.LLJILLL = -7829368;
        this.LLJJIJI = true;
        setImageAssetsFolder("images");
        addAnimatorListener(new ALAdapterS3S0100000_6(this, 53));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LJ(i);
    }
}
