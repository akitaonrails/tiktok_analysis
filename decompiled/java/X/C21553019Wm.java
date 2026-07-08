package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.19Wm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21553019Wm implements InterfaceC21551219Vu {
    public static final Method LLJJL;
    public static final Method LLJJLIIIJLLLLLLLZ;
    public static final Method LLJL;
    public final Context LL;
    public ListAdapter LLILLJJLI;
    public C21552519Wh LLILLL;
    public int LLILZLL;
    public int LLIZ;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public int LLJILJIL;
    public C19X1 LLJILLL;
    public View LLJJ;
    public AdapterView.OnItemClickListener LLJJI;
    public final Handler LLJJJ;
    public Rect LLJJJJ;
    public boolean LLJJJJJIL;
    public final C21516419Ik LLJJJJLIIL;
    public int LLILZ = -2;
    public int LLILZIL = -2;
    public final int LLIZLLLIL = 1002;
    public final int LLJILJILJ = Integer.MAX_VALUE;
    public final RunnableC21553419Wq LLJJIII = new RunnableC21553419Wq(this);
    public final ViewOnTouchListenerC21553319Wp LLJJIJI = new View.OnTouchListener() { // from class: X.19Wp
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0) {
                C21516419Ik c21516419Ik = this.LL.LLJJJJLIIL;
                if (c21516419Ik != null && c21516419Ik.isShowing() && x >= 0 && x < this.LL.LLJJJJLIIL.getWidth() && y >= 0 && y < this.LL.LLJJJJLIIL.getHeight()) {
                    C21553019Wm c21553019Wm = this.LL;
                    C786410Ut5.LJLIIL(250L, c21553019Wm.LLJJJ, c21553019Wm.LLJJIII);
                    return false;
                }
                return false;
            }
            if (action != 1) {
                return false;
            }
            C21553019Wm c21553019Wm2 = this.LL;
            c21553019Wm2.LLJJJ.removeCallbacks(c21553019Wm2.LLJJIII);
            return false;
        }
    };
    public final C21553519Wr LLJJIJIIJIL = new AbsListView.OnScrollListener() { // from class: X.19Wr
        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && this.LIZ.LLJJJJLIIL.getInputMethodMode() != 2 && this.LIZ.LLJJJJLIIL.getContentView() != null) {
                C21553019Wm c21553019Wm = this.LIZ;
                c21553019Wm.LLJJJ.removeCallbacks(c21553019Wm.LLJJIII);
                this.LIZ.LLJJIII.run();
            }
        }
    };
    public final C147N LLJJIJIL = new Runnable() { // from class: X.147N
        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            try {
                C21552519Wh c21552519Wh = this.LL.LLILLL;
                if (c21552519Wh != null) {
                    c21552519Wh.setListSelectionHidden(true);
                    c21552519Wh.requestLayout();
                }
            } finally {
                if (!zLIZ) {
                }
            }
        }
    };
    public final Rect LLJJJIL = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                LLJJL = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                LLJL = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                LLJJLIIIJLLLLLLLZ = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
    }

    public final Drawable LJFF() {
        return this.LLJJJJLIIL.getBackground();
    }

    public final int LJIIL() {
        if (this.LLJ) {
            return this.LLIZ;
        }
        return 0;
    }

    @Override // X.InterfaceC21551219Vu
    public final void dismiss() {
        this.LLJJJJLIIL.dismiss();
        this.LLJJJJLIIL.setContentView(null);
        this.LLILLL = null;
        this.LLJJJ.removeCallbacks(this.LLJJIII);
    }

    @Override // X.InterfaceC21551219Vu
    public final boolean isShowing() {
        return this.LLJJJJLIIL.isShowing();
    }

    @Override // X.InterfaceC21551219Vu
    public final void show() {
        int paddingTop;
        int iLIZ;
        C21552519Wh c21552519Wh;
        int iMakeMeasureSpec;
        if (this.LLILLL == null) {
            C21552519Wh c21552519WhLIZJ = LIZJ(this.LL, !this.LLJJJJJIL);
            this.LLILLL = c21552519WhLIZJ;
            c21552519WhLIZJ.setAdapter(this.LLILLJJLI);
            C21552519Wh c21552519Wh2 = this.LLILLL;
            AdapterView.OnItemClickListener c1847850yBb = this.LLJJI;
            if (C1848410yCV.LIZ) {
                c1847850yBb = new C1847850yBb(c1847850yBb);
            }
            c21552519Wh2.setOnItemClickListener(c1847850yBb);
            this.LLILLL.setFocusable(true);
            this.LLILLL.setFocusableInTouchMode(true);
            this.LLILLL.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: X.147G
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onNothingSelected(AdapterView<?> adapterView) {
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                    C21552519Wh c21552519Wh3;
                    if (i != -1 && (c21552519Wh3 = this.LL.LLILLL) != null) {
                        c21552519Wh3.setListSelectionHidden(false);
                    }
                }
            });
            this.LLILLL.setOnScrollListener(this.LLJJIJIIJIL);
            this.LLJJJJLIIL.setContentView(this.LLILLL);
        } else {
            this.LLJJJJLIIL.getContentView();
        }
        Drawable background = this.LLJJJJLIIL.getBackground();
        if (background != null) {
            background.getPadding(this.LLJJJIL);
            Rect rect = this.LLJJJIL;
            int i = rect.top;
            paddingTop = rect.bottom + i;
            if (!this.LLJ) {
                this.LLIZ = -i;
            }
        } else {
            this.LLJJJIL.setEmpty();
            paddingTop = 0;
        }
        boolean z = this.LLJJJJLIIL.getInputMethodMode() == 2;
        View view = this.LLJJ;
        int i2 = this.LLIZ;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = LLJJLIIIJLLLLLLLZ;
            if (method != null) {
                try {
                    iLIZ = ((Integer) method.invoke(this.LLJJJJLIIL, view, Integer.valueOf(i2), Boolean.valueOf(z))).intValue();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    iLIZ = this.LLJJJJLIIL.getMaxAvailableHeight(view, i2);
                }
            } else {
                iLIZ = this.LLJJJJLIIL.getMaxAvailableHeight(view, i2);
            }
        } else {
            iLIZ = C19XB.LIZ(this.LLJJJJLIIL, view, i2, z);
        }
        if (this.LLILZ != -1) {
            int i3 = this.LLILZIL;
            if (i3 == -2) {
                int i4 = this.LL.getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = this.LLJJJIL;
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4 - (rect2.left + rect2.right), Integer.MIN_VALUE);
            } else if (i3 != -1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            } else {
                int i5 = this.LL.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.LLJJJIL;
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5 - (rect3.left + rect3.right), 1073741824);
            }
            iLIZ = this.LLILLL.LIZ(iMakeMeasureSpec, iLIZ);
            paddingTop = iLIZ > 0 ? paddingTop + this.LLILLL.getPaddingTop() + this.LLILLL.getPaddingBottom() : 0;
        }
        int i6 = iLIZ + paddingTop;
        boolean z2 = this.LLJJJJLIIL.getInputMethodMode() == 2;
        C21516519Il.LIZLLL(this.LLJJJJLIIL, this.LLIZLLLIL);
        if (this.LLJJJJLIIL.isShowing()) {
            if (this.LLJJ.isAttachedToWindow()) {
                int width = this.LLILZIL;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.LLJJ.getWidth();
                }
                int i7 = this.LLILZ;
                if (i7 == -1) {
                    if (z2) {
                        this.LLJJJJLIIL.setWidth(this.LLILZIL == -1 ? -1 : 0);
                        this.LLJJJJLIIL.setHeight(0);
                    } else {
                        i6 = -1;
                        this.LLJJJJLIIL.setWidth(this.LLILZIL == -1 ? -1 : 0);
                        this.LLJJJJLIIL.setHeight(-1);
                    }
                } else if (i7 != -2) {
                    i6 = i7;
                }
                this.LLJJJJLIIL.setOutsideTouchable(true);
                C21516419Ik c21516419Ik = this.LLJJJJLIIL;
                View view2 = this.LLJJ;
                int i8 = this.LLILZLL;
                int i9 = this.LLIZ;
                if (width < 0) {
                    width = -1;
                }
                if (i6 < 0) {
                    i6 = -1;
                }
                c21516419Ik.update(view2, i8, i9, width, i6);
                return;
            }
            return;
        }
        int width2 = this.LLILZIL;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.LLJJ.getWidth();
        }
        int i10 = this.LLILZ;
        if (i10 == -1) {
            i6 = -1;
        } else if (i10 != -2) {
            i6 = i10;
        }
        this.LLJJJJLIIL.setWidth(width2);
        this.LLJJJJLIIL.setHeight(i6);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = LLJJL;
            if (method2 != null) {
                try {
                    method2.invoke(this.LLJJJJLIIL, Boolean.TRUE);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        } else {
            C19X4.LIZIZ(this.LLJJJJLIIL, true);
        }
        this.LLJJJJLIIL.setOutsideTouchable(true);
        this.LLJJJJLIIL.setTouchInterceptor(this.LLJJIJI);
        if (this.LLJIJIL) {
            C21516519Il.LIZJ(this.LLJJJJLIIL, this.LLJI);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = LLJL;
            if (method3 != null) {
                try {
                    method3.invoke(this.LLJJJJLIIL, this.LLJJJJ);
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
            }
        } else {
            C19X4.LIZ(this.LLJJJJLIIL, this.LLJJJJ);
        }
        C786410Ut5.j3(this.LLJJJJLIIL, this.LLJJ, this.LLILZLL, this.LLIZ, this.LLJILJIL);
        this.LLILLL.setSelection(-1);
        if ((!this.LLJJJJJIL || this.LLILLL.isInTouchMode()) && (c21552519Wh = this.LLILLL) != null) {
            c21552519Wh.setListSelectionHidden(true);
            c21552519Wh.requestLayout();
        }
        if (this.LLJJJJJIL) {
            return;
        }
        C786410Ut5.LJJZZIII(this.LLJJJ, this.LLJJIJIL);
    }

    public final int LJIIIZ() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC21551219Vu
    public final C21552519Wh Wl() {
        return this.LLILLL;
    }

    public final void LIZLLL(int i) {
        Drawable background = this.LLJJJJLIIL.getBackground();
        if (background != null) {
            background.getPadding(this.LLJJJIL);
            Rect rect = this.LLJJJIL;
            this.LLILZIL = rect.left + rect.right + i;
            return;
        }
        this.LLILZIL = i;
    }

    public final void LJII(Drawable drawable) {
        this.LLJJJJLIIL.setBackgroundDrawable(drawable);
    }

    public final void LJIIIIZZ(int i) {
        this.LLIZ = i;
        this.LLJ = true;
    }

    public final void LJIILIIL(int i) {
        this.LLILZLL = i;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.19X1] */
    public void LJIILJJIL(ListAdapter listAdapter) {
        C19X1 c19x1 = this.LLJILLL;
        if (c19x1 == null) {
            this.LLJILLL = new DataSetObserver() { // from class: X.19X1
                @Override // android.database.DataSetObserver
                public final void onChanged() {
                    if (this.LIZ.isShowing()) {
                        this.LIZ.show();
                    }
                }

                @Override // android.database.DataSetObserver
                public final void onInvalidated() {
                    this.LIZ.dismiss();
                }
            };
        } else {
            ListAdapter listAdapter2 = this.LLILLJJLI;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c19x1);
            }
        }
        this.LLILLJJLI = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.LLJILLL);
        }
        C21552519Wh c21552519Wh = this.LLILLL;
        if (c21552519Wh != null) {
            c21552519Wh.setAdapter(this.LLILLJJLI);
        }
    }

    public C21552519Wh LIZJ(Context context, boolean z) {
        return new C21552519Wh(context, z);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.19Wp] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.19Wr] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.147N] */
    public C21553019Wm(Context context, AttributeSet attributeSet, int i, int i2) {
        this.LL = context;
        this.LLJJJ = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ListPopupWindow, i, i2);
        this.LLILZLL = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.LLIZ = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.LLJ = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C21516419Ik c21516419Ik = new C21516419Ik(context, attributeSet, i, i2);
        this.LLJJJJLIIL = c21516419Ik;
        c21516419Ik.setInputMethodMode(1);
    }
}
