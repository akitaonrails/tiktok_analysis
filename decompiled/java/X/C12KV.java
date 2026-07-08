package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Scroller;
import android.widget.SeekBar;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: renamed from: X.12KV, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12KV extends View {
    public static final /* synthetic */ int LLJLL = 0;
    public final C444890HcV LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final Rect LLIZ;
    public int LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public VelocityTracker LLJIJIL;
    public final Scroller LLJILJIL;
    public final Scroller LLJILJILJ;
    public final int LLJILLL;
    public final int LLJJ;
    public final int LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public boolean LLJJJ;
    public int LLJJJIL;
    public final List<C12KY> LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public final C0ZDN LLJJLIIIJLLLLLLLZ;
    public final Matrix LLJL;
    public C12KW LLJLIL;
    public int LLJLILLLLZIIL;

    public final void LIZ() {
        if (this.LLJILJILJ.isFinished()) {
            this.LLJJIJI = 0;
            int i = this.LLJJJIL;
            int i2 = this.LLILZ;
            int i3 = i - (i2 * ((int) (((i * 1.0f) / i2) + 0.5f)));
            if (i3 != 0) {
                this.LLJILJILJ.startScroll(0, 0, 0, i3, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
            }
        }
    }

    @Override // android.view.View
    public final void computeScroll() {
        Scroller scroller = this.LLJILJIL;
        if (scroller.isFinished()) {
            scroller = this.LLJILJILJ;
            if (scroller.isFinished()) {
                return;
            }
        }
        scroller.computeScrollOffset();
        int currY = scroller.getCurrY();
        this.LLJJIJIIJIL = currY;
        int i = currY - this.LLJJIJI;
        this.LLJJIJIL = i;
        LIZIZ(i);
        invalidate();
        this.LLJJIJI = this.LLJJIJIIJIL;
    }

    public final int getIndex$tux_theme_release() {
        int i = this.LLJJJJLIIL;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    public final C12KW getCallback() {
        return this.LLJLIL;
    }

    public final int getLevel() {
        return this.LLJLILLLLZIIL;
    }

    public C12KV(Context context) {
        super(context, null, R.attr.xr);
        C444890HcV c444890HcV = new C444890HcV();
        this.LL = c444890HcV;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        this.LLILZ = iLIZIZ;
        this.LLILZIL = iLIZIZ / 4;
        this.LLILZLL = (iLIZIZ * 3) / 4;
        this.LLIZ = new Rect();
        this.LLIZLLLIL = 4;
        float f = 8 * iLIZIZ;
        this.LLJ = f;
        this.LLJI = (float) (((double) (f * 2)) / 3.141592653589793d);
        this.LLJILJIL = new Scroller(context, null);
        this.LLJILJILJ = new Scroller(context, C1619980sG4.LJIIJJI());
        this.LLJJIII = 3;
        this.LLJJJJ = new ArrayList();
        this.LLJJJJLIIL = -1;
        this.LLJJLIIIJLLLLLLLZ = new C0ZDN(context);
        this.LLJL = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.TuxColumnPicker, R.attr.xr, 0);
        int i = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxColumnPicker__tux_columnPickerFont, 0);
        this.LLILLJJLI = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxColumnPicker__tux_columnPickerTextColor, 0);
        this.LLILLL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxColumnPicker__tux_columnPickerTextUnselectedColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        c444890HcV.LIZ(i);
        c444890HcV.setAntiAlias(true);
        c444890HcV.setTextAlign(Paint.Align.LEFT);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.LLJILLL = viewConfiguration.getScaledTouchSlop();
        this.LLJJ = viewConfiguration.getScaledMinimumFlingVelocity();
        this.LLJJI = viewConfiguration.getScaledMaximumFlingVelocity() / 3;
        setFocusable(true);
    }

    public final void LIZIZ(int i) {
        int i2;
        int i3 = this.LLJJJIL - i;
        this.LLJJJIL = i3;
        if (i3 < 0) {
            i3 = 0;
        }
        int size = ((ArrayList) this.LLJJJJ).size() - 1;
        int i4 = this.LLILZ;
        int i5 = size * i4;
        if (i3 > i5) {
            i3 = i5;
        }
        this.LLJJJIL = i3;
        int i6 = (int) (((i3 * 1.0f) / i4) + 0.5f);
        int i7 = this.LLJJJJLIIL;
        if (i7 != i6) {
            if (i7 < 0) {
                this.LLJJJJLIIL = i6;
            }
            C12KW c12kw = this.LLJLIL;
            if (c12kw != null) {
                int i8 = this.LLJLILLLLZIIL;
                c12kw.LIZ(i8, i6, ((C12KY) ListProtector.get(this.LLJJJJ, i6)).LIZ);
            }
            this.LLJJJJLIIL = i6;
            q0.LJJIFFI(this, ((C12KY) ListProtector.get(this.LLJJJJ, i6)).LIZIZ);
        }
        int i9 = this.LLJJJIL;
        int i10 = this.LLILZ;
        int i11 = i9 % i10;
        if ((i11 > this.LLILZLL || i11 < this.LLILZIL) && (i2 = i9 / i10) != this.LLJJL) {
            this.LLJJL = i2;
            this.LLJJLIIIJLLLLLLLZ.LIZ(0);
        }
        invalidate();
    }

    public final void LIZJ(List<String> list) {
        int iIntValue;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<String> it2 = list.iterator();
        while (true) {
            iIntValue = 0;
            if (!it2.hasNext()) {
                break;
            }
            String next = it2.next();
            this.LL.getTextBounds(next, 0, next.length(), this.LLIZ);
            arrayList.add(Integer.valueOf(this.LLIZ.width()));
        }
        Integer num = (Integer) C13LP.LJJLIIIJLJLI(arrayList);
        if (num != null) {
            iIntValue = num.intValue();
        }
        this.LLJJJJJIL = iIntValue;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
        if (iIntValue < iLIZIZ) {
            iIntValue = iLIZIZ;
        }
        this.LLJJJJJIL = iIntValue;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        if (i < 0) {
            if (this.LLJJJIL <= 0) {
                return false;
            }
        } else if (this.LLJJJIL >= (((ArrayList) this.LLJJJJ).size() - 1) * this.LLILZ) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        int i;
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        int i2 = this.LLJJJIL;
        int i3 = this.LLILZ;
        int i4 = i2 / i3;
        float f = i2 % i3;
        float f2 = 2;
        float f3 = this.LLJ / f2;
        canvas.translate(0.0f, this.LLJI / f2);
        int i5 = this.LLIZLLLIL;
        int i6 = -i5;
        int i7 = 1;
        int i8 = i5 + 1;
        if (i6 <= i8) {
            while (true) {
                int i9 = i6 + i4;
                if (i9 >= 0 && i9 < ((ArrayList) this.LLJJJJ).size()) {
                    String str = ((C12KY) ListProtector.get(this.LLJJJJ, i9)).LIZIZ;
                    if (f >= this.LLILZIL ? !(f <= this.LLILZLL || i6 != i7) : i6 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C444890HcV c444890HcV = this.LL;
                    if (z) {
                        i = this.LLILLJJLI;
                    } else {
                        i = this.LLILLL;
                    }
                    c444890HcV.setColor(i);
                    float f4 = (((this.LLILZ * (this.LLIZLLLIL + i6)) * 1.0f) - f) - f3;
                    if (Math.abs(f4) < this.LLJ / f2) {
                        C444890HcV c444890HcV2 = this.LL;
                        Rect rect = this.LLIZ;
                        c444890HcV2.getTextBounds(str, 0, str.length(), rect);
                        int iWidth = rect.width();
                        int iHeight = rect.height();
                        float fSin = (this.LLJI / f2) * ((float) Math.sin(f4 / r6));
                        float fCos = ((float) (((double) iHeight) * Math.cos((((double) f4) * 3.141592653589793d) / ((double) this.LLJ)))) / f2;
                        float f5 = fSin - fCos;
                        float f6 = fCos + fSin;
                        float f7 = this.LLJI / f2;
                        float f8 = iWidth;
                        float f9 = 1;
                        float fSqrt = ((((float) Math.sqrt(f9 - (((f5 * f5) / f7) / f7))) * 0.100000024f) + 0.9f) * f8;
                        float f10 = this.LLJI / f2;
                        float fSqrt2 = ((((float) Math.sqrt(f9 - (((f6 * f6) / f10) / f10))) * 0.100000024f) + 0.9f) * f8;
                        float f11 = iWidth / 2;
                        float f12 = width - f11;
                        float f13 = iHeight / 2;
                        float f14 = fSin - f13;
                        float f15 = f11 + width;
                        float f16 = f13 + fSin;
                        float f18 = fSqrt / 2.0f;
                        float f19 = fSqrt2 / 2.0f;
                        this.LLJL.setPolyToPoly(new float[]{f12, f14, f15, f14, f12, f16, f15, f16}, 0, new float[]{width - f18, f5, f18 + width, f5, width - f19, f6, f19 + width, f6}, 0, 4);
                        canvas.save();
                        canvas.concat(this.LLJL);
                        canvas.drawText(str, (width - (f8 / 2.0f)) - rect.left, (fSin + (iHeight / 2.0f)) - rect.bottom, c444890HcV2);
                        canvas.restore();
                    }
                }
                if (i6 == i8) {
                    break;
                }
                i6++;
                i7 = 1;
            }
        }
        canvas.translate(0.0f, (-this.LLJI) / f2);
        if (1 == this.LLJJIII && this.LLJILJIL.isFinished()) {
            LIZ();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatWrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
            accessibilityNodeInfoCompatWrap.setScrollable(true);
            accessibilityNodeInfoCompatWrap.setClassName(SeekBar.class.getName());
            accessibilityNodeInfoCompatWrap.addAction(SpeechEngineDefines.TTS_WORK_MODE_BOTH);
            accessibilityNodeInfoCompatWrap.addAction(8192);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0024, code lost:
    
        if (r2 != 3) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12KV.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setCallback(C12KW c12kw) {
        this.LLJLIL = c12kw;
    }

    public final void setCurrentFocusItem$tux_theme_release(Object obj) {
        Iterator it2 = ((ArrayList) this.LLJJJJ).iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(((C12KY) it2.next()).LIZ, obj)) {
                if (i >= 0) {
                    this.LLJJJJLIIL = i;
                    this.LLJJJIL = this.LLILZ * i;
                    q0.LJJIFFI(this, ((C12KY) ListProtector.get(this.LLJJJJ, i)).LIZIZ);
                    invalidate();
                    return;
                }
                return;
            }
            i++;
        }
    }

    public final void setIndex$tux_theme_release(int i) {
        int i2;
        int i3 = 0;
        if (i >= 0 && i < ((ArrayList) this.LLJJJJ).size() && (i2 = this.LLJJJJLIIL) != i) {
            if (i2 == -1) {
                i2 = 0;
            }
            int i4 = this.LLJJJIL + ((i - i2) * this.LLILZ);
            this.LLJJJIL = i4;
            if (i4 >= 0) {
                i3 = i4;
            }
            int size = (((ArrayList) this.LLJJJJ).size() - 1) * this.LLILZ;
            if (i3 > size) {
                i3 = size;
            }
            this.LLJJJIL = i3;
            if (this.LLJJJJLIIL < 0) {
                this.LLJJJJLIIL = i;
            }
            C12KW c12kw = this.LLJLIL;
            if (c12kw != null) {
                int i5 = this.LLJLILLLLZIIL;
                c12kw.LIZ(i5, i, ((C12KY) ListProtector.get(this.LLJJJJ, i)).LIZ);
            }
            this.LLJJJJLIIL = i;
            q0.LJJIFFI(this, ((C12KY) ListProtector.get(this.LLJJJJ, i)).LIZIZ);
            invalidate();
        }
    }

    public final void setLevel(int i) {
        this.LLJLILLLLZIIL = i;
    }

    public final void setMaxAxisOffset$tux_theme_release(int i) {
        if (1 <= i && i < 5) {
            this.LLIZLLLIL = i;
            float f = i * 2 * this.LLILZ;
            this.LLJ = f;
            this.LLJI = (float) (((double) (f * 2)) / 3.141592653589793d);
            requestLayout();
            invalidate();
        }
    }

    public final void LIZLLL(List<C12KY> list, List<String> list2) {
        this.LLJILJIL.forceFinished(true);
        this.LLJILJILJ.forceFinished(true);
        ((ArrayList) this.LLJJJJ).clear();
        ((ArrayList) this.LLJJJJ).addAll(list);
        if (((int) (((this.LLJJJIL * 1.0f) / this.LLILZ) + 0.5f)) >= ((ArrayList) this.LLJJJJ).size()) {
            this.LLJJJIL = (((ArrayList) this.LLJJJJ).size() - 1) * this.LLILZ;
        }
        if (list2 != null) {
            LIZJ(list2);
        } else {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                arrayList.add(((C12KY) it2.next()).LIZIZ);
            }
            LIZJ(arrayList);
        }
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(this.LLJJJJJIL, (int) this.LLJI);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (i != 4096) {
            if (i != 8192) {
                return super.performAccessibilityAction(i, bundle);
            }
            LIZIZ(this.LLILZ);
            LIZ();
            invalidate();
            return true;
        }
        LIZIZ(-this.LLILZ);
        LIZ();
        invalidate();
        return true;
    }
}
