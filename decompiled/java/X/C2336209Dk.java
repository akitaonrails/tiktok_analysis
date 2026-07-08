package X;

import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: X.09Dk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2336209Dk extends AbstractC2343909Gj {
    public final Gson LIZ;

    public C2336209Dk(Gson gson) {
        if (gson != null) {
            this.LIZ = gson;
            return;
        }
        throw new NullPointerException("gson == null");
    }

    @Override // X.AbstractC2343909Gj
    public final InterfaceC1501660pBE<TypedInput, ?> LJ(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        return new C2337109Dt(this.LIZ, this.LIZ.LJIIIZ(TypeToken.get(type)));
    }

    @Override // X.AbstractC2343909Gj
    public final InterfaceC1501660pBE<?, TypedOutput> LIZLLL(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        final TypeAdapter typeAdapterLJIIIZ = this.LIZ.LJIIIZ(TypeToken.get(type));
        final Gson gson = this.LIZ;
        return new InterfaceC1501660pBE<T, TypedOutput>(gson, typeAdapterLJIIIZ) { // from class: X.09DN
            public static final Charset LIZJ = Charset.forName("UTF-8");
            public final Gson LIZ;
            public final TypeAdapter<T> LIZIZ;

            @Override // X.InterfaceC1501660pBE
            public final TypedOutput LIZ(Object obj) throws IOException {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
                C09DL c09dlLJIILIIL = this.LIZ.LJIILIIL(new OutputStreamWriter(byteArrayOutputStream, LIZJ));
                this.LIZIZ.write(c09dlLJIILIIL, obj);
                c09dlLJIILIIL.close();
                return new TypedByteArray("application/json; charset=UTF-8", byteArrayOutputStream.toByteArray(), new String[0]);
            }

            {
                this.LIZ = gson;
                this.LIZIZ = typeAdapterLJIIIZ;
            }
        };
    }
}
