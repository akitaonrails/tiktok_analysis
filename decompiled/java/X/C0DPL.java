package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0DPL, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DPL extends C0DPM {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Object c098200Yq;
        String containerID;
        String containerID2;
        Object obj;
        String str;
        C0DPO c0dpo = (C0DPO) xBaseParamModel;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            for (String str2 : c0dpo.getAwemeIDs()) {
                C651640PhC.LIZIZ.getClass();
                Map map = (Map) ((Map) C651640PhC.LJ.getValue()).get(str2);
                if (map != null && !map.isEmpty()) {
                    arrayList2.add(map);
                } else {
                    Aweme awemeLJFF = C651640PhC.LJFF(str2);
                    if (awemeLJFF != null) {
                        C1227904rF.LIZ.getClass();
                        arrayList.add((Map) C1227904rF.LIZLLL().LJIIIIZZ(C1741890vQh.LJIIIIZZ(awemeLJFF), new TypeToken<Map<String, ? extends Object>>() { // from class: X.00We
                        }.getType()));
                    }
                }
            }
            C1529880puk c1529880puk = SparkContext.Companion;
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            } else {
                containerID = null;
            }
            c1529880puk.getClass();
            C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
            C647380PaK.LJIIIIZZ.getClass();
            List<Map> listLJIIIIZZ = C647380PaK.LJIIIIZZ(c1537480q70LIZIZ, arrayList);
            if (!(listLJIIIIZZ instanceof List)) {
                listLJIIIIZZ = null;
            }
            if (listLJIIIIZZ != null) {
                for (Map map2 : listLJIIIIZZ) {
                    if (map2 != null) {
                        obj = map2.get("aid");
                    } else {
                        obj = null;
                    }
                    if (!(obj instanceof String) || (str = (String) obj) == null) {
                        str = "";
                    }
                    if (!a0.LJJJIL(str)) {
                        C651640PhC.LIZIZ.getClass();
                        ((Map) C651640PhC.LJ.getValue()).put(str, map2);
                    }
                    arrayList2.add(map2);
                }
            }
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID2 = interfaceC634840OvC2.getContainerID();
            } else {
                containerID2 = null;
            }
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C0DPN.class, containerID2);
            ((C0DPN) xBaseModelLIZJ).setAwemes(arrayList2);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            String message = thM5exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "fetch aweme fail";
            }
            C2382909Vj.LIZ(completionBlock, -1, message, null, 4);
        }
    }
}
