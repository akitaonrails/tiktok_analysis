package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.sdk.xbridge.runtime.depend.IHostContextDepend;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.PiperData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: X.0yqD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1873030yqD extends AbstractC1873040yqE {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.0yqG] */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        IHostContextDepend iHostContextDepend;
        List<C1873100yqK> settings;
        C1531540pxQ c1531540pxQ;
        EnumC1874030yrp enumC1874030yrpValueOf;
        List<InterfaceC1873110yqL> keys = ((InterfaceC1873050yqF) xBaseParamModel).getKeys();
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<InterfaceC1873110yqL> it2 = keys.iterator();
        while (true) {
            String str = "";
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            InterfaceC1873110yqL next = it2.next();
            String key = next.getKey();
            String biz = next.getBiz();
            if (biz != null) {
                str = biz;
            }
            C1873090yqJ c1873090yqJ = EnumC1874030yrp.Companion;
            String type = next.getType();
            if (type == null) {
                type = "array";
            }
            c1873090yqJ.getClass();
            try {
                enumC1874030yrpValueOf = EnumC1874030yrp.valueOf(type.toUpperCase(Locale.US));
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                enumC1874030yrpValueOf = EnumC1874030yrp.UNSUPPORTED;
            }
            if (key.length() > 0 && enumC1874030yrpValueOf != EnumC1874030yrp.UNSUPPORTED) {
                C1873070yqH c1873070yqH = new C1873070yqH(key, enumC1874030yrpValueOf);
                c1873070yqH.LIZJ = str;
                arrayList.add(c1873070yqH);
                linkedHashSet.add(key);
            }
        }
        if (arrayList.isEmpty()) {
            C2382909Vj.LIZ(completionBlock, -3, "empty key or unsupported key type in params", null, 4);
            return;
        }
        if (linkedHashSet.size() < arrayList.size()) {
            C2382909Vj.LIZ(completionBlock, -3, "duplicate keys in params", null, 4);
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC == null || (c1531540pxQ = (C1531540pxQ) interfaceC634840OvC.LIZIZ(C1531540pxQ.class)) == null || !c1531540pxQ.LIZ(getName())) {
            z = false;
        }
        C1874950ytJ c1874950ytJ = C1874950ytJ.LJIIL;
        if (c1874950ytJ != null && (iHostContextDepend = c1874950ytJ.LIZLLL) != null && (settings = iHostContextDepend.getSettings(arrayList)) != null) {
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1873060yqG.class, null);
            ?? r4 = (InterfaceC1873060yqG) xBaseModelLIZJ;
            ?? linkedHashMap = new LinkedHashMap();
            for (C1873100yqK c1873100yqK : settings) {
                linkedHashMap.put(c1873100yqK.LIZ, c1873100yqK.LIZIZ);
            }
            if (z) {
                linkedHashMap = new PiperData((Object) linkedHashMap);
            }
            r4.setSettings(linkedHashMap);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "getSettings not implemented in host", null, 4);
    }
}
