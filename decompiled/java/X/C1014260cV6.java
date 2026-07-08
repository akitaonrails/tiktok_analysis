package X;

import Y.ARunnableS85S0200000_16;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAnimationModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentLayoutConstraintModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentLayoutModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentSizeModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cV6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1014260cV6 {
    public static final void LJIIJ(AbstractC1014240cV4 abstractC1014240cV4) {
        Map<String, View.OnLayoutChangeListener> map = abstractC1014240cV4.LLJJL;
        if (map == null) {
            return;
        }
        for (Map.Entry<String, View.OnLayoutChangeListener> entry : map.entrySet()) {
            abstractC1014240cV4.LLILLL.LLJJIII(entry.getKey(), entry.getValue());
        }
        abstractC1014240cV4.LLJJL = null;
    }

    public static final C1009390cNF LJIIJJI(AnoleComponentSizeModel anoleComponentSizeModel) {
        double dLIZ = anoleComponentSizeModel.width;
        if (dLIZ > 0.0d) {
            dLIZ = C341940Daq.LIZ(dLIZ);
        }
        double dLIZ2 = anoleComponentSizeModel.height;
        if (dLIZ2 > 0.0d) {
            dLIZ2 = C341940Daq.LIZ(dLIZ2);
        }
        return new C1009390cNF(dLIZ, dLIZ2);
    }

    public static final C1009390cNF LIZIZ(AbstractC1014240cV4 abstractC1014240cV4, C1014390cVJ c1014390cVJ) throws C0NBE {
        int iLIZ;
        double d;
        int iLIZ2;
        double d2;
        AnoleComponentSizeModel anoleComponentSizeModel = abstractC1014240cV4.LL.size;
        if (anoleComponentSizeModel != null) {
            String str = anoleComponentSizeModel.type;
            if (Intrinsics.LJFF(str, "percentage")) {
                C1009390cNF c1009390cNF = c1014390cVJ.LIZ;
                return new C1009390cNF(c1009390cNF.LIZ * anoleComponentSizeModel.width, c1009390cNF.LIZIZ * anoleComponentSizeModel.height);
            }
            if (Intrinsics.LJFF(str, "absolute")) {
                return LJIIJJI(anoleComponentSizeModel);
            }
            if (Intrinsics.LJFF(str, "bybusiness")) {
                C1009390cNF c1009390cNF2 = abstractC1014240cV4.LLJJI;
                if (c1009390cNF2 == null) {
                    return LJIIJJI(anoleComponentSizeModel);
                }
                if (C1014320cVC.LIZJ(c1009390cNF2.LIZ)) {
                    if (C1014320cVC.LIZJ(anoleComponentSizeModel.width)) {
                        d = anoleComponentSizeModel.width;
                    } else {
                        iLIZ = C341940Daq.LIZ(anoleComponentSizeModel.width);
                        d = iLIZ;
                    }
                } else if (Math.abs(c1009390cNF2.LIZ + ((double) 2)) <= 1.0E-4d) {
                    d = c1009390cNF2.LIZ;
                } else {
                    iLIZ = C341940Daq.LIZ(c1009390cNF2.LIZ);
                    d = iLIZ;
                }
                if (C1014320cVC.LIZJ(c1009390cNF2.LIZIZ)) {
                    if (C1014320cVC.LIZJ(anoleComponentSizeModel.height)) {
                        d2 = anoleComponentSizeModel.height;
                    } else {
                        iLIZ2 = C341940Daq.LIZ(anoleComponentSizeModel.height);
                        d2 = iLIZ2;
                    }
                } else if (Math.abs(c1009390cNF2.LIZIZ + ((double) 2)) <= 1.0E-4d) {
                    d2 = c1009390cNF2.LIZIZ;
                } else {
                    iLIZ2 = C341940Daq.LIZ(c1009390cNF2.LIZIZ);
                    d2 = iLIZ2;
                }
                return new C1009390cNF(d, d2);
            }
            throw new C0NBE("componentModel.size.type is unknown type");
        }
        throw new C0NBE("componentModel.size is null");
    }

    public static final C1014360cVG LIZLLL(AnoleComponentLayoutConstraintModel anoleComponentLayoutConstraintModel, InterfaceC1014270cV7 interfaceC1014270cV7) {
        C1014410cVL c1014410cVLLLJJIJI;
        String str;
        String str2 = anoleComponentLayoutConstraintModel.baseline;
        if (str2 == null || (c1014410cVLLLJJIJI = interfaceC1014270cV7.LLJJIJI(str2)) == null || (str = anoleComponentLayoutConstraintModel.alignEdge) == null) {
            return null;
        }
        return new C1014360cVG(c1014410cVLLLJJIJI, str2, str, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(anoleComponentLayoutConstraintModel.offset))));
    }

    public static final void LIZ(AbstractC1014240cV4 abstractC1014240cV4, String str, ViewOnLayoutChangeListenerC1014330cVD viewOnLayoutChangeListenerC1014330cVD) {
        if (abstractC1014240cV4.LLJJL == null) {
            abstractC1014240cV4.LLJJL = new LinkedHashMap();
        }
        Map<String, View.OnLayoutChangeListener> map = abstractC1014240cV4.LLJJL;
        if (map == null || ((LinkedHashMap) map).get(str) != null) {
            return;
        }
        abstractC1014240cV4.LLILLL.X2(str, viewOnLayoutChangeListenerC1014330cVD);
        map.put(str, viewOnLayoutChangeListenerC1014330cVD);
    }

    public static final void LIZJ(AbstractC1014240cV4 abstractC1014240cV4, ViewGroup viewGroup, Long l) {
        View view;
        ViewGroup viewGroup2;
        if (viewGroup == null || (view = abstractC1014240cV4.LLJJIJIL) == null || (viewGroup2 = abstractC1014240cV4.LLJJIII) == null || Intrinsics.LJFF(viewGroup, viewGroup2)) {
            return;
        }
        abstractC1014240cV4.LJIILL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeContainerView, backOldTime:");
        sbLIZ.append(l);
        sbLIZ.append(" oldContainerView:");
        sbLIZ.append(viewGroup2.getId());
        sbLIZ.append(",newContainerView:");
        sbLIZ.append(viewGroup.getId());
        C2188811AlT.LIZIZ(sbLIZ);
        C1014320cVC.LIZLLL(view);
        viewGroup.addView(view);
        C786410Ut5.LJLZ(8, viewGroup2);
        if (abstractC1014240cV4.LLILZIL) {
            C786410Ut5.LJLLLLLL(0, view);
            C786410Ut5.LJLZ(0, viewGroup);
        } else {
            C786410Ut5.LJLLLLLL(8, view);
            C786410Ut5.LJLZ(8, viewGroup);
        }
        abstractC1014240cV4.LLJJIII = viewGroup;
        if (l != null) {
            long jLongValue = l.longValue();
            ARunnableS85S0200000_16 aRunnableS85S0200000_16 = new ARunnableS85S0200000_16(abstractC1014240cV4, viewGroup2, 62);
            C786410Ut5.LJLIIL(jLongValue, abstractC1014240cV4.LJIIJJI(), aRunnableS85S0200000_16);
            abstractC1014240cV4.LLJILJILJ = aRunnableS85S0200000_16;
        }
    }

    public static final void LJ(View view, ViewGroup viewGroup, AnoleComponentAppearModel anoleComponentAppearModel, AbstractC1014240cV4 abstractC1014240cV4) throws C0NBE {
        C1014350cVF c1014350cVFLIZIZ;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int marginStart;
        int marginEnd;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        C1014390cVJ c1014390cVJLLJJIJIIJIL;
        AnoleComponentLayoutModel anoleComponentLayoutModel = abstractC1014240cV4.LL.layout;
        if (anoleComponentLayoutModel != null) {
            C1014390cVJ c1014390cVJY2 = abstractC1014240cV4.LLILLL.Y2();
            if (c1014390cVJY2 != null) {
                AnoleComponentLayoutModel anoleComponentLayoutModel2 = abstractC1014240cV4.LL.layout;
                String str = null;
                if (anoleComponentLayoutModel2 != null) {
                    str = anoleComponentLayoutModel2.type;
                }
                if (Intrinsics.LJFF(str, "percentage")) {
                    if (((Boolean) C0AR1.LIZ.getValue()).booleanValue() && (c1014390cVJLLJJIJIIJIL = abstractC1014240cV4.LLILLL.LLJJIJIIJIL()) != null) {
                        c1014390cVJY2 = c1014390cVJLLJJIJIIJIL;
                    }
                    C1009390cNF c1009390cNFLIZIZ = LIZIZ(abstractC1014240cV4, c1014390cVJY2);
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        marginLayoutParams2.width = (int) c1009390cNFLIZIZ.LIZ;
                        marginLayoutParams2.height = (int) c1009390cNFLIZIZ.LIZIZ;
                        C1009390cNF c1009390cNF = c1014390cVJY2.LIZ;
                        PointF pointF = c1014390cVJY2.LIZIZ;
                        double d = 0.5f;
                        PointF pointF2 = new PointF((float) (((double) pointF.x) + (c1009390cNF.LIZ * (anoleComponentLayoutModel.x - d))), (float) (((double) pointF.y) + (c1009390cNF.LIZIZ * (anoleComponentLayoutModel.y - d))));
                        if (C1014320cVC.LIZJ(c1009390cNFLIZIZ.LIZ) && C1014320cVC.LIZJ(c1009390cNFLIZIZ.LIZIZ)) {
                            marginLayoutParams2.width = -1;
                            marginLayoutParams2.height = -1;
                            marginLayoutParams2.setMarginStart((int) pointF2.x);
                            marginLayoutParams2.topMargin = (int) pointF2.y;
                            C786410Ut5.W5(view, marginLayoutParams2);
                        } else if (C1014320cVC.LIZJ(c1009390cNFLIZIZ.LIZ)) {
                            marginLayoutParams2.width = -1;
                            marginLayoutParams2.setMarginStart((int) pointF2.x);
                            marginLayoutParams2.topMargin = (int) pointF2.y;
                            C786410Ut5.W5(view, marginLayoutParams2);
                        } else if (C1014320cVC.LIZJ(c1009390cNFLIZIZ.LIZIZ)) {
                            marginLayoutParams2.height = -1;
                            marginLayoutParams2.setMarginStart((int) pointF2.x);
                            marginLayoutParams2.topMargin = (int) pointF2.y;
                            C786410Ut5.W5(view, marginLayoutParams2);
                        } else {
                            marginLayoutParams2.setMarginStart((int) pointF2.x);
                            marginLayoutParams2.topMargin = (int) pointF2.y;
                            C786410Ut5.W5(view, marginLayoutParams2);
                        }
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        int i2 = 0;
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            marginStart = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart();
                        } else {
                            marginStart = 0;
                        }
                        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                            marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd();
                        } else {
                            marginEnd = 0;
                        }
                        ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                        if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                            i = marginLayoutParams4.topMargin;
                        } else {
                            i = 0;
                        }
                        ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
                        if ((layoutParams5 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams5) != null) {
                            i2 = marginLayoutParams3.bottomMargin;
                        }
                        abstractC1014240cV4.LLJJJ = new C1014350cVF(marginStart, marginEnd, i2, i);
                    } else {
                        throw new C0NBE("contentView.layoutParams as? ViewGroup.MarginLayoutParams is null");
                    }
                } else if (Intrinsics.LJFF(str, "absolute")) {
                    LJFF(abstractC1014240cV4, viewGroup, view, c1014390cVJY2, anoleComponentLayoutModel, false);
                } else {
                    throw new C0NBE("componentModel.layout.type is unknown type");
                }
                AnoleComponentAnimationModel anoleComponentAnimationModelLIZIZ = C1016660cYy.LIZIZ(anoleComponentAppearModel.animations);
                if (anoleComponentAnimationModelLIZIZ != null && (c1014350cVFLIZIZ = C1014530cVX.LIZIZ(abstractC1014240cV4, viewGroup, view, anoleComponentAnimationModelLIZIZ.type, true)) != null) {
                    ViewGroup.LayoutParams layoutParams6 = view.getLayoutParams();
                    if ((layoutParams6 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams6) != null) {
                        marginLayoutParams.setMarginStart(c1014350cVFLIZIZ.LIZ);
                        marginLayoutParams.topMargin = c1014350cVFLIZIZ.LIZLLL;
                        C786410Ut5.W5(view, marginLayoutParams);
                    }
                }
                if (anoleComponentLayoutModel.angle != 0 && ((List) C0RRX.LIZ.getValue()).contains(abstractC1014240cV4.LL.slotID)) {
                    C786410Ut5.Ab(view, anoleComponentLayoutModel.angle);
                    return;
                }
                return;
            }
            throw new C0NBE("displayInfo is null");
        }
        throw new C0NBE("componentModel.layout is null");
    }

    public static final void LJI(int i, double d, ViewGroup.MarginLayoutParams marginLayoutParams, AbstractC1014240cV4 abstractC1014240cV4) {
        double d2 = ((double) i) - d;
        if (d2 > 0.0d) {
            marginLayoutParams.setMarginStart((int) (d2 / ((double) 2)));
        }
        abstractC1014240cV4.LJIILL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("layoutByAbsolute,centerHorizontal,parentWidth = ");
        sbLIZ.append(i);
        sbLIZ.append(",viewWidth = ");
        sbLIZ.append(d);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LJII(int i, double d, ViewGroup.MarginLayoutParams marginLayoutParams, AbstractC1014240cV4 abstractC1014240cV4) {
        double d2 = ((double) i) - d;
        if (d2 > 0.0d) {
            marginLayoutParams.topMargin = (int) (d2 / ((double) 2));
        }
        abstractC1014240cV4.LJIILL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("layoutByAbsolute,centerVertical,parentHeight = ");
        sbLIZ.append(i);
        sbLIZ.append(",viewHeight = ");
        sbLIZ.append(d);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03bb  */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, X.0cNF] */
    /* JADX WARN: Type inference failed for: r0v44, types: [X.0cVD] */
    /* JADX WARN: Type inference failed for: r0v57, types: [X.0cVD] */
    /* JADX WARN: Type inference failed for: r0v70, types: [X.0cVD] */
    /* JADX WARN: Type inference failed for: r0v83, types: [X.0cVD] */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, X.0cNF] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJFF(final X.AbstractC1014240cV4 r37, final android.view.ViewGroup r38, final android.view.View r39, final X.C1014390cVJ r40, final com.ss.android.ugc.aweme.commercialize.model.AnoleComponentLayoutModel r41, boolean r42) {
        /*
            Method dump skipped, instruction units count: 976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1014260cV6.LJFF(X.0cV4, android.view.ViewGroup, android.view.View, X.0cVJ, com.ss.android.ugc.aweme.commercialize.model.AnoleComponentLayoutModel, boolean):void");
    }

    public static final void LJIIIZ(boolean z, ViewGroup.MarginLayoutParams marginLayoutParams, int i, double d, int i2, int i3, boolean z2, boolean z3, C259800zU<C1009390cNF> c259800zU, boolean z4) {
        if (z) {
            marginLayoutParams.topMargin = (int) (((double) i) - (d + ((double) i2)));
        } else {
            marginLayoutParams.topMargin = i3;
            if (!z2) {
                marginLayoutParams.bottomMargin = i2;
            }
        }
        if (!z3) {
            int i4 = (int) c259800zU.element.LIZIZ;
            if (!z4) {
                marginLayoutParams.height = i4;
            }
        }
    }

    public static final void LJIIIIZZ(boolean z, ViewGroup.MarginLayoutParams marginLayoutParams, int i, double d, int i2, boolean z2, int i3, boolean z3, boolean z4, C259800zU<C1009390cNF> c259800zU, boolean z5) {
        if (z) {
            marginLayoutParams.setMarginStart((int) (((double) i) - (d + ((double) i2))));
        } else {
            if (!z2) {
                marginLayoutParams.setMarginStart(i3);
            } else {
                marginLayoutParams.setMarginStart(0);
            }
            if (!z3) {
                marginLayoutParams.setMarginEnd(i2);
            }
        }
        if (!z4) {
            int i4 = (int) c259800zU.element.LIZ;
            if (!z5) {
                marginLayoutParams.width = i4;
            }
        }
    }
}
