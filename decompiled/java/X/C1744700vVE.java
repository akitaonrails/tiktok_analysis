package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0vVE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1744700vVE {
    public static final void LIZIZ(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) C786410Ut5.G2(activity.getApplication(), "input_method");
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            currentFocus.clearFocus();
        }
    }

    public static final void LIZJ(C0I7D c0i7d) {
        ((InputMethodManager) C786410Ut5.H2(c0i7d.getContext(), "input_method")).hideSoftInputFromWindow(c0i7d.getWindowToken(), 0);
        c0i7d.clearFocus();
    }

    public static final ViewGroup.MarginLayoutParams LJI(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return (ViewGroup.MarginLayoutParams) layoutParams;
        }
        return null;
    }

    public static final CharSequence LIZLLL(CharSequence charSequence, C1421710n6H... c1421710n6HArr) {
        try {
            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
            for (C1421710n6H c1421710n6H : c1421710n6HArr) {
                String str = c1421710n6H.LIZ;
                int i = c1421710n6H.LIZIZ;
                Function0<Object> function0 = c1421710n6H.LIZJ;
                int iLJJJ = a0.LJJJ(spannableStringBuilderValueOf, str, 0, false, 6);
                if (iLJJJ != -1) {
                    C786410Ut5.q2(spannableStringBuilderValueOf, new C0ID6(i, function0, 0), iLJJJ, str.length() + iLJJJ, 18);
                }
            }
            return spannableStringBuilderValueOf;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return charSequence;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJ(android.content.Context r3, java.lang.Boolean r4) {
        /*
            r2 = 0
            if (r3 != 0) goto L4
            return r2
        L4:
            if (r4 == 0) goto L14
            boolean r0 = r4.booleanValue()
        La:
            if (r0 == 0) goto L13
        Lc:
            boolean r0 = X.C960203pA.LIZIZ(r3)
            if (r0 == 0) goto L13
            r2 = 1
        L13:
            return r2
        L14:
            android.app.Activity r1 = X.C1388190mED.LIZ(r3)
            boolean r0 = r1 instanceof com.bytedance.ies.foundation.activity.BaseActivity
            if (r0 == 0) goto Lc
            com.bytedance.ies.foundation.activity.BaseActivity r1 = (com.bytedance.ies.foundation.activity.BaseActivity) r1
            if (r1 == 0) goto Lc
            boolean r0 = r1.isDarkModeSupported()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 == 0) goto Lc
            boolean r0 = r0.booleanValue()
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1744700vVE.LJ(android.content.Context, java.lang.Boolean):boolean");
    }

    public static final void LJIIIIZZ(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        C786410Ut5.W5(view, layoutParams);
    }

    public static final void LJIIIZ(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        C786410Ut5.W5(view, layoutParams);
    }

    public static final void LJIIJ(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        C786410Ut5.W5(view, layoutParams);
    }

    public static final void LJIIJJI(int i, Fragment fragment) {
        Window window;
        View decorView;
        C19EG activity = fragment.getActivity();
        if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.gi9, Integer.valueOf(i));
        }
    }

    public static final void LJIIL(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        C786410Ut5.W5(view, layoutParams);
    }

    public static final void LJIILIIL(int i, TuxTextView tuxTextView) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tuxTextView.getLayoutParams();
        if (C1744760vVK.LIZ()) {
            marginLayoutParams.rightMargin = i;
            marginLayoutParams.leftMargin = 0;
        } else {
            marginLayoutParams.leftMargin = i;
            marginLayoutParams.rightMargin = 0;
        }
        C786410Ut5.W5(tuxTextView, marginLayoutParams);
    }

    public static final void LJIILJJIL(View view, Function1<? super C19ME, Unit> function1) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C19ME) {
            if (layoutParams != null) {
                function1.invoke(layoutParams);
            }
        } else {
            layoutParams = null;
        }
        C786410Ut5.W5(view, layoutParams);
    }

    public static final void LJII(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        C786410Ut5.W5(view, layoutParams);
    }

    public static final void LIZ(View view, int i, boolean z, boolean z2, View.OnClickListener onClickListener) {
        View decorView;
        long jLongValue;
        Integer num;
        Window window;
        View decorView2;
        Long l;
        Window window2;
        Object tag = null;
        if (z) {
            Context context = view.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (activity == null || (window2 = activity.getWindow()) == null || (decorView = window2.getDecorView()) == null) {
                        break;
                    }
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            decorView = view;
        } else {
            decorView = view;
        }
        Object tag2 = decorView.getTag(R.id.gi_);
        if ((tag2 instanceof Long) && (l = (Long) tag2) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if (z2) {
            Context context2 = view.getContext();
            while (true) {
                if (!(context2 instanceof ContextWrapper)) {
                    break;
                }
                if (context2 instanceof Activity) {
                    Activity activity2 = (Activity) context2;
                    if (activity2 != null && (window = activity2.getWindow()) != null && (decorView2 = window.getDecorView()) != null) {
                        tag = decorView2.getTag(R.id.gi9);
                    }
                } else {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if ((tag instanceof Integer) && (num = (Integer) tag) != null) {
                i = num.intValue();
            }
        }
        if (SystemClock.uptimeMillis() - jLongValue >= i) {
            decorView.setTag(R.id.gi_, Long.valueOf(SystemClock.uptimeMillis()));
            onClickListener.onClick(view);
        }
    }
}
