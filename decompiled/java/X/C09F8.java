package X;

import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.mime.MimeUtil;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.mime.TypedString;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: X.09F8, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09F8 extends AbstractC2343909Gj {
    static {
        C0X0P.LIZJ("text/plain");
    }

    @Override // X.AbstractC2343909Gj
    public final InterfaceC1501660pBE<TypedInput, ?> LJ(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (String.class.equals(type)) {
            return new InterfaceC1501660pBE() { // from class: X.09F7
                @Override // X.InterfaceC1501660pBE
                public final Object LIZ(Object obj) {
                    TypedInput typedInput = (TypedInput) obj;
                    if (typedInput instanceof TypedByteArray) {
                        String charset = "UTF-8";
                        if (typedInput.mimeType() != null) {
                            charset = MimeUtil.parseCharset(typedInput.mimeType(), "UTF-8");
                        }
                        return new String(((TypedByteArray) typedInput).getBytes(), charset);
                    }
                    return null;
                }
            };
        }
        return null;
    }

    @Override // X.AbstractC2343909Gj
    public final InterfaceC1501660pBE<?, TypedOutput> LIZLLL(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if (String.class.equals(type)) {
            return new InterfaceC1501660pBE<String, TypedOutput>() { // from class: X.09F9
                @Override // X.InterfaceC1501660pBE
                public final TypedOutput LIZ(String str) {
                    return new TypedString(str);
                }
            };
        }
        return null;
    }
}
