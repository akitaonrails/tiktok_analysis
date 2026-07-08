package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0h3u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1189600h3u {
    public static final /* synthetic */ int LIZ = 0;

    public static SpannableString LIZ(int i) {
        SpannableString spannableString = new SpannableString(" ");
        C786410Ut5.p2(spannableString, new C416800GVy(i), 0, 1, 33);
        return spannableString;
    }

    public static List LIZIZ(Context context) {
        return C1697810uHb.LJIIJJI(new C1189610h3v(LJ(R.raw.icon_eye_lash), context.getString(2131857064)), new C1189610h3v(LJ(R.raw.icon_fire_3), context.getString(2131857065)), new C1189610h3v(LJ(R.raw.icon_round_stack), context.getString(2131857066)));
    }

    public static SpannableStringBuilder LIZLLL(Context context) {
        int i;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        try {
            i = 0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX c1205490hTX = C1205490hTX.LIZ;
            C1EMR c1emr = C1EMR.POI_CREATOR_STRENGTH_FEAT;
            c1205490hTX.getClass();
            C1205490hTX.LIZLLL(c1emr, "get_creator_banner_subtitle_span", null, e);
        }
        for (Object obj : LIZIZ(context)) {
            int i2 = i + 1;
            if (i >= 0) {
                C1189610h3v c1189610h3v = (C1189610h3v) obj;
                C419910GdJ c419910GdJ = c1189610h3v.LIZ;
                SpannableString spannableString = new SpannableString("x");
                C786410Ut5.p2(spannableString, c419910GdJ.LIZIZ(2, context), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)))).append((CharSequence) c1189610h3v.LIZIZ);
                if (i != r13.size() - 1) {
                    spannableStringBuilder.append((CharSequence) LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)))).append((CharSequence) "·").append((CharSequence) LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))));
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
            return spannableStringBuilder;
        }
        return spannableStringBuilder;
    }

    public static C419910GdJ LJ(int i) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        return c419910GdJ;
    }

    public static Integer LIZJ(Context context, int i, String str) {
        Integer numLJ;
        if (str != null) {
            try {
                if (!u.LJJIIJZLJL(str, "tux://color", false)) {
                    str = null;
                }
                if (str != null && (numLJ = C2248361CzK.LJ(context, str)) != null) {
                    return Integer.valueOf(numLJ.intValue());
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1205490hTX c1205490hTX = C1205490hTX.LIZ;
                C1EMR c1emr = C1EMR.POI_CREATOR_STRENGTH_FEAT;
                c1205490hTX.getClass();
                C1205490hTX.LIZLLL(c1emr, "get_color", null, e);
            }
        }
        return Integer.valueOf(i);
    }
}
