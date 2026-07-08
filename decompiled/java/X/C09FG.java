package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.09FG, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public abstract class C09FG {
    public final Set<Type> LIZ = new HashSet();

    public abstract void LIZIZ(Class<?> cls);

    public void LIZJ(GenericArrayType genericArrayType) {
    }

    public void LIZLLL(ParameterizedType parameterizedType) {
    }

    public abstract void LJ(TypeVariable<?> typeVariable);

    public abstract void LJFF(WildcardType wildcardType);

    public final void LIZ(Type... typeArr) {
        for (Type type : typeArr) {
            if (type != null && ((HashSet) this.LIZ).add(type)) {
                try {
                    if (type instanceof TypeVariable) {
                        LJ((TypeVariable) type);
                    } else if (type instanceof WildcardType) {
                        LJFF((WildcardType) type);
                    } else if (type instanceof ParameterizedType) {
                        LIZLLL((ParameterizedType) type);
                    } else if (type instanceof Class) {
                        LIZIZ((Class) type);
                    } else if (type instanceof GenericArrayType) {
                        LIZJ((GenericArrayType) type);
                    } else {
                        String strValueOf = String.valueOf(type);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 14);
                        sb.append("Unknown type: ");
                        sb.append(strValueOf);
                        throw new AssertionError(sb.toString());
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    ((HashSet) this.LIZ).remove(type);
                    throw th;
                }
            }
        }
    }
}
