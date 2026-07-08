package X;

import Y.ARunnableS0S2300000_18;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenDataAbility;
import com.bytedance.sdk.xbridge.protocol.impl.communication.ravendata.RavenData;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0hEZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1196210hEZ extends AbstractC1196220hEa {
    public final BPEAHandler LLILLL = new BPEAHandler(Looper.getMainLooper());
    public InterfaceC801410VcB LLILZ;

    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final void release() {
        String containerID;
        IRavenDataAbility iRavenDataAbility;
        C1059860dge c1059860dge;
        InterfaceC1076710e7p interfaceC1076710e7p;
        super.release();
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC == null || (containerID = interfaceC634840OvC.getContainerID()) == null) {
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        Object obj = null;
        if (interfaceC634840OvC2 != null && (c1059860dge = (C1059860dge) interfaceC634840OvC2.LIZIZ(C1059860dge.class)) != null && (interfaceC1076710e7p = (InterfaceC1076710e7p) c1059860dge.LIZ(InterfaceC1076710e7p.class)) != null) {
            obj = interfaceC1076710e7p.get("raven_data_center");
        }
        if (!(obj instanceof IRavenDataAbility) || (iRavenDataAbility = (IRavenDataAbility) obj) == null) {
            C1093504Pl.LIZ.remove(containerID);
            return;
        }
        ConcurrentHashMap<String, Set<String>> concurrentHashMapRemove = C1093504Pl.LIZ.remove(containerID);
        if (concurrentHashMapRemove != null) {
            for (Map.Entry<String, Set<String>> entry : concurrentHashMapRemove.entrySet()) {
                String key = entry.getKey();
                Iterator<T> it2 = entry.getValue().iterator();
                while (it2.hasNext()) {
                    try {
                        iRavenDataAbility.Df2(key, (String) it2.next());
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
            }
        }
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        final String containerID;
        Object obj;
        IRavenDataAbility iRavenDataAbility;
        Set<String> setPutIfAbsent;
        ConcurrentHashMap<String, Set<String>> concurrentHashMapPutIfAbsent;
        C1059860dge c1059860dge;
        InterfaceC1076710e7p interfaceC1076710e7p;
        final String key = ((InterfaceC1196290hEh) xBaseParamModel).getKey();
        if (a0.LJJJIL(key)) {
            C2382909Vj.LIZ(completionBlock, -3, "key is blank", null, 4);
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (containerID = interfaceC634840OvC.getContainerID()) != null && containerID.length() != 0) {
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null && (c1059860dge = (C1059860dge) interfaceC634840OvC2.LIZIZ(C1059860dge.class)) != null && (interfaceC1076710e7p = (InterfaceC1076710e7p) c1059860dge.LIZ(InterfaceC1076710e7p.class)) != null) {
                obj = interfaceC1076710e7p.get("raven_data_center");
            } else {
                obj = null;
            }
            if ((obj instanceof IRavenDataAbility) && (iRavenDataAbility = (IRavenDataAbility) obj) != null) {
                C1161780gL2 c1161780gL2 = new C1161780gL2(key, this, containerID, completionBlock) { // from class: X.0hEe
                    public final /* synthetic */ String LIZJ;
                    public final /* synthetic */ C1196210hEZ LIZLLL;
                    public final /* synthetic */ String LJ;
                    public final /* synthetic */ CompletionBlock<InterfaceC1196240hEc> LJFF;

                    @Override // X.C1161780gL2
                    public final void LIZ(RavenData<Object> ravenData) {
                        C786410Ut5.LJJZZIII(this.LIZLLL.LLILLL, new ARunnableS0S2300000_18(ravenData, this.LJFF, this, this.LJ, this.LIZJ, 0));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(key, UUID.randomUUID().toString());
                        this.LIZJ = key;
                        this.LIZLLL = this;
                        this.LJ = containerID;
                        this.LJFF = completionBlock;
                    }
                };
                iRavenDataAbility.kU0(key, c1161780gL2);
                String str = c1161780gL2.LIZIZ;
                ConcurrentHashMap<String, ConcurrentHashMap<String, Set<String>>> concurrentHashMap = C1093504Pl.LIZ;
                ConcurrentHashMap<String, Set<String>> concurrentHashMap2 = concurrentHashMap.get(containerID);
                if (concurrentHashMap2 == null && (concurrentHashMapPutIfAbsent = concurrentHashMap.putIfAbsent(containerID, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
                    concurrentHashMap2 = concurrentHashMapPutIfAbsent;
                }
                ConcurrentHashMap<String, Set<String>> concurrentHashMap3 = concurrentHashMap2;
                Set<String> setNewKeySet = concurrentHashMap3.get(key);
                if (setNewKeySet == null && (setPutIfAbsent = concurrentHashMap3.putIfAbsent(key, (setNewKeySet = ConcurrentHashMap.newKeySet()))) != null) {
                    setNewKeySet = setPutIfAbsent;
                }
                setNewKeySet.add(str);
                InterfaceC1196240hEc interfaceC1196240hEc = (InterfaceC1196240hEc) C1909107dp.LIZJ(InterfaceC1196240hEc.class, containerID);
                interfaceC1196240hEc.setSessionId(c1161780gL2.LIZIZ);
                interfaceC1196240hEc.setPhase("subscribed");
                interfaceC1196240hEc.setKey(key);
                interfaceC1196240hEc.setTimestamp(null);
                interfaceC1196240hEc.setData(null);
                completionBlock.onSuccess(interfaceC1196240hEc, "subscribed");
                return;
            }
            C2382909Vj.LIZ(completionBlock, 0, "ravenDataCenter is null (not injected)", null, 4);
            return;
        }
        C2382909Vj.LIZ(completionBlock, -3, "containerId is null", null, 4);
    }

    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final void realHandle(Map<String, ? extends Object> map, InterfaceC801410VcB interfaceC801410VcB, EnumC1063300dmC enumC1063300dmC) {
        this.LLILZ = interfaceC801410VcB;
        super.realHandle(map, interfaceC801410VcB, enumC1063300dmC);
    }
}
