package X;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.136u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C199574136u {
    public final List<C14EO> LIZ = new ArrayList();
    public final Map<Class, Object> LIZIZ = new HashMap();
    public final Map<String, Class> LIZJ = new HashMap();
    public final StringBuilder LIZLLL = new StringBuilder(128);
    public Class<?> LJ;
    public boolean LJFF;

    public final boolean LIZ(Method method, Class<?> cls) {
        this.LIZLLL.setLength(0);
        this.LIZLLL.append(method.getName());
        StringBuilder sb = this.LIZLLL;
        sb.append('>');
        sb.append(cls.getName());
        String string = this.LIZLLL.toString();
        Class<?> declaringClass = method.getDeclaringClass();
        Class cls2 = (Class) ((HashMap) this.LIZJ).put(string, declaringClass);
        if (cls2 != null && !cls2.isAssignableFrom(declaringClass)) {
            ((HashMap) this.LIZJ).put(string, cls2);
            return false;
        }
        return true;
    }
}
