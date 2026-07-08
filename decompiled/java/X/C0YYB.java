package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0YYB, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YYB extends AbstractC875930YXv {
    public final C0YYC LIZJ(C869590Y9l c869590Y9l) {
        String containerID;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        C0YYC c0yyc = (C0YYC) C1909107dp.LIZJ(C0YYC.class, containerID);
        c0yyc.setContent(c869590Y9l.getContent());
        Map<String, String> ext = c869590Y9l.getExt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(ext.size()));
        Iterator<T> it2 = ext.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        c0yyc.setExt(linkedHashMap);
        c0yyc.setConversationShortId(String.valueOf(c869590Y9l.getConversationShortId()));
        c0yyc.setConversationType(Integer.valueOf(c869590Y9l.getConversationType()));
        c0yyc.setCreatedAt(Long.valueOf(c869590Y9l.getCreatedAt()));
        Map<String, String> localExt = c869590Y9l.getLocalExt();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(localExt.size()));
        Iterator<T> it3 = localExt.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it3.next();
            linkedHashMap2.put(entry2.getKey(), entry2.getValue());
        }
        c0yyc.setLocalExt(linkedHashMap2);
        c0yyc.setMsgId(C876050YYh.LJFF(c869590Y9l.getMsgId()));
        c0yyc.setMsgStatus(Integer.valueOf(C876050YYh.LJ(c869590Y9l.getMsgStatus())));
        c0yyc.setMsgType(Integer.valueOf(c869590Y9l.getMsgType()));
        c0yyc.setOrderInConversation(String.valueOf(c869590Y9l.getOrderIndex()));
        c0yyc.setIndexInConversation(String.valueOf(c869590Y9l.getIndex()));
        c0yyc.setSender(String.valueOf(c869590Y9l.getSender()));
        c0yyc.setUuid(c869590Y9l.getUuid());
        return c0yyc;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C0YYA c0yya = (C0YYA) xBaseParamModel;
        C876050YYh.LIZ(this, completionBlock, c0yya.getTenantId(), c0yya.getContainerId(), "", new C914200Zti(c0yya, this, 0));
    }
}
