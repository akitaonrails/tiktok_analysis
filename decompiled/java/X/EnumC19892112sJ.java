package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.12sJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class EnumC19892112sJ {
    public static final C19894212se LL;
    public static final C19892812sQ LLILLJJLI;
    public static final EnumC19892112sJ LLILLL;
    public static final /* synthetic */ EnumC19892112sJ[] LLILZ;

    public EnumC19892112sJ() {
        throw null;
    }

    public abstract Type LIZJ(Type type);

    public abstract Type LJII(Type type);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.12sJ, X.12sQ] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.12sJ, X.12se] */
    static {
        EnumC19892112sJ enumC19892112sJ = new EnumC19892112sJ() { // from class: X.12sd
            @Override // X.EnumC19892112sJ
            public final Type LIZJ(Type type) {
                return new C19893112sT(type);
            }

            @Override // X.EnumC19892112sJ
            public final Type LJII(Type type) {
                type.getClass();
                if (type instanceof Class) {
                    Class cls = (Class) type;
                    if (cls.isArray()) {
                        return new C19893112sT(cls.getComponentType());
                    }
                    return type;
                }
                return type;
            }
        };
        ?? r4 = new EnumC19892112sJ() { // from class: X.12se
            @Override // X.EnumC19892112sJ
            public final Type LIZJ(Type type) {
                if (type instanceof Class) {
                    return Array.newInstance((Class<?>) type, 0).getClass();
                }
                return new C19893112sT(type);
            }

            @Override // X.EnumC19892112sJ
            public final Type LJII(Type type) {
                type.getClass();
                return type;
            }
        };
        LL = r4;
        ?? r3 = new EnumC19892112sJ() { // from class: X.12sQ
            @Override // X.EnumC19892112sJ
            public final Type LIZJ(Type type) {
                return EnumC19892112sJ.LL.LIZJ(type);
            }

            @Override // X.EnumC19892112sJ
            public final String LJFF(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", new Class[0]).invoke(type, new Object[0]);
                } catch (IllegalAccessException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new RuntimeException(e);
                } catch (NoSuchMethodException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                } catch (InvocationTargetException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    throw new RuntimeException(e3);
                }
            }

            @Override // X.EnumC19892112sJ
            public final Type LJII(Type type) {
                type.getClass();
                return type;
            }
        };
        LLILLJJLI = r3;
        EnumC19892112sJ enumC19892112sJ2 = new EnumC19892112sJ() { // from class: X.12sf
            @Override // X.EnumC19892112sJ
            public final Type LIZJ(Type type) {
                return EnumC19892112sJ.LLILLJJLI.LIZJ(type);
            }

            @Override // X.EnumC19892112sJ
            public final String LJFF(Type type) {
                return EnumC19892112sJ.LLILLJJLI.LJFF(type);
            }

            @Override // X.EnumC19892112sJ
            public final Type LJII(Type type) {
                type.getClass();
                return type;
            }
        };
        LLILZ = new EnumC19892112sJ[]{enumC19892112sJ, r4, r3, enumC19892112sJ2};
        if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
            if (new AbstractC19893612sY<Map.Entry<String, int[][]>>() { // from class: X.12sh
            }.LIZ().toString().contains("java.util.Map.java.util.Map")) {
                LLILLL = r3;
                return;
            } else {
                LLILLL = enumC19892112sJ2;
                return;
            }
        }
        if (new AbstractC19893612sY<int[]>() { // from class: X.12sj
        }.LIZ() instanceof Class) {
            LLILLL = r4;
        } else {
            LLILLL = enumC19892112sJ;
        }
    }

    public static EnumC19892112sJ[] values() {
        return (EnumC19892112sJ[]) LLILZ.clone();
    }

    public static EnumC19892112sJ valueOf(String str) {
        return (EnumC19892112sJ) C08FF.LIZ(EnumC19892112sJ.class, str);
    }

    public String LJFF(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    public final AbstractC19875512pd<Type> LJI(Type[] typeArr) {
        C19876312pl c19876312plBuilder = AbstractC19875512pd.builder();
        for (Type type : typeArr) {
            c19876312plBuilder.LIZLLL(LJII(type));
        }
        return c19876312plBuilder.LJI();
    }

    public EnumC19892112sJ(String str, int i) {
    }
}
