package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.b0;
import java.util.List;

/* JADX INFO: renamed from: X.0k5I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1305780k5I implements InterfaceC1305790k5J {
    public final /* synthetic */ b0 LIZ;

    public C1305780k5I(b0 b0Var) {
        this.LIZ = b0Var;
    }

    public final TEFrameSizei LIZ(List<TEFrameSizei> list) {
        InterfaceC1271000jBC interfaceC1271000jBC = this.LIZ.mPreviewSizeCallback;
        TEFrameSizei tEFrameSizeiLJJJ = null;
        if (interfaceC1271000jBC != null) {
            try {
                tEFrameSizeiLJJJ = interfaceC1271000jBC.LJJJ(list);
                return tEFrameSizeiLJJJ;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("select preview size from client err: ");
                sbLIZ.append(e.getMessage());
                C2183341Ace.LIZIZ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return tEFrameSizeiLJJJ;
    }
}
