package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: X.18ad, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21311318ad extends RelativeLayout.LayoutParams {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    @Override // android.widget.RelativeLayout.LayoutParams
    public final int[] getRules() {
        resolveLayoutDirection(getLayoutDirection());
        return super.getRules();
    }

    public C21311318ad(C21311318ad c21311318ad) {
        super((RelativeLayout.LayoutParams) c21311318ad);
    }

    @Override // android.widget.RelativeLayout.LayoutParams
    public final String debug(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("ViewGroup.LayoutParams={ width=");
        sbLIZ.append(((RelativeLayout.LayoutParams) this).width);
        sbLIZ.append(", height=");
        sbLIZ.append(((RelativeLayout.LayoutParams) this).height);
        sbLIZ.append(" }");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C21311318ad(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public C21311318ad(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public C21311318ad(RelativeLayout.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public C21311318ad(int i, int i2) {
        super(i, i2);
    }

    public C21311318ad(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
