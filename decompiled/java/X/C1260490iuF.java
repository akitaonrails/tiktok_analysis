package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import java.util.Date;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: renamed from: X.0iuF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1260490iuF {
    public static final C01GW<C1260490iuF> LIZIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(749));
    public final Keva LIZ = KevaImpl.getRepo("photo_mode_strengthen_intention_repo_1", 1);

    public final void LIZIZ() {
        this.LIZ.storeLong(LJ("photo_mode_banner_bottom_show_times"), 0L);
    }

    public final int LIZJ() {
        return this.LIZ.getInt(LJ("photo_mode_banner_show_times"), 0);
    }

    public static String LJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJII(C1260490iuF c1260490iuF) {
        c1260490iuF.LIZ.storeLong(LJ("photo_mode_banner_show_timestamp"), new Date().getTime());
    }

    public final void LIZ(Integer num) {
        Keva keva = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJ("photo_mode_banner_show_trend"));
        sbLIZ.append('_');
        sbLIZ.append(num);
        keva.storeLong(C2188811AlT.LIZIZ(sbLIZ), -1L);
    }

    public final long LIZLLL(Integer num) {
        Keva keva = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJ("photo_mode_banner_show_trend"));
        sbLIZ.append('_');
        sbLIZ.append(num);
        return keva.getLong(C2188811AlT.LIZIZ(sbLIZ), -1L);
    }

    public final void LJFF(int i) {
        this.LIZ.storeInt(LJ("photo_mode_banner_show_times"), i);
    }

    public final void LJIIIIZZ(Integer num) {
        Keva keva = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJ("photo_mode_banner_show_trend"));
        sbLIZ.append('_');
        sbLIZ.append(num);
        keva.storeLong(C2188811AlT.LIZIZ(sbLIZ), new Date().getTime());
    }

    public final void LJIIIZ(Integer num) {
        Keva keva = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJ("photo_mode_banner_show_type_timestamp"));
        sbLIZ.append('_');
        sbLIZ.append(num);
        keva.storeLong(C2188811AlT.LIZIZ(sbLIZ), new Date().getTime());
    }
}
