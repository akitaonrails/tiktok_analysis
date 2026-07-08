package X;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.12sI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19892012sI extends C09FG {
    public final Map<C19893012sS, Type> LIZIZ = new HashMap();

    @Override // X.C09FG
    public final void LIZIZ(Class<?> cls) {
        LIZ(cls.getGenericSuperclass());
        LIZ(cls.getGenericInterfaces());
    }

    @Override // X.C09FG
    public final void LIZLLL(ParameterizedType parameterizedType) {
        boolean z;
        boolean zLIZ;
        C19893012sS c19893012sS;
        Class cls = (Class) parameterizedType.getRawType();
        TypeVariable[] typeVariableArrV2 = C786410Ut5.V2(cls);
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (typeVariableArrV2.length == actualTypeArguments.length) {
            z = true;
        } else {
            z = false;
        }
        C19864312np.LJIILJJIL(z);
        for (int i = 0; i < typeVariableArrV2.length; i++) {
            C19893012sS c19893012sS2 = new C19893012sS(typeVariableArrV2[i]);
            Type type = actualTypeArguments[i];
            if (!((HashMap) this.LIZIZ).containsKey(c19893012sS2)) {
                Type type2 = type;
                while (true) {
                    if (type2 != null) {
                        boolean z2 = type2 instanceof TypeVariable;
                        if (z2) {
                            zLIZ = c19893012sS2.LIZ((TypeVariable) type2);
                        } else {
                            zLIZ = false;
                        }
                        C19893012sS c19893012sS3 = null;
                        if (!zLIZ) {
                            Map<C19893012sS, Type> map = this.LIZIZ;
                            if (z2) {
                                c19893012sS3 = new C19893012sS((TypeVariable) type2);
                            }
                            type2 = (Type) ((HashMap) map).get(c19893012sS3);
                        } else {
                            while (type != null) {
                                Map<C19893012sS, Type> map2 = this.LIZIZ;
                                if (type instanceof TypeVariable) {
                                    c19893012sS = new C19893012sS((TypeVariable) type);
                                } else {
                                    c19893012sS = null;
                                }
                                type = (Type) ((HashMap) map2).remove(c19893012sS);
                            }
                        }
                    } else {
                        ((HashMap) this.LIZIZ).put(c19893012sS2, type);
                        break;
                    }
                }
            }
        }
        LIZ(cls);
        LIZ(parameterizedType.getOwnerType());
    }

    @Override // X.C09FG
    public final void LJ(TypeVariable<?> typeVariable) {
        LIZ(typeVariable.getBounds());
    }

    @Override // X.C09FG
    public final void LJFF(WildcardType wildcardType) {
        LIZ(wildcardType.getUpperBounds());
    }
}
