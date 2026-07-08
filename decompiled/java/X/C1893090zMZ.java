package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0zMZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1893090zMZ {
    public final Context LIZ;
    public final Intent LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;

    /* JADX WARN: Removed duplicated region for block: B:37:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instruction units count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1893090zMZ.LIZIZ():void");
    }

    public C1893090zMZ(Context context, Intent intent) {
        this.LIZ = context;
        this.LIZIZ = intent;
        String strLIZ = LIZ(intent, "url");
        strLIZ = strLIZ == null ? "" : strLIZ;
        this.LIZJ = strLIZ;
        Uri.decode(strLIZ);
        this.LIZLLL = LIZ(intent, "mob_extra");
        String strLIZ2 = LIZ(intent, "requestId");
        this.LJ = strLIZ2 != null ? strLIZ2 : "";
        this.LJFF = LIZ(intent, "banner_schema");
        this.LJI = LIZ(intent, "share_url");
    }

    public static String LIZ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
