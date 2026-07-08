package X;

import android.app.Activity;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.BtmPageLifecycle;
import com.bytedance.android.btm.impl.page.model.PageInfo;
import com.bytedance.android.btm.impl.page.model.PageInfoStack;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.18E7, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C18E7 {
    public final EnumC21250718Ef LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;

    public static Set LIZ(Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int step = 0;
        for (Object obj : set) {
            C21248618Dk.LIZ.getClass();
            PageInfo pageInfoLJIIIIZZ = C21248618Dk.LJIIIIZZ(obj);
            if (pageInfoLJIIIIZZ != null) {
                if (pageInfoLJIIIIZZ.getStep() > step) {
                    step = pageInfoLJIIIIZZ.getStep();
                    linkedHashSet.clear();
                    linkedHashSet.add(obj);
                } else if (pageInfoLJIIIIZZ.getStep() == step) {
                    linkedHashSet.add(obj);
                }
            }
        }
        return linkedHashSet;
    }

    public static Set LIZLLL(Set set) {
        BtmPageLifecycle.State pageState;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            C21248618Dk.LIZ.getClass();
            PageInfoStack pageInfoStackLJIIIZ = C21248618Dk.LJIIIZ(obj);
            if (pageInfoStackLJIIIZ != null) {
                pageState = pageInfoStackLJIIIZ.getPageState();
            } else {
                pageState = null;
            }
            if (pageState == BtmPageLifecycle.State.CREATED) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public final boolean LJIIIIZZ(C18E9 c18e9) {
        Object objLJIIJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseBackResumer_");
        sbLIZ.append("tryResumeTopPage");
        C18CK.LJFF(C2188811AlT.LIZIZ(sbLIZ), new C18HO(this));
        InterfaceC21252118Et interfaceC21252118EtLIZJ = c18e9.LIZJ(c18e9.LLILZIL);
        if (interfaceC21252118EtLIZJ != null && (objLJIIJ = interfaceC21252118EtLIZJ.LJIIJ()) != null) {
            String str = C18EO.LIZ;
            if (C18EO.LIZJ(objLJIIJ, this.LIZ) == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static Set LJFF(C18E9 c18e9, Set set) {
        Object objLJIIJ;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (obj instanceof Dialog) {
                linkedHashSet.clear();
                linkedHashSet.add(obj);
                return linkedHashSet;
            }
            if (obj instanceof DialogFragment) {
                linkedHashSet.add(obj);
            } else if (obj instanceof Fragment) {
                linkedHashSet.add(obj);
            }
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.addAll(linkedHashSet);
        for (Object obj2 : linkedHashSet) {
            if (c18e9 != null) {
                for (InterfaceC21252118Et interfaceC21252118EtLIZIZ = c18e9.LIZIZ(obj2); interfaceC21252118EtLIZIZ != null; interfaceC21252118EtLIZIZ = interfaceC21252118EtLIZIZ.getParentNode()) {
                    C18EF parentNode = interfaceC21252118EtLIZIZ.getParentNode();
                    if (parentNode != null) {
                        objLJIIJ = parentNode.LJIIJ();
                    } else {
                        objLJIIJ = null;
                    }
                    C19719512Dh.LIZ(linkedHashSet2).remove(objLJIIJ);
                }
            }
        }
        return linkedHashSet2;
    }

    public static void LJI(Object obj, C18E9 c18e9) {
        C18EO.LIZLLL(obj, (EnumC21250718Ef) ((LinkedHashMap) c18e9.LLJIJIL).get(new C589920NBu(obj)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e A[PHI: r1
      0x001e: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v3 java.lang.String) binds: [B:7:0x001c, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(android.app.Activity r11, java.lang.String r12) {
        /*
            r10 = this;
            java.lang.Class r0 = r11.getClass()
            java.lang.String r5 = r0.getName()
            X.18Dk r0 = X.C21248618Dk.LIZ
            r0.getClass()
            com.bytedance.android.btm.impl.page.model.PageInfo r0 = X.C21248618Dk.LJIIIIZZ(r11)
            java.lang.String r2 = "null"
            if (r0 == 0) goto L1b
            java.lang.String r1 = r0.getPageBtm()
            if (r1 != 0) goto L1e
        L1b:
            r1 = r2
            if (r0 == 0) goto L25
        L1e:
            java.lang.String r0 = r0.getBtmPre()
            if (r0 == 0) goto L25
            r2 = r0
        L25:
            X.18CE r3 = X.C18CE.LIZ
            int r4 = r10.LIZJ
            r6 = 0
            X.18G3 r9 = new X.18G3
            r9.<init>(r5, r1, r2, r12)
            r8 = 0
            r7 = r6
            r3.LIZIZ(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18E7.LIZJ(android.app.Activity, java.lang.String):void");
    }

    public void LJ(Activity activity, C18E9 c18e9) {
        C18CK.LJFF(this.LIZLLL, new C21256518Gl());
        new LinkedHashSet();
        HashSet hashSet = new HashSet(((c18e9.LLJIJIL.size() * 4) / 3) + 1);
        for (Map.Entry entry : ((LinkedHashMap) c18e9.LLJIJIL).entrySet()) {
            Object obj = ((Reference) entry.getKey()).get();
            if (obj != null) {
                String str = C18EO.LIZ;
                if (C18EO.LIZ(obj, (EnumC21250718Ef) entry.getValue()) == null) {
                    hashSet.add(obj);
                }
            }
        }
        int size = hashSet.size();
        C18CK.LJFF(this.LIZLLL, new C18FR(size));
        if (size != 0) {
            if (size != 1) {
                Set setLJFF = LJFF(c18e9, hashSet);
                int size2 = setLJFF.size();
                C18CK.LJFF(this.LIZLLL, new C18FS(size2));
                if (size2 != 0) {
                    if (size2 != 1) {
                        Set setLIZLLL = LIZLLL(setLJFF);
                        int size3 = setLIZLLL.size();
                        C18CK.LJFF(this.LIZLLL, new C18FT(size3));
                        if (size3 != 0) {
                            if (size3 != 1) {
                                setLJFF = setLIZLLL;
                            } else {
                                LJI(C13LP.LJJLIIIJILLIZJL(setLIZLLL), c18e9);
                                return;
                            }
                        }
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (Object obj2 : setLJFF) {
                            EnumC21250718Ef enumC21250718Ef = (EnumC21250718Ef) ((LinkedHashMap) c18e9.LLJIJIL).get(new C589920NBu(obj2));
                            if (enumC21250718Ef != null && enumC21250718Ef.isManual()) {
                                linkedHashSet.add(obj2);
                            }
                        }
                        int size4 = linkedHashSet.size();
                        C18CK.LJFF(this.LIZLLL, new C18FU(size4));
                        if (size4 != 0) {
                            if (size4 != 1) {
                                setLJFF = linkedHashSet;
                            } else {
                                LJI(C13LP.LJJLIIIJILLIZJL(linkedHashSet), c18e9);
                                return;
                            }
                        }
                        C18CK.LJFF(this.LIZLLL, new C18FV(c18e9));
                        InterfaceC21252118Et interfaceC21252118EtLIZJ = c18e9.LIZJ(c18e9.LLILZIL);
                        if (interfaceC21252118EtLIZJ != null) {
                            Object objLJIIJ = interfaceC21252118EtLIZJ.LJIIJ();
                            if (objLJIIJ != null && setLJFF.contains(objLJIIJ)) {
                                C18CK.LJFF(this.LIZLLL, new C21256618Gm());
                                LJI(objLJIIJ, c18e9);
                                return;
                            }
                            C118300cf c118300cf = new C118300cf();
                            c118300cf.element = 1;
                            C18EF c18efLJIILIIL = interfaceC21252118EtLIZJ.LJIILIIL();
                            while (c18efLJIILIIL != null && c118300cf.element <= 3) {
                                Object objLJIIJ2 = c18efLJIILIIL.LJIIJ();
                                if (objLJIIJ2 != null && setLJFF.contains(objLJIIJ2)) {
                                    C18CK.LJFF(this.LIZLLL, new C18FE(c118300cf));
                                    LJI(objLJIIJ2, c18e9);
                                    return;
                                } else {
                                    c18efLJIILIIL = c18efLJIILIIL.LJIILIIL();
                                    c118300cf.element++;
                                }
                            }
                        }
                        Set setLIZ = LIZ(setLJFF);
                        int size5 = setLIZ.size();
                        C18CK.LJFF(this.LIZLLL, new C18FW(size5));
                        if (size5 != 0) {
                            if (size5 != 1) {
                                C18CK.LJFF(this.LIZLLL, new C21257218Gs());
                                LJI(C13LP.LJJLIIIJILLIZJL(setLIZ), c18e9);
                                LIZIZ(this, activity, setLIZ);
                                return;
                            } else {
                                String str2 = C18EO.LIZ;
                                C18EO.LIZLLL(C13LP.LJJLIIIJILLIZJL(setLIZ), this.LIZ);
                                return;
                            }
                        }
                        LIZJ(activity, "largeStep");
                        return;
                    }
                    LJI(C13LP.LJJLIIIJILLIZJL(setLJFF), c18e9);
                    return;
                }
                LIZJ(activity, "removeParent");
                return;
            }
            LJI(C13LP.LJJLIIIJILLIZJL(hashSet), c18e9);
            return;
        }
        LIZJ(activity, "filter");
    }

    public final boolean LJII(Activity activity, C18E9 c18e9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseBackResumer_");
        sbLIZ.append("tryResumeManualPages");
        C18CK.LJFF(C2188811AlT.LIZIZ(sbLIZ), new C18GW(this));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = ((ArrayList) c18e9.LLJI).iterator();
        while (it2.hasNext()) {
            Object obj = ((Reference) it2.next()).get();
            if (obj != null) {
                String str = C18EO.LIZ;
                if (C18EO.LIZ(obj, this.LIZ) == null) {
                    linkedHashSet.add(obj);
                }
            }
        }
        if (linkedHashSet.size() == 1) {
            String str2 = C18EO.LIZ;
            C18EO.LIZLLL(C13LP.LJJLIIIJILLIZJL(linkedHashSet), this.LIZ);
            return true;
        }
        if (linkedHashSet.size() > 1) {
            String str3 = C18EO.LIZ;
            C18EO.LIZLLL(C13LP.LJJLIIIJILLIZJL(linkedHashSet), this.LIZ);
            LIZIZ(this, activity, linkedHashSet);
            return true;
        }
        return false;
    }

    public final boolean LJIIIZ(Activity activity, C18E9 c18e9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseBackResumer_");
        sbLIZ.append("tryResumeUnManualPages");
        C18CK.LJFF(C2188811AlT.LIZIZ(sbLIZ), new C18GX(this));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = ((ArrayList) c18e9.LLJ).iterator();
        while (it2.hasNext()) {
            Object obj = ((Reference) it2.next()).get();
            if (obj != null) {
                String str = C18EO.LIZ;
                if (C18EO.LIZ(obj, this.LIZ) == null) {
                    linkedHashSet.add(obj);
                }
            }
        }
        if (linkedHashSet.size() == 1) {
            String str2 = C18EO.LIZ;
            C18EO.LIZLLL(C13LP.LJJLIIIJILLIZJL(linkedHashSet), this.LIZ);
            return true;
        }
        if (linkedHashSet.size() > 1) {
            Set setLJFF = LJFF(c18e9, linkedHashSet);
            if (setLJFF.size() == 1) {
                String str3 = C18EO.LIZ;
                C18EO.LIZLLL(C13LP.LJJLIIIJILLIZJL(setLJFF), this.LIZ);
                return true;
            }
            if (setLJFF.size() > 1) {
                String str4 = C18EO.LIZ;
                C18EO.LIZLLL(C13LP.LJJLIIIJILLIZJL(setLJFF), this.LIZ);
                LIZIZ(this, activity, setLJFF);
                return true;
            }
            return false;
        }
        return false;
    }

    public C18E7(EnumC21250718Ef enumC21250718Ef, int i, int i2) {
        this.LIZ = enumC21250718Ef;
        this.LIZIZ = i;
        this.LIZJ = i2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseBackResumer_");
        sbLIZ.append("resume_new");
        this.LIZLLL = C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZIZ(C18E7 c18e7, Activity activity, Set set) {
        c18e7.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            C21248618Dk.LIZ.getClass();
            arrayList.add(C21248618Dk.LJIIIIZZ(obj));
        }
        C18CE.LJI(c18e7.LIZIZ, null, null, new C1287850jcN(arrayList), new C466020IPg(activity.getClass().getName(), ""), null, 182);
    }
}
