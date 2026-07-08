package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wIO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1775180wIO {
    public C1772690wEN LIZ;
    public AbstractC1773210wFD LIZIZ;
    public String LIZJ;
    public long LIZLLL;
    public int LJ;
    public long LJFF;
    public boolean LJI;
    public long LJII;
    public int LJIIIIZZ;
    public long LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public String LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public long LJIJ;
    public int LJIJI;
    public String LJIJJ;

    public final void LJ() {
        String str;
        Map<String, Object> map;
        LIZJ(false);
        LIZJ(true);
        String str2 = "";
        if (Intrinsics.LJFF(this.LJIIL, "")) {
            AbstractC1773210wFD abstractC1773210wFD = this.LIZIZ;
            Object obj = null;
            if (abstractC1773210wFD != null && (map = abstractC1773210wFD.LJI) != null) {
                obj = ((LinkedHashMap) map).get("request_id");
            }
            if ((obj instanceof String) && (str = (String) obj) != null) {
                str2 = str;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append('_');
            sbLIZ.append(jCurrentTimeMillis);
            sbLIZ.append('_');
            sbLIZ.append(this.LJIIJJI);
            this.LJIIL = C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Object LIZIZ(String str) {
        int i;
        String str2;
        switch (str.hashCode()) {
            case -2123425182:
                if (str.equals("data_from_cache")) {
                    return this.LIZJ;
                }
                return null;
            case -2115388485:
                if (str.equals("rd_exposure_times")) {
                    return Integer.valueOf(this.LJIILL);
                }
                return null;
            case -1923828208:
                if (str.equals("feed_track_id")) {
                    return this.LJIIL;
                }
                return null;
            case -907155211:
                if (str.equals("tab_name")) {
                    C1772690wEN c1772690wEN = this.LIZ;
                    if (c1772690wEN != null && (str2 = c1772690wEN.LJIIJJI) != null) {
                        return str2;
                    }
                    return "";
                }
                return null;
            case -452216544:
                if (str.equals("ad_show_times")) {
                    return Integer.valueOf(this.LJIIIIZZ);
                }
                return null;
            case -425459875:
                if (str.equals("play_status")) {
                    return this.LJIJJ;
                }
                return null;
            case -251809642:
                if (str.equals("show_duration")) {
                    return Long.valueOf(this.LIZLLL);
                }
                return null;
            case 139218495:
                if (str.equals("play_duration")) {
                    return Long.valueOf(this.LJIJ);
                }
                return null;
            case 748071179:
                if (str.equals("index_in_list")) {
                    return Integer.valueOf(this.LJIIJJI);
                }
                return null;
            case 751010683:
                if (str.equals("play_break_times")) {
                    return Integer.valueOf(this.LJIILLIIL);
                }
                return null;
            case 913842746:
                if (str.equals("play_percent")) {
                    return Integer.valueOf(this.LJIJI);
                }
                return null;
            case 1126388612:
                if (str.equals("show_times")) {
                    return Integer.valueOf(this.LJ);
                }
                return null;
            case 1400584710:
                if (str.equals("play_over_times")) {
                    return Integer.valueOf(this.LJIIZILJ);
                }
                return null;
            case 1413879162:
                if (str.equals("ad_show_duration")) {
                    return Long.valueOf(this.LJII);
                }
                return null;
            case 1705025548:
                if (str.equals("is_first_screen_show")) {
                    return Integer.valueOf(this.LJIILIIL);
                }
                return null;
            case 1926545019:
                if (str.equals("play_times")) {
                    return Integer.valueOf(this.LJIILJJIL);
                }
                return null;
            case 1938720680:
                if (str.equals("tab_index")) {
                    C1772690wEN c1772690wEN2 = this.LIZ;
                    if (c1772690wEN2 != null) {
                        i = c1772690wEN2.LJIIJ;
                    } else {
                        i = 0;
                    }
                    return Integer.valueOf(i);
                }
                return null;
            default:
                return null;
        }
    }

    public final void LIZJ(boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z) {
            if (this.LJIIJ) {
                C269000AgU.LIZ.getClass();
                if (C269000AgU.LIZ() == 1) {
                    this.LJII = jCurrentTimeMillis - this.LJIIIZ;
                } else {
                    this.LJII += jCurrentTimeMillis - this.LJIIIZ;
                }
                LIZLLL(jCurrentTimeMillis, z);
                return;
            }
            return;
        }
        if (!this.LJI) {
            return;
        }
        C269000AgU.LIZ.getClass();
        if (C269000AgU.LIZ() == 1) {
            this.LIZLLL = jCurrentTimeMillis - this.LJFF;
        } else {
            this.LIZLLL += jCurrentTimeMillis - this.LJFF;
        }
        LIZLLL(jCurrentTimeMillis, z);
    }

    public final void LIZ(boolean z, boolean z2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z2) {
            if (!z) {
                C269000AgU.LIZ.getClass();
                if (C269000AgU.LIZ() == 1) {
                    this.LJII = jCurrentTimeMillis - this.LJIIIZ;
                } else {
                    this.LJII += jCurrentTimeMillis - this.LJIIIZ;
                }
                this.LJIIJ = false;
            } else {
                this.LJIIIIZZ++;
                this.LJIIJ = true;
            }
            LIZLLL(jCurrentTimeMillis, z2);
            return;
        }
        if (!z) {
            C269000AgU.LIZ.getClass();
            if (C269000AgU.LIZ() == 1) {
                this.LIZLLL = jCurrentTimeMillis - this.LJFF;
            } else {
                this.LIZLLL += jCurrentTimeMillis - this.LJFF;
            }
            this.LJI = false;
        } else {
            this.LJ++;
            this.LJI = true;
        }
        LIZLLL(jCurrentTimeMillis, z2);
    }

    public final void LIZLLL(long j, boolean z) {
        C269000AgU.LIZ.getClass();
        if (C269000AgU.LIZ() == 1) {
            if (z) {
                if (this.LJIIIZ == 0) {
                    this.LJIIIZ = j;
                    return;
                }
                return;
            } else {
                if (this.LJFF != 0) {
                    return;
                }
                this.LJFF = j;
                return;
            }
        }
        if (z) {
            this.LJIIIZ = j;
        } else {
            this.LJFF = j;
        }
    }

    public C1775180wIO(C1772690wEN c1772690wEN, AbstractC1773210wFD abstractC1773210wFD, String str, long j, int i, long j2, boolean z, long j3, int i2, long j4, boolean z2, int i3, String str2, int i4, int i5, int i6, int i7, int i8, long j5, int i9, String str3) {
        this.LIZ = c1772690wEN;
        this.LIZIZ = abstractC1773210wFD;
        this.LIZJ = str;
        this.LIZLLL = j;
        this.LJ = i;
        this.LJFF = j2;
        this.LJI = z;
        this.LJII = j3;
        this.LJIIIIZZ = i2;
        this.LJIIIZ = j4;
        this.LJIIJ = z2;
        this.LJIIJJI = i3;
        this.LJIIL = str2;
        this.LJIILIIL = i4;
        this.LJIILJJIL = i5;
        this.LJIILL = i6;
        this.LJIILLIIL = i7;
        this.LJIIZILJ = i8;
        this.LJIJ = j5;
        this.LJIJI = i9;
        this.LJIJJ = str3;
    }
}
