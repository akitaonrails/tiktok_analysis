package X;

import com.bytedance.amg.minigameruntime.common.network.http.ttnet.TTNetRetrofitApi;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0pBr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1502050pBr {
    public final C1502070pBt LIZ;
    public final Throwable LIZIZ;
    public final C0X9S<?> LIZJ;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C1502050pBr(C1502070pBt c1502070pBt) {
        Object objLIZ;
        TypedOutput typedByteArray;
        C0X9S<?> c0x9sOptions;
        this.LIZ = c1502070pBt;
        try {
            String str = c1502070pBt.LIZIZ;
            C1502140pC0 c1502140pC0 = c1502070pBt.LIZJ;
            ArrayList arrayList = new ArrayList();
            List<C1502120pBy> list = c1502140pC0.LIZ;
            for (C1502120pBy c1502120pBy : list == null ? null : list) {
                arrayList.add(new C080U(c1502120pBy.LIZ, c1502120pBy.LIZIZ));
            }
            C1502070pBt c1502070pBt2 = this.LIZ;
            if (c1502070pBt2.LJIIIIZZ == null) {
                c1502070pBt2.LJIIIIZZ = UriProtector.parse(c1502070pBt2.LIZ);
            }
            String strLIZ = C081U.LIZ(c1502070pBt2.LJIIIIZZ);
            String str2 = this.LIZ.LIZ;
            C1493620oyG c1493620oyG = new C1493620oyG();
            C1502070pBt c1502070pBt3 = this.LIZ;
            c1493620oyG.LIZJ = c1502070pBt3.LJ;
            c1493620oyG.LIZLLL = c1502070pBt3.LJFF;
            c1493620oyG.LJ = c1502070pBt3.LJI;
            c1493620oyG.LJIIIZ = true;
            boolean z = c1502070pBt3.LJII;
            C1515150pWz c1515150pWz = C1515150pWz.LIZ;
            synchronized (c1515150pWz) {
                Retrofit retrofitLJ = c1515150pWz.LJ(strLIZ);
                if (retrofitLJ != null) {
                    objLIZ = retrofitLJ.LIZ(TTNetRetrofitApi.class);
                } else {
                    objLIZ = null;
                }
            }
            TTNetRetrofitApi tTNetRetrofitApi = (TTNetRetrofitApi) objLIZ;
            if (tTNetRetrofitApi != null) {
                final C1502090pBv c1502090pBv = this.LIZ.LIZLLL;
                if (c1502090pBv != null) {
                    typedByteArray = new TypedOutput(c1502090pBv) { // from class: X.0pBu
                        public final C1502090pBv LIZ;

                        @Override // com.bytedance.retrofit2.mime.TypedOutput
                        public final String md5Stub() {
                            return null;
                        }

                        @Override // com.bytedance.retrofit2.mime.TypedOutput
                        public final String fileName() {
                            this.LIZ.getClass();
                            return null;
                        }

                        @Override // com.bytedance.retrofit2.mime.TypedOutput
                        public final long length() {
                            return this.LIZ.LIZ.length;
                        }

                        @Override // com.bytedance.retrofit2.mime.TypedOutput
                        public final String mimeType() {
                            return this.LIZ.LIZIZ;
                        }

                        {
                            this.LIZ = c1502090pBv;
                        }

                        @Override // com.bytedance.retrofit2.mime.TypedOutput
                        public final void writeTo(OutputStream outputStream) throws IOException {
                            outputStream.write(this.LIZ.LIZ);
                        }
                    };
                } else {
                    typedByteArray = new TypedByteArray(null, new byte[0], new String[0]);
                }
                HashMap map = new HashMap();
                switch (str.hashCode()) {
                    case -531492226:
                        if (str.equals("OPTIONS")) {
                            c0x9sOptions = tTNetRetrofitApi.options(Integer.MAX_VALUE, str2, map, typedByteArray, arrayList, c1493620oyG, false);
                            break;
                        }
                        throw new RuntimeException("call need method");
                    case 70454:
                        if (str.equals("GET")) {
                            if (z) {
                                c0x9sOptions = tTNetRetrofitApi.getStream(Integer.MAX_VALUE, str2, map, arrayList, c1493620oyG, false);
                            } else {
                                c0x9sOptions = tTNetRetrofitApi.getWithHigh(Integer.MAX_VALUE, str2, map, arrayList, c1493620oyG, false);
                            }
                            break;
                        }
                        throw new RuntimeException("call need method");
                    case 79599:
                        if (str.equals("PUT")) {
                            if (z) {
                                c0x9sOptions = tTNetRetrofitApi.putStream(Integer.MAX_VALUE, str2, map, typedByteArray, arrayList, c1493620oyG, false);
                            } else {
                                c0x9sOptions = tTNetRetrofitApi.put(Integer.MAX_VALUE, str2, map, typedByteArray, arrayList, c1493620oyG, false);
                            }
                            break;
                        }
                        throw new RuntimeException("call need method");
                    case 2213344:
                        if (str.equals("HEAD")) {
                            c0x9sOptions = tTNetRetrofitApi.head(Integer.MAX_VALUE, str2, map, arrayList, c1493620oyG, false);
                            break;
                        }
                        throw new RuntimeException("call need method");
                    case 2461856:
                        if (str.equals("POST")) {
                            if (z) {
                                c0x9sOptions = tTNetRetrofitApi.postStream(Integer.MAX_VALUE, str2, map, typedByteArray, arrayList, c1493620oyG, false);
                            } else {
                                c0x9sOptions = tTNetRetrofitApi.postWithHigh(Integer.MAX_VALUE, str2, map, typedByteArray, arrayList, c1493620oyG, false);
                            }
                            break;
                        }
                        throw new RuntimeException("call need method");
                    case 75900968:
                        if (str.equals("PATCH")) {
                            c0x9sOptions = tTNetRetrofitApi.patch(Integer.MAX_VALUE, str2, map, typedByteArray, arrayList, c1493620oyG, false);
                            break;
                        }
                        throw new RuntimeException("call need method");
                    case 80083237:
                        if (str.equals("TRACE")) {
                            c0x9sOptions = tTNetRetrofitApi.trace(Integer.MAX_VALUE, str2, map, arrayList, c1493620oyG, false);
                            break;
                        }
                        throw new RuntimeException("call need method");
                    case 1669334218:
                        if (str.equals("CONNECT")) {
                            c0x9sOptions = tTNetRetrofitApi.connect(Integer.MAX_VALUE, str2, map, arrayList, c1493620oyG, false);
                            break;
                        }
                        throw new RuntimeException("call need method");
                    case 2012838315:
                        if (str.equals("DELETE")) {
                            c0x9sOptions = tTNetRetrofitApi.delete(Integer.MAX_VALUE, str2, map, typedByteArray, arrayList, c1493620oyG, false);
                            break;
                        }
                        throw new RuntimeException("call need method");
                    default:
                        throw new RuntimeException("call need method");
                }
                this.LIZJ = c0x9sOptions;
                return;
            }
            throw new RuntimeException("generateTTNetApi Fail");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZIZ = th;
        }
    }

    public static C1502600pCk LIZ(C0X52 c0x52) {
        Object obj;
        C1293960jmE c1293960jmE;
        List<C080U> list = c0x52.LIZ.LIZLLL;
        C1502130pBz c1502130pBz = new C1502130pBz();
        if (list != null) {
            for (C080U c080u : list) {
                String str = c080u.LIZ;
                String str2 = c080u.LIZIZ;
                if (str != null && str2 != null) {
                    c1502130pBz.LIZ(str, str2);
                }
            }
        }
        C1502140pC0 c1502140pC0LIZIZ = c1502130pBz.LIZIZ();
        if (c0x52.LIZJ()) {
            obj = c0x52.LIZIZ;
        } else {
            obj = c0x52.LIZJ;
        }
        if (obj instanceof TypedInput) {
            TypedInput typedInput = (TypedInput) obj;
            String strMimeType = typedInput.mimeType();
            c1293960jmE = new C1293960jmE(typedInput.in(), typedInput.length(), strMimeType);
        } else {
            c1293960jmE = null;
        }
        C2175508fh c2175508fh = c0x52.LIZ;
        return new C1502600pCk(c2175508fh.LIZIZ, c2175508fh.LIZJ, c1502140pC0LIZIZ, c1293960jmE, null);
    }
}
