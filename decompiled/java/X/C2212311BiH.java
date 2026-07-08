package X;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.1BiH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2212311BiH {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL;
    public String LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public boolean LJIJI = true;

    public final String LIZIZ() {
        if (LIZ(this.LIZ)) {
            C2212231Bi9.LJJJI.getClass();
            C844470XAv.LIZ.getClass();
            this.LIZ = String.valueOf(C844470XAv.LJIIJ);
        }
        return this.LIZ;
    }

    public final String LIZJ() {
        if (LIZ(this.LIZIZ)) {
            C2212231Bi9.LJJJI.getClass();
            C844470XAv.LIZ.getClass();
            String str = C844470XAv.LJ;
            if (str == null) {
                str = null;
            }
            this.LIZIZ = str;
        }
        return this.LIZIZ;
    }

    public final String LIZLLL() {
        if (LIZ(this.LJFF)) {
            C2212231Bi9.LJJJI.getClass();
            C844470XAv.LIZ.getClass();
            this.LJFF = C844470XAv.LJIILL;
        }
        return this.LJFF;
    }

    public final String LJ() {
        if (LIZ(this.LJIIIZ)) {
            C2212231Bi9.LJJJI.getClass();
            this.LJIIIZ = C1031100cwG.LIZ().getDeviceId();
        }
        return this.LJIIIZ;
    }

    public final String LJFF() {
        if (LIZ(this.LJI)) {
            C2212231Bi9.LJJJI.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            C844470XAv.LIZ.getClass();
            sbLIZ.append(C844470XAv.LJ());
            sbLIZ.append("");
            this.LJI = C2188811AlT.LIZIZ(sbLIZ);
        }
        return this.LJI;
    }

    public final String LJI() {
        if (LIZ(this.LJ)) {
            C2212231Bi9.LJJJI.getClass();
            C844470XAv.LIZ.getClass();
            this.LJ = String.valueOf(C844470XAv.LIZLLL());
        }
        return this.LJ;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(LIZLLL())) {
            sb.append("&channel=");
            sb.append(Uri.encode(LIZLLL()));
        }
        if (!TextUtils.isEmpty(LIZIZ())) {
            sb.append("&aid=");
            sb.append(Uri.encode(LIZIZ()));
        }
        if (LIZ(this.LJIILLIIL)) {
            C2212231Bi9.LJJJI.getClass();
            this.LJIILLIIL = "";
        }
        if (!TextUtils.isEmpty(this.LJIILLIIL)) {
            sb.append("&gaid=");
            if (LIZ(this.LJIILLIIL)) {
                C2212231Bi9.LJJJI.getClass();
                this.LJIILLIIL = "";
            }
            sb.append(Uri.encode(this.LJIILLIIL));
        }
        if (!TextUtils.isEmpty(LIZJ())) {
            sb.append("&app_name=");
            sb.append(Uri.encode(LIZJ()));
        }
        if (!TextUtils.isEmpty(LJI())) {
            sb.append("&update_version_code=");
            sb.append(Uri.encode(LJI()));
        }
        if (LIZ(this.LIZJ)) {
            C2212231Bi9.LJJJI.getClass();
            this.LIZJ = "";
        }
        if (!TextUtils.isEmpty(this.LIZJ)) {
            sb.append("&version_code=");
            if (LIZ(this.LIZJ)) {
                C2212231Bi9.LJJJI.getClass();
                this.LIZJ = "";
            }
            sb.append(Uri.encode(this.LIZJ));
        }
        if (LIZ(this.LIZLLL)) {
            C2212231Bi9.LJJJI.getClass();
            C844470XAv.LIZ.getClass();
            this.LIZLLL = C844470XAv.LIZJ();
        }
        if (!TextUtils.isEmpty(this.LIZLLL)) {
            sb.append("&version_name=");
            if (LIZ(this.LIZLLL)) {
                C2212231Bi9.LJJJI.getClass();
                C844470XAv.LIZ.getClass();
                this.LIZLLL = C844470XAv.LIZJ();
            }
            sb.append(Uri.encode(this.LIZLLL));
        }
        if (!TextUtils.isEmpty(LJFF())) {
            sb.append("&manifest_version_code=");
            sb.append(Uri.encode(LJFF()));
        }
        if (LIZ(this.LJII)) {
            C2212231Bi9.LJJJI.getClass();
            this.LJII = "";
        }
        if (!TextUtils.isEmpty(this.LJII)) {
            sb.append("&language=");
            if (LIZ(this.LJII)) {
                C2212231Bi9.LJJJI.getClass();
                this.LJII = "";
            }
            sb.append(Uri.encode(this.LJII));
        } else if (!C2212231Bi9.LJIIIIZZ().LJI) {
            sb.append("&language=zh");
        }
        if (LIZ(this.LJIIIIZZ)) {
            C2212231Bi9.LJJJI.getClass();
            this.LJIIIIZZ = C1031100cwG.LIZ().getInstallId();
        }
        if (!TextUtils.isEmpty(this.LJIIIIZZ)) {
            sb.append("&iid=");
            if (LIZ(this.LJIIIIZZ)) {
                C2212231Bi9.LJJJI.getClass();
                this.LJIIIIZZ = C1031100cwG.LIZ().getInstallId();
            }
            sb.append(Uri.encode(this.LJIIIIZZ));
        }
        if (!TextUtils.isEmpty(LJ())) {
            sb.append("&device_id=");
            sb.append(Uri.encode(LJ()));
        }
        if (LIZ(this.LJIIJJI)) {
            C2212231Bi9.LJJJI.getClass();
            this.LJIIJJI = C1031100cwG.LIZ().getOpenUdid();
        }
        if (!TextUtils.isEmpty(this.LJIIJJI)) {
            sb.append("&openudid=");
            if (LIZ(this.LJIIJJI)) {
                C2212231Bi9.LJJJI.getClass();
                this.LJIIJJI = C1031100cwG.LIZ().getOpenUdid();
            }
            sb.append(Uri.encode(this.LJIIJJI));
        }
        if (LIZ(this.LJIIJ)) {
            C2212231Bi9.LJJJI.getClass();
            this.LJIIJ = "";
        }
        if (!TextUtils.isEmpty(this.LJIIJ)) {
            sb.append("&uuid=");
            if (LIZ(this.LJIIJ)) {
                C2212231Bi9.LJJJI.getClass();
                this.LJIIJ = "";
            }
            sb.append(Uri.encode(this.LJIIJ));
        }
        if (this.LJIJI) {
            if (LIZ(this.LJIIL)) {
                C2212231Bi9.LJJJI.getClass();
                C844470XAv.LIZ.getClass();
                this.LJIIL = C844470XAv.LIZJ();
            }
            if (!TextUtils.isEmpty(this.LJIIL)) {
                sb.append("&ab_version=");
                if (LIZ(this.LJIIL)) {
                    C2212231Bi9.LJJJI.getClass();
                    C844470XAv.LIZ.getClass();
                    this.LJIIL = C844470XAv.LIZJ();
                }
                sb.append(Uri.encode(this.LJIIL));
            }
            if (LIZ(this.LJIILIIL)) {
                C2212231Bi9.LJJJI.getClass();
                this.LJIILIIL = "";
            }
            if (!TextUtils.isEmpty(this.LJIILIIL)) {
                sb.append("&ab_client=");
                if (LIZ(this.LJIILIIL)) {
                    C2212231Bi9.LJJJI.getClass();
                    this.LJIILIIL = "";
                }
                sb.append(Uri.encode(this.LJIILIIL));
            }
            if (LIZ(this.LJIILJJIL)) {
                C2212231Bi9.LJJJI.getClass();
                this.LJIILJJIL = "";
            }
            if (!TextUtils.isEmpty(this.LJIILJJIL)) {
                sb.append("&ab_group=");
                if (LIZ(this.LJIILJJIL)) {
                    C2212231Bi9.LJJJI.getClass();
                    this.LJIILJJIL = "";
                }
                sb.append(Uri.encode(this.LJIILJJIL));
            }
            if (LIZ(this.LJIILL)) {
                C2212231Bi9.LJJJI.getClass();
                this.LJIILL = "";
            }
            if (!TextUtils.isEmpty(this.LJIILL)) {
                sb.append("&ab_feature=");
                if (LIZ(this.LJIILL)) {
                    C2212231Bi9.LJJJI.getClass();
                    this.LJIILL = "";
                }
                sb.append(Uri.encode(this.LJIILL));
            }
        }
        return sb.toString();
    }

    public static boolean LIZ(String str) {
        if (TextUtils.isEmpty(str) && C2212231Bi9.LJJJI != null) {
            return true;
        }
        return false;
    }
}
