package X;

import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.mime.TypedInput;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09G4, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09G4 extends AbstractC2343909Gj {
    public static Class LJI(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return LJI(((ParameterizedType) type).getRawType());
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) LJI(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return LJI(((WildcardType) type).getUpperBounds()[0]);
        }
        return null;
    }

    @Override // X.AbstractC2343909Gj
    public final InterfaceC1501660pBE<TypedInput, ?> LJ(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (Intrinsics.LJFF(LJI(type), C1515820pY4.class)) {
            return new C09G7();
        }
        return null;
    }
}
