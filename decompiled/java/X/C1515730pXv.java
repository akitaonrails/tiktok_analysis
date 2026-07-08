package X;

import com.bytedance.ies.ugc.aweme.network.chunk.INetworkChunkPerformanceService;
import com.bytedance.ies.ugc.aweme.network.chunk.INetworkChunkRaxService;
import com.bytedance.retrofit2.mime.MimeUtil;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.n;
import com.ss.android.ugc.aweme.app.api.INetworkChunkNotify;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0pXv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1515730pXv<T> implements InterfaceC1501660pBE<TypedInput, C1515820pY4<T>> {
    public final Gson LIZ;
    public final TypeAdapter<T> LIZIZ;
    public final Function2<byte[], String, Unit> LIZJ;
    public final String LIZLLL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0pXy] */
    @Override // X.InterfaceC1501660pBE
    public final Object LIZ(TypedInput typedInput) {
        final C1515920pYE c1515920pYE;
        String charset;
        TypedInput typedInput2 = typedInput;
        String strMimeType = typedInput2.mimeType();
        final String str = "UTF-8";
        if (strMimeType != null && (charset = MimeUtil.parseCharset(strMimeType, "UTF-8")) != null) {
            str = charset;
        }
        final C1515820pY4<byte[]> c1515820pY4LIZ = new C1515670pXp(typedInput2.in()).LIZ();
        Function2<byte[], String, Unit> function2 = this.LIZJ;
        if (function2 != null) {
            c1515920pYE = new C1515920pYE(function2, this.LIZLLL);
        } else {
            c1515920pYE = null;
        }
        C1515840pY6 c1515840pY6LIZJ = c1515820pY4LIZ.LIZJ(new InterfaceC1515570pXf<byte[], T>(str, c1515820pY4LIZ, c1515920pYE) { // from class: X.0pXw
            public final String LIZ;
            public final C1515820pY4<byte[]> LIZIZ;
            public final C1515920pYE LIZJ;

            @Override // X.InterfaceC1515570pXf
            public final Object apply(byte[] bArr) throws Throwable {
                byte[] bArr2 = bArr;
                try {
                    Object objLIZLLL = this.LIZLLL.LIZLLL(this.LIZ, bArr2);
                    C1515920pYE c1515920pYE2 = this.LIZJ;
                    if (c1515920pYE2 != null) {
                        c1515920pYE2.LIZIZ(bArr2);
                    }
                    C1515730pXv<T> c1515730pXv = this.LIZLLL;
                    C1515820pY4<byte[]> c1515820pY4 = this.LIZIZ;
                    c1515730pXv.getClass();
                    C1515730pXv.LIZJ(objLIZLLL, c1515820pY4);
                    C1515730pXv<T> c1515730pXv2 = this.LIZLLL;
                    C1515820pY4<byte[]> c1515820pY42 = this.LIZIZ;
                    c1515730pXv2.getClass();
                    C1515730pXv.LIZIZ(objLIZLLL, c1515820pY42);
                    this.LIZLLL.getClass();
                    INetworkChunkRaxService iNetworkChunkRaxService = (INetworkChunkRaxService) ServiceManager.get().getService(INetworkChunkRaxService.class);
                    if (iNetworkChunkRaxService != null) {
                        iNetworkChunkRaxService.isOpen();
                    }
                    C1515730pXv<T> c1515730pXv3 = this.LIZLLL;
                    String str2 = this.LIZ;
                    C1515820pY4<byte[]> c1515820pY43 = this.LIZIZ;
                    c1515730pXv3.getClass();
                    INetworkChunkNotify iNetworkChunkNotify = (INetworkChunkNotify) PluggableExtentionKt.pluggableSpi$default(INetworkChunkNotify.class, false, false, false, 14, null);
                    if (iNetworkChunkNotify != null && objLIZLLL != null) {
                        iNetworkChunkNotify.onChunkDataStreamFinish(objLIZLLL, bArr2, str2, c1515820pY43.getRequestInfo(), EnumC1515750pXx.NORMAL);
                    }
                    return objLIZLLL;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1515920pYE c1515920pYE3 = this.LIZJ;
                    if (c1515920pYE3 != null) {
                        c1515920pYE3.LIZ();
                    }
                    throw new RuntimeException(e);
                }
            }

            {
                this.LIZ = str;
                this.LIZIZ = c1515820pY4LIZ;
                this.LIZJ = c1515920pYE;
            }
        });
        if (c1515920pYE != null) {
            return new C1515840pY6(new C1515770pXz(c1515840pY6LIZJ, new InterfaceC1515790pY1<Object>() { // from class: X.0pXy
                @Override // X.InterfaceC1515790pY1
                public final Object onNext(Object obj) {
                    return obj;
                }

                @Override // X.InterfaceC1515790pY1
                public final void onComplete() {
                    c1515920pYE.LIZ();
                }

                @Override // X.InterfaceC1515790pY1
                public final void onFailed() {
                    c1515920pYE.LIZ();
                }
            }), c1515840pY6LIZJ);
        }
        return c1515840pY6LIZJ;
    }

    public static void LIZIZ(Object obj, C1515820pY4 c1515820pY4) {
        INetworkChunkPerformanceService iNetworkChunkPerformanceService;
        if ((obj instanceof n) && (iNetworkChunkPerformanceService = (INetworkChunkPerformanceService) ServiceManager.get().getService(INetworkChunkPerformanceService.class)) != null && iNetworkChunkPerformanceService.isOpen()) {
            try {
                C644110POf c644110POf = (C644110POf) C13LP.LJJLIIIJJI(c1515820pY4.LIZIZ().LIZIZ());
                ((n) obj).LJJIII(Long.valueOf(c1515820pY4.getRequestInfo().LJI), "tsn_send");
                ((n) obj).LJJIII(Long.valueOf(c644110POf.LIZJ), "tsn_read_start");
                ((n) obj).LJJIII(Long.valueOf(c644110POf.LJ), "tsn_read_each_start");
                ((n) obj).LJJIII(Long.valueOf(c644110POf.LIZIZ), "tsn_read_each_dur");
                ((n) obj).LJJIII(Long.valueOf(c644110POf.LJI), "tsn_read_each_end");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void LIZJ(Object obj, C1515820pY4 c1515820pY4) {
        InterfaceC1515810pY3 interfaceC1515810pY3;
        InterfaceC1515800pY2 interfaceC1515800pY2;
        C0X12 c0x12;
        InterfaceC1201180hMa interfaceC1201180hMa;
        if ((obj instanceof InterfaceC1201180hMa) && (interfaceC1201180hMa = (InterfaceC1201180hMa) obj) != null) {
            interfaceC1201180hMa.setRequestInfo(c1515820pY4.getRequestInfo());
        }
        if ((obj instanceof C0X12) && (c0x12 = (C0X12) obj) != null) {
            c0x12.setRequestId(c1515820pY4.LLILLL);
        }
        if ((obj instanceof InterfaceC1515800pY2) && (interfaceC1515800pY2 = (InterfaceC1515800pY2) obj) != null) {
            interfaceC1515800pY2.LIZIZ(c1515820pY4.LIZIZ());
        }
        if ((obj instanceof InterfaceC1515810pY3) && (interfaceC1515810pY3 = (InterfaceC1515810pY3) obj) != null) {
            c1515820pY4.getClass();
            interfaceC1515810pY3.LIZ();
        }
    }

    public final Object LIZLLL(String str, byte[] bArr) throws Throwable {
        InputStreamReader inputStreamReader = new InputStreamReader(new ByteArrayInputStream(bArr), str);
        try {
            T t = this.LIZIZ.read(this.LIZ.LJIIL(inputStreamReader));
            C2107108Nh.LIZ(inputStreamReader, null);
            return t;
        } catch (Throwable th) {
            th = th;
            try {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                } catch (Throwable th2) {
                    th = th2;
                    th = null;
                    TryCatchGuardChecker.doCheck(th);
                    C2107108Nh.LIZ(inputStreamReader, th);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1515730pXv(Gson gson, TypeAdapter<T> typeAdapter, Function2<? super byte[], ? super String, Unit> function2, String str) {
        this.LIZ = gson;
        this.LIZIZ = typeAdapter;
        this.LIZJ = function2;
        this.LIZLLL = str;
    }
}
