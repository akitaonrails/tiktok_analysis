package X;

import com.bytedance.helios.network.NetworkComponent;
import com.bytedance.helios.network.api.service.ReplaceConfig;
import com.bytedance.helios.network.pipeline.OperationConfig;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0WyV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840730WyV {
    public static OperationConfig LIZ(k kVar) {
        Set<Map.Entry<String, k>> setEntrySet;
        String strInstallIdOrNull;
        Set<Map.Entry<String, k>> setEntrySet2;
        if (kVar == null) {
            return null;
        }
        OperationConfig operationConfig = new OperationConfig(new LinkedHashMap(), new LinkedHashMap(), new ArrayList());
        n nVarLJIILIIL = kVar.LJIILIIL();
        k kVarLJJIIZ = nVarLJIILIIL.LJJIIZ("add");
        if (kVarLJJIIZ != null && (setEntrySet2 = kVarLJJIIZ.LJIILIIL().entrySet()) != null) {
            Iterator<T> it2 = setEntrySet2.iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                Object value = entry.getValue();
                value.getClass();
                if ((value instanceof q) && (((q) entry.getValue()).LL instanceof String)) {
                    operationConfig.add.put((String) entry.getKey(), ((k) entry.getValue()).LJIL());
                }
            }
        }
        k kVarLJJIIZ2 = nVarLJIILIIL.LJJIIZ("replace");
        if (kVarLJJIIZ2 != null && (setEntrySet = kVarLJJIIZ2.LJIILIIL().entrySet()) != null) {
            Iterator<T> it3 = setEntrySet.iterator();
            while (it3.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it3.next();
                n nVarLJIILIIL2 = ((k) entry2.getValue()).LJIILIIL();
                ReplaceConfig replaceConfig = new ReplaceConfig(nVarLJIILIIL2.LJJIIZ("value").LJIL(), nVarLJIILIIL2.LJJIIZ("target").LJIL());
                if (u.LJJIIJZLJL(replaceConfig.value, e3.c, false)) {
                    String str = replaceConfig.value;
                    String strSubstring = str.substring(1, str.length());
                    if (Intrinsics.LJFF(strSubstring, "device_id")) {
                        String strDeviceIdOrNull = NetworkComponent.INSTANCE.deviceIdOrNull();
                        if (strDeviceIdOrNull != null && !a0.LJJJIL(strDeviceIdOrNull)) {
                            replaceConfig.setValue(strDeviceIdOrNull);
                        }
                    } else if (Intrinsics.LJFF(strSubstring, "install_id") && (strInstallIdOrNull = NetworkComponent.INSTANCE.installIdOrNull()) != null && !a0.LJJJIL(strInstallIdOrNull)) {
                        replaceConfig.setValue(strInstallIdOrNull);
                    }
                }
                operationConfig.replace.put((String) entry2.getKey(), replaceConfig);
            }
        }
        k kVarLJJIIZ3 = nVarLJIILIIL.LJJIIZ("remove");
        if (kVarLJJIIZ3 != null) {
            for (k kVar2 : kVarLJJIIZ3.LJIIL()) {
                kVar2.getClass();
                if (kVar2 instanceof q) {
                    q qVar = (q) kVar2;
                    if (qVar.LL instanceof String) {
                        operationConfig.remove.add(qVar.LJIL());
                    }
                }
            }
        }
        return operationConfig;
    }
}
