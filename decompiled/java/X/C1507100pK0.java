package X;

import Y.AObjectS73S0000000_23;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.mime.TypedInput;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0pK0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1507100pK0 extends AbstractC2343909Gj {
    public static C1507100pK0 LIZIZ;
    public final List<Object> LIZ = new CopyOnWriteArrayList();

    public static synchronized C1507100pK0 LJI() {
        if (LIZIZ == null) {
            LIZIZ = new C1507100pK0();
            AObjectS73S0000000_23 aObjectS73S0000000_23 = new AObjectS73S0000000_23(14);
            C388401f8.LIZIZ = true;
            C23250099c.LIZLLL(C388401f8.LIZ, null, null, new C01Y2(aObjectS73S0000000_23, null), 3);
        }
        return LIZIZ;
    }

    @Override // X.AbstractC2343909Gj
    public final InterfaceC1501660pBE<TypedInput, ?> LJ(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (!(type instanceof ParameterizedType)) {
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType = parameterizedType.getRawType();
        if (!(rawType instanceof Class) || !C1515820pY4.class.isAssignableFrom((Class) rawType)) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (actualTypeArguments.length == 1) {
            Type type2 = actualTypeArguments[0];
            if (!(type2 instanceof ParameterizedType) || ((ParameterizedType) type2).getRawType() != C1515830pY5.class) {
                return null;
            }
            return new C1515530pXb(parameterizedType);
        }
        throw new RuntimeException("ChunkBundle should have one generic type.");
    }
}
