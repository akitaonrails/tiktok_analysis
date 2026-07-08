package X;

import android.text.TextUtils;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1Beg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2210081Beg {
    public final String LIZ;
    public final String LIZJ;
    public String LIZLLL;
    public InterfaceC844900XCm LJ;
    public String LJFF;
    public boolean LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public C2210461BfI LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public long LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public InterfaceC23070092e LJIJI;
    public boolean LJIJJ;
    public String LJJ;
    public String LJJI;
    public boolean LJJIFFI;
    public InterfaceC844950XCr LJJII;
    public boolean LJJIII;
    public boolean LJJIIJ;
    public C0XE6 LJJIIZ;
    public boolean LIZIZ = true;
    public boolean LJIJJLI = true;
    public boolean LJIL = true;
    public boolean LJJIIJZLJL = true;

    public final String LIZ() {
        if (!TextUtils.isEmpty(this.LJJ)) {
            return this.LJJ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str = this.LIZ;
        if (str != null) {
            str.toString();
        } else {
            str = "";
        }
        sbLIZ.append(str);
        sbLIZ.append(e3.g);
        sbLIZ.append("bd_tea_agent.db");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2210081Beg(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str2)) {
                this.LIZ = str;
                this.LIZJ = str2;
                return;
            }
            throw new IllegalStateException("Channel must not be empty!");
        }
        throw new IllegalStateException("App id must not be empty!");
    }
}
