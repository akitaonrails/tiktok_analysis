package X;

import android.view.View;
import android.webkit.WebView;
import com.lynx.react.bridge.JavaOnlyMap;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qHF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1543830qHF extends AbstractC1544140qHk {
    public final ArrayList<AbstractC1544140qHk> LIZ = new ArrayList<>();

    @Override // X.AbstractC1544140qHk
    public final String LIZ() {
        return "DEFAULT_BRIDGE_LIFE_CLIENT_IMP";
    }

    @Override // X.AbstractC1544140qHk
    public final void LIZJ(C1543910qHN c1543910qHN, C1543440qGc c1543440qGc) throws JSONException {
        Integer num;
        String strOptString;
        Integer num2;
        JavaOnlyMap javaOnlyMap;
        String string;
        int i;
        C1522330piZ c1522330piZ = new C1522330piZ();
        int i2 = C1543760qH8.LIZ[c1543910qHN.LIZ().ordinal()];
        if (i2 != 1) {
            if (i2 == 2 && (javaOnlyMap = c1543910qHN.LJJIJIIJI) != null) {
                c1522330piZ.LIZ = c1543910qHN.LJFF;
                c1522330piZ.LIZLLL = c1543910qHN.LJI;
                c1522330piZ.LJ = Long.valueOf(c1543910qHN.LJIIL);
                System.currentTimeMillis();
                if (javaOnlyMap.hasKey("code") && (i = javaOnlyMap.getInt("code", C386801es.DEFAULT)) != -1000) {
                    c1522330piZ.LIZIZ = Integer.valueOf(i);
                }
                if (c1543910qHN.LJJIL != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(javaOnlyMap.getString("msg", ""));
                    sbLIZ.append(", custom auth info:");
                    sbLIZ.append(c1543910qHN.LJJIL);
                    string = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    string = javaOnlyMap.getString("msg", "");
                }
                c1522330piZ.LIZJ = string;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(c1522330piZ.LIZJ);
                sbLIZ2.append(", isIDL = ");
                sbLIZ2.append(c1543910qHN.LIZLLL);
                c1522330piZ.LIZJ = C2188811AlT.LIZIZ(sbLIZ2);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(c1522330piZ.LIZJ);
                sbLIZ3.append(c1543910qHN.LJJJ);
                c1522330piZ.LIZJ = C2188811AlT.LIZIZ(sbLIZ3);
                C1297550js1.LIZ.getClass();
                JSONObject jSONObjectLJ = C1297550js1.LJ(javaOnlyMap);
                jSONObjectLJ.put("usePiperData", C1299060juS.LIZ(javaOnlyMap));
                jSONObjectLJ.put("runtimeThread", c1543910qHN.LJIJJLI);
                jSONObjectLJ.put("isIDL", c1543910qHN.LIZLLL);
                jSONObjectLJ.put("bridgeCallThreadType", c1543910qHN.LJIL);
                c1522330piZ.LJFF = jSONObjectLJ;
                Object obj = c1543910qHN.LJIIIIZZ;
                if (obj != null) {
                    c1522330piZ.LJI = C1297550js1.LJ((JavaOnlyMap) obj);
                }
                c1522330piZ.LJII = c1543910qHN.LJJIJIIJIL;
                Integer num3 = c1522330piZ.LIZIZ;
                if (num3 != null && num3.intValue() == 1) {
                    Iterator<InterfaceC1522340pia> it2 = c1543910qHN.LIZ.LJIIJJI.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZIZ(c1522330piZ);
                    }
                } else {
                    Iterator<InterfaceC1522340pia> it3 = c1543910qHN.LIZ.LJIIJJI.iterator();
                    while (it3.hasNext()) {
                        it3.next().LIZJ(c1522330piZ);
                    }
                    C1543930qHP c1543930qHP = c1543910qHN.LJJIFFI;
                    c1543930qHP.LIZJ = c1522330piZ.LIZIZ;
                    c1543930qHP.LIZ(c1522330piZ.LIZJ, "error_message");
                    c1543930qHP.LIZ(c1543910qHN.LJIJJLI, "runtimeThread");
                    c1543930qHP.LIZ(c1543910qHN.LJIL, "bridgeCallThreadType");
                    c1543910qHN.LJJIFFI.LIZJ(c1543910qHN.LIZ.LJIJ);
                }
            }
        } else {
            JSONObject jSONObjectLIZIZ = c1543440qGc.LIZIZ();
            c1522330piZ.LIZ = c1543910qHN.LJFF;
            c1522330piZ.LIZLLL = c1543910qHN.LJI;
            c1522330piZ.LJ = Long.valueOf(c1543910qHN.LJIIL);
            System.currentTimeMillis();
            Object objOpt = jSONObjectLIZIZ.opt("code");
            if (objOpt instanceof Integer) {
                num = (Integer) objOpt;
            } else {
                num = null;
            }
            c1522330piZ.LIZIZ = num;
            if (c1543910qHN.LJJIL != null) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(jSONObjectLIZIZ.optString("msg"));
                sbLIZ4.append(", custom auth info:");
                sbLIZ4.append(c1543910qHN.LJJIL);
                strOptString = C2188811AlT.LIZIZ(sbLIZ4);
            } else {
                strOptString = jSONObjectLIZIZ.optString("msg");
            }
            c1522330piZ.LIZJ = strOptString;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(c1522330piZ.LIZJ);
            sbLIZ5.append(c1543910qHN.LJJJ);
            c1522330piZ.LIZJ = C2188811AlT.LIZIZ(sbLIZ5);
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append(c1522330piZ.LIZJ);
            sbLIZ6.append(", isIDL = ");
            sbLIZ6.append(c1543910qHN.LIZLLL);
            c1522330piZ.LIZJ = C2188811AlT.LIZIZ(sbLIZ6);
            jSONObjectLIZIZ.put("runtimeThread", c1543910qHN.LJIJJLI);
            jSONObjectLIZIZ.put("isIDL", c1543910qHN.LIZLLL);
            jSONObjectLIZIZ.put("bridgeCallThreadType", c1543910qHN.LJIL);
            c1522330piZ.LJFF = jSONObjectLIZIZ;
            c1522330piZ.LJI = new JSONObject(c1543910qHN.LJIILIIL);
            Integer num4 = c1522330piZ.LIZIZ;
            if (num4 != null && num4.intValue() == 1) {
                Iterator<InterfaceC1522340pia> it4 = c1543910qHN.LIZ.LJIIJJI.iterator();
                while (it4.hasNext()) {
                    it4.next().LIZIZ(c1522330piZ);
                }
            } else {
                Iterator<InterfaceC1522340pia> it5 = c1543910qHN.LIZ.LJIIJJI.iterator();
                while (it5.hasNext()) {
                    it5.next().LIZJ(c1522330piZ);
                }
                C1543930qHP c1543930qHP2 = c1543910qHN.LJJIFFI;
                c1543930qHP2.LIZJ = c1522330piZ.LIZIZ;
                c1543930qHP2.LIZ(c1522330piZ.LIZJ, "error_message");
                c1543930qHP2.LIZ(c1543910qHN.LJIJJLI, "runtimeThread");
                c1543930qHP2.LIZ(c1543910qHN.LJIL, "bridgeCallThreadType");
                c1543910qHN.LJJIFFI.LIZJ(c1543910qHN.LIZ.LJIJ);
            }
            Object obj2 = c1543440qGc.LIZ;
            if (obj2 instanceof JSONObject) {
                Object objOpt2 = ((JSONObject) obj2).opt("code");
                if ((objOpt2 instanceof Integer) && (num2 = (Integer) objOpt2) != null) {
                    int iIntValue = num2.intValue();
                    C1544070qHd c1544070qHd = c1543910qHN.LJJIIJ;
                    if (c1544070qHd != null) {
                        c1544070qHd.LIZIZ = Integer.valueOf(iIntValue);
                    }
                }
            }
            C1544070qHd c1544070qHd2 = c1543910qHN.LJJIIJ;
            if (c1544070qHd2 != null) {
                c1544070qHd2.LJIILIIL = Long.valueOf(c1543910qHN.LJJIIZI - c1543910qHN.LJJIIZ);
            }
            C1544070qHd c1544070qHd3 = c1543910qHN.LJJIIJ;
            if (c1544070qHd3 != null) {
                c1544070qHd3.LJIILJJIL = Long.valueOf(c1543910qHN.LJJIIZI);
            }
            C1543940qHQ c1543940qHQ = c1543910qHN.LJIJI;
            if (c1543940qHQ != null) {
                c1543940qHQ.LJIIZILJ = c1543910qHN.LJJIIZ;
                c1543940qHQ.LJIJ = c1543910qHN.LJJIIZI;
                c1543940qHQ.LJIJJLI = System.currentTimeMillis();
            }
        }
        C1543940qHQ c1543940qHQ2 = c1543910qHN.LJIJI;
        if (c1543940qHQ2 != null) {
            c1543940qHQ2.LJJ = c1522330piZ.LIZIZ;
        }
        if (C1543410qGZ.LJIILJJIL && c1543940qHQ2 != null) {
            c1543940qHQ2.LJFF = String.valueOf(c1543910qHN.LJIIIIZZ);
            c1543940qHQ2.LJI = C786410Ut5.J3(c1543440qGc.LIZIZ());
            c1543940qHQ2.LJII = c1543910qHN.LIZLLL;
            String strValueOf = String.valueOf(c1543910qHN.LIZ.LJIIIZ);
            c1543940qHQ2.LJIIIIZZ = c1543910qHN.LJJIJL;
            View view = c1543940qHQ2.LIZLLL;
            if (view == null) {
                view = c1543940qHQ2.LJ;
            }
            C1520360pfO c1520360pfO = new C1520360pfO("JSB_TEST_INFO");
            c1520360pfO.LJIIIIZZ = strValueOf;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("jsb_name", c1543940qHQ2.LIZ);
            jSONObject.put("jsb_params", c1543940qHQ2.LJFF);
            jSONObject.put("jsb_result", c1543940qHQ2.LJI);
            jSONObject.put("jsb_is_idl", c1543940qHQ2.LJII);
            jSONObject.put("jsb_protocol_version", c1543940qHQ2.LIZIZ);
            jSONObject.put("jsb_bridgesdk", c1543940qHQ2.LIZJ);
            jSONObject.put("jsb_status_code", c1543940qHQ2.LJJ);
            jSONObject.put("jsb_engine", c1543940qHQ2.LJIIIIZZ);
            jSONObject.put("jsb_call_from", c1543940qHQ2.LJJI);
            c1520360pfO.LIZLLL = jSONObject;
            c1520360pfO.LJIIJJI = EnumC993170bx5.Both;
            C1538660q8u.LIZ(view, c1520360pfO.LIZ());
        }
        Iterator<AbstractC1544140qHk> it6 = this.LIZ.iterator();
        while (it6.hasNext()) {
            it6.next().LIZJ(c1543910qHN, c1543440qGc);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01cb  */
    @Override // X.AbstractC1544140qHk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.C1543190qGD r10, X.C1543910qHN r11) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1543830qHF.LIZLLL(X.0qGD, X.0qHN):void");
    }

    @Override // X.AbstractC1544140qHk
    public final void LJ(C1543190qGD c1543190qGD, C1543910qHN c1543910qHN) {
        WebView webViewLIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1543930qHP c1543930qHP = c1543910qHN.LJJIFFI;
        c1543930qHP.LIZLLL = "BDXBridge";
        c1543930qHP.LIZIZ = c1543910qHN.LJI;
        c1543930qHP.LIZ = c1543910qHN.LJFF;
        c1543930qHP.LJFF = c1543910qHN.LJJIJL;
        EnumC1543740qH6 enumC1543740qH6LIZ = c1543910qHN.LIZ();
        int[] iArr = C1543760qH8.LIZ;
        int i = iArr[enumC1543740qH6LIZ.ordinal()];
        WebView webViewLIZ2 = null;
        if (i != 1) {
            if (i == 2) {
                c1543930qHP.LJ = c1543910qHN.LIZ.LJFF;
            }
        } else {
            InterfaceC1544190qHp interfaceC1544190qHp = c1543910qHN.LIZ.LJ;
            if (interfaceC1544190qHp != null) {
                webViewLIZ = interfaceC1544190qHp.LIZ();
            } else {
                webViewLIZ = null;
            }
            c1543930qHP.LJ = webViewLIZ;
        }
        String str = c1543910qHN.LJFF;
        int i2 = c1543910qHN.LJJIII;
        InterfaceC1544190qHp interfaceC1544190qHp2 = c1543190qGD.LJ;
        if (interfaceC1544190qHp2 != null) {
            interfaceC1544190qHp2.LIZ();
        }
        C1543940qHQ c1543940qHQ = new C1543940qHQ("bridge", "call", str, i2, "BDXBridge");
        InterfaceC1544190qHp interfaceC1544190qHp3 = c1543190qGD.LJ;
        if (interfaceC1544190qHp3 != null) {
            webViewLIZ2 = interfaceC1544190qHp3.LIZ();
        }
        c1543940qHQ.LIZLLL = webViewLIZ2;
        c1543940qHQ.LJ = c1543190qGD.LJFF;
        c1543910qHN.LJIJI = c1543940qHQ;
        if (iArr[c1543910qHN.LIZ().ordinal()] == 1) {
            C1543940qHQ c1543940qHQ2 = c1543910qHN.LJIJI;
            if (c1543940qHQ2 != null) {
                c1543940qHQ2.LJIIIZ = c1543910qHN.LJIIL;
                c1543940qHQ2.LJIIJJI = c1543910qHN.LJJII;
                c1543940qHQ2.LJIIL = jCurrentTimeMillis;
                c1543940qHQ2.LJIILIIL = jCurrentTimeMillis;
            }
            C1544070qHd c1544070qHd = c1543910qHN.LJJIIJ;
            if (c1544070qHd != null) {
                c1544070qHd.LJIIJ = Long.valueOf(jCurrentTimeMillis - c1543910qHN.LJJII);
                c1544070qHd.LJIIIIZZ = Long.valueOf(c1543910qHN.LJIIL);
                Long lValueOf = Long.valueOf(c1543910qHN.LJJII);
                c1544070qHd.LJIIIZ = lValueOf;
                if (lValueOf != null && c1544070qHd.LJIIIIZZ != null) {
                    c1544070qHd.LJIIJJI = Long.valueOf(lValueOf.longValue() - c1544070qHd.LJIIIIZZ.longValue());
                }
                c1544070qHd.LJII = Integer.valueOf(c1543910qHN.LJJIIJZLJL.getBytes(Charsets.UTF_8).length);
                c1544070qHd.LIZ = c1543910qHN.LJFF;
                c1544070qHd.LJI = c1543910qHN.LJI;
                c1544070qHd.LIZJ = C1544720qIg.LIZIZ;
            }
        }
        Iterator<AbstractC1544140qHk> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJ(c1543190qGD, c1543910qHN);
        }
    }

    @Override // X.AbstractC1544140qHk
    public final void LJFF(Object obj, String str) {
        Iterator<AbstractC1544140qHk> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJFF(obj, str);
        }
    }

    @Override // X.AbstractC1544140qHk
    public final void LJI(Object obj, String str) {
        Iterator<AbstractC1544140qHk> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJI(obj, str);
        }
    }

    @Override // X.AbstractC1544140qHk
    public final void LJII(C1543190qGD c1543190qGD, C1543910qHN c1543910qHN) {
        Iterator<AbstractC1544140qHk> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJII(c1543190qGD, c1543910qHN);
        }
    }

    @Override // X.AbstractC1544140qHk
    public final void LJIIIIZZ(C1543190qGD c1543190qGD, C1543910qHN c1543910qHN) {
        Iterator<AbstractC1544140qHk> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIIIZZ(c1543190qGD, c1543910qHN);
        }
    }

    @Override // X.AbstractC1544140qHk
    public final C1543280qGM LJIIIZ(C1543190qGD c1543190qGD, C1543910qHN c1543910qHN) throws Exception {
        for (AbstractC1544140qHk abstractC1544140qHk : this.LIZ) {
            C1543280qGM c1543280qGMLJIIIZ = abstractC1544140qHk.LJIIIZ(c1543190qGD, c1543910qHN);
            if (!c1543280qGMLJIIIZ.LIZ) {
                c1543910qHN.LJJIFFI.LIZ(abstractC1544140qHk.LIZ(), "jsb_error_life_client_bid");
                String strLIZ = abstractC1544140qHk.LIZ();
                if (strLIZ == null || strLIZ.length() == 0) {
                    InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
                    if (C1543410qGZ.LJIILJJIL) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("your lifeClient's bid is illegal, please change it with legal format! Class is : ");
                        sbLIZ.append(abstractC1544140qHk.getClass().getSimpleName());
                        throw new Exception(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
                String str = c1543280qGMLJIIIZ.LIZJ;
                if (str == null || str.length() == 0) {
                    c1543280qGMLJIIIZ.LIZJ = abstractC1544140qHk.LIZ();
                }
                return c1543280qGMLJIIIZ;
            }
        }
        return new C1543280qGM(true, null, "DEFAULT_BRIDGE_LIFE_CLIENT_IMP");
    }

    @Override // X.AbstractC1544140qHk
    public final void LIZIZ(C1543440qGc c1543440qGc, C1543910qHN c1543910qHN, C1543190qGD c1543190qGD) {
        if (C1543760qH8.LIZ[c1543910qHN.LIZ().ordinal()] == 1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1543940qHQ c1543940qHQ = c1543910qHN.LJIJI;
            if (c1543940qHQ != null) {
                c1543940qHQ.LJIILL = jCurrentTimeMillis;
                c1543940qHQ.LJIILLIIL = jCurrentTimeMillis;
                c1543940qHQ.LJIJI = jCurrentTimeMillis;
            }
        }
        Iterator<AbstractC1544140qHk> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(c1543440qGc, c1543910qHN, c1543190qGD);
        }
    }
}
