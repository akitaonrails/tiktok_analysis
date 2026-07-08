package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.09El, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2338909El {
    public static final ConcurrentHashMap<Class<?>, Boolean> LIZ = new ConcurrentHashMap<>();
    public static final C01GW LIZIZ;
    public static final C01GW LIZJ;

    static {
        EnumC452301pR enumC452301pR = EnumC452301pR.SYNCHRONIZED;
        LIZIZ = C452501pT.LIZ(enumC452301pR, AFwS189S0000000_3.get$arr$(1093));
        LIZJ = C452501pT.LIZ(enumC452301pR, AFwS189S0000000_3.get$arr$(1094));
    }

    public static boolean LIZIZ(Class cls) {
        if (cls.isPrimitive() || cls.isEnum() || cls.isArray() || CharSequence.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls) || Intrinsics.LJFF(cls, Boolean.class) || Intrinsics.LJFF(cls, Character.class)) {
            return true;
        }
        String name = cls.getName();
        if (u.LJJIIJZLJL(name, "java.", false) || u.LJJIIJZLJL(name, "javax.", false) || u.LJJIIJZLJL(name, "kotlin.", false) || u.LJJIIJZLJL(name, "android.", false) || u.LJJIIJZLJL(name, "androidx.", false)) {
            return true;
        }
        return false;
    }

    public static String LIZJ(Object obj) {
        Object c098200Yq;
        Object obj2 = "";
        if (obj == null) {
            return "";
        }
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "aigc_arch_disable_workflow_verification", true, false)) {
            C844470XAv.LIZ.getClass();
            if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
                C470601sO c470601sO = C470601sO.LIZ;
                try {
                    LJ(obj);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!(th instanceof CancellationException)) {
                        c470601sO.getClass();
                        C470601sO.LIZ(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    } else {
                        throw th;
                    }
                }
            }
        }
        C470601sO c470601sO2 = C470601sO.LIZ;
        try {
            c098200Yq = ((Gson) LIZIZ.getValue()).LJIILL(obj);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            if (!(th2 instanceof CancellationException)) {
                c470601sO2.getClass();
                C470601sO.LIZ(th2);
                c098200Yq = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq);
            } else {
                throw th2;
            }
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        return (String) obj2;
    }

    public static void LIZLLL(Class cls) {
        if (LIZIZ(cls)) {
            return;
        }
        ConcurrentHashMap<Class<?>, Boolean> concurrentHashMap = LIZ;
        if (concurrentHashMap.containsKey(cls)) {
            return;
        }
        concurrentHashMap.put(cls, Boolean.TRUE);
        try {
            C089E c089e = new C089E(cls.getDeclaredFields());
            while (c089e.hasNext()) {
                Field field = (Field) c089e.next();
                if (!Modifier.isStatic(field.getModifiers()) && !Modifier.isTransient(field.getModifiers()) && !field.isSynthetic() && !Intrinsics.LJFF(field.getName(), "Companion")) {
                    if (field.getAnnotation(C09CT.class) == null) {
                        C470601sO c470601sO = C470601sO.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Field '");
                        sbLIZ.append(field.getName());
                        sbLIZ.append("' in ");
                        sbLIZ.append(cls.getName());
                        sbLIZ.append(" lacks @SerializedName annotation. This may cause serialization issues after obfuscation. To temporarily suppress this crash, enable AB switch 'aigc_arch_disable_workflow_verification'. NOTE: this is only a workaround — the missing @SerializedName still needs to be fixed at the source.");
                        IllegalStateException illegalStateException = new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                        c470601sO.getClass();
                        C470601sO.LIZ(illegalStateException);
                    }
                    if (!LIZIZ(field.getType())) {
                        LIZLLL(field.getType());
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C470601sO.LIZ.getClass();
            C470601sO.LIZ(th);
        }
    }

    public static void LJ(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Collection) {
            Iterator it2 = ((Iterable) obj).iterator();
            while (it2.hasNext()) {
                LJ(it2.next());
            }
        } else {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                Iterator it3 = map.keySet().iterator();
                while (it3.hasNext()) {
                    LJ(it3.next());
                }
                Iterator it4 = map.values().iterator();
                while (it4.hasNext()) {
                    LJ(it4.next());
                }
                return;
            }
            LIZLLL(obj.getClass());
        }
    }

    public static Object LIZ(String str, Type type) {
        boolean z;
        Object c098200Yq;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        C470601sO c470601sO = C470601sO.LIZ;
        try {
            c098200Yq = ((Gson) LIZIZ.getValue()).LJIIIIZZ(str, type);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!(th instanceof CancellationException)) {
                c470601sO.getClass();
                C470601sO.LIZ(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            } else {
                throw th;
            }
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return null;
        }
        return c098200Yq;
    }
}
