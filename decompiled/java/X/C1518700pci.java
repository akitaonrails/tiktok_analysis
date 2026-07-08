package X;

import android.app.Activity;
import android.net.Uri;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.TTKUserCommunicationServiceImpl;
import com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupDispatchResponse;
import com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupResponse;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pci, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1518700pci extends C09AY implements Function0<C1518550pcT> {
    public final /* synthetic */ TTKUserCommunicationServiceImpl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1518700pci(TTKUserCommunicationServiceImpl tTKUserCommunicationServiceImpl) {
        super(0);
        this.LL = tTKUserCommunicationServiceImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1518550pcT invoke() {
        C1518550pcT c1518550pcT = C1518550pcT.LIZ;
        TTKUserCommunicationServiceImpl tTKUserCommunicationServiceImpl = this.LL;
        C1519130pdP c1519130pdP = (C1519130pdP) tTKUserCommunicationServiceImpl.LL.getValue();
        c1518550pcT.getClass();
        C1518550pcT.LIZJ(c1519130pdP);
        C1518550pcT.LIZJ((C1519140pdQ) tTKUserCommunicationServiceImpl.LLILLJJLI.getValue());
        C1518550pcT.LIZJ(new C1519290pdf());
        C1518550pcT.LIZJ(new InterfaceC1524005xu<NetworkUniversalPopupDispatchResponse>() { // from class: X.0pcb
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(167));

            @Override // X.InterfaceC1524005xu
            public final String LIZ() {
                return "DynamicProcessor";
            }

            @Override // X.InterfaceC1524005xu
            public final void LIZIZ(NetworkUniversalPopupDispatchResponse networkUniversalPopupDispatchResponse, Integer num, Map map) {
                boolean zBooleanValue;
                int iIntValue;
                int i;
                Map<Integer, List<C07YX>> map2;
                Boolean bool;
                NetworkUniversalPopupDispatchResponse networkUniversalPopupDispatchResponse2 = networkUniversalPopupDispatchResponse;
                if (networkUniversalPopupDispatchResponse2 != null) {
                    Object obj = map.get("isHotLaunch");
                    if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    List<NetworkUniversalPopupResponse> list = networkUniversalPopupDispatchResponse2.popupResponses;
                    if (list == null) {
                        list = C13BV.INSTANCE;
                    }
                    for (NetworkUniversalPopupResponse networkUniversalPopupResponse : list) {
                        Integer num2 = networkUniversalPopupResponse.popupMeta.afterNSwipe;
                        if (num2 != null && (iIntValue = num2.intValue()) > 0) {
                            C1518640pcc c1518640pcc = (C1518640pcc) this.LIZ.getValue();
                            C07YX c07yx = new C07YX(networkUniversalPopupResponse, zBooleanValue);
                            synchronized (c1518640pcc) {
                                if (zBooleanValue) {
                                    String str = networkUniversalPopupResponse.popupMeta.business;
                                    ArrayList arrayList = (ArrayList) C15438062q.LJIJJLI(((LinkedHashMap) c1518640pcc.LIZLLL).values());
                                    if (!arrayList.isEmpty()) {
                                        Iterator it2 = arrayList.iterator();
                                        while (it2.hasNext()) {
                                            if (Intrinsics.LJFF(((C07YX) it2.next()).LIZ.popupMeta.business, str)) {
                                                break;
                                            }
                                        }
                                    }
                                }
                                boolean z = c07yx.LIZIZ;
                                if (z) {
                                    i = c1518640pcc.LIZJ;
                                } else {
                                    i = c1518640pcc.LIZIZ;
                                }
                                if (iIntValue <= i) {
                                    c1518640pcc.LIZ.invoke(Collections.singletonList(c07yx), Integer.valueOf(i));
                                } else {
                                    if (z) {
                                        map2 = c1518640pcc.LJ;
                                    } else {
                                        map2 = c1518640pcc.LIZLLL;
                                    }
                                    Integer numValueOf = Integer.valueOf(iIntValue);
                                    List<C07YX> arrayList2 = map2.get(numValueOf);
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList<>();
                                        map2.put(numValueOf, arrayList2);
                                    }
                                    arrayList2.add(c07yx);
                                }
                            }
                        }
                    }
                }
            }
        });
        C1518550pcT.LIZJ(new InterfaceC1524005xu<String>() { // from class: X.05xe
            @Override // X.InterfaceC1524005xu
            public final String LIZ() {
                return "AweRouterProcessor";
            }

            @Override // X.InterfaceC1524005xu
            public final void LIZIZ(String str, Integer num, Map map) {
                Map map2;
                String str2;
                String str3;
                Object obj;
                String scheme;
                String str4;
                String str5 = str;
                if (str5 != null) {
                    Type type = new TypeToken<Map<String, ? extends String>>() { // from class: X.04XX
                    }.getType();
                    Activity activityLIZIZ = null;
                    try {
                        C1227904rF.LIZ.getClass();
                        map2 = (Map) C1227904rF.LIZJ(str5, type);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        map2 = null;
                    }
                    Object obj2 = map.get("enter_from");
                    if (!(obj2 instanceof String) || (str2 = (String) obj2) == null) {
                        str2 = "";
                    }
                    if (map2 != null && (str3 = (String) map2.get("url")) != null) {
                        boolean z = false;
                        String strLIZIZ = str3;
                        if (str2.length() != 0) {
                            SettingsManager.LIZLLL().getClass();
                            if (!SettingsManager.LIZ("enable_awerouter_enter_param_fix", true)) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(str3);
                                sbLIZ.append("%26enter_from%3D");
                                sbLIZ.append(str2);
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            } else {
                                try {
                                    String strDecode = Uri.decode(str3);
                                    Uri uri = UriProtector.parse(str3);
                                    Uri uri2 = UriProtector.parse(strDecode);
                                    String scheme2 = uri.getScheme();
                                    if ((scheme2 == null || scheme2.length() == 0) && (scheme = uri2.getScheme()) != null && scheme.length() != 0) {
                                        z = true;
                                        str4 = strDecode;
                                    } else {
                                        str4 = str3;
                                    }
                                    String string = UriProtector.parse(str4).buildUpon().appendQueryParameter("enter_from", str2).build().toString();
                                    String strEncode = string;
                                    if (z) {
                                        strEncode = Uri.encode(string);
                                    }
                                    C189200o6.m2constructorimpl(strEncode);
                                    obj = strEncode;
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C098200Yq c098200Yq = new C098200Yq(th);
                                    C189200o6.m2constructorimpl(c098200Yq);
                                    obj = c098200Yq;
                                }
                                Object obj3 = str3;
                                if (!C189200o6.m7isFailureimpl(obj)) {
                                    obj3 = obj;
                                }
                                strLIZIZ = (String) obj3;
                            }
                        }
                        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                        if (abstractC1387200mCcLIZIZ != null) {
                            activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
                        }
                        SmartRouter.buildRoute(activityLIZIZ, strLIZIZ).open();
                    }
                }
            }
        });
        this.LL.LJIIIIZZ();
        return c1518550pcT;
    }
}
