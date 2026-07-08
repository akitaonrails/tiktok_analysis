package X;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: X.12sC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19891412sC implements ParameterizedType, Serializable {
    public static final long serialVersionUID = 0;
    public final Type LL;
    public final AbstractC19875512pd<Type> LLILLJJLI;
    public final Class<?> LLILLL;

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return (Type[]) this.LLILLJJLI.toArray(new Type[0]);
    }

    public int hashCode() {
        Type type = this.LL;
        return ((type == null ? 0 : type.hashCode()) ^ this.LLILLJJLI.hashCode()) ^ this.LLILLL.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.LL != null) {
            EnumC19892112sJ enumC19892112sJ = EnumC19892112sJ.LLILLL;
            enumC19892112sJ.getClass();
            if (!(enumC19892112sJ instanceof C19894312sf)) {
                sb.append(enumC19892112sJ.LJFF(this.LL));
                sb.append('.');
            }
        }
        sb.append(this.LLILLL.getName());
        sb.append('<');
        C823900WTs c823900WTs = C19891812sG.LIZIZ;
        final AbstractC19875512pd<Type> abstractC19875512pd = this.LLILLJJLI;
        abstractC19875512pd.getClass();
        sb.append(c823900WTs.LIZIZ(new AbstractC19890312s1<Object>() { // from class: X.12s4
            public final /* synthetic */ InterfaceC19882712qn LLILLL = C19891812sG.LIZ;

            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                Iterator it2 = abstractC19875512pd.iterator();
                InterfaceC19882712qn interfaceC19882712qn = this.LLILLL;
                interfaceC19882712qn.getClass();
                return new C19874912pX(it2, interfaceC19882712qn);
            }
        }));
        sb.append('>');
        return sb.toString();
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.LL;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return this.LLILLL;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        if (!getRawType().equals(parameterizedType.getRawType()) || !C19837412jU.LIZ(getOwnerType(), parameterizedType.getOwnerType()) || !Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
            return false;
        }
        return true;
    }

    public C19891412sC(Type type, Class<?> cls, Type[] typeArr) {
        boolean z;
        cls.getClass();
        if (typeArr.length == C786410Ut5.V2(cls).length) {
            z = true;
        } else {
            z = false;
        }
        C19864312np.LJ(z);
        C19891812sG.LIZ(typeArr, "type parameter");
        this.LL = type;
        this.LLILLL = cls;
        this.LLILLJJLI = EnumC19892112sJ.LLILLL.LJI(typeArr);
    }
}
