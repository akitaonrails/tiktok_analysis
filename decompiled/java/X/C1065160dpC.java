package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.router.util.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.ISandboxService;
import com.ss.android.ugc.aweme.lemon.Lemon8CustomParamsToAFField;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dpC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1065160dpC {
    public final Intent LIZ;
    public final InterfaceC1065250dpL LIZIZ;
    public final InterfaceC1065240dpK LIZJ;

    public final void LIZ(Activity activity, Map<String, String> map) {
        boolean z;
        boolean z2;
        Object obj;
        String[] strArr;
        Map linkedHashMap;
        int iIntValue;
        int length;
        int length2;
        Object c098200Yq;
        StringBuilder sbLIZ;
        activity.getPackageName();
        C1065200dpG.LIZ();
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) map;
        String strLIZ = (String) linkedHashMap2.get("pid");
        if (strLIZ == null) {
            strLIZ = this.LIZIZ.LIZ();
            z = true;
        } else {
            z = false;
        }
        String str = (String) linkedHashMap2.get("amp_extra");
        String str2 = "";
        if (str == null) {
            z2 = true;
            str = "";
        } else {
            z2 = false;
        }
        String str3 = (String) linkedHashMap2.get("entry");
        String str4 = (String) linkedHashMap2.get("lemon8_deep_link_value");
        String str5 = (String) linkedHashMap2.get("cpp_link");
        if (str5 == null || !(!a0.LJJJIL(str5))) {
            C1065120dp8.LIZ.getClass();
            if (a0.LJJJIL(str)) {
                str5 = null;
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String strOptString = jSONObject.optString("cpp_link_android");
                    boolean z3 = !a0.LJJJIL(strOptString);
                    String str6 = strOptString;
                    if (!z3 || strOptString == null) {
                        String strOptString2 = jSONObject.optString("cpp_link");
                        boolean z4 = !a0.LJJJIL(strOptString2);
                        str6 = strOptString2;
                        if (!z4) {
                            str6 = null;
                        }
                    }
                    C189200o6.m2constructorimpl(str6);
                    obj = str6;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C098200Yq c098200Yq2 = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq2);
                    obj = c098200Yq2;
                }
                boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
                Object obj2 = obj;
                if (zM7isFailureimpl) {
                    obj2 = null;
                }
                str5 = (String) obj2;
            }
        }
        if (z || z2) {
            C1065120dp8.LIZJ(C1065120dp8.LIZ, strLIZ, "error_miss_param", null, Boolean.FALSE, Boolean.valueOf(z), Boolean.valueOf(z2), null, 136);
        }
        String strLIZJ = AnonymousClass1440.LIZJ();
        if (strLIZJ.length() <= 0) {
            strLIZJ = null;
        }
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("amp_extra", str));
        if (str4 != null && str4.length() != 0) {
            mapLJIIJ.put("deep_link_value", str4);
        }
        Lemon8CustomParamsToAFField lemon8CustomParamsToAFField = (Lemon8CustomParamsToAFField) C1065210dpH.LIZIZ.getValue();
        if (!lemon8CustomParamsToAFField.sourceList.contains(strLIZ)) {
            linkedHashMap = new LinkedHashMap();
            strArr = null;
        } else {
            ConcurrentHashMap concurrentHashMapLIZ = C178200mK.LIZ(str);
            if (concurrentHashMapLIZ != null) {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(concurrentHashMapLIZ);
                ArrayList arrayList = new ArrayList();
                List<String> list = lemon8CustomParamsToAFField.afParams;
                int size = list.size();
                List<String> list2 = lemon8CustomParamsToAFField.customFields;
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                if (!lemon8CustomParamsToAFField.afParamsMaxLength.isEmpty()) {
                    iIntValue = ((Number) ListProtector.get(lemon8CustomParamsToAFField.afParamsMaxLength, 0)).intValue();
                } else {
                    iIntValue = 100;
                }
                int i = 0;
                for (String str7 : list2) {
                    Object obj3 = linkedHashMap3.get(str7);
                    if (obj3 != null) {
                        String strLIZIZ = C178200mK.LIZIZ(C2097908Jt.LIZJ(new Pair(str7, obj3)));
                        if (strLIZIZ != null) {
                            length = strLIZIZ.length();
                        } else {
                            length = 101;
                        }
                        if (length <= iIntValue) {
                            linkedHashMap4.put(str7, obj3);
                            String strLIZIZ2 = C178200mK.LIZIZ(linkedHashMap4);
                            if (strLIZIZ2 != null) {
                                length2 = strLIZIZ2.length();
                            } else {
                                length2 = 0;
                            }
                            if (length2 > iIntValue) {
                                linkedHashMap4.remove(str7);
                                arrayList.add(new LinkedHashMap(linkedHashMap4));
                                linkedHashMap4.clear();
                                if (i >= size - 1) {
                                    break;
                                }
                                i++;
                                linkedHashMap4.put(str7, obj3);
                                if (i < lemon8CustomParamsToAFField.afParamsMaxLength.size()) {
                                    iIntValue = ((Number) ListProtector.get(lemon8CustomParamsToAFField.afParamsMaxLength, i)).intValue();
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                if (!linkedHashMap4.isEmpty()) {
                    arrayList.add(new LinkedHashMap(linkedHashMap4));
                }
                ArrayList arrayList2 = new ArrayList();
                int i2 = 0;
                for (Object obj4 : arrayList) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        Map map2 = (Map) obj4;
                        if (i2 < list.size()) {
                            Object obj5 = ListProtector.get(list, i2);
                            String strLIZIZ3 = C178200mK.LIZIZ(map2);
                            if (strLIZIZ3 == null) {
                                strLIZIZ3 = "";
                            }
                            arrayList2.add(new Pair(obj5, strLIZIZ3));
                        }
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                strArr = null;
                linkedHashMap = C2097608Jq.LJIILLIIL(arrayList2);
            } else {
                strArr = null;
                linkedHashMap = new LinkedHashMap();
            }
        }
        mapLJIIJ.putAll(linkedHashMap);
        String strLIZLLL = C08JS.LIZLLL(mapLJIIJ);
        C313290CPv.LIZ.getClass();
        C313290CPv.LIZIZ.reportAppsflyerClick(2, System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT), 1, C1065200dpG.LIZ().lemon8AppId, C1065200dpG.LIZ().lemon8AppName, strLIZ, C1603330rpD.LIZIZ.LJI("other"), strLIZJ, strLIZLLL).LJJIJIIJI(C11S5.LIZ()).LJJ(C11S5.LIZ()).LIZ(new InterfaceC19474811He<Unit>() { // from class: X.0dpE
            @Override // X.InterfaceC19474811He
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
            }

            @Override // X.InterfaceC19474811He
            public final void onError(Throwable th2) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[GpMiniCardOpenStrategy] scene = ");
                sbLIZ2.append(this.LL.LIZIZ.getScene());
                sbLIZ2.append(", reportOpenAppAFEvent fail ");
                sbLIZ2.append(th2.getLocalizedMessage());
                Logger.e("Lemon8AppIntro", C2188811AlT.LIZIZ(sbLIZ2));
            }

            @Override // X.InterfaceC19474811He
            public final /* bridge */ /* synthetic */ void onSuccess(Unit unit) {
            }
        });
        Intent intent = this.LIZ;
        C1065120dp8.LIZ.getClass();
        intent.setData(UriProtector.parse(C1065120dp8.LIZIZ(strLIZ, str, str3, str5)));
        try {
            ISandboxService iSandboxServiceLIZ = C824400WVq.LIZ();
            if (iSandboxServiceLIZ != null) {
                iSandboxServiceLIZ.appendDataFlowId(this.LIZ, 1207962113);
            }
            Intent intent2 = this.LIZ;
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent2, "Activity_startActivityForResult_2");
            C1701330uNH.LIZ(intent2, activity);
            C2204961BRm.LJIIZILJ(0, activity, intent2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOatbpDAkjurH+WqEV2PXjx93UPQBTJ8PlKhx1ORIxfvlln7HJiqqqmvALo=", strArr));
            this.LIZJ.LIZIZ();
            sbLIZ = C2188811AlT.LIZ();
            try {
                sbLIZ.append("[GpMiniCardOpenStrategy] scene = ");
                sbLIZ.append(this.LIZIZ.getScene());
                sbLIZ.append(", tryOpenGooglePlayMiniCard successfully}");
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            Logger.d("Lemon8AppIntro", C2188811AlT.LIZIZ(sbLIZ));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th4) {
            th = th4;
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            this.LIZJ.LIZ();
            C1065120dp8 c1065120dp8 = C1065120dp8.LIZ;
            String message = thM5exceptionOrNullimpl.getMessage();
            if (message != null) {
                str2 = message;
            }
            C1065120dp8.LIZJ(c1065120dp8, strLIZ, "error_open_minicard", str2, null, null, null, null, 240);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[GpMiniCardOpenStrategy] scene = ");
            sbLIZ2.append(this.LIZIZ.getScene());
            sbLIZ2.append(", tryOpenGooglePlayMiniCard: failed cause ");
            sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
            Logger.d("Lemon8AppIntro", C2188811AlT.LIZIZ(sbLIZ2));
            C2344809Gs.LJI(thM5exceptionOrNullimpl);
        }
    }

    public C1065160dpC(Intent intent, InterfaceC1065250dpL interfaceC1065250dpL, InterfaceC1065240dpK interfaceC1065240dpK) {
        this.LIZ = intent;
        this.LIZIZ = interfaceC1065250dpL;
        this.LIZJ = interfaceC1065240dpK;
    }
}
