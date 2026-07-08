package X;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0kHH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313210kHH implements InterfaceC1314130kIl {
    public InterfaceC1314320kJ4 LL;
    public final View LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public C1313910kIP LLIZ;
    public int[] LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public Path LLJILJIL;
    public Rect LLJILJILJ;
    public int LLJILLL;
    public final ArrayList<C1313410kHb> LLJJ = new ArrayList<>();
    public C1315680kLG LLJJI;

    public final void LIZLLL() {
        View view;
        for (C1313410kHb c1313410kHb : this.LLJJ) {
            if (c1313410kHb.LIZJ && c1313410kHb.LIZ != null && (view = c1313410kHb.LIZIZ) != null) {
                int i = c1313410kHb.LJI;
                int i2 = c1313410kHb.LJII;
                view.layout(i, i2, c1313410kHb.LJIIIIZZ + i, c1313410kHb.LJIIIZ + i2);
                c1313410kHb.LIZ.LIZLLL();
            }
        }
    }

    public final void LJ() {
        View view;
        for (C1313410kHb c1313410kHb : this.LLJJ) {
            if (c1313410kHb.LIZJ && c1313410kHb.LIZ != null && (view = c1313410kHb.LIZIZ) != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(c1313410kHb.LJIIIIZZ, 1073741824), View.MeasureSpec.makeMeasureSpec(c1313410kHb.LJIIIZ, 1073741824));
                c1313410kHb.LIZ.LJ();
            }
        }
    }

    @Override // X.InterfaceC1314130kIl
    public final void performLayoutChildrenUI() {
        InterfaceC1314320kJ4 interfaceC1314320kJ4 = this.LL;
        if (interfaceC1314320kJ4 != null) {
            interfaceC1314320kJ4.processLayoutChildren();
        }
    }

    @Override // X.InterfaceC1314130kIl
    public final void performMeasureChildrenUI() {
        InterfaceC1314320kJ4 interfaceC1314320kJ4 = this.LL;
        if (interfaceC1314320kJ4 != null) {
            interfaceC1314320kJ4.processMeasureChildren();
        }
    }

    @Override // X.InterfaceC1314130kIl
    public final boolean hasOverlappingRendering() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1314130kIl
    public final void afterDispatchDraw(Canvas canvas) {
        InterfaceC1314320kJ4 interfaceC1314320kJ4 = this.LL;
        if (interfaceC1314320kJ4 != null) {
            interfaceC1314320kJ4.afterDispatchProcessViewInfo(this);
        }
        while (this.LLJILLL < this.LLJJ.size()) {
            LIZIZ((C1313410kHb) ListProtector.get(this.LLJJ, this.LLJILLL), canvas);
            this.LLJILLL++;
        }
    }

    @Override // X.InterfaceC1314130kIl
    public final void afterDraw(Canvas canvas) {
        InterfaceC1314320kJ4 interfaceC1314320kJ4 = this.LL;
        if (interfaceC1314320kJ4 != null) {
            interfaceC1314320kJ4.afterProcessViewInfo(this);
        }
    }

    @Override // X.InterfaceC1314130kIl
    public final void beforeDispatchDraw(Canvas canvas) {
        InterfaceC1314320kJ4 interfaceC1314320kJ4 = this.LL;
        if (interfaceC1314320kJ4 != null) {
            interfaceC1314320kJ4.beforeDispatchProcessViewInfo(this);
        }
        this.LLJILLL = 0;
        if (this.LLJIJIL) {
            Path path = this.LLJILJIL;
            if (path != null) {
                canvas.clipPath(path);
                return;
            }
            Rect rect = this.LLJILJILJ;
            if (rect == null) {
                return;
            }
            canvas.clipRect(rect);
        }
    }

    @Override // X.InterfaceC1314130kIl
    public final void beforeDraw(Canvas canvas) {
        Path pathLIZJ;
        InterfaceC1314320kJ4 interfaceC1314320kJ4 = this.LL;
        if (interfaceC1314320kJ4 != null) {
            interfaceC1314320kJ4.beforeProcessViewInfo(this);
        }
        C1315680kLG c1315680kLG = this.LLJJI;
        if (c1315680kLG != null) {
            c1315680kLG.LJII(canvas);
        }
        float f = this.LLILZIL;
        if (f != 0.0f || this.LLILZLL != 0.0f) {
            canvas.skew(f, this.LLILZLL);
            canvas.translate((-this.LLILLJJLI.getPivotY()) * this.LLILZIL, (-this.LLILLJJLI.getPivotX()) * this.LLILZLL);
        }
        C1313910kIP c1313910kIP = this.LLIZ;
        if (c1313910kIP != null && (pathLIZJ = c1313910kIP.LIZJ(this.LLILLL, this.LLILZ)) != null) {
            canvas.clipPath(pathLIZJ);
        }
    }

    public C1313210kHH(InterfaceC1314320kJ4 interfaceC1314320kJ4, View view) {
        this.LL = interfaceC1314320kJ4;
        this.LLILLJJLI = view;
    }

    public static void LIZIZ(C1313410kHb c1313410kHb, Canvas canvas) {
        int i;
        T t;
        Rect rect = c1313410kHb.LIZLLL;
        int iSave = canvas.save();
        if (rect != null) {
            canvas.clipRect(rect);
        }
        int i2 = c1313410kHb.LJI;
        if (i2 != 0 || c1313410kHb.LJII != 0) {
            canvas.translate(i2, c1313410kHb.LJII);
        }
        float f = c1313410kHb.LJIILJJIL;
        if (f < 1.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, c1313410kHb.LJIIIIZZ, c1313410kHb.LJIIIZ, (int) (f * 255.0f), 31);
        }
        C1313270kHN c1313270kHN = c1313410kHb.LJIIZILJ;
        if (c1313270kHN != null && (t = c1313270kHN.LIZIZ) != 0) {
            float f2 = c1313410kHb.LJIIL;
            float f3 = c1313410kHb.LJIIJJI;
            float f4 = c1313410kHb.LJIILIIL;
            float f5 = c1313410kHb.LJIIJ;
            if (t != 0) {
                t.LIZLLL(f2, f3, f4, f5);
            }
            BackgroundDrawable backgroundDrawable = (BackgroundDrawable) c1313410kHb.LJIIZILJ.LIZIZ;
            backgroundDrawable.setBounds(0, 0, c1313410kHb.LJIIIIZZ, c1313410kHb.LJIIIZ);
            backgroundDrawable.draw(canvas);
        }
        if (c1313410kHb.LJFF != null) {
            canvas.translate(c1313410kHb.LJIILL, c1313410kHb.LJIILLIIL);
            int i3 = c1313410kHb.LJIIIIZZ;
            if (i3 > 0 && (i = c1313410kHb.LJIIIZ) > 0) {
                canvas.clipRect(0, 0, i3, i);
            }
            Spanned spanned = (Spanned) c1313410kHb.LJFF.getText();
            if (spanned != null) {
                for (AbstractC1315450kKt abstractC1315450kKt : (AbstractC1315450kKt[]) spanned.getSpans(0, spanned.length(), AbstractC1315450kKt.class)) {
                    abstractC1315450kKt.LIZLLL();
                }
            }
            c1313410kHb.LJFF.draw(canvas);
        }
        C1315680kLG c1315680kLG = c1313410kHb.LJ;
        if (c1315680kLG != null) {
            c1315680kLG.LJII(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    public final void LIZ(int i, C1313410kHb c1313410kHb) {
        if (i < 0) {
            return;
        }
        int size = this.LLJJ.size();
        if (i > size) {
            int i2 = i - size;
            for (int i3 = 0; i3 < i2; i3++) {
                this.LLJJ.add(null);
            }
            this.LLJJ.add(c1313410kHb);
            return;
        }
        ListProtector.add(this.LLJJ, i, c1313410kHb);
    }

    @Override // X.InterfaceC1314130kIl
    public final int getChildDrawingOrder(int i, int i2) {
        int[] iArr = this.LLIZLLLIL;
        if (iArr != null && i2 < iArr.length) {
            return iArr[i2];
        }
        return i2;
    }

    public final void LIZJ(ArrayList arrayList, int i, int i2) {
        int left;
        View view = this.LLILLJJLI;
        int top = 0;
        if (view != null) {
            left = view.getLeft();
        } else {
            left = 0;
        }
        int i3 = i + left;
        View view2 = this.LLILLJJLI;
        if (view2 != null) {
            top = view2.getTop();
        }
        int i4 = i2 + top;
        View view3 = this.LLILLJJLI;
        if (view3 != null && this.LLJI) {
            int width = view3.getWidth();
            int height = this.LLILLJJLI.getHeight();
            C1315680kLG c1315680kLG = this.LLJJI;
            if (c1315680kLG != null) {
                c1315680kLG.LIZLLL().booleanValue();
            }
            C1310110kCH c1310110kCH = new C1310110kCH(i3, i4, width, height);
            this.LLILLJJLI.getAlpha();
            this.LLILLJJLI.getScaleX();
            this.LLILLJJLI.getScaleY();
            this.LLILLJJLI.getVisibility();
            arrayList.add(c1310110kCH);
        }
        for (C1313410kHb c1313410kHb : this.LLJJ) {
            if (c1313410kHb != null) {
                KeyEvent.Callback callback = c1313410kHb.LIZIZ;
                if (callback instanceof InterfaceC1314610kJX) {
                    InterfaceC1314610kJX interfaceC1314610kJX = (InterfaceC1314610kJX) callback;
                    if (interfaceC1314610kJX.getDrawChildHook() instanceof C1313210kHH) {
                        ((C1313210kHH) interfaceC1314610kJX.getDrawChildHook()).LIZJ(arrayList, i3, i4);
                    }
                } else if (c1313410kHb.LJIJ) {
                    int i5 = c1313410kHb.LJI + i3;
                    int i6 = c1313410kHb.LJII + i4;
                    int i7 = c1313410kHb.LJIIIIZZ;
                    int i8 = c1313410kHb.LJIIIZ;
                    C1315680kLG c1315680kLG2 = c1313410kHb.LJ;
                    if (c1315680kLG2 != null) {
                        c1315680kLG2.LIZLLL().booleanValue();
                    }
                    arrayList.add(new C1310110kCH(i5, i6, i7, i8));
                }
            }
        }
    }

    @Override // X.InterfaceC1314130kIl
    public final void afterDrawChild(Canvas canvas, View view, long j) {
        InterfaceC1314320kJ4 interfaceC1314320kJ4 = this.LL;
        if (interfaceC1314320kJ4 != null) {
            interfaceC1314320kJ4.afterProcessChildViewInfo(this, view, j);
        }
    }

    @Override // X.InterfaceC1314130kIl
    public final Rect beforeDrawChild(Canvas canvas, View view, long j) {
        InterfaceC1314320kJ4 interfaceC1314320kJ4 = this.LL;
        if (interfaceC1314320kJ4 != null) {
            interfaceC1314320kJ4.beforeProcessChildViewInfo(this, view, j);
        }
        while (this.LLJILLL < this.LLJJ.size()) {
            C1313410kHb c1313410kHb = (C1313410kHb) ListProtector.get(this.LLJJ, this.LLJILLL);
            if (c1313410kHb == null) {
                LynxLog.e("ViewInfo", "drawWithSubDrawInfo: info is null");
            } else {
                if (c1313410kHb.LIZJ) {
                    Rect rect = c1313410kHb.LIZLLL;
                    this.LLJILLL++;
                    return rect;
                }
                LIZIZ(c1313410kHb, canvas);
            }
            this.LLJILLL++;
        }
        return null;
    }
}
