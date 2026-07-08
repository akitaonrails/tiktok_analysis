package X;

import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0pA3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1500930pA3<T> {
    public final Retrofit LIZ;
    public final Method LIZIZ;
    public final Annotation[] LIZJ;
    public final Annotation[][] LIZLLL;
    public final Type[] LJ;
    public final InterfaceC1500750p9l LJFF;
    public C09SJ<?, ?> LJI;
    public Type LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public String LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public String LJIILL;
    public AbstractC1500610p9X<?>[] LJIILLIIL;
    public InterfaceC1502010pBn LJIIZILJ;
    public long LJIJ = -1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v79 */
    /* JADX WARN: Type inference failed for: r1v93 */
    public final C1500720p9i LIZ() {
        C11OF c11ofLIZIZ;
        C1500650p9b c1500650p9b;
        Type genericReturnType = this.LIZIZ.getGenericReturnType();
        AbstractC1500610p9X<?> abstractC1500610p9X = null;
        int i = 1;
        int i2 = 0;
        if (C2397909aT.LJFF(genericReturnType)) {
            throw LIZIZ("Method return type must not include a type variable or wildcard: %s", null, genericReturnType);
        }
        if (genericReturnType == Void.TYPE) {
            throw LIZIZ("Service methods cannot return void.", null, new Object[0]);
        }
        Class<?> clsLJ = C2397909aT.LJ(genericReturnType);
        this.LJFF.getClass();
        Iterator it2 = ((ArrayList) C1501410pAp.LIZ).iterator();
        while (true) {
            if (!it2.hasNext()) {
                c11ofLIZIZ = null;
                break;
            }
            c11ofLIZIZ = ((InterfaceC1501340pAi) it2.next()).LIZIZ(clsLJ);
            if (c11ofLIZIZ != null) {
                break;
            }
        }
        this.LJIIZILJ = c11ofLIZIZ;
        if (c11ofLIZIZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Uplink Service Could not locate request adapter for: ");
            sbLIZ.append(genericReturnType);
            throw LIZIZ(C2188811AlT.LIZIZ(sbLIZ), null, new Object[0]);
        }
        try {
            C09SJ<?, ?> c09sjLIZIZ = this.LIZ.LIZIZ(null, genericReturnType, this.LIZIZ.getAnnotations());
            this.LJI = c09sjLIZIZ;
            this.LJII = c09sjLIZIZ.LIZ();
            for (Annotation annotation : this.LIZJ) {
                if (annotation instanceof C0X9N) {
                    throw LIZJ("DELETE", new Object[0]);
                }
                if (annotation instanceof InterfaceC1501160pAQ) {
                    LJ("GET", ((InterfaceC1501160pAQ) annotation).value(), false);
                } else {
                    if (annotation instanceof C0X9O) {
                        throw LIZJ("HEAD", new Object[0]);
                    }
                    if (annotation instanceof C0X9P) {
                        throw LIZJ("PATCH", new Object[0]);
                    }
                    if (annotation instanceof InterfaceC1501170pAR) {
                        LJ("POST", ((InterfaceC1501170pAR) annotation).value(), true);
                    } else {
                        if (annotation instanceof C0X9Q) {
                            throw LIZJ("PUT", new Object[0]);
                        }
                        if (annotation instanceof C0X7C) {
                            throw LIZJ("OPTIONS", new Object[0]);
                        }
                        if (annotation instanceof InterfaceC1501010pAB) {
                            throw LIZJ("HTTP", new Object[0]);
                        }
                        if (annotation instanceof InterfaceC1501310pAf) {
                            throw LIZJ("Headers", new Object[0]);
                        }
                        if (annotation instanceof C092G) {
                            throw LIZJ("Multipart", new Object[0]);
                        }
                        if (annotation instanceof InterfaceC1501300pAe) {
                            this.LJIILJJIL = true;
                        } else {
                            if (annotation instanceof InterfaceC2174608fY) {
                                throw LIZJ("Streaming", new Object[0]);
                            }
                            if (annotation instanceof InterfaceC1501320pAg) {
                                throw LIZJ("Priority", new Object[0]);
                            }
                            if (annotation instanceof InterfaceC844460XAu) {
                                throw LIZJ("ServiceType", new Object[0]);
                            }
                            if (annotation instanceof InterfaceC1501280pAc) {
                                this.LJIJ = ((InterfaceC1501280pAc) annotation).value();
                            }
                        }
                    }
                }
            }
            if (this.LJIIL == null) {
                throw LIZIZ("HTTP method annotation is required (e.g., @GET, @POST, etc.).", null, new Object[0]);
            }
            if (!this.LJIILIIL && this.LJIILJJIL) {
                throw LIZIZ("FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", null, new Object[0]);
            }
            int length = this.LIZLLL.length;
            this.LJIILLIIL = new AbstractC1500610p9X[length];
            int i3 = 0;
            while (i3 < length) {
                Type type = this.LJ[i3];
                if (C2397909aT.LJFF(type)) {
                    Object[] objArr = new Object[i];
                    objArr[i2] = type;
                    throw LIZLLL(i3, "Parameter type must not include a type variable or wildcard: %s", objArr);
                }
                Annotation[] annotationArr = this.LIZLLL[i3];
                if (annotationArr == null) {
                    throw LIZLLL(i3, "No Retrofit annotation found.", new Object[i2]);
                }
                AbstractC1500610p9X<?>[] abstractC1500610p9XArr = this.LJIILLIIL;
                int length2 = annotationArr.length;
                int i4 = 0;
                int i5 = i;
                while (i4 < length2) {
                    Annotation annotation2 = annotationArr[i4];
                    if (annotation2 instanceof InterfaceC2174708fZ) {
                        if (this.LJIIJJI) {
                            throw LIZLLL(i3, "Multiple @Url method annotations found.", new Object[i2]);
                        }
                        if (this.LJIIJ) {
                            throw LIZLLL(i3, "A @Url parameter must not come after a @Query", new Object[i2]);
                        }
                        if (this.LJIILL != null) {
                            Object[] objArr2 = new Object[i5];
                            objArr2[i2] = this.LJIIL;
                            throw LIZLLL(i3, "@Url cannot be used with @%s URL", objArr2);
                        }
                        this.LJIIJJI = i5;
                        if (type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                            throw LIZLLL(i3, "@Url must be String, java.net.URI, or android.net.Uri type.", new Object[i2]);
                        }
                        c1500650p9b = (AbstractC1500610p9X<Map<String, T>>) new AbstractC1500610p9X<Object>() { // from class: X.0p9Z
                            @Override // X.AbstractC1500610p9X
                            public final void LIZ(C1500660p9c c1500660p9c, Object obj) {
                                String string = obj.toString();
                                if (string != null) {
                                    string.toString();
                                    c1500660p9c.LIZ = string;
                                    return;
                                }
                                throw new NullPointerException("@Url parameter is null.");
                            }
                        };
                    } else {
                        if (annotation2 instanceof InterfaceC1501060pAG) {
                            throw LIZJ("Path", new Object[i2]);
                        }
                        if (annotation2 instanceof InterfaceC1501070pAH) {
                            InterfaceC1501070pAH interfaceC1501070pAH = (InterfaceC1501070pAH) annotation2;
                            final String strValue = interfaceC1501070pAH.value();
                            final boolean zEncode = interfaceC1501070pAH.encode();
                            Class<?> clsLJ2 = C2397909aT.LJ(type);
                            this.LJIIJ = i5;
                            if (Iterable.class.isAssignableFrom(clsLJ2)) {
                                if (!(type instanceof ParameterizedType)) {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append(clsLJ2.getSimpleName());
                                    sbLIZ2.append(" must include generic type (e.g., ");
                                    sbLIZ2.append(clsLJ2.getSimpleName());
                                    sbLIZ2.append("<String>)");
                                    throw LIZLLL(i3, C2188811AlT.LIZIZ(sbLIZ2), new Object[0]);
                                }
                                final InterfaceC1501660pBE<T, String> interfaceC1501660pBELJFF = this.LIZ.LJFF(C2397909aT.LIZLLL(0, (ParameterizedType) type), annotationArr);
                                final AbstractC1500610p9X<T> abstractC1500610p9X2 = new AbstractC1500610p9X<T>(strValue, interfaceC1501660pBELJFF, zEncode) { // from class: X.0p9W
                                    public final String LIZ;
                                    public final InterfaceC1501660pBE<T, String> LIZIZ;
                                    public final boolean LIZJ;

                                    @Override // X.AbstractC1500610p9X
                                    public final void LIZ(C1500660p9c c1500660p9c, T t) {
                                        if (t == null) {
                                            return;
                                        }
                                        c1500660p9c.LIZIZ(this.LIZ, this.LIZIZ.LIZ(t), this.LIZJ);
                                    }

                                    {
                                        if (strValue != null) {
                                            this.LIZ = strValue;
                                            this.LIZIZ = interfaceC1501660pBELJFF;
                                            this.LIZJ = zEncode;
                                            return;
                                        }
                                        throw new NullPointerException("name == null");
                                    }
                                };
                                c1500650p9b = (AbstractC1500610p9X<Map<String, T>>) new AbstractC1500610p9X<Iterable<Object>>() { // from class: X.0p9Y
                                    @Override // X.AbstractC1500610p9X
                                    public final void LIZ(C1500660p9c c1500660p9c, Iterable<Object> iterable) {
                                        Iterable<Object> iterable2 = iterable;
                                        if (iterable2 != null) {
                                            Iterator<Object> it3 = iterable2.iterator();
                                            while (it3.hasNext()) {
                                                abstractC1500610p9X2.LIZ(c1500660p9c, it3.next());
                                            }
                                        }
                                    }
                                };
                            } else if (clsLJ2.isArray()) {
                                final InterfaceC1501660pBE<T, String> interfaceC1501660pBELJFF2 = this.LIZ.LJFF(C1500720p9i.LIZ(clsLJ2.getComponentType()), annotationArr);
                                final AbstractC1500610p9X<T> abstractC1500610p9X3 = new AbstractC1500610p9X<T>(strValue, interfaceC1501660pBELJFF2, zEncode) { // from class: X.0p9W
                                    public final String LIZ;
                                    public final InterfaceC1501660pBE<T, String> LIZIZ;
                                    public final boolean LIZJ;

                                    @Override // X.AbstractC1500610p9X
                                    public final void LIZ(C1500660p9c c1500660p9c, T t) {
                                        if (t == null) {
                                            return;
                                        }
                                        c1500660p9c.LIZIZ(this.LIZ, this.LIZIZ.LIZ(t), this.LIZJ);
                                    }

                                    {
                                        if (strValue != null) {
                                            this.LIZ = strValue;
                                            this.LIZIZ = interfaceC1501660pBELJFF2;
                                            this.LIZJ = zEncode;
                                            return;
                                        }
                                        throw new NullPointerException("name == null");
                                    }
                                };
                                c1500650p9b = (AbstractC1500610p9X<Map<String, T>>) new AbstractC1500610p9X<Object>() { // from class: X.0p9a
                                    @Override // X.AbstractC1500610p9X
                                    public final void LIZ(C1500660p9c c1500660p9c, Object obj) {
                                        if (obj == null) {
                                            return;
                                        }
                                        int length3 = Array.getLength(obj);
                                        for (int i6 = 0; i6 < length3; i6++) {
                                            abstractC1500610p9X3.LIZ(c1500660p9c, Array.get(obj, i6));
                                        }
                                    }
                                };
                            } else {
                                final InterfaceC1501660pBE<T, String> interfaceC1501660pBELJFF3 = this.LIZ.LJFF(type, annotationArr);
                                c1500650p9b = new AbstractC1500610p9X<T>(strValue, interfaceC1501660pBELJFF3, zEncode) { // from class: X.0p9W
                                    public final String LIZ;
                                    public final InterfaceC1501660pBE<T, String> LIZIZ;
                                    public final boolean LIZJ;

                                    @Override // X.AbstractC1500610p9X
                                    public final void LIZ(C1500660p9c c1500660p9c, T t) {
                                        if (t == null) {
                                            return;
                                        }
                                        c1500660p9c.LIZIZ(this.LIZ, this.LIZIZ.LIZ(t), this.LIZJ);
                                    }

                                    {
                                        if (strValue != null) {
                                            this.LIZ = strValue;
                                            this.LIZIZ = interfaceC1501660pBELJFF3;
                                            this.LIZJ = zEncode;
                                            return;
                                        }
                                        throw new NullPointerException("name == null");
                                    }
                                };
                            }
                        } else {
                            if (annotation2 instanceof InterfaceC1501140pAO) {
                                throw LIZJ("QueryName", new Object[i2]);
                            }
                            if (annotation2 instanceof InterfaceC1501130pAN) {
                                Class<?> clsLJ3 = C2397909aT.LJ(type);
                                if (!Map.class.isAssignableFrom(clsLJ3)) {
                                    throw LIZLLL(i3, "@QueryMap parameter type must be Map.", new Object[0]);
                                }
                                if (!Map.class.isAssignableFrom(clsLJ3)) {
                                    throw new IllegalArgumentException();
                                }
                                Type typeLJI = C2397909aT.LJI(type, clsLJ3, C2397909aT.LIZJ(type, clsLJ3, Map.class));
                                if (!(typeLJI instanceof ParameterizedType)) {
                                    throw LIZLLL(i3, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                }
                                ParameterizedType parameterizedType = (ParameterizedType) typeLJI;
                                Type typeLIZLLL = C2397909aT.LIZLLL(0, parameterizedType);
                                if (String.class != typeLIZLLL) {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("@QueryMap keys must be of type String: ");
                                    sbLIZ3.append(typeLIZLLL);
                                    throw LIZLLL(i3, C2188811AlT.LIZIZ(sbLIZ3), new Object[0]);
                                }
                                final InterfaceC1501660pBE<T, String> interfaceC1501660pBELJFF4 = this.LIZ.LJFF(C2397909aT.LIZLLL(1, parameterizedType), annotationArr);
                                final boolean zEncode2 = ((InterfaceC1501130pAN) annotation2).encode();
                                c1500650p9b = new AbstractC1500610p9X<Map<String, T>>(interfaceC1501660pBELJFF4, zEncode2) { // from class: X.0p9U
                                    public final InterfaceC1501660pBE<T, String> LIZ;
                                    public final boolean LIZIZ;

                                    {
                                        this.LIZ = interfaceC1501660pBELJFF4;
                                        this.LIZIZ = zEncode2;
                                    }

                                    @Override // X.AbstractC1500610p9X
                                    public final void LIZ(C1500660p9c c1500660p9c, Object obj) {
                                        Map map = (Map) obj;
                                        if (map != null) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                String str = (String) entry.getKey();
                                                if (str != null) {
                                                    Object value = entry.getValue();
                                                    if (value != null) {
                                                        c1500660p9c.LIZIZ(str, this.LIZ.LIZ((T) value), this.LIZIZ);
                                                    }
                                                } else {
                                                    throw new IllegalArgumentException("Query map contained null key.");
                                                }
                                            }
                                        }
                                    }
                                };
                            } else {
                                if (annotation2 instanceof InterfaceC1501350pAj) {
                                    throw LIZJ("Header", new Object[0]);
                                }
                                if (annotation2 instanceof InterfaceC2174808fa) {
                                    throw LIZJ("HeaderList", new Object[0]);
                                }
                                if (annotation2 instanceof InterfaceC2175608fi) {
                                    throw LIZJ("HeaderMap", new Object[0]);
                                }
                                if (annotation2 instanceof InterfaceC1501050pAF) {
                                    if (!this.LJIILJJIL) {
                                        throw LIZLLL(i3, "@Field parameters can only be used with form encoding.", new Object[0]);
                                    }
                                    InterfaceC1501050pAF interfaceC1501050pAF = (InterfaceC1501050pAF) annotation2;
                                    final String strValue2 = interfaceC1501050pAF.value();
                                    final boolean zEncode3 = interfaceC1501050pAF.encode();
                                    this.LJIIIIZZ = true;
                                    Class<?> clsLJ4 = C2397909aT.LJ(type);
                                    if (Iterable.class.isAssignableFrom(clsLJ4)) {
                                        if (!(type instanceof ParameterizedType)) {
                                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                            sbLIZ4.append(clsLJ4.getSimpleName());
                                            sbLIZ4.append(" must include generic type (e.g., ");
                                            sbLIZ4.append(clsLJ4.getSimpleName());
                                            sbLIZ4.append("<String>)");
                                            throw LIZLLL(i3, C2188811AlT.LIZIZ(sbLIZ4), new Object[0]);
                                        }
                                        final InterfaceC1501660pBE<T, String> interfaceC1501660pBELJFF5 = this.LIZ.LJFF(C2397909aT.LIZLLL(0, (ParameterizedType) type), annotationArr);
                                        final AbstractC1500610p9X<T> abstractC1500610p9X4 = new AbstractC1500610p9X<T>(strValue2, interfaceC1501660pBELJFF5, zEncode3) { // from class: X.0p9V
                                            public final String LIZ;
                                            public final InterfaceC1501660pBE<T, String> LIZIZ;
                                            public final boolean LIZJ;

                                            @Override // X.AbstractC1500610p9X
                                            public final void LIZ(C1500660p9c c1500660p9c, T t) {
                                                if (t == null) {
                                                    return;
                                                }
                                                c1500660p9c.LIZ(this.LIZ, this.LIZIZ.LIZ(t), this.LIZJ);
                                            }

                                            {
                                                if (strValue2 != null) {
                                                    this.LIZ = strValue2;
                                                    this.LIZIZ = interfaceC1501660pBELJFF5;
                                                    this.LIZJ = zEncode3;
                                                    return;
                                                }
                                                throw new NullPointerException("name == null");
                                            }
                                        };
                                        c1500650p9b = (AbstractC1500610p9X<Map<String, T>>) new AbstractC1500610p9X<Iterable<Object>>() { // from class: X.0p9Y
                                            @Override // X.AbstractC1500610p9X
                                            public final void LIZ(C1500660p9c c1500660p9c, Iterable<Object> iterable) {
                                                Iterable<Object> iterable2 = iterable;
                                                if (iterable2 != null) {
                                                    Iterator<Object> it3 = iterable2.iterator();
                                                    while (it3.hasNext()) {
                                                        abstractC1500610p9X4.LIZ(c1500660p9c, it3.next());
                                                    }
                                                }
                                            }
                                        };
                                    } else if (clsLJ4.isArray()) {
                                        final InterfaceC1501660pBE<T, String> interfaceC1501660pBELJFF6 = this.LIZ.LJFF(C1500720p9i.LIZ(clsLJ4.getComponentType()), annotationArr);
                                        final AbstractC1500610p9X<T> abstractC1500610p9X5 = new AbstractC1500610p9X<T>(strValue2, interfaceC1501660pBELJFF6, zEncode3) { // from class: X.0p9V
                                            public final String LIZ;
                                            public final InterfaceC1501660pBE<T, String> LIZIZ;
                                            public final boolean LIZJ;

                                            @Override // X.AbstractC1500610p9X
                                            public final void LIZ(C1500660p9c c1500660p9c, T t) {
                                                if (t == null) {
                                                    return;
                                                }
                                                c1500660p9c.LIZ(this.LIZ, this.LIZIZ.LIZ(t), this.LIZJ);
                                            }

                                            {
                                                if (strValue2 != null) {
                                                    this.LIZ = strValue2;
                                                    this.LIZIZ = interfaceC1501660pBELJFF6;
                                                    this.LIZJ = zEncode3;
                                                    return;
                                                }
                                                throw new NullPointerException("name == null");
                                            }
                                        };
                                        c1500650p9b = (AbstractC1500610p9X<Map<String, T>>) new AbstractC1500610p9X<Object>() { // from class: X.0p9a
                                            @Override // X.AbstractC1500610p9X
                                            public final void LIZ(C1500660p9c c1500660p9c, Object obj) {
                                                if (obj == null) {
                                                    return;
                                                }
                                                int length3 = Array.getLength(obj);
                                                for (int i6 = 0; i6 < length3; i6++) {
                                                    abstractC1500610p9X5.LIZ(c1500660p9c, Array.get(obj, i6));
                                                }
                                            }
                                        };
                                    } else {
                                        final InterfaceC1501660pBE<T, String> interfaceC1501660pBELJFF7 = this.LIZ.LJFF(type, annotationArr);
                                        c1500650p9b = new AbstractC1500610p9X<T>(strValue2, interfaceC1501660pBELJFF7, zEncode3) { // from class: X.0p9V
                                            public final String LIZ;
                                            public final InterfaceC1501660pBE<T, String> LIZIZ;
                                            public final boolean LIZJ;

                                            @Override // X.AbstractC1500610p9X
                                            public final void LIZ(C1500660p9c c1500660p9c, T t) {
                                                if (t == null) {
                                                    return;
                                                }
                                                c1500660p9c.LIZ(this.LIZ, this.LIZIZ.LIZ(t), this.LIZJ);
                                            }

                                            {
                                                if (strValue2 != null) {
                                                    this.LIZ = strValue2;
                                                    this.LIZIZ = interfaceC1501660pBELJFF7;
                                                    this.LIZJ = zEncode3;
                                                    return;
                                                }
                                                throw new NullPointerException("name == null");
                                            }
                                        };
                                    }
                                } else if (annotation2 instanceof InterfaceC1501150pAP) {
                                    if (!this.LJIILJJIL) {
                                        throw LIZLLL(i3, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                    }
                                    Class<?> clsLJ5 = C2397909aT.LJ(type);
                                    if (!Map.class.isAssignableFrom(clsLJ5)) {
                                        throw LIZLLL(i3, "@FieldMap parameter type must be Map.", new Object[0]);
                                    }
                                    if (!Map.class.isAssignableFrom(clsLJ5)) {
                                        throw new IllegalArgumentException();
                                    }
                                    Type typeLJI2 = C2397909aT.LJI(type, clsLJ5, C2397909aT.LIZJ(type, clsLJ5, Map.class));
                                    if (!(typeLJI2 instanceof ParameterizedType)) {
                                        throw LIZLLL(i3, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                    }
                                    ParameterizedType parameterizedType2 = (ParameterizedType) typeLJI2;
                                    Type typeLIZLLL2 = C2397909aT.LIZLLL(0, parameterizedType2);
                                    if (String.class != typeLIZLLL2) {
                                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                        sbLIZ5.append("@FieldMap keys must be of type String: ");
                                        sbLIZ5.append(typeLIZLLL2);
                                        throw LIZLLL(i3, C2188811AlT.LIZIZ(sbLIZ5), new Object[0]);
                                    }
                                    final InterfaceC1501660pBE<T, String> interfaceC1501660pBELJFF8 = this.LIZ.LJFF(C2397909aT.LIZLLL(1, parameterizedType2), annotationArr);
                                    this.LJIIIIZZ = true;
                                    final boolean zEncode4 = ((InterfaceC1501150pAP) annotation2).encode();
                                    c1500650p9b = new AbstractC1500610p9X<Map<String, T>>(interfaceC1501660pBELJFF8, zEncode4) { // from class: X.0p9T
                                        public final InterfaceC1501660pBE<T, String> LIZ;
                                        public final boolean LIZIZ;

                                        {
                                            this.LIZ = interfaceC1501660pBELJFF8;
                                            this.LIZIZ = zEncode4;
                                        }

                                        @Override // X.AbstractC1500610p9X
                                        public final void LIZ(C1500660p9c c1500660p9c, Object obj) {
                                            Map map = (Map) obj;
                                            if (map != null) {
                                                for (Map.Entry entry : map.entrySet()) {
                                                    String str = (String) entry.getKey();
                                                    if (str != null) {
                                                        Object value = entry.getValue();
                                                        if (value != null) {
                                                            c1500660p9c.LIZ(str, this.LIZ.LIZ((T) value), this.LIZIZ);
                                                        } else {
                                                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                                            sbLIZ6.append("Field map contained null value for key '");
                                                            sbLIZ6.append(str);
                                                            sbLIZ6.append("'.");
                                                            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ6));
                                                        }
                                                    } else {
                                                        throw new IllegalArgumentException("Field map contained null key.");
                                                    }
                                                }
                                                return;
                                            }
                                            throw new IllegalArgumentException("Field map was null.");
                                        }
                                    };
                                } else {
                                    if (annotation2 instanceof InterfaceC1501030pAD) {
                                        throw LIZJ("Part", new Object[0]);
                                    }
                                    if (annotation2 instanceof InterfaceC1501080pAI) {
                                        throw LIZJ("PartMap", new Object[0]);
                                    }
                                    if (!(annotation2 instanceof InterfaceC1485405rg)) {
                                        if (annotation2 instanceof InterfaceC1501360pAk) {
                                            throw LIZJ("Method", new Object[0]);
                                        }
                                        if (annotation2 instanceof InterfaceC2174908fb) {
                                            throw LIZJ("MaxLength", new Object[0]);
                                        }
                                        if (annotation2 instanceof InterfaceC820680WHi) {
                                            throw LIZJ("AddCommonParam", new Object[0]);
                                        }
                                        if (annotation2 instanceof InterfaceC2177008fw) {
                                            throw LIZJ("ExtraInfo", new Object[0]);
                                        }
                                        if (annotation2 instanceof InterfaceC1501380pAm) {
                                            throw LIZJ("QueryObject", new Object[0]);
                                        }
                                        if (annotation2 instanceof C040F) {
                                            throw LIZJ("Tag", new Object[0]);
                                        }
                                        throw LIZJ(annotation2.toString(), new Object[0]);
                                    }
                                    if (this.LJIILJJIL) {
                                        throw LIZLLL(i3, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                    }
                                    if (this.LJIIIZ) {
                                        throw LIZLLL(i3, "Multiple @Body method annotations found.", new Object[0]);
                                    }
                                    if (AbstractC842530X3j.class.isAssignableFrom(C2397909aT.LJ(type))) {
                                        throw LIZIZ("uplink not support RequestBody", null, new Object[0]);
                                    }
                                    try {
                                        InterfaceC1501660pBE<T, TypedOutput> interfaceC1501660pBELIZLLL = this.LIZ.LIZLLL(type, annotationArr, this.LIZJ);
                                        this.LJIIIZ = true;
                                        c1500650p9b = new C1500650p9b(interfaceC1501660pBELIZLLL);
                                    } catch (RuntimeException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        Object[] objArr3 = {type};
                                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                        sbLIZ6.append("Unable to create @Body converter for %s");
                                        sbLIZ6.append(" (parameter #");
                                        sbLIZ6.append(i3 + 1);
                                        sbLIZ6.append(")");
                                        throw LIZIZ(C2188811AlT.LIZIZ(sbLIZ6), e, objArr3);
                                    }
                                }
                            }
                        }
                    }
                    if (abstractC1500610p9X != null) {
                        throw LIZLLL(i3, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                    }
                    i4++;
                    abstractC1500610p9X = c1500650p9b;
                    i5 = 1;
                    i2 = 0;
                }
                if (abstractC1500610p9X == null) {
                    throw LIZLLL(i3, "No Retrofit annotation found.", new Object[i2]);
                }
                abstractC1500610p9XArr[i3] = abstractC1500610p9X;
                i3++;
                abstractC1500610p9X = null;
                i = i5;
            }
            if (this.LJIILL == null && !this.LJIIJJI) {
                Object[] objArr4 = new Object[i];
                objArr4[i2] = this.LJIIL;
                throw LIZIZ("Missing either @%s URL or @Url parameter.", null, objArr4);
            }
            boolean z = this.LJIILJJIL;
            if (z) {
                if (z && !this.LJIIIIZZ) {
                    throw LIZIZ("Form-encode method must contain at least one @Field.", null, new Object[i2]);
                }
            } else if (!this.LJIILIIL && this.LJIIIZ) {
                throw LIZIZ("Non-body HTTP method cannot contain @Body.", null, new Object[i2]);
            }
            return new C1500720p9i(this);
        } catch (RuntimeException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw LIZIZ("Unable to create call adapter for %s", e2, genericReturnType);
        }
    }

    public final RuntimeException LIZJ(String str, Object... objArr) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uplink not support annotation: ");
        sbLIZ.append(str);
        return LIZIZ(C2188811AlT.LIZIZ(sbLIZ), null, objArr);
    }

    public C1500930pA3(Retrofit retrofit, Method method, C1501980pBk c1501980pBk) {
        this.LIZ = retrofit;
        this.LIZIZ = method;
        this.LIZJ = method.getAnnotations();
        this.LJ = method.getGenericParameterTypes();
        this.LIZLLL = method.getParameterAnnotations();
        this.LJFF = c1501980pBk;
    }

    public final RuntimeException LIZIZ(String str, Throwable th, Object... objArr) {
        String strJ4 = C786410Ut5.j4(str, objArr);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strJ4);
        sbLIZ.append("\n    for method ");
        sbLIZ.append(this.LIZIZ.getDeclaringClass().getSimpleName());
        sbLIZ.append(e3.d);
        sbLIZ.append(this.LIZIZ.getName());
        return new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ), th);
    }

    public final RuntimeException LIZLLL(int i, String str, Object... objArr) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" (parameter #");
        sbLIZ.append(i + 1);
        sbLIZ.append(")");
        return LIZIZ(C2188811AlT.LIZIZ(sbLIZ), null, objArr);
    }

    public final void LJ(String str, String str2, boolean z) {
        String str3 = this.LJIIL;
        if (str3 == null) {
            this.LJIIL = str;
            Pattern pattern = C1500720p9i.LJIIIIZZ;
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                matcher.group(1);
            }
            this.LJIILIIL = z;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (pattern.matcher(strSubstring).find()) {
                    throw LIZIZ("URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", null, strSubstring);
                }
            }
            this.LJIILL = str2;
            Matcher matcher2 = pattern.matcher(str2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher2.find()) {
                linkedHashSet.add(matcher2.group(1));
            }
            return;
        }
        throw LIZIZ("Only one HTTP method is allowed. Found: %s and %s.", null, str3, str);
    }
}
