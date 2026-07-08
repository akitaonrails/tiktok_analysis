package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.templatecore.templatedata.MvThemeData;
import lth.o;

/* JADX INFO: renamed from: X.0MeE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C573360MeE {
    public final Keva LIZ = Keva.getRepo("pic_mv_theme_data_keva");

    public final void LIZ(MvThemeData mvThemeData) {
        this.LIZ.storeBoolean("photo_mv_is1080p", C573200Mdy.LIZ());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PicMvThemeDataKeva: enable_photo_to_1080p = ");
        sbLIZ.append(C573200Mdy.LIZ());
        C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        try {
            this.LIZ.storeString("single_mv", o.LIZIZ.LJIILL(mvThemeData));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIJ(C1398350mUb.LIZIZ, "saveSingleMvThemeData error", e);
        }
    }

    public final void LIZIZ(MvThemeData mvThemeData) {
        int iLIZIZ;
        Effect effect;
        Keva keva = this.LIZ;
        if (mvThemeData != null && (effect = mvThemeData.effect) != null) {
            iLIZIZ = C385400F9e.LIZIZ(effect);
        } else {
            iLIZIZ = 1;
        }
        keva.storeInt("photo_mv_version", iLIZIZ);
        this.LIZ.storeBoolean("photo_mv_is1080p", C573200Mdy.LIZ());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PicMvThemeDataKeva: enable_photo_to_1080p = ");
        sbLIZ.append(C573200Mdy.LIZ());
        C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        try {
            this.LIZ.storeString("slideshow_mv", o.LIZIZ.LJIILL(mvThemeData));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIJ(C1398350mUb.LIZIZ, "saveSlideShowMvThemeData error", e);
        }
    }
}
