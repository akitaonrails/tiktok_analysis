package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.pipo.stellar.base.model.HorizonLeftRightDO;
import com.bytedance.pipo.stellar.base.model.HorizonLeftRightItemDO;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0uta, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1721360uta extends AbstractC1720840usk<HorizonLeftRightDO> {
    @Override // X.AbstractC1720840usk
    public final int LJ() {
        return R.layout.adv;
    }

    public static LinearLayout LJI(int i, Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(View.generateViewId());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(i);
        C786410Ut5.d6(linearLayout, new C19ME(0, 0));
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        return linearLayout;
    }

    @Override // X.AbstractC1720840usk
    public final void LJFF(View view, HorizonLeftRightDO horizonLeftRightDO, EnumC1720670usT enumC1720670usT) {
        LinearLayout linearLayout;
        int i;
        HorizonLeftRightDO horizonLeftRightDO2 = horizonLeftRightDO;
        super.LJFF(view, horizonLeftRightDO2, enumC1720670usT);
        Context context = view.getContext();
        if ((view instanceof LinearLayout) && (linearLayout = (LinearLayout) view) != null) {
            C786410Ut5.LJJJJJL(linearLayout);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            boolean z = true;
            if (!horizonLeftRightDO2.getItemList().isEmpty()) {
                for (HorizonLeftRightItemDO horizonLeftRightItemDO : horizonLeftRightDO2.getItemList()) {
                    ConstraintLayout constraintLayout = new ConstraintLayout(context);
                    C786410Ut5.m6(constraintLayout, new ViewGroup.LayoutParams(-1, -2));
                    constraintLayout.setClipChildren(false);
                    constraintLayout.setClipToPadding(false);
                    linearLayout.addView(constraintLayout);
                    boolean zLJIJI = u.LJIJI(horizonLeftRightItemDO.getPrefer(), "right", z);
                    String align = horizonLeftRightItemDO.getAlign();
                    if (Intrinsics.LJFF(align, "top")) {
                        i = 48;
                    } else if (Intrinsics.LJFF(align, "bottom")) {
                        i = 80;
                    } else {
                        i = 16;
                    }
                    LinearLayout linearLayoutLJI = LJI(8388611 | i, context);
                    LJII(context, linearLayoutLJI, horizonLeftRightItemDO.getLeft(), false, false, zLJIJI);
                    LinearLayout linearLayoutLJI2 = LJI(i | 8388613, context);
                    LJII(context, linearLayoutLJI2, horizonLeftRightItemDO.getRight(), true, true, !zLJIJI);
                    constraintLayout.addView(linearLayoutLJI);
                    constraintLayout.addView(linearLayoutLJI2);
                    String align2 = horizonLeftRightItemDO.getAlign();
                    C19MB c19mb = new C19MB();
                    c19mb.LJII(constraintLayout);
                    if (zLJIJI) {
                        c19mb.LJIIIIZZ(linearLayoutLJI2.getId(), 7, 0, 7);
                        c19mb.LJIILL(linearLayoutLJI2.getId(), -2);
                        c19mb.LJJII(1.0f, linearLayoutLJI2.getId());
                        c19mb.LJIIJJI(linearLayoutLJI2.getId(), -2);
                        c19mb.LJIIIIZZ(linearLayoutLJI.getId(), 6, 0, 6);
                        c19mb.LJIIIZ(linearLayoutLJI.getId(), 7, linearLayoutLJI2.getId(), 6, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
                        c19mb.LJIILL(linearLayoutLJI.getId(), 0);
                        c19mb.LJIIJ(linearLayoutLJI.getId());
                        c19mb.LJJII(0.0f, linearLayoutLJI.getId());
                        c19mb.LJIIJJI(linearLayoutLJI.getId(), -2);
                    } else {
                        c19mb.LJIIIIZZ(linearLayoutLJI.getId(), 6, 0, 6);
                        c19mb.LJIILL(linearLayoutLJI.getId(), -2);
                        c19mb.LJJII(0.0f, linearLayoutLJI.getId());
                        c19mb.LJIIJJI(linearLayoutLJI.getId(), -2);
                        c19mb.LJIIIIZZ(linearLayoutLJI2.getId(), 7, 0, 7);
                        c19mb.LJIIIZ(linearLayoutLJI2.getId(), 6, linearLayoutLJI.getId(), 7, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
                        c19mb.LJIILL(linearLayoutLJI2.getId(), 0);
                        c19mb.LJIIJ(linearLayoutLJI2.getId());
                        c19mb.LJJII(1.0f, linearLayoutLJI2.getId());
                        c19mb.LJIIJJI(linearLayoutLJI2.getId(), -2);
                    }
                    if (!Intrinsics.LJFF(align2, "top")) {
                        c19mb.LJ(linearLayoutLJI.getId(), 0);
                        c19mb.LJ(linearLayoutLJI2.getId(), 0);
                    }
                    c19mb.LIZIZ(constraintLayout);
                    z = true;
                }
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(android.content.Context r33, android.widget.LinearLayout r34, java.util.List<com.bytedance.pipo.stellar.base.model.CompoundComponentDO> r35, boolean r36, boolean r37, boolean r38) {
        /*
            Method dump skipped, instruction units count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1721360uta.LJII(android.content.Context, android.widget.LinearLayout, java.util.List, boolean, boolean, boolean):void");
    }
}
