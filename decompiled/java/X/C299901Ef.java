package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestAndAudienceRoleChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.01Ef, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C299901Ef extends AbstractC301401Eu {
    public final C01GW LJFF;

    @Override // X.AbstractC301401Eu
    public final String LJ() {
        return "GuestTextHeaderModel";
    }

    @Override // X.AbstractC301401Eu
    public final void LJFF() {
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.CQ2(MultiGuestAndAudienceRoleChannel.class, this, new C5183020f(this, 289));
        }
    }

    @Override // X.AbstractC301401Eu
    public final void LJI() {
        super.LJI();
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    public C299901Ef(DataChannel dataChannel) {
        super(dataChannel);
        this.LJFF = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(456));
    }
}
