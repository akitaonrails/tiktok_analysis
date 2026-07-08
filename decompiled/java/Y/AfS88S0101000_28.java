package Y;

import X.C09JN;
import X.C1C7U;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.live.notification.NotificationDetailSettingFragment;
import com.ss.android.ugc.aweme.live.notification.NotificationSettingFragment;

/* JADX INFO: loaded from: classes29.dex */
public class AfS88S0101000_28 implements C09JN {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS88S0101000_28 afS88S0101000_28, Object obj) {
        C1C7U.LIZ("NotificationSettingFragment@1bf2.changePostSettings$1");
        if (((BaseResponse) obj).status_code == 0) {
            ((NotificationSettingFragment) afS88S0101000_28.l0).MR(1, afS88S0101000_28.i1);
        } else {
            ((NotificationSettingFragment) afS88S0101000_28.l0).VR(null, null, false);
        }
        C1C7U.LIZIZ("NotificationSettingFragment@1bf2.changePostSettings$1");
    }

    public static final void accept$1(AfS88S0101000_28 afS88S0101000_28, Object obj) {
        C1C7U.LIZ("NotificationDetailSettingFragment@87b.changePostSettings$1");
        if (((BaseResponse) obj).status_code == 0) {
            ((NotificationDetailSettingFragment) afS88S0101000_28.l0).MR(1, afS88S0101000_28.i1);
        } else {
            ((NotificationDetailSettingFragment) afS88S0101000_28.l0).ZR(null, null, false);
        }
        C1C7U.LIZIZ("NotificationDetailSettingFragment@87b.changePostSettings$1");
    }

    public AfS88S0101000_28(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
