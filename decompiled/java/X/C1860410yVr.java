package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ActionBarImageItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Extra;
import com.ss.android.ugc.aweme.tako.ccl.model.api.NewActionBarItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoAdditonalPanelListResponse;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoNewActionBarListResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0yVr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1860410yVr {
    public static final C1860490yVz LIZ;

    /* JADX WARN: Removed duplicated region for block: B:11:0x008f  */
    static {
        /*
            X.0yVr r0 = new X.0yVr
            X.0yVz r5 = new X.0yVz
            r6 = 7
            X.0yW0[] r4 = new X.C1860500yW0[r6]
            X.0yW0 r1 = new X.0yW0
            boolean r0 = X.C07I9.LIZ()
            r7 = 1
            r1.<init>(r7, r0)
            r0 = 0
            r4[r0] = r1
            X.0yW0 r1 = new X.0yW0
            X.01GW r0 = X.C1820107Ax.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r7) goto L91
            r0 = 1
        L25:
            r2 = 2
            r1.<init>(r2, r0)
            r4[r7] = r1
            X.0yW0 r1 = new X.0yW0
            X.01GW r0 = X.C0B1D.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r7) goto L8f
            X.0yJU r0 = X.C1852740yJU.LIZ
            r0.getClass()
            boolean r0 = X.C1852740yJU.LIZ()
            if (r0 != 0) goto L8f
        L46:
            r3 = 3
            r1.<init>(r3, r7)
            r4[r2] = r1
            X.0yW0 r1 = new X.0yW0
            X.0yJU r0 = X.C1852740yJU.LIZ
            r0.getClass()
            boolean r0 = X.C1852740yJU.LIZ()
            r2 = 4
            r1.<init>(r2, r0)
            r4[r3] = r1
            X.0yW0 r1 = new X.0yW0
            boolean r0 = X.C1852740yJU.LIZ()
            r3 = 5
            r1.<init>(r3, r0)
            r4[r2] = r1
            X.0yW0 r1 = new X.0yW0
            X.0yVy r0 = X.C1860480yVy.LIZ
            r0.getClass()
            boolean r0 = X.C1860480yVy.LIZ()
            r2 = 6
            r1.<init>(r2, r0)
            r4[r3] = r1
            X.0yW0 r1 = new X.0yW0
            boolean r0 = X.C298780BnQ.LIZ()
            r1.<init>(r6, r0)
            r4[r2] = r1
            java.util.List r0 = X.C1697810uHb.LJIIJJI(r4)
            r5.<init>(r0)
            X.C1860410yVr.LIZ = r5
            return
        L8f:
            r7 = 0
            goto L46
        L91:
            r0 = 0
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1860410yVr.<clinit>():void");
    }

    public static void LIZ() {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1860420yVs(null), 3);
    }

    public static C1852820yJc LIZIZ() {
        TakoNewActionBarListResponse takoNewActionBarListResponseLIZLLL;
        List<ActionBarImageItem> list;
        List<ActionBarImageItem> list2;
        TakoAdditonalPanelListResponse takoAdditonalPanelListResponseLIZ;
        C1860470yVx.LIZ.getClass();
        if (C1860470yVx.LIZIZ()) {
            C1860460yVw c1860460yVw = (C1860460yVw) C1860470yVx.LIZ().get(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            if (c1860460yVw == null || (takoNewActionBarListResponseLIZLLL = c1860460yVw.LIZ) == null) {
                C1860520yW2.LIZ.getClass();
                String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                Keva kevaLJIIL = C1860520yW2.LJIIL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("tako_sub_mode_response_");
                sbLIZ.append(curUserId);
                takoNewActionBarListResponseLIZLLL = C1860390yVp.LIZLLL(kevaLJIIL.getString(C2188811AlT.LIZIZ(sbLIZ), ""));
            }
        } else {
            C1860520yW2.LIZ.getClass();
            String curUserId2 = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            Keva kevaLJIIL2 = C1860520yW2.LJIIL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("tako_sub_mode_response_");
            sbLIZ2.append(curUserId2);
            takoNewActionBarListResponseLIZLLL = C1860390yVp.LIZLLL(kevaLJIIL2.getString(C2188811AlT.LIZIZ(sbLIZ2), ""));
        }
        ArrayList arrayList = new ArrayList();
        C1855770yON.LIZ.getClass();
        if (C1855770yON.LIZIZ()) {
            if (C1860470yVx.LIZIZ()) {
                C1860460yVw c1860460yVw2 = (C1860460yVw) C1860470yVx.LIZ().get(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                if (c1860460yVw2 == null || (takoAdditonalPanelListResponseLIZ = c1860460yVw2.LIZIZ) == null) {
                    C1860520yW2.LIZ.getClass();
                    String curUserId3 = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                    Keva kevaLJIIL3 = C1860520yW2.LJIIL();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("tako_additonal_panel_list_response_");
                    sbLIZ3.append(curUserId3);
                    takoAdditonalPanelListResponseLIZ = C1860390yVp.LIZ(kevaLJIIL3.getString(C2188811AlT.LIZIZ(sbLIZ3), ""));
                }
            } else {
                C1860520yW2.LIZ.getClass();
                String curUserId4 = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                Keva kevaLJIIL4 = C1860520yW2.LJIIL();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("tako_additonal_panel_list_response_");
                sbLIZ4.append(curUserId4);
                takoAdditonalPanelListResponseLIZ = C1860390yVp.LIZ(kevaLJIIL4.getString(C2188811AlT.LIZIZ(sbLIZ4), ""));
            }
            List<NewActionBarItem> list3 = takoAdditonalPanelListResponseLIZ.actionBarList;
            if (list3 != null) {
                ArrayList<NewActionBarItem> arrayList2 = new ArrayList();
                for (NewActionBarItem newActionBarItem : list3) {
                    NewActionBarItem newActionBarItem2 = newActionBarItem;
                    if (newActionBarItem2.type > 0 && C123100dR.LIZ(newActionBarItem2.name)) {
                        arrayList2.add(newActionBarItem);
                    }
                }
                for (NewActionBarItem newActionBarItem3 : arrayList2) {
                    Iterator<C1860500yW0> it2 = LIZ.LIZ.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            C1860500yW0 next = it2.next();
                            C1860500yW0 c1860500yW0 = next;
                            if (c1860500yW0.LIZ == newActionBarItem3.type && c1860500yW0.LIZIZ) {
                                if (next != null) {
                                    arrayList.add(newActionBarItem3);
                                }
                            }
                        }
                    }
                }
            }
        } else {
            List<NewActionBarItem> list4 = takoNewActionBarListResponseLIZLLL.actionBarList;
            if (list4 != null) {
                ArrayList<NewActionBarItem> arrayList3 = new ArrayList();
                for (NewActionBarItem newActionBarItem4 : list4) {
                    NewActionBarItem newActionBarItem5 = newActionBarItem4;
                    if (newActionBarItem5.type > 0 && C123100dR.LIZ(newActionBarItem5.name)) {
                        arrayList3.add(newActionBarItem4);
                    }
                }
                for (NewActionBarItem newActionBarItem6 : arrayList3) {
                    Iterator<C1860500yW0> it3 = LIZ.LIZ.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            C1860500yW0 next2 = it3.next();
                            C1860500yW0 c1860500yW02 = next2;
                            if (c1860500yW02.LIZ == newActionBarItem6.type && c1860500yW02.LIZIZ) {
                                if (next2 != null) {
                                    arrayList.add(newActionBarItem6);
                                }
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (C1820007Aw.LIZ()) {
            C1852740yJU.LIZ.getClass();
            if (!C1852740yJU.LIZ() && (list2 = takoNewActionBarListResponseLIZLLL.imageActions) != null) {
                for (ActionBarImageItem actionBarImageItem : list2) {
                    int i = actionBarImageItem.actionType;
                    if (i == 1 || i == 3) {
                        arrayList4.add(actionBarImageItem);
                    }
                    if (actionBarImageItem.actionType == 5) {
                        C1860480yVy.LIZ.getClass();
                        if (C1860480yVy.LIZ()) {
                            arrayList4.add(actionBarImageItem);
                        }
                    }
                }
            }
        }
        if (C1820007Aw.LIZ()) {
            C1852740yJU.LIZ.getClass();
            if (C1852740yJU.LIZ() && (list = takoNewActionBarListResponseLIZLLL.imageActionsV2) != null) {
                for (ActionBarImageItem actionBarImageItem2 : list) {
                    int i2 = actionBarImageItem2.actionType;
                    if (i2 == 1 || i2 == 4) {
                        arrayList4.add(actionBarImageItem2);
                    }
                    if (actionBarImageItem2.actionType == 5) {
                        C1860480yVy.LIZ.getClass();
                        if (C1860480yVy.LIZ()) {
                            arrayList4.add(actionBarImageItem2);
                        }
                    }
                }
            }
        }
        Extra extra = takoNewActionBarListResponseLIZLLL.extra;
        String str = extra != null ? extra.logid : null;
        List list5 = takoNewActionBarListResponseLIZLLL.creativeTemplates;
        if (list5 == null) {
            list5 = C13BV.INSTANCE;
        }
        return new C1852820yJc(str, arrayList, arrayList4, list5, takoNewActionBarListResponseLIZLLL.convertStyle, takoNewActionBarListResponseLIZLLL.thirdPartyActionBarList, takoNewActionBarListResponseLIZLLL.aigcStyleConfig);
    }
}
