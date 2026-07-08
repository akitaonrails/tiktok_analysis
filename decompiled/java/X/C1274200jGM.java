package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveAdmNsTypeSetting;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import java.io.File;
import kotlin.jvm.internal.AFwS208S0000000_20;

/* JADX INFO: renamed from: X.0jGM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1274200jGM {
    public static final C1274200jGM LIZ = new C1274200jGM();
    public static AbstractC1273900jFs LIZIZ;
    public static int LIZJ;

    static {
        new Object() { // from class: X.0jK4
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(4));
        };
        LIZJ = 3;
    }

    public static C207209166l LIZ(String str) {
        C207209166l c207209166l = new C207209166l("sami.model", EnumC771350UNp.NS_MODEL, null, null, str, null, false, 3, false, 748);
        c207209166l.LJFF = true;
        c207209166l.LJ = "ns_model";
        c207209166l.LJI = 20;
        return c207209166l;
    }

    public static final void LIZIZ(TEBundle tEBundle) {
        String absolutePath;
        tEBundle.setInt("adm_ns_type", LIZJ);
        LiveAdmNsTypeSetting liveAdmNsTypeSetting = LiveAdmNsTypeSetting.INSTANCE;
        tEBundle.setBool("adm_enable_ns_on_headset", liveAdmNsTypeSetting.isHeadsetEnabled());
        tEBundle.setString("adm_ns_sami_model", C771370UNr.LIZLLL(LIZ("")));
        tEBundle.setBool("enable_sami_enginecommon_debug", liveAdmNsTypeSetting.isDebugEnable());
        if (liveAdmNsTypeSetting.isDebugEnable()) {
            File fileX2 = C786410Ut5.x2(GlobalContext.getApplicationContext());
            if (fileX2 != null) {
                absolutePath = fileX2.getAbsolutePath();
            } else {
                absolutePath = null;
            }
            tEBundle.setString("sami_enginecommon_dump_dir", absolutePath);
        }
    }
}
