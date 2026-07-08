package X;

import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Ji7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C499330Ji7 {
    public static final List<C0KQ2> LIZ = C1697810uHb.LJIIJJI(new C0KQ2() { // from class: X.0Ji3
        @Override // X.C0KQ2
        public final String getValue() {
            return C494680Jac.LJJI() ? "1" : CardStruct.IStatusCode.DEFAULT;
        }

        @Override // X.C0KQ2
        public final boolean m3(String str) {
            return Intrinsics.LJFF("sub-only-chat", str);
        }

        @Override // X.C0KQ2
        public final void setValue(String str) {
            C494680Jac.LJIJI(Intrinsics.LJFF(str, "1"));
        }
    }, new C0KQ2() { // from class: X.0Ji4
        @Override // X.C0KQ2
        public final void setValue(String str) {
        }

        @Override // X.C0KQ2
        public final String getValue() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sub_only_live", C494680Jac.LIZJ() ? "1" : CardStruct.IStatusCode.DEFAULT);
            jSONObject.put("allow_preview", C494680Jac.LIZIZ() ? "1" : CardStruct.IStatusCode.DEFAULT);
            jSONObject.put("allow_preview", C494680Jac.LJFF() ? "1" : CardStruct.IStatusCode.DEFAULT);
            return C786410Ut5.J3(jSONObject);
        }

        @Override // X.C0KQ2
        public final boolean m3(String str) {
            return Intrinsics.LJFF("sub-only-live", str);
        }
    }, new C0KQ2() { // from class: X.0JiF
        @Override // X.C0KQ2
        public final String getValue() {
            return !C0KPJ.ve.LIZIZ().booleanValue() ? "1" : CardStruct.IStatusCode.DEFAULT;
        }

        @Override // X.C0KQ2
        public final boolean m3(String str) {
            return Intrinsics.LJFF("sub-goal-guide-show", str);
        }

        @Override // X.C0KQ2
        public final void setValue(String str) {
            C0KPJ.ve.LJFF(Boolean.valueOf(Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)));
        }
    }, new C0KQ2() { // from class: X.0Ji8
        @Override // X.C0KQ2
        public final String getValue() {
            return C500260Jjc.LJJIJIIJIL(C0KPJ.oe.LIZ()) ? "1" : CardStruct.IStatusCode.DEFAULT;
        }

        @Override // X.C0KQ2
        public final boolean m3(String str) {
            return Intrinsics.LJFF("sub-email-bind-banner", str);
        }

        @Override // X.C0KQ2
        public final void setValue(String str) {
            C0KPJ.oe.LIZJ(Boolean.valueOf(Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)));
        }
    }, new C0KQ2() { // from class: X.0JiG
        @Override // X.C0KQ2
        public final String getValue() {
            return C0KPJ.ke.LIZ();
        }

        @Override // X.C0KQ2
        public final boolean m3(String str) {
            return Intrinsics.LJFF("sub-only-live-guide-for-sub-goal", str);
        }

        @Override // X.C0KQ2
        public final void setValue(String str) {
            C0KPJ.ke.LIZJ(str);
        }
    }, new C0KQ2() { // from class: X.0Ji6
        @Override // X.C0KQ2
        public final String getValue() {
            return C500260Jjc.LJJIJIIJIL(C0KPJ.Ie.LIZ()) ? "1" : CardStruct.IStatusCode.DEFAULT;
        }

        @Override // X.C0KQ2
        public final boolean m3(String str) {
            return Intrinsics.LJFF("sub-badge-reddot", str);
        }

        @Override // X.C0KQ2
        public final void setValue(String str) {
            C0KPJ.Ie.LIZJ(Boolean.valueOf(Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)));
        }
    }, new C0KQ2() { // from class: X.0JiE
        @Override // X.C0KQ2
        public final String getValue() {
            return C500260Jjc.LJJIJIIJIL(C0KPJ.pe.LIZ()) ? "1" : CardStruct.IStatusCode.DEFAULT;
        }

        @Override // X.C0KQ2
        public final boolean m3(String str) {
            return Intrinsics.LJFF("subathon-faq-guide", str);
        }

        @Override // X.C0KQ2
        public final void setValue(String str) {
            C0KPJ.pe.LIZJ(Boolean.valueOf(Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)));
        }
    }, new C0KQ2() { // from class: X.010w
        @Override // X.C0KQ2
        public final String getValue() {
            return C500260Jjc.LJJIJIIJIL(InterfaceC1106030et7.y4.LIZ()) ? "1" : CardStruct.IStatusCode.DEFAULT;
        }

        @Override // X.C0KQ2
        public final boolean m3(String str) {
            return Intrinsics.LJFF("sub-multi-tier-reddot", str);
        }

        @Override // X.C0KQ2
        public final void setValue(String str) {
            InterfaceC1106030et7.y4.LIZJ(Boolean.valueOf(Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)));
        }
    }, new C0KQ2() { // from class: X.0Ji5
        @Override // X.C0KQ2
        public final String getValue() {
            return C0KPJ.De.LIZIZ().toString();
        }

        @Override // X.C0KQ2
        public final boolean m3(String str) {
            return Intrinsics.LJFF("sub-space-guide-show-times", str);
        }

        @Override // X.C0KQ2
        public final void setValue(String str) {
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(str);
            if (numLJIIJJI != null) {
                C0KPJ.De.LJFF(Integer.valueOf(numLJIIJJI.intValue()));
            }
        }
    }, new C0KQ2() { // from class: X.0JiA
        @Override // X.C0KQ2
        public final String getValue() {
            return C176600m4.LIZIZ(C0KPJ.Be.LIZIZ()) ? "1" : CardStruct.IStatusCode.DEFAULT;
        }

        @Override // X.C0KQ2
        public final boolean m3(String str) {
            return Intrinsics.LJFF("sub-spotlight-red-dot", str);
        }

        @Override // X.C0KQ2
        public final void setValue(String str) {
            C0KPJ.Be.LJFF(Boolean.valueOf(Intrinsics.LJFF(str, "1")));
        }
    }, new C0KQ2() { // from class: X.0JiB
        @Override // X.C0KQ2
        public final String getValue() {
            return C500260Jjc.LJJIJIIJIL(C0KPJ.xe.LIZ()) ? "1" : CardStruct.IStatusCode.DEFAULT;
        }

        @Override // X.C0KQ2
        public final boolean m3(String str) {
            return Intrinsics.LJFF("sub-status-fail-show", str);
        }

        @Override // X.C0KQ2
        public final void setValue(String str) {
            C0KPJ.xe.LIZJ(Boolean.valueOf(Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)));
        }
    }, new C0KQ2() { // from class: X.0Ji2
        @Override // X.C0KQ2
        public final String getValue() {
            return C500260Jjc.LJJJI(C0KPJ.je.LIZ()) ? "1" : CardStruct.IStatusCode.DEFAULT;
        }

        @Override // X.C0KQ2
        public final boolean m3(String str) {
            return Intrinsics.LJFF("sub-anchor-agree-term", str);
        }

        @Override // X.C0KQ2
        public final void setValue(String str) {
            C0KPJ.je.LIZJ(Boolean.valueOf(Intrinsics.LJFF(str, "1")));
        }
    }, new C0KQ2() { // from class: X.0JiC
        @Override // X.C0KQ2
        public final String getValue() {
            return C500260Jjc.LJJIJIIJIL(C0KPJ.Ye.LIZIZ()) ? "1" : CardStruct.IStatusCode.DEFAULT;
        }

        @Override // X.C0KQ2
        public final boolean m3(String str) {
            return Intrinsics.LJFF("sub-wave-item-reddot", str);
        }

        @Override // X.C0KQ2
        public final void setValue(String str) {
            C0KPJ.Ye.LJFF(Boolean.valueOf(Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)));
        }
    }, new C0KQ2() { // from class: X.010x
        @Override // X.C0KQ2
        public final String getValue() {
            return C500260Jjc.LJJIJIIJIL(InterfaceC1106030et7.z4.LIZ()) ? "1" : CardStruct.IStatusCode.DEFAULT;
        }

        @Override // X.C0KQ2
        public final boolean m3(String str) {
            return Intrinsics.LJFF("sub-spotlight-popup-show", str);
        }

        @Override // X.C0KQ2
        public final void setValue(String str) {
            InterfaceC1106030et7.z4.LIZJ(Boolean.valueOf(Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)));
        }
    }, new C0KQ2() { // from class: X.0JiD
        @Override // X.C0KQ2
        public final String getValue() {
            return C500260Jjc.LJJIJIIJIL(C0KPJ.se.LIZ()) ? "1" : CardStruct.IStatusCode.DEFAULT;
        }

        @Override // X.C0KQ2
        public final boolean m3(String str) {
            return Intrinsics.LJFF("sub-subwave-popup-show", str);
        }

        @Override // X.C0KQ2
        public final void setValue(String str) {
            C0KPJ.se.LIZJ(Boolean.valueOf(Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)));
        }
    }, new C0KQ2() { // from class: X.010r
        public String LIZ = "";
        public String LIZIZ = "";
        public String LIZJ = "";

        public final String LIZ() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("subpopup_");
            sbLIZ.append(this.LIZ);
            sbLIZ.append('_');
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append('_');
            sbLIZ.append(this.LIZJ);
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // X.C0KQ2
        public final String getValue() {
            Boolean bool;
            String strLIZ = LIZ();
            try {
                Map<String, Boolean> mapLIZ = InterfaceC1106030et7.E5.LIZ();
                return (mapLIZ == null || (bool = mapLIZ.get(strLIZ)) == null) ? "1" : bool.booleanValue() ? CardStruct.IStatusCode.DEFAULT : "1";
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return "1";
            }
        }

        @Override // X.C0KQ2
        public final boolean m3(String str) {
            if (!u.LJJIIJZLJL(str, "sub-manage-popup-", false)) {
                return false;
            }
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{e3.g}, 0, 6);
            if (listLJJLIIIJILLIZJL.size() != 3) {
                return false;
            }
            this.LIZ = (String) ListProtector.get(listLJJLIIIJILLIZJL, 1);
            this.LIZIZ = (String) ListProtector.get(listLJJLIIIJILLIZJL, 2);
            this.LIZJ = String.valueOf(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId());
            return true;
        }

        @Override // X.C0KQ2
        public final void setValue(String str) {
            LinkedHashMap linkedHashMap;
            if (Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
                String strLIZ = LIZ();
                try {
                    C0JT6<Map<String, Boolean>> c0jt6 = InterfaceC1106030et7.E5;
                    Map<String, Boolean> mapLIZ = c0jt6.LIZ();
                    if (mapLIZ != null) {
                        linkedHashMap = new LinkedHashMap(mapLIZ);
                    } else {
                        linkedHashMap = new LinkedHashMap();
                    }
                    linkedHashMap.put(strLIZ, Boolean.TRUE);
                    c0jt6.LIZJ(linkedHashMap);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1CC2.LIZ("GuidePageKVStore", e);
                }
            }
        }
    }, new C0KQ2() { // from class: X.0JiH
        @Override // X.C0KQ2
        public final String getValue() {
            return C0KPJ.Ae.LIZ();
        }

        @Override // X.C0KQ2
        public final boolean m3(String str) {
            return Intrinsics.LJFF("sub-manage-overview-neworder-ts", str);
        }

        @Override // X.C0KQ2
        public final void setValue(String str) {
            C0KPJ.Ae.LIZJ(str);
        }
    }, new C0KQ2() { // from class: X.0Ji9
        @Override // X.C0KQ2
        public final String getValue() {
            return C500260Jjc.LJJJI(C0KPJ.Ee.LIZIZ()) ? "1" : CardStruct.IStatusCode.DEFAULT;
        }

        @Override // X.C0KQ2
        public final boolean m3(String str) {
            return Intrinsics.LJFF("sub-paypal-show", str);
        }

        @Override // X.C0KQ2
        public final void setValue(String str) {
            C0KPJ.Ee.LJFF(Boolean.valueOf(Intrinsics.LJFF(str, "1")));
        }
    });
}
