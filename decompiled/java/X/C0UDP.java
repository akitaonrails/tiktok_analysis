package X;

import Y.AObjectS355S0100000_12;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.broadcast.video.VideoWidget;
import com.bytedance.android.livesdk.dataChannel.ECLiveStatusChangeChannel;
import com.bytedance.android.livesdk.dataChannel.TtlsLiveProductNumber;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBGMSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0UDP, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public class C0UDP extends C0UDO {
    public DataChannel LL;
    public final InterfaceC769460UGi LLILLJJLI;

    @Override // X.C0UDO, X.InterfaceViewOnClickListenerC1102800enu
    public final boolean dj() {
        Integer num = (Integer) this.LL.gg0(TtlsLiveProductNumber.class);
        C768460UCm.LJIIIIZZ();
        if (C761830TuX.LIZJ() || Boolean.TRUE.equals(this.LL.gg0(ECLiveStatusChangeChannel.class))) {
            return false;
        }
        return num == null || num.intValue() == 0;
    }

    public C0UDP(InterfaceC769460UGi interfaceC769460UGi) {
        this.LLILLJJLI = interfaceC769460UGi;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VideoWidget.D1(this.LL, this.LLILLJJLI, true);
    }

    @Override // X.C0UDO, X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        View viewFindViewById;
        super.WH(interfaceC1103130eoR, dataChannel);
        this.LL = dataChannel;
        LiveBGMSetting liveBGMSetting = LiveBGMSetting.INSTANCE;
        if (liveBGMSetting.inLiveBGMUpgradeV1() || liveBGMSetting.inLiveBGMUpgradeV3()) {
            View view = EnumC1102750enp.MUSIC.getView(dataChannel);
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.y7r);
            } else {
                viewFindViewById = null;
            }
            RedDotExtensionKt.LJI(viewFindViewById, dataChannel.LLILZ, null, C0UX6.LIVE_BROADCAST_ENHANCE_BGM, new AObjectS355S0100000_12(dataChannel, 20));
        }
        Boolean bool = (Boolean) dataChannel.gg0(ECLiveStatusChangeChannel.class);
        Integer num = (Integer) dataChannel.gg0(TtlsLiveProductNumber.class);
        C768460UCm.LJIIIIZZ();
        if (!C761830TuX.LIZJ() && ((num == null || num.intValue() <= 0) && (bool == null || !bool.booleanValue()))) {
            ConcurrentHashSet<C0U3Q> concurrentHashSet = C0U3P.LIZ;
            if (!C0U3P.LIZIZ(C0U3Q.KARAOKE)) {
                return;
            }
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(interfaceC1103130eoR.LJ(), (Property<View, Float>) View.ALPHA, 1.0f, 0.4f);
        objectAnimatorOfFloat.setDuration(100L);
        objectAnimatorOfFloat.start();
    }
}
