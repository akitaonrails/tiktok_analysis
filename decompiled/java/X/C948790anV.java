package X;

import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;

/* JADX INFO: renamed from: X.0anV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C948790anV {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(ILiveMatchService iLiveMatchService, IMultiHostService iMultiHostService) {
        if (!iLiveMatchService.r82() || !C948770anT.LJ() || !C948770anT.LIZ() || iMultiHostService.LJJIIJZLJL().isEmpty()) {
            return false;
        }
        C20337914i1<Integer> c20337914i1 = InterfaceC934710aQn.Cb;
        Integer numLIZIZ = c20337914i1.LIZIZ();
        if (numLIZIZ.intValue() >= 3) {
            return false;
        }
        c20337914i1.LJFF(Integer.valueOf(numLIZIZ.intValue() + 1));
        return true;
    }
}
