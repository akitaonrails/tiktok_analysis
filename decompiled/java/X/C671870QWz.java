package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0QWz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C671870QWz {
    public static final C671870QWz LIZ = new C671870QWz();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(670));

    public static List LIZIZ() {
        return (List) LIZIZ.getValue();
    }

    public static EnumC671670QWf LIZ(int i) {
        return (EnumC671670QWf) C13LP.LJJJLZIJ(i, LIZIZ());
    }

    public static String LJFF(EnumC671670QWf enumC671670QWf) {
        int i = C671740QWm.LIZ[enumC671670QWf.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return C20642515q3.LJI(2131857235);
            }
            throw new C1954807lC();
        }
        return C20642515q3.LJI(2131857234);
    }

    public static void LJ(C19U1 c19u1, Context context) {
        if (context == null || c19u1 == null) {
            return;
        }
        int tabCount = c19u1.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            C19U0 tabAt = c19u1.getTabAt(i);
            if (tabAt != null) {
                C671870QWz c671870QWz = LIZ;
                boolean zLIZ = tabAt.LIZ();
                c671870QWz.getClass();
                LIZJ(context, tabAt, zLIZ);
            }
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
        if (numLIZJ != null) {
            c19u1.setSelectedTabIndicatorColor(numLIZJ.intValue());
        }
    }

    public static void LIZJ(Context context, C19U0 c19u0, boolean z) {
        View view;
        if (context != null && c19u0 != null && (view = c19u0.LJFF) != null) {
            TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.ggb);
            TextView textView = (TextView) view.findViewById(R.id.ggc);
            if (z) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
                if (numLIZJ != null) {
                    int iIntValue = numLIZJ.intValue();
                    textView.setTextColor(iIntValue);
                    tuxIconView.setTintColor(iIntValue);
                    return;
                }
                return;
            }
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, context);
            if (numLIZJ2 == null) {
                return;
            }
            int iIntValue2 = numLIZJ2.intValue();
            textView.setTextColor(iIntValue2);
            tuxIconView.setTintColor(iIntValue2);
        }
    }

    public static void LIZLLL(Context context, C19U0 c19u0, String str, int i, int i2) {
        boolean z;
        int i3;
        boolean z2 = true;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        View viewSd = null;
        if (context != null) {
            viewSd = C786410Ut5.Sd(R.layout.brh, C786410Ut5.ne(context), null);
            TuxIconView tuxIconView = (TuxIconView) viewSd.findViewById(R.id.ggb);
            if (tuxIconView != null) {
                if (z) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                C786410Ut5.LLLLLLZZ(tuxIconView, i3);
            }
            TextView textView = (TextView) viewSd.findViewById(R.id.ggc);
            if (textView != null) {
                textView.setText(str);
            }
        }
        c19u0.LIZLLL(viewSd);
        if (i != i2) {
            z2 = false;
        }
        LIZJ(context, c19u0, z2);
    }
}
