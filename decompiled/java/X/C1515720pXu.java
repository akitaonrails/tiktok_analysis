package X;

import com.bytedance.ies.ugc.aweme.network.chunk.INetworkChunkPerformanceService;
import com.bytedance.ies.ugc.aweme.network.chunk.INetworkChunkRaxService;
import com.bytedance.retrofit2.mime.MimeUtil;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.app.api.INetworkChunkNotify;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.0pXu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1515720pXu<T> implements InterfaceC1515570pXf<byte[], T> {
    public final C1515820pY4<byte[]> LIZ;
    public final TypedInput LIZIZ;
    public final /* synthetic */ C09G9 LIZJ;

    @Override // X.InterfaceC1515570pXf
    public final Object apply(byte[] bArr) {
        byte[] bArr2 = bArr;
        String charset = "UTF-8";
        if (this.LIZIZ.mimeType() != null) {
            charset = MimeUtil.parseCharset(this.LIZIZ.mimeType(), "UTF-8");
        }
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new ByteArrayInputStream(bArr2), charset);
            try {
                Object obj = this.LIZJ.LIZIZ.read(this.LIZJ.LIZ.LJIIL(inputStreamReader));
                if (obj instanceof InterfaceC1201180hMa) {
                    ((InterfaceC1201180hMa) obj).setRequestInfo(this.LIZ.getRequestInfo());
                }
                if (obj instanceof C0X12) {
                    ((C0X12) obj).setRequestId(this.LIZ.LLILLL);
                }
                if (obj instanceof InterfaceC1515800pY2) {
                    ((InterfaceC1515800pY2) obj).LIZIZ(this.LIZ.LIZIZ());
                }
                if (obj instanceof InterfaceC1515810pY3) {
                    this.LIZ.getClass();
                    ((InterfaceC1515810pY3) obj).LIZ();
                }
                if ((obj instanceof n) && ((INetworkChunkPerformanceService) ServiceManager.get().getService(INetworkChunkPerformanceService.class)).isOpen()) {
                    try {
                        C644110POf c644110POf = this.LIZ.LIZIZ().LIZIZ().get(this.LIZ.LIZIZ().LIZIZ().size() - 1);
                        n nVar = (n) obj;
                        nVar.LJJIII(Long.valueOf(this.LIZ.getRequestInfo().LJI), "tsn_send");
                        nVar.LJJIII(Long.valueOf(c644110POf.LIZJ), "tsn_read_start");
                        nVar.LJJIII(Long.valueOf(c644110POf.LJ), "tsn_read_each_start");
                        nVar.LJJIII(Long.valueOf(c644110POf.LIZIZ), "tsn_read_each_dur");
                        nVar.LJJIII(Long.valueOf(c644110POf.LJI), "tsn_read_each_end");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                INetworkChunkRaxService iNetworkChunkRaxService = (INetworkChunkRaxService) ServiceManager.get().getService(INetworkChunkRaxService.class);
                if (iNetworkChunkRaxService != null) {
                    iNetworkChunkRaxService.isOpen();
                }
                INetworkChunkNotify iNetworkChunkNotify = (INetworkChunkNotify) PluggableExtentionKt.pluggableSpi$default(INetworkChunkNotify.class, false, false, false, 14, null);
                if (iNetworkChunkNotify != null && charset != null && bArr2 != null) {
                    iNetworkChunkNotify.onChunkDataStreamFinish(obj, bArr2, charset, this.LIZ.getRequestInfo(), EnumC1515750pXx.NORMAL);
                }
                inputStreamReader.close();
                return obj;
            } finally {
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new RuntimeException(e2);
        }
    }

    public C1515720pXu(C09G9 c09g9, TypedInput typedInput, C1515820pY4<byte[]> c1515820pY4) {
        this.LIZJ = c09g9;
        this.LIZ = c1515820pY4;
        this.LIZIZ = typedInput;
    }
}
