package X;

import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0Cos, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C325160Cos {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4701));

    public static int LIZ() {
        int i = C325150Cor.LIZ[((INetworkStateService) LIZ.getValue()).getNetworkStatus().ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                return 0;
            }
            if (i == 4) {
                return 1;
            }
        }
        return -1;
    }

    public static Pair LIZIZ(Throwable th) {
        int iLIZ;
        String errorMsg;
        if (th instanceof C325170Cot) {
            C325170Cot c325170Cot = (C325170Cot) th;
            iLIZ = c325170Cot.getErrorCode();
            errorMsg = c325170Cot.getErrorMsg();
        } else if (th instanceof C0XIR) {
            C0XIR c0xir = (C0XIR) th;
            iLIZ = c0xir.getErrorCode();
            errorMsg = c0xir.getErrorMsg();
        } else if (th instanceof C1494690ozz) {
            iLIZ = ((C1494690ozz) th).getCronetInternalErrorCode();
            if (iLIZ < 0) {
                iLIZ = -iLIZ;
            }
            errorMsg = "cronet io error";
        } else if (th instanceof C1494450ozb) {
            iLIZ = ((C1494450ozb) th).getCronetInternalErrorCode();
            if (iLIZ < 0) {
                iLIZ = -iLIZ;
            }
            errorMsg = "net is not available";
        } else {
            C844470XAv.LIZ.getClass();
            iLIZ = C1498560p6E.LIZ(C844470XAv.LIZ(), th);
            errorMsg = "net error";
        }
        return new Pair(Integer.valueOf(iLIZ), errorMsg);
    }
}
