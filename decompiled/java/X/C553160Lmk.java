package X;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lmk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C553160Lmk {
    public static final Class<?> LIZJ(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
        } else if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            Type type2 = (Type) C13LQ.LJJIFFI(wildcardType.getUpperBounds());
            Type type3 = (Type) C13LQ.LJJIFFI(wildcardType.getLowerBounds());
            if (type3 != null) {
                return LIZJ(type3);
            }
            if (type2 != null && !Intrinsics.LJFF(type2, Object.class)) {
                return LIZJ(type2);
            }
            return Object.class;
        }
        return null;
    }

    public static final boolean LIZ(AbstractC553110Lmf<?> abstractC553110Lmf, Type type) {
        ParameterizedType parameterizedType;
        Type type2;
        if (Intrinsics.LJFF(abstractC553110Lmf, C553090Lmd.LIZ)) {
            return LIZIZ(type, String.class);
        }
        if (Intrinsics.LJFF(abstractC553110Lmf, new AbstractC553110Lmf<Byte>() { // from class: X.0Lmi
        })) {
            return LIZIZ(type, Byte.class, Byte.TYPE);
        }
        if (Intrinsics.LJFF(abstractC553110Lmf, new AbstractC553110Lmf<Short>() { // from class: X.0Lmh
        })) {
            return LIZIZ(type, Short.class, Short.TYPE);
        }
        if (Intrinsics.LJFF(abstractC553110Lmf, C553060Lma.LIZ)) {
            return LIZIZ(type, Integer.class, Integer.TYPE);
        }
        if (Intrinsics.LJFF(abstractC553110Lmf, C553080Lmc.LIZ)) {
            return LIZIZ(type, Long.class, Long.TYPE);
        }
        if (Intrinsics.LJFF(abstractC553110Lmf, new AbstractC553110Lmf<Float>() { // from class: X.0Lmg
        })) {
            return LIZIZ(type, Float.class, Float.TYPE);
        }
        if (Intrinsics.LJFF(abstractC553110Lmf, new AbstractC553110Lmf<Double>() { // from class: X.0Lmj
        })) {
            return LIZIZ(type, Double.class, Double.TYPE);
        }
        if (abstractC553110Lmf instanceof C553100Lme) {
            Class<?> clsLIZJ = LIZJ(type);
            if (clsLIZJ == null) {
                return false;
            }
            return C09R7.LIZ(((C553100Lme) abstractC553110Lmf).LIZ).isAssignableFrom(clsLIZJ);
        }
        if (abstractC553110Lmf instanceof C553070Lmb) {
            if (!(type instanceof ParameterizedType) || (parameterizedType = (ParameterizedType) type) == null) {
                return false;
            }
            Type rawType = parameterizedType.getRawType();
            if (!(rawType instanceof Class) || rawType == null || !Intrinsics.LJFF(rawType, List.class) || (type2 = (Type) C13LQ.LJJIIZ(0, parameterizedType.getActualTypeArguments())) == null) {
                return false;
            }
            return LIZ(((C553070Lmb) abstractC553110Lmf).LIZ, type2);
        }
        throw new C1954807lC();
    }

    public static final boolean LIZIZ(Type type, Class<?>... clsArr) {
        Class<?> clsLIZJ = LIZJ(type);
        ArrayList arrayList = (ArrayList) C13LQ.LJIJI(clsArr);
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next(), clsLIZJ)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
