package X;

import Y.AfS135S0000000_12;
import Y.AfS181S0100000_12;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceEffectInitSuccessChannel;

/* JADX INFO: renamed from: X.0THS, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0THS implements C0UGO {
    public final /* synthetic */ C0UUF LIZ;

    public C0THS(C0UUF c0uuf) {
        this.LIZ = c0uuf;
    }

    @Override // X.C0UGO
    public final void onError(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mCameraCapture onError = ");
        sbLIZ.append(i);
        sbLIZ.append(" ");
        sbLIZ.append(i2);
        sbLIZ.append(" ");
        sbLIZ.append((String) null);
        C20441214yg.LIZIZ("LinkVideo2View", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C0UGO
    public final void onInfo(int i, int i2, int i3, String str) {
        if (i == 1 && !this.LIZ.LLIZLLLIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onInfo CameraState.EFFECT_INIT_SUCCESS ");
            sbLIZ.append(hashCode());
            C20441214yg.LIZIZ("LinkVideo2View", C2188811AlT.LIZIZ(sbLIZ));
            DataChannel dataChannel = this.LIZ.LLJILLL;
            if (dataChannel != null) {
                dataChannel.zW(MultiLetsDanceEffectInitSuccessChannel.class, Boolean.TRUE);
            }
            this.LIZ.LLJ = (C11JF) C11NZ.LJJJJZ(1).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS181S0100000_12(this, 36), new AfS135S0000000_12(0));
        }
    }
}
