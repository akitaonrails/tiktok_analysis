package X;

import com.bytedance.scene.Scene;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS225S0000000_34;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Czc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2248541Czc {
    public static final C2248541Czc LIZ = new C2248541Czc();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(285));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(284));

    public static C2248531Czb LIZ() {
        return (C2248531Czb) LIZJ.getValue();
    }

    public static C2248571Czf LIZIZ() {
        return (C2248571Czf) LIZIZ.getValue();
    }

    public static void LIZJ(String str) {
        final C2248641Czm c2248641Czm;
        final List<C2248581Czg> listLIZIZ;
        final int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notifyRedDotClick enter_method: ");
        C1584320rKY.LIZ.getClass();
        String str2 = C1584320rKY.LJ;
        if (str2 == null) {
            str2 = C1584320rKY.LJFF;
        }
        sbLIZ.append(str2);
        sbLIZ.append(" - ");
        sbLIZ.append(C1584320rKY.LJ);
        C2188811AlT.LIZIZ(sbLIZ);
        final C2248581Czg c2248581Czg = LIZIZ().LIZJ.get(str);
        if (c2248581Czg == null) {
            return;
        }
        final C2248531Czb c2248531CzbLIZ = LIZ();
        C19EG c19egLIZJ = c2248531CzbLIZ.LIZJ();
        InterfaceC2248631Czl interfaceC2248631Czl = c2248581Czg.LJII;
        if ((interfaceC2248631Czl instanceof C2248641Czm) && (c2248641Czm = (C2248641Czm) interfaceC2248631Czl) != null) {
            if (c19egLIZJ == null || (listLIZIZ = c2248531CzbLIZ.LIZ.LIZIZ(c19egLIZJ, c2248581Czg)) == null) {
                listLIZIZ = C13BV.INSTANCE;
            }
            if ((listLIZIZ instanceof Collection) && listLIZIZ.isEmpty()) {
                i = 0;
            } else {
                Iterator<C2248581Czg> it2 = listLIZIZ.iterator();
                i = 0;
                while (it2.hasNext()) {
                    if (it2.next().LIZJ.LIZJ == c2248581Czg.LIZJ.LIZJ && (i = i + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            final String str3 = c2248531CzbLIZ.LJ;
            if (str3 == null || str3.length() == 0) {
                C1584320rKY.LIZ.getClass();
                str3 = C1584320rKY.LJIIIIZZ;
                if (str3 == null) {
                    str3 = "be_null";
                }
            }
            C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new Runnable() { // from class: X.1Czd
                public final void LIZ() throws JSONException {
                    String str4;
                    JSONObject jSONObject = new JSONObject();
                    String str5 = str3;
                    C2248531Czb c2248531Czb = c2248531CzbLIZ;
                    C2248581Czg c2248581Czg2 = c2248581Czg;
                    List<C2248581Czg> list = listLIZIZ;
                    int i2 = i;
                    C2248641Czm c2248641Czm2 = c2248641Czm;
                    jSONObject.put("enter_from", str5);
                    c2248531Czb.getClass();
                    AbstractC2248601Czi abstractC2248601Czi = c2248581Czg2.LIZJ;
                    if (!(abstractC2248601Czi instanceof C1255560imI)) {
                        C1584320rKY.LIZ.getClass();
                        str4 = C1584320rKY.LJ;
                        if (str4 == null) {
                            str4 = C1584320rKY.LJFF;
                        }
                        jSONObject.put("enter_method", str4);
                        jSONObject.put("notice_id", c2248581Czg2.LIZJ.LIZ());
                        C2248531Czb.LIZ(jSONObject, c2248581Czg2);
                        c2248581Czg2.LIZJ.LIZIZ.LIZ(jSONObject);
                        C2248531Czb.LJI(jSONObject, c2248581Czg2, list, i2);
                        jSONObject.put(Scene.SCENE_SERVICE, c2248581Czg2.LIZJ.LIZJ.getValue());
                        jSONObject.put("is_reduce", c2248581Czg2.LIZJ.LIZLLL.getValue());
                        jSONObject.put("notice_show_duration", System.currentTimeMillis() - c2248641Czm2.LIZ);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append('[');
                        sbLIZ2.append(c2248581Czg.LIZJ.LIZ());
                        sbLIZ2.append("] ttinfra_reddot_click: ");
                        sbLIZ2.append(jSONObject);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        C20684815ws.LJIJ("ttinfra_reddot_click", jSONObject);
                    }
                    str4 = ((C1255560imI) abstractC2248601Czi).LJII;
                    if (str4 == null) {
                        str4 = "be_null";
                    }
                    jSONObject.put("enter_method", str4);
                    jSONObject.put("notice_id", c2248581Czg2.LIZJ.LIZ());
                    C2248531Czb.LIZ(jSONObject, c2248581Czg2);
                    c2248581Czg2.LIZJ.LIZIZ.LIZ(jSONObject);
                    C2248531Czb.LJI(jSONObject, c2248581Czg2, list, i2);
                    jSONObject.put(Scene.SCENE_SERVICE, c2248581Czg2.LIZJ.LIZJ.getValue());
                    jSONObject.put("is_reduce", c2248581Czg2.LIZJ.LIZLLL.getValue());
                    jSONObject.put("notice_show_duration", System.currentTimeMillis() - c2248641Czm2.LIZ);
                    StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                    sbLIZ22.append('[');
                    sbLIZ22.append(c2248581Czg.LIZJ.LIZ());
                    sbLIZ22.append("] ttinfra_reddot_click: ");
                    sbLIZ22.append(jSONObject);
                    C2188811AlT.LIZIZ(sbLIZ22);
                    C20684815ws.LJIJ("ttinfra_reddot_click", jSONObject);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("RedDotMobReporter@a285.reportRedDotClick$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("RedDotMobReporter@a285.reportRedDotClick$1");
                }
            });
        }
        c2248531CzbLIZ.LIZIZ.LIZJ(c2248581Czg);
        if (c2248581Czg.LIZJ.LJ == EnumC2009107tx.CLICK_DISAPPEAR) {
            LIZLLL(c2248581Czg, null);
        }
    }

    public static void LIZLLL(C2248581Czg c2248581Czg, EnumC1250000idK enumC1250000idK) {
        c2248581Czg.LJI = enumC1250000idK;
        LIZ().LJ(c2248581Czg);
        C2248571Czf c2248571CzfLIZIZ = LIZIZ();
        C2248581Czg c2248581Czg2 = c2248571CzfLIZIZ.LIZJ.get(c2248581Czg.LIZJ.LIZ());
        if (c2248581Czg2 != null) {
            c2248571CzfLIZIZ.LIZ.remove(c2248581Czg2.LIZLLL);
            CopyOnWriteArrayList<C2248581Czg> copyOnWriteArrayList = c2248571CzfLIZIZ.LIZIZ.get(c2248581Czg2.LIZLLL);
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.remove(c2248581Czg2);
            }
            c2248571CzfLIZIZ.LIZJ.remove(c2248581Czg2.LIZJ.LIZ());
        }
    }
}
