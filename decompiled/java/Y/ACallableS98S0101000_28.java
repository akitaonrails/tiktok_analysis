package Y;

import X.C1910630zor;
import X.C1C7U;
import X.InterfaceC1910610zop;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.donation.DonateResponse;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.setting.serverpush.IPushSettingService;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushItem;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public class ACallableS98S0101000_28 implements Callable {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS98S0101000_28 aCallableS98S0101000_28) throws ExecutionException, InterruptedException {
        DonateResponse donateResponse;
        C1C7U.LIZ("DonationModel@12a9.fetchList$1");
        if (TextUtils.equals(((C1910630zor) aCallableS98S0101000_28.l0).LLILZ, "PERCENT")) {
            C1910630zor c1910630zor = (C1910630zor) aCallableS98S0101000_28.l0;
            InterfaceC1910610zop interfaceC1910610zop = c1910630zor.LLJI;
            String str = c1910630zor.LL;
            Integer numValueOf = Integer.valueOf(aCallableS98S0101000_28.i1);
            C1910630zor c1910630zor2 = (C1910630zor) aCallableS98S0101000_28.l0;
            donateResponse = interfaceC1910610zop.LIZIZ(str, numValueOf, c1910630zor2.LLILLL, c1910630zor2.LLILZIL, c1910630zor2.LLILZLL, c1910630zor2.LLIZ, c1910630zor2.LLIZLLLIL, true).get();
        } else {
            C1910630zor c1910630zor3 = (C1910630zor) aCallableS98S0101000_28.l0;
            InterfaceC1910610zop interfaceC1910610zop2 = c1910630zor3.LLJ;
            String str2 = c1910630zor3.LL;
            Integer numValueOf2 = Integer.valueOf(aCallableS98S0101000_28.i1);
            C1910630zor c1910630zor4 = (C1910630zor) aCallableS98S0101000_28.l0;
            donateResponse = interfaceC1910610zop2.LIZ(str2, numValueOf2, c1910630zor4.LLILLJJLI, c1910630zor4.LLILZIL, c1910630zor4.LLILZLL, c1910630zor4.LLIZ, c1910630zor4.LLIZLLLIL, true).get();
        }
        C1C7U.LIZIZ("DonationModel@12a9.fetchList$1");
        return donateResponse;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$1(Y.ACallableS98S0101000_28 r11) {
        /*
            java.lang.String r3 = "ReferralFeedManager@9c3a.mobNotificationAction$1"
            X.C1C7U.LIZ(r3)
            X.0sFe r0 = X.C1619720sFe.LIZ
            X.0zTI r1 = r0.LIZIZ()
            r0 = 0
            if (r1 == 0) goto L65
            com.bytedance.touchpoint.api.interfaces.INetworkApi r4 = r1.LIZJ()
            if (r4 == 0) goto L65
            java.lang.Object r1 = r11.l0
            X.0zTK r1 = (X.C1897280zTK) r1
            com.bytedance.touchpoint.api.model.ReferralFeedBanner r0 = r1.LJIJI
            if (r0 == 0) goto L20
            java.lang.String r5 = r0.notificationId
            if (r5 != 0) goto L22
        L20:
            java.lang.String r5 = ""
        L22:
            int r6 = r11.i1
            java.lang.String r7 = "feed_banner"
            java.lang.String r8 = r1.LJI()
            java.lang.Object r2 = r11.l0
            X.0zTK r2 = (X.C1897280zTK) r2
            com.bytedance.touchpoint.api.model.ReferralFeedBanner r0 = r2.LJIJI
            if (r0 == 0) goto L69
            int r0 = r0.bannerType
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L69
            int r1 = r0.intValue()
            r0 = 1
            if (r1 != r0) goto L69
            com.bytedance.touchpoint.api.model.ReferralFeedBanner r0 = r2.LJIJI
            if (r0 == 0) goto L7e
            java.util.List<com.bytedance.touchpoint.api.model.Picture> r1 = r0.pictures
            if (r1 == 0) goto L7e
            int r0 = r2.LJJII
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r0, r1)
            com.bytedance.touchpoint.api.model.Picture r0 = (com.bytedance.touchpoint.api.model.Picture) r0
            if (r0 == 0) goto L7e
            java.lang.Integer r0 = r0.multiShowCount
            if (r0 == 0) goto L7e
            int r9 = r0.intValue()
        L5b:
            r11 = 0
            r0 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            com.google.common.util.concurrent.ListenableFuture r0 = r4.requestOnNotificationAction(r5, r6, r7, r8, r9, r10, r11)
        L65:
            X.C1C7U.LIZIZ(r3)
            return r0
        L69:
            com.bytedance.touchpoint.api.model.ReferralFeedBanner r0 = r2.LJIJI
            if (r0 == 0) goto L7e
            java.util.List<com.bytedance.touchpoint.api.model.Video> r1 = r0.videos
            if (r1 == 0) goto L7e
            int r0 = r2.LJJII
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r0, r1)
            com.bytedance.touchpoint.api.model.Video r0 = (com.bytedance.touchpoint.api.model.Video) r0
            if (r0 == 0) goto L7e
            int r9 = r0.multiShowCount
            goto L5b
        L7e:
            r9 = 0
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS98S0101000_28.call$1(Y.ACallableS98S0101000_28):java.lang.Object");
    }

    public static final Object call$2(ACallableS98S0101000_28 aCallableS98S0101000_28) {
        Boolean boolValueOf;
        boolean zLIZJ;
        C1C7U.LIZ("PushSettingsLoginVM@db7f.requestVoiceCallSettingChange$1");
        IPushSettingService iPushSettingService = (IPushSettingService) PluggableExtentionKt.pluggableSpi$default(IPushSettingService.class, false, false, false, 14, null);
        if (iPushSettingService != null) {
            PushItem pushItem = (PushItem) aCallableS98S0101000_28.l0;
            int i = aCallableS98S0101000_28.i1;
            if (Intrinsics.LJFF(pushItem.itemId, "im_voice_call_push")) {
                zLIZJ = iPushSettingService.LJIIIIZZ(i);
            } else {
                zLIZJ = iPushSettingService.LIZJ(i);
            }
            boolValueOf = Boolean.valueOf(zLIZJ);
        } else {
            boolValueOf = null;
        }
        C1C7U.LIZIZ("PushSettingsLoginVM@db7f.requestVoiceCallSettingChange$1");
        return boolValueOf;
    }

    public ACallableS98S0101000_28(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
