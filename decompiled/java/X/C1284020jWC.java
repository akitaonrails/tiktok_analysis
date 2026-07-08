package X;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0jWC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1284020jWC implements InterfaceC1321570kUl<C1284040jWE, C1804840x4E> {
    public final Map<String, C1804840x4E> LIZ = Collections.synchronizedMap(new LinkedHashMap<String, C1804840x4E>() { // from class: X.0jWB
        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<String, C1804840x4E>> entrySet() {
            return getEntries();
        }

        public /* bridge */ Set<Map.Entry<String, C1804840x4E>> getEntries() {
            return super.entrySet();
        }

        public /* bridge */ Set<String> getKeys() {
            return super.keySet();
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ Collection<C1804840x4E> getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<String> keySet() {
            return getKeys();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<C1804840x4E> values() {
            return getValues();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsKey((String) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj != null && !(obj instanceof C1804840x4E)) {
                return false;
            }
            return containsValue((C1804840x4E) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ C1804840x4E get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ C1804840x4E remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, C1804840x4E> entry) {
            if (size() > 3) {
                return true;
            }
            return false;
        }

        public /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public /* bridge */ boolean containsValue(C1804840x4E c1804840x4E) {
            return super.containsValue((Object) c1804840x4E);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        public /* bridge */ C1804840x4E get(String str) {
            return (C1804840x4E) super.get((Object) str);
        }

        public /* bridge */ C1804840x4E remove(String str) {
            return (C1804840x4E) super.remove((Object) str);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            if (!(obj instanceof String)) {
                return obj2;
            }
            return getOrDefault((String) obj, (C1804840x4E) obj2);
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (!(obj instanceof String)) {
                return false;
            }
            if (obj2 != null && !(obj2 instanceof C1804840x4E)) {
                return false;
            }
            return remove((String) obj, (C1804840x4E) obj2);
        }

        public final /* bridge */ C1804840x4E getOrDefault(Object obj, C1804840x4E c1804840x4E) {
            if (!(obj instanceof String)) {
                return c1804840x4E;
            }
            return getOrDefault((String) obj, c1804840x4E);
        }

        public /* bridge */ boolean remove(String str, C1804840x4E c1804840x4E) {
            return super.remove((Object) str, (Object) c1804840x4E);
        }

        public /* bridge */ C1804840x4E getOrDefault(String str, C1804840x4E c1804840x4E) {
            return (C1804840x4E) super.getOrDefault((Object) str, c1804840x4E);
        }
    });

    @Override // X.InterfaceC1321570kUl
    public final void LIZ(C1284040jWE c1284040jWE) throws Exception {
        Object next;
        if (!c1284040jWE.LIZJ()) {
            if (c1284040jWE.LIZLLL == null) {
                Iterator<T> it2 = this.LIZ.entrySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(C13LP.LJJJLL(a0.LJJLIIIJILLIZJL((CharSequence) ((Map.Entry) next).getKey(), new String[]{"-"}, 0, 6)), c1284040jWE.LIZ())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                Map.Entry entry = (Map.Entry) next;
                if (entry != null) {
                    this.LIZ.remove(entry.getKey());
                    return;
                }
                return;
            }
            this.LIZ.remove(c1284040jWE.LIZ());
            return;
        }
        throw new Exception("Cache key is invalid");
    }

    @Override // X.InterfaceC1321570kUl
    public final C1804840x4E LIZIZ(InterfaceC1284030jWD interfaceC1284030jWD, C1284040jWE c1284040jWE) throws Exception {
        C1804840x4E c1804840x4E;
        Object next;
        C1284040jWE c1284040jWE2 = c1284040jWE;
        if (!c1284040jWE2.LIZJ()) {
            if (!interfaceC1284030jWD.canUse()) {
                return null;
            }
            if (c1284040jWE2.LIZLLL == null) {
                Iterator<T> it2 = this.LIZ.entrySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(C13LP.LJJJLL(a0.LJJLIIIJILLIZJL((CharSequence) ((Map.Entry) next).getKey(), new String[]{"-"}, 0, 6)), c1284040jWE2.LIZ())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                Map.Entry entry = (Map.Entry) next;
                if (entry != null) {
                    c1804840x4E = (C1804840x4E) entry.getValue();
                }
                this.LIZ.remove(c1284040jWE2.LIZ());
                return null;
            }
            c1804840x4E = this.LIZ.get(c1284040jWE2.LIZ());
            if (c1804840x4E != null && System.currentTimeMillis() - c1804840x4E.LIZLLL <= 2147483647L) {
                return c1804840x4E;
            }
            this.LIZ.remove(c1284040jWE2.LIZ());
            return null;
        }
        throw new Exception("Cache key is invalid");
    }

    @Override // X.InterfaceC1321570kUl
    public final void LIZJ(InterfaceC1284030jWD interfaceC1284030jWD, C1284040jWE c1284040jWE, C1804840x4E c1804840x4E) throws Exception {
        C1284040jWE c1284040jWE2 = c1284040jWE;
        if (!c1284040jWE2.LIZJ()) {
            if (interfaceC1284030jWD.canCache()) {
                this.LIZ.put(c1284040jWE2.LIZ(), c1804840x4E);
                return;
            }
            return;
        }
        throw new Exception("Cache key is invalid");
    }
}
