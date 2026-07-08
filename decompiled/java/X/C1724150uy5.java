package X;

import Y.ARunnableS126S0100000_26;
import Y.ARunnableS70S0200000_1;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.utility.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import go5.a;
import go5.c;
import go5.d;
import java.util.ArrayList;
import java.util.Map;
import oo5.b;
import org.json.JSONArray;
import org.json.JSONObject;
import yo5.a$a;

/* JADX INFO: renamed from: X.0uy5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1724150uy5 {
    public static final C1724150uy5 LJIIL = new C1724150uy5();
    public C1724170uy7 LIZ;
    public volatile C931203kU LIZIZ;
    public volatile C914603ho LIZJ;
    public volatile C929303kB LIZLLL;
    public volatile C1724080uxy LJ;
    public volatile C932103kd LJFF;
    public volatile C931303kV LJI;
    public volatile C1725740v0e LJII;
    public volatile C1724000uxq LJIIIIZZ;
    public volatile C1724210uyB LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;

    public final InterfaceC845903Sf LIZ() {
        JSONArray jSONArray;
        if (this.LIZIZ == null) {
            synchronized (this) {
                try {
                    if (this.LIZIZ == null) {
                        C1724170uy7 c1724170uy7 = this.LIZ;
                        if (c1724170uy7.LJJIFFI != null) {
                            JSONArray jSONArrayLIZ = c1724170uy7.LIZJ;
                            if (jSONArrayLIZ == null || jSONArrayLIZ.length() == 0) {
                                jSONArrayLIZ = this.LIZ.LJJIFFI.LIZ();
                            }
                            InterfaceC1724070uxx interfaceC1724070uxxLIZIZ = LIZIZ();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("ECommerceSupport bankCardRules: ");
                            sbLIZ.append(jSONArrayLIZ != null && jSONArrayLIZ.length() > 0);
                            ((C1724080uxy) interfaceC1724070uxxLIZIZ).LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                            JSONObject jSONObjectLIZJ = this.LIZ.LIZLLL;
                            if (jSONObjectLIZJ == null || jSONObjectLIZJ.length() == 0) {
                                jSONObjectLIZJ = this.LIZ.LJJIFFI.LIZJ();
                            }
                            InterfaceC1724070uxx interfaceC1724070uxxLIZIZ2 = LIZIZ();
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("ECommerceSupport bankCardRulesV2: ");
                            sbLIZ2.append(jSONObjectLIZJ != null && jSONObjectLIZJ.length() > 0);
                            ((C1724080uxy) interfaceC1724070uxxLIZIZ2).LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
                            JSONArray jSONArrayLIZIZ = this.LIZ.LJ;
                            if (jSONArrayLIZIZ == null || jSONArrayLIZIZ.length() == 0) {
                                jSONArrayLIZIZ = this.LIZ.LJJIFFI.LIZIZ();
                            }
                            JSONArray jSONArrayLIZLLL = this.LIZ.LJFF;
                            if ((jSONArrayLIZLLL == null || jSONArrayLIZLLL.length() == 0) && ((jSONArray = this.LIZ.LJ) == null || jSONArray.length() == 0)) {
                                jSONArrayLIZLLL = this.LIZ.LJJIFFI.LIZLLL();
                            }
                            InterfaceC1724070uxx interfaceC1724070uxxLIZIZ3 = LIZIZ();
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("ECommerceSupport storedMethods: ");
                            sbLIZ3.append(jSONArrayLIZLLL != null && jSONArrayLIZLLL.length() > 0);
                            ((C1724080uxy) interfaceC1724070uxxLIZIZ3).LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
                            JSONArray jSONArrayLJ = this.LIZ.LJI;
                            if (jSONArrayLJ == null || jSONArrayLJ.length() == 0) {
                                jSONArrayLJ = this.LIZ.LJJIFFI.LJ();
                            }
                            InterfaceC1724070uxx interfaceC1724070uxxLIZIZ4 = LIZIZ();
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("ECommerceSupport unAvailableCardBin: ");
                            sbLIZ4.append(jSONArrayLJ != null && jSONArrayLJ.length() > 0);
                            ((C1724080uxy) interfaceC1724070uxxLIZIZ4).LIZIZ(C2188811AlT.LIZIZ(sbLIZ4));
                            this.LIZIZ = new C931203kU(jSONArrayLIZ, jSONObjectLIZJ, jSONArrayLIZIZ, jSONArrayLIZLLL, jSONArrayLJ, LJFF());
                        } else {
                            this.LIZIZ = new C931203kU(c1724170uy7.LIZJ, c1724170uy7.LIZLLL, c1724170uy7.LJ, c1724170uy7.LJFF, c1724170uy7.LJI, LJFF());
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LIZIZ;
    }

    public final InterfaceC1724070uxx LIZIZ() {
        if (this.LJ == null) {
            synchronized (this) {
                try {
                    if (this.LJ == null) {
                        this.LJ = new C1724080uxy();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LJ;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0uyB] */
    public final InterfaceC932703kj LIZJ() {
        if (this.LJIIIZ == null) {
            synchronized (this) {
                try {
                    if (this.LJIIIZ == null) {
                        this.LJIIIZ = new InterfaceC932703kj() { // from class: X.0uyB
                        };
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LJIIIZ;
    }

    public final InterfaceC906703gX LIZLLL() {
        if (this.LIZJ == null) {
            synchronized (this) {
                try {
                    if (this.LIZJ == null) {
                        this.LIZJ = new C914603ho();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LIZJ;
    }

    public final InterfaceC932803kk LJ() {
        if (this.LJFF == null) {
            synchronized (this) {
                try {
                    if (this.LJFF == null) {
                        this.LJFF = new C932103kd();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LJFF;
    }

    public final InterfaceC932403kg LJFF() {
        if (this.LJI == null) {
            synchronized (this) {
                try {
                    if (this.LJI == null) {
                        this.LJI = new C931303kV();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LJI;
    }

    public static void LJII(Class cls) {
        C1062300dka.LIZLLL(cls, EnumC1059790dgX.ALL, null, 4);
    }

    public final C1711860ueG LJI(C1724170uy7 c1724170uy7) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        Pair pair;
        boolean z;
        C1724170uy7 c1724170uy72 = this.LIZ;
        if (c1724170uy72 == null) {
            this.LIZ = c1724170uy7;
        } else {
            if (TextUtils.isEmpty(c1724170uy72.LIZIZ) && !TextUtils.isEmpty(c1724170uy7.LIZIZ)) {
                c1724170uy72.LIZIZ = c1724170uy7.LIZIZ;
            }
            JSONArray jSONArray4 = c1724170uy7.LIZJ;
            if (jSONArray4 != null && (jSONArray = c1724170uy7.LJ) != null && (jSONArray2 = c1724170uy7.LJFF) != null && (jSONArray3 = c1724170uy7.LJI) != null) {
                c1724170uy72.LIZJ = jSONArray4;
                c1724170uy72.LJ = jSONArray;
                c1724170uy72.LJFF = jSONArray2;
                c1724170uy72.LJI = jSONArray3;
            }
            JSONObject jSONObject = c1724170uy7.LIZLLL;
            if (jSONObject != null) {
                c1724170uy72.LIZLLL = jSONObject;
            }
            if (!TextUtils.isEmpty(c1724170uy7.LJII)) {
                c1724170uy72.LJII = c1724170uy7.LJII;
            }
            if (!TextUtils.isEmpty(c1724170uy7.LJIIIIZZ)) {
                c1724170uy72.LJIIIIZZ = c1724170uy7.LJIIIIZZ;
            }
            if (!TextUtils.isEmpty(c1724170uy7.LJIIIZ)) {
                c1724170uy72.LJIIIZ = c1724170uy7.LJIIIZ;
            }
            if (!TextUtils.isEmpty(c1724170uy7.LJIIJ)) {
                c1724170uy72.LJIIJ = c1724170uy7.LJIIJ;
            }
            InterfaceC1724090uxz interfaceC1724090uxz = c1724170uy7.LJIIJJI;
            if (interfaceC1724090uxz != null) {
                c1724170uy72.LJIIJJI = interfaceC1724090uxz;
            }
            if (!TextUtils.isEmpty(c1724170uy7.LJIIL)) {
                c1724170uy72.LJIIL = c1724170uy7.LJIIL;
            }
            AbstractC808800Vo6 abstractC808800Vo6 = c1724170uy7.LJIILIIL;
            if (abstractC808800Vo6 != null) {
                c1724170uy72.LJIILIIL = abstractC808800Vo6;
            }
            if (!TextUtils.isEmpty(c1724170uy7.LJIILL)) {
                c1724170uy72.LJIILL = c1724170uy7.LJIILL;
            }
            if (!TextUtils.isEmpty(c1724170uy7.LJIILJJIL)) {
                c1724170uy72.LJIILJJIL = c1724170uy7.LJIILJJIL;
            }
            InterfaceC1724010uxr interfaceC1724010uxr = c1724170uy7.LJIILLIIL;
            if (interfaceC1724010uxr != null) {
                c1724170uy72.LJIILLIIL = interfaceC1724010uxr;
            }
            if (!TextUtils.isEmpty(c1724170uy7.LJIIZILJ)) {
                c1724170uy72.LJIIZILJ = c1724170uy7.LJIIZILJ;
            }
            Cert cert = c1724170uy7.LJIJ;
            if (cert != null) {
                c1724170uy72.LJIJ = cert;
            }
            Cert cert2 = c1724170uy7.LJIJI;
            if (cert2 != null) {
                c1724170uy72.LJIJI = cert2;
            }
            if (!TextUtils.isEmpty(c1724170uy7.LJIJJLI)) {
                c1724170uy72.LJIJJLI = c1724170uy7.LJIJJLI;
            }
            InterfaceC1724220uyC interfaceC1724220uyC = c1724170uy7.LJIL;
            if (interfaceC1724220uyC != null) {
                c1724170uy72.LJIL = interfaceC1724220uyC;
            }
            c cVar = c1724170uy7.LJJ;
            if (cVar != null) {
                c1724170uy72.LJJ = cVar;
            }
            a$a a_a = c1724170uy7.LJJI;
            if (a_a != null) {
                c1724170uy72.LJJI = a_a;
            }
            InterfaceC1724190uy9 interfaceC1724190uy9 = c1724170uy7.LJJIFFI;
            if (interfaceC1724190uy9 != null) {
                c1724170uy72.LJJIFFI = interfaceC1724190uy9;
            }
            InterfaceC930803kQ interfaceC930803kQ = c1724170uy7.LJJII;
            if (interfaceC930803kQ != null) {
                c1724170uy72.LJJII = interfaceC930803kQ;
            }
        }
        d.a aVar = new d.a(this.LIZ.LIZ);
        C1724170uy7 c1724170uy73 = this.LIZ;
        String str = c1724170uy73.LIZIZ;
        if (str != null) {
            aVar.LIZIZ = str;
        }
        if (c1724170uy73.LJIIJJI != null) {
            aVar.LIZJ = new a() { // from class: X.0uy0
                @Override // go5.a
                public final void onEventV3(String str2, JSONObject jSONObject2) {
                    this.LIZ.LIZ.LJIIJJI.onEventV3(str2, jSONObject2);
                }
            };
        }
        String str2 = c1724170uy73.LJIIL;
        if (str2 != null) {
            aVar.LIZLLL = str2;
        }
        AbstractC808800Vo6 abstractC808800Vo62 = c1724170uy73.LJIILIIL;
        if (abstractC808800Vo62 != null) {
            aVar.LJ = abstractC808800Vo62;
        }
        Cert cert3 = c1724170uy73.LJIJ;
        if (cert3 != null) {
            aVar.LJFF = cert3;
        }
        Cert cert4 = c1724170uy73.LJIJI;
        if (cert4 != null) {
            aVar.LJI = cert4;
        }
        Cert cert5 = c1724170uy73.LJIJJ;
        if (cert5 != null) {
            aVar.LJII = cert5;
        }
        c cVar2 = c1724170uy73.LJJ;
        if (cVar2 != null) {
            aVar.LJIIIIZZ = cVar2;
        }
        a$a a_a2 = c1724170uy73.LJJI;
        if (a_a2 != null) {
            aVar.LJIIJJI = a_a2;
        }
        b bVar = b.LJIJJLI;
        d dVarLIZ = aVar.LIZ();
        bVar.getClass();
        if (b.LIZIZ) {
            b.LIZ.LIZ(dVarLIZ);
        } else {
            b.LIZ = dVarLIZ;
        }
        b.LIZIZ = true;
        try {
            b.LJIIL();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        this.LIZIZ = null;
        InterfaceC932403kg interfaceC932403kgLJFF = LJFF();
        String str3 = this.LIZ.LJIIL;
        InterfaceC931903kb interfaceC931903kb = new InterfaceC931903kb() { // from class: X.03kl
            @Override // X.InterfaceC931903kb
            public final void LIZ(Map<String, String> map) {
                this.LIZ.LJIIJJI = true;
            }
        };
        C931303kV c931303kV = (C931303kV) interfaceC932403kgLJFF;
        if (!TextUtils.equals(c931303kV.LIZJ, str3) && !TextUtils.isEmpty(str3)) {
            c931303kV.LIZJ = str3;
            c931303kV.LIZIZ.clear();
            if (Looper.getMainLooper() == Looper.myLooper()) {
                RunnableC823120WQs.LIZIZ(new ARunnableS70S0200000_1(interfaceC931903kb, c931303kV, 29));
            } else {
                c931303kV.LIZJ(c931303kV.LIZJ, interfaceC931903kb, null);
            }
        }
        if (!this.LJIIJ) {
            LJII(C1723980uxo.class);
            LJII(C1724260uyG.class);
            LJII(C1724060uxw.class);
            LJII(C1723990uxp.class);
            LJII(C1723960uxm.class);
            LJII(C1724040uxu.class);
            LJII(C1723930uxj.class);
            LJII(C1723970uxn.class);
            Map mapLIZIZ = C1062300dka.LIZIZ(EnumC1059790dgX.ALL, LivePreviewCTASmartDisplayManager.DEFAULT);
            ArrayList<String> arrayList = new ArrayList();
            arrayList.add("pipo.executeRiskJS");
            arrayList.add("pipo.fetch");
            arrayList.add("pipo.onEvent");
            arrayList.add("pipo.openWebView");
            arrayList.add("pipoAppInfo");
            arrayList.add("pipo.getStarlingData");
            arrayList.add("pipo.encryptString");
            if (mapLIZIZ == null) {
                pair = new Pair(Boolean.FALSE, arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (String str4 : arrayList) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str4);
                    sbLIZ.append(" miss --- ");
                    if (mapLIZIZ.get(str4) == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sbLIZ.append(z);
                    Logger.d("pipo ecommerce", C2188811AlT.LIZIZ(sbLIZ));
                    if (mapLIZIZ.get(str4) == null) {
                        arrayList2.add(str4);
                    }
                }
                if (arrayList2.isEmpty()) {
                    pair = new Pair(Boolean.TRUE, arrayList2);
                } else {
                    pair = new Pair(Boolean.FALSE, arrayList2);
                }
            }
            if (Boolean.FALSE.equals(pair.first)) {
                return new C1711860ueG(12, pair.second.toString());
            }
        }
        this.LJIIJ = true;
        C786410Ut5.LJLIIL(600L, new BPEAHandler(Looper.myLooper()), new ARunnableS126S0100000_26(c1724170uy7, 93));
        return new C1711860ueG(1, "success");
    }
}
