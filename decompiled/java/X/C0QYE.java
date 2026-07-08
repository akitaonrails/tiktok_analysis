package X;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchResultBgColor;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QYE, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QYE {
    public static C0QY3 LIZ(ECSearchResultBgColor eCSearchResultBgColor) {
        String str;
        int iIntValue;
        GradientDrawable.Orientation orientation;
        int iIntValue2;
        Integer numLIZIZ;
        try {
            str = eCSearchResultBgColor.type;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJFF(th, "ECSearchResultBgColor.convertToModel color failed");
        }
        if (Intrinsics.LJFF(str, "color")) {
            C0QYD c0qyd = C0QYD.COLOR;
            String str2 = eCSearchResultBgColor.singleColor;
            if (str2 != null) {
                numLIZIZ = LIZIZ(str2);
            } else {
                numLIZIZ = null;
            }
            C0QY3 c0qy3 = new C0QY3(c0qyd, null, numLIZIZ, 250);
            Integer num = eCSearchResultBgColor.width;
            if (num != null) {
                c0qy3.LJI = num.intValue();
            }
            Integer num2 = eCSearchResultBgColor.height;
            if (num2 != null) {
                c0qy3.LJII = num2.intValue();
                return c0qy3;
            }
            return c0qy3;
        }
        if (Intrinsics.LJFF(str, "gradient")) {
            C0QY3 c0qy32 = new C0QY3(C0QYD.GRADIENT, null, null, 254);
            Integer num3 = eCSearchResultBgColor.gradientDeg;
            if (num3 != null) {
                iIntValue = num3.intValue();
            } else {
                iIntValue = 0;
            }
            int i = (iIntValue + 1080) % 360;
            int i2 = i / 45;
            if (i % 45 > 22) {
                i2 = (i2 + 1) % 8;
            }
            switch (i2) {
                case 0:
                    orientation = GradientDrawable.Orientation.BOTTOM_TOP;
                    break;
                case 1:
                    orientation = GradientDrawable.Orientation.BL_TR;
                    break;
                case 2:
                    orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                    break;
                case 3:
                    orientation = GradientDrawable.Orientation.TL_BR;
                    break;
                case 4:
                    orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                    break;
                case 5:
                    orientation = GradientDrawable.Orientation.TR_BL;
                    break;
                case 6:
                    orientation = GradientDrawable.Orientation.RIGHT_LEFT;
                    break;
                case 7:
                    orientation = GradientDrawable.Orientation.BR_TL;
                    break;
                default:
                    orientation = GradientDrawable.Orientation.BOTTOM_TOP;
                    break;
            }
            c0qy32.LIZLLL = orientation;
            ArrayList arrayList = new ArrayList();
            for (String str3 : eCSearchResultBgColor.gradientColors) {
                Integer numLIZIZ2 = LIZIZ(str3);
                if (numLIZIZ2 != null) {
                    iIntValue2 = numLIZIZ2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                arrayList.add(Integer.valueOf(iIntValue2));
            }
            c0qy32.LJ = C13LP.LLII(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (float f : eCSearchResultBgColor.gradientPositions) {
                arrayList2.add(Float.valueOf(f));
            }
            c0qy32.LJFF = C13LP.LLI(arrayList2);
            Integer num4 = eCSearchResultBgColor.width;
            if (num4 != null) {
                c0qy32.LJI = num4.intValue();
            }
            Integer num5 = eCSearchResultBgColor.height;
            if (num5 != null) {
                c0qy32.LJII = num5.intValue();
            }
            return c0qy32;
        }
        return null;
    }

    public static Integer LIZIZ(String str) {
        Object c098200Yq;
        if (str.length() == 9 && str.charAt(0) == '#') {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('#');
            sbLIZ.append(str.substring(7));
            sbLIZ.append(str.substring(1, 7));
            str = C2188811AlT.LIZIZ(sbLIZ);
        }
        try {
            c098200Yq = Integer.valueOf(Color.parseColor(str));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (Integer) c098200Yq;
    }
}
