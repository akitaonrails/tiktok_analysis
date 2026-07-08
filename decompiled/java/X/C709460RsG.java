package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.ui.AbsTakoRightBottomEntrance;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0RsG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C709460RsG {
    public static final C709460RsG LIZ = new C709460RsG();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(495));

    public final void LIZ(View view, Integer num) {
        C709470RsH c709470RsHLIZIZ;
        if (num == null) {
            c709470RsHLIZIZ = (C709470RsH) LIZIZ.getValue();
        } else {
            c709470RsHLIZIZ = LIZIZ(this, num.intValue(), 1);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginEnd(c709470RsHLIZIZ.LIZ);
            C786410Ut5.W5(view, marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static C709470RsH LIZIZ(C709460RsG c709460RsG, int i, int i2) {
        int i3;
        boolean z;
        int iLIZIZ;
        int iMin;
        int iLIZIZ2;
        int i4;
        int i5 = 0;
        if ((i2 & 1) != 0) {
            AbsTakoRightBottomEntrance.LLL.getClass();
            i3 = AbsTakoRightBottomEntrance.LLLFF;
        } else {
            i3 = 0;
        }
        if ((i2 & 2) != 0) {
            c709460RsG.getClass();
            i = ((Number) C1100104Rz.LIZ.getValue()).intValue();
        }
        if ((i2 & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        c709460RsG.getClass();
        C01GW<Integer> c01gw = ConstraintSizeVM.LL;
        int iLIZJ = C693770RJf.LIZJ();
        int iIntValue = ((Number) C1100004Ry.LIZ.getValue()).intValue();
        if (i > 0) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        } else if (z) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        }
        int i6 = i3 + iLIZIZ;
        if (i >= 0) {
            iMin = Math.min(i6, iLIZJ);
        } else {
            iMin = iLIZJ;
        }
        if (iIntValue > 0) {
            iLIZIZ2 = iLIZJ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
        } else {
            iLIZIZ2 = iLIZJ;
        }
        int iMin2 = Math.min(iMin, iLIZIZ2);
        if (iMin2 >= i6) {
            i6 = iMin2;
        }
        int i7 = iLIZJ - iLIZIZ2;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = iLIZJ - iMin;
        if (i8 < 0) {
            i8 = 0;
        }
        if (i >= 0 && (i4 = i8 - i7) >= 0) {
            i5 = i4;
        }
        return new C709470RsH(i6, i5);
    }
}
