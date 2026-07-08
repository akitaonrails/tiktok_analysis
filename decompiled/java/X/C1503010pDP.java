package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pDP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1503010pDP extends AbstractC1503180pDg {
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8 A[PHI: r0
      0x00b8: PHI (r0v15 java.io.File) = (r0v14 java.io.File), (r0v27 java.io.File) binds: [B:30:0x00b0, B:32:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r21, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r22, X.EnumC1063300dmC r23) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1503010pDP.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }

    public static void LIZJ(Context context, String str, String str2, final int i, final int i2, final Map map, final CompletionBlock completionBlock) {
        final Uri uriLIZIZ = C09NB.LIZIZ(context, str, "image/jpeg", Boolean.valueOf(Intrinsics.LJFF(str2, "image")));
        C786410Ut5.LJJZZIII(C1502940pDI.LIZ(), new Runnable() { // from class: X.0pDV
            public final void LIZ() {
                CompletionBlock<InterfaceC1503090pDX> completionBlock2 = completionBlock;
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1503090pDX.class, null);
                int i3 = i;
                int i4 = i2;
                Map<String, String> map2 = map;
                Uri uri = uriLIZIZ;
                InterfaceC1503090pDX interfaceC1503090pDX = (InterfaceC1503090pDX) xBaseModelLIZJ;
                interfaceC1503090pDX.setHttpCode(Integer.valueOf(i3));
                interfaceC1503090pDX.setClientCode(Integer.valueOf(i4));
                interfaceC1503090pDX.setHeader(map2);
                interfaceC1503090pDX.setFilePath(uri.toString());
                completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("XDownloadFileMethod@208.handleAndCallbackSuccess$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("XDownloadFileMethod@208.handleAndCallbackSuccess$1");
            }
        });
    }
}
