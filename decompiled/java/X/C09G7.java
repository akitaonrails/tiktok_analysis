package X;

import com.bytedance.retrofit2.mime.MimeUtil;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: X.09G7, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09G7 implements InterfaceC1501660pBE<TypedInput, C1515820pY4<C311580CJg>> {
    public final Gson LIZ = new Gson();

    @Override // X.InterfaceC1501660pBE
    public final C1515820pY4<C311580CJg> LIZ(TypedInput typedInput) {
        final TypedInput typedInput2 = typedInput;
        if (typedInput2 == null) {
            return null;
        }
        return new C1515670pXp(typedInput2.in()).LIZ().LIZJ(new InterfaceC1515570pXf<byte[], C311580CJg>() { // from class: X.09G6
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.nio.charset.Charset] */
            @Override // X.InterfaceC1515570pXf
            public final C311580CJg apply(byte[] bArr) throws Throwable {
                String strMimeType;
                Charset charsetForName;
                byte[] bArr2 = bArr;
                if (bArr2 == null) {
                    return null;
                }
                TypedInput typedInput3 = typedInput2;
                if (typedInput3 != null) {
                    strMimeType = typedInput3.mimeType();
                } else {
                    strMimeType = null;
                }
                String strForName = "UTF-8";
                try {
                    strForName = Charset.forName(MimeUtil.parseCharset(strMimeType, "UTF-8"));
                    charsetForName = strForName;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    charsetForName = Charset.forName(strForName);
                }
                try {
                    InputStreamReader inputStreamReader = new InputStreamReader(new ByteArrayInputStream(bArr2), charsetForName);
                    C09G7 c09g7 = this;
                    try {
                        C311580CJg c311580CJg = new C311580CJg(bArr2.length, (k) c09g7.LIZ.LJ(c09g7.LIZ.LJIIL(inputStreamReader), k.class));
                        C2107108Nh.LIZ(inputStreamReader, null);
                        return c311580CJg;
                    } catch (Throwable th) {
                        th = th;
                        try {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(inputStreamReader, th);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            th = null;
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(inputStreamReader, th);
                            throw th;
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    throw new RuntimeException("Failed to parse chunk JSON", e2);
                }
            }
        });
    }
}
