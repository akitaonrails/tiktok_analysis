package X;

import Y.ACListenerS146S0100000_11;
import Y.AObserverS215S0100000_11;
import Y.ARunnableS102S0100000_2;
import Y.ARunnableS111S0100000_11;
import Y.ARunnableS80S0200000_11;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Looper;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.BackgroundColorSpan;
import android.view.ActionMode;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.Magnifier;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0SX4, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SX4 {
    public static final List<WeakReference<C0SX4>> LJJJJIZL = new ArrayList();
    public final Fragment LIZ;
    public final Context LIZIZ;
    public final Aweme LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final C0SRL LJI;
    public ActionMode LJII;
    public C0P0T LJIIIIZZ;
    public TextView LJIIIZ;
    public View LJIIJ;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJJ;
    public View LJIL;
    public View LJJ;
    public View LJJI;
    public View LJJIFFI;
    public ViewTreeObserverOnPreDrawListenerC738800SyU LJJII;
    public BackgroundColorSpan LJJIII;
    public Magnifier LJJIIJ;
    public TextView LJJIIJZLJL;
    public View LJJIIZ;
    public final int LJJIJIIJI;
    public final int LJJIJIIJIL;
    public final int LJJIJIL;
    public final int LJJIJL;
    public final int LJJIJLIJ;
    public final int LJJIL;
    public final int LJJIZ;
    public final int LJJJ;
    public final int LJJJI;
    public final int LJJJIL;
    public final int LJJJJ;
    public final C01GW LJJJJI;
    public final List<TextView> LJIIJJI = new ArrayList();
    public final List<Function0<Unit>> LJIIL = new ArrayList();
    public final BPEAHandler LJIILIIL = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS111S0100000_11 LJIILJJIL = new ARunnableS111S0100000_11(this, 159);
    public final ARunnableS111S0100000_11 LJIILL = new ARunnableS111S0100000_11(this, 158);
    public int LJIJ = -1;
    public int LJIJI = -1;
    public final C01GW LJIJJLI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1564));
    public int LJJIIZI = -1;
    public int LJJIJ = -1;

    public static GradientDrawable LIZLLL() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setSize(1, 1);
        gradientDrawable.setColor(0);
        return gradientDrawable;
    }

    public final View LIZJ() {
        View view = new View(this.LIZIZ);
        int iLIZIZ = (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LJJIJL))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LJJIJIL)))) / 2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(this.LJJIJIIJI);
        LayerDrawable layerDrawable = new LayerDrawable(new GradientDrawable[]{gradientDrawable});
        layerDrawable.setLayerInset(0, iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
        view.setBackground(layerDrawable);
        return view;
    }

    public final View LJ() {
        View view = new View(this.LIZIZ);
        int iLIZIZ = (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LJJIJL))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LJJIJIIJIL)))) / 2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(this.LJJIJIIJI);
        LayerDrawable layerDrawable = new LayerDrawable(new GradientDrawable[]{gradientDrawable});
        layerDrawable.setLayerInset(0, iLIZIZ, 0, iLIZIZ, 0);
        view.setBackground(layerDrawable);
        return view;
    }

    public final void LJI() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        TextView textView = this.LJJIIJZLJL;
        if (textView == null) {
            textView = this.LJIIIZ;
        }
        LJII(textView);
        try {
            Magnifier magnifier = this.LJJIIJ;
            if (magnifier != null) {
                magnifier.dismiss();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJIIIIZZ() {
        Spannable spannable;
        LJII(this.LJIIIZ);
        ActionMode actionMode = this.LJII;
        if (actionMode != null) {
            actionMode.finish();
            return;
        }
        TextView textView = this.LJIIIZ;
        CharSequence text = textView != null ? textView.getText() : null;
        if ((text instanceof Spannable) && (spannable = (Spannable) text) != null) {
            Selection.removeSelection(spannable);
            textView.clearFocus();
        }
        LJFF(true, true);
    }

    public final ViewGroup LJIILIIL() {
        C19EG activity;
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.LJI.LIZLLL;
        if (viewGroup2 != null && (viewGroup = (ViewGroup) viewGroup2.findViewById(R.id.ea2)) != null) {
            return viewGroup;
        }
        Fragment fragment = this.LIZ;
        if (fragment == null || (activity = fragment.getActivity()) == null) {
            return null;
        }
        return (ViewGroup) activity.findViewById(android.R.id.content);
    }

    public final void LJIILJJIL() {
        C0P0T c0p0t = this.LJIIIIZZ;
        if (c0p0t == null || !c0p0t.isShowing() || this.LJIILLIIL) {
            return;
        }
        this.LJIILLIIL = true;
        ViewGroup viewGroup = c0p0t.LJIILL().LIZJ;
        if (viewGroup == null || viewGroup.getChildCount() < 2) {
            return;
        }
        C786410Ut5.LJLLLLLL(4, viewGroup.getChildAt(viewGroup.getChildCount() - 2));
    }

    public final void LJIIZILJ() {
        Iterator<Function0<Unit>> it2 = this.LJIIL.iterator();
        while (it2.hasNext()) {
            it2.next().invoke();
        }
        ((ArrayList) this.LJIIL).clear();
    }

    public final void LJIJ() {
        TextView textView;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserverOnPreDrawListenerC738800SyU viewTreeObserverOnPreDrawListenerC738800SyU = this.LJJII;
        if (viewTreeObserverOnPreDrawListenerC738800SyU != null && (textView = this.LJIIIZ) != null && (viewTreeObserver = textView.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC738800SyU);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnPreDrawListenerC738800SyU, ViewTreeObserver.OnPreDrawListener.class);
        }
        this.LJJII = null;
        List listLJIJI = C13LQ.LJIJI(new View[]{this.LJIL, this.LJJ, this.LJJI, this.LJJIFFI});
        if (!((ArrayList) listLJIJI).isEmpty()) {
            C786410Ut5.LJJZZIII(this.LJIILIIL, new ARunnableS102S0100000_2(listLJIJI, 88));
        }
        this.LJIL = null;
        this.LJJ = null;
        this.LJJI = null;
        this.LJJIFFI = null;
    }

    public final void LJIJI() {
        View view = this.LJIIJ;
        if (view != null) {
            C786410Ut5.LJJZZIII(this.LJIILIIL, new ARunnableS102S0100000_2(view, 89));
            this.LJIIJ = null;
        }
    }

    public static void LJII(TextView textView) {
        if (textView == null) {
            return;
        }
        try {
            Field declaredField = TextView.class.getDeclaredField("mEditor");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(textView);
            if (obj != null) {
                LJIILL(obj, "hideCursorAndSpanControllers");
                LJIILL(obj, "stopTextActionMode");
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static String LJIIJ(TextView textView) {
        CharSequence text;
        int selectionStart = textView.getSelectionStart();
        int selectionEnd = textView.getSelectionEnd();
        if (selectionStart < 0 || selectionEnd < 0 || selectionStart == selectionEnd || (text = textView.getText()) == null) {
            return null;
        }
        return text.subSequence(Math.min(selectionStart, selectionEnd), Math.max(selectionStart, selectionEnd)).toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(final AppCompatTextView appCompatTextView) {
        C0SP0 c0sp0;
        ViewParent parent = appCompatTextView.getParent();
        while (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.getDescendantFocusability() == 393216) {
                viewGroup.setDescendantFocusability(262144);
            }
            parent = viewGroup.getParent();
        }
        appCompatTextView.setTextIsSelectable(true);
        Object obj = null;
        if ((appCompatTextView instanceof C0SP0) && (c0sp0 = (C0SP0) appCompatTextView) != null) {
            c0sp0.setShouldBlockSystemSelectionActionMode(true);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                appCompatTextView.setTextSelectHandle(LIZLLL());
                appCompatTextView.setTextSelectHandleLeft(LIZLLL());
                appCompatTextView.setTextSelectHandleRight(LIZLLL());
                appCompatTextView.setTextCursorDrawable(LIZLLL());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            Field declaredField = TextView.class.getDeclaredField("mEditor");
            declaredField.setAccessible(true);
            obj = declaredField.get(appCompatTextView);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        if (obj != null) {
            LJIILL(obj, "hideCursorAndSpanControllers");
            LJIILL(obj, "stopTextActionMode");
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mInsertionControllerEnabled");
                declaredField2.setAccessible(true);
                declaredField2.setBoolean(obj, false);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
            }
            try {
                Field declaredField3 = obj.getClass().getDeclaredField("mSelectionControllerEnabled");
                declaredField3.setAccessible(true);
                declaredField3.setBoolean(obj, false);
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
            }
        }
        appCompatTextView.setHighlightColor(0);
        appCompatTextView.setMovementMethod(LinkMovementMethod.getInstance());
        appCompatTextView.setCustomSelectionActionModeCallback(new ActionMode.Callback() { // from class: X.0SX5
            @Override // android.view.ActionMode.Callback
            public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                return false;
            }

            @Override // android.view.ActionMode.Callback
            public final void onDestroyActionMode(ActionMode actionMode) {
                this.LJII = null;
                int selectionStart = appCompatTextView.getSelectionStart();
                int selectionEnd = appCompatTextView.getSelectionEnd();
                if (selectionStart >= 0 && selectionEnd >= 0 && selectionStart != selectionEnd) {
                    C0SX4 c0sx4 = this;
                    c0sx4.LJIJ = selectionStart;
                    c0sx4.LJIJI = selectionEnd;
                    c0sx4.LJIJJ = true;
                    c0sx4.LJIILIIL.removeCallbacks(c0sx4.LJIILL);
                    C0SX4 c0sx42 = this;
                    C786410Ut5.LJLIIL(100L, c0sx42.LJIILIIL, c0sx42.LJIILL);
                    return;
                }
                this.LJFF(true, true);
            }

            @Override // android.view.ActionMode.Callback
            public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                Spannable spannable;
                C0SX4 c0sx4 = this;
                TextView textView = appCompatTextView;
                c0sx4.getClass();
                String strLJIIJ = C0SX4.LJIIJ(textView);
                if (strLJIIJ != null && !a0.LJJJIL(strLJIIJ)) {
                    this.LJII = actionMode;
                    menu.clear();
                    TextView textView2 = appCompatTextView;
                    HandlerHook.viewPost(textView2, new ARunnableS80S0200000_11(textView2, this, 63));
                    return true;
                }
                CharSequence text = appCompatTextView.getText();
                if (!(text instanceof Spannable) || (spannable = (Spannable) text) == null) {
                    return false;
                }
                Selection.removeSelection(spannable);
                return false;
            }

            @Override // android.view.ActionMode.Callback
            public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                menu.clear();
                TextView textView = appCompatTextView;
                HandlerHook.viewPost(textView, new ARunnableS80S0200000_11(textView, this, 64));
                return true;
            }
        });
        appCompatTextView.setCustomInsertionActionModeCallback(new ActionMode.Callback() { // from class: X.0SX9
            @Override // android.view.ActionMode.Callback
            public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                return false;
            }

            @Override // android.view.ActionMode.Callback
            public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }

            @Override // android.view.ActionMode.Callback
            public final void onDestroyActionMode(ActionMode actionMode) {
            }

            @Override // android.view.ActionMode.Callback
            public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }
        });
        final GestureDetector gestureDetector = new GestureDetector(this.LIZIZ, new C21648719nx() { // from class: X.0SWy
            @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                this.LJI.LJIIIIZZ.LLLIIII.postValue(new Pair<>(Float.valueOf(motionEvent.getRawX()), Float.valueOf(motionEvent.getRawY())));
                return false;
            }

            /* JADX WARN: Removed duplicated region for block: B:101:0x02b3  */
            @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onLongPress(android.view.MotionEvent r21) {
                /*
                    Method dump skipped, instruction units count: 1050
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C722820SWy.onLongPress(android.view.MotionEvent):void");
            }

            @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                if (Intrinsics.LJFF(this.LJIIIZ, appCompatTextView)) {
                    this.LJIIIIZZ();
                    this.LJI.LJIIIIZZ.LLLIIIIL.postValue(new Pair<>(Float.valueOf(motionEvent.getRawX()), Float.valueOf(motionEvent.getRawY())));
                    return true;
                }
                return false;
            }
        });
        final C013C c013c = new C013C();
        final C013C c013c2 = new C013C();
        final C238400w2 c238400w2 = new C238400w2();
        final long doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout();
        appCompatTextView.setOnTouchListener(new View.OnTouchListener() { // from class: X.0SX0
            /* JADX WARN: Removed duplicated region for block: B:38:0x00c8  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00ca  */
            @Override // android.view.View.OnTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
                /*
                    Method dump skipped, instruction units count: 218
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0SX0.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }
        });
        ((ArrayList) this.LJIIJJI).add(appCompatTextView);
    }

    public final int LJIIIZ(ViewGroup viewGroup) {
        Fragment fragment;
        C19EG activity;
        View viewFindViewById;
        int iLIZIZ;
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) - iArr[1];
        int[] iArr2 = {R.id.jjt, R.id.jju, R.id.qee, R.id.rl3};
        int i = 0;
        do {
            int i2 = iArr2[i];
            ViewGroup viewGroup2 = this.LJI.LIZLLL;
            if (((viewGroup2 != null && (viewFindViewById = viewGroup2.findViewById(i2)) != null) || ((fragment = this.LIZ) != null && (activity = fragment.getActivity()) != null && (viewFindViewById = activity.findViewById(i2)) != null)) && viewFindViewById.getVisibility() == 0 && viewFindViewById.getHeight() > 0) {
                Rect rect = new Rect();
                if (viewFindViewById.getGlobalVisibleRect(rect) && (iLIZIZ = (rect.bottom - iArr[1]) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) > iLIZIZ2) {
                    iLIZIZ2 = iLIZIZ;
                }
            }
            i++;
        } while (i < 4);
        return iLIZIZ2;
    }

    public final View LJIIL(TextView textView) {
        ViewGroup viewGroupLJIILIIL = LJIILIIL();
        if (viewGroupLJIILIIL != null) {
            View view = textView;
            while (view != null) {
                if (view == viewGroupLJIILIIL) {
                    return viewGroupLJIILIIL;
                }
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            }
        }
        return textView;
    }

    public final void LJIILLIIL(RecyclerView recyclerView) {
        if (Build.VERSION.SDK_INT >= 29 && recyclerView.isAttachedToWindow()) {
            if (recyclerView.isComputingLayout()) {
                HandlerHook.viewPost(recyclerView, new ARunnableS80S0200000_11(this, recyclerView, 60));
                return;
            }
            try {
                recyclerView.suppressLayout(false);
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
                HandlerHook.viewPost(recyclerView, new ARunnableS80S0200000_11(this, recyclerView, 61));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIJJ(TextView textView) {
        ViewGroup viewGroupLJIILIIL;
        Layout layout = textView.getLayout();
        if (layout == null) {
            return;
        }
        int selectionStart = textView.getSelectionStart();
        int selectionEnd = textView.getSelectionEnd();
        if (selectionStart < 0 || selectionEnd < 0 || selectionStart == selectionEnd || (viewGroupLJIILIIL = LJIILIIL()) == null) {
            return;
        }
        int[] iArr = new int[2];
        viewGroupLJIILIIL.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        textView.getLocationOnScreen(iArr2);
        int totalPaddingLeft = ((iArr2[0] - iArr[0]) + textView.getTotalPaddingLeft()) - textView.getScrollX();
        int totalPaddingTop = ((iArr2[1] - iArr[1]) + textView.getTotalPaddingTop()) - textView.getScrollY();
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LJJIJIL)));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LJJIJL)));
        Rect rect = new Rect();
        C013C c013c = new C013C();
        boolean globalVisibleRect = textView.getGlobalVisibleRect(rect);
        c013c.element = globalVisibleRect;
        if (globalVisibleRect) {
            ViewParent parent = textView.getParent();
            while (true) {
                if (parent == 0) {
                    break;
                }
                if (parent instanceof RecyclerView) {
                    Rect rect2 = new Rect();
                    if (((View) parent).getGlobalVisibleRect(rect2)) {
                        c013c.element = rect.intersect(rect2);
                    }
                } else {
                    parent = parent.getParent();
                }
            }
        }
        LJIJJLI(c013c, layout, iArr2, textView, rect, totalPaddingLeft, iLIZIZ2, totalPaddingTop, iLIZIZ, this.LJIL, this.LJJI, Math.min(selectionStart, selectionEnd), true);
        LJIJJLI(c013c, layout, iArr2, textView, rect, totalPaddingLeft, iLIZIZ2, totalPaddingTop, iLIZIZ, this.LJJ, this.LJJIFFI, Math.max(selectionStart, selectionEnd), false);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [X.0SX6, android.view.ViewTreeObserver$OnScrollChangedListener] */
    public final void LJJ(TextView textView) {
        boolean z;
        if (this.LJIIZILJ && this.LJIIIZ == null && this.LJIIIIZZ == null && this.LJJIIJZLJL == textView) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !z;
        LJFF(z2, z2);
        String strLJIIJ = LJIIJ(textView);
        if (strLJIIJ != null && !a0.LJJJIL(strLJIIJ)) {
            this.LJIIIZ = textView;
            LJIJ();
            ViewGroup viewGroupLJIILIIL = LJIILIIL();
            if (viewGroupLJIILIIL != null) {
                this.LJIL = LJ();
                this.LJJ = LJ();
                this.LJJI = LIZJ();
                this.LJJIFFI = LIZJ();
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LJJIJL)));
                viewGroupLJIILIIL.addView(this.LJIL, new FrameLayout.LayoutParams(iLIZIZ, 0));
                viewGroupLJIILIIL.addView(this.LJJ, new FrameLayout.LayoutParams(iLIZIZ, 0));
                viewGroupLJIILIIL.addView(this.LJJI, new FrameLayout.LayoutParams(iLIZIZ, iLIZIZ));
                viewGroupLJIILIIL.addView(this.LJJIFFI, new FrameLayout.LayoutParams(iLIZIZ, iLIZIZ));
                View view = this.LJIL;
                if (view != null) {
                    LJIL(view, textView, true);
                }
                View view2 = this.LJJ;
                if (view2 != null) {
                    LJIL(view2, textView, false);
                }
                View view3 = this.LJJI;
                if (view3 != null) {
                    LJIL(view3, textView, true);
                }
                View view4 = this.LJJIFFI;
                if (view4 != null) {
                    LJIL(view4, textView, false);
                }
                LJIJJ(textView);
                LJJII(textView);
                if (Build.VERSION.SDK_INT >= 29) {
                    View viewLJIIL = this.LJJIIZ;
                    if (viewLJIIL == null) {
                        viewLJIIL = LJIIL(textView);
                    }
                    HandlerHook.viewPost(viewLJIIL, new C0SX7(viewLJIIL, this));
                }
                ViewTreeObserverOnPreDrawListenerC738800SyU viewTreeObserverOnPreDrawListenerC738800SyU = new ViewTreeObserverOnPreDrawListenerC738800SyU(textView, this, 1);
                this.LJJII = viewTreeObserverOnPreDrawListenerC738800SyU;
                C786410Ut5.y3(textView.getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC738800SyU);
            }
            LJIIZILJ();
            ViewParent parent = textView.getParent();
            while (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (!(viewGroup instanceof RecyclerView) && !(viewGroup instanceof C21578619ce) && !(viewGroup instanceof ScrollView)) {
                    parent = viewGroup.getParent();
                } else {
                    ?? r3 = new ViewTreeObserver.OnScrollChangedListener() { // from class: X.0SX6
                        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                        public final void onScrollChanged() {
                            C0SX4 c0sx4 = this.LL;
                            TextView textView2 = c0sx4.LJIIIZ;
                            if (textView2 != null) {
                                c0sx4.LJIILIIL.removeCallbacks(c0sx4.LJIILL);
                                if (textView2.getSelectionStart() >= 0 && textView2.getSelectionEnd() >= 0 && textView2.getSelectionStart() != textView2.getSelectionEnd()) {
                                    c0sx4.LJIJ = textView2.getSelectionStart();
                                    c0sx4.LJIJI = textView2.getSelectionEnd();
                                }
                                c0sx4.LJIJJ(textView2);
                                c0sx4.LJIILJJIL();
                                c0sx4.LJIILIIL.removeCallbacks(c0sx4.LJIILJJIL);
                                C786410Ut5.LJLIIL(150L, c0sx4.LJIILIIL, c0sx4.LJIILJJIL);
                            }
                        }
                    };
                    C786410Ut5.z3(viewGroup.getViewTreeObserver(), r3);
                    ((ArrayList) this.LJIIL).add(new AwS412S0200000_11(viewGroup, (C0SX6) r3, 85));
                    break;
                }
            }
            LJJIIJ(textView);
        }
    }

    public final void LJJII(TextView textView) {
        Spannable spannable;
        int iIntValue;
        int selectionStart = textView.getSelectionStart();
        int selectionEnd = textView.getSelectionEnd();
        if (selectionStart == this.LJJIIZI && selectionEnd == this.LJJIJ) {
            return;
        }
        this.LJJIIZI = selectionStart;
        this.LJJIJ = selectionEnd;
        CharSequence text = textView.getText();
        if ((text instanceof Spannable) && (spannable = (Spannable) text) != null) {
            BackgroundColorSpan backgroundColorSpan = this.LJJIII;
            if (backgroundColorSpan != null) {
                spannable.removeSpan(backgroundColorSpan);
            }
            if (selectionStart >= 0 && selectionEnd >= 0 && selectionStart != selectionEnd) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a06, this.LIZIZ);
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = this.LJJIJIIJI;
                }
                BackgroundColorSpan backgroundColorSpan2 = new BackgroundColorSpan(iIntValue);
                C786410Ut5.o2(spannable, backgroundColorSpan2, Math.min(selectionStart, selectionEnd), Math.max(selectionStart, selectionEnd), 33);
                this.LJJIII = backgroundColorSpan2;
                return;
            }
            this.LJJIII = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIII(android.widget.TextView r20) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SX4.LJJIII(android.widget.TextView):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x025f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJ(android.widget.TextView r13) {
        /*
            Method dump skipped, instruction units count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SX4.LJJIIJ(android.widget.TextView):void");
    }

    public final void LJJIIJZLJL(TextView textView) {
        LJIJJ(textView);
        LJJII(textView);
    }

    public static int[] LJIIJJI(ViewGroup viewGroup, TextView textView) {
        float width;
        int selectionStart = textView.getSelectionStart();
        int selectionEnd = textView.getSelectionEnd();
        Layout layout = textView.getLayout();
        int[] iArr = new int[2];
        textView.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        if (viewGroup != null) {
            viewGroup.getLocationOnScreen(iArr2);
        }
        if (layout != null && selectionStart >= 0 && selectionEnd >= 0) {
            int iMin = Math.min(selectionStart, selectionEnd);
            int iMax = Math.max(selectionStart, selectionEnd);
            int i = iMax - 1;
            if (i < iMin) {
                i = iMin;
            }
            int lineForOffset = layout.getLineForOffset(iMin);
            int lineForOffset2 = layout.getLineForOffset(i);
            float primaryHorizontal = layout.getPrimaryHorizontal(iMin);
            float primaryHorizontal2 = layout.getPrimaryHorizontal(iMax);
            if (lineForOffset == lineForOffset2) {
                width = (primaryHorizontal + primaryHorizontal2) / 2.0f;
            } else {
                width = textView.getWidth() / 2.0f;
            }
            return new int[]{(int) ((((iArr[0] - iArr2[0]) + textView.getTotalPaddingLeft()) + width) - textView.getScrollX()), (((iArr[1] - iArr2[1]) + textView.getTotalPaddingTop()) + layout.getLineTop(lineForOffset)) - textView.getScrollY(), (((iArr[1] - iArr2[1]) + textView.getTotalPaddingTop()) + layout.getLineBottom(lineForOffset2)) - textView.getScrollY()};
        }
        return new int[]{(iArr[0] - iArr2[0]) + (textView.getWidth() / 2), iArr[1] - iArr2[1], (iArr[1] - iArr2[1]) + textView.getHeight()};
    }

    public static void LJIILL(Object obj, String str) {
        try {
            Method declaredMethod = obj.getClass().getDeclaredMethod(str, new Class[0]);
            declaredMethod.setAccessible(true);
            C2204961BRm.a0(declaredMethod, obj, new Object[0], new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+hLYnH2SU3fvhA2sKjb495Ls5SzEQo0HM1g5sBD7KWxb8x", null));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJFF(boolean z, boolean z2) {
        Spannable spannable;
        this.LJIILIIL.removeCallbacks(this.LJIILJJIL);
        this.LJIILIIL.removeCallbacks(this.LJIILL);
        LJII(this.LJIIIZ);
        this.LJIILLIIL = false;
        if (z2) {
            this.LJIIZILJ = false;
        }
        this.LJIJ = -1;
        this.LJIJI = -1;
        this.LJIJJ = false;
        LJIIZILJ();
        LJIJI();
        TextView textView = this.LJIIIZ;
        if (textView != null) {
            CharSequence text = textView.getText();
            if ((text instanceof Spannable) && (spannable = (Spannable) text) != null) {
                BackgroundColorSpan backgroundColorSpan = this.LJJIII;
                if (backgroundColorSpan != null) {
                    spannable.removeSpan(backgroundColorSpan);
                }
                this.LJJIII = null;
                this.LJJIIZI = -1;
                this.LJJIJ = -1;
            }
        }
        if (z) {
            LJI();
        }
        LJIJ();
        this.LJIIIZ = null;
        C0P0T c0p0t = this.LJIIIIZZ;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
        this.LJIIIIZZ = null;
    }

    public static final boolean LIZIZ(float f, float f2, View view) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (f < iArr[0] || f > r1 + view.getWidth()) {
            return false;
        }
        if (f2 < iArr[1] || f2 > r1 + view.getHeight()) {
            return false;
        }
        return true;
    }

    public final void LJIL(final View view, final TextView textView, final boolean z) {
        final C118300cf c118300cf = new C118300cf();
        c118300cf.element = -1;
        view.setOnTouchListener(new View.OnTouchListener() { // from class: X.0SX1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean z2;
                int i;
                int iU3;
                Spannable spannable;
                int i2;
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action != 2) {
                            if (action != 3) {
                                return false;
                            }
                        } else {
                            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            int iMin = Math.min(textView.getSelectionStart(), textView.getSelectionEnd());
                            int iMax = Math.max(textView.getSelectionStart(), textView.getSelectionEnd());
                            int i3 = c118300cf.element;
                            if (i3 == iMax) {
                                z2 = true;
                            } else if (i3 == iMin) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            C0SX4 c0sx4 = this;
                            TextView textView2 = textView;
                            float rawX = motionEvent.getRawX();
                            float rawY = motionEvent.getRawY();
                            c0sx4.getClass();
                            textView2.getLocationOnScreen(new int[2]);
                            float totalPaddingLeft = ((rawX - r7[0]) - textView2.getTotalPaddingLeft()) + textView2.getScrollX();
                            float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c0sx4.LJJIJIL))) / 2.0f;
                            if (z2) {
                                i = 1;
                            } else {
                                i = -1;
                            }
                            int totalPaddingTop = (int) ((((rawY + (fLIZIZ * i)) - r7[1]) - textView2.getTotalPaddingTop()) + textView2.getScrollY());
                            Layout layout = textView2.getLayout();
                            if (layout == null || (iU3 = C786410Ut5.U3(layout, layout.getLineForVertical(C13LZ.LJ(totalPaddingTop, 0, layout.getHeight())), totalPaddingLeft)) < 0 || c118300cf.element < 0) {
                                return true;
                            }
                            CharSequence text = textView.getText();
                            if (!(text instanceof Spannable) || (spannable = (Spannable) text) == null || iU3 == (i2 = c118300cf.element)) {
                                return true;
                            }
                            Selection.setSelection(spannable, i2, iU3);
                            this.LJJIIJZLJL(textView);
                            return true;
                        }
                    }
                    for (ViewParent parent2 = view.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                        parent2.requestDisallowInterceptTouchEvent(false);
                    }
                    this.LJI();
                    C0SX4 c0sx42 = this;
                    TextView textView3 = textView;
                    if (c0sx42.LJIIZILJ) {
                        c0sx42.LJIIZILJ = false;
                        HandlerHook.viewPost(textView3, new ARunnableS80S0200000_11(textView3, c0sx42, 66));
                    }
                    c118300cf.element = -1;
                    return true;
                }
                for (ViewParent parent3 = view.getParent(); parent3 != null; parent3 = parent3.getParent()) {
                    parent3.requestDisallowInterceptTouchEvent(true);
                }
                int iMin2 = Math.min(textView.getSelectionStart(), textView.getSelectionEnd());
                int iMax2 = Math.max(textView.getSelectionStart(), textView.getSelectionEnd());
                C118300cf c118300cf2 = c118300cf;
                if (z) {
                    iMin2 = iMax2;
                }
                c118300cf2.element = iMin2;
                C0SX4 c0sx43 = this;
                TextView textView4 = textView;
                c0sx43.LJIIZILJ = true;
                C0SX4.LJII(textView4);
                c0sx43.LJIJJ(textView4);
                c0sx43.LJJII(textView4);
                c0sx43.LJIILJJIL();
                return true;
            }
        });
    }

    public static final TuxTextView LJJI(C0SX4 c0sx4, int i, int i2, String str, Function0 function0) {
        TuxTextView tuxTextView = new TuxTextView(c0sx4.LIZIZ, null, 6, 0);
        tuxTextView.setText(str);
        tuxTextView.setTextColor(i);
        tuxTextView.setTuxFont(i2);
        tuxTextView.setMaxLines(1);
        tuxTextView.setGravity(17);
        tuxTextView.setIncludeFontPadding(false);
        tuxTextView.setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c0sx4.LJJIJLIJ))));
        tuxTextView.setMinimumHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c0sx4.LJJIL))));
        tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c0sx4.LJJIZ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c0sx4.LJJJ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c0sx4.LJJIZ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c0sx4.LJJJ))));
        C427690Gpr.LJ(tuxTextView, C418440Gaw.LIZIZ(10));
        C786410Ut5.h9(tuxTextView, new ACListenerS146S0100000_11(function0, 82));
        return tuxTextView;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ae A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIFFI(android.widget.TextView r8, float r9, float r10, float r11, float r12) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SX4.LJJIFFI(android.widget.TextView, float, float, float, float):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0SX4(Fragment fragment, Context context, Aweme aweme, String str, String str2, String str3, C0SRL c0srl) {
        int color;
        LifecycleOwner viewLifecycleOwner;
        this.LIZ = fragment;
        this.LIZIZ = context;
        this.LIZJ = aweme;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = c0srl;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1r, context);
        if (numLIZJ != null) {
            color = numLIZJ.intValue();
        } else {
            color = ColorProtector.parseColor("#FE2C55");
        }
        this.LJJIJIIJI = color;
        this.LJJIJIIJIL = 2;
        this.LJJIJIL = 12;
        this.LJJIJL = 32;
        this.LJJIJLIJ = 74;
        this.LJJIL = 34;
        this.LJJIZ = 12;
        this.LJJJ = 8;
        this.LJJJI = 100;
        this.LJJJIL = 66;
        this.LJJJJ = 12;
        this.LJJJJI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1563));
        List<WeakReference<C0SX4>> list = LJJJJIZL;
        synchronized (list) {
            try {
                C19719612Di.LJJIIJ(list, new AwS590S0100000_11(this, 513), true);
                ((ArrayList) list).add(new WeakReference(this));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if ((fragment != null && (viewLifecycleOwner = fragment.getViewLifecycleOwner()) != null) || ((context instanceof LifecycleOwner) && (viewLifecycleOwner = (LifecycleOwner) context) != null)) {
            c0srl.LJIIIIZZ.LLLIIIIL.observe(viewLifecycleOwner, new AObserverS215S0100000_11(this, 44));
            c0srl.LJIIIIZZ.LLLIIL.observe(viewLifecycleOwner, new AObserverS215S0100000_11(this, 45));
            c0srl.LJIIIIZZ.LLILZLL.observe(viewLifecycleOwner, new AObserverS215S0100000_11(this, 46));
            c0srl.LJIIIIZZ.LLLIILIL.observe(viewLifecycleOwner, new AObserverS215S0100000_11(this, 47));
        }
    }

    public static final void LJIJJLI(C013C c013c, Layout layout, int[] iArr, TextView textView, Rect rect, int i, int i2, int i3, int i4, View view, View view2, int i5, boolean z) {
        FrameLayout.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        int i6;
        if (view == null || view2 == null) {
            return;
        }
        if (!c013c.element) {
            C786410Ut5.LJLLLLLL(4, view);
            C786410Ut5.LJLLLLLL(4, view2);
            return;
        }
        int lineForOffset = layout.getLineForOffset(i5);
        float primaryHorizontal = layout.getPrimaryHorizontal(i5);
        int lineTop = layout.getLineTop(lineForOffset);
        int lineBottom = layout.getLineBottom(lineForOffset);
        int i7 = lineBottom - lineTop;
        int totalPaddingTop = ((iArr[1] + textView.getTotalPaddingTop()) - textView.getScrollY()) + lineTop;
        if (totalPaddingTop + i7 > rect.top && totalPaddingTop < rect.bottom) {
            C786410Ut5.LJLLLLLL(0, view);
            C786410Ut5.LJLLLLLL(0, view2);
            int i8 = i + ((int) primaryHorizontal);
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            if (!(layoutParams3 instanceof FrameLayout.LayoutParams) || (layoutParams = (FrameLayout.LayoutParams) layoutParams3) == null) {
                layoutParams = new FrameLayout.LayoutParams(i2, i7);
            }
            layoutParams.width = i2;
            layoutParams.height = i7;
            layoutParams.gravity = 0;
            int i9 = i2 / 2;
            int i10 = i8 - i9;
            layoutParams.leftMargin = i10;
            int i11 = lineTop + i3;
            layoutParams.topMargin = i11;
            C786410Ut5.W5(view, layoutParams);
            ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
            if (!(layoutParams4 instanceof FrameLayout.LayoutParams) || (layoutParams2 = (FrameLayout.LayoutParams) layoutParams4) == null) {
                layoutParams2 = new FrameLayout.LayoutParams(i2, i2);
            }
            layoutParams2.width = i2;
            layoutParams2.height = i2;
            layoutParams2.gravity = 0;
            layoutParams2.leftMargin = i10;
            if (z) {
                i6 = i11 - (i4 / 2);
            } else {
                i6 = i3 + lineBottom + (i4 / 2);
            }
            layoutParams2.topMargin = i6 - i9;
            C786410Ut5.W5(view2, layoutParams2);
            return;
        }
        C786410Ut5.LJLLLLLL(4, view);
        C786410Ut5.LJLLLLLL(4, view2);
    }
}
