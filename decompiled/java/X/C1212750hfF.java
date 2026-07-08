package X;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.0hfF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1212750hfF extends C21459218yU {
    @Override // X.C21459118yT
    public final boolean LIZ(String str) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "feed_detail_page_marquee_fix", true, true)) {
            return C444960Hcc.LIZJ(getContext());
        }
        return super.LIZ(str);
    }

    @Override // X.C21459218yU, X.C21459118yT
    public void setText(String str) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "feed_detail_page_marquee_fix", true, true)) {
            this.LLIZ = 0.0f;
            this.LLJI = 0L;
            boolean zLIZ = LIZ(str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            if (zLIZ) {
                sbLIZ.append("    ");
                sbLIZ.append(str);
            } else {
                sbLIZ.append(str);
                sbLIZ.append("    ");
            }
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            this.LLILLL = strLIZIZ;
            this.LLJIJIL = zLIZ;
            this.LLIZLLLIL = this.LL.measureText(strLIZIZ);
            requestLayout();
            return;
        }
        super.setText(str);
    }

    public C1212750hfF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
