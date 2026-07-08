package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07pk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1983007pk<Content, Value> {
    public final C1983007pk<Content, Value>.a LIZ = new a(null, null, null);

    public final void LIZIZ() {
        boolean z;
        Map<Content, C1983007pk<Content, Value>.a> map;
        Set<Map.Entry<Content, C1983007pk<Content, Value>.a>> setEntrySet;
        Map.Entry entry;
        a aVar;
        Content content;
        Content content2;
        do {
            Map<Content, C1983007pk<Content, Value>.a> map2 = this.LIZ.LIZJ;
            if (map2 == null) {
                return;
            }
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            Iterator<T> it2 = map2.values().iterator();
            z = false;
            while (it2.hasNext()) {
                a aVar2 = (a) it2.next();
                if (aVar2.LIZ != null) {
                    if (aVar2.LIZJ()) {
                        aVar2.LIZJ = null;
                    } else {
                        Map<Content, C1983007pk<Content, Value>.a> map3 = aVar2.LIZJ;
                        if (map3 != null && map3.size() == 1 && aVar2.LIZIZ == null && (map = aVar2.LIZJ) != null && (setEntrySet = map.entrySet()) != null && (entry = (Map.Entry) C13LP.LJJJJZ(setEntrySet)) != null && (aVar = (a) entry.getValue()) != null) {
                            C1983007pk<Content, Value> c1983007pk = C1983007pk.this;
                            InterfaceC1944907jb<Content> interfaceC1944907jb = aVar2.LIZ;
                            InterfaceC1944907jb<Content> interfaceC1944907jb2 = aVar.LIZ;
                            if (interfaceC1944907jb2 != null) {
                                a aVar3 = c1983007pk.new a(interfaceC1944907jb.LIZIZ(interfaceC1944907jb2), aVar.LIZIZ, aVar.LIZJ);
                                InterfaceC1944907jb<Content> interfaceC1944907jb3 = aVar2.LIZ;
                                if (interfaceC1944907jb3 != null && (content2 = interfaceC1944907jb3.getContent()) != null) {
                                    linkedList2.add(content2);
                                }
                                InterfaceC1944907jb<Content> interfaceC1944907jb4 = aVar3.LIZ;
                                if (interfaceC1944907jb4 != null && (content = interfaceC1944907jb4.getContent()) != null) {
                                    linkedList.add(new Pair(content, aVar3));
                                }
                                z = true;
                            }
                        }
                    }
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
            while (!linkedList.isEmpty()) {
                Pair pair = (Pair) linkedList.getFirst();
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
                linkedList.pollFirst();
            }
            while (!linkedList2.isEmpty()) {
                linkedHashMap.remove(linkedList2.getFirst());
                linkedList2.pollFirst();
            }
            this.LIZ.LIZJ = linkedHashMap;
        } while (z);
    }

    /* JADX INFO: renamed from: X.07pk$a */
    public final class a {
        public final InterfaceC1944907jb<Content> LIZ;
        public Value LIZIZ;
        public Map<Content, C1983007pk<Content, Value>.a> LIZJ;

        public final boolean LIZJ() {
            Object c098200Yq;
            try {
                Map<Content, C1983007pk<Content, Value>.a> map = this.LIZJ;
                boolean z = true;
                if (map != null && !map.isEmpty()) {
                    z = false;
                }
                c098200Yq = Boolean.valueOf(z);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Boolean bool = (Boolean) c098200Yq;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        public final C1983007pk<Content, Value>.a LIZIZ(InterfaceC1944907jb<Content> interfaceC1944907jb) {
            Object c098200Yq;
            Object obj = null;
            try {
                Map<Content, C1983007pk<Content, Value>.a> map = this.LIZJ;
                if (map != null) {
                    c098200Yq = (a) map.get(interfaceC1944907jb.getContent());
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            return (a) obj;
        }

        public final C1983007pk<Content, Value>.a LIZ(InterfaceC1944907jb<Content> interfaceC1944907jb, Value value) {
            C1983007pk<Content, Value>.a aVarLIZIZ;
            Value value2;
            Map<Content, C1983007pk<Content, Value>.a> map = this.LIZJ;
            if (map == null) {
                map = new HashMap<>();
            }
            while (true) {
                try {
                    aVarLIZIZ = LIZIZ(interfaceC1944907jb);
                    break;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1534250q1n.LIZIZ("ForestTreeNode", " failed to add sub node", th);
                }
            }
            if (aVarLIZIZ != null) {
                if (value != null) {
                    Value value3 = aVarLIZIZ.LIZIZ;
                    if (value3 != null && !Intrinsics.LJFF(value3, value)) {
                        return null;
                    }
                    value2 = value;
                } else {
                    value2 = aVarLIZIZ.LIZIZ;
                }
                aVarLIZIZ.LIZIZ = value2;
            } else {
                aVarLIZIZ = C1983007pk.this.new a(interfaceC1944907jb, value, null);
                map.put(interfaceC1944907jb.getContent(), aVarLIZIZ);
            }
            this.LIZJ = map;
            return aVarLIZIZ;
        }

        public a(InterfaceC1944907jb<Content> interfaceC1944907jb, Value value, Map<Content, C1983007pk<Content, Value>.a> map) {
            this.LIZ = interfaceC1944907jb;
            this.LIZIZ = value;
            this.LIZJ = map;
        }
    }

    public final void LIZ(Iterable<? extends InterfaceC1944907jb<Content>> iterable, Function1<? super InterfaceC1944907jb<Content>, ? extends Value> function1) {
        for (InterfaceC1944907jb interfaceC1944907jb : (ArrayList) iterable) {
            Value valueInvoke = function1.invoke(interfaceC1944907jb);
            C1983007pk<Content, Value>.a aVar = this.LIZ;
            Iterator<InterfaceC1944907jb<Content>> it2 = interfaceC1944907jb.LIZ().iterator();
            if (it2.hasNext()) {
                while (true) {
                    InterfaceC1944907jb<Content> next = it2.next();
                    if (it2.hasNext()) {
                        Content content = null;
                        C1983007pk<Content, Value>.a aVarLIZ = aVar.LIZ(next, null);
                        if (aVarLIZ == null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("value has already be assigned, operational: ");
                            InterfaceC1944907jb<Content> interfaceC1944907jb2 = aVar.LIZ;
                            if (interfaceC1944907jb2 != null) {
                                content = interfaceC1944907jb2.getContent();
                            }
                            sbLIZ.append(content);
                            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                        aVar = aVarLIZ;
                    } else {
                        aVar.LIZ(next, valueInvoke);
                        break;
                    }
                }
            }
        }
    }
}
