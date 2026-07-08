package X;

import com.lynx.jsbridge.LynxModule;
import com.lynx.tasm.TemplateData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0jur, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1299310jur {
    public boolean LIZ;
    public String LIZIZ;
    public C1299340juu LIZJ;
    public final List<C1297450jrr> LIZLLL;
    public final Map<String, AbstractC1300020jw0> LJ;
    public TemplateData LJFF;
    public TemplateData LJI;
    public AbstractC1299960jvu LJII;
    public AbstractC1301590jyX LJIIIIZZ;
    public AbstractC1299950jvt LJIIIZ;
    public EnumC1299430jv3 LJIIJ;
    public boolean LJIIJJI;

    public static int LIZLLL(int i, int i2, boolean z) {
        return z ? i | i2 : i & (~i2);
    }

    public C1299310jur() {
        this.LJIIJ = EnumC1299430jv3.UNSET;
        this.LJ = new HashMap();
        this.LIZLLL = new ArrayList();
    }

    public C1299310jur(C1299310jur c1299310jur) {
        this.LJIIJ = EnumC1299430jv3.UNSET;
        this.LIZ = c1299310jur.LIZ;
        this.LIZIZ = c1299310jur.LIZIZ;
        this.LIZJ = c1299310jur.LIZJ;
        this.LIZLLL = new ArrayList(c1299310jur.LIZLLL);
        this.LJ = new HashMap(c1299310jur.LJ);
        this.LJFF = c1299310jur.LJFF;
        this.LJI = c1299310jur.LJI;
        this.LJII = c1299310jur.LJII;
        this.LJIIIIZZ = c1299310jur.LJIIIIZZ;
        this.LJIIIZ = c1299310jur.LJIIIZ;
        this.LJIIJ = c1299310jur.LJIIJ;
        this.LJIIJJI = c1299310jur.LJIIJJI;
    }

    public final int LIZ(boolean z) {
        boolean z2 = false;
        int iLIZLLL = LIZLLL(0, 4, false);
        C1299340juu c1299340juu = this.LIZJ;
        if (c1299340juu == null || !c1299340juu.LIZ) {
            z2 = true;
        }
        int iLIZLLL2 = LIZLLL(LIZLLL(LIZLLL(iLIZLLL, 8, z2), 32, z), 1, this.LIZ);
        C1299340juu c1299340juu2 = this.LIZJ;
        if (c1299340juu2 != null) {
            iLIZLLL2 = LIZLLL(iLIZLLL2, 2, c1299340juu2.LJ);
        }
        return LIZLLL(iLIZLLL2, 16, this.LJIIJJI);
    }

    public final void LIZIZ(C1299310jur c1299310jur) {
        if (c1299310jur == this) {
            return;
        }
        this.LIZJ = c1299310jur.LIZJ;
        this.LIZ = c1299310jur.LIZ;
        this.LIZIZ = c1299310jur.LIZIZ;
        this.LJIIJJI = false;
        this.LIZLLL.addAll(c1299310jur.LIZLLL);
        if (this.LJIIJ == EnumC1299430jv3.UNSET) {
            this.LJIIJ = c1299310jur.LJIIJ;
        }
        AbstractC1299960jvu abstractC1299960jvu = this.LJII;
        if (abstractC1299960jvu == null) {
            abstractC1299960jvu = c1299310jur.LJII;
        }
        this.LJII = abstractC1299960jvu;
        AbstractC1301590jyX abstractC1301590jyX = this.LJIIIIZZ;
        if (abstractC1301590jyX == null) {
            abstractC1301590jyX = c1299310jur.LJIIIIZZ;
        }
        this.LJIIIIZZ = abstractC1301590jyX;
        AbstractC1299950jvt abstractC1299950jvt = this.LJIIIZ;
        if (abstractC1299950jvt == null) {
            abstractC1299950jvt = c1299310jur.LJIIIZ;
        }
        this.LJIIIZ = abstractC1299950jvt;
        for (Map.Entry<String, AbstractC1300020jw0> entry : c1299310jur.LJ.entrySet()) {
            if (!this.LJ.containsKey(entry.getKey())) {
                this.LJ.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public final void LIZJ(String str, Class<? extends LynxModule> cls, Object obj) {
        C1297450jrr c1297450jrr = new C1297450jrr();
        c1297450jrr.LIZIZ = cls;
        c1297450jrr.LIZJ = obj;
        c1297450jrr.LIZ = str;
        this.LIZLLL.add(c1297450jrr);
    }
}
