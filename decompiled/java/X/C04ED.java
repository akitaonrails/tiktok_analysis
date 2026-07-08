package X;

import com.bytedance.goda.v2.model.dto.GodaV2Extension;
import com.bytedance.goda.v2.model.dto.GodaV2Facade;
import com.bytedance.goda.v2.model.dto.GodaV2Protocol;
import com.bytedance.goda.v2.model.dto.GroupFacade;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpPageDataModel;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.04ED, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04ED implements InterfaceC1053704Ad, C04CS, InterfaceC1068004Fq {
    public C04FG LIZ;
    public C04FG LIZIZ;
    public GodaV2Extension LIZJ;
    public PdpPageDataModel LIZLLL;
    public PdpPageDataModel LJ;
    public C0NJ1 LJFF;
    public C1053804Ae LJI;
    public final C1067504Fl LJII;
    public final C04FH LJIIIIZZ;

    public C04ED() {
        C04BK c04bk = new C04BK();
        C04D2.LIZ = c04bk;
        C04FH c04fh = new C04FH(c04bk);
        c04fh.LIZLLL((n) C1068104Fr.LIZIZ.getValue());
        this.LJIIIIZZ = c04fh;
        C1067504Fl c1067504Fl = new C1067504Fl(0);
        c1067504Fl.LIZIZ = c04fh.LIZJ;
        c1067504Fl.LIZLLL = c04fh.LIZIZ();
        c1067504Fl.LIZJ = this;
        this.LJII = c1067504Fl;
        c04fh.LJ = c1067504Fl;
        c1067504Fl.LIZIZ = c04fh.LIZJ;
    }

    @Override // X.InterfaceC1068004Fq
    public final Map<String, Object> LIZJ() {
        return C2097608Jq.LJ();
    }

    @Override // X.InterfaceC1053704Ad
    public final PdpPageDataModel LIZLLL() {
        return this.LJ;
    }

    @Override // X.InterfaceC1053704Ad
    public final C04FG LJ() {
        return this.LIZIZ;
    }

    public static PdpPageDataModel LJIIIZ(C04FO c04fo) {
        n nVar;
        if (c04fo != null && (nVar = c04fo.LJIILIIL) != null) {
            try {
                return (PdpPageDataModel) C1280004ze.LIZJ().LIZJ(nVar, PdpPageDataModel.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1019103yf.LIZ(EnumC1014603xw.ERR_GODA_PAGE_VALUE_EXP_ERROR, e, null);
            }
        }
        return null;
    }

    @Override // X.InterfaceC1068004Fq
    public final Map<String, Object> LIZ(String str) {
        C1053804Ae c1053804Ae = this.LJI;
        if (c1053804Ae == null) {
            return null;
        }
        if (str == null) {
            str = "a2270.b6661";
        }
        return C00H3.LIZ(c1053804Ae.LJ(str));
    }

    @Override // X.InterfaceC1068004Fq
    public final Map<String, Object> LIZIZ(Collection<String> collection) {
        if (collection.isEmpty()) {
            return C2097608Jq.LJ();
        }
        C0NJ1 c0nj1 = this.LJFF;
        if (c0nj1 == null) {
            return C2097608Jq.LJ();
        }
        try {
            return (Map) C23250099c.LJ(C23271099x.INSTANCE, new C0NJ0(c0nj1, collection, null));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1019103yf.LIZ(EnumC1014603xw.ERR_GODA_PAGE_VALUES_EXP_ERROR, e, null);
            return C2097608Jq.LJ();
        }
    }

    @Override // X.InterfaceC1068004Fq
    public final Object LJII(String str) {
        C0NJ1 c0nj1 = this.LJFF;
        if (c0nj1 == null) {
            return null;
        }
        try {
            Object objLJ = C23250099c.LJ(C23271099x.INSTANCE, new C591790NIz(c0nj1, str, null));
            if (objLJ == null) {
                return c0nj1.LJ().LIZ(str);
            }
            return objLJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1019103yf.LIZ(EnumC1014603xw.ERR_GODA_PAGE_VALUE_EXP_ERROR, e, null);
            return null;
        }
    }

    @Override // X.InterfaceC1068004Fq
    public final Object LJFF(String str, C04FR c04fr) {
        InterfaceC1066204Ey interfaceC1066204Ey;
        if (c04fr != null && (interfaceC1066204Ey = c04fr.LJIIIIZZ) != null) {
            return interfaceC1066204Ey.getValue(str);
        }
        return null;
    }

    public final C04FG LJIIIIZZ(GodaV2Protocol<?> godaV2Protocol, C04CV c04cv) {
        String str;
        Integer numValueOf;
        GodaV2Facade godaV2Facade;
        List<GroupFacade> list;
        C04EU c04eu;
        C1326490kch c1326490kch = C1326490kch.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("skuId =");
        C04FO c04fo = null;
        if (godaV2Protocol != null && (c04eu = godaV2Protocol.localExtra) != null) {
            str = c04eu.LIZIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(": facade body size = ");
        if (godaV2Protocol != null && (godaV2Facade = godaV2Protocol.facade) != null && (list = godaV2Facade.body) != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1326490kch.getClass();
        C1326490kch.LIZ(strLIZIZ);
        if (godaV2Protocol != null) {
            C04FG c04fgLIZ = this.LJIIIIZZ.LIZ(godaV2Protocol, c04cv);
            this.LIZ = c04fgLIZ;
            this.LIZJ = godaV2Protocol.extension;
            if (c04fgLIZ != null) {
                c04fo = c04fgLIZ.LIZIZ;
            }
            this.LIZLLL = LJIIIZ(c04fo);
        }
        return this.LIZ;
    }

    @Override // X.C04CS
    public final boolean LJI(C04FR c04fr, String str, Map<String, ? extends Object> map) {
        return this.LJII.LIZLLL(str, c04fr, null, map, null);
    }

    public final C04FG LJIIJ(GodaV2Protocol<?> godaV2Protocol, C04CV c04cv, boolean z) {
        String str;
        C04FG c04fgLIZJ;
        PdpPageDataModel pdpPageDataModelLJIIIZ;
        C04EU c04eu;
        C1326490kch c1326490kch = C1326490kch.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("skuId=");
        C04FO c04fo = null;
        if (godaV2Protocol != null && (c04eu = godaV2Protocol.localExtra) != null) {
            str = c04eu.LIZIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(": needMerge = ");
        sbLIZ.append(z);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1326490kch.getClass();
        C1326490kch.LIZ(strLIZIZ);
        if (godaV2Protocol != null && z) {
            c04fgLIZJ = this.LJIIIIZZ.LIZJ(this.LIZ, godaV2Protocol, c04cv);
        } else {
            c04fgLIZJ = this.LIZ;
        }
        this.LIZIZ = c04fgLIZJ;
        if (c04fgLIZJ == this.LIZ) {
            pdpPageDataModelLJIIIZ = this.LIZLLL;
        } else {
            if (c04fgLIZJ != null) {
                c04fo = c04fgLIZJ.LIZIZ;
            }
            pdpPageDataModelLJIIIZ = LJIIIZ(c04fo);
        }
        this.LJ = pdpPageDataModelLJIIIZ;
        return this.LIZIZ;
    }
}
