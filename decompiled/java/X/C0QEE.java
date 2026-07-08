package X;

import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.ss.android.ugc.tiktok.pns.activitycenter.PnSSearchHistoryServiceImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0QEE, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QEE {
    public static final C0QEE LIZ = new C0QEE();
    public static List<? extends SearchHistory> LIZIZ;
    public static String LIZJ;
    public static List<? extends SearchHistory> LIZLLL;
    public static String LJ;
    public static List<? extends SearchHistory> LJFF;

    public static SearchHistory LJ(String str) {
        List<? extends SearchHistory> list;
        Object obj = null;
        if (!C2452309jF.LIZ() || (list = LJFF) == null) {
            return null;
        }
        Iterator it2 = ((ArrayList) list).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.LJFF(((SearchHistory) next).keyword, str)) {
                obj = next;
                break;
            }
        }
        return (SearchHistory) obj;
    }

    public static String LJFF(boolean z) {
        List<? extends SearchHistory> list;
        if (!z || (list = LIZLLL) == null) {
            list = LIZIZ;
        }
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            Iterator<? extends SearchHistory> it2 = list.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next().toString());
            }
        }
        return Uri.encode(jSONArray.toString());
    }

    public static void LJI(List list) {
        List<? extends SearchHistory> listLJJJJLI;
        if (list != null) {
            listLJJJJLI = C13LP.LJJJJLI(list);
        } else {
            listLJJJJLI = C13BV.INSTANCE;
        }
        LIZIZ = listLJJJJLI;
        JSONArray jSONArray = new JSONArray();
        Iterator<? extends SearchHistory> it2 = listLJJJJLI.iterator();
        while (it2.hasNext()) {
            jSONArray.put(String.valueOf(it2.next().timestamp));
        }
        LIZJ = jSONArray.toString();
    }

    public static void LJII(List list) {
        List<? extends SearchHistory> listLJJJJLI;
        try {
            if (list != null) {
                listLJJJJLI = C13LP.LJJJJLI(list);
            } else {
                listLJJJJLI = C13BV.INSTANCE;
            }
            LIZLLL = listLJJJJLI;
            ArrayList arrayList = new ArrayList();
            for (SearchHistory searchHistory : listLJJJJLI) {
                if (C123100dR.LIZ(searchHistory.musicId)) {
                    arrayList.add(searchHistory);
                }
            }
            LJFF = arrayList;
            JSONArray jSONArray = new JSONArray();
            Iterator<? extends SearchHistory> it2 = listLJJJJLI.iterator();
            while (it2.hasNext()) {
                jSONArray.put(String.valueOf(it2.next().timestamp));
            }
            LJ = jSONArray.toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "updateHistoryWithMusic");
        }
    }

    public static void LIZJ(List list, boolean z, ECSearchEntranceData eCSearchEntranceData, String str) {
        LIZ(C0QPJ.LJIJ(eCSearchEntranceData), str, list, z, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.0QEA] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0QF6] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.ss.android.ugc.tiktok.pns.activitycenter.api.IPnSSearchHistoryService] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    public static boolean LIZ(final String str, String str2, List list, boolean z, boolean z2) {
        final ?? arrayList;
        String str3;
        List<SearchHistory> listLIZIZ;
        try {
            ?? LJIJJ = C0QPJ.LJIJJ(str);
            if (z) {
                if (LJIJJ == 0 || (listLIZIZ = LJIJJ.LIZIZ()) == null || (arrayList = C13LP.LLIIII(listLIZIZ)) == 0) {
                    arrayList = C13BV.INSTANCE;
                }
            } else {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new SearchHistory((String) it2.next(), 0));
                }
            }
            LJIJJ.LJFF(str2, arrayList);
            if (z2 && ((ArrayList) C0QPJ.LJIIZILJ()).contains(str)) {
                ?? LIZIZ2 = PnSSearchHistoryServiceImpl.LIZIZ();
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                for (SearchHistory searchHistory : arrayList) {
                    if (searchHistory == null || (str3 = searchHistory.keyword) == null) {
                        str3 = "";
                    }
                    arrayList2.add(str3);
                }
                LIZIZ2.LIZ(arrayList2, new C0CQN() { // from class: X.0QEA
                    @Override // X.C0CQN
                    public final void LIZIZ() {
                    }

                    @Override // X.C0CQN
                    public final void LIZ() {
                        C0QEE c0qee = C0QEE.LIZ;
                        List<SearchHistory> list2 = arrayList;
                        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                        Iterator<SearchHistory> it3 = list2.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(it3.next().keyword);
                        }
                        C0QEE.LIZLLL(c0qee, arrayList3, false, str, null, 8);
                    }
                });
                return true;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056 A[PHI: r8
      0x0056: PHI (r8v1 java.lang.Object) = (r8v11 java.lang.Object), (r8v12 java.lang.Object), (r8v13 java.lang.Object) binds: [B:3:0x0002, B:15:0x0024, B:28:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(androidx.fragment.app.Fragment r5, java.util.List r6, boolean r7, android.app.Activity r8, java.lang.String r9) {
        /*
            r2 = 1
            r4 = 0
            if (r8 != 0) goto L56
            com.ss.android.ugc.aweme.search.common.utils.SAFHelper r3 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LIZ
            if (r5 == 0) goto L1c
            android.content.Context r0 = r5.getContext()
            if (r0 == 0) goto L8e
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
        L12:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L72
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L7f
        L1c:
            r1 = r4
        L1d:
            r3.getClass()
            android.app.Activity r8 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJIIIIZZ(r1)
            if (r8 != 0) goto L56
            boolean r0 = X.C1205604ne.LIZ()
            if (r0 == 0) goto L66
            X.0mCc r0 = X.C1906580ziK.LJ()
            if (r0 == 0) goto L70
            android.app.Activity r0 = r0.LIZIZ()
            if (r0 == 0) goto L70
            android.app.Activity r8 = X.C737910Sx3.LIZIZ(r0)
        L3c:
            boolean r0 = r8 instanceof X.C19EG
            if (r0 == 0) goto L6e
            X.19EG r8 = (X.C19EG) r8
        L42:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService> r0 = com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService r0 = (com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService) r0
            boolean r0 = r0.LJJLIIIJJI(r8)
            if (r0 == 0) goto L66
            if (r8 == 0) goto L66
        L56:
            boolean r0 = r8 instanceof X.C19EG
            if (r0 == 0) goto L66
            X.19EG r8 = (X.C19EG) r8
            X.0QER r0 = X.C640270P9l.LIZJ(r5, r8)
            if (r0 == 0) goto L66
            com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData r4 = r0.getEcSearchEntranceData()
        L66:
            java.lang.String r0 = X.C0QPJ.LJIJ(r4)
            LIZ(r0, r9, r6, r7, r2)
            return
        L6e:
            r8 = r4
            goto L42
        L70:
            r8 = r4
            goto L3c
        L72:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L1c
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L7f
            goto L1c
        L7f:
            r1 = r5
        L80:
            boolean r0 = r1 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L87
            X.198i r1 = (X.InterfaceC214902198i) r1
            goto L1d
        L87:
            androidx.fragment.app.Fragment r1 = r1.getParentFragment()
            if (r1 == 0) goto L1c
            goto L80
        L8e:
            r1 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QEE.LIZIZ(androidx.fragment.app.Fragment, java.util.List, boolean, android.app.Activity, java.lang.String):void");
    }

    public static boolean LIZLLL(C0QEE c0qee, List list, boolean z, String str, String str2, int i) {
        boolean z2;
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = "del_after_pns";
        }
        c0qee.getClass();
        List<String> listLJIIZILJ = C0QPJ.LJIIZILJ();
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : (ArrayList) listLJIIZILJ) {
            if (!Intrinsics.LJFF(obj, str) || str == null || str.length() == 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (String str3 : arrayList) {
            LIZ.getClass();
            arrayList2.add(Boolean.valueOf(LIZ(str3, str2, list, z, false)));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            while (it2.hasNext()) {
                boolean zBooleanValue = ((Boolean) it2.next()).booleanValue();
                if (((Boolean) next).booleanValue() && zBooleanValue) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                next = Boolean.valueOf(z2);
            }
            return ((Boolean) next).booleanValue();
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
}
