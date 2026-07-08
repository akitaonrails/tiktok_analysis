package Y;

import X.C0KX8;
import X.C0UFE;
import X.C0UX6;
import X.C769630UGz;
import X.InterfaceC1103130eoR;
import com.bytedance.android.live.effect.EffectService;
import com.bytedance.android.live.effect.music.entity.Album;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
public class AObjectS191S0300000_12 implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS191S0300000_12 aObjectS191S0300000_12, Object obj) {
        EffectService effectService = (EffectService) aObjectS191S0300000_12.l0;
        WeakReference weakReference = (WeakReference) aObjectS191S0300000_12.l1;
        Long l = (Long) aObjectS191S0300000_12.l2;
        List<Album> list = (List) obj;
        effectService.getClass();
        if (list.isEmpty()) {
            Function2 function2 = (Function2) weakReference.get();
            if (function2 != null) {
                function2.invoke(l, "");
                return null;
            }
            return null;
        }
        for (Album album : list) {
            if (album != null && album.id == l.longValue()) {
                String str = album.name;
                Function2 function22 = (Function2) weakReference.get();
                if (function22 != null) {
                    function22.invoke(l, str);
                }
            }
        }
        return null;
    }

    public static final Object invoke$1(AObjectS191S0300000_12 aObjectS191S0300000_12, Object obj) {
        C769630UGz c769630UGz = (C769630UGz) aObjectS191S0300000_12.l0;
        DataChannel dataChannel = (DataChannel) aObjectS191S0300000_12.l1;
        InterfaceC1103130eoR interfaceC1103130eoR = (InterfaceC1103130eoR) aObjectS191S0300000_12.l2;
        c769630UGz.getClass();
        C0KX8 c0kx8 = (C0KX8) dataChannel.gg0(LiveBanCapabilityChannel.class);
        if ((obj != C0UFE.ON && c769630UGz.LLILLL.LLJJIJI.cppVersion == 1) || (c0kx8 != null && c0kx8.LIZJ)) {
            interfaceC1103130eoR.setAlpha(0.34f);
            return null;
        }
        interfaceC1103130eoR.setAlpha(1.0f);
        C0UX6 c0ux6 = C0UX6.LIVE_BROADCAST_PROPS;
        RedDotExtensionKt.LJI(c769630UGz.LL, c769630UGz.LLILLL, null, c0ux6, new AObjectS355S0100000_12(c769630UGz, 54));
        dataChannel.BQ2(c769630UGz.LLILLL, LiveBanCapabilityChannel.class, new AObjectS350S0100000_7(interfaceC1103130eoR, 99));
        return null;
    }

    public AObjectS191S0300000_12(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
