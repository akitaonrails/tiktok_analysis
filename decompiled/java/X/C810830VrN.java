package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0VrN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C810830VrN {
    public static final List<String> LIZ = C1697810uHb.LJIILJJIL("im_push");
    public static final List<String> LIZIZ = C1697810uHb.LJIILJJIL("digg_push", "follow_push", "comment_push", "mention_push");
    public static final List<String> LIZJ;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("follow_new_video_push");
        arrayList.add("live_push");
        LIZJ = arrayList;
    }

    public static int LIZIZ(C814730Vxf c814730Vxf) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("should disable sound: ");
        sbLIZ.append(C0C64.LJIILLIIL().LJIIIZ(31744, "disable_push_sound", true, false));
        sbLIZ.append(", sound type: ");
        if (c814730Vxf != null) {
            numValueOf = Integer.valueOf(c814730Vxf.soundType);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("push_sound_kill_switch", true) && c814730Vxf != null && C0C64.LJIILLIIL().LJIIIZ(31744, "disable_push_sound", true, false)) {
            return c814730Vxf.soundType;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 4, "notification_sound_type", true);
    }

    public static Uri LIZ(int i, Context context) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("android.resource://");
        sbLIZ.append(context.getPackageName());
        sbLIZ.append('/');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        try {
            EnumC810840VrO.Companion.getClass();
            int i2 = C810850VrP.LIZ[C810860VrQ.LIZ(i).ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(strLIZIZ);
                        sbLIZ2.append("raw/tiktok_customized_tone");
                        return UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    return null;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(strLIZIZ);
                sbLIZ3.append(R.raw.tiktok_customized_tone_v2);
                return UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ3));
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(strLIZIZ);
            sbLIZ4.append(R.raw.tiktok_customized_tone);
            return UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ4));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
