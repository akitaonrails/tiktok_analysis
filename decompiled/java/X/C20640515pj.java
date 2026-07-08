package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.PassThroughMessage;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;

/* JADX INFO: renamed from: X.15pj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20640515pj {
    public static boolean LIZ(InnerPushMessage innerPushMessage) {
        PassThroughMessage passThroughMessage;
        Object c098200Yq;
        if (innerPushMessage.getProtocol() != 2) {
            return false;
        }
        Serializable payload = innerPushMessage.getPayload();
        if (payload instanceof PassThroughMessage) {
            passThroughMessage = (PassThroughMessage) payload;
            if (passThroughMessage != null) {
                passThroughMessage.setRid(innerPushMessage.getRid());
            }
        } else {
            passThroughMessage = null;
        }
        if (passThroughMessage != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dispatch pass-through message, type=");
            sbLIZ.append(passThroughMessage.type);
            sbLIZ.append(", message=");
            sbLIZ.append(innerPushMessage);
            C19290510dT.LIZLLL("PassThroughHandler", C2188811AlT.LIZIZ(sbLIZ));
            CopyOnWriteArraySet<InterfaceC20640615pk> copyOnWriteArraySet = (CopyOnWriteArraySet) ((ConcurrentHashMap) C20641815pw.LIZIZ.getValue()).get(Integer.valueOf(passThroughMessage.type));
            if (copyOnWriteArraySet != null) {
                for (InterfaceC20640615pk interfaceC20640615pk : copyOnWriteArraySet) {
                    try {
                        innerPushMessage.getFrom();
                        interfaceC20640615pk.LIZ();
                        c098200Yq = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    if (thM5exceptionOrNullimpl != null) {
                        C19290510dT.LIZJ("PassThroughHandler", "dispatch error", thM5exceptionOrNullimpl);
                    }
                }
                return true;
            }
            return true;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("receive invalid pass-through message, message=");
        sbLIZ2.append(innerPushMessage);
        C19290510dT.LIZIZ("PassThroughHandler", C2188811AlT.LIZIZ(sbLIZ2));
        return true;
    }
}
