package X;

import android.os.Looper;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.level.FansClubUpgradeMemberLevelSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0eBK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1078880eBK implements InterfaceC1095000ebK {
    public final DataChannel LIZ;
    public Gift LIZIZ;
    public boolean LIZJ;
    public final BPEAHandler LIZLLL = new BPEAHandler(Looper.getMainLooper(), new C1151670g4j(this, 7));

    @Override // X.InterfaceC1095000ebK
    public final void onRelease() {
        this.LIZJ = false;
        this.LIZLLL.removeMessages(4);
    }

    @Override // X.InterfaceC1095000ebK
    public final void LIZ() {
        Boolean bool;
        FansClubUpgradeMemberLevelSetting fansClubUpgradeMemberLevelSetting = FansClubUpgradeMemberLevelSetting.INSTANCE;
        if (fansClubUpgradeMemberLevelSetting.getValue().enable) {
            DataChannel dataChannel = this.LIZ;
            if (dataChannel == null || (bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) == null || (!bool.booleanValue())) {
                BPEAHandler bPEAHandler = this.LIZLLL;
                Integer num = fansClubUpgradeMemberLevelSetting.getValue().detectionTime;
                C786410Ut5.LJLJJI(4, ((long) (num != null ? num.intValue() : 30)) * 1000, bPEAHandler);
            }
        }
    }

    @Override // X.InterfaceC1095000ebK
    public final boolean LIZIZ() {
        return this.LIZJ;
    }

    public C1078880eBK(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }
}
