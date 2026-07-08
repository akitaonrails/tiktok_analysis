package X;

import Y.AfS181S0100000_12;
import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0Upt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C784430Upt {
    public final BaseFragment LIZ;
    public final DataChannel LIZIZ;

    public final void onEvent(C1085120eLO c1085120eLO) {
        if (!this.LIZ.isViewValid()) {
            return;
        }
        if (c1085120eLO.LIZIZ) {
            this.LIZIZ.zW(KeyboardStatusChannel.class, Boolean.TRUE);
        } else {
            this.LIZIZ.zW(KeyboardStatusChannel.class, Boolean.FALSE);
        }
    }

    public C784430Upt(BaseFragment baseFragment, DataChannel dataChannel) {
        this.LIZ = baseFragment;
        this.LIZIZ = dataChannel;
        C784440Upu.LIZ().LJI(baseFragment, C1085120eLO.class).LIZJ(new AfS181S0100000_12(this, 306));
    }
}
