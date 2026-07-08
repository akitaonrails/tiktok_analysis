package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0God, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C426930God {
    public static final C426930God LIZ = new C426930God();

    public static final int LIZ(int i, Context context) {
        Object c098200Yq;
        if (context == null) {
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = context.getTheme();
        if (theme == null || !theme.resolveAttribute(i, typedValue, true)) {
            return 0;
        }
        int i2 = typedValue.resourceId;
        if (i2 != 0) {
            try {
                c098200Yq = Integer.valueOf(context.getColor(i2));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Integer numValueOf = Integer.valueOf(typedValue.data);
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = numValueOf;
            }
            return ((Number) c098200Yq).intValue();
        }
        return typedValue.data;
    }

    public static final int LIZIZ(int i, View view) {
        Context context;
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        return LIZ(i, context);
    }

    public static final Drawable LIZJ(int i, Context context) {
        int iLIZLLL;
        Object c098200Yq;
        if (context == null || (iLIZLLL = LIZLLL(i, context)) == 0) {
            return null;
        }
        try {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = iLIZLLL;
            c098200Yq = c419910GdJ.LIZ(context);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Drawable drawable = (Drawable) c098200Yq;
        if (drawable != null) {
            return drawable;
        }
        Drawable drawableLIZ = C14MI.LIZ(context, iLIZLLL);
        if (drawableLIZ == null) {
            return null;
        }
        return drawableLIZ.mutate();
    }

    public static final int LIZLLL(int i, Context context) {
        if (context == null) {
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = context.getTheme();
        if (theme == null || !theme.resolveAttribute(i, typedValue, true)) {
            return 0;
        }
        int i2 = typedValue.resourceId;
        if (i2 == 0) {
            return typedValue.data;
        }
        return i2;
    }
}
