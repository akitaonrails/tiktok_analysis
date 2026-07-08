package X;

import com.bytedance.crash.Npth;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0Xg7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C854810Xg7 extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final int $t;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        switch (this.$t) {
            case 0:
                LJJ$0(this, coroutineContext, th);
                break;
            case 1:
                LJJ$1(this, coroutineContext, th);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C854810Xg7(C2185208hG c2185208hG, int i) {
        super(c2185208hG);
        this.$t = i;
    }

    public static final void LJJ$0(C854810Xg7 c854810Xg7, CoroutineContext coroutineContext, Throwable th) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[applicationScope] uncaught exception: ");
        sbLIZ.append(th);
        C845400XEk.LIZ("WsManagerV2", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("WsManagerV2: is channel null: ");
        if (C845320XEc.LJIIJJI == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ2.append(z);
        sbLIZ2.append(", is connected: ");
        sbLIZ2.append(C845320XEc.LJI.isConnected());
        Npth.reportBizException("social_websocket", th, C2188811AlT.LIZIZ(sbLIZ2), C2097608Jq.LJ());
    }

    public static final void LJJ$1(C854810Xg7 c854810Xg7, CoroutineContext coroutineContext, Throwable th) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAnchorClick preload error ");
        sbLIZ.append(th.getLocalizedMessage());
        C1720106oR.LIZ("CapCutAnchorView", C2188811AlT.LIZIZ(sbLIZ));
    }
}
