package X;

import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.concurrent.CancellationException;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0MK9, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MK9 {
    public final C0MKL LIZ;
    public final C0MKK LIZIZ;
    public AnonymousClass0956 LIZJ;
    public C099G LIZLLL;
    public DialogC1389620mGW LJ;
    public C0MK7 LJFF;

    public C0MK9(C0MKL c0mkl) {
        this.LIZ = c0mkl;
        this.LIZIZ = new C0MKK(c0mkl);
    }

    public final void LIZ(RuntimeException runtimeException) {
        int errorCode;
        String errorMsg;
        C0XIR c0xir;
        C23112093u c23112093u;
        C201955140j.LIZIZ("ForwardEnvironment", "exception happen in prepareDataFlow,directly cancel");
        AnonymousClass0956 anonymousClass0956 = this.LIZJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LIZ.LIZLLL();
        C099G c099g = this.LIZLLL;
        if (c099g != null) {
            c099g.LIZIZ(null);
        }
        this.LIZLLL = null;
        DialogC1389620mGW dialogC1389620mGW = this.LJ;
        if (dialogC1389620mGW != null) {
            C0FNV.LIZ(dialogC1389620mGW);
        }
        this.LJ = null;
        if (this.LJFF != null) {
            C0MK7.LIZ();
        }
        if (runtimeException instanceof CancellationException) {
            Throwable cause = runtimeException.getCause();
            if ((cause instanceof C0XIR) && (c23112093u = (C23112093u) cause) != null) {
                errorCode = c23112093u.getErrorCode();
            } else {
                errorCode = 0;
            }
            Throwable cause2 = runtimeException.getCause();
            if (!(cause2 instanceof C0XIR) || (c0xir = (C0XIR) cause2) == null || (errorMsg = c0xir.getErrorMsg()) == null) {
                errorMsg = "Operation cancelled";
            }
            this.LIZIZ.LIZIZ(Integer.valueOf(errorCode), errorMsg);
            return;
        }
        if (runtimeException instanceof C0MKB) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Media download failed: ");
            sbLIZ.append(runtimeException.getMessage());
            sbLIZ.append(". Source paths: ");
            sbLIZ.append(C13LP.LJJLIIIJ(((C0MKB) runtimeException).getSourcePaths(), null, null, null, 0, null, null, 63));
            this.LIZIZ.LIZIZ(-1001, C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (runtimeException instanceof IllegalStateException) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Invalid state: ");
            sbLIZ2.append(runtimeException.getMessage());
            this.LIZIZ.LIZIZ(-4001, C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (runtimeException instanceof IllegalArgumentException) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Invalid argument: ");
            sbLIZ3.append(runtimeException.getMessage());
            this.LIZIZ.LIZIZ(-4002, C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("Unknown error: ");
        sbLIZ4.append(runtimeException.getClass().getSimpleName());
        sbLIZ4.append(" - ");
        sbLIZ4.append(runtimeException.getMessage());
        this.LIZIZ.LIZIZ(-9999, C2188811AlT.LIZIZ(sbLIZ4));
    }

    public final void LIZIZ(ForwardMedia forwardMedia) {
        long duration;
        C201955140j.LIZIZ("ForwardEnvironment", "prepareForwardData");
        if (this.LJFF != null) {
            C0MK7.LIZIZ();
        }
        SimVideoUrlModel simVideoUrlModel = forwardMedia.video.getSimVideoUrlModel();
        if (simVideoUrlModel != null) {
            duration = (long) simVideoUrlModel.getDuration();
        } else {
            duration = 0;
        }
        this.LIZIZ.LIZJ = C2097608Jq.LJIIIIZZ(new Pair("video_duration", Long.valueOf(duration)), new Pair("enter_from", forwardMedia.eventType));
        C0MKK c0mkk = this.LIZIZ;
        c0mkk.getClass();
        C0MKK.LIZ(c0mkk, C0MKA.START, null, null, null, 14);
        AnonymousClass0956 anonymousClass0956 = this.LIZJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C099G c099g = this.LIZLLL;
        if (c099g != null) {
            c099g.LIZIZ(null);
        }
    }
}
