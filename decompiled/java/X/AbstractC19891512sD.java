package X;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.12sD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19891512sD<T> extends AbstractC19893612sY<T> implements Serializable {
    public static final long serialVersionUID = 3637540370352322684L;
    public transient C19891612sE LL;
    public transient C19891612sE LLILLJJLI;
    public final Type runtimeType;

    /* JADX INFO: renamed from: X.12sD$j */
    public class j extends AbstractC19883012qq<AbstractC19891512sD<? super T>> implements Serializable {
        public static final long serialVersionUID = 0;
        public transient AbstractC19875112pZ<AbstractC19891512sD<? super T>> LL;

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // X.AbstractC19883012qq
        /* JADX INFO: renamed from: LJJ */
        public AbstractC19875112pZ LJIIL() {
            AbstractC19875112pZ<AbstractC19891512sD<? super T>> abstractC19875112pZ = this.LL;
            if (abstractC19875112pZ != null) {
                return abstractC19875112pZ;
            }
            AbstractC19890312s1 abstractC19890312s1LIZJ = AbstractC19890312s1.LJ(AbstractC19877412pw.LIZ.LIZIZ(AbstractC19875512pd.of(AbstractC19891512sD.this))).LIZJ(EnumC19890412s2.LL);
            AbstractC19875112pZ<AbstractC19891512sD<? super T>> abstractC19875112pZCopyOf = AbstractC19875112pZ.copyOf((Iterable) abstractC19890312s1LIZJ.LL.or(abstractC19890312s1LIZJ));
            this.LL = abstractC19875112pZCopyOf;
            return abstractC19875112pZCopyOf;
        }

        public AbstractC19891512sD<T>.j classes() {
            final AbstractC19891512sD abstractC19891512sD = AbstractC19891512sD.this;
            return new AbstractC19891512sD<T>.j() { // from class: X.12rz
                public static final long serialVersionUID = 0;
                public transient AbstractC19875112pZ<AbstractC19891512sD<? super T>> LLILLL;

                @Override // X.AbstractC19891512sD.j
                public final AbstractC19891512sD<T>.j classes() {
                    return this;
                }

                private Object readResolve() {
                    return this.LLILZ.getTypes().classes();
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // X.AbstractC19891512sD.j, X.AbstractC19883012qq
                /* JADX INFO: renamed from: LJJ */
                public final AbstractC19875112pZ LJIIL() {
                    AbstractC19875112pZ<AbstractC19891512sD<? super T>> abstractC19875112pZ = this.LLILLL;
                    if (abstractC19875112pZ != 0) {
                        return abstractC19875112pZ;
                    }
                    AbstractC19890312s1 abstractC19890312s1LIZJ = AbstractC19890312s1.LJ(new C19877512px(AbstractC19877412pw.LIZ).LIZIZ(AbstractC19875512pd.of(this.LLILZ))).LIZJ(EnumC19890412s2.LL);
                    AbstractC19875112pZ<AbstractC19891512sD<? super T>> abstractC19875112pZCopyOf = AbstractC19875112pZ.copyOf((Iterable) abstractC19890312s1LIZJ.LL.or(abstractC19890312s1LIZJ));
                    this.LLILLL = abstractC19875112pZCopyOf;
                    return abstractC19875112pZCopyOf;
                }

                @Override // X.AbstractC19891512sD.j
                public final AbstractC19891512sD<T>.j interfaces() {
                    throw new UnsupportedOperationException("classes().interfaces() not supported.");
                }

                @Override // X.AbstractC19891512sD.j
                public final Set<Class<? super T>> rawTypes() {
                    return AbstractC19875112pZ.copyOf((Collection) new C19877512px(AbstractC19877412pw.LIZIZ).LIZIZ(this.LLILZ.getRawTypes()));
                }

                @Override // X.AbstractC19891512sD.j, X.AbstractC19883012qq, X.AbstractC19882912qp, X.C08J6
                public final /* bridge */ /* synthetic */ Object LJIIL() {
                    return LJIIL();
                }

                @Override // X.AbstractC19891512sD.j, X.AbstractC19883012qq, X.AbstractC19882912qp
                /* JADX INFO: renamed from: LJIIZILJ */
                public final /* bridge */ /* synthetic */ Collection LJIIL() {
                    return LJIIL();
                }

                {
                    super();
                }
            };
        }

        public AbstractC19891512sD<T>.j interfaces() {
            final AbstractC19891512sD abstractC19891512sD = AbstractC19891512sD.this;
            return new AbstractC19891512sD<T>.j(this) { // from class: X.12s0
                public static final long serialVersionUID = 0;
                public final transient AbstractC19891512sD<T>.j LLILLL;
                public transient AbstractC19875112pZ<AbstractC19891512sD<? super T>> LLILZ;

                @Override // X.AbstractC19891512sD.j
                public final AbstractC19891512sD<T>.j interfaces() {
                    return this;
                }

                private Object readResolve() {
                    return this.LLILZIL.getTypes().interfaces();
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // X.AbstractC19891512sD.j, X.AbstractC19883012qq
                /* JADX INFO: renamed from: LJJ */
                public final AbstractC19875112pZ LJIIL() {
                    AbstractC19875112pZ<AbstractC19891512sD<? super T>> abstractC19875112pZ = this.LLILZ;
                    if (abstractC19875112pZ != 0) {
                        return abstractC19875112pZ;
                    }
                    AbstractC19890312s1 abstractC19890312s1LIZJ = AbstractC19890312s1.LJ(this.LLILLL).LIZJ(EnumC19890412s2.LLILLJJLI);
                    AbstractC19875112pZ<AbstractC19891512sD<? super T>> abstractC19875112pZCopyOf = AbstractC19875112pZ.copyOf((Iterable) abstractC19890312s1LIZJ.LL.or(abstractC19890312s1LIZJ));
                    this.LLILZ = abstractC19875112pZCopyOf;
                    return abstractC19875112pZCopyOf;
                }

                @Override // X.AbstractC19891512sD.j
                public final AbstractC19891512sD<T>.j classes() {
                    throw new UnsupportedOperationException("interfaces().classes() not supported.");
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // X.AbstractC19891512sD.j
                public final Set<Class<? super T>> rawTypes() {
                    AbstractC19890312s1 abstractC19890312s1LIZJ = AbstractC19890312s1.LJ(AbstractC19877412pw.LIZIZ.LIZIZ(this.LLILZIL.getRawTypes())).LIZJ(new InterfaceC1394580mOW<Class<?>>() { // from class: X.12s6
                        @Override // X.InterfaceC1394580mOW
                        public final boolean apply(Class<?> cls) {
                            return cls.isInterface();
                        }
                    });
                    return AbstractC19875112pZ.copyOf((Iterable) abstractC19890312s1LIZJ.LL.or(abstractC19890312s1LIZJ));
                }

                @Override // X.AbstractC19891512sD.j, X.AbstractC19883012qq, X.AbstractC19882912qp, X.C08J6
                public final /* bridge */ /* synthetic */ Object LJIIL() {
                    return LJIIL();
                }

                @Override // X.AbstractC19891512sD.j, X.AbstractC19883012qq, X.AbstractC19882912qp
                /* JADX INFO: renamed from: LJIIZILJ */
                public final /* bridge */ /* synthetic */ Collection LJIIL() {
                    return LJIIL();
                }

                {
                    super();
                    this.LLILLL = this;
                }
            };
        }

        public Set<Class<? super T>> rawTypes() {
            return AbstractC19875112pZ.copyOf((Collection) AbstractC19877412pw.LIZIZ.LIZIZ(AbstractC19891512sD.this.getRawTypes()));
        }

        @Override // X.AbstractC19883012qq, X.AbstractC19882912qp, X.C08J6
        public /* bridge */ /* synthetic */ Object LJIIL() {
            return LJIIL();
        }

        @Override // X.AbstractC19883012qq, X.AbstractC19882912qp
        /* JADX INFO: renamed from: LJIIZILJ */
        public /* bridge */ /* synthetic */ Collection LJIIL() {
            return LJIIL();
        }

        public j() {
        }
    }

    public final AbstractC19891512sD<?> getComponentType() {
        Type typeLIZIZ = C19891812sG.LIZIZ(this.runtimeType);
        if (typeLIZIZ == null) {
            return null;
        }
        return of(typeLIZIZ);
    }

    public C19891612sE getCovariantTypeResolver() {
        C19891612sE c19891612sE = this.LLILLJJLI;
        if (c19891612sE != null) {
            return c19891612sE;
        }
        Type type = this.runtimeType;
        C19891612sE c19891612sE2 = new C19891612sE();
        type.getClass();
        C19892012sI c19892012sI = new C19892012sI();
        c19892012sI.LIZ(type);
        C19891612sE c19891612sELIZLLL = c19891612sE2.LIZLLL(AbstractC19870912ot.copyOf((Map) c19892012sI.LIZIZ));
        this.LLILLJJLI = c19891612sELIZLLL;
        return c19891612sELIZLLL;
    }

    public C19891612sE getInvariantTypeResolver() {
        C19891612sE c19891612sE = this.LL;
        if (c19891612sE != null) {
            return c19891612sE;
        }
        Type typeLIZ = C19891712sF.LIZIZ.LIZ(this.runtimeType);
        C19891612sE c19891612sE2 = new C19891612sE();
        typeLIZ.getClass();
        C19892012sI c19892012sI = new C19892012sI();
        c19892012sI.LIZ(typeLIZ);
        C19891612sE c19891612sELIZLLL = c19891612sE2.LIZLLL(AbstractC19870912ot.copyOf((Map) c19892012sI.LIZIZ));
        this.LL = c19891612sELIZLLL;
        return c19891612sELIZLLL;
    }

    public final AbstractC19891512sD<T>.j getTypes() {
        return new j();
    }

    public int hashCode() {
        return this.runtimeType.hashCode();
    }

    public final boolean isPrimitive() {
        Type type = this.runtimeType;
        return (type instanceof Class) && ((Class) type).isPrimitive();
    }

    public String toString() {
        Type type = this.runtimeType;
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public final AbstractC19891512sD<T> unwrap() {
        Map<Class<?>, Class<?>> map = C1965107mr.LIZIZ;
        if (!map.keySet().contains(this.runtimeType)) {
            return this;
        }
        Class<?> cls = (Class) this.runtimeType;
        cls.getClass();
        Class<?> cls2 = map.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return of((Class) cls);
    }

    public Object writeReplace() {
        return of(new C19891612sE().LIZIZ(this.runtimeType));
    }

    public AbstractC19891512sD() {
        Type typeLIZ = LIZ();
        this.runtimeType = typeLIZ;
        C19864312np.LJIIL(typeLIZ, "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", !(typeLIZ instanceof TypeVariable));
    }

    public final Class<? super T> getRawType() {
        return getRawTypes().iterator().next();
    }

    public AbstractC19875112pZ<Class<? super T>> getRawTypes() {
        final C19875212pa c19875212paBuilder = AbstractC19875112pZ.builder();
        new C09FG() { // from class: X.12sO
            @Override // X.C09FG
            public final void LIZIZ(Class<?> cls) {
                c19875212paBuilder.LJI(cls);
            }

            @Override // X.C09FG
            public final void LIZJ(GenericArrayType genericArrayType) {
                c19875212paBuilder.LJI(Array.newInstance(AbstractC19891512sD.of(genericArrayType.getGenericComponentType()).getRawType(), 0).getClass());
            }

            @Override // X.C09FG
            public final void LIZLLL(ParameterizedType parameterizedType) {
                c19875212paBuilder.LJI(parameterizedType.getRawType());
            }

            @Override // X.C09FG
            public final void LJ(TypeVariable<?> typeVariable) {
                LIZ(typeVariable.getBounds());
            }

            @Override // X.C09FG
            public final void LJFF(WildcardType wildcardType) {
                LIZ(wildcardType.getUpperBounds());
            }
        }.LIZ(this.runtimeType);
        return c19875212paBuilder.LJIIIZ();
    }

    public final boolean isArray() {
        return getComponentType() != null;
    }

    public final AbstractC19891512sD<T> wrap() {
        if (!isPrimitive()) {
            return this;
        }
        Class<?> cls = (Class) this.runtimeType;
        cls.getClass();
        Class<?> cls2 = C1965107mr.LIZ.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return of((Class) cls);
    }

    public final Type getType() {
        return this.runtimeType;
    }

    public AbstractC19891512sD(Type type) {
        type.getClass();
        this.runtimeType = type;
    }

    public static AbstractC19875512pd LIZIZ(Type[] typeArr) {
        C19876312pl c19876312plBuilder = AbstractC19875512pd.builder();
        for (Type type : typeArr) {
            AbstractC19891512sD<?> abstractC19891512sDOf = of(type);
            if (abstractC19891512sDOf.getRawType().isInterface()) {
                c19876312plBuilder.LIZLLL(abstractC19891512sDOf);
            }
        }
        return c19876312plBuilder.LJI();
    }

    public static Type LJ(Type type) {
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable[] typeVariableArrV2 = C786410Ut5.V2(cls);
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            for (int i = 0; i < actualTypeArguments.length; i++) {
                actualTypeArguments[i] = LIZJ(actualTypeArguments[i], typeVariableArrV2[i]);
            }
            return C19891812sG.LJ(parameterizedType.getOwnerType(), cls, actualTypeArguments);
        }
        if (type instanceof GenericArrayType) {
            return C19891812sG.LIZJ(LJ(((GenericArrayType) type).getGenericComponentType()));
        }
        return type;
    }

    public static <T> AbstractC19891512sD<? extends T> LJIIIIZZ(Class<T> cls) {
        Type type;
        if (cls.isArray()) {
            return (AbstractC19891512sD<? extends T>) of(C19891812sG.LIZJ(LJIIIIZZ(cls.getComponentType()).runtimeType));
        }
        TypeVariable[] typeVariableArrV2 = C786410Ut5.V2(cls);
        if (cls.isMemberClass() && !Modifier.isStatic(cls.getModifiers())) {
            type = LJIIIIZZ(cls.getEnclosingClass()).runtimeType;
        } else {
            type = null;
        }
        if (typeVariableArrV2.length > 0 || (type != null && type != cls.getEnclosingClass())) {
            return (AbstractC19891512sD<? extends T>) of(C19891812sG.LJ(type, cls, typeVariableArrV2));
        }
        return of((Class) cls);
    }

    public static <T> AbstractC19891512sD<T> of(Class<T> cls) {
        return new C19893812sa(cls);
    }

    public final AbstractC19891512sD<?> LJI(Type type) {
        AbstractC19891512sD<?> abstractC19891512sDOf = of(getCovariantTypeResolver().LIZIZ(type));
        abstractC19891512sDOf.LLILLJJLI = this.LLILLJJLI;
        abstractC19891512sDOf.LL = this.LL;
        return abstractC19891512sDOf;
    }

    public final boolean LJII(Class<?> cls) {
        AbstractC19853312m3<Class<? super T>> it2 = getRawTypes().iterator();
        while (it2.hasNext()) {
            if (cls.isAssignableFrom(it2.next())) {
                return true;
            }
        }
        return false;
    }

    public final AbstractC19893312sV<T, T> constructor(final Constructor<?> constructor) {
        boolean z;
        if (constructor.getDeclaringClass() == getRawType()) {
            z = true;
        } else {
            z = false;
        }
        C19864312np.LIZIZ(constructor, getRawType(), "%s not declared by %s", z);
        return new C19893412sW<T>(constructor) { // from class: X.12sK
            @Override // X.AbstractC19893312sV
            public final String toString() {
                Method enclosingMethod;
                String strValueOf = String.valueOf(this.LLILZ);
                C823890WTr c823890WTr = new C823890WTr(", ");
                C19891612sE invariantTypeResolver = this.LLILZ.getInvariantTypeResolver();
                Type[] genericParameterTypes = this.LLILLL.getGenericParameterTypes();
                if (genericParameterTypes.length > 0) {
                    Class<?> declaringClass = this.LLILLL.getDeclaringClass();
                    if (declaringClass.getEnclosingConstructor() != null || ((enclosingMethod = declaringClass.getEnclosingMethod()) == null ? !(declaringClass.getEnclosingClass() == null || Modifier.isStatic(declaringClass.getModifiers())) : (!Modifier.isStatic(enclosingMethod.getModifiers())))) {
                        Class<?>[] parameterTypes = this.LLILLL.getParameterTypes();
                        if (genericParameterTypes.length == parameterTypes.length && parameterTypes[0] == getDeclaringClass().getEnclosingClass()) {
                            genericParameterTypes = (Type[]) Arrays.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length);
                        }
                    }
                }
                invariantTypeResolver.getClass();
                for (int i = 0; i < genericParameterTypes.length; i++) {
                    genericParameterTypes[i] = invariantTypeResolver.LIZIZ(genericParameterTypes[i]);
                }
                String strLIZIZ = c823890WTr.LIZIZ(Arrays.asList(genericParameterTypes));
                StringBuilder sb = new StringBuilder(strValueOf.length() + 2 + String.valueOf(strLIZIZ).length());
                sb.append(strValueOf);
                sb.append(e3.h);
                sb.append(strLIZIZ);
                sb.append(")");
                return sb.toString();
            }

            @Override // X.AbstractC19893312sV
            public final AbstractC19891512sD<T> LIZ() {
                return this.LLILZ;
            }
        };
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC19891512sD) {
            return this.runtimeType.equals(((AbstractC19891512sD) obj).runtimeType);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC19891512sD<? extends T> getSubtype(java.lang.Class<?> r7) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC19891512sD.getSubtype(java.lang.Class):X.12sD");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC19891512sD<? super T> getSupertype(Class<? super T> cls) {
        C19864312np.LIZIZ(cls, this, "%s is not a super class of %s", LJII(cls));
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return LJFF(cls, ((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return LJFF(cls, ((WildcardType) type).getUpperBounds());
        }
        if (cls.isArray()) {
            AbstractC19891512sD<?> componentType = getComponentType();
            if (componentType != 0) {
                Class<?> componentType2 = cls.getComponentType();
                Objects.requireNonNull(componentType2);
                return (AbstractC19891512sD<? super T>) of(EnumC19892112sJ.LL.LIZJ(componentType.getSupertype(componentType2).runtimeType));
            }
            String strValueOf = String.valueOf(cls);
            String strValueOf2 = String.valueOf(this);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 23 + strValueOf2.length());
            sb.append(strValueOf);
            sb.append(" isn't a super type of ");
            sb.append(strValueOf2);
            throw new IllegalArgumentException(sb.toString());
        }
        return (AbstractC19891512sD<? super T>) LJI(LJIIIIZZ(cls).runtimeType);
    }

    public final boolean isSubtypeOf(Type type) {
        Type ownerType;
        type.getClass();
        if (type instanceof WildcardType) {
            return new C19894012sc(((WildcardType) type).getLowerBounds(), true).LIZIZ(this.runtimeType);
        }
        Type type2 = this.runtimeType;
        if (type2 instanceof WildcardType) {
            return new C19894012sc(((WildcardType) type2).getUpperBounds(), true).LIZ(type);
        }
        if (type2 instanceof TypeVariable) {
            if (type2.equals(type) || new C19894012sc(((TypeVariable) this.runtimeType).getBounds(), true).LIZ(type)) {
                return true;
            }
            return false;
        }
        if (type2 instanceof GenericArrayType) {
            AbstractC19891512sD<?> abstractC19891512sDOf = of(type);
            GenericArrayType genericArrayType = (GenericArrayType) this.runtimeType;
            Type type3 = abstractC19891512sDOf.runtimeType;
            if (type3 instanceof Class) {
                Class cls = (Class) type3;
                if (!cls.isArray()) {
                    return cls.isAssignableFrom(Object[].class);
                }
                return of(genericArrayType.getGenericComponentType()).isSubtypeOf(cls.getComponentType());
            }
            if (!(type3 instanceof GenericArrayType)) {
                return false;
            }
            return of(genericArrayType.getGenericComponentType()).isSubtypeOf(((GenericArrayType) abstractC19891512sDOf.runtimeType).getGenericComponentType());
        }
        if (type instanceof Class) {
            return LJII((Class) type);
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Class<? super Object> rawType = of(parameterizedType).getRawType();
            if (LJII(rawType)) {
                TypeVariable[] typeVariableArrV2 = C786410Ut5.V2(rawType);
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i = 0; i < typeVariableArrV2.length; i++) {
                    AbstractC19891512sD<?> abstractC19891512sDOf2 = of(getCovariantTypeResolver().LIZIZ(typeVariableArrV2[i]));
                    Type type4 = actualTypeArguments[i];
                    TypeVariable typeVariable = typeVariableArrV2[i];
                    if (!abstractC19891512sDOf2.runtimeType.equals(type4)) {
                        if (type4 instanceof WildcardType) {
                            C19891212sA c19891212sALIZLLL = LIZLLL(typeVariable, (WildcardType) type4);
                            if (!new C19894012sc(c19891212sALIZLLL.getUpperBounds(), false).LIZIZ(abstractC19891512sDOf2.runtimeType) || !new C19894012sc(c19891212sALIZLLL.getLowerBounds(), false).LIZ(abstractC19891512sDOf2.runtimeType)) {
                            }
                        } else if (!LJ(abstractC19891512sDOf2.runtimeType).equals(LJ(type4))) {
                            return false;
                        }
                    }
                }
                if (!Modifier.isStatic(((Class) parameterizedType.getRawType()).getModifiers()) && parameterizedType.getOwnerType() != null) {
                    Type ownerType2 = parameterizedType.getOwnerType();
                    Iterator<AbstractC19891512sD<? super T>> it2 = getTypes().iterator();
                    while (it2.hasNext()) {
                        Type type5 = it2.next().runtimeType;
                        if (type5 instanceof ParameterizedType) {
                            ownerType = ((ParameterizedType) type5).getOwnerType();
                        } else if (type5 instanceof Class) {
                            ownerType = ((Class) type5).getEnclosingClass();
                        } else {
                            continue;
                        }
                        if (ownerType == null || !of(ownerType).isSubtypeOf(ownerType2)) {
                        }
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        if (!(type instanceof GenericArrayType)) {
            return false;
        }
        GenericArrayType genericArrayType2 = (GenericArrayType) type;
        if (!(type2 instanceof Class)) {
            return false;
        }
        Class cls2 = (Class) type2;
        if (!cls2.isArray()) {
            return false;
        }
        return of((Class) cls2.getComponentType()).isSubtypeOf(genericArrayType2.getGenericComponentType());
    }

    public final boolean isSupertypeOf(Type type) {
        return of(type).isSubtypeOf(getType());
    }

    public final AbstractC19893312sV<T, Object> method(final Method method) {
        C19864312np.LIZIZ(method, this, "%s not declared by %s", LJII(method.getDeclaringClass()));
        return new C19893712sZ<T>(method) { // from class: X.12sU
            @Override // X.AbstractC19893312sV
            public final String toString() {
                String strValueOf = String.valueOf(this.LLILLL);
                String string = super.toString();
                StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + String.valueOf(string).length());
                sb.append(strValueOf);
                sb.append(e3.d);
                sb.append(string);
                return sb.toString();
            }

            @Override // X.AbstractC19893312sV
            public final AbstractC19891512sD<T> LIZ() {
                return this.LLILLL;
            }
        };
    }

    public final AbstractC19891512sD<?> resolveType(Type type) {
        type.getClass();
        return of(getInvariantTypeResolver().LIZIZ(type));
    }

    public static AbstractC19891512sD<?> of(Type type) {
        return new C19893812sa(type);
    }

    public final boolean isSubtypeOf(AbstractC19891512sD<?> abstractC19891512sD) {
        return isSubtypeOf(abstractC19891512sD.getType());
    }

    public final boolean isSupertypeOf(AbstractC19891512sD<?> abstractC19891512sD) {
        return abstractC19891512sD.isSubtypeOf(getType());
    }

    public static Type LIZJ(Type type, TypeVariable typeVariable) {
        if (type instanceof WildcardType) {
            return LIZLLL(typeVariable, (WildcardType) type);
        }
        return LJ(type);
    }

    public static C19891212sA LIZLLL(TypeVariable typeVariable, WildcardType wildcardType) {
        Type[] bounds = typeVariable.getBounds();
        ArrayList arrayList = new ArrayList();
        for (Type type : wildcardType.getUpperBounds()) {
            if (!new C19894012sc(bounds, true).LIZ(type)) {
                arrayList.add(LJ(type));
            }
        }
        return new C19891212sA(wildcardType.getLowerBounds(), (Type[]) arrayList.toArray(new Type[0]));
    }

    public final AbstractC19891512sD<? super T> LJFF(Class<? super T> cls, Type[] typeArr) {
        for (Type type : typeArr) {
            AbstractC19891512sD<?> abstractC19891512sDOf = of(type);
            if (abstractC19891512sDOf.isSubtypeOf(cls)) {
                return (AbstractC19891512sD<? super T>) abstractC19891512sDOf.getSupertype(cls);
            }
        }
        String strValueOf = String.valueOf(cls);
        String strValueOf2 = String.valueOf(this);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 23 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append(" isn't a super type of ");
        sb.append(strValueOf2);
        throw new IllegalArgumentException(sb.toString());
    }

    public final <X> AbstractC19891512sD<T> where(AbstractC19894612si<X> abstractC19894612si, Class<X> cls) {
        return where(abstractC19894612si, of((Class) cls));
    }

    public final <X> AbstractC19891512sD<T> where(AbstractC19894612si<X> abstractC19894612si, AbstractC19891512sD<X> abstractC19891512sD) {
        new C19891612sE();
        throw null;
    }
}
