package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.rich.reward.GmtRewardAdModel;
import com.ss.android.ugc.aweme.rich.reward.ui.GmtRewardAdContainer;
import kotlin.Pair;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cxy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1032160cxy {
    public static final long LIZ(GmtRewardAdContainer gmtRewardAdContainer, Long l) {
        long duration;
        InterfaceC1032290cyB interfaceC1032290cyBLIZLLL;
        InterfaceC1032290cyB interfaceC1032290cyBLIZLLL2 = gmtRewardAdContainer.VR().LIZLLL();
        long jLongValue = 0;
        if (interfaceC1032290cyBLIZLLL2 != null) {
            duration = interfaceC1032290cyBLIZLLL2.getDuration();
        } else {
            duration = 0;
        }
        if (l != null || ((interfaceC1032290cyBLIZLLL = gmtRewardAdContainer.VR().LIZLLL()) != null && (l = Long.valueOf(interfaceC1032290cyBLIZLLL.getCurrentPosition())) != null)) {
            jLongValue = l.longValue();
        }
        return (((long) (gmtRewardAdContainer.LLJJJJLIIL - 1)) * duration) + jLongValue;
    }

    public static final void LIZIZ(GmtRewardAdContainer gmtRewardAdContainer, boolean z, boolean z2) throws JSONException {
        UrlModel playTrackUrlList;
        GMTBaseModel gMTBaseModel;
        Object hostModel;
        if (!z2) {
            InterfaceC1032120cxu interfaceC1032120cxu = gmtRewardAdContainer.LLJJ;
            int i = gmtRewardAdContainer.LLJJJJLIIL;
            long jLIZ = gmtRewardAdContainer.LLJJL + LIZ(gmtRewardAdContainer, 0L);
            if (interfaceC1032120cxu != null && (hostModel = interfaceC1032120cxu.getHostModel()) != null) {
                interfaceC1032120cxu.trackEvent(new C1031480cws("play", C2097608Jq.LJIIIIZZ(new Pair("play_order", Integer.valueOf(i)), new Pair("total_duration", Long.valueOf(jLIZ))), 4), hostModel);
            }
            InterfaceC1032120cxu interfaceC1032120cxu2 = gmtRewardAdContainer.LLJJ;
            int i2 = gmtRewardAdContainer.LLJJJJLIIL;
            if (interfaceC1032120cxu2 != null) {
                Object hostModel2 = interfaceC1032120cxu2.getHostModel();
                GmtRewardAdModel rewardAdModel = interfaceC1032120cxu2.getRewardAdModel();
                if (rewardAdModel != null && (gMTBaseModel = rewardAdModel.awemeRawAd) != null) {
                    playTrackUrlList = gMTBaseModel.getPlayTrackUrlList();
                } else {
                    playTrackUrlList = null;
                }
                if (hostModel2 != null && playTrackUrlList != null && interfaceC1032120cxu2 != null) {
                    new JSONObject().put("play_order", i2);
                    interfaceC1032120cxu2.track3rdPartyURL(new C1031380cwi(playTrackUrlList, "play", 8), hostModel2);
                }
            }
        }
        if (z) {
            C1032900czA.LJIIJ(gmtRewardAdContainer.LLJJ, true, null, 12);
            Context context = gmtRewardAdContainer.getContext();
            int i3 = gmtRewardAdContainer.LLJJJJLIIL;
            FrameLayout frameLayoutUR = gmtRewardAdContainer.UR();
            InterfaceC1032280cyA interfaceC1032280cyAVR = gmtRewardAdContainer.VR();
            InterfaceC1032120cxu interfaceC1032120cxu3 = gmtRewardAdContainer.LLJJ;
            if (interfaceC1032120cxu3 != null) {
                Object hostModel3 = interfaceC1032120cxu3.getHostModel();
                GmtRewardAdModel rewardAdModel2 = interfaceC1032120cxu3.getRewardAdModel();
                if (hostModel3 != null && rewardAdModel2 != null && frameLayoutUR != null && interfaceC1032120cxu3 != null) {
                    interfaceC1032120cxu3.trackOMSDK(new C1031300cwa(i3 - 1, frameLayoutUR, new AwS417S0200000_16(rewardAdModel2, interfaceC1032280cyAVR, 109), new AwS560S0100000_16(interfaceC1032280cyAVR, 919)), hostModel3, context);
                }
            }
        }
    }
}
