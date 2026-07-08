package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS271S0000000_28;

/* JADX INFO: renamed from: X.10UZ, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10UZ {
    public static final boolean LIZLLL(Context context) {
        CharSequence charSequence;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.g5f, typedValue, true)) {
            charSequence = null;
        } else {
            charSequence = typedValue.string;
        }
        return TextUtils.equals(charSequence, "TikTok Theme Dark");
    }

    public static final Integer LIZ(int i, Context context) {
        Object objLIZIZ;
        AFwS271S0000000_28 aFwS271S0000000_28 = AFwS271S0000000_28.get$arr$(439);
        if (i == 0) {
            objLIZIZ = null;
        } else {
            objLIZIZ = LIZIZ(context.getTheme(), i, new TypedValue(), aFwS271S0000000_28);
        }
        return (Integer) objLIZIZ;
    }

    public static final int LIZJ(int i, Context context) {
        Integer numLIZ = LIZ(i, context);
        if (numLIZ != null) {
            return numLIZ.intValue();
        }
        Integer numLIZ2 = LIZ(i, new C1361400lX0(context, R.style.xx));
        if (numLIZ2 != null) {
            return numLIZ2.intValue();
        }
        return -1;
    }

    public static final Object LIZIZ(Resources.Theme theme, int i, TypedValue typedValue, AFwS271S0000000_28 aFwS271S0000000_28) {
        if (!theme.resolveAttribute(i, typedValue, true)) {
            return null;
        }
        if (typedValue.type == 2) {
            return LIZIZ(theme, typedValue.data, typedValue, aFwS271S0000000_28);
        }
        return aFwS271S0000000_28.invoke(typedValue);
    }
}
