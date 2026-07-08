package com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.guest;

import X.C299601Ec;
import X.C320501Md;
import X.C766270U4b;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseVmWidget;
import com.bytedance.android.livesdk.userservice.UserService;
import java.util.HashMap;
import java.util.Map;
import tikcast.linkmic.common.LinkerMediaChangeOperator;

/* JADX INFO: loaded from: classes.dex */
public final class CountdownGuestWidget extends BaseVmWidget<CountdownGuestViewModel> {
    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseVmWidget
    public final String A1() {
        return "CountdownGuestWidget";
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseVmWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseVmWidget
    public final Class<CountdownGuestViewModel> z1() {
        return CountdownGuestViewModel.class;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseVmWidget
    public final void B1(C299601Ec c299601Ec) {
        LinkerMediaChangeOperator linkerMediaChangeOperator = c299601Ec.LJIIJ;
        if (linkerMediaChangeOperator != null && UserService.getInstance().user().getCurrentUserId() == c299601Ec.LIZ) {
            int i = linkerMediaChangeOperator.operatorType;
            if (i == 2) {
                C766270U4b.LIZLLL(2131843208);
            } else if (i == 1) {
                C766270U4b.LIZLLL(2131843210);
            }
        }
        super.B1(c299601Ec);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseVmWidget
    public final void C1(C299601Ec c299601Ec) {
        LinkerMediaChangeOperator linkerMediaChangeOperator = c299601Ec.LJIIJ;
        if (linkerMediaChangeOperator != null && UserService.getInstance().user().getCurrentUserId() == c299601Ec.LIZ) {
            int i = linkerMediaChangeOperator.operatorType;
            if (i == 2) {
                C766270U4b.LIZLLL(2131843209);
            } else if (i == 1) {
                C766270U4b.LIZLLL(2131843211);
            }
            String strValueOf = String.valueOf(c299601Ec.LIZ);
            String str = c299601Ec.LIZJ;
            Map mapLIZ = C320501Md.LIZ();
            HashMap map = (HashMap) mapLIZ;
            map.put("link_id", str);
            map.put("guest_id", strValueOf);
            C320501Md.LJ("livesdk_guest_countdown_toast", mapLIZ);
        }
        super.C1(c299601Ec);
        y1(c299601Ec);
    }
}
