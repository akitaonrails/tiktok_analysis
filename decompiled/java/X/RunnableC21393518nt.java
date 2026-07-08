package X;

import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.xelement.input.LynxBaseInputView;
import com.bytedance.ies.xelement.input.LynxBaseInputView$showSoftInputRetryRunnable$mImmResultReceiver$1;
import com.lynx.base.log.LynxLog;
import j27.s;

/* JADX INFO: renamed from: X.18nt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class RunnableC21393518nt implements Runnable {
    public final s LL;
    public final LynxBaseInputView LLILLJJLI;
    public int LLILLL;
    public final LynxBaseInputView$showSoftInputRetryRunnable$mImmResultReceiver$1 LLILZ = new ResultReceiver() { // from class: com.bytedance.ies.xelement.input.LynxBaseInputView$showSoftInputRetryRunnable$mImmResultReceiver$1
        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i, Bundle bundle) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            LynxLog.i("LynxBaseInputView", "input call keyboard with RESULT_HIDDEN");
                            return;
                        }
                        return;
                    }
                    LynxLog.i("LynxBaseInputView", "input call keyboard with RESULT_SHOWN");
                    return;
                }
                LynxLog.i("LynxBaseInputView", "input call keyboard with RESULT_UNCHANGED_HIDDEN");
                return;
            }
            LynxLog.i("LynxBaseInputView", "input call keyboard with RESULT_UNCHANGED_SHOWN");
        }
    };

    public final void LIZ() {
        int i;
        Object objR2 = C786410Ut5.R2(this.LL, "input_method");
        if (objR2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
        if (((InputMethodManager) objR2).showSoftInput(this.LLILLJJLI.mView, 1, this.LLILZ) || (i = this.LLILLL) >= 3) {
            this.LLILLL = 0;
        } else {
            this.LLILLL = i + 1;
            HandlerHook.viewPost(this.LLILLJJLI.mView, this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LynxBaseInputView$showSoftInputRetryRunnable@4cd9.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxBaseInputView$showSoftInputRetryRunnable@4cd9.run");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.ies.xelement.input.LynxBaseInputView$showSoftInputRetryRunnable$mImmResultReceiver$1] */
    public RunnableC21393518nt(s sVar, LynxBaseInputView lynxBaseInputView) {
        this.LL = sVar;
        this.LLILLJJLI = lynxBaseInputView;
    }
}
