package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Map;

/* JADX INFO: renamed from: X.12sE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19891612sE {
    public final C19892412sM LIZ;

    public C19891612sE() {
        this.LIZ = new C19892412sM();
    }

    public C19891612sE(C19892412sM c19892412sM) {
        this.LIZ = c19892412sM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.12sb] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Type LIZIZ(Type type) {
        Type typeLIZIZ;
        type.getClass();
        if (type instanceof TypeVariable) {
            final C19892412sM c19892412sM = this.LIZ;
            final TypeVariable typeVariable = (TypeVariable) type;
            c19892412sM.getClass();
            return c19892412sM.LIZ(typeVariable, new C19892412sM() { // from class: X.12sb
                @Override // X.C19892412sM
                public final Type LIZ(TypeVariable typeVariable2, C19893912sb c19893912sb) {
                    if (typeVariable2.getGenericDeclaration().equals(typeVariable.getGenericDeclaration())) {
                        return typeVariable2;
                    }
                    return c19892412sM.LIZ(typeVariable2, c19893912sb);
                }
            });
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType == null) {
                typeLIZIZ = null;
            } else {
                typeLIZIZ = LIZIZ(ownerType);
            }
            return C19891812sG.LJ(typeLIZIZ, (Class) LIZIZ(parameterizedType.getRawType()), LIZJ(parameterizedType.getActualTypeArguments()));
        }
        if (type instanceof GenericArrayType) {
            return C19891812sG.LIZJ(LIZIZ(((GenericArrayType) type).getGenericComponentType()));
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            return new C19891212sA(LIZJ(wildcardType.getLowerBounds()), LIZJ(wildcardType.getUpperBounds()));
        }
        return type;
    }

    public final Type[] LIZJ(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i = 0; i < typeArr.length; i++) {
            typeArr2[i] = LIZIZ(typeArr[i]);
        }
        return typeArr2;
    }

    public final C19891612sE LIZLLL(Map<C19893012sS, ? extends Type> map) {
        boolean zLIZ;
        C19892412sM c19892412sM = this.LIZ;
        c19892412sM.getClass();
        C19871112ov c19871112ovBuilder = AbstractC19870912ot.builder();
        AbstractC19870912ot<C19893012sS, Type> abstractC19870912ot = c19892412sM.LIZ;
        c19871112ovBuilder.getClass();
        c19871112ovBuilder.LIZJ(abstractC19870912ot.entrySet());
        for (Map.Entry<C19893012sS, ? extends Type> entry : map.entrySet()) {
            C19893012sS key = entry.getKey();
            Type value = entry.getValue();
            key.getClass();
            if (value instanceof TypeVariable) {
                zLIZ = key.LIZ((TypeVariable) value);
            } else {
                zLIZ = false;
            }
            C19864312np.LIZJ(key, "Type variable %s bound to itself", !zLIZ);
            c19871112ovBuilder.LIZIZ(key, value);
        }
        return new C19891612sE(new C19892412sM(c19871112ovBuilder.LIZ()));
    }

    public static void LIZ(Type type, final Type type2, final Map map) {
        if (type.equals(type2)) {
            return;
        }
        new C09FG() { // from class: X.12sH
            @Override // X.C09FG
            public final void LIZIZ(Class<?> cls) {
                if (type2 instanceof WildcardType) {
                    return;
                }
                String strValueOf = String.valueOf(cls);
                String strValueOf2 = String.valueOf(type2);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 25 + strValueOf2.length());
                sb.append("No type mapping from ");
                sb.append(strValueOf);
                sb.append(" to ");
                sb.append(strValueOf2);
                throw new IllegalArgumentException(sb.toString());
            }

            @Override // X.C09FG
            public final void LIZJ(GenericArrayType genericArrayType) {
                boolean z;
                Type type3 = type2;
                if (type3 instanceof WildcardType) {
                    return;
                }
                Type typeLIZIZ = C19891812sG.LIZIZ(type3);
                if (typeLIZIZ != null) {
                    z = true;
                } else {
                    z = false;
                }
                C19864312np.LIZJ(type2, "%s is not an array type.", z);
                C19891612sE.LIZ(genericArrayType.getGenericComponentType(), typeLIZIZ, map);
            }

            @Override // X.C09FG
            public final void LIZLLL(ParameterizedType parameterizedType) {
                boolean z;
                Type type3 = type2;
                if (type3 instanceof WildcardType) {
                    return;
                }
                try {
                    ParameterizedType parameterizedType2 = (ParameterizedType) ParameterizedType.class.cast(type3);
                    if (parameterizedType.getOwnerType() != null && parameterizedType2.getOwnerType() != null) {
                        C19891612sE.LIZ(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType(), map);
                    }
                    C19864312np.LIZIZ(parameterizedType, type2, "Inconsistent raw type: %s vs. %s", parameterizedType.getRawType().equals(parameterizedType2.getRawType()));
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
                    if (actualTypeArguments.length == actualTypeArguments2.length) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C19864312np.LIZIZ(parameterizedType, parameterizedType2, "%s not compatible with %s", z);
                    for (int i = 0; i < actualTypeArguments.length; i++) {
                        C19891612sE.LIZ(actualTypeArguments[i], actualTypeArguments2[i], map);
                    }
                } catch (ClassCastException e) {
                    TryCatchGuardChecker.doCheck(e);
                    String strValueOf = String.valueOf(type3);
                    String simpleName = ParameterizedType.class.getSimpleName();
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 10 + simpleName.length());
                    sb.append(strValueOf);
                    sb.append(" is not a ");
                    sb.append(simpleName);
                    throw new IllegalArgumentException(sb.toString());
                }
            }

            @Override // X.C09FG
            public final void LJ(TypeVariable<?> typeVariable) {
                map.put(new C19893012sS(typeVariable), type2);
            }

            @Override // X.C09FG
            public final void LJFF(WildcardType wildcardType) {
                boolean z;
                Type type3 = type2;
                if (!(type3 instanceof WildcardType)) {
                    return;
                }
                WildcardType wildcardType2 = (WildcardType) type3;
                Type[] upperBounds = wildcardType.getUpperBounds();
                Type[] upperBounds2 = wildcardType2.getUpperBounds();
                Type[] lowerBounds = wildcardType.getLowerBounds();
                Type[] lowerBounds2 = wildcardType2.getLowerBounds();
                if (upperBounds.length == upperBounds2.length && lowerBounds.length == lowerBounds2.length) {
                    z = true;
                } else {
                    z = false;
                }
                C19864312np.LIZIZ(wildcardType, type2, "Incompatible type: %s vs. %s", z);
                for (int i = 0; i < upperBounds.length; i++) {
                    C19891612sE.LIZ(upperBounds[i], upperBounds2[i], map);
                }
                for (int i2 = 0; i2 < lowerBounds.length; i2++) {
                    C19891612sE.LIZ(lowerBounds[i2], lowerBounds2[i2], map);
                }
            }
        }.LIZ(type);
    }
}
