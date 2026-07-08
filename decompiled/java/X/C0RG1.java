package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.0RG1, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RG1 {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C0RG3());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0RG4());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C0RG2());

    public static float LIZIZ() {
        return ((Number) LIZJ.getValue()).floatValue();
    }

    public static void LIZ(View view, C690990R8n c690990R8n, int i, int i2, int i3, int i4, List list, Aweme aweme) {
        String aid;
        double d = ((double) i2) / ((double) i);
        double d2 = ((double) i4) / ((double) i3);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[doAdaption] [start] aid ");
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(C786410Ut5.j4(" videoScale = %.4f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1)));
        sbLIZ.append(C786410Ut5.j4(" containerScale = %.4f", Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1)));
        C2188811AlT.LIZIZ(sbLIZ);
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        Integer num = null;
        Integer num2 = null;
        Float fValueOf = null;
        Float fValueOf2 = null;
        for (AbstractC692920RFy abstractC692920RFy : list) {
            if (abstractC692920RFy != null && abstractC692920RFy.LIZ(num, num2, i, i2, i3, i4, aweme)) {
                num2 = abstractC692920RFy.LIZ;
                num = abstractC692920RFy.LIZIZ;
                if (abstractC692920RFy.LIZJ != null) {
                    fValueOf = Float.valueOf(r0.intValue());
                } else {
                    fValueOf = null;
                }
                if (abstractC692920RFy.LIZLLL != null) {
                    fValueOf2 = Float.valueOf(r0.intValue());
                } else {
                    fValueOf2 = null;
                }
            }
        }
        if (c690990R8n != null) {
            if (num != null) {
                c690990R8n.LIZ = num.intValue();
            }
            if (num2 != null) {
                c690990R8n.LIZIZ = num2.intValue();
            }
        }
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (num != null) {
                layoutParams.width = num.intValue();
            }
            if (num2 != null) {
                layoutParams.height = num2.intValue();
            }
            C786410Ut5.W5(view, layoutParams);
            if (fValueOf != null) {
                C786410Ut5.Jc(view, fValueOf.floatValue());
            }
            if (fValueOf2 != null) {
                C786410Ut5.ed(view, fValueOf2.floatValue());
            }
        }
    }
}
