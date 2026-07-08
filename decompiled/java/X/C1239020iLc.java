package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS135S1200000_19;
import kotlin.jvm.internal.AwS183S1100000_34;

/* JADX INFO: renamed from: X.0iLc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1239020iLc {
    public static final /* synthetic */ int LIZ = 0;

    public static CharSequence LIZ(Context context, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("   ");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ));
        int length = str.length() + 1;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_pen;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        tuxIconDrawableLIZ.setBounds(0, 0, tuxIconDrawableLIZ.LJII, tuxIconDrawableLIZ.LJIIIIZZ);
        C786410Ut5.q2(spannableStringBuilder, new C419890GdH(tuxIconDrawableLIZ, 2), length, length + 1, 34);
        return spannableStringBuilder;
    }

    public static SpannableString LIZIZ(Context context, String str, int i, AwS183S1100000_34 awS183S1100000_34, int i2) {
        if ((i2 & 4) != 0) {
            i = 61;
        }
        Function0 function0 = awS183S1100000_34;
        if ((i2 & 16) != 0) {
            function0 = AFwS207S0000000_19.get$arr$(765);
        }
        if (context == null) {
            return SpannableString.valueOf(str);
        }
        String string = context.getString(2131833856);
        C444940Hca c444940Hca = new C444940Hca();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(' ');
        sbLIZ.append(string);
        sbLIZ.append(' ');
        c444940Hca.LIZJ = C2188811AlT.LIZIZ(sbLIZ);
        c444940Hca.LIZLLL(1);
        c444940Hca.LIZIZ = false;
        c444940Hca.LIZIZ(i);
        c444940Hca.LJIIIIZZ = new AwS135S1200000_19(context, (String) null, function0, 9);
        return SpannableString.valueOf(C1236880iIA.LIZIZ(new SpannableStringBuilder(str).append((CharSequence) new SpannableString(c444940Hca.LIZ(context))), context, R.attr.a1n, string));
    }
}
