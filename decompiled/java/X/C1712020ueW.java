package X;

import Y.ARunnableS126S0100000_26;
import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ueW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1712020ueW {
    public final Context LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1594));

    public final DialogC1718130uoN LIZ() {
        return (DialogC1718130uoN) this.LIZIZ.getValue();
    }

    public final void LIZIZ() {
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS126S0100000_26(this, 126));
            return;
        }
        try {
            DialogC1718130uoN dialogC1718130uoNLIZ = LIZ();
            dialogC1718130uoNLIZ.dismiss();
            C785410UrT.LIZ(dialogC1718130uoNLIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dismiss SecureDialog exception: ");
            sbLIZ.append(th);
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LIZJ() {
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS126S0100000_26(this, 127));
            return;
        }
        try {
            if (LIZ().isShowing()) {
                return;
            }
            DialogC1718130uoN dialogC1718130uoNLIZ = LIZ();
            dialogC1718130uoNLIZ.setCancelable(false);
            dialogC1718130uoNLIZ.show();
            C785410UrT.LIZIZ(dialogC1718130uoNLIZ);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJ(dialogC1718130uoNLIZ);
            C816490W1f.LIZ(dialogC1718130uoNLIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("show SecureDialog exception: ");
            sbLIZ.append(th);
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public C1712020ueW(Context context) {
        this.LIZ = context;
    }
}
