package X;

import Y.ARunnableS120S0100000_20;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.orbu.core.TTKOrbu;
import com.orbu.core.adapter.TTKLiveSEIRequest;
import com.orbu.core.adapter.TTKResponseKt;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.SandboxParams;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0jBt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1271430jBt implements InterfaceC1272840jEA {
    public final C1269300j8S LL;
    public final SandboxParams LLILLJJLI;
    public final Map<String, String> LLILLL = new HashMap();
    public final boolean LLILZ;
    public final ARunnableS120S0100000_20 LLILZIL;

    @Override // X.InterfaceC1272840jEA
    public final void onRelease() {
        Handler handler;
        if (!this.LLILLJJLI.LIZ() || (handler = this.LL.LLILLL) == null) {
            return;
        }
        handler.removeCallbacks(this.LLILZIL);
    }

    public C1271430jBt(C1269300j8S c1269300j8S, SandboxParams sandboxParams) {
        Handler handler;
        this.LL = c1269300j8S;
        this.LLILLJJLI = sandboxParams;
        this.LLILZ = sandboxParams.enableAppDataSeiIntercept;
        ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(this, 313);
        this.LLILZIL = aRunnableS120S0100000_20;
        if (sandboxParams.LIZ() && (handler = c1269300j8S.LLILLL) != null) {
            C786410Ut5.LJLIIL(20000L, handler, aRunnableS120S0100000_20);
        }
    }

    public final int LIZ(Object obj, String str, String str2) {
        if (str == null) {
            return 0;
        }
        if (str2 == null) {
            ((HashMap) this.LLILLL).remove("x-tt-dataflow-id");
        } else {
            ((HashMap) this.LLILLL).put("x-tt-dataflow-id", str2);
        }
        try {
            if (TTKResponseKt.isBlock(TTKOrbu.INSTANCE.shouldInterceptTTKRequest(new TTKLiveSEIRequest(str, obj, this.LLILLL)))) {
                C1269300j8S c1269300j8S = this.LL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("key:");
                sbLIZ.append(str);
                sbLIZ.append(" value:");
                sbLIZ.append(obj);
                sbLIZ.append(" dfId:");
                sbLIZ.append(str2);
                c1269300j8S.LIZ("sandbox_intercept", "sei_intercept", C2188811AlT.LIZIZ(sbLIZ), null);
                return -20;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(e);
            C1274070jG9 c1274070jG9 = C1274080jGA.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("SandBoxException_sei_");
            sbLIZ2.append(str);
            c1274070jG9.LIZ(C2188811AlT.LIZIZ(sbLIZ2), androidRuntimeException);
            if (C1274040jG6.LIZ()) {
                throw androidRuntimeException;
            }
        }
        return 0;
    }
}
