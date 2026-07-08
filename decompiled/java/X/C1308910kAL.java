package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS599S0100000_20;

/* JADX INFO: renamed from: X.0kAL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1308910kAL {
    public static final CharSequence LJIIIIZZ(Context context) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.g5f, typedValue, true)) {
            return null;
        }
        return typedValue.string;
    }

    public static final Integer LIZ(int i, Context context) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        return Integer.valueOf(typedValue.data);
    }

    public static final Integer LIZJ(int i, Context context) {
        return (Integer) LIZIZ(i, context, new C1308900kAK());
    }

    public static final Drawable LJ(int i, Context context) {
        return (Drawable) LIZIZ(i, context, new AwS599S0100000_20(context, 45));
    }

    public static final Float LJFF(int i, Context context) {
        return (Float) LIZIZ(i, context, new C1308890kAJ());
    }

    public static final Integer LJII(int i, Context context) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        return Integer.valueOf(typedValue.resourceId);
    }

    public static final Object LIZIZ(int i, Context context, Function1 function1) {
        if (i == 0) {
            return null;
        }
        return LJI(context.getTheme(), i, new TypedValue(), function1);
    }

    @InterfaceC1294060jmO
    public static final Integer LIZLLL(Context context, int[] iArr, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.z6, 0);
        int color = typedArrayObtainStyledAttributes.getColor(i, 1);
        typedArrayObtainStyledAttributes.recycle();
        if (color == 1) {
            return null;
        }
        return Integer.valueOf(color);
    }

    public static final <T> T LJI(Resources.Theme theme, int i, TypedValue typedValue, Function1<? super TypedValue, ? extends T> function1) {
        if (!theme.resolveAttribute(i, typedValue, true)) {
            return null;
        }
        if (typedValue.type == 2) {
            return (T) LJI(theme, typedValue.data, typedValue, function1);
        }
        return function1.invoke(typedValue);
    }
}
