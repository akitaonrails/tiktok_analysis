package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0pA4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1500940pA4 {
    public static final Pattern LJJ = PatternProtector.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
    public static final Pattern LJJI = PatternProtector.compile("[a-zA-Z][a-zA-Z0-9_-]*");
    public final C1501450pAt LIZ;
    public final Method LIZIZ;
    public final Annotation[] LIZJ;
    public final Annotation[][] LIZLLL;
    public final Type[] LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public String LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public String LJIIZILJ;
    public C0X1V LJIJ;
    public C0X0P LJIJI;
    public Set<String> LJIJJ;
    public AbstractC1500140p8m<?>[] LJIJJLI;
    public boolean LJIL;

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

    public C1500940pA4(C1501450pAt c1501450pAt, Method method) {
        this.LIZ = c1501450pAt;
        this.LIZIZ = method;
        this.LIZJ = method.getAnnotations();
        this.LJ = method.getGenericParameterTypes();
        this.LIZLLL = method.getParameterAnnotations();
    }

    public final void LIZJ(int i, Type type) {
        if (!C1502190pC5.LJII(type)) {
        } else {
            throw C1502190pC5.LJIIJ(this.LIZIZ, i, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }

    public final void LIZIZ(String str, String str2, boolean z) {
        String str3 = this.LJIILIIL;
        if (str3 == null) {
            this.LJIILIIL = str;
            this.LJIILJJIL = z;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (LJJ.matcher(strSubstring).find()) {
                    throw C1502190pC5.LJIIIZ(this.LIZIZ, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.LJIIZILJ = str2;
            Matcher matcher = LJJ.matcher(str2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            this.LJIJJ = linkedHashSet;
            return;
        }
        throw C1502190pC5.LJIIIZ(this.LIZIZ, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
    }
}
