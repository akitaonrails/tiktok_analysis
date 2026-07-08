package X;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.14JX, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14JX {
    public static C20244614Jg LIZ(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C20244614Jg c20244614JgLIZLLL = C20244614Jg.LIZLLL(null, rootWindowInsets);
        c20244614JgLIZLLL.LIZ.LJIILL(c20244614JgLIZLLL);
        c20244614JgLIZLLL.LIZ.LIZLLL(view.getRootView());
        return c20244614JgLIZLLL;
    }

    public static void LIZIZ(final View view, final InterfaceC20244014Ja interfaceC20244014Ja) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.x1y, interfaceC20244014Ja);
        }
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: X.14JY
            public C20244614Jg LIZ;

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                C20244614Jg c20244614JgLIZLLL = C20244614Jg.LIZLLL(view2, windowInsets);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    View view3 = view;
                    View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view3.getTag(R.id.x2k);
                    if (onApplyWindowInsetsListener != null) {
                        onApplyWindowInsetsListener.onApplyWindowInsets(view3, windowInsets);
                    }
                    if (c20244614JgLIZLLL.equals(this.LIZ)) {
                        return interfaceC20244014Ja.LIZ(view2, c20244614JgLIZLLL).LIZJ();
                    }
                }
                this.LIZ = c20244614JgLIZLLL;
                C20244614Jg c20244614JgLIZ = interfaceC20244014Ja.LIZ(view2, c20244614JgLIZLLL);
                if (i >= 30) {
                    return c20244614JgLIZ.LIZJ();
                }
                view2.requestApplyInsets();
                return c20244614JgLIZ.LIZJ();
            }
        });
    }

    public static void LIZJ(View view, final C14JV c14jv) {
        WindowInsetsAnimation.Callback callback = null;
        if (Build.VERSION.SDK_INT >= 30) {
            if (c14jv != null) {
                callback = new WindowInsetsAnimation.Callback(c14jv) { // from class: X.14JS
                    public final C14JV LIZ;
                    public List<C14JT> LIZIZ;
                    public ArrayList<C14JT> LIZJ;
                    public final HashMap<WindowInsetsAnimation, C14JT> LIZLLL;

                    {
                        super(c14jv.LIZIZ);
                        this.LIZLLL = new HashMap<>();
                        this.LIZ = c14jv;
                    }

                    public final C14JT LIZ(WindowInsetsAnimation windowInsetsAnimation) {
                        C14JT c14jt = this.LIZLLL.get(windowInsetsAnimation);
                        if (c14jt == null) {
                            C14JT c14jt2 = new C14JT(windowInsetsAnimation);
                            this.LIZLLL.put(windowInsetsAnimation, c14jt2);
                            return c14jt2;
                        }
                        return c14jt;
                    }

                    @Override // android.view.WindowInsetsAnimation.Callback
                    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                        this.LIZ.LIZIZ(LIZ(windowInsetsAnimation));
                        this.LIZLLL.remove(windowInsetsAnimation);
                    }

                    @Override // android.view.WindowInsetsAnimation.Callback
                    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                        this.LIZ.LIZJ(LIZ(windowInsetsAnimation));
                    }

                    @Override // android.view.WindowInsetsAnimation.Callback
                    public final WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                        ArrayList<C14JT> arrayList = this.LIZJ;
                        if (arrayList == null) {
                            ArrayList<C14JT> arrayList2 = new ArrayList<>(list.size());
                            this.LIZJ = arrayList2;
                            this.LIZIZ = Collections.unmodifiableList(arrayList2);
                        } else {
                            arrayList.clear();
                        }
                        for (int size = list.size() - 1; size >= 0; size--) {
                            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) ListProtector.get(list, size);
                            C14JT c14jtLIZ = LIZ(windowInsetsAnimation);
                            c14jtLIZ.LIZIZ(windowInsetsAnimation.getFraction());
                            this.LIZJ.add(c14jtLIZ);
                        }
                        C14JV c14jv2 = this.LIZ;
                        C20244614Jg c20244614JgLIZLLL = C20244614Jg.LIZLLL(null, windowInsets);
                        c14jv2.LIZLLL(c20244614JgLIZLLL, this.LIZIZ);
                        return c20244614JgLIZLLL.LIZJ();
                    }

                    @Override // android.view.WindowInsetsAnimation.Callback
                    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                        C14JV c14jv2 = this.LIZ;
                        C14JT c14jtLIZ = LIZ(windowInsetsAnimation);
                        C14JR c14jr = new C14JR(bounds);
                        c14jv2.LJ(c14jtLIZ, c14jr);
                        c14jr.getClass();
                        return new WindowInsetsAnimation.Bounds(c14jr.LIZ.LJ(), c14jr.LIZIZ.LJ());
                    }
                };
            }
            view.setWindowInsetsAnimationCallback(callback);
            return;
        }
        Object tag = view.getTag(R.id.x1y);
        if (c14jv == null) {
            view.setTag(R.id.x2k, null);
            if (tag != null) {
                return;
            }
            view.setOnApplyWindowInsetsListener(null);
            return;
        }
        View.OnApplyWindowInsetsListener c14jw = new C14JW(view, c14jv);
        view.setTag(R.id.x2k, c14jw);
        if (tag != null) {
            return;
        }
        view.setOnApplyWindowInsetsListener(c14jw);
    }
}
