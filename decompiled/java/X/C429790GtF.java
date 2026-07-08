package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GtF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C429790GtF {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view) {
        View viewFindViewById;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.pf1);
        if (viewGroup != null && (viewFindViewById = viewGroup.findViewById(R.id.bma)) != null) {
            C786410Ut5.LJJJLZIJ(viewFindViewById, viewGroup);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, view.getContext());
            if (numLIZJ != null) {
                view.setBackgroundColor(numLIZJ.intValue());
            }
            view.getBackground().setAlpha(255);
        }
    }

    public static void LIZIZ(View view) {
        ViewGroup.LayoutParams layoutParams;
        int i;
        ViewGroup.LayoutParams layoutParams2;
        if (C1902710zc5.LIZJ()) {
            return;
        }
        Context context = view.getContext();
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.pf1);
        int iLIZIZ = (int) C1041450dCx.LIZIZ(6.0f, context);
        View viewFindViewById = view.findViewById(R.id.pe1);
        if (viewGroup instanceof C1907340zjY) {
            View viewFindViewById2 = view.findViewById(R.id.peb);
            if (viewFindViewById2 != null) {
                viewFindViewById = viewFindViewById2.findViewById(R.id.pe4);
            } else {
                viewFindViewById = null;
            }
        }
        View viewFindViewById3 = view.findViewById(R.id.pe5);
        if (viewFindViewById3 != null && viewFindViewById3.getVisibility() == 0) {
            Object parent = viewFindViewById3.getParent();
            if (parent instanceof View) {
                viewFindViewById = (View) parent;
            } else {
                viewFindViewById = null;
            }
        }
        if (viewGroup instanceof ConstraintLayout) {
            layoutParams = new C19ME(iLIZIZ, iLIZIZ);
        } else if (viewGroup instanceof RelativeLayout) {
            layoutParams = new RelativeLayout.LayoutParams(iLIZIZ, iLIZIZ);
        } else {
            layoutParams = new ViewGroup.LayoutParams(iLIZIZ, iLIZIZ);
        }
        if (viewGroup != null) {
            int iLIZIZ2 = (int) C1041450dCx.LIZIZ(4.0f, context);
            int iLIZIZ3 = ((int) C1041450dCx.LIZIZ(10 - (((int) 6.0f) / 2), context)) - viewGroup.getPaddingTop();
            if (viewFindViewById != null && (layoutParams2 = viewFindViewById.getLayoutParams()) != null) {
                i = layoutParams2.height;
            } else {
                i = 0;
            }
            int i2 = iLIZIZ3 + (i / 2);
            if (layoutParams instanceof C19ME) {
                C19ME c19me = (C19ME) layoutParams;
                c19me.startToStart = viewGroup.getId();
                c19me.topToTop = viewGroup.getId();
                c19me.setMarginStart(iLIZIZ2);
                ((ViewGroup.MarginLayoutParams) c19me).topMargin = i2;
            } else if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams3.setMarginStart(iLIZIZ2);
                layoutParams3.topMargin = i2;
            }
        }
        View view2 = new View(context);
        view2.setId(R.id.bma);
        Drawable drawableLIZ = C420660GeW.LIZ(context.getResources(), R.drawable.agm, null);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a09, context);
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            if (drawableLIZ != null) {
                Drawable drawableMutate = drawableLIZ.mutate();
                if (drawableMutate != null) {
                    drawableMutate.setTint(iIntValue);
                }
                view2.setBackground(drawableLIZ);
            }
        } else if (drawableLIZ != null) {
            view2.setBackground(drawableLIZ);
        }
        if (viewGroup != null && viewGroup.indexOfChild(view2) == -1) {
            viewGroup.addView(view2, layoutParams);
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a09, view.getContext());
        if (numLIZJ2 != null) {
            view.setBackgroundColor(numLIZJ2.intValue());
        }
        view.getBackground().setAlpha(20);
    }
}
