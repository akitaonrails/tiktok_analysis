package X;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.12sG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19891812sG {
    public static final C19891312sB LIZ = new InterfaceC19882712qn<Type, String>() { // from class: X.12sB
        @Override // X.InterfaceC19882712qn
        public final String apply(Type type) {
            return EnumC19892112sJ.LLILLL.LJFF(type);
        }
    };
    public static final C823900WTs LIZIZ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.12sB] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0WTs] */
    static {
        final C823890WTr c823890WTr = new C823890WTr(", ");
        LIZIZ = new C823890WTr(c823890WTr) { // from class: X.0WTs
            public final /* synthetic */ String LIZIZ = "null";

            @Override // X.C823890WTr
            public final CharSequence LIZJ(Object obj) {
                if (obj == null) {
                    return this.LIZIZ;
                }
                return c823890WTr.LIZJ(obj);
            }
        };
    }

    public static Type LIZIZ(Type type) {
        type.getClass();
        final AtomicReference atomicReference = new AtomicReference();
        new C09FG() { // from class: X.12sR
            @Override // X.C09FG
            public final void LIZIZ(Class<?> cls) {
                atomicReference.set(cls.getComponentType());
            }

            @Override // X.C09FG
            public final void LIZJ(GenericArrayType genericArrayType) {
                atomicReference.set(genericArrayType.getGenericComponentType());
            }

            @Override // X.C09FG
            public final void LJ(TypeVariable<?> typeVariable) {
                atomicReference.set(C19891812sG.LJFF(typeVariable.getBounds()));
            }

            @Override // X.C09FG
            public final void LJFF(WildcardType wildcardType) {
                atomicReference.set(C19891812sG.LJFF(wildcardType.getUpperBounds()));
            }
        }.LIZ(type);
        return (Type) atomicReference.get();
    }

    public static Type LIZJ(Type type) {
        boolean z;
        boolean z2;
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            if (lowerBounds.length <= 1) {
                z = true;
            } else {
                z = false;
            }
            C19864312np.LIZLLL("Wildcard cannot have more than one lower bounds.", z);
            if (lowerBounds.length == 1) {
                return new C19891212sA(new Type[]{LIZJ(lowerBounds[0])}, new Type[]{Object.class});
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            C19864312np.LIZLLL("Wildcard should have only one upper bound.", z2);
            return new C19891212sA(new Type[0], new Type[]{LIZJ(upperBounds[0])});
        }
        return EnumC19892112sJ.LLILLL.LIZJ(type);
    }

    public static Type LJFF(Type[] typeArr) {
        for (Type type : typeArr) {
            Type typeLIZIZ = LIZIZ(type);
            if (typeLIZIZ != null) {
                if (typeLIZIZ instanceof Class) {
                    Class cls = (Class) typeLIZIZ;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return new C19891212sA(new Type[0], new Type[]{typeLIZIZ});
            }
        }
        return null;
    }

    public static void LIZ(Type[] typeArr, String str) {
        for (Type type : typeArr) {
            if (type instanceof Class) {
                C19864312np.LIZIZ((Class) type, str, "Primitive type '%s' used as %s", !r2.isPrimitive());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.12sN] */
    public static <D extends GenericDeclaration> TypeVariable<D> LIZLLL(final D d, final String str, final Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        C19892312sL c19892312sL = new C19892312sL(new Object(d, str, typeArr) { // from class: X.12sN
            public final D LIZ;
            public final String LIZIZ;
            public final AbstractC19875512pd<Type> LIZJ;

            public final int hashCode() {
                return this.LIZ.hashCode() ^ this.LIZIZ.hashCode();
            }

            public final String toString() {
                return this.LIZIZ;
            }

            public final boolean equals(Object obj) {
                if (C19893512sX.LIZ) {
                    if (obj == null || !Proxy.isProxyClass(obj.getClass()) || !(Proxy.getInvocationHandler(obj) instanceof C19892312sL)) {
                        return false;
                    }
                    C19892512sN<?> c19892512sN = ((C19892312sL) Proxy.getInvocationHandler(obj)).LL;
                    if (this.LIZIZ.equals(c19892512sN.LIZIZ) && this.LIZ.equals(c19892512sN.LIZ) && this.LIZJ.equals(c19892512sN.LIZJ)) {
                        return true;
                    }
                    return false;
                }
                if (!(obj instanceof TypeVariable)) {
                    return false;
                }
                TypeVariable typeVariable = (TypeVariable) obj;
                if (this.LIZIZ.equals(typeVariable.getName()) && this.LIZ.equals(typeVariable.getGenericDeclaration())) {
                    return true;
                }
                return false;
            }

            {
                C19891812sG.LIZ(typeArr, "bound for type variable");
                d.getClass();
                this.LIZ = d;
                str.getClass();
                this.LIZIZ = str;
                this.LIZJ = AbstractC19875512pd.copyOf(typeArr);
            }
        });
        C19864312np.LIZJ(TypeVariable.class, "%s is not an interface", TypeVariable.class.isInterface());
        return (TypeVariable) TypeVariable.class.cast(Proxy.newProxyInstance(TypeVariable.class.getClassLoader(), new Class[]{TypeVariable.class}, c19892312sL));
    }

    public static C19891412sC LJ(Type type, Class cls, Type... typeArr) {
        boolean z;
        if (type == null) {
            return new C19891412sC(EnumC19897012t6.LL.LIZJ(cls), cls, typeArr);
        }
        if (cls.getEnclosingClass() != null) {
            z = true;
        } else {
            z = false;
        }
        C19864312np.LIZJ(cls, "Owner type for unenclosed %s", z);
        return new C19891412sC(type, cls, typeArr);
    }
}
