package X;

import com.bytedance.retrofit2.mime.MimeUtil;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: X.09DO, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09DO<T> implements InterfaceC1501660pBE<TypedInput, T> {
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

    public C09DO(Gson gson, TypeAdapter<T> typeAdapter) {
        this.LIZ = gson;
        this.LIZIZ = typeAdapter;
    }
}
