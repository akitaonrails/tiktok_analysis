package X;

import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.mime.MimeUtil;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.comment.model.CommentJsonRawData;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: X.09Dw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2337409Dw extends AbstractC2343909Gj {
    public final C2336209Dk LIZ;
    public final Gson LIZIZ;

    public C2337409Dw(Gson gson) {
        this.LIZIZ = gson;
        this.LIZ = new C2336209Dk(gson);
    }

    @Override // X.AbstractC2343909Gj
    public final InterfaceC1501660pBE<TypedInput, ?> LJ(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        final TypeAdapter typeAdapterLJIIIZ = this.LIZIZ.LJIIIZ(TypeToken.get(type));
        final Gson gson = this.LIZIZ;
        return new InterfaceC1501660pBE<TypedInput, T>(gson, typeAdapterLJIIIZ) { // from class: X.09Dv
            public final Gson LIZ;
            public final TypeAdapter<T> LIZIZ;

            @Override // X.InterfaceC1501660pBE
            public final Object LIZ(TypedInput typedInput) {
                TypedInput typedInput2 = typedInput;
                String charset = "UTF-8";
                if (typedInput2.mimeType() != null) {
                    charset = MimeUtil.parseCharset(typedInput2.mimeType(), "UTF-8");
                }
                InputStreamReader inputStreamReader = new InputStreamReader(typedInput2.in(), charset);
                try {
                    T t = this.LIZIZ.read(this.LIZ.LJIIL(inputStreamReader));
                    if ((t instanceof InterfaceC2337209Du) && (typedInput2 instanceof TypedByteArray)) {
                        ((InterfaceC2337209Du) t).setJsonData(new String(((TypedByteArray) typedInput2).getBytes(), charset));
                    }
                    if ((t instanceof CommentJsonRawData) && (typedInput2 instanceof TypedByteArray)) {
                        ((CommentJsonRawData) t).setJsonData(new String(((TypedByteArray) typedInput2).getBytes(), charset));
                    }
                    try {
                        inputStreamReader.close();
                        return t;
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                        return t;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    try {
                        inputStreamReader.close();
                        throw th;
                    } catch (IOException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        throw th;
                    }
                }
            }

            {
                this.LIZ = gson;
                this.LIZIZ = typeAdapterLJIIIZ;
            }
        };
    }

    @Override // X.AbstractC2343909Gj
    public final InterfaceC1501660pBE<?, TypedOutput> LIZLLL(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        return this.LIZ.LIZLLL(type, annotationArr, annotationArr2, retrofit);
    }
}
