package X;

import com.bytedance.android.btm.api.model.BufferBtm;
import com.bytedance.android.btm.api.util.LazyKt;
import com.bytedance.android.btm.api.util.LazyNonNull;
import com.bytedance.android.btm.impl.BtmServiceImpl;
import com.bytedance.android.btm.impl.page.model.PageInfo;
import com.bytedance.android.btm.impl.setting.BugfixModel;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.18E5, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18E5 {
    public static final C18E5 LIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;
    public static LinkedBlockingQueue<BufferBtm> LIZJ;
    public static BufferBtm LIZLLL;
    public static final LazyNonNull LJ;
    public static final LazyNonNull LJFF;
    public static final LazyNonNull LJI;
    public static Pair<String, Long> LJII;
    public static final Map<String, BufferBtm> LJIIIIZZ;
    public static final Map<String, Pair<String, String>> LJIIIZ;
    public static final Map<BufferBtm, BufferBtm> LJIIJ;
    public static final Map<BufferBtm, BufferBtm> LJIIJJI;
    public static final Map<BufferBtm, String> LJIIL;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C18E5.class, "bufferBtmIdNodeMap", "getBufferBtmIdNodeMap()Ljava/util/WeakHashMap;", 0);
        C13LE.LIZ.getClass();
        InterfaceC2217461Bqa<?>[] interfaceC2217461BqaArr = {c2217371BqR, new C2217371BqR(C18E5.class, "sourceBtmTokenBufferBtmMap", "getSourceBtmTokenBufferBtmMap()Ljava/util/LinkedHashMap;", 0), new C2217371BqR(C18E5.class, "syncSourceBtmTokenBufferBtmMap", "getSyncSourceBtmTokenBufferBtmMap()Ljava/util/Map;", 0)};
        LIZIZ = interfaceC2217461BqaArr;
        C18E5 c18e5 = new C18E5();
        LIZ = c18e5;
        LazyKt lazyKt = LazyKt.INSTANCE;
        LazyNonNull lazyNonNull = lazyKt.lazyNonNull(new C204586153o());
        LJ = lazyNonNull;
        LazyNonNull lazyNonNull2 = lazyKt.lazyNonNull(new C084P());
        LJFF = lazyNonNull2;
        LazyNonNull lazyNonNull3 = lazyKt.lazyNonNull(new C21252418Ew());
        LJI = lazyNonNull3;
        LJIIIIZZ = Collections.synchronizedMap(new LinkedHashMap<String, BufferBtm>() { // from class: X.084L
            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<String, BufferBtm>> entrySet() {
                return getEntries();
            }

            public /* bridge */ Set<Map.Entry<String, BufferBtm>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<String> getKeys() {
                return super.keySet();
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<BufferBtm> getValues() {
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
            public final /* bridge */ Collection<BufferBtm> values() {
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
                if (!(obj instanceof BufferBtm)) {
                    return false;
                }
                return containsValue((BufferBtm) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ BufferBtm get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ BufferBtm remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, BufferBtm> entry) {
                if (size() >= 100) {
                    return true;
                }
                return false;
            }

            public /* bridge */ boolean containsKey(String str) {
                return super.containsKey((Object) str);
            }

            public /* bridge */ boolean containsValue(BufferBtm bufferBtm) {
                return super.containsValue((Object) bufferBtm);
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

            public /* bridge */ BufferBtm get(String str) {
                return (BufferBtm) super.get((Object) str);
            }

            public /* bridge */ BufferBtm remove(String str) {
                return (BufferBtm) super.remove((Object) str);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                if (!(obj instanceof String)) {
                    return obj2;
                }
                return getOrDefault((String) obj, (BufferBtm) obj2);
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if (!(obj instanceof String) || !(obj2 instanceof BufferBtm)) {
                    return false;
                }
                return remove((String) obj, (BufferBtm) obj2);
            }

            public final /* bridge */ BufferBtm getOrDefault(Object obj, BufferBtm bufferBtm) {
                if (!(obj instanceof String)) {
                    return bufferBtm;
                }
                return getOrDefault((String) obj, bufferBtm);
            }

            public /* bridge */ boolean remove(String str, BufferBtm bufferBtm) {
                return super.remove((Object) str, (Object) bufferBtm);
            }

            public /* bridge */ BufferBtm getOrDefault(String str, BufferBtm bufferBtm) {
                return (BufferBtm) super.getOrDefault((Object) str, bufferBtm);
            }
        });
        LJIIIZ = Collections.synchronizedMap(new LinkedHashMap<String, Pair<? extends String, ? extends String>>() { // from class: X.083u
            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<String, Pair<String, String>>> entrySet() {
                return getEntries();
            }

            public /* bridge */ Set<Map.Entry<String, Pair<String, String>>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<String> getKeys() {
                return super.keySet();
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<Pair<String, String>> getValues() {
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
            public final /* bridge */ Collection<Pair<String, String>> values() {
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
                if (!(obj instanceof Pair)) {
                    return false;
                }
                return containsValue((Pair<String, String>) obj);
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

            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, Pair<? extends String, ? extends String>> entry) {
                if (size() >= 100) {
                    return true;
                }
                return false;
            }

            public /* bridge */ boolean containsKey(String str) {
                return super.containsKey((Object) str);
            }

            public /* bridge */ boolean containsValue(Pair<String, String> pair) {
                return super.containsValue((Object) pair);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Pair<String, String> get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Pair<String, String> remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            public /* bridge */ Pair<String, String> get(String str) {
                return (Pair) super.get((Object) str);
            }

            public /* bridge */ Pair<String, String> remove(String str) {
                return (Pair) super.remove((Object) str);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                if (!(obj instanceof String)) {
                    return obj2;
                }
                return getOrDefault((String) obj, (Pair<String, String>) obj2);
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if (!(obj instanceof String) || !(obj2 instanceof Pair)) {
                    return false;
                }
                return remove((String) obj, (Pair<String, String>) obj2);
            }

            public final /* bridge */ Pair getOrDefault(Object obj, Pair pair) {
                if (!(obj instanceof String)) {
                    return pair;
                }
                return getOrDefault((String) obj, (Pair<String, String>) pair);
            }

            public /* bridge */ boolean remove(String str, Pair<String, String> pair) {
                return super.remove((Object) str, (Object) pair);
            }

            public /* bridge */ Pair<String, String> getOrDefault(String str, Pair<String, String> pair) {
                return (Pair) super.getOrDefault((Object) str, pair);
            }
        });
        LJIIJ = Collections.synchronizedMap(new LinkedHashMap<BufferBtm, BufferBtm>() { // from class: X.084N
            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<BufferBtm, BufferBtm>> entrySet() {
                return getEntries();
            }

            public /* bridge */ Set<Map.Entry<BufferBtm, BufferBtm>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<BufferBtm> getKeys() {
                return super.keySet();
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<BufferBtm> getValues() {
                return super.values();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<BufferBtm> keySet() {
                return getKeys();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Collection<BufferBtm> values() {
                return getValues();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsKey(Object obj) {
                if (!(obj instanceof BufferBtm)) {
                    return false;
                }
                return containsKey((BufferBtm) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsValue(Object obj) {
                if (!(obj instanceof BufferBtm)) {
                    return false;
                }
                return containsValue((BufferBtm) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ BufferBtm get(Object obj) {
                if (!(obj instanceof BufferBtm)) {
                    return null;
                }
                return get((BufferBtm) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ BufferBtm remove(Object obj) {
                if (!(obj instanceof BufferBtm)) {
                    return null;
                }
                return remove((BufferBtm) obj);
            }

            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<BufferBtm, BufferBtm> entry) {
                if (size() >= 5) {
                    return true;
                }
                return false;
            }

            public /* bridge */ boolean containsKey(BufferBtm bufferBtm) {
                return super.containsKey((Object) bufferBtm);
            }

            public /* bridge */ boolean containsValue(BufferBtm bufferBtm) {
                return super.containsValue((Object) bufferBtm);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object get(Object obj) {
                if (!(obj instanceof BufferBtm)) {
                    return null;
                }
                return get((BufferBtm) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object remove(Object obj) {
                if (!(obj instanceof BufferBtm)) {
                    return null;
                }
                return remove((BufferBtm) obj);
            }

            public /* bridge */ BufferBtm get(BufferBtm bufferBtm) {
                return (BufferBtm) super.get((Object) bufferBtm);
            }

            public /* bridge */ BufferBtm remove(BufferBtm bufferBtm) {
                return (BufferBtm) super.remove((Object) bufferBtm);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                if (!(obj instanceof BufferBtm)) {
                    return obj2;
                }
                return getOrDefault((BufferBtm) obj, (BufferBtm) obj2);
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if (!(obj instanceof BufferBtm) || !(obj2 instanceof BufferBtm)) {
                    return false;
                }
                return remove((BufferBtm) obj, (BufferBtm) obj2);
            }

            public final /* bridge */ BufferBtm getOrDefault(Object obj, BufferBtm bufferBtm) {
                if (!(obj instanceof BufferBtm)) {
                    return bufferBtm;
                }
                return getOrDefault((BufferBtm) obj, bufferBtm);
            }

            public /* bridge */ boolean remove(BufferBtm bufferBtm, BufferBtm bufferBtm2) {
                return super.remove((Object) bufferBtm, (Object) bufferBtm2);
            }

            public /* bridge */ BufferBtm getOrDefault(BufferBtm bufferBtm, BufferBtm bufferBtm2) {
                return (BufferBtm) super.getOrDefault((Object) bufferBtm, bufferBtm2);
            }
        });
        LJIIJJI = Collections.synchronizedMap(new LinkedHashMap<BufferBtm, BufferBtm>() { // from class: X.084M
            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<BufferBtm, BufferBtm>> entrySet() {
                return getEntries();
            }

            public /* bridge */ Set<Map.Entry<BufferBtm, BufferBtm>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<BufferBtm> getKeys() {
                return super.keySet();
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<BufferBtm> getValues() {
                return super.values();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<BufferBtm> keySet() {
                return getKeys();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Collection<BufferBtm> values() {
                return getValues();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsKey(Object obj) {
                if (!(obj instanceof BufferBtm)) {
                    return false;
                }
                return containsKey((BufferBtm) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsValue(Object obj) {
                if (!(obj instanceof BufferBtm)) {
                    return false;
                }
                return containsValue((BufferBtm) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ BufferBtm get(Object obj) {
                if (!(obj instanceof BufferBtm)) {
                    return null;
                }
                return get((BufferBtm) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ BufferBtm remove(Object obj) {
                if (!(obj instanceof BufferBtm)) {
                    return null;
                }
                return remove((BufferBtm) obj);
            }

            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<BufferBtm, BufferBtm> entry) {
                if (size() >= 5) {
                    return true;
                }
                return false;
            }

            public /* bridge */ boolean containsKey(BufferBtm bufferBtm) {
                return super.containsKey((Object) bufferBtm);
            }

            public /* bridge */ boolean containsValue(BufferBtm bufferBtm) {
                return super.containsValue((Object) bufferBtm);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object get(Object obj) {
                if (!(obj instanceof BufferBtm)) {
                    return null;
                }
                return get((BufferBtm) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object remove(Object obj) {
                if (!(obj instanceof BufferBtm)) {
                    return null;
                }
                return remove((BufferBtm) obj);
            }

            public /* bridge */ BufferBtm get(BufferBtm bufferBtm) {
                return (BufferBtm) super.get((Object) bufferBtm);
            }

            public /* bridge */ BufferBtm remove(BufferBtm bufferBtm) {
                return (BufferBtm) super.remove((Object) bufferBtm);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                if (!(obj instanceof BufferBtm)) {
                    return obj2;
                }
                return getOrDefault((BufferBtm) obj, (BufferBtm) obj2);
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if (!(obj instanceof BufferBtm) || !(obj2 instanceof BufferBtm)) {
                    return false;
                }
                return remove((BufferBtm) obj, (BufferBtm) obj2);
            }

            public final /* bridge */ BufferBtm getOrDefault(Object obj, BufferBtm bufferBtm) {
                if (!(obj instanceof BufferBtm)) {
                    return bufferBtm;
                }
                return getOrDefault((BufferBtm) obj, bufferBtm);
            }

            public /* bridge */ boolean remove(BufferBtm bufferBtm, BufferBtm bufferBtm2) {
                return super.remove((Object) bufferBtm, (Object) bufferBtm2);
            }

            public /* bridge */ BufferBtm getOrDefault(BufferBtm bufferBtm, BufferBtm bufferBtm2) {
                return (BufferBtm) super.getOrDefault((Object) bufferBtm, bufferBtm2);
            }
        });
        LJIIL = Collections.synchronizedMap(new LinkedHashMap<BufferBtm, String>() { // from class: X.084K
            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<BufferBtm, String>> entrySet() {
                return getEntries();
            }

            public /* bridge */ Set<Map.Entry<BufferBtm, String>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<BufferBtm> getKeys() {
                return super.keySet();
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<String> getValues() {
                return super.values();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<BufferBtm> keySet() {
                return getKeys();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Collection<String> values() {
                return getValues();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsKey(Object obj) {
                if (!(obj instanceof BufferBtm)) {
                    return false;
                }
                return containsKey((BufferBtm) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsValue(Object obj) {
                if (!(obj instanceof String)) {
                    return false;
                }
                return containsValue((String) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object get(Object obj) {
                if (!(obj instanceof BufferBtm)) {
                    return null;
                }
                return get((BufferBtm) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object remove(Object obj) {
                if (!(obj instanceof BufferBtm)) {
                    return null;
                }
                return remove((BufferBtm) obj);
            }

            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<BufferBtm, String> entry) {
                if (size() >= 5) {
                    return true;
                }
                return false;
            }

            public /* bridge */ boolean containsKey(BufferBtm bufferBtm) {
                return super.containsKey((Object) bufferBtm);
            }

            public /* bridge */ boolean containsValue(String str) {
                return super.containsValue((Object) str);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ String get(Object obj) {
                if (!(obj instanceof BufferBtm)) {
                    return null;
                }
                return get((BufferBtm) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ String remove(Object obj) {
                if (!(obj instanceof BufferBtm)) {
                    return null;
                }
                return remove((BufferBtm) obj);
            }

            public /* bridge */ String get(BufferBtm bufferBtm) {
                return (String) super.get((Object) bufferBtm);
            }

            public /* bridge */ String remove(BufferBtm bufferBtm) {
                return (String) super.remove((Object) bufferBtm);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                if (!(obj instanceof BufferBtm)) {
                    return obj2;
                }
                return getOrDefault((BufferBtm) obj, (String) obj2);
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if (!(obj instanceof BufferBtm) || !(obj2 instanceof String)) {
                    return false;
                }
                return remove((BufferBtm) obj, (String) obj2);
            }

            public final /* bridge */ String getOrDefault(Object obj, String str) {
                if (!(obj instanceof BufferBtm)) {
                    return str;
                }
                return getOrDefault((BufferBtm) obj, str);
            }

            public /* bridge */ boolean remove(BufferBtm bufferBtm, String str) {
                return super.remove((Object) bufferBtm, (Object) str);
            }

            public /* bridge */ String getOrDefault(BufferBtm bufferBtm, String str) {
                return (String) super.getOrDefault((Object) bufferBtm, str);
            }
        });
        if (BtmServiceImpl.INSTANCE.getOpenPerfOpt()) {
            return;
        }
        LIZJ = new LinkedBlockingQueue<>();
        lazyNonNull.setValue(c18e5, interfaceC2217461BqaArr[0], new WeakHashMap());
        lazyNonNull2.setValue(c18e5, interfaceC2217461BqaArr[1], new LinkedHashMap<String, BufferBtm>() { // from class: X.084J
            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<String, BufferBtm>> entrySet() {
                return getEntries();
            }

            public /* bridge */ Set<Map.Entry<String, BufferBtm>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<String> getKeys() {
                return super.keySet();
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<BufferBtm> getValues() {
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
            public final /* bridge */ Collection<BufferBtm> values() {
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
                if (!(obj instanceof BufferBtm)) {
                    return false;
                }
                return containsValue((BufferBtm) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ BufferBtm get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ BufferBtm remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, BufferBtm> entry) {
                if (size() >= 100) {
                    return true;
                }
                return false;
            }

            public /* bridge */ boolean containsKey(String str) {
                return super.containsKey((Object) str);
            }

            public /* bridge */ boolean containsValue(BufferBtm bufferBtm) {
                return super.containsValue((Object) bufferBtm);
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

            public /* bridge */ BufferBtm get(String str) {
                return (BufferBtm) super.get((Object) str);
            }

            public /* bridge */ BufferBtm remove(String str) {
                return (BufferBtm) super.remove((Object) str);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                if (!(obj instanceof String)) {
                    return obj2;
                }
                return getOrDefault((String) obj, (BufferBtm) obj2);
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if (!(obj instanceof String) || !(obj2 instanceof BufferBtm)) {
                    return false;
                }
                return remove((String) obj, (BufferBtm) obj2);
            }

            public final /* bridge */ BufferBtm getOrDefault(Object obj, BufferBtm bufferBtm) {
                if (!(obj instanceof String)) {
                    return bufferBtm;
                }
                return getOrDefault((String) obj, bufferBtm);
            }

            public /* bridge */ boolean remove(String str, BufferBtm bufferBtm) {
                return super.remove((Object) str, (Object) bufferBtm);
            }

            public /* bridge */ BufferBtm getOrDefault(String str, BufferBtm bufferBtm) {
                return (BufferBtm) super.getOrDefault((Object) str, bufferBtm);
            }
        });
        lazyNonNull3.setValue(c18e5, interfaceC2217461BqaArr[2], Collections.synchronizedMap((LinkedHashMap) lazyNonNull2.getValue(c18e5, interfaceC2217461BqaArr[1])));
    }

    public static BufferBtm LJI() {
        C18ES c18es = BufferBtm.Companion;
        String strLIZIZ = C21246118Cl.LIZJ.LIZIZ("key_page_buffer");
        c18es.getClass();
        return C18ES.LIZLLL(strLIZIZ);
    }

    public final Map<String, BufferBtm> LIZLLL() {
        return (Map) LJI.getValue(this, LIZIZ[2]);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, com.bytedance.android.btm.impl.page.model.PageInfo] */
    /* JADX WARN: Type inference failed for: r0v22, types: [T, com.bytedance.android.btm.impl.page.model.PageInfo] */
    public static BufferBtm LIZJ(PageInfo pageInfo) {
        C259800zU c259800zU = new C259800zU();
        if (BtmServiceImpl.INSTANCE.getOpenPerfOpt()) {
            if (C18FN.LIZ()) {
                c259800zU.element = pageInfo.copy();
                C18CK.LJIIIZ("BufferQueue_getSourceBtmForPageBuffer", new C20361914lt(c259800zU));
            }
        } else {
            c259800zU.element = pageInfo.copy();
            C18CK.LJIIIZ("BufferQueue_getSourceBtmForPageBuffer", new C20362014lu(c259800zU));
        }
        BufferBtm bufferBtm = LIZLLL;
        if (bufferBtm == null) {
            C18CK.LJIIIZ("BufferQueue_getSourceBtmForPageBuffer", new C20362114lv());
            return null;
        }
        Regex regex = C18C3.LIZ;
        if (Intrinsics.LJFF(C18C3.LJI(pageInfo.getBtmPre()), C18C3.LJI("a0.b0.c0.d0"))) {
            if (pageInfo.isFirstPage() && (!pageInfo.isFirstResumeV2() || C18CS.LIZ.LIZLLL().LJIJ() != 1)) {
                C18CK.LJIIIZ("BufferQueue_getSourceBtmForPageBuffer", new C20361714lr(c259800zU));
                return null;
            }
            return bufferBtm;
        }
        String btmPre = pageInfo.getBtmPre();
        if (btmPre != null && btmPre.length() > 0 && !pageInfo.isFirstResumeV2()) {
            C18CK.LJIIIZ("BufferQueue_getSourceBtmForPageBuffer", new C20361814ls(c259800zU));
            return null;
        }
        C18CK.LJIIIZ("BufferQueue_getSourceBtmForPageBuffer", new C20362214lw(bufferBtm, c259800zU));
        return bufferBtm;
    }

    public static BufferBtm LJ(String str) {
        boolean z;
        if (C18CS.LIZ.LIZLLL().LJFF() == 1) {
            return null;
        }
        LinkedBlockingQueue<BufferBtm> linkedBlockingQueue = LIZJ;
        if (linkedBlockingQueue != null && !linkedBlockingQueue.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C18CK.LJIIIZ("BufferQueue_peekPreFromBuffer", new C20333314hH());
            return null;
        }
        LinkedBlockingQueue<BufferBtm> linkedBlockingQueue2 = LIZJ;
        if (linkedBlockingQueue2 != null) {
            for (BufferBtm bufferBtm : linkedBlockingQueue2) {
                if (str != null && (!bufferBtm.getTargetPagesBtm().isEmpty())) {
                    LIZ.getClass();
                    if (!LIZ(bufferBtm, str)) {
                        C18CK.LJIIIZ("BufferQueue_peekPreFromBuffer", new C20333114hF(bufferBtm));
                    }
                }
                if (bufferBtm.getStep() == 0) {
                    C18CE.LJII(C18CE.LIZ, 1018, bufferBtm.toString(), null, null, true, false, null, false, null, null, 1004);
                }
                C18CK.LJIIIZ("BufferQueue_peekPreFromBuffer", new C20333214hG(bufferBtm));
                return bufferBtm;
            }
        }
        C18CK.LJIIIZ("BufferQueue_peekPreFromBuffer", new C20333414hI());
        return null;
    }

    public static boolean LIZ(BufferBtm bufferBtm, String str) {
        String strLIZIZ = C18C3.LIZIZ(str);
        if (strLIZIZ.length() == 0) {
            return false;
        }
        List<String> targetPagesBtm = bufferBtm.getTargetPagesBtm();
        if ((targetPagesBtm instanceof Collection) && targetPagesBtm.isEmpty()) {
            return false;
        }
        Iterator<String> it2 = targetPagesBtm.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(C18C3.LIZIZ(it2.next()), strLIZIZ)) {
                return true;
            }
        }
        return false;
    }

    public static BufferBtm LJFF(PageInfo pageInfo, String str) {
        BufferBtm bufferBtmPeek;
        BufferBtm bufferBtmPeek2;
        int iIntValue;
        String btmPre;
        LinkedBlockingQueue<BufferBtm> linkedBlockingQueue;
        if (C18CS.LIZ.LIZLLL().LJFF() == 1) {
            return null;
        }
        C18CK.LJIIIZ("BufferQueue_pollPreFromBuffer", new C1127704b5(str));
        LinkedBlockingQueue<BufferBtm> linkedBlockingQueue2 = LIZJ;
        if (linkedBlockingQueue2 == null || linkedBlockingQueue2.isEmpty()) {
            C18CK.LJIIIZ("BufferQueue_pollPreFromBuffer", new C18I1());
            return null;
        }
        do {
            LinkedBlockingQueue<BufferBtm> linkedBlockingQueue3 = LIZJ;
            if (linkedBlockingQueue3 == null || (bufferBtmPeek = linkedBlockingQueue3.peek()) == null) {
                return null;
            }
            if (str != null && (!bufferBtmPeek.getTargetPagesBtm().isEmpty())) {
                LIZ.getClass();
                if (!LIZ(bufferBtmPeek, str)) {
                    LinkedBlockingQueue<BufferBtm> linkedBlockingQueue4 = LIZJ;
                    if (linkedBlockingQueue4 != null) {
                        linkedBlockingQueue4.poll();
                    }
                    linkedBlockingQueue = LIZJ;
                    if (linkedBlockingQueue == null) {
                        break;
                    }
                }
            }
            LinkedBlockingQueue<BufferBtm> linkedBlockingQueue5 = LIZJ;
            if (linkedBlockingQueue5 == null || (bufferBtmPeek2 = linkedBlockingQueue5.peek()) == null) {
                return null;
            }
            if (C18CS.LIZ.LIZIZ().LJIIIZ() == 1 && pageInfo != null && !pageInfo.isFirstResumeV2()) {
                if (bufferBtmPeek2.getStep() > pageInfo.getStep() && pageInfo.getStep() > 0 && (btmPre = pageInfo.getBtmPre()) != null && btmPre.length() > 0) {
                    if (BtmServiceImpl.INSTANCE.getOpenPerfOpt()) {
                        if (C18FN.LIZ()) {
                            C18CK.LJIIIZ("BufferQueue_pollPreFromBuffer", new C20332914hD(bufferBtmPeek2, pageInfo.copy()));
                        }
                        return null;
                    }
                    C18CK.LJIIIZ("BufferQueue_pollPreFromBuffer", new C20333014hE(bufferBtmPeek2, pageInfo.copy()));
                    return null;
                }
                BugfixModel bugfixModelLIZIZ = C18CS.LIZ.LIZIZ();
                bugfixModelLIZIZ.getClass();
                Object objLIZIZ = C1972007ny.LIZIZ(bugfixModelLIZIZ, "fix_poll_self_buffer", Integer.valueOf(bugfixModelLIZIZ.fixPollSelfBuffer));
                if (!(objLIZIZ instanceof Integer)) {
                    objLIZIZ = null;
                }
                Integer num = (Integer) objLIZIZ;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = bugfixModelLIZIZ.fixPollSelfBuffer;
                }
                bugfixModelLIZIZ.fixPollSelfBuffer = iIntValue;
                if (iIntValue == 1 && Intrinsics.LJFF(bufferBtmPeek2.getPageId(), pageInfo.getPageId())) {
                    return null;
                }
            }
            if (bufferBtmPeek2.getUseTimes() > 1) {
                bufferBtmPeek2.setUseTimes(bufferBtmPeek2.getUseTimes() - 1);
            } else {
                LinkedBlockingQueue<BufferBtm> linkedBlockingQueue6 = LIZJ;
                if (linkedBlockingQueue6 != null) {
                    linkedBlockingQueue6.poll();
                }
            }
            if (bufferBtmPeek2.getStep() == 0) {
                C18CE.LJII(C18CE.LIZ, 1018, bufferBtmPeek2.toString(), null, null, true, false, null, false, null, null, 1004);
            }
            C18CK.LJIIIZ("BufferQueue_pollPreFromBuffer", new C084R(bufferBtmPeek2));
            return bufferBtmPeek2;
        } while (!linkedBlockingQueue.isEmpty());
        C18CK.LJIIIZ("BufferQueue_pollPreFromBuffer", new C18I2());
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.android.btm.api.model.BufferBtm LIZIZ(java.lang.String r7, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r8) {
        /*
            r6 = this;
            r5 = 1
            if (r7 == 0) goto L13
            int r0 = r7.length()
            if (r0 == 0) goto L13
            r0 = 0
        La:
            r4 = 0
            if (r0 == 0) goto L15
            java.lang.String r0 = "sourceBtmToken is null or empty"
            r8.invoke(r0)
            return r4
        L13:
            r0 = 1
            goto La
        L15:
            java.util.Map r0 = r6.LIZLLL()
            java.lang.Object r1 = r0.get(r7)
            com.bytedance.android.btm.api.model.BufferBtm r1 = (com.bytedance.android.btm.api.model.BufferBtm) r1
            if (r1 == 0) goto L28
            java.util.Map r0 = r6.LIZLLL()
            r0.remove(r7)
        L28:
            com.bytedance.android.btm.impl.setting.BtmSettingModel r0 = X.C18CS.LIZ
            com.bytedance.android.btm.impl.setting.FeatureModel r3 = r0.LIZJ()
            r3.getClass()
            int r0 = r3.tokenRepeatUse
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "token_repeat_use"
            java.lang.Object r2 = X.C1972007ny.LIZIZ(r3, r0, r2)
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto L42
            r4 = r2
        L42:
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L6f
            int r0 = r4.intValue()
        L4a:
            r3.tokenRepeatUse = r0
            if (r0 != r5) goto L67
            if (r1 == 0) goto L5f
            java.util.Map<java.lang.String, com.bytedance.android.btm.api.model.BufferBtm> r2 = X.C18E5.LJIIIIZZ
            X.18ES r0 = com.bytedance.android.btm.api.model.BufferBtm.Companion
            r0.getClass()
            com.bytedance.android.btm.api.model.BufferBtm r0 = X.C18ES.LIZ(r1)
            r2.put(r7, r0)
        L5e:
            return r1
        L5f:
            java.util.Map<java.lang.String, com.bytedance.android.btm.api.model.BufferBtm> r0 = X.C18E5.LJIIIIZZ
            java.lang.Object r1 = r0.get(r7)
            com.bytedance.android.btm.api.model.BufferBtm r1 = (com.bytedance.android.btm.api.model.BufferBtm) r1
        L67:
            if (r1 != 0) goto L5e
            java.lang.String r0 = "get pre from sourceBtmToken fail"
            r8.invoke(r0)
            return r1
        L6f:
            int r0 = r3.tokenRepeatUse
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18E5.LIZIZ(java.lang.String, kotlin.jvm.functions.Function1):com.bytedance.android.btm.api.model.BufferBtm");
    }
}
