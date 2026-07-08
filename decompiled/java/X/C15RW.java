package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.15RW, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C15RW extends C11AF implements GestureDetector.OnGestureListener {
    public int LL;
    public int LLILLJJLI;
    public final RectF LLILLL;
    public final RectF LLILZ;
    public final Paint LLILZIL;
    public Bitmap LLILZLL;
    public Bitmap LLIZ;
    public Bitmap LLIZLLLIL;
    public C15RU LLJ;
    public C15RU LLJI;
    public C15RU LLJIJIL;
    public C15RU LLJILJIL;
    public Bitmap LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public GestureDetector LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public InterfaceC19457511An LLJJJ;
    public long LLJJJIL;
    public boolean LLJJJJ;

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    @Override // X.C11AF
    public int getMovableWidth() {
        return getMeasuredWidth();
    }

    @Override // X.C11AF
    public int getStopPosition() {
        return this.LLJJIJIL;
    }

    public final int LIZJ(float f) {
        return ((int) (((f * 1.0f) * (this.LLILLJJLI - this.LL)) / getMeasuredWidth())) + this.LL;
    }

    public float LIZLLL(int i) {
        return (((i - this.LL) * 1.0f) * getMeasuredWidth()) / (this.LLILLJJLI - this.LL);
    }

    public void LJI(Context context) {
        this.LLJJI = new GestureDetector(context, this);
        this.LLJILJILJ = BitmapFactory.decodeResource(getResources(), R.drawable.c1w);
        setWavForm(BitmapFactory.decodeResource(getResources(), R.drawable.alz));
        this.LLJI = new C15RU(context);
        this.LLJ = new C15RU(context);
        this.LLJIJIL = new C15RU(context);
        this.LLJILJIL = new C15RU(context);
        this.LLJI.LIZLLL(ColorProtector.parseColor("#FF20E5DC"));
        C15RU c15ru = this.LLJIJIL;
        Context context2 = C19733712It.LIZ;
        c15ru.LIZLLL(-1);
        this.LLJ.LIZLLL(ColorProtector.parseColor("#52FFFFFF"));
        this.LLJILJIL.LIZLLL(ColorProtector.parseColor("#22FFFFFF"));
        this.LLILZIL.setColor(ColorProtector.parseColor("#22FFFFFF"));
    }

    public void LJIIIIZZ(AVMusicWaveBean aVMusicWaveBean) {
        if (aVMusicWaveBean != null && C15R6.LJ(aVMusicWaveBean.getMusicWavePointArray())) {
            int iLIZJ = (int) C12ES.LIZJ(4.0f, getContext());
            C15R5.LJ(aVMusicWaveBean);
            C15RU c15ru = this.LLJ;
            c15ru.LJ = iLIZJ;
            this.LLJI.LJ = iLIZJ;
            this.LLJIJIL.LJ = iLIZJ;
            this.LLJILJIL.LJ = iLIZJ;
            c15ru.LIZIZ = C15R5.LJI.LIZLLL;
            this.LLJI.LIZIZ = C15R5.LJI.LIZLLL;
            this.LLJIJIL.LIZIZ = C15R5.LJI.LIZLLL;
            this.LLJILJIL.LIZIZ = C15R5.LJI.LIZLLL;
            this.LLJ.LJFF(aVMusicWaveBean.getMusicWavePointArray());
            this.LLJI.LJFF(aVMusicWaveBean.getMusicWavePointArray());
            this.LLJIJIL.LJFF(aVMusicWaveBean.getMusicWavePointArray());
            this.LLJILJIL.LJFF(aVMusicWaveBean.getMusicWavePointArray());
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.LLJJIJIL = LIZJ(Math.min(Math.max(LIZLLL(this.LLJJIII), motionEvent.getX()), getMeasuredWidth()));
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        invalidate();
        InterfaceC19457511An interfaceC19457511An = this.LLJJJ;
        if (interfaceC19457511An != null) {
            interfaceC19457511An.LIZ(this.LLJJIJIL);
        }
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C15RU c15ru = this.LLJIJIL;
        c15ru.getClass();
        if (C15R6.LJ(c15ru.LJIIJ)) {
            LJFF(canvas, false);
        } else {
            LJFF(canvas, true);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (i == 1) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setRotationY(180.0f);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.LLJJI;
        if (gestureDetector != null) {
            boolean zOnTouchEvent = gestureDetector.onTouchEvent(motionEvent);
            if (motionEvent.getAction() == 1) {
                int iLIZJ = LIZJ(Math.min(Math.max(LIZLLL(this.LLJJIII), motionEvent.getX()), getMeasuredWidth()));
                this.LLJJIJIL = iLIZJ;
                if (this.LLJJJJ) {
                    this.LLJJIJI = Math.max(this.LLJJIII, iLIZJ - ((int) TimeUnit.SECONDS.toMillis(3L)));
                } else {
                    this.LLJJIJI = Math.max(this.LLJJIII, iLIZJ);
                }
                this.LLJJIJIIJIL = this.LLJJIJI;
                invalidate();
                InterfaceC19457511An interfaceC19457511An = this.LLJJJ;
                if (interfaceC19457511An != null) {
                    interfaceC19457511An.LIZIZ(this.LLJJIJI, this.LLJJIJIL);
                }
                return zOnTouchEvent | true;
            }
            return zOnTouchEvent;
        }
        return false;
    }

    @Override // X.C11AF
    public void setOnProgressChangeListener(InterfaceC19457511An interfaceC19457511An) {
        this.LLJJJ = interfaceC19457511An;
    }

    @Override // X.C11AF
    public void setPastPosition(int i) {
        this.LLJJIII = i;
        invalidate();
    }

    @Override // X.C11AF
    public void setProgress(int i) {
        this.LLJJIJIIJIL = i;
        invalidate();
    }

    @Override // X.C11AF
    public void setStopPosition(int i) {
        this.LLJJIJIL = i;
        invalidate();
    }

    @Override // X.C11AF
    public void setTotalTime(long j) {
        this.LLJJJIL = j;
        setWavForm(this.LLILZLL);
    }

    @Override // X.C11AF
    public void setWavForm(Bitmap bitmap) {
        Context context = getContext();
        this.LLILZLL = LJII(C960203pA.LIZ(R.attr.a1p, context), bitmap);
        this.LLIZ = LJII(C446980Hfs.LIZ(context, R.color.lq), bitmap);
        this.LLIZLLLIL = LJII(C960203pA.LIZ(R.attr.a1k, context), bitmap);
        invalidate();
    }

    public C15RW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = new RectF();
        this.LLILZ = new RectF();
        this.LLILZIL = new Paint();
        this.LLJILLL = true;
        this.LLJJ = true;
        this.LLJJJJ = true;
        LJI(context);
        if (this.LLJJ) {
            int iLIZJ = (int) C12ES.LIZJ(2.0f, context);
            Context context2 = C19733712It.LIZ;
            setBackground(C426580Go4.LIZJ(0, ColorProtector.parseColor("#22FFFFFF"), 0, iLIZJ));
        }
    }

    public static Bitmap LJII(int i, Bitmap bitmap) {
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    @Override // X.C11AF
    public final void LIZ(int i, int i2) {
        if (i >= 0) {
            if (i2 >= i) {
                int i3 = i - this.LL;
                this.LLJJIII += i3;
                this.LLJJIJIL += i3;
                this.LLJJIJI += i3;
                this.LLJJIJIIJIL += i3;
                this.LL = i;
                this.LLILLJJLI = i2;
                invalidate();
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start: ");
            sbLIZ.append(i);
            sbLIZ.append("; end: ");
            sbLIZ.append(i2);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("start: ");
        sbLIZ2.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.C11AF
    public final void LIZIZ(AVMusicWaveBean aVMusicWaveBean, int i) {
        boolean z;
        int i2 = 0;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.LLJJJJ = z;
        if (aVMusicWaveBean != null && C15R6.LJ(aVMusicWaveBean.getMusicWavePointArray())) {
            int i3 = this.LL;
            int i4 = this.LLILLJJLI - i3;
            float length = aVMusicWaveBean.getMusicWavePointArray().length * 1.0f * i3;
            float f = i;
            int i5 = (int) (length / f);
            int length2 = (int) (((aVMusicWaveBean.getMusicWavePointArray().length * 1.0f) * i4) / f);
            if (length2 > 0) {
                float[] fArr = new float[length2];
                int length3 = aVMusicWaveBean.getMusicWavePointArray().length;
                int i6 = length2 + i5;
                boolean z2 = false;
                int i7 = i5;
                while (i7 < i6 && i7 < length3) {
                    fArr[i7 - i5] = aVMusicWaveBean.getMusicWavePointArray()[i7];
                    i7++;
                    z2 = true;
                }
                if (C15R6.LJ(fArr) && z2) {
                    aVMusicWaveBean.setMusicWavePointArray(fArr);
                }
            }
            int iLJI = C15R5.LJI.LJI(getContext());
            if (iLJI < aVMusicWaveBean.getMusicWavePointArray().length) {
                LJIIIIZZ(C15R5.LIZJ(VEUtils.getResampleMusicWaveData(aVMusicWaveBean.getMusicWavePointArray(), 0, iLJI)));
            }
        } else {
            LJIIIIZZ(LJ(i, getContext()));
            i2 = 1;
        }
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ(Scene.SCENE_SERVICE, "VolumeTapsView");
        c0lab.LIZ(i2 ^ 1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        C2341909Fp.LIZ("tool_performance_show_music_wave", c0lab.LIZ);
    }

    public AVMusicWaveBean LJ(int i, Context context) {
        AVMusicWaveBean aVMusicWaveBean = new AVMusicWaveBean();
        int iLJI = C15R5.LJI.LJI(context);
        float[] fArr = new float[iLJI];
        if (i > 0) {
            for (int i2 = 0; i2 < iLJI; i2++) {
                fArr[i2] = (float) Math.random();
            }
        }
        aVMusicWaveBean.setMusicWavePointArray(fArr);
        return aVMusicWaveBean;
    }

    public void LJFF(Canvas canvas, boolean z) {
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        RectF rectF = this.LLILLL;
        float fLIZLLL = LIZLLL(this.LLJJIII);
        LIZLLL(this.LLJJIJI);
        float fLIZLLL2 = LIZLLL(this.LLJJIJIIJIL);
        float fLIZLLL3 = LIZLLL(this.LLJJIJIL);
        rectF.left = 0.0f;
        rectF.right = fLIZLLL;
        rectF.top = 0.0f;
        float f = measuredHeight;
        rectF.bottom = f;
        canvas.drawRect(rectF, this.LLILZIL);
        int i = this.LL;
        int i2 = this.LLILLJJLI;
        float f2 = measuredWidth;
        float f3 = ((i * (-1.0f)) / (i2 - i)) * f2;
        RectF rectF2 = this.LLILZ;
        rectF2.top = 0.1f * f;
        rectF2.right = ((this.LLJJJIL * 1.0f) / (i2 - i)) * f2;
        rectF2.bottom = 0.9f * f;
        if (z) {
            rectF.left = 0.0f;
        } else {
            rectF.left = fLIZLLL2;
        }
        rectF.right = f2;
        canvas.save();
        canvas.clipRect(rectF);
        if (z) {
            canvas.translate(f3, 0.0f);
            canvas.drawBitmap(this.LLIZLLLIL, (Rect) null, this.LLILZ, (Paint) null);
        } else {
            this.LLJIJIL.LIZJ(canvas);
        }
        canvas.restore();
        rectF.top = 0.0f;
        rectF.bottom = f;
        rectF.left = 0.0f;
        rectF.right = fLIZLLL;
        canvas.save();
        canvas.clipRect(rectF);
        if (z) {
            canvas.translate(f3, 0.0f);
            canvas.drawBitmap(this.LLILZLL, (Rect) null, this.LLILZ, (Paint) null);
        } else {
            this.LLJ.LIZJ(canvas);
        }
        canvas.restore();
        rectF.left = fLIZLLL;
        rectF.right = fLIZLLL2;
        canvas.save();
        canvas.clipRect(rectF);
        if (z) {
            canvas.translate(f3, 0.0f);
            canvas.drawBitmap(this.LLIZ, (Rect) null, this.LLILZ, (Paint) null);
        } else {
            this.LLJI.LIZJ(canvas);
        }
        canvas.restore();
        if (this.LLJILLL) {
            canvas.drawBitmap(this.LLJILJILJ, fLIZLLL3 - (r3.getWidth() / 2), (measuredHeight / 2) - (this.LLJILJILJ.getHeight() / 2), (Paint) null);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        C15RU c15ru = this.LLJ;
        if (c15ru != null && this.LLJIJIL != null && this.LLJI != null) {
            c15ru.LJ(size, size2);
            this.LLJI.LJ(size, size2);
            this.LLJIJIL.LJ(size, size2);
            this.LLJILJIL.LJ(size, size2);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.LLJJIJIL = LIZJ(Math.min(Math.max(LIZLLL(this.LLJJIII), motionEvent2.getX()), getMeasuredWidth()));
        invalidate();
        InterfaceC19457511An interfaceC19457511An = this.LLJJJ;
        if (interfaceC19457511An != null) {
            interfaceC19457511An.LIZ(this.LLJJIJIL);
            return true;
        }
        return true;
    }
}
