package X;

import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0Oz2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C637220Oz2 {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(676));
    public final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(Fragment fragment) {
        C0SSZ c0ssz;
        try {
            if ((fragment instanceof C0SSZ) && (c0ssz = (C0SSZ) fragment) != null) {
                c0ssz.Bh();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C637190Oyz c637190Oyz = C637190Oyz.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("traverseLegacyFloating failed: ");
            sbLIZ.append(e.getMessage());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c637190Oyz.getClass();
            C637190Oyz.LIZIZ(strLIZIZ);
        }
    }
}
