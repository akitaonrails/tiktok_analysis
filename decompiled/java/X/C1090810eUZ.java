package X;

import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.barrage.LiveEcomBarrageRevampSetting;
import com.bytedance.android.livesdk.model.message.BarrageMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Set;

/* JADX INFO: renamed from: X.0eUZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1090810eUZ {
    public final LifecycleOwner LIZ;
    public final ViewGroup LIZIZ;
    public final DataChannel LIZJ;
    public BarrageMessage LIZLLL;

    public static boolean LIZ(BarrageMessage barrageMessage) {
        String str;
        if (LiveEcomBarrageRevampSetting.INSTANCE.enable()) {
            Set setLJLIIL = C13LQ.LJLIIL(new String[]{"ecom_live_pdp", "ecom_live_plp"});
            if (barrageMessage != null) {
                str = barrageMessage.subType;
            } else {
                str = null;
            }
            if (C13LP.LJJJJ(str, setLJLIIL)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C1090810eUZ(LifecycleOwner lifecycleOwner, ViewGroup viewGroup, DataChannel dataChannel) {
        this.LIZ = lifecycleOwner;
        this.LIZIZ = viewGroup;
        this.LIZJ = dataChannel;
    }
}
