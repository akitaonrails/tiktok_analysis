package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import kotlin.jvm.internal.AwS161S1100000_12;

/* JADX INFO: renamed from: X.0TTR, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TTR {
    public static final String LIZIZ(String str) {
        if (str.length() == 0) {
            return str;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("&locale=");
        sbLIZ.append(C2273261DyO.LIZ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final CharSequence LIZ(Context context, CharSequence charSequence, String str) {
        String str2 = (String) charSequence;
        if (str2.length() != 0 && str.length() != 0) {
            C444940Hca c444940Hca = new C444940Hca();
            c444940Hca.LIZJ = context.getString(2131846115);
            c444940Hca.LIZLLL(1);
            c444940Hca.LIZIZ = false;
            c444940Hca.LJII = true;
            c444940Hca.LIZIZ(62);
            c444940Hca.LJIIIIZZ = new AwS161S1100000_12(context, str, 7);
            return new SpannableStringBuilder().append((CharSequence) str2).append((CharSequence) " ").append(c444940Hca.LIZ(context));
        }
        return str2;
    }
}
