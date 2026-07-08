package X;

import com.bytedance.pipo.verify.base.model.StatusReason;
import com.bytedance.pipo.verify.base.model.response.AlertMsg;
import com.bytedance.pipo.verify.base.model.response.DoVerifyResponse;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ujF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1714950ujF {
    public final C1713570uh1 LIZ;
    public final C1714660uim LIZIZ;
    public final C1714180ui0 LIZJ;
    public final InterfaceC1631620sYq<C1713570uh1, String, InterfaceC1364105Vn<? super String>, Object> LIZLLL;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC1715120ujW LIZ(BaseResponse baseResponse) {
        String str;
        Integer num;
        String str2;
        String str3;
        try {
            AbstractC989680brS abstractC989680brSLIZ = C1714990ujJ.LIZ(baseResponse);
            if (abstractC989680brSLIZ instanceof C991330bu7) {
                if (Intrinsics.LJFF(((C991330bu7) abstractC989680brSLIZ).LIZIZ, "SESSION_EXPIRED")) {
                    return C1715280ujm.LIZ;
                }
                return new C991350bu9(((C991330bu7) abstractC989680brSLIZ).LIZIZ, ((C991330bu7) abstractC989680brSLIZ).LIZJ, ((C991330bu7) abstractC989680brSLIZ).LIZLLL);
            }
            if (abstractC989680brSLIZ instanceof C989670brR) {
                return new C989690brT(((C989670brR) abstractC989680brSLIZ).LIZIZ);
            }
            if (abstractC989680brSLIZ instanceof C989660brQ) {
                DoVerifyResponse doVerifyResponse = (DoVerifyResponse) ((C989660brQ) abstractC989680brSLIZ).LIZIZ;
                String str4 = null;
                Integer num2 = null;
                if (doVerifyResponse != null && (str = doVerifyResponse.verifyResult) != null) {
                    switch (str.hashCode()) {
                        case -1881380961:
                            if (str.equals("REJECT")) {
                                AlertMsg alertMsg = doVerifyResponse.alertMsg;
                                if (alertMsg != null) {
                                    str2 = alertMsg.title;
                                    str3 = alertMsg.content;
                                } else {
                                    str2 = null;
                                    str3 = null;
                                }
                                StatusReason statusReason = doVerifyResponse.statusReason;
                                if (statusReason != null) {
                                    num2 = statusReason.reasonCode;
                                }
                                return new C1714980ujI(alertMsg, num2, str2, str3);
                            }
                            break;
                        case 2448401:
                            if (str.equals("PASS")) {
                                return new C991740bum(doVerifyResponse.nextVerifyInfo);
                            }
                            break;
                        case 35394935:
                            if (str.equals("PENDING")) {
                                StatusReason statusReason2 = doVerifyResponse.statusReason;
                                if (statusReason2 != null) {
                                    num = statusReason2.reasonCode;
                                    str4 = statusReason2.reasonMsg;
                                } else {
                                    num = null;
                                }
                                return new C1715000ujK(num, str4, statusReason2);
                            }
                            break;
                        case 1141576252:
                            if (str.equals("SESSION_EXPIRED")) {
                                return C1715280ujm.LIZ;
                            }
                            break;
                    }
                }
                return new C989690brT(new RuntimeException() { // from class: X.0ujf
                });
            }
            throw new C1954807lC();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return new C989690brT(th);
        }
    }

    public final Object LIZIZ(String str, InterfaceC1364105Vn<? super InterfaceC1715120ujW> interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C1714930ujD(this, str, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1714950ujF(C1713570uh1 c1713570uh1, C1714660uim c1714660uim, C1714180ui0 c1714180ui0, InterfaceC1631620sYq<? super C1713570uh1, ? super String, ? super InterfaceC1364105Vn<? super String>, ? extends Object> interfaceC1631620sYq) {
        this.LIZ = c1713570uh1;
        this.LIZIZ = c1714660uim;
        this.LIZJ = c1714180ui0;
        this.LIZLLL = interfaceC1631620sYq;
    }
}
