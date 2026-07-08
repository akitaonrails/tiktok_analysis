package com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.avatar;

import X.C5183020f;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestAvatarLeaveRoomActionEvent;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes.dex */
public abstract class MultiGuestAbstractAvatarFragment extends LiveDialogFragment {
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, MultiGuestAvatarLeaveRoomActionEvent.class, new C5183020f(this, 28));
        }
    }
}
