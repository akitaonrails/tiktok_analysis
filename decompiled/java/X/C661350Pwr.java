package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Pwr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C661350Pwr {
    public static final void LIZJ(View view) {
        if (view != null && view.getVisibility() != 8) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    public static final void LIZLLL(View view) {
        if (view != null && view.getVisibility() != 4) {
            C786410Ut5.LJLLLLLL(4, view);
        }
    }

    public static final void LJFF(Function0<Unit> function0) {
        try {
            function0.invoke();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final JSONObject LJI(Function0<? extends JSONObject> function0) {
        JSONObject c098200Yq;
        try {
            c098200Yq = function0.invoke();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        JSONObject jSONObject = new JSONObject();
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = jSONObject;
        }
        return (JSONObject) c098200Yq;
    }

    public static final void LJIIL(View view) {
        if (view != null && view.getVisibility() != 0) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    public static final float LIZ(float f, Context context) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static final Context LIZIZ(Context context, InterfaceC214902198i interfaceC214902198i) {
        SAFFragmentRootScene sAFFragmentRootSceneIb;
        Context sceneContext;
        if (C07H0.LIZ() && interfaceC214902198i != null && (sAFFragmentRootSceneIb = interfaceC214902198i.ib()) != null && (sceneContext = sAFFragmentRootSceneIb.getSceneContext()) != null) {
            return sceneContext;
        }
        return context;
    }

    public static final int LJII(int i, String str) {
        int i2;
        Object c098200Yq;
        if (str == null) {
            i2 = i;
        } else {
            try {
                i2 = CastIntegerProtector.parseInt(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        }
        c098200Yq = Integer.valueOf(i2);
        C189200o6.m2constructorimpl(c098200Yq);
        Integer numValueOf = Integer.valueOf(i);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = numValueOf;
        }
        return ((Number) c098200Yq).intValue();
    }

    public static final void LJIIIIZZ(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.bottomMargin = i;
            }
            view.requestLayout();
        }
    }

    public static final void LJIIJ(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.rightMargin = i;
            }
            view.requestLayout();
        }
    }

    public static final View LJIIJJI(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = i;
        }
        view.requestLayout();
        return view;
    }

    public static final void LJIIIZ(TextView textView, TuxIconDrawable tuxIconDrawable, Context context) {
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        Drawable drawable = compoundDrawables[0];
        Drawable drawable2 = compoundDrawables[1];
        Drawable drawable3 = compoundDrawables[2];
        Drawable drawable4 = compoundDrawables[3];
        if (C426750GoL.LIZLLL(context)) {
            textView.setCompoundDrawables(tuxIconDrawable, drawable2, drawable3, drawable4);
        } else {
            textView.setCompoundDrawables(drawable, drawable2, tuxIconDrawable, drawable4);
        }
    }

    public static void LJ(View view, float f, float f2, float f3, float f4) {
        GradientDrawable gradientDrawable;
        if (view != null) {
            Drawable background = view.getBackground();
            Drawable drawableMutate = null;
            if (background != null) {
                drawableMutate = background.mutate();
            }
            if ((drawableMutate instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawableMutate) != null) {
                gradientDrawable.setCornerRadii(new float[]{f, f, f2, f2, f3, f3, f4, f4});
            }
        }
    }
}
