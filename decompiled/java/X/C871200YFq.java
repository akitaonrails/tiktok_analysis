package X;

import com.bytedance.im.core.proto.MessageBody;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS6S0201100_14;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0YFq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C871200YFq implements C0Y66, InterfaceC868710Y6b {
    public final C0YEM LIZ;
    public final InterfaceC864790XwD LIZIZ;
    public final C0Y5R LIZJ;
    public final C08I6<String, C0Y8T> LIZLLL;
    public final CopyOnWriteArraySet<String> LJ;
    public final Set<C0Y9C> LJFF;
    public C0YG2 LJI;
    public final C01GW LJII;
    public final Map<String, Boolean> LJIIIIZZ;
    public boolean LJIIIZ;
    public final C23119094b LJIIJ;
    public final C054G LJIIJJI;
    public final C01GW LJIIL;

    @Override // X.C0Y66, X.InterfaceC868710Y6b
    public final void LIZLLL() {
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshWhenColdStart reason = ");
        sbLIZ.append(0);
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "MessageRequestManager", C2188811AlT.LIZIZ(sbLIZ), 4);
        if (this.LJIIIZ) {
            C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "MessageRequestManager", "loadForColdStart = true, just return", 4);
        } else {
            C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "MessageRequestManager", "loadAllConvs", 4);
            C23250099c.LIZLLL(this.LJIIJJI, null, null, new C871210YFr(this, null), 3);
        }
    }

    public final C871250YFv LJIJJLI() {
        return (C871250YFv) this.LJII.getValue();
    }

    public final void LJJIII() {
        C23250099c.LIZLLL(this.LJIIJJI, null, null, new C871220YFs(this, null), 3);
    }

    @Override // X.InterfaceC868710Y6b
    public final List<String> LJII() {
        return C13LP.LLIIII(LJIJJLI().LIZ.keySet());
    }

    @Override // X.InterfaceC868710Y6b
    public final int LJIIZILJ() {
        return LJIJJLI().LIZ.size();
    }

    public C871200YFq(C0YEM c0yem) {
        CoroutineContext c2232408os;
        this.LIZ = c0yem;
        InterfaceC864790XwD interfaceC864790XwDLJIIZILJ = c0yem.LJIIZILJ();
        this.LIZIZ = interfaceC864790XwDLJIIZILJ;
        this.LIZJ = interfaceC864790XwDLJIIZILJ.LIZIZ();
        this.LIZLLL = new C08I6<>(c0yem.LJIIIZ().LJJIFFI);
        this.LJ = new CopyOnWriteArraySet<>();
        this.LJFF = new CopyOnWriteArraySet();
        this.LJII = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1649));
        this.LJIIIIZZ = new ConcurrentHashMap();
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        this.LJIIJ = c23119094bLIZ;
        if (c0yem.LJIIIZ().LJJLIIIIJ.LJJ) {
            c2232408os = new C2232408os(C786410Ut5.h4());
        } else {
            c2232408os = C0PEM.LIZJ;
        }
        this.LJIIJJI = C2296808zG.LIZ(c2232408os.plus(c23119094bLIZ));
        this.LJIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1650));
        C868780Y6i.LJIILJJIL(c0yem.LIZLLL(), "MessageRequestManager", "init, start observe conversation list model", 4);
    }

    @Override // X.C0Y66
    public final C0Y8T LIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        C0Y8T c0y8tLIZIZ = this.LIZLLL.LIZIZ(str);
        if (c0y8tLIZIZ != null) {
            return c0y8tLIZIZ;
        }
        for (C0Y9C c0y9c : (CopyOnWriteArraySet) this.LJFF) {
            C0Y8T c0y8t = (C0Y8T) ((ConcurrentHashMap) c0y9c.LLILZIL).get(str);
            if (c0y8t != null) {
                C868780Y6i c868780Y6iLIZLLL = c0y9c.LL.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getConversation id = ");
                sbLIZ.append(str);
                sbLIZ.append(", res = ");
                sbLIZ.append(c0y8t);
                C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "MessageRequestConversationModel", C2188811AlT.LIZIZ(sbLIZ), 4);
                this.LIZLLL.LIZLLL(str, c0y8t);
                return c0y8t;
            }
        }
        return null;
    }

    @Override // X.C0Y66
    public final void LIZIZ(C0Y8T c0y8t) {
        LJJIIJ(c0y8t);
        LJJIII();
    }

    @Override // X.C0Y66, X.InterfaceC868710Y6b
    public final void LIZJ(C0YG2 c0yg2) {
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerMessageRequestDataObserver observer = ");
        sbLIZ.append(c0yg2);
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "MessageRequestManager", C2188811AlT.LIZIZ(sbLIZ), 4);
        this.LJI = c0yg2;
    }

    @Override // X.C0Y66
    public final void LJFF(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            this.LIZLLL.LJ(str);
            this.LJ.remove(str);
            LJIJJLI().LIZIZ(str);
            C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onBatchDeleteConversations: convId = ");
            sbLIZ.append(str);
            C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "MessageRequestManager", C2188811AlT.LIZIZ(sbLIZ), 4);
        }
        for (C0Y9C c0y9c : (CopyOnWriteArraySet) this.LJFF) {
            c0y9c.getClass();
            for (String str2 : list) {
                C868780Y6i c868780Y6iLIZLLL2 = c0y9c.LL.LIZLLL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onBatchDeleteConversations: type = ");
                sbLIZ2.append(c0y9c.LLILLJJLI);
                sbLIZ2.append(", convId = ");
                sbLIZ2.append(str2);
                C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL2, "MessageRequestConversationModel", C2188811AlT.LIZIZ(sbLIZ2), 4);
                ((ConcurrentHashMap) c0y9c.LLILZIL).remove(str2);
            }
            Iterator it2 = ((CopyOnWriteArraySet) c0y9c.LLIZ).iterator();
            while (it2.hasNext()) {
                ((C0Y9E) it2.next()).LIZ(list, false);
            }
        }
        LJJIII();
    }

    @Override // X.InterfaceC868710Y6b
    public final boolean LJI(C869590Y9l c869590Y9l) {
        Map<String, String> ext;
        C0YEM c0yem = this.LIZ;
        if (c869590Y9l == null) {
            return false;
        }
        String string = Long.toString(c0yem.getUid());
        Map<String, String> ext2 = c869590Y9l.getExt();
        if ((ext2 == null || !string.equals(ext2.get("stranger"))) && ((ext = c869590Y9l.getExt()) == null || !string.equals(ext.get("filtered")))) {
            return false;
        }
        return true;
    }

    @Override // X.C0Y66
    public final void LJIIIZ(List<C0Y8T> list) {
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            LJJIIJ((C0Y8T) it2.next());
        }
        LJJIII();
    }

    @Override // X.C0Y66
    public final void LJIIJ(C0Y8T c0y8t) {
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateMemoryConversation, convId = ");
        sbLIZ.append(c0y8t.getConversationId());
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "MessageRequestManager", C2188811AlT.LIZIZ(sbLIZ), 4);
        LIZIZ(c0y8t);
    }

    @Override // X.C0Y66
    public final boolean LJIIJJI(MessageBody messageBody) {
        if (messageBody != null) {
            Integer num = messageBody.message_type;
            int value = EnumC868450Y5b.MESSAGE_TYPE_MODE_CHANGE.getValue();
            if (num != null && num.intValue() == value) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C0Y66
    public final C0Y8T LJIILIIL(long j) {
        LinkedHashMap linkedHashMap;
        Object next;
        Object next2;
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getConversationByShortId, id = ");
        sbLIZ.append(j);
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "MessageRequestManager", C2188811AlT.LIZIZ(sbLIZ), 4);
        if (j <= 0) {
            return null;
        }
        C08I6<String, C0Y8T> c08i6 = this.LIZLLL;
        synchronized (c08i6) {
            linkedHashMap = new LinkedHashMap(c08i6.LIZ);
        }
        Iterator it2 = linkedHashMap.values().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((C0Y8T) next).getConversationShortId() == j) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C0Y8T c0y8t = (C0Y8T) next;
        if (c0y8t != null) {
            return c0y8t;
        }
        for (C0Y9C c0y9c : (CopyOnWriteArraySet) this.LJFF) {
            Iterator it3 = ((ConcurrentHashMap) c0y9c.LLILZIL).values().iterator();
            while (true) {
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (((C0Y8T) next2).getConversationShortId() == j) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            C0Y8T c0y8t2 = (C0Y8T) next2;
            if (c0y8t2 != null) {
                C868780Y6i c868780Y6iLIZLLL2 = c0y9c.LL.LIZLLL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("getConversation id = ");
                sbLIZ2.append(j);
                sbLIZ2.append(", res = ");
                sbLIZ2.append(c0y8t2);
                C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL2, "MessageRequestConversationModel", C2188811AlT.LIZIZ(sbLIZ2), 4);
                this.LIZLLL.LIZLLL(c0y8t2.getConversationId(), c0y8t2);
                return c0y8t2;
            }
        }
        return null;
    }

    @Override // X.C0Y66
    public final void LJIILL(C0Y9C c0y9c) {
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerMessageRequestModel: ");
        sbLIZ.append(c0y9c.LLILLJJLI);
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "MessageRequestManager", C2188811AlT.LIZIZ(sbLIZ), 4);
        ((CopyOnWriteArraySet) this.LJFF).add(c0y9c);
    }

    @Override // X.C0Y66
    public final boolean LJIILLIIL(C0Y8T c0y8t) {
        if (!c0y8t.isStranger() || this.LIZ.LJIIIZ().LJIJJLI.LIZJ()) {
            if (c0y8t.isRisky() && this.LIZ.LJIIIZ().LJIJJLI.LJFF()) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // X.C0Y66
    public final void LJIJ(C0Y9C c0y9c) {
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unregisterMessageRequestModel: ");
        sbLIZ.append(c0y9c.LLILLJJLI);
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "MessageRequestManager", C2188811AlT.LIZIZ(sbLIZ), 4);
        ((CopyOnWriteArraySet) this.LJFF).remove(c0y9c);
    }

    @Override // X.InterfaceC868710Y6b
    public final List<C0Y9G> LJIJI(EnumC871430YGn enumC871430YGn) {
        return C13LP.LLIIII(LJIJJ(enumC871430YGn).values());
    }

    public final Map<String, C0Y9G> LJIJJ(EnumC871430YGn enumC871430YGn) {
        C871250YFv c871250YFvLJIJJLI = LJIJJLI();
        if (c871250YFvLJIJJLI.LIZIZ) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ((ConcurrentHashMap) c871250YFvLJIJJLI.LIZJ).get(enumC871430YGn);
            if (concurrentHashMap == null) {
                return C2097608Jq.LJ();
            }
            return concurrentHashMap;
        }
        Map<String, C0Y9G> map = c871250YFvLJIJJLI.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C0Y9G> entry : map.entrySet()) {
            if (C0YG0.LIZ(entry.getValue(), enumC871430YGn)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJI(X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C871280YFy
            if (r0 == 0) goto Laa
            r4 = r8
            X.0YFy r4 = (X.C871280YFy) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Laa
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r6 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r2 = 1
            if (r0 == 0) goto L98
            if (r0 != r2) goto Lb1
            long r0 = r4.LL
            X.C155000ia.LIZIZ(r6)
        L24:
            X.0YaB r6 = (X.C876610YaB) r6
            X.0YEM r2 = r7.LIZ
            X.0Y6i r5 = r2.LIZLLL()
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()
            java.lang.String r2 = "notifyMessageRequestDataUpdate\n messageRequestData = "
            r3.append(r2)
            r3.append(r6)
            java.lang.String r2 = " notify update"
            r3.append(r2)
            java.lang.String r4 = X.C2188811AlT.LIZIZ(r3)
            r3 = 4
            java.lang.String r2 = "MessageRequestManager"
            X.C868780Y6i.LJIILJJIL(r5, r2, r4, r3)
            X.0YG2 r2 = r7.LJI
            if (r2 == 0) goto L4e
            r2.xf0(r6)
        L4e:
            X.0YEM r2 = r7.LIZ
            X.0XwD r2 = r2.LJIIZILJ()
            X.0Y8y r2 = r2.LJFF()
            X.0YLL r3 = r2.getEventTracker()
            r2 = 1008981770(0x3c23d70a, float:0.01)
            boolean r2 = r3.LIZJ(r2)
            if (r2 == 0) goto L95
            X.0YEM r2 = r7.LIZ
            X.0YJ9 r4 = new X.0YJ9
            r4.<init>(r2)
            java.lang.String r2 = "new_message_request_update_conversation_cost"
            r4.LIZJ(r2)
            X.0YFv r2 = r7.LJIJJLI()
            java.util.Map<java.lang.String, X.0Y9G> r2 = r2.LIZ
            int r2 = r2.size()
            java.lang.Integer r3 = X.C2286608xc.LJ(r2)
            java.lang.String r2 = "message_request_count"
            r4.LIZ(r3, r2)
            long r2 = android.os.SystemClock.uptimeMillis()
            long r2 = r2 - r0
            java.lang.Long r1 = X.C2286608xc.LJFF(r2)
            java.lang.String r0 = "cost_time"
            r4.LIZ(r1, r0)
            r4.LIZLLL()
        L95:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L98:
            X.C155000ia.LIZIZ(r6)
            long r0 = android.os.SystemClock.uptimeMillis()
            r4.LL = r0
            r4.LLILZ = r2
            java.lang.Object r6 = r7.LJJII(r4)
            if (r6 != r3) goto L24
            return r3
        Laa:
            X.0YFy r4 = new X.0YFy
            r4.<init>(r7, r8)
            goto L12
        Lb1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C871200YFq.LJJI(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02b0  */
    /* JADX WARN: Type inference failed for: r13v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, X.0Y9l] */
    /* JADX WARN: Type inference failed for: r20v0, types: [X.0YFq] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0180 -> B:48:0x01c4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x01a2 -> B:48:0x01c4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJII(X.InterfaceC1364105Vn<? super X.C876610YaB> r21) {
        /*
            Method dump skipped, instruction units count: 1078
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C871200YFq.LJJII(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0148 A[LOOP:2: B:33:0x0142->B:35:0x0148, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJ(X.C0Y8T r15) {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C871200YFq.LJJIIJ(X.0Y8T):void");
    }

    @Override // X.C0Y66
    public final void V4(boolean z) {
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reset， notifyDataChange: ");
        sbLIZ.append(z);
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "MessageRequestManager", C2188811AlT.LIZIZ(sbLIZ), 4);
        C23118094a.LJFF(this.LJIIJ);
        this.LJ.clear();
        this.LIZLLL.LJI(-1);
        C871250YFv c871250YFvLJIJJLI = LJIJJLI();
        c871250YFvLJIJJLI.LIZ.clear();
        if (c871250YFvLJIJJLI.LIZIZ) {
            Iterator it2 = ((ConcurrentHashMap) c871250YFvLJIJJLI.LIZJ).values().iterator();
            while (it2.hasNext()) {
                ((ConcurrentHashMap) it2.next()).clear();
            }
        }
        ((ConcurrentHashMap) this.LJIIIIZZ).clear();
        this.LJIIIZ = false;
        if (z) {
            LJJIII();
        }
    }

    @Override // X.C0Y66, X.InterfaceC868710Y6b
    public final void LJ(InterfaceC1719106oH interfaceC1719106oH, boolean z) {
        if (this.LIZ.LJIIIZ().LJJLIIIIJ.LJJ && (interfaceC1719106oH instanceof C1718606oC)) {
            Set setKeySet = ((ConcurrentHashMap) this.LJIIIIZZ).keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setKeySet) {
                if (a0.LJJIIZI((String) obj, ((C1718606oC) interfaceC1719106oH).LIZIZ, false)) {
                    arrayList.add(obj);
                }
            }
            for (Object obj2 : arrayList) {
                ((ConcurrentHashMap) this.LJIIIIZZ).put(obj2, Boolean.valueOf(((C1718606oC) interfaceC1719106oH).LIZ));
            }
        }
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("in refreshLocalStranger, loadForColdStart = ");
        sbLIZ.append(this.LJIIIZ);
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "MessageRequestManager", C2188811AlT.LIZIZ(sbLIZ), 4);
        if (!this.LJIIIZ) {
            LIZLLL();
        } else {
            if (!z) {
                return;
            }
            LJJIII();
        }
    }

    @Override // X.C0Y66
    public final void LJIIIIZZ(int i, MessageBody messageBody) {
        boolean z;
        boolean z2;
        Long l;
        Integer num;
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleStrangerTransfer, inbox = ");
        sbLIZ.append(i);
        sbLIZ.append(", convId = ");
        sbLIZ.append(messageBody.conversation_id);
        sbLIZ.append(", convShortId = ");
        sbLIZ.append(messageBody.conversation_short_id);
        sbLIZ.append(", convType = ");
        sbLIZ.append(messageBody.conversation_type);
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "MessageRequestManager", C2188811AlT.LIZIZ(sbLIZ), 4);
        String str = messageBody.conversation_id;
        if (str != null && (l = messageBody.conversation_short_id) != null && (num = messageBody.conversation_type) != null) {
            LJJIFFI(C2097908Jt.LIZJ(new Pair(str, new Pair(l, num))), null);
            return;
        }
        C868780Y6i c868780Y6iLIZLLL2 = this.LIZ.LIZLLL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("handleStrangerTransfer, some required data is null for the messageBody, conversation_id is null: ");
        boolean z3 = true;
        if (messageBody.conversation_id == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ2.append(z);
        sbLIZ2.append(", conversation_short_id is null: ");
        if (messageBody.conversation_short_id == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ2.append(z2);
        sbLIZ2.append(", conversation_type is null: ");
        if (messageBody.conversation_type != null) {
            z3 = false;
        }
        sbLIZ2.append(z3);
        sbLIZ2.append(',');
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL2, "MessageRequestManager", C2188811AlT.LIZIZ(sbLIZ2), 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJ(java.util.Map<java.lang.String, X.C0Y9G> r8, X.InterfaceC1364105Vn<? super java.util.List<X.C0Y9G>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C871270YFx
            if (r0 == 0) goto L78
            r4 = r9
            X.0YFx r4 = (X.C871270YFx) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L78
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r6 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r3 = 1
            if (r0 == 0) goto L5a
            if (r0 != r3) goto L7f
            java.lang.Object r8 = r4.LL
            java.util.Map r8 = (java.util.Map) r8
            X.C155000ia.LIZIZ(r6)
        L26:
            java.util.Map r6 = (java.util.Map) r6
            java.util.Collection r0 = r8.values()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r0.iterator()
        L35:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L7e
            java.lang.Object r2 = r4.next()
            r1 = r2
            X.0Y9G r1 = (X.C0Y9G) r1
            boolean r0 = r1.LJII
            if (r0 != 0) goto L35
            java.lang.String r0 = r1.LIZ
            java.lang.Object r1 = r6.get(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L35
            r5.add(r2)
            goto L35
        L5a:
            X.C155000ia.LIZIZ(r6)
            X.0YEM r0 = r7.LIZ
            X.0YEf r0 = r0.LJIIIZ()
            X.0Y6A r1 = r0.LJIJJLI
            java.util.Set r0 = r8.keySet()
            java.util.List r0 = X.C13LP.LLIIII(r0)
            r4.LL = r8
            r4.LLILZ = r3
            java.lang.Object r6 = r1.LJ(r0, r4)
            if (r6 != r2) goto L26
            return r2
        L78:
            X.0YFx r4 = new X.0YFx
            r4.<init>(r7, r9)
            goto L12
        L7e:
            return r5
        L7f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C871200YFq.LJJ(java.util.Map, X.05Vn):java.lang.Object");
    }

    public final synchronized void LJJIFFI(Map map, final Function1 function1) {
        final AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(536);
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            C0Y8T c0y8tLIZ = this.LIZIZ.LIZLLL().LIZ().LIZ((String) entry.getKey());
            if (c0y8tLIZ == null) {
                c0y8tLIZ = this.LIZJ.LIZIZ().LJIIJJI().LIZ((String) entry.getKey(), true);
            }
            linkedHashMap.put(entry.getKey(), c0y8tLIZ);
            if (c0y8tLIZ != null && !((Boolean) aFwS248S0000000_14.invoke(c0y8tLIZ)).booleanValue()) {
                C871250YFv c871250YFvLJIJJLI = LJIJJLI();
                if (!c871250YFvLJIJJLI.LIZ.containsKey((String) entry.getKey())) {
                }
            }
            linkedHashMap2.put(entry.getKey(), entry.getValue());
        }
        if (linkedHashMap2.isEmpty()) {
            if (function1 != null) {
                function1.invoke(new C867580Y1s(null));
            }
        } else {
            this.LIZ.LJIIJJI().LIZJ(new InterfaceC872410YKh() { // from class: X.0Y1u
                @Override // X.InterfaceC872410YKh
                public final Object LIZ() {
                    ArrayList arrayList = new ArrayList();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
                    Iterator<Map.Entry<String, Pair<Long, Integer>>> it2 = linkedHashMap2.entrySet().iterator();
                    int i = 0;
                    while (it2.hasNext()) {
                        String key = it2.next().getKey();
                        C0Y8T c0y8tLIZ2 = this.LIZIZ.LIZLLL().LIZ().LIZ(key);
                        if (c0y8tLIZ2 != null || (c0y8tLIZ2 = linkedHashMap.get(key)) != null || (c0y8tLIZ2 = this.LIZJ.LIZIZ().LJIIJJI().LIZ(key, true)) != null) {
                            if (aFwS248S0000000_14.invoke(c0y8tLIZ2).booleanValue()) {
                                C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "MessageRequestManager", "find db stranger conversation, do transfer", 4);
                                boolean zLJJJJI = this.LIZJ.LIZIZ().LJIIJJI().LJJJJI(key, true);
                                c0y8tLIZ2.setStranger(false);
                                c0y8tLIZ2.setRisky(false);
                                this.LIZIZ.LIZLLL().LIZLLL().LJJLIIIJL(c0y8tLIZ2);
                                if (!zLJJJJI) {
                                    C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("transfer db failed, id:");
                                    sbLIZ.append(key);
                                    C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "MessageRequestManager", C2188811AlT.LIZIZ(sbLIZ), 4);
                                    i++;
                                }
                            } else {
                                C868780Y6i c868780Y6iLIZLLL2 = this.LIZ.LIZLLL();
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("find db already transferred, do not transfer anymore, id:");
                                sbLIZ2.append(key);
                                C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL2, "MessageRequestManager", C2188811AlT.LIZIZ(sbLIZ2), 4);
                                arrayList.add(key);
                                linkedHashMap3.remove(key);
                            }
                        }
                        arrayList.add(key);
                    }
                    if (i > 0) {
                        C868780Y6i c868780Y6iLIZLLL3 = this.LIZ.LIZLLL();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("transfer db failed, failedTransferCount:");
                        sbLIZ3.append(i);
                        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL3, "MessageRequestManager", C2188811AlT.LIZIZ(sbLIZ3), 4);
                        Function1<C0Y7K, Unit> function12 = function1;
                        if (function12 != null) {
                            EnumC868890Y6t enumC868890Y6t = EnumC868890Y6t.DB_ERROR;
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("transfer db failed, failedTransferCount:");
                            sbLIZ4.append(i);
                            function12.invoke(new C0Y3A(enumC868890Y6t, C2188811AlT.LIZIZ(sbLIZ4), (Integer) null, 12));
                        }
                    } else {
                        Function1<C0Y7K, Unit> function13 = function1;
                        if (function13 != null) {
                            function13.invoke(new C867580Y1s(null));
                            return arrayList;
                        }
                    }
                    return arrayList;
                }
            }, new C914030ZtR(this, 13), false, this.LIZ.LJIIL().LIZJ());
        }
    }

    @Override // X.InterfaceC868710Y6b
    public final void LJIIL(List list, EnumC1477205qM enumC1477205qM, Function1 function1) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C0Y9G c0y9g = LJIJJLI().LIZ.get(obj);
            if (c0y9g != null) {
                arrayList.add(new Pair(obj, new Pair(Long.valueOf(c0y9g.LIZIZ), Integer.valueOf(c0y9g.LIZJ))));
            }
        }
        LJJIFFI(C2097608Jq.LJIILLIIL(arrayList), function1);
    }

    @Override // X.C0Y66
    public final void LJIILJJIL(int i, C0Y8T c0y8t, AwS6S0201100_14 awS6S0201100_14) {
        Map mapLIZJ;
        String conversationId = c0y8t.getConversationId();
        if (conversationId != null && (mapLIZJ = C2097908Jt.LIZJ(new Pair(conversationId, new Pair(Long.valueOf(c0y8t.getConversationShortId()), Integer.valueOf(c0y8t.getConversationType()))))) != null) {
            LJJIFFI(mapLIZJ, awS6S0201100_14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0061 -> B:11:0x0036). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIL(java.util.Map<java.lang.String, X.C0Y9G> r9, java.util.Map<java.lang.String, java.lang.Boolean> r10, X.InterfaceC1364105Vn<? super java.util.List<X.C0Y9G>> r11) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C871200YFq.LJIL(java.util.Map, java.util.Map, X.05Vn):java.lang.Object");
    }
}
