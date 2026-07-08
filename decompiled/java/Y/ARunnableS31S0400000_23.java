package Y;

import X.AbstractC1552040qUU;
import X.C0M66;
import X.C1502880pDC;
import X.C1503030pDR;
import X.C1503040pDS;
import X.C1515140pWy;
import X.C1527670prB;
import X.C1537710q7N;
import X.C1541920qEA;
import X.C1551530qTf;
import X.C1551960qUM;
import X.C1553700qXA;
import X.C1874950ytJ;
import X.C1C7U;
import X.C801490VcJ;
import X.C801550VcP;
import X.InterfaceC1503100pDY;
import X.InterfaceC1503110pDZ;
import X.InterfaceC1541990qEH;
import X.InterfaceC2106908Nf;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.content.Context;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sdk.xbridge.media.utils.AvatarUri;
import com.bytedance.sdk.xbridge.media.utils.UploadImageResponse;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.sdk.xbridge.runtime.depend.IHostNetworkDepend;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS31S0400000_23 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        IHostNetworkDepend c1515140pWy;
        IHostNetworkDepend c1515140pWy2;
        C1502880pDC c1502880pDC = C1502880pDC.LIZ;
        Map<String, Object> header = ((InterfaceC1503100pDY) this.l0).getHeader();
        c1502880pDC.getClass();
        LinkedHashMap linkedHashMapLIZIZ = C1502880pDC.LIZIZ(header);
        Map mapLIZ = C1502880pDC.LIZ(((InterfaceC1503100pDY) this.l0).getParams());
        Number paramsOption = ((InterfaceC1503100pDY) this.l0).getParamsOption();
        final CompletionBlock completionBlock = (CompletionBlock) this.l3;
        InterfaceC2106908Nf interfaceC2106908Nf = new InterfaceC2106908Nf() { // from class: X.0pDo
            @Override // X.InterfaceC2106908Nf
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC2106908Nf
            public final void LIZ(Integer num, Throwable th) {
                CompletionBlock<InterfaceC1503250pDn> completionBlock2 = completionBlock;
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                XBaseModel xBaseModelLIZLLL = C1549500qQO.LIZLLL(C13LE.LIZ(InterfaceC1503250pDn.class));
                InterfaceC1503250pDn interfaceC1503250pDn = (InterfaceC1503250pDn) xBaseModelLIZLLL;
                interfaceC1503250pDn.setUrl(interfaceC1503250pDn.getUrl());
                interfaceC1503250pDn.setClientCode(num);
                completionBlock2.onFailure(0, message, (XBaseResultModel) xBaseModelLIZLLL);
            }

            @Override // X.InterfaceC2106908Nf
            public final void LIZJ(JSONObject jSONObject, Integer num) {
                String str;
                List<String> list;
                try {
                    Gson gson = C2348609Ie.LIZ;
                    AvatarUri avatarUri = ((UploadImageResponse) GsonProtectorUtils.fromJson(C2348609Ie.LIZ, C786410Ut5.J3(jSONObject), UploadImageResponse.class)).data;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        linkedHashMap.put(next, jSONObject.get(next));
                    }
                    String str2 = null;
                    if (avatarUri == null || (list = avatarUri.urlList) == null || !(!list.isEmpty())) {
                        str = null;
                    } else {
                        str = (String) C13LP.LJJJLL(list);
                    }
                    CompletionBlock<InterfaceC1503250pDn> completionBlock2 = completionBlock;
                    XBaseModel xBaseModelLIZLLL = C1549500qQO.LIZLLL(C13LE.LIZ(InterfaceC1503250pDn.class));
                    InterfaceC1503250pDn interfaceC1503250pDn = (InterfaceC1503250pDn) xBaseModelLIZLLL;
                    interfaceC1503250pDn.setUrl(str);
                    if (avatarUri != null) {
                        str2 = avatarUri.uri;
                    }
                    interfaceC1503250pDn.setUri(str2);
                    interfaceC1503250pDn.setResponse(linkedHashMap);
                    interfaceC1503250pDn.setClientCode(num);
                    completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZLLL, "");
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        };
        if (Intrinsics.LJFF(paramsOption, 0) || Intrinsics.LJFF(paramsOption, 1)) {
            String url = ((InterfaceC1503100pDY) this.l0).getUrl();
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.l1;
            ((C1503030pDR) this.l2).getClass();
            C1874950ytJ c1874950ytJ = C1874950ytJ.LJIIL;
            if (c1874950ytJ == null || (c1515140pWy = c1874950ytJ.LJFF) == null) {
                c1515140pWy = new C1515140pWy();
            }
            C1502880pDC.LIZLLL(url, linkedHashMapLIZIZ, linkedHashMap, mapLIZ, interfaceC2106908Nf, c1515140pWy);
            return;
        }
        String url2 = ((InterfaceC1503100pDY) this.l0).getUrl();
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.l1;
        HashMap map = new HashMap();
        ((C1503030pDR) this.l2).getClass();
        C1874950ytJ c1874950ytJ2 = C1874950ytJ.LJIIL;
        if (c1874950ytJ2 == null || (c1515140pWy2 = c1874950ytJ2.LJFF) == null) {
            c1515140pWy2 = new C1515140pWy();
        }
        C1502880pDC.LIZLLL(url2, linkedHashMapLIZIZ, linkedHashMap2, map, interfaceC2106908Nf, c1515140pWy2);
    }

    public final void LIZ$1() {
        IHostNetworkDepend c1515140pWy;
        IHostNetworkDepend c1515140pWy2;
        C1502880pDC c1502880pDC = C1502880pDC.LIZ;
        Map<String, Object> header = ((InterfaceC1503110pDZ) this.l0).getHeader();
        c1502880pDC.getClass();
        LinkedHashMap linkedHashMapLIZIZ = C1502880pDC.LIZIZ(header);
        Map mapLIZ = C1502880pDC.LIZ(((InterfaceC1503110pDZ) this.l0).getParams());
        Number paramsOption = ((InterfaceC1503110pDZ) this.l0).getParamsOption();
        final CompletionBlock completionBlock = (CompletionBlock) this.l3;
        InterfaceC2106908Nf interfaceC2106908Nf = new InterfaceC2106908Nf() { // from class: X.0pDp
            @Override // X.InterfaceC2106908Nf
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC2106908Nf
            public final void LIZ(Integer num, Throwable th) {
                CompletionBlock<InterfaceC1503280pDq> completionBlock2 = completionBlock;
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                XBaseModel xBaseModelLIZLLL = C1549500qQO.LIZLLL(C13LE.LIZ(InterfaceC1503280pDq.class));
                InterfaceC1503280pDq interfaceC1503280pDq = (InterfaceC1503280pDq) xBaseModelLIZLLL;
                interfaceC1503280pDq.setUrl(interfaceC1503280pDq.getUrl());
                interfaceC1503280pDq.setClientCode(num);
                completionBlock2.onFailure(0, message, (XBaseResultModel) xBaseModelLIZLLL);
            }

            @Override // X.InterfaceC2106908Nf
            public final void LIZJ(JSONObject jSONObject, Integer num) {
                String str;
                List<String> list;
                try {
                    Gson gson = C2348609Ie.LIZ;
                    AvatarUri avatarUri = ((UploadImageResponse) GsonProtectorUtils.fromJson(C2348609Ie.LIZ, C786410Ut5.J3(jSONObject), UploadImageResponse.class)).data;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        linkedHashMap.put(next, jSONObject.get(next));
                    }
                    String str2 = null;
                    if (avatarUri == null || (list = avatarUri.urlList) == null || !(!list.isEmpty())) {
                        str = null;
                    } else {
                        str = (String) C13LP.LJJJLL(list);
                    }
                    CompletionBlock<InterfaceC1503280pDq> completionBlock2 = completionBlock;
                    XBaseModel xBaseModelLIZLLL = C1549500qQO.LIZLLL(C13LE.LIZ(InterfaceC1503280pDq.class));
                    InterfaceC1503280pDq interfaceC1503280pDq = (InterfaceC1503280pDq) xBaseModelLIZLLL;
                    interfaceC1503280pDq.setUrl(str);
                    if (avatarUri != null) {
                        str2 = avatarUri.uri;
                    }
                    interfaceC1503280pDq.setUri(str2);
                    interfaceC1503280pDq.setResponse(linkedHashMap);
                    interfaceC1503280pDq.setClientCode(num);
                    completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZLLL, "");
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        };
        if (Intrinsics.LJFF(paramsOption, 0) || Intrinsics.LJFF(paramsOption, 1)) {
            String url = ((InterfaceC1503110pDZ) this.l0).getUrl();
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.l1;
            ((C1503040pDS) this.l2).getClass();
            C1874950ytJ c1874950ytJ = C1874950ytJ.LJIIL;
            if (c1874950ytJ == null || (c1515140pWy = c1874950ytJ.LJFF) == null) {
                c1515140pWy = new C1515140pWy();
            }
            C1502880pDC.LIZLLL(url, linkedHashMapLIZIZ, linkedHashMap, mapLIZ, interfaceC2106908Nf, c1515140pWy);
            return;
        }
        String url2 = ((InterfaceC1503110pDZ) this.l0).getUrl();
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.l1;
        HashMap map = new HashMap();
        ((C1503040pDS) this.l2).getClass();
        C1874950ytJ c1874950ytJ2 = C1874950ytJ.LJIIL;
        if (c1874950ytJ2 == null || (c1515140pWy2 = c1874950ytJ2.LJFF) == null) {
            c1515140pWy2 = new C1515140pWy();
        }
        C1502880pDC.LIZLLL(url2, linkedHashMapLIZIZ, linkedHashMap2, map, interfaceC2106908Nf, c1515140pWy2);
    }

    public final void LIZ$2() {
        OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
        optionCheckUpdateParams.setChannelUpdatePriority(3);
        optionCheckUpdateParams.setEnableThrottle(false);
        optionCheckUpdateParams.setListener(new C1553700qXA((AbstractC1552040qUU) this.l0));
        try {
            C1551960qUM.LJIIIIZZ((C1551530qTf) this.l1, optionCheckUpdateParams).proceed((ArrayList) this.l2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0M66.LIZ(new ARunnableS103S0100000_3((Context) this.l3, 127));
        }
    }

    public static final void run$0(ARunnableS31S0400000_23 aRunnableS31S0400000_23) {
        boolean zLIZ;
        C1C7U.LIZ("SparkView@faa0.createKitView$1$onLoadFinish$2");
        try {
            ((SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) aRunnableS31S0400000_23.l0).LJJJI((SparkContext) aRunnableS31S0400000_23.l1, ((C1541920qEA) aRunnableS31S0400000_23.l2).LL, ((InterfaceC1541990qEH) aRunnableS31S0400000_23.l3) instanceof C1537710q7N);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SparkView@faa0.createKitView$1$onLoadFinish$2");
    }

    public static final void run$1(ARunnableS31S0400000_23 aRunnableS31S0400000_23) {
        C1527670prB c1527670prB = (C1527670prB) aRunnableS31S0400000_23.l0;
        List<? extends C801550VcP> list = (List) aRunnableS31S0400000_23.l1;
        List<? extends C801490VcJ> list2 = (List) aRunnableS31S0400000_23.l2;
        List<String> list3 = (List) aRunnableS31S0400000_23.l3;
        C1C7U.LIZ("DBServiceImplV4$updateSyncCursorAndBusiness$1@8d5d.invoke$1L");
        c1527670prB.LJJZ().LJII(list);
        c1527670prB.LJJZ().LJ(list2);
        c1527670prB.LJJZ().LJFF(list3);
        C1C7U.LIZIZ("DBServiceImplV4$updateSyncCursorAndBusiness$1@8d5d.invoke$1L");
    }

    public static final void run$2(ARunnableS31S0400000_23 aRunnableS31S0400000_23) {
        boolean zLIZ;
        C1C7U.LIZ("XUploadFileMethod@e856.handleUploadFile$1");
        try {
            aRunnableS31S0400000_23.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("XUploadFileMethod@e856.handleUploadFile$1");
    }

    public static final void run$3(ARunnableS31S0400000_23 aRunnableS31S0400000_23) {
        boolean zLIZ;
        C1C7U.LIZ("XUploadImageMethod@9ae9.handleUploadFile$1");
        try {
            aRunnableS31S0400000_23.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("XUploadImageMethod@9ae9.handleUploadFile$1");
    }

    public static final void run$4(ARunnableS31S0400000_23 aRunnableS31S0400000_23) {
        boolean zLIZ;
        C1C7U.LIZ("StudioDebugGeckoUpdateManager@57da.update$2");
        try {
            aRunnableS31S0400000_23.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StudioDebugGeckoUpdateManager@57da.update$2");
    }

    public ARunnableS31S0400000_23(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
