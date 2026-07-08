package X;

import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS384S0200000_18;

/* JADX INFO: renamed from: X.0hOi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1202500hOi extends AbstractC1202510hOj {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        View view;
        InterfaceC1202520hOk interfaceC1202520hOk = (InterfaceC1202520hOk) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        LinkedHashMap linkedHashMap = null;
        if (interfaceC634840OvC != null && (view = interfaceC634840OvC.getView()) != null) {
            C1202430hOb c1202430hOb = C1202430hOb.LIZ;
            String scene = interfaceC1202520hOk.getScene();
            Map<String, Object> mobParams = interfaceC1202520hOk.getMobParams();
            if (mobParams != null) {
                linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(mobParams.size()));
                Iterator<T> it2 = mobParams.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                }
            }
            AwS384S0200000_18 awS384S0200000_18 = new AwS384S0200000_18(completionBlock, (CompletionBlock<InterfaceC1202530hOl>) this, (C1202500hOi) 174);
            c1202430hOb.getClass();
            C1202430hOb.LIZIZ(scene, view, linkedHashMap, awS384S0200000_18);
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "CheckLsComplianceToast get wrong view", null, 4);
    }
}
