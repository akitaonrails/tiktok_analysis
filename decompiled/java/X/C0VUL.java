package X;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.0VUL, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VUL {
    public static final /* synthetic */ int LJ = 0;
    public final Class<?> LIZ;
    public final Field LIZIZ;
    public final Field LIZJ;
    public final Field LIZLLL;

    public C0VUL() {
        throw null;
    }

    public final C0VUJ LIZ(Object obj) throws IllegalAccessException {
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        Number number;
        Number number2;
        Number number3;
        Object obj2 = this.LIZIZ.get(obj);
        if ((obj2 instanceof Number) && (number3 = (Number) obj2) != null) {
            jLongValue = number3.longValue();
        } else {
            jLongValue = 0;
        }
        Object obj3 = this.LIZJ.get(obj);
        if ((obj3 instanceof Number) && (number2 = (Number) obj3) != null) {
            jLongValue2 = number2.longValue();
        } else {
            jLongValue2 = 0;
        }
        Object obj4 = this.LIZLLL.get(obj);
        if ((obj4 instanceof Number) && (number = (Number) obj4) != null) {
            jLongValue3 = number.longValue();
        } else {
            jLongValue3 = 0;
        }
        return new C0VUJ(jLongValue, jLongValue2, jLongValue3);
    }

    public C0VUL(Class cls, Field field, Field field2, Field field3) {
        this.LIZ = cls;
        this.LIZIZ = field;
        this.LIZJ = field2;
        this.LIZLLL = field3;
    }
}
