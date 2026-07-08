package com.bytedance.android.live.liveinteract.multiguestv3.main.tool.anchor.wallpaper;

import X.C01GW;
import X.C11NJ;
import X.C452501pT;
import X.EnumC937290aUx;
import android.content.Context;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.Event;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class ShareBgSwitchLayoutController {
    public static final /* synthetic */ int LJI = 0;
    public final DataChannel LIZ;
    public final Context LIZIZ;
    public MultiLiveAnchorPanelSettings LJ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 1095));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(452));
    public final C11NJ LJFF = new C11NJ();

    public static final class ShareBgSwitchLayoutEvent extends Event<EnumC937290aUx> {
        public static final int $stable = 8;
    }

    public final void LIZ() {
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.CQ2(ShareBgSwitchLayoutEvent.class, this, new AwS594S0100000_15(this, 439));
        }
    }

    public ShareBgSwitchLayoutController(Context context, DataChannel dataChannel) {
        this.LIZ = dataChannel;
        this.LIZIZ = context;
    }
}
