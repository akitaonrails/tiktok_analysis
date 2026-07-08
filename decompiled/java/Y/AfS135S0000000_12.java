package Y;

import X.C09JN;
import X.C1061730djf;
import X.C1548820qPI;
import X.C19EG;
import X.C1C7U;
import X.C20441214yg;
import X.C397901gf;
import X.C931190aL7;
import android.os.SystemClock;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.commercialize.ba.impl.api.UserGetResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.ISettingManagerService;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes13.dex */
public class AfS135S0000000_12 implements C09JN {
    public final int $t;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
        }
    }

    public AfS135S0000000_12(int i) {
        this.$t = i;
    }

    public AfS135S0000000_12(C19EG c19eg, int i) {
        this.$t = i;
    }

    public static final void accept$0(AfS135S0000000_12 afS135S0000000_12, Object obj) {
        C1C7U.LIZ("LinkVideo2View@d47e.<init>$1$onInfo$2L");
        C20441214yg.LJI("LinkVideo2View", (Throwable) obj);
        C1C7U.LIZIZ("LinkVideo2View@d47e.<init>$1$onInfo$2L");
    }

    public static final void accept$1(AfS135S0000000_12 afS135S0000000_12, Object obj) {
        C1C7U.LIZ("BroadcastService@7e13.reportBannerEvent$1L");
        C1C7U.LIZIZ("BroadcastService@7e13.reportBannerEvent$1L");
    }

    public static final void accept$2(AfS135S0000000_12 afS135S0000000_12, Object obj) {
        C1C7U.LIZ("BroadcastService@7e13.reportBannerEvent$2L");
        C1C7U.LIZIZ("BroadcastService@7e13.reportBannerEvent$2L");
    }

    public static final void accept$3(AfS135S0000000_12 afS135S0000000_12, Object obj) {
        C1C7U.LIZ("DrawerBannerViewHolder@7922.<init>$2L");
        C20441214yg.LIZIZ("DrawerBannerViewHolder", ((Throwable) obj).getMessage());
        C1C7U.LIZIZ("DrawerBannerViewHolder@7922.<init>$2L");
    }

    public static final void accept$4(AfS135S0000000_12 afS135S0000000_12, Object obj) {
        C1C7U.LIZ("DrawerBannerViewHolder@7922.<init>$4L");
        C20441214yg.LIZIZ("DrawerBannerViewHolder", ((Throwable) obj).getMessage());
        C1C7U.LIZIZ("DrawerBannerViewHolder@7922.<init>$4L");
    }

    public static final void accept$5(AfS135S0000000_12 afS135S0000000_12, Object obj) {
        C1C7U.LIZ("DrawerBannerViewHolder@7922.<init>$6L");
        C20441214yg.LIZIZ("DrawerBannerViewHolder", ((Throwable) obj).getMessage());
        C1C7U.LIZIZ("DrawerBannerViewHolder@7922.<init>$6L");
    }

    public static final void accept$6(AfS135S0000000_12 afS135S0000000_12, Object obj) {
        C1C7U.LIZ("BroadcastRoomManager@c275.continueRoomForRestart$2L");
        C1C7U.LIZIZ("BroadcastRoomManager@c275.continueRoomForRestart$2L");
    }

    public static final void accept$7(AfS135S0000000_12 afS135S0000000_12, Object obj) {
        C1C7U.LIZ("LiveServiceApiImpl@eb22.bindLiveEvent$1L");
        DataChannelGlobal.LLILZ.JQ2(C931190aL7.class, Long.valueOf(SystemClock.elapsedRealtime()));
        C1C7U.LIZIZ("LiveServiceApiImpl@eb22.bindLiveEvent$1L");
    }

    public static final void accept$8(AfS135S0000000_12 afS135S0000000_12, Object obj) {
        boolean z;
        C1C7U.LIZ("BASwitchToPAorBAServiceImpl@8d9d.handlePotentialToBA$1");
        UserGetResponse userGetResponse = (UserGetResponse) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        User user = userGetResponse.user;
        if (user != null && user.getAccountType() == 3) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            User user2 = userGetResponse.user;
            if (user2 != null) {
                ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LJIL(user2);
                ((ISettingManagerService) ServiceManager.get().getService(ISettingManagerService.class)).LIZIZ(1);
                linkedHashMap.put("success", Integer.valueOf(CastIntegerProtector.parseInt("1")));
                long jCurrentTimeMillis = System.currentTimeMillis();
                new C1061730djf();
                C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis, C1061730djf.LIZLLL(linkedHashMap), "sync_BA_user_finished"));
            }
        } else {
            linkedHashMap.put("success", Integer.valueOf(CastIntegerProtector.parseInt(CardStruct.IStatusCode.DEFAULT)));
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            new C1061730djf();
            C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis2, C1061730djf.LIZLLL(linkedHashMap), "sync_BA_user_finished"));
        }
        C1C7U.LIZIZ("BASwitchToPAorBAServiceImpl@8d9d.handlePotentialToBA$1");
    }
}
