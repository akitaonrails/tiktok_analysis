package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mj5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C576370Mj5 extends FrameLayout {
    public C538370L9n LL;
    public C538370L9n LLILLJJLI;
    public final List<C576380Mj6> LLILLL;
    public InterfaceC576400Mj8 LLILZ;
    public final RectF LLILZIL;
    public boolean LLILZLL;
    public float LLIZ;
    public int LLIZLLLIL;
    public float LLJ;
    public final Paint LLJI;
    public final C538360L9m LLJIJIL;

    public final List<ViewGroup> getCellContainers() {
        return this.LLILLL;
    }

    public final int getDividerColor() {
        return this.LLIZLLLIL;
    }

    public final float getDividerWidth() {
        return this.LLIZ;
    }

    public final ViewGroup LIZ(int i) {
        return (ViewGroup) C13LP.LJJJLZIJ(i, this.LLILLL);
    }

    public final Rect LIZIZ(int i) {
        C576380Mj6 c576380Mj6 = (C576380Mj6) C13LP.LJJJLZIJ(i, this.LLILLL);
        if (c576380Mj6 == null) {
            return null;
        }
        Rect rect = new Rect();
        C538350L9l c538350L9l = c576380Mj6.LLJJIJIL;
        if (c538350L9l == null) {
            rect.right = rect.left;
            rect.bottom = rect.top;
            return rect;
        }
        float f = c538350L9l.LIZ;
        rect.left = (int) f;
        float f2 = c538350L9l.LIZIZ;
        rect.top = (int) f2;
        rect.right = (int) (f + c538350L9l.LIZJ);
        rect.bottom = (int) (f2 + c538350L9l.LIZLLL);
        return rect;
    }

    public final void LIZJ(int i) {
        int size = ((ArrayList) this.LLILLL).size();
        if (size == i) {
            return;
        }
        if (size > i) {
            ((ArrayList) this.LLILLL).subList(i, size).clear();
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
            removeViewsInLayout(i, size - i);
            requestLayout();
            return;
        }
        while (size < i) {
            C576380Mj6 c576380Mj6 = new C576380Mj6(this, this, size);
            ((ArrayList) this.LLILLL).add(c576380Mj6);
            addView(c576380Mj6);
            size++;
        }
    }

    public final void LIZLLL(C538370L9n c538370L9n) {
        if (c538370L9n != null && Intrinsics.LJFF(c538370L9n, this.LLILLJJLI)) {
            return;
        }
        if (this.LLILLJJLI == null) {
            if (c538370L9n != null) {
                if (Intrinsics.LJFF(c538370L9n, this.LL)) {
                    return;
                }
            } else if (this.LL == null) {
                return;
            }
        }
        this.LLILZLL = true;
        this.LLILLJJLI = c538370L9n;
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C538370L9n c538370L9n;
        int i;
        super.dispatchDraw(canvas);
        if (this.LLIZ > 0.0f && !((ArrayList) this.LLILLL).isEmpty() && (c538370L9n = this.LL) != null) {
            if ((c538370L9n.LIZ > 1 || c538370L9n.LIZIZ > 1) && (i = this.LLIZLLLIL) != 0) {
                this.LLJI.setColor(i);
                canvas.save();
                Iterator it2 = ((ArrayList) this.LLILLL).iterator();
                while (it2.hasNext()) {
                    C538350L9l location = ((C576380Mj6) it2.next()).getLocation();
                    if (location != null) {
                        if (!location.LJ) {
                            float f = this.LLIZ;
                            if (f > 0.0f) {
                                RectF rectF = this.LLILZIL;
                                float f2 = location.LIZIZ;
                                rectF.top = f2;
                                rectF.bottom = f2 + location.LIZLLL;
                                float f3 = location.LIZ + location.LIZJ;
                                float f4 = f / 2;
                                rectF.left = f3 - f4;
                                rectF.right = f3 + f4;
                                canvas.drawRect(rectF, this.LLJI);
                            }
                        }
                        if (!location.LJFF) {
                            float f5 = this.LLIZ;
                            if (f5 > 0.0f) {
                                RectF rectF2 = this.LLILZIL;
                                float f6 = location.LIZIZ + location.LIZLLL;
                                float f7 = f5 / 2;
                                rectF2.top = f6 - f7;
                                rectF2.bottom = f6 + f7;
                                float f8 = location.LIZ;
                                rectF2.left = f8;
                                rectF2.right = f8 + location.LIZJ;
                                canvas.drawRect(rectF2, this.LLJI);
                            }
                        }
                    }
                }
                canvas.restore();
            }
        }
    }

    public final void setAutoGridListener(InterfaceC576400Mj8 interfaceC576400Mj8) {
        this.LLILZ = interfaceC576400Mj8;
    }

    public final void setDividerColor(int i) {
        this.LLIZLLLIL = i;
    }

    public final void setDividerWidth(float f) {
        this.LLIZ = f;
    }

    public final void setMaxScale(float f) {
        this.LLJ = f;
        Iterator<C576380Mj6> it2 = this.LLILLL.iterator();
        while (it2.hasNext()) {
            it2.next().setMaxScale(f);
        }
    }

    public C576370Mj5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = new ArrayList();
        this.LLILZIL = new RectF();
        this.LLIZ = 0.5f;
        this.LLIZLLLIL = -1;
        this.LLJ = 1.0f;
        Paint paint = new Paint();
        this.LLJI = paint;
        this.LLJIJIL = new C538360L9m(null);
        paint.setAntiAlias(true);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        C538370L9n c538370L9n;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        try {
            if (this.LLILZLL && (c538370L9n = this.LLILLJJLI) != null) {
                this.LLJIJIL.LIZJ(size, size2, c538370L9n);
                this.LL = c538370L9n;
            }
            if (((ArrayList) this.LLJIJIL.LIZIZ).size() <= 0) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
                removeAllViewsInLayout();
                ((ArrayList) this.LLILLL).clear();
            } else {
                C538370L9n c538370L9n2 = this.LL;
                if (c538370L9n2 != null) {
                    LIZJ(c538370L9n2.LIZJ.size());
                }
                int i3 = 0;
                for (C576380Mj6 c576380Mj6 : (ArrayList) this.LLILLL) {
                    C538350L9l c538350L9l = (C538350L9l) C13LP.LJJJLZIJ(i3, this.LLJIJIL.LIZIZ);
                    if (c538350L9l != null) {
                        c576380Mj6.LLJJIJIL = c538350L9l;
                        c576380Mj6.measure(View.MeasureSpec.makeMeasureSpec((int) c538350L9l.LIZJ, 1073741824), View.MeasureSpec.makeMeasureSpec((int) c538350L9l.LIZLLL, 1073741824));
                    }
                    i3++;
                }
            }
            this.LLILLJJLI = null;
            this.LLILZLL = false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLJJLI = null;
            this.LLILZLL = false;
            throw th;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C576380Mj6 c576380Mj6;
        C538350L9l c538350L9l;
        for (View view : new C09RD(this)) {
            if ((view instanceof C576380Mj6) && (c576380Mj6 = (C576380Mj6) view) != null && (c538350L9l = c576380Mj6.LLJJIJIL) != null) {
                if (C426750GoL.LIZLLL(c576380Mj6.getContext())) {
                    c576380Mj6.layout((c576380Mj6.LLJJIJI.getWidth() - ((int) c538350L9l.LIZ)) - ((int) c538350L9l.LIZJ), (int) c538350L9l.LIZIZ, c576380Mj6.LLJJIJI.getWidth() - ((int) c538350L9l.LIZ), (int) (c538350L9l.LIZIZ + c538350L9l.LIZLLL));
                } else {
                    float f = c538350L9l.LIZ;
                    float f2 = c538350L9l.LIZIZ;
                    c576380Mj6.layout((int) f, (int) f2, (int) (f + c538350L9l.LIZJ), (int) (f2 + c538350L9l.LIZLLL));
                }
            }
        }
    }
}
