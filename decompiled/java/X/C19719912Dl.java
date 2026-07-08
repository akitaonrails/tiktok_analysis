package X;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.12Dl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19719912Dl implements C13IQ<Object>, InterfaceC2217411BqV {
    public static final C1867210ygp LLILLJJLI;
    public static final Map<Class<? extends InterfaceC1451105m9<?>>, Integer> LLILLL;
    public static final HashMap<String, String> LLILZ;
    public static final Map<String, String> LLILZIL;
    public final Class<?> LL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0ygp] */
    static {
        final DefaultConstructorMarker defaultConstructorMarker = null;
        LLILLJJLI = new Object(defaultConstructorMarker) { // from class: X.0ygp
        };
        int i = 0;
        List listLJIIJJI = C1697810uHb.LJIIJJI(Function0.class, Function1.class, Function2.class, InterfaceC1631620sYq.class, InterfaceC1631630sYr.class, InterfaceC1685420txc.class, InterfaceC1685430txd.class, InterfaceC2280171EMt.class, InterfaceC2280181EMu.class, InterfaceC2280191EMv.class, InterfaceC2280201EMw.class, InterfaceC2280211EMx.class, InterfaceC2280221EMy.class, InterfaceC2280231EMz.class, C1EN0.class, C1EN1.class, C1EN2.class, C1EN3.class, C1EN4.class, C1EN5.class, C1EN6.class, C1EN7.class, C1EN8.class);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIJJI, 10));
        for (Object obj : listLJIIJJI) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            arrayList.add(new Pair(obj, Integer.valueOf(i)));
            i = i2;
        }
        LLILLL = C2097608Jq.LJIILLIIL(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        for (String str : map.values()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("kotlin.jvm.internal.");
            sbLIZ.append(a0.LJJLJ('.', str, str));
            sbLIZ.append("CompanionObject");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(".Companion");
            Pair pair = new Pair(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
            map3.put(pair.getFirst(), pair.getSecond());
        }
        for (Map.Entry<Class<? extends InterfaceC1451105m9<?>>, Integer> entry : LLILLL.entrySet()) {
            Class<? extends InterfaceC1451105m9<?>> key = entry.getKey();
            int iIntValue = entry.getValue().intValue();
            String name = key.getName();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("kotlin.Function");
            sbLIZ3.append(iIntValue);
            map3.put(name, C2188811AlT.LIZIZ(sbLIZ3));
        }
        LLILZ = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key2 = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key2, a0.LJJLJ('.', str2, str2));
        }
        LLILZIL = linkedHashMap;
    }

    @Override // X.C13IQ
    public final String LIZLLL() {
        String str;
        C1867210ygp c1867210ygp = LLILLJJLI;
        Class<?> cls = this.LL;
        c1867210ygp.getClass();
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String str2 = LLILZ.get(cls.getName());
            return str2 == null ? cls.getCanonicalName() : str2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (str = LLILZ.get(componentType.getName())) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("Array");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (strLIZIZ != null) {
                return strLIZIZ;
            }
        }
        return "kotlin.Array";
    }

    @Override // X.C13IQ
    public final String LJI() {
        C1867210ygp c1867210ygp = LLILLJJLI;
        Class<?> cls = this.LL;
        c1867210ygp.getClass();
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String str = (String) ((LinkedHashMap) LLILZIL).get(cls.getName());
                return str == null ? cls.getSimpleName() : str;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive()) {
                String str2 = (String) ((LinkedHashMap) LLILZIL).get(componentType.getName());
                if (str2 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str2);
                    sbLIZ.append("Array");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    if (strLIZIZ != null) {
                        return strLIZIZ;
                    }
                }
            }
            return "Array";
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(enclosingMethod.getName());
            sbLIZ2.append('$');
            String strLJJLIL = a0.LJJLIL(simpleName, C2188811AlT.LIZIZ(sbLIZ2), simpleName);
            if (strLJJLIL != null) {
                return strLJJLIL;
            }
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return a0.LJJLIIJ('$', simpleName, simpleName);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(enclosingConstructor.getName());
        sbLIZ3.append('$');
        return a0.LJJLIL(simpleName, C2188811AlT.LIZIZ(sbLIZ3), simpleName);
    }

    @Override // X.C13IQ
    public final int hashCode() {
        return C09R7.LIZIZ(this).hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(" (Kotlin reflection is not available)");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC2217411BqV
    public final Class<?> LIZJ() {
        return this.LL;
    }

    public C19719912Dl(Class<?> cls) {
        this.LL = cls;
    }

    @Override // X.C13IQ
    public final boolean LIZIZ(Object obj) {
        C1867210ygp c1867210ygp = LLILLJJLI;
        Class<?> clsLIZIZ = this.LL;
        c1867210ygp.getClass();
        Integer num = LLILLL.get(clsLIZIZ);
        if (num != null) {
            return C19719512Dh.LJFF(num.intValue(), obj);
        }
        if (clsLIZIZ.isPrimitive()) {
            clsLIZIZ = C09R7.LIZIZ(C13LE.LIZ(clsLIZIZ));
        }
        return clsLIZIZ.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C19719912Dl) && Intrinsics.LJFF(C09R7.LIZIZ(this), C09R7.LIZIZ((C13IQ) obj))) {
            return true;
        }
        return false;
    }
}
