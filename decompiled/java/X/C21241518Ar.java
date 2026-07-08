package X;

import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.btm.api.util.LazyKt;
import com.bytedance.android.btm.api.util.LazyNullable;
import com.bytedance.android.btm.impl.page.model.PageInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18Ar, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21241518Ar {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIIIZZ;
    public final C01GW LIZ = C452501pT.LIZIZ(new C189J());
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C189I());
    public final C01GW LIZJ;
    public boolean LIZLLL;
    public final Map<String, String> LJ;
    public final Map<String, String> LJFF;
    public final Map<String, Long> LJI;
    public final LazyNullable LJII;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C21241518Ar.class, "callbackExp", "getCallbackExp()Lcom/bytedance/android/btm/impl/chain/ChainRecordCallback;", 0);
        C13LE.LIZ.getClass();
        LJIIIIZZ = new InterfaceC2217461Bqa[]{c2217371BqR};
    }

    public final C18G6 LIZJ() {
        return (C18G6) this.LIZIZ.getValue();
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("btmMap", this.LJ.toString());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return C786410Ut5.J3(jSONObject);
    }

    public C21241518Ar() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>() { // from class: X.0jbG
            public boolean LL;
            public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AnonymousClass1899());

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<String, String>> entrySet() {
                return getEntries();
            }

            public /* bridge */ Set<Map.Entry<String, String>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<String> getKeys() {
                return super.keySet();
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<String> getValues() {
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
            public final /* bridge */ Collection<String> values() {
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
                if (!(obj instanceof String)) {
                    return false;
                }
                return containsValue((String) obj);
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
            public final boolean removeEldestEntry(Map.Entry<String, String> entry) {
                if (size() >= ((Number) this.LLILLJJLI.getValue()).intValue()) {
                    String key = null;
                    if (1 != 0) {
                        if (!this.LL) {
                            C18CE.LIZ.LJFF(1006, String.valueOf(((Number) this.LLILLJJLI.getValue()).intValue()), null, null, false);
                            this.LL = true;
                        }
                        C18EH c18eh = (C18EH) this.LLILLL.LIZJ.getValue();
                        if (entry != null) {
                            key = entry.getKey();
                        }
                        c18eh.LIZ(key);
                    }
                    return true;
                }
                return false;
            }

            public /* bridge */ boolean containsKey(String str) {
                return super.containsKey((Object) str);
            }

            public /* bridge */ boolean containsValue(String str) {
                return super.containsValue((Object) str);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ String get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ String remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            public /* bridge */ String get(String str) {
                return (String) super.get((Object) str);
            }

            public /* bridge */ String remove(String str) {
                return (String) super.remove((Object) str);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                if (!(obj instanceof String)) {
                    return obj2;
                }
                return getOrDefault((String) obj, (String) obj2);
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if (!(obj instanceof String) || !(obj2 instanceof String)) {
                    return false;
                }
                return remove((String) obj, (String) obj2);
            }

            public final /* bridge */ String getOrDefault(Object obj, String str) {
                if (!(obj instanceof String)) {
                    return str;
                }
                return getOrDefault((String) obj, str);
            }

            public /* bridge */ boolean remove(String str, String str2) {
                return super.remove((Object) str, (Object) str2);
            }

            public /* bridge */ String getOrDefault(String str, String str2) {
                return (String) super.getOrDefault((Object) str, str2);
            }
        };
        this.LIZJ = C452501pT.LIZIZ(new C21241618As());
        LinkedHashMap<String, String> linkedHashMap2 = new LinkedHashMap<String, String>() { // from class: X.0jbF
            public boolean LL;
            public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AnonymousClass1895());

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<String, String>> entrySet() {
                return getEntries();
            }

            public /* bridge */ Set<Map.Entry<String, String>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<String> getKeys() {
                return super.keySet();
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<String> getValues() {
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
            public final /* bridge */ Collection<String> values() {
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
                if (!(obj instanceof String)) {
                    return false;
                }
                return containsValue((String) obj);
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
            public final boolean removeEldestEntry(Map.Entry<String, String> entry) {
                if (size() >= ((Number) this.LLILLJJLI.getValue()).intValue()) {
                    if (!this.LL) {
                        C18CE.LIZ.LJFF(1033, String.valueOf(((Number) this.LLILLJJLI.getValue()).intValue()), null, null, false);
                        this.LL = true;
                    }
                    return true;
                }
                return false;
            }

            public /* bridge */ boolean containsKey(String str) {
                return super.containsKey((Object) str);
            }

            public /* bridge */ boolean containsValue(String str) {
                return super.containsValue((Object) str);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ String get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ String remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            public /* bridge */ String get(String str) {
                return (String) super.get((Object) str);
            }

            public /* bridge */ String remove(String str) {
                return (String) super.remove((Object) str);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                if (!(obj instanceof String)) {
                    return obj2;
                }
                return getOrDefault((String) obj, (String) obj2);
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if (!(obj instanceof String) || !(obj2 instanceof String)) {
                    return false;
                }
                return remove((String) obj, (String) obj2);
            }

            public final /* bridge */ String getOrDefault(Object obj, String str) {
                if (!(obj instanceof String)) {
                    return str;
                }
                return getOrDefault((String) obj, str);
            }

            public /* bridge */ boolean remove(String str, String str2) {
                return super.remove((Object) str, (Object) str2);
            }

            public /* bridge */ String getOrDefault(String str, String str2) {
                return (String) super.getOrDefault((Object) str, str2);
            }
        };
        LinkedHashMap<String, Long> linkedHashMap3 = new LinkedHashMap<String, Long>() { // from class: X.18Ez
            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<String, Long>> entrySet() {
                return getEntries();
            }

            public /* bridge */ Set<Map.Entry<String, Long>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<String> getKeys() {
                return super.keySet();
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<Long> getValues() {
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
            public final /* bridge */ Collection<Long> values() {
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
                if (!(obj instanceof Long)) {
                    return false;
                }
                return containsValue((Long) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Long get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Long remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
                if (size() >= C18CS.LIZ.LIZLLL().LJI()) {
                    if (!this.LL.LIZLLL) {
                        C18CE.LIZ.LJFF(1037, String.valueOf(C18CS.LIZ.LIZLLL().LJI()), null, null, false);
                        this.LL.LIZLLL = true;
                    }
                    return true;
                }
                return false;
            }

            public /* bridge */ boolean containsKey(String str) {
                return super.containsKey((Object) str);
            }

            public /* bridge */ boolean containsValue(Long l) {
                return super.containsValue((Object) l);
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

            public /* bridge */ Long get(String str) {
                return (Long) super.get((Object) str);
            }

            public /* bridge */ Long remove(String str) {
                return (Long) super.remove((Object) str);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                if (!(obj instanceof String)) {
                    return obj2;
                }
                return getOrDefault((String) obj, (Long) obj2);
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if (!(obj instanceof String) || !(obj2 instanceof Long)) {
                    return false;
                }
                return remove((String) obj, (Long) obj2);
            }

            public final /* bridge */ Long getOrDefault(Object obj, Long l) {
                if (!(obj instanceof String)) {
                    return l;
                }
                return getOrDefault((String) obj, l);
            }

            public /* bridge */ boolean remove(String str, Long l) {
                return super.remove((Object) str, (Object) l);
            }

            public /* bridge */ Long getOrDefault(String str, Long l) {
                return (Long) super.getOrDefault((Object) str, l);
            }
        };
        this.LJ = Collections.synchronizedMap(linkedHashMap);
        this.LJFF = Collections.synchronizedMap(linkedHashMap2);
        this.LJI = Collections.synchronizedMap(linkedHashMap3);
        this.LJII = LazyKt.INSTANCE.lazyNullable(new C21241718At());
    }

    public final String LIZIZ(String str) {
        if (str == null) {
            return null;
        }
        String str2 = this.LJ.get(str);
        if (str2 == null) {
            return this.LJFF.get(str);
        }
        return str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [X.18CE] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final JSONObject LIZ(int i, String str) throws JSONException {
        String str2;
        String str3;
        String str4;
        String pageShowId;
        C21242018Aw preBtmIdNode;
        String str5;
        String strSubstring;
        int iLJFF;
        int i2;
        String strLIZIZ = str;
        int i3 = i;
        if (!this.LJ.isEmpty() && strLIZIZ != null && strLIZIZ.length() != 0) {
            if (i3 <= 0) {
                i3 = 10;
            }
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            while (strLIZIZ != null && strLIZIZ.length() != 0 && !u.LJJIIJZLJL(strLIZIZ, "a0.b0.c0.d0", false)) {
                ListProtector.add(arrayList, 0, strLIZIZ);
                i4++;
                strLIZIZ = LIZIZ(strLIZIZ);
                if (i4 >= i3) {
                    break;
                }
            }
            JSONObject jSONObject = new JSONObject();
            if (arrayList.size() > 0) {
                Iterator it2 = arrayList.iterator();
                String strLIZIZ2 = "";
                String string = "";
                String string2 = "";
                String string3 = "";
                while (true) {
                    str2 = null;
                    if (!it2.hasNext()) {
                        break;
                    }
                    String str6 = (String) it2.next();
                    String strLJ = C18C3.LJ(str6);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(string);
                    sbLIZ.append(strLJ);
                    sbLIZ.append(',');
                    string = C2188811AlT.LIZIZ(sbLIZ);
                    if (str6 != null && (iLJFF = C18C3.LJFF(4, str6)) >= 0 && (i2 = iLJFF + 1) < str6.length() && str6.charAt(i2) == 'e') {
                        strSubstring = str6.substring(i2 + 1);
                    } else {
                        strSubstring = null;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(string2);
                    sbLIZ2.append(strSubstring);
                    sbLIZ2.append(',');
                    string2 = C2188811AlT.LIZIZ(sbLIZ2);
                    if ((C18CS.LIZ.LIZJ().LJIILIIL() & 2) != 0) {
                        C21246818Cs c21246818CsLJFF = C21248618Dk.LIZ.LJFF(str6);
                        if (c21246818CsLJFF != null) {
                            str2 = c21246818CsLJFF.LIZ;
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(string3);
                        sbLIZ3.append(str2);
                        sbLIZ3.append(',');
                        string3 = C2188811AlT.LIZIZ(sbLIZ3);
                    }
                }
                if (string.length() > 0) {
                    string = string.subSequence(0, string.length() - 1).toString();
                }
                if (string2.length() > 0) {
                    string2 = string2.subSequence(0, string2.length() - 1).toString();
                }
                jSONObject.putOpt("btm", string);
                jSONObject.putOpt(FollowStatusChangeMethod.PARAM_UID, string2);
                if ((C18CS.LIZ.LIZJ().LJIILIIL() & 1) != 0) {
                    String str7 = (String) ListProtector.get(arrayList, arrayList.size() - 1);
                    C21248618Dk c21248618Dk = C21248618Dk.LIZ;
                    C21246818Cs c21246818CsLJFF2 = c21248618Dk.LJFF(str7);
                    if (c21246818CsLJFF2 != null) {
                        str3 = c21246818CsLJFF2.LIZJ;
                    } else {
                        str3 = null;
                    }
                    C18B9 c18b9 = C18B9.LIZ;
                    Object objLIZ = C18B9.LIZ(PageFinder.via(str3));
                    c21248618Dk.getClass();
                    PageInfo pageInfoLJIIIIZZ = C21248618Dk.LJIIIIZZ(objLIZ);
                    if (pageInfoLJIIIIZZ != null) {
                        C21242018Aw latestBtmIdNode = pageInfoLJIIIIZZ.getLatestBtmIdNode();
                        if (latestBtmIdNode == null || (str5 = latestBtmIdNode.LIZJ) == null || !Intrinsics.LJFF(str5, str7)) {
                            latestBtmIdNode = null;
                            C21242018Aw latestPageBtmIdNode = pageInfoLJIIIIZZ.getLatestPageBtmIdNode();
                            if (latestPageBtmIdNode != null && (str4 = latestPageBtmIdNode.LIZJ) != null && Intrinsics.LJFF(str4, str7)) {
                                latestBtmIdNode = latestPageBtmIdNode;
                            }
                        }
                        if (latestBtmIdNode == null) {
                            pageShowId = pageInfoLJIIIIZZ.getPageShowId();
                        } else {
                            pageShowId = latestBtmIdNode.LIZ;
                            if (pageShowId == null) {
                                pageShowId = CardStruct.IStatusCode.DEFAULT;
                            }
                        }
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("");
                        sbLIZ4.append(pageShowId);
                        strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
                        if (latestBtmIdNode == null || (preBtmIdNode = latestBtmIdNode.LIZIZ) == null) {
                            preBtmIdNode = pageInfoLJIIIIZZ.getPreBtmIdNode();
                        }
                        int size = arrayList.size() - 2;
                        boolean z = true;
                        while (true) {
                            if (-1 >= size) {
                                break;
                            }
                            if (preBtmIdNode == null) {
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append("btmId: ");
                                sbLIZ5.append(str7);
                                C18CE.LIZ.LJFF(1025, C2188811AlT.LIZIZ(sbLIZ5), str2, str2, false);
                                break;
                            }
                            String strLIZIZ3 = preBtmIdNode.LIZ;
                            if (strLIZIZ3 == null) {
                                strLIZIZ3 = CardStruct.IStatusCode.DEFAULT;
                            }
                            if (!u.LJIJI(preBtmIdNode.LIZJ, (String) ListProtector.get(arrayList, size), false)) {
                                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                sbLIZ6.append(strLIZIZ3);
                                sbLIZ6.append("_err");
                                strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ6);
                                z = false;
                            }
                            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                            sbLIZ7.append(strLIZIZ3);
                            sbLIZ7.append(',');
                            sbLIZ7.append(strLIZIZ2);
                            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ7);
                            preBtmIdNode = preBtmIdNode.LIZIZ;
                            if (!z) {
                                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                sbLIZ8.append("btmId: ");
                                sbLIZ8.append(str7);
                                C18CE.LIZ.LJFF(1026, C2188811AlT.LIZIZ(sbLIZ8), null, null, false);
                                break;
                            }
                            size--;
                            str2 = null;
                        }
                    }
                }
                if (string3.length() > 0) {
                    string3 = string3.subSequence(0, string3.length() - 1).toString();
                }
                if (C18CS.LIZ.LIZJ().LJIILIIL() == 3) {
                    if (!Intrinsics.LJFF(strLIZIZ2, string3)) {
                        C18CE.LIZ.LJFF(1026, "btm_show_id_node: " + strLIZIZ2 + "\nbtm_show_id_map: " + string3, null, null, false);
                    }
                    jSONObject.putOpt("btm_show_id", string3);
                    return jSONObject;
                }
                if ((C18CS.LIZ.LIZJ().LJIILIIL() & 1) != 0) {
                    jSONObject.putOpt("btm_show_id", strLIZIZ2);
                    return jSONObject;
                }
                if ((C18CS.LIZ.LIZJ().LJIILIIL() & 2) != 0) {
                    jSONObject.putOpt("btm_show_id", string3);
                }
            }
            return jSONObject;
        }
        return new JSONObject();
    }

    public final void LIZLLL(String str, String str2, boolean z) {
        if (str != null && str2 != null) {
            if (z) {
                this.LJFF.put(str, str2);
            } else {
                this.LJ.put(str, str2);
                ((C18EH) this.LIZJ.getValue()).LIZLLL(str2, str, true);
            }
        }
    }
}
