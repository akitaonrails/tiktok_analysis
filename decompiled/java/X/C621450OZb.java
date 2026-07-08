package X;

import android.content.res.Resources;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OZb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C621450OZb {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZJ(String str, String str2) {
        if (C123100dR.LIZ(str2) && C123100dR.LIZ(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(" · ");
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (str2 == null) {
            if (str != null) {
                return str;
            }
            return "";
        }
        return str2;
    }

    public static String LIZLLL(Long l, Resources resources) {
        long jLongValue;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        CharSequence charSequenceLIZ = C19374310qz.LIZ(Long.valueOf(jLongValue), new C19348710mr(null, EnumC19356310o5.COMPACT, null, 13), null, 0, 28);
        boolean zLIZ = C1206904nr.LIZ();
        if (jLongValue <= 0) {
            if (zLIZ) {
                return resources.getString(2131844688);
            }
            return resources.getString(2131844790);
        }
        if (zLIZ) {
            if (jLongValue > 2147483647L) {
                jLongValue = 2147483647L;
            }
            return resources.getQuantityString(2131755620, (int) jLongValue, charSequenceLIZ);
        }
        return resources.getString(2131858571, charSequenceLIZ);
    }

    public static void LIZ(C1849470yED c1849470yED, String str, String str2) {
        if (C123100dR.LIZ(str2) && C123100dR.LIZ(str)) {
            c1849470yED.LIZJ(str2, str);
        } else {
            c1849470yED.LIZ(LIZJ(str, str2));
        }
    }

    public static void LIZIZ(C1849470yED c1849470yED, Long l, String str, String str2, int i, Resources resources) {
        if (i == 3) {
            LIZ(c1849470yED, str, str2);
            return;
        }
        String strLIZLLL = LIZLLL(l, resources);
        if (C123100dR.LIZ(str)) {
            c1849470yED.LIZJ(str, strLIZLLL);
        } else {
            c1849470yED.LIZ(strLIZLLL);
        }
    }

    public static void LJ(C1849470yED c1849470yED, View view, TuxIconView tuxIconView, TuxTextView tuxTextView, Double d, Boolean bool, int i, String str, String str2, long j, Resources resources, Function1 function1) {
        LIZJ(str, str2);
        if (i == 3 && d != null && !Intrinsics.LJFF(bool, Boolean.TRUE)) {
            C337180DJs.LIZJ(view);
            C337180DJs.LIZJ(tuxIconView);
            tuxTextView.setTuxFont(62);
            function1.invoke(Boolean.TRUE);
            tuxTextView.setText(C786410Ut5.k4(Locale.US, "%.1f", Arrays.copyOf(new Object[]{d}, 1)));
            LIZ(c1849470yED, str, str2);
            return;
        }
        if (j >= 1) {
            String strLIZLLL = LIZLLL(Long.valueOf(j), resources);
            C337180DJs.LIZJ(view);
            C337180DJs.LIZ(tuxIconView);
            function1.invoke(Boolean.FALSE);
            tuxTextView.setTuxFont(61);
            tuxTextView.setText(strLIZLLL);
        } else {
            C337180DJs.LIZ(view);
        }
        LIZ(c1849470yED, str, str2);
    }
}
