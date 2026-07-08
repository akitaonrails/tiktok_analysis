package X;

import android.app.Application;
import android.text.TextUtils;
import com.bytedance.bpea.basics.Cert;
import go5.c;
import org.json.JSONArray;
import org.json.JSONObject;
import yo5.a$a;

/* JADX INFO: renamed from: X.0uy7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1724170uy7 {
    public final Application LIZ;
    public String LIZIZ;
    public JSONArray LIZJ;
    public JSONObject LIZLLL;
    public JSONArray LJ;
    public JSONArray LJFF;
    public JSONArray LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public InterfaceC1724090uxz LJIIJJI;
    public String LJIIL;
    public AbstractC808800Vo6 LJIILIIL;
    public String LJIILJJIL;
    public String LJIILL;
    public InterfaceC1724010uxr LJIILLIIL;
    public String LJIIZILJ;
    public Cert LJIJ;
    public Cert LJIJI;
    public final Cert LJIJJ;
    public String LJIJJLI;
    public InterfaceC1724220uyC LJIL;
    public c LJJ;
    public a$a LJJI;
    public InterfaceC1724190uy9 LJJIFFI;
    public InterfaceC930803kQ LJJII;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{mContext=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mHost='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", mBankCardRules=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", mUnavailableCardBin=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", mMethods=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", mStoredMethods=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", mOrgId='");
        sbLIZ.append(this.LJII);
        sbLIZ.append('\'');
        sbLIZ.append(", mMerchantId='");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append('\'');
        sbLIZ.append(", mSessionId='");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", mRsaPublicKey='");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1724170uy7(C1724180uy8 c1724180uy8) {
        this.LIZ = c1724180uy8.LIZ;
        String str = c1724180uy8.LIZIZ;
        this.LIZIZ = str;
        this.LIZJ = c1724180uy8.LIZLLL;
        this.LIZLLL = c1724180uy8.LJ;
        this.LJI = c1724180uy8.LJFF;
        this.LJ = c1724180uy8.LJI;
        this.LJFF = c1724180uy8.LJII;
        this.LJII = c1724180uy8.LJIIIIZZ;
        this.LJIIIIZZ = c1724180uy8.LJIIIZ;
        this.LJIIIZ = c1724180uy8.LJIIJ;
        this.LJIIJ = c1724180uy8.LJIIJJI;
        this.LJIIJJI = c1724180uy8.LJIIL;
        this.LJIIL = c1724180uy8.LJIILIIL;
        this.LJIILIIL = c1724180uy8.LJIILJJIL;
        this.LJIILJJIL = null;
        this.LJIILL = null;
        this.LJIILLIIL = c1724180uy8.LJIILL;
        this.LJIIZILJ = c1724180uy8.LJIILLIIL;
        this.LJIJ = c1724180uy8.LJIIZILJ;
        this.LJIJJ = c1724180uy8.LJIJI;
        this.LJIJI = c1724180uy8.LJIJ;
        this.LJIJJLI = c1724180uy8.LJIJJ;
        this.LJIL = c1724180uy8.LJIJJLI;
        this.LJJ = c1724180uy8.LJIL;
        this.LJJI = c1724180uy8.LJJ;
        this.LJJIFFI = c1724180uy8.LJJI;
        this.LJJII = c1724180uy8.LJJIFFI;
        if (!TextUtils.isEmpty(str)) {
            C916403i6.LIZ = this.LIZIZ;
        }
    }
}
