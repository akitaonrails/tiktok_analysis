package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0oSs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1474160oSs extends SurfaceView {
    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setLayoutParams: ");
        Integer numValueOf2 = null;
        if (layoutParams != null) {
            numValueOf = Integer.valueOf(layoutParams.width);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append('x');
        if (layoutParams != null) {
            numValueOf2 = Integer.valueOf(layoutParams.height);
        }
        sbLIZ.append(numValueOf2);
        sbLIZ.append(',');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(", l:");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            sbLIZ2.append(marginLayoutParams.leftMargin);
            sbLIZ2.append(", t:");
            sbLIZ2.append(marginLayoutParams.topMargin);
            sbLIZ2.append(", r:");
            sbLIZ2.append(marginLayoutParams.rightMargin);
            sbLIZ2.append(", b:");
            sbLIZ2.append(marginLayoutParams.bottomMargin);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(", g:");
            sbLIZ3.append(((FrameLayout.LayoutParams) layoutParams).gravity);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        C20441214yg.LIZIZ("LiveSurfaceView", strLIZIZ);
        super.setLayoutParams(layoutParams);
    }

    @Override // android.view.SurfaceView, android.view.View
    public void setVisibility(int i) {
        String strLIZIZ;
        if (i != 0) {
            if (i != 4) {
                if (i != 8) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("UNKNOWN(");
                    sbLIZ.append(i);
                    sbLIZ.append(')');
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    strLIZIZ = "GONE";
                }
            } else {
                strLIZIZ = "INVISIBLE";
            }
        } else {
            strLIZIZ = "VISIBLE";
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("setVisibility: ");
        sbLIZ2.append(strLIZIZ);
        C20441214yg.LIZIZ("LiveSurfaceView", C2188811AlT.LIZIZ(sbLIZ2));
        super.setVisibility(i);
    }

    public C1474160oSs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
