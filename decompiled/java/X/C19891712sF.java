package X;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.12sF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19891712sF {
    public static final C19891712sF LIZIZ = new C19891712sF();
    public final AtomicInteger LIZ;

    public C19891712sF() {
        this(new AtomicInteger());
    }

    public C19891712sF(AtomicInteger atomicInteger) {
        this.LIZ = atomicInteger;
    }

    public final Type LIZ(Type type) {
        Type typeLIZ;
        type.getClass();
        if ((type instanceof Class) || (type instanceof TypeVariable)) {
            return type;
        }
        if (type instanceof GenericArrayType) {
            return C19891812sG.LIZJ(new C19891712sF(this.LIZ).LIZ(((GenericArrayType) type).getGenericComponentType()));
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable[] typeVariableArrV2 = C786410Ut5.V2(cls);
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            for (int i = 0; i < actualTypeArguments.length; i++) {
                final TypeVariable typeVariable = typeVariableArrV2[i];
                final AtomicInteger atomicInteger = this.LIZ;
                actualTypeArguments[i] = new C19891712sF(atomicInteger) { // from class: X.12sP
                    @Override // X.C19891712sF
                    public final TypeVariable<?> LIZIZ(Type[] typeArr) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(typeArr));
                        linkedHashSet.addAll(Arrays.asList(typeVariable.getBounds()));
                        if (linkedHashSet.size() > 1) {
                            linkedHashSet.remove(Object.class);
                        }
                        return super.LIZIZ((Type[]) linkedHashSet.toArray(new Type[0]));
                    }
                }.LIZ(actualTypeArguments[i]);
            }
            C19891712sF c19891712sF = new C19891712sF(this.LIZ);
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType == null) {
                typeLIZ = null;
            } else {
                typeLIZ = c19891712sF.LIZ(ownerType);
            }
            return C19891812sG.LJ(typeLIZ, cls, actualTypeArguments);
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length == 0) {
                return LIZIZ(wildcardType.getUpperBounds());
            }
            return type;
        }
        throw new AssertionError("must have been one of the known types");
    }

    public TypeVariable<?> LIZIZ(Type[] typeArr) {
        int iIncrementAndGet = this.LIZ.incrementAndGet();
        String strLIZIZ = new C823890WTr(String.valueOf('&')).LIZIZ(Arrays.asList(typeArr));
        StringBuilder sb = new StringBuilder(String.valueOf(strLIZIZ).length() + 33);
        sb.append("capture#");
        sb.append(iIncrementAndGet);
        sb.append("-of ? extends ");
        sb.append(strLIZIZ);
        return C19891812sG.LIZLLL(C19891712sF.class, sb.toString(), typeArr);
    }
}
