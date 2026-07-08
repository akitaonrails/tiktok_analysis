package X;

import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.google.gson.Gson;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: X.0pXS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1515440pXS extends AbstractC2343909Gj implements InterfaceC1499860p8K {
    public final Gson LIZ;
    public InterfaceC1515510pXZ LIZIZ;

    public C1515440pXS(Gson gson) {
        if (gson != null) {
            this.LIZ = gson;
            return;
        }
        throw new NullPointerException("gson == null");
    }

    @Override // X.InterfaceC1499860p8K
    public final void LIZ(InterfaceC1515510pXZ interfaceC1515510pXZ) {
        this.LIZIZ = interfaceC1515510pXZ;
    }

    @Override // X.AbstractC2343909Gj
    public final InterfaceC1501660pBE<TypedInput, ?> LJ(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            if (parameterizedType.getRawType() != ComposePbAndJson.class) {
                return null;
            }
            return new C1515490pXX(parameterizedType, this.LIZ, this.LIZIZ);
        }
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!Message.class.isAssignableFrom(cls)) {
            return null;
        }
        return new C1515470pXV(ProtoAdapter.get(cls));
    }

    @Override // X.AbstractC2343909Gj
    public final InterfaceC1501660pBE<?, TypedOutput> LIZLLL(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!Message.class.isAssignableFrom(cls)) {
            return null;
        }
        return new C1515460pXU(ProtoAdapter.get(cls));
    }
}
