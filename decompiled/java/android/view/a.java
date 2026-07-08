package android.view;

import X.C19ME;
import X.C2188811AlT;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes32.dex */
public class a extends View {
    public static final /* synthetic */ int LL = 0;

    public static void LIZ(View view) {
        view.onFinishInflate();
    }

    public static int LIZIZ(int i, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    public static ColorStateList LIZJ(int i, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
        typedArrayObtainStyledAttributes.recycle();
        return colorStateList;
    }

    public static int LIZLLL(int i, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Method LJFF(Class cls, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod("setTextCursorDrawable", cls2);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getMethod failed ");
            sbLIZ.append("setTextCursorDrawable");
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LJI(int i, View view) {
        ((TextView) view).setMinHeight(i);
    }

    public static void LJII(int i, View view) {
        ((TextView) view).setMinWidth(i);
    }

    public static ViewGroup.MarginLayoutParams LJ(int i, int i2, ViewGroup viewGroup) {
        if (viewGroup instanceof RelativeLayout) {
            return new RelativeLayout.LayoutParams(i, i2);
        }
        if (viewGroup instanceof LinearLayout) {
            return new LinearLayout.LayoutParams(i, i2);
        }
        if (viewGroup instanceof FrameLayout) {
            return new FrameLayout.LayoutParams(i, i2);
        }
        if (viewGroup instanceof ConstraintLayout) {
            return new C19ME(i, i2);
        }
        return new ViewGroup.MarginLayoutParams(i, i2);
    }
}
