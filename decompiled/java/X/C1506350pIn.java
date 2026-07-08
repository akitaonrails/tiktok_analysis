package X;

import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.mime.TypedInput;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: X.0pIn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1506350pIn extends AbstractC2343909Gj {
    @Override // X.AbstractC2343909Gj
    public final InterfaceC1501660pBE<TypedInput, ?> LJ(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type != InterfaceC1516690pZT.class) {
            return null;
        }
        return new InterfaceC1501660pBE() { // from class: X.0pIm
            @Override // X.InterfaceC1501660pBE
            public final Object LIZ(Object obj) {
                return new C1506310pIj(((TypedInput) obj).in());
            }
        };
    }
}
