package X;

import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import java.util.HashMap;

/* JADX INFO: renamed from: X.10zp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19429110zp {
    public static final C19429110zp LIZ = new C19429110zp();
    public static C19424410z4 LIZIZ;
    public static C19429410zs LIZJ;
    public static C19429410zs LIZLLL;
    public static HashMap<String, InterfaceC19403010vc> LJ;
    public static ProfileNaviDataModel LJFF;

    public final synchronized void LIZ() {
        LIZIZ = null;
        LIZLLL = null;
        LIZJ = null;
        LJFF = null;
    }

    public final synchronized void LIZIZ(ProfileNaviDataModel profileNaviDataModel) {
        if (LJ == null) {
            LJFF = profileNaviDataModel;
        } else {
            LIZJ(C19424810z8.LIZ(profileNaviDataModel, LJ));
        }
    }

    public final synchronized void LIZJ(C19424410z4 c19424410z4) {
        LIZ();
        LIZIZ = c19424410z4;
    }
}
