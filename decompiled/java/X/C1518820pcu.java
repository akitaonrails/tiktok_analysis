package X;

import com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService;
import com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0pcu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1518820pcu {
    public static final void LIZ(C1518830pcv c1518830pcv, final InterfaceC1519200pdW interfaceC1519200pdW, final InterfaceC1914220zue interfaceC1914220zue) {
        boolean z;
        String str;
        Object obj;
        String str2;
        IGeoBlockingService iGeoBlockingService = (IGeoBlockingService) PluggableExtentionKt.pluggableSpi$default(IGeoBlockingService.class, false, false, false, 14, null);
        Object obj2 = null;
        if (iGeoBlockingService != null) {
            Map<String, Object> map = c1518830pcv.LIZJ;
            if (map != null) {
                obj = map.get("rule_id");
            } else {
                obj = null;
            }
            if (!(obj instanceof String) || (str2 = (String) obj) == null) {
                str2 = "";
            }
            iGeoBlockingService.LIZJ(str2);
        }
        IGeoBlockingService iGeoBlockingService2 = (IGeoBlockingService) PluggableExtentionKt.pluggableSpi$default(IGeoBlockingService.class, false, false, false, 14, null);
        if (iGeoBlockingService2 != null) {
            iGeoBlockingService2.LJFF(c1518830pcv.LIZIZ, c1518830pcv.LIZ);
        }
        IKidsAccountService iKidsAccountService = (IKidsAccountService) PluggableExtentionKt.pluggableSpi$default(IKidsAccountService.class, false, false, false, 14, null);
        if (iKidsAccountService != null && iKidsAccountService.LIZIZ()) {
            z = true;
        } else {
            z = false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("path", c1518830pcv.LIZ);
        linkedHashMap.put("error_code", String.valueOf(c1518830pcv.LIZIZ));
        Map<String, Object> map2 = c1518830pcv.LIZJ;
        if (map2 != null) {
            for (Map.Entry<String, Object> entry : map2.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
        }
        final HashMap mapLJI = C2097608Jq.LJI(new Pair("extra", linkedHashMap.toString()));
        TTKUserCommunicationService tTKUserCommunicationService = (TTKUserCommunicationService) PluggableExtentionKt.pluggableSpi$default(TTKUserCommunicationService.class, false, false, false, 14, null);
        if (tTKUserCommunicationService != null) {
            int i = c1518830pcv.LIZIZ;
            InterfaceC1518910pd3 interfaceC1518910pd3 = new InterfaceC1518910pd3() { // from class: X.0pcx
                @Override // X.InterfaceC1518910pd3
                public final InterfaceC1594906Mh LIZJ() {
                    return null;
                }

                @Override // X.InterfaceC1518910pd3
                public final InterfaceC1519250pdb LIZ() {
                    final InterfaceC1519200pdW interfaceC1519200pdW2 = interfaceC1519200pdW;
                    final InterfaceC1914220zue interfaceC1914220zue2 = interfaceC1914220zue;
                    return new InterfaceC1519250pdb() { // from class: X.0pcy
                        @Override // X.InterfaceC1519250pdb
                        public final InterfaceC1914220zue LIZJ() {
                            final InterfaceC1914220zue interfaceC1914220zue3 = interfaceC1914220zue2;
                            return new InterfaceC1914220zue() { // from class: X.0zuh
                                @Override // X.InterfaceC1914220zue
                                public final void LIZJ(Boolean bool, String str3) {
                                }

                                @Override // X.InterfaceC1914220zue
                                public final void LIZLLL() {
                                }

                                @Override // X.InterfaceC1914220zue
                                public final void LIZ(C1519370pdn c1519370pdn) {
                                    InterfaceC1914220zue interfaceC1914220zue4 = interfaceC1914220zue3;
                                    if (interfaceC1914220zue4 != null) {
                                        interfaceC1914220zue4.LIZ(c1519370pdn);
                                    }
                                }

                                @Override // X.InterfaceC1914220zue
                                public final void LJFF(C1519370pdn c1519370pdn) {
                                    InterfaceC1914220zue interfaceC1914220zue4 = interfaceC1914220zue3;
                                    if (interfaceC1914220zue4 != null) {
                                        interfaceC1914220zue4.LJFF(c1519370pdn);
                                    }
                                }

                                @Override // X.InterfaceC1914220zue
                                public final void LIZIZ(String str3, C1519370pdn c1519370pdn) {
                                    InterfaceC1914220zue interfaceC1914220zue4 = interfaceC1914220zue3;
                                    if (interfaceC1914220zue4 != null) {
                                        interfaceC1914220zue4.LIZIZ(str3, c1519370pdn);
                                    }
                                }

                                @Override // X.InterfaceC1914220zue
                                public final void LJ(UniversalPopupAction universalPopupAction, C1519370pdn c1519370pdn) {
                                    InterfaceC1914220zue interfaceC1914220zue4 = interfaceC1914220zue3;
                                    if (interfaceC1914220zue4 != null) {
                                        interfaceC1914220zue4.LJ(universalPopupAction, c1519370pdn);
                                    }
                                }
                            };
                        }

                        @Override // X.InterfaceC1519250pdb
                        public final Map<String, String> LIZIZ() {
                            return C2097608Jq.LJ();
                        }

                        @Override // X.InterfaceC1519250pdb
                        public final InterfaceC1519200pdW LIZ() {
                            return interfaceC1519200pdW2;
                        }
                    };
                }

                @Override // X.InterfaceC1518910pd3
                public final /* bridge */ /* synthetic */ Map LIZIZ() {
                    return mapLJI;
                }
            };
            if (z) {
                str = "PopupShowProcessorLocal";
            } else {
                str = null;
            }
            tTKUserCommunicationService.LJIIJJI(i, interfaceC1518910pd3, str);
        }
        Map<String, Object> map3 = c1518830pcv.LIZJ;
        if (map3 != null) {
            obj2 = map3.get("rule_id");
        }
        boolean z2 = obj2 instanceof String;
    }
}
