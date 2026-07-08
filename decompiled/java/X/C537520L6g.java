package X;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;

/* JADX INFO: renamed from: X.0L6g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C537520L6g {
    public static final CreativeInfo LIZ(Intent intent) {
        String strLIZ;
        String stringExtra = null;
        try {
            strLIZ = intent.getStringExtra("creation_id");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strLIZ = null;
        }
        if (strLIZ == null || strLIZ.length() == 0) {
            strLIZ = C0DMI.LIZ();
        }
        int intExtra = intent.getIntExtra("creative_version", 0);
        try {
            stringExtra = intent.getStringExtra("session_id");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        return new CreativeInfo(strLIZ, intExtra, stringExtra);
    }

    public static final CreativeInfo LIZIZ(Bundle bundle) {
        String string = bundle.getString("creation_id");
        if (string == null || string.length() == 0) {
            string = C0DMI.LIZ();
        }
        return new CreativeInfo(string, bundle.getInt("creative_version", 0), bundle.getString("session_id"));
    }

    public static final void LIZLLL(Intent intent, CreativeInfo creativeInfo) {
        LJ(intent, creativeInfo.getCreationId(), creativeInfo.getVersion(), creativeInfo.getSessionId());
    }

    public static final void LJFF(Bundle bundle, CreativeInfo creativeInfo) {
        LIZJ(creativeInfo.getVersion(), creativeInfo.getCreationId(), creativeInfo.getSessionId(), bundle);
    }

    public static final void LIZJ(int i, String str, String str2, Bundle bundle) {
        if (str.length() <= 0) {
            str = C0DMI.LIZ();
        }
        C786410Ut5.LJJJI("creation_id", str, bundle);
        bundle.putInt("creative_version", i);
        C786410Ut5.LJJJI("session_id", str2, bundle);
    }

    public static final void LJ(Intent intent, String str, int i, String str2) {
        if (str.length() <= 0) {
            str = C0DMI.LIZ();
        }
        intent.putExtra("creation_id", str);
        intent.putExtra("creative_version", i);
        intent.putExtra("session_id", str2);
    }
}
