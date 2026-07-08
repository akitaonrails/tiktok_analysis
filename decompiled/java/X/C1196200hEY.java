package X;

import Y.ARunnableS0S2300000_18;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility;
import com.bytedance.sdk.xbridge.protocol.impl.communication.ravenevent.RavenEvent;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0hEY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1196200hEY extends AbstractC1196230hEb {
    public final BPEAHandler LLILLL = new BPEAHandler(Looper.getMainLooper());
    public InterfaceC801410VcB LLILZ;

    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final void release() {
        String containerID;
        IRavenEventAbility iRavenEventAbility;
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
            obj = interfaceC1076710e7p.get("raven_event_center");
        }
        if (!(obj instanceof IRavenEventAbility) || (iRavenEventAbility = (IRavenEventAbility) obj) == null) {
            C1093604Pm.LIZ.remove(containerID);
            return;
        }
        ConcurrentHashMap<String, Set<String>> concurrentHashMapRemove = C1093604Pm.LIZ.remove(containerID);
        if (concurrentHashMapRemove != null) {
            for (Map.Entry<String, Set<String>> entry : concurrentHashMapRemove.entrySet()) {
                String key = entry.getKey();
                Iterator<T> it2 = entry.getValue().iterator();
                while (it2.hasNext()) {
                    try {
                        iRavenEventAbility.Fk2(key, (String) it2.next());
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
        IRavenEventAbility iRavenEventAbility;
        final long jLongValue;
        Set<String> setPutIfAbsent;
        ConcurrentHashMap<String, Set<String>> concurrentHashMapPutIfAbsent;
        C1059860dge c1059860dge;
        InterfaceC1076710e7p interfaceC1076710e7p;
        InterfaceC1196280hEg interfaceC1196280hEg = (InterfaceC1196280hEg) xBaseParamModel;
        final String eventName = interfaceC1196280hEg.getEventName();
        if (a0.LJJJIL(eventName)) {
            C2382909Vj.LIZ(completionBlock, -3, "event_name is blank", null, 4);
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (containerID = interfaceC634840OvC.getContainerID()) != null && containerID.length() != 0) {
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null && (c1059860dge = (C1059860dge) interfaceC634840OvC2.LIZIZ(C1059860dge.class)) != null && (interfaceC1076710e7p = (InterfaceC1076710e7p) c1059860dge.LIZ(InterfaceC1076710e7p.class)) != null) {
                obj = interfaceC1076710e7p.get("raven_event_center");
            } else {
                obj = null;
            }
            if ((obj instanceof IRavenEventAbility) && (iRavenEventAbility = (IRavenEventAbility) obj) != null) {
                Number timestamp = interfaceC1196280hEg.getTimestamp();
                if (timestamp != null) {
                    jLongValue = timestamp.longValue();
                } else {
                    jLongValue = -1;
                }
                C1162700gMW c1162700gMW = new C1162700gMW(eventName, jLongValue, this, containerID, completionBlock) { // from class: X.0hEf
                    public final /* synthetic */ String LIZLLL;
                    public final /* synthetic */ C1196200hEY LJ;
                    public final /* synthetic */ String LJFF;
                    public final /* synthetic */ CompletionBlock<InterfaceC1196250hEd> LJI;

                    @Override // X.C1162700gMW
                    public final void LIZ(RavenEvent ravenEvent) {
                        C786410Ut5.LJJZZIII(this.LJ.LLILLL, new ARunnableS0S2300000_18(ravenEvent, this.LJI, this, this.LJFF, this.LIZLLL, 1));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(eventName, jLongValue, 2);
                        this.LIZLLL = eventName;
                        this.LJ = this;
                        this.LJFF = containerID;
                        this.LJI = completionBlock;
                    }
                };
                String strLp0 = iRavenEventAbility.Lp0(eventName, c1162700gMW);
                ConcurrentHashMap<String, ConcurrentHashMap<String, Set<String>>> concurrentHashMap = C1093604Pm.LIZ;
                ConcurrentHashMap<String, Set<String>> concurrentHashMap2 = concurrentHashMap.get(containerID);
                if (concurrentHashMap2 == null && (concurrentHashMapPutIfAbsent = concurrentHashMap.putIfAbsent(containerID, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
                    concurrentHashMap2 = concurrentHashMapPutIfAbsent;
                }
                ConcurrentHashMap<String, Set<String>> concurrentHashMap3 = concurrentHashMap2;
                Set<String> setNewKeySet = concurrentHashMap3.get(eventName);
                if (setNewKeySet == null && (setPutIfAbsent = concurrentHashMap3.putIfAbsent(eventName, (setNewKeySet = ConcurrentHashMap.newKeySet()))) != null) {
                    setNewKeySet = setPutIfAbsent;
                }
                setNewKeySet.add(strLp0);
                InterfaceC1196250hEd interfaceC1196250hEd = (InterfaceC1196250hEd) C1909107dp.LIZJ(InterfaceC1196250hEd.class, containerID);
                interfaceC1196250hEd.setSessionId(strLp0);
                interfaceC1196250hEd.setPhase("subscribed");
                interfaceC1196250hEd.setEventName(eventName);
                interfaceC1196250hEd.setTimestamp(Long.valueOf(c1162700gMW.LIZJ));
                interfaceC1196250hEd.setData(null);
                completionBlock.onSuccess(interfaceC1196250hEd, "subscribed");
                return;
            }
            C2382909Vj.LIZ(completionBlock, 0, "ravenEventCenter is null (not injected)", null, 4);
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
