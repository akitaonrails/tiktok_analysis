package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19PG, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19PG {
    public static final int[] LIZ = {R.attr.bip};
    public static final int[] LIZIZ = {R.attr.bis};

    public static void LIZJ(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i)) {
                typedArrayObtainStyledAttributes.recycle();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("The style on this component requires your app theme to be ");
                sbLIZ.append(str);
                sbLIZ.append(" (or a descendant).");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void LIZ(Context context, AttributeSet attributeSet, int i, int i2) {
        if (((Number) C292110Bcf.LIZ.getValue()).intValue() <= 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ThemeEnforcement, i, i2);
            boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ThemeEnforcement_enforceMaterialTheme, false);
            typedArrayObtainStyledAttributes.recycle();
            if (z) {
                TypedValue typedValue = new TypedValue();
                if (!context.getTheme().resolveAttribute(R.attr.byn, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                    LIZJ(context, LIZIZ, "Theme.MaterialComponents");
                }
            }
            LIZJ(context, LIZ, "Theme.AppCompat");
        }
    }

    public static void LIZIZ(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        boolean z = false;
        if (((Number) C292110Bcf.LIZ.getValue()).intValue() <= 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ThemeEnforcement, i, i2);
            if (!typedArrayObtainStyledAttributes.getBoolean(R$styleable.ThemeEnforcement_enforceTextAppearance, false)) {
                typedArrayObtainStyledAttributes.recycle();
                return;
            }
            if (iArr2.length == 0) {
                if (typedArrayObtainStyledAttributes.getResourceId(R$styleable.ThemeEnforcement_android_textAppearance, -1) != -1) {
                    z = true;
                }
            } else {
                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
                for (int i3 : iArr2) {
                    if (typedArrayObtainStyledAttributes2.getResourceId(i3, -1) == -1) {
                        typedArrayObtainStyledAttributes2.recycle();
                        break;
                    }
                }
                typedArrayObtainStyledAttributes2.recycle();
                z = true;
            }
            typedArrayObtainStyledAttributes.recycle();
            if (!z) {
                throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
            }
        }
    }

    public static TypedArray LIZLLL(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        LIZ(context, attributeSet, i, i2);
        LIZIZ(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }
}
