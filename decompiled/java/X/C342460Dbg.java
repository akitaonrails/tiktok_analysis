package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0Dbg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C342460Dbg {
    public static final C01GW LIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(337));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3511));

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        C01GW c01gw = LIZIZ;
        if (((String) c01gw.getValue()).length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!C0C64.LJIILLIIL().LJIIIZ(31744, "edit_text_pov_enable", true, false)) {
                return false;
            }
        } else {
            C1421570n63 c1421570n63 = C1421570n63.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("language:");
            sbLIZ.append((String) c01gw.getValue());
            C201955140j.LIZJ(c1421570n63, C2188811AlT.LIZIZ(sbLIZ));
            if (!C0C64.LJIILLIIL().LJIIIZ(31744, "edit_text_pov_enable", true, false) || !((Set) LIZ.getValue()).contains(((String) c01gw.getValue()).toLowerCase(Locale.ROOT))) {
                return false;
            }
        }
        if (u4.LJIIIZ(videoPublishEditModel)) {
            return true;
        }
        return false;
    }
}
