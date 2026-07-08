package X;

import Y.ARunnableS85S0200000_16;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAnimationModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cVX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1014530cVX {
    public static final void LIZ(View view, AnoleComponentAppearModel anoleComponentAppearModel, AbstractC1014240cV4 abstractC1014240cV4) {
        C1014350cVF c1014350cVF;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        List<AnoleComponentAnimationModel> list = anoleComponentAppearModel.animations;
        if (list == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, view);
        if (C1016660cYy.LIZIZ(list) != null && (c1014350cVF = abstractC1014240cV4.LLJJJ) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginStart(c1014350cVF.LIZ);
                marginLayoutParams.topMargin = c1014350cVF.LIZLLL;
                C786410Ut5.W5(view, marginLayoutParams);
            }
        }
        Iterator it2 = ((ArrayList) C1016660cYy.LJ(C1014570cVb.LIZIZ, list)).iterator();
        while (it2.hasNext()) {
            Double finalOpacityValue = ((AnoleComponentAnimationModel) it2.next()).getFinalOpacityValue();
            if (finalOpacityValue != null) {
                C786410Ut5.T4(view, (float) (finalOpacityValue.doubleValue() / ((double) 100)));
            }
        }
        Iterator it3 = ((ArrayList) C1016660cYy.LJ(C1014590cVd.LIZIZ, list)).iterator();
        while (it3.hasNext()) {
            Double finalScaleValue = ((AnoleComponentAnimationModel) it3.next()).getFinalScaleValue();
            if (finalScaleValue != null) {
                float fDoubleValue = (float) finalScaleValue.doubleValue();
                C786410Ut5.Ob(view, fDoubleValue);
                C786410Ut5.pc(view, fDoubleValue);
            }
        }
        for (AnoleComponentAnimationModel anoleComponentAnimationModel : (ArrayList) C1016660cYy.LJ(C1014580cVc.LIZIZ, list)) {
            String resizeType = anoleComponentAnimationModel.getResizeType();
            if (resizeType == null) {
                resizeType = "";
            }
            double finalWidthValue = anoleComponentAnimationModel.getFinalWidthValue();
            double finalHeightValue = anoleComponentAnimationModel.getFinalHeightValue();
            if (Intrinsics.LJFF(resizeType, "bybusiness")) {
                C1009390cNF c1009390cNF = abstractC1014240cV4.LLJJI;
                if (c1009390cNF != null) {
                    finalWidthValue = c1009390cNF.LIZ;
                    finalHeightValue = c1009390cNF.LIZIZ;
                } else {
                    finalWidthValue = -1.0d;
                    finalHeightValue = -1.0d;
                }
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            double d = 1;
            if (Math.abs(finalWidthValue + d) > 1.0E-4d) {
                layoutParams2.width = C341940Daq.LIZ(finalWidthValue);
            }
            if (Math.abs(d + finalHeightValue) > 1.0E-4d) {
                layoutParams2.height = C341940Daq.LIZ(finalHeightValue);
            }
            C786410Ut5.W5(view, layoutParams2);
        }
        HandlerHook.viewPost(view, new ARunnableS85S0200000_16(view, abstractC1014240cV4, 61));
        abstractC1014240cV4.LJIJ(view);
    }

    public static final C1014350cVF LIZIZ(AbstractC1014240cV4 abstractC1014240cV4, ViewGroup viewGroup, View view, String str, boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view == null || viewGroup == null || str == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return null;
        }
        AbstractC1014560cVa abstractC1014560cVaLIZ = C1014540cVY.LIZ(str);
        if (!(abstractC1014560cVaLIZ instanceof AbstractC1014550cVZ) || abstractC1014560cVaLIZ == null) {
            return null;
        }
        C1014350cVF c1014350cVF = new C1014350cVF(marginLayoutParams.getMarginStart(), marginLayoutParams.getMarginEnd(), marginLayoutParams.bottomMargin, marginLayoutParams.topMargin);
        int i = -view.getLayoutParams().height;
        int height = viewGroup.getHeight();
        int i2 = -view.getLayoutParams().width;
        int width = viewGroup.getWidth();
        abstractC1014240cV4.LJIILL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getPanningHidePosition\ntype:");
        sbLIZ.append(str);
        sbLIZ.append("\nisShowInit:");
        sbLIZ.append(z);
        sbLIZ.append("\ntop:");
        sbLIZ.append(i);
        sbLIZ.append("\nbottom:");
        sbLIZ.append(height);
        sbLIZ.append("\nleft:");
        sbLIZ.append(i2);
        sbLIZ.append("\nright:");
        sbLIZ.append(width);
        C2188811AlT.LIZIZ(sbLIZ);
        if (z) {
            if (Intrinsics.LJFF(abstractC1014560cVaLIZ, C1014600cVe.LIZIZ)) {
                c1014350cVF.LIZLLL = height;
                return c1014350cVF;
            }
            if (Intrinsics.LJFF(abstractC1014560cVaLIZ, C1014610cVf.LIZIZ)) {
                c1014350cVF.LIZ = i2;
                return c1014350cVF;
            }
            if (Intrinsics.LJFF(abstractC1014560cVaLIZ, C1014620cVg.LIZIZ)) {
                c1014350cVF.LIZ = width;
                return c1014350cVF;
            }
            if (Intrinsics.LJFF(abstractC1014560cVaLIZ, C1014630cVh.LIZIZ)) {
                c1014350cVF.LIZLLL = i;
                return c1014350cVF;
            }
            throw new C1954807lC();
        }
        if (Intrinsics.LJFF(abstractC1014560cVaLIZ, C1014600cVe.LIZIZ)) {
            c1014350cVF.LIZLLL = i;
            return c1014350cVF;
        }
        if (Intrinsics.LJFF(abstractC1014560cVaLIZ, C1014610cVf.LIZIZ)) {
            c1014350cVF.LIZ = width;
            return c1014350cVF;
        }
        if (Intrinsics.LJFF(abstractC1014560cVaLIZ, C1014620cVg.LIZIZ)) {
            c1014350cVF.LIZ = i2;
            return c1014350cVF;
        }
        if (Intrinsics.LJFF(abstractC1014560cVaLIZ, C1014630cVh.LIZIZ)) {
            c1014350cVF.LIZLLL = height;
            return c1014350cVF;
        }
        throw new C1954807lC();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02ff  */
    /* JADX WARN: Type inference failed for: r1v17, types: [T, android.animation.ValueAnimator] */
    /* JADX WARN: Type inference failed for: r4v19, types: [T, android.animation.ValueAnimator] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.animation.AnimatorSet LIZJ(X.AbstractC1014240cV4 r26, android.view.ViewGroup r27, android.view.View r28, java.util.List<com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAnimationModel> r29, boolean r30) {
        /*
            Method dump skipped, instruction units count: 1073
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1014530cVX.LIZJ(X.0cV4, android.view.ViewGroup, android.view.View, java.util.List, boolean):android.animation.AnimatorSet");
    }
}
