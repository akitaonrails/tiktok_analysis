package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.effect.api.IEffectService;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.01gX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C397101gX {
    public static void LIZ(InterfaceC395901gL interfaceC395901gL) {
        float f = interfaceC395901gL.getConfig().LJII;
        float f2 = interfaceC395901gL.getConfig().LJIIIIZZ;
        float f3 = interfaceC395901gL.getConfig().LJIIIZ;
        float f4 = interfaceC395901gL.getConfig().LJIIJ;
        C769220UFk.LIZ.getClass();
        int i = C769220UFk.LIZLLL;
        int i2 = C769220UFk.LJ;
        int i3 = C769220UFk.LIZIZ;
        int i4 = C769220UFk.LIZJ;
        int i5 = interfaceC395901gL.getConfig().LJIIZILJ;
        int i6 = interfaceC395901gL.getConfig().LJIJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("convertBoardToVideoCoordinate() raw inputs:\n  window(x,y,w,h)=(");
        sbLIZ.append(f);
        sbLIZ.append(',');
        sbLIZ.append(f2);
        sbLIZ.append(',');
        sbLIZ.append(f3);
        sbLIZ.append(',');
        sbLIZ.append(f4);
        sbLIZ.append(")\n  helper(marginLeft,marginTop,videoW,videoH)=(");
        sbLIZ.append(i2);
        sbLIZ.append(',');
        sbLIZ.append(i);
        sbLIZ.append(',');
        sbLIZ.append(i3);
        sbLIZ.append(',');
        sbLIZ.append(i4);
        sbLIZ.append(")\n  config(before)(videoW,videoH)=(");
        sbLIZ.append(i5);
        sbLIZ.append(',');
        sbLIZ.append(i6);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        if (i3 != 0) {
            interfaceC395901gL.getConfig().LJIIZILJ = i3;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("override realVideoWidth with helper value: ");
            sbLIZ2.append(i3);
            C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("helper realVideoWidth is 0, keep config value: ");
            sbLIZ3.append(i5);
            C2188811AlT.LIZIZ(sbLIZ3);
        }
        if (i4 != 0) {
            interfaceC395901gL.getConfig().LJIJ = i4;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("override realVideoHeight with helper value: ");
            sbLIZ4.append(i4);
            C2188811AlT.LIZIZ(sbLIZ4);
        } else {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("helper realVideoHeight is 0, keep config value: ");
            sbLIZ5.append(i6);
            C2188811AlT.LIZIZ(sbLIZ5);
        }
        int i7 = interfaceC395901gL.getConfig().LJIIZILJ;
        int i8 = interfaceC395901gL.getConfig().LJIJ;
        ArrayList arrayList = new ArrayList();
        if (f3 <= 0.0f || f4 <= 0.0f) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("invalid board size (w=");
            sbLIZ6.append(f3);
            sbLIZ6.append(" h=");
            sbLIZ6.append(f4);
            sbLIZ6.append(')');
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ6));
        }
        if (i7 <= 0 || i8 <= 0) {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("invalid video size (w=");
            sbLIZ7.append(i7);
            sbLIZ7.append(" h=");
            sbLIZ7.append(i8);
            sbLIZ7.append(')');
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ7));
        }
        if (i2 < 0 || i < 0) {
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("negative margins (left=");
            sbLIZ8.append(i2);
            sbLIZ8.append(" top=");
            sbLIZ8.append(i);
            sbLIZ8.append(')');
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ8));
        }
        if (!arrayList.isEmpty()) {
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append("sanityCheck FAILED: ");
            sbLIZ9.append(C13LP.LJJLIIIJ(arrayList, "; ", null, null, 0, null, null, 62));
            C2188811AlT.LIZIZ(sbLIZ9);
        }
        if (i7 != 0 && i8 != 0) {
            float f5 = i7;
            float f6 = ((f + (f3 / 2.0f)) - i2) / f5;
            float f7 = i8;
            float f8 = ((f2 + (f4 / 2.0f)) - i) / f7;
            float f9 = f3 / f5;
            float f10 = f4 / f7;
            if (f6 < -0.05f || f6 > 1.05f || f8 < -0.05f || f8 > 1.05f) {
                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                sbLIZ10.append("normalized center out of range: xVideo=");
                sbLIZ10.append(f6);
                sbLIZ10.append(" yVideo=");
                sbLIZ10.append(f8);
                sbLIZ10.append(" (margin or realVideo size may be incorrect)");
                C2188811AlT.LIZIZ(sbLIZ10);
            }
            if (f9 <= 0.0f || f10 <= 0.0f || f9 > 2.0f || f10 > 2.0f) {
                StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                sbLIZ11.append("normalized size looks abnormal: wVideo=");
                sbLIZ11.append(f9);
                sbLIZ11.append(" hVideo=");
                sbLIZ11.append(f10);
                C2188811AlT.LIZIZ(sbLIZ11);
            }
            interfaceC395901gL.getConfig().LJIJI = f6;
            interfaceC395901gL.getConfig().LJIJJ = f8;
            interfaceC395901gL.getConfig().LJIJJLI = f9;
            interfaceC395901gL.getConfig().LJIL = f10;
            StringBuilder sbLIZ12 = C2188811AlT.LIZ();
            sbLIZ12.append("final result written:\n  xVideo=");
            sbLIZ12.append(interfaceC395901gL.getConfig().LJIJI);
            sbLIZ12.append(", yVideo=");
            sbLIZ12.append(interfaceC395901gL.getConfig().LJIJJ);
            sbLIZ12.append(", wVideo=");
            sbLIZ12.append(interfaceC395901gL.getConfig().LJIJJLI);
            sbLIZ12.append(", hVideo=");
            sbLIZ12.append(interfaceC395901gL.getConfig().LJIL);
            C2188811AlT.LIZIZ(sbLIZ12);
            return;
        }
        StringBuilder sbLIZ13 = C2188811AlT.LIZ();
        sbLIZ13.append("skip conversion: invalid video size (videoWidth=");
        sbLIZ13.append(i7);
        sbLIZ13.append(" videoHeight=");
        sbLIZ13.append(i8);
        sbLIZ13.append(')');
        C2188811AlT.LIZIZ(sbLIZ13);
    }

    public static View LIZIZ(InterfaceC395901gL interfaceC395901gL, Context context) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        boolean zLJJ = C497740JfY.LJJ();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutDirection(zLJJ ? 1 : 0);
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), interfaceC395901gL.getLayoutId(), frameLayout, true);
        float fLJI = (C14KS.LJI(context) - interfaceC395901gL.getConfig().LJIILJJIL) - interfaceC395901gL.getConfig().LJIIL;
        float fLJ = (C14KS.LJ(context) - interfaceC395901gL.getConfig().LJIILIIL) - interfaceC395901gL.getConfig().LJIILL;
        ViewGroup.LayoutParams layoutParams = viewTd.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        int i = layoutParams.width;
        if (i != -2) {
            if (i != -1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) fLJI, 1073741824);
            }
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) fLJI, Integer.MIN_VALUE);
        }
        int i2 = layoutParams.height;
        if (i2 != -2) {
            if (i2 != -1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
            } else {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((int) fLJ, 1073741824);
            }
        } else {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((int) fLJ, Integer.MIN_VALUE);
        }
        viewTd.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        viewTd.layout(0, 0, viewTd.getMeasuredWidth(), viewTd.getMeasuredHeight());
        interfaceC395901gL.getConfig().LJIIIZ = viewTd.getMeasuredWidth();
        interfaceC395901gL.getConfig().LJIIJ = viewTd.getMeasuredHeight();
        interfaceC395901gL.LJFF();
        viewTd.setClickable(true);
        viewTd.setFocusable(true);
        return viewTd;
    }

    public static void LIZLLL(InterfaceC395901gL interfaceC395901gL, float f) {
        C394501g7 config = interfaceC395901gL.getConfig();
        if (interfaceC395901gL.getConfig().LJJIIZ != 0.0f) {
            f /= interfaceC395901gL.getConfig().LJJIIZ;
        }
        config.LJJ = f;
        InterfaceC390601fU effectBoardService = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getEffectBoardService("anchor", "");
        if (effectBoardService != null) {
            effectBoardService.LJIILIIL(interfaceC395901gL);
        }
    }

    public static void LIZJ(InterfaceC395901gL interfaceC395901gL, float f, float f2) {
        interfaceC395901gL.getConfig().LJII = f;
        interfaceC395901gL.getConfig().LJIIIIZZ = f2;
        InterfaceC390601fU effectBoardService = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getEffectBoardService("anchor", "");
        if (effectBoardService != null) {
            effectBoardService.LJIILJJIL(interfaceC395901gL);
        }
    }
}
