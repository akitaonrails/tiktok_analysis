package X;

import Y.AAListenerS271S0200000_19;
import Y.AUListenerS253S0100000_2;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS433S0200000_32;

/* JADX INFO: renamed from: X.1888, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1888 {
    public static final /* synthetic */ int LIZ = 0;

    public static ObjectAnimator LIZIZ(View view, int i) {
        AFwS223S0000000_32 aFwS223S0000000_32 = AFwS223S0000000_32.get$arr$(10);
        AFwS223S0000000_32 aFwS223S0000000_322 = AFwS223S0000000_32.get$arr$(11);
        view.setPivotY(i / 2.0f);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 1.0f, 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f, 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f, 0.0f));
        objectAnimatorOfPropertyValuesHolder.setDuration(150L);
        objectAnimatorOfPropertyValuesHolder.addListener(new AAListenerS271S0200000_19(aFwS223S0000000_32, aFwS223S0000000_322, 1));
        return objectAnimatorOfPropertyValuesHolder;
    }

    public static ObjectAnimator LJ(TuxTextView tuxTextView, Function0 function0) {
        AFwS223S0000000_32 aFwS223S0000000_32 = AFwS223S0000000_32.get$arr$(14);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(tuxTextView, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 1.0f, 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f, 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f, 0.0f));
        objectAnimatorOfPropertyValuesHolder.setDuration(150L);
        objectAnimatorOfPropertyValuesHolder.addListener(new AAListenerS271S0200000_19(aFwS223S0000000_32, function0, 4));
        return objectAnimatorOfPropertyValuesHolder;
    }

    public static ObjectAnimator LJFF(TuxTextView tuxTextView, Long l, int i) {
        AFwS223S0000000_32 aFwS223S0000000_32;
        long jLongValue;
        AFwS223S0000000_32 aFwS223S0000000_322 = null;
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            aFwS223S0000000_32 = AFwS223S0000000_32.get$arr$(15);
        } else {
            aFwS223S0000000_32 = null;
        }
        if ((i & 8) != 0) {
            aFwS223S0000000_322 = AFwS223S0000000_32.get$arr$(16);
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(tuxTextView, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.0f, 1.3f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.0f, 1.3f, 1.0f));
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 150;
        }
        objectAnimatorOfPropertyValuesHolder.setDuration(jLongValue);
        objectAnimatorOfPropertyValuesHolder.addListener(new AAListenerS271S0200000_19(aFwS223S0000000_32, aFwS223S0000000_322, 5));
        return objectAnimatorOfPropertyValuesHolder;
    }

    public static ObjectAnimator LJI(TuxTextView tuxTextView, Long l, int i) {
        AFwS223S0000000_32 aFwS223S0000000_32;
        long jLongValue;
        AFwS223S0000000_32 aFwS223S0000000_322 = null;
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            aFwS223S0000000_32 = AFwS223S0000000_32.get$arr$(17);
        } else {
            aFwS223S0000000_32 = null;
        }
        if ((i & 8) != 0) {
            aFwS223S0000000_322 = AFwS223S0000000_32.get$arr$(18);
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(tuxTextView, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 0.0f, 1.0f));
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 100;
        }
        objectAnimatorOfPropertyValuesHolder.setDuration(jLongValue);
        objectAnimatorOfPropertyValuesHolder.addListener(new AAListenerS271S0200000_19(aFwS223S0000000_32, aFwS223S0000000_322, 6));
        return objectAnimatorOfPropertyValuesHolder;
    }

    public static ObjectAnimator LIZ(View view, int i, AwS433S0200000_32 awS433S0200000_32, int i2) {
        AFwS223S0000000_32 aFwS223S0000000_32;
        Object obj = awS433S0200000_32;
        if ((i2 & 4) != 0) {
            obj = AFwS223S0000000_32.get$arr$(8);
        }
        if ((i2 & 8) != 0) {
            aFwS223S0000000_32 = AFwS223S0000000_32.get$arr$(9);
        } else {
            aFwS223S0000000_32 = null;
        }
        view.setPivotY(i / 2.0f);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 0.0f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.0f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.0f, 1.0f));
        objectAnimatorOfPropertyValuesHolder.setDuration(150L);
        objectAnimatorOfPropertyValuesHolder.addListener(new AAListenerS271S0200000_19(obj, aFwS223S0000000_32, 0));
        return objectAnimatorOfPropertyValuesHolder;
    }

    public static ObjectAnimator LIZLLL(View view, float f, Function0 function0, Function0 function02) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, 0.0f, f));
        objectAnimatorOfPropertyValuesHolder.setDuration(2500L);
        objectAnimatorOfPropertyValuesHolder.addListener(new AAListenerS271S0200000_19(function0, function02, 3));
        return objectAnimatorOfPropertyValuesHolder;
    }

    public static ValueAnimator LIZJ(View view, float f, float f2, Function0 function0, Function0 function02, int i) {
        if ((i & 8) != 0) {
            function0 = AFwS223S0000000_32.get$arr$(12);
        }
        if ((i & 16) != 0) {
            function02 = AFwS223S0000000_32.get$arr$(13);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS253S0100000_2(view, 2));
        valueAnimatorOfFloat.addListener(new AAListenerS271S0200000_19(function0, function02, 2));
        return valueAnimatorOfFloat;
    }
}
