package X;

import android.app.Application;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;

/* JADX INFO: renamed from: X.1BWL, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BWL {
    public static C1BWP LIZ;

    public static final Application LIZ() {
        C1BWP c1bwp = LIZ;
        if (c1bwp != null) {
            AwemeHostApplication awemeHostApplication = ((C1BWN) c1bwp).LIZ;
            if (awemeHostApplication != null) {
                return awemeHostApplication;
            }
            Application applicationLIZ = C1967207nC.LIZ();
            if (applicationLIZ != null) {
                return applicationLIZ;
            }
        }
        return C1967207nC.LIZ();
    }

    public static Resources LIZJ() {
        return ((C1BWN) LIZ).LIZ.getResources();
    }
}
