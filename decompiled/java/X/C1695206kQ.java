package X;

import Y.ACListenerS137S0100000_2;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.06kQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1695206kQ {
    public static final void LIZ(C127K c127k) {
        AccessibilityManager accessibilityManager;
        View viewFindViewById;
        Object objH2 = C786410Ut5.H2(c127k.getContext(), "accessibility");
        if (objH2 instanceof AccessibilityManager) {
            accessibilityManager = (AccessibilityManager) objH2;
        } else {
            accessibilityManager = null;
        }
        if ((accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) || (viewFindViewById = c127k.findViewById(R.id.dlh)) == null) {
            return;
        }
        viewFindViewById.setClickable(false);
    }

    public static final void LIZIZ(C127K c127k, C1695306kR c1695306kR) {
        Integer numValueOf;
        if (!c1695306kR.LIZ) {
            C1584506Ih.LIZ(c127k);
            return;
        }
        EnumC1695106kP enumC1695106kP = c1695306kR.LIZIZ;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = enumC1695106kP.getIconRes();
        if (enumC1695106kP.getIconTintColor() != 0) {
            numValueOf = Integer.valueOf(enumC1695106kP.getIconTintColor());
        } else if (enumC1695106kP.getNegative()) {
            numValueOf = Integer.valueOf(R.attr.zs);
        } else {
            numValueOf = Integer.valueOf(R.attr.a1h);
        }
        c419910GdJ.LJ = numValueOf;
        c127k.setIcon(c419910GdJ);
        String strLJIIJJI = C1383370m6R.LJIIJJI(enumC1695106kP.getTitle());
        if (strLJIIJJI.length() > 0) {
            c127k.setTitle(strLJIIJJI);
        }
        String strLJIIJJI2 = C1383370m6R.LJIIJJI(enumC1695106kP.getSubTitle());
        if (strLJIIJJI2.length() > 0) {
            c127k.setSubtitle(strLJIIJJI2);
        }
        c127k.setInset(EnumC1216650hlX.PADDING_16);
        C11G4 c11g4 = new C11G4(c127k.getContext(), null);
        c11g4.LJIILLIIL(enumC1695106kP.getShowArrow());
        c11g4.LJIILL(new ACListenerS137S0100000_2(c1695306kR, 9));
        c11g4.LJIILJJIL(C1383370m6R.LJIIJJI(enumC1695106kP.getEndLabel()));
        c127k.setAccessory(c11g4);
        if (enumC1695106kP.getShowArrow()) {
            ((TuxIconView) c127k.findViewById(R.id.z1d).findViewById(R.id.k1_)).setTintColorRes(R.attr.a1p);
        }
        ((TuxTextView) c127k.findViewById(R.id.m4r)).setTuxFont(101);
        C1584506Ih.LIZIZ(c127k);
        if (enumC1695106kP.getNegative()) {
            c127k.setVariant(EnumC1216700hlc.DESTRUCTIVE);
        }
    }
}
