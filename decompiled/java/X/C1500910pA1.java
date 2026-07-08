package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.retrofit2.ParameterHandler;
import com.bytedance.retrofit2.RequestBuilder;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0pA1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1500910pA1<T> {
    public static final Pattern LJJIJIIJI = PatternProtector.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
    public static final Pattern LJJIJIIJIL = PatternProtector.compile("[a-zA-Z][a-zA-Z0-9_-]*");
    public final Retrofit LIZ;
    public final Method LIZIZ;
    public final Annotation[] LIZJ;
    public final Annotation[][] LIZLLL;
    public final Type[] LJ;
    public final C1494570ozn LJFF;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public String LJIJJLI;
    public boolean LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public String LJJIFFI;
    public List<C080U> LJJII;
    public String LJJIII;
    public Set<String> LJJIIJ;
    public String LJJIIJZLJL;
    public ParameterHandler<?>[] LJJIIZ;
    public boolean LJJIIZI;
    public boolean LJJIJ;
    public int LJI = 1;
    public String LJII = "";
    public int LJIIJJI = 3;

    public static Class<?> LIZ(Class<?> cls) {
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        if (Short.TYPE == cls) {
            return Short.class;
        }
        return cls;
    }

    public final List<C080U> LIZJ(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int iIndexOf = str.indexOf(58);
            if (iIndexOf != -1 && iIndexOf != 0 && iIndexOf != str.length() - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                String strTrim = str.substring(iIndexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                    this.LJJIII = strTrim;
                } else {
                    arrayList.add(new C080U(strSubstring, strTrim));
                }
            } else {
                throw C2396109aB.LJIIIZ(this.LIZIZ, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
            }
        }
        return arrayList;
    }

    public static C0X1V LIZIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("form-data; name=\"");
        sbLIZ.append(str);
        sbLIZ.append("\"");
        return C0X1V.LJII("Content-Disposition", C2188811AlT.LIZIZ(sbLIZ), "Content-Transfer-Encoding", str2);
    }

    public final void LJI(int i, String str) {
        try {
            if (!LJJIJIIJIL.matcher(str).matches()) {
                throw C2396109aB.LJIIJ(this.LIZIZ, i, "@Path parameter name must match %s. Found: %s", LJJIJIIJI.pattern(), str);
            }
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            if (e.getMessage().contains("@Path parameter name must match")) {
                throw e;
            }
        }
        if (this.LJJIIJ.contains(str)) {
        } else {
            throw C2396109aB.LJIIJ(this.LIZIZ, i, "URL \"%s\" does not contain \"{%s}\".", this.LJJIFFI, str);
        }
    }

    public final void LJII(int i, Type type) {
        if (!C2396109aB.LJII(type)) {
        } else {
            throw C2396109aB.LJIIJ(this.LIZIZ, i, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }

    public C1500910pA1(Retrofit retrofit, Method method, C1494570ozn c1494570ozn) {
        this.LIZ = retrofit;
        this.LIZIZ = method;
        this.LIZJ = method.getAnnotations();
        this.LJ = method.getGenericParameterTypes();
        this.LIZLLL = method.getParameterAnnotations();
        this.LJFF = c1494570ozn;
    }

    public static ParameterHandler LJFF(String str, String str2, Type type) {
        Class<?> clsLJFF = C2396109aB.LJFF(type);
        if (TextUtils.isEmpty(str)) {
            if (Iterable.class.isAssignableFrom(clsLJFF)) {
                if ((type instanceof ParameterizedType) && C0X76.class.isAssignableFrom(C2396109aB.LJFF(C2396109aB.LJ(0, (ParameterizedType) type)))) {
                    return new ParameterHandler<C0X76>() { // from class: X.0p94
                        @Override // com.bytedance.retrofit2.ParameterHandler
                        public final void apply(RequestBuilder requestBuilder, C0X76 c0x76) {
                            C0X76 c0x762 = c0x76;
                            if (c0x762 != null) {
                                requestBuilder.LJIJJ.LIZJ(c0x762);
                            }
                            requestBuilder.LJIL = true;
                        }
                    }.iterable();
                }
            } else if (clsLJFF.isArray()) {
                if (C0X76.class.isAssignableFrom(clsLJFF.getComponentType())) {
                    return new ParameterHandler<C0X76>() { // from class: X.0p94
                        @Override // com.bytedance.retrofit2.ParameterHandler
                        public final void apply(RequestBuilder requestBuilder, C0X76 c0x76) {
                            C0X76 c0x762 = c0x76;
                            if (c0x762 != null) {
                                requestBuilder.LJIJJ.LIZJ(c0x762);
                            }
                            requestBuilder.LJIL = true;
                        }
                    }.array();
                }
            } else if (C0X76.class.isAssignableFrom(clsLJFF)) {
                return new ParameterHandler<C0X76>() { // from class: X.0p94
                    @Override // com.bytedance.retrofit2.ParameterHandler
                    public final void apply(RequestBuilder requestBuilder, C0X76 c0x76) {
                        C0X76 c0x762 = c0x76;
                        if (c0x762 != null) {
                            requestBuilder.LJIJJ.LIZJ(c0x762);
                        }
                        requestBuilder.LJIL = true;
                    }
                };
            }
        } else if (Iterable.class.isAssignableFrom(clsLJFF)) {
            if ((type instanceof ParameterizedType) && AbstractC842530X3j.class.isAssignableFrom(C2396109aB.LJFF(C2396109aB.LJ(0, (ParameterizedType) type)))) {
                final C0X1V c0x1vLIZIZ = LIZIZ(str, str2);
                return new ParameterHandler<AbstractC842530X3j>(c0x1vLIZIZ) { // from class: X.0p93
                    public final C0X1V LIZ;

                    {
                        this.LIZ = c0x1vLIZIZ;
                    }

                    @Override // com.bytedance.retrofit2.ParameterHandler
                    public final void apply(RequestBuilder requestBuilder, AbstractC842530X3j abstractC842530X3j) {
                        AbstractC842530X3j abstractC842530X3j2 = abstractC842530X3j;
                        if (abstractC842530X3j2 != null) {
                            C0X1V c0x1v = this.LIZ;
                            C0X7B c0x7b = requestBuilder.LJIJJ;
                            c0x7b.getClass();
                            c0x7b.LIZJ(C0X76.LIZ(c0x1v, abstractC842530X3j2));
                            requestBuilder.LJIL = true;
                        }
                    }
                }.iterable();
            }
        } else if (clsLJFF.isArray()) {
            if (AbstractC842530X3j.class.isAssignableFrom(LIZ(clsLJFF.getComponentType()))) {
                final C0X1V c0x1vLIZIZ2 = LIZIZ(str, str2);
                return new ParameterHandler<AbstractC842530X3j>(c0x1vLIZIZ2) { // from class: X.0p93
                    public final C0X1V LIZ;

                    {
                        this.LIZ = c0x1vLIZIZ2;
                    }

                    @Override // com.bytedance.retrofit2.ParameterHandler
                    public final void apply(RequestBuilder requestBuilder, AbstractC842530X3j abstractC842530X3j) {
                        AbstractC842530X3j abstractC842530X3j2 = abstractC842530X3j;
                        if (abstractC842530X3j2 != null) {
                            C0X1V c0x1v = this.LIZ;
                            C0X7B c0x7b = requestBuilder.LJIJJ;
                            c0x7b.getClass();
                            c0x7b.LIZJ(C0X76.LIZ(c0x1v, abstractC842530X3j2));
                            requestBuilder.LJIL = true;
                        }
                    }
                }.array();
            }
        } else if (AbstractC842530X3j.class.isAssignableFrom(clsLJFF)) {
            final C0X1V c0x1vLIZIZ3 = LIZIZ(str, str2);
            return new ParameterHandler<AbstractC842530X3j>(c0x1vLIZIZ3) { // from class: X.0p93
                public final C0X1V LIZ;

                {
                    this.LIZ = c0x1vLIZIZ3;
                }

                @Override // com.bytedance.retrofit2.ParameterHandler
                public final void apply(RequestBuilder requestBuilder, AbstractC842530X3j abstractC842530X3j) {
                    AbstractC842530X3j abstractC842530X3j2 = abstractC842530X3j;
                    if (abstractC842530X3j2 != null) {
                        C0X1V c0x1v = this.LIZ;
                        C0X7B c0x7b = requestBuilder.LJIJJ;
                        c0x7b.getClass();
                        c0x7b.LIZJ(C0X76.LIZ(c0x1v, abstractC842530X3j2));
                        requestBuilder.LJIL = true;
                    }
                }
            };
        }
        return null;
    }

    public final void LIZLLL(String str, String str2, boolean z) {
        String strGroup;
        Matcher matcher;
        String str3 = this.LJIJJLI;
        if (str3 == null) {
            this.LJIJJLI = str;
            if (str != null) {
                try {
                    matcher = LJJIJIIJI.matcher(str);
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (matcher.find()) {
                    strGroup = matcher.group(1);
                } else {
                    strGroup = null;
                }
                this.LJJIIJZLJL = strGroup;
            }
            if (this.LJJIIJZLJL != null) {
                this.LJIIJ = true;
            }
            this.LJIL = z;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                try {
                    String strSubstring = str2.substring(iIndexOf + 1);
                    if (LJJIJIIJI.matcher(strSubstring).find()) {
                        throw C2396109aB.LJIIIZ(this.LIZIZ, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                    }
                } catch (IllegalArgumentException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    if (e2.getMessage().contains("URL query string")) {
                        throw e2;
                    }
                }
            }
            this.LJJIFFI = str2;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            try {
                Matcher matcher2 = LJJIJIIJI.matcher(str2);
                while (matcher2.find()) {
                    linkedHashSet.add(matcher2.group(1));
                }
            } catch (IllegalArgumentException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            this.LJJIIJ = linkedHashSet;
            return;
        }
        throw C2396109aB.LJIIIZ(this.LIZIZ, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x09ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:673:0x009c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.retrofit2.ParameterHandler<?> LJ(final int r45, java.lang.reflect.Type r46, java.lang.annotation.Annotation[] r47, boolean r48) {
        /*
            Method dump skipped, instruction units count: 3850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1500910pA1.LJ(int, java.lang.reflect.Type, java.lang.annotation.Annotation[], boolean):com.bytedance.retrofit2.ParameterHandler");
    }
}
