package X;

import Y.ARunnableS6S0401000_34;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.hox.Hox;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AFwS281S0000000_34;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Czb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2248531Czb {
    public final C2248571Czf LIZ;
    public final InterfaceC2248621Czk LIZIZ;
    public WeakReference<C19EG> LIZJ;
    public final List<C2248581Czg> LIZLLL = new ArrayList();
    public volatile String LJ;
    public volatile boolean LJFF;
    public C11JF LJI;

    public final C19EG LIZJ() {
        C19EG c19eg;
        WeakReference<C19EG> weakReference = this.LIZJ;
        C19EG activity = null;
        if (weakReference != null && (c19eg = weakReference.get()) != null && !c19eg.isDestroyed()) {
            return c19eg;
        }
        AbstractC1387200mCc[] abstractC1387200mCcArrLJII = C1906580ziK.LJII();
        int length = abstractC1387200mCcArrLJII.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            AbstractC1387200mCc abstractC1387200mCc = abstractC1387200mCcArrLJII[i];
            if (abstractC1387200mCc.LIZ instanceof InterfaceC1711206n0) {
                Fragment fragmentLIZLLL = abstractC1387200mCc.LIZLLL();
                if (fragmentLIZLLL != null) {
                    activity = fragmentLIZLLL.getActivity();
                }
            } else {
                i++;
            }
        }
        this.LIZJ = new WeakReference<>(activity);
        return activity;
    }

    public final void LIZIZ(C19EG c19eg) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (C2248581Czg c2248581Czg : C13LP.LLIIII(this.LIZLLL)) {
                if (LIZLLL(c19eg, c2248581Czg)) {
                    linkedHashSet.add(c2248581Czg);
                }
            }
            if (!linkedHashSet.isEmpty()) {
                ((ArrayList) this.LIZLLL).removeAll(linkedHashSet);
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    LJII(LIZJ(), (C2248581Czg) it2.next());
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("checkPendingShowQueue error: ");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public final void LJ(C2248581Czg c2248581Czg) {
        C2248641Czm c2248641Czm;
        List<C2248581Czg> listLIZIZ;
        int i;
        C19EG c19egLIZJ = LIZJ();
        InterfaceC2248631Czl interfaceC2248631Czl = c2248581Czg.LJII;
        if (interfaceC2248631Czl instanceof C2248641Czm) {
            c2248641Czm = (C2248641Czm) interfaceC2248631Czl;
        } else {
            c2248641Czm = null;
        }
        int i2 = 0;
        if (c2248641Czm != null) {
            if (c19egLIZJ == null || (listLIZIZ = this.LIZ.LIZIZ(c19egLIZJ, c2248581Czg)) == null) {
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
            C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS6S0401000_34(c2248581Czg, i, this, listLIZIZ, c2248641Czm, 2));
        }
        Iterator it3 = ((ArrayList) this.LIZLLL).iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            if (Intrinsics.LJFF(((C2248581Czg) it3.next()).LIZJ.LIZ(), c2248581Czg.LIZJ.LIZ())) {
                if (i2 != -1) {
                    ListProtector.remove(this.LIZLLL, i2);
                }
            } else {
                i2++;
            }
        }
        this.LIZIZ.LIZ(c2248581Czg);
    }

    public final void LJFF(String str) {
        C2248581Czg c2248581Czg;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onTabClick enterFrom: ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", onTabClick: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C1584320rKY.LIZ.getClass();
        EnumC1584360rKc enumC1584360rKcLJIIIIZZ = C1584320rKY.LJIIIIZZ(str);
        if (enumC1584360rKcLJIIIIZZ == null || (c2248581Czg = this.LIZ.LIZ.get(enumC1584360rKcLJIIIIZZ)) == null) {
            return;
        }
        C2248541Czc c2248541Czc = C2248541Czc.LIZ;
        String strLIZ = c2248581Czg.LIZJ.LIZ();
        c2248541Czc.getClass();
        C2248541Czc.LIZJ(strLIZ);
    }

    public C2248531Czb(C2248571Czf c2248571Czf, C2248591Czh c2248591Czh) {
        this.LIZ = c2248571Czf;
        this.LIZIZ = c2248591Czh;
    }

    public static void LIZ(JSONObject jSONObject, C2248581Czg c2248581Czg) {
        String str;
        AbstractC2248601Czi abstractC2248601Czi = c2248581Czg.LIZJ;
        if (abstractC2248601Czi instanceof C1255560imI) {
            str = ((C1255560imI) abstractC2248601Czi).LJI;
        } else {
            int i = C592400NLi.LIZ[c2248581Czg.LIZIZ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    str = "be_null";
                } else {
                    str = "bottom";
                }
            } else {
                str = "top";
            }
        }
        jSONObject.put("notice_location", str);
    }

    public final boolean LIZLLL(C19EG c19eg, C2248581Czg c2248581Czg) {
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Lifecycle.State stateLIZJ;
        if (!this.LJFF) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isRedDotTabVisible isBootFinished: ");
            sbLIZ.append(this.LJFF);
            C2188811AlT.LIZIZ(sbLIZ);
            return false;
        }
        if (c19eg == null || (abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ()) == null) {
            return false;
        }
        if (!(abstractC1387200mCcLIZIZ.LIZ instanceof InterfaceC1711206n0)) {
            LifecycleOwner lifecycleOwnerLJFF = abstractC1387200mCcLIZIZ.LJFF();
            if (lifecycleOwnerLJFF != null) {
                stateLIZJ = C0R1H.LIZJ(lifecycleOwnerLJFF);
            } else {
                stateLIZJ = null;
            }
            if (stateLIZJ == Lifecycle.State.RESUMED) {
                return false;
            }
        }
        Hox hoxLIZ = Hox.LLJILJIL.LIZ(c19eg);
        AbstractC2248601Czi abstractC2248601Czi = c2248581Czg.LIZJ;
        if (abstractC2248601Czi instanceof C1255560imI) {
            C1584320rKY c1584320rKY = C1584320rKY.LIZ;
            EnumC1584360rKc enumC1584360rKc = c2248581Czg.LIZLLL;
            c1584320rKY.getClass();
            return hoxLIZ.KQ2(C1584320rKY.LJIIJ(enumC1584360rKc));
        }
        if (abstractC2248601Czi instanceof C1255570imJ) {
            EnumC592410NLj enumC592410NLj = c2248581Czg.LIZIZ;
            if (enumC592410NLj == EnumC592410NLj.TOP) {
                return hoxLIZ.KQ2("HOME");
            }
            if (enumC592410NLj != EnumC592410NLj.BOTTOM) {
                return false;
            }
            return hoxLIZ.KQ2("page_feed");
        }
        throw new C1954807lC();
    }

    public final void LJII(C19EG c19eg, final C2248581Czg c2248581Czg) {
        final List<C2248581Czg> listLIZIZ;
        final int i;
        if (!Intrinsics.LJFF(c2248581Czg.LJII, C2248661Czo.LIZ)) {
            return;
        }
        this.LIZIZ.LIZIZ(c2248581Czg);
        if (c19eg == null || (listLIZIZ = this.LIZ.LIZIZ(c19eg, c2248581Czg)) == null) {
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
        final String str = this.LJ;
        if (str == null || str.length() == 0) {
            C1584320rKY.LIZ.getClass();
            str = C1584320rKY.LJIIIIZZ;
            if (str == null) {
                str = "be_null";
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportRedDotShow: enterFrom: ");
        sbLIZ.append(str);
        sbLIZ.append(", mobEnterFrom: ");
        C1584320rKY.LIZ.getClass();
        sbLIZ.append(C1584320rKY.LJIIIIZZ);
        C2188811AlT.LIZIZ(sbLIZ);
        C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new Runnable() { // from class: X.1Cze
            public final void LIZ() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                String str2 = str;
                C2248581Czg c2248581Czg2 = c2248581Czg;
                C2248531Czb c2248531Czb = this;
                List<C2248581Czg> list = listLIZIZ;
                int i2 = i;
                jSONObject.put("enter_from", str2);
                jSONObject.put("notice_id", c2248581Czg2.LIZJ.LIZ());
                c2248531Czb.getClass();
                C2248531Czb.LIZ(jSONObject, c2248581Czg2);
                c2248581Czg2.LIZJ.LIZIZ.LIZ(jSONObject);
                C2248531Czb.LJI(jSONObject, c2248581Czg2, list, i2);
                jSONObject.put(Scene.SCENE_SERVICE, c2248581Czg2.LIZJ.LIZJ.getValue());
                jSONObject.put("is_reduce", c2248581Czg2.LIZJ.LIZLLL.getValue());
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append('[');
                sbLIZ2.append(c2248581Czg.LIZJ.LIZ());
                sbLIZ2.append("] ttinfra_reddot_show: ");
                sbLIZ2.append(jSONObject);
                C2188811AlT.LIZIZ(sbLIZ2);
                C20684815ws.LJIJ("ttinfra_reddot_show", jSONObject);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("RedDotMobReporter@a285.reportRedDotShow$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("RedDotMobReporter@a285.reportRedDotShow$1");
            }
        });
    }

    public static void LJI(JSONObject jSONObject, C2248581Czg c2248581Czg, List list, int i) {
        jSONObject.put("reddot_cnt", list.size());
        jSONObject.put("scene_reddot_cnt", i);
        if (c2248581Czg.LIZJ instanceof C1255570imJ) {
            C1584320rKY c1584320rKY = C1584320rKY.LIZ;
            EnumC1584360rKc enumC1584360rKc = c2248581Czg.LIZLLL;
            c1584320rKY.getClass();
            jSONObject.put("tab_name", C1584320rKY.LJIIIZ(enumC1584360rKc));
            StringBuilder sb = new StringBuilder("{top_tab:\"");
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((C2248581Czg) obj).LIZIZ == EnumC592410NLj.TOP) {
                    arrayList.add(obj);
                }
            }
            sb.append(C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS281S0000000_34.get$arr$(63), 30));
            sb.append("\",bottom_tab:\"");
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (((C2248581Czg) obj2).LIZIZ == EnumC592410NLj.BOTTOM) {
                    arrayList2.add(obj2);
                }
            }
            sb.append(C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, AFwS281S0000000_34.get$arr$(64), 30));
            sb.append('}');
            jSONObject.put("dot_tab", sb.toString());
        }
    }
}
