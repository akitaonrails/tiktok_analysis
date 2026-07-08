package X;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qSO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1550740qSO extends C09AY implements Function0<Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ InterfaceC1550700qSK LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1550740qSO(long j, InterfaceC1550700qSK interfaceC1550700qSK) {
        super(0);
        this.LL = j;
        this.LLILLJJLI = interfaceC1550700qSK;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ConcurrentHashMap<String, C1550720qSM> concurrentHashMap;
        C1550670qSH c1550670qSH = C1550670qSH.LIZ;
        long j = this.LL;
        InterfaceC1550700qSK interfaceC1550700qSK = this.LLILLJJLI;
        C1550730qSN c1550730qSN = C1550730qSN.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (C1549140qPo.LIZ().enabled) {
            for (String str : C1550730qSN.LIZLLL) {
                if (C1549140qPo.LIZ().aks.contains(str) && (concurrentHashMap = C1550730qSN.LIZJ.get(str)) != null) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry<String, C1550720qSM> entry : concurrentHashMap.entrySet()) {
                        String key = entry.getKey();
                        C1550720qSM value = entry.getValue();
                        if (!C1549140qPo.LIZ().skip_channel_list.contains(key) && !value.LIZIZ && !value.LJFF && value.LIZ < j) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    linkedHashMap.put(str, linkedHashMap2);
                }
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str2 = (String) entry2.getKey();
            Map map = (Map) entry2.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("....... start to compress ak: ");
            sbLIZ.append(str2);
            sbLIZ.append(" ......");
            C1553130qWF.LIZ("gecko-debug-tag-Compressor", C2188811AlT.LIZIZ(sbLIZ));
            for (Map.Entry entry3 : map.entrySet()) {
                if (C1550670qSH.LIZLLL.invoke().booleanValue()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("checkIfStopCompression return true, stop compression at ak: ");
                    sbLIZ2.append(str2);
                    sbLIZ2.append(", channel: ");
                    sbLIZ2.append((String) entry3.getKey());
                    C1553130qWF.LIZ("gecko-debug-tag-Compressor", C2188811AlT.LIZIZ(sbLIZ2));
                } else {
                    C1550670qSH.LIZIZ(str2, (String) entry3.getKey(), (C1550720qSM) entry3.getValue(), 2, interfaceC1550700qSK);
                }
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("....... end to compress ak: ");
            sbLIZ3.append(str2);
            sbLIZ3.append(" ......");
            C1553130qWF.LIZ("gecko-debug-tag-Compressor", C2188811AlT.LIZIZ(sbLIZ3));
        }
        C1553130qWF.LIZ("gecko-debug-tag-Compressor", "compressDirToZstdAsync method end");
        return Unit.LIZ;
    }
}
