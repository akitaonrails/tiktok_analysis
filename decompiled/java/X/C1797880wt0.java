package X;

import Y.ARunnableS60S0300000_27;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.bytedance.i18n.region.privacy.PrivacyDataCacheEntry;
import com.bytedance.i18n.region.privacy.PrivacyDataResponse;
import com.bytedance.i18n.region.privacy.PrivacyDataResult;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0wt0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1797880wt0 implements InterfaceC1903707cx {
    public final C1797890wt1 LIZ;
    public final C747860TVg LIZIZ;
    public final C1797980wtA LIZJ;
    public final Function2<Runnable, Long, Unit> LIZLLL;
    public final Function1<Runnable, Unit> LJ;
    public final Function0<Long> LJFF;
    public final Gson LJI;
    public final Set<String> LJII;
    public final Object LJIIIIZZ;
    public final Map<String, C1797910wt3> LJIIIZ;
    public int LJIIJ;
    public final C2045607zq LJIIJJI;
    public final C1797940wt6 LJIIL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LIZ() {
        C13BV arrayList;
        synchronized (this.LJIIIIZZ) {
            try {
                this.LJIIJ++;
                if (this.LJIIIZ.isEmpty()) {
                    arrayList = C13BV.INSTANCE;
                } else {
                    Collection<C1797910wt3> collectionValues = ((LinkedHashMap) this.LJIIIZ).values();
                    arrayList = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
                    for (C1797910wt3 c1797910wt3 : collectionValues) {
                        arrayList.add(new Pair(c1797910wt3, c1797910wt3.LJIIIIZZ));
                    }
                    ((LinkedHashMap) this.LJIIIZ).clear();
                    this.LJII.clear();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((C1797910wt3) ((Pair) it2.next()).getFirst()).LJIIIIZZ = null;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        for (Pair pair : arrayList) {
            C1797910wt3 c1797910wt32 = (C1797910wt3) pair.getFirst();
            Object second = pair.getSecond();
            if (second != null) {
                this.LJ.invoke((Runnable) second);
            }
            Function2<Integer, String, Unit> function2 = c1797910wt32.LIZJ;
            if (function2 != null) {
                function2.invoke(-7, "cancelled");
            }
        }
    }

    public C1797880wt0(C1797890wt1 c1797890wt1) {
        C747860TVg c747860TVg = new C747860TVg(c1797890wt1.LIZ);
        C1797980wtA c1797980wtA = new C1797980wtA(c1797890wt1.LIZLLL, c1797890wt1.LIZIZ, c1797890wt1.LIZJ);
        AFwS231S0000000_3 aFwS231S0000000_3 = AFwS231S0000000_3.get$arr$(301);
        AnonymousClass0208 anonymousClass0208 = AnonymousClass0208.get$arr$(80);
        AFwS231S0000000_3 aFwS231S0000000_32 = AFwS231S0000000_3.get$arr$(302);
        AFwS187S0000000_2 aFwS187S0000000_2 = AFwS187S0000000_2.get$arr$(1476);
        this.LIZ = c1797890wt1;
        this.LIZIZ = c747860TVg;
        this.LIZJ = c1797980wtA;
        this.LIZLLL = anonymousClass0208;
        this.LJ = aFwS231S0000000_32;
        this.LJFF = aFwS187S0000000_2;
        this.LJI = new Gson();
        this.LJII = Collections.newSetFromMap(new ConcurrentHashMap());
        this.LJIIIIZZ = new Object();
        this.LJIIIZ = new LinkedHashMap();
        this.LJIIJJI = (C2045607zq) aFwS231S0000000_3.invoke(new AwS606S0100000_27(this, 659));
        this.LJIIL = new C1797940wt6(c1797890wt1.LIZ, c1797890wt1.LJIIJJI, aFwS187S0000000_2);
    }

    public static String LIZLLL(Collection collection) {
        String str;
        if (collection.isEmpty()) {
            return "keyCount=0, keys=[]";
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(C13LP.LL(collection, 10), ",", null, null, 0, null, null, 62);
        if (collection.size() > 10) {
            str = ",...";
        } else {
            str = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("keyCount=");
        sbLIZ.append(collection.size());
        sbLIZ.append(", keys=[");
        sbLIZ.append(strLJJLIIIJ);
        sbLIZ.append(str);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZIZ(String str) {
        if (!this.LIZ.LJII) {
            return;
        }
        LIZ();
        this.LJIIJJI.LIZ();
        this.LIZIZ.LIZ.edit().clear().apply();
        LJI(this, C13BV.INSTANCE, str);
    }

    public final boolean LJ(C1797910wt3 c1797910wt3) {
        boolean zLJFF;
        synchronized (this.LJIIIIZZ) {
            try {
                zLJFF = LJFF(c1797910wt3);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zLJFF;
    }

    public final boolean LJFF(C1797910wt3 c1797910wt3) {
        if (((LinkedHashMap) this.LJIIIZ).get(c1797910wt3.LIZLLL) == c1797910wt3 && c1797910wt3.LJ == this.LJIIJ) {
            return true;
        }
        return false;
    }

    public final void LJII(String str) {
        C747860TVg c747860TVg = this.LIZIZ;
        SharedPreferences.Editor editorRemove = c747860TVg.LIZ.edit().remove(C747860TVg.LIZ(str));
        SharedPreferences sharedPreferences = c747860TVg.LIZ;
        Set<String> set = C08CX.INSTANCE;
        Set<String> stringSet = sharedPreferences.getStringSet("privacy_data_key_index", set);
        if (stringSet != null) {
            set = stringSet;
        }
        editorRemove.putStringSet("privacy_data_key_index", C15442062u.LJI(str, set)).apply();
        C2045607zq c2045607zq = this.LJIIJJI;
        synchronized (c2045607zq) {
            try {
                c2045607zq.LJ.remove(str);
                c2045607zq.LIZIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIIIZ(C1797910wt3 c1797910wt3) {
        C00YA c00yaLIZ;
        String simpleName;
        int length;
        String message;
        Pair<Integer, String> pair;
        String message2;
        int length2;
        Object c098200Yq;
        Integer num;
        List list;
        List<PrivacyDataResult> list2;
        String str;
        String str2;
        int length3;
        int length4;
        String str3;
        String str4;
        if (!LJ(c1797910wt3)) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        JSONObject jSONObject = c1797910wt3.LJFF;
        if (jSONObject == null || (c00yaLIZ = this.LIZJ.LIZ(jSONObject)) == null) {
            C1797980wtA c1797980wtA = this.LIZJ;
            List<String> list3 = c1797910wt3.LIZ;
            c1797980wtA.getClass();
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it2 = list3.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next());
            }
            c00yaLIZ = c1797980wtA.LIZ(new JSONObject().put("keys", jSONArray));
        }
        if (!LJ(c1797910wt3)) {
            return;
        }
        List<String> list4 = c1797910wt3.LIZ;
        String str5 = c1797910wt3.LIZIZ;
        String str6 = c00yaLIZ.LIZ;
        if (str6 != null && str6.length() != 0) {
            try {
                c098200Yq = (PrivacyDataResponse) this.LJI.LJII(str6, PrivacyDataResponse.class);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            PrivacyDataResponse privacyDataResponse = (PrivacyDataResponse) c098200Yq;
            if (privacyDataResponse != null && (num = privacyDataResponse.code) != null) {
                if (num.intValue() != 0) {
                    LIZLLL(list4);
                    int iIntValue = num.intValue();
                    if (privacyDataResponse != null) {
                        str3 = privacyDataResponse.message;
                    } else {
                        str3 = null;
                    }
                    LJIIIIZZ(new C1797900wt2(iIntValue, "fail", str3), str5, jUptimeMillis);
                    if (privacyDataResponse != null) {
                        str4 = privacyDataResponse.message;
                    } else {
                        str4 = null;
                    }
                    pair = new Pair<>(num, str4);
                } else {
                    LIZLLL(list4);
                    if (privacyDataResponse == null || (list = privacyDataResponse.results) == null) {
                        list = C13BV.INSTANCE;
                    }
                    list.size();
                    if (privacyDataResponse == null || (list2 = privacyDataResponse.results) == null) {
                        list2 = C13BV.INSTANCE;
                    }
                    C1797920wt4 c1797920wt4 = new C1797920wt4();
                    list2.isEmpty();
                    Set setLLIIJI = C13LP.LLIIJI(list4);
                    for (PrivacyDataResult privacyDataResult : list2) {
                        if ((!list4.isEmpty()) && !setLLIIJI.contains(privacyDataResult.key) && c1797920wt4.LIZLLL == null) {
                            c1797920wt4.LIZLLL = "unexpected_key";
                        }
                        if (privacyDataResult.key.length() == 0) {
                            if (c1797920wt4.LIZLLL == null) {
                                c1797920wt4.LIZLLL = "empty_key";
                            }
                        } else {
                            int i = privacyDataResult.errorCode;
                            if (i == 1005) {
                                LJII(privacyDataResult.key);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("cache removed by server, reason=");
                                sbLIZ.append(str5);
                                sbLIZ.append(", key=");
                                sbLIZ.append(privacyDataResult.key);
                                sbLIZ.append(", errorCode=");
                                sbLIZ.append(privacyDataResult.errorCode);
                                sbLIZ.append(", errorMsgLength=");
                                String str7 = privacyDataResult.errorMsg;
                                if (str7 != null) {
                                    length3 = str7.length();
                                } else {
                                    length3 = 0;
                                }
                                sbLIZ.append(length3);
                                C2188811AlT.LIZIZ(sbLIZ);
                                c1797920wt4.LIZJ++;
                            } else if (i != 0) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("key result failed, reason=");
                                sbLIZ2.append(str5);
                                sbLIZ2.append(", key=");
                                sbLIZ2.append(privacyDataResult.key);
                                sbLIZ2.append(", errorCode=");
                                sbLIZ2.append(privacyDataResult.errorCode);
                                sbLIZ2.append(", errorMsgLength=");
                                String str8 = privacyDataResult.errorMsg;
                                if (str8 != null) {
                                    length4 = str8.length();
                                } else {
                                    length4 = 0;
                                }
                                sbLIZ2.append(length4);
                                C2188811AlT.LIZIZ(sbLIZ2);
                                c1797920wt4.LIZIZ++;
                            } else {
                                String str9 = privacyDataResult.value;
                                if (str9 == null) {
                                    str9 = "";
                                }
                                if (str9.length() != 0) {
                                    long j = privacyDataResult.ttl;
                                    if (j > 0) {
                                        C747860TVg c747860TVg = this.LIZIZ;
                                        String str10 = privacyDataResult.key;
                                        long jLongValue = this.LJFF.invoke().longValue();
                                        c747860TVg.getClass();
                                        PrivacyDataCacheEntry privacyDataCacheEntry = new PrivacyDataCacheEntry(str10, str9, j, jLongValue + (((long) LSPassThroughRecordSizeConfig.DEFAULT) * j), jLongValue);
                                        SharedPreferences.Editor editorPutString = c747860TVg.LIZ.edit().putString(C747860TVg.LIZ(str10), GsonProtectorUtils.toJson(c747860TVg.LIZIZ, privacyDataCacheEntry));
                                        SharedPreferences sharedPreferences = c747860TVg.LIZ;
                                        Set<String> set = C08CX.INSTANCE;
                                        Set<String> stringSet = sharedPreferences.getStringSet("privacy_data_key_index", set);
                                        if (stringSet != null) {
                                            set = stringSet;
                                        }
                                        editorPutString.putStringSet("privacy_data_key_index", C15442062u.LJIIIIZZ(str10, set)).apply();
                                        C2045607zq c2045607zq = this.LJIIJJI;
                                        String str11 = privacyDataCacheEntry.key;
                                        long j2 = privacyDataCacheEntry.expireAtMillis;
                                        c2045607zq.getClass();
                                        if (str11.length() != 0) {
                                            synchronized (c2045607zq) {
                                                try {
                                                    c2045607zq.LJ.put(str11, Long.valueOf(j2));
                                                    c2045607zq.LIZIZ();
                                                } catch (Throwable th2) {
                                                    TryCatchGuardChecker.doCheck(th2);
                                                    throw th2;
                                                }
                                            }
                                        }
                                        c1797920wt4.LIZ++;
                                    }
                                }
                                LJII(privacyDataResult.key);
                                c1797920wt4.LIZJ++;
                            }
                        }
                    }
                    String str12 = c1797920wt4.LIZLLL;
                    if (str12 != null) {
                        str = "protocol_error";
                    } else if (c1797920wt4.LIZIZ > 0) {
                        str = "partial";
                    } else {
                        str = "success";
                    }
                    LJIIIIZZ(new C1797900wt2(0, c1797920wt4.LIZ, c1797920wt4.LIZIZ, c1797920wt4.LIZJ, str, str12), str5, jUptimeMillis);
                    if (privacyDataResponse != null) {
                        str2 = privacyDataResponse.message;
                    } else {
                        str2 = null;
                    }
                    pair = new Pair<>(0, str2);
                }
            } else {
                LJIIIIZZ(new C1797900wt2(-10001, "protocol_error", "missing_code"), str5, jUptimeMillis);
                pair = new Pair<>(-10001, "missing_code");
            }
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("network result empty, reason=");
            sbLIZ3.append(str5);
            sbLIZ3.append(", ");
            sbLIZ3.append(LIZLLL(list4));
            sbLIZ3.append(", exception=");
            Throwable th3 = c00yaLIZ.LIZIZ;
            if (th3 != null) {
                simpleName = th3.getClass().getSimpleName();
            } else {
                simpleName = null;
            }
            sbLIZ3.append(simpleName);
            sbLIZ3.append(", exceptionMsgLength=");
            Throwable th4 = c00yaLIZ.LIZIZ;
            if (th4 != null && (message2 = th4.getMessage()) != null) {
                length = message2.length();
            } else {
                length = 0;
            }
            sbLIZ3.append(length);
            C2188811AlT.LIZIZ(sbLIZ3);
            Throwable th5 = c00yaLIZ.LIZIZ;
            if (th5 == null || (message = th5.getMessage()) == null) {
                message = "network_error";
            }
            LJIIIIZZ(new C1797900wt2(-2, "fail", message), str5, jUptimeMillis);
            pair = new Pair<>(-2, message);
        }
        if (pair.getFirst().intValue() == 0) {
            C2026607wm c2026607wm = c1797910wt3.LJI;
            if (c2026607wm != null) {
                this.LJIIL.LIZJ(c2026607wm.LIZ, c2026607wm.LIZIZ);
            }
            LIZJ(c1797910wt3, pair);
            return;
        }
        int i2 = c1797910wt3.LJII;
        int i3 = this.LIZ.LJIIIZ;
        if (i3 < 0) {
            i3 = 0;
        }
        if (i2 < i3) {
            c1797910wt3.LJII = i2 + 1;
            LJIIJ(c1797910wt3);
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("network fetch failed, reason=");
        sbLIZ4.append(c1797910wt3.LIZIZ);
        sbLIZ4.append(", ");
        sbLIZ4.append(LIZLLL(c1797910wt3.LIZ));
        sbLIZ4.append(", errCode=");
        sbLIZ4.append(pair.getFirst().intValue());
        sbLIZ4.append(", errMsgLength=");
        String second = pair.getSecond();
        if (second != null) {
            length2 = second.length();
        } else {
            length2 = 0;
        }
        sbLIZ4.append(length2);
        C2188811AlT.LIZIZ(sbLIZ4);
        LIZJ(c1797910wt3, pair);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, Y.ARunnableS60S0300000_27] */
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
    public final void LJIIJ(C1797910wt3 c1797910wt3) {
        Object obj;
        boolean z;
        Runnable runnable;
        long j = this.LIZ.LJIIJ;
        if (j < 0) {
            j = 0;
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = new ARunnableS60S0300000_27(this, c1797910wt3, c259800zU, 18);
        synchronized (this.LJIIIIZZ) {
            try {
                obj = null;
                if (LJFF(c1797910wt3)) {
                    T t = c259800zU.element;
                    if (t == 0) {
                        runnable = null;
                    } else {
                        runnable = (Runnable) t;
                    }
                    c1797910wt3.LJIIIIZZ = runnable;
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (!z) {
            return;
        }
        Function2<Runnable, Long, Unit> function2 = this.LIZLLL;
        Object obj2 = c259800zU.element;
        if (obj2 != null) {
            obj = obj2;
        }
        function2.invoke(obj, Long.valueOf(j));
    }

    @Override // X.InterfaceC1903707cx
    public final String getData(String str) {
        if (!this.LIZ.LJII) {
            return "";
        }
        C747860TVg c747860TVg = this.LIZIZ;
        long jLongValue = this.LJFF.invoke().longValue();
        PrivacyDataCacheEntry privacyDataCacheEntryLIZJ = c747860TVg.LIZJ(str);
        if (privacyDataCacheEntryLIZJ == null || !privacyDataCacheEntryLIZJ.LIZ(jLongValue)) {
            return "";
        }
        return privacyDataCacheEntryLIZJ.value;
    }

    public final void LIZJ(C1797910wt3 c1797910wt3, Pair<Integer, String> pair) {
        synchronized (this.LJIIIIZZ) {
            try {
                if (!LJFF(c1797910wt3)) {
                    return;
                }
                this.LJIIIZ.remove(c1797910wt3.LIZLLL);
                this.LJII.remove(c1797910wt3.LIZLLL);
                Runnable runnable = c1797910wt3.LJIIIIZZ;
                c1797910wt3.LJIIIIZZ = null;
                if (runnable != null) {
                    this.LJ.invoke(runnable);
                }
                LIZLLL(c1797910wt3.LIZ);
                pair.getFirst().intValue();
                pair.getSecond();
                SystemClock.uptimeMillis();
                Function2<Integer, String, Unit> function2 = c1797910wt3.LIZJ;
                if (function2 != null) {
                    function2.invoke(pair.getFirst(), pair.getSecond());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJI(C1797880wt0 c1797880wt0, List list, String str) {
        if (c1797880wt0.LIZ.LJII) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(a0.LJLIIIL((String) it2.next()).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((String) obj).length() > 0) {
                    arrayList2.add(obj);
                }
            }
            List<String> listLJJJJI = C13LP.LJJJJI(arrayList2);
            c1797880wt0.LJIIJJI(listLJJJJI, str, null, C13LP.LJJLIIIJ(C13LP.LJLLJ(listLJJJJI), ",", e3.e, e3.f, 0, null, null, 56), null, null);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064 A[PHI: r1
      0x0064: PHI (r1v5 java.lang.String) = 
      (r1v0 java.lang.String)
      (r1v1 java.lang.String)
      (r1v2 java.lang.String)
      (r1v3 java.lang.String)
      (r1v4 java.lang.String)
      (r1v6 java.lang.String)
     binds: [B:26:0x0062, B:23:0x0059, B:20:0x0050, B:16:0x0043, B:13:0x003a, B:7:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(X.C1797900wt2 r6, java.lang.String r7, long r8) {
        /*
            java.util.concurrent.CopyOnWriteArrayList<X.00bL> r0 = X.C1514440pVq.LIZ
            int r0 = r7.hashCode()
            java.lang.String r2 = "push"
            switch(r0) {
                case -1097329270: goto L53;
                case -1081415738: goto L4a;
                case -408413369: goto L5c;
                case 3452698: goto L46;
                case 103149417: goto L3d;
                case 872271238: goto L34;
                case 987499314: goto L29;
                case 1984457027: goto L20;
                default: goto Lb;
            }
        Lb:
            java.lang.String r7 = r6.LIZ
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r8
            int r3 = r6.LIZIZ
            java.lang.String r8 = r6.LIZJ
            int r4 = r6.LIZLLL
            int r5 = r6.LJ
            int r6 = r6.LJFF
            X.C1514440pVq.LIZJ(r0, r2, r3, r4, r5, r6, r7, r8)
            return
        L20:
            java.lang.String r1 = "foreground"
            boolean r0 = r7.equals(r1)
            if (r0 != 0) goto L64
            goto Lb
        L29:
            java.lang.String r0 = "ttl_timer"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto Lb
            java.lang.String r2 = "expired"
            goto Lb
        L34:
            java.lang.String r1 = "account_switch"
            boolean r0 = r7.equals(r1)
            if (r0 != 0) goto L64
            goto Lb
        L3d:
            java.lang.String r1 = "login"
            boolean r0 = r7.equals(r1)
            if (r0 != 0) goto L64
            goto Lb
        L46:
            r7.equals(r2)
            goto Lb
        L4a:
            java.lang.String r1 = "manual"
            boolean r0 = r7.equals(r1)
            if (r0 != 0) goto L64
            goto Lb
        L53:
            java.lang.String r1 = "logout"
            boolean r0 = r7.equals(r1)
            if (r0 != 0) goto L64
            goto Lb
        L5c:
            java.lang.String r1 = "cold_start"
            boolean r0 = r7.equals(r1)
            if (r0 == 0) goto Lb
        L64:
            r2 = r1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1797880wt0.LJIIIIZZ(X.0wt2, java.lang.String, long):void");
    }

    public final void LJIIJJI(List<String> list, String str, Function2<? super Integer, ? super String, Unit> function2, String str2, JSONObject jSONObject, C2026607wm c2026607wm) {
        C1797910wt3 c1797910wt3;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this.LJIIIIZZ) {
            try {
                if (this.LJII.add(str2)) {
                    c1797910wt3 = new C1797910wt3(list, str, function2, jUptimeMillis, str2, this.LJIIJ, jSONObject, c2026607wm);
                    this.LJIIIZ.put(str2, c1797910wt3);
                } else {
                    c1797910wt3 = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (c1797910wt3 == null) {
            if (Intrinsics.LJFF(str, "push")) {
                C1797930wt5.LIZ(-20005, "in_flight");
            }
            if (function2 != null) {
                function2.invoke(-4, "in_flight");
                return;
            }
            return;
        }
        LJIIIZ(c1797910wt3);
    }
}
