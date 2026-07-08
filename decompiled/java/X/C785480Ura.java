package X;

import Y.ARunnableS112S0100000_12;
import android.R;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Ura, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C785480Ura {
    public static volatile boolean LIZIZ;
    public static final C785480Ura LIZ = new C785480Ura();
    public static final Set<FragmentManager> LIZJ = Collections.newSetFromMap(new WeakHashMap());
    public static final List<InterfaceC420801kM> LIZLLL = new ArrayList();
    public static final WeakHashMap<View, View.OnLayoutChangeListener> LJ = new WeakHashMap<>();

    public static Pair LIZLLL(View view) {
        if (view instanceof RecyclerView) {
            RecyclerView.LayoutManager layoutManager = ((RecyclerView) view).getLayoutManager();
            if (layoutManager instanceof GridLayoutManager) {
                return new Pair(view, layoutManager);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                Pair pairLIZLLL = LIZLLL(viewGroup.getChildAt(i));
                if (pairLIZLLL != null) {
                    return pairLIZLLL;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJ(Activity activity) {
        ViewGroup viewGroup;
        View childAt;
        View childAt2;
        if (activity instanceof C19EG) {
            FragmentManager supportFragmentManager = ((C19EG) activity).getSupportFragmentManager();
            if (LIZJ.add(supportFragmentManager)) {
                supportFragmentManager.LJZL(new AbstractC813200VvC() { // from class: X.0UrZ
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.AbstractC813200VvC
                    public final void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
                        View view;
                        C784520Uq2 c784520Uq2;
                        if (!(fragment instanceof InterfaceC785530Urf) || (view = fragment.getView()) == null) {
                            return;
                        }
                        C785450UrX c785450UrXLIZ = ((InterfaceC785530Urf) fragment).LIZ();
                        view.getContext();
                        if (C19252910Tv.LIZIZ.o4()) {
                            C0TF5 c0tf5 = c785450UrXLIZ.LIZ;
                            C0TF5 c0tf52 = C0TF5.NONE;
                            if (c0tf5 == c0tf52 && !c785450UrXLIZ.LJI) {
                                return;
                            }
                            if (c785450UrXLIZ.LJI) {
                                C785480Ura.LIZ(view, c785450UrXLIZ);
                            }
                            if (c785450UrXLIZ.LIZ == c0tf52) {
                                return;
                            }
                            int i = C785490Urb.LIZ[c785450UrXLIZ.LIZIZ.ordinal()];
                            if (i == 1) {
                                return;
                            }
                            if (i == 2) {
                                ViewParent parent = view.getParent();
                                if ((parent instanceof C784520Uq2) && (c784520Uq2 = (C784520Uq2) parent) != null) {
                                    c784520Uq2.setConfig(c785450UrXLIZ);
                                    C785480Ura.LIZJ(c784520Uq2, view, c785450UrXLIZ);
                                    c784520Uq2.requestLayout();
                                    c784520Uq2.invalidate();
                                    return;
                                }
                                return;
                            }
                            throw new C1954807lC();
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.AbstractC813200VvC
                    public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
                        ViewGroup viewGroup2;
                        if (!(fragment instanceof InterfaceC785530Urf)) {
                            return;
                        }
                        C785450UrX c785450UrXLIZ = ((InterfaceC785530Urf) fragment).LIZ();
                        view.getContext();
                        if (C19252910Tv.LIZIZ.o4()) {
                            C0TF5 c0tf5 = c785450UrXLIZ.LIZ;
                            C0TF5 c0tf52 = C0TF5.NONE;
                            if (c0tf5 == c0tf52 && !c785450UrXLIZ.LJI) {
                                return;
                            }
                            if (c0tf5 != c0tf52) {
                                int i = C785490Urb.LIZ[c785450UrXLIZ.LIZIZ.ordinal()];
                                if (i != 1) {
                                    if (i == 2) {
                                        ViewParent parent = view.getParent();
                                        if (!(parent instanceof ViewGroup) || (viewGroup2 = (ViewGroup) parent) == null || (viewGroup2 instanceof C784520Uq2)) {
                                            return;
                                        }
                                        int iIndexOfChild = viewGroup2.indexOfChild(view);
                                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                                        C786410Ut5.LJJJLZIJ(view, viewGroup2);
                                        C784520Uq2 c784520Uq2 = new C784520Uq2(view.getContext());
                                        c784520Uq2.setConfig(c785450UrXLIZ);
                                        C785480Ura.LIZJ(c784520Uq2, view, c785450UrXLIZ);
                                        c784520Uq2.addView(view, new FrameLayout.LayoutParams(-1, -1));
                                        viewGroup2.addView(c784520Uq2, iIndexOfChild, layoutParams);
                                    } else {
                                        throw new C1954807lC();
                                    }
                                } else {
                                    view.addOnLayoutChangeListener(new C0TF3(c785450UrXLIZ, view.getPaddingTop(), view.getPaddingBottom()));
                                }
                            }
                            if (!c785450UrXLIZ.LJI) {
                                return;
                            }
                            C785480Ura.LIZ(view, c785450UrXLIZ);
                        }
                    }
                }, true);
            }
        }
        if (activity instanceof InterfaceC785530Urf) {
            C785450UrX c785450UrXLIZ = ((InterfaceC785530Urf) activity).LIZ();
            if (C19252910Tv.LIZIZ.o4()) {
                C0TF5 c0tf5 = c785450UrXLIZ.LIZ;
                C0TF5 c0tf52 = C0TF5.NONE;
                if ((c0tf5 == c0tf52 && !c785450UrXLIZ.LJI) || (viewGroup = (ViewGroup) activity.findViewById(R.id.content)) == null || viewGroup.getChildCount() != 1 || (childAt = viewGroup.getChildAt(0)) == null) {
                    return;
                }
                if (childAt instanceof C784520Uq2) {
                    if (!c785450UrXLIZ.LJI || (childAt2 = ((ViewGroup) childAt).getChildAt(0)) == null) {
                        return;
                    }
                    LIZ(childAt2, c785450UrXLIZ);
                    return;
                }
                if (c785450UrXLIZ.LIZ != c0tf52) {
                    int i = C785510Urd.LIZ[c785450UrXLIZ.LIZIZ.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                            C786410Ut5.LJJJLZIJ(childAt, viewGroup);
                            C784520Uq2 c784520Uq2 = new C784520Uq2(childAt.getContext());
                            c784520Uq2.setConfig(c785450UrXLIZ);
                            LIZJ(c784520Uq2, childAt, c785450UrXLIZ);
                            c784520Uq2.addView(childAt, new FrameLayout.LayoutParams(-1, -1));
                            viewGroup.addView(c784520Uq2, 0, layoutParams);
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        childAt.addOnLayoutChangeListener(new C0TF3(c785450UrXLIZ, childAt.getPaddingTop(), childAt.getPaddingBottom()));
                    }
                }
                if (!c785450UrXLIZ.LJI) {
                    return;
                }
                LIZ(childAt, c785450UrXLIZ);
            }
        }
    }

    public static void LIZ(View view, C785450UrX c785450UrX) {
        if (!c785450UrX.LJI) {
            return;
        }
        WeakHashMap<View, View.OnLayoutChangeListener> weakHashMap = LJ;
        if (weakHashMap.containsKey(view)) {
            return;
        }
        ViewOnLayoutChangeListenerC785520Ure viewOnLayoutChangeListenerC785520Ure = new View.OnLayoutChangeListener() { // from class: X.0Ure
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                int i9 = i3 - i;
                int i10 = i7 - i5;
                if (i9 > 0 && i9 != i10) {
                    C785480Ura.LIZIZ(i9, view2);
                }
            }
        };
        weakHashMap.put(view, viewOnLayoutChangeListenerC785520Ure);
        view.addOnLayoutChangeListener(viewOnLayoutChangeListenerC785520Ure);
        HandlerHook.viewPost(view, new ARunnableS112S0100000_12(view, 5));
    }

    public static void LIZIZ(int i, View view) {
        Pair pairLIZLLL;
        int i2;
        if (i <= 0 || (pairLIZLLL = LIZLLL(view)) == null) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) pairLIZLLL.getFirst();
        GridLayoutManager gridLayoutManager = (GridLayoutManager) pairLIZLLL.getSecond();
        int i3 = gridLayoutManager.LLILLJJLI;
        if (i3 <= 0) {
            return;
        }
        if (i > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(900))) {
            i2 = 5;
        } else if (i > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(480))) {
            i2 = 4;
        } else if (i > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(360))) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        if (i2 != i3) {
            gridLayoutManager.LJIJ(i2);
            recyclerView.requestLayout();
        }
    }

    public static void LIZJ(C784520Uq2 c784520Uq2, View view, C785450UrX c785450UrX) {
        Drawable.ConstantState constantState;
        Drawable drawableNewDrawable;
        Drawable drawableMutate;
        Integer num = c785450UrX.LIZLLL;
        Drawable drawable = c785450UrX.LJ;
        if (num != null) {
            c784520Uq2.setBackgroundColor(num.intValue());
            return;
        }
        if (drawable != null) {
            c784520Uq2.setBackground(drawable);
            return;
        }
        Drawable background = view.getBackground();
        if (background != null && (constantState = background.getConstantState()) != null && (drawableNewDrawable = constantState.newDrawable()) != null && (drawableMutate = drawableNewDrawable.mutate()) != null) {
            background = drawableMutate;
        }
        c784520Uq2.setBackground(background);
    }
}
