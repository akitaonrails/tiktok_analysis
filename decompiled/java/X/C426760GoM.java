package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GoM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C426760GoM {
    public static final String LIZJ(InterfaceC426790GoP interfaceC426790GoP) {
        if (!(interfaceC426790GoP instanceof C1914007ec)) {
            if (interfaceC426790GoP instanceof C426780GoO) {
                C426780GoO c426780GoO = (C426780GoO) interfaceC426790GoP;
                int i = c426780GoO.LIZ;
                int i2 = c426780GoO.LIZIZ;
                if (i != 0 && i <= 9) {
                    int i3 = 1;
                    if (1 <= i) {
                        int i4 = 1;
                        while (true) {
                            i3 *= 10;
                            if (i4 == i) {
                                break;
                            }
                            i4++;
                        }
                    }
                    int i5 = i3 - 1;
                    if (i2 > i5) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(i5);
                        sbLIZ.append('+');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }
                    return String.valueOf(i2);
                }
                return String.valueOf(i2);
            }
            if (interfaceC426790GoP instanceof C07Y3) {
                return ((C07Y3) interfaceC426790GoP).LIZ.toString();
            }
            if (!(interfaceC426790GoP instanceof C426800GoQ)) {
                throw new C1954807lC();
            }
            return "";
        }
        return "";
    }

    public static C416900GWi LIZIZ(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        int iLIZIZ;
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        if ((i & 8) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        if ((i & 16) != 0) {
            i3 = -16777216;
        } else {
            i3 = 0;
        }
        if ((i & 32) != 0) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        } else {
            iLIZIZ = 0;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxAlertBadge, R.attr.xd, 0);
        C416900GWi c416900GWiLIZ = LIZ(typedArrayObtainStyledAttributes, 0, i2, i3, iLIZIZ);
        typedArrayObtainStyledAttributes.recycle();
        return c416900GWiLIZ;
    }

    public static final C416900GWi LIZ(TypedArray typedArray, int i, int i2, int i3, int i4) {
        return new C416900GWi(typedArray.getInt(R$styleable.TuxAlertBadge__tux_badgeFont, i), typedArray.getColor(R$styleable.TuxAlertBadge__tux_badgeTextColor, i2), typedArray.getColor(R$styleable.TuxAlertBadge__tux_badgeBackgroundColor, i3), typedArray.getDimensionPixelSize(R$styleable.TuxAlertBadge_tux_badgeDotSize, i4));
    }
}
