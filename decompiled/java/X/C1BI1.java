package X;

import Y.ARunnableS134S0100000_34;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.internal.WebDialog;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BI1, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BI1 extends WebDialog {
    public static final /* synthetic */ int LLJJ = 0;
    public boolean LLJILLL;

    @Override // com.facebook.internal.WebDialog, android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        C1064820doe c1064820doe = this.LLILZ;
        if (!this.LLJIJIL || this.LLJ || c1064820doe == null || !c1064820doe.isShown()) {
            super.cancel();
        } else {
            if (this.LLJILLL) {
                return;
            }
            this.LLJILLL = true;
            C786410Ut5.ue(c1064820doe, Intrinsics.LJIIJJI("(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();", "javascript:"));
            C786410Ut5.LJLIIL(1500L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS134S0100000_34(this, 70));
        }
    }

    public static void LJJZ(C1BI1 c1bi1) {
        C1C7U.LIZ("FacebookWebFallbackDialog@2b9d.cancel$1L");
        super.cancel();
        C1C7U.LIZIZ("FacebookWebFallbackDialog@2b9d.cancel$1L");
    }

    @Override // com.facebook.internal.WebDialog
    public final Bundle LJJLIIJ(String str) {
        Bundle bundleLJIJ = C0W7Q.LJIJ(Uri.parse(str).getQuery());
        String string = bundleLJIJ.getString("bridge_args");
        bundleLJIJ.remove("bridge_args");
        if (!C0W7Q.LJIILL(string)) {
            try {
                C786410Ut5.LJJIIZI(bundleLJIJ, C1BFA.LIZ(new JSONObject(string)), "com.facebook.platform.protocol.BRIDGE_ARGS");
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        String string2 = bundleLJIJ.getString("method_results");
        bundleLJIJ.remove("method_results");
        if (!C0W7Q.LJIILL(string2)) {
            try {
                C786410Ut5.LJJIIZI(bundleLJIJ, C1BFA.LIZ(new JSONObject(string2)), "com.facebook.platform.protocol.RESULT_ARGS");
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        bundleLJIJ.remove("version");
        C1BIE c1bie = C1BIE.LIZ;
        int iIntValue = 0;
        if (!C807660VmG.LIZ(C1BIE.class)) {
            try {
                iIntValue = C1BIE.LJ[0].intValue();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        bundleLJIJ.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", iIntValue);
        return bundleLJIJ;
    }

    public C1BI1(C19EG c19eg, String str, String str2) {
        super(c19eg, str);
        this.LLILLJJLI = str2;
    }
}
