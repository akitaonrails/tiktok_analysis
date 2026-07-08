package X;

import java.lang.reflect.Type;

/* JADX INFO: renamed from: X.14i0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20337814i0<T> {
    public final C20337614hy LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final T LIZLLL;
    public final Type LJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C20337814i0(String str, String str2, Type type, Object obj) {
        this.LIZ = new C20337614hy();
        this.LIZJ = str;
        this.LIZIZ = str2;
        this.LIZLLL = obj;
        this.LJ = type;
        if (obj == 0) {
            if (type != Integer.class && type != Short.class) {
                if (type == Long.class) {
                    this.LIZLLL = (T) 0L;
                    return;
                }
                if (type == Double.class) {
                    this.LIZLLL = (T) Double.valueOf(0.0d);
                    return;
                } else if (type == Float.class) {
                    this.LIZLLL = (T) Float.valueOf(0.0f);
                    return;
                } else {
                    if (type != Boolean.class) {
                        return;
                    }
                    this.LIZLLL = (T) Boolean.FALSE;
                    return;
                }
            }
            this.LIZLLL = (T) 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C20337814i0(Object obj, String str, String str2, Type type) {
        this(str, str2, type, obj);
        obj.getClass();
    }
}
