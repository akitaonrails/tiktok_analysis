package X;

import com.bytedance.retrofit2.mime.MimeUtil;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: X.09Dt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2337109Dt<T> implements InterfaceC1501660pBE<TypedInput, T> {
    public final Gson LIZ;
    public final TypeAdapter<T> LIZIZ;

    @Override // X.InterfaceC1501660pBE
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final T LIZ(TypedInput typedInput) {
        String charset = "UTF-8";
        if (typedInput.mimeType() != null) {
            charset = MimeUtil.parseCharset(typedInput.mimeType(), "UTF-8");
        }
        InputStreamReader inputStreamReader = new InputStreamReader(typedInput.in(), charset);
        try {
            T t = this.LIZIZ.read(this.LIZ.LJIIL(inputStreamReader));
            if ((t instanceof InterfaceC2337209Du) && (typedInput instanceof TypedByteArray)) {
                ((InterfaceC2337209Du) t).setJsonData(new String(((TypedByteArray) typedInput).getBytes(), charset));
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

    public C2337109Dt(Gson gson, TypeAdapter<T> typeAdapter) {
        this.LIZ = gson;
        this.LIZIZ = typeAdapter;
    }
}
