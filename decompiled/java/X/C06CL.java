package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06CL, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06CL extends C06CQ {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        long jLongValue;
        String containerID;
        C06CR c06cr = (C06CR) xBaseParamModel;
        String cid = c06cr.getCid();
        Number clickTimestamp = c06cr.getClickTimestamp();
        if (clickTimestamp != null) {
            jLongValue = clickTimestamp.longValue();
        } else {
            jLongValue = 0;
        }
        String enterFrom = c06cr.getEnterFrom();
        String invitationPanelSource = c06cr.getInvitationPanelSource();
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(C06CP.class);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        final C06CP c06cp = (C06CP) C1549500qQO.LIZJ(containerID, c19719912DlLIZ);
        c06cp.setClickType(c06cr.getClickType());
        c06cp.setCid(c06cr.getCid());
        c06cp.setEnterFrom(enterFrom);
        Number clickType = c06cr.getClickType();
        if (Intrinsics.LJFF(clickType, 2)) {
            C06CX c06cx = C06CX.LIZIZ;
            C06CJ c06cj = new C06CJ() { // from class: X.06CO
                @Override // X.C06CJ
                public final void LIZ(Integer num, String str) {
                    CompletionBlock<C06CP> completionBlock2 = completionBlock;
                    C06CP c06cp2 = c06cp;
                    c06cp2.setServerStatusCode(num);
                    completionBlock2.onSuccess(c06cp2, "");
                }

                @Override // X.C06CJ
                public final void LIZIZ(Integer num, String str) {
                    CompletionBlock<C06CP> completionBlock2 = completionBlock;
                    C06CP c06cp2 = c06cp;
                    c06cp2.setServerStatusCode(num);
                    completionBlock2.onSuccess(c06cp2, "");
                }
            };
            c06cx.getClass();
            C066L c066l = C066L.LIZIZ;
            long jCurrentTimeMillis = System.currentTimeMillis();
            c066l.getClass();
            ConcurrentHashMap<String, C066M> concurrentHashMap = C066L.LJ;
            if (concurrentHashMap.get(cid) == null) {
                concurrentHashMap.put(cid, new C066M(cid, enterFrom, jLongValue, jCurrentTimeMillis));
                C23250099c.LIZLLL(C066L.LIZLLL, null, null, new C066N(cid, null), 3);
            }
            C23250099c.LIZLLL(C06CX.LIZLLL, null, null, new C06CV(cid, c06cj, invitationPanelSource, null), 3);
            return;
        }
        if (!Intrinsics.LJFF(clickType, 1)) {
            return;
        }
        if (!C15546066u.LIZ()) {
            C06CM c06cm = C06CM.LIZIZ;
            C1598406Nq c1598406Nq = c06cm.LIZ;
            if (c1598406Nq == null) {
                synchronized (c06cm) {
                    c1598406Nq = c06cm.LIZ;
                    if (c1598406Nq == null) {
                        c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                        c06cm.LIZ = c1598406Nq;
                    }
                }
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(c1598406Nq.LIZ), null, null, new C066F(cid, null), 3);
        }
        C1569106Cj.LJ.getClass();
        C1569106Cj c1569106Cj = C1569106Cj.LJI;
        C06CI c06ci = new C06CI() { // from class: X.06CN
            @Override // X.C06CI
            public final void LIZIZ(Integer num) {
                CompletionBlock<C06CP> completionBlock2 = completionBlock;
                C06CP c06cp2 = c06cp;
                c06cp2.setServerStatusCode(num);
                completionBlock2.onSuccess(c06cp2, "");
            }

            @Override // X.C06CI
            public final void LIZ(Integer num, Integer num2) {
                CompletionBlock<C06CP> completionBlock2 = completionBlock;
                C06CP c06cp2 = c06cp;
                c06cp2.setServerStatusCode(num);
                c06cp2.setSource(String.valueOf(num2));
                completionBlock2.onSuccess(c06cp2, "");
            }
        };
        c1569106Cj.getClass();
        C23250099c.LIZLLL(c1569106Cj.LIZ, null, null, new C06CC(cid, c1569106Cj, jLongValue, System.currentTimeMillis(), enterFrom, c06ci, null), 3);
    }
}
