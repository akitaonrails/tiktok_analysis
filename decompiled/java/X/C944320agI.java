package X;

import com.bytedance.android.live.liveinteract.api.MultiCoHostIconGroupChangeChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0agI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C944320agI implements InterfaceC915740ZwC {
    public static final C944320agI LIZ = new C944320agI();

    @Override // X.InterfaceC915740ZwC
    public final void LIZ(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onProgressChanged: inProgress ");
        sbLIZ.append(z);
        sbLIZ.append(", isCoHostScene ");
        sbLIZ.append(C917810ZzX.LJIIIIZZ());
        C20441214yg.LJIIIZ("MultiCoHostIconHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (z && !C917810ZzX.LJIIIIZZ()) {
            C934350aQD c934350aQD = C944330agJ.LIZIZ;
            if (c934350aQD != null) {
                c934350aQD.LJ(8, 1);
            }
            DataChannel dataChannel = C944330agJ.LIZJ;
            if (dataChannel != null) {
                dataChannel.zW(MultiCoHostIconGroupChangeChannel.class, Boolean.TRUE);
                return;
            }
            return;
        }
        C934350aQD c934350aQD2 = C944330agJ.LIZIZ;
        if (c934350aQD2 != null) {
            c934350aQD2.LJ(0, 1);
        }
        DataChannel dataChannel2 = C944330agJ.LIZJ;
        if (dataChannel2 == null) {
            return;
        }
        dataChannel2.zW(MultiCoHostIconGroupChangeChannel.class, Boolean.FALSE);
    }
}
