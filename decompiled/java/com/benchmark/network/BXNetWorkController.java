package com.benchmark.network;

import X.C2188811AlT;
import X.C806910Vl3;
import X.C806930Vl5;
import X.C844160X9q;
import X.InterfaceC844170X9r;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes14.dex */
public class BXNetWorkController {
    public static InterfaceC844170X9r mNetWorker;

    public static void init() {
        if (mNetWorker == null) {
            mNetWorker = new C844160X9q();
        }
    }

    public static String getNetworkClassify() {
        return C806910Vl3.LIZ();
    }

    public static ByteBenchResponse execute(ByteBenchRequest byteBenchRequest) {
        ByteBenchResponse byteBenchResponse = new ByteBenchResponse();
        InterfaceC844170X9r interfaceC844170X9r = mNetWorker;
        if (interfaceC844170X9r != null) {
            ByteArrayOutputStream byteArrayOutputStream = null;
            try {
                try {
                    try {
                        ByteArrayOutputStream byteArrayOutputStreamLIZ = ((C844160X9q) interfaceC844170X9r).LIZ(byteBenchRequest, byteBenchResponse);
                        if (byteArrayOutputStreamLIZ == null) {
                            byteBenchResponse.mErrorCode = -1;
                            return byteBenchResponse;
                        }
                        byteBenchResponse.mData = byteArrayOutputStreamLIZ.toString();
                        byteBenchResponse.mErrorCode = 0;
                        byteArrayOutputStreamLIZ.close();
                        return byteBenchResponse;
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                        byteBenchResponse.mMessage = e.getMessage();
                        byteBenchResponse.mErrorCode = -1;
                        if (0 != 0) {
                            byteArrayOutputStream.close();
                            return byteBenchResponse;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (0 != 0) {
                        try {
                            byteArrayOutputStream.close();
                            throw th;
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                return byteBenchResponse;
            }
        } else {
            byteBenchResponse.mErrorCode = -1;
        }
        return byteBenchResponse;
    }

    public static void setNetWorkImp(InterfaceC844170X9r interfaceC844170X9r) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setNetWorkImp: ");
        sbLIZ.append(interfaceC844170X9r.toString());
        C2188811AlT.LIZIZ(sbLIZ);
        C806930Vl5.LIZJ("BXNetWorkController");
        mNetWorker = interfaceC844170X9r;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00d0 A[Catch: Exception -> 0x00d4, TRY_LEAVE, TryCatch #7 {Exception -> 0x00d4, blocks: (B:51:0x00cb, B:53:0x00d0), top: B:65:0x00cb }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean downloadFile(java.lang.String r9, java.lang.String r10, java.lang.String r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.benchmark.network.BXNetWorkController.downloadFile(java.lang.String, java.lang.String, java.lang.String):boolean");
    }
}
