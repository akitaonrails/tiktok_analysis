package X;

import Y.ARunnableS128S0100000_28;
import Y.ARunnableS32S1100000_28;
import android.app.Activity;
import com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zi0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1906380zi0 {
    public static C1906490ziB LIZJ;
    public static final C1906380zi0 LIZ = new C1906380zi0();
    public static final ConcurrentHashMap<EnumC1584360rKc, C1906370zhz> LIZIZ = new ConcurrentHashMap<>();
    public static final List<InterfaceC1906520ziE> LIZLLL = new ArrayList();
    public static final C1906420zi4 LJ = new C18ZN() { // from class: X.0zi4
        @Override // X.C18ZN
        public final void onAppBackground() {
            Long lValueOf;
            C1906490ziB c1906490ziB = C1906380zi0.LIZJ;
            if (c1906490ziB != null) {
                C1906370zhz c1906370zhz = c1906490ziB.LIZJ;
                if (c1906370zhz != null) {
                    c1906370zhz.LJIIIZ.LIZIZ();
                    C1906480ziA c1906480ziA = c1906370zhz.LJIIIZ;
                    if ((c1906480ziA.LIZIZ != 0 || c1906480ziA.LIZ != 0) && (lValueOf = Long.valueOf(c1906480ziA.LIZ)) != null && lValueOf.longValue() < C0BTR.LIZ()) {
                        c1906370zhz.LJIIJ = lValueOf.longValue();
                        C823050WQl.LJFF().submit(new ARunnableS32S1100000_28(c1906370zhz, "bubble_jump_key", 0));
                    }
                }
                for (Map.Entry<EnumC1584360rKc, C1906370zhz> entry : c1906490ziB.LIZ.entrySet()) {
                    entry.getKey();
                    C1906370zhz value = entry.getValue();
                    value.LJIIIZ.LIZIZ();
                    C1906480ziA c1906480ziA2 = value.LJIIIZ;
                    if (c1906480ziA2.LIZIZ != 0 || c1906480ziA2.LIZ != 0) {
                        Long lValueOf2 = Long.valueOf(c1906480ziA2.LIZ);
                        if (lValueOf2 != null && lValueOf2.longValue() < C0BTR.LIZ()) {
                            value.LJIIJ = lValueOf2.longValue();
                            C823050WQl.LJFF().submit(new ARunnableS32S1100000_28(value, "bubble_tab_key", 0));
                        }
                    }
                }
            }
        }

        @Override // X.C18ZN
        public final void onAppForeground() {
            C1906480ziA c1906480ziA;
            C1906490ziB c1906490ziB = C1906380zi0.LIZJ;
            if (c1906490ziB != null) {
                if (!c1906490ziB.LIZ.isEmpty()) {
                    for (Map.Entry<EnumC1584360rKc, C1906370zhz> entry : c1906490ziB.LIZ.entrySet()) {
                        entry.getKey();
                        entry.getValue().LJIIIZ.LIZJ();
                    }
                }
                C1906370zhz c1906370zhz = c1906490ziB.LIZJ;
                if (c1906370zhz == null || (c1906480ziA = c1906370zhz.LJIIIZ) == null) {
                    return;
                }
                c1906480ziA.LIZJ();
            }
        }
    };

    public static boolean LJI() {
        C19EG c19eg;
        FeedFragment feedFragmentUx;
        Activity activityLIZ = C2421209eE.LIZ();
        if (!(activityLIZ instanceof C19EG) || (c19eg = (C19EG) activityLIZ) == null || !C486860J7k.LIZIZ(c19eg).FQ2("page_feed")) {
            return false;
        }
        C128Y c128yDQ2 = C343710Ddh.LIZ(c19eg).DQ2();
        return (c128yDQ2 instanceof InterfaceC1593630rZZ) && (feedFragmentUx = ((InterfaceC1593630rZZ) c128yDQ2).ux()) != null && ((FeedCommonService) ServiceManager.get().getService(FeedCommonService.class)).LJJIIZ(feedFragmentUx);
    }

    public static C1906370zhz LIZIZ(EnumC1584360rKc enumC1584360rKc) {
        return LIZIZ.get(enumC1584360rKc);
    }

    public static void LJ(EnumC1584360rKc enumC1584360rKc) {
        if (!C0BTQ.LIZ()) {
            return;
        }
        C1906490ziB c1906490ziB = LIZJ;
        if (c1906490ziB != null && ((enumC1584360rKc == EnumC1584360rKc.TOP_LIVE || enumC1584360rKc == EnumC1584360rKc.SEARCH || enumC1584360rKc == EnumC1584360rKc.SHOOT) && !c1906490ziB.LIZ.isEmpty())) {
            Iterator<Map.Entry<EnumC1584360rKc, C1906370zhz>> it2 = c1906490ziB.LIZ.entrySet().iterator();
            while (it2.hasNext()) {
                C1906370zhz value = it2.next().getValue();
                Long lLIZ = value.LJIIIZ.LIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("on click icon: ");
                sbLIZ.append(enumC1584360rKc);
                sbLIZ.append(", stop recording, bubble name: ");
                sbLIZ.append(value.LIZ);
                sbLIZ.append(", duration = ");
                sbLIZ.append(lLIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                if (lLIZ != null && lLIZ.longValue() < C0BTR.LIZ()) {
                    value.LJIIJ = lLIZ.longValue();
                    C1906380zi0 c1906380zi0 = LIZ;
                    String str = value.LIZ;
                    long jLongValue = lLIZ.longValue();
                    c1906380zi0.getClass();
                    LIZLLL(str, jLongValue, value, false);
                }
                c1906490ziB.LIZ.remove(enumC1584360rKc);
                LIZ.getClass();
                LJFF(enumC1584360rKc);
            }
            C823050WQl.LJFF().submit(new ARunnableS128S0100000_28(EnumC1619300sEy.SWITCH_TAB, 1));
        }
        C1906370zhz c1906370zhzLIZIZ = LIZIZ(enumC1584360rKc);
        if (c1906370zhzLIZIZ != null) {
            EnumC1619300sEy enumC1619300sEy = c1906370zhzLIZIZ.LJ;
            EnumC1619300sEy enumC1619300sEy2 = EnumC1619300sEy.JUMP_NEW_PAGE;
            if (enumC1619300sEy == enumC1619300sEy2 && c1906370zhzLIZIZ.LIZIZ()) {
                C1906490ziB c1906490ziB2 = LIZJ;
                if (c1906490ziB2 != null && c1906370zhzLIZIZ.LJ == enumC1619300sEy2) {
                    c1906490ziB2.LIZJ = c1906370zhzLIZIZ;
                }
                C1906380zi0 c1906380zi02 = LIZ;
                EnumC1905820zh6 enumC1905820zh6 = EnumC1905820zh6.CLICK_TOOLTIPS_POSITION;
                c1906380zi02.getClass();
                LIZJ(enumC1584360rKc, enumC1905820zh6, c1906370zhzLIZIZ);
            } else if (c1906370zhzLIZIZ.LJ == EnumC1619300sEy.SWITCH_TAB && c1906370zhzLIZIZ.LIZIZ()) {
                if (c1906370zhzLIZIZ.LJFF != 0 && c1906370zhzLIZIZ.LJIJJLI == 0) {
                    c1906370zhzLIZIZ.LJIJJLI = System.currentTimeMillis() - c1906370zhzLIZIZ.LJFF;
                }
                c1906370zhzLIZIZ.LIZJ(EnumC1905830zh7.CLICK_TOOLTIPS_POSITION);
                int i = !c1906370zhzLIZIZ.LJII ? 1 : 0;
                if (c1906370zhzLIZIZ.LJIJI == null) {
                    c1906370zhzLIZIZ.LJIJI = Integer.valueOf(i);
                }
            } else if (c1906370zhzLIZIZ.LJIILLIIL && enumC1584360rKc == c1906370zhzLIZIZ.LIZIZ) {
                C1906380zi0 c1906380zi03 = LIZ;
                EnumC1905820zh6 enumC1905820zh62 = EnumC1905820zh6.CLICK_TOOLTIPS_POSITION;
                c1906380zi03.getClass();
                LIZJ(enumC1584360rKc, enumC1905820zh62, c1906370zhzLIZIZ);
            }
        }
        IProtectionService iProtectionService = (IProtectionService) PluggableExtentionKt.pluggableSpi$default(IProtectionService.class, false, false, false, 14, null);
        if (iProtectionService != null) {
            iProtectionService.LJJIJLIJ(enumC1584360rKc.getKey());
        }
    }

    public static void LJFF(EnumC1584360rKc enumC1584360rKc) {
        if (enumC1584360rKc != null) {
            LIZIZ.remove(enumC1584360rKc);
        }
    }

    public static JSONObject LIZ(EnumC1584360rKc enumC1584360rKc, C1906370zhz c1906370zhz) {
        String str;
        String str2;
        C19EG c19eg;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tooltips_key", c1906370zhz.LIZ);
        if (c1906370zhz.LIZJ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("click_state", str);
        jSONObject.put("estimated_show_duration", c1906370zhz.LIZLLL);
        if (C123100dR.LIZ(c1906370zhz.LJIJJ)) {
            str2 = c1906370zhz.LJIJJ;
        } else {
            C1584320rKY.LIZ.getClass();
            str2 = C1584320rKY.LJII;
        }
        jSONObject.put("enter_from", str2);
        String str3 = c1906370zhz.LJIL;
        if (str3 != null) {
            jSONObject.put("group_id", str3);
        }
        String str4 = c1906370zhz.LJJ;
        if (str4 != null) {
            jSONObject.put("author_id", str4);
        }
        Activity activityLIZ = C2421209eE.LIZ();
        if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null) {
            C1584320rKY c1584320rKY = C1584320rKY.LIZ;
            c1584320rKY.getClass();
            String strLJIIIZ = C1584320rKY.LJIIIZ(enumC1584360rKc);
            String strLJIIJ = C1584320rKY.LJIIJ(enumC1584360rKc);
            c1584320rKY.getClass();
            jSONObject.put("tooltips_position", C1584320rKY.LIZIZ(c19eg, strLJIIJ).getFirst());
            jSONObject.put("tooltips_position_name", strLJIIIZ);
        }
        Map<String, String> map = c1906370zhz.LJJI;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8 A[LOOP:0: B:38:0x00c2->B:40:0x00c8, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.EnumC1584360rKc r7, X.EnumC1905820zh6 r8, X.C1906370zhz r9) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1906380zi0.LIZJ(X.0rKc, X.0zh6, X.0zhz):void");
    }

    public static void LIZLLL(String str, long j, C1906370zhz c1906370zhz, boolean z) throws JSONException {
        JSONObject jSONObjectLIZ;
        String str2;
        if (!C0BTQ.LIZ()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mobLeaveBubbleLandingPage, toolTipKey:");
        sbLIZ.append(str);
        sbLIZ.append(", duration = ");
        sbLIZ.append(j);
        sbLIZ.append(", isFromReCreate:");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c1906370zhz.LJIILJJIL) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("mobLeaveBubbleLandingPage, hasReport, key: ");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            return;
        }
        if (c1906370zhz.LJIILLIIL) {
            return;
        }
        c1906370zhz.LJIILJJIL = true;
        EnumC1584360rKc enumC1584360rKc = c1906370zhz.LJIIIIZZ;
        if (enumC1584360rKc == null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("createLeaveTimeBubbleInfo page name null, ");
            sbLIZ3.append(c1906370zhz.LIZ);
            C2188811AlT.LIZIZ(sbLIZ3);
            jSONObjectLIZ = null;
        } else {
            jSONObjectLIZ = LIZ(enumC1584360rKc, c1906370zhz);
            EnumC1905820zh6 enumC1905820zh6 = c1906370zhz.LJIIJJI;
            if (enumC1905820zh6 != null) {
                jSONObjectLIZ.put("click_type", enumC1905820zh6.getType());
            }
            jSONObjectLIZ.put("is_tooltips_disappear", c1906370zhz.LIZ());
            jSONObjectLIZ.put("leave_duration", j);
            C1584320rKY.LIZ.getClass();
            jSONObjectLIZ.put("to_page", C1584320rKY.LJIIIZ(enumC1584360rKc));
            if (z) {
                str2 = "kill_app";
            } else if (c1906370zhz.LJ == EnumC1619300sEy.JUMP_NEW_PAGE) {
                str2 = "back_to_entrance";
            } else {
                str2 = "jump_tab";
            }
            jSONObjectLIZ.put("quit_method", str2);
        }
        C20684815ws.LJIJ("core_fdmt_tooltips_landingpage_leave", jSONObjectLIZ);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("core_fdmt_tooltips_landingpage_leave: ");
        sbLIZ4.append(jSONObjectLIZ);
        C2188811AlT.LIZIZ(sbLIZ4);
        Iterator it2 = ((ArrayList) LIZLLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1906520ziE) it2.next()).LIZLLL(str, c1906370zhz, jSONObjectLIZ);
        }
    }
}
